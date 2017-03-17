package io.github.minorg.whoisclient.parser;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.minorg.whoisclient.ParsedWhoisRecord;
import io.github.minorg.whoisclient.RawWhoisRecord;
import io.github.minorg.whoisclient.WhoisRecord;
import io.github.minorg.whoisclient.WhoisRecordMetadata;

public final class WhoisRecordParser {
    public WhoisRecordParser() {
        fieldParsers = new WhoisFieldParsers();
    }

    public WhoisRecord parse(final RawWhoisRecord raw) throws WhoisRecordParseException {
        String text = raw.getText();

        {
            final String textWithUnixLineEndings = text.replaceAll("\\r\\n", "\n");
            if (text.length() != textWithUnixLineEndings.length()) {
                logger.debug("replaced \r\n with \n for {} record text", raw.getQueriedName());
            }
            text = textWithUnixLineEndings;
        }

        if (raw.getQueriedWhoisServers().get(raw.getQueriedWhoisServers().size() - 1)
                .equals("whois.verisign-grs.com")) {
            // VeriSign returns multiple records
            final Pattern domainNamePattern = Pattern
                    .compile(String.format("Domain Name: %s\\n", raw.getQueriedName().toString().toUpperCase()));

            int lastRecordSeparatorI = 0;
            int recordSeparatorI = text.indexOf("\n\n", lastRecordSeparatorI);
            while ((recordSeparatorI != -1) && (lastRecordSeparatorI < text.length())) {
                final String textPart = text.substring(lastRecordSeparatorI, recordSeparatorI);
                if (domainNamePattern.matcher(textPart).find()) {
                    return __parse(new RawWhoisRecord(raw.getQueriedName(), raw.getQueriedWhoisServers(),
                            raw.getQueryTimestamp(), textPart));
                }
                lastRecordSeparatorI = recordSeparatorI + 2;
                recordSeparatorI = text.indexOf("\n\n", lastRecordSeparatorI);
            }
            if (lastRecordSeparatorI < text.length()) {
                final String textPart = text.substring(lastRecordSeparatorI);
                if (domainNamePattern.matcher(textPart).find()) {
                    return __parse(new RawWhoisRecord(raw.getQueriedName(), raw.getQueriedWhoisServers(),
                            raw.getQueryTimestamp(), textPart));
                }
            }
            throw new WhoisRecordParseException("unable to find appropriate Domain Name in Verisign record");
        }

        return __parse(raw);
    }

    private WhoisRecord __parse(final RawWhoisRecord raw) throws WhoisRecordParseException {
        final ParsedWhoisRecord.Builder parsedBuilder = ParsedWhoisRecord.builder();
        final String text = raw.getText();
        if (!fieldParsers.parse(text, parsedBuilder)) {
            logger.debug("unable to parse any fields from\n{}", text);
        }
        return WhoisRecord.builder()
                .setMetadata(WhoisRecordMetadata.builder().setQueriedName(raw.getQueriedName())
                        .setQueriedWhoisServers(raw.getQueriedWhoisServers()).setQueryTimestamp(raw.getQueryTimestamp())
                        .build())
                .setParsed(parsedBuilder.build()).setText(raw.getText()).build();
    }

    private final WhoisFieldParsers fieldParsers;
    private final static Logger logger = LoggerFactory.getLogger(WhoisRecordParser.class);
}

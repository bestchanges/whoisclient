package io.github.minorg.whoisclient.parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import io.github.minorg.whoisclient.ParsedWhoisRecord;

final class WhoisReferralFieldParser implements WhoisFieldParser {
    public WhoisReferralFieldParser() {
        linePattern = Pattern.compile(
                "(refer|whois server|referral url|whois server|registrar whois):\\s*([^\\s]+\\.[^\\s]+)",
                Pattern.CASE_INSENSITIVE);
    }

    @Override
    public boolean parse(final String raw, final ParsedWhoisRecord.Builder recordBuilder)
            throws WhoisRecordParseException {
        try {
            for (String line : IOUtils.readLines(new StringReader(raw))) {
                line = StringUtils.strip(line);
                final Matcher matcher = linePattern.matcher(line);
                if (!matcher.matches()) {
                    continue;
                }
                final String referral = matcher.group(2);
                if (referral.contains("://")) {
                    continue;
                }
                recordBuilder.setReferral(referral);
                return true;
            }
            return false;
        } catch (final IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final Pattern linePattern;

}

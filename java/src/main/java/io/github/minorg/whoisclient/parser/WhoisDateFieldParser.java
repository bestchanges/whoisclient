package io.github.minorg.whoisclient.parser;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;
import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

import io.github.minorg.whoisclient.ParsedWhoisRecord;
import io.github.minorg.whoisclient.WhoisRecordParseException;

abstract class WhoisDateFieldParser extends WhoisPatternFieldParser {
    protected WhoisDateFieldParser(final ParsedWhoisRecord.FieldMetadata field, final String[] linePatternStrings) {
        super(linePatternStrings);
        this.field = checkNotNull(field);
    }

    @Override
    public boolean parse(final String raw, final ParsedWhoisRecord.Builder recordBuilder)
            throws WhoisRecordParseException {
        final Optional<Matcher> match = _match(raw);
        if (!match.isPresent()) {
            return false;
        }
        final String dateString = StringUtils.strip(match.get().group("val"));
        final Optional<Date> date = dateParser.parse(dateString);
        if (!date.isPresent()) {
            logger.warn("{}: matched date field from '{}' but was unable to parse date", field, dateString);
            return false;
        }
        recordBuilder.set(field, date.get());
        return true;
    }

    private final WhoisDateParser dateParser = new WhoisDateParser();
    private final ParsedWhoisRecord.FieldMetadata field;
    private final static Logger logger = LoggerFactory.getLogger(WhoisDateFieldParser.class);
}
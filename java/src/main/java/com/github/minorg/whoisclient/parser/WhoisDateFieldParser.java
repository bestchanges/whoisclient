package com.github.minorg.whoisclient.parser;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;
import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.minorg.whoisclient.WhoisRecord;
import com.github.minorg.whoisclient.WhoisRecordParseException;
import com.google.common.base.Optional;

abstract class WhoisDateFieldParser extends WhoisPatternFieldParser {
    protected WhoisDateFieldParser(final WhoisRecord.FieldMetadata field, final String[] linePatternStrings) {
        super(linePatternStrings);
        this.field = checkNotNull(field);
    }

    @Override
    public boolean parse(final String raw, final WhoisRecord.Builder recordBuilder) throws WhoisRecordParseException {
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
    private final WhoisRecord.FieldMetadata field;
    private final static Logger logger = LoggerFactory.getLogger(WhoisDateFieldParser.class);
}

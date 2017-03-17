package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.ParsedWhoisRecord;
import io.github.minorg.whoisclient.WhoisRecordParseException;

interface WhoisFieldParser {
    public boolean parse(final String raw, final ParsedWhoisRecord.Builder recordBuilder)
            throws WhoisRecordParseException;
}

package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.ParsedWhoisRecord;

interface WhoisFieldParser {
    public boolean parse(final String raw, final ParsedWhoisRecord.Builder recordBuilder)
            throws WhoisRecordParseException;
}

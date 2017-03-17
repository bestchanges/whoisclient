package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.WhoisRecord;
import io.github.minorg.whoisclient.WhoisRecordParseException;

interface WhoisFieldParser {
    public boolean parse(final String raw, final WhoisRecord.Builder recordBuilder) throws WhoisRecordParseException;
}

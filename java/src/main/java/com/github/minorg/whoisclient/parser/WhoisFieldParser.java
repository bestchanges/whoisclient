package com.github.minorg.whoisclient.parser;

import com.github.minorg.whoisclient.WhoisRecord;
import com.github.minorg.whoisclient.WhoisRecordParseException;

interface WhoisFieldParser {
    public boolean parse(final String raw, final WhoisRecord.Builder recordBuilder) throws WhoisRecordParseException;
}

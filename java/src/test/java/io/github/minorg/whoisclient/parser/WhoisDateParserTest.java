package io.github.minorg.whoisclient.parser;

import org.junit.Test;

import io.github.minorg.whoisclient.parser.WhoisDateParser;

public final class WhoisDateParserTest {
    @Test
    public void testIsoIsh() {
        parser.parse("2003-12-09T00:08:32Z").get();
        parser.parse("2004-06-07T19:57:31Z GMT+8").get();
        parser.parse("20170313").get();
    }

    private final WhoisDateParser parser = new WhoisDateParser();
}

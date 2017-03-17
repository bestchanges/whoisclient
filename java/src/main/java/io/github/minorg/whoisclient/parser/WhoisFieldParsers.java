package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.Gazetteers;
import io.github.minorg.whoisclient.ParsedWhoisRecord;

final class WhoisFieldParsers {
    public WhoisFieldParsers() {
        final Gazetteers gazetteers = Gazetteers.getInstance();
        parsers = new WhoisFieldParser[] { new WhoisAdministrativeContactFieldParser(gazetteers),
                new WhoisBillingContactFieldParser(gazetteers), new WhoisCreationDateFieldParser(),
                new WhoisExpirationDateFieldParser(), new WhoisReferralFieldParser(),
                new WhoisRegistrantFieldParser(gazetteers), new WhoisTechnicalContactFieldParser(gazetteers),
                new WhoisUpdatedDateFieldParser() };
    }

    public boolean parse(final String raw, final ParsedWhoisRecord.Builder recordBuilder)
            throws WhoisRecordParseException {
        boolean parsed = false;
        for (final WhoisFieldParser parser : parsers) {
            parsed |= parser.parse(raw, recordBuilder);
        }
        return parsed;
    }

    private final WhoisFieldParser[] parsers;
}

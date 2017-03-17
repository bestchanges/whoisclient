package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.ParsedWhoisRecord;

public final class WhoisUpdatedDateFieldParser extends WhoisDateFieldParser {
    public WhoisUpdatedDateFieldParser() {
        super(ParsedWhoisRecord.FieldMetadata.UPDATED_DATE,
                new String[] { "\\[Last Updated\\]\\s*(?<val>.+)", "Record modified on[.]*: (?<val>.+) [a-zA-Z]+",
                        "Record last updated on[.]*: [a-zA-Z]+, (?<val>.+)", "Updated Date:\\s?(?<val>.+)",
                        "Updated date\\s*:\\s?(?<val>.+)", "Record last updated on\\s?[.]*:?\\s?(?<val>.+)\\.",
                        "Domain record last updated\\s?[.]*:\\s*?(?<val>.+)",
                        "Domain Last Updated\\s?[.]*:\\s*?(?<val>.+)", "Last updated on:\\s?(?<val>.+)",
                        "Date Modified\\s?[.]*:\\s?(?<val>.+)", "Last Modified\\s?[.]*:\\s?(?<val>.+)",
                        "Domain Last Updated Date\\s?[.]*:\\s?(?<val>.+)", "Record last updated\\s?[.]*:\\s?(?<val>.+)",
                        "Modified\\s?[.]*:\\s?(?<val>.+)", "(C|c)hanged:\\s*(?<val>.+)", "last_update:\\s*(?<val>.+)",
                        "Last Update\\s?[.]*:\\s?(?<val>.+)", "Last updated on (?<val>.+) [a-z]{3,4}",
                        "Last updated:\\s*(?<val>.+)", "last-updated:\\s*(?<val>.+)",
                        "\\[Last Update\\]\\s*(?<val>.+) \\([A-Z]+\\)",
                        "Last update of whois database:\\s?[a-z]{3}, (?<val>.+) [a-z]{3,4}" });
    }
}

package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.WhoisRecord;

public final class WhoisCreationDateFieldParser extends WhoisDateFieldParser {
    public WhoisCreationDateFieldParser() {
        super(WhoisRecord.FieldMetadata.CREATION_DATE,
                new String[] { "\\[Created on\\]\\s*(?<val>.+)", "Created on[.]*: [a-zA-Z]+, (?<val>.+)",
                        "Creation Date:\\s?(?<val>.+)", "Creation date\\s*:\\s?(?<val>.+)",
                        "Registration Date:\\s?(?<val>.+)", "Created Date:\\s?(?<val>.+)", "Created on:\\s?(?<val>.+)",
                        "Created on\\s?[.]*:\\s?(?<val>.+)\\.", "Date Registered\\s?[.]*:\\s?(?<val>.+)",
                        "Domain Created\\s?[.]*:\\s?(?<val>.+)", "Domain registered\\s?[.]*:\\s?(?<val>.+)",
                        "Domain record activated\\s?[.]*:\\s*?(?<val>.+)", "Record created on\\s?[.]*:?\\s*?(?<val>.+)",
                        "Record created\\s?[.]*:?\\s*?(?<val>.+)", "Created\\s?[.]*:?\\s*?(?<val>.+)",
                        "Registered on\\s?[.]*:?\\s*?(?<val>.+)", "Registered\\s?[.]*:?\\s*?(?<val>.+)",
                        "Domain Create Date\\s?[.]*:?\\s*?(?<val>.+)",
                        "Domain Registration Date\\s?[.]*:?\\s*?(?<val>.+)", "created:\\s*(?<val>.+)",
                        "\\[Registered Date\\]\\s*(?<val>.+)", "created-date:\\s*(?<val>.+)",
                        "Domain Name Commencement Date: (?<val>.+)", "registered:\\s*(?<val>.+)",
                        "registration:\\s*(?<val>.+)" });
    }
}

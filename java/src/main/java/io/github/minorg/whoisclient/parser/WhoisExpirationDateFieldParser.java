package io.github.minorg.whoisclient.parser;

import io.github.minorg.whoisclient.WhoisRecord;

public final class WhoisExpirationDateFieldParser extends WhoisDateFieldParser {
    public WhoisExpirationDateFieldParser() {
        super(WhoisRecord.FieldMetadata.EXPIRATION_DATE,
                new String[] { "\\[Expires on\\]\\s*(?<val>.+)",
                        "Registrar Registration Expiration Date:[ ]*(?<val>.+)-[0-9]{4}",
                        "Expires on[.]*: [a-zA-Z]+, (?<val>.+)", "Expiration Date:\\s?(?<val>.+)",
                        "Expiration date\\s*:\\s?(?<val>.+)", "Expires on:\\s?(?<val>.+)",
                        "Expires on\\s?[.]*:\\s?(?<val>.+)\\.", "Exp(?:iry)? Date\\s?[.]*:\\s?(?<val>.+)",
                        "Expiry\\s*:\\s?(?<val>.+)", "Domain Currently Expires\\s?[.]*:\\s?(?<val>.+)",
                        "Record will expire on\\s?[.]*:\\s?(?<val>.+)", "Domain expires\\s?[.]*:\\s*?(?<val>.+)",
                        "Record expires on\\s?[.]*:?\\s*?(?<val>.+)", "Record expires\\s?[.]*:?\\s*?(?<val>.+)",
                        "Expires\\s?[.]*:?\\s*?(?<val>.+)", "Expire Date\\s?[.]*:?\\s*?(?<val>.+)",
                        "Expired\\s?[.]*:?\\s*?(?<val>.+)", "Domain Expiration Date\\s?[.]*:?\\s*?(?<val>.+)",
                        "paid-till:\\s*(?<val>.+)", "expiration_date:\\s*(?<val>.+)", "expire-date:\\s*(?<val>.+)",
                        "renewal:\\s*(?<val>.+)", "expire:\\s*(?<val>.+)" });
    }
}

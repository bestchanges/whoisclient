package com.github.minorg.whoisclient.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.google.common.base.Optional;

abstract class WhoisPatternFieldParser implements WhoisFieldParser {
    protected WhoisPatternFieldParser(final String[] patternStrings) {
        patterns = new Pattern[patternStrings.length];
        for (int patternI = 0; patternI < patternStrings.length; patternI++) {
            try {
                patterns[patternI] = Pattern.compile(patternStrings[patternI], Pattern.CASE_INSENSITIVE);
            } catch (final PatternSyntaxException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    protected final Optional<Matcher> _match(final String raw) {
        for (final Pattern pattern : patterns) {
            final Matcher matcher = pattern.matcher(raw);
            if (matcher.find()) {
                return Optional.of(matcher);
            }
        }
        return Optional.absent();
    }

    private final Pattern[] patterns;
}

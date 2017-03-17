package io.github.minorg.whoisclient.parser;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Optional;

final class WhoisDateParser {
    private static int __parseOptionalInt(final String groupName, final Matcher matcher, final int default_) {
        String value;
        try {
            value = matcher.group(groupName);
        } catch (final IllegalArgumentException e) {
            return default_;
        }

        try {
            return Integer.parseInt(value);
        } catch (final NumberFormatException e) {
            return default_;
        }
    }

    public WhoisDateParser() {
        final String[] patternStrings = {
                "(?<day>[0-9]{1,2})[./ -](?<month>Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)[./ -](?<year>[0-9]{4}|[0-9]{2})",
                "(\\s+(?<hour>[0-9]{1,2})[:.](?<minute>[0-9]{1,2})[:.](?<second>[0-9]{1,2}))?",
                "[a-z]{3}\\s(?<month>Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)[./ -](?<day>[0-9]{1,2})(\\s+(?<hour>[0-9]{1,2})[:.](?<minute>[0-9]{1,2})[:.](?<second>[0-9]{1,2}))?\\s[a-z]{3}\\s(?<year>[0-9]{4}|[0-9]{2})",
                "[a-zA-Z]+\\s(?<day>[0-9]{1,2})(?:st|nd|rd|th)\\s(?<month>Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec|January|February|March|April|May|June|July|August|September|October|November|December)\\s(?<year>[0-9]{4})",
                "(?<year>[0-9]{4})[./-]?(?<month>[0-9]{2})[./-]?(?<day>[0-9]{2})(\\s|T|/)((?<hour>[0-9]{1,2})[:.-](?<minute>[0-9]{1,2})[:.-](?<second>[0-9]{1,2}))",
                "(?<year>[0-9]{4})[./-](?<month>[0-9]{1,2})[./-](?<day>[0-9]{1,2})",
                "(?<day>[0-9]{1,2})[./ -](?<month>[0-9]{1,2})[./ -](?<year>[0-9]{4}|[0-9]{2})",
                "(?<month>Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) (?<day>[0-9]{1,2}),? (?<year>[0-9]{4})",
                "(?<day>[0-9]{1,2})-(?<month>January|February|March|April|May|June|July|August|September|October|November|December)-(?<year>[0-9]{4})",
                // MG: ISO 8601 compact 20170313
                "(?<year>[0-9]{4})(?<month>[0-9]{2})(?<day>[0-9]{2})" };
        patterns = new Pattern[patternStrings.length];
        for (int patternI = 0; patternI < patternStrings.length; patternI++) {
            patterns[patternI] = Pattern.compile(patternStrings[patternI], Pattern.CASE_INSENSITIVE);
        }
    }

    @SuppressWarnings("deprecation")
    public Optional<Date> parse(final String dateString) {
        for (final Pattern pattern : patterns) {
            final Matcher matcher = pattern.matcher(dateString);
            if (!matcher.find() || (matcher.start() != 0)) {
                continue;
            }

            int day1Based;
            {
                final String dayString;
                try {
                    dayString = matcher.group("day");
                } catch (final IllegalArgumentException e) {
                    continue;
                }
                try {
                    day1Based = Integer.parseInt(dayString);
                } catch (final NumberFormatException e) {
                    continue;
                }
            }

            final int hour = __parseOptionalInt("hour", matcher, 0);
            final int minute = __parseOptionalInt("minute", matcher, 0);

            int month1Based;
            {
                String monthString;
                try {
                    monthString = matcher.group("month");
                } catch (final IllegalArgumentException e) {
                    continue;
                }
                try {
                    month1Based = Integer.parseInt(monthString);
                } catch (final NumberFormatException e) {
                    switch (monthString.toLowerCase()) {
                    case "jan":
                        month1Based = 1;
                        break;
                    case "january":
                        month1Based = 1;
                        break;
                    case "feb":
                        month1Based = 2;
                        break;
                    case "february":
                        month1Based = 2;
                        break;
                    case "mar":
                        month1Based = 3;
                        break;
                    case "march":
                        month1Based = 3;
                        break;
                    case "apr":
                        month1Based = 4;
                        break;
                    case "april":
                        month1Based = 4;
                        break;
                    case "may":
                        month1Based = 5;
                        break;
                    case "jun":
                        month1Based = 6;
                        break;
                    case "june":
                        month1Based = 6;
                        break;
                    case "jul":
                        month1Based = 7;
                        break;
                    case "july":
                        month1Based = 7;
                        break;
                    case "aug":
                        month1Based = 8;
                        break;
                    case "august":
                        month1Based = 8;
                        break;
                    case "sep":
                        month1Based = 9;
                        break;
                    case "sept":
                        month1Based = 9;
                        break;
                    case "september":
                        month1Based = 9;
                        break;
                    case "oct":
                        month1Based = 10;
                        break;
                    case "october":
                        month1Based = 10;
                        break;
                    case "nov":
                        month1Based = 11;
                        break;
                    case "november":
                        month1Based = 11;
                        break;
                    case "dec":
                        month1Based = 12;
                        break;
                    case "december":
                        month1Based = 12;
                        break;
                    default:
                        continue;
                    }
                }
            }

            final int second = __parseOptionalInt("second", matcher, 0);

            int year;
            {
                final String yearString;
                try {
                    yearString = matcher.group("year");
                } catch (final IllegalArgumentException e) {
                    continue;
                }
                try {
                    year = Integer.parseInt(yearString);
                } catch (final NumberFormatException e) {
                    continue;
                }
                if (year < 60) {
                    year += 2000;
                } else if (year < 100) {
                    year += 1900;
                }
            }

            return Optional.of(new Date(year - 1900, month1Based - 1, day1Based, hour, minute, second));
        }
        return Optional.absent();
    }

    private final Pattern[] patterns;
}

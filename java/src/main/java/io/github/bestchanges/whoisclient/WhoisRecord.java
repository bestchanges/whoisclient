package io.github.bestchanges.whoisclient;

import com.google.common.base.Optional;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhoisRecord {

    private String whoisResponse;
    private String requestedDomain;
    private String whoisServer;
    private WhoisRecord parentRecord;
    private Map<String,List<String>> whoisResponseParsed;
    private static WhoisDateParser dateParser;

    static {
        dateParser = new WhoisDateParser();
    }

    public WhoisRecord(String whoisResponse, String requestedDomain, String whoisServer, WhoisRecord parentRecord) throws WhoisRecordParseException {
        this.whoisResponse = whoisResponse;
        this.requestedDomain = requestedDomain;
        this.whoisServer = whoisServer;
        this.parentRecord = parentRecord;
        this.parse();
    }

    private void parse() throws WhoisRecordParseException {
        whoisResponseParsed = new HashMap();
        // we split response to key-value map, like 'Registrar' -> ['GoDaddy....']
        // we use Map of Lists because keys may have multiple values (like 'tech-contact')
        Pattern pattern = Pattern.compile("^\\s*([\\w \\/\\-]+): +(.+?)$", Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(this.whoisResponse);
        int matchesCount = 0;
        while (matcher.find()) {
            matchesCount++;
            String key = matcher.group(1);
            String value = matcher.group(2);
            if (whoisResponseParsed.containsKey(key)) {
                whoisResponseParsed.get(key).add(value);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(value);
                whoisResponseParsed.put(key, list);
            }
        }
        if (matchesCount == 0) {
            throw new WhoisRecordParseException("Cannot find whois record in given response " + this.whoisResponse);
        }
    }

    public String getWhoisResponse() {
        return whoisResponse;
    }

    public String getRequestedDomain() {
        return requestedDomain;
    }

    public String getWhoisServer() {
        return whoisServer;
    }

    /**
     * Get list of values for one of the specified keys. Values are returned for the first found key.
     * If no key found in the current whois record will search in parent whois record (if provided)
     * @param keys
     * @return list of values for the first found key or null if no key were found
     */
    public List<String> getValues(String... keys) {
        for (String key : keys) {
            if (whoisResponseParsed.containsKey(key)) {
                return whoisResponseParsed.get(key);
            }
        }
        if (parentRecord != null) {
            return parentRecord.getValues(keys);
        }
        return null;
    }

    /**
     * Get value for one of the specified keys. Value is returned for the first found key.
     * If this key have several values then return the first value.
     * If no key found in the current whois record will search in parent whois record (if provided)
     * @param keys
     * @return first value for the first found key or null if no key were found
     */
    public String getValue(String... keys) {
        List<String> values = this.getValues(keys);
        if (values != null) {
            return values.get(0);
        }
        return null;
    }

    public String getReferralWhoisServer() {
        String value = this.getValue("refer", "Whois Server", "Registrar WHOIS Server");
        if (value != null) {
            return value.trim(); // whois.name.com refers itself as 'whois.name.com '
        }
        return null;
    }

    public String getRegistrar() {
        return this.getValue("Registrar", "registrar");
    }

    private Date __parseDateValue(String value) {
        if (value == null || "".equals(value)) {
            return null;
        }
        Optional<Date> parse = dateParser.parse(value);
        return parse.orNull();
    }

    public Date getExpirationDate() {
        String value = this.getValue("Expiration Date", "paid-till", "Registry Expiry Date", "Registrar Registration Expiration Date");
        return __parseDateValue(value);
    }

    public Date getUpdated() {
        String value = this.getValue("Updated Date");
        return __parseDateValue(value);
    }

    public Date getCreated() {
        String value = this.getValue("Creation Date", "created");
        return __parseDateValue(value);
    }

    public String getRegistrant() {
        return this.getValue("Registrant Name", "Registrant Organization", "org", "organisation");
    }

    @Override
    public String toString() {
        return "WhoisRecord{" +
                "whoisResponse='" + whoisResponse + '\'' +
                ", requestedDomain='" + requestedDomain + '\'' +
                ", whoisServer='" + whoisServer + '\'' +
                '}';
    }
}

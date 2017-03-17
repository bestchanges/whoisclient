namespace * whoisclient

include "parsed_whois_record.thrift"
include "whois_record_metadata.thrift"

struct WhoisRecord {
    whois_record_metadata.WhoisRecordMetadata metadata;
    parsed_whois_record.ParsedWhoisRecord parsed;
    // @validation {"blank": false, "minLength": 1}
    string text;
}

namespace * whoisclient

include "thryft/native/date_time.thrift"
include "thryft/native/internet_domain_name.thrift"

struct RawWhoisRecord {
    internet_domain_name.InternetDomainName queried_name;
    // @validation {"minLength": 1}
    list<internet_domain_name.InternetDomainName> queried_whois_servers;
    date_time.DateTime query_timestamp;
    string text;
}

namespace * whoisclient

include "thryft/native/date_time.thrift"
include "thryft/native/internet_domain_name.thrift"
include "whois_registrant.thrift"

struct WhoisRecord {
    internet_domain_name.InternetDomainName queried_name;

    // Whois servers that were queried, in order
    // @validation {"minLength": 1}
    list<internet_domain_name.InternetDomainName> queried_whois_servers;

    date_time.DateTime query_timestamp;

    optional whois_registrant.WhoisRegistrant administrative_contact;

    optional whois_registrant.WhoisRegistrant billing_contact;

    optional date_time.DateTime creation_date;

    optional date_time.DateTime expiration_date;

    // @validation {"blank": false, "minLength": 1}
    optional string referral;

    optional whois_registrant.WhoisRegistrant registrant;

    optional whois_registrant.WhoisRegistrant technical_contact;

    optional date_time.DateTime updated_date;
}

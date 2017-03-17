namespace * whoisclient

include "parsed_whois_registrant.thrift"
include "thryft/native/date_time.thrift"

struct ParsedWhoisRecord {
    optional parsed_whois_registrant.ParsedWhoisRegistrant administrative_contact;

    optional parsed_whois_registrant.ParsedWhoisRegistrant billing_contact;

    optional date_time.DateTime creation_date;

    optional date_time.DateTime expiration_date;

    // @validation {"blank": false, "minLength": 1}
    optional string referral;

    optional parsed_whois_registrant.ParsedWhoisRegistrant registrant;

    optional parsed_whois_registrant.ParsedWhoisRegistrant technical_contact;

    optional date_time.DateTime updated_date;
}

namespace * whoisclient

include "whois_registrant_street.thrift"

struct WhoisRegistrant {
    // @validation {"blank": false, "minLength": 1}
    optional string airport_code;

    // @validation {"blank": false, "minLength": 1}
    optional string city;

    // @validation {"blank": false, "minLength": 1}
    optional string country;

    // @validation {"blank": false, "maxLength": 3, "minLength": 2}
    optional string country_code;

    // @validation {"blank": false, "minLength": 1}
    optional string district;

    // @validation {"blank": false, "minLength": 1}
    optional string email;

    // @validation {"blank": false, "minLength": 1}
    optional string first_name;

    // @validation {"blank": false, "minLength": 1}
    optional string handle;

    // @validation {"blank": false, "minLength": 1}
    optional string last_name;

    // @validation {"blank": false, "minLength": 1}
    optional string name;

    // @validation {"blank": false, "minLength": 1}
    optional string organization;

    // @validation {"blank": false, "minLength": 1}
    optional string phone;

    // @validation {"blank": false, "minLength": 1}
    optional string phone_ext;

    // @validation {"blank": false, "minLength": 1}
    optional string postal_code;

    // @validation {"blank": false, "minLength": 1}
    optional string state;

    // @validation {"blank": false, "minLength": 1}
    optional string state_code;

    // @validation {"minLength": 1}
    optional list<whois_registrant_street.WhoisRegistrantStreet> street;
}

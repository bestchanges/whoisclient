package com.github.minorg.whoisclient.parser;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.regex.Matcher;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.minorg.whoisclient.Gazetteers;
import com.github.minorg.whoisclient.WhoisRecord;
import com.github.minorg.whoisclient.WhoisRecordParseException;
import com.github.minorg.whoisclient.WhoisRegistrant;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class WhoisRegistrantFieldParser extends WhoisPatternFieldParser {
    public WhoisRegistrantFieldParser(final Gazetteers gazetteers) {
        this(WhoisRecord.FieldMetadata.REGISTRANT, gazetteers, new String[] {
                "   Registrant:[ ]*\\n      (?<organization>.*)\\n      (?<name>.*)\\n      (?<street>.*)\\n      (?<city>.*), (?<state>.*) (?<postalcode>.*)\\n      (?<country>.*)\\n(?:      Phone: (?<phone>.*)\\n)?      Email: (?<email>.*)\\n", // Corporate
                                                                                                                                                                                                                                                       // Domains,
                                                                                                                                                                                                                                                       // Inc.
                "Registrant:\\n  (?<name>.+)\\n  (?<street1>.+)\\n(?:  (?<street2>.*)\\n)?(?:  (?<street3>.*)\\n)?  (?<postalcode>.+), (?<city>.+)\\n  (?<country>.+)\\n  (?<phone>.+)\\n  (?<email>.+)\\n\\n", // OVH
                "(?:Registrant ID:(?<handle>.+)\\n)?Registrant Name:(?<name>.*)\\n(?:Registrant Organization:(?<organization>.*)\\n)?Registrant Street1?:(?<street1>.*)\\n(?:Registrant Street2:(?<street2>.*)\\n)?(?:Registrant Street3:(?<street3>.*)\\n)?Registrant City:(?<city>.*)\\nRegistrant State/Province:(?<state>.*)\\nRegistrant Postal Code:(?<postalcode>.*)\\nRegistrant Country:(?<country>.*)\\nRegistrant Phone:(?<phone>.*)\\n(?:Registrant Phone Ext.:(?<phoneext>.*)\\n)?(?:Registrant FAX:(?<fax>.*)\\n)?(?:Registrant FAX Ext.:(?<faxext>.*)\\n)?Registrant Email:(?<email>.*)", // Public
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         // Interest
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         // Registry
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         // (.org),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         // nic.pw,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         // No-IP.com
                "Registrant ID:(?<handle>.+)\\nRegistrant Name:(?<name>.*)\\n(?:Registrant Organization:(?<organization>.*)\\n)?Registrant Address1?:(?<street1>.*)\\n(?:Registrant Address2:(?<street2>.*)\\n)?(?:Registrant Address3:(?<street3>.*)\\n)?Registrant City:(?<city>.*)\\nRegistrant State/Province:(?<state>.*)\\nRegistrant Country/Economy:(?<country>.*)\\nRegistrant Postal Code:(?<postalcode>.*)\\nRegistrant Phone:(?<phone>.*)\\n(?:Registrant Phone Ext.:(?<phoneext>.*)\\n)?(?:Registrant FAX:(?<fax>.*)\\n)?(?:Registrant FAX Ext.:(?<faxext>.*)\\n)?Registrant E-mail:(?<email>.*)", // .ME,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                // DotAsia
                "Registrant ID:\\s*(?<handle>.+)\\nRegistrant Name:\\s*(?<name>.+)\\nRegistrant Organization:\\s*(?<organization>.*)\\nRegistrant Address1:\\s*(?<street1>.+)\\nRegistrant Address2:\\s*(?<street2>.*)\\nRegistrant City:\\s*(?<city>.+)\\nRegistrant State/Province:\\s*(?<state>.+)\\nRegistrant Postal Code:\\s*(?<postalcode>.+)\\nRegistrant Country:\\s*(?<country>.+)\\nRegistrant Country Code:\\s*(?<countrycode>.+)\\nRegistrant Phone Number:\\s*(?<phone>.+)\\nRegistrant Email:\\s*(?<email>.+)\\n", // .CO
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  // Internet
                "Registrant Contact: (?<handle>.+)\\nRegistrant Organization: (?<organization>.+)\\nRegistrant Name: (?<name>.+)\\nRegistrant Street: (?<street>.+)\\nRegistrant City: (?<city>.+)\\nRegistrant Postal Code: (?<postalcode>.+)\\nRegistrant State: (?<state>.+)\\nRegistrant Country: (?<country>.+)\\nRegistrant Phone: (?<phone>.*)\\nRegistrant Phone Ext: (?<phoneext>.*)\\nRegistrant Fax: (?<fax>.*)\\nRegistrant Fax Ext: (?<faxext>.*)\\nRegistrant Email: (?<email>.*)\\n", // Key-Systems
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     // GmbH
                "(?:Registrant ID:[ ]*(?<handle>.*)\\n)?Registrant Name:[ ]*(?<name>.*)\\n(?:Registrant Organization:[ ]*(?<organization>.*)\\n)?Registrant Street:[ ]*(?<street1>.+)\\n(?:Registrant Street:[ ]*(?<street2>.+)\\n)?(?:Registrant Street:[ ]*(?<street3>.+)\\n)?Registrant City:[ ]*(?<city>.+)\\nRegistrant State(?:\\/Province)?:[ ]*(?<state>.*)\\nRegistrant Postal Code:[ ]*(?<postalcode>.+)\\nRegistrant Country:[ ]*(?<country>.+)\\n(?:Registrant Phone:[ ]*(?<phone>.*)\\n)?(?:Registrant Phone Ext:[ ]*(?<phoneext>.*)\\n)?(?:Registrant Fax:[ ]*(?<fax>.*)\\n)?(?:Registrant Fax Ext:[ ]*(?<faxext>.*)\\n)?(?:Registrant Email:[ ]*(?<email>.+)\\n)?", // WildWestDomains,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // GoDaddy,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // Namecheap/eNom,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // Ascio,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // Musedoma
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // (.museum),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // EuroDNS,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   // nic.ps
                "Registrant\\n(?:    (?<organization>.+)\\n)?    (?<name>.+)\\n    Email:(?<email>.+)\\n    (?<street1>.+)\\n(?:    (?<street2>.+)\\n)?    (?<postalcode>.+) (?<city>.+)\\n    (?<country>.+)\\n    Tel: (?<phone>.+)\\n\\n", // internet.bs
                " Registrant Contact Details:[ ]*\\n    (?<organization>.*)\\n    (?<name>.*)[ ]{2,}\\((?<email>.*)\\)\\n    (?<street1>.*)\\n(?:    (?<street2>.*)\\n)?(?:    (?<street3>.*)\\n)?    (?<city>.*)\\n    (?<state>.*),(?<postalcode>.*)\\n    (?<country>.*)\\n    Tel. (?<phone>.*)", // Whois.com
                "owner-id:[ ]*(?<handle>.*)\\n(?:owner-organization:[ ]*(?<organization>.*)\\n)?owner-name:[ ]*(?<name>.*)\\nowner-street:[ ]*(?<street>.*)\\nowner-city:[ ]*(?<city>.*)\\nowner-zip:[ ]*(?<postalcode>.*)\\nowner-country:[ ]*(?<country>.*)\\n(?:owner-phone:[ ]*(?<phone>.*)\\n)?(?:owner-fax:[ ]*(?<fax>.*)\\n)?owner-email:[ ]*(?<email>.*)", // InterNetworX
                "Registrant:\\n registrant_org: (?<organization>.*)\\n registrant_name: (?<name>.*)\\n registrant_email: (?<email>.*)\\n registrant_address: (?<address>.*)\\n registrant_city: (?<city>.*)\\n registrant_state: (?<state>.*)\\n registrant_zip: (?<postalcode>.*)\\n registrant_country: (?<country>.*)\\n registrant_phone: (?<phone>.*)", // Bellnames
                "Holder of domain name:\\n(?<name>[\\S\\s]+)\\n(?<street>.+)\\n(?<postalcode>[A-Z0-9-]+)\\s+(?<city>.+)\\n(?<country>.+)\\nContractual Language", // nic.ch
                "\\n\\n(?:Owner)?\\s+: (?<name>.*)\\n(?:\\s+: (?<organization>.*)\\n)?\\s+: (?<street>.*)\\n\\s+: (?<city>.*)\\n\\s+: (?<state>.*)\\n\\s+: (?<country>.*)\\n", // nic.io
                "Contact Information:\\n\\[Name\\]\\s*(?<name>.*)\\n\\[Email\\]\\s*(?<email>.*)\\n\\[Web Page\\]\\s*(?<url>.*)\\n\\[Postal code\\]\\s*(?<postalcode>.*)\\n\\[Postal Address\\]\\s*(?<street1>.*)\\n(?:\\s+(?<street2>.*)\\n)?(?:\\s+(?<street3>.*)\\n)?\\[Phone\\]\\s*(?<phone>.*)\\n\\[Fax\\]\\s*(?<fax>.*)\\n", // jprs.jp
                "g\\. \\[Organization\\]               (?<organization>.+)\\n", // .co.jp
                                                                                // registrations
                                                                                // at
                                                                                // jprs.jp
                "Registrant ID:(?<handle>.*)\\nRegistrant Name:(?<name>.*)\\n(?:Registrant Organization:(?<organization>.*)\\n)?Registrant Address1:(?<street1>.*)\\n(?:Registrant Address2:(?<street2>.*)\\n)?(?:Registrant Address3:(?<street3>.*)\\n)?Registrant City:(?<city>.*)\\n(?:Registrant State/Province:(?<state>.*)\\n)?(?:Registrant Postal Code:(?<postalcode>.*)\\n)?Registrant Country:(?<country>.*)\\nRegistrant Country Code:.*\\nRegistrant Phone Number:(?<phone>.*)\\n(?:Registrant Facsimile Number:(?<facsimile>.*)\\n)?Registrant Email:(?<email>.*)", // .US,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // .biz
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // (NeuStar),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // .buzz,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // .moe
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // (Interlink
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // Co.
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 // Ltd.)
                "Registrant\\n  Name:             (?<name>.+)\\n(?:  Organization:     (?<organization>.+)\\n)?  ContactID:        (?<handle>.+)\\n(?:  Address:          (?<street1>.+)\\n(?:                    (?<street2>.+)\\n(?:                    (?<street3>.+)\\n)?)?                    (?<city>.+)\\n                    (?<postalcode>.+)\\n                    (?<state>.+)\\n                    (?<country>.+)\\n)?(?:  Created:          (?<creationdate>.+)\\n)?(?:  Last Update:      (?<changedate>.+)\\n)?", // nic.it
                "  Organisation Name[.]* (?<name>.*)\\n  Organisation Address[.]* (?<street1>.*)\\n  Organisation Address[.]* (?<street2>.*)\\n(?:  Organisation Address[.]* (?<street3>.*)\\n)?  Organisation Address[.]* (?<city>.*)\\n  Organisation Address[.]* (?<postalcode>.*)\\n  Organisation Address[.]* (?<state>.*)\\n  Organisation Address[.]* (?<country>.*)", // Melbourne
                                                                                                                                                                                                                                                                                                                                                                              // IT
                                                                                                                                                                                                                                                                                                                                                                              // (what
                                                                                                                                                                                                                                                                                                                                                                              // a
                                                                                                                                                                                                                                                                                                                                                                              // horrid
                                                                                                                                                                                                                                                                                                                                                                              // format...)
                "Registrant:[ ]*(?<name>.+)\\n[\\s\\S]*Eligibility Name:[ ]*(?<organization>.+)\\n[\\s\\S]*Registrant Contact ID:[ ]*(?<handle>.+)\\n", // .au
                                                                                                                                                        // business
                "Eligibility Type:[ ]*Citizen\\/Resident\\n[\\s\\S]*Registrant Contact ID:[ ]*(?<handle>.+)\\n[\\s\\S]*Registrant Contact Name:[ ]*(?<name>.+)\\n", // .au
                                                                                                                                                                    // individual
                "Registrant:[ ]*(?<organization>.+)\\n[\\s\\S]*Eligibility Type:[ ]*(Higher Education Institution|Company|Incorporated Association|Other)\\n[\\s\\S]*Registrant Contact ID:[ ]*(?<handle>.+)\\n[\\s\\S]*Registrant Contact Name:[ ]*(?<name>.+)\\n", // .au
                                                                                                                                                                                                                                                                     // educational,
                                                                                                                                                                                                                                                                     // company,
                                                                                                                                                                                                                                                                     // 'incorporated
                                                                                                                                                                                                                                                                     // association'
                                                                                                                                                                                                                                                                     // (non-profit?),
                                                                                                                                                                                                                                                                     // other
                                                                                                                                                                                                                                                                     // (spotted
                                                                                                                                                                                                                                                                     // for
                                                                                                                                                                                                                                                                     // linux.conf.au,
                                                                                                                                                                                                                                                                     // unsure
                                                                                                                                                                                                                                                                     // if
                                                                                                                                                                                                                                                                     // also
                                                                                                                                                                                                                                                                     // for
                                                                                                                                                                                                                                                                     // others)
                "    Registrant:\\n        (?<name>.+)\\n\\n    Registrant type:\\n        .*\\n\\n    Registrant's address:\\n        The registrant .* opted to have", // Nominet
                                                                                                                                                                         // (.uk)
                                                                                                                                                                         // with
                                                                                                                                                                         // hidden
                                                                                                                                                                         // address
                "    Registrant:\\n        (?<name>.+)\\n\\n[\\s\\S]*    Registrant type:\\n        .*\\n\\n    Registrant's address:\\n        (?<street1>.+)\\n(?:        (?<street2>.+)\\n(?:        (?<street3>.+)\\n)??)??        (?<city>[^0-9\\n]+)\\n(?:        (?<state>.+)\\n)?        (?<postalcode>.+)\\n        (?<country>.+)\\n\\n", // Nominet
                                                                                                                                                                                                                                                                                                                                                    // (.uk)
                                                                                                                                                                                                                                                                                                                                                    // with
                                                                                                                                                                                                                                                                                                                                                    // visible
                                                                                                                                                                                                                                                                                                                                                    // address
                "Domain Owner:\\n\\t(?<organization>.+)\\n\\n[\\s\\S]*?(?:Registrant Contact:\\n\\t(?<name>.+))?\\n\\nRegistrant(?:'s)? (?:a|A)ddress:(?:\\n\\t(?<street1>.+)\\n(?:\\t(?<street2>.+)\\n)?(?:\\t(?<street3>.+)\\n)?\\t(?<city>.+)\\n\\t(?<postalcode>.+))?\\n\\t(?<country>.+)(?:\\n\\t(?<phone>.+) \\(Phone\\)\\n\\t(?<fax>.+) \\(FAX\\)\\n\\t(?<email>.+))?\\n\\n", // .ac.uk
                                                                                                                                                                                                                                                                                                                                                                                     // -
                                                                                                                                                                                                                                                                                                                                                                                     // what
                                                                                                                                                                                                                                                                                                                                                                                     // a
                                                                                                                                                                                                                                                                                                                                                                                     // mess...
                "Registrant ID: (?<handle>.+)\\nRegistrant: (?<name>.+)\\nRegistrant Contact Email: (?<email>.+)", // .cn
                                                                                                                   // (CNNIC)
                "Registrant contact:\\n  (?<name>.+)\\n  (?<street>.*)\\n  (?<city>.+), (?<state>.+) (?<postalcode>.+) (?<country>.+)\\n\\n", // Fabulous.com
                "registrant-name:\\s*(?<name>.+)\\nregistrant-type:\\s*(?<type>.+)\\nregistrant-address:\\s*(?<street>.+)\\nregistrant-postcode:\\s*(?<postalcode>.+)\\nregistrant-city:\\s*(?<city>.+)\\nregistrant-country:\\s*(?<country>.+)\\n(?:registrant-phone:\\s*(?<phone>.+)\\n)?(?:registrant-email:\\s*(?<email>.+)\\n)?", // Hetzner
                "Registrant Contact Information :[ ]*\\n[ ]+(?<firstname>.*)\\n[ ]+(?<lastname>.*)\\n[ ]+(?<organization>.*)\\n[ ]+(?<email>.*)\\n[ ]+(?<street>.*)\\n[ ]+(?<city>.*)\\n[ ]+(?<postalcode>.*)\\n[ ]+(?<phone>.*)\\n[ ]+(?<fax>.*)\\n\\n", // GAL
                                                                                                                                                                                                                                                          // Communication
                "Contact Information : For Customer # [0-9]+[ ]*\\n[ ]+(?<firstname>.*)\\n[ ]+(?<lastname>.*)\\n[ ]+(?<organization>.*)\\n[ ]+(?<email>.*)\\n[ ]+(?<street>.*)\\n[ ]+(?<city>.*)\\n[ ]+(?<postalcode>.*)\\n[ ]+(?<phone>.*)\\n[ ]+(?<fax>.*)\\n\\n", // GAL
                                                                                                                                                                                                                                                                     // Communication
                                                                                                                                                                                                                                                                     // alternative
                                                                                                                                                                                                                                                                     // (private
                                                                                                                                                                                                                                                                     // WHOIS)
                                                                                                                                                                                                                                                                     // format?
                "Registrant:\\n   Name:           (?<name>.+)\\n   City:           (?<city>.+)\\n   State:          (?<state>.+)\\n   Country:        (?<country>.+)\\n", // Akky
                                                                                                                                                                          // (.com.mx)
                "   Registrant:\\n      (?<name>.+)\\n      (?<street>.+)\\n      (?<city>.+) (?<state>\\S+),[ ]+(?<postalcode>.+)\\n      (?<country>.+)", // .am
                "Domain Holder: (?<organization>.+)\\n(?<street1>.+?)(?:,+ (?<street2>.+?)(?:,+ (?<street3>.+?)(?:,+ (?<street4>.+?)(?:,+ (?<street5>.+?)(?:,+ (?<street6>.+?)(?:,+ (?<street7>.+?))?)?)?)?)?)?, (?<city>[^.,]+), (?<district>.+), (?<state>.+)\\n(?<postalcode>.+)\\n(?<country>[A-Z]+)\\n", // .co.th,
                                                                                                                                                                                                                                                                                                              // format
                                                                                                                                                                                                                                                                                                              // 1
                "Domain Holder: (?<organization>.+)\\n(?<street1>.+?)(?:,+ (?<street2>.+?)(?:,+ (?<street3>.+?)(?:,+ (?<street4>.+?)(?:,+ (?<street5>.+?)(?:,+ (?<street6>.+?)(?:,+ (?<street7>.+?))?)?)?)?)?)?, (?<city>.+)\\n(?<postalcode>.+)\\n(?<country>[A-Z]+)\\n", // .co.th,
                                                                                                                                                                                                                                                                           // format
                                                                                                                                                                                                                                                                           // 2
                "Domain Holder: (?<organization>.+)\\n(?<street1>.+)\\n(?:(?<street2>.+)\\n)?(?:(?<street3>.+)\\n)?.+?, (?<district>.+)\\n(?<city>.+)\\n(?<postalcode>.+)\\n(?<country>[A-Z]+)\\n", // .co.th,
                                                                                                                                                                                                    // format
                                                                                                                                                                                                    // 3
                "Domain Holder: (?<organization>.+)\\n(?<street1>.+?)(?:,+ (?<street2>.+?)(?:,+ (?<street3>.+?)(?:,+ (?<street4>.+?)(?:,+ (?<street5>.+?)(?:,+ (?<street6>.+?)(?:,+ (?<street7>.+?))?)?)?)?)?)?\\n(?<city>.+),? (?<state>[A-Z]{2,3})(?: [A-Z0-9]+)?\\n(?<postalcode>.+)\\n(?<country>[A-Z]+)\\n", // .co.th,
                                                                                                                                                                                                                                                                                                                  // format
                                                                                                                                                                                                                                                                                                                  // 4
                "   Registrant:\\n      (?<organization>.+)\\n      (?<name>.+)  (?<email>.+)\\n      (?<phone>.*)\\n      (?<fax>.*)\\n      (?<street>.*)\\n      (?<city>.+), (?<state>[^,\\n]*)\\n      (?<country>.+)\\n", // .com.tw
                                                                                                                                                                                                                                // (Western
                                                                                                                                                                                                                                // registrars)
                "Registrant:\\n(?<organization1>.+)\\n(?<organization2>.+)\\n(?<street1>.+?)(?:,+(?<street2>.+?)(?:,+(?<street3>.+?)(?:,+(?<street4>.+?)(?:,+(?<street5>.+?)(?:,+(?<street6>.+?)(?:,+(?<street7>.+?))?)?)?)?)?)?,(?<city>.+),(?<country>.+)\\n\\n   Contact:\\n      (?<name>.+)   (?<email>.+)\\n      TEL:  (?<phone>.+?)(?:(?:#|ext.?)(?<phoneext>.+))?\\n      FAX:  (?<fax>.+)(?:(?:#|ext.?)(?<faxext>.+))?\\n", // .com.tw
                                                                                                                                                                                                                                                                                                                                                                                                                                      // (TWNIC/SEEDNET,
                                                                                                                                                                                                                                                                                                                                                                                                                                      // Taiwanese
                                                                                                                                                                                                                                                                                                                                                                                                                                      // companies
                                                                                                                                                                                                                                                                                                                                                                                                                                      // only?)
                "Registrant Contact Information:\\n\\nCompany English Name \\(It should be the same as the registered/corporation name on your Business Register Certificate or relevant documents\\):(?<organization1>.+)\\nCompany Chinese name:(?<organization2>.+)\\nAddress: (?<street>.+)\\nCountry: (?<country>.+)\\nEmail: (?<email>.+)\\n", // HKDNR
                                                                                                                                                                                                                                                                                                                                                     // (.hk)
                "Registrant ID:(?<handle>.+)\\nRegistrant Name:(?<name>.*)\\n(?:Registrant Organization:(?<organization>.*)\\n)?Registrant Street1:(?<street1>.+?)\\n(?:Registrant Street2:(?<street2>.+?)\\n(?:Registrant Street3:(?<street3>.+?)\\n)?)?Registrant City:(?<city>.+)\\nRegistrant State:(?<state>.*)\\nRegistrant Postal Code:(?<postalcode>.+)\\nRegistrant Country:(?<country>[A-Z]+)\\nRegistrant Phone:(?<phone>.*?)\\nRegistrant Fax:(?<fax>.*)\\nRegistrant Email:(?<email>.+)\\n", // Realtime
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          // Register
                "owner:\\s+(?<name>.+)", // .br
                "person:\\s+(?<name>.+)", // nic.ru (person)
                "org:\\s+(?<organization>.+)", // nic.ru (organization)
        });
    }

    protected WhoisRegistrantFieldParser(final WhoisRecord.FieldMetadata field, final Gazetteers gazetteers,
            final String[] patternStrings) {
        super(patternStrings);
        this.field = checkNotNull(field);
        this.gazetteers = checkNotNull(gazetteers);
    }

    @Override
    public final boolean parse(final String raw, final WhoisRecord.Builder recordBuilder)
            throws WhoisRecordParseException {
        final Optional<Matcher> match = _match(raw);
        if (!match.isPresent()) {
            return false;
        }

        final WhoisRegistrant.Builder registrantBuilder = WhoisRegistrant.builder();
        boolean empty = true;
        for (final WhoisRegistrant.FieldMetadata registrantField : WhoisRegistrant.FieldMetadata.values()) {
            String registrantFieldName;
            switch (registrantField) {
            case COUNTRY_CODE:
                registrantFieldName = "countrycode";
                break;
            case FIRST_NAME:
                registrantFieldName = "firstname";
                break;
            case LAST_NAME:
                registrantFieldName = "lastname";
                break;
            case PHONE_EXT:
                registrantFieldName = "phoneext";
                break;
            case POSTAL_CODE:
                registrantFieldName = "postalcode";
                break;
            case STREET: {
                final ImmutableList.Builder<String> streetBuilder = ImmutableList.builder();
                for (int streetI = 0; streetI < 8; streetI++) {
                    @Nullable
                    final String street = __groupNullable(match.get(), streetI == 0 ? "street" : ("street" + streetI));
                    if (street == null) {
                        continue;
                    }
                    streetBuilder.add(street);
                }
                final ImmutableList<String> street = streetBuilder.build();
                if (!street.isEmpty()) {
                    registrantBuilder.setStreet(street);
                }
                continue;
            }
            default:
                registrantFieldName = registrantField.getThriftName();
                break;
            }

            final String registrantFieldValue = __groupNullable(match.get(), registrantFieldName);
            if (registrantFieldValue == null) {
                continue;
            }

            // Translate codes to names
            switch (registrantField) {
            case CITY: {
                // Translate a city=airport code to the city name
                @Nullable
                final String cityNameForAirportCode = gazetteers.getAirportNamesByCode().get(registrantFieldValue);
                if (cityNameForAirportCode != null) {
                    logger.debug("translated airport {} to city {}", registrantFieldValue, cityNameForAirportCode);
                    registrantBuilder.setAirportCode(registrantFieldValue);
                    registrantBuilder.setCity(cityNameForAirportCode);
                    empty = false;
                    continue;
                }
                break;
            }

            case COUNTRY: {
                // Translate a country=country code to the country name
                @Nullable
                final String countryNameForCountryCode = gazetteers.getCountryNamesByCode().get(registrantFieldValue);
                if (countryNameForCountryCode != null) {
                    logger.debug("translated country {} to {}", registrantFieldValue, countryNameForCountryCode);
                    registrantBuilder.setCountryCode(registrantFieldValue);
                    registrantBuilder.setCountry(countryNameForCountryCode);
                    empty = false;
                    continue;
                }
                break;
            }

            default:
                break;
            }

            registrantBuilder.set(registrantField, registrantFieldValue);
            empty = false;
        }

        if (empty) {
            logger.warn("{}: matched registrant regex to '{}' but no fields found", field, match.get().group());
            return false;
        }

        if (registrantBuilder.getState().isPresent() && registrantBuilder.getCountry().isPresent()) {
            // Translate a state=state code to a state name
            ImmutableMap<String, String> statesGazetteer;
            switch (registrantBuilder.getCountry().get().toLowerCase()) {
            case "australia":
                statesGazetteer = gazetteers.getAustralianStateNamesByCode();
                break;
            case "canada":
                statesGazetteer = gazetteers.getCanadianStateNamesByCode();
                break;
            case "united states":
            case "united states of america":
                statesGazetteer = gazetteers.getAmericanStateNamesByCode();
                break;
            default:
                statesGazetteer = null;
            }
            if (statesGazetteer != null) {
                @Nullable
                final String stateNameForStateCode = statesGazetteer.get(registrantBuilder.getState().get());
                if (stateNameForStateCode != null) {
                    logger.debug("translated state {} in country {} to {}", registrantBuilder.getState().get(),
                            registrantBuilder.getCountry().get(), stateNameForStateCode);
                    registrantBuilder.setStateCode(registrantBuilder.getState().get());
                    registrantBuilder.setState(stateNameForStateCode);
                }
            }
        }

        final WhoisRegistrant registrant = registrantBuilder.build();
        recordBuilder.set(this.field, registrant);
        return true;
    }

    private @Nullable String __groupNullable(final Matcher matcher, final String name) {
        String value;
        try {
            value = matcher.group(name);
        } catch (final IllegalArgumentException e) {
            return null;
        }
        if (value == null) {
            return null;
        } else if (value.isEmpty()) {
            return null;
        } else if (StringUtils.isBlank(value)) {
            return null;
        }
        return value;
    }

    private final WhoisRecord.FieldMetadata field;
    private final Gazetteers gazetteers;
    private final static Logger logger = LoggerFactory.getLogger(WhoisRegistrantFieldParser.class);
}

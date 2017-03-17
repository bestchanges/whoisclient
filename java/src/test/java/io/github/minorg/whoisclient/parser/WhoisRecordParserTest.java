package io.github.minorg.whoisclient.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.thryft.native_.InternetDomainName;

import com.google.common.collect.ImmutableList;

import io.github.minorg.whoisclient.RawWhoisRecord;
import io.github.minorg.whoisclient.WhoisRecord;
import io.github.minorg.whoisclient.WhoisRecordParseException;
import io.github.minorg.whoisclient.parser.WhoisRecordParser;

public final class WhoisRecordParserTest {
    @Before
    public void setUp() {
        parser = new WhoisRecordParser();
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDotComVerisignReferral() throws WhoisRecordParseException {
        final String raw = "\n" + "Whois Server Version 2.0\n" + "\n"
                + "Domain names in the .com and .net domains can now be registered\n"
                + "with many different competing registrars. Go to http://www.internic.net\n"
                + "for detailed information.\n" + "\n" + "   Domain Name: NOTABLIST.COM\n"
                + "   Registrar: GODADDY.COM, LLC\n" + "   Sponsoring Registrar IANA ID: 146\n"
                + "   Whois Server: whois.godaddy.com\n" + "   Referral URL: http://www.godaddy.com\n"
                + "   Name Server: NS-1093.AWSDNS-08.ORG\n" + "   Name Server: NS-1873.AWSDNS-42.CO.UK\n"
                + "   Name Server: NS-459.AWSDNS-57.COM\n" + "   Name Server: NS-719.AWSDNS-25.NET\n"
                + "   Status: clientDeleteProhibited https://icann.org/epp#clientDeleteProhibited\n"
                + "   Status: clientRenewProhibited https://icann.org/epp#clientRenewProhibited\n"
                + "   Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited\n"
                + "   Status: clientUpdateProhibited https://icann.org/epp#clientUpdateProhibited\n"
                + "   Updated Date: 25-feb-2016\n" + "   Creation Date: 24-feb-2014\n"
                + "   Expiration Date: 24-feb-2017\n" + "\n"
                + ">>> Last update of whois database: Fri, 26 Aug 2016 19:54:22 GMT <<<\n" + "\n"
                + "For more information on Whois status codes, please visit https://icann.org/epp\n" + "\n"
                + "NOTICE: The expiration date displayed in this record is the date the\n"
                + "registrar's sponsorship of the domain name registration in the registry is\n"
                + "currently set to expire. This date does not necessarily reflect the expiration\n"
                + "date of the domain name registrant's agreement with the sponsoring\n"
                + "registrar.  Users may consult the sponsoring registrar's Whois database to\n"
                + "view the registrar's reported date of expiration for this registration.\n" + "\n"
                + "TERMS OF USE: You are not authorized to access or query our Whois\n"
                + "database through the use of electronic processes that are high-volume and\n"
                + "automated except as reasonably necessary to register domain names or\n"
                + "modify existing registrations; the Data in VeriSign Global Registry\n"
                + "Services' (\"VeriSign\") Whois database is provided by VeriSign for\n"
                + "information purposes only, and to assist persons in obtaining information\n"
                + "about or related to a domain name registration record. VeriSign does not\n"
                + "guarantee its accuracy. By submitting a Whois query, you agree to abide\n"
                + "by the following terms of use: You agree that you may use this Data only\n"
                + "for lawful purposes and that under no circumstances will you use this Data\n"
                + "to: (1) allow, enable, or otherwise support the transmission of mass\n"
                + "unsolicited, commercial advertising or solicitations via e-mail, telephone,\n"
                + "or facsimile; or (2) enable high volume, automated, electronic processes\n"
                + "that apply to VeriSign (or its computer systems). The compilation,\n"
                + "repackaging, dissemination or other use of this Data is expressly\n"
                + "prohibited without the prior written consent of VeriSign. You agree not to\n"
                + "use electronic processes that are automated and high-volume to access or\n"
                + "query the Whois database except as reasonably necessary to register\n"
                + "domain names or modify existing registrations. VeriSign reserves the right\n"
                + "to restrict your access to the Whois database in its sole discretion to ensure\n"
                + "operational stability.  VeriSign may restrict or terminate your access to the\n"
                + "Whois database for failure to abide by these terms of use. VeriSign\n"
                + "reserves the right to modify these terms at any time.\n" + "\n"
                + "The Registry database contains ONLY .COM, .NET, .EDU domains and\n" + "Registrars.\n" + "";
        final WhoisRecord record = __parse(raw, "notablist.com", "whois.verisign-grs.com");
        assertTrue(record.getCreationDate().isPresent());
        assertEquals(2014, record.getCreationDate().get().getYear() + 1900);
        assertEquals(1, record.getCreationDate().get().getMonth());
        assertEquals(24, record.getCreationDate().get().getDate());
        assertTrue(record.getExpirationDate().isPresent());
        assertTrue(record.getReferral().isPresent());
        assertEquals("whois.godaddy.com", record.getReferral().get());
        assertTrue(record.getUpdatedDate().isPresent());
    }

    @Test
    public void testGandiDotNet() throws Exception {
        final String raw = "Domain Name: minorgordon.net\n" + "Registry Domain ID: 1602174850_DOMAIN_NET-VRSN\n"
                + "Registrar WHOIS Server: whois.gandi.net\n" + "Registrar URL: http://www.gandi.net\n"
                + "Updated Date: 2016-04-10T03:16:26Z\n" + "Creation Date: 2010-06-15T11:03:22Z\n"
                + "Registrar Registration Expiration Date: 2018-06-15T11:03:22Z\n" + "Registrar: GANDI SAS\n"
                + "Registrar IANA ID: 81\n" + "Registrar Abuse Contact Email: abuse@support.gandi.net\n"
                + "Registrar Abuse Contact Phone: +33.170377661\n" + "Reseller: \n"
                + "Domain Status: clientTransferProhibited http://www.icann.org/epp#clientTransferProhibited\n"
                + "Domain Status: \n" + "Domain Status: \n" + "Domain Status: \n" + "Domain Status: \n"
                + "Registry Registrant ID: \n" + "Registrant Name: Minor Gordon\n" + "Registrant Organization: \n"
                + "Registrant Street: Obfuscated whois Gandi-63-65 boulevard Massena\n"
                + "Registrant City: Obfuscated whois Gandi-Paris\n" + "Registrant State/Province: \n"
                + "Registrant Postal Code: 75013\n" + "Registrant Country: FR\n" + "Registrant Phone: +33.170377666\n"
                + "Registrant Phone Ext:\n" + "Registrant Fax: +33.143730576\n" + "Registrant Fax Ext:\n"
                + "Registrant Email: f28aba28d79e740b24a6c09d6cf6c4e5-694358@contact.gandi.net\n"
                + "Registry Admin ID: \n" + "Admin Name: Minor Gordon\n" + "Admin Organization: \n"
                + "Admin Street: Obfuscated whois Gandi-63-65 boulevard Massena\n"
                + "Admin City: Obfuscated whois Gandi-Paris\n" + "Admin State/Province: \n"
                + "Admin Postal Code: 75013\n" + "Admin Country: FR\n" + "Admin Phone: +33.170377666\n"
                + "Admin Phone Ext:\n" + "Admin Fax: +33.143730576\n" + "Admin Fax Ext:\n"
                + "Admin Email: f28aba28d79e740b24a6c09d6cf6c4e5-694358@contact.gandi.net\n" + "Registry Tech ID: \n"
                + "Tech Name: Minor Gordon\n" + "Tech Organization: \n"
                + "Tech Street: Obfuscated whois Gandi-63-65 boulevard Massena\n"
                + "Tech City: Obfuscated whois Gandi-Paris\n" + "Tech State/Province: \n" + "Tech Postal Code: 75013\n"
                + "Tech Country: FR\n" + "Tech Phone: +33.170377666\n" + "Tech Phone Ext:\n"
                + "Tech Fax: +33.143730576\n" + "Tech Fax Ext:\n"
                + "Tech Email: f28aba28d79e740b24a6c09d6cf6c4e5-694358@contact.gandi.net\n"
                + "Name Server: A.DNS.GANDI.NET\n" + "Name Server: B.DNS.GANDI.NET\n" + "Name Server: C.DNS.GANDI.NET\n"
                + "Name Server: \n" + "Name Server: \n" + "Name Server: \n" + "Name Server: \n" + "Name Server: \n"
                + "Name Server: \n" + "Name Server: \n" + "DNSSEC: Unsigned\n"
                + "URL of the ICANN WHOIS Data Problem Reporting System: http://wdprs.internic.net/\n"
                + ">>> Last update of WHOIS database: 2016-08-28T22:24:45Z <<<\n" + "\n"
                + "For more information on Whois status codes, please visit\n" + "https://www.icann.org/epp\n" + "\n"
                + "Reseller Email: \n" + "Reseller URL: \n" + "\n"
                + "Personal data access and use are governed by French law, any use for the purpose of unsolicited mass commercial advertising as well as any mass or automated inquiries (for any intent other than the registration or modification of a domain name) are strictly forbidden. Copy of whole or part of our database without Gandi's endorsement is strictly forbidden. <br />\n"
                + "A dispute over the ownership of a domain name may be subject to the alternate procedure established by the Registry in question or brought before the courts. <br />\n"
                + "For additional information, please contact us via the following form:<br />\n"
                + " https://www.gandi.net/support/contacter/mail/\n" + "";
        final WhoisRecord record = __parse(raw, "minorgordon.net", "whois.gandi.net");
        assertTrue(record.getQueriedWhoisServers().contains("whois.gandi.net"));
        assertTrue(record.getAdministrativeContact().isPresent());
        assertTrue(record.getRegistrant().isPresent());
        assertTrue(record.getTechnicalContact().isPresent());
    }

    @Test
    public void testGodaddyDotCom() throws WhoisRecordParseException {
        final String text = "Domain Name: NOTABLIST.COM\n" + "Registry Domain ID: 1848029146_DOMAIN_COM-VRSN\n"
                + "Registrar WHOIS Server: whois.godaddy.com\n" + "Registrar URL: http://www.godaddy.com\n"
                + "Update Date: 2016-02-25T08:49:18Z\n" + "Creation Date: 2014-02-24T19:38:34Z\n"
                + "Registrar Registration Expiration Date: 2017-02-24T19:38:34Z\n" + "Registrar: GoDaddy.com, LLC\n"
                + "Registrar IANA ID: 146\n" + "Registrar Abuse Contact Email: abuse@godaddy.com\n"
                + "Registrar Abuse Contact Phone: +1.4806242505\n"
                + "Domain Status: clientTransferProhibited http://www.icann.org/epp#clientTransferProhibited\n"
                + "Domain Status: clientUpdateProhibited http://www.icann.org/epp#clientUpdateProhibited\n"
                + "Domain Status: clientRenewProhibited http://www.icann.org/epp#clientRenewProhibited\n"
                + "Domain Status: clientDeleteProhibited http://www.icann.org/epp#clientDeleteProhibited\n"
                + "Registry Registrant ID: Not Available From Registry\n" + "Registrant Name: Michael Johnston\n"
                + "Registrant Organization: \n" + "Registrant Street: 59-51 69th Lane\n" + "Registrant Street: 5EN\n"
                + "Registrant City: Maspeth\n" + "Registrant State/Province: New York\n"
                + "Registrant Postal Code: 11378\n" + "Registrant Country: US\n" + "Registrant Phone: +1.6463340848\n"
                + "Registrant Phone Ext: \n" + "Registrant Fax: \n" + "Registrant Fax Ext: \n"
                + "Registrant Email: mikej165@gmail.com\n" + "Registry Admin ID: Not Available From Registry\n"
                + "Admin Name: Michael Johnston\n" + "Admin Organization: \n" + "Admin Street: 59-51 69th Lane\n"
                + "Admin Street: 5EN\n" + "Admin City: Maspeth\n" + "Admin State/Province: New York\n"
                + "Admin Postal Code: 11378\n" + "Admin Country: US\n" + "Admin Phone: +1.6463340848\n"
                + "Admin Phone Ext: \n" + "Admin Fax: \n" + "Admin Fax Ext: \n" + "Admin Email: mikej165@gmail.com\n"
                + "Registry Tech ID: Not Available From Registry\n" + "Tech Name: Michael Johnston\n"
                + "Tech Organization: \n" + "Tech Street: 59-51 69th Lane\n" + "Tech Street: 5EN\n"
                + "Tech City: Maspeth\n" + "Tech State/Province: New York\n" + "Tech Postal Code: 11378\n"
                + "Tech Country: US\n" + "Tech Phone: +1.6463340848\n" + "Tech Phone Ext: \n" + "Tech Fax: \n"
                + "Tech Fax Ext: \n" + "Tech Email: mikej165@gmail.com\n" + "Name Server: NS-459.AWSDNS-57.COM\n"
                + "Name Server: NS-719.AWSDNS-25.NET\n" + "Name Server: NS-1093.AWSDNS-08.ORG\n"
                + "Name Server: NS-1873.AWSDNS-42.CO.UK\n" + "DNSSEC: unsigned\n"
                + "URL of the ICANN WHOIS Data Problem Reporting System: http://wdprs.internic.net/\n"
                + ">>> Last update of WHOIS database: 2016-08-27T15:00:00Z <<<\n" + "\n"
                + "For more information on Whois status codes, please visit https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en\n"
                + "\n" + "The data contained in GoDaddy.com, LLC's WhoIs database,\n"
                + "while believed by the company to be reliable, is provided \"as is\"\n"
                + "with no guarantee or warranties regarding its accuracy.  This\n"
                + "information is provided for the sole purpose of assisting you\n"
                + "in obtaining information about domain name registration records.\n"
                + "Any use of this data for any other purpose is expressly forbidden without the prior written\n"
                + "permission of GoDaddy.com, LLC.  By submitting an inquiry,\n"
                + "you agree to these terms of usage and limitations of warranty.  In particular,\n"
                + "you agree not to use this data to allow, enable, or otherwise make possible,\n"
                + "dissemination or collection of this data, in part or in its entirety, for any\n"
                + "purpose, such as the transmission of unsolicited advertising and\n"
                + "and solicitations of any kind, including spam.  You further agree\n"
                + "not to use this data to enable high volume, automated or robotic electronic\n"
                + "processes designed to collect or compile this data for any purpose,\n"
                + "including mining this data for your own personal or commercial purposes. \n" + "\n"
                + "Please note: the registrant of the domain name is specified\n"
                + "in the \"registrant\" section.  In most cases, GoDaddy.com, LLC \n"
                + "is not the registrant of domain names listed in this database.\n" + "";
        final WhoisRecord record = __parse(text, "notablist.com", "whois.godaddy.com");
        assertTrue(record.getAdministrativeContact().isPresent());
        assertTrue(record.getRegistrant().isPresent());
        assertTrue(record.getTechnicalContact().isPresent());
    }

    @Test
    public void testGodaddyDotCom20161129() throws WhoisRecordParseException {
        final String text = "Domain Name: NOTABLIST.COM\n" + "Registry Domain ID: 1848029146_DOMAIN_COM-VRSN\n"
                + "Registrar WHOIS Server: whois.godaddy.com\n" + "Registrar URL: http://www.godaddy.com\n"
                + "Update Date: 2016-02-25T08:49:18Z\n" + "Creation Date: 2014-02-24T19:38:34Z\n"
                + "Registrar Registration Expiration Date: 2017-02-24T19:38:34Z\n" + "Registrar: GoDaddy.com, LLC\n"
                + "Registrar IANA ID: 146\n" + "Registrar Abuse Contact Email: abuse@godaddy.com\n"
                + "Registrar Abuse Contact Phone: +1.4806242505\n"
                + "Domain Status: clientTransferProhibited http://www.icann.org/epp#clientTransferProhibited\n"
                + "Domain Status: clientUpdateProhibited http://www.icann.org/epp#clientUpdateProhibited\n"
                + "Domain Status: clientRenewProhibited http://www.icann.org/epp#clientRenewProhibited\n"
                + "Domain Status: clientDeleteProhibited http://www.icann.org/epp#clientDeleteProhibited\n"
                + "Registry Registrant ID: Not Available From Registry\n" + "Registrant Name: Michael Johnston\n"
                + "Registrant Organization: \n" + "Registrant Street: 59-51 69th Lane\n" + "Registrant Street: 5EN\n"
                + "Registrant City: Maspeth\n" + "Registrant State/Province: New York\n"
                + "Registrant Postal Code: 11378\n" + "Registrant Country: US\n" + "Registrant Phone: +1.6463340848\n"
                + "Registrant Phone Ext: \n" + "Registrant Fax: \n" + "Registrant Fax Ext: \n"
                + "Registrant Email: mikej165@gmail.com\n" + "Registry Admin ID: Not Available From Registry\n"
                + "Admin Name: Michael Johnston\n" + "Admin Organization: \n" + "Admin Street: 59-51 69th Lane\n"
                + "Admin Street: 5EN\n" + "Admin City: Maspeth\n" + "Admin State/Province: New York\n"
                + "Admin Postal Code: 11378\n" + "Admin Country: US\n" + "Admin Phone: +1.6463340848\n"
                + "Admin Phone Ext: \n" + "Admin Fax: \n" + "Admin Fax Ext: \n" + "Admin Email: mikej165@gmail.com\n"
                + "Registry Tech ID: Not Available From Registry\n" + "Tech Name: Michael Johnston\n"
                + "Tech Organization: \n" + "Tech Street: 59-51 69th Lane\n" + "Tech Street: 5EN\n"
                + "Tech City: Maspeth\n" + "Tech State/Province: New York\n" + "Tech Postal Code: 11378\n"
                + "Tech Country: US\n" + "Tech Phone: +1.6463340848\n" + "Tech Phone Ext: \n" + "Tech Fax: \n"
                + "Tech Fax Ext: \n" + "Tech Email: mikej165@gmail.com\n" + "Name Server: NS-459.AWSDNS-57.COM\n"
                + "Name Server: NS-719.AWSDNS-25.NET\n" + "Name Server: NS-1093.AWSDNS-08.ORG\n"
                + "Name Server: NS-1873.AWSDNS-42.CO.UK\n" + "DNSSEC: unsigned\n"
                + "URL of the ICANN WHOIS Data Problem Reporting System: http://wdprs.internic.net/\n"
                + ">>> Last update of WHOIS database: 2016-11-29T23:00:00Z <<<\n" + "\n"
                + "For more information on Whois status codes, please visit https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en\n"
                + "\n" + "The data contained in GoDaddy.com, LLC's WhoIs database,\n"
                + "while believed by the company to be reliable, is provided \"as is\"\n"
                + "with no guarantee or warranties regarding its accuracy.  This\n"
                + "information is provided for the sole purpose of assisting you\n"
                + "in obtaining information about domain name registration records.\n"
                + "Any use of this data for any other purpose is expressly forbidden without the prior written\n"
                + "permission of GoDaddy.com, LLC.  By submitting an inquiry,\n"
                + "you agree to these terms of usage and limitations of warranty.  In particular,\n"
                + "you agree not to use this data to allow, enable, or otherwise make possible,\n"
                + "dissemination or collection of this data, in part or in its entirety, for any\n"
                + "purpose, such as the transmission of unsolicited advertising and\n"
                + "and solicitations of any kind, including spam.  You further agree\n"
                + "not to use this data to enable high volume, automated or robotic electronic\n"
                + "processes designed to collect or compile this data for any purpose,\n"
                + "including mining this data for your own personal or commercial purposes. \n" + "\n"
                + "Please note: the registrant of the domain name is specified\n"
                + "in the \"registrant\" section.  In most cases, GoDaddy.com, LLC \n"
                + "is not the registrant of domain names listed in this database.\n" + "";
        final WhoisRecord record = __parse(text, "notablist.com", "whois.godaddy.com");
        assertTrue(record.getAdministrativeContact().isPresent());
        assertTrue(record.getRegistrant().isPresent());
        assertTrue(record.getTechnicalContact().isPresent());
    }

    private WhoisRecord __parse(final String raw, final String requestedDomainName, final String whoisServer)
            throws WhoisRecordParseException {
        return parser.parse(new RawWhoisRecord(InternetDomainName.from(requestedDomainName),
                ImmutableList.of(InternetDomainName.from(whoisServer)), new Date(), raw));
    }

    private WhoisRecordParser parser;
}

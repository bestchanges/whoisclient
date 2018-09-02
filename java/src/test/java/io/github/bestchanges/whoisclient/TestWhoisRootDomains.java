package io.github.bestchanges.whoisclient;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


/**
 * This class do requests to numerous whois servers and check if we can read their output.
 * Thus this Test dependant on network and on third-party services, so it shall not be included into the build process
 */
public class TestWhoisRootDomains {
    WhoisClient whois = new WhoisClient();

    @Test
    public void testDomainInfo() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("domain.info");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testDomainCom() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("domain.com");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testGoogleCom() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("google.com");
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testExampleCom() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("example.com");
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testDomainOrg() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("domain.org");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testSampleIo() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("sample.io");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testYandexRu() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("yandex.ru");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getCreated() != null);

    }

    @Test
    public void testDomainBiz() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("domain.biz");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

    @Test
    public void testDomainNet() throws IOException, WhoisRecordParseException {
        WhoisRecord whoisRecord = whois.getWhoisRecord("domain.net");
        assertTrue(whoisRecord.getRegistrar() != null);
        assertTrue(whoisRecord.getRegistrant() != null);
        assertTrue(whoisRecord.getExpirationDate() != null);
        assertTrue(whoisRecord.getUpdated() != null);
        assertTrue(whoisRecord.getCreated() != null);
    }

}

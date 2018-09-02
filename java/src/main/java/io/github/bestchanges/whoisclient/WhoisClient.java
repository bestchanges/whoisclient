package io.github.bestchanges.whoisclient;

import com.google.common.base.Charsets;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public final class WhoisClient {

    public static final String WHOIS_IANA_ORG = "whois.iana.org";
    public final static int WHOIS_SERVER_PORT_DEFAULT = 43;

    private final static Logger logger = LoggerFactory.getLogger(WhoisClient.class);

    private int maxNestingLevel = 4;

    public WhoisClient() { }

    /**
     * Set maximum level of recurrent calls of whois servers. Usually not needed.
     * If you do not want to whois server follow recursive calls to refered server set this value to 1
     * @param maxNestingLevel
     */
    public void setMaxNestingLevel(int maxNestingLevel) {
        this.maxNestingLevel = maxNestingLevel;
    }

    /**
     * Request whois data starting from IANA server, which usually respond with reference to the actual whois server.
     * See https://www.iana.org/domains/root/db for more information.
     * May be we shall use whois servers from https://github.com/rfc1036/whois/blob/next/tld_serv_list
     * @param domainName
     * @return
     * @throws IOException
     * @throws WhoisRecordParseException
     */
    public WhoisRecord getWhoisRecord(final String domainName)
            throws IOException, WhoisRecordParseException {
        return getWhoisRecord(domainName, WHOIS_IANA_ORG);
    }

    public WhoisRecord getWhoisRecord(final String domainName, final String whoisServerName)
            throws IOException, WhoisRecordParseException {
        return getWhoisRecord(domainName, whoisServerName, WHOIS_SERVER_PORT_DEFAULT);
    }

    public WhoisRecord getWhoisRecord(final String domainName, String whoisServerName,
                                      int whoisServerPort) throws IOException, WhoisRecordParseException {
        WhoisRecord record = null;
        final Set<String> queriedWhoisServers = new HashSet<>();
        whoisServerName = whoisServerName.toLowerCase();
        int nestingLevel = 0;
        String prevoiusWhoisServerName = null;
        while (true) {
            if (nestingLevel >= maxNestingLevel) {
                // maybe we need exception here?
                logger.info("max nesting level of {} reached. Stop querying", maxNestingLevel);
                break;
            }
            nestingLevel += 1;

            final String text = __getRawWhoisRecord(domainName, whoisServerName, whoisServerPort);
            queriedWhoisServers.add(whoisServerName);

            if (WHOIS_IANA_ORG.equals(prevoiusWhoisServerName)) {
                // we stop providing parent record if it's from IANA whois server as soon as it
                // provides information about regstrar itself
                record = new WhoisRecord(text, domainName, whoisServerName, null);
            } else {
                // But we need to keep providing parent information in other cases
                // for example:
                // 'sample.io' the parent whois 'whois.nic.io' gives better information about registrant
                // when final 'whois.name.com'
                record = new WhoisRecord(text, domainName, whoisServerName, record);
            }

            String referralWhoisServer = record.getReferralWhoisServer();

            if (referralWhoisServer == null) {
                // no referal whois server. Return result
                break;
            }
            referralWhoisServer = referralWhoisServer.toLowerCase();
            if (queriedWhoisServers.contains(referralWhoisServer)) {
                logger.warn("referral loop: {}", referralWhoisServer);
                break;
            }

            prevoiusWhoisServerName = whoisServerName;
            whoisServerName = referralWhoisServer;
            whoisServerPort = WHOIS_SERVER_PORT_DEFAULT;
        }
        return record;
    }

    private String __getRawWhoisRecord(final String domainName, final String whoisServerName,
            final int whoisServerPort) throws IOException {
        String request = domainName;
        InetAddress whoisServerAddress = InetAddress.getByName(whoisServerName);
        if (whoisServerName.equals("whois.verisign-grs.com")) {
            request = '=' + request;
        }
        logger.info("Send request '{}' to whois server '{}' ", request, whoisServerAddress);
        request = String.format("%s\r\n", request);
        try (final Socket socket = new Socket(whoisServerAddress, whoisServerPort)) {
            socket.getOutputStream().write(request.getBytes(Charsets.UTF_8));
            final byte[] rawBytes = IOUtils.toByteArray(socket.getInputStream());
            String response = new String(rawBytes, Charsets.UTF_8);
            logger.debug(response);
            return response;
        }
    }

}

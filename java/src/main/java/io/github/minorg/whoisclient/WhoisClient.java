package io.github.minorg.whoisclient;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.native_.InternetDomainName;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;

import io.github.minorg.whoisclient.parser.WhoisRecordParseException;
import io.github.minorg.whoisclient.parser.WhoisRecordParser;

public final class WhoisClient {
    public WhoisClient() {
        ianaReferPattern = Pattern.compile("refer:\\s*([^\\s]+)");
        parser = new WhoisRecordParser();
    }

    public WhoisRecordParser getParser() {
        return parser;
    }

    public WhoisRecord getWhoisRecord(final InternetDomainName domainName)
            throws IOException, WhoisRecordParseException {
        return getWhoisRecord(domainName, __getWhoisServerAddress(domainName));
    }

    public WhoisRecord getWhoisRecord(final InternetDomainName domainName, final InetAddress whoisServerAddress)
            throws IOException, WhoisRecordParseException {
        return getWhoisRecord(domainName, whoisServerAddress, WHOIS_SERVER_PORT_DEFAULT);
    }

    public WhoisRecord getWhoisRecord(final InternetDomainName domainName, InetAddress whoisServerAddress,
            int whoisServerPort) throws IOException, WhoisRecordParseException {
        WhoisRecord record = null;
        final List<InternetDomainName> queriedWhoisServers = new ArrayList<>();
        while (true) {
            final String text = __getRawWhoisRecord(domainName, whoisServerAddress, whoisServerPort);
            queriedWhoisServers.add(InternetDomainName.from(whoisServerAddress.getHostName().toLowerCase()));

            record = parser.parse(
                    RawWhoisRecord.create(domainName, ImmutableList.copyOf(queriedWhoisServers), new Date(), text));

            if (!record.getParsed().getReferral().isPresent()) {
                break;
            }
            try {
                final InternetDomainName referralParsed = InternetDomainName
                        .from(record.getParsed().getReferral().get()
                                .toLowerCase());
                if (queriedWhoisServers.contains(referralParsed)) {
                    logger.warn("referral loop: {}",
                            record.getParsed().getReferral().get());
                    break;
                }
            } catch (final IllegalArgumentException e) {
            }

            try {
                whoisServerAddress = InetAddress.getByName(record.getParsed().getReferral().get());
                whoisServerPort = WHOIS_SERVER_PORT_DEFAULT;
            } catch (final UnknownHostException e) {
                logger.warn("unable to resolve referral {}", record.getParsed().getReferral().get());
                return record;
            }
        }
        return checkNotNull(record);
    }

    private String __getRawWhoisRecord(final InternetDomainName domainName, final InetAddress whoisServerAddress,
            final int whoisServerPort) throws IOException {
        String request = String.format("%s\r\n", domainName);
        if (whoisServerAddress.getHostName().equals("whois.verisign-grs.com")) {
            request = '=' + request;
        }
        try (final Socket socket = new Socket(whoisServerAddress, whoisServerPort)) {
            socket.getOutputStream().write(request.getBytes(Charsets.UTF_8));
            final byte[] rawBytes = IOUtils.toByteArray(socket.getInputStream());
            return new String(rawBytes, Charsets.UTF_8);
        }
    }

    private synchronized InetAddress __getWhoisIanaOrgAddress() throws UnknownHostException {
        if (whoisIanaOrgAddress == null) {
            whoisIanaOrgAddress = InetAddress.getByName("whois.iana.org");
        }
        return whoisIanaOrgAddress;
    }

    private InetAddress __getWhoisServerAddress(final InternetDomainName domainName)
            throws IOException, WhoisRecordParseException {
        final String raw = __getRawWhoisRecord(domainName, __getWhoisIanaOrgAddress(), WHOIS_SERVER_PORT_DEFAULT);
        for (final String line : IOUtils.readLines(new StringReader(raw))) {
            final Matcher matcher = ianaReferPattern.matcher(StringUtils.strip(line));
            if (matcher.matches()) {
                return InetAddress.getByName(matcher.group(1));
            }
        }
        throw new WhoisRecordParseException("no refer line found");
    }

    private final Pattern ianaReferPattern;
    private final WhoisRecordParser parser;
    private InetAddress whoisIanaOrgAddress = null;
    private final static Logger logger = LoggerFactory.getLogger(WhoisClient.class);
    public final static int WHOIS_SERVER_PORT_DEFAULT = 43;
}

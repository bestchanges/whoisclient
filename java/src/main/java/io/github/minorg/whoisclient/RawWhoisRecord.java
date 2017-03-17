package io.github.minorg.whoisclient;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;

import org.thryft.native_.InternetDomainName;

import com.google.common.collect.ImmutableList;

public final class RawWhoisRecord {
    public RawWhoisRecord(final InternetDomainName queriedName,
            final ImmutableList<InternetDomainName> queriedWhoisServers, final Date queryTimestamp, final String text) {
        this.queriedName = checkNotNull(queriedName);
        this.queriedWhoisServers = checkNotNull(queriedWhoisServers);
        this.queryTimestamp = checkNotNull(queryTimestamp);
        this.text = checkNotNull(text);
    }

    public InternetDomainName getQueriedName() {
        return queriedName;
    }

    public ImmutableList<InternetDomainName> getQueriedWhoisServers() {
        return queriedWhoisServers;
    }

    public Date getQueryTimestamp() {
        return queryTimestamp;
    }

    public String getText() {
        return text;
    }

    private final ImmutableList<InternetDomainName> queriedWhoisServers;
    private final InternetDomainName queriedName;
    private final Date queryTimestamp;
    private final String text;
}

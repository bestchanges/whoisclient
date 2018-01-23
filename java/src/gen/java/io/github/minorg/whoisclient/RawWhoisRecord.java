package io.github.minorg.whoisclient;

public final class RawWhoisRecord implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            queriedName = null;
            queriedWhoisServers = null;
            queryTimestamp = null;
            text = null;
        }

        public Builder(final RawWhoisRecord other) {
            this.queriedName = other.getQueriedName();
            this.queriedWhoisServers = other.getQueriedWhoisServers();
            this.queryTimestamp = other.getQueryTimestamp();
            this.text = other.getText();
        }

        protected RawWhoisRecord _build(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final String text) {
            return new RawWhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, text);
        }

        public RawWhoisRecord build() {
            UncheckedValidator.validate(queriedName, queriedWhoisServers, queryTimestamp, text);

            return _build(queriedName, queriedWhoisServers, queryTimestamp, text);
        }

        public final @javax.annotation.Nullable org.thryft.native_.InternetDomainName getQueriedName() {
            return queriedName;
        }

        public final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> getQueriedWhoisServers() {
            return queriedWhoisServers;
        }

        public final @javax.annotation.Nullable java.util.Date getQueryTimestamp() {
            return queryTimestamp;
        }

        public final @javax.annotation.Nullable String getText() {
            return text;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot, unknownFieldCallback);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readListBegin();
                try {
                    queriedName = org.thryft.native_.InternetDomainName.from(iprot.readString());
                } catch (final java.lang.IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_NAME, e);
                }
                try {
                    queriedWhoisServers = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.thryft.native_.InternetDomainName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.thryft.native_.InternetDomainName.from(iprot.readString()));
                                    } catch (final java.lang.IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, e.getCause());
                }
                try {
                    queryTimestamp = iprot.readDateTime();
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERY_TIMESTAMP, e);
                }
                text = iprot.readString();
                iprot.readListEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "queried_name": {
                        try {
                            queriedName = org.thryft.native_.InternetDomainName.from(iprot.readString());
                        } catch (final java.lang.IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_NAME, e);
                        }
                        break;
                    }
                    case "queried_whois_servers": {
                        try {
                            queriedWhoisServers = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.thryft.native_.InternetDomainName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(org.thryft.native_.InternetDomainName.from(iprot.readString()));
                                            } catch (final java.lang.IllegalArgumentException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, e.getCause());
                        }
                        break;
                    }
                    case "query_timestamp": {
                        try {
                            queryTimestamp = iprot.readDateTime();
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERY_TIMESTAMP, e);
                        }
                        break;
                    }
                    case "text": {
                        text = iprot.readString();
                        break;
                    }
                    default:
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
            return set(FieldMetadata.valueOfThriftName(fieldThriftName), value);
        }

        public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return set((FieldMetadata)fieldMetadata, value);
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case QUERIED_NAME: setQueriedName((org.thryft.native_.InternetDomainName)value); return this;
            case QUERIED_WHOIS_SERVERS: setQueriedWhoisServers((com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>)value); return this;
            case QUERY_TIMESTAMP: setQueryTimestamp((java.util.Date)value); return this;
            case TEXT: setText((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final RawWhoisRecord other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setQueriedName(other.getQueriedName());
            setQueriedWhoisServers(other.getQueriedWhoisServers());
            setQueryTimestamp(other.getQueryTimestamp());
            setText(other.getText());

            return this;
        }

        public Builder setQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
            UncheckedValidator.validateQueriedName(queriedName);
            this.queriedName = queriedName;
            return this;
        }

        public Builder setQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
            UncheckedValidator.validateQueriedWhoisServers(queriedWhoisServers);
            this.queriedWhoisServers = queriedWhoisServers;
            return this;
        }

        public Builder setQueryTimestamp(final java.util.Date queryTimestamp) {
            UncheckedValidator.validateQueryTimestamp(queryTimestamp);
            this.queryTimestamp = queryTimestamp;
            return this;
        }

        public Builder setText(final String text) {
            UncheckedValidator.validateText(text);
            this.text = text;
            return this;
        }

        public Builder unset(final String fieldThriftName) {
            return unset(FieldMetadata.valueOfThriftName(fieldThriftName));
        }

        public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return unset((FieldMetadata)fieldMetadata);
        }

        public Builder unset(final FieldMetadata fieldMetadata) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case QUERIED_NAME: return unsetQueriedName();
            case QUERIED_WHOIS_SERVERS: return unsetQueriedWhoisServers();
            case QUERY_TIMESTAMP: return unsetQueryTimestamp();
            case TEXT: return unsetText();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetQueriedName() {
            this.queriedName = null;
            return this;
        }

        public Builder unsetQueriedWhoisServers() {
            this.queriedWhoisServers = null;
            return this;
        }

        public Builder unsetQueryTimestamp() {
            this.queryTimestamp = null;
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        private @javax.annotation.Nullable org.thryft.native_.InternetDomainName queriedName;
        private @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers;
        private @javax.annotation.Nullable java.util.Date queryTimestamp;
        private @javax.annotation.Nullable String text;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<RawWhoisRecord> {
        @Override
        public RawWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return RawWhoisRecord.readAs(iprot, type);
        }

        @Override
        public RawWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return RawWhoisRecord.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public RawWhoisRecord readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return RawWhoisRecord.readAsList(iprot);
        }

        @Override
        public RawWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return RawWhoisRecord.readAsStruct(iprot);
        }

        @Override
        public RawWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return RawWhoisRecord.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        QUERIED_NAME("queriedName", new com.google.common.reflect.TypeToken<org.thryft.native_.InternetDomainName>() {}, true, (short)0, "queried_name", org.thryft.protocol.Type.STRING),
        QUERIED_WHOIS_SERVERS("queriedWhoisServers", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>>() {}, true, (short)0, "queried_whois_servers", org.thryft.protocol.Type.LIST),
        QUERY_TIMESTAMP("queryTimestamp", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, (short)0, "query_timestamp", org.thryft.protocol.Type.I64),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "text", org.thryft.protocol.Type.STRING);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public short getThriftId() {
            return thriftId;
        }

        @Override
        public String getThriftProtocolKey() {
            return thriftProtocolKey;
        }

        @Override
        public org.thryft.protocol.Type getThriftProtocolType() {
            return thriftProtocolType;
        }

        @Override
        public String getThriftName() {
            return thriftName;
        }

        @Override
        public boolean hasThriftId() {
            return thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID;
        }

        @Override
        public boolean isRequired()  {
            return required;
        }

        public static FieldMetadata valueOfJavaName(final String javaName) {
            switch (javaName) {
            case "queriedName": return QUERIED_NAME;
            case "queriedWhoisServers": return QUERIED_WHOIS_SERVERS;
            case "queryTimestamp": return QUERY_TIMESTAMP;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "queried_name": return QUERIED_NAME;
            case "queried_whois_servers": return QUERIED_WHOIS_SERVERS;
            case "query_timestamp": return QUERY_TIMESTAMP;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            if (thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID) {
                this.thriftProtocolKey = Integer.toString(thriftId) + ":" + thriftName;
            } else {
                this.thriftProtocolKey = thriftName;
            }
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final String text) throws org.thryft.protocol.InputProtocolException {
            validateQueriedName(queriedName);
            validateQueriedWhoisServers(queriedWhoisServers);
            validateQueryTimestamp(queryTimestamp);
            validateText(text);
        }

        public static void validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) throws org.thryft.protocol.InputProtocolException {
            if (queriedName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERIED_NAME, "io.github.minorg.whoisclient.RawWhoisRecord: queriedName is null");
            }
        }

        public static void validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) throws org.thryft.protocol.InputProtocolException {
            if (queriedWhoisServers == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, "io.github.minorg.whoisclient.RawWhoisRecord: queriedWhoisServers is null");
            }
            if (queriedWhoisServers.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, "io.github.minorg.whoisclient.RawWhoisRecord.queriedWhoisServers: less than min length 1");
            }
        }

        public static void validateQueryTimestamp(final java.util.Date queryTimestamp) throws org.thryft.protocol.InputProtocolException {
            if (queryTimestamp == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERY_TIMESTAMP, "io.github.minorg.whoisclient.RawWhoisRecord: queryTimestamp is null");
            }
        }

        public static void validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "io.github.minorg.whoisclient.RawWhoisRecord: text is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final String text) {
            validateQueriedName(queriedName);
            validateQueriedWhoisServers(queriedWhoisServers);
            validateQueryTimestamp(queryTimestamp);
            validateText(text);
        }

        public static void validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
            if (queriedName == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.RawWhoisRecord: queriedName is null");
            }
        }

        public static void validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
            if (queriedWhoisServers == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.RawWhoisRecord: queriedWhoisServers is null");
            }
            if (queriedWhoisServers.isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.RawWhoisRecord.queriedWhoisServers: less than min length 1");
            }
        }

        public static void validateQueryTimestamp(final java.util.Date queryTimestamp) {
            if (queryTimestamp == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.RawWhoisRecord: queryTimestamp is null");
            }
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.RawWhoisRecord: text is null");
            }
        }
    }

    /**
     * Copy constructor
     */
    public RawWhoisRecord(final RawWhoisRecord other) {
        this(other.getQueriedName(), other.getQueriedWhoisServers(), other.getQueryTimestamp(), other.getText());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected RawWhoisRecord(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final String text) {
        this.queriedName = queriedName;
        this.queriedWhoisServers = queriedWhoisServers;
        this.queryTimestamp = queryTimestamp;
        this.text = text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final RawWhoisRecord other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<RawWhoisRecord> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Optional factory method
     */
    public static RawWhoisRecord create(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final String text) {
        UncheckedValidator.validate(queriedName, queriedWhoisServers, queryTimestamp, text);
        return new RawWhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, text);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof RawWhoisRecord)) {
            return false;
        }

        final RawWhoisRecord other = (RawWhoisRecord)otherObject;

        if (!(getQueriedName().equals(other.getQueriedName()))) {
            return false;
        }

        if (!(getQueriedWhoisServers().equals(other.getQueriedWhoisServers()))) {
            return false;
        }

        if (!(getQueryTimestamp().equals(other.getQueryTimestamp()))) {
            return false;
        }

        if (!(getText().equals(other.getText()))) {
            return false;
        }

        return true;
    }

    @Override
    public java.lang.Object get(final String fieldThriftName) {
        return get(FieldMetadata.valueOfThriftName(fieldThriftName));
    }

    @Override
    public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
        if (!(fieldMetadata instanceof FieldMetadata)) {
            throw new IllegalArgumentException();
        }
        return get((FieldMetadata)fieldMetadata);
    }

    public java.lang.Object get(final FieldMetadata fieldMetadata) {
        switch (fieldMetadata) {
        case QUERIED_NAME: return getQueriedName();
        case QUERIED_WHOIS_SERVERS: return getQueriedWhoisServers();
        case QUERY_TIMESTAMP: return getQueryTimestamp();
        case TEXT: return getText();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.thryft.native_.InternetDomainName getQueriedName() {
        return queriedName;
    }

    public final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> getQueriedWhoisServers() {
        return queriedWhoisServers;
    }

    public final java.util.Date getQueryTimestamp() {
        return queryTimestamp;
    }

    public final String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getQueriedName().hashCode();
        hashCode = 31 * hashCode + getQueriedWhoisServers().hashCode();
        hashCode = 31 * hashCode + getQueryTimestamp().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
        return hashCode;
    }

    public static RawWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static RawWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static RawWhoisRecord readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.InternetDomainName queriedName;
        com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers;
        java.util.Date queryTimestamp;
        String text;

        try {
            iprot.readListBegin();
            try {
                queriedName = org.thryft.native_.InternetDomainName.from(iprot.readString());
            } catch (final java.lang.IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_NAME, e);
            }
            try {
                queriedWhoisServers = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<org.thryft.native_.InternetDomainName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(org.thryft.native_.InternetDomainName.from(iprot.readString()));
                                } catch (final java.lang.IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, e.getCause());
            }
            try {
                queryTimestamp = iprot.readDateTime();
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERY_TIMESTAMP, e);
            }
            text = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(queriedName, queriedWhoisServers, queryTimestamp, text);

        return new RawWhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, text);
    }

    public static RawWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static RawWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.thryft.native_.InternetDomainName queriedName = null;
        @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers = null;
        @javax.annotation.Nullable java.util.Date queryTimestamp = null;
        @javax.annotation.Nullable String text = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "queried_name": {
                    try {
                        queriedName = org.thryft.native_.InternetDomainName.from(iprot.readString());
                    } catch (final java.lang.IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_NAME, e);
                    }
                    break;
                }
                case "queried_whois_servers": {
                    try {
                        queriedWhoisServers = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.thryft.native_.InternetDomainName> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.thryft.native_.InternetDomainName.from(iprot.readString()));
                                        } catch (final java.lang.IllegalArgumentException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, e.getCause());
                    }
                    break;
                }
                case "query_timestamp": {
                    try {
                        queryTimestamp = iprot.readDateTime();
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERY_TIMESTAMP, e);
                    }
                    break;
                }
                case "text": {
                    text = iprot.readString();
                    break;
                }
                default:
                    if (unknownFieldCallback.isPresent()) {
                        unknownFieldCallback.get().apply(ifield);
                    }
                    break;
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(queriedName, queriedWhoisServers, queryTimestamp, text);

        return new RawWhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, text);
    }

    public RawWhoisRecord replaceQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
        UncheckedValidator.validateQueriedName(queriedName);
        return new RawWhoisRecord(queriedName, this.queriedWhoisServers, this.queryTimestamp, this.text);
    }

    public RawWhoisRecord replaceQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
        UncheckedValidator.validateQueriedWhoisServers(queriedWhoisServers);
        return new RawWhoisRecord(this.queriedName, queriedWhoisServers, this.queryTimestamp, this.text);
    }

    public RawWhoisRecord replaceQueryTimestamp(final java.util.Date queryTimestamp) {
        UncheckedValidator.validateQueryTimestamp(queryTimestamp);
        return new RawWhoisRecord(this.queriedName, this.queriedWhoisServers, queryTimestamp, this.text);
    }

    public RawWhoisRecord replaceText(final String text) {
        UncheckedValidator.validateText(text);
        return new RawWhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, text);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("queried_name", getQueriedName()).add("queried_whois_servers", getQueriedWhoisServers()).add("query_timestamp", getQueryTimestamp()).add("text", getText()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getQueriedName().toString());

        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQueriedWhoisServers().size());
        for (final org.thryft.native_.InternetDomainName _iter0 : getQueriedWhoisServers()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();

        oprot.writeDateTime(getQueryTimestamp());

        oprot.writeString(getText());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("io.github.minorg.whoisclient.RawWhoisRecord");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeQueriedNameField(oprot);

        writeQueriedWhoisServersField(oprot);

        writeQueryTimestampField(oprot);

        writeTextField(oprot);

        oprot.writeFieldStop();
    }

    public void writeQueriedNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.QUERIED_NAME);
        oprot.writeString(getQueriedName().toString());
        oprot.writeFieldEnd();
    }

    public void writeQueriedWhoisServersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.QUERIED_WHOIS_SERVERS);
        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQueriedWhoisServers().size());
        for (final org.thryft.native_.InternetDomainName _iter0 : getQueriedWhoisServers()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    public void writeQueryTimestampField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.QUERY_TIMESTAMP);
        oprot.writeDateTime(getQueryTimestamp());
        oprot.writeFieldEnd();
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    private final org.thryft.native_.InternetDomainName queriedName;

    private final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers;

    private final java.util.Date queryTimestamp;

    private final String text;
}

package com.github.minorg.whoisclient;

public final class WhoisRecord implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            queriedName = null;
            queriedWhoisServers = null;
            queryTimestamp = null;
            administrativeContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            billingContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            creationDate = com.google.common.base.Optional.<java.util.Date> absent();
            expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
            referral = com.google.common.base.Optional.<String> absent();
            registrant = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            technicalContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            updatedDate = com.google.common.base.Optional.<java.util.Date> absent();
        }

        public Builder(final WhoisRecord other) {
            this.queriedName = other.getQueriedName();
            this.queriedWhoisServers = other.getQueriedWhoisServers();
            this.queryTimestamp = other.getQueryTimestamp();
            this.administrativeContact = other.getAdministrativeContact();
            this.billingContact = other.getBillingContact();
            this.creationDate = other.getCreationDate();
            this.expirationDate = other.getExpirationDate();
            this.referral = other.getReferral();
            this.registrant = other.getRegistrant();
            this.technicalContact = other.getTechnicalContact();
            this.updatedDate = other.getUpdatedDate();
        }

        protected WhoisRecord _build(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) {
            return new WhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate, DefaultConstructionValidator.getInstance());
        }

        public WhoisRecord build() {
            return _build(queriedName, queriedWhoisServers, queryTimestamp, administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
        }

        public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getAdministrativeContact() {
            return administrativeContact;
        }

        public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getBillingContact() {
            return billingContact;
        }

        public final com.google.common.base.Optional<java.util.Date> getCreationDate() {
            return creationDate;
        }

        public final com.google.common.base.Optional<java.util.Date> getExpirationDate() {
            return expirationDate;
        }

        public final org.thryft.native_.InternetDomainName getQueriedName() {
            return queriedName;
        }

        /**
         * Whois servers that were queried, in order
         */
        public final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> getQueriedWhoisServers() {
            return queriedWhoisServers;
        }

        public final java.util.Date getQueryTimestamp() {
            return queryTimestamp;
        }

        public final com.google.common.base.Optional<String> getReferral() {
            return referral;
        }

        public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getRegistrant() {
            return registrant;
        }

        public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getTechnicalContact() {
            return technicalContact;
        }

        public final com.google.common.base.Optional<java.util.Date> getUpdatedDate() {
            return updatedDate;
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
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
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
                if (__list.getSize() > 3) {
                    administrativeContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 4) {
                    billingContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 5) {
                    try {
                        creationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        expirationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 7) {
                    referral = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 8) {
                    registrant = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 9) {
                    technicalContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 10) {
                    try {
                        updatedDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
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
                    case "administrative_contact": {
                        administrativeContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                        break;
                    }
                    case "billing_contact": {
                        billingContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                        break;
                    }
                    case "creation_date": {
                        try {
                            creationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (final IllegalArgumentException e) {
                        }
                        break;
                    }
                    case "expiration_date": {
                        try {
                            expirationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (final IllegalArgumentException e) {
                        }
                        break;
                    }
                    case "referral": {
                        referral = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "registrant": {
                        registrant = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                        break;
                    }
                    case "technical_contact": {
                        technicalContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                        break;
                    }
                    case "updated_date": {
                        try {
                            updatedDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (final IllegalArgumentException e) {
                        }
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
            case ADMINISTRATIVE_CONTACT: setAdministrativeContact((com.github.minorg.whoisclient.WhoisRegistrant)value); return this;
            case BILLING_CONTACT: setBillingContact((com.github.minorg.whoisclient.WhoisRegistrant)value); return this;
            case CREATION_DATE: setCreationDate((java.util.Date)value); return this;
            case EXPIRATION_DATE: setExpirationDate((java.util.Date)value); return this;
            case REFERRAL: setReferral((String)value); return this;
            case REGISTRANT: setRegistrant((com.github.minorg.whoisclient.WhoisRegistrant)value); return this;
            case TECHNICAL_CONTACT: setTechnicalContact((com.github.minorg.whoisclient.WhoisRegistrant)value); return this;
            case UPDATED_DATE: setUpdatedDate((java.util.Date)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) {
            this.administrativeContact = DefaultConstructionValidator.getInstance().validateAdministrativeContact(administrativeContact);
            return this;
        }

        public Builder setAdministrativeContact(@javax.annotation.Nullable final com.github.minorg.whoisclient.WhoisRegistrant administrativeContact) {
            return setAdministrativeContact(com.google.common.base.Optional.fromNullable(administrativeContact));
        }

        public Builder setBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) {
            this.billingContact = DefaultConstructionValidator.getInstance().validateBillingContact(billingContact);
            return this;
        }

        public Builder setBillingContact(@javax.annotation.Nullable final com.github.minorg.whoisclient.WhoisRegistrant billingContact) {
            return setBillingContact(com.google.common.base.Optional.fromNullable(billingContact));
        }

        public Builder setCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
            this.creationDate = DefaultConstructionValidator.getInstance().validateCreationDate(creationDate);
            return this;
        }

        public Builder setCreationDate(@javax.annotation.Nullable final java.util.Date creationDate) {
            return setCreationDate(com.google.common.base.Optional.fromNullable(creationDate));
        }

        public Builder setExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
            this.expirationDate = DefaultConstructionValidator.getInstance().validateExpirationDate(expirationDate);
            return this;
        }

        public Builder setExpirationDate(@javax.annotation.Nullable final java.util.Date expirationDate) {
            return setExpirationDate(com.google.common.base.Optional.fromNullable(expirationDate));
        }

        public Builder setIfPresent(final WhoisRecord other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setQueriedName(other.getQueriedName());
            setQueriedWhoisServers(other.getQueriedWhoisServers());
            setQueryTimestamp(other.getQueryTimestamp());
            if (other.getAdministrativeContact().isPresent()) {
                setAdministrativeContact(other.getAdministrativeContact());
            }
            if (other.getBillingContact().isPresent()) {
                setBillingContact(other.getBillingContact());
            }
            if (other.getCreationDate().isPresent()) {
                setCreationDate(other.getCreationDate());
            }
            if (other.getExpirationDate().isPresent()) {
                setExpirationDate(other.getExpirationDate());
            }
            if (other.getReferral().isPresent()) {
                setReferral(other.getReferral());
            }
            if (other.getRegistrant().isPresent()) {
                setRegistrant(other.getRegistrant());
            }
            if (other.getTechnicalContact().isPresent()) {
                setTechnicalContact(other.getTechnicalContact());
            }
            if (other.getUpdatedDate().isPresent()) {
                setUpdatedDate(other.getUpdatedDate());
            }

            return this;
        }

        public Builder setQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
            this.queriedName = DefaultConstructionValidator.getInstance().validateQueriedName(queriedName);
            return this;
        }

        public Builder setQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
            this.queriedWhoisServers = DefaultConstructionValidator.getInstance().validateQueriedWhoisServers(queriedWhoisServers);
            return this;
        }

        public Builder setQueryTimestamp(final java.util.Date queryTimestamp) {
            this.queryTimestamp = DefaultConstructionValidator.getInstance().validateQueryTimestamp(queryTimestamp);
            return this;
        }

        public Builder setReferral(final com.google.common.base.Optional<String> referral) {
            this.referral = DefaultConstructionValidator.getInstance().validateReferral(referral);
            return this;
        }

        public Builder setReferral(@javax.annotation.Nullable final String referral) {
            return setReferral(com.google.common.base.Optional.fromNullable(referral));
        }

        public Builder setRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) {
            this.registrant = DefaultConstructionValidator.getInstance().validateRegistrant(registrant);
            return this;
        }

        public Builder setRegistrant(@javax.annotation.Nullable final com.github.minorg.whoisclient.WhoisRegistrant registrant) {
            return setRegistrant(com.google.common.base.Optional.fromNullable(registrant));
        }

        public Builder setTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) {
            this.technicalContact = DefaultConstructionValidator.getInstance().validateTechnicalContact(technicalContact);
            return this;
        }

        public Builder setTechnicalContact(@javax.annotation.Nullable final com.github.minorg.whoisclient.WhoisRegistrant technicalContact) {
            return setTechnicalContact(com.google.common.base.Optional.fromNullable(technicalContact));
        }

        public Builder setUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
            this.updatedDate = DefaultConstructionValidator.getInstance().validateUpdatedDate(updatedDate);
            return this;
        }

        public Builder setUpdatedDate(@javax.annotation.Nullable final java.util.Date updatedDate) {
            return setUpdatedDate(com.google.common.base.Optional.fromNullable(updatedDate));
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
            case ADMINISTRATIVE_CONTACT: return unsetAdministrativeContact();
            case BILLING_CONTACT: return unsetBillingContact();
            case CREATION_DATE: return unsetCreationDate();
            case EXPIRATION_DATE: return unsetExpirationDate();
            case REFERRAL: return unsetReferral();
            case REGISTRANT: return unsetRegistrant();
            case TECHNICAL_CONTACT: return unsetTechnicalContact();
            case UPDATED_DATE: return unsetUpdatedDate();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAdministrativeContact() {
            this.administrativeContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            return this;
        }

        public Builder unsetBillingContact() {
            this.billingContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            return this;
        }

        public Builder unsetCreationDate() {
            this.creationDate = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
        }

        public Builder unsetExpirationDate() {
            this.expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
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

        public Builder unsetReferral() {
            this.referral = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetRegistrant() {
            this.registrant = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            return this;
        }

        public Builder unsetTechnicalContact() {
            this.technicalContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
            return this;
        }

        public Builder unsetUpdatedDate() {
            this.updatedDate = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
        }

        private org.thryft.native_.InternetDomainName queriedName;
        /**
         * Whois servers that were queried, in order
         */
        private com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers;
        private java.util.Date queryTimestamp;
        private com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact;
        private com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact;
        private com.google.common.base.Optional<java.util.Date> creationDate;
        private com.google.common.base.Optional<java.util.Date> expirationDate;
        private com.google.common.base.Optional<String> referral;
        private com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant;
        private com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact;
        private com.google.common.base.Optional<java.util.Date> updatedDate;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WhoisRecord> {
        @Override
        public WhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WhoisRecord.readAs(iprot, type);
        }

        @Override
        public WhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WhoisRecord.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WhoisRecord readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WhoisRecord.readAsList(iprot);
        }

        @Override
        public WhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WhoisRecord.readAsStruct(iprot);
        }

        @Override
        public WhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WhoisRecord.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        QUERIED_NAME("queriedName", new com.google.common.reflect.TypeToken<org.thryft.native_.InternetDomainName>() {}, true, 0, "queried_name", org.thryft.protocol.Type.STRING),
        QUERIED_WHOIS_SERVERS("queriedWhoisServers", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName>>() {}, true, 0, "queried_whois_servers", org.thryft.protocol.Type.LIST),
        QUERY_TIMESTAMP("queryTimestamp", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, 0, "query_timestamp", org.thryft.protocol.Type.I64),
        ADMINISTRATIVE_CONTACT("administrativeContact", new com.google.common.reflect.TypeToken<com.github.minorg.whoisclient.WhoisRegistrant>() {}, false, 0, "administrative_contact", org.thryft.protocol.Type.STRUCT),
        BILLING_CONTACT("billingContact", new com.google.common.reflect.TypeToken<com.github.minorg.whoisclient.WhoisRegistrant>() {}, false, 0, "billing_contact", org.thryft.protocol.Type.STRUCT),
        CREATION_DATE("creationDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 0, "creation_date", org.thryft.protocol.Type.I64),
        EXPIRATION_DATE("expirationDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 0, "expiration_date", org.thryft.protocol.Type.I64),
        REFERRAL("referral", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "referral", org.thryft.protocol.Type.STRING),
        REGISTRANT("registrant", new com.google.common.reflect.TypeToken<com.github.minorg.whoisclient.WhoisRegistrant>() {}, false, 0, "registrant", org.thryft.protocol.Type.STRUCT),
        TECHNICAL_CONTACT("technicalContact", new com.google.common.reflect.TypeToken<com.github.minorg.whoisclient.WhoisRegistrant>() {}, false, 0, "technical_contact", org.thryft.protocol.Type.STRUCT),
        UPDATED_DATE("updatedDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, 0, "updated_date", org.thryft.protocol.Type.I64);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public int getThriftId() {
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
            case "administrativeContact": return ADMINISTRATIVE_CONTACT;
            case "billingContact": return BILLING_CONTACT;
            case "creationDate": return CREATION_DATE;
            case "expirationDate": return EXPIRATION_DATE;
            case "referral": return REFERRAL;
            case "registrant": return REGISTRANT;
            case "technicalContact": return TECHNICAL_CONTACT;
            case "updatedDate": return UPDATED_DATE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "queried_name": return QUERIED_NAME;
            case "queried_whois_servers": return QUERIED_WHOIS_SERVERS;
            case "query_timestamp": return QUERY_TIMESTAMP;
            case "administrative_contact": return ADMINISTRATIVE_CONTACT;
            case "billing_contact": return BILLING_CONTACT;
            case "creation_date": return CREATION_DATE;
            case "expiration_date": return EXPIRATION_DATE;
            case "referral": return REFERRAL;
            case "registrant": return REGISTRANT;
            case "technical_contact": return TECHNICAL_CONTACT;
            case "updated_date": return UPDATED_DATE;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final int thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public interface Validator<ExceptionT extends Exception> {
        public org.thryft.native_.InternetDomainName validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) throws ExceptionT;

        public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) throws ExceptionT;

        public java.util.Date validateQueryTimestamp(final java.util.Date queryTimestamp) throws ExceptionT;

        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) throws ExceptionT;

        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) throws ExceptionT;

        public com.google.common.base.Optional<java.util.Date> validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) throws ExceptionT;

        public com.google.common.base.Optional<java.util.Date> validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) throws ExceptionT;

        public com.google.common.base.Optional<String> validateReferral(final com.google.common.base.Optional<String> referral) throws ExceptionT;

        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) throws ExceptionT;

        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) throws ExceptionT;

        public com.google.common.base.Optional<java.util.Date> validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public org.thryft.native_.InternetDomainName validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) throws RuntimeException {
            if (queriedName == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: queriedName is null");
            }
            return queriedName;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) throws RuntimeException {
            if (queriedWhoisServers == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: queriedWhoisServers is null");
            }
            if (queriedWhoisServers.isEmpty()) {
                throw new IllegalArgumentException("com.github.minorg.whoisclient.WhoisRecord: queriedWhoisServers is less than min length 1");
            }
            return queriedWhoisServers;
        }

        @Override
        public java.util.Date validateQueryTimestamp(final java.util.Date queryTimestamp) throws RuntimeException {
            if (queryTimestamp == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: queryTimestamp is null");
            }
            return queryTimestamp;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) throws RuntimeException {
            if (administrativeContact == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: administrativeContact is null");
            }
            if (!administrativeContact.isPresent()) {
                return administrativeContact;
            }
            return administrativeContact;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) throws RuntimeException {
            if (billingContact == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: billingContact is null");
            }
            if (!billingContact.isPresent()) {
                return billingContact;
            }
            return billingContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) throws RuntimeException {
            if (creationDate == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: creationDate is null");
            }
            if (!creationDate.isPresent()) {
                return creationDate;
            }
            return creationDate;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) throws RuntimeException {
            if (expirationDate == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: expirationDate is null");
            }
            if (!expirationDate.isPresent()) {
                return expirationDate;
            }
            return expirationDate;
        }

        @Override
        public com.google.common.base.Optional<String> validateReferral(final com.google.common.base.Optional<String> referral) throws RuntimeException {
            if (referral == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: referral is null");
            }
            if (!referral.isPresent()) {
                return referral;
            }
            if (referral.get().isEmpty()) {
                throw new IllegalArgumentException("com.github.minorg.whoisclient.WhoisRecord: referral is less than min length 1");
            }
            {
                final int __strLen = referral.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(referral.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("com.github.minorg.whoisclient.WhoisRecord: referral is blank: '%s' (length=%d)", referral.get(), __strLen));
                }
            }
            return referral;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) throws RuntimeException {
            if (registrant == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: registrant is null");
            }
            if (!registrant.isPresent()) {
                return registrant;
            }
            return registrant;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) throws RuntimeException {
            if (technicalContact == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: technicalContact is null");
            }
            if (!technicalContact.isPresent()) {
                return technicalContact;
            }
            return technicalContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) throws RuntimeException {
            if (updatedDate == null) {
                throw new NullPointerException("com.github.minorg.whoisclient.WhoisRecord: updatedDate is null");
            }
            if (!updatedDate.isPresent()) {
                return updatedDate;
            }
            return updatedDate;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public org.thryft.native_.InternetDomainName validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
            return queriedName;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
            return queriedWhoisServers;
        }

        @Override
        public java.util.Date validateQueryTimestamp(final java.util.Date queryTimestamp) {
            return queryTimestamp;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) {
            return administrativeContact;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) {
            return billingContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
            return creationDate;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
            return expirationDate;
        }

        @Override
        public com.google.common.base.Optional<String> validateReferral(final com.google.common.base.Optional<String> referral) {
            return referral;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) {
            return registrant;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) {
            return technicalContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
            return updatedDate;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public org.thryft.native_.InternetDomainName validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) throws org.thryft.protocol.InputProtocolException {
            if (queriedName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERIED_NAME, "com.github.minorg.whoisclient.WhoisRecord: queriedName is null");
            }
            return queriedName;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) throws org.thryft.protocol.InputProtocolException {
            if (queriedWhoisServers == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, "com.github.minorg.whoisclient.WhoisRecord: queriedWhoisServers is null");
            }
            if (queriedWhoisServers.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERIED_WHOIS_SERVERS, "com.github.minorg.whoisclient.WhoisRecord: queriedWhoisServers is less than min length 1");
            }
            return queriedWhoisServers;
        }

        @Override
        public java.util.Date validateQueryTimestamp(final java.util.Date queryTimestamp) throws org.thryft.protocol.InputProtocolException {
            if (queryTimestamp == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERY_TIMESTAMP, "com.github.minorg.whoisclient.WhoisRecord: queryTimestamp is null");
            }
            return queryTimestamp;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) throws org.thryft.protocol.InputProtocolException {
            if (administrativeContact == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ADMINISTRATIVE_CONTACT, "com.github.minorg.whoisclient.WhoisRecord: administrativeContact is null");
            }
            if (!administrativeContact.isPresent()) {
                return administrativeContact;
            }
            return administrativeContact;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) throws org.thryft.protocol.InputProtocolException {
            if (billingContact == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.BILLING_CONTACT, "com.github.minorg.whoisclient.WhoisRecord: billingContact is null");
            }
            if (!billingContact.isPresent()) {
                return billingContact;
            }
            return billingContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) throws org.thryft.protocol.InputProtocolException {
            if (creationDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CREATION_DATE, "com.github.minorg.whoisclient.WhoisRecord: creationDate is null");
            }
            if (!creationDate.isPresent()) {
                return creationDate;
            }
            return creationDate;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) throws org.thryft.protocol.InputProtocolException {
            if (expirationDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXPIRATION_DATE, "com.github.minorg.whoisclient.WhoisRecord: expirationDate is null");
            }
            if (!expirationDate.isPresent()) {
                return expirationDate;
            }
            return expirationDate;
        }

        @Override
        public com.google.common.base.Optional<String> validateReferral(final com.google.common.base.Optional<String> referral) throws org.thryft.protocol.InputProtocolException {
            if (referral == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REFERRAL, "com.github.minorg.whoisclient.WhoisRecord: referral is null");
            }
            if (!referral.isPresent()) {
                return referral;
            }
            if (referral.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFERRAL, "com.github.minorg.whoisclient.WhoisRecord: referral is less than min length 1");
            }
            {
                final int __strLen = referral.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(referral.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFERRAL, String.format("com.github.minorg.whoisclient.WhoisRecord: referral is blank: '%s' (length=%d)", referral.get(), __strLen));
                }
            }
            return referral;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) throws org.thryft.protocol.InputProtocolException {
            if (registrant == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REGISTRANT, "com.github.minorg.whoisclient.WhoisRecord: registrant is null");
            }
            if (!registrant.isPresent()) {
                return registrant;
            }
            return registrant;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) throws org.thryft.protocol.InputProtocolException {
            if (technicalContact == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNICAL_CONTACT, "com.github.minorg.whoisclient.WhoisRecord: technicalContact is null");
            }
            if (!technicalContact.isPresent()) {
                return technicalContact;
            }
            return technicalContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) throws org.thryft.protocol.InputProtocolException {
            if (updatedDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.UPDATED_DATE, "com.github.minorg.whoisclient.WhoisRecord: updatedDate is null");
            }
            if (!updatedDate.isPresent()) {
                return updatedDate;
            }
            return updatedDate;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public org.thryft.native_.InternetDomainName validateQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
            return queriedName;
        }

        @Override
        public com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> validateQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
            return queriedWhoisServers;
        }

        @Override
        public java.util.Date validateQueryTimestamp(final java.util.Date queryTimestamp) {
            return queryTimestamp;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) {
            return administrativeContact;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) {
            return billingContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
            return creationDate;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
            return expirationDate;
        }

        @Override
        public com.google.common.base.Optional<String> validateReferral(final com.google.common.base.Optional<String> referral) {
            return referral;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) {
            return registrant;
        }

        @Override
        public com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> validateTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) {
            return technicalContact;
        }

        @Override
        public com.google.common.base.Optional<java.util.Date> validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
            return updatedDate;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public WhoisRecord(final WhoisRecord other) {
        this(other.getQueriedName(), other.getQueriedWhoisServers(), other.getQueryTimestamp(), other.getAdministrativeContact(), other.getBillingContact(), other.getCreationDate(), other.getExpirationDate(), other.getReferral(), other.getRegistrant(), other.getTechnicalContact(), other.getUpdatedDate(), NopConstructionValidator.getInstance());
    }

    protected WhoisRecord(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate, ConstructionValidator validator) {
        this.queriedName = validator.validateQueriedName(queriedName);
        this.queriedWhoisServers = validator.validateQueriedWhoisServers(queriedWhoisServers);
        this.queryTimestamp = validator.validateQueryTimestamp(queryTimestamp);
        this.administrativeContact = validator.validateAdministrativeContact(administrativeContact);
        this.billingContact = validator.validateBillingContact(billingContact);
        this.creationDate = validator.validateCreationDate(creationDate);
        this.expirationDate = validator.validateExpirationDate(expirationDate);
        this.referral = validator.validateReferral(referral);
        this.registrant = validator.validateRegistrant(registrant);
        this.technicalContact = validator.validateTechnicalContact(technicalContact);
        this.updatedDate = validator.validateUpdatedDate(updatedDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WhoisRecord other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WhoisRecord> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static WhoisRecord create(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp) {
        return new WhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent(), com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent(), com.google.common.base.Optional.<java.util.Date> absent(), com.google.common.base.Optional.<java.util.Date> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent(), com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent(), com.google.common.base.Optional.<java.util.Date> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static WhoisRecord create(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final @javax.annotation.Nullable com.github.minorg.whoisclient.WhoisRegistrant administrativeContact, final @javax.annotation.Nullable com.github.minorg.whoisclient.WhoisRegistrant billingContact, final @javax.annotation.Nullable java.util.Date creationDate, final @javax.annotation.Nullable java.util.Date expirationDate, final @javax.annotation.Nullable String referral, final @javax.annotation.Nullable com.github.minorg.whoisclient.WhoisRegistrant registrant, final @javax.annotation.Nullable com.github.minorg.whoisclient.WhoisRegistrant technicalContact, final @javax.annotation.Nullable java.util.Date updatedDate) {
        return new WhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, com.google.common.base.Optional.fromNullable(administrativeContact), com.google.common.base.Optional.fromNullable(billingContact), com.google.common.base.Optional.fromNullable(creationDate), com.google.common.base.Optional.fromNullable(expirationDate), com.google.common.base.Optional.fromNullable(referral), com.google.common.base.Optional.fromNullable(registrant), com.google.common.base.Optional.fromNullable(technicalContact), com.google.common.base.Optional.fromNullable(updatedDate), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static WhoisRecord create(final org.thryft.native_.InternetDomainName queriedName, final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers, final java.util.Date queryTimestamp, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant, final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) {
        return new WhoisRecord(queriedName, queriedWhoisServers, queryTimestamp, administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WhoisRecord)) {
            return false;
        }

        final WhoisRecord other = (WhoisRecord)otherObject;

        if (!(getQueriedName().equals(other.getQueriedName()))) {
            return false;
        }

        if (!(getQueriedWhoisServers().equals(other.getQueriedWhoisServers()))) {
            return false;
        }

        if (!(getQueryTimestamp().equals(other.getQueryTimestamp()))) {
            return false;
        }

        if (!(((getAdministrativeContact().isPresent() && other.getAdministrativeContact().isPresent()) ? (getAdministrativeContact().get().equals(other.getAdministrativeContact().get())) : (!getAdministrativeContact().isPresent() && !other.getAdministrativeContact().isPresent())))) {
            return false;
        }

        if (!(((getBillingContact().isPresent() && other.getBillingContact().isPresent()) ? (getBillingContact().get().equals(other.getBillingContact().get())) : (!getBillingContact().isPresent() && !other.getBillingContact().isPresent())))) {
            return false;
        }

        if (!(((getCreationDate().isPresent() && other.getCreationDate().isPresent()) ? (getCreationDate().get().equals(other.getCreationDate().get())) : (!getCreationDate().isPresent() && !other.getCreationDate().isPresent())))) {
            return false;
        }

        if (!(((getExpirationDate().isPresent() && other.getExpirationDate().isPresent()) ? (getExpirationDate().get().equals(other.getExpirationDate().get())) : (!getExpirationDate().isPresent() && !other.getExpirationDate().isPresent())))) {
            return false;
        }

        if (!(((getReferral().isPresent() && other.getReferral().isPresent()) ? (getReferral().get().equals(other.getReferral().get())) : (!getReferral().isPresent() && !other.getReferral().isPresent())))) {
            return false;
        }

        if (!(((getRegistrant().isPresent() && other.getRegistrant().isPresent()) ? (getRegistrant().get().equals(other.getRegistrant().get())) : (!getRegistrant().isPresent() && !other.getRegistrant().isPresent())))) {
            return false;
        }

        if (!(((getTechnicalContact().isPresent() && other.getTechnicalContact().isPresent()) ? (getTechnicalContact().get().equals(other.getTechnicalContact().get())) : (!getTechnicalContact().isPresent() && !other.getTechnicalContact().isPresent())))) {
            return false;
        }

        if (!(((getUpdatedDate().isPresent() && other.getUpdatedDate().isPresent()) ? (getUpdatedDate().get().equals(other.getUpdatedDate().get())) : (!getUpdatedDate().isPresent() && !other.getUpdatedDate().isPresent())))) {
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
        case ADMINISTRATIVE_CONTACT: return getAdministrativeContact();
        case BILLING_CONTACT: return getBillingContact();
        case CREATION_DATE: return getCreationDate();
        case EXPIRATION_DATE: return getExpirationDate();
        case REFERRAL: return getReferral();
        case REGISTRANT: return getRegistrant();
        case TECHNICAL_CONTACT: return getTechnicalContact();
        case UPDATED_DATE: return getUpdatedDate();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getAdministrativeContact() {
        return administrativeContact;
    }

    public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getBillingContact() {
        return billingContact;
    }

    public final com.google.common.base.Optional<java.util.Date> getCreationDate() {
        return creationDate;
    }

    public final com.google.common.base.Optional<java.util.Date> getExpirationDate() {
        return expirationDate;
    }

    public final org.thryft.native_.InternetDomainName getQueriedName() {
        return queriedName;
    }

    /**
     * Whois servers that were queried, in order
     */
    public final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> getQueriedWhoisServers() {
        return queriedWhoisServers;
    }

    public final java.util.Date getQueryTimestamp() {
        return queryTimestamp;
    }

    public final com.google.common.base.Optional<String> getReferral() {
        return referral;
    }

    public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getRegistrant() {
        return registrant;
    }

    public final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> getTechnicalContact() {
        return technicalContact;
    }

    public final com.google.common.base.Optional<java.util.Date> getUpdatedDate() {
        return updatedDate;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getQueriedName().hashCode();
        hashCode = 31 * hashCode + getQueriedWhoisServers().hashCode();
        hashCode = 31 * hashCode + getQueryTimestamp().hashCode();
        if (getAdministrativeContact().isPresent()) {
            hashCode = 31 * hashCode + getAdministrativeContact().get().hashCode();
        }
        if (getBillingContact().isPresent()) {
            hashCode = 31 * hashCode + getBillingContact().get().hashCode();
        }
        if (getCreationDate().isPresent()) {
            hashCode = 31 * hashCode + getCreationDate().get().hashCode();
        }
        if (getExpirationDate().isPresent()) {
            hashCode = 31 * hashCode + getExpirationDate().get().hashCode();
        }
        if (getReferral().isPresent()) {
            hashCode = 31 * hashCode + getReferral().get().hashCode();
        }
        if (getRegistrant().isPresent()) {
            hashCode = 31 * hashCode + getRegistrant().get().hashCode();
        }
        if (getTechnicalContact().isPresent()) {
            hashCode = 31 * hashCode + getTechnicalContact().get().hashCode();
        }
        if (getUpdatedDate().isPresent()) {
            hashCode = 31 * hashCode + getUpdatedDate().get().hashCode();
        }
        return hashCode;
    }

    public static WhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WhoisRecord readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.InternetDomainName queriedName = null;
        com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers = null;
        java.util.Date queryTimestamp = null;
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> creationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<java.util.Date> expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<String> referral = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> updatedDate = com.google.common.base.Optional.<java.util.Date> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
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
            if (__list.getSize() > 3) {
                administrativeContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 4) {
                billingContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 5) {
                try {
                    creationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 6) {
                try {
                    expirationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 7) {
                referral = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 8) {
                registrant = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 9) {
                technicalContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 10) {
                try {
                    updatedDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new WhoisRecord(DefaultReadValidator.getInstance().validateQueriedName(queriedName), DefaultReadValidator.getInstance().validateQueriedWhoisServers(queriedWhoisServers), DefaultReadValidator.getInstance().validateQueryTimestamp(queryTimestamp), DefaultReadValidator.getInstance().validateAdministrativeContact(administrativeContact), DefaultReadValidator.getInstance().validateBillingContact(billingContact), DefaultReadValidator.getInstance().validateCreationDate(creationDate), DefaultReadValidator.getInstance().validateExpirationDate(expirationDate), DefaultReadValidator.getInstance().validateReferral(referral), DefaultReadValidator.getInstance().validateRegistrant(registrant), DefaultReadValidator.getInstance().validateTechnicalContact(technicalContact), DefaultReadValidator.getInstance().validateUpdatedDate(updatedDate), NopConstructionValidator.getInstance());
    }

    public static WhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.InternetDomainName queriedName = null;
        com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers = null;
        java.util.Date queryTimestamp = null;
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> creationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<java.util.Date> expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<String> referral = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact = com.google.common.base.Optional.<com.github.minorg.whoisclient.WhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> updatedDate = com.google.common.base.Optional.<java.util.Date> absent();

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
                case "administrative_contact": {
                    administrativeContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                    break;
                }
                case "billing_contact": {
                    billingContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                    break;
                }
                case "creation_date": {
                    try {
                        creationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                    break;
                }
                case "expiration_date": {
                    try {
                        expirationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                    break;
                }
                case "referral": {
                    referral = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "registrant": {
                    registrant = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                    break;
                }
                case "technical_contact": {
                    technicalContact = com.google.common.base.Optional.of(com.github.minorg.whoisclient.WhoisRegistrant.readAsStruct(iprot));
                    break;
                }
                case "updated_date": {
                    try {
                        updatedDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
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
        return new WhoisRecord(DefaultReadValidator.getInstance().validateQueriedName(queriedName), DefaultReadValidator.getInstance().validateQueriedWhoisServers(queriedWhoisServers), DefaultReadValidator.getInstance().validateQueryTimestamp(queryTimestamp), DefaultReadValidator.getInstance().validateAdministrativeContact(administrativeContact), DefaultReadValidator.getInstance().validateBillingContact(billingContact), DefaultReadValidator.getInstance().validateCreationDate(creationDate), DefaultReadValidator.getInstance().validateExpirationDate(expirationDate), DefaultReadValidator.getInstance().validateReferral(referral), DefaultReadValidator.getInstance().validateRegistrant(registrant), DefaultReadValidator.getInstance().validateTechnicalContact(technicalContact), DefaultReadValidator.getInstance().validateUpdatedDate(updatedDate), NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceAdministrativeContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, DefaultConstructionValidator.getInstance().validateAdministrativeContact(administrativeContact), this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceAdministrativeContact(final com.github.minorg.whoisclient.WhoisRegistrant administrativeContact) {
        return replaceAdministrativeContact(com.google.common.base.Optional.fromNullable(administrativeContact));
    }

    public WhoisRecord replaceBillingContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, DefaultConstructionValidator.getInstance().validateBillingContact(billingContact), this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceBillingContact(final com.github.minorg.whoisclient.WhoisRegistrant billingContact) {
        return replaceBillingContact(com.google.common.base.Optional.fromNullable(billingContact));
    }

    public WhoisRecord replaceCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, DefaultConstructionValidator.getInstance().validateCreationDate(creationDate), this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceCreationDate(final java.util.Date creationDate) {
        return replaceCreationDate(com.google.common.base.Optional.fromNullable(creationDate));
    }

    public WhoisRecord replaceExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, DefaultConstructionValidator.getInstance().validateExpirationDate(expirationDate), this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceExpirationDate(final java.util.Date expirationDate) {
        return replaceExpirationDate(com.google.common.base.Optional.fromNullable(expirationDate));
    }

    public WhoisRecord replaceQueriedName(final org.thryft.native_.InternetDomainName queriedName) {
        return new WhoisRecord(DefaultConstructionValidator.getInstance().validateQueriedName(queriedName), this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceQueriedWhoisServers(final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers) {
        return new WhoisRecord(this.queriedName, DefaultConstructionValidator.getInstance().validateQueriedWhoisServers(queriedWhoisServers), this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceQueryTimestamp(final java.util.Date queryTimestamp) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, DefaultConstructionValidator.getInstance().validateQueryTimestamp(queryTimestamp), this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceReferral(final com.google.common.base.Optional<String> referral) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, DefaultConstructionValidator.getInstance().validateReferral(referral), this.registrant, this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceReferral(final String referral) {
        return replaceReferral(com.google.common.base.Optional.fromNullable(referral));
    }

    public WhoisRecord replaceRegistrant(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, DefaultConstructionValidator.getInstance().validateRegistrant(registrant), this.technicalContact, this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceRegistrant(final com.github.minorg.whoisclient.WhoisRegistrant registrant) {
        return replaceRegistrant(com.google.common.base.Optional.fromNullable(registrant));
    }

    public WhoisRecord replaceTechnicalContact(final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, DefaultConstructionValidator.getInstance().validateTechnicalContact(technicalContact), this.updatedDate, NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceTechnicalContact(final com.github.minorg.whoisclient.WhoisRegistrant technicalContact) {
        return replaceTechnicalContact(com.google.common.base.Optional.fromNullable(technicalContact));
    }

    public WhoisRecord replaceUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
        return new WhoisRecord(this.queriedName, this.queriedWhoisServers, this.queryTimestamp, this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, DefaultConstructionValidator.getInstance().validateUpdatedDate(updatedDate), NopConstructionValidator.getInstance());
    }

    public WhoisRecord replaceUpdatedDate(final java.util.Date updatedDate) {
        return replaceUpdatedDate(com.google.common.base.Optional.fromNullable(updatedDate));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("queried_name", getQueriedName()).add("queried_whois_servers", getQueriedWhoisServers()).add("query_timestamp", getQueryTimestamp()).add("administrative_contact", getAdministrativeContact().orNull()).add("billing_contact", getBillingContact().orNull()).add("creation_date", getCreationDate().orNull()).add("expiration_date", getExpirationDate().orNull()).add("referral", getReferral().orNull()).add("registrant", getRegistrant().orNull()).add("technical_contact", getTechnicalContact().orNull()).add("updated_date", getUpdatedDate().orNull()).toString();
    }

    public void writeAdministrativeContactField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAdministrativeContact().isPresent()) {
            oprot.writeFieldBegin("administrative_contact", org.thryft.protocol.Type.STRUCT, (short)0);
            getAdministrativeContact().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 11);

        oprot.writeString(getQueriedName().toString());

        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQueriedWhoisServers().size());
        for (final org.thryft.native_.InternetDomainName _iter0 : getQueriedWhoisServers()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();

        oprot.writeDateTime(getQueryTimestamp());

        if (getAdministrativeContact().isPresent()) {
            getAdministrativeContact().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getBillingContact().isPresent()) {
            getBillingContact().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getCreationDate().isPresent()) {
            oprot.writeDateTime(getCreationDate().get());
        } else {
            oprot.writeNull();
        }

        if (getExpirationDate().isPresent()) {
            oprot.writeDateTime(getExpirationDate().get());
        } else {
            oprot.writeNull();
        }

        if (getReferral().isPresent()) {
            oprot.writeString(getReferral().get());
        } else {
            oprot.writeNull();
        }

        if (getRegistrant().isPresent()) {
            getRegistrant().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getTechnicalContact().isPresent()) {
            getTechnicalContact().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getUpdatedDate().isPresent()) {
            oprot.writeDateTime(getUpdatedDate().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("com.github.minorg.whoisclient.WhoisRecord");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeBillingContactField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getBillingContact().isPresent()) {
            oprot.writeFieldBegin("billing_contact", org.thryft.protocol.Type.STRUCT, (short)0);
            getBillingContact().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeCreationDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCreationDate().isPresent()) {
            oprot.writeFieldBegin("creation_date", org.thryft.protocol.Type.I64, (short)0);
            oprot.writeDateTime(getCreationDate().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeExpirationDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExpirationDate().isPresent()) {
            oprot.writeFieldBegin("expiration_date", org.thryft.protocol.Type.I64, (short)0);
            oprot.writeDateTime(getExpirationDate().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeQueriedNameField(oprot);

        writeQueriedWhoisServersField(oprot);

        writeQueryTimestampField(oprot);

        writeAdministrativeContactField(oprot);

        writeBillingContactField(oprot);

        writeCreationDateField(oprot);

        writeExpirationDateField(oprot);

        writeReferralField(oprot);

        writeRegistrantField(oprot);

        writeTechnicalContactField(oprot);

        writeUpdatedDateField(oprot);

        oprot.writeFieldStop();
    }

    public void writeQueriedNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("queried_name", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getQueriedName().toString());
        oprot.writeFieldEnd();
    }

    public void writeQueriedWhoisServersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("queried_whois_servers", org.thryft.protocol.Type.LIST, (short)0);
        oprot.writeListBegin(org.thryft.protocol.Type.STRING, getQueriedWhoisServers().size());
        for (final org.thryft.native_.InternetDomainName _iter0 : getQueriedWhoisServers()) {
            oprot.writeString(_iter0.toString());
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
    }

    public void writeQueryTimestampField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("query_timestamp", org.thryft.protocol.Type.I64, (short)0);
        oprot.writeDateTime(getQueryTimestamp());
        oprot.writeFieldEnd();
    }

    public void writeReferralField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getReferral().isPresent()) {
            oprot.writeFieldBegin("referral", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getReferral().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeRegistrantField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRegistrant().isPresent()) {
            oprot.writeFieldBegin("registrant", org.thryft.protocol.Type.STRUCT, (short)0);
            getRegistrant().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeTechnicalContactField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTechnicalContact().isPresent()) {
            oprot.writeFieldBegin("technical_contact", org.thryft.protocol.Type.STRUCT, (short)0);
            getTechnicalContact().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeUpdatedDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getUpdatedDate().isPresent()) {
            oprot.writeFieldBegin("updated_date", org.thryft.protocol.Type.I64, (short)0);
            oprot.writeDateTime(getUpdatedDate().get());
            oprot.writeFieldEnd();
        }
    }

    private final org.thryft.native_.InternetDomainName queriedName;

    /**
     * Whois servers that were queried, in order
     */
    private final com.google.common.collect.ImmutableList<org.thryft.native_.InternetDomainName> queriedWhoisServers;

    private final java.util.Date queryTimestamp;

    private final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> administrativeContact;

    private final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> billingContact;

    private final com.google.common.base.Optional<java.util.Date> creationDate;

    private final com.google.common.base.Optional<java.util.Date> expirationDate;

    private final com.google.common.base.Optional<String> referral;

    private final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> registrant;

    private final com.google.common.base.Optional<com.github.minorg.whoisclient.WhoisRegistrant> technicalContact;

    private final com.google.common.base.Optional<java.util.Date> updatedDate;
}

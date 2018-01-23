package io.github.minorg.whoisclient;

public final class ParsedWhoisRecord implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            administrativeContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            billingContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            creationDate = com.google.common.base.Optional.<java.util.Date> absent();
            expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
            referral = com.google.common.base.Optional.<String> absent();
            registrant = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            technicalContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            updatedDate = com.google.common.base.Optional.<java.util.Date> absent();
        }

        public Builder(final ParsedWhoisRecord other) {
            this.administrativeContact = other.getAdministrativeContact();
            this.billingContact = other.getBillingContact();
            this.creationDate = other.getCreationDate();
            this.expirationDate = other.getExpirationDate();
            this.referral = other.getReferral();
            this.registrant = other.getRegistrant();
            this.technicalContact = other.getTechnicalContact();
            this.updatedDate = other.getUpdatedDate();
        }

        protected ParsedWhoisRecord _build(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) {
            return new ParsedWhoisRecord(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
        }

        public ParsedWhoisRecord build() {
            UncheckedValidator.validate(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);

            return _build(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
        }

        public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getAdministrativeContact() {
            return administrativeContact;
        }

        public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getBillingContact() {
            return billingContact;
        }

        public final com.google.common.base.Optional<java.util.Date> getCreationDate() {
            return creationDate;
        }

        public final com.google.common.base.Optional<java.util.Date> getExpirationDate() {
            return expirationDate;
        }

        public final com.google.common.base.Optional<String> getReferral() {
            return referral;
        }

        public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getRegistrant() {
            return registrant;
        }

        public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getTechnicalContact() {
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
                if (__list.getSize() > 0) {
                    administrativeContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 1) {
                    billingContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    try {
                        creationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        expirationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (final IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 4) {
                    referral = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 5) {
                    registrant = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 6) {
                    technicalContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
                }
                if (__list.getSize() > 7) {
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
                    case "administrative_contact": {
                        administrativeContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
                        break;
                    }
                    case "billing_contact": {
                        billingContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
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
                        registrant = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
                        break;
                    }
                    case "technical_contact": {
                        technicalContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case ADMINISTRATIVE_CONTACT: setAdministrativeContact((io.github.minorg.whoisclient.ParsedWhoisRegistrant)value); return this;
            case BILLING_CONTACT: setBillingContact((io.github.minorg.whoisclient.ParsedWhoisRegistrant)value); return this;
            case CREATION_DATE: setCreationDate((java.util.Date)value); return this;
            case EXPIRATION_DATE: setExpirationDate((java.util.Date)value); return this;
            case REFERRAL: setReferral((String)value); return this;
            case REGISTRANT: setRegistrant((io.github.minorg.whoisclient.ParsedWhoisRegistrant)value); return this;
            case TECHNICAL_CONTACT: setTechnicalContact((io.github.minorg.whoisclient.ParsedWhoisRegistrant)value); return this;
            case UPDATED_DATE: setUpdatedDate((java.util.Date)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAdministrativeContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact) {
            UncheckedValidator.validateAdministrativeContact(administrativeContact);
            this.administrativeContact = administrativeContact;
            return this;
        }

        public Builder setAdministrativeContact(@javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant administrativeContact) {
            return setAdministrativeContact(com.google.common.base.Optional.fromNullable(administrativeContact));
        }

        public Builder setBillingContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact) {
            UncheckedValidator.validateBillingContact(billingContact);
            this.billingContact = billingContact;
            return this;
        }

        public Builder setBillingContact(@javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant billingContact) {
            return setBillingContact(com.google.common.base.Optional.fromNullable(billingContact));
        }

        public Builder setCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
            UncheckedValidator.validateCreationDate(creationDate);
            this.creationDate = creationDate;
            return this;
        }

        public Builder setCreationDate(@javax.annotation.Nullable final java.util.Date creationDate) {
            return setCreationDate(com.google.common.base.Optional.fromNullable(creationDate));
        }

        public Builder setExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
            UncheckedValidator.validateExpirationDate(expirationDate);
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpirationDate(@javax.annotation.Nullable final java.util.Date expirationDate) {
            return setExpirationDate(com.google.common.base.Optional.fromNullable(expirationDate));
        }

        public Builder setIfPresent(final ParsedWhoisRecord other) {
            com.google.common.base.Preconditions.checkNotNull(other);

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

        public Builder setReferral(final com.google.common.base.Optional<String> referral) {
            UncheckedValidator.validateReferral(referral);
            this.referral = referral;
            return this;
        }

        public Builder setReferral(@javax.annotation.Nullable final String referral) {
            return setReferral(com.google.common.base.Optional.fromNullable(referral));
        }

        public Builder setRegistrant(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant) {
            UncheckedValidator.validateRegistrant(registrant);
            this.registrant = registrant;
            return this;
        }

        public Builder setRegistrant(@javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant registrant) {
            return setRegistrant(com.google.common.base.Optional.fromNullable(registrant));
        }

        public Builder setTechnicalContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact) {
            UncheckedValidator.validateTechnicalContact(technicalContact);
            this.technicalContact = technicalContact;
            return this;
        }

        public Builder setTechnicalContact(@javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant technicalContact) {
            return setTechnicalContact(com.google.common.base.Optional.fromNullable(technicalContact));
        }

        public Builder setUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
            UncheckedValidator.validateUpdatedDate(updatedDate);
            this.updatedDate = updatedDate;
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
            this.administrativeContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            return this;
        }

        public Builder unsetBillingContact() {
            this.billingContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
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

        public Builder unsetReferral() {
            this.referral = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetRegistrant() {
            this.registrant = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            return this;
        }

        public Builder unsetTechnicalContact() {
            this.technicalContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
            return this;
        }

        public Builder unsetUpdatedDate() {
            this.updatedDate = com.google.common.base.Optional.<java.util.Date> absent();
            return this;
        }

        private com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact;
        private com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact;
        private com.google.common.base.Optional<java.util.Date> creationDate;
        private com.google.common.base.Optional<java.util.Date> expirationDate;
        private com.google.common.base.Optional<String> referral;
        private com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant;
        private com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact;
        private com.google.common.base.Optional<java.util.Date> updatedDate;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ParsedWhoisRecord> {
        @Override
        public ParsedWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRecord.readAs(iprot, type);
        }

        @Override
        public ParsedWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRecord.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ParsedWhoisRecord readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRecord.readAsList(iprot);
        }

        @Override
        public ParsedWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRecord.readAsStruct(iprot);
        }

        @Override
        public ParsedWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRecord.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ADMINISTRATIVE_CONTACT("administrativeContact", new com.google.common.reflect.TypeToken<io.github.minorg.whoisclient.ParsedWhoisRegistrant>() {}, false, (short)0, "administrative_contact", org.thryft.protocol.Type.STRUCT),
        BILLING_CONTACT("billingContact", new com.google.common.reflect.TypeToken<io.github.minorg.whoisclient.ParsedWhoisRegistrant>() {}, false, (short)0, "billing_contact", org.thryft.protocol.Type.STRUCT),
        CREATION_DATE("creationDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, (short)0, "creation_date", org.thryft.protocol.Type.I64),
        EXPIRATION_DATE("expirationDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, (short)0, "expiration_date", org.thryft.protocol.Type.I64),
        REFERRAL("referral", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "referral", org.thryft.protocol.Type.STRING),
        REGISTRANT("registrant", new com.google.common.reflect.TypeToken<io.github.minorg.whoisclient.ParsedWhoisRegistrant>() {}, false, (short)0, "registrant", org.thryft.protocol.Type.STRUCT),
        TECHNICAL_CONTACT("technicalContact", new com.google.common.reflect.TypeToken<io.github.minorg.whoisclient.ParsedWhoisRegistrant>() {}, false, (short)0, "technical_contact", org.thryft.protocol.Type.STRUCT),
        UPDATED_DATE("updatedDate", new com.google.common.reflect.TypeToken<java.util.Date>() {}, false, (short)0, "updated_date", org.thryft.protocol.Type.I64);

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
        public static void validate(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) throws org.thryft.protocol.InputProtocolException {
            validateAdministrativeContact(administrativeContact);
            validateBillingContact(billingContact);
            validateCreationDate(creationDate);
            validateExpirationDate(expirationDate);
            validateReferral(referral);
            validateRegistrant(registrant);
            validateTechnicalContact(technicalContact);
            validateUpdatedDate(updatedDate);
        }

        public static void validateAdministrativeContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact) throws org.thryft.protocol.InputProtocolException {
            if (administrativeContact == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ADMINISTRATIVE_CONTACT, "io.github.minorg.whoisclient.ParsedWhoisRecord: administrativeContact is null");
            }
            if (!administrativeContact.isPresent()) {
                return;
            }
        }

        public static void validateBillingContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact) throws org.thryft.protocol.InputProtocolException {
            if (billingContact == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.BILLING_CONTACT, "io.github.minorg.whoisclient.ParsedWhoisRecord: billingContact is null");
            }
            if (!billingContact.isPresent()) {
                return;
            }
        }

        public static void validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) throws org.thryft.protocol.InputProtocolException {
            if (creationDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CREATION_DATE, "io.github.minorg.whoisclient.ParsedWhoisRecord: creationDate is null");
            }
            if (!creationDate.isPresent()) {
                return;
            }
        }

        public static void validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) throws org.thryft.protocol.InputProtocolException {
            if (expirationDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXPIRATION_DATE, "io.github.minorg.whoisclient.ParsedWhoisRecord: expirationDate is null");
            }
            if (!expirationDate.isPresent()) {
                return;
            }
        }

        public static void validateReferral(final com.google.common.base.Optional<String> referral) throws org.thryft.protocol.InputProtocolException {
            if (referral == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REFERRAL, "io.github.minorg.whoisclient.ParsedWhoisRecord: referral is null");
            }
            if (!referral.isPresent()) {
                return;
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFERRAL, String.format("io.github.minorg.whoisclient.ParsedWhoisRecord.referral: blank '%s' (length=%d)", referral.get(), __strLen));
                }
            }
            if (referral.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.REFERRAL, "io.github.minorg.whoisclient.ParsedWhoisRecord.referral: less than min length 1");
            }
        }

        public static void validateRegistrant(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant) throws org.thryft.protocol.InputProtocolException {
            if (registrant == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.REGISTRANT, "io.github.minorg.whoisclient.ParsedWhoisRecord: registrant is null");
            }
            if (!registrant.isPresent()) {
                return;
            }
        }

        public static void validateTechnicalContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact) throws org.thryft.protocol.InputProtocolException {
            if (technicalContact == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNICAL_CONTACT, "io.github.minorg.whoisclient.ParsedWhoisRecord: technicalContact is null");
            }
            if (!technicalContact.isPresent()) {
                return;
            }
        }

        public static void validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) throws org.thryft.protocol.InputProtocolException {
            if (updatedDate == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.UPDATED_DATE, "io.github.minorg.whoisclient.ParsedWhoisRecord: updatedDate is null");
            }
            if (!updatedDate.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) {
            validateAdministrativeContact(administrativeContact);
            validateBillingContact(billingContact);
            validateCreationDate(creationDate);
            validateExpirationDate(expirationDate);
            validateReferral(referral);
            validateRegistrant(registrant);
            validateTechnicalContact(technicalContact);
            validateUpdatedDate(updatedDate);
        }

        public static void validateAdministrativeContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact) {
            if (administrativeContact == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: administrativeContact is null");
            }
            if (!administrativeContact.isPresent()) {
                return;
            }
        }

        public static void validateBillingContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact) {
            if (billingContact == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: billingContact is null");
            }
            if (!billingContact.isPresent()) {
                return;
            }
        }

        public static void validateCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
            if (creationDate == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: creationDate is null");
            }
            if (!creationDate.isPresent()) {
                return;
            }
        }

        public static void validateExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
            if (expirationDate == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: expirationDate is null");
            }
            if (!expirationDate.isPresent()) {
                return;
            }
        }

        public static void validateReferral(final com.google.common.base.Optional<String> referral) {
            if (referral == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: referral is null");
            }
            if (!referral.isPresent()) {
                return;
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
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRecord.referral: blank '%s' (length=%d)", referral.get(), __strLen));
                }
            }
            if (referral.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRecord.referral: less than min length 1");
            }
        }

        public static void validateRegistrant(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant) {
            if (registrant == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: registrant is null");
            }
            if (!registrant.isPresent()) {
                return;
            }
        }

        public static void validateTechnicalContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact) {
            if (technicalContact == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: technicalContact is null");
            }
            if (!technicalContact.isPresent()) {
                return;
            }
        }

        public static void validateUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
            if (updatedDate == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRecord: updatedDate is null");
            }
            if (!updatedDate.isPresent()) {
                return;
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public ParsedWhoisRecord() {
        administrativeContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        billingContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        creationDate = com.google.common.base.Optional.<java.util.Date> absent();
        expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
        referral = com.google.common.base.Optional.<String> absent();
        registrant = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        technicalContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        updatedDate = com.google.common.base.Optional.<java.util.Date> absent();
    }

    /**
     * Copy constructor
     */
    public ParsedWhoisRecord(final ParsedWhoisRecord other) {
        this(other.getAdministrativeContact(), other.getBillingContact(), other.getCreationDate(), other.getExpirationDate(), other.getReferral(), other.getRegistrant(), other.getTechnicalContact(), other.getUpdatedDate());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected ParsedWhoisRecord(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) {
        this.administrativeContact = administrativeContact;
        this.billingContact = billingContact;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.referral = referral;
        this.registrant = registrant;
        this.technicalContact = technicalContact;
        this.updatedDate = updatedDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ParsedWhoisRecord other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ParsedWhoisRecord> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Deprecated
    public static ParsedWhoisRecord create() {
        return new ParsedWhoisRecord();
    }

    /**
     * Total Nullable factory method
     */
    public static ParsedWhoisRecord create(@javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant administrativeContact, @javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant billingContact, @javax.annotation.Nullable final java.util.Date creationDate, @javax.annotation.Nullable final java.util.Date expirationDate, @javax.annotation.Nullable final String referral, @javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant registrant, @javax.annotation.Nullable final io.github.minorg.whoisclient.ParsedWhoisRegistrant technicalContact, @javax.annotation.Nullable final java.util.Date updatedDate) {
        final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContactOptional = com.google.common.base.Optional.fromNullable(administrativeContact);
        final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContactOptional = com.google.common.base.Optional.fromNullable(billingContact);
        final com.google.common.base.Optional<java.util.Date> creationDateOptional = com.google.common.base.Optional.fromNullable(creationDate);
        final com.google.common.base.Optional<java.util.Date> expirationDateOptional = com.google.common.base.Optional.fromNullable(expirationDate);
        final com.google.common.base.Optional<String> referralOptional = com.google.common.base.Optional.fromNullable(referral);
        final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrantOptional = com.google.common.base.Optional.fromNullable(registrant);
        final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContactOptional = com.google.common.base.Optional.fromNullable(technicalContact);
        final com.google.common.base.Optional<java.util.Date> updatedDateOptional = com.google.common.base.Optional.fromNullable(updatedDate);
        UncheckedValidator.validate(administrativeContactOptional, billingContactOptional, creationDateOptional, expirationDateOptional, referralOptional, registrantOptional, technicalContactOptional, updatedDateOptional);
        return new ParsedWhoisRecord(administrativeContactOptional, billingContactOptional, creationDateOptional, expirationDateOptional, referralOptional, registrantOptional, technicalContactOptional, updatedDateOptional);
    }

    /**
     * Optional factory method
     */
    public static ParsedWhoisRecord create(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact, final com.google.common.base.Optional<java.util.Date> creationDate, final com.google.common.base.Optional<java.util.Date> expirationDate, final com.google.common.base.Optional<String> referral, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant, final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact, final com.google.common.base.Optional<java.util.Date> updatedDate) {
        UncheckedValidator.validate(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
        return new ParsedWhoisRecord(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ParsedWhoisRecord)) {
            return false;
        }

        final ParsedWhoisRecord other = (ParsedWhoisRecord)otherObject;

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

    public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getAdministrativeContact() {
        return administrativeContact;
    }

    public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getBillingContact() {
        return billingContact;
    }

    public final com.google.common.base.Optional<java.util.Date> getCreationDate() {
        return creationDate;
    }

    public final com.google.common.base.Optional<java.util.Date> getExpirationDate() {
        return expirationDate;
    }

    public final com.google.common.base.Optional<String> getReferral() {
        return referral;
    }

    public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getRegistrant() {
        return registrant;
    }

    public final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> getTechnicalContact() {
        return technicalContact;
    }

    public final com.google.common.base.Optional<java.util.Date> getUpdatedDate() {
        return updatedDate;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
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

    public static ParsedWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ParsedWhoisRecord readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ParsedWhoisRecord readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> creationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<java.util.Date> expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<String> referral = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> updatedDate = com.google.common.base.Optional.<java.util.Date> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                administrativeContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 1) {
                billingContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                try {
                    creationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 3) {
                try {
                    expirationDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 4) {
                referral = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 5) {
                registrant = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 6) {
                technicalContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot));
            }
            if (__list.getSize() > 7) {
                try {
                    updatedDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (final IllegalArgumentException e) {
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);

        return new ParsedWhoisRecord(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
    }

    public static ParsedWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ParsedWhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> creationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<java.util.Date> expirationDate = com.google.common.base.Optional.<java.util.Date> absent();
        com.google.common.base.Optional<String> referral = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact = com.google.common.base.Optional.<io.github.minorg.whoisclient.ParsedWhoisRegistrant> absent();
        com.google.common.base.Optional<java.util.Date> updatedDate = com.google.common.base.Optional.<java.util.Date> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "administrative_contact": {
                    administrativeContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
                    break;
                }
                case "billing_contact": {
                    billingContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
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
                    registrant = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
                    break;
                }
                case "technical_contact": {
                    technicalContact = com.google.common.base.Optional.of(io.github.minorg.whoisclient.ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);

        return new ParsedWhoisRecord(administrativeContact, billingContact, creationDate, expirationDate, referral, registrant, technicalContact, updatedDate);
    }

    public ParsedWhoisRecord replaceAdministrativeContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact) {
        UncheckedValidator.validateAdministrativeContact(administrativeContact);
        return new ParsedWhoisRecord(administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceAdministrativeContact(final io.github.minorg.whoisclient.ParsedWhoisRegistrant administrativeContact) {
        return replaceAdministrativeContact(com.google.common.base.Optional.fromNullable(administrativeContact));
    }

    public ParsedWhoisRecord replaceBillingContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact) {
        UncheckedValidator.validateBillingContact(billingContact);
        return new ParsedWhoisRecord(this.administrativeContact, billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceBillingContact(final io.github.minorg.whoisclient.ParsedWhoisRegistrant billingContact) {
        return replaceBillingContact(com.google.common.base.Optional.fromNullable(billingContact));
    }

    public ParsedWhoisRecord replaceCreationDate(final com.google.common.base.Optional<java.util.Date> creationDate) {
        UncheckedValidator.validateCreationDate(creationDate);
        return new ParsedWhoisRecord(this.administrativeContact, this.billingContact, creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceCreationDate(final java.util.Date creationDate) {
        return replaceCreationDate(com.google.common.base.Optional.fromNullable(creationDate));
    }

    public ParsedWhoisRecord replaceExpirationDate(final com.google.common.base.Optional<java.util.Date> expirationDate) {
        UncheckedValidator.validateExpirationDate(expirationDate);
        return new ParsedWhoisRecord(this.administrativeContact, this.billingContact, this.creationDate, expirationDate, this.referral, this.registrant, this.technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceExpirationDate(final java.util.Date expirationDate) {
        return replaceExpirationDate(com.google.common.base.Optional.fromNullable(expirationDate));
    }

    public ParsedWhoisRecord replaceReferral(final com.google.common.base.Optional<String> referral) {
        UncheckedValidator.validateReferral(referral);
        return new ParsedWhoisRecord(this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, referral, this.registrant, this.technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceReferral(final String referral) {
        return replaceReferral(com.google.common.base.Optional.fromNullable(referral));
    }

    public ParsedWhoisRecord replaceRegistrant(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant) {
        UncheckedValidator.validateRegistrant(registrant);
        return new ParsedWhoisRecord(this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, registrant, this.technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceRegistrant(final io.github.minorg.whoisclient.ParsedWhoisRegistrant registrant) {
        return replaceRegistrant(com.google.common.base.Optional.fromNullable(registrant));
    }

    public ParsedWhoisRecord replaceTechnicalContact(final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact) {
        UncheckedValidator.validateTechnicalContact(technicalContact);
        return new ParsedWhoisRecord(this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, technicalContact, this.updatedDate);
    }

    public ParsedWhoisRecord replaceTechnicalContact(final io.github.minorg.whoisclient.ParsedWhoisRegistrant technicalContact) {
        return replaceTechnicalContact(com.google.common.base.Optional.fromNullable(technicalContact));
    }

    public ParsedWhoisRecord replaceUpdatedDate(final com.google.common.base.Optional<java.util.Date> updatedDate) {
        UncheckedValidator.validateUpdatedDate(updatedDate);
        return new ParsedWhoisRecord(this.administrativeContact, this.billingContact, this.creationDate, this.expirationDate, this.referral, this.registrant, this.technicalContact, updatedDate);
    }

    public ParsedWhoisRecord replaceUpdatedDate(final java.util.Date updatedDate) {
        return replaceUpdatedDate(com.google.common.base.Optional.fromNullable(updatedDate));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("administrative_contact", getAdministrativeContact().orNull()).add("billing_contact", getBillingContact().orNull()).add("creation_date", getCreationDate().orNull()).add("expiration_date", getExpirationDate().orNull()).add("referral", getReferral().orNull()).add("registrant", getRegistrant().orNull()).add("technical_contact", getTechnicalContact().orNull()).add("updated_date", getUpdatedDate().orNull()).toString();
    }

    public void writeAdministrativeContactField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAdministrativeContact().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ADMINISTRATIVE_CONTACT);
            getAdministrativeContact().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 8);

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
        oprot.writeStructBegin("io.github.minorg.whoisclient.ParsedWhoisRecord");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeBillingContactField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getBillingContact().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.BILLING_CONTACT);
            getBillingContact().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeCreationDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCreationDate().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CREATION_DATE);
            oprot.writeDateTime(getCreationDate().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeExpirationDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExpirationDate().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXPIRATION_DATE);
            oprot.writeDateTime(getExpirationDate().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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

    public void writeReferralField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getReferral().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.REFERRAL);
            oprot.writeString(getReferral().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeRegistrantField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRegistrant().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.REGISTRANT);
            getRegistrant().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeTechnicalContactField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTechnicalContact().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TECHNICAL_CONTACT);
            getTechnicalContact().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeUpdatedDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getUpdatedDate().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.UPDATED_DATE);
            oprot.writeDateTime(getUpdatedDate().get());
            oprot.writeFieldEnd();
        }
    }

    public final static ParsedWhoisRecord EMPTY = new ParsedWhoisRecord();

    private final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> administrativeContact;

    private final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> billingContact;

    private final com.google.common.base.Optional<java.util.Date> creationDate;

    private final com.google.common.base.Optional<java.util.Date> expirationDate;

    private final com.google.common.base.Optional<String> referral;

    private final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> registrant;

    private final com.google.common.base.Optional<io.github.minorg.whoisclient.ParsedWhoisRegistrant> technicalContact;

    private final com.google.common.base.Optional<java.util.Date> updatedDate;
}

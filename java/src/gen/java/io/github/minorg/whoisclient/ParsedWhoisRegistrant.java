package io.github.minorg.whoisclient;

public final class ParsedWhoisRegistrant implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            airportCode = com.google.common.base.Optional.<String> absent();
            city = com.google.common.base.Optional.<String> absent();
            country = com.google.common.base.Optional.<String> absent();
            countryCode = com.google.common.base.Optional.<String> absent();
            district = com.google.common.base.Optional.<String> absent();
            email = com.google.common.base.Optional.<String> absent();
            firstName = com.google.common.base.Optional.<String> absent();
            handle = com.google.common.base.Optional.<String> absent();
            lastName = com.google.common.base.Optional.<String> absent();
            name = com.google.common.base.Optional.<String> absent();
            organization = com.google.common.base.Optional.<String> absent();
            phone = com.google.common.base.Optional.<String> absent();
            phoneExt = com.google.common.base.Optional.<String> absent();
            postalCode = com.google.common.base.Optional.<String> absent();
            state = com.google.common.base.Optional.<String> absent();
            stateCode = com.google.common.base.Optional.<String> absent();
            street = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        }

        public Builder(final ParsedWhoisRegistrant other) {
            this.airportCode = other.getAirportCode();
            this.city = other.getCity();
            this.country = other.getCountry();
            this.countryCode = other.getCountryCode();
            this.district = other.getDistrict();
            this.email = other.getEmail();
            this.firstName = other.getFirstName();
            this.handle = other.getHandle();
            this.lastName = other.getLastName();
            this.name = other.getName();
            this.organization = other.getOrganization();
            this.phone = other.getPhone();
            this.phoneExt = other.getPhoneExt();
            this.postalCode = other.getPostalCode();
            this.state = other.getState();
            this.stateCode = other.getStateCode();
            this.street = other.getStreet();
        }

        protected ParsedWhoisRegistrant _build(final com.google.common.base.Optional<String> airportCode, final com.google.common.base.Optional<String> city, final com.google.common.base.Optional<String> country, final com.google.common.base.Optional<String> countryCode, final com.google.common.base.Optional<String> district, final com.google.common.base.Optional<String> email, final com.google.common.base.Optional<String> firstName, final com.google.common.base.Optional<String> handle, final com.google.common.base.Optional<String> lastName, final com.google.common.base.Optional<String> name, final com.google.common.base.Optional<String> organization, final com.google.common.base.Optional<String> phone, final com.google.common.base.Optional<String> phoneExt, final com.google.common.base.Optional<String> postalCode, final com.google.common.base.Optional<String> state, final com.google.common.base.Optional<String> stateCode, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) {
            return new ParsedWhoisRegistrant(airportCode, city, country, countryCode, district, email, firstName, handle, lastName, name, organization, phone, phoneExt, postalCode, state, stateCode, street, DefaultConstructionValidator.getInstance());
        }

        public ParsedWhoisRegistrant build() {
            return _build(airportCode, city, country, countryCode, district, email, firstName, handle, lastName, name, organization, phone, phoneExt, postalCode, state, stateCode, street);
        }

        public final com.google.common.base.Optional<String> getAirportCode() {
            return airportCode;
        }

        public final com.google.common.base.Optional<String> getCity() {
            return city;
        }

        public final com.google.common.base.Optional<String> getCountry() {
            return country;
        }

        public final com.google.common.base.Optional<String> getCountryCode() {
            return countryCode;
        }

        public final com.google.common.base.Optional<String> getDistrict() {
            return district;
        }

        public final com.google.common.base.Optional<String> getEmail() {
            return email;
        }

        public final com.google.common.base.Optional<String> getFirstName() {
            return firstName;
        }

        public final com.google.common.base.Optional<String> getHandle() {
            return handle;
        }

        public final com.google.common.base.Optional<String> getLastName() {
            return lastName;
        }

        public final com.google.common.base.Optional<String> getName() {
            return name;
        }

        public final com.google.common.base.Optional<String> getOrganization() {
            return organization;
        }

        public final com.google.common.base.Optional<String> getPhone() {
            return phone;
        }

        public final com.google.common.base.Optional<String> getPhoneExt() {
            return phoneExt;
        }

        public final com.google.common.base.Optional<String> getPostalCode() {
            return postalCode;
        }

        public final com.google.common.base.Optional<String> getState() {
            return state;
        }

        public final com.google.common.base.Optional<String> getStateCode() {
            return stateCode;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getStreet() {
            return street;
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
                    airportCode = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 1) {
                    city = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 2) {
                    country = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 3) {
                    countryCode = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 4) {
                    district = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 5) {
                    email = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 6) {
                    firstName = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 7) {
                    handle = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 8) {
                    lastName = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 9) {
                    name = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 10) {
                    organization = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 11) {
                    phone = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 12) {
                    phoneExt = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 13) {
                    postalCode = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 14) {
                    state = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 15) {
                    stateCode = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 16) {
                    try {
                        street = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STREET, e.getCause());
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
                    case "airport_code": {
                        airportCode = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "city": {
                        city = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "country": {
                        country = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "country_code": {
                        countryCode = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "district": {
                        district = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "email": {
                        email = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "first_name": {
                        firstName = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "handle": {
                        handle = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "last_name": {
                        lastName = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "name": {
                        name = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "organization": {
                        organization = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "phone": {
                        phone = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "phone_ext": {
                        phoneExt = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "postal_code": {
                        postalCode = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "state": {
                        state = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "state_code": {
                        stateCode = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "street": {
                        try {
                            street = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STREET, e.getCause());
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
            case AIRPORT_CODE: setAirportCode((String)value); return this;
            case CITY: setCity((String)value); return this;
            case COUNTRY: setCountry((String)value); return this;
            case COUNTRY_CODE: setCountryCode((String)value); return this;
            case DISTRICT: setDistrict((String)value); return this;
            case EMAIL: setEmail((String)value); return this;
            case FIRST_NAME: setFirstName((String)value); return this;
            case HANDLE: setHandle((String)value); return this;
            case LAST_NAME: setLastName((String)value); return this;
            case NAME: setName((String)value); return this;
            case ORGANIZATION: setOrganization((String)value); return this;
            case PHONE: setPhone((String)value); return this;
            case PHONE_EXT: setPhoneExt((String)value); return this;
            case POSTAL_CODE: setPostalCode((String)value); return this;
            case STATE: setState((String)value); return this;
            case STATE_CODE: setStateCode((String)value); return this;
            case STREET: setStreet((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAirportCode(final com.google.common.base.Optional<String> airportCode) {
            this.airportCode = DefaultConstructionValidator.getInstance().validateAirportCode(airportCode);
            return this;
        }

        public Builder setAirportCode(@javax.annotation.Nullable final String airportCode) {
            return setAirportCode(com.google.common.base.Optional.fromNullable(airportCode));
        }

        public Builder setCity(final com.google.common.base.Optional<String> city) {
            this.city = DefaultConstructionValidator.getInstance().validateCity(city);
            return this;
        }

        public Builder setCity(@javax.annotation.Nullable final String city) {
            return setCity(com.google.common.base.Optional.fromNullable(city));
        }

        public Builder setCountry(final com.google.common.base.Optional<String> country) {
            this.country = DefaultConstructionValidator.getInstance().validateCountry(country);
            return this;
        }

        public Builder setCountry(@javax.annotation.Nullable final String country) {
            return setCountry(com.google.common.base.Optional.fromNullable(country));
        }

        public Builder setCountryCode(final com.google.common.base.Optional<String> countryCode) {
            this.countryCode = DefaultConstructionValidator.getInstance().validateCountryCode(countryCode);
            return this;
        }

        public Builder setCountryCode(@javax.annotation.Nullable final String countryCode) {
            return setCountryCode(com.google.common.base.Optional.fromNullable(countryCode));
        }

        public Builder setDistrict(final com.google.common.base.Optional<String> district) {
            this.district = DefaultConstructionValidator.getInstance().validateDistrict(district);
            return this;
        }

        public Builder setDistrict(@javax.annotation.Nullable final String district) {
            return setDistrict(com.google.common.base.Optional.fromNullable(district));
        }

        public Builder setEmail(final com.google.common.base.Optional<String> email) {
            this.email = DefaultConstructionValidator.getInstance().validateEmail(email);
            return this;
        }

        public Builder setEmail(@javax.annotation.Nullable final String email) {
            return setEmail(com.google.common.base.Optional.fromNullable(email));
        }

        public Builder setFirstName(final com.google.common.base.Optional<String> firstName) {
            this.firstName = DefaultConstructionValidator.getInstance().validateFirstName(firstName);
            return this;
        }

        public Builder setFirstName(@javax.annotation.Nullable final String firstName) {
            return setFirstName(com.google.common.base.Optional.fromNullable(firstName));
        }

        public Builder setHandle(final com.google.common.base.Optional<String> handle) {
            this.handle = DefaultConstructionValidator.getInstance().validateHandle(handle);
            return this;
        }

        public Builder setHandle(@javax.annotation.Nullable final String handle) {
            return setHandle(com.google.common.base.Optional.fromNullable(handle));
        }

        public Builder setIfPresent(final ParsedWhoisRegistrant other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getAirportCode().isPresent()) {
                setAirportCode(other.getAirportCode());
            }
            if (other.getCity().isPresent()) {
                setCity(other.getCity());
            }
            if (other.getCountry().isPresent()) {
                setCountry(other.getCountry());
            }
            if (other.getCountryCode().isPresent()) {
                setCountryCode(other.getCountryCode());
            }
            if (other.getDistrict().isPresent()) {
                setDistrict(other.getDistrict());
            }
            if (other.getEmail().isPresent()) {
                setEmail(other.getEmail());
            }
            if (other.getFirstName().isPresent()) {
                setFirstName(other.getFirstName());
            }
            if (other.getHandle().isPresent()) {
                setHandle(other.getHandle());
            }
            if (other.getLastName().isPresent()) {
                setLastName(other.getLastName());
            }
            if (other.getName().isPresent()) {
                setName(other.getName());
            }
            if (other.getOrganization().isPresent()) {
                setOrganization(other.getOrganization());
            }
            if (other.getPhone().isPresent()) {
                setPhone(other.getPhone());
            }
            if (other.getPhoneExt().isPresent()) {
                setPhoneExt(other.getPhoneExt());
            }
            if (other.getPostalCode().isPresent()) {
                setPostalCode(other.getPostalCode());
            }
            if (other.getState().isPresent()) {
                setState(other.getState());
            }
            if (other.getStateCode().isPresent()) {
                setStateCode(other.getStateCode());
            }
            if (other.getStreet().isPresent()) {
                setStreet(other.getStreet());
            }

            return this;
        }

        public Builder setLastName(final com.google.common.base.Optional<String> lastName) {
            this.lastName = DefaultConstructionValidator.getInstance().validateLastName(lastName);
            return this;
        }

        public Builder setLastName(@javax.annotation.Nullable final String lastName) {
            return setLastName(com.google.common.base.Optional.fromNullable(lastName));
        }

        public Builder setName(final com.google.common.base.Optional<String> name) {
            this.name = DefaultConstructionValidator.getInstance().validateName(name);
            return this;
        }

        public Builder setName(@javax.annotation.Nullable final String name) {
            return setName(com.google.common.base.Optional.fromNullable(name));
        }

        public Builder setOrganization(final com.google.common.base.Optional<String> organization) {
            this.organization = DefaultConstructionValidator.getInstance().validateOrganization(organization);
            return this;
        }

        public Builder setOrganization(@javax.annotation.Nullable final String organization) {
            return setOrganization(com.google.common.base.Optional.fromNullable(organization));
        }

        public Builder setPhone(final com.google.common.base.Optional<String> phone) {
            this.phone = DefaultConstructionValidator.getInstance().validatePhone(phone);
            return this;
        }

        public Builder setPhone(@javax.annotation.Nullable final String phone) {
            return setPhone(com.google.common.base.Optional.fromNullable(phone));
        }

        public Builder setPhoneExt(final com.google.common.base.Optional<String> phoneExt) {
            this.phoneExt = DefaultConstructionValidator.getInstance().validatePhoneExt(phoneExt);
            return this;
        }

        public Builder setPhoneExt(@javax.annotation.Nullable final String phoneExt) {
            return setPhoneExt(com.google.common.base.Optional.fromNullable(phoneExt));
        }

        public Builder setPostalCode(final com.google.common.base.Optional<String> postalCode) {
            this.postalCode = DefaultConstructionValidator.getInstance().validatePostalCode(postalCode);
            return this;
        }

        public Builder setPostalCode(@javax.annotation.Nullable final String postalCode) {
            return setPostalCode(com.google.common.base.Optional.fromNullable(postalCode));
        }

        public Builder setState(final com.google.common.base.Optional<String> state) {
            this.state = DefaultConstructionValidator.getInstance().validateState(state);
            return this;
        }

        public Builder setState(@javax.annotation.Nullable final String state) {
            return setState(com.google.common.base.Optional.fromNullable(state));
        }

        public Builder setStateCode(final com.google.common.base.Optional<String> stateCode) {
            this.stateCode = DefaultConstructionValidator.getInstance().validateStateCode(stateCode);
            return this;
        }

        public Builder setStateCode(@javax.annotation.Nullable final String stateCode) {
            return setStateCode(com.google.common.base.Optional.fromNullable(stateCode));
        }

        public Builder setStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) {
            this.street = DefaultConstructionValidator.getInstance().validateStreet(street);
            return this;
        }

        public Builder setStreet(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> street) {
            return setStreet(com.google.common.base.Optional.fromNullable(street));
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
            case AIRPORT_CODE: return unsetAirportCode();
            case CITY: return unsetCity();
            case COUNTRY: return unsetCountry();
            case COUNTRY_CODE: return unsetCountryCode();
            case DISTRICT: return unsetDistrict();
            case EMAIL: return unsetEmail();
            case FIRST_NAME: return unsetFirstName();
            case HANDLE: return unsetHandle();
            case LAST_NAME: return unsetLastName();
            case NAME: return unsetName();
            case ORGANIZATION: return unsetOrganization();
            case PHONE: return unsetPhone();
            case PHONE_EXT: return unsetPhoneExt();
            case POSTAL_CODE: return unsetPostalCode();
            case STATE: return unsetState();
            case STATE_CODE: return unsetStateCode();
            case STREET: return unsetStreet();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAirportCode() {
            this.airportCode = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetCity() {
            this.city = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetCountry() {
            this.country = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetCountryCode() {
            this.countryCode = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetDistrict() {
            this.district = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetEmail() {
            this.email = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetFirstName() {
            this.firstName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetHandle() {
            this.handle = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetLastName() {
            this.lastName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetName() {
            this.name = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetOrganization() {
            this.organization = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetPhone() {
            this.phone = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetPhoneExt() {
            this.phoneExt = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetPostalCode() {
            this.postalCode = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetState() {
            this.state = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetStateCode() {
            this.stateCode = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetStreet() {
            this.street = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        private com.google.common.base.Optional<String> airportCode;
        private com.google.common.base.Optional<String> city;
        private com.google.common.base.Optional<String> country;
        private com.google.common.base.Optional<String> countryCode;
        private com.google.common.base.Optional<String> district;
        private com.google.common.base.Optional<String> email;
        private com.google.common.base.Optional<String> firstName;
        private com.google.common.base.Optional<String> handle;
        private com.google.common.base.Optional<String> lastName;
        private com.google.common.base.Optional<String> name;
        private com.google.common.base.Optional<String> organization;
        private com.google.common.base.Optional<String> phone;
        private com.google.common.base.Optional<String> phoneExt;
        private com.google.common.base.Optional<String> postalCode;
        private com.google.common.base.Optional<String> state;
        private com.google.common.base.Optional<String> stateCode;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ParsedWhoisRegistrant> {
        @Override
        public ParsedWhoisRegistrant readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRegistrant.readAs(iprot, type);
        }

        @Override
        public ParsedWhoisRegistrant readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRegistrant.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ParsedWhoisRegistrant readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRegistrant.readAsList(iprot);
        }

        @Override
        public ParsedWhoisRegistrant readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRegistrant.readAsStruct(iprot);
        }

        @Override
        public ParsedWhoisRegistrant readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ParsedWhoisRegistrant.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AIRPORT_CODE("airportCode", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "airport_code", org.thryft.protocol.Type.STRING),
        CITY("city", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "city", org.thryft.protocol.Type.STRING),
        COUNTRY("country", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "country", org.thryft.protocol.Type.STRING),
        COUNTRY_CODE("countryCode", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "country_code", org.thryft.protocol.Type.STRING),
        DISTRICT("district", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "district", org.thryft.protocol.Type.STRING),
        EMAIL("email", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "email", org.thryft.protocol.Type.STRING),
        FIRST_NAME("firstName", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "first_name", org.thryft.protocol.Type.STRING),
        HANDLE("handle", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "handle", org.thryft.protocol.Type.STRING),
        LAST_NAME("lastName", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "last_name", org.thryft.protocol.Type.STRING),
        NAME("name", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "name", org.thryft.protocol.Type.STRING),
        ORGANIZATION("organization", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "organization", org.thryft.protocol.Type.STRING),
        PHONE("phone", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "phone", org.thryft.protocol.Type.STRING),
        PHONE_EXT("phoneExt", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "phone_ext", org.thryft.protocol.Type.STRING),
        POSTAL_CODE("postalCode", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "postal_code", org.thryft.protocol.Type.STRING),
        STATE("state", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "state", org.thryft.protocol.Type.STRING),
        STATE_CODE("stateCode", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "state_code", org.thryft.protocol.Type.STRING),
        STREET("street", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 0, "street", org.thryft.protocol.Type.LIST);

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
            case "airportCode": return AIRPORT_CODE;
            case "city": return CITY;
            case "country": return COUNTRY;
            case "countryCode": return COUNTRY_CODE;
            case "district": return DISTRICT;
            case "email": return EMAIL;
            case "firstName": return FIRST_NAME;
            case "handle": return HANDLE;
            case "lastName": return LAST_NAME;
            case "name": return NAME;
            case "organization": return ORGANIZATION;
            case "phone": return PHONE;
            case "phoneExt": return PHONE_EXT;
            case "postalCode": return POSTAL_CODE;
            case "state": return STATE;
            case "stateCode": return STATE_CODE;
            case "street": return STREET;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "airport_code": return AIRPORT_CODE;
            case "city": return CITY;
            case "country": return COUNTRY;
            case "country_code": return COUNTRY_CODE;
            case "district": return DISTRICT;
            case "email": return EMAIL;
            case "first_name": return FIRST_NAME;
            case "handle": return HANDLE;
            case "last_name": return LAST_NAME;
            case "name": return NAME;
            case "organization": return ORGANIZATION;
            case "phone": return PHONE;
            case "phone_ext": return PHONE_EXT;
            case "postal_code": return POSTAL_CODE;
            case "state": return STATE;
            case "state_code": return STATE_CODE;
            case "street": return STREET;
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
        public com.google.common.base.Optional<String> validateAirportCode(final com.google.common.base.Optional<String> airportCode) throws ExceptionT;

        public com.google.common.base.Optional<String> validateCity(final com.google.common.base.Optional<String> city) throws ExceptionT;

        public com.google.common.base.Optional<String> validateCountry(final com.google.common.base.Optional<String> country) throws ExceptionT;

        public com.google.common.base.Optional<String> validateCountryCode(final com.google.common.base.Optional<String> countryCode) throws ExceptionT;

        public com.google.common.base.Optional<String> validateDistrict(final com.google.common.base.Optional<String> district) throws ExceptionT;

        public com.google.common.base.Optional<String> validateEmail(final com.google.common.base.Optional<String> email) throws ExceptionT;

        public com.google.common.base.Optional<String> validateFirstName(final com.google.common.base.Optional<String> firstName) throws ExceptionT;

        public com.google.common.base.Optional<String> validateHandle(final com.google.common.base.Optional<String> handle) throws ExceptionT;

        public com.google.common.base.Optional<String> validateLastName(final com.google.common.base.Optional<String> lastName) throws ExceptionT;

        public com.google.common.base.Optional<String> validateName(final com.google.common.base.Optional<String> name) throws ExceptionT;

        public com.google.common.base.Optional<String> validateOrganization(final com.google.common.base.Optional<String> organization) throws ExceptionT;

        public com.google.common.base.Optional<String> validatePhone(final com.google.common.base.Optional<String> phone) throws ExceptionT;

        public com.google.common.base.Optional<String> validatePhoneExt(final com.google.common.base.Optional<String> phoneExt) throws ExceptionT;

        public com.google.common.base.Optional<String> validatePostalCode(final com.google.common.base.Optional<String> postalCode) throws ExceptionT;

        public com.google.common.base.Optional<String> validateState(final com.google.common.base.Optional<String> state) throws ExceptionT;

        public com.google.common.base.Optional<String> validateStateCode(final com.google.common.base.Optional<String> stateCode) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) throws ExceptionT;
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
        public com.google.common.base.Optional<String> validateAirportCode(final com.google.common.base.Optional<String> airportCode) throws RuntimeException {
            if (airportCode == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: airportCode is null");
            }
            if (!airportCode.isPresent()) {
                return airportCode;
            }
            if (airportCode.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: airportCode is less than min length 1");
            }
            {
                final int __strLen = airportCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(airportCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: airportCode is blank: '%s' (length=%d)", airportCode.get(), __strLen));
                }
            }
            return airportCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateCity(final com.google.common.base.Optional<String> city) throws RuntimeException {
            if (city == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: city is null");
            }
            if (!city.isPresent()) {
                return city;
            }
            if (city.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: city is less than min length 1");
            }
            {
                final int __strLen = city.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(city.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: city is blank: '%s' (length=%d)", city.get(), __strLen));
                }
            }
            return city;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountry(final com.google.common.base.Optional<String> country) throws RuntimeException {
            if (country == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: country is null");
            }
            if (!country.isPresent()) {
                return country;
            }
            if (country.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: country is less than min length 1");
            }
            {
                final int __strLen = country.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(country.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: country is blank: '%s' (length=%d)", country.get(), __strLen));
                }
            }
            return country;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountryCode(final com.google.common.base.Optional<String> countryCode) throws RuntimeException {
            if (countryCode == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is null");
            }
            if (!countryCode.isPresent()) {
                return countryCode;
            }
            if (countryCode.get().length() < 2) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is less than min length 2");
            }
            {
                final int __strLen = countryCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(countryCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is blank: '%s' (length=%d)", countryCode.get(), __strLen));
                }
            }
            if (countryCode.get().length() > 3) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is greater than max length 3");
            }
            return countryCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateDistrict(final com.google.common.base.Optional<String> district) throws RuntimeException {
            if (district == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: district is null");
            }
            if (!district.isPresent()) {
                return district;
            }
            if (district.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: district is less than min length 1");
            }
            {
                final int __strLen = district.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(district.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: district is blank: '%s' (length=%d)", district.get(), __strLen));
                }
            }
            return district;
        }

        @Override
        public com.google.common.base.Optional<String> validateEmail(final com.google.common.base.Optional<String> email) throws RuntimeException {
            if (email == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: email is null");
            }
            if (!email.isPresent()) {
                return email;
            }
            if (email.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: email is less than min length 1");
            }
            {
                final int __strLen = email.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(email.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: email is blank: '%s' (length=%d)", email.get(), __strLen));
                }
            }
            return email;
        }

        @Override
        public com.google.common.base.Optional<String> validateFirstName(final com.google.common.base.Optional<String> firstName) throws RuntimeException {
            if (firstName == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: firstName is null");
            }
            if (!firstName.isPresent()) {
                return firstName;
            }
            if (firstName.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: firstName is less than min length 1");
            }
            {
                final int __strLen = firstName.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(firstName.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: firstName is blank: '%s' (length=%d)", firstName.get(), __strLen));
                }
            }
            return firstName;
        }

        @Override
        public com.google.common.base.Optional<String> validateHandle(final com.google.common.base.Optional<String> handle) throws RuntimeException {
            if (handle == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: handle is null");
            }
            if (!handle.isPresent()) {
                return handle;
            }
            if (handle.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: handle is less than min length 1");
            }
            {
                final int __strLen = handle.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(handle.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: handle is blank: '%s' (length=%d)", handle.get(), __strLen));
                }
            }
            return handle;
        }

        @Override
        public com.google.common.base.Optional<String> validateLastName(final com.google.common.base.Optional<String> lastName) throws RuntimeException {
            if (lastName == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: lastName is null");
            }
            if (!lastName.isPresent()) {
                return lastName;
            }
            if (lastName.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: lastName is less than min length 1");
            }
            {
                final int __strLen = lastName.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(lastName.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: lastName is blank: '%s' (length=%d)", lastName.get(), __strLen));
                }
            }
            return lastName;
        }

        @Override
        public com.google.common.base.Optional<String> validateName(final com.google.common.base.Optional<String> name) throws RuntimeException {
            if (name == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: name is null");
            }
            if (!name.isPresent()) {
                return name;
            }
            if (name.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: name is less than min length 1");
            }
            {
                final int __strLen = name.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(name.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: name is blank: '%s' (length=%d)", name.get(), __strLen));
                }
            }
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateOrganization(final com.google.common.base.Optional<String> organization) throws RuntimeException {
            if (organization == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: organization is null");
            }
            if (!organization.isPresent()) {
                return organization;
            }
            if (organization.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: organization is less than min length 1");
            }
            {
                final int __strLen = organization.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(organization.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: organization is blank: '%s' (length=%d)", organization.get(), __strLen));
                }
            }
            return organization;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhone(final com.google.common.base.Optional<String> phone) throws RuntimeException {
            if (phone == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phone is null");
            }
            if (!phone.isPresent()) {
                return phone;
            }
            if (phone.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phone is less than min length 1");
            }
            {
                final int __strLen = phone.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(phone.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phone is blank: '%s' (length=%d)", phone.get(), __strLen));
                }
            }
            return phone;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhoneExt(final com.google.common.base.Optional<String> phoneExt) throws RuntimeException {
            if (phoneExt == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phoneExt is null");
            }
            if (!phoneExt.isPresent()) {
                return phoneExt;
            }
            if (phoneExt.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phoneExt is less than min length 1");
            }
            {
                final int __strLen = phoneExt.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(phoneExt.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phoneExt is blank: '%s' (length=%d)", phoneExt.get(), __strLen));
                }
            }
            return phoneExt;
        }

        @Override
        public com.google.common.base.Optional<String> validatePostalCode(final com.google.common.base.Optional<String> postalCode) throws RuntimeException {
            if (postalCode == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: postalCode is null");
            }
            if (!postalCode.isPresent()) {
                return postalCode;
            }
            if (postalCode.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: postalCode is less than min length 1");
            }
            {
                final int __strLen = postalCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(postalCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: postalCode is blank: '%s' (length=%d)", postalCode.get(), __strLen));
                }
            }
            return postalCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateState(final com.google.common.base.Optional<String> state) throws RuntimeException {
            if (state == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: state is null");
            }
            if (!state.isPresent()) {
                return state;
            }
            if (state.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: state is less than min length 1");
            }
            {
                final int __strLen = state.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(state.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: state is blank: '%s' (length=%d)", state.get(), __strLen));
                }
            }
            return state;
        }

        @Override
        public com.google.common.base.Optional<String> validateStateCode(final com.google.common.base.Optional<String> stateCode) throws RuntimeException {
            if (stateCode == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: stateCode is null");
            }
            if (!stateCode.isPresent()) {
                return stateCode;
            }
            if (stateCode.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: stateCode is less than min length 1");
            }
            {
                final int __strLen = stateCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(stateCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: stateCode is blank: '%s' (length=%d)", stateCode.get(), __strLen));
                }
            }
            return stateCode;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) throws RuntimeException {
            if (street == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: street is null");
            }
            if (!street.isPresent()) {
                return street;
            }
            if (street.get().isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.ParsedWhoisRegistrant: street is less than min length 1");
            }
            return street;
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
        public com.google.common.base.Optional<String> validateAirportCode(final com.google.common.base.Optional<String> airportCode) {
            return airportCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateCity(final com.google.common.base.Optional<String> city) {
            return city;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountry(final com.google.common.base.Optional<String> country) {
            return country;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountryCode(final com.google.common.base.Optional<String> countryCode) {
            return countryCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateDistrict(final com.google.common.base.Optional<String> district) {
            return district;
        }

        @Override
        public com.google.common.base.Optional<String> validateEmail(final com.google.common.base.Optional<String> email) {
            return email;
        }

        @Override
        public com.google.common.base.Optional<String> validateFirstName(final com.google.common.base.Optional<String> firstName) {
            return firstName;
        }

        @Override
        public com.google.common.base.Optional<String> validateHandle(final com.google.common.base.Optional<String> handle) {
            return handle;
        }

        @Override
        public com.google.common.base.Optional<String> validateLastName(final com.google.common.base.Optional<String> lastName) {
            return lastName;
        }

        @Override
        public com.google.common.base.Optional<String> validateName(final com.google.common.base.Optional<String> name) {
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateOrganization(final com.google.common.base.Optional<String> organization) {
            return organization;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhone(final com.google.common.base.Optional<String> phone) {
            return phone;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhoneExt(final com.google.common.base.Optional<String> phoneExt) {
            return phoneExt;
        }

        @Override
        public com.google.common.base.Optional<String> validatePostalCode(final com.google.common.base.Optional<String> postalCode) {
            return postalCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateState(final com.google.common.base.Optional<String> state) {
            return state;
        }

        @Override
        public com.google.common.base.Optional<String> validateStateCode(final com.google.common.base.Optional<String> stateCode) {
            return stateCode;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) {
            return street;
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
        public com.google.common.base.Optional<String> validateAirportCode(final com.google.common.base.Optional<String> airportCode) throws org.thryft.protocol.InputProtocolException {
            if (airportCode == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AIRPORT_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: airportCode is null");
            }
            if (!airportCode.isPresent()) {
                return airportCode;
            }
            if (airportCode.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AIRPORT_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: airportCode is less than min length 1");
            }
            {
                final int __strLen = airportCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(airportCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AIRPORT_CODE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: airportCode is blank: '%s' (length=%d)", airportCode.get(), __strLen));
                }
            }
            return airportCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateCity(final com.google.common.base.Optional<String> city) throws org.thryft.protocol.InputProtocolException {
            if (city == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CITY, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: city is null");
            }
            if (!city.isPresent()) {
                return city;
            }
            if (city.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CITY, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: city is less than min length 1");
            }
            {
                final int __strLen = city.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(city.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CITY, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: city is blank: '%s' (length=%d)", city.get(), __strLen));
                }
            }
            return city;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountry(final com.google.common.base.Optional<String> country) throws org.thryft.protocol.InputProtocolException {
            if (country == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COUNTRY, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: country is null");
            }
            if (!country.isPresent()) {
                return country;
            }
            if (country.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COUNTRY, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: country is less than min length 1");
            }
            {
                final int __strLen = country.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(country.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COUNTRY, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: country is blank: '%s' (length=%d)", country.get(), __strLen));
                }
            }
            return country;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountryCode(final com.google.common.base.Optional<String> countryCode) throws org.thryft.protocol.InputProtocolException {
            if (countryCode == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COUNTRY_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is null");
            }
            if (!countryCode.isPresent()) {
                return countryCode;
            }
            if (countryCode.get().length() < 2) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COUNTRY_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is less than min length 2");
            }
            {
                final int __strLen = countryCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(countryCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COUNTRY_CODE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is blank: '%s' (length=%d)", countryCode.get(), __strLen));
                }
            }
            if (countryCode.get().length() > 3) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COUNTRY_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: countryCode is greater than max length 3");
            }
            return countryCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateDistrict(final com.google.common.base.Optional<String> district) throws org.thryft.protocol.InputProtocolException {
            if (district == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DISTRICT, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: district is null");
            }
            if (!district.isPresent()) {
                return district;
            }
            if (district.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISTRICT, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: district is less than min length 1");
            }
            {
                final int __strLen = district.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(district.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISTRICT, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: district is blank: '%s' (length=%d)", district.get(), __strLen));
                }
            }
            return district;
        }

        @Override
        public com.google.common.base.Optional<String> validateEmail(final com.google.common.base.Optional<String> email) throws org.thryft.protocol.InputProtocolException {
            if (email == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EMAIL, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: email is null");
            }
            if (!email.isPresent()) {
                return email;
            }
            if (email.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: email is less than min length 1");
            }
            {
                final int __strLen = email.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(email.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: email is blank: '%s' (length=%d)", email.get(), __strLen));
                }
            }
            return email;
        }

        @Override
        public com.google.common.base.Optional<String> validateFirstName(final com.google.common.base.Optional<String> firstName) throws org.thryft.protocol.InputProtocolException {
            if (firstName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FIRST_NAME, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: firstName is null");
            }
            if (!firstName.isPresent()) {
                return firstName;
            }
            if (firstName.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FIRST_NAME, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: firstName is less than min length 1");
            }
            {
                final int __strLen = firstName.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(firstName.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FIRST_NAME, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: firstName is blank: '%s' (length=%d)", firstName.get(), __strLen));
                }
            }
            return firstName;
        }

        @Override
        public com.google.common.base.Optional<String> validateHandle(final com.google.common.base.Optional<String> handle) throws org.thryft.protocol.InputProtocolException {
            if (handle == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HANDLE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: handle is null");
            }
            if (!handle.isPresent()) {
                return handle;
            }
            if (handle.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HANDLE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: handle is less than min length 1");
            }
            {
                final int __strLen = handle.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(handle.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HANDLE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: handle is blank: '%s' (length=%d)", handle.get(), __strLen));
                }
            }
            return handle;
        }

        @Override
        public com.google.common.base.Optional<String> validateLastName(final com.google.common.base.Optional<String> lastName) throws org.thryft.protocol.InputProtocolException {
            if (lastName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LAST_NAME, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: lastName is null");
            }
            if (!lastName.isPresent()) {
                return lastName;
            }
            if (lastName.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LAST_NAME, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: lastName is less than min length 1");
            }
            {
                final int __strLen = lastName.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(lastName.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LAST_NAME, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: lastName is blank: '%s' (length=%d)", lastName.get(), __strLen));
                }
            }
            return lastName;
        }

        @Override
        public com.google.common.base.Optional<String> validateName(final com.google.common.base.Optional<String> name) throws org.thryft.protocol.InputProtocolException {
            if (name == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.NAME, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: name is null");
            }
            if (!name.isPresent()) {
                return name;
            }
            if (name.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAME, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: name is less than min length 1");
            }
            {
                final int __strLen = name.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(name.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.NAME, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: name is blank: '%s' (length=%d)", name.get(), __strLen));
                }
            }
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateOrganization(final com.google.common.base.Optional<String> organization) throws org.thryft.protocol.InputProtocolException {
            if (organization == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ORGANIZATION, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: organization is null");
            }
            if (!organization.isPresent()) {
                return organization;
            }
            if (organization.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ORGANIZATION, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: organization is less than min length 1");
            }
            {
                final int __strLen = organization.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(organization.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ORGANIZATION, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: organization is blank: '%s' (length=%d)", organization.get(), __strLen));
                }
            }
            return organization;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhone(final com.google.common.base.Optional<String> phone) throws org.thryft.protocol.InputProtocolException {
            if (phone == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PHONE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: phone is null");
            }
            if (!phone.isPresent()) {
                return phone;
            }
            if (phone.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PHONE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: phone is less than min length 1");
            }
            {
                final int __strLen = phone.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(phone.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PHONE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phone is blank: '%s' (length=%d)", phone.get(), __strLen));
                }
            }
            return phone;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhoneExt(final com.google.common.base.Optional<String> phoneExt) throws org.thryft.protocol.InputProtocolException {
            if (phoneExt == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PHONE_EXT, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: phoneExt is null");
            }
            if (!phoneExt.isPresent()) {
                return phoneExt;
            }
            if (phoneExt.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PHONE_EXT, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: phoneExt is less than min length 1");
            }
            {
                final int __strLen = phoneExt.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(phoneExt.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PHONE_EXT, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: phoneExt is blank: '%s' (length=%d)", phoneExt.get(), __strLen));
                }
            }
            return phoneExt;
        }

        @Override
        public com.google.common.base.Optional<String> validatePostalCode(final com.google.common.base.Optional<String> postalCode) throws org.thryft.protocol.InputProtocolException {
            if (postalCode == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.POSTAL_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: postalCode is null");
            }
            if (!postalCode.isPresent()) {
                return postalCode;
            }
            if (postalCode.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.POSTAL_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: postalCode is less than min length 1");
            }
            {
                final int __strLen = postalCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(postalCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.POSTAL_CODE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: postalCode is blank: '%s' (length=%d)", postalCode.get(), __strLen));
                }
            }
            return postalCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateState(final com.google.common.base.Optional<String> state) throws org.thryft.protocol.InputProtocolException {
            if (state == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STATE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: state is null");
            }
            if (!state.isPresent()) {
                return state;
            }
            if (state.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STATE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: state is less than min length 1");
            }
            {
                final int __strLen = state.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(state.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STATE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: state is blank: '%s' (length=%d)", state.get(), __strLen));
                }
            }
            return state;
        }

        @Override
        public com.google.common.base.Optional<String> validateStateCode(final com.google.common.base.Optional<String> stateCode) throws org.thryft.protocol.InputProtocolException {
            if (stateCode == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STATE_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: stateCode is null");
            }
            if (!stateCode.isPresent()) {
                return stateCode;
            }
            if (stateCode.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STATE_CODE, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: stateCode is less than min length 1");
            }
            {
                final int __strLen = stateCode.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(stateCode.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STATE_CODE, String.format("io.github.minorg.whoisclient.ParsedWhoisRegistrant: stateCode is blank: '%s' (length=%d)", stateCode.get(), __strLen));
                }
            }
            return stateCode;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) throws org.thryft.protocol.InputProtocolException {
            if (street == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STREET, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: street is null");
            }
            if (!street.isPresent()) {
                return street;
            }
            if (street.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STREET, "io.github.minorg.whoisclient.ParsedWhoisRegistrant: street is less than min length 1");
            }
            return street;
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
        public com.google.common.base.Optional<String> validateAirportCode(final com.google.common.base.Optional<String> airportCode) {
            return airportCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateCity(final com.google.common.base.Optional<String> city) {
            return city;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountry(final com.google.common.base.Optional<String> country) {
            return country;
        }

        @Override
        public com.google.common.base.Optional<String> validateCountryCode(final com.google.common.base.Optional<String> countryCode) {
            return countryCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateDistrict(final com.google.common.base.Optional<String> district) {
            return district;
        }

        @Override
        public com.google.common.base.Optional<String> validateEmail(final com.google.common.base.Optional<String> email) {
            return email;
        }

        @Override
        public com.google.common.base.Optional<String> validateFirstName(final com.google.common.base.Optional<String> firstName) {
            return firstName;
        }

        @Override
        public com.google.common.base.Optional<String> validateHandle(final com.google.common.base.Optional<String> handle) {
            return handle;
        }

        @Override
        public com.google.common.base.Optional<String> validateLastName(final com.google.common.base.Optional<String> lastName) {
            return lastName;
        }

        @Override
        public com.google.common.base.Optional<String> validateName(final com.google.common.base.Optional<String> name) {
            return name;
        }

        @Override
        public com.google.common.base.Optional<String> validateOrganization(final com.google.common.base.Optional<String> organization) {
            return organization;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhone(final com.google.common.base.Optional<String> phone) {
            return phone;
        }

        @Override
        public com.google.common.base.Optional<String> validatePhoneExt(final com.google.common.base.Optional<String> phoneExt) {
            return phoneExt;
        }

        @Override
        public com.google.common.base.Optional<String> validatePostalCode(final com.google.common.base.Optional<String> postalCode) {
            return postalCode;
        }

        @Override
        public com.google.common.base.Optional<String> validateState(final com.google.common.base.Optional<String> state) {
            return state;
        }

        @Override
        public com.google.common.base.Optional<String> validateStateCode(final com.google.common.base.Optional<String> stateCode) {
            return stateCode;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) {
            return street;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public ParsedWhoisRegistrant() {
        airportCode = com.google.common.base.Optional.<String> absent();
        city = com.google.common.base.Optional.<String> absent();
        country = com.google.common.base.Optional.<String> absent();
        countryCode = com.google.common.base.Optional.<String> absent();
        district = com.google.common.base.Optional.<String> absent();
        email = com.google.common.base.Optional.<String> absent();
        firstName = com.google.common.base.Optional.<String> absent();
        handle = com.google.common.base.Optional.<String> absent();
        lastName = com.google.common.base.Optional.<String> absent();
        name = com.google.common.base.Optional.<String> absent();
        organization = com.google.common.base.Optional.<String> absent();
        phone = com.google.common.base.Optional.<String> absent();
        phoneExt = com.google.common.base.Optional.<String> absent();
        postalCode = com.google.common.base.Optional.<String> absent();
        state = com.google.common.base.Optional.<String> absent();
        stateCode = com.google.common.base.Optional.<String> absent();
        street = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
    }

    /**
     * Copy constructor
     */
    public ParsedWhoisRegistrant(final ParsedWhoisRegistrant other) {
        this(other.getAirportCode(), other.getCity(), other.getCountry(), other.getCountryCode(), other.getDistrict(), other.getEmail(), other.getFirstName(), other.getHandle(), other.getLastName(), other.getName(), other.getOrganization(), other.getPhone(), other.getPhoneExt(), other.getPostalCode(), other.getState(), other.getStateCode(), other.getStreet(), NopConstructionValidator.getInstance());
    }

    protected ParsedWhoisRegistrant(final com.google.common.base.Optional<String> airportCode, final com.google.common.base.Optional<String> city, final com.google.common.base.Optional<String> country, final com.google.common.base.Optional<String> countryCode, final com.google.common.base.Optional<String> district, final com.google.common.base.Optional<String> email, final com.google.common.base.Optional<String> firstName, final com.google.common.base.Optional<String> handle, final com.google.common.base.Optional<String> lastName, final com.google.common.base.Optional<String> name, final com.google.common.base.Optional<String> organization, final com.google.common.base.Optional<String> phone, final com.google.common.base.Optional<String> phoneExt, final com.google.common.base.Optional<String> postalCode, final com.google.common.base.Optional<String> state, final com.google.common.base.Optional<String> stateCode, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street, ConstructionValidator validator) {
        this.airportCode = validator.validateAirportCode(airportCode);
        this.city = validator.validateCity(city);
        this.country = validator.validateCountry(country);
        this.countryCode = validator.validateCountryCode(countryCode);
        this.district = validator.validateDistrict(district);
        this.email = validator.validateEmail(email);
        this.firstName = validator.validateFirstName(firstName);
        this.handle = validator.validateHandle(handle);
        this.lastName = validator.validateLastName(lastName);
        this.name = validator.validateName(name);
        this.organization = validator.validateOrganization(organization);
        this.phone = validator.validatePhone(phone);
        this.phoneExt = validator.validatePhoneExt(phoneExt);
        this.postalCode = validator.validatePostalCode(postalCode);
        this.state = validator.validateState(state);
        this.stateCode = validator.validateStateCode(stateCode);
        this.street = validator.validateStreet(street);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ParsedWhoisRegistrant other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ParsedWhoisRegistrant> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    public static ParsedWhoisRegistrant create() {
        return new ParsedWhoisRegistrant();
    }

    /**
     * Total Nullable factory method
     */
    public static ParsedWhoisRegistrant create(final @javax.annotation.Nullable String airportCode, final @javax.annotation.Nullable String city, final @javax.annotation.Nullable String country, final @javax.annotation.Nullable String countryCode, final @javax.annotation.Nullable String district, final @javax.annotation.Nullable String email, final @javax.annotation.Nullable String firstName, final @javax.annotation.Nullable String handle, final @javax.annotation.Nullable String lastName, final @javax.annotation.Nullable String name, final @javax.annotation.Nullable String organization, final @javax.annotation.Nullable String phone, final @javax.annotation.Nullable String phoneExt, final @javax.annotation.Nullable String postalCode, final @javax.annotation.Nullable String state, final @javax.annotation.Nullable String stateCode, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> street) {
        return new ParsedWhoisRegistrant(com.google.common.base.Optional.fromNullable(airportCode), com.google.common.base.Optional.fromNullable(city), com.google.common.base.Optional.fromNullable(country), com.google.common.base.Optional.fromNullable(countryCode), com.google.common.base.Optional.fromNullable(district), com.google.common.base.Optional.fromNullable(email), com.google.common.base.Optional.fromNullable(firstName), com.google.common.base.Optional.fromNullable(handle), com.google.common.base.Optional.fromNullable(lastName), com.google.common.base.Optional.fromNullable(name), com.google.common.base.Optional.fromNullable(organization), com.google.common.base.Optional.fromNullable(phone), com.google.common.base.Optional.fromNullable(phoneExt), com.google.common.base.Optional.fromNullable(postalCode), com.google.common.base.Optional.fromNullable(state), com.google.common.base.Optional.fromNullable(stateCode), com.google.common.base.Optional.fromNullable(street), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static ParsedWhoisRegistrant create(final com.google.common.base.Optional<String> airportCode, final com.google.common.base.Optional<String> city, final com.google.common.base.Optional<String> country, final com.google.common.base.Optional<String> countryCode, final com.google.common.base.Optional<String> district, final com.google.common.base.Optional<String> email, final com.google.common.base.Optional<String> firstName, final com.google.common.base.Optional<String> handle, final com.google.common.base.Optional<String> lastName, final com.google.common.base.Optional<String> name, final com.google.common.base.Optional<String> organization, final com.google.common.base.Optional<String> phone, final com.google.common.base.Optional<String> phoneExt, final com.google.common.base.Optional<String> postalCode, final com.google.common.base.Optional<String> state, final com.google.common.base.Optional<String> stateCode, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) {
        return new ParsedWhoisRegistrant(airportCode, city, country, countryCode, district, email, firstName, handle, lastName, name, organization, phone, phoneExt, postalCode, state, stateCode, street, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ParsedWhoisRegistrant)) {
            return false;
        }

        final ParsedWhoisRegistrant other = (ParsedWhoisRegistrant)otherObject;

        if (!(((getAirportCode().isPresent() && other.getAirportCode().isPresent()) ? (getAirportCode().get().equals(other.getAirportCode().get())) : (!getAirportCode().isPresent() && !other.getAirportCode().isPresent())))) {
            return false;
        }

        if (!(((getCity().isPresent() && other.getCity().isPresent()) ? (getCity().get().equals(other.getCity().get())) : (!getCity().isPresent() && !other.getCity().isPresent())))) {
            return false;
        }

        if (!(((getCountry().isPresent() && other.getCountry().isPresent()) ? (getCountry().get().equals(other.getCountry().get())) : (!getCountry().isPresent() && !other.getCountry().isPresent())))) {
            return false;
        }

        if (!(((getCountryCode().isPresent() && other.getCountryCode().isPresent()) ? (getCountryCode().get().equals(other.getCountryCode().get())) : (!getCountryCode().isPresent() && !other.getCountryCode().isPresent())))) {
            return false;
        }

        if (!(((getDistrict().isPresent() && other.getDistrict().isPresent()) ? (getDistrict().get().equals(other.getDistrict().get())) : (!getDistrict().isPresent() && !other.getDistrict().isPresent())))) {
            return false;
        }

        if (!(((getEmail().isPresent() && other.getEmail().isPresent()) ? (getEmail().get().equals(other.getEmail().get())) : (!getEmail().isPresent() && !other.getEmail().isPresent())))) {
            return false;
        }

        if (!(((getFirstName().isPresent() && other.getFirstName().isPresent()) ? (getFirstName().get().equals(other.getFirstName().get())) : (!getFirstName().isPresent() && !other.getFirstName().isPresent())))) {
            return false;
        }

        if (!(((getHandle().isPresent() && other.getHandle().isPresent()) ? (getHandle().get().equals(other.getHandle().get())) : (!getHandle().isPresent() && !other.getHandle().isPresent())))) {
            return false;
        }

        if (!(((getLastName().isPresent() && other.getLastName().isPresent()) ? (getLastName().get().equals(other.getLastName().get())) : (!getLastName().isPresent() && !other.getLastName().isPresent())))) {
            return false;
        }

        if (!(((getName().isPresent() && other.getName().isPresent()) ? (getName().get().equals(other.getName().get())) : (!getName().isPresent() && !other.getName().isPresent())))) {
            return false;
        }

        if (!(((getOrganization().isPresent() && other.getOrganization().isPresent()) ? (getOrganization().get().equals(other.getOrganization().get())) : (!getOrganization().isPresent() && !other.getOrganization().isPresent())))) {
            return false;
        }

        if (!(((getPhone().isPresent() && other.getPhone().isPresent()) ? (getPhone().get().equals(other.getPhone().get())) : (!getPhone().isPresent() && !other.getPhone().isPresent())))) {
            return false;
        }

        if (!(((getPhoneExt().isPresent() && other.getPhoneExt().isPresent()) ? (getPhoneExt().get().equals(other.getPhoneExt().get())) : (!getPhoneExt().isPresent() && !other.getPhoneExt().isPresent())))) {
            return false;
        }

        if (!(((getPostalCode().isPresent() && other.getPostalCode().isPresent()) ? (getPostalCode().get().equals(other.getPostalCode().get())) : (!getPostalCode().isPresent() && !other.getPostalCode().isPresent())))) {
            return false;
        }

        if (!(((getState().isPresent() && other.getState().isPresent()) ? (getState().get().equals(other.getState().get())) : (!getState().isPresent() && !other.getState().isPresent())))) {
            return false;
        }

        if (!(((getStateCode().isPresent() && other.getStateCode().isPresent()) ? (getStateCode().get().equals(other.getStateCode().get())) : (!getStateCode().isPresent() && !other.getStateCode().isPresent())))) {
            return false;
        }

        if (!(((getStreet().isPresent() && other.getStreet().isPresent()) ? (getStreet().get().equals(other.getStreet().get())) : (!getStreet().isPresent() && !other.getStreet().isPresent())))) {
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
        case AIRPORT_CODE: return getAirportCode();
        case CITY: return getCity();
        case COUNTRY: return getCountry();
        case COUNTRY_CODE: return getCountryCode();
        case DISTRICT: return getDistrict();
        case EMAIL: return getEmail();
        case FIRST_NAME: return getFirstName();
        case HANDLE: return getHandle();
        case LAST_NAME: return getLastName();
        case NAME: return getName();
        case ORGANIZATION: return getOrganization();
        case PHONE: return getPhone();
        case PHONE_EXT: return getPhoneExt();
        case POSTAL_CODE: return getPostalCode();
        case STATE: return getState();
        case STATE_CODE: return getStateCode();
        case STREET: return getStreet();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getAirportCode() {
        return airportCode;
    }

    public final com.google.common.base.Optional<String> getCity() {
        return city;
    }

    public final com.google.common.base.Optional<String> getCountry() {
        return country;
    }

    public final com.google.common.base.Optional<String> getCountryCode() {
        return countryCode;
    }

    public final com.google.common.base.Optional<String> getDistrict() {
        return district;
    }

    public final com.google.common.base.Optional<String> getEmail() {
        return email;
    }

    public final com.google.common.base.Optional<String> getFirstName() {
        return firstName;
    }

    public final com.google.common.base.Optional<String> getHandle() {
        return handle;
    }

    public final com.google.common.base.Optional<String> getLastName() {
        return lastName;
    }

    public final com.google.common.base.Optional<String> getName() {
        return name;
    }

    public final com.google.common.base.Optional<String> getOrganization() {
        return organization;
    }

    public final com.google.common.base.Optional<String> getPhone() {
        return phone;
    }

    public final com.google.common.base.Optional<String> getPhoneExt() {
        return phoneExt;
    }

    public final com.google.common.base.Optional<String> getPostalCode() {
        return postalCode;
    }

    public final com.google.common.base.Optional<String> getState() {
        return state;
    }

    public final com.google.common.base.Optional<String> getStateCode() {
        return stateCode;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getStreet() {
        return street;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAirportCode().isPresent()) {
            hashCode = 31 * hashCode + getAirportCode().get().hashCode();
        }
        if (getCity().isPresent()) {
            hashCode = 31 * hashCode + getCity().get().hashCode();
        }
        if (getCountry().isPresent()) {
            hashCode = 31 * hashCode + getCountry().get().hashCode();
        }
        if (getCountryCode().isPresent()) {
            hashCode = 31 * hashCode + getCountryCode().get().hashCode();
        }
        if (getDistrict().isPresent()) {
            hashCode = 31 * hashCode + getDistrict().get().hashCode();
        }
        if (getEmail().isPresent()) {
            hashCode = 31 * hashCode + getEmail().get().hashCode();
        }
        if (getFirstName().isPresent()) {
            hashCode = 31 * hashCode + getFirstName().get().hashCode();
        }
        if (getHandle().isPresent()) {
            hashCode = 31 * hashCode + getHandle().get().hashCode();
        }
        if (getLastName().isPresent()) {
            hashCode = 31 * hashCode + getLastName().get().hashCode();
        }
        if (getName().isPresent()) {
            hashCode = 31 * hashCode + getName().get().hashCode();
        }
        if (getOrganization().isPresent()) {
            hashCode = 31 * hashCode + getOrganization().get().hashCode();
        }
        if (getPhone().isPresent()) {
            hashCode = 31 * hashCode + getPhone().get().hashCode();
        }
        if (getPhoneExt().isPresent()) {
            hashCode = 31 * hashCode + getPhoneExt().get().hashCode();
        }
        if (getPostalCode().isPresent()) {
            hashCode = 31 * hashCode + getPostalCode().get().hashCode();
        }
        if (getState().isPresent()) {
            hashCode = 31 * hashCode + getState().get().hashCode();
        }
        if (getStateCode().isPresent()) {
            hashCode = 31 * hashCode + getStateCode().get().hashCode();
        }
        if (getStreet().isPresent()) {
            hashCode = 31 * hashCode + getStreet().get().hashCode();
        }
        return hashCode;
    }

    public static ParsedWhoisRegistrant readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ParsedWhoisRegistrant readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ParsedWhoisRegistrant readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<String> airportCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> city = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> country = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> countryCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> district = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> email = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> firstName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> handle = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> lastName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> name = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> organization = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> phone = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> phoneExt = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> postalCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> state = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> stateCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                airportCode = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 1) {
                city = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                country = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                countryCode = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 4) {
                district = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 5) {
                email = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 6) {
                firstName = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 7) {
                handle = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 8) {
                lastName = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 9) {
                name = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 10) {
                organization = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 11) {
                phone = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 12) {
                phoneExt = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 13) {
                postalCode = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 14) {
                state = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 15) {
                stateCode = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 16) {
                try {
                    street = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STREET, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new ParsedWhoisRegistrant(DefaultReadValidator.getInstance().validateAirportCode(airportCode), DefaultReadValidator.getInstance().validateCity(city), DefaultReadValidator.getInstance().validateCountry(country), DefaultReadValidator.getInstance().validateCountryCode(countryCode), DefaultReadValidator.getInstance().validateDistrict(district), DefaultReadValidator.getInstance().validateEmail(email), DefaultReadValidator.getInstance().validateFirstName(firstName), DefaultReadValidator.getInstance().validateHandle(handle), DefaultReadValidator.getInstance().validateLastName(lastName), DefaultReadValidator.getInstance().validateName(name), DefaultReadValidator.getInstance().validateOrganization(organization), DefaultReadValidator.getInstance().validatePhone(phone), DefaultReadValidator.getInstance().validatePhoneExt(phoneExt), DefaultReadValidator.getInstance().validatePostalCode(postalCode), DefaultReadValidator.getInstance().validateState(state), DefaultReadValidator.getInstance().validateStateCode(stateCode), DefaultReadValidator.getInstance().validateStreet(street), NopConstructionValidator.getInstance());
    }

    public static ParsedWhoisRegistrant readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ParsedWhoisRegistrant readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<String> airportCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> city = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> country = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> countryCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> district = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> email = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> firstName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> handle = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> lastName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> name = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> organization = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> phone = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> phoneExt = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> postalCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> state = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> stateCode = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "airport_code": {
                    airportCode = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "city": {
                    city = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "country": {
                    country = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "country_code": {
                    countryCode = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "district": {
                    district = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "email": {
                    email = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "first_name": {
                    firstName = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "handle": {
                    handle = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "last_name": {
                    lastName = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "name": {
                    name = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "organization": {
                    organization = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "phone": {
                    phone = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "phone_ext": {
                    phoneExt = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "postal_code": {
                    postalCode = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "state": {
                    state = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "state_code": {
                    stateCode = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "street": {
                    try {
                        street = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STREET, e.getCause());
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
        return new ParsedWhoisRegistrant(DefaultReadValidator.getInstance().validateAirportCode(airportCode), DefaultReadValidator.getInstance().validateCity(city), DefaultReadValidator.getInstance().validateCountry(country), DefaultReadValidator.getInstance().validateCountryCode(countryCode), DefaultReadValidator.getInstance().validateDistrict(district), DefaultReadValidator.getInstance().validateEmail(email), DefaultReadValidator.getInstance().validateFirstName(firstName), DefaultReadValidator.getInstance().validateHandle(handle), DefaultReadValidator.getInstance().validateLastName(lastName), DefaultReadValidator.getInstance().validateName(name), DefaultReadValidator.getInstance().validateOrganization(organization), DefaultReadValidator.getInstance().validatePhone(phone), DefaultReadValidator.getInstance().validatePhoneExt(phoneExt), DefaultReadValidator.getInstance().validatePostalCode(postalCode), DefaultReadValidator.getInstance().validateState(state), DefaultReadValidator.getInstance().validateStateCode(stateCode), DefaultReadValidator.getInstance().validateStreet(street), NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceAirportCode(final com.google.common.base.Optional<String> airportCode) {
        return new ParsedWhoisRegistrant(DefaultConstructionValidator.getInstance().validateAirportCode(airportCode), this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceAirportCode(final String airportCode) {
        return replaceAirportCode(com.google.common.base.Optional.fromNullable(airportCode));
    }

    public ParsedWhoisRegistrant replaceCity(final com.google.common.base.Optional<String> city) {
        return new ParsedWhoisRegistrant(this.airportCode, DefaultConstructionValidator.getInstance().validateCity(city), this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceCity(final String city) {
        return replaceCity(com.google.common.base.Optional.fromNullable(city));
    }

    public ParsedWhoisRegistrant replaceCountry(final com.google.common.base.Optional<String> country) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, DefaultConstructionValidator.getInstance().validateCountry(country), this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceCountryCode(final com.google.common.base.Optional<String> countryCode) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, DefaultConstructionValidator.getInstance().validateCountryCode(countryCode), this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceCountryCode(final String countryCode) {
        return replaceCountryCode(com.google.common.base.Optional.fromNullable(countryCode));
    }

    public ParsedWhoisRegistrant replaceCountry(final String country) {
        return replaceCountry(com.google.common.base.Optional.fromNullable(country));
    }

    public ParsedWhoisRegistrant replaceDistrict(final com.google.common.base.Optional<String> district) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, DefaultConstructionValidator.getInstance().validateDistrict(district), this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceDistrict(final String district) {
        return replaceDistrict(com.google.common.base.Optional.fromNullable(district));
    }

    public ParsedWhoisRegistrant replaceEmail(final com.google.common.base.Optional<String> email) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, DefaultConstructionValidator.getInstance().validateEmail(email), this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceEmail(final String email) {
        return replaceEmail(com.google.common.base.Optional.fromNullable(email));
    }

    public ParsedWhoisRegistrant replaceFirstName(final com.google.common.base.Optional<String> firstName) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, DefaultConstructionValidator.getInstance().validateFirstName(firstName), this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceFirstName(final String firstName) {
        return replaceFirstName(com.google.common.base.Optional.fromNullable(firstName));
    }

    public ParsedWhoisRegistrant replaceHandle(final com.google.common.base.Optional<String> handle) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, DefaultConstructionValidator.getInstance().validateHandle(handle), this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceHandle(final String handle) {
        return replaceHandle(com.google.common.base.Optional.fromNullable(handle));
    }

    public ParsedWhoisRegistrant replaceLastName(final com.google.common.base.Optional<String> lastName) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, DefaultConstructionValidator.getInstance().validateLastName(lastName), this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceLastName(final String lastName) {
        return replaceLastName(com.google.common.base.Optional.fromNullable(lastName));
    }

    public ParsedWhoisRegistrant replaceName(final com.google.common.base.Optional<String> name) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, DefaultConstructionValidator.getInstance().validateName(name), this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceName(final String name) {
        return replaceName(com.google.common.base.Optional.fromNullable(name));
    }

    public ParsedWhoisRegistrant replaceOrganization(final com.google.common.base.Optional<String> organization) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, DefaultConstructionValidator.getInstance().validateOrganization(organization), this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceOrganization(final String organization) {
        return replaceOrganization(com.google.common.base.Optional.fromNullable(organization));
    }

    public ParsedWhoisRegistrant replacePhone(final com.google.common.base.Optional<String> phone) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, DefaultConstructionValidator.getInstance().validatePhone(phone), this.phoneExt, this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replacePhone(final String phone) {
        return replacePhone(com.google.common.base.Optional.fromNullable(phone));
    }

    public ParsedWhoisRegistrant replacePhoneExt(final com.google.common.base.Optional<String> phoneExt) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, DefaultConstructionValidator.getInstance().validatePhoneExt(phoneExt), this.postalCode, this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replacePhoneExt(final String phoneExt) {
        return replacePhoneExt(com.google.common.base.Optional.fromNullable(phoneExt));
    }

    public ParsedWhoisRegistrant replacePostalCode(final com.google.common.base.Optional<String> postalCode) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, DefaultConstructionValidator.getInstance().validatePostalCode(postalCode), this.state, this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replacePostalCode(final String postalCode) {
        return replacePostalCode(com.google.common.base.Optional.fromNullable(postalCode));
    }

    public ParsedWhoisRegistrant replaceState(final com.google.common.base.Optional<String> state) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, DefaultConstructionValidator.getInstance().validateState(state), this.stateCode, this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceStateCode(final com.google.common.base.Optional<String> stateCode) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, DefaultConstructionValidator.getInstance().validateStateCode(stateCode), this.street, NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceStateCode(final String stateCode) {
        return replaceStateCode(com.google.common.base.Optional.fromNullable(stateCode));
    }

    public ParsedWhoisRegistrant replaceState(final String state) {
        return replaceState(com.google.common.base.Optional.fromNullable(state));
    }

    public ParsedWhoisRegistrant replaceStreet(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street) {
        return new ParsedWhoisRegistrant(this.airportCode, this.city, this.country, this.countryCode, this.district, this.email, this.firstName, this.handle, this.lastName, this.name, this.organization, this.phone, this.phoneExt, this.postalCode, this.state, this.stateCode, DefaultConstructionValidator.getInstance().validateStreet(street), NopConstructionValidator.getInstance());
    }

    public ParsedWhoisRegistrant replaceStreet(final com.google.common.collect.ImmutableList<String> street) {
        return replaceStreet(com.google.common.base.Optional.fromNullable(street));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("airport_code", getAirportCode().orNull()).add("city", getCity().orNull()).add("country", getCountry().orNull()).add("country_code", getCountryCode().orNull()).add("district", getDistrict().orNull()).add("email", getEmail().orNull()).add("first_name", getFirstName().orNull()).add("handle", getHandle().orNull()).add("last_name", getLastName().orNull()).add("name", getName().orNull()).add("organization", getOrganization().orNull()).add("phone", getPhone().orNull()).add("phone_ext", getPhoneExt().orNull()).add("postal_code", getPostalCode().orNull()).add("state", getState().orNull()).add("state_code", getStateCode().orNull()).add("street", getStreet().orNull()).toString();
    }

    public void writeAirportCodeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAirportCode().isPresent()) {
            oprot.writeFieldBegin("airport_code", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getAirportCode().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 17);

        if (getAirportCode().isPresent()) {
            oprot.writeString(getAirportCode().get());
        } else {
            oprot.writeNull();
        }

        if (getCity().isPresent()) {
            oprot.writeString(getCity().get());
        } else {
            oprot.writeNull();
        }

        if (getCountry().isPresent()) {
            oprot.writeString(getCountry().get());
        } else {
            oprot.writeNull();
        }

        if (getCountryCode().isPresent()) {
            oprot.writeString(getCountryCode().get());
        } else {
            oprot.writeNull();
        }

        if (getDistrict().isPresent()) {
            oprot.writeString(getDistrict().get());
        } else {
            oprot.writeNull();
        }

        if (getEmail().isPresent()) {
            oprot.writeString(getEmail().get());
        } else {
            oprot.writeNull();
        }

        if (getFirstName().isPresent()) {
            oprot.writeString(getFirstName().get());
        } else {
            oprot.writeNull();
        }

        if (getHandle().isPresent()) {
            oprot.writeString(getHandle().get());
        } else {
            oprot.writeNull();
        }

        if (getLastName().isPresent()) {
            oprot.writeString(getLastName().get());
        } else {
            oprot.writeNull();
        }

        if (getName().isPresent()) {
            oprot.writeString(getName().get());
        } else {
            oprot.writeNull();
        }

        if (getOrganization().isPresent()) {
            oprot.writeString(getOrganization().get());
        } else {
            oprot.writeNull();
        }

        if (getPhone().isPresent()) {
            oprot.writeString(getPhone().get());
        } else {
            oprot.writeNull();
        }

        if (getPhoneExt().isPresent()) {
            oprot.writeString(getPhoneExt().get());
        } else {
            oprot.writeNull();
        }

        if (getPostalCode().isPresent()) {
            oprot.writeString(getPostalCode().get());
        } else {
            oprot.writeNull();
        }

        if (getState().isPresent()) {
            oprot.writeString(getState().get());
        } else {
            oprot.writeNull();
        }

        if (getStateCode().isPresent()) {
            oprot.writeString(getStateCode().get());
        } else {
            oprot.writeNull();
        }

        if (getStreet().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getStreet().get().size());
            for (final String _iter0 : getStreet().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("io.github.minorg.whoisclient.ParsedWhoisRegistrant");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCityField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCity().isPresent()) {
            oprot.writeFieldBegin("city", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getCity().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeCountryCodeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCountryCode().isPresent()) {
            oprot.writeFieldBegin("country_code", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getCountryCode().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeCountryField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCountry().isPresent()) {
            oprot.writeFieldBegin("country", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getCountry().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeDistrictField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDistrict().isPresent()) {
            oprot.writeFieldBegin("district", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getDistrict().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeEmailField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getEmail().isPresent()) {
            oprot.writeFieldBegin("email", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getEmail().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeAirportCodeField(oprot);

        writeCityField(oprot);

        writeCountryField(oprot);

        writeCountryCodeField(oprot);

        writeDistrictField(oprot);

        writeEmailField(oprot);

        writeFirstNameField(oprot);

        writeHandleField(oprot);

        writeLastNameField(oprot);

        writeNameField(oprot);

        writeOrganizationField(oprot);

        writePhoneField(oprot);

        writePhoneExtField(oprot);

        writePostalCodeField(oprot);

        writeStateField(oprot);

        writeStateCodeField(oprot);

        writeStreetField(oprot);

        oprot.writeFieldStop();
    }

    public void writeFirstNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFirstName().isPresent()) {
            oprot.writeFieldBegin("first_name", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getFirstName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeHandleField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHandle().isPresent()) {
            oprot.writeFieldBegin("handle", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getHandle().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeLastNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLastName().isPresent()) {
            oprot.writeFieldBegin("last_name", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getLastName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getName().isPresent()) {
            oprot.writeFieldBegin("name", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeOrganizationField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getOrganization().isPresent()) {
            oprot.writeFieldBegin("organization", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getOrganization().get());
            oprot.writeFieldEnd();
        }
    }

    public void writePhoneExtField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPhoneExt().isPresent()) {
            oprot.writeFieldBegin("phone_ext", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getPhoneExt().get());
            oprot.writeFieldEnd();
        }
    }

    public void writePhoneField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPhone().isPresent()) {
            oprot.writeFieldBegin("phone", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getPhone().get());
            oprot.writeFieldEnd();
        }
    }

    public void writePostalCodeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPostalCode().isPresent()) {
            oprot.writeFieldBegin("postal_code", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getPostalCode().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeStateCodeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getStateCode().isPresent()) {
            oprot.writeFieldBegin("state_code", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getStateCode().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeStateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getState().isPresent()) {
            oprot.writeFieldBegin("state", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getState().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeStreetField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getStreet().isPresent()) {
            oprot.writeFieldBegin("street", org.thryft.protocol.Type.LIST, (short)0);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getStreet().get().size());
            for (final String _iter0 : getStreet().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    private final com.google.common.base.Optional<String> airportCode;

    private final com.google.common.base.Optional<String> city;

    private final com.google.common.base.Optional<String> country;

    private final com.google.common.base.Optional<String> countryCode;

    private final com.google.common.base.Optional<String> district;

    private final com.google.common.base.Optional<String> email;

    private final com.google.common.base.Optional<String> firstName;

    private final com.google.common.base.Optional<String> handle;

    private final com.google.common.base.Optional<String> lastName;

    private final com.google.common.base.Optional<String> name;

    private final com.google.common.base.Optional<String> organization;

    private final com.google.common.base.Optional<String> phone;

    private final com.google.common.base.Optional<String> phoneExt;

    private final com.google.common.base.Optional<String> postalCode;

    private final com.google.common.base.Optional<String> state;

    private final com.google.common.base.Optional<String> stateCode;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> street;
}

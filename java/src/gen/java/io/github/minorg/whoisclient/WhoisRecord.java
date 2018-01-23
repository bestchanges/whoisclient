package io.github.minorg.whoisclient;

public final class WhoisRecord implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            metadata = null;
            parsed = null;
            text = null;
        }

        public Builder(final WhoisRecord other) {
            this.metadata = other.getMetadata();
            this.parsed = other.getParsed();
            this.text = other.getText();
        }

        protected WhoisRecord _build(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata, final io.github.minorg.whoisclient.ParsedWhoisRecord parsed, final String text) {
            return new WhoisRecord(metadata, parsed, text);
        }

        public WhoisRecord build() {
            UncheckedValidator.validate(metadata, parsed, text);

            return _build(metadata, parsed, text);
        }

        public final @javax.annotation.Nullable io.github.minorg.whoisclient.WhoisRecordMetadata getMetadata() {
            return metadata;
        }

        public final @javax.annotation.Nullable io.github.minorg.whoisclient.ParsedWhoisRecord getParsed() {
            return parsed;
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
                metadata = io.github.minorg.whoisclient.WhoisRecordMetadata.readAsStruct(iprot);
                parsed = io.github.minorg.whoisclient.ParsedWhoisRecord.readAsStruct(iprot);
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
                    case "metadata": {
                        metadata = io.github.minorg.whoisclient.WhoisRecordMetadata.readAsStruct(iprot, unknownFieldCallback);
                        break;
                    }
                    case "parsed": {
                        parsed = io.github.minorg.whoisclient.ParsedWhoisRecord.readAsStruct(iprot, unknownFieldCallback);
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case METADATA: setMetadata((io.github.minorg.whoisclient.WhoisRecordMetadata)value); return this;
            case PARSED: setParsed((io.github.minorg.whoisclient.ParsedWhoisRecord)value); return this;
            case TEXT: setText((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setIfPresent(final WhoisRecord other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setMetadata(other.getMetadata());
            setParsed(other.getParsed());
            setText(other.getText());

            return this;
        }

        public Builder setMetadata(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata) {
            UncheckedValidator.validateMetadata(metadata);
            this.metadata = metadata;
            return this;
        }

        public Builder setParsed(final io.github.minorg.whoisclient.ParsedWhoisRecord parsed) {
            UncheckedValidator.validateParsed(parsed);
            this.parsed = parsed;
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
            case METADATA: return unsetMetadata();
            case PARSED: return unsetParsed();
            case TEXT: return unsetText();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetMetadata() {
            this.metadata = null;
            return this;
        }

        public Builder unsetParsed() {
            this.parsed = null;
            return this;
        }

        public Builder unsetText() {
            this.text = null;
            return this;
        }

        private @javax.annotation.Nullable io.github.minorg.whoisclient.WhoisRecordMetadata metadata;
        private @javax.annotation.Nullable io.github.minorg.whoisclient.ParsedWhoisRecord parsed;
        private @javax.annotation.Nullable String text;
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
        METADATA("metadata", new com.google.common.reflect.TypeToken<io.github.minorg.whoisclient.WhoisRecordMetadata>() {}, true, (short)0, "metadata", org.thryft.protocol.Type.STRUCT),
        PARSED("parsed", new com.google.common.reflect.TypeToken<io.github.minorg.whoisclient.ParsedWhoisRecord>() {}, true, (short)0, "parsed", org.thryft.protocol.Type.STRUCT),
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
            case "metadata": return METADATA;
            case "parsed": return PARSED;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "metadata": return METADATA;
            case "parsed": return PARSED;
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
        public static void validate(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata, final io.github.minorg.whoisclient.ParsedWhoisRecord parsed, final String text) throws org.thryft.protocol.InputProtocolException {
            validateMetadata(metadata);
            validateParsed(parsed);
            validateText(text);
        }

        public static void validateMetadata(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata) throws org.thryft.protocol.InputProtocolException {
            if (metadata == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.METADATA, "io.github.minorg.whoisclient.WhoisRecord: metadata is null");
            }
        }

        public static void validateParsed(final io.github.minorg.whoisclient.ParsedWhoisRecord parsed) throws org.thryft.protocol.InputProtocolException {
            if (parsed == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PARSED, "io.github.minorg.whoisclient.WhoisRecord: parsed is null");
            }
        }

        public static void validateText(final String text) throws org.thryft.protocol.InputProtocolException {
            if (text == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXT, "io.github.minorg.whoisclient.WhoisRecord: text is null");
            }
            {
                final int __strLen = text.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, String.format("io.github.minorg.whoisclient.WhoisRecord.text: blank '%s' (length=%d)", text, __strLen));
                }
            }
            if (text.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXT, "io.github.minorg.whoisclient.WhoisRecord.text: less than min length 1");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata, final io.github.minorg.whoisclient.ParsedWhoisRecord parsed, final String text) {
            validateMetadata(metadata);
            validateParsed(parsed);
            validateText(text);
        }

        public static void validateMetadata(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata) {
            if (metadata == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.WhoisRecord: metadata is null");
            }
        }

        public static void validateParsed(final io.github.minorg.whoisclient.ParsedWhoisRecord parsed) {
            if (parsed == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.WhoisRecord: parsed is null");
            }
        }

        public static void validateText(final String text) {
            if (text == null) {
                throw new NullPointerException("io.github.minorg.whoisclient.WhoisRecord: text is null");
            }
            {
                final int __strLen = text.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(text.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("io.github.minorg.whoisclient.WhoisRecord.text: blank '%s' (length=%d)", text, __strLen));
                }
            }
            if (text.isEmpty()) {
                throw new IllegalArgumentException("io.github.minorg.whoisclient.WhoisRecord.text: less than min length 1");
            }
        }
    }

    /**
     * Copy constructor
     */
    public WhoisRecord(final WhoisRecord other) {
        this(other.getMetadata(), other.getParsed(), other.getText());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WhoisRecord(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata, final io.github.minorg.whoisclient.ParsedWhoisRecord parsed, final String text) {
        this.metadata = metadata;
        this.parsed = parsed;
        this.text = text;
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
     * Optional factory method
     */
    public static WhoisRecord create(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata, final io.github.minorg.whoisclient.ParsedWhoisRecord parsed, final String text) {
        UncheckedValidator.validate(metadata, parsed, text);
        return new WhoisRecord(metadata, parsed, text);
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

        if (!(getMetadata().equals(other.getMetadata()))) {
            return false;
        }

        if (!(getParsed().equals(other.getParsed()))) {
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
        case METADATA: return getMetadata();
        case PARSED: return getParsed();
        case TEXT: return getText();
        default:
            throw new IllegalStateException();
        }
    }

    public final io.github.minorg.whoisclient.WhoisRecordMetadata getMetadata() {
        return metadata;
    }

    public final io.github.minorg.whoisclient.ParsedWhoisRecord getParsed() {
        return parsed;
    }

    public final String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMetadata().hashCode();
        hashCode = 31 * hashCode + getParsed().hashCode();
        hashCode = 31 * hashCode + getText().hashCode();
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
        io.github.minorg.whoisclient.WhoisRecordMetadata metadata;
        io.github.minorg.whoisclient.ParsedWhoisRecord parsed;
        String text;

        try {
            iprot.readListBegin();
            metadata = io.github.minorg.whoisclient.WhoisRecordMetadata.readAsStruct(iprot);
            parsed = io.github.minorg.whoisclient.ParsedWhoisRecord.readAsStruct(iprot);
            text = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(metadata, parsed, text);

        return new WhoisRecord(metadata, parsed, text);
    }

    public static WhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WhoisRecord readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable io.github.minorg.whoisclient.WhoisRecordMetadata metadata = null;
        @javax.annotation.Nullable io.github.minorg.whoisclient.ParsedWhoisRecord parsed = null;
        @javax.annotation.Nullable String text = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "metadata": {
                    metadata = io.github.minorg.whoisclient.WhoisRecordMetadata.readAsStruct(iprot, unknownFieldCallback);
                    break;
                }
                case "parsed": {
                    parsed = io.github.minorg.whoisclient.ParsedWhoisRecord.readAsStruct(iprot, unknownFieldCallback);
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

        ReadValidator.validate(metadata, parsed, text);

        return new WhoisRecord(metadata, parsed, text);
    }

    public WhoisRecord replaceMetadata(final io.github.minorg.whoisclient.WhoisRecordMetadata metadata) {
        UncheckedValidator.validateMetadata(metadata);
        return new WhoisRecord(metadata, this.parsed, this.text);
    }

    public WhoisRecord replaceParsed(final io.github.minorg.whoisclient.ParsedWhoisRecord parsed) {
        UncheckedValidator.validateParsed(parsed);
        return new WhoisRecord(this.metadata, parsed, this.text);
    }

    public WhoisRecord replaceText(final String text) {
        UncheckedValidator.validateText(text);
        return new WhoisRecord(this.metadata, this.parsed, text);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("metadata", getMetadata()).add("parsed", getParsed()).add("text", getText()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        getMetadata().writeAsStruct(oprot);

        getParsed().writeAsStruct(oprot);

        oprot.writeString(getText());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("io.github.minorg.whoisclient.WhoisRecord");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeMetadataField(oprot);

        writeParsedField(oprot);

        writeTextField(oprot);

        oprot.writeFieldStop();
    }

    public void writeMetadataField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.METADATA);
        getMetadata().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeParsedField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.PARSED);
        getParsed().writeAsStruct(oprot);
        oprot.writeFieldEnd();
    }

    public void writeTextField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TEXT);
        oprot.writeString(getText());
        oprot.writeFieldEnd();
    }

    private final io.github.minorg.whoisclient.WhoisRecordMetadata metadata;

    private final io.github.minorg.whoisclient.ParsedWhoisRecord parsed;

    private final String text;
}

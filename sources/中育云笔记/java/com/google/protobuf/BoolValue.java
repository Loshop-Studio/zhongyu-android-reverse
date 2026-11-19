package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class BoolValue extends GeneratedMessage implements BoolValueOrBuilder {
    private static final BoolValue DEFAULT_INSTANCE;
    private static final Parser<BoolValue> PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private boolean value_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 1, "", BoolValue.class.getName());
        DEFAULT_INSTANCE = new BoolValue();
        PARSER = new AbstractParser<BoolValue>() { // from class: com.google.protobuf.BoolValue.1
            @Override // com.google.protobuf.Parser
            public BoolValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BoolValue.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    /* renamed from: of */
    public static BoolValue m8206of(boolean z10) {
        return newBuilder().setValue(z10).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<BoolValue> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoolValue)) {
            return super.equals(obj);
        }
        BoolValue boolValue = (BoolValue) obj;
        return getValue() == boolValue.getValue() && getUnknownFields().equals(boolValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<BoolValue> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.value_;
        int iComputeBoolSize = (z10 ? CodedOutputStream.computeBoolSize(1, z10) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeBoolSize;
        return iComputeBoolSize;
    }

    @Override // com.google.protobuf.BoolValueOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getValue())) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable.ensureFieldAccessorsInitialized(BoolValue.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z10 = this.value_;
        if (z10) {
            codedOutputStream.writeBool(1, z10);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements BoolValueOrBuilder {
        private int bitField0_;
        private boolean value_;

        private void buildPartial0(BoolValue boolValue) {
            if ((this.bitField0_ & 1) != 0) {
                boolValue.value_ = this.value_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
        }

        public Builder clearValue() {
            this.bitField0_ &= -2;
            this.value_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
        }

        @Override // com.google.protobuf.BoolValueOrBuilder
        public boolean getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable.ensureFieldAccessorsInitialized(BoolValue.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setValue(boolean z10) {
            this.value_ = z10;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private Builder() {
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BoolValue build() {
            BoolValue boolValueBuildPartial = buildPartial();
            if (boolValueBuildPartial.isInitialized()) {
                return boolValueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) boolValueBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BoolValue buildPartial() {
            BoolValue boolValue = new BoolValue(this);
            if (this.bitField0_ != 0) {
                buildPartial0(boolValue);
            }
            onBuilt();
            return boolValue;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BoolValue getDefaultInstanceForType() {
            return BoolValue.getDefaultInstance();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.value_ = false;
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof BoolValue) {
                return mergeFrom((BoolValue) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BoolValue boolValue) {
            if (boolValue == BoolValue.getDefaultInstance()) {
                return this;
            }
            if (boolValue.getValue()) {
                setValue(boolValue.getValue());
            }
            mergeUnknownFields(boolValue.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.value_ = codedInputStream.readBool();
                                this.bitField0_ |= 1;
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    private BoolValue(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(BoolValue boolValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(boolValue);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BoolValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BoolValue parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public BoolValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static BoolValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private BoolValue() {
        this.value_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static BoolValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BoolValue parseFrom(InputStream inputStream) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BoolValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}

package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Duration extends GeneratedMessage implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static final Parser<Duration> PARSER;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int nanos_;
    private long seconds_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 1, "", Duration.class.getName());
        DEFAULT_INSTANCE = new Duration();
        PARSER = new AbstractParser<Duration>() { // from class: com.google.protobuf.Duration.1
            @Override // com.google.protobuf.Parser
            public Duration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Duration.newBuilder();
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

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DurationProto.internal_static_google_protobuf_Duration_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) {
        return (Duration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Duration> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return super.equals(obj);
        }
        Duration duration = (Duration) obj;
        return getSeconds() == duration.getSeconds() && getNanos() == duration.getNanos() && getUnknownFields().equals(duration.getUnknownFields());
    }

    @Override // com.google.protobuf.DurationOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Duration> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.DurationOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        long j10 = this.seconds_;
        int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
        int i11 = this.nanos_;
        if (i11 != 0) {
            iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i11);
        }
        int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getSeconds())) * 37) + 2) * 53) + getNanos()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(Duration.class, Builder.class);
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
        long j10 = this.seconds_;
        if (j10 != 0) {
            codedOutputStream.writeInt64(1, j10);
        }
        int i10 = this.nanos_;
        if (i10 != 0) {
            codedOutputStream.writeInt32(2, i10);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements DurationOrBuilder {
        private int bitField0_;
        private int nanos_;
        private long seconds_;

        private void buildPartial0(Duration duration) {
            int i10 = this.bitField0_;
            if ((i10 & 1) != 0) {
                duration.seconds_ = this.seconds_;
            }
            if ((i10 & 2) != 0) {
                duration.nanos_ = this.nanos_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DurationProto.internal_static_google_protobuf_Duration_descriptor;
        }

        public Builder clearNanos() {
            this.bitField0_ &= -3;
            this.nanos_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeconds() {
            this.bitField0_ &= -2;
            this.seconds_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DurationProto.internal_static_google_protobuf_Duration_descriptor;
        }

        @Override // com.google.protobuf.DurationOrBuilder
        public int getNanos() {
            return this.nanos_;
        }

        @Override // com.google.protobuf.DurationOrBuilder
        public long getSeconds() {
            return this.seconds_;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(Duration.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setNanos(int i10) {
            this.nanos_ = i10;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setSeconds(long j10) {
            this.seconds_ = j10;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private Builder() {
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Duration build() {
            Duration durationBuildPartial = buildPartial();
            if (durationBuildPartial.isInitialized()) {
                return durationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) durationBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Duration buildPartial() {
            Duration duration = new Duration(this);
            if (this.bitField0_ != 0) {
                buildPartial0(duration);
            }
            onBuilt();
            return duration;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Duration getDefaultInstanceForType() {
            return Duration.getDefaultInstance();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.seconds_ = 0L;
            this.nanos_ = 0;
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Duration) {
                return mergeFrom((Duration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Duration duration) {
            if (duration == Duration.getDefaultInstance()) {
                return this;
            }
            if (duration.getSeconds() != 0) {
                setSeconds(duration.getSeconds());
            }
            if (duration.getNanos() != 0) {
                setNanos(duration.getNanos());
            }
            mergeUnknownFields(duration.getUnknownFields());
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
                            if (tag == 8) {
                                this.seconds_ = codedInputStream.readInt64();
                                this.bitField0_ |= 1;
                            } else if (tag != 16) {
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.nanos_ = codedInputStream.readInt32();
                                this.bitField0_ |= 2;
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

    private Duration(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(Duration duration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(duration);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Duration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Duration parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Duration getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Duration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Duration parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private Duration() {
        this.seconds_ = 0L;
        this.nanos_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Duration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Duration parseFrom(InputStream inputStream) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Duration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Duration) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}

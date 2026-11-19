package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Empty extends GeneratedMessage implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static final Parser<Empty> PARSER;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 1, "", Empty.class.getName());
        DEFAULT_INSTANCE = new Empty();
        PARSER = new AbstractParser<Empty>() { // from class: com.google.protobuf.Empty.1
            @Override // com.google.protobuf.Parser
            public Empty parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Empty.newBuilder();
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

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Empty> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof Empty) ? super.equals(obj) : getUnknownFields().equals(((Empty) obj).getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Empty> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable.ensureFieldAccessorsInitialized(Empty.class, Builder.class);
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
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements EmptyOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable.ensureFieldAccessorsInitialized(Empty.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private Builder() {
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Empty build() {
            Empty emptyBuildPartial = buildPartial();
            if (emptyBuildPartial.isInitialized()) {
                return emptyBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) emptyBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Empty buildPartial() {
            Empty empty = new Empty(this);
            onBuilt();
            return empty;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Empty getDefaultInstanceForType() {
            return Empty.getDefaultInstance();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Empty) {
                return mergeFrom((Empty) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Empty empty) {
            if (empty == Empty.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(empty.getUnknownFields());
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
                        if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                            z10 = true;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }
    }

    private Empty(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(Empty empty) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(empty);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Empty parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Empty getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private Empty() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Empty parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Empty parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Empty parseFrom(InputStream inputStream) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Empty parseFrom(CodedInputStream codedInputStream) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static Empty parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}

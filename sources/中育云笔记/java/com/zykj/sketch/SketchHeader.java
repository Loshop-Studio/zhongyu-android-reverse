package com.zykj.sketch;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class SketchHeader {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_Header_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Header_fieldAccessorTable;

    public static final class Header extends GeneratedMessageV3 implements HeaderOrBuilder {
        public static final int AUTHOR_FIELD_NUMBER = 6;
        public static final int CREATEDATE_FIELD_NUMBER = 4;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 7;
        public static final int UPDATEDATE_FIELD_NUMBER = 5;
        public static final int VERSION_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object author_;
        private long createDate_;
        private int height_;
        private byte memoizedIsInitialized;
        private int type_;
        private long updateDate_;
        private int version_;
        private int width_;
        private static final Header DEFAULT_INSTANCE = new Header();
        private static final Parser<Header> PARSER = new AbstractParser<Header>() { // from class: com.zykj.sketch.SketchHeader.Header.1
            @Override // com.google.protobuf.Parser
            public Header parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Header(codedInputStream, extensionRegistryLite);
            }
        };

        public static Header getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SketchHeader.internal_static_Header_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Header parseDelimitedFrom(InputStream inputStream) {
            return (Header) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Header parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Header> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return super.equals(obj);
            }
            Header header = (Header) obj;
            return getVersion() == header.getVersion() && getWidth() == header.getWidth() && getHeight() == header.getHeight() && getCreateDate() == header.getCreateDate() && getUpdateDate() == header.getUpdateDate() && getAuthor().equals(header.getAuthor()) && getType() == header.getType();
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public String getAuthor() {
            Object obj = this.author_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.author_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public ByteString getAuthorBytes() {
            Object obj = this.author_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.author_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public long getCreateDate() {
            return this.createDate_;
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Header> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.version_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.width_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.height_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            long j10 = this.createDate_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j10);
            }
            long j11 = this.updateDate_;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j11);
            }
            if (!getAuthorBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(6, this.author_);
            }
            int i14 = this.type_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, i14);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public long getUpdateDate() {
            return this.updateDate_;
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + Internal.hashLong(getCreateDate())) * 37) + 5) * 53) + Internal.hashLong(getUpdateDate())) * 37) + 6) * 53) + getAuthor().hashCode()) * 37) + 7) * 53) + getType()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SketchHeader.internal_static_Header_fieldAccessorTable.ensureFieldAccessorsInitialized(Header.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
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
            int i10 = this.version_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.width_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            long j10 = this.createDate_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(4, j10);
            }
            long j11 = this.updateDate_;
            if (j11 != 0) {
                codedOutputStream.writeInt64(5, j11);
            }
            if (!getAuthorBytes().isEmpty()) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.author_);
            }
            int i13 = this.type_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(7, i13);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderOrBuilder {
            private Object author_;
            private long createDate_;
            private int height_;
            private int type_;
            private long updateDate_;
            private int version_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SketchHeader.internal_static_Header_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAuthor() {
                this.author_ = Header.getDefaultInstance().getAuthor();
                onChanged();
                return this;
            }

            public Builder clearCreateDate() {
                this.createDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdateDate() {
                this.updateDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public String getAuthor() {
                Object obj = this.author_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.author_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public ByteString getAuthorBytes() {
                Object obj = this.author_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.author_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public long getCreateDate() {
                return this.createDate_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SketchHeader.internal_static_Header_descriptor;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public long getUpdateDate() {
                return this.updateDate_;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.zykj.sketch.SketchHeader.HeaderOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SketchHeader.internal_static_Header_fieldAccessorTable.ensureFieldAccessorsInitialized(Header.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setAuthor(String str) {
                str.getClass();
                this.author_ = str;
                onChanged();
                return this;
            }

            public Builder setAuthorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.author_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCreateDate(long j10) {
                this.createDate_ = j10;
                onChanged();
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setUpdateDate(long j10) {
                this.updateDate_ = j10;
                onChanged();
                return this;
            }

            public Builder setVersion(int i10) {
                this.version_ = i10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.author_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Header build() {
                Header headerBuildPartial = buildPartial();
                if (headerBuildPartial.isInitialized()) {
                    return headerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Header buildPartial() {
                Header header = new Header(this);
                header.version_ = this.version_;
                header.width_ = this.width_;
                header.height_ = this.height_;
                header.createDate_ = this.createDate_;
                header.updateDate_ = this.updateDate_;
                header.author_ = this.author_;
                header.type_ = this.type_;
                onBuilt();
                return header;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Header getDefaultInstanceForType() {
                return Header.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.version_ = 0;
                this.width_ = 0;
                this.height_ = 0;
                this.createDate_ = 0L;
                this.updateDate_ = 0L;
                this.author_ = "";
                this.type_ = 0;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.author_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder m33981clone() {
                return (Builder) super.m33981clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Header) {
                    return mergeFrom((Header) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Header header) {
                if (header == Header.getDefaultInstance()) {
                    return this;
                }
                if (header.getVersion() != 0) {
                    setVersion(header.getVersion());
                }
                if (header.getWidth() != 0) {
                    setWidth(header.getWidth());
                }
                if (header.getHeight() != 0) {
                    setHeight(header.getHeight());
                }
                if (header.getCreateDate() != 0) {
                    setCreateDate(header.getCreateDate());
                }
                if (header.getUpdateDate() != 0) {
                    setUpdateDate(header.getUpdateDate());
                }
                if (!header.getAuthor().isEmpty()) {
                    this.author_ = header.author_;
                    onChanged();
                }
                if (header.getType() != 0) {
                    setType(header.getType());
                }
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.SketchHeader.Header.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.SketchHeader.Header.access$1300()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.SketchHeader$Header r3 = (com.zykj.sketch.SketchHeader.Header) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.sketch.SketchHeader$Header r4 = (com.zykj.sketch.SketchHeader.Header) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.SketchHeader.Header.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.SketchHeader$Header$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/SketchHeader$Header$Builder.smali:977
            }
        }

        public static Builder newBuilder(Header header) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(header);
        }

        public static Header parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Header(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Header parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Header parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Header getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Header parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Header() {
            this.memoizedIsInitialized = (byte) -1;
            this.version_ = 0;
            this.width_ = 0;
            this.height_ = 0;
            this.createDate_ = 0L;
            this.updateDate_ = 0L;
            this.author_ = "";
            this.type_ = 0;
        }

        public static Header parseFrom(InputStream inputStream) {
            return (Header) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Header parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Header parseFrom(CodedInputStream codedInputStream) {
            return (Header) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static Header parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Header(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.version_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.width_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.height_ = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.createDate_ = codedInputStream.readInt64();
                            } else if (tag == 40) {
                                this.updateDate_ = codedInputStream.readInt64();
                            } else if (tag == 50) {
                                this.author_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 56) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.type_ = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }
    }

    public interface HeaderOrBuilder extends MessageOrBuilder {
        String getAuthor();

        ByteString getAuthorBytes();

        long getCreateDate();

        int getHeight();

        int getType();

        long getUpdateDate();

        int getVersion();

        int getWidth();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012SketchHeader.proto\"~\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u000e\n\u0006author\u0018\u0006 \u0001(\t\u0012\f\n\u0004type\u0018\u0007 \u0001(\u0005B\u001f\n\u000fcom.zykj.sketchB\fSketchHeaderb\u0006proto3"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zykj.sketch.SketchHeader.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = SketchHeader.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Header_descriptor = descriptor2;
        internal_static_Header_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Author", "Type"});
    }

    private SketchHeader() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}

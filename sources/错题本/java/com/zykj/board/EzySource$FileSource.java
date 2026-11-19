package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.compose.material3.AbstractC1923c;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3143k1;
import p020b4.AbstractC3176v1;
import p020b4.C3146l1;
import p020b4.InterfaceC3149m1;

/* loaded from: classes3.dex */
public final class EzySource$FileSource extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int FILEINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzySource$FileSource f5410a = new EzySource$FileSource();

    /* renamed from: b */
    public static final C3146l1 f5411b = new C3146l1();
    private static final long serialVersionUID = 0;
    private List<FileInfo> fileInfo_;
    private byte memoizedIsInitialized;

    public static final class FileInfo extends GeneratedMessageV3 implements InterfaceC3149m1 {
        public static final int HEIGHT_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int VALIDATE_FIELD_NUMBER = 4;
        public static final int WIDTH_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final FileInfo f5412a = new FileInfo();

        /* renamed from: b */
        public static final C4373j0 f5413b = new C4373j0();
        private static final long serialVersionUID = 0;
        private int height_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object validate_;
        private int width_;

        public FileInfo(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
            super(builder);
            this.name_ = "";
            this.width_ = 0;
            this.height_ = 0;
            this.validate_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileInfo getDefaultInstance() {
            return f5412a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3176v1.f1679k;
        }

        public static C4375k0 newBuilder() {
            return f5412a.toBuilder();
        }

        public static FileInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5413b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static FileInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileInfo) f5413b.parseFrom(byteBuffer);
        }

        public static Parser<FileInfo> parser() {
            return f5413b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileInfo)) {
                return super.equals(obj);
            }
            FileInfo fileInfo = (FileInfo) obj;
            return getName().equals(fileInfo.getName()) && getWidth() == fileInfo.getWidth() && getHeight() == fileInfo.getHeight() && getValidate().equals(fileInfo.getValidate()) && getUnknownFields().equals(fileInfo.getUnknownFields());
        }

        public int getHeight() {
            return this.height_;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileInfo> getParserForType() {
            return f5413b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            int i8 = this.width_;
            if (i8 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(2, i8);
            }
            int i9 = this.height_;
            if (i9 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(3, i9);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.validate_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.validate_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public String getValidate() {
            Object obj = this.validate_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.validate_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getValidateBytes() {
            Object obj = this.validate_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.validate_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getValidate().hashCode() + ((((getHeight() + ((((getWidth() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3176v1.f1680l.ensureFieldAccessorsInitialized(FileInfo.class, C4375k0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b6 = this.memoizedIsInitialized;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            int i = this.width_;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            int i8 = this.height_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(3, i8);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.validate_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.validate_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4375k0 newBuilder(FileInfo fileInfo) {
            C4375k0 builder = f5412a.toBuilder();
            builder.m3774g(fileInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static FileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileInfo) f5413b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static FileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5413b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static FileInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileInfo) f5413b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileInfo getDefaultInstanceForType() {
            return f5412a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4375k0 toBuilder() {
            if (this == f5412a) {
                return new C4375k0();
            }
            C4375k0 c4375k0 = new C4375k0();
            c4375k0.m3774g(this);
            return c4375k0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static FileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileInfo) f5413b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4375k0 newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static FileInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileInfo) f5413b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4375k0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4375k0 c4375k0 = new C4375k0(builderParent);
            c4375k0.f5523b = "";
            c4375k0.f5526e = "";
            return c4375k0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static FileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileInfo) f5413b.parseFrom(bArr, extensionRegistryLite);
        }

        private FileInfo() {
            this.name_ = "";
            this.width_ = 0;
            this.height_ = 0;
            this.validate_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.validate_ = "";
        }

        public static FileInfo parseFrom(InputStream inputStream) throws IOException {
            return (FileInfo) GeneratedMessageV3.parseWithIOException(f5413b, inputStream);
        }

        public static FileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileInfo) GeneratedMessageV3.parseWithIOException(f5413b, inputStream, extensionRegistryLite);
        }

        public static FileInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FileInfo) GeneratedMessageV3.parseWithIOException(f5413b, codedInputStream);
        }

        public static FileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileInfo) GeneratedMessageV3.parseWithIOException(f5413b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzySource$FileSource(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzySource$FileSource getDefaultInstance() {
        return f5410a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3176v1.f1677i;
    }

    public static C4371i0 newBuilder() {
        return f5410a.toBuilder();
    }

    public static EzySource$FileSource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzySource$FileSource) GeneratedMessageV3.parseDelimitedWithIOException(f5411b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$FileSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzySource$FileSource) f5411b.parseFrom(byteBuffer);
    }

    public static Parser<EzySource$FileSource> parser() {
        return f5411b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzySource$FileSource)) {
            return super.equals(obj);
        }
        EzySource$FileSource ezySource$FileSource = (EzySource$FileSource) obj;
        return getFileInfoList().equals(ezySource$FileSource.getFileInfoList()) && getUnknownFields().equals(ezySource$FileSource.getUnknownFields());
    }

    public FileInfo getFileInfo(int i) {
        return this.fileInfo_.get(i);
    }

    public int getFileInfoCount() {
        return this.fileInfo_.size();
    }

    public List<FileInfo> getFileInfoList() {
        return this.fileInfo_;
    }

    public InterfaceC3149m1 getFileInfoOrBuilder(int i) {
        return this.fileInfo_.get(i);
    }

    public List<? extends InterfaceC3149m1> getFileInfoOrBuilderList() {
        return this.fileInfo_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzySource$FileSource> getParserForType() {
        return f5411b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.fileInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.fileInfo_.get(i8));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getFileInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getFileInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1678j.ensureFieldAccessorsInitialized(EzySource$FileSource.class, C4371i0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b6 = this.memoizedIsInitialized;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new EzySource$FileSource();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fileInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.fileInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4371i0 newBuilder(EzySource$FileSource ezySource$FileSource) {
        C4371i0 builder = f5410a.toBuilder();
        builder.m3763g(ezySource$FileSource);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$FileSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$FileSource) f5411b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzySource$FileSource() {
        this.memoizedIsInitialized = (byte) -1;
        this.fileInfo_ = Collections.EMPTY_LIST;
    }

    public static EzySource$FileSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$FileSource) GeneratedMessageV3.parseDelimitedWithIOException(f5411b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$FileSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzySource$FileSource) f5411b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzySource$FileSource getDefaultInstanceForType() {
        return f5410a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4371i0 toBuilder() {
        if (this == f5410a) {
            return new C4371i0();
        }
        C4371i0 c4371i0 = new C4371i0();
        c4371i0.m3763g(this);
        return c4371i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$FileSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$FileSource) f5411b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4371i0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$FileSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzySource$FileSource) f5411b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4371i0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4371i0 c4371i0 = new C4371i0(builderParent);
        c4371i0.f5513b = Collections.EMPTY_LIST;
        return c4371i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$FileSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$FileSource) f5411b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzySource$FileSource parseFrom(InputStream inputStream) throws IOException {
        return (EzySource$FileSource) GeneratedMessageV3.parseWithIOException(f5411b, inputStream);
    }

    public static EzySource$FileSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$FileSource) GeneratedMessageV3.parseWithIOException(f5411b, inputStream, extensionRegistryLite);
    }

    public static EzySource$FileSource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzySource$FileSource) GeneratedMessageV3.parseWithIOException(f5411b, codedInputStream);
    }

    public static EzySource$FileSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$FileSource) GeneratedMessageV3.parseWithIOException(f5411b, codedInputStream, extensionRegistryLite);
    }
}

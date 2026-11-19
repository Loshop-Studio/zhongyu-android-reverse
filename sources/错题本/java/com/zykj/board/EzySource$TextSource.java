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
import p020b4.C3164r1;
import p020b4.InterfaceC3160q0;
import p020b4.InterfaceC3167s1;

/* loaded from: classes3.dex */
public final class EzySource$TextSource extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int TEXTINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzySource$TextSource f5422a = new EzySource$TextSource();

    /* renamed from: b */
    public static final C3164r1 f5423b = new C3164r1();
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<TextInfo> textInfo_;

    public static final class TextInfo extends GeneratedMessageV3 implements InterfaceC3167s1 {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int PAINT_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final TextInfo f5424a = new TextInfo();

        /* renamed from: b */
        public static final C4391s0 f5425b = new C4391s0();
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object content_;
        private byte memoizedIsInitialized;
        private EzyPaint$Paint paint_;

        public TextInfo(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
            super(builder);
            this.content_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$7676(TextInfo textInfo, int i) {
            int i8 = i | textInfo.bitField0_;
            textInfo.bitField0_ = i8;
            return i8;
        }

        public static TextInfo getDefaultInstance() {
            return f5424a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3176v1.f1683o;
        }

        public static C4393t0 newBuilder() {
            return f5424a.toBuilder();
        }

        public static TextInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TextInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5425b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TextInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TextInfo) f5425b.parseFrom(byteBuffer);
        }

        public static Parser<TextInfo> parser() {
            return f5425b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextInfo)) {
                return super.equals(obj);
            }
            TextInfo textInfo = (TextInfo) obj;
            if (getContent().equals(textInfo.getContent()) && hasPaint() == textInfo.hasPaint()) {
                return (!hasPaint() || getPaint().equals(textInfo.getPaint())) && getUnknownFields().equals(textInfo.getUnknownFields());
            }
            return false;
        }

        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public EzyPaint$Paint getPaint() {
            EzyPaint$Paint ezyPaint$Paint = this.paint_;
            return ezyPaint$Paint == null ? EzyPaint$Paint.getDefaultInstance() : ezyPaint$Paint;
        }

        public InterfaceC3160q0 getPaintOrBuilder() {
            EzyPaint$Paint ezyPaint$Paint = this.paint_;
            return ezyPaint$Paint == null ? EzyPaint$Paint.getDefaultInstance() : ezyPaint$Paint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TextInfo> getParserForType() {
            return f5425b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.content_) ? GeneratedMessageV3.computeStringSize(1, this.content_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getPaint());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean hasPaint() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getContent().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (hasPaint()) {
                iHashCode = getPaint().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3176v1.f1684p.ensureFieldAccessorsInitialized(TextInfo.class, C4393t0.class);
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
            return new TextInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.content_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getPaint());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4393t0 newBuilder(TextInfo textInfo) {
            C4393t0 builder = f5424a.toBuilder();
            builder.m3840i(textInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TextInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TextInfo) f5425b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static TextInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TextInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5425b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TextInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TextInfo) f5425b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TextInfo getDefaultInstanceForType() {
            return f5424a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4393t0 toBuilder() {
            if (this == f5424a) {
                return new C4393t0();
            }
            C4393t0 c4393t0 = new C4393t0();
            c4393t0.m3840i(this);
            return c4393t0;
        }

        private TextInfo() {
            this.content_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TextInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TextInfo) f5425b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4393t0 newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TextInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TextInfo) f5425b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4393t0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4393t0 c4393t0 = new C4393t0(builderParent);
            c4393t0.f5580b = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                c4393t0.m3839h();
            }
            return c4393t0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TextInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TextInfo) f5425b.parseFrom(bArr, extensionRegistryLite);
        }

        public static TextInfo parseFrom(InputStream inputStream) throws IOException {
            return (TextInfo) GeneratedMessageV3.parseWithIOException(f5425b, inputStream);
        }

        public static TextInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TextInfo) GeneratedMessageV3.parseWithIOException(f5425b, inputStream, extensionRegistryLite);
        }

        public static TextInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TextInfo) GeneratedMessageV3.parseWithIOException(f5425b, codedInputStream);
        }

        public static TextInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TextInfo) GeneratedMessageV3.parseWithIOException(f5425b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzySource$TextSource(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzySource$TextSource getDefaultInstance() {
        return f5422a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3176v1.f1681m;
    }

    public static C4389r0 newBuilder() {
        return f5422a.toBuilder();
    }

    public static EzySource$TextSource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzySource$TextSource) GeneratedMessageV3.parseDelimitedWithIOException(f5423b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TextSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzySource$TextSource) f5423b.parseFrom(byteBuffer);
    }

    public static Parser<EzySource$TextSource> parser() {
        return f5423b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzySource$TextSource)) {
            return super.equals(obj);
        }
        EzySource$TextSource ezySource$TextSource = (EzySource$TextSource) obj;
        return getTextInfoList().equals(ezySource$TextSource.getTextInfoList()) && getUnknownFields().equals(ezySource$TextSource.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzySource$TextSource> getParserForType() {
        return f5423b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.textInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.textInfo_.get(i8));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public TextInfo getTextInfo(int i) {
        return this.textInfo_.get(i);
    }

    public int getTextInfoCount() {
        return this.textInfo_.size();
    }

    public List<TextInfo> getTextInfoList() {
        return this.textInfo_;
    }

    public InterfaceC3167s1 getTextInfoOrBuilder(int i) {
        return this.textInfo_.get(i);
    }

    public List<? extends InterfaceC3167s1> getTextInfoOrBuilderList() {
        return this.textInfo_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getTextInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getTextInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1682n.ensureFieldAccessorsInitialized(EzySource$TextSource.class, C4389r0.class);
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
        return new EzySource$TextSource();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.textInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.textInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4389r0 newBuilder(EzySource$TextSource ezySource$TextSource) {
        C4389r0 builder = f5422a.toBuilder();
        builder.m3825g(ezySource$TextSource);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TextSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$TextSource) f5423b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzySource$TextSource() {
        this.memoizedIsInitialized = (byte) -1;
        this.textInfo_ = Collections.EMPTY_LIST;
    }

    public static EzySource$TextSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$TextSource) GeneratedMessageV3.parseDelimitedWithIOException(f5423b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TextSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzySource$TextSource) f5423b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzySource$TextSource getDefaultInstanceForType() {
        return f5422a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4389r0 toBuilder() {
        if (this == f5422a) {
            return new C4389r0();
        }
        C4389r0 c4389r0 = new C4389r0();
        c4389r0.m3825g(this);
        return c4389r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TextSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$TextSource) f5423b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4389r0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TextSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzySource$TextSource) f5423b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4389r0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4389r0 c4389r0 = new C4389r0(builderParent);
        c4389r0.f5568b = Collections.EMPTY_LIST;
        return c4389r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TextSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$TextSource) f5423b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzySource$TextSource parseFrom(InputStream inputStream) throws IOException {
        return (EzySource$TextSource) GeneratedMessageV3.parseWithIOException(f5423b, inputStream);
    }

    public static EzySource$TextSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$TextSource) GeneratedMessageV3.parseWithIOException(f5423b, inputStream, extensionRegistryLite);
    }

    public static EzySource$TextSource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzySource$TextSource) GeneratedMessageV3.parseWithIOException(f5423b, codedInputStream);
    }

    public static EzySource$TextSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$TextSource) GeneratedMessageV3.parseWithIOException(f5423b, codedInputStream, extensionRegistryLite);
    }
}

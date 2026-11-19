package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.compose.material3.AbstractC1923c;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3147m;
import p020b4.AbstractC3183y;
import p020b4.C3168t;
import p020b4.C3171u;
import p020b4.InterfaceC3156p;
import p020b4.InterfaceC3165s;
import p020b4.InterfaceC3180x;

/* loaded from: classes3.dex */
public final class EzyHeader$Header extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int AUTHOR_FIELD_NUMBER = 7;
    public static final int CONVERTURL_FIELD_NUMBER = 8;
    public static final int CREATEDATE_FIELD_NUMBER = 4;
    public static final int DEFAULTBACKGROUNDCOLOR_FIELD_NUMBER = 10;
    public static final int DEFAULTBACKGROUNDLINECONFIG_FIELD_NUMBER = 13;
    public static final int DURATION_FIELD_NUMBER = 6;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int LASTBACKGROUNDCOLOR_FIELD_NUMBER = 11;
    public static final int LASTBACKGROUNDLINECONFIG_FIELD_NUMBER = 14;
    public static final int MOVECONFIG_FIELD_NUMBER = 12;
    public static final int PROVIDER_FIELD_NUMBER = 9;
    public static final int UPDATEDATE_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;

    /* renamed from: a */
    public static final EzyHeader$Header f5375a = new EzyHeader$Header();

    /* renamed from: b */
    public static final C3168t f5376b = new C3168t();
    private static final long serialVersionUID = 0;
    private EzyHeader$Author author_;
    private int bitField0_;
    private volatile Object convertUrl_;
    private long createDate_;
    private int defaultBackgroundColor_;
    private EzyHeader$BackgroundLineConfig defaultBackgroundLineConfig_;
    private long duration_;
    private int height_;
    private int lastBackgroundColor_;
    private EzyHeader$BackgroundLineConfig lastBackgroundLineConfig_;
    private byte memoizedIsInitialized;
    private EzyHeader$MoveConfig moveConfig_;
    private List<EzyHeader$Author> provider_;
    private long updateDate_;
    private int version_;
    private int width_;

    public EzyHeader$Header(GeneratedMessageV3.Builder builder, AbstractC3147m abstractC3147m) {
        super(builder);
        this.version_ = 0;
        this.width_ = 0;
        this.height_ = 0;
        this.createDate_ = 0L;
        this.updateDate_ = 0L;
        this.duration_ = 0L;
        this.convertUrl_ = "";
        this.defaultBackgroundColor_ = 0;
        this.lastBackgroundColor_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static /* synthetic */ int access$2076(EzyHeader$Header ezyHeader$Header, int i) {
        int i8 = i | ezyHeader$Header.bitField0_;
        ezyHeader$Header.bitField0_ = i8;
        return i8;
    }

    public static EzyHeader$Header getDefaultInstance() {
        return f5375a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3183y.f1700a;
    }

    public static C3171u newBuilder() {
        return f5375a.toBuilder();
    }

    public static EzyHeader$Header parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$Header) GeneratedMessageV3.parseDelimitedWithIOException(f5376b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Header parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyHeader$Header) f5376b.parseFrom(byteBuffer);
    }

    public static Parser<EzyHeader$Header> parser() {
        return f5376b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyHeader$Header)) {
            return super.equals(obj);
        }
        EzyHeader$Header ezyHeader$Header = (EzyHeader$Header) obj;
        if (getVersion() != ezyHeader$Header.getVersion() || getWidth() != ezyHeader$Header.getWidth() || getHeight() != ezyHeader$Header.getHeight() || getCreateDate() != ezyHeader$Header.getCreateDate() || getUpdateDate() != ezyHeader$Header.getUpdateDate() || getDuration() != ezyHeader$Header.getDuration() || hasAuthor() != ezyHeader$Header.hasAuthor()) {
            return false;
        }
        if ((hasAuthor() && !getAuthor().equals(ezyHeader$Header.getAuthor())) || !getConvertUrl().equals(ezyHeader$Header.getConvertUrl()) || !getProviderList().equals(ezyHeader$Header.getProviderList()) || getDefaultBackgroundColor() != ezyHeader$Header.getDefaultBackgroundColor() || getLastBackgroundColor() != ezyHeader$Header.getLastBackgroundColor() || hasMoveConfig() != ezyHeader$Header.hasMoveConfig()) {
            return false;
        }
        if ((hasMoveConfig() && !getMoveConfig().equals(ezyHeader$Header.getMoveConfig())) || hasDefaultBackgroundLineConfig() != ezyHeader$Header.hasDefaultBackgroundLineConfig()) {
            return false;
        }
        if ((!hasDefaultBackgroundLineConfig() || getDefaultBackgroundLineConfig().equals(ezyHeader$Header.getDefaultBackgroundLineConfig())) && hasLastBackgroundLineConfig() == ezyHeader$Header.hasLastBackgroundLineConfig()) {
            return (!hasLastBackgroundLineConfig() || getLastBackgroundLineConfig().equals(ezyHeader$Header.getLastBackgroundLineConfig())) && getUnknownFields().equals(ezyHeader$Header.getUnknownFields());
        }
        return false;
    }

    public EzyHeader$Author getAuthor() {
        EzyHeader$Author ezyHeader$Author = this.author_;
        return ezyHeader$Author == null ? EzyHeader$Author.getDefaultInstance() : ezyHeader$Author;
    }

    public InterfaceC3156p getAuthorOrBuilder() {
        EzyHeader$Author ezyHeader$Author = this.author_;
        return ezyHeader$Author == null ? EzyHeader$Author.getDefaultInstance() : ezyHeader$Author;
    }

    public String getConvertUrl() {
        Object obj = this.convertUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.convertUrl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getConvertUrlBytes() {
        Object obj = this.convertUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.convertUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long getCreateDate() {
        return this.createDate_;
    }

    public int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor_;
    }

    public EzyHeader$BackgroundLineConfig getDefaultBackgroundLineConfig() {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.defaultBackgroundLineConfig_;
        return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
    }

    public InterfaceC3165s getDefaultBackgroundLineConfigOrBuilder() {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.defaultBackgroundLineConfig_;
        return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
    }

    public long getDuration() {
        return this.duration_;
    }

    public int getHeight() {
        return this.height_;
    }

    public int getLastBackgroundColor() {
        return this.lastBackgroundColor_;
    }

    public EzyHeader$BackgroundLineConfig getLastBackgroundLineConfig() {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.lastBackgroundLineConfig_;
        return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
    }

    public InterfaceC3165s getLastBackgroundLineConfigOrBuilder() {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.lastBackgroundLineConfig_;
        return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
    }

    public EzyHeader$MoveConfig getMoveConfig() {
        EzyHeader$MoveConfig ezyHeader$MoveConfig = this.moveConfig_;
        return ezyHeader$MoveConfig == null ? EzyHeader$MoveConfig.getDefaultInstance() : ezyHeader$MoveConfig;
    }

    public InterfaceC3180x getMoveConfigOrBuilder() {
        EzyHeader$MoveConfig ezyHeader$MoveConfig = this.moveConfig_;
        return ezyHeader$MoveConfig == null ? EzyHeader$MoveConfig.getDefaultInstance() : ezyHeader$MoveConfig;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyHeader$Header> getParserForType() {
        return f5376b;
    }

    public EzyHeader$Author getProvider(int i) {
        return this.provider_.get(i);
    }

    public int getProviderCount() {
        return this.provider_.size();
    }

    public List<EzyHeader$Author> getProviderList() {
        return this.provider_;
    }

    public InterfaceC3156p getProviderOrBuilder(int i) {
        return this.provider_.get(i);
    }

    public List<? extends InterfaceC3156p> getProviderOrBuilderList() {
        return this.provider_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i8 = this.version_;
        int iComputeInt32Size = i8 != 0 ? CodedOutputStream.computeInt32Size(1, i8) : 0;
        int i9 = this.width_;
        if (i9 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i9);
        }
        int i10 = this.height_;
        if (i10 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i10);
        }
        long j7 = this.createDate_;
        if (j7 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j7);
        }
        long j8 = this.updateDate_;
        if (j8 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j8);
        }
        long j9 = this.duration_;
        if (j9 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j9);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(7, getAuthor());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.convertUrl_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(8, this.convertUrl_);
        }
        for (int i11 = 0; i11 < this.provider_.size(); i11++) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(9, this.provider_.get(i11));
        }
        int i12 = this.defaultBackgroundColor_;
        if (i12 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(10, i12);
        }
        int i13 = this.lastBackgroundColor_;
        if (i13 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(11, i13);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(12, getMoveConfig());
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(13, getDefaultBackgroundLineConfig());
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(14, getLastBackgroundLineConfig());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public long getUpdateDate() {
        return this.updateDate_;
    }

    public int getVersion() {
        return this.version_;
    }

    public int getWidth() {
        return this.width_;
    }

    public boolean hasAuthor() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDefaultBackgroundLineConfig() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLastBackgroundLineConfig() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMoveConfig() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashLong = Internal.hashLong(getDuration()) + ((((Internal.hashLong(getUpdateDate()) + ((((Internal.hashLong(getCreateDate()) + ((((getHeight() + ((((getWidth() + ((((getVersion() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53);
        if (hasAuthor()) {
            iHashLong = AbstractC1923c.m1038b(iHashLong, 37, 7, 53) + getAuthor().hashCode();
        }
        int iHashCode = getConvertUrl().hashCode() + AbstractC1923c.m1038b(iHashLong, 37, 8, 53);
        if (getProviderCount() > 0) {
            iHashCode = getProviderList().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 9, 53);
        }
        int lastBackgroundColor = getLastBackgroundColor() + ((((getDefaultBackgroundColor() + AbstractC1923c.m1038b(iHashCode, 37, 10, 53)) * 37) + 11) * 53);
        if (hasMoveConfig()) {
            lastBackgroundColor = AbstractC1923c.m1038b(lastBackgroundColor, 37, 12, 53) + getMoveConfig().hashCode();
        }
        if (hasDefaultBackgroundLineConfig()) {
            lastBackgroundColor = AbstractC1923c.m1038b(lastBackgroundColor, 37, 13, 53) + getDefaultBackgroundLineConfig().hashCode();
        }
        if (hasLastBackgroundLineConfig()) {
            lastBackgroundColor = AbstractC1923c.m1038b(lastBackgroundColor, 37, 14, 53) + getLastBackgroundLineConfig().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (lastBackgroundColor * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3183y.f1701b.ensureFieldAccessorsInitialized(EzyHeader$Header.class, C3171u.class);
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
        return new EzyHeader$Header();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.version_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i8 = this.width_;
        if (i8 != 0) {
            codedOutputStream.writeInt32(2, i8);
        }
        int i9 = this.height_;
        if (i9 != 0) {
            codedOutputStream.writeInt32(3, i9);
        }
        long j7 = this.createDate_;
        if (j7 != 0) {
            codedOutputStream.writeInt64(4, j7);
        }
        long j8 = this.updateDate_;
        if (j8 != 0) {
            codedOutputStream.writeInt64(5, j8);
        }
        long j9 = this.duration_;
        if (j9 != 0) {
            codedOutputStream.writeInt64(6, j9);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(7, getAuthor());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.convertUrl_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.convertUrl_);
        }
        for (int i10 = 0; i10 < this.provider_.size(); i10++) {
            codedOutputStream.writeMessage(9, this.provider_.get(i10));
        }
        int i11 = this.defaultBackgroundColor_;
        if (i11 != 0) {
            codedOutputStream.writeInt32(10, i11);
        }
        int i12 = this.lastBackgroundColor_;
        if (i12 != 0) {
            codedOutputStream.writeInt32(11, i12);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(12, getMoveConfig());
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(13, getDefaultBackgroundLineConfig());
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputStream.writeMessage(14, getLastBackgroundLineConfig());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3171u newBuilder(EzyHeader$Header ezyHeader$Header) {
        C3171u builder = f5375a.toBuilder();
        builder.m2123m(ezyHeader$Header);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Header parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$Header) f5376b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyHeader$Header parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$Header) GeneratedMessageV3.parseDelimitedWithIOException(f5376b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Header parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyHeader$Header) f5376b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyHeader$Header getDefaultInstanceForType() {
        return f5375a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3171u toBuilder() {
        if (this == f5375a) {
            return new C3171u();
        }
        C3171u c3171u = new C3171u();
        c3171u.m2123m(this);
        return c3171u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Header parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$Header) f5376b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3171u newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Header parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyHeader$Header) f5376b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3171u newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C3171u c3171u = new C3171u(builderParent);
        c3171u.f1655j = "";
        c3171u.f1656k = Collections.EMPTY_LIST;
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            c3171u.m2118h();
            c3171u.m2122l();
            c3171u.m2121k();
            c3171u.m2119i();
            c3171u.m2120j();
        }
        return c3171u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Header parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$Header) f5376b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyHeader$Header parseFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$Header) GeneratedMessageV3.parseWithIOException(f5376b, inputStream);
    }

    public static EzyHeader$Header parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$Header) GeneratedMessageV3.parseWithIOException(f5376b, inputStream, extensionRegistryLite);
    }

    public static EzyHeader$Header parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyHeader$Header) GeneratedMessageV3.parseWithIOException(f5376b, codedInputStream);
    }

    private EzyHeader$Header() {
        this.version_ = 0;
        this.width_ = 0;
        this.height_ = 0;
        this.createDate_ = 0L;
        this.updateDate_ = 0L;
        this.duration_ = 0L;
        this.convertUrl_ = "";
        this.defaultBackgroundColor_ = 0;
        this.lastBackgroundColor_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.convertUrl_ = "";
        this.provider_ = Collections.EMPTY_LIST;
    }

    public static EzyHeader$Header parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$Header) GeneratedMessageV3.parseWithIOException(f5376b, codedInputStream, extensionRegistryLite);
    }
}

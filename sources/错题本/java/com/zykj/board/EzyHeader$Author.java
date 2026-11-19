package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p020b4.AbstractC3147m;
import p020b4.AbstractC3183y;
import p020b4.C3150n;
import p020b4.C3153o;
import p020b4.InterfaceC3156p;

/* loaded from: classes3.dex */
public final class EzyHeader$Author extends GeneratedMessageV3 implements InterfaceC3156p {
    public static final int AUTHORID_FIELD_NUMBER = 3;
    public static final int AUTHORNAME_FIELD_NUMBER = 1;
    public static final int DURATION_FIELD_NUMBER = 6;
    public static final int SCHOOLID_FIELD_NUMBER = 2;
    public static final int STARTTIME_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 4;

    /* renamed from: a */
    public static final EzyHeader$Author f5371a = new EzyHeader$Author();

    /* renamed from: b */
    public static final C3150n f5372b = new C3150n();
    private static final long serialVersionUID = 0;
    private volatile Object authorId_;
    private volatile Object authorName_;
    private long duration_;
    private byte memoizedIsInitialized;
    private volatile Object schoolId_;
    private long startTime_;
    private volatile Object url_;

    public EzyHeader$Author(GeneratedMessageV3.Builder builder, AbstractC3147m abstractC3147m) {
        super(builder);
        this.authorName_ = "";
        this.schoolId_ = "";
        this.authorId_ = "";
        this.url_ = "";
        this.startTime_ = 0L;
        this.duration_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyHeader$Author getDefaultInstance() {
        return f5371a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3183y.f1706g;
    }

    public static C3153o newBuilder() {
        return f5371a.toBuilder();
    }

    public static EzyHeader$Author parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$Author) GeneratedMessageV3.parseDelimitedWithIOException(f5372b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Author parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyHeader$Author) f5372b.parseFrom(byteBuffer);
    }

    public static Parser<EzyHeader$Author> parser() {
        return f5372b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyHeader$Author)) {
            return super.equals(obj);
        }
        EzyHeader$Author ezyHeader$Author = (EzyHeader$Author) obj;
        return getAuthorName().equals(ezyHeader$Author.getAuthorName()) && getSchoolId().equals(ezyHeader$Author.getSchoolId()) && getAuthorId().equals(ezyHeader$Author.getAuthorId()) && getUrl().equals(ezyHeader$Author.getUrl()) && getStartTime() == ezyHeader$Author.getStartTime() && getDuration() == ezyHeader$Author.getDuration() && getUnknownFields().equals(ezyHeader$Author.getUnknownFields());
    }

    public String getAuthorId() {
        Object obj = this.authorId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.authorId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getAuthorIdBytes() {
        Object obj = this.authorId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.authorId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getAuthorName() {
        Object obj = this.authorName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.authorName_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getAuthorNameBytes() {
        Object obj = this.authorName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.authorName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long getDuration() {
        return this.duration_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyHeader$Author> getParserForType() {
        return f5372b;
    }

    public String getSchoolId() {
        Object obj = this.schoolId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.schoolId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSchoolIdBytes() {
        Object obj = this.schoolId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.schoolId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.authorName_) ? GeneratedMessageV3.computeStringSize(1, this.authorName_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.schoolId_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.schoolId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.authorId_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.authorId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.url_);
        }
        long j7 = this.startTime_;
        if (j7 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(5, j7);
        }
        long j8 = this.duration_;
        if (j8 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(6, j8);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public long getStartTime() {
        return this.startTime_;
    }

    public String getUrl() {
        Object obj = this.url_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.url_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getUrlBytes() {
        Object obj = this.url_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.url_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Internal.hashLong(getDuration()) + ((((Internal.hashLong(getStartTime()) + ((((getUrl().hashCode() + ((((getAuthorId().hashCode() + ((((getSchoolId().hashCode() + ((((getAuthorName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3183y.f1707h.ensureFieldAccessorsInitialized(EzyHeader$Author.class, C3153o.class);
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
        return new EzyHeader$Author();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.authorName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.authorName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.schoolId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.schoolId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.authorId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.authorId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.url_);
        }
        long j7 = this.startTime_;
        if (j7 != 0) {
            codedOutputStream.writeInt64(5, j7);
        }
        long j8 = this.duration_;
        if (j8 != 0) {
            codedOutputStream.writeInt64(6, j8);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3153o newBuilder(EzyHeader$Author ezyHeader$Author) {
        C3153o builder = f5371a.toBuilder();
        builder.m2096f(ezyHeader$Author);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Author parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$Author) f5372b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyHeader$Author parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$Author) GeneratedMessageV3.parseDelimitedWithIOException(f5372b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Author parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyHeader$Author) f5372b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyHeader$Author getDefaultInstanceForType() {
        return f5371a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3153o toBuilder() {
        if (this == f5371a) {
            return new C3153o();
        }
        C3153o c3153o = new C3153o();
        c3153o.m2096f(this);
        return c3153o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Author parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$Author) f5372b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3153o newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Author parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyHeader$Author) f5372b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3153o newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C3153o c3153o = new C3153o(builderParent);
        c3153o.f1625b = "";
        c3153o.f1626c = "";
        c3153o.f1627d = "";
        c3153o.f1628e = "";
        return c3153o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$Author parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$Author) f5372b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyHeader$Author parseFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$Author) GeneratedMessageV3.parseWithIOException(f5372b, inputStream);
    }

    private EzyHeader$Author() {
        this.authorName_ = "";
        this.schoolId_ = "";
        this.authorId_ = "";
        this.url_ = "";
        this.startTime_ = 0L;
        this.duration_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.authorName_ = "";
        this.schoolId_ = "";
        this.authorId_ = "";
        this.url_ = "";
    }

    public static EzyHeader$Author parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$Author) GeneratedMessageV3.parseWithIOException(f5372b, inputStream, extensionRegistryLite);
    }

    public static EzyHeader$Author parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyHeader$Author) GeneratedMessageV3.parseWithIOException(f5372b, codedInputStream);
    }

    public static EzyHeader$Author parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$Author) GeneratedMessageV3.parseWithIOException(f5372b, codedInputStream, extensionRegistryLite);
    }
}

package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p020b4.AbstractC3166s0;
import p020b4.AbstractC3178w0;
import p020b4.C3169t0;
import p020b4.C3172u0;
import p020b4.InterfaceC3175v0;

/* loaded from: classes3.dex */
public final class EzyPointF$PointF extends GeneratedMessageV3 implements InterfaceC3175v0 {
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;

    /* renamed from: a */
    public static final EzyPointF$PointF f5394a = new EzyPointF$PointF();

    /* renamed from: b */
    public static final C3169t0 f5395b = new C3169t0();
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    /* renamed from: x_ */
    private float f5396x_;

    /* renamed from: y_ */
    private float f5397y_;

    public EzyPointF$PointF(GeneratedMessageV3.Builder builder, AbstractC3166s0 abstractC3166s0) {
        super(builder);
        this.f5396x_ = 0.0f;
        this.f5397y_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyPointF$PointF getDefaultInstance() {
        return f5394a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3178w0.f1697a;
    }

    public static C3172u0 newBuilder() {
        return f5394a.toBuilder();
    }

    public static EzyPointF$PointF parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyPointF$PointF) GeneratedMessageV3.parseDelimitedWithIOException(f5395b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPointF$PointF parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyPointF$PointF) f5395b.parseFrom(byteBuffer);
    }

    public static Parser<EzyPointF$PointF> parser() {
        return f5395b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyPointF$PointF)) {
            return super.equals(obj);
        }
        EzyPointF$PointF ezyPointF$PointF = (EzyPointF$PointF) obj;
        return Float.floatToIntBits(getX()) == Float.floatToIntBits(ezyPointF$PointF.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(ezyPointF$PointF.getY()) && getUnknownFields().equals(ezyPointF$PointF.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyPointF$PointF> getParserForType() {
        return f5395b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeFloatSize = Float.floatToRawIntBits(this.f5396x_) != 0 ? CodedOutputStream.computeFloatSize(1, this.f5396x_) : 0;
        if (Float.floatToRawIntBits(this.f5397y_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f5397y_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public float getX() {
        return this.f5396x_;
    }

    public float getY() {
        return this.f5397y_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getY()) + ((((Float.floatToIntBits(getX()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3178w0.f1698b.ensureFieldAccessorsInitialized(EzyPointF$PointF.class, C3172u0.class);
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
        return new EzyPointF$PointF();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (Float.floatToRawIntBits(this.f5396x_) != 0) {
            codedOutputStream.writeFloat(1, this.f5396x_);
        }
        if (Float.floatToRawIntBits(this.f5397y_) != 0) {
            codedOutputStream.writeFloat(2, this.f5397y_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3172u0 newBuilder(EzyPointF$PointF ezyPointF$PointF) {
        C3172u0 builder = f5394a.toBuilder();
        builder.m2128g(ezyPointF$PointF);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPointF$PointF parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPointF$PointF) f5395b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyPointF$PointF parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPointF$PointF) GeneratedMessageV3.parseDelimitedWithIOException(f5395b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPointF$PointF parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyPointF$PointF) f5395b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyPointF$PointF getDefaultInstanceForType() {
        return f5394a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3172u0 toBuilder() {
        if (this == f5394a) {
            return new C3172u0();
        }
        C3172u0 c3172u0 = new C3172u0();
        c3172u0.m2128g(this);
        return c3172u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPointF$PointF parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPointF$PointF) f5395b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3172u0 newBuilderForType() {
        return newBuilder();
    }

    private EzyPointF$PointF() {
        this.f5396x_ = 0.0f;
        this.f5397y_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPointF$PointF parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyPointF$PointF) f5395b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3172u0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new C3172u0(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPointF$PointF parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPointF$PointF) f5395b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyPointF$PointF parseFrom(InputStream inputStream) throws IOException {
        return (EzyPointF$PointF) GeneratedMessageV3.parseWithIOException(f5395b, inputStream);
    }

    public static EzyPointF$PointF parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPointF$PointF) GeneratedMessageV3.parseWithIOException(f5395b, inputStream, extensionRegistryLite);
    }

    public static EzyPointF$PointF parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyPointF$PointF) GeneratedMessageV3.parseWithIOException(f5395b, codedInputStream);
    }

    public static EzyPointF$PointF parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPointF$PointF) GeneratedMessageV3.parseWithIOException(f5395b, codedInputStream, extensionRegistryLite);
    }
}

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
import p020b4.AbstractC3122d1;
import p020b4.AbstractC3187z0;
import p020b4.C3112a1;
import p020b4.C3116b1;
import p020b4.InterfaceC3119c1;

/* loaded from: classes3.dex */
public final class EzyRectF$RectF extends GeneratedMessageV3 implements InterfaceC3119c1 {
    public static final int BOTTOM_FIELD_NUMBER = 4;
    public static final int LEFT_FIELD_NUMBER = 1;
    public static final int RIGHT_FIELD_NUMBER = 3;
    public static final int TOP_FIELD_NUMBER = 2;

    /* renamed from: a */
    public static final EzyRectF$RectF f5401a = new EzyRectF$RectF();

    /* renamed from: b */
    public static final C3112a1 f5402b = new C3112a1();
    private static final long serialVersionUID = 0;
    private float bottom_;
    private float left_;
    private byte memoizedIsInitialized;
    private float right_;
    private float top_;

    public EzyRectF$RectF(GeneratedMessageV3.Builder builder, AbstractC3187z0 abstractC3187z0) {
        super(builder);
        this.left_ = 0.0f;
        this.top_ = 0.0f;
        this.right_ = 0.0f;
        this.bottom_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyRectF$RectF getDefaultInstance() {
        return f5401a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3122d1.f1578a;
    }

    public static C3116b1 newBuilder() {
        return f5401a.toBuilder();
    }

    public static EzyRectF$RectF parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyRectF$RectF) GeneratedMessageV3.parseDelimitedWithIOException(f5402b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRectF$RectF parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyRectF$RectF) f5402b.parseFrom(byteBuffer);
    }

    public static Parser<EzyRectF$RectF> parser() {
        return f5402b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyRectF$RectF)) {
            return super.equals(obj);
        }
        EzyRectF$RectF ezyRectF$RectF = (EzyRectF$RectF) obj;
        return Float.floatToIntBits(getLeft()) == Float.floatToIntBits(ezyRectF$RectF.getLeft()) && Float.floatToIntBits(getTop()) == Float.floatToIntBits(ezyRectF$RectF.getTop()) && Float.floatToIntBits(getRight()) == Float.floatToIntBits(ezyRectF$RectF.getRight()) && Float.floatToIntBits(getBottom()) == Float.floatToIntBits(ezyRectF$RectF.getBottom()) && getUnknownFields().equals(ezyRectF$RectF.getUnknownFields());
    }

    public float getBottom() {
        return this.bottom_;
    }

    public float getLeft() {
        return this.left_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyRectF$RectF> getParserForType() {
        return f5402b;
    }

    public float getRight() {
        return this.right_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeFloatSize = Float.floatToRawIntBits(this.left_) != 0 ? CodedOutputStream.computeFloatSize(1, this.left_) : 0;
        if (Float.floatToRawIntBits(this.top_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.top_);
        }
        if (Float.floatToRawIntBits(this.right_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.right_);
        }
        if (Float.floatToRawIntBits(this.bottom_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.bottom_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public float getTop() {
        return this.top_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getBottom()) + ((((Float.floatToIntBits(getRight()) + ((((Float.floatToIntBits(getTop()) + ((((Float.floatToIntBits(getLeft()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3122d1.f1579b.ensureFieldAccessorsInitialized(EzyRectF$RectF.class, C3116b1.class);
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
        return new EzyRectF$RectF();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (Float.floatToRawIntBits(this.left_) != 0) {
            codedOutputStream.writeFloat(1, this.left_);
        }
        if (Float.floatToRawIntBits(this.top_) != 0) {
            codedOutputStream.writeFloat(2, this.top_);
        }
        if (Float.floatToRawIntBits(this.right_) != 0) {
            codedOutputStream.writeFloat(3, this.right_);
        }
        if (Float.floatToRawIntBits(this.bottom_) != 0) {
            codedOutputStream.writeFloat(4, this.bottom_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3116b1 newBuilder(EzyRectF$RectF ezyRectF$RectF) {
        C3116b1 builder = f5401a.toBuilder();
        builder.m2088g(ezyRectF$RectF);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRectF$RectF parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyRectF$RectF) f5402b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyRectF$RectF parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyRectF$RectF) GeneratedMessageV3.parseDelimitedWithIOException(f5402b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRectF$RectF parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyRectF$RectF) f5402b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyRectF$RectF getDefaultInstanceForType() {
        return f5401a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3116b1 toBuilder() {
        if (this == f5401a) {
            return new C3116b1();
        }
        C3116b1 c3116b1 = new C3116b1();
        c3116b1.m2088g(this);
        return c3116b1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRectF$RectF parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyRectF$RectF) f5402b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3116b1 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRectF$RectF parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyRectF$RectF) f5402b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3116b1 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new C3116b1(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRectF$RectF parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyRectF$RectF) f5402b.parseFrom(bArr, extensionRegistryLite);
    }

    private EzyRectF$RectF() {
        this.left_ = 0.0f;
        this.top_ = 0.0f;
        this.right_ = 0.0f;
        this.bottom_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyRectF$RectF parseFrom(InputStream inputStream) throws IOException {
        return (EzyRectF$RectF) GeneratedMessageV3.parseWithIOException(f5402b, inputStream);
    }

    public static EzyRectF$RectF parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyRectF$RectF) GeneratedMessageV3.parseWithIOException(f5402b, inputStream, extensionRegistryLite);
    }

    public static EzyRectF$RectF parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyRectF$RectF) GeneratedMessageV3.parseWithIOException(f5402b, codedInputStream);
    }

    public static EzyRectF$RectF parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyRectF$RectF) GeneratedMessageV3.parseWithIOException(f5402b, codedInputStream, extensionRegistryLite);
    }
}

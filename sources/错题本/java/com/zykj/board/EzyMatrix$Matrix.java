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
import p020b4.AbstractC3121d0;
import p020b4.AbstractC3186z;
import p020b4.C3111a0;
import p020b4.C3115b0;
import p020b4.InterfaceC3118c0;

/* loaded from: classes3.dex */
public final class EzyMatrix$Matrix extends GeneratedMessageV3 implements InterfaceC3118c0 {
    public static final int EVENTTIME_FIELD_NUMBER = 1;
    public static final int PERSP0_FIELD_NUMBER = 8;
    public static final int PERSP1_FIELD_NUMBER = 9;
    public static final int PERSP2_FIELD_NUMBER = 10;
    public static final int SCALEX_FIELD_NUMBER = 2;
    public static final int SCALEY_FIELD_NUMBER = 6;
    public static final int SKEWX_FIELD_NUMBER = 3;
    public static final int SKEWY_FIELD_NUMBER = 5;
    public static final int TRANSX_FIELD_NUMBER = 4;
    public static final int TRANSY_FIELD_NUMBER = 7;

    /* renamed from: a */
    public static final EzyMatrix$Matrix f5379a = new EzyMatrix$Matrix();

    /* renamed from: b */
    public static final C3111a0 f5380b = new C3111a0();
    private static final long serialVersionUID = 0;
    private long eventTime_;
    private byte memoizedIsInitialized;
    private float perSp0_;
    private float perSp1_;
    private float perSp2_;
    private float scaleX_;
    private float scaleY_;
    private float skewX_;
    private float skewY_;
    private float transX_;
    private float transY_;

    public EzyMatrix$Matrix(GeneratedMessageV3.Builder builder, AbstractC3186z abstractC3186z) {
        super(builder);
        this.eventTime_ = 0L;
        this.scaleX_ = 0.0f;
        this.skewX_ = 0.0f;
        this.transX_ = 0.0f;
        this.skewY_ = 0.0f;
        this.scaleY_ = 0.0f;
        this.transY_ = 0.0f;
        this.perSp0_ = 0.0f;
        this.perSp1_ = 0.0f;
        this.perSp2_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyMatrix$Matrix getDefaultInstance() {
        return f5379a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3121d0.f1575a;
    }

    public static C3115b0 newBuilder() {
        return f5379a.toBuilder();
    }

    public static EzyMatrix$Matrix parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyMatrix$Matrix) GeneratedMessageV3.parseDelimitedWithIOException(f5380b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyMatrix$Matrix parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyMatrix$Matrix) f5380b.parseFrom(byteBuffer);
    }

    public static Parser<EzyMatrix$Matrix> parser() {
        return f5380b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyMatrix$Matrix)) {
            return super.equals(obj);
        }
        EzyMatrix$Matrix ezyMatrix$Matrix = (EzyMatrix$Matrix) obj;
        return getEventTime() == ezyMatrix$Matrix.getEventTime() && Float.floatToIntBits(getScaleX()) == Float.floatToIntBits(ezyMatrix$Matrix.getScaleX()) && Float.floatToIntBits(getSkewX()) == Float.floatToIntBits(ezyMatrix$Matrix.getSkewX()) && Float.floatToIntBits(getTransX()) == Float.floatToIntBits(ezyMatrix$Matrix.getTransX()) && Float.floatToIntBits(getSkewY()) == Float.floatToIntBits(ezyMatrix$Matrix.getSkewY()) && Float.floatToIntBits(getScaleY()) == Float.floatToIntBits(ezyMatrix$Matrix.getScaleY()) && Float.floatToIntBits(getTransY()) == Float.floatToIntBits(ezyMatrix$Matrix.getTransY()) && Float.floatToIntBits(getPerSp0()) == Float.floatToIntBits(ezyMatrix$Matrix.getPerSp0()) && Float.floatToIntBits(getPerSp1()) == Float.floatToIntBits(ezyMatrix$Matrix.getPerSp1()) && Float.floatToIntBits(getPerSp2()) == Float.floatToIntBits(ezyMatrix$Matrix.getPerSp2()) && getUnknownFields().equals(ezyMatrix$Matrix.getUnknownFields());
    }

    public long getEventTime() {
        return this.eventTime_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyMatrix$Matrix> getParserForType() {
        return f5380b;
    }

    public float getPerSp0() {
        return this.perSp0_;
    }

    public float getPerSp1() {
        return this.perSp1_;
    }

    public float getPerSp2() {
        return this.perSp2_;
    }

    public float getScaleX() {
        return this.scaleX_;
    }

    public float getScaleY() {
        return this.scaleY_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j7 = this.eventTime_;
        int iComputeInt64Size = j7 != 0 ? CodedOutputStream.computeInt64Size(1, j7) : 0;
        if (Float.floatToRawIntBits(this.scaleX_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(2, this.scaleX_);
        }
        if (Float.floatToRawIntBits(this.skewX_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.skewX_);
        }
        if (Float.floatToRawIntBits(this.transX_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.transX_);
        }
        if (Float.floatToRawIntBits(this.skewY_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(5, this.skewY_);
        }
        if (Float.floatToRawIntBits(this.scaleY_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(6, this.scaleY_);
        }
        if (Float.floatToRawIntBits(this.transY_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(7, this.transY_);
        }
        if (Float.floatToRawIntBits(this.perSp0_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(8, this.perSp0_);
        }
        if (Float.floatToRawIntBits(this.perSp1_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(9, this.perSp1_);
        }
        if (Float.floatToRawIntBits(this.perSp2_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(10, this.perSp2_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public float getSkewX() {
        return this.skewX_;
    }

    public float getSkewY() {
        return this.skewY_;
    }

    public float getTransX() {
        return this.transX_;
    }

    public float getTransY() {
        return this.transY_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getPerSp2()) + ((((Float.floatToIntBits(getPerSp1()) + ((((Float.floatToIntBits(getPerSp0()) + ((((Float.floatToIntBits(getTransY()) + ((((Float.floatToIntBits(getScaleY()) + ((((Float.floatToIntBits(getSkewY()) + ((((Float.floatToIntBits(getTransX()) + ((((Float.floatToIntBits(getSkewX()) + ((((Float.floatToIntBits(getScaleX()) + ((((Internal.hashLong(getEventTime()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3121d0.f1576b.ensureFieldAccessorsInitialized(EzyMatrix$Matrix.class, C3115b0.class);
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
        return new EzyMatrix$Matrix();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j7 = this.eventTime_;
        if (j7 != 0) {
            codedOutputStream.writeInt64(1, j7);
        }
        if (Float.floatToRawIntBits(this.scaleX_) != 0) {
            codedOutputStream.writeFloat(2, this.scaleX_);
        }
        if (Float.floatToRawIntBits(this.skewX_) != 0) {
            codedOutputStream.writeFloat(3, this.skewX_);
        }
        if (Float.floatToRawIntBits(this.transX_) != 0) {
            codedOutputStream.writeFloat(4, this.transX_);
        }
        if (Float.floatToRawIntBits(this.skewY_) != 0) {
            codedOutputStream.writeFloat(5, this.skewY_);
        }
        if (Float.floatToRawIntBits(this.scaleY_) != 0) {
            codedOutputStream.writeFloat(6, this.scaleY_);
        }
        if (Float.floatToRawIntBits(this.transY_) != 0) {
            codedOutputStream.writeFloat(7, this.transY_);
        }
        if (Float.floatToRawIntBits(this.perSp0_) != 0) {
            codedOutputStream.writeFloat(8, this.perSp0_);
        }
        if (Float.floatToRawIntBits(this.perSp1_) != 0) {
            codedOutputStream.writeFloat(9, this.perSp1_);
        }
        if (Float.floatToRawIntBits(this.perSp2_) != 0) {
            codedOutputStream.writeFloat(10, this.perSp2_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3115b0 newBuilder(EzyMatrix$Matrix ezyMatrix$Matrix) {
        C3115b0 builder = f5379a.toBuilder();
        builder.m2073g(ezyMatrix$Matrix);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyMatrix$Matrix parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyMatrix$Matrix) f5380b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyMatrix$Matrix parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyMatrix$Matrix) GeneratedMessageV3.parseDelimitedWithIOException(f5380b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyMatrix$Matrix parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyMatrix$Matrix) f5380b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyMatrix$Matrix getDefaultInstanceForType() {
        return f5379a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3115b0 toBuilder() {
        if (this == f5379a) {
            return new C3115b0();
        }
        C3115b0 c3115b0 = new C3115b0();
        c3115b0.m2073g(this);
        return c3115b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyMatrix$Matrix parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyMatrix$Matrix) f5380b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3115b0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyMatrix$Matrix parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyMatrix$Matrix) f5380b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3115b0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new C3115b0(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyMatrix$Matrix parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyMatrix$Matrix) f5380b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyMatrix$Matrix parseFrom(InputStream inputStream) throws IOException {
        return (EzyMatrix$Matrix) GeneratedMessageV3.parseWithIOException(f5380b, inputStream);
    }

    public static EzyMatrix$Matrix parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyMatrix$Matrix) GeneratedMessageV3.parseWithIOException(f5380b, inputStream, extensionRegistryLite);
    }

    public static EzyMatrix$Matrix parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyMatrix$Matrix) GeneratedMessageV3.parseWithIOException(f5380b, codedInputStream);
    }

    private EzyMatrix$Matrix() {
        this.eventTime_ = 0L;
        this.scaleX_ = 0.0f;
        this.skewX_ = 0.0f;
        this.transX_ = 0.0f;
        this.skewY_ = 0.0f;
        this.scaleY_ = 0.0f;
        this.transY_ = 0.0f;
        this.perSp0_ = 0.0f;
        this.perSp1_ = 0.0f;
        this.perSp2_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyMatrix$Matrix parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyMatrix$Matrix) GeneratedMessageV3.parseWithIOException(f5380b, codedInputStream, extensionRegistryLite);
    }
}

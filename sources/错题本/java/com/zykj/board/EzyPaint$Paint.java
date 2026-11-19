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
import p020b4.AbstractC3151n0;
import p020b4.AbstractC3163r0;
import p020b4.C3154o0;
import p020b4.C3157p0;
import p020b4.InterfaceC3160q0;

/* loaded from: classes3.dex */
public final class EzyPaint$Paint extends GeneratedMessageV3 implements InterfaceC3160q0 {
    public static final int COLOR_FIELD_NUMBER = 2;
    public static final int ITEMLENGTH_FIELD_NUMBER = 4;
    public static final int SPACING_FIELD_NUMBER = 3;
    public static final int STYLE_FIELD_NUMBER = 5;
    public static final int TEXTSIZE_FIELD_NUMBER = 6;
    public static final int WIDTH_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzyPaint$Paint f5392a = new EzyPaint$Paint();

    /* renamed from: b */
    public static final C3154o0 f5393b = new C3154o0();
    private static final long serialVersionUID = 0;
    private int color_;
    private float itemLength_;
    private byte memoizedIsInitialized;
    private float spacing_;
    private int style_;
    private float textSize_;
    private float width_;

    public EzyPaint$Paint(GeneratedMessageV3.Builder builder, AbstractC3151n0 abstractC3151n0) {
        super(builder);
        this.width_ = 0.0f;
        this.color_ = 0;
        this.spacing_ = 0.0f;
        this.itemLength_ = 0.0f;
        this.style_ = 0;
        this.textSize_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyPaint$Paint getDefaultInstance() {
        return f5392a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3163r0.f1643a;
    }

    public static C3157p0 newBuilder() {
        return f5392a.toBuilder();
    }

    public static EzyPaint$Paint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyPaint$Paint) GeneratedMessageV3.parseDelimitedWithIOException(f5393b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPaint$Paint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyPaint$Paint) f5393b.parseFrom(byteBuffer);
    }

    public static Parser<EzyPaint$Paint> parser() {
        return f5393b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyPaint$Paint)) {
            return super.equals(obj);
        }
        EzyPaint$Paint ezyPaint$Paint = (EzyPaint$Paint) obj;
        return Float.floatToIntBits(getWidth()) == Float.floatToIntBits(ezyPaint$Paint.getWidth()) && getColor() == ezyPaint$Paint.getColor() && Float.floatToIntBits(getSpacing()) == Float.floatToIntBits(ezyPaint$Paint.getSpacing()) && Float.floatToIntBits(getItemLength()) == Float.floatToIntBits(ezyPaint$Paint.getItemLength()) && getStyle() == ezyPaint$Paint.getStyle() && Float.floatToIntBits(getTextSize()) == Float.floatToIntBits(ezyPaint$Paint.getTextSize()) && getUnknownFields().equals(ezyPaint$Paint.getUnknownFields());
    }

    public int getColor() {
        return this.color_;
    }

    public float getItemLength() {
        return this.itemLength_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyPaint$Paint> getParserForType() {
        return f5393b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeFloatSize = Float.floatToRawIntBits(this.width_) != 0 ? CodedOutputStream.computeFloatSize(1, this.width_) : 0;
        int i8 = this.color_;
        if (i8 != 0) {
            iComputeFloatSize += CodedOutputStream.computeInt32Size(2, i8);
        }
        if (Float.floatToRawIntBits(this.spacing_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.spacing_);
        }
        if (Float.floatToRawIntBits(this.itemLength_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.itemLength_);
        }
        int i9 = this.style_;
        if (i9 != 0) {
            iComputeFloatSize += CodedOutputStream.computeInt32Size(5, i9);
        }
        if (Float.floatToRawIntBits(this.textSize_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.textSize_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public float getSpacing() {
        return this.spacing_;
    }

    public int getStyle() {
        return this.style_;
    }

    public float getTextSize() {
        return this.textSize_;
    }

    public float getWidth() {
        return this.width_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getTextSize()) + ((((getStyle() + ((((Float.floatToIntBits(getItemLength()) + ((((Float.floatToIntBits(getSpacing()) + ((((getColor() + ((((Float.floatToIntBits(getWidth()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3163r0.f1644b.ensureFieldAccessorsInitialized(EzyPaint$Paint.class, C3157p0.class);
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
        return new EzyPaint$Paint();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (Float.floatToRawIntBits(this.width_) != 0) {
            codedOutputStream.writeFloat(1, this.width_);
        }
        int i = this.color_;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        if (Float.floatToRawIntBits(this.spacing_) != 0) {
            codedOutputStream.writeFloat(3, this.spacing_);
        }
        if (Float.floatToRawIntBits(this.itemLength_) != 0) {
            codedOutputStream.writeFloat(4, this.itemLength_);
        }
        int i8 = this.style_;
        if (i8 != 0) {
            codedOutputStream.writeInt32(5, i8);
        }
        if (Float.floatToRawIntBits(this.textSize_) != 0) {
            codedOutputStream.writeFloat(6, this.textSize_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3157p0 newBuilder(EzyPaint$Paint ezyPaint$Paint) {
        C3157p0 builder = f5392a.toBuilder();
        builder.m2101g(ezyPaint$Paint);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPaint$Paint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPaint$Paint) f5393b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyPaint$Paint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPaint$Paint) GeneratedMessageV3.parseDelimitedWithIOException(f5393b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPaint$Paint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyPaint$Paint) f5393b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyPaint$Paint getDefaultInstanceForType() {
        return f5392a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3157p0 toBuilder() {
        if (this == f5392a) {
            return new C3157p0();
        }
        C3157p0 c3157p0 = new C3157p0();
        c3157p0.m2101g(this);
        return c3157p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPaint$Paint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPaint$Paint) f5393b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3157p0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPaint$Paint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyPaint$Paint) f5393b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3157p0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new C3157p0(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPaint$Paint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPaint$Paint) f5393b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyPaint$Paint parseFrom(InputStream inputStream) throws IOException {
        return (EzyPaint$Paint) GeneratedMessageV3.parseWithIOException(f5393b, inputStream);
    }

    private EzyPaint$Paint() {
        this.width_ = 0.0f;
        this.color_ = 0;
        this.spacing_ = 0.0f;
        this.itemLength_ = 0.0f;
        this.style_ = 0;
        this.textSize_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyPaint$Paint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPaint$Paint) GeneratedMessageV3.parseWithIOException(f5393b, inputStream, extensionRegistryLite);
    }

    public static EzyPaint$Paint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyPaint$Paint) GeneratedMessageV3.parseWithIOException(f5393b, codedInputStream);
    }

    public static EzyPaint$Paint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPaint$Paint) GeneratedMessageV3.parseWithIOException(f5393b, codedInputStream, extensionRegistryLite);
    }
}

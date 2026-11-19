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
import p020b4.AbstractC3147m;
import p020b4.AbstractC3183y;
import p020b4.C3159q;
import p020b4.C3162r;
import p020b4.InterfaceC3165s;

/* loaded from: classes3.dex */
public final class EzyHeader$BackgroundLineConfig extends GeneratedMessageV3 implements InterfaceC3165s {
    public static final int LINECOLOR_FIELD_NUMBER = 1;
    public static final int LINESPACE_FIELD_NUMBER = 2;
    public static final int LINETYPE_FIELD_NUMBER = 3;
    public static final int LINEWIDTH_FIELD_NUMBER = 4;

    /* renamed from: a */
    public static final EzyHeader$BackgroundLineConfig f5373a = new EzyHeader$BackgroundLineConfig();

    /* renamed from: b */
    public static final C3159q f5374b = new C3159q();
    private static final long serialVersionUID = 0;
    private int lineColor_;
    private float lineSpace_;
    private int lineType_;
    private float lineWidth_;
    private byte memoizedIsInitialized;

    public EzyHeader$BackgroundLineConfig(GeneratedMessageV3.Builder builder, AbstractC3147m abstractC3147m) {
        super(builder);
        this.lineColor_ = 0;
        this.lineSpace_ = 0.0f;
        this.lineType_ = 0;
        this.lineWidth_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyHeader$BackgroundLineConfig getDefaultInstance() {
        return f5373a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3183y.f1704e;
    }

    public static C3162r newBuilder() {
        return f5373a.toBuilder();
    }

    public static EzyHeader$BackgroundLineConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$BackgroundLineConfig) GeneratedMessageV3.parseDelimitedWithIOException(f5374b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$BackgroundLineConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyHeader$BackgroundLineConfig) f5374b.parseFrom(byteBuffer);
    }

    public static Parser<EzyHeader$BackgroundLineConfig> parser() {
        return f5374b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyHeader$BackgroundLineConfig)) {
            return super.equals(obj);
        }
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = (EzyHeader$BackgroundLineConfig) obj;
        return getLineColor() == ezyHeader$BackgroundLineConfig.getLineColor() && Float.floatToIntBits(getLineSpace()) == Float.floatToIntBits(ezyHeader$BackgroundLineConfig.getLineSpace()) && this.lineType_ == ezyHeader$BackgroundLineConfig.lineType_ && Float.floatToIntBits(getLineWidth()) == Float.floatToIntBits(ezyHeader$BackgroundLineConfig.getLineWidth()) && getUnknownFields().equals(ezyHeader$BackgroundLineConfig.getUnknownFields());
    }

    public int getLineColor() {
        return this.lineColor_;
    }

    public float getLineSpace() {
        return this.lineSpace_;
    }

    public EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum getLineType() {
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber = EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.forNumber(this.lineType_);
        return ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber == null ? EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.UNRECOGNIZED : ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber;
    }

    public int getLineTypeValue() {
        return this.lineType_;
    }

    public float getLineWidth() {
        return this.lineWidth_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyHeader$BackgroundLineConfig> getParserForType() {
        return f5374b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i8 = this.lineColor_;
        int iComputeInt32Size = i8 != 0 ? CodedOutputStream.computeInt32Size(1, i8) : 0;
        if (Float.floatToRawIntBits(this.lineSpace_) != 0) {
            iComputeInt32Size += CodedOutputStream.computeFloatSize(2, this.lineSpace_);
        }
        if (this.lineType_ != EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
            iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.lineType_);
        }
        if (Float.floatToRawIntBits(this.lineWidth_) != 0) {
            iComputeInt32Size += CodedOutputStream.computeFloatSize(4, this.lineWidth_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Float.floatToIntBits(getLineWidth()) + ((((((((Float.floatToIntBits(getLineSpace()) + ((((getLineColor() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53) + this.lineType_) * 37) + 4) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3183y.f1705f.ensureFieldAccessorsInitialized(EzyHeader$BackgroundLineConfig.class, C3162r.class);
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
        return new EzyHeader$BackgroundLineConfig();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.lineColor_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (Float.floatToRawIntBits(this.lineSpace_) != 0) {
            codedOutputStream.writeFloat(2, this.lineSpace_);
        }
        if (this.lineType_ != EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
            codedOutputStream.writeEnum(3, this.lineType_);
        }
        if (Float.floatToRawIntBits(this.lineWidth_) != 0) {
            codedOutputStream.writeFloat(4, this.lineWidth_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3162r newBuilder(EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig) {
        C3162r builder = f5373a.toBuilder();
        builder.m2112g(ezyHeader$BackgroundLineConfig);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$BackgroundLineConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$BackgroundLineConfig) f5374b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyHeader$BackgroundLineConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$BackgroundLineConfig) GeneratedMessageV3.parseDelimitedWithIOException(f5374b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$BackgroundLineConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyHeader$BackgroundLineConfig) f5374b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyHeader$BackgroundLineConfig getDefaultInstanceForType() {
        return f5373a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3162r toBuilder() {
        if (this == f5373a) {
            return new C3162r();
        }
        C3162r c3162r = new C3162r();
        c3162r.m2112g(this);
        return c3162r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$BackgroundLineConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$BackgroundLineConfig) f5374b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3162r newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$BackgroundLineConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyHeader$BackgroundLineConfig) f5374b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3162r newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C3162r c3162r = new C3162r(builderParent);
        c3162r.f1641d = 0;
        return c3162r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$BackgroundLineConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$BackgroundLineConfig) f5374b.parseFrom(bArr, extensionRegistryLite);
    }

    private EzyHeader$BackgroundLineConfig() {
        this.lineColor_ = 0;
        this.lineSpace_ = 0.0f;
        this.lineWidth_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
        this.lineType_ = 0;
    }

    public static EzyHeader$BackgroundLineConfig parseFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$BackgroundLineConfig) GeneratedMessageV3.parseWithIOException(f5374b, inputStream);
    }

    public static EzyHeader$BackgroundLineConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$BackgroundLineConfig) GeneratedMessageV3.parseWithIOException(f5374b, inputStream, extensionRegistryLite);
    }

    public static EzyHeader$BackgroundLineConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyHeader$BackgroundLineConfig) GeneratedMessageV3.parseWithIOException(f5374b, codedInputStream);
    }

    public static EzyHeader$BackgroundLineConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$BackgroundLineConfig) GeneratedMessageV3.parseWithIOException(f5374b, codedInputStream, extensionRegistryLite);
    }
}

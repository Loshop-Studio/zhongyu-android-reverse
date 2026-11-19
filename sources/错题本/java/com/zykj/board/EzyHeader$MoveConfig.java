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
import p020b4.C3174v;
import p020b4.C3177w;
import p020b4.InterfaceC3180x;

/* loaded from: classes3.dex */
public final class EzyHeader$MoveConfig extends GeneratedMessageV3 implements InterfaceC3180x {
    public static final int HORIZONTALTRANSLATE_FIELD_NUMBER = 3;
    public static final int ISENABLE_FIELD_NUMBER = 1;
    public static final int MAXHEIGHTTIMES_FIELD_NUMBER = 6;
    public static final int MAXWIDTHTIMES_FIELD_NUMBER = 7;
    public static final int ROTATE_FIELD_NUMBER = 5;
    public static final int SCALE_FIELD_NUMBER = 4;
    public static final int VERTICALTRANSLATE_FIELD_NUMBER = 2;

    /* renamed from: a */
    public static final EzyHeader$MoveConfig f5377a = new EzyHeader$MoveConfig();

    /* renamed from: b */
    public static final C3174v f5378b = new C3174v();
    private static final long serialVersionUID = 0;
    private boolean horizontalTranslate_;
    private boolean isEnable_;
    private int maxHeightTimes_;
    private int maxWidthTimes_;
    private byte memoizedIsInitialized;
    private boolean rotate_;
    private boolean scale_;
    private boolean verticalTranslate_;

    public EzyHeader$MoveConfig(GeneratedMessageV3.Builder builder, AbstractC3147m abstractC3147m) {
        super(builder);
        this.isEnable_ = false;
        this.verticalTranslate_ = false;
        this.horizontalTranslate_ = false;
        this.scale_ = false;
        this.rotate_ = false;
        this.maxHeightTimes_ = 0;
        this.maxWidthTimes_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyHeader$MoveConfig getDefaultInstance() {
        return f5377a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3183y.f1702c;
    }

    public static C3177w newBuilder() {
        return f5377a.toBuilder();
    }

    public static EzyHeader$MoveConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$MoveConfig) GeneratedMessageV3.parseDelimitedWithIOException(f5378b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$MoveConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyHeader$MoveConfig) f5378b.parseFrom(byteBuffer);
    }

    public static Parser<EzyHeader$MoveConfig> parser() {
        return f5378b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyHeader$MoveConfig)) {
            return super.equals(obj);
        }
        EzyHeader$MoveConfig ezyHeader$MoveConfig = (EzyHeader$MoveConfig) obj;
        return getIsEnable() == ezyHeader$MoveConfig.getIsEnable() && getVerticalTranslate() == ezyHeader$MoveConfig.getVerticalTranslate() && getHorizontalTranslate() == ezyHeader$MoveConfig.getHorizontalTranslate() && getScale() == ezyHeader$MoveConfig.getScale() && getRotate() == ezyHeader$MoveConfig.getRotate() && getMaxHeightTimes() == ezyHeader$MoveConfig.getMaxHeightTimes() && getMaxWidthTimes() == ezyHeader$MoveConfig.getMaxWidthTimes() && getUnknownFields().equals(ezyHeader$MoveConfig.getUnknownFields());
    }

    public boolean getHorizontalTranslate() {
        return this.horizontalTranslate_;
    }

    public boolean getIsEnable() {
        return this.isEnable_;
    }

    public int getMaxHeightTimes() {
        return this.maxHeightTimes_;
    }

    public int getMaxWidthTimes() {
        return this.maxWidthTimes_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyHeader$MoveConfig> getParserForType() {
        return f5378b;
    }

    public boolean getRotate() {
        return this.rotate_;
    }

    public boolean getScale() {
        return this.scale_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean z8 = this.isEnable_;
        int iComputeBoolSize = z8 ? CodedOutputStream.computeBoolSize(1, z8) : 0;
        boolean z9 = this.verticalTranslate_;
        if (z9) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z9);
        }
        boolean z10 = this.horizontalTranslate_;
        if (z10) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(3, z10);
        }
        boolean z11 = this.scale_;
        if (z11) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(4, z11);
        }
        boolean z12 = this.rotate_;
        if (z12) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(5, z12);
        }
        int i8 = this.maxHeightTimes_;
        if (i8 != 0) {
            iComputeBoolSize += CodedOutputStream.computeInt32Size(6, i8);
        }
        int i9 = this.maxWidthTimes_;
        if (i9 != 0) {
            iComputeBoolSize += CodedOutputStream.computeInt32Size(7, i9);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean getVerticalTranslate() {
        return this.verticalTranslate_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getMaxWidthTimes() + ((((getMaxHeightTimes() + ((((Internal.hashBoolean(getRotate()) + ((((Internal.hashBoolean(getScale()) + ((((Internal.hashBoolean(getHorizontalTranslate()) + ((((Internal.hashBoolean(getVerticalTranslate()) + ((((Internal.hashBoolean(getIsEnable()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3183y.f1703d.ensureFieldAccessorsInitialized(EzyHeader$MoveConfig.class, C3177w.class);
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
        return new EzyHeader$MoveConfig();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z8 = this.isEnable_;
        if (z8) {
            codedOutputStream.writeBool(1, z8);
        }
        boolean z9 = this.verticalTranslate_;
        if (z9) {
            codedOutputStream.writeBool(2, z9);
        }
        boolean z10 = this.horizontalTranslate_;
        if (z10) {
            codedOutputStream.writeBool(3, z10);
        }
        boolean z11 = this.scale_;
        if (z11) {
            codedOutputStream.writeBool(4, z11);
        }
        boolean z12 = this.rotate_;
        if (z12) {
            codedOutputStream.writeBool(5, z12);
        }
        int i = this.maxHeightTimes_;
        if (i != 0) {
            codedOutputStream.writeInt32(6, i);
        }
        int i8 = this.maxWidthTimes_;
        if (i8 != 0) {
            codedOutputStream.writeInt32(7, i8);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C3177w newBuilder(EzyHeader$MoveConfig ezyHeader$MoveConfig) {
        C3177w builder = f5377a.toBuilder();
        builder.m2134f(ezyHeader$MoveConfig);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$MoveConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$MoveConfig) f5378b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyHeader$MoveConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$MoveConfig) GeneratedMessageV3.parseDelimitedWithIOException(f5378b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$MoveConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyHeader$MoveConfig) f5378b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyHeader$MoveConfig getDefaultInstanceForType() {
        return f5377a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3177w toBuilder() {
        if (this == f5377a) {
            return new C3177w();
        }
        C3177w c3177w = new C3177w();
        c3177w.m2134f(this);
        return c3177w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$MoveConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$MoveConfig) f5378b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C3177w newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$MoveConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyHeader$MoveConfig) f5378b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C3177w newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new C3177w(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyHeader$MoveConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyHeader$MoveConfig) f5378b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyHeader$MoveConfig parseFrom(InputStream inputStream) throws IOException {
        return (EzyHeader$MoveConfig) GeneratedMessageV3.parseWithIOException(f5378b, inputStream);
    }

    public static EzyHeader$MoveConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$MoveConfig) GeneratedMessageV3.parseWithIOException(f5378b, inputStream, extensionRegistryLite);
    }

    private EzyHeader$MoveConfig() {
        this.isEnable_ = false;
        this.verticalTranslate_ = false;
        this.horizontalTranslate_ = false;
        this.scale_ = false;
        this.rotate_ = false;
        this.maxHeightTimes_ = 0;
        this.maxWidthTimes_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyHeader$MoveConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyHeader$MoveConfig) GeneratedMessageV3.parseWithIOException(f5378b, codedInputStream);
    }

    public static EzyHeader$MoveConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyHeader$MoveConfig) GeneratedMessageV3.parseWithIOException(f5378b, codedInputStream, extensionRegistryLite);
    }
}

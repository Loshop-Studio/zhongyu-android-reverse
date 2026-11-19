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
import p020b4.C3152n1;
import p020b4.InterfaceC3155o1;
import p020b4.InterfaceC3160q0;
import p020b4.InterfaceC3175v0;

/* loaded from: classes3.dex */
public final class EzySource$GeometrySource extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int GEOMETRYINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzySource$GeometrySource f5414a = new EzySource$GeometrySource();

    /* renamed from: b */
    public static final C3152n1 f5415b = new C3152n1();
    private static final long serialVersionUID = 0;
    private List<GeometryInfo> geometryInfo_;
    private byte memoizedIsInitialized;

    public static final class GeometryInfo extends GeneratedMessageV3 implements InterfaceC3155o1 {
        public static final int GEOMETRYTYPE_FIELD_NUMBER = 1;
        public static final int PAINT_FIELD_NUMBER = 3;
        public static final int POINTS_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final GeometryInfo f5416a = new GeometryInfo();

        /* renamed from: b */
        public static final C4379m0 f5417b = new C4379m0();
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int geometryType_;
        private byte memoizedIsInitialized;
        private EzyPaint$Paint paint_;
        private List<EzyPointF$PointF> points_;

        public GeometryInfo(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
            super(builder);
            this.geometryType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$9476(GeometryInfo geometryInfo, int i) {
            int i8 = i | geometryInfo.bitField0_;
            geometryInfo.bitField0_ = i8;
            return i8;
        }

        public static GeometryInfo getDefaultInstance() {
            return f5416a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3176v1.f1687s;
        }

        public static C4381n0 newBuilder() {
            return f5416a.toBuilder();
        }

        public static GeometryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeometryInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5417b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GeometryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GeometryInfo) f5417b.parseFrom(byteBuffer);
        }

        public static Parser<GeometryInfo> parser() {
            return f5417b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GeometryInfo)) {
                return super.equals(obj);
            }
            GeometryInfo geometryInfo = (GeometryInfo) obj;
            if (this.geometryType_ == geometryInfo.geometryType_ && getPointsList().equals(geometryInfo.getPointsList()) && hasPaint() == geometryInfo.hasPaint()) {
                return (!hasPaint() || getPaint().equals(geometryInfo.getPaint())) && getUnknownFields().equals(geometryInfo.getUnknownFields());
            }
            return false;
        }

        public EzyGeometryEnum$GeometryEnum getGeometryType() {
            EzyGeometryEnum$GeometryEnum ezyGeometryEnum$GeometryEnumForNumber = EzyGeometryEnum$GeometryEnum.forNumber(this.geometryType_);
            return ezyGeometryEnum$GeometryEnumForNumber == null ? EzyGeometryEnum$GeometryEnum.UNRECOGNIZED : ezyGeometryEnum$GeometryEnumForNumber;
        }

        public int getGeometryTypeValue() {
            return this.geometryType_;
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
        public Parser<GeometryInfo> getParserForType() {
            return f5417b;
        }

        public EzyPointF$PointF getPoints(int i) {
            return this.points_.get(i);
        }

        public int getPointsCount() {
            return this.points_.size();
        }

        public List<EzyPointF$PointF> getPointsList() {
            return this.points_;
        }

        public InterfaceC3175v0 getPointsOrBuilder(int i) {
            return this.points_.get(i);
        }

        public List<? extends InterfaceC3175v0> getPointsOrBuilderList() {
            return this.points_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = this.geometryType_ != EzyGeometryEnum$GeometryEnum.OVAL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.geometryType_) : 0;
            for (int i8 = 0; i8 < this.points_.size(); i8++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.points_.get(i8));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getPaint());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
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
            int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.geometryType_;
            if (getPointsCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getPointsList().hashCode();
            }
            if (hasPaint()) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 3, 53) + getPaint().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3176v1.f1688t.ensureFieldAccessorsInitialized(GeometryInfo.class, C4381n0.class);
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
            return new GeometryInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.geometryType_ != EzyGeometryEnum$GeometryEnum.OVAL.getNumber()) {
                codedOutputStream.writeEnum(1, this.geometryType_);
            }
            for (int i = 0; i < this.points_.size(); i++) {
                codedOutputStream.writeMessage(2, this.points_.get(i));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(3, getPaint());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4381n0 newBuilder(GeometryInfo geometryInfo) {
            C4381n0 builder = f5416a.toBuilder();
            builder.m3792k(geometryInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GeometryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeometryInfo) f5417b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static GeometryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeometryInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5417b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GeometryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GeometryInfo) f5417b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GeometryInfo getDefaultInstanceForType() {
            return f5416a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4381n0 toBuilder() {
            if (this == f5416a) {
                return new C4381n0();
            }
            C4381n0 c4381n0 = new C4381n0();
            c4381n0.m3792k(this);
            return c4381n0;
        }

        private GeometryInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.geometryType_ = 0;
            this.points_ = Collections.EMPTY_LIST;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GeometryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeometryInfo) f5417b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4381n0 newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GeometryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeometryInfo) f5417b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4381n0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4381n0 c4381n0 = new C4381n0(builderParent);
            c4381n0.f5534b = 0;
            c4381n0.f5535c = Collections.EMPTY_LIST;
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                c4381n0.m3791j();
                c4381n0.m3790i();
            }
            return c4381n0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GeometryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeometryInfo) f5417b.parseFrom(bArr, extensionRegistryLite);
        }

        public static GeometryInfo parseFrom(InputStream inputStream) throws IOException {
            return (GeometryInfo) GeneratedMessageV3.parseWithIOException(f5417b, inputStream);
        }

        public static GeometryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeometryInfo) GeneratedMessageV3.parseWithIOException(f5417b, inputStream, extensionRegistryLite);
        }

        public static GeometryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GeometryInfo) GeneratedMessageV3.parseWithIOException(f5417b, codedInputStream);
        }

        public static GeometryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeometryInfo) GeneratedMessageV3.parseWithIOException(f5417b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzySource$GeometrySource(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzySource$GeometrySource getDefaultInstance() {
        return f5414a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3176v1.f1685q;
    }

    public static C4377l0 newBuilder() {
        return f5414a.toBuilder();
    }

    public static EzySource$GeometrySource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzySource$GeometrySource) GeneratedMessageV3.parseDelimitedWithIOException(f5415b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$GeometrySource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzySource$GeometrySource) f5415b.parseFrom(byteBuffer);
    }

    public static Parser<EzySource$GeometrySource> parser() {
        return f5415b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzySource$GeometrySource)) {
            return super.equals(obj);
        }
        EzySource$GeometrySource ezySource$GeometrySource = (EzySource$GeometrySource) obj;
        return getGeometryInfoList().equals(ezySource$GeometrySource.getGeometryInfoList()) && getUnknownFields().equals(ezySource$GeometrySource.getUnknownFields());
    }

    public GeometryInfo getGeometryInfo(int i) {
        return this.geometryInfo_.get(i);
    }

    public int getGeometryInfoCount() {
        return this.geometryInfo_.size();
    }

    public List<GeometryInfo> getGeometryInfoList() {
        return this.geometryInfo_;
    }

    public InterfaceC3155o1 getGeometryInfoOrBuilder(int i) {
        return this.geometryInfo_.get(i);
    }

    public List<? extends InterfaceC3155o1> getGeometryInfoOrBuilderList() {
        return this.geometryInfo_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzySource$GeometrySource> getParserForType() {
        return f5415b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.geometryInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.geometryInfo_.get(i8));
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
        if (getGeometryInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getGeometryInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1686r.ensureFieldAccessorsInitialized(EzySource$GeometrySource.class, C4377l0.class);
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
        return new EzySource$GeometrySource();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.geometryInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.geometryInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4377l0 newBuilder(EzySource$GeometrySource ezySource$GeometrySource) {
        C4377l0 builder = f5414a.toBuilder();
        builder.m3779g(ezySource$GeometrySource);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$GeometrySource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$GeometrySource) f5415b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzySource$GeometrySource() {
        this.memoizedIsInitialized = (byte) -1;
        this.geometryInfo_ = Collections.EMPTY_LIST;
    }

    public static EzySource$GeometrySource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$GeometrySource) GeneratedMessageV3.parseDelimitedWithIOException(f5415b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$GeometrySource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzySource$GeometrySource) f5415b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzySource$GeometrySource getDefaultInstanceForType() {
        return f5414a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4377l0 toBuilder() {
        if (this == f5414a) {
            return new C4377l0();
        }
        C4377l0 c4377l0 = new C4377l0();
        c4377l0.m3779g(this);
        return c4377l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$GeometrySource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$GeometrySource) f5415b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4377l0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$GeometrySource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzySource$GeometrySource) f5415b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4377l0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4377l0 c4377l0 = new C4377l0(builderParent);
        c4377l0.f5528b = Collections.EMPTY_LIST;
        return c4377l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$GeometrySource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$GeometrySource) f5415b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzySource$GeometrySource parseFrom(InputStream inputStream) throws IOException {
        return (EzySource$GeometrySource) GeneratedMessageV3.parseWithIOException(f5415b, inputStream);
    }

    public static EzySource$GeometrySource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$GeometrySource) GeneratedMessageV3.parseWithIOException(f5415b, inputStream, extensionRegistryLite);
    }

    public static EzySource$GeometrySource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzySource$GeometrySource) GeneratedMessageV3.parseWithIOException(f5415b, codedInputStream);
    }

    public static EzySource$GeometrySource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$GeometrySource) GeneratedMessageV3.parseWithIOException(f5415b, codedInputStream, extensionRegistryLite);
    }
}

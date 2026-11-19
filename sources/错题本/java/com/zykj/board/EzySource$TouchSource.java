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
import p020b4.C3170t1;
import p020b4.InterfaceC3160q0;
import p020b4.InterfaceC3173u1;

/* loaded from: classes3.dex */
public final class EzySource$TouchSource extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int TOUCHINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzySource$TouchSource f5426a = new EzySource$TouchSource();

    /* renamed from: b */
    public static final C3170t1 f5427b = new C3170t1();
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<TouchInfo> touchInfo_;

    public static final class TouchInfo extends GeneratedMessageV3 implements InterfaceC3173u1 {
        public static final int PAINT_FIELD_NUMBER = 2;
        public static final int TOUCHEVENT_FIELD_NUMBER = 1;

        /* renamed from: a */
        public static final TouchInfo f5428a = new TouchInfo();

        /* renamed from: b */
        public static final C4397v0 f5429b = new C4397v0();
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private EzyPaint$Paint paint_;
        private List<EzyTouchEvent$TouchEvent> touchEvent_;

        public TouchInfo(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$1076(TouchInfo touchInfo, int i) {
            int i8 = i | touchInfo.bitField0_;
            touchInfo.bitField0_ = i8;
            return i8;
        }

        public static TouchInfo getDefaultInstance() {
            return f5428a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3176v1.f1671c;
        }

        public static C4399w0 newBuilder() {
            return f5428a.toBuilder();
        }

        public static TouchInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TouchInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5429b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TouchInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TouchInfo) f5429b.parseFrom(byteBuffer);
        }

        public static Parser<TouchInfo> parser() {
            return f5429b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TouchInfo)) {
                return super.equals(obj);
            }
            TouchInfo touchInfo = (TouchInfo) obj;
            if (getTouchEventList().equals(touchInfo.getTouchEventList()) && hasPaint() == touchInfo.hasPaint()) {
                return (!hasPaint() || getPaint().equals(touchInfo.getPaint())) && getUnknownFields().equals(touchInfo.getUnknownFields());
            }
            return false;
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
        public Parser<TouchInfo> getParserForType() {
            return f5429b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i8 = 0; i8 < this.touchEvent_.size(); i8++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.touchEvent_.get(i8));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getPaint());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public EzyTouchEvent$TouchEvent getTouchEvent(int i) {
            return this.touchEvent_.get(i);
        }

        public int getTouchEventCount() {
            return this.touchEvent_.size();
        }

        public List<EzyTouchEvent$TouchEvent> getTouchEventList() {
            return this.touchEvent_;
        }

        public InterfaceC4359c1 getTouchEventOrBuilder(int i) {
            return this.touchEvent_.get(i);
        }

        public List<? extends InterfaceC4359c1> getTouchEventOrBuilderList() {
            return this.touchEvent_;
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
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getTouchEventCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getTouchEventList().hashCode();
            }
            if (hasPaint()) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getPaint().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3176v1.f1672d.ensureFieldAccessorsInitialized(TouchInfo.class, C4399w0.class);
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
            return new TouchInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.touchEvent_.size(); i++) {
                codedOutputStream.writeMessage(1, this.touchEvent_.get(i));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getPaint());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4399w0 newBuilder(TouchInfo touchInfo) {
            C4399w0 builder = f5428a.toBuilder();
            builder.m3857i(touchInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TouchInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TouchInfo) f5429b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private TouchInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.touchEvent_ = Collections.EMPTY_LIST;
        }

        public static TouchInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TouchInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5429b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TouchInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TouchInfo) f5429b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TouchInfo getDefaultInstanceForType() {
            return f5428a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4399w0 toBuilder() {
            if (this == f5428a) {
                return new C4399w0();
            }
            C4399w0 c4399w0 = new C4399w0();
            c4399w0.m3857i(this);
            return c4399w0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TouchInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TouchInfo) f5429b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4399w0 newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TouchInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TouchInfo) f5429b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4399w0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4399w0 c4399w0 = new C4399w0(builderParent);
            c4399w0.f5590b = Collections.EMPTY_LIST;
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                c4399w0.getTouchEventFieldBuilder();
                c4399w0.m3856h();
            }
            return c4399w0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TouchInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TouchInfo) f5429b.parseFrom(bArr, extensionRegistryLite);
        }

        public static TouchInfo parseFrom(InputStream inputStream) throws IOException {
            return (TouchInfo) GeneratedMessageV3.parseWithIOException(f5429b, inputStream);
        }

        public static TouchInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TouchInfo) GeneratedMessageV3.parseWithIOException(f5429b, inputStream, extensionRegistryLite);
        }

        public static TouchInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TouchInfo) GeneratedMessageV3.parseWithIOException(f5429b, codedInputStream);
        }

        public static TouchInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TouchInfo) GeneratedMessageV3.parseWithIOException(f5429b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzySource$TouchSource(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzySource$TouchSource getDefaultInstance() {
        return f5426a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3176v1.f1669a;
    }

    public static C4395u0 newBuilder() {
        return f5426a.toBuilder();
    }

    public static EzySource$TouchSource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzySource$TouchSource) GeneratedMessageV3.parseDelimitedWithIOException(f5427b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TouchSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzySource$TouchSource) f5427b.parseFrom(byteBuffer);
    }

    public static Parser<EzySource$TouchSource> parser() {
        return f5427b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzySource$TouchSource)) {
            return super.equals(obj);
        }
        EzySource$TouchSource ezySource$TouchSource = (EzySource$TouchSource) obj;
        return getTouchInfoList().equals(ezySource$TouchSource.getTouchInfoList()) && getUnknownFields().equals(ezySource$TouchSource.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzySource$TouchSource> getParserForType() {
        return f5427b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.touchInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.touchInfo_.get(i8));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public TouchInfo getTouchInfo(int i) {
        return this.touchInfo_.get(i);
    }

    public int getTouchInfoCount() {
        return this.touchInfo_.size();
    }

    public List<TouchInfo> getTouchInfoList() {
        return this.touchInfo_;
    }

    public InterfaceC3173u1 getTouchInfoOrBuilder(int i) {
        return this.touchInfo_.get(i);
    }

    public List<? extends InterfaceC3173u1> getTouchInfoOrBuilderList() {
        return this.touchInfo_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getTouchInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getTouchInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1670b.ensureFieldAccessorsInitialized(EzySource$TouchSource.class, C4395u0.class);
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
        return new EzySource$TouchSource();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.touchInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.touchInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4395u0 newBuilder(EzySource$TouchSource ezySource$TouchSource) {
        C4395u0 builder = f5426a.toBuilder();
        builder.m3845g(ezySource$TouchSource);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TouchSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$TouchSource) f5427b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzySource$TouchSource() {
        this.memoizedIsInitialized = (byte) -1;
        this.touchInfo_ = Collections.EMPTY_LIST;
    }

    public static EzySource$TouchSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$TouchSource) GeneratedMessageV3.parseDelimitedWithIOException(f5427b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TouchSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzySource$TouchSource) f5427b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzySource$TouchSource getDefaultInstanceForType() {
        return f5426a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4395u0 toBuilder() {
        if (this == f5426a) {
            return new C4395u0();
        }
        C4395u0 c4395u0 = new C4395u0();
        c4395u0.m3845g(this);
        return c4395u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TouchSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$TouchSource) f5427b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4395u0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TouchSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzySource$TouchSource) f5427b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4395u0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4395u0 c4395u0 = new C4395u0(builderParent);
        c4395u0.f5584b = Collections.EMPTY_LIST;
        return c4395u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$TouchSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$TouchSource) f5427b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzySource$TouchSource parseFrom(InputStream inputStream) throws IOException {
        return (EzySource$TouchSource) GeneratedMessageV3.parseWithIOException(f5427b, inputStream);
    }

    public static EzySource$TouchSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$TouchSource) GeneratedMessageV3.parseWithIOException(f5427b, inputStream, extensionRegistryLite);
    }

    public static EzySource$TouchSource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzySource$TouchSource) GeneratedMessageV3.parseWithIOException(f5427b, codedInputStream);
    }

    public static EzySource$TouchSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$TouchSource) GeneratedMessageV3.parseWithIOException(f5427b, codedInputStream, extensionRegistryLite);
    }
}

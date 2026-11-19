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
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3113a2;
import p020b4.AbstractC3179w1;
import p020b4.C3182x1;
import p020b4.InterfaceC3185y1;
import p020b4.InterfaceC3188z1;

/* loaded from: classes3.dex */
public final class EzyTouchEvent$TouchEvent extends GeneratedMessageV3 implements InterfaceC4359c1 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int EVENTTIME_FIELD_NUMBER = 1;
    public static final int POINTERCOORDS_FIELD_NUMBER = 7;
    public static final int POINTERCOUNT_FIELD_NUMBER = 5;
    public static final int POINTERPROPERTIES_FIELD_NUMBER = 6;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;

    /* renamed from: a */
    public static final EzyTouchEvent$TouchEvent f5430a = new EzyTouchEvent$TouchEvent();

    /* renamed from: b */
    public static final C3182x1 f5431b = new C3182x1();
    private static final long serialVersionUID = 0;
    private int action_;
    private long eventTime_;
    private byte memoizedIsInitialized;
    private List<PointerCoords> pointerCoords_;
    private int pointerCount_;
    private List<PointerProperties> pointerProperties_;

    /* renamed from: x_ */
    private float f5432x_;

    /* renamed from: y_ */
    private float f5433y_;

    public static final class PointerCoords extends GeneratedMessageV3 implements InterfaceC3185y1 {
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final PointerCoords f5434a = new PointerCoords();

        /* renamed from: b */
        public static final C4403y0 f5435b = new C4403y0();
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        /* renamed from: x_ */
        private float f5436x_;

        /* renamed from: y_ */
        private float f5437y_;

        public PointerCoords(GeneratedMessageV3.Builder builder, AbstractC3179w1 abstractC3179w1) {
            super(builder);
            this.f5436x_ = 0.0f;
            this.f5437y_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PointerCoords getDefaultInstance() {
            return f5434a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3113a2.f1555e;
        }

        public static C4405z0 newBuilder() {
            return f5434a.toBuilder();
        }

        public static PointerCoords parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PointerCoords) GeneratedMessageV3.parseDelimitedWithIOException(f5435b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerCoords parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PointerCoords) f5435b.parseFrom(byteBuffer);
        }

        public static Parser<PointerCoords> parser() {
            return f5435b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PointerCoords)) {
                return super.equals(obj);
            }
            PointerCoords pointerCoords = (PointerCoords) obj;
            return Float.floatToIntBits(getX()) == Float.floatToIntBits(pointerCoords.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(pointerCoords.getY()) && getUnknownFields().equals(pointerCoords.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PointerCoords> getParserForType() {
            return f5435b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f5436x_) != 0 ? CodedOutputStream.computeFloatSize(1, this.f5436x_) : 0;
            if (Float.floatToRawIntBits(this.f5437y_) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f5437y_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f5436x_;
        }

        public float getY() {
            return this.f5437y_;
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
            return AbstractC3113a2.f1556f.ensureFieldAccessorsInitialized(PointerCoords.class, C4405z0.class);
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
            return new PointerCoords();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f5436x_) != 0) {
                codedOutputStream.writeFloat(1, this.f5436x_);
            }
            if (Float.floatToRawIntBits(this.f5437y_) != 0) {
                codedOutputStream.writeFloat(2, this.f5437y_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4405z0 newBuilder(PointerCoords pointerCoords) {
            C4405z0 builder = f5434a.toBuilder();
            builder.m3881g(pointerCoords);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerCoords parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointerCoords) f5435b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PointerCoords parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointerCoords) GeneratedMessageV3.parseDelimitedWithIOException(f5435b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerCoords parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PointerCoords) f5435b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PointerCoords getDefaultInstanceForType() {
            return f5434a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4405z0 toBuilder() {
            if (this == f5434a) {
                return new C4405z0();
            }
            C4405z0 c4405z0 = new C4405z0();
            c4405z0.m3881g(this);
            return c4405z0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerCoords parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointerCoords) f5435b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4405z0 newBuilderForType() {
            return newBuilder();
        }

        private PointerCoords() {
            this.f5436x_ = 0.0f;
            this.f5437y_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerCoords parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PointerCoords) f5435b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4405z0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C4405z0(builderParent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerCoords parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointerCoords) f5435b.parseFrom(bArr, extensionRegistryLite);
        }

        public static PointerCoords parseFrom(InputStream inputStream) throws IOException {
            return (PointerCoords) GeneratedMessageV3.parseWithIOException(f5435b, inputStream);
        }

        public static PointerCoords parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointerCoords) GeneratedMessageV3.parseWithIOException(f5435b, inputStream, extensionRegistryLite);
        }

        public static PointerCoords parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PointerCoords) GeneratedMessageV3.parseWithIOException(f5435b, codedInputStream);
        }

        public static PointerCoords parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointerCoords) GeneratedMessageV3.parseWithIOException(f5435b, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PointerProperties extends GeneratedMessageV3 implements InterfaceC3188z1 {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int TOOLTYPE_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final PointerProperties f5438a = new PointerProperties();

        /* renamed from: b */
        public static final C4353a1 f5439b = new C4353a1();
        private static final long serialVersionUID = 0;
        private int id_;
        private byte memoizedIsInitialized;
        private int toolType_;

        public PointerProperties(GeneratedMessageV3.Builder builder, AbstractC3179w1 abstractC3179w1) {
            super(builder);
            this.id_ = 0;
            this.toolType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PointerProperties getDefaultInstance() {
            return f5438a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3113a2.f1553c;
        }

        public static C4356b1 newBuilder() {
            return f5438a.toBuilder();
        }

        public static PointerProperties parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PointerProperties) GeneratedMessageV3.parseDelimitedWithIOException(f5439b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerProperties parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PointerProperties) f5439b.parseFrom(byteBuffer);
        }

        public static Parser<PointerProperties> parser() {
            return f5439b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PointerProperties)) {
                return super.equals(obj);
            }
            PointerProperties pointerProperties = (PointerProperties) obj;
            return getId() == pointerProperties.getId() && getToolType() == pointerProperties.getToolType() && getUnknownFields().equals(pointerProperties.getUnknownFields());
        }

        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PointerProperties> getParserForType() {
            return f5439b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i8 = this.id_;
            int iComputeInt32Size = i8 != 0 ? CodedOutputStream.computeInt32Size(1, i8) : 0;
            int i9 = this.toolType_;
            if (i9 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i9);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public int getToolType() {
            return this.toolType_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getToolType() + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3113a2.f1554d.ensureFieldAccessorsInitialized(PointerProperties.class, C4356b1.class);
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
            return new PointerProperties();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i8 = this.toolType_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(2, i8);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4356b1 newBuilder(PointerProperties pointerProperties) {
            C4356b1 builder = f5438a.toBuilder();
            builder.m3701e(pointerProperties);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerProperties parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointerProperties) f5439b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PointerProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointerProperties) GeneratedMessageV3.parseDelimitedWithIOException(f5439b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerProperties parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PointerProperties) f5439b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PointerProperties getDefaultInstanceForType() {
            return f5438a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4356b1 toBuilder() {
            if (this == f5438a) {
                return new C4356b1();
            }
            C4356b1 c4356b1 = new C4356b1();
            c4356b1.m3701e(this);
            return c4356b1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointerProperties) f5439b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4356b1 newBuilderForType() {
            return newBuilder();
        }

        private PointerProperties() {
            this.id_ = 0;
            this.toolType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PointerProperties) f5439b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4356b1 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C4356b1(builderParent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PointerProperties parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointerProperties) f5439b.parseFrom(bArr, extensionRegistryLite);
        }

        public static PointerProperties parseFrom(InputStream inputStream) throws IOException {
            return (PointerProperties) GeneratedMessageV3.parseWithIOException(f5439b, inputStream);
        }

        public static PointerProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointerProperties) GeneratedMessageV3.parseWithIOException(f5439b, inputStream, extensionRegistryLite);
        }

        public static PointerProperties parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PointerProperties) GeneratedMessageV3.parseWithIOException(f5439b, codedInputStream);
        }

        public static PointerProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointerProperties) GeneratedMessageV3.parseWithIOException(f5439b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzyTouchEvent$TouchEvent(GeneratedMessageV3.Builder builder, AbstractC3179w1 abstractC3179w1) {
        super(builder);
        this.eventTime_ = 0L;
        this.action_ = 0;
        this.f5432x_ = 0.0f;
        this.f5433y_ = 0.0f;
        this.pointerCount_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyTouchEvent$TouchEvent getDefaultInstance() {
        return f5430a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3113a2.f1551a;
    }

    public static C4401x0 newBuilder() {
        return f5430a.toBuilder();
    }

    public static EzyTouchEvent$TouchEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyTouchEvent$TouchEvent) GeneratedMessageV3.parseDelimitedWithIOException(f5431b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyTouchEvent$TouchEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyTouchEvent$TouchEvent) f5431b.parseFrom(byteBuffer);
    }

    public static Parser<EzyTouchEvent$TouchEvent> parser() {
        return f5431b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyTouchEvent$TouchEvent)) {
            return super.equals(obj);
        }
        EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent = (EzyTouchEvent$TouchEvent) obj;
        return getEventTime() == ezyTouchEvent$TouchEvent.getEventTime() && getAction() == ezyTouchEvent$TouchEvent.getAction() && Float.floatToIntBits(getX()) == Float.floatToIntBits(ezyTouchEvent$TouchEvent.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(ezyTouchEvent$TouchEvent.getY()) && getPointerCount() == ezyTouchEvent$TouchEvent.getPointerCount() && getPointerPropertiesList().equals(ezyTouchEvent$TouchEvent.getPointerPropertiesList()) && getPointerCoordsList().equals(ezyTouchEvent$TouchEvent.getPointerCoordsList()) && getUnknownFields().equals(ezyTouchEvent$TouchEvent.getUnknownFields());
    }

    public int getAction() {
        return this.action_;
    }

    public long getEventTime() {
        return this.eventTime_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyTouchEvent$TouchEvent> getParserForType() {
        return f5431b;
    }

    public PointerCoords getPointerCoords(int i) {
        return this.pointerCoords_.get(i);
    }

    public int getPointerCoordsCount() {
        return this.pointerCoords_.size();
    }

    public List<PointerCoords> getPointerCoordsList() {
        return this.pointerCoords_;
    }

    public InterfaceC3185y1 getPointerCoordsOrBuilder(int i) {
        return this.pointerCoords_.get(i);
    }

    public List<? extends InterfaceC3185y1> getPointerCoordsOrBuilderList() {
        return this.pointerCoords_;
    }

    public int getPointerCount() {
        return this.pointerCount_;
    }

    public PointerProperties getPointerProperties(int i) {
        return this.pointerProperties_.get(i);
    }

    public int getPointerPropertiesCount() {
        return this.pointerProperties_.size();
    }

    public List<PointerProperties> getPointerPropertiesList() {
        return this.pointerProperties_;
    }

    public InterfaceC3188z1 getPointerPropertiesOrBuilder(int i) {
        return this.pointerProperties_.get(i);
    }

    public List<? extends InterfaceC3188z1> getPointerPropertiesOrBuilderList() {
        return this.pointerProperties_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j7 = this.eventTime_;
        int iComputeInt64Size = j7 != 0 ? CodedOutputStream.computeInt64Size(1, j7) : 0;
        int i8 = this.action_;
        if (i8 != 0) {
            iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i8);
        }
        if (Float.floatToRawIntBits(this.f5432x_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f5432x_);
        }
        if (Float.floatToRawIntBits(this.f5433y_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f5433y_);
        }
        int i9 = this.pointerCount_;
        if (i9 != 0) {
            iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i9);
        }
        for (int i10 = 0; i10 < this.pointerProperties_.size(); i10++) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(6, this.pointerProperties_.get(i10));
        }
        for (int i11 = 0; i11 < this.pointerCoords_.size(); i11++) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(7, this.pointerCoords_.get(i11));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public float getX() {
        return this.f5432x_;
    }

    public float getY() {
        return this.f5433y_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int pointerCount = getPointerCount() + ((((Float.floatToIntBits(getY()) + ((((Float.floatToIntBits(getX()) + ((((getAction() + ((((Internal.hashLong(getEventTime()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (getPointerPropertiesCount() > 0) {
            pointerCount = getPointerPropertiesList().hashCode() + AbstractC1923c.m1038b(pointerCount, 37, 6, 53);
        }
        if (getPointerCoordsCount() > 0) {
            pointerCount = getPointerCoordsList().hashCode() + AbstractC1923c.m1038b(pointerCount, 37, 7, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + (pointerCount * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3113a2.f1552b.ensureFieldAccessorsInitialized(EzyTouchEvent$TouchEvent.class, C4401x0.class);
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
        return new EzyTouchEvent$TouchEvent();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j7 = this.eventTime_;
        if (j7 != 0) {
            codedOutputStream.writeInt64(1, j7);
        }
        int i = this.action_;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        if (Float.floatToRawIntBits(this.f5432x_) != 0) {
            codedOutputStream.writeFloat(3, this.f5432x_);
        }
        if (Float.floatToRawIntBits(this.f5433y_) != 0) {
            codedOutputStream.writeFloat(4, this.f5433y_);
        }
        int i8 = this.pointerCount_;
        if (i8 != 0) {
            codedOutputStream.writeInt32(5, i8);
        }
        for (int i9 = 0; i9 < this.pointerProperties_.size(); i9++) {
            codedOutputStream.writeMessage(6, this.pointerProperties_.get(i9));
        }
        for (int i10 = 0; i10 < this.pointerCoords_.size(); i10++) {
            codedOutputStream.writeMessage(7, this.pointerCoords_.get(i10));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4401x0 newBuilder(EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent) {
        C4401x0 builder = f5430a.toBuilder();
        builder.m3868g(ezyTouchEvent$TouchEvent);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyTouchEvent$TouchEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyTouchEvent$TouchEvent) f5431b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static EzyTouchEvent$TouchEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyTouchEvent$TouchEvent) GeneratedMessageV3.parseDelimitedWithIOException(f5431b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyTouchEvent$TouchEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyTouchEvent$TouchEvent) f5431b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyTouchEvent$TouchEvent getDefaultInstanceForType() {
        return f5430a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4401x0 toBuilder() {
        if (this == f5430a) {
            return new C4401x0();
        }
        C4401x0 c4401x0 = new C4401x0();
        c4401x0.m3868g(this);
        return c4401x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyTouchEvent$TouchEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyTouchEvent$TouchEvent) f5431b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4401x0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyTouchEvent$TouchEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyTouchEvent$TouchEvent) f5431b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4401x0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4401x0 c4401x0 = new C4401x0(builderParent);
        List list = Collections.EMPTY_LIST;
        c4401x0.f5606g = list;
        c4401x0.f5608i = list;
        return c4401x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyTouchEvent$TouchEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyTouchEvent$TouchEvent) f5431b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyTouchEvent$TouchEvent parseFrom(InputStream inputStream) throws IOException {
        return (EzyTouchEvent$TouchEvent) GeneratedMessageV3.parseWithIOException(f5431b, inputStream);
    }

    private EzyTouchEvent$TouchEvent() {
        this.eventTime_ = 0L;
        this.action_ = 0;
        this.f5432x_ = 0.0f;
        this.f5433y_ = 0.0f;
        this.pointerCount_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.pointerProperties_ = list;
        this.pointerCoords_ = list;
    }

    public static EzyTouchEvent$TouchEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyTouchEvent$TouchEvent) GeneratedMessageV3.parseWithIOException(f5431b, inputStream, extensionRegistryLite);
    }

    public static EzyTouchEvent$TouchEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyTouchEvent$TouchEvent) GeneratedMessageV3.parseWithIOException(f5431b, codedInputStream);
    }

    public static EzyTouchEvent$TouchEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyTouchEvent$TouchEvent) GeneratedMessageV3.parseWithIOException(f5431b, codedInputStream, extensionRegistryLite);
    }
}

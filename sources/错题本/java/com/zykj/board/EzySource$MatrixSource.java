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
import p020b4.C3158p1;
import p020b4.InterfaceC3118c0;
import p020b4.InterfaceC3161q1;

/* loaded from: classes3.dex */
public final class EzySource$MatrixSource extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int MATRIXINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzySource$MatrixSource f5418a = new EzySource$MatrixSource();

    /* renamed from: b */
    public static final C3158p1 f5419b = new C3158p1();
    private static final long serialVersionUID = 0;
    private List<MatrixInfo> matrixInfo_;
    private byte memoizedIsInitialized;

    public static final class MatrixInfo extends GeneratedMessageV3 implements InterfaceC3161q1 {
        public static final int MATRIX_FIELD_NUMBER = 1;

        /* renamed from: a */
        public static final MatrixInfo f5420a = new MatrixInfo();

        /* renamed from: b */
        public static final C4385p0 f5421b = new C4385p0();
        private static final long serialVersionUID = 0;
        private List<EzyMatrix$Matrix> matrix_;
        private byte memoizedIsInitialized;

        public MatrixInfo(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MatrixInfo getDefaultInstance() {
            return f5420a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3176v1.f1675g;
        }

        public static C4387q0 newBuilder() {
            return f5420a.toBuilder();
        }

        public static MatrixInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MatrixInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5421b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MatrixInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MatrixInfo) f5421b.parseFrom(byteBuffer);
        }

        public static Parser<MatrixInfo> parser() {
            return f5421b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatrixInfo)) {
                return super.equals(obj);
            }
            MatrixInfo matrixInfo = (MatrixInfo) obj;
            return getMatrixList().equals(matrixInfo.getMatrixList()) && getUnknownFields().equals(matrixInfo.getUnknownFields());
        }

        public EzyMatrix$Matrix getMatrix(int i) {
            return this.matrix_.get(i);
        }

        public int getMatrixCount() {
            return this.matrix_.size();
        }

        public List<EzyMatrix$Matrix> getMatrixList() {
            return this.matrix_;
        }

        public InterfaceC3118c0 getMatrixOrBuilder(int i) {
            return this.matrix_.get(i);
        }

        public List<? extends InterfaceC3118c0> getMatrixOrBuilderList() {
            return this.matrix_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MatrixInfo> getParserForType() {
            return f5421b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i8 = 0; i8 < this.matrix_.size(); i8++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.matrix_.get(i8));
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
            if (getMatrixCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getMatrixList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3176v1.f1676h.ensureFieldAccessorsInitialized(MatrixInfo.class, C4387q0.class);
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
            return new MatrixInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.matrix_.size(); i++) {
                codedOutputStream.writeMessage(1, this.matrix_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4387q0 newBuilder(MatrixInfo matrixInfo) {
            C4387q0 builder = f5420a.toBuilder();
            builder.m3820g(matrixInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MatrixInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MatrixInfo) f5421b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MatrixInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.matrix_ = Collections.EMPTY_LIST;
        }

        public static MatrixInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MatrixInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5421b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MatrixInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MatrixInfo) f5421b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MatrixInfo getDefaultInstanceForType() {
            return f5420a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4387q0 toBuilder() {
            if (this == f5420a) {
                return new C4387q0();
            }
            C4387q0 c4387q0 = new C4387q0();
            c4387q0.m3820g(this);
            return c4387q0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MatrixInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MatrixInfo) f5421b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4387q0 newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MatrixInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MatrixInfo) f5421b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4387q0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4387q0 c4387q0 = new C4387q0(builderParent);
            c4387q0.f5565b = Collections.EMPTY_LIST;
            return c4387q0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MatrixInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MatrixInfo) f5421b.parseFrom(bArr, extensionRegistryLite);
        }

        public static MatrixInfo parseFrom(InputStream inputStream) throws IOException {
            return (MatrixInfo) GeneratedMessageV3.parseWithIOException(f5421b, inputStream);
        }

        public static MatrixInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MatrixInfo) GeneratedMessageV3.parseWithIOException(f5421b, inputStream, extensionRegistryLite);
        }

        public static MatrixInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MatrixInfo) GeneratedMessageV3.parseWithIOException(f5421b, codedInputStream);
        }

        public static MatrixInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MatrixInfo) GeneratedMessageV3.parseWithIOException(f5421b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzySource$MatrixSource(GeneratedMessageV3.Builder builder, AbstractC3143k1 abstractC3143k1) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzySource$MatrixSource getDefaultInstance() {
        return f5418a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3176v1.f1673e;
    }

    public static C4383o0 newBuilder() {
        return f5418a.toBuilder();
    }

    public static EzySource$MatrixSource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzySource$MatrixSource) GeneratedMessageV3.parseDelimitedWithIOException(f5419b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$MatrixSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzySource$MatrixSource) f5419b.parseFrom(byteBuffer);
    }

    public static Parser<EzySource$MatrixSource> parser() {
        return f5419b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzySource$MatrixSource)) {
            return super.equals(obj);
        }
        EzySource$MatrixSource ezySource$MatrixSource = (EzySource$MatrixSource) obj;
        return getMatrixInfoList().equals(ezySource$MatrixSource.getMatrixInfoList()) && getUnknownFields().equals(ezySource$MatrixSource.getUnknownFields());
    }

    public MatrixInfo getMatrixInfo(int i) {
        return this.matrixInfo_.get(i);
    }

    public int getMatrixInfoCount() {
        return this.matrixInfo_.size();
    }

    public List<MatrixInfo> getMatrixInfoList() {
        return this.matrixInfo_;
    }

    public InterfaceC3161q1 getMatrixInfoOrBuilder(int i) {
        return this.matrixInfo_.get(i);
    }

    public List<? extends InterfaceC3161q1> getMatrixInfoOrBuilderList() {
        return this.matrixInfo_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzySource$MatrixSource> getParserForType() {
        return f5419b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.matrixInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.matrixInfo_.get(i8));
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
        if (getMatrixInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getMatrixInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1674f.ensureFieldAccessorsInitialized(EzySource$MatrixSource.class, C4383o0.class);
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
        return new EzySource$MatrixSource();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.matrixInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.matrixInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4383o0 newBuilder(EzySource$MatrixSource ezySource$MatrixSource) {
        C4383o0 builder = f5418a.toBuilder();
        builder.m3803g(ezySource$MatrixSource);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$MatrixSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$MatrixSource) f5419b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzySource$MatrixSource() {
        this.memoizedIsInitialized = (byte) -1;
        this.matrixInfo_ = Collections.EMPTY_LIST;
    }

    public static EzySource$MatrixSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$MatrixSource) GeneratedMessageV3.parseDelimitedWithIOException(f5419b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$MatrixSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzySource$MatrixSource) f5419b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzySource$MatrixSource getDefaultInstanceForType() {
        return f5418a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4383o0 toBuilder() {
        if (this == f5418a) {
            return new C4383o0();
        }
        C4383o0 c4383o0 = new C4383o0();
        c4383o0.m3803g(this);
        return c4383o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$MatrixSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$MatrixSource) f5419b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4383o0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$MatrixSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzySource$MatrixSource) f5419b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4383o0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4383o0 c4383o0 = new C4383o0(builderParent);
        c4383o0.f5553b = Collections.EMPTY_LIST;
        return c4383o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzySource$MatrixSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzySource$MatrixSource) f5419b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzySource$MatrixSource parseFrom(InputStream inputStream) throws IOException {
        return (EzySource$MatrixSource) GeneratedMessageV3.parseWithIOException(f5419b, inputStream);
    }

    public static EzySource$MatrixSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$MatrixSource) GeneratedMessageV3.parseWithIOException(f5419b, inputStream, extensionRegistryLite);
    }

    public static EzySource$MatrixSource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzySource$MatrixSource) GeneratedMessageV3.parseWithIOException(f5419b, codedInputStream);
    }

    public static EzySource$MatrixSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzySource$MatrixSource) GeneratedMessageV3.parseWithIOException(f5419b, codedInputStream, extensionRegistryLite);
    }
}

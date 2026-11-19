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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3117c;
import p020b4.AbstractC3126f;
import p020b4.C3120d;
import p020b4.InterfaceC3118c0;
import p020b4.InterfaceC3119c1;
import p020b4.InterfaceC3123e;
import p020b4.InterfaceC3160q0;
import p020b4.InterfaceC3165s;
import p020b4.InterfaceC3175v0;

/* loaded from: classes3.dex */
public final class EzyCommand$CommandSource extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int COMMANDINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzyCommand$CommandSource f5338a = new EzyCommand$CommandSource();

    /* renamed from: b */
    public static final C3120d f5339b = new C3120d();
    private static final long serialVersionUID = 0;
    private List<CommandInfo> commandInfo_;
    private byte memoizedIsInitialized;

    public static final class CommandInfo extends GeneratedMessageV3 implements InterfaceC3123e {
        public static final int COMMANDENUM_FIELD_NUMBER = 4;
        public static final int DATA_FIELD_NUMBER = 5;
        public static final int DELAYTIME_FIELD_NUMBER = 1;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int ISPLAY_FIELD_NUMBER = 3;

        /* renamed from: a */
        public static final CommandInfo f5340a = new CommandInfo();

        /* renamed from: b */
        public static final C4354b f5341b = new C4354b();
        private static final long serialVersionUID = 0;
        private int commandEnum_;
        private ByteString data_;
        private long delayTime_;
        private long duration_;
        private boolean isPlay_;
        private byte memoizedIsInitialized;

        public static final class AudioStart extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int DURATION_FIELD_NUMBER = 2;
            public static final int FILENAME_FIELD_NUMBER = 1;
            public static final int VALIDATE_FIELD_NUMBER = 3;

            /* renamed from: a */
            public static final AudioStart f5342a = new AudioStart();

            /* renamed from: b */
            public static final C4357c f5343b = new C4357c();
            private static final long serialVersionUID = 0;
            private long duration_;
            private volatile Object fileName_;
            private byte memoizedIsInitialized;
            private volatile Object validate_;

            public AudioStart(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.fileName_ = "";
                this.duration_ = 0L;
                this.validate_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AudioStart getDefaultInstance() {
                return f5342a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1593m;
            }

            public static C4360d newBuilder() {
                return f5342a.toBuilder();
            }

            public static AudioStart parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AudioStart) GeneratedMessageV3.parseDelimitedWithIOException(f5343b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static AudioStart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AudioStart) f5343b.parseFrom(byteBuffer);
            }

            public static Parser<AudioStart> parser() {
                return f5343b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AudioStart)) {
                    return super.equals(obj);
                }
                AudioStart audioStart = (AudioStart) obj;
                return getFileName().equals(audioStart.getFileName()) && getDuration() == audioStart.getDuration() && getValidate().equals(audioStart.getValidate()) && getUnknownFields().equals(audioStart.getUnknownFields());
            }

            public long getDuration() {
                return this.duration_;
            }

            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fileName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<AudioStart> getParserForType() {
                return f5343b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.fileName_) ? GeneratedMessageV3.computeStringSize(1, this.fileName_) : 0;
                long j7 = this.duration_;
                if (j7 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt64Size(2, j7);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.validate_)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.validate_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public String getValidate() {
                Object obj = this.validate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.validate_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getValidateBytes() {
                Object obj = this.validate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.validate_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getUnknownFields().hashCode() + ((getValidate().hashCode() + ((((Internal.hashLong(getDuration()) + ((((getFileName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1594n.ensureFieldAccessorsInitialized(AudioStart.class, C4360d.class);
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
                return new AudioStart();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.fileName_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileName_);
                }
                long j7 = this.duration_;
                if (j7 != 0) {
                    codedOutputStream.writeInt64(2, j7);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.validate_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.validate_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4360d newBuilder(AudioStart audioStart) {
                C4360d builder = f5342a.toBuilder();
                builder.m3706g(audioStart);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static AudioStart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (AudioStart) f5343b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static AudioStart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AudioStart) GeneratedMessageV3.parseDelimitedWithIOException(f5343b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static AudioStart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AudioStart) f5343b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AudioStart getDefaultInstanceForType() {
                return f5342a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4360d toBuilder() {
                if (this == f5342a) {
                    return new C4360d();
                }
                C4360d c4360d = new C4360d();
                c4360d.m3706g(this);
                return c4360d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static AudioStart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (AudioStart) f5343b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4360d newBuilderForType() {
                return newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static AudioStart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AudioStart) f5343b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4360d newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4360d c4360d = new C4360d(builderParent);
                c4360d.f5455b = "";
                c4360d.f5457d = "";
                return c4360d;
            }

            private AudioStart() {
                this.fileName_ = "";
                this.duration_ = 0L;
                this.validate_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.fileName_ = "";
                this.validate_ = "";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static AudioStart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (AudioStart) f5343b.parseFrom(bArr, extensionRegistryLite);
            }

            public static AudioStart parseFrom(InputStream inputStream) throws IOException {
                return (AudioStart) GeneratedMessageV3.parseWithIOException(f5343b, inputStream);
            }

            public static AudioStart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AudioStart) GeneratedMessageV3.parseWithIOException(f5343b, inputStream, extensionRegistryLite);
            }

            public static AudioStart parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (AudioStart) GeneratedMessageV3.parseWithIOException(f5343b, codedInputStream);
            }

            public static AudioStart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AudioStart) GeneratedMessageV3.parseWithIOException(f5343b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Camera extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int LASTMATRIX_FIELD_NUMBER = 2;
            public static final int ORIGINMATRIX_FIELD_NUMBER = 1;

            /* renamed from: a */
            public static final Camera f5344a = new Camera();

            /* renamed from: b */
            public static final C4364f f5345b = new C4364f();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private EzyMatrix$Matrix lastMatrix_;
            private byte memoizedIsInitialized;
            private EzyMatrix$Matrix originMatrix_;

            public Camera(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$9276(Camera camera, int i) {
                int i8 = i | camera.bitField0_;
                camera.bitField0_ = i8;
                return i8;
            }

            public static Camera getDefaultInstance() {
                return f5344a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1597q;
            }

            public static C4366g newBuilder() {
                return f5344a.toBuilder();
            }

            public static Camera parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Camera) GeneratedMessageV3.parseDelimitedWithIOException(f5345b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Camera parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Camera) f5345b.parseFrom(byteBuffer);
            }

            public static Parser<Camera> parser() {
                return f5345b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Camera)) {
                    return super.equals(obj);
                }
                Camera camera = (Camera) obj;
                if (hasOriginMatrix() != camera.hasOriginMatrix()) {
                    return false;
                }
                if ((!hasOriginMatrix() || getOriginMatrix().equals(camera.getOriginMatrix())) && hasLastMatrix() == camera.hasLastMatrix()) {
                    return (!hasLastMatrix() || getLastMatrix().equals(camera.getLastMatrix())) && getUnknownFields().equals(camera.getUnknownFields());
                }
                return false;
            }

            public EzyMatrix$Matrix getLastMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.lastMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getLastMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.lastMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public EzyMatrix$Matrix getOriginMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.originMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getOriginMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.originMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Camera> getParserForType() {
                return f5345b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getOriginMatrix()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLastMatrix());
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasLastMatrix() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOriginMatrix() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasOriginMatrix()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getOriginMatrix().hashCode();
                }
                if (hasLastMatrix()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getLastMatrix().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1598r.ensureFieldAccessorsInitialized(Camera.class, C4366g.class);
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
                return new Camera();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getOriginMatrix());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(2, getLastMatrix());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4366g newBuilder(Camera camera) {
                C4366g builder = f5344a.toBuilder();
                builder.m3745h(camera);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Camera parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Camera) f5345b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private Camera() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Camera parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Camera) GeneratedMessageV3.parseDelimitedWithIOException(f5345b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Camera parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Camera) f5345b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Camera getDefaultInstanceForType() {
                return f5344a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4366g toBuilder() {
                if (this == f5344a) {
                    return new C4366g();
                }
                C4366g c4366g = new C4366g();
                c4366g.m3745h(this);
                return c4366g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Camera parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Camera) f5345b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4366g newBuilderForType() {
                return newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Camera parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Camera) f5345b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4366g newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4366g c4366g = new C4366g(builderParent);
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4366g.m3744g();
                    c4366g.m3743f();
                }
                return c4366g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Camera parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Camera) f5345b.parseFrom(bArr, extensionRegistryLite);
            }

            public static Camera parseFrom(InputStream inputStream) throws IOException {
                return (Camera) GeneratedMessageV3.parseWithIOException(f5345b, inputStream);
            }

            public static Camera parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Camera) GeneratedMessageV3.parseWithIOException(f5345b, inputStream, extensionRegistryLite);
            }

            public static Camera parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Camera) GeneratedMessageV3.parseWithIOException(f5345b, codedInputStream);
            }

            public static Camera parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Camera) GeneratedMessageV3.parseWithIOException(f5345b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CameraMatrix extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int LASTMATRIX_FIELD_NUMBER = 2;
            public static final int ORIGINMATRIX_FIELD_NUMBER = 1;
            public static final int SOURCEFILENAME_FIELD_NUMBER = 3;
            public static final int SOURCEID_FIELD_NUMBER = 4;

            /* renamed from: a */
            public static final CameraMatrix f5346a = new CameraMatrix();

            /* renamed from: b */
            public static final C4368h f5347b = new C4368h();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private EzyMatrix$Matrix lastMatrix_;
            private byte memoizedIsInitialized;
            private EzyMatrix$Matrix originMatrix_;
            private volatile Object sourceFileName_;
            private int sourceId_;

            public CameraMatrix(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$8276(CameraMatrix cameraMatrix, int i) {
                int i8 = i | cameraMatrix.bitField0_;
                cameraMatrix.bitField0_ = i8;
                return i8;
            }

            public static CameraMatrix getDefaultInstance() {
                return f5346a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1595o;
            }

            public static C4370i newBuilder() {
                return f5346a.toBuilder();
            }

            public static CameraMatrix parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CameraMatrix) GeneratedMessageV3.parseDelimitedWithIOException(f5347b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CameraMatrix parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (CameraMatrix) f5347b.parseFrom(byteBuffer);
            }

            public static Parser<CameraMatrix> parser() {
                return f5347b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CameraMatrix)) {
                    return super.equals(obj);
                }
                CameraMatrix cameraMatrix = (CameraMatrix) obj;
                if (hasOriginMatrix() != cameraMatrix.hasOriginMatrix()) {
                    return false;
                }
                if ((!hasOriginMatrix() || getOriginMatrix().equals(cameraMatrix.getOriginMatrix())) && hasLastMatrix() == cameraMatrix.hasLastMatrix()) {
                    return (!hasLastMatrix() || getLastMatrix().equals(cameraMatrix.getLastMatrix())) && getSourceFileName().equals(cameraMatrix.getSourceFileName()) && getSourceId() == cameraMatrix.getSourceId() && getUnknownFields().equals(cameraMatrix.getUnknownFields());
                }
                return false;
            }

            public EzyMatrix$Matrix getLastMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.lastMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getLastMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.lastMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public EzyMatrix$Matrix getOriginMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.originMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getOriginMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.originMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<CameraMatrix> getParserForType() {
                return f5347b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getOriginMatrix()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLastMatrix());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.sourceFileName_);
                }
                int i8 = this.sourceId_;
                if (i8 != 0) {
                    iComputeMessageSize += CodedOutputStream.computeInt32Size(4, i8);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public String getSourceFileName() {
                Object obj = this.sourceFileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sourceFileName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSourceFileNameBytes() {
                Object obj = this.sourceFileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSourceId() {
                return this.sourceId_;
            }

            public boolean hasLastMatrix() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOriginMatrix() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasOriginMatrix()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getOriginMatrix().hashCode();
                }
                if (hasLastMatrix()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getLastMatrix().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + ((getSourceId() + ((((getSourceFileName().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 3, 53)) * 37) + 4) * 53)) * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1596p.ensureFieldAccessorsInitialized(CameraMatrix.class, C4370i.class);
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
                return new CameraMatrix();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getOriginMatrix());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(2, getLastMatrix());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.sourceFileName_);
                }
                int i = this.sourceId_;
                if (i != 0) {
                    codedOutputStream.writeInt32(4, i);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4370i newBuilder(CameraMatrix cameraMatrix) {
                C4370i builder = f5346a.toBuilder();
                builder.m3758h(cameraMatrix);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CameraMatrix parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (CameraMatrix) f5347b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static CameraMatrix parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CameraMatrix) GeneratedMessageV3.parseDelimitedWithIOException(f5347b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CameraMatrix parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CameraMatrix) f5347b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CameraMatrix getDefaultInstanceForType() {
                return f5346a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4370i toBuilder() {
                if (this == f5346a) {
                    return new C4370i();
                }
                C4370i c4370i = new C4370i();
                c4370i.m3758h(this);
                return c4370i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CameraMatrix parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (CameraMatrix) f5347b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4370i newBuilderForType() {
                return newBuilder();
            }

            private CameraMatrix() {
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.sourceFileName_ = "";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CameraMatrix parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CameraMatrix) f5347b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4370i newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4370i c4370i = new C4370i(builderParent);
                c4370i.f5510f = "";
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4370i.m3757g();
                    c4370i.m3756f();
                }
                return c4370i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CameraMatrix parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (CameraMatrix) f5347b.parseFrom(bArr, extensionRegistryLite);
            }

            public static CameraMatrix parseFrom(InputStream inputStream) throws IOException {
                return (CameraMatrix) GeneratedMessageV3.parseWithIOException(f5347b, inputStream);
            }

            public static CameraMatrix parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CameraMatrix) GeneratedMessageV3.parseWithIOException(f5347b, inputStream, extensionRegistryLite);
            }

            public static CameraMatrix parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (CameraMatrix) GeneratedMessageV3.parseWithIOException(f5347b, codedInputStream);
            }

            public static CameraMatrix parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CameraMatrix) GeneratedMessageV3.parseWithIOException(f5347b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Config extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int LASTBACKGROUNDLINECONFIG_FIELD_NUMBER = 4;
            public static final int LASTBACKGROUND_FIELD_NUMBER = 2;
            public static final int ORIGINBACKGROUNDLINECONFIG_FIELD_NUMBER = 3;
            public static final int ORIGINBACKGROUND_FIELD_NUMBER = 1;

            /* renamed from: a */
            public static final Config f5348a = new Config();

            /* renamed from: b */
            public static final C4372j f5349b = new C4372j();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private EzyHeader$BackgroundLineConfig lastBackgroundLineConfig_;
            private int lastBackground_;
            private byte memoizedIsInitialized;
            private EzyHeader$BackgroundLineConfig originBackgroundLineConfig_;
            private int originBackground_;

            public Config(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.originBackground_ = 0;
                this.lastBackground_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$10376(Config config, int i) {
                int i8 = i | config.bitField0_;
                config.bitField0_ = i8;
                return i8;
            }

            public static Config getDefaultInstance() {
                return f5348a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1599s;
            }

            public static C4374k newBuilder() {
                return f5348a.toBuilder();
            }

            public static Config parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Config) GeneratedMessageV3.parseDelimitedWithIOException(f5349b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Config parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Config) f5349b.parseFrom(byteBuffer);
            }

            public static Parser<Config> parser() {
                return f5349b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Config)) {
                    return super.equals(obj);
                }
                Config config = (Config) obj;
                if (getOriginBackground() != config.getOriginBackground() || getLastBackground() != config.getLastBackground() || hasOriginBackgroundLineConfig() != config.hasOriginBackgroundLineConfig()) {
                    return false;
                }
                if ((!hasOriginBackgroundLineConfig() || getOriginBackgroundLineConfig().equals(config.getOriginBackgroundLineConfig())) && hasLastBackgroundLineConfig() == config.hasLastBackgroundLineConfig()) {
                    return (!hasLastBackgroundLineConfig() || getLastBackgroundLineConfig().equals(config.getLastBackgroundLineConfig())) && getUnknownFields().equals(config.getUnknownFields());
                }
                return false;
            }

            public int getLastBackground() {
                return this.lastBackground_;
            }

            public EzyHeader$BackgroundLineConfig getLastBackgroundLineConfig() {
                EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.lastBackgroundLineConfig_;
                return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
            }

            public InterfaceC3165s getLastBackgroundLineConfigOrBuilder() {
                EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.lastBackgroundLineConfig_;
                return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
            }

            public int getOriginBackground() {
                return this.originBackground_;
            }

            public EzyHeader$BackgroundLineConfig getOriginBackgroundLineConfig() {
                EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.originBackgroundLineConfig_;
                return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
            }

            public InterfaceC3165s getOriginBackgroundLineConfigOrBuilder() {
                EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.originBackgroundLineConfig_;
                return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Config> getParserForType() {
                return f5349b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i8 = this.originBackground_;
                int iComputeInt32Size = i8 != 0 ? CodedOutputStream.computeInt32Size(1, i8) : 0;
                int i9 = this.lastBackground_;
                if (i9 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i9);
                }
                if ((1 & this.bitField0_) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(3, getOriginBackgroundLineConfig());
                }
                if ((this.bitField0_ & 2) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(4, getLastBackgroundLineConfig());
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasLastBackgroundLineConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOriginBackgroundLineConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int lastBackground = getLastBackground() + ((((getOriginBackground() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (hasOriginBackgroundLineConfig()) {
                    lastBackground = AbstractC1923c.m1038b(lastBackground, 37, 3, 53) + getOriginBackgroundLineConfig().hashCode();
                }
                if (hasLastBackgroundLineConfig()) {
                    lastBackground = AbstractC1923c.m1038b(lastBackground, 37, 4, 53) + getLastBackgroundLineConfig().hashCode();
                }
                int iHashCode = getUnknownFields().hashCode() + (lastBackground * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1600t.ensureFieldAccessorsInitialized(Config.class, C4374k.class);
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
                return new Config();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.originBackground_;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                int i8 = this.lastBackground_;
                if (i8 != 0) {
                    codedOutputStream.writeInt32(2, i8);
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(3, getOriginBackgroundLineConfig());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(4, getLastBackgroundLineConfig());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4374k newBuilder(Config config) {
                C4374k builder = f5348a.toBuilder();
                builder.m3769h(config);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Config parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Config) f5349b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Config parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Config) GeneratedMessageV3.parseDelimitedWithIOException(f5349b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Config parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Config) f5349b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Config getDefaultInstanceForType() {
                return f5348a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4374k toBuilder() {
                if (this == f5348a) {
                    return new C4374k();
                }
                C4374k c4374k = new C4374k();
                c4374k.m3769h(this);
                return c4374k;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Config parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Config) f5349b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4374k newBuilderForType() {
                return newBuilder();
            }

            private Config() {
                this.originBackground_ = 0;
                this.lastBackground_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Config) f5349b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4374k newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4374k c4374k = new C4374k(builderParent);
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4374k.m3768g();
                    c4374k.m3767f();
                }
                return c4374k;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Config parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Config) f5349b.parseFrom(bArr, extensionRegistryLite);
            }

            public static Config parseFrom(InputStream inputStream) throws IOException {
                return (Config) GeneratedMessageV3.parseWithIOException(f5349b, inputStream);
            }

            public static Config parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Config) GeneratedMessageV3.parseWithIOException(f5349b, inputStream, extensionRegistryLite);
            }

            public static Config parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Config) GeneratedMessageV3.parseWithIOException(f5349b, codedInputStream);
            }

            public static Config parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Config) GeneratedMessageV3.parseWithIOException(f5349b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CursorMove extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int SOURCEFILENAME_FIELD_NUMBER = 1;
            public static final int SOURCEID_FIELD_NUMBER = 2;

            /* renamed from: a */
            public static final CursorMove f5350a = new CursorMove();

            /* renamed from: b */
            public static final C4376l f5351b = new C4376l();
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object sourceFileName_;
            private int sourceId_;

            public CursorMove(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static CursorMove getDefaultInstance() {
                return f5350a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1601u;
            }

            public static C4378m newBuilder() {
                return f5350a.toBuilder();
            }

            public static CursorMove parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CursorMove) GeneratedMessageV3.parseDelimitedWithIOException(f5351b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CursorMove parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (CursorMove) f5351b.parseFrom(byteBuffer);
            }

            public static Parser<CursorMove> parser() {
                return f5351b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CursorMove)) {
                    return super.equals(obj);
                }
                CursorMove cursorMove = (CursorMove) obj;
                return getSourceFileName().equals(cursorMove.getSourceFileName()) && getSourceId() == cursorMove.getSourceId() && getUnknownFields().equals(cursorMove.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<CursorMove> getParserForType() {
                return f5351b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.sourceFileName_) ? GeneratedMessageV3.computeStringSize(1, this.sourceFileName_) : 0;
                int i8 = this.sourceId_;
                if (i8 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i8);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public String getSourceFileName() {
                Object obj = this.sourceFileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sourceFileName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSourceFileNameBytes() {
                Object obj = this.sourceFileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSourceId() {
                return this.sourceId_;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getUnknownFields().hashCode() + ((getSourceId() + ((((getSourceFileName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1602v.ensureFieldAccessorsInitialized(CursorMove.class, C4378m.class);
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
                return new CursorMove();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.sourceFileName_);
                }
                int i = this.sourceId_;
                if (i != 0) {
                    codedOutputStream.writeInt32(2, i);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4378m newBuilder(CursorMove cursorMove) {
                C4378m builder = f5350a.toBuilder();
                builder.m3783f(cursorMove);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CursorMove parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (CursorMove) f5351b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static CursorMove parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CursorMove) GeneratedMessageV3.parseDelimitedWithIOException(f5351b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CursorMove parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CursorMove) f5351b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CursorMove getDefaultInstanceForType() {
                return f5350a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4378m toBuilder() {
                if (this == f5350a) {
                    return new C4378m();
                }
                C4378m c4378m = new C4378m();
                c4378m.m3783f(this);
                return c4378m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CursorMove parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (CursorMove) f5351b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4378m newBuilderForType() {
                return newBuilder();
            }

            private CursorMove() {
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.sourceFileName_ = "";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CursorMove parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CursorMove) f5351b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4378m newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4378m c4378m = new C4378m(builderParent);
                c4378m.f5531b = "";
                return c4378m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CursorMove parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (CursorMove) f5351b.parseFrom(bArr, extensionRegistryLite);
            }

            public static CursorMove parseFrom(InputStream inputStream) throws IOException {
                return (CursorMove) GeneratedMessageV3.parseWithIOException(f5351b, inputStream);
            }

            public static CursorMove parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CursorMove) GeneratedMessageV3.parseWithIOException(f5351b, inputStream, extensionRegistryLite);
            }

            public static CursorMove parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (CursorMove) GeneratedMessageV3.parseWithIOException(f5351b, codedInputStream);
            }

            public static CursorMove parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CursorMove) GeneratedMessageV3.parseWithIOException(f5351b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class GraphChange extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int CONTENT_FIELD_NUMBER = 4;
            public static final int FILEPATH_FIELD_NUMBER = 8;
            public static final int GRAPHENUM_FIELD_NUMBER = 2;
            public static final int GRAPHID_FIELD_NUMBER = 1;
            public static final int OUTRECT_FIELD_NUMBER = 3;
            public static final int PAINT_FIELD_NUMBER = 5;
            public static final int POINTS_FIELD_NUMBER = 6;
            public static final int RENDERMATRIX_FIELD_NUMBER = 7;

            /* renamed from: a */
            public static final GraphChange f5352a = new GraphChange();

            /* renamed from: b */
            public static final C4380n f5353b = new C4380n();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object content_;
            private volatile Object filePath_;
            private int graphEnum_;
            private volatile Object graphId_;
            private byte memoizedIsInitialized;
            private EzyRectF$RectF outRect_;
            private EzyPaint$Paint paint_;
            private List<EzyPointF$PointF> points_;
            private EzyMatrix$Matrix renderMatrix_;

            public GraphChange(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.graphId_ = "";
                this.graphEnum_ = 0;
                this.content_ = "";
                this.filePath_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$5776(GraphChange graphChange, int i) {
                int i8 = i | graphChange.bitField0_;
                graphChange.bitField0_ = i8;
                return i8;
            }

            public static GraphChange getDefaultInstance() {
                return f5352a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1591k;
            }

            public static C4382o newBuilder() {
                return f5352a.toBuilder();
            }

            public static GraphChange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GraphChange) GeneratedMessageV3.parseDelimitedWithIOException(f5353b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GraphChange) f5353b.parseFrom(byteBuffer);
            }

            public static Parser<GraphChange> parser() {
                return f5353b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GraphChange)) {
                    return super.equals(obj);
                }
                GraphChange graphChange = (GraphChange) obj;
                if (!getGraphId().equals(graphChange.getGraphId()) || this.graphEnum_ != graphChange.graphEnum_ || hasOutRect() != graphChange.hasOutRect()) {
                    return false;
                }
                if ((hasOutRect() && !getOutRect().equals(graphChange.getOutRect())) || !getContent().equals(graphChange.getContent()) || hasPaint() != graphChange.hasPaint()) {
                    return false;
                }
                if ((!hasPaint() || getPaint().equals(graphChange.getPaint())) && getPointsList().equals(graphChange.getPointsList()) && hasRenderMatrix() == graphChange.hasRenderMatrix()) {
                    return (!hasRenderMatrix() || getRenderMatrix().equals(graphChange.getRenderMatrix())) && getFilePath().equals(graphChange.getFilePath()) && getUnknownFields().equals(graphChange.getUnknownFields());
                }
                return false;
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public String getFilePath() {
                Object obj = this.filePath_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.filePath_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFilePathBytes() {
                Object obj = this.filePath_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.filePath_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public EzyGraphEnum$GraphEnum getGraphEnum() {
                EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnumForNumber = EzyGraphEnum$GraphEnum.forNumber(this.graphEnum_);
                return ezyGraphEnum$GraphEnumForNumber == null ? EzyGraphEnum$GraphEnum.UNRECOGNIZED : ezyGraphEnum$GraphEnumForNumber;
            }

            public int getGraphEnumValue() {
                return this.graphEnum_;
            }

            public String getGraphId() {
                Object obj = this.graphId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.graphId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getGraphIdBytes() {
                Object obj = this.graphId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.graphId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public EzyRectF$RectF getOutRect() {
                EzyRectF$RectF ezyRectF$RectF = this.outRect_;
                return ezyRectF$RectF == null ? EzyRectF$RectF.getDefaultInstance() : ezyRectF$RectF;
            }

            public InterfaceC3119c1 getOutRectOrBuilder() {
                EzyRectF$RectF ezyRectF$RectF = this.outRect_;
                return ezyRectF$RectF == null ? EzyRectF$RectF.getDefaultInstance() : ezyRectF$RectF;
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
            public Parser<GraphChange> getParserForType() {
                return f5353b;
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

            public EzyMatrix$Matrix getRenderMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.renderMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getRenderMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.renderMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.graphId_) ? GeneratedMessageV3.computeStringSize(1, this.graphId_) : 0;
                if (this.graphEnum_ != EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.graphEnum_);
                }
                if ((1 & this.bitField0_) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(3, getOutRect());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.content_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(5, getPaint());
                }
                for (int i8 = 0; i8 < this.points_.size(); i8++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(6, this.points_.get(i8));
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(7, getRenderMatrix());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.filePath_)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.filePath_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasOutRect() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPaint() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasRenderMatrix() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((((getGraphId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53) + this.graphEnum_;
                if (hasOutRect()) {
                    iHashCode = getOutRect().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 3, 53);
                }
                int iHashCode2 = getContent().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 4, 53);
                if (hasPaint()) {
                    iHashCode2 = getPaint().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 5, 53);
                }
                if (getPointsCount() > 0) {
                    iHashCode2 = getPointsList().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 6, 53);
                }
                if (hasRenderMatrix()) {
                    iHashCode2 = getRenderMatrix().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 7, 53);
                }
                int iHashCode3 = getUnknownFields().hashCode() + ((getFilePath().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 8, 53)) * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1592l.ensureFieldAccessorsInitialized(GraphChange.class, C4382o.class);
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
                return new GraphChange();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.graphId_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.graphId_);
                }
                if (this.graphEnum_ != EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    codedOutputStream.writeEnum(2, this.graphEnum_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(3, getOutRect());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.content_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(5, getPaint());
                }
                for (int i = 0; i < this.points_.size(); i++) {
                    codedOutputStream.writeMessage(6, this.points_.get(i));
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeMessage(7, getRenderMatrix());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.filePath_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 8, this.filePath_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4382o newBuilder(GraphChange graphChange) {
                C4382o builder = f5352a.toBuilder();
                builder.m3798h(graphChange);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphChange) f5353b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static GraphChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphChange) GeneratedMessageV3.parseDelimitedWithIOException(f5353b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GraphChange) f5353b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphChange getDefaultInstanceForType() {
                return f5352a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4382o toBuilder() {
                if (this == f5352a) {
                    return new C4382o();
                }
                C4382o c4382o = new C4382o();
                c4382o.m3798h(this);
                return c4382o;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphChange) f5353b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4382o newBuilderForType() {
                return newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GraphChange) f5353b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4382o newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4382o c4382o = new C4382o(builderParent);
                c4382o.f5540b = "";
                c4382o.f5541c = 0;
                c4382o.f5544f = "";
                c4382o.f5547i = Collections.EMPTY_LIST;
                c4382o.f5551m = "";
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4382o.getOutRectFieldBuilder();
                    c4382o.m3796f();
                    c4382o.getPointsFieldBuilder();
                    c4382o.m3797g();
                }
                return c4382o;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphChange) f5353b.parseFrom(bArr, extensionRegistryLite);
            }

            private GraphChange() {
                this.graphId_ = "";
                this.graphEnum_ = 0;
                this.content_ = "";
                this.filePath_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.graphId_ = "";
                this.graphEnum_ = 0;
                this.content_ = "";
                this.points_ = Collections.EMPTY_LIST;
                this.filePath_ = "";
            }

            public static GraphChange parseFrom(InputStream inputStream) throws IOException {
                return (GraphChange) GeneratedMessageV3.parseWithIOException(f5353b, inputStream);
            }

            public static GraphChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphChange) GeneratedMessageV3.parseWithIOException(f5353b, inputStream, extensionRegistryLite);
            }

            public static GraphChange parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (GraphChange) GeneratedMessageV3.parseWithIOException(f5353b, codedInputStream);
            }

            public static GraphChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphChange) GeneratedMessageV3.parseWithIOException(f5353b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class GraphData extends GeneratedMessageV3 implements InterfaceC4388r {
            public static final int EXTRAS_FIELD_NUMBER = 7;
            public static final int GRAPHENUM_FIELD_NUMBER = 1;
            public static final int GRAPHID_FIELD_NUMBER = 2;
            public static final int OUTRECT_FIELD_NUMBER = 3;
            public static final int PARENTGRAPHID_FIELD_NUMBER = 4;
            public static final int SOURCEFILENAME_FIELD_NUMBER = 5;
            public static final int SOURCEID_FIELD_NUMBER = 6;

            /* renamed from: a */
            public static final GraphData f5354a = new GraphData();

            /* renamed from: b */
            public static final C4384p f5355b = new C4384p();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object extras_;
            private int graphEnum_;
            private volatile Object graphId_;
            private byte memoizedIsInitialized;
            private EzyRectF$RectF outRect_;
            private volatile Object parentGraphId_;
            private volatile Object sourceFileName_;
            private int sourceId_;

            public GraphData(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.graphEnum_ = 0;
                this.graphId_ = "";
                this.parentGraphId_ = "";
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.extras_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$1776(GraphData graphData, int i) {
                int i8 = i | graphData.bitField0_;
                graphData.bitField0_ = i8;
                return i8;
            }

            public static GraphData getDefaultInstance() {
                return f5354a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1585e;
            }

            public static C4386q newBuilder() {
                return f5354a.toBuilder();
            }

            public static GraphData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GraphData) GeneratedMessageV3.parseDelimitedWithIOException(f5355b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GraphData) f5355b.parseFrom(byteBuffer);
            }

            public static Parser<GraphData> parser() {
                return f5355b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GraphData)) {
                    return super.equals(obj);
                }
                GraphData graphData = (GraphData) obj;
                if (this.graphEnum_ == graphData.graphEnum_ && getGraphId().equals(graphData.getGraphId()) && hasOutRect() == graphData.hasOutRect()) {
                    return (!hasOutRect() || getOutRect().equals(graphData.getOutRect())) && getParentGraphId().equals(graphData.getParentGraphId()) && getSourceFileName().equals(graphData.getSourceFileName()) && getSourceId() == graphData.getSourceId() && getExtras().equals(graphData.getExtras()) && getUnknownFields().equals(graphData.getUnknownFields());
                }
                return false;
            }

            public String getExtras() {
                Object obj = this.extras_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.extras_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getExtrasBytes() {
                Object obj = this.extras_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.extras_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public EzyGraphEnum$GraphEnum getGraphEnum() {
                EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnumForNumber = EzyGraphEnum$GraphEnum.forNumber(this.graphEnum_);
                return ezyGraphEnum$GraphEnumForNumber == null ? EzyGraphEnum$GraphEnum.UNRECOGNIZED : ezyGraphEnum$GraphEnumForNumber;
            }

            public int getGraphEnumValue() {
                return this.graphEnum_;
            }

            public String getGraphId() {
                Object obj = this.graphId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.graphId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getGraphIdBytes() {
                Object obj = this.graphId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.graphId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public EzyRectF$RectF getOutRect() {
                EzyRectF$RectF ezyRectF$RectF = this.outRect_;
                return ezyRectF$RectF == null ? EzyRectF$RectF.getDefaultInstance() : ezyRectF$RectF;
            }

            public InterfaceC3119c1 getOutRectOrBuilder() {
                EzyRectF$RectF ezyRectF$RectF = this.outRect_;
                return ezyRectF$RectF == null ? EzyRectF$RectF.getDefaultInstance() : ezyRectF$RectF;
            }

            public String getParentGraphId() {
                Object obj = this.parentGraphId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.parentGraphId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getParentGraphIdBytes() {
                Object obj = this.parentGraphId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.parentGraphId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<GraphData> getParserForType() {
                return f5355b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeEnumSize = this.graphEnum_ != EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.graphEnum_) : 0;
                if (!GeneratedMessageV3.isStringEmpty(this.graphId_)) {
                    iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.graphId_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getOutRect());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.parentGraphId_)) {
                    iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.parentGraphId_);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    iComputeEnumSize += GeneratedMessageV3.computeStringSize(5, this.sourceFileName_);
                }
                int i8 = this.sourceId_;
                if (i8 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(6, i8);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.extras_)) {
                    iComputeEnumSize += GeneratedMessageV3.computeStringSize(7, this.extras_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public String getSourceFileName() {
                Object obj = this.sourceFileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sourceFileName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSourceFileNameBytes() {
                Object obj = this.sourceFileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSourceId() {
                return this.sourceId_;
            }

            public boolean hasOutRect() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getGraphId().hashCode() + ((((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.graphEnum_) * 37) + 2) * 53);
                if (hasOutRect()) {
                    iHashCode = getOutRect().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 3, 53);
                }
                int iHashCode2 = getUnknownFields().hashCode() + ((getExtras().hashCode() + ((((getSourceId() + ((((getSourceFileName().hashCode() + ((((getParentGraphId().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 4, 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1586f.ensureFieldAccessorsInitialized(GraphData.class, C4386q.class);
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
                return new GraphData();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.graphEnum_ != EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    codedOutputStream.writeEnum(1, this.graphEnum_);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.graphId_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.graphId_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(3, getOutRect());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.parentGraphId_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.parentGraphId_);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 5, this.sourceFileName_);
                }
                int i = this.sourceId_;
                if (i != 0) {
                    codedOutputStream.writeInt32(6, i);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.extras_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 7, this.extras_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4386q newBuilder(GraphData graphData) {
                C4386q builder = f5354a.toBuilder();
                builder.m3809h(graphData);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphData) f5355b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static GraphData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphData) GeneratedMessageV3.parseDelimitedWithIOException(f5355b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GraphData) f5355b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphData getDefaultInstanceForType() {
                return f5354a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4386q toBuilder() {
                if (this == f5354a) {
                    return new C4386q();
                }
                C4386q c4386q = new C4386q();
                c4386q.m3809h(this);
                return c4386q;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphData) f5355b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4386q newBuilderForType() {
                return newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GraphData) f5355b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4386q newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4386q c4386q = new C4386q(builderParent);
                c4386q.f5556b = 0;
                c4386q.f5557c = "";
                c4386q.f5560f = "";
                c4386q.f5561g = "";
                c4386q.f5563i = "";
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4386q.m3808g();
                }
                return c4386q;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphData) f5355b.parseFrom(bArr, extensionRegistryLite);
            }

            public static GraphData parseFrom(InputStream inputStream) throws IOException {
                return (GraphData) GeneratedMessageV3.parseWithIOException(f5355b, inputStream);
            }

            private GraphData() {
                this.graphEnum_ = 0;
                this.graphId_ = "";
                this.parentGraphId_ = "";
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.extras_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.graphEnum_ = 0;
                this.graphId_ = "";
                this.parentGraphId_ = "";
                this.sourceFileName_ = "";
                this.extras_ = "";
            }

            public static GraphData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphData) GeneratedMessageV3.parseWithIOException(f5355b, inputStream, extensionRegistryLite);
            }

            public static GraphData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (GraphData) GeneratedMessageV3.parseWithIOException(f5355b, codedInputStream);
            }

            public static GraphData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphData) GeneratedMessageV3.parseWithIOException(f5355b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class GraphMatrix extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int GRAPHDATA_FIELD_NUMBER = 1;
            public static final int LASTMATRIX_FIELD_NUMBER = 3;
            public static final int ORIGINMATRIX_FIELD_NUMBER = 2;
            public static final int SOURCEFILENAME_FIELD_NUMBER = 4;
            public static final int SOURCEID_FIELD_NUMBER = 5;

            /* renamed from: a */
            public static final GraphMatrix f5356a = new GraphMatrix();

            /* renamed from: b */
            public static final C4390s f5357b = new C4390s();
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private List<GraphData> graphData_;
            private EzyMatrix$Matrix lastMatrix_;
            private byte memoizedIsInitialized;
            private EzyMatrix$Matrix originMatrix_;
            private volatile Object sourceFileName_;
            private int sourceId_;

            public GraphMatrix(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$4076(GraphMatrix graphMatrix, int i) {
                int i8 = i | graphMatrix.bitField0_;
                graphMatrix.bitField0_ = i8;
                return i8;
            }

            public static GraphMatrix getDefaultInstance() {
                return f5356a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1589i;
            }

            public static C4392t newBuilder() {
                return f5356a.toBuilder();
            }

            public static GraphMatrix parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GraphMatrix) GeneratedMessageV3.parseDelimitedWithIOException(f5357b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphMatrix parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GraphMatrix) f5357b.parseFrom(byteBuffer);
            }

            public static Parser<GraphMatrix> parser() {
                return f5357b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GraphMatrix)) {
                    return super.equals(obj);
                }
                GraphMatrix graphMatrix = (GraphMatrix) obj;
                if (!getGraphDataList().equals(graphMatrix.getGraphDataList()) || hasOriginMatrix() != graphMatrix.hasOriginMatrix()) {
                    return false;
                }
                if ((!hasOriginMatrix() || getOriginMatrix().equals(graphMatrix.getOriginMatrix())) && hasLastMatrix() == graphMatrix.hasLastMatrix()) {
                    return (!hasLastMatrix() || getLastMatrix().equals(graphMatrix.getLastMatrix())) && getSourceFileName().equals(graphMatrix.getSourceFileName()) && getSourceId() == graphMatrix.getSourceId() && getUnknownFields().equals(graphMatrix.getUnknownFields());
                }
                return false;
            }

            public GraphData getGraphData(int i) {
                return this.graphData_.get(i);
            }

            public int getGraphDataCount() {
                return this.graphData_.size();
            }

            public List<GraphData> getGraphDataList() {
                return this.graphData_;
            }

            public InterfaceC4388r getGraphDataOrBuilder(int i) {
                return this.graphData_.get(i);
            }

            public List<? extends InterfaceC4388r> getGraphDataOrBuilderList() {
                return this.graphData_;
            }

            public EzyMatrix$Matrix getLastMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.lastMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getLastMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.lastMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public EzyMatrix$Matrix getOriginMatrix() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.originMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            public InterfaceC3118c0 getOriginMatrixOrBuilder() {
                EzyMatrix$Matrix ezyMatrix$Matrix = this.originMatrix_;
                return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<GraphMatrix> getParserForType() {
                return f5357b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = 0;
                for (int i8 = 0; i8 < this.graphData_.size(); i8++) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.graphData_.get(i8));
                }
                if ((this.bitField0_ & 1) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, getOriginMatrix());
                }
                if ((this.bitField0_ & 2) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(3, getLastMatrix());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.sourceFileName_);
                }
                int i9 = this.sourceId_;
                if (i9 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i9);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public String getSourceFileName() {
                Object obj = this.sourceFileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sourceFileName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSourceFileNameBytes() {
                Object obj = this.sourceFileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceFileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSourceId() {
                return this.sourceId_;
            }

            public boolean hasLastMatrix() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOriginMatrix() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (getGraphDataCount() > 0) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getGraphDataList().hashCode();
                }
                if (hasOriginMatrix()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getOriginMatrix().hashCode();
                }
                if (hasLastMatrix()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 3, 53) + getLastMatrix().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + ((getSourceId() + ((((getSourceFileName().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 4, 53)) * 37) + 5) * 53)) * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1590j.ensureFieldAccessorsInitialized(GraphMatrix.class, C4392t.class);
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
                return new GraphMatrix();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i = 0; i < this.graphData_.size(); i++) {
                    codedOutputStream.writeMessage(1, this.graphData_.get(i));
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(2, getOriginMatrix());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(3, getLastMatrix());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.sourceFileName_);
                }
                int i8 = this.sourceId_;
                if (i8 != 0) {
                    codedOutputStream.writeInt32(5, i8);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4392t newBuilder(GraphMatrix graphMatrix) {
                C4392t builder = f5356a.toBuilder();
                builder.m3833j(graphMatrix);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphMatrix parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphMatrix) f5357b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static GraphMatrix parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphMatrix) GeneratedMessageV3.parseDelimitedWithIOException(f5357b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphMatrix parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GraphMatrix) f5357b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphMatrix getDefaultInstanceForType() {
                return f5356a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4392t toBuilder() {
                if (this == f5356a) {
                    return new C4392t();
                }
                C4392t c4392t = new C4392t();
                c4392t.m3833j(this);
                return c4392t;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphMatrix parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphMatrix) f5357b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4392t newBuilderForType() {
                return newBuilder();
            }

            private GraphMatrix() {
                this.sourceFileName_ = "";
                this.sourceId_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.graphData_ = Collections.EMPTY_LIST;
                this.sourceFileName_ = "";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphMatrix parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GraphMatrix) f5357b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4392t newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4392t c4392t = new C4392t(builderParent);
                c4392t.f5571b = Collections.EMPTY_LIST;
                c4392t.f5577h = "";
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4392t.m3830g();
                    c4392t.m3832i();
                    c4392t.m3831h();
                }
                return c4392t;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphMatrix parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphMatrix) f5357b.parseFrom(bArr, extensionRegistryLite);
            }

            public static GraphMatrix parseFrom(InputStream inputStream) throws IOException {
                return (GraphMatrix) GeneratedMessageV3.parseWithIOException(f5357b, inputStream);
            }

            public static GraphMatrix parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphMatrix) GeneratedMessageV3.parseWithIOException(f5357b, inputStream, extensionRegistryLite);
            }

            public static GraphMatrix parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (GraphMatrix) GeneratedMessageV3.parseWithIOException(f5357b, codedInputStream);
            }

            public static GraphMatrix parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphMatrix) GeneratedMessageV3.parseWithIOException(f5357b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class GraphRemove extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int GRAPHDATA_FIELD_NUMBER = 1;

            /* renamed from: a */
            public static final GraphRemove f5358a = new GraphRemove();

            /* renamed from: b */
            public static final C4394u f5359b = new C4394u();
            private static final long serialVersionUID = 0;
            private List<GraphData> graphData_;
            private byte memoizedIsInitialized;

            public GraphRemove(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GraphRemove getDefaultInstance() {
                return f5358a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1587g;
            }

            public static C4396v newBuilder() {
                return f5358a.toBuilder();
            }

            public static GraphRemove parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GraphRemove) GeneratedMessageV3.parseDelimitedWithIOException(f5359b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphRemove parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GraphRemove) f5359b.parseFrom(byteBuffer);
            }

            public static Parser<GraphRemove> parser() {
                return f5359b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GraphRemove)) {
                    return super.equals(obj);
                }
                GraphRemove graphRemove = (GraphRemove) obj;
                return getGraphDataList().equals(graphRemove.getGraphDataList()) && getUnknownFields().equals(graphRemove.getUnknownFields());
            }

            public GraphData getGraphData(int i) {
                return this.graphData_.get(i);
            }

            public int getGraphDataCount() {
                return this.graphData_.size();
            }

            public List<GraphData> getGraphDataList() {
                return this.graphData_;
            }

            public InterfaceC4388r getGraphDataOrBuilder(int i) {
                return this.graphData_.get(i);
            }

            public List<? extends InterfaceC4388r> getGraphDataOrBuilderList() {
                return this.graphData_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<GraphRemove> getParserForType() {
                return f5359b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeMessageSize = 0;
                for (int i8 = 0; i8 < this.graphData_.size(); i8++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.graphData_.get(i8));
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
                if (getGraphDataCount() > 0) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getGraphDataList().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1588h.ensureFieldAccessorsInitialized(GraphRemove.class, C4396v.class);
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
                return new GraphRemove();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i = 0; i < this.graphData_.size(); i++) {
                    codedOutputStream.writeMessage(1, this.graphData_.get(i));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4396v newBuilder(GraphRemove graphRemove) {
                C4396v builder = f5358a.toBuilder();
                builder.m3850g(graphRemove);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphRemove parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphRemove) f5359b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private GraphRemove() {
                this.memoizedIsInitialized = (byte) -1;
                this.graphData_ = Collections.EMPTY_LIST;
            }

            public static GraphRemove parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphRemove) GeneratedMessageV3.parseDelimitedWithIOException(f5359b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphRemove parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GraphRemove) f5359b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphRemove getDefaultInstanceForType() {
                return f5358a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4396v toBuilder() {
                if (this == f5358a) {
                    return new C4396v();
                }
                C4396v c4396v = new C4396v();
                c4396v.m3850g(this);
                return c4396v;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphRemove parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphRemove) f5359b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4396v newBuilderForType() {
                return newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphRemove parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GraphRemove) f5359b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4396v newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4396v c4396v = new C4396v(builderParent);
                c4396v.f5587b = Collections.EMPTY_LIST;
                return c4396v;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static GraphRemove parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GraphRemove) f5359b.parseFrom(bArr, extensionRegistryLite);
            }

            public static GraphRemove parseFrom(InputStream inputStream) throws IOException {
                return (GraphRemove) GeneratedMessageV3.parseWithIOException(f5359b, inputStream);
            }

            public static GraphRemove parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphRemove) GeneratedMessageV3.parseWithIOException(f5359b, inputStream, extensionRegistryLite);
            }

            public static GraphRemove parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (GraphRemove) GeneratedMessageV3.parseWithIOException(f5359b, codedInputStream);
            }

            public static GraphRemove parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GraphRemove) GeneratedMessageV3.parseWithIOException(f5359b, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class REBUILD extends GeneratedMessageV3 implements MessageOrBuilder {
            public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 2;
            public static final int BACKGROUNDLINECONFIG_FIELD_NUMBER = 3;
            public static final int SNAPSHOT_FIELD_NUMBER = 1;

            /* renamed from: a */
            public static final REBUILD f5360a = new REBUILD();

            /* renamed from: b */
            public static final C4398w f5361b = new C4398w();
            private static final long serialVersionUID = 0;
            private int backgroundColor_;
            private EzyHeader$BackgroundLineConfig backgroundLineConfig_;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private EzyPageSnapshot$PageSnapshot.GraphSnapshot snapshot_;

            public REBUILD(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
                super(builder);
                this.backgroundColor_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static /* synthetic */ int access$12176(REBUILD rebuild, int i) {
                int i8 = i | rebuild.bitField0_;
                rebuild.bitField0_ = i8;
                return i8;
            }

            public static REBUILD getDefaultInstance() {
                return f5360a;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AbstractC3126f.f1603w;
            }

            public static C4400x newBuilder() {
                return f5360a.toBuilder();
            }

            public static REBUILD parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (REBUILD) GeneratedMessageV3.parseDelimitedWithIOException(f5361b, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static REBUILD parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (REBUILD) f5361b.parseFrom(byteBuffer);
            }

            public static Parser<REBUILD> parser() {
                return f5361b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof REBUILD)) {
                    return super.equals(obj);
                }
                REBUILD rebuild = (REBUILD) obj;
                if (hasSnapshot() != rebuild.hasSnapshot()) {
                    return false;
                }
                if ((!hasSnapshot() || getSnapshot().equals(rebuild.getSnapshot())) && getBackgroundColor() == rebuild.getBackgroundColor() && hasBackgroundLineConfig() == rebuild.hasBackgroundLineConfig()) {
                    return (!hasBackgroundLineConfig() || getBackgroundLineConfig().equals(rebuild.getBackgroundLineConfig())) && getUnknownFields().equals(rebuild.getUnknownFields());
                }
                return false;
            }

            public int getBackgroundColor() {
                return this.backgroundColor_;
            }

            public EzyHeader$BackgroundLineConfig getBackgroundLineConfig() {
                EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.backgroundLineConfig_;
                return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
            }

            public InterfaceC3165s getBackgroundLineConfigOrBuilder() {
                EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig = this.backgroundLineConfig_;
                return ezyHeader$BackgroundLineConfig == null ? EzyHeader$BackgroundLineConfig.getDefaultInstance() : ezyHeader$BackgroundLineConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<REBUILD> getParserForType() {
                return f5361b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSnapshot()) : 0;
                int i8 = this.backgroundColor_;
                if (i8 != 0) {
                    iComputeMessageSize += CodedOutputStream.computeInt32Size(2, i8);
                }
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getBackgroundLineConfig());
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public EzyPageSnapshot$PageSnapshot.GraphSnapshot getSnapshot() {
                EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot = this.snapshot_;
                return graphSnapshot == null ? EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance() : graphSnapshot;
            }

            public InterfaceC4363e0 getSnapshotOrBuilder() {
                EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot = this.snapshot_;
                return graphSnapshot == null ? EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance() : graphSnapshot;
            }

            public boolean hasBackgroundLineConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSnapshot() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasSnapshot()) {
                    iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getSnapshot().hashCode();
                }
                int backgroundColor = getBackgroundColor() + AbstractC1923c.m1038b(iHashCode, 37, 2, 53);
                if (hasBackgroundLineConfig()) {
                    backgroundColor = getBackgroundLineConfig().hashCode() + AbstractC1923c.m1038b(backgroundColor, 37, 3, 53);
                }
                int iHashCode2 = getUnknownFields().hashCode() + (backgroundColor * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AbstractC3126f.f1604x.ensureFieldAccessorsInitialized(REBUILD.class, C4400x.class);
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
                return new REBUILD();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getSnapshot());
                }
                int i = this.backgroundColor_;
                if (i != 0) {
                    codedOutputStream.writeInt32(2, i);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(3, getBackgroundLineConfig());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static C4400x newBuilder(REBUILD rebuild) {
                C4400x builder = f5360a.toBuilder();
                builder.m3863h(rebuild);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static REBUILD parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (REBUILD) f5361b.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static REBUILD parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (REBUILD) GeneratedMessageV3.parseDelimitedWithIOException(f5361b, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static REBUILD parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (REBUILD) f5361b.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public REBUILD getDefaultInstanceForType() {
                return f5360a;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4400x toBuilder() {
                if (this == f5360a) {
                    return new C4400x();
                }
                C4400x c4400x = new C4400x();
                c4400x.m3863h(this);
                return c4400x;
            }

            private REBUILD() {
                this.backgroundColor_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static REBUILD parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (REBUILD) f5361b.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public C4400x newBuilderForType() {
                return newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static REBUILD parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (REBUILD) f5361b.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public C4400x newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                C4400x c4400x = new C4400x(builderParent);
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c4400x.m3862g();
                    c4400x.m3861f();
                }
                return c4400x;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static REBUILD parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (REBUILD) f5361b.parseFrom(bArr, extensionRegistryLite);
            }

            public static REBUILD parseFrom(InputStream inputStream) throws IOException {
                return (REBUILD) GeneratedMessageV3.parseWithIOException(f5361b, inputStream);
            }

            public static REBUILD parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (REBUILD) GeneratedMessageV3.parseWithIOException(f5361b, inputStream, extensionRegistryLite);
            }

            public static REBUILD parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (REBUILD) GeneratedMessageV3.parseWithIOException(f5361b, codedInputStream);
            }

            public static REBUILD parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (REBUILD) GeneratedMessageV3.parseWithIOException(f5361b, codedInputStream, extensionRegistryLite);
            }
        }

        public CommandInfo(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
            super(builder);
            this.delayTime_ = 0L;
            this.duration_ = 0L;
            this.isPlay_ = false;
            this.commandEnum_ = 0;
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CommandInfo getDefaultInstance() {
            return f5340a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3126f.f1583c;
        }

        public static C4362e newBuilder() {
            return f5340a.toBuilder();
        }

        public static CommandInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CommandInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5341b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CommandInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CommandInfo) f5341b.parseFrom(byteBuffer);
        }

        public static Parser<CommandInfo> parser() {
            return f5341b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommandInfo)) {
                return super.equals(obj);
            }
            CommandInfo commandInfo = (CommandInfo) obj;
            return getDelayTime() == commandInfo.getDelayTime() && getDuration() == commandInfo.getDuration() && getIsPlay() == commandInfo.getIsPlay() && this.commandEnum_ == commandInfo.commandEnum_ && getData().equals(commandInfo.getData()) && getUnknownFields().equals(commandInfo.getUnknownFields());
        }

        public EzyCommandEnum$CommandEnum getCommandEnum() {
            EzyCommandEnum$CommandEnum ezyCommandEnum$CommandEnumForNumber = EzyCommandEnum$CommandEnum.forNumber(this.commandEnum_);
            return ezyCommandEnum$CommandEnumForNumber == null ? EzyCommandEnum$CommandEnum.UNRECOGNIZED : ezyCommandEnum$CommandEnumForNumber;
        }

        public int getCommandEnumValue() {
            return this.commandEnum_;
        }

        public ByteString getData() {
            return this.data_;
        }

        public long getDelayTime() {
            return this.delayTime_;
        }

        public long getDuration() {
            return this.duration_;
        }

        public boolean getIsPlay() {
            return this.isPlay_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CommandInfo> getParserForType() {
            return f5341b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j7 = this.delayTime_;
            int iComputeInt64Size = j7 != 0 ? CodedOutputStream.computeInt64Size(1, j7) : 0;
            long j8 = this.duration_;
            if (j8 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j8);
            }
            boolean z8 = this.isPlay_;
            if (z8) {
                iComputeInt64Size += CodedOutputStream.computeBoolSize(3, z8);
            }
            if (this.commandEnum_ != EzyCommandEnum$CommandEnum.ACTION_DEFAULT.getNumber()) {
                iComputeInt64Size += CodedOutputStream.computeEnumSize(4, this.commandEnum_);
            }
            if (!this.data_.isEmpty()) {
                iComputeInt64Size += CodedOutputStream.computeBytesSize(5, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getData().hashCode() + ((((((((Internal.hashBoolean(getIsPlay()) + ((((Internal.hashLong(getDuration()) + ((((Internal.hashLong(getDelayTime()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53) + this.commandEnum_) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3126f.f1584d.ensureFieldAccessorsInitialized(CommandInfo.class, C4362e.class);
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
            return new CommandInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j7 = this.delayTime_;
            if (j7 != 0) {
                codedOutputStream.writeInt64(1, j7);
            }
            long j8 = this.duration_;
            if (j8 != 0) {
                codedOutputStream.writeInt64(2, j8);
            }
            boolean z8 = this.isPlay_;
            if (z8) {
                codedOutputStream.writeBool(3, z8);
            }
            if (this.commandEnum_ != EzyCommandEnum$CommandEnum.ACTION_DEFAULT.getNumber()) {
                codedOutputStream.writeEnum(4, this.commandEnum_);
            }
            if (!this.data_.isEmpty()) {
                codedOutputStream.writeBytes(5, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4362e newBuilder(CommandInfo commandInfo) {
            C4362e builder = f5340a.toBuilder();
            builder.m3723g(commandInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CommandInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommandInfo) f5341b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CommandInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommandInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5341b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CommandInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CommandInfo) f5341b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CommandInfo getDefaultInstanceForType() {
            return f5340a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4362e toBuilder() {
            if (this == f5340a) {
                return new C4362e();
            }
            C4362e c4362e = new C4362e();
            c4362e.m3723g(this);
            return c4362e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CommandInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommandInfo) f5341b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4362e newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CommandInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CommandInfo) f5341b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4362e newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4362e c4362e = new C4362e(builderParent);
            c4362e.f5480e = 0;
            c4362e.f5481f = ByteString.EMPTY;
            return c4362e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CommandInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommandInfo) f5341b.parseFrom(bArr, extensionRegistryLite);
        }

        public static CommandInfo parseFrom(InputStream inputStream) throws IOException {
            return (CommandInfo) GeneratedMessageV3.parseWithIOException(f5341b, inputStream);
        }

        private CommandInfo() {
            this.delayTime_ = 0L;
            this.duration_ = 0L;
            this.isPlay_ = false;
            this.commandEnum_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.commandEnum_ = 0;
            this.data_ = byteString;
        }

        public static CommandInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommandInfo) GeneratedMessageV3.parseWithIOException(f5341b, inputStream, extensionRegistryLite);
        }

        public static CommandInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CommandInfo) GeneratedMessageV3.parseWithIOException(f5341b, codedInputStream);
        }

        public static CommandInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommandInfo) GeneratedMessageV3.parseWithIOException(f5341b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzyCommand$CommandSource(GeneratedMessageV3.Builder builder, AbstractC3117c abstractC3117c) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyCommand$CommandSource getDefaultInstance() {
        return f5338a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3126f.f1581a;
    }

    public static C4351a newBuilder() {
        return f5338a.toBuilder();
    }

    public static EzyCommand$CommandSource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyCommand$CommandSource) GeneratedMessageV3.parseDelimitedWithIOException(f5339b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyCommand$CommandSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyCommand$CommandSource) f5339b.parseFrom(byteBuffer);
    }

    public static Parser<EzyCommand$CommandSource> parser() {
        return f5339b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyCommand$CommandSource)) {
            return super.equals(obj);
        }
        EzyCommand$CommandSource ezyCommand$CommandSource = (EzyCommand$CommandSource) obj;
        return getCommandInfoList().equals(ezyCommand$CommandSource.getCommandInfoList()) && getUnknownFields().equals(ezyCommand$CommandSource.getUnknownFields());
    }

    public CommandInfo getCommandInfo(int i) {
        return this.commandInfo_.get(i);
    }

    public int getCommandInfoCount() {
        return this.commandInfo_.size();
    }

    public List<CommandInfo> getCommandInfoList() {
        return this.commandInfo_;
    }

    public InterfaceC3123e getCommandInfoOrBuilder(int i) {
        return this.commandInfo_.get(i);
    }

    public List<? extends InterfaceC3123e> getCommandInfoOrBuilderList() {
        return this.commandInfo_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyCommand$CommandSource> getParserForType() {
        return f5339b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.commandInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.commandInfo_.get(i8));
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
        if (getCommandInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getCommandInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3126f.f1582b.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.class, C4351a.class);
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
        return new EzyCommand$CommandSource();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.commandInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.commandInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4351a newBuilder(EzyCommand$CommandSource ezyCommand$CommandSource) {
        C4351a builder = f5338a.toBuilder();
        builder.m3686i(ezyCommand$CommandSource);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyCommand$CommandSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyCommand$CommandSource) f5339b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzyCommand$CommandSource() {
        this.memoizedIsInitialized = (byte) -1;
        this.commandInfo_ = Collections.EMPTY_LIST;
    }

    public static EzyCommand$CommandSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyCommand$CommandSource) GeneratedMessageV3.parseDelimitedWithIOException(f5339b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyCommand$CommandSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyCommand$CommandSource) f5339b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyCommand$CommandSource getDefaultInstanceForType() {
        return f5338a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4351a toBuilder() {
        if (this == f5338a) {
            return new C4351a();
        }
        C4351a c4351a = new C4351a();
        c4351a.m3686i(this);
        return c4351a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyCommand$CommandSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyCommand$CommandSource) f5339b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4351a newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyCommand$CommandSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyCommand$CommandSource) f5339b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4351a newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4351a c4351a = new C4351a(builderParent);
        c4351a.f5441b = Collections.EMPTY_LIST;
        return c4351a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyCommand$CommandSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyCommand$CommandSource) f5339b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyCommand$CommandSource parseFrom(InputStream inputStream) throws IOException {
        return (EzyCommand$CommandSource) GeneratedMessageV3.parseWithIOException(f5339b, inputStream);
    }

    public static EzyCommand$CommandSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyCommand$CommandSource) GeneratedMessageV3.parseWithIOException(f5339b, inputStream, extensionRegistryLite);
    }

    public static EzyCommand$CommandSource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyCommand$CommandSource) GeneratedMessageV3.parseWithIOException(f5339b, codedInputStream);
    }

    public static EzyCommand$CommandSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyCommand$CommandSource) GeneratedMessageV3.parseWithIOException(f5339b, codedInputStream, extensionRegistryLite);
    }
}

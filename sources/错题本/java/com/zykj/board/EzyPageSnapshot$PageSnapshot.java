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
import p020b4.AbstractC3142k0;
import p020b4.AbstractC3148m0;
import p020b4.C3145l0;
import p020b4.InterfaceC3118c0;
import p020b4.InterfaceC3119c1;
import p020b4.InterfaceC3160q0;
import p020b4.InterfaceC3175v0;

/* loaded from: classes3.dex */
public final class EzyPageSnapshot$PageSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int CAMERAMATRIX_FIELD_NUMBER = 1;
    public static final int GRAPHSNAPSHOT_FIELD_NUMBER = 2;

    /* renamed from: a */
    public static final EzyPageSnapshot$PageSnapshot f5388a = new EzyPageSnapshot$PageSnapshot();

    /* renamed from: b */
    public static final C3145l0 f5389b = new C3145l0();
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private EzyMatrix$Matrix cameraMatrix_;
    private GraphSnapshot graphSnapshot_;
    private byte memoizedIsInitialized;

    public static final class GraphSnapshot extends GeneratedMessageV3 implements InterfaceC4363e0 {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 8;
        public static final int CHILDGRAPH_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 10;
        public static final int FILEPATH_FIELD_NUMBER = 12;
        public static final int GRAPHENUM_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MATRIX_FIELD_NUMBER = 4;
        public static final int OUTRECT_FIELD_NUMBER = 3;
        public static final int PAINT_FIELD_NUMBER = 9;
        public static final int POINTLIST_FIELD_NUMBER = 11;
        public static final int SOURCEFILENAME_FIELD_NUMBER = 6;
        public static final int SOURCEID_FIELD_NUMBER = 7;

        /* renamed from: a */
        public static final GraphSnapshot f5390a = new GraphSnapshot();

        /* renamed from: b */
        public static final C4358c0 f5391b = new C4358c0();
        private static final long serialVersionUID = 0;
        private int backgroundColor_;
        private int bitField0_;
        private List<GraphSnapshot> childGraph_;
        private volatile Object content_;
        private volatile Object filePath_;
        private int graphEnum_;
        private volatile Object id_;
        private EzyMatrix$Matrix matrix_;
        private byte memoizedIsInitialized;
        private EzyRectF$RectF outRect_;
        private EzyPaint$Paint paint_;
        private List<EzyPointF$PointF> pointList_;
        private volatile Object sourceFileName_;
        private int sourceId_;

        public GraphSnapshot(GeneratedMessageV3.Builder builder, AbstractC3142k0 abstractC3142k0) {
            super(builder);
            this.id_ = "";
            this.graphEnum_ = 0;
            this.sourceFileName_ = "";
            this.sourceId_ = 0;
            this.backgroundColor_ = 0;
            this.content_ = "";
            this.filePath_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$2076(GraphSnapshot graphSnapshot, int i) {
            int i8 = i | graphSnapshot.bitField0_;
            graphSnapshot.bitField0_ = i8;
            return i8;
        }

        public static GraphSnapshot getDefaultInstance() {
            return f5390a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3148m0.f1621c;
        }

        public static C4361d0 newBuilder() {
            return f5390a.toBuilder();
        }

        public static GraphSnapshot parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GraphSnapshot) GeneratedMessageV3.parseDelimitedWithIOException(f5391b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GraphSnapshot parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GraphSnapshot) f5391b.parseFrom(byteBuffer);
        }

        public static Parser<GraphSnapshot> parser() {
            return f5391b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GraphSnapshot)) {
                return super.equals(obj);
            }
            GraphSnapshot graphSnapshot = (GraphSnapshot) obj;
            if (!getId().equals(graphSnapshot.getId()) || this.graphEnum_ != graphSnapshot.graphEnum_ || hasOutRect() != graphSnapshot.hasOutRect()) {
                return false;
            }
            if ((hasOutRect() && !getOutRect().equals(graphSnapshot.getOutRect())) || hasMatrix() != graphSnapshot.hasMatrix()) {
                return false;
            }
            if ((!hasMatrix() || getMatrix().equals(graphSnapshot.getMatrix())) && getChildGraphList().equals(graphSnapshot.getChildGraphList()) && getSourceFileName().equals(graphSnapshot.getSourceFileName()) && getSourceId() == graphSnapshot.getSourceId() && getBackgroundColor() == graphSnapshot.getBackgroundColor() && hasPaint() == graphSnapshot.hasPaint()) {
                return (!hasPaint() || getPaint().equals(graphSnapshot.getPaint())) && getContent().equals(graphSnapshot.getContent()) && getPointListList().equals(graphSnapshot.getPointListList()) && getFilePath().equals(graphSnapshot.getFilePath()) && getUnknownFields().equals(graphSnapshot.getUnknownFields());
            }
            return false;
        }

        public int getBackgroundColor() {
            return this.backgroundColor_;
        }

        public GraphSnapshot getChildGraph(int i) {
            return this.childGraph_.get(i);
        }

        public int getChildGraphCount() {
            return this.childGraph_.size();
        }

        public List<GraphSnapshot> getChildGraphList() {
            return this.childGraph_;
        }

        public InterfaceC4363e0 getChildGraphOrBuilder(int i) {
            return this.childGraph_.get(i);
        }

        public List<? extends InterfaceC4363e0> getChildGraphOrBuilderList() {
            return this.childGraph_;
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

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public EzyMatrix$Matrix getMatrix() {
            EzyMatrix$Matrix ezyMatrix$Matrix = this.matrix_;
            return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
        }

        public InterfaceC3118c0 getMatrixOrBuilder() {
            EzyMatrix$Matrix ezyMatrix$Matrix = this.matrix_;
            return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
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
        public Parser<GraphSnapshot> getParserForType() {
            return f5391b;
        }

        public EzyPointF$PointF getPointList(int i) {
            return this.pointList_.get(i);
        }

        public int getPointListCount() {
            return this.pointList_.size();
        }

        public List<EzyPointF$PointF> getPointListList() {
            return this.pointList_;
        }

        public InterfaceC3175v0 getPointListOrBuilder(int i) {
            return this.pointList_.get(i);
        }

        public List<? extends InterfaceC3175v0> getPointListOrBuilderList() {
            return this.pointList_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.id_) ? GeneratedMessageV3.computeStringSize(1, this.id_) : 0;
            if (this.graphEnum_ != EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.graphEnum_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, getOutRect());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, getMatrix());
            }
            for (int i8 = 0; i8 < this.childGraph_.size(); i8++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.childGraph_.get(i8));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.sourceFileName_);
            }
            int i9 = this.sourceId_;
            if (i9 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(7, i9);
            }
            int i10 = this.backgroundColor_;
            if (i10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(8, i10);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, getPaint());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.content_);
            }
            for (int i11 = 0; i11 < this.pointList_.size(); i11++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(11, this.pointList_.get(i11));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.filePath_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.filePath_);
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

        public boolean hasMatrix() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOutRect() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPaint() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53) + this.graphEnum_;
            if (hasOutRect()) {
                iHashCode = getOutRect().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 3, 53);
            }
            if (hasMatrix()) {
                iHashCode = getMatrix().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 4, 53);
            }
            if (getChildGraphCount() > 0) {
                iHashCode = getChildGraphList().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 5, 53);
            }
            int backgroundColor = getBackgroundColor() + ((((getSourceId() + ((((getSourceFileName().hashCode() + AbstractC1923c.m1038b(iHashCode, 37, 6, 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
            if (hasPaint()) {
                backgroundColor = getPaint().hashCode() + AbstractC1923c.m1038b(backgroundColor, 37, 9, 53);
            }
            int iHashCode2 = getContent().hashCode() + AbstractC1923c.m1038b(backgroundColor, 37, 10, 53);
            if (getPointListCount() > 0) {
                iHashCode2 = getPointListList().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 11, 53);
            }
            int iHashCode3 = getUnknownFields().hashCode() + ((getFilePath().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 12, 53)) * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3148m0.f1622d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C4361d0.class);
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
            return new GraphSnapshot();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if (this.graphEnum_ != EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                codedOutputStream.writeEnum(2, this.graphEnum_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(3, getOutRect());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(4, getMatrix());
            }
            for (int i = 0; i < this.childGraph_.size(); i++) {
                codedOutputStream.writeMessage(5, this.childGraph_.get(i));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.sourceFileName_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.sourceFileName_);
            }
            int i8 = this.sourceId_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(7, i8);
            }
            int i9 = this.backgroundColor_;
            if (i9 != 0) {
                codedOutputStream.writeInt32(8, i9);
            }
            if ((4 & this.bitField0_) != 0) {
                codedOutputStream.writeMessage(9, getPaint());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.content_);
            }
            for (int i10 = 0; i10 < this.pointList_.size(); i10++) {
                codedOutputStream.writeMessage(11, this.pointList_.get(i10));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.filePath_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.filePath_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4361d0 newBuilder(GraphSnapshot graphSnapshot) {
            C4361d0 builder = f5390a.toBuilder();
            builder.m3717l(graphSnapshot);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GraphSnapshot parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GraphSnapshot) f5391b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static GraphSnapshot parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GraphSnapshot) GeneratedMessageV3.parseDelimitedWithIOException(f5391b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GraphSnapshot parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GraphSnapshot) f5391b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GraphSnapshot getDefaultInstanceForType() {
            return f5390a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4361d0 toBuilder() {
            if (this == f5390a) {
                return new C4361d0();
            }
            C4361d0 c4361d0 = new C4361d0();
            c4361d0.m3717l(this);
            return c4361d0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GraphSnapshot parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GraphSnapshot) f5391b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4361d0 newBuilderForType() {
            return newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GraphSnapshot parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GraphSnapshot) f5391b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4361d0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4361d0 c4361d0 = new C4361d0(builderParent);
            c4361d0.f5459b = "";
            c4361d0.f5460c = 0;
            List list = Collections.EMPTY_LIST;
            c4361d0.f5465h = list;
            c4361d0.f5467j = "";
            c4361d0.f5472o = "";
            c4361d0.f5473p = list;
            c4361d0.f5475r = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                c4361d0.m3714i();
                c4361d0.m3713h();
                c4361d0.getChildGraphFieldBuilder();
                c4361d0.m3715j();
                c4361d0.m3716k();
            }
            return c4361d0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static GraphSnapshot parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GraphSnapshot) f5391b.parseFrom(bArr, extensionRegistryLite);
        }

        public static GraphSnapshot parseFrom(InputStream inputStream) throws IOException {
            return (GraphSnapshot) GeneratedMessageV3.parseWithIOException(f5391b, inputStream);
        }

        public static GraphSnapshot parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GraphSnapshot) GeneratedMessageV3.parseWithIOException(f5391b, inputStream, extensionRegistryLite);
        }

        private GraphSnapshot() {
            this.id_ = "";
            this.graphEnum_ = 0;
            this.sourceFileName_ = "";
            this.sourceId_ = 0;
            this.backgroundColor_ = 0;
            this.content_ = "";
            this.filePath_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.graphEnum_ = 0;
            List list = Collections.EMPTY_LIST;
            this.childGraph_ = list;
            this.sourceFileName_ = "";
            this.content_ = "";
            this.pointList_ = list;
            this.filePath_ = "";
        }

        public static GraphSnapshot parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GraphSnapshot) GeneratedMessageV3.parseWithIOException(f5391b, codedInputStream);
        }

        public static GraphSnapshot parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GraphSnapshot) GeneratedMessageV3.parseWithIOException(f5391b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzyPageSnapshot$PageSnapshot(GeneratedMessageV3.Builder builder, AbstractC3142k0 abstractC3142k0) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static /* synthetic */ int access$3376(EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshot, int i) {
        int i8 = i | ezyPageSnapshot$PageSnapshot.bitField0_;
        ezyPageSnapshot$PageSnapshot.bitField0_ = i8;
        return i8;
    }

    public static EzyPageSnapshot$PageSnapshot getDefaultInstance() {
        return f5388a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3148m0.f1619a;
    }

    public static C4355b0 newBuilder() {
        return f5388a.toBuilder();
    }

    public static EzyPageSnapshot$PageSnapshot parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyPageSnapshot$PageSnapshot) GeneratedMessageV3.parseDelimitedWithIOException(f5389b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageSnapshot$PageSnapshot parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyPageSnapshot$PageSnapshot) f5389b.parseFrom(byteBuffer);
    }

    public static Parser<EzyPageSnapshot$PageSnapshot> parser() {
        return f5389b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyPageSnapshot$PageSnapshot)) {
            return super.equals(obj);
        }
        EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshot = (EzyPageSnapshot$PageSnapshot) obj;
        if (hasCameraMatrix() != ezyPageSnapshot$PageSnapshot.hasCameraMatrix()) {
            return false;
        }
        if ((!hasCameraMatrix() || getCameraMatrix().equals(ezyPageSnapshot$PageSnapshot.getCameraMatrix())) && hasGraphSnapshot() == ezyPageSnapshot$PageSnapshot.hasGraphSnapshot()) {
            return (!hasGraphSnapshot() || getGraphSnapshot().equals(ezyPageSnapshot$PageSnapshot.getGraphSnapshot())) && getUnknownFields().equals(ezyPageSnapshot$PageSnapshot.getUnknownFields());
        }
        return false;
    }

    public EzyMatrix$Matrix getCameraMatrix() {
        EzyMatrix$Matrix ezyMatrix$Matrix = this.cameraMatrix_;
        return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
    }

    public InterfaceC3118c0 getCameraMatrixOrBuilder() {
        EzyMatrix$Matrix ezyMatrix$Matrix = this.cameraMatrix_;
        return ezyMatrix$Matrix == null ? EzyMatrix$Matrix.getDefaultInstance() : ezyMatrix$Matrix;
    }

    public GraphSnapshot getGraphSnapshot() {
        GraphSnapshot graphSnapshot = this.graphSnapshot_;
        return graphSnapshot == null ? GraphSnapshot.getDefaultInstance() : graphSnapshot;
    }

    public InterfaceC4363e0 getGraphSnapshotOrBuilder() {
        GraphSnapshot graphSnapshot = this.graphSnapshot_;
        return graphSnapshot == null ? GraphSnapshot.getDefaultInstance() : graphSnapshot;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyPageSnapshot$PageSnapshot> getParserForType() {
        return f5389b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCameraMatrix()) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getGraphSnapshot());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean hasCameraMatrix() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGraphSnapshot() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasCameraMatrix()) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getCameraMatrix().hashCode();
        }
        if (hasGraphSnapshot()) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getGraphSnapshot().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3148m0.f1620b.ensureFieldAccessorsInitialized(EzyPageSnapshot$PageSnapshot.class, C4355b0.class);
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
        return new EzyPageSnapshot$PageSnapshot();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(1, getCameraMatrix());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(2, getGraphSnapshot());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4355b0 newBuilder(EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshot) {
        C4355b0 builder = f5388a.toBuilder();
        builder.m3696h(ezyPageSnapshot$PageSnapshot);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageSnapshot$PageSnapshot parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPageSnapshot$PageSnapshot) f5389b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzyPageSnapshot$PageSnapshot() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyPageSnapshot$PageSnapshot parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPageSnapshot$PageSnapshot) GeneratedMessageV3.parseDelimitedWithIOException(f5389b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageSnapshot$PageSnapshot parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyPageSnapshot$PageSnapshot) f5389b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyPageSnapshot$PageSnapshot getDefaultInstanceForType() {
        return f5388a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4355b0 toBuilder() {
        if (this == f5388a) {
            return new C4355b0();
        }
        C4355b0 c4355b0 = new C4355b0();
        c4355b0.m3696h(this);
        return c4355b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageSnapshot$PageSnapshot parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPageSnapshot$PageSnapshot) f5389b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4355b0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageSnapshot$PageSnapshot parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyPageSnapshot$PageSnapshot) f5389b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4355b0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4355b0 c4355b0 = new C4355b0(builderParent);
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            c4355b0.m3695g();
            c4355b0.getGraphSnapshotFieldBuilder();
        }
        return c4355b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageSnapshot$PageSnapshot parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPageSnapshot$PageSnapshot) f5389b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyPageSnapshot$PageSnapshot parseFrom(InputStream inputStream) throws IOException {
        return (EzyPageSnapshot$PageSnapshot) GeneratedMessageV3.parseWithIOException(f5389b, inputStream);
    }

    public static EzyPageSnapshot$PageSnapshot parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPageSnapshot$PageSnapshot) GeneratedMessageV3.parseWithIOException(f5389b, inputStream, extensionRegistryLite);
    }

    public static EzyPageSnapshot$PageSnapshot parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyPageSnapshot$PageSnapshot) GeneratedMessageV3.parseWithIOException(f5389b, codedInputStream);
    }

    public static EzyPageSnapshot$PageSnapshot parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPageSnapshot$PageSnapshot) GeneratedMessageV3.parseWithIOException(f5389b, codedInputStream, extensionRegistryLite);
    }
}

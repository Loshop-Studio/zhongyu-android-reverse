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
import p020b4.AbstractC3125e1;
import p020b4.AbstractC3134h1;
import p020b4.C3128f1;
import p020b4.InterfaceC3131g1;

/* loaded from: classes3.dex */
public final class EzyRouterRecord$RouterRecord extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int AUDIORECORD_FIELD_NUMBER = 2;
    public static final int COMMANDRECORD_FIELD_NUMBER = 1;
    public static final int FILESOURCERECORD_FIELD_NUMBER = 5;
    public static final int GEOMETRYSOURCERECORD_FIELD_NUMBER = 7;
    public static final int MATRIXSOURCERECORD_FIELD_NUMBER = 4;
    public static final int TEXTSOURCERECORD_FIELD_NUMBER = 6;
    public static final int TOUCHSOURCERECORD_FIELD_NUMBER = 3;

    /* renamed from: a */
    public static final EzyRouterRecord$RouterRecord f5403a = new EzyRouterRecord$RouterRecord();

    /* renamed from: b */
    public static final C3128f1 f5404b = new C3128f1();
    private static final long serialVersionUID = 0;
    private List<SourceCommandRecord> audioRecord_;
    private List<SourceCommandRecord> commandRecord_;
    private List<SourceCommandRecord> fileSourceRecord_;
    private List<SourceCommandRecord> geometrySourceRecord_;
    private List<SourceCommandRecord> matrixSourceRecord_;
    private byte memoizedIsInitialized;
    private List<SourceCommandRecord> textSourceRecord_;
    private List<SourceCommandRecord> touchSourceRecord_;

    public static final class SourceCommandRecord extends GeneratedMessageV3 implements InterfaceC3131g1 {
        public static final int FILENAME_FIELD_NUMBER = 1;
        public static final int VALIDATE_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final SourceCommandRecord f5405a = new SourceCommandRecord();

        /* renamed from: b */
        public static final C4367g0 f5406b = new C4367g0();
        private static final long serialVersionUID = 0;
        private volatile Object fileName_;
        private byte memoizedIsInitialized;
        private volatile Object validate_;

        public SourceCommandRecord(GeneratedMessageV3.Builder builder, AbstractC3125e1 abstractC3125e1) {
            super(builder);
            this.fileName_ = "";
            this.validate_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SourceCommandRecord getDefaultInstance() {
            return f5405a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3134h1.f1609c;
        }

        public static C4369h0 newBuilder() {
            return f5405a.toBuilder();
        }

        public static SourceCommandRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SourceCommandRecord) GeneratedMessageV3.parseDelimitedWithIOException(f5406b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SourceCommandRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SourceCommandRecord) f5406b.parseFrom(byteBuffer);
        }

        public static Parser<SourceCommandRecord> parser() {
            return f5406b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SourceCommandRecord)) {
                return super.equals(obj);
            }
            SourceCommandRecord sourceCommandRecord = (SourceCommandRecord) obj;
            return getFileName().equals(sourceCommandRecord.getFileName()) && getValidate().equals(sourceCommandRecord.getValidate()) && getUnknownFields().equals(sourceCommandRecord.getUnknownFields());
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
        public Parser<SourceCommandRecord> getParserForType() {
            return f5406b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.fileName_) ? GeneratedMessageV3.computeStringSize(1, this.fileName_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.validate_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.validate_);
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
            int iHashCode = getUnknownFields().hashCode() + ((getValidate().hashCode() + ((((getFileName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3134h1.f1610d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C4369h0.class);
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
            return new SourceCommandRecord();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.fileName_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.validate_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.validate_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4369h0 newBuilder(SourceCommandRecord sourceCommandRecord) {
            C4369h0 builder = f5405a.toBuilder();
            builder.m3750g(sourceCommandRecord);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SourceCommandRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SourceCommandRecord) f5406b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SourceCommandRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SourceCommandRecord) GeneratedMessageV3.parseDelimitedWithIOException(f5406b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SourceCommandRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SourceCommandRecord) f5406b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SourceCommandRecord getDefaultInstanceForType() {
            return f5405a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4369h0 toBuilder() {
            if (this == f5405a) {
                return new C4369h0();
            }
            C4369h0 c4369h0 = new C4369h0();
            c4369h0.m3750g(this);
            return c4369h0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SourceCommandRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SourceCommandRecord) f5406b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4369h0 newBuilderForType() {
            return newBuilder();
        }

        private SourceCommandRecord() {
            this.fileName_ = "";
            this.validate_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.fileName_ = "";
            this.validate_ = "";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SourceCommandRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SourceCommandRecord) f5406b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4369h0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4369h0 c4369h0 = new C4369h0(builderParent);
            c4369h0.f5503b = "";
            c4369h0.f5504c = "";
            return c4369h0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SourceCommandRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SourceCommandRecord) f5406b.parseFrom(bArr, extensionRegistryLite);
        }

        public static SourceCommandRecord parseFrom(InputStream inputStream) throws IOException {
            return (SourceCommandRecord) GeneratedMessageV3.parseWithIOException(f5406b, inputStream);
        }

        public static SourceCommandRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SourceCommandRecord) GeneratedMessageV3.parseWithIOException(f5406b, inputStream, extensionRegistryLite);
        }

        public static SourceCommandRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SourceCommandRecord) GeneratedMessageV3.parseWithIOException(f5406b, codedInputStream);
        }

        public static SourceCommandRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SourceCommandRecord) GeneratedMessageV3.parseWithIOException(f5406b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzyRouterRecord$RouterRecord(GeneratedMessageV3.Builder builder, AbstractC3125e1 abstractC3125e1) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyRouterRecord$RouterRecord getDefaultInstance() {
        return f5403a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3134h1.f1607a;
    }

    public static C4365f0 newBuilder() {
        return f5403a.toBuilder();
    }

    public static EzyRouterRecord$RouterRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyRouterRecord$RouterRecord) GeneratedMessageV3.parseDelimitedWithIOException(f5404b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRouterRecord$RouterRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyRouterRecord$RouterRecord) f5404b.parseFrom(byteBuffer);
    }

    public static Parser<EzyRouterRecord$RouterRecord> parser() {
        return f5404b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyRouterRecord$RouterRecord)) {
            return super.equals(obj);
        }
        EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecord = (EzyRouterRecord$RouterRecord) obj;
        return getCommandRecordList().equals(ezyRouterRecord$RouterRecord.getCommandRecordList()) && getAudioRecordList().equals(ezyRouterRecord$RouterRecord.getAudioRecordList()) && getTouchSourceRecordList().equals(ezyRouterRecord$RouterRecord.getTouchSourceRecordList()) && getMatrixSourceRecordList().equals(ezyRouterRecord$RouterRecord.getMatrixSourceRecordList()) && getFileSourceRecordList().equals(ezyRouterRecord$RouterRecord.getFileSourceRecordList()) && getTextSourceRecordList().equals(ezyRouterRecord$RouterRecord.getTextSourceRecordList()) && getGeometrySourceRecordList().equals(ezyRouterRecord$RouterRecord.getGeometrySourceRecordList()) && getUnknownFields().equals(ezyRouterRecord$RouterRecord.getUnknownFields());
    }

    public SourceCommandRecord getAudioRecord(int i) {
        return this.audioRecord_.get(i);
    }

    public int getAudioRecordCount() {
        return this.audioRecord_.size();
    }

    public List<SourceCommandRecord> getAudioRecordList() {
        return this.audioRecord_;
    }

    public InterfaceC3131g1 getAudioRecordOrBuilder(int i) {
        return this.audioRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getAudioRecordOrBuilderList() {
        return this.audioRecord_;
    }

    public SourceCommandRecord getCommandRecord(int i) {
        return this.commandRecord_.get(i);
    }

    public int getCommandRecordCount() {
        return this.commandRecord_.size();
    }

    public List<SourceCommandRecord> getCommandRecordList() {
        return this.commandRecord_;
    }

    public InterfaceC3131g1 getCommandRecordOrBuilder(int i) {
        return this.commandRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getCommandRecordOrBuilderList() {
        return this.commandRecord_;
    }

    public SourceCommandRecord getFileSourceRecord(int i) {
        return this.fileSourceRecord_.get(i);
    }

    public int getFileSourceRecordCount() {
        return this.fileSourceRecord_.size();
    }

    public List<SourceCommandRecord> getFileSourceRecordList() {
        return this.fileSourceRecord_;
    }

    public InterfaceC3131g1 getFileSourceRecordOrBuilder(int i) {
        return this.fileSourceRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getFileSourceRecordOrBuilderList() {
        return this.fileSourceRecord_;
    }

    public SourceCommandRecord getGeometrySourceRecord(int i) {
        return this.geometrySourceRecord_.get(i);
    }

    public int getGeometrySourceRecordCount() {
        return this.geometrySourceRecord_.size();
    }

    public List<SourceCommandRecord> getGeometrySourceRecordList() {
        return this.geometrySourceRecord_;
    }

    public InterfaceC3131g1 getGeometrySourceRecordOrBuilder(int i) {
        return this.geometrySourceRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getGeometrySourceRecordOrBuilderList() {
        return this.geometrySourceRecord_;
    }

    public SourceCommandRecord getMatrixSourceRecord(int i) {
        return this.matrixSourceRecord_.get(i);
    }

    public int getMatrixSourceRecordCount() {
        return this.matrixSourceRecord_.size();
    }

    public List<SourceCommandRecord> getMatrixSourceRecordList() {
        return this.matrixSourceRecord_;
    }

    public InterfaceC3131g1 getMatrixSourceRecordOrBuilder(int i) {
        return this.matrixSourceRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getMatrixSourceRecordOrBuilderList() {
        return this.matrixSourceRecord_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyRouterRecord$RouterRecord> getParserForType() {
        return f5404b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.commandRecord_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.commandRecord_.get(i8));
        }
        for (int i9 = 0; i9 < this.audioRecord_.size(); i9++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.audioRecord_.get(i9));
        }
        for (int i10 = 0; i10 < this.touchSourceRecord_.size(); i10++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.touchSourceRecord_.get(i10));
        }
        for (int i11 = 0; i11 < this.matrixSourceRecord_.size(); i11++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.matrixSourceRecord_.get(i11));
        }
        for (int i12 = 0; i12 < this.fileSourceRecord_.size(); i12++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.fileSourceRecord_.get(i12));
        }
        for (int i13 = 0; i13 < this.textSourceRecord_.size(); i13++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(6, this.textSourceRecord_.get(i13));
        }
        for (int i14 = 0; i14 < this.geometrySourceRecord_.size(); i14++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(7, this.geometrySourceRecord_.get(i14));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public SourceCommandRecord getTextSourceRecord(int i) {
        return this.textSourceRecord_.get(i);
    }

    public int getTextSourceRecordCount() {
        return this.textSourceRecord_.size();
    }

    public List<SourceCommandRecord> getTextSourceRecordList() {
        return this.textSourceRecord_;
    }

    public InterfaceC3131g1 getTextSourceRecordOrBuilder(int i) {
        return this.textSourceRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getTextSourceRecordOrBuilderList() {
        return this.textSourceRecord_;
    }

    public SourceCommandRecord getTouchSourceRecord(int i) {
        return this.touchSourceRecord_.get(i);
    }

    public int getTouchSourceRecordCount() {
        return this.touchSourceRecord_.size();
    }

    public List<SourceCommandRecord> getTouchSourceRecordList() {
        return this.touchSourceRecord_;
    }

    public InterfaceC3131g1 getTouchSourceRecordOrBuilder(int i) {
        return this.touchSourceRecord_.get(i);
    }

    public List<? extends InterfaceC3131g1> getTouchSourceRecordOrBuilderList() {
        return this.touchSourceRecord_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getCommandRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getCommandRecordList().hashCode();
        }
        if (getAudioRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getAudioRecordList().hashCode();
        }
        if (getTouchSourceRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 3, 53) + getTouchSourceRecordList().hashCode();
        }
        if (getMatrixSourceRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 4, 53) + getMatrixSourceRecordList().hashCode();
        }
        if (getFileSourceRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 5, 53) + getFileSourceRecordList().hashCode();
        }
        if (getTextSourceRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 6, 53) + getTextSourceRecordList().hashCode();
        }
        if (getGeometrySourceRecordCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 7, 53) + getGeometrySourceRecordList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3134h1.f1608b.ensureFieldAccessorsInitialized(EzyRouterRecord$RouterRecord.class, C4365f0.class);
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
        return new EzyRouterRecord$RouterRecord();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.commandRecord_.size(); i++) {
            codedOutputStream.writeMessage(1, this.commandRecord_.get(i));
        }
        for (int i8 = 0; i8 < this.audioRecord_.size(); i8++) {
            codedOutputStream.writeMessage(2, this.audioRecord_.get(i8));
        }
        for (int i9 = 0; i9 < this.touchSourceRecord_.size(); i9++) {
            codedOutputStream.writeMessage(3, this.touchSourceRecord_.get(i9));
        }
        for (int i10 = 0; i10 < this.matrixSourceRecord_.size(); i10++) {
            codedOutputStream.writeMessage(4, this.matrixSourceRecord_.get(i10));
        }
        for (int i11 = 0; i11 < this.fileSourceRecord_.size(); i11++) {
            codedOutputStream.writeMessage(5, this.fileSourceRecord_.get(i11));
        }
        for (int i12 = 0; i12 < this.textSourceRecord_.size(); i12++) {
            codedOutputStream.writeMessage(6, this.textSourceRecord_.get(i12));
        }
        for (int i13 = 0; i13 < this.geometrySourceRecord_.size(); i13++) {
            codedOutputStream.writeMessage(7, this.geometrySourceRecord_.get(i13));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4365f0 newBuilder(EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecord) {
        C4365f0 builder = f5403a.toBuilder();
        builder.m3739m(ezyRouterRecord$RouterRecord);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRouterRecord$RouterRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyRouterRecord$RouterRecord) f5404b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzyRouterRecord$RouterRecord() {
        this.memoizedIsInitialized = (byte) -1;
        List<SourceCommandRecord> list = Collections.EMPTY_LIST;
        this.commandRecord_ = list;
        this.audioRecord_ = list;
        this.touchSourceRecord_ = list;
        this.matrixSourceRecord_ = list;
        this.fileSourceRecord_ = list;
        this.textSourceRecord_ = list;
        this.geometrySourceRecord_ = list;
    }

    public static EzyRouterRecord$RouterRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyRouterRecord$RouterRecord) GeneratedMessageV3.parseDelimitedWithIOException(f5404b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRouterRecord$RouterRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyRouterRecord$RouterRecord) f5404b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyRouterRecord$RouterRecord getDefaultInstanceForType() {
        return f5403a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4365f0 toBuilder() {
        if (this == f5403a) {
            return new C4365f0();
        }
        C4365f0 c4365f0 = new C4365f0();
        c4365f0.m3739m(this);
        return c4365f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRouterRecord$RouterRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyRouterRecord$RouterRecord) f5404b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4365f0 newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRouterRecord$RouterRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyRouterRecord$RouterRecord) f5404b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4365f0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4365f0 c4365f0 = new C4365f0(builderParent);
        List list = Collections.EMPTY_LIST;
        c4365f0.f5483b = list;
        c4365f0.f5485d = list;
        c4365f0.f5487f = list;
        c4365f0.f5489h = list;
        c4365f0.f5491j = list;
        c4365f0.f5493l = list;
        c4365f0.f5495n = list;
        return c4365f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyRouterRecord$RouterRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyRouterRecord$RouterRecord) f5404b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyRouterRecord$RouterRecord parseFrom(InputStream inputStream) throws IOException {
        return (EzyRouterRecord$RouterRecord) GeneratedMessageV3.parseWithIOException(f5404b, inputStream);
    }

    public static EzyRouterRecord$RouterRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyRouterRecord$RouterRecord) GeneratedMessageV3.parseWithIOException(f5404b, inputStream, extensionRegistryLite);
    }

    public static EzyRouterRecord$RouterRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyRouterRecord$RouterRecord) GeneratedMessageV3.parseWithIOException(f5404b, codedInputStream);
    }

    public static EzyRouterRecord$RouterRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyRouterRecord$RouterRecord) GeneratedMessageV3.parseWithIOException(f5404b, codedInputStream, extensionRegistryLite);
    }
}

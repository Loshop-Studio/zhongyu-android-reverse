package com.zykj.sketch;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.AnyProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class GraphSnapshot {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_File_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_File_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GraphData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GraphData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PointF_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PointF_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_RectF_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RectF_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Touch_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Touch_fieldAccessorTable;

    public static final class File extends GeneratedMessageV3 implements FileOrBuilder {
        public static final int FILENAME_FIELD_NUMBER = 1;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        public static final int POSITIONFLAG_FIELD_NUMBER = 6;
        public static final int VIEWHEIGHT_FIELD_NUMBER = 5;
        public static final int VIEWWIDTH_FIELD_NUMBER = 4;
        public static final int WIDTH_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object fileName_;
        private int height_;
        private byte memoizedIsInitialized;
        private int positionFlag_;
        private int viewHeight_;
        private int viewWidth_;
        private int width_;
        private static final File DEFAULT_INSTANCE = new File();
        private static final Parser<File> PARSER = new AbstractParser<File>() { // from class: com.zykj.sketch.GraphSnapshot.File.1
            @Override // com.google.protobuf.Parser
            public File parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new File(codedInputStream, extensionRegistryLite);
            }
        };

        public static File getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GraphSnapshot.internal_static_File_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static File parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static File parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<File> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof File)) {
                return super.equals(obj);
            }
            File file = (File) obj;
            return getFileName().equals(file.getFileName()) && getWidth() == file.getWidth() && getHeight() == file.getHeight() && getViewWidth() == file.getViewWidth() && getViewHeight() == file.getViewHeight() && getPositionFlag() == file.getPositionFlag();
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fileName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<File> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public int getPositionFlag() {
            return this.positionFlag_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !getFileNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.fileName_) : 0;
            int i8 = this.width_;
            if (i8 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(2, i8);
            }
            int i9 = this.height_;
            if (i9 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(3, i9);
            }
            int i10 = this.viewWidth_;
            if (i10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(4, i10);
            }
            int i11 = this.viewHeight_;
            if (i11 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(5, i11);
            }
            int i12 = this.positionFlag_;
            if (i12 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(6, i12);
            }
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public int getViewHeight() {
            return this.viewHeight_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public int getViewWidth() {
            return this.viewWidth_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getPositionFlag() + ((((getViewHeight() + ((((getViewWidth() + ((((getHeight() + ((((getWidth() + ((((getFileName().hashCode() + ((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GraphSnapshot.internal_static_File_fieldAccessorTable.ensureFieldAccessorsInitialized(File.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getFileNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileName_);
            }
            int i = this.width_;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            int i8 = this.height_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(3, i8);
            }
            int i9 = this.viewWidth_;
            if (i9 != 0) {
                codedOutputStream.writeInt32(4, i9);
            }
            int i10 = this.viewHeight_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(5, i10);
            }
            int i11 = this.positionFlag_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(6, i11);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileOrBuilder {
            private Object fileName_;
            private int height_;
            private int positionFlag_;
            private int viewHeight_;
            private int viewWidth_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GraphSnapshot.internal_static_File_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearFileName() {
                this.fileName_ = File.getDefaultInstance().getFileName();
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPositionFlag() {
                this.positionFlag_ = 0;
                onChanged();
                return this;
            }

            public Builder clearViewHeight() {
                this.viewHeight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearViewWidth() {
                this.viewWidth_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GraphSnapshot.internal_static_File_descriptor;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fileName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public int getPositionFlag() {
                return this.positionFlag_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public int getViewHeight() {
                return this.viewHeight_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public int getViewWidth() {
                return this.viewWidth_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.FileOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GraphSnapshot.internal_static_File_fieldAccessorTable.ensureFieldAccessorsInitialized(File.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fileName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHeight(int i) {
                this.height_ = i;
                onChanged();
                return this;
            }

            public Builder setPositionFlag(int i) {
                this.positionFlag_ = i;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setViewHeight(int i) {
                this.viewHeight_ = i;
                onChanged();
                return this;
            }

            public Builder setViewWidth(int i) {
                this.viewWidth_ = i;
                onChanged();
                return this;
            }

            public Builder setWidth(int i) {
                this.width_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                this.fileName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public File build() {
                File fileBuildPartial = buildPartial();
                if (fileBuildPartial.isInitialized()) {
                    return fileBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public File buildPartial() {
                File file = new File(this);
                file.fileName_ = this.fileName_;
                file.width_ = this.width_;
                file.height_ = this.height_;
                file.viewWidth_ = this.viewWidth_;
                file.viewHeight_ = this.viewHeight_;
                file.positionFlag_ = this.positionFlag_;
                onBuilt();
                return file;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public File getDefaultInstanceForType() {
                return File.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.fileName_ = "";
                this.width_ = 0;
                this.height_ = 0;
                this.viewWidth_ = 0;
                this.viewHeight_ = 0;
                this.positionFlag_ = 0;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fileName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo13724clone() {
                return (Builder) super.mo13724clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof File) {
                    return mergeFrom((File) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(File file) {
                if (file == File.getDefaultInstance()) {
                    return this;
                }
                if (!file.getFileName().isEmpty()) {
                    this.fileName_ = file.fileName_;
                    onChanged();
                }
                if (file.getWidth() != 0) {
                    setWidth(file.getWidth());
                }
                if (file.getHeight() != 0) {
                    setHeight(file.getHeight());
                }
                if (file.getViewWidth() != 0) {
                    setViewWidth(file.getViewWidth());
                }
                if (file.getViewHeight() != 0) {
                    setViewHeight(file.getViewHeight());
                }
                if (file.getPositionFlag() != 0) {
                    setPositionFlag(file.getPositionFlag());
                }
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.GraphSnapshot.File.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.GraphSnapshot.File.access$5400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.GraphSnapshot$File r3 = (com.zykj.sketch.GraphSnapshot.File) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.sketch.GraphSnapshot$File r4 = (com.zykj.sketch.GraphSnapshot.File) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.GraphSnapshot.File.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.GraphSnapshot$File$Builder"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/GraphSnapshot$File$Builder.smali:958
            }
        }

        public static Builder newBuilder(File file) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
        }

        public static File parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private File(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static File parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public File getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static File parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private File() {
            this.memoizedIsInitialized = (byte) -1;
            this.fileName_ = "";
            this.width_ = 0;
            this.height_ = 0;
            this.viewWidth_ = 0;
            this.viewHeight_ = 0;
            this.positionFlag_ = 0;
        }

        public static File parseFrom(InputStream inputStream) throws IOException {
            return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static File parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static File parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static File parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private File(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z8 = false;
            while (!z8) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.fileName_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 16) {
                                this.width_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.height_ = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.viewWidth_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.viewHeight_ = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.positionFlag_ = codedInputStream.readInt32();
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e4) {
                        throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }
    }

    public interface FileOrBuilder extends MessageOrBuilder {
        String getFileName();

        ByteString getFileNameBytes();

        int getHeight();

        int getPositionFlag();

        int getViewHeight();

        int getViewWidth();

        int getWidth();
    }

    public static final class GraphData extends GeneratedMessageV3 implements GraphDataOrBuilder {
        public static final int CHILDEXTENDMATRIX_FIELD_NUMBER = 4;
        public static final int CHILDGRAPH_FIELD_NUMBER = 2;
        public static final int COLOR_FIELD_NUMBER = 7;
        public static final int EXTRA_FIELD_NUMBER = 10;
        public static final int GRAPHTYPE_FIELD_NUMBER = 1;
        public static final int ISSELECT_FIELD_NUMBER = 8;
        public static final int MATRIX_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 11;
        public static final int OUTRECT_FIELD_NUMBER = 12;
        public static final int SHOWDELETE_FIELD_NUMBER = 9;
        public static final int WIDTH_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int childExtendMatrixMemoizedSerializedSize;
        private List<Float> childExtendMatrix_;
        private List<GraphData> childGraph_;
        private int color_;
        private Any extra_;
        private int graphType_;
        private boolean isSelect_;
        private int matrixMemoizedSerializedSize;
        private List<Float> matrix_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private RectF outRect_;
        private boolean showDelete_;
        private float width_;
        private static final GraphData DEFAULT_INSTANCE = new GraphData();
        private static final Parser<GraphData> PARSER = new AbstractParser<GraphData>() { // from class: com.zykj.sketch.GraphSnapshot.GraphData.1
            @Override // com.google.protobuf.Parser
            public GraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new GraphData(codedInputStream, extensionRegistryLite);
            }
        };

        public static GraphData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GraphSnapshot.internal_static_GraphData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GraphData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GraphData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GraphData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<GraphData> parser() {
            return PARSER;
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
            boolean z8 = this.graphType_ == graphData.graphType_ && getChildGraphList().equals(graphData.getChildGraphList()) && getMatrixList().equals(graphData.getMatrixList()) && getChildExtendMatrixList().equals(graphData.getChildExtendMatrixList()) && Float.floatToIntBits(getWidth()) == Float.floatToIntBits(graphData.getWidth()) && getColor() == graphData.getColor() && getIsSelect() == graphData.getIsSelect() && getShowDelete() == graphData.getShowDelete() && hasExtra() == graphData.hasExtra();
            if (hasExtra()) {
                z8 = z8 && getExtra().equals(graphData.getExtra());
            }
            boolean z9 = (z8 && getName().equals(graphData.getName())) && hasOutRect() == graphData.hasOutRect();
            return hasOutRect() ? z9 && getOutRect().equals(graphData.getOutRect()) : z9;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public float getChildExtendMatrix(int i) {
            return this.childExtendMatrix_.get(i).floatValue();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public int getChildExtendMatrixCount() {
            return this.childExtendMatrix_.size();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public List<Float> getChildExtendMatrixList() {
            return this.childExtendMatrix_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public GraphData getChildGraph(int i) {
            return this.childGraph_.get(i);
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public int getChildGraphCount() {
            return this.childGraph_.size();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public List<GraphData> getChildGraphList() {
            return this.childGraph_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public GraphDataOrBuilder getChildGraphOrBuilder(int i) {
            return this.childGraph_.get(i);
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public List<? extends GraphDataOrBuilder> getChildGraphOrBuilderList() {
            return this.childGraph_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public int getColor() {
            return this.color_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public Any getExtra() {
            Any any = this.extra_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public AnyOrBuilder getExtraOrBuilder() {
            return getExtra();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public GraphType getGraphType() {
            GraphType graphTypeValueOf = GraphType.valueOf(this.graphType_);
            return graphTypeValueOf == null ? GraphType.UNRECOGNIZED : graphTypeValueOf;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public int getGraphTypeValue() {
            return this.graphType_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public boolean getIsSelect() {
            return this.isSelect_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public float getMatrix(int i) {
            return this.matrix_.get(i).floatValue();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public int getMatrixCount() {
            return this.matrix_.size();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public List<Float> getMatrixList() {
            return this.matrix_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public RectF getOutRect() {
            RectF rectF = this.outRect_;
            return rectF == null ? RectF.getDefaultInstance() : rectF;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public RectFOrBuilder getOutRectOrBuilder() {
            return getOutRect();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GraphData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = this.graphType_ != GraphType.UNBOUNDED_CONTAINER_GRAPH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.graphType_) : 0;
            for (int i8 = 0; i8 < this.childGraph_.size(); i8++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.childGraph_.get(i8));
            }
            int size = getMatrixList().size() * 4;
            int iComputeInt32SizeNoTag = iComputeEnumSize + size;
            if (!getMatrixList().isEmpty()) {
                iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + CodedOutputStream.computeInt32SizeNoTag(size);
            }
            this.matrixMemoizedSerializedSize = size;
            int size2 = getChildExtendMatrixList().size() * 4;
            int iComputeMessageSize = iComputeInt32SizeNoTag + size2;
            if (!getChildExtendMatrixList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(size2);
            }
            this.childExtendMatrixMemoizedSerializedSize = size2;
            float f = this.width_;
            if (f != 0.0f) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(6, f);
            }
            int i9 = this.color_;
            if (i9 != 0) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(7, i9);
            }
            boolean z8 = this.isSelect_;
            if (z8) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(8, z8);
            }
            boolean z9 = this.showDelete_;
            if (z9) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(9, z9);
            }
            if (this.extra_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getExtra());
            }
            if (!getNameBytes().isEmpty()) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(11, this.name_);
            }
            if (this.outRect_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getOutRect());
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public boolean getShowDelete() {
            return this.showDelete_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public float getWidth() {
            return this.width_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public boolean hasExtra() {
            return this.extra_ != null;
        }

        @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
        public boolean hasOutRect() {
            return this.outRect_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + this.graphType_;
            if (getChildGraphCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 2, 53) + getChildGraphList().hashCode();
            }
            if (getMatrixCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 3, 53) + getMatrixList().hashCode();
            }
            if (getChildExtendMatrixCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 4, 53) + getChildExtendMatrixList().hashCode();
            }
            int iHashBoolean = Internal.hashBoolean(getShowDelete()) + ((((Internal.hashBoolean(getIsSelect()) + ((((getColor() + ((((Float.floatToIntBits(getWidth()) + AbstractC1923c.m1038b(iHashCode, 37, 6, 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53);
            if (hasExtra()) {
                iHashBoolean = AbstractC1923c.m1038b(iHashBoolean, 37, 10, 53) + getExtra().hashCode();
            }
            int iHashCode2 = getName().hashCode() + AbstractC1923c.m1038b(iHashBoolean, 37, 11, 53);
            if (hasOutRect()) {
                iHashCode2 = getOutRect().hashCode() + AbstractC1923c.m1038b(iHashCode2, 37, 12, 53);
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GraphSnapshot.internal_static_GraphData_fieldAccessorTable.ensureFieldAccessorsInitialized(GraphData.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (this.graphType_ != GraphType.UNBOUNDED_CONTAINER_GRAPH.getNumber()) {
                codedOutputStream.writeEnum(1, this.graphType_);
            }
            for (int i = 0; i < this.childGraph_.size(); i++) {
                codedOutputStream.writeMessage(2, this.childGraph_.get(i));
            }
            if (getMatrixList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.matrixMemoizedSerializedSize);
            }
            for (int i8 = 0; i8 < this.matrix_.size(); i8++) {
                codedOutputStream.writeFloatNoTag(this.matrix_.get(i8).floatValue());
            }
            if (getChildExtendMatrixList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(34);
                codedOutputStream.writeUInt32NoTag(this.childExtendMatrixMemoizedSerializedSize);
            }
            for (int i9 = 0; i9 < this.childExtendMatrix_.size(); i9++) {
                codedOutputStream.writeFloatNoTag(this.childExtendMatrix_.get(i9).floatValue());
            }
            float f = this.width_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(6, f);
            }
            int i10 = this.color_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(7, i10);
            }
            boolean z8 = this.isSelect_;
            if (z8) {
                codedOutputStream.writeBool(8, z8);
            }
            boolean z9 = this.showDelete_;
            if (z9) {
                codedOutputStream.writeBool(9, z9);
            }
            if (this.extra_ != null) {
                codedOutputStream.writeMessage(10, getExtra());
            }
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.name_);
            }
            if (this.outRect_ != null) {
                codedOutputStream.writeMessage(12, getOutRect());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GraphDataOrBuilder {
            private int bitField0_;
            private List<Float> childExtendMatrix_;
            private RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> childGraphBuilder_;
            private List<GraphData> childGraph_;
            private int color_;
            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extraBuilder_;
            private Any extra_;
            private int graphType_;
            private boolean isSelect_;
            private List<Float> matrix_;
            private Object name_;
            private SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> outRectBuilder_;
            private RectF outRect_;
            private boolean showDelete_;
            private float width_;

            private void ensureChildExtendMatrixIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.childExtendMatrix_ = new ArrayList(this.childExtendMatrix_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureChildGraphIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.childGraph_ = new ArrayList(this.childGraph_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureMatrixIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.matrix_ = new ArrayList(this.matrix_);
                    this.bitField0_ |= 4;
                }
            }

            private RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> getChildGraphFieldBuilder() {
                if (this.childGraphBuilder_ == null) {
                    this.childGraphBuilder_ = new RepeatedFieldBuilderV3<>(this.childGraph_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.childGraph_ = null;
                }
                return this.childGraphBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GraphSnapshot.internal_static_GraphData_descriptor;
            }

            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtraFieldBuilder() {
                if (this.extraBuilder_ == null) {
                    this.extraBuilder_ = new SingleFieldBuilderV3<>(getExtra(), getParentForChildren(), isClean());
                    this.extra_ = null;
                }
                return this.extraBuilder_;
            }

            private SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> getOutRectFieldBuilder() {
                if (this.outRectBuilder_ == null) {
                    this.outRectBuilder_ = new SingleFieldBuilderV3<>(getOutRect(), getParentForChildren(), isClean());
                    this.outRect_ = null;
                }
                return this.outRectBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getChildGraphFieldBuilder();
                }
            }

            public Builder addAllChildExtendMatrix(Iterable<? extends Float> iterable) {
                ensureChildExtendMatrixIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.childExtendMatrix_);
                onChanged();
                return this;
            }

            public Builder addAllChildGraph(Iterable<? extends GraphData> iterable) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureChildGraphIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.childGraph_);
                onChanged();
                return this;
            }

            public Builder addAllMatrix(Iterable<? extends Float> iterable) {
                ensureMatrixIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.matrix_);
                onChanged();
                return this;
            }

            public Builder addChildExtendMatrix(float f) {
                ensureChildExtendMatrixIsMutable();
                this.childExtendMatrix_.add(Float.valueOf(f));
                onChanged();
                return this;
            }

            public Builder addChildGraph(GraphData graphData) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(graphData);
                    return this;
                }
                graphData.getClass();
                ensureChildGraphIsMutable();
                this.childGraph_.add(graphData);
                onChanged();
                return this;
            }

            public Builder addChildGraphBuilder() {
                return (Builder) getChildGraphFieldBuilder().addBuilder(GraphData.getDefaultInstance());
            }

            public Builder addMatrix(float f) {
                ensureMatrixIsMutable();
                this.matrix_.add(Float.valueOf(f));
                onChanged();
                return this;
            }

            public Builder clearChildExtendMatrix() {
                this.childExtendMatrix_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearChildGraph() {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.childGraph_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearColor() {
                this.color_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExtra() {
                if (this.extraBuilder_ == null) {
                    this.extra_ = null;
                    onChanged();
                    return this;
                }
                this.extra_ = null;
                this.extraBuilder_ = null;
                return this;
            }

            public Builder clearGraphType() {
                this.graphType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsSelect() {
                this.isSelect_ = false;
                onChanged();
                return this;
            }

            public Builder clearMatrix() {
                this.matrix_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = GraphData.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearOutRect() {
                if (this.outRectBuilder_ == null) {
                    this.outRect_ = null;
                    onChanged();
                    return this;
                }
                this.outRect_ = null;
                this.outRectBuilder_ = null;
                return this;
            }

            public Builder clearShowDelete() {
                this.showDelete_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public float getChildExtendMatrix(int i) {
                return this.childExtendMatrix_.get(i).floatValue();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public int getChildExtendMatrixCount() {
                return this.childExtendMatrix_.size();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public List<Float> getChildExtendMatrixList() {
                return Collections.unmodifiableList(this.childExtendMatrix_);
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public GraphData getChildGraph(int i) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                return repeatedFieldBuilderV3 == null ? this.childGraph_.get(i) : (GraphData) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder getChildGraphBuilder(int i) {
                return (Builder) getChildGraphFieldBuilder().getBuilder(i);
            }

            public List<Builder> getChildGraphBuilderList() {
                return getChildGraphFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public int getChildGraphCount() {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                return repeatedFieldBuilderV3 == null ? this.childGraph_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public List<GraphData> getChildGraphList() {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.childGraph_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public GraphDataOrBuilder getChildGraphOrBuilder(int i) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                return repeatedFieldBuilderV3 == null ? this.childGraph_.get(i) : (GraphDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public List<? extends GraphDataOrBuilder> getChildGraphOrBuilderList() {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.childGraph_);
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public int getColor() {
                return this.color_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GraphSnapshot.internal_static_GraphData_descriptor;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public Any getExtra() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.extraBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Any) singleFieldBuilderV3.getMessage();
                }
                Any any = this.extra_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any.Builder getExtraBuilder() {
                onChanged();
                return (Any.Builder) getExtraFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public AnyOrBuilder getExtraOrBuilder() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.extraBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AnyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Any any = this.extra_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public GraphType getGraphType() {
                GraphType graphTypeValueOf = GraphType.valueOf(this.graphType_);
                return graphTypeValueOf == null ? GraphType.UNRECOGNIZED : graphTypeValueOf;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public int getGraphTypeValue() {
                return this.graphType_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public boolean getIsSelect() {
                return this.isSelect_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public float getMatrix(int i) {
                return this.matrix_.get(i).floatValue();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public int getMatrixCount() {
                return this.matrix_.size();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public List<Float> getMatrixList() {
                return Collections.unmodifiableList(this.matrix_);
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public RectF getOutRect() {
                SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> singleFieldBuilderV3 = this.outRectBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RectF) singleFieldBuilderV3.getMessage();
                }
                RectF rectF = this.outRect_;
                return rectF == null ? RectF.getDefaultInstance() : rectF;
            }

            public RectF.Builder getOutRectBuilder() {
                onChanged();
                return (RectF.Builder) getOutRectFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public RectFOrBuilder getOutRectOrBuilder() {
                SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> singleFieldBuilderV3 = this.outRectBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RectFOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RectF rectF = this.outRect_;
                return rectF == null ? RectF.getDefaultInstance() : rectF;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public boolean getShowDelete() {
                return this.showDelete_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public float getWidth() {
                return this.width_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public boolean hasExtra() {
                return (this.extraBuilder_ == null && this.extra_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.GraphSnapshot.GraphDataOrBuilder
            public boolean hasOutRect() {
                return (this.outRectBuilder_ == null && this.outRect_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GraphSnapshot.internal_static_GraphData_fieldAccessorTable.ensureFieldAccessorsInitialized(GraphData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExtra(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.extraBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(any);
                    return this;
                }
                Any any2 = this.extra_;
                if (any2 != null) {
                    this.extra_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.extra_ = any;
                }
                onChanged();
                return this;
            }

            public Builder mergeOutRect(RectF rectF) {
                SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> singleFieldBuilderV3 = this.outRectBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rectF);
                    return this;
                }
                RectF rectF2 = this.outRect_;
                if (rectF2 != null) {
                    this.outRect_ = RectF.newBuilder(rectF2).mergeFrom(rectF).buildPartial();
                } else {
                    this.outRect_ = rectF;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removeChildGraph(int i) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i);
                    return this;
                }
                ensureChildGraphIsMutable();
                this.childGraph_.remove(i);
                onChanged();
                return this;
            }

            public Builder setChildExtendMatrix(int i, float f) {
                ensureChildExtendMatrixIsMutable();
                this.childExtendMatrix_.set(i, Float.valueOf(f));
                onChanged();
                return this;
            }

            public Builder setChildGraph(int i, GraphData graphData) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, graphData);
                    return this;
                }
                graphData.getClass();
                ensureChildGraphIsMutable();
                this.childGraph_.set(i, graphData);
                onChanged();
                return this;
            }

            public Builder setColor(int i) {
                this.color_ = i;
                onChanged();
                return this;
            }

            public Builder setExtra(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.extraBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(any);
                    return this;
                }
                any.getClass();
                this.extra_ = any;
                onChanged();
                return this;
            }

            public Builder setGraphType(GraphType graphType) {
                graphType.getClass();
                this.graphType_ = graphType.getNumber();
                onChanged();
                return this;
            }

            public Builder setGraphTypeValue(int i) {
                this.graphType_ = i;
                onChanged();
                return this;
            }

            public Builder setIsSelect(boolean z8) {
                this.isSelect_ = z8;
                onChanged();
                return this;
            }

            public Builder setMatrix(int i, float f) {
                ensureMatrixIsMutable();
                this.matrix_.set(i, Float.valueOf(f));
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOutRect(RectF rectF) {
                SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> singleFieldBuilderV3 = this.outRectBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(rectF);
                    return this;
                }
                rectF.getClass();
                this.outRect_ = rectF;
                onChanged();
                return this;
            }

            public Builder setShowDelete(boolean z8) {
                this.showDelete_ = z8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setWidth(float f) {
                this.width_ = f;
                onChanged();
                return this;
            }

            private Builder() {
                this.graphType_ = 0;
                List list = Collections.EMPTY_LIST;
                this.childGraph_ = list;
                this.matrix_ = list;
                this.childExtendMatrix_ = list;
                this.extra_ = null;
                this.name_ = "";
                this.outRect_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GraphData build() {
                GraphData graphDataBuildPartial = buildPartial();
                if (graphDataBuildPartial.isInitialized()) {
                    return graphDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GraphData buildPartial() {
                GraphData graphData = new GraphData(this);
                graphData.graphType_ = this.graphType_;
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    graphData.childGraph_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 2) == 2) {
                        this.childGraph_ = Collections.unmodifiableList(this.childGraph_);
                        this.bitField0_ &= -3;
                    }
                    graphData.childGraph_ = this.childGraph_;
                }
                if ((this.bitField0_ & 4) == 4) {
                    this.matrix_ = Collections.unmodifiableList(this.matrix_);
                    this.bitField0_ &= -5;
                }
                graphData.matrix_ = this.matrix_;
                if ((this.bitField0_ & 8) == 8) {
                    this.childExtendMatrix_ = Collections.unmodifiableList(this.childExtendMatrix_);
                    this.bitField0_ &= -9;
                }
                graphData.childExtendMatrix_ = this.childExtendMatrix_;
                graphData.width_ = this.width_;
                graphData.color_ = this.color_;
                graphData.isSelect_ = this.isSelect_;
                graphData.showDelete_ = this.showDelete_;
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.extraBuilder_;
                if (singleFieldBuilderV3 == null) {
                    graphData.extra_ = this.extra_;
                } else {
                    graphData.extra_ = (Any) singleFieldBuilderV3.build();
                }
                graphData.name_ = this.name_;
                SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> singleFieldBuilderV32 = this.outRectBuilder_;
                if (singleFieldBuilderV32 == null) {
                    graphData.outRect_ = this.outRect_;
                } else {
                    graphData.outRect_ = (RectF) singleFieldBuilderV32.build();
                }
                graphData.bitField0_ = 0;
                onBuilt();
                return graphData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphData getDefaultInstanceForType() {
                return GraphData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addChildGraphBuilder(int i) {
                return (Builder) getChildGraphFieldBuilder().addBuilder(i, GraphData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.graphType_ = 0;
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.childGraph_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                List<Float> list = Collections.EMPTY_LIST;
                this.matrix_ = list;
                int i = this.bitField0_;
                this.childExtendMatrix_ = list;
                this.bitField0_ = i & (-13);
                this.width_ = 0.0f;
                this.color_ = 0;
                this.isSelect_ = false;
                this.showDelete_ = false;
                if (this.extraBuilder_ == null) {
                    this.extra_ = null;
                } else {
                    this.extra_ = null;
                    this.extraBuilder_ = null;
                }
                this.name_ = "";
                if (this.outRectBuilder_ == null) {
                    this.outRect_ = null;
                    return this;
                }
                this.outRect_ = null;
                this.outRectBuilder_ = null;
                return this;
            }

            public Builder setExtra(Any.Builder builder) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.extraBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.extra_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setOutRect(RectF.Builder builder) {
                SingleFieldBuilderV3<RectF, RectF.Builder, RectFOrBuilder> singleFieldBuilderV3 = this.outRectBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.outRect_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder addChildGraph(int i, GraphData graphData) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    graphData.getClass();
                    ensureChildGraphIsMutable();
                    this.childGraph_.add(i, graphData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i, graphData);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo13724clone() {
                return (Builder) super.mo13724clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GraphData) {
                    return mergeFrom((GraphData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setChildGraph(int i, Builder builder) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureChildGraphIsMutable();
                    this.childGraph_.set(i, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i, builder.build());
                return this;
            }

            public Builder mergeFrom(GraphData graphData) {
                if (graphData == GraphData.getDefaultInstance()) {
                    return this;
                }
                if (graphData.graphType_ != 0) {
                    setGraphTypeValue(graphData.getGraphTypeValue());
                }
                if (this.childGraphBuilder_ == null) {
                    if (!graphData.childGraph_.isEmpty()) {
                        if (this.childGraph_.isEmpty()) {
                            this.childGraph_ = graphData.childGraph_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureChildGraphIsMutable();
                            this.childGraph_.addAll(graphData.childGraph_);
                        }
                        onChanged();
                    }
                } else if (!graphData.childGraph_.isEmpty()) {
                    if (!this.childGraphBuilder_.isEmpty()) {
                        this.childGraphBuilder_.addAllMessages(graphData.childGraph_);
                    } else {
                        this.childGraphBuilder_.dispose();
                        this.childGraphBuilder_ = null;
                        this.childGraph_ = graphData.childGraph_;
                        this.bitField0_ &= -3;
                        this.childGraphBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getChildGraphFieldBuilder() : null;
                    }
                }
                if (!graphData.matrix_.isEmpty()) {
                    if (this.matrix_.isEmpty()) {
                        this.matrix_ = graphData.matrix_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureMatrixIsMutable();
                        this.matrix_.addAll(graphData.matrix_);
                    }
                    onChanged();
                }
                if (!graphData.childExtendMatrix_.isEmpty()) {
                    if (this.childExtendMatrix_.isEmpty()) {
                        this.childExtendMatrix_ = graphData.childExtendMatrix_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureChildExtendMatrixIsMutable();
                        this.childExtendMatrix_.addAll(graphData.childExtendMatrix_);
                    }
                    onChanged();
                }
                if (graphData.getWidth() != 0.0f) {
                    setWidth(graphData.getWidth());
                }
                if (graphData.getColor() != 0) {
                    setColor(graphData.getColor());
                }
                if (graphData.getIsSelect()) {
                    setIsSelect(graphData.getIsSelect());
                }
                if (graphData.getShowDelete()) {
                    setShowDelete(graphData.getShowDelete());
                }
                if (graphData.hasExtra()) {
                    mergeExtra(graphData.getExtra());
                }
                if (!graphData.getName().isEmpty()) {
                    this.name_ = graphData.name_;
                    onChanged();
                }
                if (graphData.hasOutRect()) {
                    mergeOutRect(graphData.getOutRect());
                }
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.graphType_ = 0;
                List list = Collections.EMPTY_LIST;
                this.childGraph_ = list;
                this.matrix_ = list;
                this.childExtendMatrix_ = list;
                this.extra_ = null;
                this.name_ = "";
                this.outRect_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder addChildGraph(Builder builder) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureChildGraphIsMutable();
                    this.childGraph_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addChildGraph(int i, Builder builder) {
                RepeatedFieldBuilderV3<GraphData, Builder, GraphDataOrBuilder> repeatedFieldBuilderV3 = this.childGraphBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureChildGraphIsMutable();
                    this.childGraph_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.GraphSnapshot.GraphData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.GraphSnapshot.GraphData.access$1900()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.GraphSnapshot$GraphData r3 = (com.zykj.sketch.GraphSnapshot.GraphData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.sketch.GraphSnapshot$GraphData r4 = (com.zykj.sketch.GraphSnapshot.GraphData) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.GraphSnapshot.GraphData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.GraphSnapshot$GraphData$Builder"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/GraphSnapshot$GraphData$Builder.smali:3162
            }
        }

        public static Builder newBuilder(GraphData graphData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(graphData);
        }

        public static GraphData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GraphData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.matrixMemoizedSerializedSize = -1;
            this.childExtendMatrixMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GraphData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GraphData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GraphData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GraphData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GraphData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GraphData parseFrom(InputStream inputStream) throws IOException {
            return (GraphData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private GraphData() {
            this.matrixMemoizedSerializedSize = -1;
            this.childExtendMatrixMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.graphType_ = 0;
            List list = Collections.EMPTY_LIST;
            this.childGraph_ = list;
            this.matrix_ = list;
            this.childExtendMatrix_ = list;
            this.width_ = 0.0f;
            this.color_ = 0;
            this.isSelect_ = false;
            this.showDelete_ = false;
            this.name_ = "";
        }

        public static GraphData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GraphData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GraphData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GraphData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GraphData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GraphData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        private GraphData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z8 = false;
            char c = 0;
            while (true) {
                ?? SkipField = 2;
                if (!z8) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z8 = true;
                                case 8:
                                    this.graphType_ = codedInputStream.readEnum();
                                case 18:
                                    int i = (c == true ? 1 : 0) & 2;
                                    c = c;
                                    if (i != 2) {
                                        this.childGraph_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 2;
                                    }
                                    this.childGraph_.add((GraphData) codedInputStream.readMessage(parser(), extensionRegistryLite));
                                case 26:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    int i8 = (c == true ? 1 : 0) & 4;
                                    c = c;
                                    if (i8 != 4) {
                                        c = c;
                                        if (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.matrix_ = new ArrayList();
                                            c = (c == true ? 1 : 0) | 4;
                                        }
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.matrix_.add(Float.valueOf(codedInputStream.readFloat()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                    int i9 = (c == true ? 1 : 0) & 4;
                                    c = c;
                                    if (i9 != 4) {
                                        this.matrix_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 4;
                                    }
                                    this.matrix_.add(Float.valueOf(codedInputStream.readFloat()));
                                case 34:
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    int i10 = (c == true ? 1 : 0) & 8;
                                    c = c;
                                    if (i10 != 8) {
                                        c = c;
                                        if (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.childExtendMatrix_ = new ArrayList();
                                            c = (c == true ? 1 : 0) | '\b';
                                        }
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.childExtendMatrix_.add(Float.valueOf(codedInputStream.readFloat()));
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                case 37:
                                    int i11 = (c == true ? 1 : 0) & 8;
                                    c = c;
                                    if (i11 != 8) {
                                        this.childExtendMatrix_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | '\b';
                                    }
                                    this.childExtendMatrix_.add(Float.valueOf(codedInputStream.readFloat()));
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                    this.width_ = codedInputStream.readFloat();
                                case 56:
                                    this.color_ = codedInputStream.readInt32();
                                case 64:
                                    this.isSelect_ = codedInputStream.readBool();
                                case 72:
                                    this.showDelete_ = codedInputStream.readBool();
                                case 82:
                                    Any any = this.extra_;
                                    Any.Builder builder = any != null ? any.toBuilder() : null;
                                    Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                    this.extra_ = any2;
                                    if (builder != null) {
                                        builder.mergeFrom(any2);
                                        this.extra_ = builder.buildPartial();
                                    }
                                case 90:
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                case 98:
                                    RectF rectF = this.outRect_;
                                    RectF.Builder builder2 = rectF != null ? rectF.toBuilder() : null;
                                    RectF rectF2 = (RectF) codedInputStream.readMessage(RectF.parser(), extensionRegistryLite);
                                    this.outRect_ = rectF2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(rectF2);
                                        this.outRect_ = builder2.buildPartial();
                                    }
                                default:
                                    SkipField = codedInputStream.skipField(tag);
                                    if (SkipField == 0) {
                                        z8 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e4) {
                            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & 2) == SkipField) {
                            this.childGraph_ = Collections.unmodifiableList(this.childGraph_);
                        }
                        if (((c == true ? 1 : 0) & 4) == 4) {
                            this.matrix_ = Collections.unmodifiableList(this.matrix_);
                        }
                        if (((c == true ? 1 : 0) & 8) == 8) {
                            this.childExtendMatrix_ = Collections.unmodifiableList(this.childExtendMatrix_);
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } else {
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.childGraph_ = Collections.unmodifiableList(this.childGraph_);
                    }
                    if (((c == true ? 1 : 0) & 4) == 4) {
                        this.matrix_ = Collections.unmodifiableList(this.matrix_);
                    }
                    if (((c == true ? 1 : 0) & 8) == 8) {
                        this.childExtendMatrix_ = Collections.unmodifiableList(this.childExtendMatrix_);
                    }
                    makeExtensionsImmutable();
                    return;
                }
            }
        }
    }

    public interface GraphDataOrBuilder extends MessageOrBuilder {
        float getChildExtendMatrix(int i);

        int getChildExtendMatrixCount();

        List<Float> getChildExtendMatrixList();

        GraphData getChildGraph(int i);

        int getChildGraphCount();

        List<GraphData> getChildGraphList();

        GraphDataOrBuilder getChildGraphOrBuilder(int i);

        List<? extends GraphDataOrBuilder> getChildGraphOrBuilderList();

        int getColor();

        Any getExtra();

        AnyOrBuilder getExtraOrBuilder();

        GraphType getGraphType();

        int getGraphTypeValue();

        boolean getIsSelect();

        float getMatrix(int i);

        int getMatrixCount();

        List<Float> getMatrixList();

        String getName();

        ByteString getNameBytes();

        RectF getOutRect();

        RectFOrBuilder getOutRectOrBuilder();

        boolean getShowDelete();

        float getWidth();

        boolean hasExtra();

        boolean hasOutRect();
    }

    public enum GraphType implements ProtocolMessageEnum {
        UNBOUNDED_CONTAINER_GRAPH(0),
        BOUNDED_CONTAINER_GRAPH(1),
        IMAGE_GRAPH(2),
        WEB_VIEW_GRAPH(3),
        WRITING_GROUP_GRAPH(4),
        STROKE_GRAPH(5),
        SHAPE_GRAPH(6),
        UNRECOGNIZED(-1);

        public static final int BOUNDED_CONTAINER_GRAPH_VALUE = 1;
        public static final int IMAGE_GRAPH_VALUE = 2;
        public static final int SHAPE_GRAPH_VALUE = 6;
        public static final int STROKE_GRAPH_VALUE = 5;
        public static final int UNBOUNDED_CONTAINER_GRAPH_VALUE = 0;
        public static final int WEB_VIEW_GRAPH_VALUE = 3;
        public static final int WRITING_GROUP_GRAPH_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<GraphType> internalValueMap = new Internal.EnumLiteMap<GraphType>() { // from class: com.zykj.sketch.GraphSnapshot.GraphType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public GraphType findValueByNumber(int i) {
                return GraphType.forNumber(i);
            }
        };
        private static final GraphType[] VALUES = values();

        GraphType(int i) {
            this.value = i;
        }

        public static GraphType forNumber(int i) {
            switch (i) {
                case 0:
                    return UNBOUNDED_CONTAINER_GRAPH;
                case 1:
                    return BOUNDED_CONTAINER_GRAPH;
                case 2:
                    return IMAGE_GRAPH;
                case 3:
                    return WEB_VIEW_GRAPH;
                case 4:
                    return WRITING_GROUP_GRAPH;
                case 5:
                    return STROKE_GRAPH;
                case 6:
                    return SHAPE_GRAPH;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GraphSnapshot.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<GraphType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static GraphType valueOf(int i) {
            return forNumber(i);
        }

        public static GraphType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class PointF extends GeneratedMessageV3 implements PointFOrBuilder {
        private static final PointF DEFAULT_INSTANCE = new PointF();
        private static final Parser<PointF> PARSER = new AbstractParser<PointF>() { // from class: com.zykj.sketch.GraphSnapshot.PointF.1
            @Override // com.google.protobuf.Parser
            public PointF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PointF(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        /* renamed from: x_ */
        private float f8140x_;

        /* renamed from: y_ */
        private float f8141y_;

        public static PointF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GraphSnapshot.internal_static_PointF_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PointF parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PointF) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PointF parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<PointF> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PointF)) {
                return super.equals(obj);
            }
            PointF pointF = (PointF) obj;
            return Float.floatToIntBits(getX()) == Float.floatToIntBits(pointF.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(pointF.getY());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PointF> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            float f = this.f8140x_;
            int iComputeFloatSize = f != 0.0f ? CodedOutputStream.computeFloatSize(1, f) : 0;
            float f7 = this.f8141y_;
            if (f7 != 0.0f) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, f7);
            }
            this.memoizedSize = iComputeFloatSize;
            return iComputeFloatSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.GraphSnapshot.PointFOrBuilder
        public float getX() {
            return this.f8140x_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.PointFOrBuilder
        public float getY() {
            return this.f8141y_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Float.floatToIntBits(getY()) + ((((Float.floatToIntBits(getX()) + ((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GraphSnapshot.internal_static_PointF_fieldAccessorTable.ensureFieldAccessorsInitialized(PointF.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.f8140x_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            float f7 = this.f8141y_;
            if (f7 != 0.0f) {
                codedOutputStream.writeFloat(2, f7);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PointFOrBuilder {

            /* renamed from: x_ */
            private float f8142x_;

            /* renamed from: y_ */
            private float f8143y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GraphSnapshot.internal_static_PointF_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearX() {
                this.f8142x_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.f8143y_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GraphSnapshot.internal_static_PointF_descriptor;
            }

            @Override // com.zykj.sketch.GraphSnapshot.PointFOrBuilder
            public float getX() {
                return this.f8142x_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.PointFOrBuilder
            public float getY() {
                return this.f8143y_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GraphSnapshot.internal_static_PointF_fieldAccessorTable.ensureFieldAccessorsInitialized(PointF.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setX(float f) {
                this.f8142x_ = f;
                onChanged();
                return this;
            }

            public Builder setY(float f) {
                this.f8143y_ = f;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PointF build() {
                PointF pointFBuildPartial = buildPartial();
                if (pointFBuildPartial.isInitialized()) {
                    return pointFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PointF buildPartial() {
                PointF pointF = new PointF(this);
                pointF.f8140x_ = this.f8142x_;
                pointF.f8141y_ = this.f8143y_;
                onBuilt();
                return pointF;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PointF getDefaultInstanceForType() {
                return PointF.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.f8142x_ = 0.0f;
                this.f8143y_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo13724clone() {
                return (Builder) super.mo13724clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PointF) {
                    return mergeFrom((PointF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PointF pointF) {
                if (pointF == PointF.getDefaultInstance()) {
                    return this;
                }
                if (pointF.getX() != 0.0f) {
                    setX(pointF.getX());
                }
                if (pointF.getY() != 0.0f) {
                    setY(pointF.getY());
                }
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.GraphSnapshot.PointF.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.GraphSnapshot.PointF.access$3000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.GraphSnapshot$PointF r3 = (com.zykj.sketch.GraphSnapshot.PointF) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.sketch.GraphSnapshot$PointF r4 = (com.zykj.sketch.GraphSnapshot.PointF) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.GraphSnapshot.PointF.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.GraphSnapshot$PointF$Builder"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/GraphSnapshot$PointF$Builder.smali:698
            }
        }

        public static Builder newBuilder(PointF pointF) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pointF);
        }

        public static PointF parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private PointF(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PointF parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointF) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PointF parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PointF getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static PointF parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private PointF() {
            this.memoizedIsInitialized = (byte) -1;
            this.f8140x_ = 0.0f;
            this.f8141y_ = 0.0f;
        }

        public static PointF parseFrom(InputStream inputStream) throws IOException {
            return (PointF) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static PointF parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointF) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private PointF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z8 = false;
            while (!z8) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 13) {
                                this.f8140x_ = codedInputStream.readFloat();
                            } else if (tag != 21) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.f8141y_ = codedInputStream.readFloat();
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e4) {
                        throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static PointF parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PointF) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PointF parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointF) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PointFOrBuilder extends MessageOrBuilder {
        float getX();

        float getY();
    }

    public static final class RectF extends GeneratedMessageV3 implements RectFOrBuilder {
        public static final int BOTTOM_FIELD_NUMBER = 4;
        public static final int LEFT_FIELD_NUMBER = 1;
        public static final int RIGHT_FIELD_NUMBER = 3;
        public static final int TOP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private float bottom_;
        private float left_;
        private byte memoizedIsInitialized;
        private float right_;
        private float top_;
        private static final RectF DEFAULT_INSTANCE = new RectF();
        private static final Parser<RectF> PARSER = new AbstractParser<RectF>() { // from class: com.zykj.sketch.GraphSnapshot.RectF.1
            @Override // com.google.protobuf.Parser
            public RectF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new RectF(codedInputStream, extensionRegistryLite);
            }
        };

        public static RectF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GraphSnapshot.internal_static_RectF_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RectF parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RectF) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RectF parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<RectF> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RectF)) {
                return super.equals(obj);
            }
            RectF rectF = (RectF) obj;
            return Float.floatToIntBits(getLeft()) == Float.floatToIntBits(rectF.getLeft()) && Float.floatToIntBits(getTop()) == Float.floatToIntBits(rectF.getTop()) && Float.floatToIntBits(getRight()) == Float.floatToIntBits(rectF.getRight()) && Float.floatToIntBits(getBottom()) == Float.floatToIntBits(rectF.getBottom());
        }

        @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
        public float getBottom() {
            return this.bottom_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
        public float getLeft() {
            return this.left_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RectF> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
        public float getRight() {
            return this.right_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            float f = this.left_;
            int iComputeFloatSize = f != 0.0f ? CodedOutputStream.computeFloatSize(1, f) : 0;
            float f7 = this.top_;
            if (f7 != 0.0f) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, f7);
            }
            float f8 = this.right_;
            if (f8 != 0.0f) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, f8);
            }
            float f9 = this.bottom_;
            if (f9 != 0.0f) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, f9);
            }
            this.memoizedSize = iComputeFloatSize;
            return iComputeFloatSize;
        }

        @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
        public float getTop() {
            return this.top_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Float.floatToIntBits(getBottom()) + ((((Float.floatToIntBits(getRight()) + ((((Float.floatToIntBits(getTop()) + ((((Float.floatToIntBits(getLeft()) + ((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GraphSnapshot.internal_static_RectF_fieldAccessorTable.ensureFieldAccessorsInitialized(RectF.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.left_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            float f7 = this.top_;
            if (f7 != 0.0f) {
                codedOutputStream.writeFloat(2, f7);
            }
            float f8 = this.right_;
            if (f8 != 0.0f) {
                codedOutputStream.writeFloat(3, f8);
            }
            float f9 = this.bottom_;
            if (f9 != 0.0f) {
                codedOutputStream.writeFloat(4, f9);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RectFOrBuilder {
            private float bottom_;
            private float left_;
            private float right_;
            private float top_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GraphSnapshot.internal_static_RectF_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearBottom() {
                this.bottom_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLeft() {
                this.left_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearRight() {
                this.right_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTop() {
                this.top_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
            public float getBottom() {
                return this.bottom_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GraphSnapshot.internal_static_RectF_descriptor;
            }

            @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
            public float getLeft() {
                return this.left_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
            public float getRight() {
                return this.right_;
            }

            @Override // com.zykj.sketch.GraphSnapshot.RectFOrBuilder
            public float getTop() {
                return this.top_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GraphSnapshot.internal_static_RectF_fieldAccessorTable.ensureFieldAccessorsInitialized(RectF.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setBottom(float f) {
                this.bottom_ = f;
                onChanged();
                return this;
            }

            public Builder setLeft(float f) {
                this.left_ = f;
                onChanged();
                return this;
            }

            public Builder setRight(float f) {
                this.right_ = f;
                onChanged();
                return this;
            }

            public Builder setTop(float f) {
                this.top_ = f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RectF build() {
                RectF rectFBuildPartial = buildPartial();
                if (rectFBuildPartial.isInitialized()) {
                    return rectFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rectFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RectF buildPartial() {
                RectF rectF = new RectF(this);
                rectF.left_ = this.left_;
                rectF.top_ = this.top_;
                rectF.right_ = this.right_;
                rectF.bottom_ = this.bottom_;
                onBuilt();
                return rectF;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RectF getDefaultInstanceForType() {
                return RectF.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.left_ = 0.0f;
                this.top_ = 0.0f;
                this.right_ = 0.0f;
                this.bottom_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo13724clone() {
                return (Builder) super.mo13724clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RectF) {
                    return mergeFrom((RectF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RectF rectF) {
                if (rectF == RectF.getDefaultInstance()) {
                    return this;
                }
                if (rectF.getLeft() != 0.0f) {
                    setLeft(rectF.getLeft());
                }
                if (rectF.getTop() != 0.0f) {
                    setTop(rectF.getTop());
                }
                if (rectF.getRight() != 0.0f) {
                    setRight(rectF.getRight());
                }
                if (rectF.getBottom() != 0.0f) {
                    setBottom(rectF.getBottom());
                }
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.GraphSnapshot.RectF.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.GraphSnapshot.RectF.access$6700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.GraphSnapshot$RectF r3 = (com.zykj.sketch.GraphSnapshot.RectF) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.sketch.GraphSnapshot$RectF r4 = (com.zykj.sketch.GraphSnapshot.RectF) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.GraphSnapshot.RectF.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.GraphSnapshot$RectF$Builder"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/GraphSnapshot$RectF$Builder.smali:778
            }
        }

        public static Builder newBuilder(RectF rectF) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rectF);
        }

        public static RectF parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private RectF(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RectF parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RectF) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RectF parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RectF getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static RectF parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private RectF() {
            this.memoizedIsInitialized = (byte) -1;
            this.left_ = 0.0f;
            this.top_ = 0.0f;
            this.right_ = 0.0f;
            this.bottom_ = 0.0f;
        }

        public static RectF parseFrom(InputStream inputStream) throws IOException {
            return (RectF) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static RectF parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RectF) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RectF parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RectF) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private RectF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z8 = false;
            while (!z8) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 13) {
                                this.left_ = codedInputStream.readFloat();
                            } else if (tag == 21) {
                                this.top_ = codedInputStream.readFloat();
                            } else if (tag == 29) {
                                this.right_ = codedInputStream.readFloat();
                            } else if (tag != 37) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.bottom_ = codedInputStream.readFloat();
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e4) {
                        throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static RectF parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RectF) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RectFOrBuilder extends MessageOrBuilder {
        float getBottom();

        float getLeft();

        float getRight();

        float getTop();
    }

    public static final class Touch extends GeneratedMessageV3 implements TouchOrBuilder {
        private static final Touch DEFAULT_INSTANCE = new Touch();
        private static final Parser<Touch> PARSER = new AbstractParser<Touch>() { // from class: com.zykj.sketch.GraphSnapshot.Touch.1
            @Override // com.google.protobuf.Parser
            public Touch parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Touch(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int POINTF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<PointF> pointF_;

        public static Touch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GraphSnapshot.internal_static_Touch_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Touch parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Touch) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Touch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Touch> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof Touch) ? super.equals(obj) : getPointFList().equals(((Touch) obj).getPointFList());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Touch> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
        public PointF getPointF(int i) {
            return this.pointF_.get(i);
        }

        @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
        public int getPointFCount() {
            return this.pointF_.size();
        }

        @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
        public List<PointF> getPointFList() {
            return this.pointF_;
        }

        @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
        public PointFOrBuilder getPointFOrBuilder(int i) {
            return this.pointF_.get(i);
        }

        @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
        public List<? extends PointFOrBuilder> getPointFOrBuilderList() {
            return this.pointF_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i8 = 0; i8 < this.pointF_.size(); i8++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.pointF_.get(i8));
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (getPointFCount() > 0) {
                iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getPointFList().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GraphSnapshot.internal_static_Touch_fieldAccessorTable.ensureFieldAccessorsInitialized(Touch.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.pointF_.size(); i++) {
                codedOutputStream.writeMessage(1, this.pointF_.get(i));
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TouchOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> pointFBuilder_;
            private List<PointF> pointF_;

            private void ensurePointFIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.pointF_ = new ArrayList(this.pointF_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GraphSnapshot.internal_static_Touch_descriptor;
            }

            private RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> getPointFFieldBuilder() {
                if (this.pointFBuilder_ == null) {
                    this.pointFBuilder_ = new RepeatedFieldBuilderV3<>(this.pointF_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                    this.pointF_ = null;
                }
                return this.pointFBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPointFFieldBuilder();
                }
            }

            public Builder addAllPointF(Iterable<? extends PointF> iterable) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointFIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.pointF_);
                onChanged();
                return this;
            }

            public Builder addPointF(PointF pointF) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(pointF);
                    return this;
                }
                pointF.getClass();
                ensurePointFIsMutable();
                this.pointF_.add(pointF);
                onChanged();
                return this;
            }

            public PointF.Builder addPointFBuilder() {
                return (PointF.Builder) getPointFFieldBuilder().addBuilder(PointF.getDefaultInstance());
            }

            public Builder clearPointF() {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.pointF_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GraphSnapshot.internal_static_Touch_descriptor;
            }

            @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
            public PointF getPointF(int i) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                return repeatedFieldBuilderV3 == null ? this.pointF_.get(i) : (PointF) repeatedFieldBuilderV3.getMessage(i);
            }

            public PointF.Builder getPointFBuilder(int i) {
                return (PointF.Builder) getPointFFieldBuilder().getBuilder(i);
            }

            public List<PointF.Builder> getPointFBuilderList() {
                return getPointFFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
            public int getPointFCount() {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                return repeatedFieldBuilderV3 == null ? this.pointF_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
            public List<PointF> getPointFList() {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.pointF_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
            public PointFOrBuilder getPointFOrBuilder(int i) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                return repeatedFieldBuilderV3 == null ? this.pointF_.get(i) : (PointFOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.zykj.sketch.GraphSnapshot.TouchOrBuilder
            public List<? extends PointFOrBuilder> getPointFOrBuilderList() {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.pointF_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GraphSnapshot.internal_static_Touch_fieldAccessorTable.ensureFieldAccessorsInitialized(Touch.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removePointF(int i) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i);
                    return this;
                }
                ensurePointFIsMutable();
                this.pointF_.remove(i);
                onChanged();
                return this;
            }

            public Builder setPointF(int i, PointF pointF) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, pointF);
                    return this;
                }
                pointF.getClass();
                ensurePointFIsMutable();
                this.pointF_.set(i, pointF);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.pointF_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Touch build() {
                Touch touchBuildPartial = buildPartial();
                if (touchBuildPartial.isInitialized()) {
                    return touchBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Touch buildPartial() {
                Touch touch = new Touch(this);
                int i = this.bitField0_;
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) == 1) {
                        this.pointF_ = Collections.unmodifiableList(this.pointF_);
                        this.bitField0_ &= -2;
                    }
                    touch.pointF_ = this.pointF_;
                } else {
                    touch.pointF_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return touch;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Touch getDefaultInstanceForType() {
                return Touch.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public PointF.Builder addPointFBuilder(int i) {
                return (PointF.Builder) getPointFFieldBuilder().addBuilder(i, PointF.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.pointF_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                repeatedFieldBuilderV3.clear();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.pointF_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addPointF(int i, PointF pointF) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    pointF.getClass();
                    ensurePointFIsMutable();
                    this.pointF_.add(i, pointF);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i, pointF);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo13724clone() {
                return (Builder) super.mo13724clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Touch) {
                    return mergeFrom((Touch) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPointF(int i, PointF.Builder builder) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointFIsMutable();
                    this.pointF_.set(i, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i, builder.build());
                return this;
            }

            public Builder mergeFrom(Touch touch) {
                if (touch == Touch.getDefaultInstance()) {
                    return this;
                }
                if (this.pointFBuilder_ == null) {
                    if (!touch.pointF_.isEmpty()) {
                        if (this.pointF_.isEmpty()) {
                            this.pointF_ = touch.pointF_;
                            this.bitField0_ &= -2;
                        } else {
                            ensurePointFIsMutable();
                            this.pointF_.addAll(touch.pointF_);
                        }
                        onChanged();
                    }
                } else if (!touch.pointF_.isEmpty()) {
                    if (!this.pointFBuilder_.isEmpty()) {
                        this.pointFBuilder_.addAllMessages(touch.pointF_);
                    } else {
                        this.pointFBuilder_.dispose();
                        this.pointFBuilder_ = null;
                        this.pointF_ = touch.pointF_;
                        this.bitField0_ &= -2;
                        this.pointFBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointFFieldBuilder() : null;
                    }
                }
                onChanged();
                return this;
            }

            public Builder addPointF(PointF.Builder builder) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointFIsMutable();
                    this.pointF_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addPointF(int i, PointF.Builder builder) {
                RepeatedFieldBuilderV3<PointF, PointF.Builder, PointFOrBuilder> repeatedFieldBuilderV3 = this.pointFBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointFIsMutable();
                    this.pointF_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.GraphSnapshot.Touch.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.GraphSnapshot.Touch.access$4000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.GraphSnapshot$Touch r3 = (com.zykj.sketch.GraphSnapshot.Touch) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.sketch.GraphSnapshot$Touch r4 = (com.zykj.sketch.GraphSnapshot.Touch) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.GraphSnapshot.Touch.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.GraphSnapshot$Touch$Builder"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/GraphSnapshot$Touch$Builder.smali:1443
            }
        }

        public static Builder newBuilder(Touch touch) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(touch);
        }

        public static Touch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Touch(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Touch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Touch) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Touch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Touch getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Touch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Touch() {
            this.memoizedIsInitialized = (byte) -1;
            this.pointF_ = Collections.EMPTY_LIST;
        }

        public static Touch parseFrom(InputStream inputStream) throws IOException {
            return (Touch) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Touch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Touch) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Touch(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z8 = false;
            boolean z9 = false;
            while (!z8) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                if (!z9) {
                                    this.pointF_ = new ArrayList();
                                    z9 = true;
                                }
                                this.pointF_.add((PointF) codedInputStream.readMessage(PointF.parser(), extensionRegistryLite));
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e4) {
                        throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z9) {
                        this.pointF_ = Collections.unmodifiableList(this.pointF_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z9) {
                this.pointF_ = Collections.unmodifiableList(this.pointF_);
            }
            makeExtensionsImmutable();
        }

        public static Touch parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Touch) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Touch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Touch) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TouchOrBuilder extends MessageOrBuilder {
        PointF getPointF(int i);

        int getPointFCount();

        List<PointF> getPointFList();

        PointFOrBuilder getPointFOrBuilder(int i);

        List<? extends PointFOrBuilder> getPointFOrBuilderList();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019SketchGraphSnapshot.proto\u001a\u0019google/protobuf/any.proto\"\u0085\u0002\n\tGraphData\u0012\u001d\n\tgraphType\u0018\u0001 \u0001(\u000e2\n.GraphType\u0012\u001e\n\nchildGraph\u0018\u0002 \u0003(\u000b2\n.GraphData\u0012\u000e\n\u0006matrix\u0018\u0003 \u0003(\u0002\u0012\u0019\n\u0011childExtendMatrix\u0018\u0004 \u0003(\u0002\u0012\r\n\u0005width\u0018\u0006 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bisSelect\u0018\b \u0001(\b\u0012\u0012\n\nshowDelete\u0018\t \u0001(\b\u0012#\n\u0005extra\u0018\n \u0001(\u000b2\u0014.google.protobuf.Any\u0012\f\n\u0004name\u0018\u000b \u0001(\t\u0012\u0017\n\u0007outRect\u0018\f \u0001(\u000b2\u0006.RectF\"\u001e\n\u0006PointF\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\" \n\u0005Touch\u0012\u0017\n\u0006pointF\u0018\u0001 \u0003(\u000b2\u0007.PointF\"t\n\u0004File\u0012\u0010\n\bfile", "Name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0004 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0005 \u0001(\u0005\u0012\u0014\n\fpositionFlag\u0018\u0006 \u0001(\u0005\"A\n\u0005RectF\u0012\f\n\u0004left\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003top\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002*¨\u0001\n\tGraphType\u0012\u001d\n\u0019UNBOUNDED_CONTAINER_GRAPH\u0010\u0000\u0012\u001b\n\u0017BOUNDED_CONTAINER_GRAPH\u0010\u0001\u0012\u000f\n\u000bIMAGE_GRAPH\u0010\u0002\u0012\u0012\n\u000eWEB_VIEW_GRAPH\u0010\u0003\u0012\u0017\n\u0013WRITING_GROUP_GRAPH\u0010\u0004\u0012\u0010\n\fSTROKE_GRAPH\u0010\u0005\u0012\u000f\n\u000bSHAPE_GRAPH\u0010\u0006B \n\u000fcom.zykj.sketchB\rGraphSnapshotb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zykj.sketch.GraphSnapshot.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = GraphSnapshot.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GraphData_descriptor = descriptor2;
        internal_static_GraphData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GraphType", "ChildGraph", "Matrix", "ChildExtendMatrix", "Width", "Color", "IsSelect", "ShowDelete", "Extra", "Name", "OutRect"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_PointF_descriptor = descriptor3;
        internal_static_PointF_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_Touch_descriptor = descriptor4;
        internal_static_Touch_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"PointF"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_File_descriptor = descriptor5;
        internal_static_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"FileName", "Width", "Height", "ViewWidth", "ViewHeight", "PositionFlag"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_RectF_descriptor = descriptor6;
        internal_static_RectF_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Left", "Top", "Right", "Bottom"});
        AnyProto.getDescriptor();
    }

    private GraphSnapshot() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}

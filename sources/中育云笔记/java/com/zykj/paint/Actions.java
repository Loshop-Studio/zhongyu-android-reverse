package com.zykj.paint;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.camera.video.AudioStats;
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
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Actions {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_EzyActionData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyActionData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzyActionList_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyActionList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzyAction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyAction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzyColor_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyColor_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzyMatrixData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyMatrixData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzyPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyPoint_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzySize_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzySize_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EzyVector_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EzyVector_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MoveGraphData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MoveGraphData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NewImageData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NewImageData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NewLayerData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NewLayerData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NewPolylineData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NewPolylineData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ZoomGraphData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ZoomGraphData_fieldAccessorTable;

    public static final class EzyAction extends GeneratedMessageV3 implements EzyActionOrBuilder {
        public static final int ACTIONTYPE_FIELD_NUMBER = 3;
        public static final int DATA_FIELD_NUMBER = 5;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int GRAPHID_FIELD_NUMBER = 4;
        public static final int STARTAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int actionType_;
        private Any data_;
        private int duration_;
        private int graphId_;
        private byte memoizedIsInitialized;
        private int startAt_;
        private static final EzyAction DEFAULT_INSTANCE = new EzyAction();
        private static final Parser<EzyAction> PARSER = new AbstractParser<EzyAction>() { // from class: com.zykj.paint.Actions.EzyAction.1
            @Override // com.google.protobuf.Parser
            public EzyAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyAction(codedInputStream, extensionRegistryLite);
            }
        };

        public static EzyAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyAction parseDelimitedFrom(InputStream inputStream) {
            return (EzyAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyAction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EzyAction)) {
                return super.equals(obj);
            }
            EzyAction ezyAction = (EzyAction) obj;
            boolean z10 = getStartAt() == ezyAction.getStartAt() && getDuration() == ezyAction.getDuration() && getActionType() == ezyAction.getActionType() && getGraphId() == ezyAction.getGraphId() && hasData() == ezyAction.hasData();
            return hasData() ? z10 && getData().equals(ezyAction.getData()) : z10;
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public int getActionType() {
            return this.actionType_;
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public Any getData() {
            Any any = this.data_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public AnyOrBuilder getDataOrBuilder() {
            return getData();
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public int getGraphId() {
            return this.graphId_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.startAt_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.duration_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.actionType_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            int i14 = this.graphId_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i14);
            }
            if (this.data_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, getData());
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public int getStartAt() {
            return this.startAt_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.EzyActionOrBuilder
        public boolean hasData() {
            return this.data_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getStartAt()) * 37) + 2) * 53) + getDuration()) * 37) + 3) * 53) + getActionType()) * 37) + 4) * 53) + getGraphId();
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyAction_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyAction.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.startAt_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.duration_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.actionType_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            int i13 = this.graphId_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(4, i13);
            }
            if (this.data_ != null) {
                codedOutputStream.writeMessage(5, getData());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyActionOrBuilder {
            private int actionType_;
            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> dataBuilder_;
            private Any data_;
            private int duration_;
            private int graphId_;
            private int startAt_;

            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new SingleFieldBuilderV3<>(getData(), getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyAction_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearActionType() {
                this.actionType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearData() {
                if (this.dataBuilder_ == null) {
                    this.data_ = null;
                    onChanged();
                    return this;
                }
                this.data_ = null;
                this.dataBuilder_ = null;
                return this;
            }

            public Builder clearDuration() {
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGraphId() {
                this.graphId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartAt() {
                this.startAt_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public int getActionType() {
                return this.actionType_;
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public Any getData() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Any) singleFieldBuilderV3.getMessage();
                }
                Any any = this.data_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any.Builder getDataBuilder() {
                onChanged();
                return (Any.Builder) getDataFieldBuilder().getBuilder();
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public AnyOrBuilder getDataOrBuilder() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AnyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Any any = this.data_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyAction_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public int getGraphId() {
                return this.graphId_;
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public int getStartAt() {
                return this.startAt_;
            }

            @Override // com.zykj.paint.Actions.EzyActionOrBuilder
            public boolean hasData() {
                return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyAction_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyAction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeData(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(any);
                    return this;
                }
                Any any2 = this.data_;
                if (any2 != null) {
                    this.data_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.data_ = any;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setActionType(int i10) {
                this.actionType_ = i10;
                onChanged();
                return this;
            }

            public Builder setData(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(any);
                    return this;
                }
                any.getClass();
                this.data_ = any;
                onChanged();
                return this;
            }

            public Builder setDuration(int i10) {
                this.duration_ = i10;
                onChanged();
                return this;
            }

            public Builder setGraphId(int i10) {
                this.graphId_ = i10;
                onChanged();
                return this;
            }

            public Builder setStartAt(int i10) {
                this.startAt_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.data_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyAction build() {
                EzyAction ezyActionBuildPartial = buildPartial();
                if (ezyActionBuildPartial.isInitialized()) {
                    return ezyActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyAction buildPartial() {
                EzyAction ezyAction = new EzyAction(this);
                ezyAction.startAt_ = this.startAt_;
                ezyAction.duration_ = this.duration_;
                ezyAction.actionType_ = this.actionType_;
                ezyAction.graphId_ = this.graphId_;
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ezyAction.data_ = this.data_;
                } else {
                    ezyAction.data_ = (Any) singleFieldBuilderV3.build();
                }
                onBuilt();
                return ezyAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyAction getDefaultInstanceForType() {
                return EzyAction.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.startAt_ = 0;
                this.duration_ = 0;
                this.actionType_ = 0;
                this.graphId_ = 0;
                if (this.dataBuilder_ == null) {
                    this.data_ = null;
                    return this;
                }
                this.data_ = null;
                this.dataBuilder_ = null;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setData(Any.Builder builder) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.data_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyAction) {
                    return mergeFrom((EzyAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzyAction ezyAction) {
                if (ezyAction == EzyAction.getDefaultInstance()) {
                    return this;
                }
                if (ezyAction.getStartAt() != 0) {
                    setStartAt(ezyAction.getStartAt());
                }
                if (ezyAction.getDuration() != 0) {
                    setDuration(ezyAction.getDuration());
                }
                if (ezyAction.getActionType() != 0) {
                    setActionType(ezyAction.getActionType());
                }
                if (ezyAction.getGraphId() != 0) {
                    setGraphId(ezyAction.getGraphId());
                }
                if (ezyAction.hasData()) {
                    mergeData(ezyAction.getData());
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
            public com.zykj.paint.Actions.EzyAction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyAction.access$1100()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyAction r3 = (com.zykj.paint.Actions.EzyAction) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyAction r4 = (com.zykj.paint.Actions.EzyAction) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyAction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyAction$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyAction$Builder.smali:1172
            }
        }

        public static Builder newBuilder(EzyAction ezyAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyAction);
        }

        public static EzyAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzyAction() {
            this.memoizedIsInitialized = (byte) -1;
            this.startAt_ = 0;
            this.duration_ = 0;
            this.actionType_ = 0;
            this.graphId_ = 0;
        }

        public static EzyAction parseFrom(InputStream inputStream) {
            return (EzyAction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzyAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyAction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyAction parseFrom(CodedInputStream codedInputStream) {
            return (EzyAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private EzyAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.startAt_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.duration_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.actionType_ = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.graphId_ = codedInputStream.readInt32();
                            } else if (tag != 42) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                Any any = this.data_;
                                Any.Builder builder = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.data_ = any2;
                                if (builder != null) {
                                    builder.mergeFrom(any2);
                                    this.data_ = builder.buildPartial();
                                }
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static EzyAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EzyActionData extends GeneratedMessageV3 implements EzyActionDataOrBuilder {
        private static final EzyActionData DEFAULT_INSTANCE = new EzyActionData();
        private static final Parser<EzyActionData> PARSER = new AbstractParser<EzyActionData>() { // from class: com.zykj.paint.Actions.EzyActionData.1
            @Override // com.google.protobuf.Parser
            public EzyActionData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyActionData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PLACEHOLDER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int placeHolder_;

        public static EzyActionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyActionData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyActionData parseDelimitedFrom(InputStream inputStream) {
            return (EzyActionData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyActionData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyActionData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof EzyActionData) ? super.equals(obj) : getPlaceHolder() == ((EzyActionData) obj).getPlaceHolder();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyActionData> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.paint.Actions.EzyActionDataOrBuilder
        public int getPlaceHolder() {
            return this.placeHolder_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.placeHolder_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getPlaceHolder()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyActionData_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyActionData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.placeHolder_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyActionDataOrBuilder {
            private int placeHolder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyActionData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPlaceHolder() {
                this.placeHolder_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyActionData_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzyActionDataOrBuilder
            public int getPlaceHolder() {
                return this.placeHolder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyActionData_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyActionData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setPlaceHolder(int i10) {
                this.placeHolder_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyActionData build() {
                EzyActionData ezyActionDataBuildPartial = buildPartial();
                if (ezyActionDataBuildPartial.isInitialized()) {
                    return ezyActionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyActionDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyActionData buildPartial() {
                EzyActionData ezyActionData = new EzyActionData(this);
                ezyActionData.placeHolder_ = this.placeHolder_;
                onBuilt();
                return ezyActionData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyActionData getDefaultInstanceForType() {
                return EzyActionData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.placeHolder_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyActionData) {
                    return mergeFrom((EzyActionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzyActionData ezyActionData) {
                if (ezyActionData == EzyActionData.getDefaultInstance()) {
                    return this;
                }
                if (ezyActionData.getPlaceHolder() != 0) {
                    setPlaceHolder(ezyActionData.getPlaceHolder());
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
            public com.zykj.paint.Actions.EzyActionData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyActionData.access$2000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyActionData r3 = (com.zykj.paint.Actions.EzyActionData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyActionData r4 = (com.zykj.paint.Actions.EzyActionData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyActionData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyActionData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyActionData$Builder.smali:633
            }
        }

        public static Builder newBuilder(EzyActionData ezyActionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyActionData);
        }

        public static EzyActionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyActionData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyActionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyActionData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyActionData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyActionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyActionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzyActionData() {
            this.memoizedIsInitialized = (byte) -1;
            this.placeHolder_ = 0;
        }

        public static EzyActionData parseFrom(InputStream inputStream) {
            return (EzyActionData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzyActionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyActionData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EzyActionData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.placeHolder_ = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static EzyActionData parseFrom(CodedInputStream codedInputStream) {
            return (EzyActionData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static EzyActionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyActionData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzyActionDataOrBuilder extends MessageOrBuilder {
        int getPlaceHolder();
    }

    public static final class EzyActionList extends GeneratedMessageV3 implements EzyActionListOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final EzyActionList DEFAULT_INSTANCE = new EzyActionList();
        private static final Parser<EzyActionList> PARSER = new AbstractParser<EzyActionList>() { // from class: com.zykj.paint.Actions.EzyActionList.1
            @Override // com.google.protobuf.Parser
            public EzyActionList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyActionList(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private List<EzyAction> action_;
        private byte memoizedIsInitialized;

        public static EzyActionList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyActionList_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyActionList parseDelimitedFrom(InputStream inputStream) {
            return (EzyActionList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyActionList parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyActionList> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof EzyActionList) ? super.equals(obj) : getActionList().equals(((EzyActionList) obj).getActionList());
        }

        @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
        public EzyAction getAction(int i10) {
            return this.action_.get(i10);
        }

        @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
        public int getActionCount() {
            return this.action_.size();
        }

        @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
        public List<EzyAction> getActionList() {
            return this.action_;
        }

        @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
        public EzyActionOrBuilder getActionOrBuilder(int i10) {
            return this.action_.get(i10);
        }

        @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
        public List<? extends EzyActionOrBuilder> getActionOrBuilderList() {
            return this.action_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyActionList> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.action_.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.action_.get(i11));
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (getActionCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getActionList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyActionList_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyActionList.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.action_.size(); i10++) {
                codedOutputStream.writeMessage(1, this.action_.get(i10));
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyActionListOrBuilder {
            private RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> actionBuilder_;
            private List<EzyAction> action_;
            private int bitField0_;

            private void ensureActionIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.action_ = new ArrayList(this.action_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> getActionFieldBuilder() {
                if (this.actionBuilder_ == null) {
                    this.actionBuilder_ = new RepeatedFieldBuilderV3<>(this.action_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                    this.action_ = null;
                }
                return this.actionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyActionList_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getActionFieldBuilder();
                }
            }

            public Builder addAction(EzyAction ezyAction) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(ezyAction);
                    return this;
                }
                ezyAction.getClass();
                ensureActionIsMutable();
                this.action_.add(ezyAction);
                onChanged();
                return this;
            }

            public EzyAction.Builder addActionBuilder() {
                return (EzyAction.Builder) getActionFieldBuilder().addBuilder(EzyAction.getDefaultInstance());
            }

            public Builder addAllAction(Iterable<? extends EzyAction> iterable) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureActionIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.action_);
                onChanged();
                return this;
            }

            public Builder clearAction() {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.action_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
            public EzyAction getAction(int i10) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                return repeatedFieldBuilderV3 == null ? this.action_.get(i10) : (EzyAction) repeatedFieldBuilderV3.getMessage(i10);
            }

            public EzyAction.Builder getActionBuilder(int i10) {
                return (EzyAction.Builder) getActionFieldBuilder().getBuilder(i10);
            }

            public List<EzyAction.Builder> getActionBuilderList() {
                return getActionFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
            public int getActionCount() {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                return repeatedFieldBuilderV3 == null ? this.action_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
            public List<EzyAction> getActionList() {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.action_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
            public EzyActionOrBuilder getActionOrBuilder(int i10) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                return repeatedFieldBuilderV3 == null ? this.action_.get(i10) : (EzyActionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // com.zykj.paint.Actions.EzyActionListOrBuilder
            public List<? extends EzyActionOrBuilder> getActionOrBuilderList() {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.action_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyActionList_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyActionList_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyActionList.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removeAction(int i10) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i10);
                    return this;
                }
                ensureActionIsMutable();
                this.action_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAction(int i10, EzyAction ezyAction) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, ezyAction);
                    return this;
                }
                ezyAction.getClass();
                ensureActionIsMutable();
                this.action_.set(i10, ezyAction);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.action_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyActionList build() {
                EzyActionList ezyActionListBuildPartial = buildPartial();
                if (ezyActionListBuildPartial.isInitialized()) {
                    return ezyActionListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyActionListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyActionList buildPartial() {
                EzyActionList ezyActionList = new EzyActionList(this);
                int i10 = this.bitField0_;
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i10 & 1) == 1) {
                        this.action_ = Collections.unmodifiableList(this.action_);
                        this.bitField0_ &= -2;
                    }
                    ezyActionList.action_ = this.action_;
                } else {
                    ezyActionList.action_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return ezyActionList;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyActionList getDefaultInstanceForType() {
                return EzyActionList.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public EzyAction.Builder addActionBuilder(int i10) {
                return (EzyAction.Builder) getActionFieldBuilder().addBuilder(i10, EzyAction.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.action_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                repeatedFieldBuilderV3.clear();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.action_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addAction(int i10, EzyAction ezyAction) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ezyAction.getClass();
                    ensureActionIsMutable();
                    this.action_.add(i10, ezyAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, ezyAction);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyActionList) {
                    return mergeFrom((EzyActionList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAction(int i10, EzyAction.Builder builder) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionIsMutable();
                    this.action_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(EzyActionList ezyActionList) {
                if (ezyActionList == EzyActionList.getDefaultInstance()) {
                    return this;
                }
                if (this.actionBuilder_ == null) {
                    if (!ezyActionList.action_.isEmpty()) {
                        if (this.action_.isEmpty()) {
                            this.action_ = ezyActionList.action_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureActionIsMutable();
                            this.action_.addAll(ezyActionList.action_);
                        }
                        onChanged();
                    }
                } else if (!ezyActionList.action_.isEmpty()) {
                    if (!this.actionBuilder_.isEmpty()) {
                        this.actionBuilder_.addAllMessages(ezyActionList.action_);
                    } else {
                        this.actionBuilder_.dispose();
                        this.actionBuilder_ = null;
                        this.action_ = ezyActionList.action_;
                        this.bitField0_ &= -2;
                        this.actionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getActionFieldBuilder() : null;
                    }
                }
                onChanged();
                return this;
            }

            public Builder addAction(EzyAction.Builder builder) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionIsMutable();
                    this.action_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addAction(int i10, EzyAction.Builder builder) {
                RepeatedFieldBuilderV3<EzyAction, EzyAction.Builder, EzyActionOrBuilder> repeatedFieldBuilderV3 = this.actionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionIsMutable();
                    this.action_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.paint.Actions.EzyActionList.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyActionList.access$13400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyActionList r3 = (com.zykj.paint.Actions.EzyActionList) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyActionList r4 = (com.zykj.paint.Actions.EzyActionList) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyActionList.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyActionList$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyActionList$Builder.smali:1418
            }
        }

        public static Builder newBuilder(EzyActionList ezyActionList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyActionList);
        }

        public static EzyActionList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyActionList(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyActionList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyActionList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyActionList parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyActionList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyActionList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzyActionList() {
            this.memoizedIsInitialized = (byte) -1;
            this.action_ = Collections.EMPTY_LIST;
        }

        public static EzyActionList parseFrom(InputStream inputStream) {
            return (EzyActionList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzyActionList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyActionList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EzyActionList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.action_ = new ArrayList();
                                    z11 = true;
                                }
                                this.action_.add((EzyAction) codedInputStream.readMessage(EzyAction.parser(), extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.action_ = Collections.unmodifiableList(this.action_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11) {
                this.action_ = Collections.unmodifiableList(this.action_);
            }
            makeExtensionsImmutable();
        }

        public static EzyActionList parseFrom(CodedInputStream codedInputStream) {
            return (EzyActionList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static EzyActionList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyActionList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzyActionListOrBuilder extends MessageOrBuilder {
        EzyAction getAction(int i10);

        int getActionCount();

        List<EzyAction> getActionList();

        EzyActionOrBuilder getActionOrBuilder(int i10);

        List<? extends EzyActionOrBuilder> getActionOrBuilderList();
    }

    public interface EzyActionOrBuilder extends MessageOrBuilder {
        int getActionType();

        Any getData();

        AnyOrBuilder getDataOrBuilder();

        int getDuration();

        int getGraphId();

        int getStartAt();

        boolean hasData();
    }

    public static final class EzyColor extends GeneratedMessageV3 implements EzyColorOrBuilder {
        public static final int ALPHA_FIELD_NUMBER = 4;
        public static final int BLUE_FIELD_NUMBER = 3;
        public static final int GREEN_FIELD_NUMBER = 2;
        public static final int RED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int alpha_;
        private int blue_;
        private int green_;
        private byte memoizedIsInitialized;
        private int red_;
        private static final EzyColor DEFAULT_INSTANCE = new EzyColor();
        private static final Parser<EzyColor> PARSER = new AbstractParser<EzyColor>() { // from class: com.zykj.paint.Actions.EzyColor.1
            @Override // com.google.protobuf.Parser
            public EzyColor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyColor(codedInputStream, extensionRegistryLite);
            }
        };

        public static EzyColor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyColor_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyColor parseDelimitedFrom(InputStream inputStream) {
            return (EzyColor) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyColor parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyColor> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EzyColor)) {
                return super.equals(obj);
            }
            EzyColor ezyColor = (EzyColor) obj;
            return getRed() == ezyColor.getRed() && getGreen() == ezyColor.getGreen() && getBlue() == ezyColor.getBlue() && getAlpha() == ezyColor.getAlpha();
        }

        @Override // com.zykj.paint.Actions.EzyColorOrBuilder
        public int getAlpha() {
            return this.alpha_;
        }

        @Override // com.zykj.paint.Actions.EzyColorOrBuilder
        public int getBlue() {
            return this.blue_;
        }

        @Override // com.zykj.paint.Actions.EzyColorOrBuilder
        public int getGreen() {
            return this.green_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyColor> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.paint.Actions.EzyColorOrBuilder
        public int getRed() {
            return this.red_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.red_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.green_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.blue_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            int i14 = this.alpha_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i14);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getRed()) * 37) + 2) * 53) + getGreen()) * 37) + 3) * 53) + getBlue()) * 37) + 4) * 53) + getAlpha()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyColor_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyColor.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.red_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.green_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.blue_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            int i13 = this.alpha_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(4, i13);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyColorOrBuilder {
            private int alpha_;
            private int blue_;
            private int green_;
            private int red_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyColor_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAlpha() {
                this.alpha_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBlue() {
                this.blue_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGreen() {
                this.green_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRed() {
                this.red_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.paint.Actions.EzyColorOrBuilder
            public int getAlpha() {
                return this.alpha_;
            }

            @Override // com.zykj.paint.Actions.EzyColorOrBuilder
            public int getBlue() {
                return this.blue_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyColor_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzyColorOrBuilder
            public int getGreen() {
                return this.green_;
            }

            @Override // com.zykj.paint.Actions.EzyColorOrBuilder
            public int getRed() {
                return this.red_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyColor_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyColor.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setAlpha(int i10) {
                this.alpha_ = i10;
                onChanged();
                return this;
            }

            public Builder setBlue(int i10) {
                this.blue_ = i10;
                onChanged();
                return this;
            }

            public Builder setGreen(int i10) {
                this.green_ = i10;
                onChanged();
                return this;
            }

            public Builder setRed(int i10) {
                this.red_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyColor build() {
                EzyColor ezyColorBuildPartial = buildPartial();
                if (ezyColorBuildPartial.isInitialized()) {
                    return ezyColorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyColorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyColor buildPartial() {
                EzyColor ezyColor = new EzyColor(this);
                ezyColor.red_ = this.red_;
                ezyColor.green_ = this.green_;
                ezyColor.blue_ = this.blue_;
                ezyColor.alpha_ = this.alpha_;
                onBuilt();
                return ezyColor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyColor getDefaultInstanceForType() {
                return EzyColor.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.red_ = 0;
                this.green_ = 0;
                this.blue_ = 0;
                this.alpha_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyColor) {
                    return mergeFrom((EzyColor) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzyColor ezyColor) {
                if (ezyColor == EzyColor.getDefaultInstance()) {
                    return this;
                }
                if (ezyColor.getRed() != 0) {
                    setRed(ezyColor.getRed());
                }
                if (ezyColor.getGreen() != 0) {
                    setGreen(ezyColor.getGreen());
                }
                if (ezyColor.getBlue() != 0) {
                    setBlue(ezyColor.getBlue());
                }
                if (ezyColor.getAlpha() != 0) {
                    setAlpha(ezyColor.getAlpha());
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
            public com.zykj.paint.Actions.EzyColor.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyColor.access$9400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyColor r3 = (com.zykj.paint.Actions.EzyColor) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyColor r4 = (com.zykj.paint.Actions.EzyColor) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyColor.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyColor$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyColor$Builder.smali:753
            }
        }

        public static Builder newBuilder(EzyColor ezyColor) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyColor);
        }

        public static EzyColor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyColor(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyColor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyColor) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyColor parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyColor getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyColor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzyColor() {
            this.memoizedIsInitialized = (byte) -1;
            this.red_ = 0;
            this.green_ = 0;
            this.blue_ = 0;
            this.alpha_ = 0;
        }

        public static EzyColor parseFrom(InputStream inputStream) {
            return (EzyColor) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzyColor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyColor) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyColor parseFrom(CodedInputStream codedInputStream) {
            return (EzyColor) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private EzyColor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.red_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.green_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.blue_ = codedInputStream.readInt32();
                            } else if (tag != 32) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.alpha_ = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static EzyColor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyColor) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzyColorOrBuilder extends MessageOrBuilder {
        int getAlpha();

        int getBlue();

        int getGreen();

        int getRed();
    }

    public static final class EzyMatrixData extends GeneratedMessageV3 implements EzyMatrixDataOrBuilder {
        private static final EzyMatrixData DEFAULT_INSTANCE = new EzyMatrixData();
        private static final Parser<EzyMatrixData> PARSER = new AbstractParser<EzyMatrixData>() { // from class: com.zykj.paint.Actions.EzyMatrixData.1
            @Override // com.google.protobuf.Parser
            public EzyMatrixData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyMatrixData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int VALUES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int valuesMemoizedSerializedSize;
        private List<Float> values_;

        public static EzyMatrixData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyMatrixData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyMatrixData parseDelimitedFrom(InputStream inputStream) {
            return (EzyMatrixData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyMatrixData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyMatrixData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof EzyMatrixData) ? super.equals(obj) : getValuesList().equals(((EzyMatrixData) obj).getValuesList());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyMatrixData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int size = getValuesList().size() * 4;
            int iComputeInt32SizeNoTag = !getValuesList().isEmpty() ? size + 1 + CodedOutputStream.computeInt32SizeNoTag(size) : size;
            this.valuesMemoizedSerializedSize = size;
            this.memoizedSize = iComputeInt32SizeNoTag;
            return iComputeInt32SizeNoTag;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.EzyMatrixDataOrBuilder
        public float getValues(int i10) {
            return this.values_.get(i10).floatValue();
        }

        @Override // com.zykj.paint.Actions.EzyMatrixDataOrBuilder
        public int getValuesCount() {
            return this.values_.size();
        }

        @Override // com.zykj.paint.Actions.EzyMatrixDataOrBuilder
        public List<Float> getValuesList() {
            return this.values_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (getValuesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getValuesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyMatrixData_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyMatrixData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if (getValuesList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(10);
                codedOutputStream.writeUInt32NoTag(this.valuesMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.values_.size(); i10++) {
                codedOutputStream.writeFloatNoTag(this.values_.get(i10).floatValue());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyMatrixDataOrBuilder {
            private int bitField0_;
            private List<Float> values_;

            private void ensureValuesIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.values_ = new ArrayList(this.values_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyMatrixData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllValues(Iterable<? extends Float> iterable) {
                ensureValuesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.values_);
                onChanged();
                return this;
            }

            public Builder addValues(float f10) {
                ensureValuesIsMutable();
                this.values_.add(Float.valueOf(f10));
                onChanged();
                return this;
            }

            public Builder clearValues() {
                this.values_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyMatrixData_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzyMatrixDataOrBuilder
            public float getValues(int i10) {
                return this.values_.get(i10).floatValue();
            }

            @Override // com.zykj.paint.Actions.EzyMatrixDataOrBuilder
            public int getValuesCount() {
                return this.values_.size();
            }

            @Override // com.zykj.paint.Actions.EzyMatrixDataOrBuilder
            public List<Float> getValuesList() {
                return Collections.unmodifiableList(this.values_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyMatrixData_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyMatrixData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setValues(int i10, float f10) {
                ensureValuesIsMutable();
                this.values_.set(i10, Float.valueOf(f10));
                onChanged();
                return this;
            }

            private Builder() {
                this.values_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyMatrixData build() {
                EzyMatrixData ezyMatrixDataBuildPartial = buildPartial();
                if (ezyMatrixDataBuildPartial.isInitialized()) {
                    return ezyMatrixDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyMatrixDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyMatrixData buildPartial() {
                EzyMatrixData ezyMatrixData = new EzyMatrixData(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.values_ = Collections.unmodifiableList(this.values_);
                    this.bitField0_ &= -2;
                }
                ezyMatrixData.values_ = this.values_;
                onBuilt();
                return ezyMatrixData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyMatrixData getDefaultInstanceForType() {
                return EzyMatrixData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.values_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.values_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyMatrixData) {
                    return mergeFrom((EzyMatrixData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzyMatrixData ezyMatrixData) {
                if (ezyMatrixData == EzyMatrixData.getDefaultInstance()) {
                    return this;
                }
                if (!ezyMatrixData.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = ezyMatrixData.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(ezyMatrixData.values_);
                    }
                    onChanged();
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
            public com.zykj.paint.Actions.EzyMatrixData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyMatrixData.access$2900()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyMatrixData r3 = (com.zykj.paint.Actions.EzyMatrixData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyMatrixData r4 = (com.zykj.paint.Actions.EzyMatrixData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyMatrixData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyMatrixData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyMatrixData$Builder.smali:885
            }
        }

        public static Builder newBuilder(EzyMatrixData ezyMatrixData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyMatrixData);
        }

        public static EzyMatrixData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyMatrixData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valuesMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyMatrixData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyMatrixData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyMatrixData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyMatrixData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyMatrixData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EzyMatrixData parseFrom(InputStream inputStream) {
            return (EzyMatrixData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private EzyMatrixData() {
            this.valuesMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.values_ = Collections.EMPTY_LIST;
        }

        public static EzyMatrixData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyMatrixData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyMatrixData parseFrom(CodedInputStream codedInputStream) {
            return (EzyMatrixData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private EzyMatrixData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!z11 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.values_ = new ArrayList();
                                    z11 = true;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.values_.add(Float.valueOf(codedInputStream.readFloat()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            } else if (tag != 13) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.values_ = new ArrayList();
                                    z11 = true;
                                }
                                this.values_.add(Float.valueOf(codedInputStream.readFloat()));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.values_ = Collections.unmodifiableList(this.values_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11) {
                this.values_ = Collections.unmodifiableList(this.values_);
            }
            makeExtensionsImmutable();
        }

        public static EzyMatrixData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyMatrixData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzyMatrixDataOrBuilder extends MessageOrBuilder {
        float getValues(int i10);

        int getValuesCount();

        List<Float> getValuesList();
    }

    public static final class EzyPoint extends GeneratedMessageV3 implements EzyPointOrBuilder {
        private static final EzyPoint DEFAULT_INSTANCE = new EzyPoint();
        private static final Parser<EzyPoint> PARSER = new AbstractParser<EzyPoint>() { // from class: com.zykj.paint.Actions.EzyPoint.1
            @Override // com.google.protobuf.Parser
            public EzyPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyPoint(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        /* renamed from: x_ */
        private double f19835x_;

        /* renamed from: y_ */
        private double f19836y_;

        public static EzyPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyPoint_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyPoint parseDelimitedFrom(InputStream inputStream) {
            return (EzyPoint) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyPoint parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EzyPoint)) {
                return super.equals(obj);
            }
            EzyPoint ezyPoint = (EzyPoint) obj;
            return Double.doubleToLongBits(getX()) == Double.doubleToLongBits(ezyPoint.getX()) && Double.doubleToLongBits(getY()) == Double.doubleToLongBits(ezyPoint.getY());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            double d10 = this.f19835x_;
            int iComputeDoubleSize = d10 != AudioStats.AUDIO_AMPLITUDE_NONE ? CodedOutputStream.computeDoubleSize(1, d10) : 0;
            double d11 = this.f19836y_;
            if (d11 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                iComputeDoubleSize += CodedOutputStream.computeDoubleSize(2, d11);
            }
            this.memoizedSize = iComputeDoubleSize;
            return iComputeDoubleSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.EzyPointOrBuilder
        public double getX() {
            return this.f19835x_;
        }

        @Override // com.zykj.paint.Actions.EzyPointOrBuilder
        public double getY() {
            return this.f19836y_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getX()))) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getY()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyPoint.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            double d10 = this.f19835x_;
            if (d10 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                codedOutputStream.writeDouble(1, d10);
            }
            double d11 = this.f19836y_;
            if (d11 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                codedOutputStream.writeDouble(2, d11);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyPointOrBuilder {

            /* renamed from: x_ */
            private double f19837x_;

            /* renamed from: y_ */
            private double f19838y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyPoint_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearX() {
                this.f19837x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.f19838y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyPoint_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzyPointOrBuilder
            public double getX() {
                return this.f19837x_;
            }

            @Override // com.zykj.paint.Actions.EzyPointOrBuilder
            public double getY() {
                return this.f19838y_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setX(double d10) {
                this.f19837x_ = d10;
                onChanged();
                return this;
            }

            public Builder setY(double d10) {
                this.f19838y_ = d10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyPoint build() {
                EzyPoint ezyPointBuildPartial = buildPartial();
                if (ezyPointBuildPartial.isInitialized()) {
                    return ezyPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyPoint buildPartial() {
                EzyPoint ezyPoint = new EzyPoint(this);
                ezyPoint.f19835x_ = this.f19837x_;
                ezyPoint.f19836y_ = this.f19838y_;
                onBuilt();
                return ezyPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyPoint getDefaultInstanceForType() {
                return EzyPoint.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.f19837x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                this.f19838y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyPoint) {
                    return mergeFrom((EzyPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzyPoint ezyPoint) {
                if (ezyPoint == EzyPoint.getDefaultInstance()) {
                    return this;
                }
                if (ezyPoint.getX() != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    setX(ezyPoint.getX());
                }
                if (ezyPoint.getY() != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    setY(ezyPoint.getY());
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
            public com.zykj.paint.Actions.EzyPoint.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyPoint.access$10400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyPoint r3 = (com.zykj.paint.Actions.EzyPoint) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyPoint r4 = (com.zykj.paint.Actions.EzyPoint) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyPoint.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyPoint$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyPoint$Builder.smali:675
            }
        }

        public static Builder newBuilder(EzyPoint ezyPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyPoint);
        }

        public static EzyPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyPoint) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyPoint parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzyPoint() {
            this.memoizedIsInitialized = (byte) -1;
            this.f19835x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.f19836y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        public static EzyPoint parseFrom(InputStream inputStream) {
            return (EzyPoint) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzyPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyPoint) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EzyPoint(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 9) {
                                this.f19835x_ = codedInputStream.readDouble();
                            } else if (tag != 17) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.f19836y_ = codedInputStream.readDouble();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static EzyPoint parseFrom(CodedInputStream codedInputStream) {
            return (EzyPoint) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static EzyPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyPoint) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzyPointOrBuilder extends MessageOrBuilder {
        double getX();

        double getY();
    }

    public static final class EzySize extends GeneratedMessageV3 implements EzySizeOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 2;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int height_;
        private byte memoizedIsInitialized;
        private int width_;
        private static final EzySize DEFAULT_INSTANCE = new EzySize();
        private static final Parser<EzySize> PARSER = new AbstractParser<EzySize>() { // from class: com.zykj.paint.Actions.EzySize.1
            @Override // com.google.protobuf.Parser
            public EzySize parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzySize(codedInputStream, extensionRegistryLite);
            }
        };

        public static EzySize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzySize_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzySize parseDelimitedFrom(InputStream inputStream) {
            return (EzySize) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzySize parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzySize> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EzySize)) {
                return super.equals(obj);
            }
            EzySize ezySize = (EzySize) obj;
            return getWidth() == ezySize.getWidth() && getHeight() == ezySize.getHeight();
        }

        @Override // com.zykj.paint.Actions.EzySizeOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzySize> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.width_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.height_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.EzySizeOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getWidth()) * 37) + 2) * 53) + getHeight()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzySize_fieldAccessorTable.ensureFieldAccessorsInitialized(EzySize.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.width_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.height_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzySizeOrBuilder {
            private int height_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzySize_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzySize_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzySizeOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zykj.paint.Actions.EzySizeOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzySize_fieldAccessorTable.ensureFieldAccessorsInitialized(EzySize.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzySize build() {
                EzySize ezySizeBuildPartial = buildPartial();
                if (ezySizeBuildPartial.isInitialized()) {
                    return ezySizeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySizeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzySize buildPartial() {
                EzySize ezySize = new EzySize(this);
                ezySize.width_ = this.width_;
                ezySize.height_ = this.height_;
                onBuilt();
                return ezySize;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzySize getDefaultInstanceForType() {
                return EzySize.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.width_ = 0;
                this.height_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzySize) {
                    return mergeFrom((EzySize) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzySize ezySize) {
                if (ezySize == EzySize.getDefaultInstance()) {
                    return this;
                }
                if (ezySize.getWidth() != 0) {
                    setWidth(ezySize.getWidth());
                }
                if (ezySize.getHeight() != 0) {
                    setHeight(ezySize.getHeight());
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
            public com.zykj.paint.Actions.EzySize.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzySize.access$11400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzySize r3 = (com.zykj.paint.Actions.EzySize) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzySize r4 = (com.zykj.paint.Actions.EzySize) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzySize.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzySize$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzySize$Builder.smali:673
            }
        }

        public static Builder newBuilder(EzySize ezySize) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezySize);
        }

        public static EzySize parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzySize(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzySize parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzySize) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzySize parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzySize getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzySize parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzySize() {
            this.memoizedIsInitialized = (byte) -1;
            this.width_ = 0;
            this.height_ = 0;
        }

        public static EzySize parseFrom(InputStream inputStream) {
            return (EzySize) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzySize parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzySize) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EzySize(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.width_ = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.height_ = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static EzySize parseFrom(CodedInputStream codedInputStream) {
            return (EzySize) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static EzySize parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzySize) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzySizeOrBuilder extends MessageOrBuilder {
        int getHeight();

        int getWidth();
    }

    public static final class EzyVector extends GeneratedMessageV3 implements EzyVectorOrBuilder {
        private static final EzyVector DEFAULT_INSTANCE = new EzyVector();
        private static final Parser<EzyVector> PARSER = new AbstractParser<EzyVector>() { // from class: com.zykj.paint.Actions.EzyVector.1
            @Override // com.google.protobuf.Parser
            public EzyVector parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyVector(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        /* renamed from: x_ */
        private double f19839x_;

        /* renamed from: y_ */
        private double f19840y_;

        public static EzyVector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_EzyVector_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EzyVector parseDelimitedFrom(InputStream inputStream) {
            return (EzyVector) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EzyVector parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EzyVector> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EzyVector)) {
                return super.equals(obj);
            }
            EzyVector ezyVector = (EzyVector) obj;
            return Double.doubleToLongBits(getX()) == Double.doubleToLongBits(ezyVector.getX()) && Double.doubleToLongBits(getY()) == Double.doubleToLongBits(ezyVector.getY());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EzyVector> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            double d10 = this.f19839x_;
            int iComputeDoubleSize = d10 != AudioStats.AUDIO_AMPLITUDE_NONE ? CodedOutputStream.computeDoubleSize(1, d10) : 0;
            double d11 = this.f19840y_;
            if (d11 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                iComputeDoubleSize += CodedOutputStream.computeDoubleSize(2, d11);
            }
            this.memoizedSize = iComputeDoubleSize;
            return iComputeDoubleSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.EzyVectorOrBuilder
        public double getX() {
            return this.f19839x_;
        }

        @Override // com.zykj.paint.Actions.EzyVectorOrBuilder
        public double getY() {
            return this.f19840y_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getX()))) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getY()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_EzyVector_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyVector.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            double d10 = this.f19839x_;
            if (d10 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                codedOutputStream.writeDouble(1, d10);
            }
            double d11 = this.f19840y_;
            if (d11 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                codedOutputStream.writeDouble(2, d11);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EzyVectorOrBuilder {

            /* renamed from: x_ */
            private double f19841x_;

            /* renamed from: y_ */
            private double f19842y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_EzyVector_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearX() {
                this.f19841x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.f19842y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_EzyVector_descriptor;
            }

            @Override // com.zykj.paint.Actions.EzyVectorOrBuilder
            public double getX() {
                return this.f19841x_;
            }

            @Override // com.zykj.paint.Actions.EzyVectorOrBuilder
            public double getY() {
                return this.f19842y_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_EzyVector_fieldAccessorTable.ensureFieldAccessorsInitialized(EzyVector.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setX(double d10) {
                this.f19841x_ = d10;
                onChanged();
                return this;
            }

            public Builder setY(double d10) {
                this.f19842y_ = d10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyVector build() {
                EzyVector ezyVectorBuildPartial = buildPartial();
                if (ezyVectorBuildPartial.isInitialized()) {
                    return ezyVectorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyVectorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EzyVector buildPartial() {
                EzyVector ezyVector = new EzyVector(this);
                ezyVector.f19839x_ = this.f19841x_;
                ezyVector.f19840y_ = this.f19842y_;
                onBuilt();
                return ezyVector;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EzyVector getDefaultInstanceForType() {
                return EzyVector.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.f19841x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                this.f19842y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EzyVector) {
                    return mergeFrom((EzyVector) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EzyVector ezyVector) {
                if (ezyVector == EzyVector.getDefaultInstance()) {
                    return this;
                }
                if (ezyVector.getX() != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    setX(ezyVector.getX());
                }
                if (ezyVector.getY() != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    setY(ezyVector.getY());
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
            public com.zykj.paint.Actions.EzyVector.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyVector.access$12400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyVector r3 = (com.zykj.paint.Actions.EzyVector) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$EzyVector r4 = (com.zykj.paint.Actions.EzyVector) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyVector.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyVector$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$EzyVector$Builder.smali:675
            }
        }

        public static Builder newBuilder(EzyVector ezyVector) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ezyVector);
        }

        public static EzyVector parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EzyVector(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EzyVector parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyVector) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EzyVector parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EzyVector getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EzyVector parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EzyVector() {
            this.memoizedIsInitialized = (byte) -1;
            this.f19839x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.f19840y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        public static EzyVector parseFrom(InputStream inputStream) {
            return (EzyVector) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EzyVector parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyVector) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EzyVector(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 9) {
                                this.f19839x_ = codedInputStream.readDouble();
                            } else if (tag != 17) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.f19840y_ = codedInputStream.readDouble();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static EzyVector parseFrom(CodedInputStream codedInputStream) {
            return (EzyVector) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static EzyVector parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EzyVector) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EzyVectorOrBuilder extends MessageOrBuilder {
        double getX();

        double getY();
    }

    public static final class MoveGraphData extends GeneratedMessageV3 implements MoveGraphDataOrBuilder {
        private static final MoveGraphData DEFAULT_INSTANCE = new MoveGraphData();
        private static final Parser<MoveGraphData> PARSER = new AbstractParser<MoveGraphData>() { // from class: com.zykj.paint.Actions.MoveGraphData.1
            @Override // com.google.protobuf.Parser
            public MoveGraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new MoveGraphData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int VECTOR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private EzyVector vector_;

        public static MoveGraphData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_MoveGraphData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MoveGraphData parseDelimitedFrom(InputStream inputStream) {
            return (MoveGraphData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MoveGraphData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<MoveGraphData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MoveGraphData)) {
                return super.equals(obj);
            }
            MoveGraphData moveGraphData = (MoveGraphData) obj;
            boolean z10 = hasVector() == moveGraphData.hasVector();
            return hasVector() ? z10 && getVector().equals(moveGraphData.getVector()) : z10;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MoveGraphData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.vector_ != null ? CodedOutputStream.computeMessageSize(1, getVector()) : 0;
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.MoveGraphDataOrBuilder
        public EzyVector getVector() {
            EzyVector ezyVector = this.vector_;
            return ezyVector == null ? EzyVector.getDefaultInstance() : ezyVector;
        }

        @Override // com.zykj.paint.Actions.MoveGraphDataOrBuilder
        public EzyVectorOrBuilder getVectorOrBuilder() {
            return getVector();
        }

        @Override // com.zykj.paint.Actions.MoveGraphDataOrBuilder
        public boolean hasVector() {
            return this.vector_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (hasVector()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getVector().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_MoveGraphData_fieldAccessorTable.ensureFieldAccessorsInitialized(MoveGraphData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.vector_ != null) {
                codedOutputStream.writeMessage(1, getVector());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MoveGraphDataOrBuilder {
            private SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> vectorBuilder_;
            private EzyVector vector_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_MoveGraphData_descriptor;
            }

            private SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> getVectorFieldBuilder() {
                if (this.vectorBuilder_ == null) {
                    this.vectorBuilder_ = new SingleFieldBuilderV3<>(getVector(), getParentForChildren(), isClean());
                    this.vector_ = null;
                }
                return this.vectorBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearVector() {
                if (this.vectorBuilder_ == null) {
                    this.vector_ = null;
                    onChanged();
                    return this;
                }
                this.vector_ = null;
                this.vectorBuilder_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_MoveGraphData_descriptor;
            }

            @Override // com.zykj.paint.Actions.MoveGraphDataOrBuilder
            public EzyVector getVector() {
                SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> singleFieldBuilderV3 = this.vectorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyVector) singleFieldBuilderV3.getMessage();
                }
                EzyVector ezyVector = this.vector_;
                return ezyVector == null ? EzyVector.getDefaultInstance() : ezyVector;
            }

            public EzyVector.Builder getVectorBuilder() {
                onChanged();
                return (EzyVector.Builder) getVectorFieldBuilder().getBuilder();
            }

            @Override // com.zykj.paint.Actions.MoveGraphDataOrBuilder
            public EzyVectorOrBuilder getVectorOrBuilder() {
                SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> singleFieldBuilderV3 = this.vectorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyVectorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EzyVector ezyVector = this.vector_;
                return ezyVector == null ? EzyVector.getDefaultInstance() : ezyVector;
            }

            @Override // com.zykj.paint.Actions.MoveGraphDataOrBuilder
            public boolean hasVector() {
                return (this.vectorBuilder_ == null && this.vector_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_MoveGraphData_fieldAccessorTable.ensureFieldAccessorsInitialized(MoveGraphData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder mergeVector(EzyVector ezyVector) {
                SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> singleFieldBuilderV3 = this.vectorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(ezyVector);
                    return this;
                }
                EzyVector ezyVector2 = this.vector_;
                if (ezyVector2 != null) {
                    this.vector_ = EzyVector.newBuilder(ezyVector2).mergeFrom(ezyVector).buildPartial();
                } else {
                    this.vector_ = ezyVector;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setVector(EzyVector ezyVector) {
                SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> singleFieldBuilderV3 = this.vectorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(ezyVector);
                    return this;
                }
                ezyVector.getClass();
                this.vector_ = ezyVector;
                onChanged();
                return this;
            }

            private Builder() {
                this.vector_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MoveGraphData build() {
                MoveGraphData moveGraphDataBuildPartial = buildPartial();
                if (moveGraphDataBuildPartial.isInitialized()) {
                    return moveGraphDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) moveGraphDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MoveGraphData buildPartial() {
                MoveGraphData moveGraphData = new MoveGraphData(this);
                SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> singleFieldBuilderV3 = this.vectorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    moveGraphData.vector_ = this.vector_;
                } else {
                    moveGraphData.vector_ = (EzyVector) singleFieldBuilderV3.build();
                }
                onBuilt();
                return moveGraphData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MoveGraphData getDefaultInstanceForType() {
                return MoveGraphData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.vectorBuilder_ == null) {
                    this.vector_ = null;
                    return this;
                }
                this.vector_ = null;
                this.vectorBuilder_ = null;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.vector_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setVector(EzyVector.Builder builder) {
                SingleFieldBuilderV3<EzyVector, EzyVector.Builder, EzyVectorOrBuilder> singleFieldBuilderV3 = this.vectorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.vector_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MoveGraphData) {
                    return mergeFrom((MoveGraphData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MoveGraphData moveGraphData) {
                if (moveGraphData == MoveGraphData.getDefaultInstance()) {
                    return this;
                }
                if (moveGraphData.hasVector()) {
                    mergeVector(moveGraphData.getVector());
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
            public com.zykj.paint.Actions.MoveGraphData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.MoveGraphData.access$3800()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$MoveGraphData r3 = (com.zykj.paint.Actions.MoveGraphData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$MoveGraphData r4 = (com.zykj.paint.Actions.MoveGraphData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.MoveGraphData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$MoveGraphData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$MoveGraphData$Builder.smali:936
            }
        }

        public static Builder newBuilder(MoveGraphData moveGraphData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(moveGraphData);
        }

        public static MoveGraphData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private MoveGraphData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MoveGraphData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MoveGraphData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MoveGraphData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MoveGraphData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MoveGraphData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MoveGraphData() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MoveGraphData parseFrom(InputStream inputStream) {
            return (MoveGraphData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private MoveGraphData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                EzyVector ezyVector = this.vector_;
                                EzyVector.Builder builder = ezyVector != null ? ezyVector.toBuilder() : null;
                                EzyVector ezyVector2 = (EzyVector) codedInputStream.readMessage(EzyVector.parser(), extensionRegistryLite);
                                this.vector_ = ezyVector2;
                                if (builder != null) {
                                    builder.mergeFrom(ezyVector2);
                                    this.vector_ = builder.buildPartial();
                                }
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static MoveGraphData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MoveGraphData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MoveGraphData parseFrom(CodedInputStream codedInputStream) {
            return (MoveGraphData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static MoveGraphData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MoveGraphData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MoveGraphDataOrBuilder extends MessageOrBuilder {
        EzyVector getVector();

        EzyVectorOrBuilder getVectorOrBuilder();

        boolean hasVector();
    }

    public static final class NewImageData extends GeneratedMessageV3 implements NewImageDataOrBuilder {
        private static final NewImageData DEFAULT_INSTANCE = new NewImageData();
        private static final Parser<NewImageData> PARSER = new AbstractParser<NewImageData>() { // from class: com.zykj.paint.Actions.NewImageData.1
            @Override // com.google.protobuf.Parser
            public NewImageData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NewImageData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int POINT_FIELD_NUMBER = 1;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int SRC_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private EzyPoint point_;
        private EzySize size_;
        private volatile Object src_;

        public static NewImageData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_NewImageData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NewImageData parseDelimitedFrom(InputStream inputStream) {
            return (NewImageData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NewImageData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NewImageData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NewImageData)) {
                return super.equals(obj);
            }
            NewImageData newImageData = (NewImageData) obj;
            boolean z10 = hasPoint() == newImageData.hasPoint();
            if (hasPoint()) {
                z10 = z10 && getPoint().equals(newImageData.getPoint());
            }
            boolean z11 = z10 && hasSize() == newImageData.hasSize();
            if (hasSize()) {
                z11 = z11 && getSize().equals(newImageData.getSize());
            }
            return z11 && getSrc().equals(newImageData.getSrc());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NewImageData> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public EzyPoint getPoint() {
            EzyPoint ezyPoint = this.point_;
            return ezyPoint == null ? EzyPoint.getDefaultInstance() : ezyPoint;
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public EzyPointOrBuilder getPointOrBuilder() {
            return getPoint();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.point_ != null ? CodedOutputStream.computeMessageSize(1, getPoint()) : 0;
            if (this.size_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSize());
            }
            if (!getSrcBytes().isEmpty()) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(3, this.src_);
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public EzySize getSize() {
            EzySize ezySize = this.size_;
            return ezySize == null ? EzySize.getDefaultInstance() : ezySize;
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public EzySizeOrBuilder getSizeOrBuilder() {
            return getSize();
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public String getSrc() {
            Object obj = this.src_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.src_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public ByteString getSrcBytes() {
            Object obj = this.src_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.src_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public boolean hasPoint() {
            return this.point_ != null;
        }

        @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
        public boolean hasSize() {
            return this.size_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (hasPoint()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPoint().hashCode();
            }
            if (hasSize()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSize().hashCode();
            }
            int iHashCode2 = (((((iHashCode * 37) + 3) * 53) + getSrc().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_NewImageData_fieldAccessorTable.ensureFieldAccessorsInitialized(NewImageData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.point_ != null) {
                codedOutputStream.writeMessage(1, getPoint());
            }
            if (this.size_ != null) {
                codedOutputStream.writeMessage(2, getSize());
            }
            if (getSrcBytes().isEmpty()) {
                return;
            }
            GeneratedMessage.writeString(codedOutputStream, 3, this.src_);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NewImageDataOrBuilder {
            private SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> pointBuilder_;
            private EzyPoint point_;
            private SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> sizeBuilder_;
            private EzySize size_;
            private Object src_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_NewImageData_descriptor;
            }

            private SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> getPointFieldBuilder() {
                if (this.pointBuilder_ == null) {
                    this.pointBuilder_ = new SingleFieldBuilderV3<>(getPoint(), getParentForChildren(), isClean());
                    this.point_ = null;
                }
                return this.pointBuilder_;
            }

            private SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> getSizeFieldBuilder() {
                if (this.sizeBuilder_ == null) {
                    this.sizeBuilder_ = new SingleFieldBuilderV3<>(getSize(), getParentForChildren(), isClean());
                    this.size_ = null;
                }
                return this.sizeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPoint() {
                if (this.pointBuilder_ == null) {
                    this.point_ = null;
                    onChanged();
                    return this;
                }
                this.point_ = null;
                this.pointBuilder_ = null;
                return this;
            }

            public Builder clearSize() {
                if (this.sizeBuilder_ == null) {
                    this.size_ = null;
                    onChanged();
                    return this;
                }
                this.size_ = null;
                this.sizeBuilder_ = null;
                return this;
            }

            public Builder clearSrc() {
                this.src_ = NewImageData.getDefaultInstance().getSrc();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_NewImageData_descriptor;
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public EzyPoint getPoint() {
                SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyPoint) singleFieldBuilderV3.getMessage();
                }
                EzyPoint ezyPoint = this.point_;
                return ezyPoint == null ? EzyPoint.getDefaultInstance() : ezyPoint;
            }

            public EzyPoint.Builder getPointBuilder() {
                onChanged();
                return (EzyPoint.Builder) getPointFieldBuilder().getBuilder();
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public EzyPointOrBuilder getPointOrBuilder() {
                SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EzyPoint ezyPoint = this.point_;
                return ezyPoint == null ? EzyPoint.getDefaultInstance() : ezyPoint;
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public EzySize getSize() {
                SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> singleFieldBuilderV3 = this.sizeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzySize) singleFieldBuilderV3.getMessage();
                }
                EzySize ezySize = this.size_;
                return ezySize == null ? EzySize.getDefaultInstance() : ezySize;
            }

            public EzySize.Builder getSizeBuilder() {
                onChanged();
                return (EzySize.Builder) getSizeFieldBuilder().getBuilder();
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public EzySizeOrBuilder getSizeOrBuilder() {
                SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> singleFieldBuilderV3 = this.sizeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzySizeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EzySize ezySize = this.size_;
                return ezySize == null ? EzySize.getDefaultInstance() : ezySize;
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public String getSrc() {
                Object obj = this.src_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.src_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public ByteString getSrcBytes() {
                Object obj = this.src_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.src_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public boolean hasPoint() {
                return (this.pointBuilder_ == null && this.point_ == null) ? false : true;
            }

            @Override // com.zykj.paint.Actions.NewImageDataOrBuilder
            public boolean hasSize() {
                return (this.sizeBuilder_ == null && this.size_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_NewImageData_fieldAccessorTable.ensureFieldAccessorsInitialized(NewImageData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergePoint(EzyPoint ezyPoint) {
                SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(ezyPoint);
                    return this;
                }
                EzyPoint ezyPoint2 = this.point_;
                if (ezyPoint2 != null) {
                    this.point_ = EzyPoint.newBuilder(ezyPoint2).mergeFrom(ezyPoint).buildPartial();
                } else {
                    this.point_ = ezyPoint;
                }
                onChanged();
                return this;
            }

            public Builder mergeSize(EzySize ezySize) {
                SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> singleFieldBuilderV3 = this.sizeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(ezySize);
                    return this;
                }
                EzySize ezySize2 = this.size_;
                if (ezySize2 != null) {
                    this.size_ = EzySize.newBuilder(ezySize2).mergeFrom(ezySize).buildPartial();
                } else {
                    this.size_ = ezySize;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setPoint(EzyPoint ezyPoint) {
                SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(ezyPoint);
                    return this;
                }
                ezyPoint.getClass();
                this.point_ = ezyPoint;
                onChanged();
                return this;
            }

            public Builder setSize(EzySize ezySize) {
                SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> singleFieldBuilderV3 = this.sizeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(ezySize);
                    return this;
                }
                ezySize.getClass();
                this.size_ = ezySize;
                onChanged();
                return this;
            }

            public Builder setSrc(String str) {
                str.getClass();
                this.src_ = str;
                onChanged();
                return this;
            }

            public Builder setSrcBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.src_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.point_ = null;
                this.size_ = null;
                this.src_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewImageData build() {
                NewImageData newImageDataBuildPartial = buildPartial();
                if (newImageDataBuildPartial.isInitialized()) {
                    return newImageDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) newImageDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewImageData buildPartial() {
                NewImageData newImageData = new NewImageData(this);
                SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    newImageData.point_ = this.point_;
                } else {
                    newImageData.point_ = (EzyPoint) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> singleFieldBuilderV32 = this.sizeBuilder_;
                if (singleFieldBuilderV32 == null) {
                    newImageData.size_ = this.size_;
                } else {
                    newImageData.size_ = (EzySize) singleFieldBuilderV32.build();
                }
                newImageData.src_ = this.src_;
                onBuilt();
                return newImageData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NewImageData getDefaultInstanceForType() {
                return NewImageData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.pointBuilder_ == null) {
                    this.point_ = null;
                } else {
                    this.point_ = null;
                    this.pointBuilder_ = null;
                }
                if (this.sizeBuilder_ == null) {
                    this.size_ = null;
                } else {
                    this.size_ = null;
                    this.sizeBuilder_ = null;
                }
                this.src_ = "";
                return this;
            }

            public Builder setPoint(EzyPoint.Builder builder) {
                SingleFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.point_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setSize(EzySize.Builder builder) {
                SingleFieldBuilderV3<EzySize, EzySize.Builder, EzySizeOrBuilder> singleFieldBuilderV3 = this.sizeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.size_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NewImageData) {
                    return mergeFrom((NewImageData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.point_ = null;
                this.size_ = null;
                this.src_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(NewImageData newImageData) {
                if (newImageData == NewImageData.getDefaultInstance()) {
                    return this;
                }
                if (newImageData.hasPoint()) {
                    mergePoint(newImageData.getPoint());
                }
                if (newImageData.hasSize()) {
                    mergeSize(newImageData.getSize());
                }
                if (!newImageData.getSrc().isEmpty()) {
                    this.src_ = newImageData.src_;
                    onChanged();
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
            public com.zykj.paint.Actions.NewImageData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.NewImageData.access$6700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$NewImageData r3 = (com.zykj.paint.Actions.NewImageData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$NewImageData r4 = (com.zykj.paint.Actions.NewImageData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.NewImageData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$NewImageData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$NewImageData$Builder.smali:1417
            }
        }

        public static Builder newBuilder(NewImageData newImageData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(newImageData);
        }

        public static NewImageData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private NewImageData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NewImageData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewImageData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewImageData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NewImageData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static NewImageData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private NewImageData() {
            this.memoizedIsInitialized = (byte) -1;
            this.src_ = "";
        }

        public static NewImageData parseFrom(InputStream inputStream) {
            return (NewImageData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static NewImageData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewImageData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private NewImageData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                EzyPoint ezyPoint = this.point_;
                                EzyPoint.Builder builder = ezyPoint != null ? ezyPoint.toBuilder() : null;
                                EzyPoint ezyPoint2 = (EzyPoint) codedInputStream.readMessage(EzyPoint.parser(), extensionRegistryLite);
                                this.point_ = ezyPoint2;
                                if (builder != null) {
                                    builder.mergeFrom(ezyPoint2);
                                    this.point_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                EzySize ezySize = this.size_;
                                EzySize.Builder builder2 = ezySize != null ? ezySize.toBuilder() : null;
                                EzySize ezySize2 = (EzySize) codedInputStream.readMessage(EzySize.parser(), extensionRegistryLite);
                                this.size_ = ezySize2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(ezySize2);
                                    this.size_ = builder2.buildPartial();
                                }
                            } else if (tag != 26) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.src_ = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static NewImageData parseFrom(CodedInputStream codedInputStream) {
            return (NewImageData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static NewImageData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewImageData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NewImageDataOrBuilder extends MessageOrBuilder {
        EzyPoint getPoint();

        EzyPointOrBuilder getPointOrBuilder();

        EzySize getSize();

        EzySizeOrBuilder getSizeOrBuilder();

        String getSrc();

        ByteString getSrcBytes();

        boolean hasPoint();

        boolean hasSize();
    }

    public static final class NewLayerData extends GeneratedMessageV3 implements NewLayerDataOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final NewLayerData DEFAULT_INSTANCE = new NewLayerData();
        private static final Parser<NewLayerData> PARSER = new AbstractParser<NewLayerData>() { // from class: com.zykj.paint.Actions.NewLayerData.1
            @Override // com.google.protobuf.Parser
            public NewLayerData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NewLayerData(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private EzyColor color_;
        private byte memoizedIsInitialized;

        public static NewLayerData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_NewLayerData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NewLayerData parseDelimitedFrom(InputStream inputStream) {
            return (NewLayerData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NewLayerData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NewLayerData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NewLayerData)) {
                return super.equals(obj);
            }
            NewLayerData newLayerData = (NewLayerData) obj;
            boolean z10 = hasColor() == newLayerData.hasColor();
            return hasColor() ? z10 && getColor().equals(newLayerData.getColor()) : z10;
        }

        @Override // com.zykj.paint.Actions.NewLayerDataOrBuilder
        public EzyColor getColor() {
            EzyColor ezyColor = this.color_;
            return ezyColor == null ? EzyColor.getDefaultInstance() : ezyColor;
        }

        @Override // com.zykj.paint.Actions.NewLayerDataOrBuilder
        public EzyColorOrBuilder getColorOrBuilder() {
            return getColor();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NewLayerData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.color_ != null ? CodedOutputStream.computeMessageSize(1, getColor()) : 0;
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.NewLayerDataOrBuilder
        public boolean hasColor() {
            return this.color_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (hasColor()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getColor().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_NewLayerData_fieldAccessorTable.ensureFieldAccessorsInitialized(NewLayerData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.color_ != null) {
                codedOutputStream.writeMessage(1, getColor());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NewLayerDataOrBuilder {
            private SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> colorBuilder_;
            private EzyColor color_;

            private SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> getColorFieldBuilder() {
                if (this.colorBuilder_ == null) {
                    this.colorBuilder_ = new SingleFieldBuilderV3<>(getColor(), getParentForChildren(), isClean());
                    this.color_ = null;
                }
                return this.colorBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_NewLayerData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearColor() {
                if (this.colorBuilder_ == null) {
                    this.color_ = null;
                    onChanged();
                    return this;
                }
                this.color_ = null;
                this.colorBuilder_ = null;
                return this;
            }

            @Override // com.zykj.paint.Actions.NewLayerDataOrBuilder
            public EzyColor getColor() {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyColor) singleFieldBuilderV3.getMessage();
                }
                EzyColor ezyColor = this.color_;
                return ezyColor == null ? EzyColor.getDefaultInstance() : ezyColor;
            }

            public EzyColor.Builder getColorBuilder() {
                onChanged();
                return (EzyColor.Builder) getColorFieldBuilder().getBuilder();
            }

            @Override // com.zykj.paint.Actions.NewLayerDataOrBuilder
            public EzyColorOrBuilder getColorOrBuilder() {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyColorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EzyColor ezyColor = this.color_;
                return ezyColor == null ? EzyColor.getDefaultInstance() : ezyColor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_NewLayerData_descriptor;
            }

            @Override // com.zykj.paint.Actions.NewLayerDataOrBuilder
            public boolean hasColor() {
                return (this.colorBuilder_ == null && this.color_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_NewLayerData_fieldAccessorTable.ensureFieldAccessorsInitialized(NewLayerData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeColor(EzyColor ezyColor) {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(ezyColor);
                    return this;
                }
                EzyColor ezyColor2 = this.color_;
                if (ezyColor2 != null) {
                    this.color_ = EzyColor.newBuilder(ezyColor2).mergeFrom(ezyColor).buildPartial();
                } else {
                    this.color_ = ezyColor;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setColor(EzyColor ezyColor) {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(ezyColor);
                    return this;
                }
                ezyColor.getClass();
                this.color_ = ezyColor;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.color_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewLayerData build() {
                NewLayerData newLayerDataBuildPartial = buildPartial();
                if (newLayerDataBuildPartial.isInitialized()) {
                    return newLayerDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) newLayerDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewLayerData buildPartial() {
                NewLayerData newLayerData = new NewLayerData(this);
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    newLayerData.color_ = this.color_;
                } else {
                    newLayerData.color_ = (EzyColor) singleFieldBuilderV3.build();
                }
                onBuilt();
                return newLayerData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NewLayerData getDefaultInstanceForType() {
                return NewLayerData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.colorBuilder_ == null) {
                    this.color_ = null;
                    return this;
                }
                this.color_ = null;
                this.colorBuilder_ = null;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.color_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setColor(EzyColor.Builder builder) {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.color_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NewLayerData) {
                    return mergeFrom((NewLayerData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NewLayerData newLayerData) {
                if (newLayerData == NewLayerData.getDefaultInstance()) {
                    return this;
                }
                if (newLayerData.hasColor()) {
                    mergeColor(newLayerData.getColor());
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
            public com.zykj.paint.Actions.NewLayerData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.NewLayerData.access$5600()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$NewLayerData r3 = (com.zykj.paint.Actions.NewLayerData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$NewLayerData r4 = (com.zykj.paint.Actions.NewLayerData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.NewLayerData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$NewLayerData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$NewLayerData$Builder.smali:1010
            }
        }

        public static Builder newBuilder(NewLayerData newLayerData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(newLayerData);
        }

        public static NewLayerData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private NewLayerData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NewLayerData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewLayerData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewLayerData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NewLayerData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static NewLayerData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private NewLayerData() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NewLayerData parseFrom(InputStream inputStream) {
            return (NewLayerData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private NewLayerData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                EzyColor ezyColor = this.color_;
                                EzyColor.Builder builder = ezyColor != null ? ezyColor.toBuilder() : null;
                                EzyColor ezyColor2 = (EzyColor) codedInputStream.readMessage(EzyColor.parser(), extensionRegistryLite);
                                this.color_ = ezyColor2;
                                if (builder != null) {
                                    builder.mergeFrom(ezyColor2);
                                    this.color_ = builder.buildPartial();
                                }
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static NewLayerData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewLayerData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewLayerData parseFrom(CodedInputStream codedInputStream) {
            return (NewLayerData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static NewLayerData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewLayerData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NewLayerDataOrBuilder extends MessageOrBuilder {
        EzyColor getColor();

        EzyColorOrBuilder getColorOrBuilder();

        boolean hasColor();
    }

    public static final class NewPolylineData extends GeneratedMessageV3 implements NewPolylineDataOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final NewPolylineData DEFAULT_INSTANCE = new NewPolylineData();
        private static final Parser<NewPolylineData> PARSER = new AbstractParser<NewPolylineData>() { // from class: com.zykj.paint.Actions.NewPolylineData.1
            @Override // com.google.protobuf.Parser
            public NewPolylineData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NewPolylineData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int POINTS_FIELD_NUMBER = 1;
        public static final int STICKYGRAPHID_FIELD_NUMBER = 4;
        public static final int WIDTH_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EzyColor color_;
        private byte memoizedIsInitialized;
        private List<EzyPoint> points_;
        private int stickyGraphId_;
        private double width_;

        public static NewPolylineData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_NewPolylineData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NewPolylineData parseDelimitedFrom(InputStream inputStream) {
            return (NewPolylineData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NewPolylineData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NewPolylineData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NewPolylineData)) {
                return super.equals(obj);
            }
            NewPolylineData newPolylineData = (NewPolylineData) obj;
            boolean z10 = getPointsList().equals(newPolylineData.getPointsList()) && hasColor() == newPolylineData.hasColor();
            if (hasColor()) {
                z10 = z10 && getColor().equals(newPolylineData.getColor());
            }
            return (z10 && (Double.doubleToLongBits(getWidth()) > Double.doubleToLongBits(newPolylineData.getWidth()) ? 1 : (Double.doubleToLongBits(getWidth()) == Double.doubleToLongBits(newPolylineData.getWidth()) ? 0 : -1)) == 0) && getStickyGraphId() == newPolylineData.getStickyGraphId();
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public EzyColor getColor() {
            EzyColor ezyColor = this.color_;
            return ezyColor == null ? EzyColor.getDefaultInstance() : ezyColor;
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public EzyColorOrBuilder getColorOrBuilder() {
            return getColor();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NewPolylineData> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public EzyPoint getPoints(int i10) {
            return this.points_.get(i10);
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public int getPointsCount() {
            return this.points_.size();
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public List<EzyPoint> getPointsList() {
            return this.points_;
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public EzyPointOrBuilder getPointsOrBuilder(int i10) {
            return this.points_.get(i10);
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public List<? extends EzyPointOrBuilder> getPointsOrBuilderList() {
            return this.points_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = 0;
            for (int i11 = 0; i11 < this.points_.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.points_.get(i11));
            }
            if (this.color_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, getColor());
            }
            double d10 = this.width_;
            if (d10 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, d10);
            }
            int i12 = this.stickyGraphId_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i12);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public int getStickyGraphId() {
            return this.stickyGraphId_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public double getWidth() {
            return this.width_;
        }

        @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
        public boolean hasColor() {
            return this.color_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (getPointsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPointsList().hashCode();
            }
            if (hasColor()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getColor().hashCode();
            }
            int iHashLong = (((((((((iHashCode * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getWidth()))) * 37) + 4) * 53) + getStickyGraphId()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashLong;
            return iHashLong;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_NewPolylineData_fieldAccessorTable.ensureFieldAccessorsInitialized(NewPolylineData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.points_.size(); i10++) {
                codedOutputStream.writeMessage(1, this.points_.get(i10));
            }
            if (this.color_ != null) {
                codedOutputStream.writeMessage(2, getColor());
            }
            double d10 = this.width_;
            if (d10 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                codedOutputStream.writeDouble(3, d10);
            }
            int i11 = this.stickyGraphId_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(4, i11);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NewPolylineDataOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> colorBuilder_;
            private EzyColor color_;
            private RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> pointsBuilder_;
            private List<EzyPoint> points_;
            private int stickyGraphId_;
            private double width_;

            private void ensurePointsIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.points_ = new ArrayList(this.points_);
                    this.bitField0_ |= 1;
                }
            }

            private SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> getColorFieldBuilder() {
                if (this.colorBuilder_ == null) {
                    this.colorBuilder_ = new SingleFieldBuilderV3<>(getColor(), getParentForChildren(), isClean());
                    this.color_ = null;
                }
                return this.colorBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_NewPolylineData_descriptor;
            }

            private RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> getPointsFieldBuilder() {
                if (this.pointsBuilder_ == null) {
                    this.pointsBuilder_ = new RepeatedFieldBuilderV3<>(this.points_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                    this.points_ = null;
                }
                return this.pointsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getPointsFieldBuilder();
                }
            }

            public Builder addAllPoints(Iterable<? extends EzyPoint> iterable) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.points_);
                onChanged();
                return this;
            }

            public Builder addPoints(EzyPoint ezyPoint) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(ezyPoint);
                    return this;
                }
                ezyPoint.getClass();
                ensurePointsIsMutable();
                this.points_.add(ezyPoint);
                onChanged();
                return this;
            }

            public EzyPoint.Builder addPointsBuilder() {
                return (EzyPoint.Builder) getPointsFieldBuilder().addBuilder(EzyPoint.getDefaultInstance());
            }

            public Builder clearColor() {
                if (this.colorBuilder_ == null) {
                    this.color_ = null;
                    onChanged();
                    return this;
                }
                this.color_ = null;
                this.colorBuilder_ = null;
                return this;
            }

            public Builder clearPoints() {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.points_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStickyGraphId() {
                this.stickyGraphId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                onChanged();
                return this;
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public EzyColor getColor() {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyColor) singleFieldBuilderV3.getMessage();
                }
                EzyColor ezyColor = this.color_;
                return ezyColor == null ? EzyColor.getDefaultInstance() : ezyColor;
            }

            public EzyColor.Builder getColorBuilder() {
                onChanged();
                return (EzyColor.Builder) getColorFieldBuilder().getBuilder();
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public EzyColorOrBuilder getColorOrBuilder() {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EzyColorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EzyColor ezyColor = this.color_;
                return ezyColor == null ? EzyColor.getDefaultInstance() : ezyColor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_NewPolylineData_descriptor;
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public EzyPoint getPoints(int i10) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.points_.get(i10) : (EzyPoint) repeatedFieldBuilderV3.getMessage(i10);
            }

            public EzyPoint.Builder getPointsBuilder(int i10) {
                return (EzyPoint.Builder) getPointsFieldBuilder().getBuilder(i10);
            }

            public List<EzyPoint.Builder> getPointsBuilderList() {
                return getPointsFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public int getPointsCount() {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.points_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public List<EzyPoint> getPointsList() {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.points_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public EzyPointOrBuilder getPointsOrBuilder(int i10) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.points_.get(i10) : (EzyPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public List<? extends EzyPointOrBuilder> getPointsOrBuilderList() {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.points_);
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public int getStickyGraphId() {
                return this.stickyGraphId_;
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public double getWidth() {
                return this.width_;
            }

            @Override // com.zykj.paint.Actions.NewPolylineDataOrBuilder
            public boolean hasColor() {
                return (this.colorBuilder_ == null && this.color_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_NewPolylineData_fieldAccessorTable.ensureFieldAccessorsInitialized(NewPolylineData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeColor(EzyColor ezyColor) {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(ezyColor);
                    return this;
                }
                EzyColor ezyColor2 = this.color_;
                if (ezyColor2 != null) {
                    this.color_ = EzyColor.newBuilder(ezyColor2).mergeFrom(ezyColor).buildPartial();
                } else {
                    this.color_ = ezyColor;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removePoints(int i10) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i10);
                    return this;
                }
                ensurePointsIsMutable();
                this.points_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setColor(EzyColor ezyColor) {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(ezyColor);
                    return this;
                }
                ezyColor.getClass();
                this.color_ = ezyColor;
                onChanged();
                return this;
            }

            public Builder setPoints(int i10, EzyPoint ezyPoint) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, ezyPoint);
                    return this;
                }
                ezyPoint.getClass();
                ensurePointsIsMutable();
                this.points_.set(i10, ezyPoint);
                onChanged();
                return this;
            }

            public Builder setStickyGraphId(int i10) {
                this.stickyGraphId_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setWidth(double d10) {
                this.width_ = d10;
                onChanged();
                return this;
            }

            private Builder() {
                this.points_ = Collections.EMPTY_LIST;
                this.color_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewPolylineData build() {
                NewPolylineData newPolylineDataBuildPartial = buildPartial();
                if (newPolylineDataBuildPartial.isInitialized()) {
                    return newPolylineDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) newPolylineDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewPolylineData buildPartial() {
                NewPolylineData newPolylineData = new NewPolylineData(this);
                int i10 = this.bitField0_;
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i10 & 1) == 1) {
                        this.points_ = Collections.unmodifiableList(this.points_);
                        this.bitField0_ &= -2;
                    }
                    newPolylineData.points_ = this.points_;
                } else {
                    newPolylineData.points_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    newPolylineData.color_ = this.color_;
                } else {
                    newPolylineData.color_ = (EzyColor) singleFieldBuilderV3.build();
                }
                newPolylineData.width_ = this.width_;
                newPolylineData.stickyGraphId_ = this.stickyGraphId_;
                newPolylineData.bitField0_ = 0;
                onBuilt();
                return newPolylineData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NewPolylineData getDefaultInstanceForType() {
                return NewPolylineData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public EzyPoint.Builder addPointsBuilder(int i10) {
                return (EzyPoint.Builder) getPointsFieldBuilder().addBuilder(i10, EzyPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.points_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.colorBuilder_ == null) {
                    this.color_ = null;
                } else {
                    this.color_ = null;
                    this.colorBuilder_ = null;
                }
                this.width_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                this.stickyGraphId_ = 0;
                return this;
            }

            public Builder setColor(EzyColor.Builder builder) {
                SingleFieldBuilderV3<EzyColor, EzyColor.Builder, EzyColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.color_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.points_ = Collections.EMPTY_LIST;
                this.color_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder addPoints(int i10, EzyPoint ezyPoint) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ezyPoint.getClass();
                    ensurePointsIsMutable();
                    this.points_.add(i10, ezyPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, ezyPoint);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NewPolylineData) {
                    return mergeFrom((NewPolylineData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPoints(int i10, EzyPoint.Builder builder) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointsIsMutable();
                    this.points_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(NewPolylineData newPolylineData) {
                if (newPolylineData == NewPolylineData.getDefaultInstance()) {
                    return this;
                }
                if (this.pointsBuilder_ == null) {
                    if (!newPolylineData.points_.isEmpty()) {
                        if (this.points_.isEmpty()) {
                            this.points_ = newPolylineData.points_;
                            this.bitField0_ &= -2;
                        } else {
                            ensurePointsIsMutable();
                            this.points_.addAll(newPolylineData.points_);
                        }
                        onChanged();
                    }
                } else if (!newPolylineData.points_.isEmpty()) {
                    if (!this.pointsBuilder_.isEmpty()) {
                        this.pointsBuilder_.addAllMessages(newPolylineData.points_);
                    } else {
                        this.pointsBuilder_.dispose();
                        this.pointsBuilder_ = null;
                        this.points_ = newPolylineData.points_;
                        this.bitField0_ &= -2;
                        this.pointsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                    }
                }
                if (newPolylineData.hasColor()) {
                    mergeColor(newPolylineData.getColor());
                }
                if (newPolylineData.getWidth() != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    setWidth(newPolylineData.getWidth());
                }
                if (newPolylineData.getStickyGraphId() != 0) {
                    setStickyGraphId(newPolylineData.getStickyGraphId());
                }
                onChanged();
                return this;
            }

            public Builder addPoints(EzyPoint.Builder builder) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointsIsMutable();
                    this.points_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addPoints(int i10, EzyPoint.Builder builder) {
                RepeatedFieldBuilderV3<EzyPoint, EzyPoint.Builder, EzyPointOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointsIsMutable();
                    this.points_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.paint.Actions.NewPolylineData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.NewPolylineData.access$8200()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$NewPolylineData r3 = (com.zykj.paint.Actions.NewPolylineData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$NewPolylineData r4 = (com.zykj.paint.Actions.NewPolylineData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.NewPolylineData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$NewPolylineData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$NewPolylineData$Builder.smali:1929
            }
        }

        public static Builder newBuilder(NewPolylineData newPolylineData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(newPolylineData);
        }

        public static NewPolylineData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private NewPolylineData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NewPolylineData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewPolylineData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewPolylineData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NewPolylineData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static NewPolylineData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private NewPolylineData() {
            this.memoizedIsInitialized = (byte) -1;
            this.points_ = Collections.EMPTY_LIST;
            this.width_ = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.stickyGraphId_ = 0;
        }

        public static NewPolylineData parseFrom(InputStream inputStream) {
            return (NewPolylineData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static NewPolylineData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewPolylineData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewPolylineData parseFrom(CodedInputStream codedInputStream) {
            return (NewPolylineData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private NewPolylineData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!z11) {
                                    this.points_ = new ArrayList();
                                    z11 = true;
                                }
                                this.points_.add((EzyPoint) codedInputStream.readMessage(EzyPoint.parser(), extensionRegistryLite));
                            } else if (tag == 18) {
                                EzyColor ezyColor = this.color_;
                                EzyColor.Builder builder = ezyColor != null ? ezyColor.toBuilder() : null;
                                EzyColor ezyColor2 = (EzyColor) codedInputStream.readMessage(EzyColor.parser(), extensionRegistryLite);
                                this.color_ = ezyColor2;
                                if (builder != null) {
                                    builder.mergeFrom(ezyColor2);
                                    this.color_ = builder.buildPartial();
                                }
                            } else if (tag == 25) {
                                this.width_ = codedInputStream.readDouble();
                            } else if (tag != 32) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.stickyGraphId_ = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.points_ = Collections.unmodifiableList(this.points_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11) {
                this.points_ = Collections.unmodifiableList(this.points_);
            }
            makeExtensionsImmutable();
        }

        public static NewPolylineData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewPolylineData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NewPolylineDataOrBuilder extends MessageOrBuilder {
        EzyColor getColor();

        EzyColorOrBuilder getColorOrBuilder();

        EzyPoint getPoints(int i10);

        int getPointsCount();

        List<EzyPoint> getPointsList();

        EzyPointOrBuilder getPointsOrBuilder(int i10);

        List<? extends EzyPointOrBuilder> getPointsOrBuilderList();

        int getStickyGraphId();

        double getWidth();

        boolean hasColor();
    }

    public static final class ZoomGraphData extends GeneratedMessageV3 implements ZoomGraphDataOrBuilder {
        private static final ZoomGraphData DEFAULT_INSTANCE = new ZoomGraphData();
        private static final Parser<ZoomGraphData> PARSER = new AbstractParser<ZoomGraphData>() { // from class: com.zykj.paint.Actions.ZoomGraphData.1
            @Override // com.google.protobuf.Parser
            public ZoomGraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ZoomGraphData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SCALE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private double scale_;

        public static ZoomGraphData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Actions.internal_static_ZoomGraphData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ZoomGraphData parseDelimitedFrom(InputStream inputStream) {
            return (ZoomGraphData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ZoomGraphData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ZoomGraphData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof ZoomGraphData) ? super.equals(obj) : Double.doubleToLongBits(getScale()) == Double.doubleToLongBits(((ZoomGraphData) obj).getScale());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ZoomGraphData> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.paint.Actions.ZoomGraphDataOrBuilder
        public double getScale() {
            return this.scale_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            double d10 = this.scale_;
            int iComputeDoubleSize = d10 != AudioStats.AUDIO_AMPLITUDE_NONE ? CodedOutputStream.computeDoubleSize(1, d10) : 0;
            this.memoizedSize = iComputeDoubleSize;
            return iComputeDoubleSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getScale()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.internal_static_ZoomGraphData_fieldAccessorTable.ensureFieldAccessorsInitialized(ZoomGraphData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            double d10 = this.scale_;
            if (d10 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                codedOutputStream.writeDouble(1, d10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ZoomGraphDataOrBuilder {
            private double scale_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Actions.internal_static_ZoomGraphData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearScale() {
                this.scale_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.internal_static_ZoomGraphData_descriptor;
            }

            @Override // com.zykj.paint.Actions.ZoomGraphDataOrBuilder
            public double getScale() {
                return this.scale_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.internal_static_ZoomGraphData_fieldAccessorTable.ensureFieldAccessorsInitialized(ZoomGraphData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setScale(double d10) {
                this.scale_ = d10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ZoomGraphData build() {
                ZoomGraphData zoomGraphDataBuildPartial = buildPartial();
                if (zoomGraphDataBuildPartial.isInitialized()) {
                    return zoomGraphDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) zoomGraphDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ZoomGraphData buildPartial() {
                ZoomGraphData zoomGraphData = new ZoomGraphData(this);
                zoomGraphData.scale_ = this.scale_;
                onBuilt();
                return zoomGraphData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ZoomGraphData getDefaultInstanceForType() {
                return ZoomGraphData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.scale_ = AudioStats.AUDIO_AMPLITUDE_NONE;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ZoomGraphData) {
                    return mergeFrom((ZoomGraphData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ZoomGraphData zoomGraphData) {
                if (zoomGraphData == ZoomGraphData.getDefaultInstance()) {
                    return this;
                }
                if (zoomGraphData.getScale() != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    setScale(zoomGraphData.getScale());
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
            public com.zykj.paint.Actions.ZoomGraphData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.ZoomGraphData.access$4700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$ZoomGraphData r3 = (com.zykj.paint.Actions.ZoomGraphData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.paint.Actions$ZoomGraphData r4 = (com.zykj.paint.Actions.ZoomGraphData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.ZoomGraphData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$ZoomGraphData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/paint/Actions$ZoomGraphData$Builder.smali:634
            }
        }

        public static Builder newBuilder(ZoomGraphData zoomGraphData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(zoomGraphData);
        }

        public static ZoomGraphData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ZoomGraphData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ZoomGraphData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ZoomGraphData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ZoomGraphData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ZoomGraphData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ZoomGraphData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ZoomGraphData() {
            this.memoizedIsInitialized = (byte) -1;
            this.scale_ = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        public static ZoomGraphData parseFrom(InputStream inputStream) {
            return (ZoomGraphData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ZoomGraphData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ZoomGraphData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ZoomGraphData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 9) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.scale_ = codedInputStream.readDouble();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static ZoomGraphData parseFrom(CodedInputStream codedInputStream) {
            return (ZoomGraphData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ZoomGraphData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ZoomGraphData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ZoomGraphDataOrBuilder extends MessageOrBuilder {
        double getScale();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\ractions.proto\u001a\u0019google/protobuf/any.proto\"w\n\tEzyAction\u0012\u000f\n\u0007StartAt\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bDuration\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nActionType\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007GraphId\u0018\u0004 \u0001(\u0005\u0012\"\n\u0004Data\u0018\u0005 \u0001(\u000b2\u0014.google.protobuf.Any\"$\n\rEzyActionData\u0012\u0013\n\u000bPlaceHolder\u0018\u0001 \u0001(\u0005\"\u001f\n\rEzyMatrixData\u0012\u000e\n\u0006values\u0018\u0001 \u0003(\u0002\"+\n\rMoveGraphData\u0012\u001a\n\u0006Vector\u0018\u0001 \u0001(\u000b2\n.EzyVector\"\u001e\n\rZoomGraphData\u0012\r\n\u0005Scale\u0018\u0001 \u0001(\u0001\"(\n\fNewLayerData\u0012\u0018\n\u0005Color\u0018\u0001 \u0001(\u000b2\t.EzyColor\"M\n\fNewImageData\u0012\u0018\n\u0005Point\u0018\u0001 \u0001(\u000b2\t.EzyPoint\u0012\u0016\n\u0004S", "ize\u0018\u0002 \u0001(\u000b2\b.EzySize\u0012\u000b\n\u0003Src\u0018\u0003 \u0001(\t\"l\n\u000fNewPolylineData\u0012\u0019\n\u0006Points\u0018\u0001 \u0003(\u000b2\t.EzyPoint\u0012\u0018\n\u0005Color\u0018\u0002 \u0001(\u000b2\t.EzyColor\u0012\r\n\u0005Width\u0018\u0003 \u0001(\u0001\u0012\u0015\n\rStickyGraphId\u0018\u0004 \u0001(\u0005\"C\n\bEzyColor\u0012\u000b\n\u0003Red\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005Green\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004Blue\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005Alpha\u0018\u0004 \u0001(\u0005\" \n\bEzyPoint\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"(\n\u0007EzySize\u0012\r\n\u0005Width\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006Height\u0018\u0002 \u0001(\u0005\"!\n\tEzyVector\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"+\n\rEzyActionList\u0012\u001a\n\u0006action\u0018\u0001 \u0003(\u000b2\n.EzyActionB*\n\u000ecom.zykj.paintª\u0002\u0017EzyCoursePla", "yer.Actionsb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zykj.paint.Actions.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = Actions.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_EzyAction_descriptor = descriptor2;
        internal_static_EzyAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StartAt", "Duration", "ActionType", "GraphId", "Data"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_EzyActionData_descriptor = descriptor3;
        internal_static_EzyActionData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"PlaceHolder"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_EzyMatrixData_descriptor = descriptor4;
        internal_static_EzyMatrixData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Values"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_MoveGraphData_descriptor = descriptor5;
        internal_static_MoveGraphData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Vector"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_ZoomGraphData_descriptor = descriptor6;
        internal_static_ZoomGraphData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Scale"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_NewLayerData_descriptor = descriptor7;
        internal_static_NewLayerData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Color"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_NewImageData_descriptor = descriptor8;
        internal_static_NewImageData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Point", "Size", "Src"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_NewPolylineData_descriptor = descriptor9;
        internal_static_NewPolylineData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Points", "Color", "Width", "StickyGraphId"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_EzyColor_descriptor = descriptor10;
        internal_static_EzyColor_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Red", "Green", "Blue", "Alpha"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_EzyPoint_descriptor = descriptor11;
        internal_static_EzyPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_EzySize_descriptor = descriptor12;
        internal_static_EzySize_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Width", "Height"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_EzyVector_descriptor = descriptor13;
        internal_static_EzyVector_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_EzyActionList_descriptor = descriptor14;
        internal_static_EzyActionList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Action"});
        AnyProto.getDescriptor();
    }

    private Actions() {
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

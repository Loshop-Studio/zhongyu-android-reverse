package com.zykj.sketch;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

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
import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessage;
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
import com.google.protobuf.WrappersProto;
import com.zykj.sketch.GraphSnapshot;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.android.agoo.common.Config;

/* loaded from: classes6.dex */
public final class EzyDrawBoard {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_ActionClearBoard_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionClearBoard_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionContent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionContent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionDrawConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionDrawConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionFitterConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionFitterConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionGraphConfig_GraphConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionGraphConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionGraphConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionImageConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionImageConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionModeConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionModeConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionNextAction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionNextAction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionPrevAction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionPrevAction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionResetMatrix_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionResetMatrix_fieldAccessorTable;

    /* renamed from: internal_static_ActionTouchEvent_TouchEvent_PointerCoords_descriptor */
    private static final Descriptors.Descriptor f19893x749fdd98;

    /* renamed from: internal_static_ActionTouchEvent_TouchEvent_PointerCoords_fieldAccessorTable */
    private static final GeneratedMessageV3.FieldAccessorTable f19894xa583ec16;

    /* renamed from: internal_static_ActionTouchEvent_TouchEvent_PointerProperties_descriptor */
    private static final Descriptors.Descriptor f19895x13f7163;

    /* renamed from: internal_static_ActionTouchEvent_TouchEvent_PointerProperties_fieldAccessorTable */
    private static final GeneratedMessageV3.FieldAccessorTable f19896x12484e1;
    private static final Descriptors.Descriptor internal_static_ActionTouchEvent_TouchEvent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionTouchEvent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionTouchEvent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionTranslation_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionTranslation_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionWebViewConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionWebViewConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActionZoom_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActionZoom_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AudioStartAction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AudioStartAction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AudioStopAction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AudioStopAction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BoardBodyV1_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BoardBodyV1_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BoardBody_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BoardBody_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BoardHead_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BoardHead_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_DrawArea_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DrawArea_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_DrawBoardV1_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DrawBoardV1_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_DrawBoard_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DrawBoard_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GraphResetData_ActionFactory_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GraphResetData_ActionFactory_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GraphResetData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GraphResetData_fieldAccessorTable;

    public static final class ActionClearBoard extends GeneratedMessageV3 implements ActionClearBoardOrBuilder {
        private static final ActionClearBoard DEFAULT_INSTANCE = new ActionClearBoard();
        private static final Parser<ActionClearBoard> PARSER = new AbstractParser<ActionClearBoard>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionClearBoard.1
            @Override // com.google.protobuf.Parser
            public ActionClearBoard parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionClearBoard(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long startTime_;
        private int type_;

        public static ActionClearBoard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionClearBoard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionClearBoard parseDelimitedFrom(InputStream inputStream) {
            return (ActionClearBoard) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionClearBoard parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionClearBoard> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionClearBoard)) {
                return super.equals(obj);
            }
            ActionClearBoard actionClearBoard = (ActionClearBoard) obj;
            return getType() == actionClearBoard.getType() && getStartTime() == actionClearBoard.getStartTime();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionClearBoard> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionClearBoardOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionClearBoardOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionClearBoard_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionClearBoard.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionClearBoardOrBuilder {
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionClearBoard_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionClearBoard_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionClearBoardOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionClearBoardOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionClearBoard_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionClearBoard.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
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
            public ActionClearBoard build() {
                ActionClearBoard actionClearBoardBuildPartial = buildPartial();
                if (actionClearBoardBuildPartial.isInitialized()) {
                    return actionClearBoardBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionClearBoardBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionClearBoard buildPartial() {
                ActionClearBoard actionClearBoard = new ActionClearBoard(this);
                actionClearBoard.type_ = this.type_;
                actionClearBoard.startTime_ = this.startTime_;
                onBuilt();
                return actionClearBoard;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionClearBoard getDefaultInstanceForType() {
                return ActionClearBoard.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionClearBoard) {
                    return mergeFrom((ActionClearBoard) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionClearBoard actionClearBoard) {
                if (actionClearBoard == ActionClearBoard.getDefaultInstance()) {
                    return this;
                }
                if (actionClearBoard.getType() != 0) {
                    setType(actionClearBoard.getType());
                }
                if (actionClearBoard.getStartTime() != 0) {
                    setStartTime(actionClearBoard.getStartTime());
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
            public com.zykj.sketch.EzyDrawBoard.ActionClearBoard.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionClearBoard.access$23200()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionClearBoard r3 = (com.zykj.sketch.EzyDrawBoard.ActionClearBoard) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionClearBoard r4 = (com.zykj.sketch.EzyDrawBoard.ActionClearBoard) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionClearBoard.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionClearBoard$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionClearBoard$Builder.smali:676
            }
        }

        public static Builder newBuilder(ActionClearBoard actionClearBoard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionClearBoard);
        }

        public static ActionClearBoard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionClearBoard(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionClearBoard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionClearBoard) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionClearBoard parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionClearBoard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionClearBoard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionClearBoard() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
        }

        public static ActionClearBoard parseFrom(InputStream inputStream) {
            return (ActionClearBoard) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionClearBoard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionClearBoard) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionClearBoard(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.startTime_ = codedInputStream.readInt64();
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

        public static ActionClearBoard parseFrom(CodedInputStream codedInputStream) {
            return (ActionClearBoard) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionClearBoard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionClearBoard) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionClearBoardOrBuilder extends MessageOrBuilder {
        long getStartTime();

        int getType();
    }

    public static final class ActionContent extends GeneratedMessageV3 implements ActionContentOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        public static final int GRAPHSNAPSHOT_FIELD_NUMBER = 3;
        public static final int RESETDATA_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Any action_;
        private GraphSnapshot.GraphData graphSnapshot_;
        private byte memoizedIsInitialized;
        private GraphResetData resetData_;
        private int type_;
        private static final ActionContent DEFAULT_INSTANCE = new ActionContent();
        private static final Parser<ActionContent> PARSER = new AbstractParser<ActionContent>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionContent.1
            @Override // com.google.protobuf.Parser
            public ActionContent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionContent(codedInputStream, extensionRegistryLite);
            }
        };

        public static ActionContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionContent_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionContent parseDelimitedFrom(InputStream inputStream) {
            return (ActionContent) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionContent parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionContent> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionContent)) {
                return super.equals(obj);
            }
            ActionContent actionContent = (ActionContent) obj;
            boolean z10 = this.type_ == actionContent.type_ && hasAction() == actionContent.hasAction();
            if (hasAction()) {
                z10 = z10 && getAction().equals(actionContent.getAction());
            }
            boolean z11 = z10 && hasGraphSnapshot() == actionContent.hasGraphSnapshot();
            if (hasGraphSnapshot()) {
                z11 = z11 && getGraphSnapshot().equals(actionContent.getGraphSnapshot());
            }
            boolean z12 = z11 && hasResetData() == actionContent.hasResetData();
            return hasResetData() ? z12 && getResetData().equals(actionContent.getResetData()) : z12;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public Any getAction() {
            Any any = this.action_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public AnyOrBuilder getActionOrBuilder() {
            return getAction();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public GraphSnapshot.GraphData getGraphSnapshot() {
            GraphSnapshot.GraphData graphData = this.graphSnapshot_;
            return graphData == null ? GraphSnapshot.GraphData.getDefaultInstance() : graphData;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public GraphSnapshot.GraphDataOrBuilder getGraphSnapshotOrBuilder() {
            return getGraphSnapshot();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionContent> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public GraphResetData getResetData() {
            GraphResetData graphResetData = this.resetData_;
            return graphResetData == null ? GraphResetData.getDefaultInstance() : graphResetData;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public GraphResetDataOrBuilder getResetDataOrBuilder() {
            return getResetData();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.type_ != ActionEnum.ACTION_TOUCH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if (this.action_ != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getAction());
            }
            if (this.graphSnapshot_ != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getGraphSnapshot());
            }
            if (this.resetData_ != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, getResetData());
            }
            this.memoizedSize = iComputeEnumSize;
            return iComputeEnumSize;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public ActionEnum getType() {
            ActionEnum actionEnumValueOf = ActionEnum.valueOf(this.type_);
            return actionEnumValueOf == null ? ActionEnum.UNRECOGNIZED : actionEnumValueOf;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public boolean hasAction() {
            return this.action_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public boolean hasGraphSnapshot() {
            return this.graphSnapshot_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
        public boolean hasResetData() {
            return this.resetData_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + this.type_;
            if (hasAction()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAction().hashCode();
            }
            if (hasGraphSnapshot()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getGraphSnapshot().hashCode();
            }
            if (hasResetData()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getResetData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionContent_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionContent.class, Builder.class);
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
            if (this.type_ != ActionEnum.ACTION_TOUCH.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (this.action_ != null) {
                codedOutputStream.writeMessage(2, getAction());
            }
            if (this.graphSnapshot_ != null) {
                codedOutputStream.writeMessage(3, getGraphSnapshot());
            }
            if (this.resetData_ != null) {
                codedOutputStream.writeMessage(5, getResetData());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionContentOrBuilder {
            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> actionBuilder_;
            private Any action_;
            private SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> graphSnapshotBuilder_;
            private GraphSnapshot.GraphData graphSnapshot_;
            private SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> resetDataBuilder_;
            private GraphResetData resetData_;
            private int type_;

            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getActionFieldBuilder() {
                if (this.actionBuilder_ == null) {
                    this.actionBuilder_ = new SingleFieldBuilderV3<>(getAction(), getParentForChildren(), isClean());
                    this.action_ = null;
                }
                return this.actionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionContent_descriptor;
            }

            private SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> getGraphSnapshotFieldBuilder() {
                if (this.graphSnapshotBuilder_ == null) {
                    this.graphSnapshotBuilder_ = new SingleFieldBuilderV3<>(getGraphSnapshot(), getParentForChildren(), isClean());
                    this.graphSnapshot_ = null;
                }
                return this.graphSnapshotBuilder_;
            }

            private SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> getResetDataFieldBuilder() {
                if (this.resetDataBuilder_ == null) {
                    this.resetDataBuilder_ = new SingleFieldBuilderV3<>(getResetData(), getParentForChildren(), isClean());
                    this.resetData_ = null;
                }
                return this.resetDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAction() {
                if (this.actionBuilder_ == null) {
                    this.action_ = null;
                    onChanged();
                    return this;
                }
                this.action_ = null;
                this.actionBuilder_ = null;
                return this;
            }

            public Builder clearGraphSnapshot() {
                if (this.graphSnapshotBuilder_ == null) {
                    this.graphSnapshot_ = null;
                    onChanged();
                    return this;
                }
                this.graphSnapshot_ = null;
                this.graphSnapshotBuilder_ = null;
                return this;
            }

            public Builder clearResetData() {
                if (this.resetDataBuilder_ == null) {
                    this.resetData_ = null;
                    onChanged();
                    return this;
                }
                this.resetData_ = null;
                this.resetDataBuilder_ = null;
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public Any getAction() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Any) singleFieldBuilderV3.getMessage();
                }
                Any any = this.action_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any.Builder getActionBuilder() {
                onChanged();
                return (Any.Builder) getActionFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public AnyOrBuilder getActionOrBuilder() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AnyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Any any = this.action_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionContent_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public GraphSnapshot.GraphData getGraphSnapshot() {
                SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> singleFieldBuilderV3 = this.graphSnapshotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot.GraphData) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot.GraphData graphData = this.graphSnapshot_;
                return graphData == null ? GraphSnapshot.GraphData.getDefaultInstance() : graphData;
            }

            public GraphSnapshot.GraphData.Builder getGraphSnapshotBuilder() {
                onChanged();
                return (GraphSnapshot.GraphData.Builder) getGraphSnapshotFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public GraphSnapshot.GraphDataOrBuilder getGraphSnapshotOrBuilder() {
                SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> singleFieldBuilderV3 = this.graphSnapshotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot.GraphDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GraphSnapshot.GraphData graphData = this.graphSnapshot_;
                return graphData == null ? GraphSnapshot.GraphData.getDefaultInstance() : graphData;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public GraphResetData getResetData() {
                SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> singleFieldBuilderV3 = this.resetDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphResetData) singleFieldBuilderV3.getMessage();
                }
                GraphResetData graphResetData = this.resetData_;
                return graphResetData == null ? GraphResetData.getDefaultInstance() : graphResetData;
            }

            public GraphResetData.Builder getResetDataBuilder() {
                onChanged();
                return (GraphResetData.Builder) getResetDataFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public GraphResetDataOrBuilder getResetDataOrBuilder() {
                SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> singleFieldBuilderV3 = this.resetDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphResetDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GraphResetData graphResetData = this.resetData_;
                return graphResetData == null ? GraphResetData.getDefaultInstance() : graphResetData;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public ActionEnum getType() {
                ActionEnum actionEnumValueOf = ActionEnum.valueOf(this.type_);
                return actionEnumValueOf == null ? ActionEnum.UNRECOGNIZED : actionEnumValueOf;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public boolean hasAction() {
                return (this.actionBuilder_ == null && this.action_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public boolean hasGraphSnapshot() {
                return (this.graphSnapshotBuilder_ == null && this.graphSnapshot_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionContentOrBuilder
            public boolean hasResetData() {
                return (this.resetDataBuilder_ == null && this.resetData_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionContent_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionContent.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAction(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(any);
                    return this;
                }
                Any any2 = this.action_;
                if (any2 != null) {
                    this.action_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.action_ = any;
                }
                onChanged();
                return this;
            }

            public Builder mergeGraphSnapshot(GraphSnapshot.GraphData graphData) {
                SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> singleFieldBuilderV3 = this.graphSnapshotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphData);
                    return this;
                }
                GraphSnapshot.GraphData graphData2 = this.graphSnapshot_;
                if (graphData2 != null) {
                    this.graphSnapshot_ = GraphSnapshot.GraphData.newBuilder(graphData2).mergeFrom(graphData).buildPartial();
                } else {
                    this.graphSnapshot_ = graphData;
                }
                onChanged();
                return this;
            }

            public Builder mergeResetData(GraphResetData graphResetData) {
                SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> singleFieldBuilderV3 = this.resetDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphResetData);
                    return this;
                }
                GraphResetData graphResetData2 = this.resetData_;
                if (graphResetData2 != null) {
                    this.resetData_ = GraphResetData.newBuilder(graphResetData2).mergeFrom(graphResetData).buildPartial();
                } else {
                    this.resetData_ = graphResetData;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setAction(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(any);
                    return this;
                }
                any.getClass();
                this.action_ = any;
                onChanged();
                return this;
            }

            public Builder setGraphSnapshot(GraphSnapshot.GraphData graphData) {
                SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> singleFieldBuilderV3 = this.graphSnapshotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(graphData);
                    return this;
                }
                graphData.getClass();
                this.graphSnapshot_ = graphData;
                onChanged();
                return this;
            }

            public Builder setResetData(GraphResetData graphResetData) {
                SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> singleFieldBuilderV3 = this.resetDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(graphResetData);
                    return this;
                }
                graphResetData.getClass();
                this.resetData_ = graphResetData;
                onChanged();
                return this;
            }

            public Builder setType(ActionEnum actionEnum) {
                actionEnum.getClass();
                this.type_ = actionEnum.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.action_ = null;
                this.graphSnapshot_ = null;
                this.resetData_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionContent build() {
                ActionContent actionContentBuildPartial = buildPartial();
                if (actionContentBuildPartial.isInitialized()) {
                    return actionContentBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionContentBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionContent buildPartial() {
                ActionContent actionContent = new ActionContent(this);
                actionContent.type_ = this.type_;
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    actionContent.action_ = this.action_;
                } else {
                    actionContent.action_ = (Any) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> singleFieldBuilderV32 = this.graphSnapshotBuilder_;
                if (singleFieldBuilderV32 == null) {
                    actionContent.graphSnapshot_ = this.graphSnapshot_;
                } else {
                    actionContent.graphSnapshot_ = (GraphSnapshot.GraphData) singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> singleFieldBuilderV33 = this.resetDataBuilder_;
                if (singleFieldBuilderV33 == null) {
                    actionContent.resetData_ = this.resetData_;
                } else {
                    actionContent.resetData_ = (GraphResetData) singleFieldBuilderV33.build();
                }
                onBuilt();
                return actionContent;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionContent getDefaultInstanceForType() {
                return ActionContent.getDefaultInstance();
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
                this.type_ = 0;
                if (this.actionBuilder_ == null) {
                    this.action_ = null;
                } else {
                    this.action_ = null;
                    this.actionBuilder_ = null;
                }
                if (this.graphSnapshotBuilder_ == null) {
                    this.graphSnapshot_ = null;
                } else {
                    this.graphSnapshot_ = null;
                    this.graphSnapshotBuilder_ = null;
                }
                if (this.resetDataBuilder_ == null) {
                    this.resetData_ = null;
                    return this;
                }
                this.resetData_ = null;
                this.resetDataBuilder_ = null;
                return this;
            }

            public Builder setAction(Any.Builder builder) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.action_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setGraphSnapshot(GraphSnapshot.GraphData.Builder builder) {
                SingleFieldBuilderV3<GraphSnapshot.GraphData, GraphSnapshot.GraphData.Builder, GraphSnapshot.GraphDataOrBuilder> singleFieldBuilderV3 = this.graphSnapshotBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.graphSnapshot_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setResetData(GraphResetData.Builder builder) {
                SingleFieldBuilderV3<GraphResetData, GraphResetData.Builder, GraphResetDataOrBuilder> singleFieldBuilderV3 = this.resetDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetData_ = builder.build();
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
                if (message instanceof ActionContent) {
                    return mergeFrom((ActionContent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.action_ = null;
                this.graphSnapshot_ = null;
                this.resetData_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(ActionContent actionContent) {
                if (actionContent == ActionContent.getDefaultInstance()) {
                    return this;
                }
                if (actionContent.type_ != 0) {
                    setTypeValue(actionContent.getTypeValue());
                }
                if (actionContent.hasAction()) {
                    mergeAction(actionContent.getAction());
                }
                if (actionContent.hasGraphSnapshot()) {
                    mergeGraphSnapshot(actionContent.getGraphSnapshot());
                }
                if (actionContent.hasResetData()) {
                    mergeResetData(actionContent.getResetData());
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
            public com.zykj.sketch.EzyDrawBoard.ActionContent.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionContent.access$6600()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionContent r3 = (com.zykj.sketch.EzyDrawBoard.ActionContent) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionContent r4 = (com.zykj.sketch.EzyDrawBoard.ActionContent) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionContent.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionContent$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionContent$Builder.smali:1770
            }
        }

        public static Builder newBuilder(ActionContent actionContent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionContent);
        }

        public static ActionContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionContent(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionContent) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionContent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionContent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionContent() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static ActionContent parseFrom(InputStream inputStream) {
            return (ActionContent) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionContent) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionContent(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (tag == 18) {
                                    Any any = this.action_;
                                    Any.Builder builder = any != null ? any.toBuilder() : null;
                                    Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                    this.action_ = any2;
                                    if (builder != null) {
                                        builder.mergeFrom(any2);
                                        this.action_ = builder.buildPartial();
                                    }
                                } else if (tag == 26) {
                                    GraphSnapshot.GraphData graphData = this.graphSnapshot_;
                                    GraphSnapshot.GraphData.Builder builder2 = graphData != null ? graphData.toBuilder() : null;
                                    GraphSnapshot.GraphData graphData2 = (GraphSnapshot.GraphData) codedInputStream.readMessage(GraphSnapshot.GraphData.parser(), extensionRegistryLite);
                                    this.graphSnapshot_ = graphData2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(graphData2);
                                        this.graphSnapshot_ = builder2.buildPartial();
                                    }
                                } else if (tag != 42) {
                                    if (!codedInputStream.skipField(tag)) {
                                    }
                                } else {
                                    GraphResetData graphResetData = this.resetData_;
                                    GraphResetData.Builder builder3 = graphResetData != null ? graphResetData.toBuilder() : null;
                                    GraphResetData graphResetData2 = (GraphResetData) codedInputStream.readMessage(GraphResetData.parser(), extensionRegistryLite);
                                    this.resetData_ = graphResetData2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(graphResetData2);
                                        this.resetData_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.type_ = codedInputStream.readEnum();
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

        public static ActionContent parseFrom(CodedInputStream codedInputStream) {
            return (ActionContent) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionContent) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionContentOrBuilder extends MessageOrBuilder {
        Any getAction();

        AnyOrBuilder getActionOrBuilder();

        GraphSnapshot.GraphData getGraphSnapshot();

        GraphSnapshot.GraphDataOrBuilder getGraphSnapshotOrBuilder();

        GraphResetData getResetData();

        GraphResetDataOrBuilder getResetDataOrBuilder();

        ActionEnum getType();

        int getTypeValue();

        boolean hasAction();

        boolean hasGraphSnapshot();

        boolean hasResetData();
    }

    public static final class ActionDrawConfig extends GeneratedMessageV3 implements ActionDrawConfigOrBuilder {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 3;
        public static final int DRAWAREA_FIELD_NUMBER = 4;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int backgroundColor_;
        private DrawArea drawArea_;
        private byte memoizedIsInitialized;
        private long startTime_;
        private int type_;
        private static final ActionDrawConfig DEFAULT_INSTANCE = new ActionDrawConfig();
        private static final Parser<ActionDrawConfig> PARSER = new AbstractParser<ActionDrawConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionDrawConfig.1
            @Override // com.google.protobuf.Parser
            public ActionDrawConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionDrawConfig(codedInputStream, extensionRegistryLite);
            }
        };

        public static ActionDrawConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionDrawConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionDrawConfig parseDelimitedFrom(InputStream inputStream) {
            return (ActionDrawConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionDrawConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionDrawConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionDrawConfig)) {
                return super.equals(obj);
            }
            ActionDrawConfig actionDrawConfig = (ActionDrawConfig) obj;
            boolean z10 = getType() == actionDrawConfig.getType() && getStartTime() == actionDrawConfig.getStartTime() && getBackgroundColor() == actionDrawConfig.getBackgroundColor() && hasDrawArea() == actionDrawConfig.hasDrawArea();
            return hasDrawArea() ? z10 && getDrawArea().equals(actionDrawConfig.getDrawArea()) : z10;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
        public int getBackgroundColor() {
            return this.backgroundColor_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
        public DrawArea getDrawArea() {
            DrawArea drawArea = this.drawArea_;
            return drawArea == null ? DrawArea.getDefaultInstance() : drawArea;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
        public DrawAreaOrBuilder getDrawAreaOrBuilder() {
            return getDrawArea();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionDrawConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            int i12 = this.backgroundColor_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i12);
            }
            if (this.drawArea_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, getDrawArea());
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
        public boolean hasDrawArea() {
            return this.drawArea_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 3) * 53) + getBackgroundColor();
            if (hasDrawArea()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDrawArea().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionDrawConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionDrawConfig.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            int i11 = this.backgroundColor_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(3, i11);
            }
            if (this.drawArea_ != null) {
                codedOutputStream.writeMessage(4, getDrawArea());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionDrawConfigOrBuilder {
            private int backgroundColor_;
            private SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> drawAreaBuilder_;
            private DrawArea drawArea_;
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionDrawConfig_descriptor;
            }

            private SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> getDrawAreaFieldBuilder() {
                if (this.drawAreaBuilder_ == null) {
                    this.drawAreaBuilder_ = new SingleFieldBuilderV3<>(getDrawArea(), getParentForChildren(), isClean());
                    this.drawArea_ = null;
                }
                return this.drawAreaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDrawArea() {
                if (this.drawAreaBuilder_ == null) {
                    this.drawArea_ = null;
                    onChanged();
                    return this;
                }
                this.drawArea_ = null;
                this.drawAreaBuilder_ = null;
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
            public int getBackgroundColor() {
                return this.backgroundColor_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionDrawConfig_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
            public DrawArea getDrawArea() {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DrawArea) singleFieldBuilderV3.getMessage();
                }
                DrawArea drawArea = this.drawArea_;
                return drawArea == null ? DrawArea.getDefaultInstance() : drawArea;
            }

            public DrawArea.Builder getDrawAreaBuilder() {
                onChanged();
                return (DrawArea.Builder) getDrawAreaFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
            public DrawAreaOrBuilder getDrawAreaOrBuilder() {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DrawAreaOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DrawArea drawArea = this.drawArea_;
                return drawArea == null ? DrawArea.getDefaultInstance() : drawArea;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionDrawConfigOrBuilder
            public boolean hasDrawArea() {
                return (this.drawAreaBuilder_ == null && this.drawArea_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionDrawConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionDrawConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDrawArea(DrawArea drawArea) {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(drawArea);
                    return this;
                }
                DrawArea drawArea2 = this.drawArea_;
                if (drawArea2 != null) {
                    this.drawArea_ = DrawArea.newBuilder(drawArea2).mergeFrom(drawArea).buildPartial();
                } else {
                    this.drawArea_ = drawArea;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setBackgroundColor(int i10) {
                this.backgroundColor_ = i10;
                onChanged();
                return this;
            }

            public Builder setDrawArea(DrawArea drawArea) {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(drawArea);
                    return this;
                }
                drawArea.getClass();
                this.drawArea_ = drawArea;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.drawArea_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionDrawConfig build() {
                ActionDrawConfig actionDrawConfigBuildPartial = buildPartial();
                if (actionDrawConfigBuildPartial.isInitialized()) {
                    return actionDrawConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionDrawConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionDrawConfig buildPartial() {
                ActionDrawConfig actionDrawConfig = new ActionDrawConfig(this);
                actionDrawConfig.type_ = this.type_;
                actionDrawConfig.startTime_ = this.startTime_;
                actionDrawConfig.backgroundColor_ = this.backgroundColor_;
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    actionDrawConfig.drawArea_ = this.drawArea_;
                } else {
                    actionDrawConfig.drawArea_ = (DrawArea) singleFieldBuilderV3.build();
                }
                onBuilt();
                return actionDrawConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionDrawConfig getDefaultInstanceForType() {
                return ActionDrawConfig.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                this.backgroundColor_ = 0;
                if (this.drawAreaBuilder_ == null) {
                    this.drawArea_ = null;
                    return this;
                }
                this.drawArea_ = null;
                this.drawAreaBuilder_ = null;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.drawArea_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setDrawArea(DrawArea.Builder builder) {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.drawArea_ = builder.build();
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
                if (message instanceof ActionDrawConfig) {
                    return mergeFrom((ActionDrawConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionDrawConfig actionDrawConfig) {
                if (actionDrawConfig == ActionDrawConfig.getDefaultInstance()) {
                    return this;
                }
                if (actionDrawConfig.getType() != 0) {
                    setType(actionDrawConfig.getType());
                }
                if (actionDrawConfig.getStartTime() != 0) {
                    setStartTime(actionDrawConfig.getStartTime());
                }
                if (actionDrawConfig.getBackgroundColor() != 0) {
                    setBackgroundColor(actionDrawConfig.getBackgroundColor());
                }
                if (actionDrawConfig.hasDrawArea()) {
                    mergeDrawArea(actionDrawConfig.getDrawArea());
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
            public com.zykj.sketch.EzyDrawBoard.ActionDrawConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionDrawConfig.access$18400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionDrawConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionDrawConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionDrawConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionDrawConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionDrawConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionDrawConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder.smali:1135
            }
        }

        public static Builder newBuilder(ActionDrawConfig actionDrawConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionDrawConfig);
        }

        public static ActionDrawConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionDrawConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionDrawConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionDrawConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionDrawConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionDrawConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionDrawConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionDrawConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.backgroundColor_ = 0;
        }

        public static ActionDrawConfig parseFrom(InputStream inputStream) {
            return (ActionDrawConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionDrawConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionDrawConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionDrawConfig parseFrom(CodedInputStream codedInputStream) {
            return (ActionDrawConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private ActionDrawConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag == 24) {
                                this.backgroundColor_ = codedInputStream.readInt32();
                            } else if (tag != 34) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                DrawArea drawArea = this.drawArea_;
                                DrawArea.Builder builder = drawArea != null ? drawArea.toBuilder() : null;
                                DrawArea drawArea2 = (DrawArea) codedInputStream.readMessage(DrawArea.parser(), extensionRegistryLite);
                                this.drawArea_ = drawArea2;
                                if (builder != null) {
                                    builder.mergeFrom(drawArea2);
                                    this.drawArea_ = builder.buildPartial();
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

        public static ActionDrawConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionDrawConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionDrawConfigOrBuilder extends MessageOrBuilder {
        int getBackgroundColor();

        DrawArea getDrawArea();

        DrawAreaOrBuilder getDrawAreaOrBuilder();

        long getStartTime();

        int getType();

        boolean hasDrawArea();
    }

    public enum ActionEnum implements ProtocolMessageEnum {
        ACTION_TOUCH(0),
        ACTION_MODE(1),
        ACTION_GRAPH(2),
        ACTION_WEB(3),
        ACTION_IMAGE(4),
        ACTION_FILTER(5),
        ACTION_CLEAR_BOARD(6),
        ACTION_NEXT(7),
        ACTION_PREV(8),
        ACTION_AUDIO_START(9),
        ACTION_AUDIO_STOP(10),
        ACTION_ZOOM(11),
        ACTION_TRANS(12),
        ACTION_DRAW_CONFIG(13),
        ACTION_RESET_MATRIX(14),
        UNRECOGNIZED(-1);

        public static final int ACTION_AUDIO_START_VALUE = 9;
        public static final int ACTION_AUDIO_STOP_VALUE = 10;
        public static final int ACTION_CLEAR_BOARD_VALUE = 6;
        public static final int ACTION_DRAW_CONFIG_VALUE = 13;
        public static final int ACTION_FILTER_VALUE = 5;
        public static final int ACTION_GRAPH_VALUE = 2;
        public static final int ACTION_IMAGE_VALUE = 4;
        public static final int ACTION_MODE_VALUE = 1;
        public static final int ACTION_NEXT_VALUE = 7;
        public static final int ACTION_PREV_VALUE = 8;
        public static final int ACTION_RESET_MATRIX_VALUE = 14;
        public static final int ACTION_TOUCH_VALUE = 0;
        public static final int ACTION_TRANS_VALUE = 12;
        public static final int ACTION_WEB_VALUE = 3;
        public static final int ACTION_ZOOM_VALUE = 11;
        private final int value;
        private static final Internal.EnumLiteMap<ActionEnum> internalValueMap = new Internal.EnumLiteMap<ActionEnum>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionEnum.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ActionEnum findValueByNumber(int i10) {
                return ActionEnum.forNumber(i10);
            }
        };
        private static final ActionEnum[] VALUES = values();

        ActionEnum(int i10) {
            this.value = i10;
        }

        public static ActionEnum forNumber(int i10) {
            switch (i10) {
                case 0:
                    return ACTION_TOUCH;
                case 1:
                    return ACTION_MODE;
                case 2:
                    return ACTION_GRAPH;
                case 3:
                    return ACTION_WEB;
                case 4:
                    return ACTION_IMAGE;
                case 5:
                    return ACTION_FILTER;
                case 6:
                    return ACTION_CLEAR_BOARD;
                case 7:
                    return ACTION_NEXT;
                case 8:
                    return ACTION_PREV;
                case 9:
                    return ACTION_AUDIO_START;
                case 10:
                    return ACTION_AUDIO_STOP;
                case 11:
                    return ACTION_ZOOM;
                case 12:
                    return ACTION_TRANS;
                case 13:
                    return ACTION_DRAW_CONFIG;
                case 14:
                    return ACTION_RESET_MATRIX;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return EzyDrawBoard.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ActionEnum> internalGetValueMap() {
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
        public static ActionEnum valueOf(int i10) {
            return forNumber(i10);
        }

        public static ActionEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class ActionFitterConfig extends GeneratedMessageV3 implements ActionFitterConfigOrBuilder {
        public static final int CENTERX_FIELD_NUMBER = 4;
        public static final int CENTERY_FIELD_NUMBER = 5;
        private static final ActionFitterConfig DEFAULT_INSTANCE = new ActionFitterConfig();
        private static final Parser<ActionFitterConfig> PARSER = new AbstractParser<ActionFitterConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionFitterConfig.1
            @Override // com.google.protobuf.Parser
            public ActionFitterConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionFitterConfig(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PX_FIELD_NUMBER = 6;
        public static final int PY_FIELD_NUMBER = 7;
        public static final int SCALE_FIELD_NUMBER = 3;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int centerX_;
        private int centerY_;
        private byte memoizedIsInitialized;
        private int px_;
        private int py_;
        private float scale_;
        private long startTime_;
        private int type_;

        public static ActionFitterConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionFitterConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionFitterConfig parseDelimitedFrom(InputStream inputStream) {
            return (ActionFitterConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionFitterConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionFitterConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionFitterConfig)) {
                return super.equals(obj);
            }
            ActionFitterConfig actionFitterConfig = (ActionFitterConfig) obj;
            return getType() == actionFitterConfig.getType() && getStartTime() == actionFitterConfig.getStartTime() && Float.floatToIntBits(getScale()) == Float.floatToIntBits(actionFitterConfig.getScale()) && getCenterX() == actionFitterConfig.getCenterX() && getCenterY() == actionFitterConfig.getCenterY() && getPx() == actionFitterConfig.getPx() && getPy() == actionFitterConfig.getPy();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public int getCenterX() {
            return this.centerX_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public int getCenterY() {
            return this.centerY_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionFitterConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public int getPx() {
            return this.px_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public int getPy() {
            return this.py_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public float getScale() {
            return this.scale_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            float f10 = this.scale_;
            if (f10 != 0.0f) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(3, f10);
            }
            int i12 = this.centerX_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i12);
            }
            int i13 = this.centerY_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i13);
            }
            int i14 = this.px_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i14);
            }
            int i15 = this.py_;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, i15);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 3) * 53) + Float.floatToIntBits(getScale())) * 37) + 4) * 53) + getCenterX()) * 37) + 5) * 53) + getCenterY()) * 37) + 6) * 53) + getPx()) * 37) + 7) * 53) + getPy()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionFitterConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionFitterConfig.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            float f10 = this.scale_;
            if (f10 != 0.0f) {
                codedOutputStream.writeFloat(3, f10);
            }
            int i11 = this.centerX_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(4, i11);
            }
            int i12 = this.centerY_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(5, i12);
            }
            int i13 = this.px_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(6, i13);
            }
            int i14 = this.py_;
            if (i14 != 0) {
                codedOutputStream.writeInt32(7, i14);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionFitterConfigOrBuilder {
            private int centerX_;
            private int centerY_;
            private int px_;
            private int py_;
            private float scale_;
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionFitterConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCenterX() {
                this.centerX_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCenterY() {
                this.centerY_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPx() {
                this.px_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPy() {
                this.py_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScale() {
                this.scale_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public int getCenterX() {
                return this.centerX_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public int getCenterY() {
                return this.centerY_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionFitterConfig_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public int getPx() {
                return this.px_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public int getPy() {
                return this.py_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public float getScale() {
                return this.scale_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionFitterConfigOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionFitterConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionFitterConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setCenterX(int i10) {
                this.centerX_ = i10;
                onChanged();
                return this;
            }

            public Builder setCenterY(int i10) {
                this.centerY_ = i10;
                onChanged();
                return this;
            }

            public Builder setPx(int i10) {
                this.px_ = i10;
                onChanged();
                return this;
            }

            public Builder setPy(int i10) {
                this.py_ = i10;
                onChanged();
                return this;
            }

            public Builder setScale(float f10) {
                this.scale_ = f10;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
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
            public ActionFitterConfig build() {
                ActionFitterConfig actionFitterConfigBuildPartial = buildPartial();
                if (actionFitterConfigBuildPartial.isInitialized()) {
                    return actionFitterConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionFitterConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionFitterConfig buildPartial() {
                ActionFitterConfig actionFitterConfig = new ActionFitterConfig(this);
                actionFitterConfig.type_ = this.type_;
                actionFitterConfig.startTime_ = this.startTime_;
                actionFitterConfig.scale_ = this.scale_;
                actionFitterConfig.centerX_ = this.centerX_;
                actionFitterConfig.centerY_ = this.centerY_;
                actionFitterConfig.px_ = this.px_;
                actionFitterConfig.py_ = this.py_;
                onBuilt();
                return actionFitterConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionFitterConfig getDefaultInstanceForType() {
                return ActionFitterConfig.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                this.scale_ = 0.0f;
                this.centerX_ = 0;
                this.centerY_ = 0;
                this.px_ = 0;
                this.py_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionFitterConfig) {
                    return mergeFrom((ActionFitterConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionFitterConfig actionFitterConfig) {
                if (actionFitterConfig == ActionFitterConfig.getDefaultInstance()) {
                    return this;
                }
                if (actionFitterConfig.getType() != 0) {
                    setType(actionFitterConfig.getType());
                }
                if (actionFitterConfig.getStartTime() != 0) {
                    setStartTime(actionFitterConfig.getStartTime());
                }
                if (actionFitterConfig.getScale() != 0.0f) {
                    setScale(actionFitterConfig.getScale());
                }
                if (actionFitterConfig.getCenterX() != 0) {
                    setCenterX(actionFitterConfig.getCenterX());
                }
                if (actionFitterConfig.getCenterY() != 0) {
                    setCenterY(actionFitterConfig.getCenterY());
                }
                if (actionFitterConfig.getPx() != 0) {
                    setPx(actionFitterConfig.getPx());
                }
                if (actionFitterConfig.getPy() != 0) {
                    setPy(actionFitterConfig.getPy());
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
            public com.zykj.sketch.EzyDrawBoard.ActionFitterConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionFitterConfig.access$22200()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionFitterConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionFitterConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionFitterConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionFitterConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionFitterConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionFitterConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder.smali:878
            }
        }

        public static Builder newBuilder(ActionFitterConfig actionFitterConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionFitterConfig);
        }

        public static ActionFitterConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionFitterConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionFitterConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionFitterConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionFitterConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionFitterConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionFitterConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionFitterConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.scale_ = 0.0f;
            this.centerX_ = 0;
            this.centerY_ = 0;
            this.px_ = 0;
            this.py_ = 0;
        }

        public static ActionFitterConfig parseFrom(InputStream inputStream) {
            return (ActionFitterConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionFitterConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionFitterConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionFitterConfig parseFrom(CodedInputStream codedInputStream) {
            return (ActionFitterConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionFitterConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionFitterConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ActionFitterConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag == 29) {
                                this.scale_ = codedInputStream.readFloat();
                            } else if (tag == 32) {
                                this.centerX_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.centerY_ = codedInputStream.readInt32();
                            } else if (tag == 48) {
                                this.px_ = codedInputStream.readInt32();
                            } else if (tag != 56) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.py_ = codedInputStream.readInt32();
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
    }

    public interface ActionFitterConfigOrBuilder extends MessageOrBuilder {
        int getCenterX();

        int getCenterY();

        int getPx();

        int getPy();

        float getScale();

        long getStartTime();

        int getType();
    }

    public static final class ActionGraphConfig extends GeneratedMessageV3 implements ActionGraphConfigOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 4;
        private static final ActionGraphConfig DEFAULT_INSTANCE = new ActionGraphConfig();
        private static final Parser<ActionGraphConfig> PARSER = new AbstractParser<ActionGraphConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.1
            @Override // com.google.protobuf.Parser
            public ActionGraphConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionGraphConfig(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private GraphConfig config_;
        private byte memoizedIsInitialized;
        private long startTime_;
        private int type_;

        public static final class GraphConfig extends GeneratedMessageV3 implements GraphConfigOrBuilder {
            public static final int COLOR_FIELD_NUMBER = 2;
            private static final GraphConfig DEFAULT_INSTANCE = new GraphConfig();
            private static final Parser<GraphConfig> PARSER = new AbstractParser<GraphConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfig.1
                @Override // com.google.protobuf.Parser
                public GraphConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new GraphConfig(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int WIDTH_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int color_;
            private byte memoizedIsInitialized;
            private float width_;

            public static GraphConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionGraphConfig_GraphConfig_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GraphConfig parseDelimitedFrom(InputStream inputStream) {
                return (GraphConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GraphConfig parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<GraphConfig> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GraphConfig)) {
                    return super.equals(obj);
                }
                GraphConfig graphConfig = (GraphConfig) obj;
                return Float.floatToIntBits(getWidth()) == Float.floatToIntBits(graphConfig.getWidth()) && getColor() == graphConfig.getColor();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfigOrBuilder
            public int getColor() {
                return this.color_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<GraphConfig> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                float f10 = this.width_;
                int iComputeFloatSize = f10 != 0.0f ? CodedOutputStream.computeFloatSize(1, f10) : 0;
                int i11 = this.color_;
                if (i11 != 0) {
                    iComputeFloatSize += CodedOutputStream.computeInt32Size(2, i11);
                }
                this.memoizedSize = iComputeFloatSize;
                return iComputeFloatSize;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return UnknownFieldSet.getDefaultInstance();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfigOrBuilder
            public float getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getWidth())) * 37) + 2) * 53) + getColor()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(GraphConfig.class, Builder.class);
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
                float f10 = this.width_;
                if (f10 != 0.0f) {
                    codedOutputStream.writeFloat(1, f10);
                }
                int i10 = this.color_;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GraphConfigOrBuilder {
                private int color_;
                private float width_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyDrawBoard.internal_static_ActionGraphConfig_GraphConfig_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
                }

                public Builder clearColor() {
                    this.color_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWidth() {
                    this.width_ = 0.0f;
                    onChanged();
                    return this;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfigOrBuilder
                public int getColor() {
                    return this.color_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyDrawBoard.internal_static_ActionGraphConfig_GraphConfig_descriptor;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfigOrBuilder
                public float getWidth() {
                    return this.width_;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyDrawBoard.internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(GraphConfig.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return this;
                }

                public Builder setColor(int i10) {
                    this.color_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return this;
                }

                public Builder setWidth(float f10) {
                    this.width_ = f10;
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
                public GraphConfig build() {
                    GraphConfig graphConfigBuildPartial = buildPartial();
                    if (graphConfigBuildPartial.isInitialized()) {
                        return graphConfigBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphConfigBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public GraphConfig buildPartial() {
                    GraphConfig graphConfig = new GraphConfig(this);
                    graphConfig.width_ = this.width_;
                    graphConfig.color_ = this.color_;
                    onBuilt();
                    return graphConfig;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public GraphConfig getDefaultInstanceForType() {
                    return GraphConfig.getDefaultInstance();
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
                    this.width_ = 0.0f;
                    this.color_ = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo33979clone() {
                    return (Builder) super.mo33979clone();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof GraphConfig) {
                        return mergeFrom((GraphConfig) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(GraphConfig graphConfig) {
                    if (graphConfig == GraphConfig.getDefaultInstance()) {
                        return this;
                    }
                    if (graphConfig.getWidth() != 0.0f) {
                        setWidth(graphConfig.getWidth());
                    }
                    if (graphConfig.getColor() != 0) {
                        setColor(graphConfig.getColor());
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
                public com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfig.access$16300()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                        com.zykj.sketch.EzyDrawBoard$ActionGraphConfig$GraphConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                        com.zykj.sketch.EzyDrawBoard$ActionGraphConfig$GraphConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfig) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder.smali:675
                }
            }

            public static Builder newBuilder(GraphConfig graphConfig) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(graphConfig);
            }

            public static GraphConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private GraphConfig(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GraphConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GraphConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static GraphConfig parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphConfig getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static GraphConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private GraphConfig() {
                this.memoizedIsInitialized = (byte) -1;
                this.width_ = 0.0f;
                this.color_ = 0;
            }

            public static GraphConfig parseFrom(InputStream inputStream) {
                return (GraphConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static GraphConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GraphConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            private GraphConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.width_ = codedInputStream.readFloat();
                                } else if (tag != 16) {
                                    if (!codedInputStream.skipField(tag)) {
                                    }
                                } else {
                                    this.color_ = codedInputStream.readInt32();
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

            public static GraphConfig parseFrom(CodedInputStream codedInputStream) {
                return (GraphConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static GraphConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GraphConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface GraphConfigOrBuilder extends MessageOrBuilder {
            int getColor();

            float getWidth();
        }

        public static ActionGraphConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionGraphConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionGraphConfig parseDelimitedFrom(InputStream inputStream) {
            return (ActionGraphConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionGraphConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionGraphConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionGraphConfig)) {
                return super.equals(obj);
            }
            ActionGraphConfig actionGraphConfig = (ActionGraphConfig) obj;
            boolean z10 = getType() == actionGraphConfig.getType() && getStartTime() == actionGraphConfig.getStartTime() && hasConfig() == actionGraphConfig.hasConfig();
            return hasConfig() ? z10 && getConfig().equals(actionGraphConfig.getConfig()) : z10;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
        public GraphConfig getConfig() {
            GraphConfig graphConfig = this.config_;
            return graphConfig == null ? GraphConfig.getDefaultInstance() : graphConfig;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
        public GraphConfigOrBuilder getConfigOrBuilder() {
            return getConfig();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionGraphConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            if (this.config_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, getConfig());
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
        public boolean hasConfig() {
            return this.config_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime());
            if (hasConfig()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getConfig().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionGraphConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionGraphConfig.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            if (this.config_ != null) {
                codedOutputStream.writeMessage(4, getConfig());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionGraphConfigOrBuilder {
            private SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> configBuilder_;
            private GraphConfig config_;
            private long startTime_;
            private int type_;

            private SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionGraphConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearConfig() {
                if (this.configBuilder_ == null) {
                    this.config_ = null;
                    onChanged();
                    return this;
                }
                this.config_ = null;
                this.configBuilder_ = null;
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
            public GraphConfig getConfig() {
                SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphConfig) singleFieldBuilderV3.getMessage();
                }
                GraphConfig graphConfig = this.config_;
                return graphConfig == null ? GraphConfig.getDefaultInstance() : graphConfig;
            }

            public GraphConfig.Builder getConfigBuilder() {
                onChanged();
                return (GraphConfig.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
            public GraphConfigOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GraphConfig graphConfig = this.config_;
                return graphConfig == null ? GraphConfig.getDefaultInstance() : graphConfig;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionGraphConfig_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionGraphConfigOrBuilder
            public boolean hasConfig() {
                return (this.configBuilder_ == null && this.config_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionGraphConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionGraphConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(GraphConfig graphConfig) {
                SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphConfig);
                    return this;
                }
                GraphConfig graphConfig2 = this.config_;
                if (graphConfig2 != null) {
                    this.config_ = GraphConfig.newBuilder(graphConfig2).mergeFrom(graphConfig).buildPartial();
                } else {
                    this.config_ = graphConfig;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setConfig(GraphConfig graphConfig) {
                SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(graphConfig);
                    return this;
                }
                graphConfig.getClass();
                this.config_ = graphConfig;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.config_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionGraphConfig build() {
                ActionGraphConfig actionGraphConfigBuildPartial = buildPartial();
                if (actionGraphConfigBuildPartial.isInitialized()) {
                    return actionGraphConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionGraphConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionGraphConfig buildPartial() {
                ActionGraphConfig actionGraphConfig = new ActionGraphConfig(this);
                actionGraphConfig.type_ = this.type_;
                actionGraphConfig.startTime_ = this.startTime_;
                SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    actionGraphConfig.config_ = this.config_;
                } else {
                    actionGraphConfig.config_ = (GraphConfig) singleFieldBuilderV3.build();
                }
                onBuilt();
                return actionGraphConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionGraphConfig getDefaultInstanceForType() {
                return ActionGraphConfig.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                if (this.configBuilder_ == null) {
                    this.config_ = null;
                    return this;
                }
                this.config_ = null;
                this.configBuilder_ = null;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.config_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setConfig(GraphConfig.Builder builder) {
                SingleFieldBuilderV3<GraphConfig, GraphConfig.Builder, GraphConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
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
                if (message instanceof ActionGraphConfig) {
                    return mergeFrom((ActionGraphConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionGraphConfig actionGraphConfig) {
                if (actionGraphConfig == ActionGraphConfig.getDefaultInstance()) {
                    return this;
                }
                if (actionGraphConfig.getType() != 0) {
                    setType(actionGraphConfig.getType());
                }
                if (actionGraphConfig.getStartTime() != 0) {
                    setStartTime(actionGraphConfig.getStartTime());
                }
                if (actionGraphConfig.hasConfig()) {
                    mergeConfig(actionGraphConfig.getConfig());
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
            public com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.access$17200()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionGraphConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionGraphConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionGraphConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionGraphConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionGraphConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionGraphConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder.smali:1095
            }
        }

        public static Builder newBuilder(ActionGraphConfig actionGraphConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionGraphConfig);
        }

        public static ActionGraphConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionGraphConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionGraphConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionGraphConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionGraphConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionGraphConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionGraphConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionGraphConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
        }

        public static ActionGraphConfig parseFrom(InputStream inputStream) {
            return (ActionGraphConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionGraphConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionGraphConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionGraphConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag != 34) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                GraphConfig graphConfig = this.config_;
                                GraphConfig.Builder builder = graphConfig != null ? graphConfig.toBuilder() : null;
                                GraphConfig graphConfig2 = (GraphConfig) codedInputStream.readMessage(GraphConfig.parser(), extensionRegistryLite);
                                this.config_ = graphConfig2;
                                if (builder != null) {
                                    builder.mergeFrom(graphConfig2);
                                    this.config_ = builder.buildPartial();
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

        public static ActionGraphConfig parseFrom(CodedInputStream codedInputStream) {
            return (ActionGraphConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionGraphConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionGraphConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionGraphConfigOrBuilder extends MessageOrBuilder {
        ActionGraphConfig.GraphConfig getConfig();

        ActionGraphConfig.GraphConfigOrBuilder getConfigOrBuilder();

        long getStartTime();

        int getType();

        boolean hasConfig();
    }

    public static final class ActionImageConfig extends GeneratedMessageV3 implements ActionImageConfigOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 5;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int POSITIONFLAG_FIELD_NUMBER = 8;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VIEWHEIGHT_FIELD_NUMBER = 7;
        public static final int VIEWWIDTH_FIELD_NUMBER = 6;
        public static final int WIDTH_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int height_;
        private byte memoizedIsInitialized;
        private volatile Object path_;
        private int positionFlag_;
        private long startTime_;
        private int type_;
        private int viewHeight_;
        private int viewWidth_;
        private int width_;
        private static final ActionImageConfig DEFAULT_INSTANCE = new ActionImageConfig();
        private static final Parser<ActionImageConfig> PARSER = new AbstractParser<ActionImageConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionImageConfig.1
            @Override // com.google.protobuf.Parser
            public ActionImageConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionImageConfig(codedInputStream, extensionRegistryLite);
            }
        };

        public static ActionImageConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionImageConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionImageConfig parseDelimitedFrom(InputStream inputStream) {
            return (ActionImageConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionImageConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionImageConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionImageConfig)) {
                return super.equals(obj);
            }
            ActionImageConfig actionImageConfig = (ActionImageConfig) obj;
            return getType() == actionImageConfig.getType() && getStartTime() == actionImageConfig.getStartTime() && getPath().equals(actionImageConfig.getPath()) && getWidth() == actionImageConfig.getWidth() && getHeight() == actionImageConfig.getHeight() && getViewWidth() == actionImageConfig.getViewWidth() && getViewHeight() == actionImageConfig.getViewHeight() && getPositionFlag() == actionImageConfig.getPositionFlag();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionImageConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public String getPath() {
            Object obj = this.path_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.path_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public ByteString getPathBytes() {
            Object obj = this.path_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.path_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public int getPositionFlag() {
            return this.positionFlag_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            if (!getPathBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(3, this.path_);
            }
            int i12 = this.width_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i12);
            }
            int i13 = this.height_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i13);
            }
            int i14 = this.viewWidth_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i14);
            }
            int i15 = this.viewHeight_;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, i15);
            }
            int i16 = this.positionFlag_;
            if (i16 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, i16);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public int getViewHeight() {
            return this.viewHeight_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public int getViewWidth() {
            return this.viewWidth_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 3) * 53) + getPath().hashCode()) * 37) + 4) * 53) + getWidth()) * 37) + 5) * 53) + getHeight()) * 37) + 6) * 53) + getViewWidth()) * 37) + 7) * 53) + getViewHeight()) * 37) + 8) * 53) + getPositionFlag()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionImageConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionImageConfig.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            if (!getPathBytes().isEmpty()) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.path_);
            }
            int i11 = this.width_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(4, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(5, i12);
            }
            int i13 = this.viewWidth_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(6, i13);
            }
            int i14 = this.viewHeight_;
            if (i14 != 0) {
                codedOutputStream.writeInt32(7, i14);
            }
            int i15 = this.positionFlag_;
            if (i15 != 0) {
                codedOutputStream.writeInt32(8, i15);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionImageConfigOrBuilder {
            private int height_;
            private Object path_;
            private int positionFlag_;
            private long startTime_;
            private int type_;
            private int viewHeight_;
            private int viewWidth_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionImageConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPath() {
                this.path_ = ActionImageConfig.getDefaultInstance().getPath();
                onChanged();
                return this;
            }

            public Builder clearPositionFlag() {
                this.positionFlag_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionImageConfig_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public String getPath() {
                Object obj = this.path_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.path_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public ByteString getPathBytes() {
                Object obj = this.path_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.path_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public int getPositionFlag() {
                return this.positionFlag_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public int getViewHeight() {
                return this.viewHeight_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public int getViewWidth() {
                return this.viewWidth_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionImageConfigOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionImageConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionImageConfig.class, Builder.class);
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

            public Builder setPath(String str) {
                str.getClass();
                this.path_ = str;
                onChanged();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.path_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPositionFlag(int i10) {
                this.positionFlag_ = i10;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setViewHeight(int i10) {
                this.viewHeight_ = i10;
                onChanged();
                return this;
            }

            public Builder setViewWidth(int i10) {
                this.viewWidth_ = i10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.path_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionImageConfig build() {
                ActionImageConfig actionImageConfigBuildPartial = buildPartial();
                if (actionImageConfigBuildPartial.isInitialized()) {
                    return actionImageConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionImageConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionImageConfig buildPartial() {
                ActionImageConfig actionImageConfig = new ActionImageConfig(this);
                actionImageConfig.type_ = this.type_;
                actionImageConfig.startTime_ = this.startTime_;
                actionImageConfig.path_ = this.path_;
                actionImageConfig.width_ = this.width_;
                actionImageConfig.height_ = this.height_;
                actionImageConfig.viewWidth_ = this.viewWidth_;
                actionImageConfig.viewHeight_ = this.viewHeight_;
                actionImageConfig.positionFlag_ = this.positionFlag_;
                onBuilt();
                return actionImageConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionImageConfig getDefaultInstanceForType() {
                return ActionImageConfig.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                this.path_ = "";
                this.width_ = 0;
                this.height_ = 0;
                this.viewWidth_ = 0;
                this.viewHeight_ = 0;
                this.positionFlag_ = 0;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.path_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionImageConfig) {
                    return mergeFrom((ActionImageConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionImageConfig actionImageConfig) {
                if (actionImageConfig == ActionImageConfig.getDefaultInstance()) {
                    return this;
                }
                if (actionImageConfig.getType() != 0) {
                    setType(actionImageConfig.getType());
                }
                if (actionImageConfig.getStartTime() != 0) {
                    setStartTime(actionImageConfig.getStartTime());
                }
                if (!actionImageConfig.getPath().isEmpty()) {
                    this.path_ = actionImageConfig.path_;
                    onChanged();
                }
                if (actionImageConfig.getWidth() != 0) {
                    setWidth(actionImageConfig.getWidth());
                }
                if (actionImageConfig.getHeight() != 0) {
                    setHeight(actionImageConfig.getHeight());
                }
                if (actionImageConfig.getViewWidth() != 0) {
                    setViewWidth(actionImageConfig.getViewWidth());
                }
                if (actionImageConfig.getViewHeight() != 0) {
                    setViewHeight(actionImageConfig.getViewHeight());
                }
                if (actionImageConfig.getPositionFlag() != 0) {
                    setPositionFlag(actionImageConfig.getPositionFlag());
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
            public com.zykj.sketch.EzyDrawBoard.ActionImageConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionImageConfig.access$13400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionImageConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionImageConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionImageConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionImageConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionImageConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionImageConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder.smali:1016
            }
        }

        public static Builder newBuilder(ActionImageConfig actionImageConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionImageConfig);
        }

        public static ActionImageConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionImageConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionImageConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionImageConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionImageConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionImageConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionImageConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionImageConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.path_ = "";
            this.width_ = 0;
            this.height_ = 0;
            this.viewWidth_ = 0;
            this.viewHeight_ = 0;
            this.positionFlag_ = 0;
        }

        public static ActionImageConfig parseFrom(InputStream inputStream) {
            return (ActionImageConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionImageConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionImageConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionImageConfig parseFrom(CodedInputStream codedInputStream) {
            return (ActionImageConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionImageConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionImageConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ActionImageConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag == 26) {
                                this.path_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 32) {
                                this.width_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.height_ = codedInputStream.readInt32();
                            } else if (tag == 48) {
                                this.viewWidth_ = codedInputStream.readInt32();
                            } else if (tag == 56) {
                                this.viewHeight_ = codedInputStream.readInt32();
                            } else if (tag != 64) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.positionFlag_ = codedInputStream.readInt32();
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
    }

    public interface ActionImageConfigOrBuilder extends MessageOrBuilder {
        int getHeight();

        String getPath();

        ByteString getPathBytes();

        int getPositionFlag();

        long getStartTime();

        int getType();

        int getViewHeight();

        int getViewWidth();

        int getWidth();
    }

    public static final class ActionModeConfig extends GeneratedMessageV3 implements ActionModeConfigOrBuilder {
        public static final int MODE_FIELD_NUMBER = 4;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int mode_;
        private long startTime_;
        private int type_;
        private static final ActionModeConfig DEFAULT_INSTANCE = new ActionModeConfig();
        private static final Parser<ActionModeConfig> PARSER = new AbstractParser<ActionModeConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionModeConfig.1
            @Override // com.google.protobuf.Parser
            public ActionModeConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionModeConfig(codedInputStream, extensionRegistryLite);
            }
        };

        public enum Mode implements ProtocolMessageEnum {
            ACTION_SELECT(0),
            ACTION_WRITING(1),
            ACTION_SHAPE_CIRCLE(2),
            ACTION_SHAPE_RECT(3),
            ACTION_ERASER_VIEW(5),
            ACTION_ERASER_WRITING(6),
            ACTION_DELETE(7),
            ACTION_WRITING_MOVE(8),
            ACTION_WRITING_MOVE_VERTICAL(9),
            UNRECOGNIZED(-1);

            public static final int ACTION_DELETE_VALUE = 7;
            public static final int ACTION_ERASER_VIEW_VALUE = 5;
            public static final int ACTION_ERASER_WRITING_VALUE = 6;
            public static final int ACTION_SELECT_VALUE = 0;
            public static final int ACTION_SHAPE_CIRCLE_VALUE = 2;
            public static final int ACTION_SHAPE_RECT_VALUE = 3;
            public static final int ACTION_WRITING_MOVE_VALUE = 8;
            public static final int ACTION_WRITING_MOVE_VERTICAL_VALUE = 9;
            public static final int ACTION_WRITING_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionModeConfig.Mode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Mode findValueByNumber(int i10) {
                    return Mode.forNumber(i10);
                }
            };
            private static final Mode[] VALUES = values();

            Mode(int i10) {
                this.value = i10;
            }

            public static Mode forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return ACTION_SELECT;
                    case 1:
                        return ACTION_WRITING;
                    case 2:
                        return ACTION_SHAPE_CIRCLE;
                    case 3:
                        return ACTION_SHAPE_RECT;
                    case 4:
                    default:
                        return null;
                    case 5:
                        return ACTION_ERASER_VIEW;
                    case 6:
                        return ACTION_ERASER_WRITING;
                    case 7:
                        return ACTION_DELETE;
                    case 8:
                        return ACTION_WRITING_MOVE;
                    case 9:
                        return ACTION_WRITING_MOVE_VERTICAL;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ActionModeConfig.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Mode> internalGetValueMap() {
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
            public static Mode valueOf(int i10) {
                return forNumber(i10);
            }

            public static Mode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static ActionModeConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionModeConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionModeConfig parseDelimitedFrom(InputStream inputStream) {
            return (ActionModeConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionModeConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionModeConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionModeConfig)) {
                return super.equals(obj);
            }
            ActionModeConfig actionModeConfig = (ActionModeConfig) obj;
            return getType() == actionModeConfig.getType() && getStartTime() == actionModeConfig.getStartTime() && this.mode_ == actionModeConfig.mode_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
        public Mode getMode() {
            Mode modeValueOf = Mode.valueOf(this.mode_);
            return modeValueOf == null ? Mode.UNRECOGNIZED : modeValueOf;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
        public int getModeValue() {
            return this.mode_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionModeConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            if (this.mode_ != Mode.ACTION_SELECT.getNumber()) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.mode_);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 4) * 53) + this.mode_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionModeConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionModeConfig.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            if (this.mode_ != Mode.ACTION_SELECT.getNumber()) {
                codedOutputStream.writeEnum(4, this.mode_);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionModeConfigOrBuilder {
            private int mode_;
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionModeConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearMode() {
                this.mode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionModeConfig_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
            public Mode getMode() {
                Mode modeValueOf = Mode.valueOf(this.mode_);
                return modeValueOf == null ? Mode.UNRECOGNIZED : modeValueOf;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
            public int getModeValue() {
                return this.mode_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionModeConfigOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionModeConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionModeConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.mode_ = mode.getNumber();
                onChanged();
                return this;
            }

            public Builder setModeValue(int i10) {
                this.mode_ = i10;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.mode_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionModeConfig build() {
                ActionModeConfig actionModeConfigBuildPartial = buildPartial();
                if (actionModeConfigBuildPartial.isInitialized()) {
                    return actionModeConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionModeConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionModeConfig buildPartial() {
                ActionModeConfig actionModeConfig = new ActionModeConfig(this);
                actionModeConfig.type_ = this.type_;
                actionModeConfig.startTime_ = this.startTime_;
                actionModeConfig.mode_ = this.mode_;
                onBuilt();
                return actionModeConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionModeConfig getDefaultInstanceForType() {
                return ActionModeConfig.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                this.mode_ = 0;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionModeConfig) {
                    return mergeFrom((ActionModeConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionModeConfig actionModeConfig) {
                if (actionModeConfig == ActionModeConfig.getDefaultInstance()) {
                    return this;
                }
                if (actionModeConfig.getType() != 0) {
                    setType(actionModeConfig.getType());
                }
                if (actionModeConfig.getStartTime() != 0) {
                    setStartTime(actionModeConfig.getStartTime());
                }
                if (actionModeConfig.mode_ != 0) {
                    setModeValue(actionModeConfig.getModeValue());
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
            public com.zykj.sketch.EzyDrawBoard.ActionModeConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionModeConfig.access$20700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionModeConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionModeConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionModeConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionModeConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionModeConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionModeConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder.smali:754
            }
        }

        public static Builder newBuilder(ActionModeConfig actionModeConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionModeConfig);
        }

        public static ActionModeConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionModeConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionModeConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionModeConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionModeConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionModeConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionModeConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionModeConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.mode_ = 0;
        }

        public static ActionModeConfig parseFrom(InputStream inputStream) {
            return (ActionModeConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionModeConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionModeConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionModeConfig parseFrom(CodedInputStream codedInputStream) {
            return (ActionModeConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private ActionModeConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag != 32) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.mode_ = codedInputStream.readEnum();
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

        public static ActionModeConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionModeConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionModeConfigOrBuilder extends MessageOrBuilder {
        ActionModeConfig.Mode getMode();

        int getModeValue();

        long getStartTime();

        int getType();
    }

    public static final class ActionNextAction extends GeneratedMessageV3 implements ActionNextActionOrBuilder {
        private static final ActionNextAction DEFAULT_INSTANCE = new ActionNextAction();
        private static final Parser<ActionNextAction> PARSER = new AbstractParser<ActionNextAction>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionNextAction.1
            @Override // com.google.protobuf.Parser
            public ActionNextAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionNextAction(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long startTime_;
        private int type_;

        public static ActionNextAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionNextAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionNextAction parseDelimitedFrom(InputStream inputStream) {
            return (ActionNextAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionNextAction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionNextAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionNextAction)) {
                return super.equals(obj);
            }
            ActionNextAction actionNextAction = (ActionNextAction) obj;
            return getType() == actionNextAction.getType() && getStartTime() == actionNextAction.getStartTime();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionNextAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionNextActionOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionNextActionOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionNextAction_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionNextAction.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionNextActionOrBuilder {
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionNextAction_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionNextAction_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionNextActionOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionNextActionOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionNextAction_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionNextAction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
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
            public ActionNextAction build() {
                ActionNextAction actionNextActionBuildPartial = buildPartial();
                if (actionNextActionBuildPartial.isInitialized()) {
                    return actionNextActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionNextActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionNextAction buildPartial() {
                ActionNextAction actionNextAction = new ActionNextAction(this);
                actionNextAction.type_ = this.type_;
                actionNextAction.startTime_ = this.startTime_;
                onBuilt();
                return actionNextAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionNextAction getDefaultInstanceForType() {
                return ActionNextAction.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionNextAction) {
                    return mergeFrom((ActionNextAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionNextAction actionNextAction) {
                if (actionNextAction == ActionNextAction.getDefaultInstance()) {
                    return this;
                }
                if (actionNextAction.getType() != 0) {
                    setType(actionNextAction.getType());
                }
                if (actionNextAction.getStartTime() != 0) {
                    setStartTime(actionNextAction.getStartTime());
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
            public com.zykj.sketch.EzyDrawBoard.ActionNextAction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionNextAction.access$25200()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionNextAction r3 = (com.zykj.sketch.EzyDrawBoard.ActionNextAction) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionNextAction r4 = (com.zykj.sketch.EzyDrawBoard.ActionNextAction) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionNextAction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionNextAction$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionNextAction$Builder.smali:676
            }
        }

        public static Builder newBuilder(ActionNextAction actionNextAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionNextAction);
        }

        public static ActionNextAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionNextAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionNextAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionNextAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionNextAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionNextAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionNextAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionNextAction() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
        }

        public static ActionNextAction parseFrom(InputStream inputStream) {
            return (ActionNextAction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionNextAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionNextAction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionNextAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.startTime_ = codedInputStream.readInt64();
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

        public static ActionNextAction parseFrom(CodedInputStream codedInputStream) {
            return (ActionNextAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionNextAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionNextAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionNextActionOrBuilder extends MessageOrBuilder {
        long getStartTime();

        int getType();
    }

    public static final class ActionPrevAction extends GeneratedMessageV3 implements ActionPrevActionOrBuilder {
        private static final ActionPrevAction DEFAULT_INSTANCE = new ActionPrevAction();
        private static final Parser<ActionPrevAction> PARSER = new AbstractParser<ActionPrevAction>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionPrevAction.1
            @Override // com.google.protobuf.Parser
            public ActionPrevAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionPrevAction(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long startTime_;
        private int type_;

        public static ActionPrevAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionPrevAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionPrevAction parseDelimitedFrom(InputStream inputStream) {
            return (ActionPrevAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionPrevAction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionPrevAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionPrevAction)) {
                return super.equals(obj);
            }
            ActionPrevAction actionPrevAction = (ActionPrevAction) obj;
            return getType() == actionPrevAction.getType() && getStartTime() == actionPrevAction.getStartTime();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionPrevAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionPrevActionOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionPrevActionOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionPrevAction_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionPrevAction.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionPrevActionOrBuilder {
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionPrevAction_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionPrevAction_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionPrevActionOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionPrevActionOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionPrevAction_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionPrevAction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
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
            public ActionPrevAction build() {
                ActionPrevAction actionPrevActionBuildPartial = buildPartial();
                if (actionPrevActionBuildPartial.isInitialized()) {
                    return actionPrevActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionPrevActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionPrevAction buildPartial() {
                ActionPrevAction actionPrevAction = new ActionPrevAction(this);
                actionPrevAction.type_ = this.type_;
                actionPrevAction.startTime_ = this.startTime_;
                onBuilt();
                return actionPrevAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionPrevAction getDefaultInstanceForType() {
                return ActionPrevAction.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionPrevAction) {
                    return mergeFrom((ActionPrevAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionPrevAction actionPrevAction) {
                if (actionPrevAction == ActionPrevAction.getDefaultInstance()) {
                    return this;
                }
                if (actionPrevAction.getType() != 0) {
                    setType(actionPrevAction.getType());
                }
                if (actionPrevAction.getStartTime() != 0) {
                    setStartTime(actionPrevAction.getStartTime());
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
            public com.zykj.sketch.EzyDrawBoard.ActionPrevAction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionPrevAction.access$24200()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionPrevAction r3 = (com.zykj.sketch.EzyDrawBoard.ActionPrevAction) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionPrevAction r4 = (com.zykj.sketch.EzyDrawBoard.ActionPrevAction) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionPrevAction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionPrevAction$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionPrevAction$Builder.smali:676
            }
        }

        public static Builder newBuilder(ActionPrevAction actionPrevAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionPrevAction);
        }

        public static ActionPrevAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionPrevAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionPrevAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionPrevAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionPrevAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionPrevAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionPrevAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionPrevAction() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
        }

        public static ActionPrevAction parseFrom(InputStream inputStream) {
            return (ActionPrevAction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionPrevAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionPrevAction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionPrevAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.startTime_ = codedInputStream.readInt64();
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

        public static ActionPrevAction parseFrom(CodedInputStream codedInputStream) {
            return (ActionPrevAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionPrevAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionPrevAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionPrevActionOrBuilder extends MessageOrBuilder {
        long getStartTime();

        int getType();
    }

    public static final class ActionResetMatrix extends GeneratedMessageV3 implements ActionResetMatrixOrBuilder {
        private static final ActionResetMatrix DEFAULT_INSTANCE = new ActionResetMatrix();
        private static final Parser<ActionResetMatrix> PARSER = new AbstractParser<ActionResetMatrix>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionResetMatrix.1
            @Override // com.google.protobuf.Parser
            public ActionResetMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionResetMatrix(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long startTime_;

        public static ActionResetMatrix getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionResetMatrix_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionResetMatrix parseDelimitedFrom(InputStream inputStream) {
            return (ActionResetMatrix) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionResetMatrix parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionResetMatrix> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof ActionResetMatrix) ? super.equals(obj) : getStartTime() == ((ActionResetMatrix) obj).getStartTime();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionResetMatrix> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.startTime_;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            this.memoizedSize = iComputeInt64Size;
            return iComputeInt64Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionResetMatrixOrBuilder
        public long getStartTime() {
            return this.startTime_;
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
            int iHashCode = ((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getStartTime())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionResetMatrix_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionResetMatrix.class, Builder.class);
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
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionResetMatrixOrBuilder {
            private long startTime_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionResetMatrix_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionResetMatrix_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionResetMatrixOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionResetMatrix_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionResetMatrix.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
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
            public ActionResetMatrix build() {
                ActionResetMatrix actionResetMatrixBuildPartial = buildPartial();
                if (actionResetMatrixBuildPartial.isInitialized()) {
                    return actionResetMatrixBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionResetMatrixBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionResetMatrix buildPartial() {
                ActionResetMatrix actionResetMatrix = new ActionResetMatrix(this);
                actionResetMatrix.startTime_ = this.startTime_;
                onBuilt();
                return actionResetMatrix;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionResetMatrix getDefaultInstanceForType() {
                return ActionResetMatrix.getDefaultInstance();
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
                this.startTime_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionResetMatrix) {
                    return mergeFrom((ActionResetMatrix) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionResetMatrix actionResetMatrix) {
                if (actionResetMatrix == ActionResetMatrix.getDefaultInstance()) {
                    return this;
                }
                if (actionResetMatrix.getStartTime() != 0) {
                    setStartTime(actionResetMatrix.getStartTime());
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
            public com.zykj.sketch.EzyDrawBoard.ActionResetMatrix.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionResetMatrix.access$28900()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionResetMatrix r3 = (com.zykj.sketch.EzyDrawBoard.ActionResetMatrix) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionResetMatrix r4 = (com.zykj.sketch.EzyDrawBoard.ActionResetMatrix) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionResetMatrix.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionResetMatrix$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionResetMatrix$Builder.smali:634
            }
        }

        public static Builder newBuilder(ActionResetMatrix actionResetMatrix) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionResetMatrix);
        }

        public static ActionResetMatrix parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionResetMatrix(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionResetMatrix parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionResetMatrix) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionResetMatrix parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionResetMatrix getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionResetMatrix parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionResetMatrix() {
            this.memoizedIsInitialized = (byte) -1;
            this.startTime_ = 0L;
        }

        public static ActionResetMatrix parseFrom(InputStream inputStream) {
            return (ActionResetMatrix) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionResetMatrix parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionResetMatrix) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionResetMatrix(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.startTime_ = codedInputStream.readInt64();
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

        public static ActionResetMatrix parseFrom(CodedInputStream codedInputStream) {
            return (ActionResetMatrix) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionResetMatrix parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionResetMatrix) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionResetMatrixOrBuilder extends MessageOrBuilder {
        long getStartTime();
    }

    public static final class ActionTouchEvent extends GeneratedMessageV3 implements ActionTouchEventOrBuilder {
        public static final int ENDTIME_FIELD_NUMBER = 3;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TOUCHEVENT_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long endTime_;
        private byte memoizedIsInitialized;
        private long startTime_;
        private List<TouchEvent> touchEvent_;
        private int type_;
        private static final ActionTouchEvent DEFAULT_INSTANCE = new ActionTouchEvent();
        private static final Parser<ActionTouchEvent> PARSER = new AbstractParser<ActionTouchEvent>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.1
            @Override // com.google.protobuf.Parser
            public ActionTouchEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionTouchEvent(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class TouchEvent extends GeneratedMessageV3 implements TouchEventOrBuilder {
            public static final int ACTION_FIELD_NUMBER = 3;
            public static final int EVENTTIME_FIELD_NUMBER = 2;
            public static final int POINTERCOORDS_FIELD_NUMBER = 6;
            public static final int POINTERCOUNT_FIELD_NUMBER = 4;
            public static final int POINTERPROPERTIES_FIELD_NUMBER = 5;
            public static final int X_FIELD_NUMBER = 15;
            public static final int Y_FIELD_NUMBER = 16;
            private static final long serialVersionUID = 0;
            private int action_;
            private int bitField0_;
            private long eventTime_;
            private byte memoizedIsInitialized;
            private List<PointerCoords> pointerCoords_;
            private int pointerCount_;
            private List<PointerProperties> pointerProperties_;

            /* renamed from: x_ */
            private float f19897x_;

            /* renamed from: y_ */
            private float f19898y_;
            private static final TouchEvent DEFAULT_INSTANCE = new TouchEvent();
            private static final Parser<TouchEvent> PARSER = new AbstractParser<TouchEvent>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.1
                @Override // com.google.protobuf.Parser
                public TouchEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new TouchEvent(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class PointerCoords extends GeneratedMessageV3 implements PointerCoordsOrBuilder {
                private static final PointerCoords DEFAULT_INSTANCE = new PointerCoords();
                private static final Parser<PointerCoords> PARSER = new AbstractParser<PointerCoords>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.1
                    @Override // com.google.protobuf.Parser
                    public PointerCoords parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new PointerCoords(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int X_FIELD_NUMBER = 1;
                public static final int Y_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;

                /* renamed from: x_ */
                private float f19901x_;

                /* renamed from: y_ */
                private float f19902y_;

                public static PointerCoords getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyDrawBoard.f19893x749fdd98;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static PointerCoords parseDelimitedFrom(InputStream inputStream) {
                    return (PointerCoords) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static PointerCoords parseFrom(ByteString byteString) {
                    return PARSER.parseFrom(byteString);
                }

                public static Parser<PointerCoords> parser() {
                    return PARSER;
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
                    return Float.floatToIntBits(getX()) == Float.floatToIntBits(pointerCoords.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(pointerCoords.getY());
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser<PointerCoords> getParserForType() {
                    return PARSER;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    float f10 = this.f19901x_;
                    int iComputeFloatSize = f10 != 0.0f ? CodedOutputStream.computeFloatSize(1, f10) : 0;
                    float f11 = this.f19902y_;
                    if (f11 != 0.0f) {
                        iComputeFloatSize += CodedOutputStream.computeFloatSize(2, f11);
                    }
                    this.memoizedSize = iComputeFloatSize;
                    return iComputeFloatSize;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return UnknownFieldSet.getDefaultInstance();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoordsOrBuilder
                public float getX() {
                    return this.f19901x_;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoordsOrBuilder
                public float getY() {
                    return this.f19902y_;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyDrawBoard.f19894xa583ec16.ensureFieldAccessorsInitialized(PointerCoords.class, Builder.class);
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
                    float f10 = this.f19901x_;
                    if (f10 != 0.0f) {
                        codedOutputStream.writeFloat(1, f10);
                    }
                    float f11 = this.f19902y_;
                    if (f11 != 0.0f) {
                        codedOutputStream.writeFloat(2, f11);
                    }
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PointerCoordsOrBuilder {

                    /* renamed from: x_ */
                    private float f19903x_;

                    /* renamed from: y_ */
                    private float f19904y_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return EzyDrawBoard.f19893x749fdd98;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
                    }

                    public Builder clearX() {
                        this.f19903x_ = 0.0f;
                        onChanged();
                        return this;
                    }

                    public Builder clearY() {
                        this.f19904y_ = 0.0f;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyDrawBoard.f19893x749fdd98;
                    }

                    @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoordsOrBuilder
                    public float getX() {
                        return this.f19903x_;
                    }

                    @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoordsOrBuilder
                    public float getY() {
                        return this.f19904y_;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyDrawBoard.f19894xa583ec16.ensureFieldAccessorsInitialized(PointerCoords.class, Builder.class);
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

                    public Builder setX(float f10) {
                        this.f19903x_ = f10;
                        onChanged();
                        return this;
                    }

                    public Builder setY(float f10) {
                        this.f19904y_ = f10;
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
                    public PointerCoords build() {
                        PointerCoords pointerCoordsBuildPartial = buildPartial();
                        if (pointerCoordsBuildPartial.isInitialized()) {
                            return pointerCoordsBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerCoordsBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public PointerCoords buildPartial() {
                        PointerCoords pointerCoords = new PointerCoords(this);
                        pointerCoords.f19901x_ = this.f19903x_;
                        pointerCoords.f19902y_ = this.f19904y_;
                        onBuilt();
                        return pointerCoords;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    public PointerCoords getDefaultInstanceForType() {
                        return PointerCoords.getDefaultInstance();
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
                        this.f19903x_ = 0.0f;
                        this.f19904y_ = 0.0f;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public Builder mo33979clone() {
                        return (Builder) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof PointerCoords) {
                            return mergeFrom((PointerCoords) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(PointerCoords pointerCoords) {
                        if (pointerCoords == PointerCoords.getDefaultInstance()) {
                            return this;
                        }
                        if (pointerCoords.getX() != 0.0f) {
                            setX(pointerCoords.getX());
                        }
                        if (pointerCoords.getY() != 0.0f) {
                            setY(pointerCoords.getY());
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
                    public com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.access$9000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                            com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords r3 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                            com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords r4 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder.smali:673
                    }
                }

                public static Builder newBuilder(PointerCoords pointerCoords) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(pointerCoords);
                }

                public static PointerCoords parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                private PointerCoords(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static PointerCoords parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PointerCoords) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static PointerCoords parseFrom(byte[] bArr) {
                    return PARSER.parseFrom(bArr);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public PointerCoords getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static PointerCoords parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private PointerCoords() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.f19901x_ = 0.0f;
                    this.f19902y_ = 0.0f;
                }

                public static PointerCoords parseFrom(InputStream inputStream) {
                    return (PointerCoords) GeneratedMessage.parseWithIOException(PARSER, inputStream);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static PointerCoords parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PointerCoords) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                private PointerCoords(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    this();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 13) {
                                        this.f19901x_ = codedInputStream.readFloat();
                                    } else if (tag != 21) {
                                        if (!codedInputStream.skipField(tag)) {
                                        }
                                    } else {
                                        this.f19902y_ = codedInputStream.readFloat();
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

                public static PointerCoords parseFrom(CodedInputStream codedInputStream) {
                    return (PointerCoords) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
                }

                public static PointerCoords parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PointerCoords) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            public interface PointerCoordsOrBuilder extends MessageOrBuilder {
                float getX();

                float getY();
            }

            public static final class PointerProperties extends GeneratedMessageV3 implements PointerPropertiesOrBuilder {
                public static final int ID_FIELD_NUMBER = 1;
                public static final int TOOLTYPE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private int id_;
                private byte memoizedIsInitialized;
                private int toolType_;
                private static final PointerProperties DEFAULT_INSTANCE = new PointerProperties();
                private static final Parser<PointerProperties> PARSER = new AbstractParser<PointerProperties>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.1
                    @Override // com.google.protobuf.Parser
                    public PointerProperties parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new PointerProperties(codedInputStream, extensionRegistryLite);
                    }
                };

                public static PointerProperties getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyDrawBoard.f19895x13f7163;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static PointerProperties parseDelimitedFrom(InputStream inputStream) {
                    return (PointerProperties) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static PointerProperties parseFrom(ByteString byteString) {
                    return PARSER.parseFrom(byteString);
                }

                public static Parser<PointerProperties> parser() {
                    return PARSER;
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
                    return getId() == pointerProperties.getId() && getToolType() == pointerProperties.getToolType();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerPropertiesOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser<PointerProperties> getParserForType() {
                    return PARSER;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.id_;
                    int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                    int i12 = this.toolType_;
                    if (i12 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                    }
                    this.memoizedSize = iComputeInt32Size;
                    return iComputeInt32Size;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerPropertiesOrBuilder
                public int getToolType() {
                    return this.toolType_;
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
                    int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + getToolType()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyDrawBoard.f19896x12484e1.ensureFieldAccessorsInitialized(PointerProperties.class, Builder.class);
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
                    int i10 = this.id_;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(1, i10);
                    }
                    int i11 = this.toolType_;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(2, i11);
                    }
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PointerPropertiesOrBuilder {
                    private int id_;
                    private int toolType_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return EzyDrawBoard.f19895x13f7163;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
                    }

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearToolType() {
                        this.toolType_ = 0;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyDrawBoard.f19895x13f7163;
                    }

                    @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerPropertiesOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerPropertiesOrBuilder
                    public int getToolType() {
                        return this.toolType_;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyDrawBoard.f19896x12484e1.ensureFieldAccessorsInitialized(PointerProperties.class, Builder.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return this;
                    }

                    public Builder setId(int i10) {
                        this.id_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setToolType(int i10) {
                        this.toolType_ = i10;
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
                    public PointerProperties build() {
                        PointerProperties pointerPropertiesBuildPartial = buildPartial();
                        if (pointerPropertiesBuildPartial.isInitialized()) {
                            return pointerPropertiesBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public PointerProperties buildPartial() {
                        PointerProperties pointerProperties = new PointerProperties(this);
                        pointerProperties.id_ = this.id_;
                        pointerProperties.toolType_ = this.toolType_;
                        onBuilt();
                        return pointerProperties;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    public PointerProperties getDefaultInstanceForType() {
                        return PointerProperties.getDefaultInstance();
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
                        this.id_ = 0;
                        this.toolType_ = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public Builder mo33979clone() {
                        return (Builder) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof PointerProperties) {
                            return mergeFrom((PointerProperties) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(PointerProperties pointerProperties) {
                        if (pointerProperties == PointerProperties.getDefaultInstance()) {
                            return this;
                        }
                        if (pointerProperties.getId() != 0) {
                            setId(pointerProperties.getId());
                        }
                        if (pointerProperties.getToolType() != 0) {
                            setToolType(pointerProperties.getToolType());
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
                    public com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.access$8000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                            com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties r3 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                            com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties r4 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder.smali:673
                    }
                }

                public static Builder newBuilder(PointerProperties pointerProperties) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(pointerProperties);
                }

                public static PointerProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                private PointerProperties(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static PointerProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PointerProperties) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static PointerProperties parseFrom(byte[] bArr) {
                    return PARSER.parseFrom(bArr);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public PointerProperties getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static PointerProperties parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private PointerProperties() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.id_ = 0;
                    this.toolType_ = 0;
                }

                public static PointerProperties parseFrom(InputStream inputStream) {
                    return (PointerProperties) GeneratedMessage.parseWithIOException(PARSER, inputStream);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static PointerProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PointerProperties) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                private PointerProperties(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    this();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.id_ = codedInputStream.readInt32();
                                    } else if (tag != 16) {
                                        if (!codedInputStream.skipField(tag)) {
                                        }
                                    } else {
                                        this.toolType_ = codedInputStream.readInt32();
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

                public static PointerProperties parseFrom(CodedInputStream codedInputStream) {
                    return (PointerProperties) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
                }

                public static PointerProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PointerProperties) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            public interface PointerPropertiesOrBuilder extends MessageOrBuilder {
                int getId();

                int getToolType();
            }

            public static TouchEvent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionTouchEvent_TouchEvent_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static TouchEvent parseDelimitedFrom(InputStream inputStream) {
                return (TouchEvent) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static TouchEvent parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<TouchEvent> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TouchEvent)) {
                    return super.equals(obj);
                }
                TouchEvent touchEvent = (TouchEvent) obj;
                return getEventTime() == touchEvent.getEventTime() && getAction() == touchEvent.getAction() && getPointerCount() == touchEvent.getPointerCount() && getPointerPropertiesList().equals(touchEvent.getPointerPropertiesList()) && getPointerCoordsList().equals(touchEvent.getPointerCoordsList()) && Float.floatToIntBits(getX()) == Float.floatToIntBits(touchEvent.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(touchEvent.getY());
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public int getAction() {
                return this.action_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public long getEventTime() {
                return this.eventTime_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<TouchEvent> getParserForType() {
                return PARSER;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public PointerCoords getPointerCoords(int i10) {
                return this.pointerCoords_.get(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public int getPointerCoordsCount() {
                return this.pointerCoords_.size();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public List<PointerCoords> getPointerCoordsList() {
                return this.pointerCoords_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public PointerCoordsOrBuilder getPointerCoordsOrBuilder(int i10) {
                return this.pointerCoords_.get(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public List<? extends PointerCoordsOrBuilder> getPointerCoordsOrBuilderList() {
                return this.pointerCoords_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public int getPointerCount() {
                return this.pointerCount_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public PointerProperties getPointerProperties(int i10) {
                return this.pointerProperties_.get(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public int getPointerPropertiesCount() {
                return this.pointerProperties_.size();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public List<PointerProperties> getPointerPropertiesList() {
                return this.pointerProperties_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public PointerPropertiesOrBuilder getPointerPropertiesOrBuilder(int i10) {
                return this.pointerProperties_.get(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public List<? extends PointerPropertiesOrBuilder> getPointerPropertiesOrBuilderList() {
                return this.pointerProperties_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                long j10 = this.eventTime_;
                int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(2, j10) : 0;
                int i11 = this.action_;
                if (i11 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt32Size(3, i11);
                }
                int i12 = this.pointerCount_;
                if (i12 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt32Size(4, i12);
                }
                for (int i13 = 0; i13 < this.pointerProperties_.size(); i13++) {
                    iComputeInt64Size += CodedOutputStream.computeMessageSize(5, this.pointerProperties_.get(i13));
                }
                for (int i14 = 0; i14 < this.pointerCoords_.size(); i14++) {
                    iComputeInt64Size += CodedOutputStream.computeMessageSize(6, this.pointerCoords_.get(i14));
                }
                float f10 = this.f19897x_;
                if (f10 != 0.0f) {
                    iComputeInt64Size += CodedOutputStream.computeFloatSize(15, f10);
                }
                float f11 = this.f19898y_;
                if (f11 != 0.0f) {
                    iComputeInt64Size += CodedOutputStream.computeFloatSize(16, f11);
                }
                this.memoizedSize = iComputeInt64Size;
                return iComputeInt64Size;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return UnknownFieldSet.getDefaultInstance();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public float getX() {
                return this.f19897x_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
            public float getY() {
                return this.f19898y_;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getEventTime())) * 37) + 3) * 53) + getAction()) * 37) + 4) * 53) + getPointerCount();
                if (getPointerPropertiesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getPointerPropertiesList().hashCode();
                }
                if (getPointerCoordsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getPointerCoordsList().hashCode();
                }
                int iFloatToIntBits = (((((((((iHashCode * 37) + 15) * 53) + Float.floatToIntBits(getX())) * 37) + 16) * 53) + Float.floatToIntBits(getY())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iFloatToIntBits;
                return iFloatToIntBits;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(TouchEvent.class, Builder.class);
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
                long j10 = this.eventTime_;
                if (j10 != 0) {
                    codedOutputStream.writeInt64(2, j10);
                }
                int i10 = this.action_;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(3, i10);
                }
                int i11 = this.pointerCount_;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(4, i11);
                }
                for (int i12 = 0; i12 < this.pointerProperties_.size(); i12++) {
                    codedOutputStream.writeMessage(5, this.pointerProperties_.get(i12));
                }
                for (int i13 = 0; i13 < this.pointerCoords_.size(); i13++) {
                    codedOutputStream.writeMessage(6, this.pointerCoords_.get(i13));
                }
                float f10 = this.f19897x_;
                if (f10 != 0.0f) {
                    codedOutputStream.writeFloat(15, f10);
                }
                float f11 = this.f19898y_;
                if (f11 != 0.0f) {
                    codedOutputStream.writeFloat(16, f11);
                }
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TouchEventOrBuilder {
                private int action_;
                private int bitField0_;
                private long eventTime_;
                private RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> pointerCoordsBuilder_;
                private List<PointerCoords> pointerCoords_;
                private int pointerCount_;
                private RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> pointerPropertiesBuilder_;
                private List<PointerProperties> pointerProperties_;

                /* renamed from: x_ */
                private float f19899x_;

                /* renamed from: y_ */
                private float f19900y_;

                private void ensurePointerCoordsIsMutable() {
                    if ((this.bitField0_ & 16) != 16) {
                        this.pointerCoords_ = new ArrayList(this.pointerCoords_);
                        this.bitField0_ |= 16;
                    }
                }

                private void ensurePointerPropertiesIsMutable() {
                    if ((this.bitField0_ & 8) != 8) {
                        this.pointerProperties_ = new ArrayList(this.pointerProperties_);
                        this.bitField0_ |= 8;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyDrawBoard.internal_static_ActionTouchEvent_TouchEvent_descriptor;
                }

                private RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> getPointerCoordsFieldBuilder() {
                    if (this.pointerCoordsBuilder_ == null) {
                        this.pointerCoordsBuilder_ = new RepeatedFieldBuilderV3<>(this.pointerCoords_, (this.bitField0_ & 16) == 16, getParentForChildren(), isClean());
                        this.pointerCoords_ = null;
                    }
                    return this.pointerCoordsBuilder_;
                }

                private RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> getPointerPropertiesFieldBuilder() {
                    if (this.pointerPropertiesBuilder_ == null) {
                        this.pointerPropertiesBuilder_ = new RepeatedFieldBuilderV3<>(this.pointerProperties_, (this.bitField0_ & 8) == 8, getParentForChildren(), isClean());
                        this.pointerProperties_ = null;
                    }
                    return this.pointerPropertiesBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getPointerPropertiesFieldBuilder();
                        getPointerCoordsFieldBuilder();
                    }
                }

                public Builder addAllPointerCoords(Iterable<? extends PointerCoords> iterable) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensurePointerCoordsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.pointerCoords_);
                    onChanged();
                    return this;
                }

                public Builder addAllPointerProperties(Iterable<? extends PointerProperties> iterable) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensurePointerPropertiesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.pointerProperties_);
                    onChanged();
                    return this;
                }

                public Builder addPointerCoords(PointerCoords pointerCoords) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointerCoords);
                        return this;
                    }
                    pointerCoords.getClass();
                    ensurePointerCoordsIsMutable();
                    this.pointerCoords_.add(pointerCoords);
                    onChanged();
                    return this;
                }

                public PointerCoords.Builder addPointerCoordsBuilder() {
                    return (PointerCoords.Builder) getPointerCoordsFieldBuilder().addBuilder(PointerCoords.getDefaultInstance());
                }

                public Builder addPointerProperties(PointerProperties pointerProperties) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointerProperties);
                        return this;
                    }
                    pointerProperties.getClass();
                    ensurePointerPropertiesIsMutable();
                    this.pointerProperties_.add(pointerProperties);
                    onChanged();
                    return this;
                }

                public PointerProperties.Builder addPointerPropertiesBuilder() {
                    return (PointerProperties.Builder) getPointerPropertiesFieldBuilder().addBuilder(PointerProperties.getDefaultInstance());
                }

                public Builder clearAction() {
                    this.action_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearEventTime() {
                    this.eventTime_ = 0L;
                    onChanged();
                    return this;
                }

                public Builder clearPointerCoords() {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.pointerCoords_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -17;
                    onChanged();
                    return this;
                }

                public Builder clearPointerCount() {
                    this.pointerCount_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearPointerProperties() {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.pointerProperties_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearX() {
                    this.f19899x_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearY() {
                    this.f19900y_ = 0.0f;
                    onChanged();
                    return this;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public int getAction() {
                    return this.action_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyDrawBoard.internal_static_ActionTouchEvent_TouchEvent_descriptor;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public long getEventTime() {
                    return this.eventTime_;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public PointerCoords getPointerCoords(int i10) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.pointerCoords_.get(i10) : (PointerCoords) repeatedFieldBuilderV3.getMessage(i10);
                }

                public PointerCoords.Builder getPointerCoordsBuilder(int i10) {
                    return (PointerCoords.Builder) getPointerCoordsFieldBuilder().getBuilder(i10);
                }

                public List<PointerCoords.Builder> getPointerCoordsBuilderList() {
                    return getPointerCoordsFieldBuilder().getBuilderList();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public int getPointerCoordsCount() {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.pointerCoords_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public List<PointerCoords> getPointerCoordsList() {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.pointerCoords_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public PointerCoordsOrBuilder getPointerCoordsOrBuilder(int i10) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.pointerCoords_.get(i10) : (PointerCoordsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public List<? extends PointerCoordsOrBuilder> getPointerCoordsOrBuilderList() {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.pointerCoords_);
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public int getPointerCount() {
                    return this.pointerCount_;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public PointerProperties getPointerProperties(int i10) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.pointerProperties_.get(i10) : (PointerProperties) repeatedFieldBuilderV3.getMessage(i10);
                }

                public PointerProperties.Builder getPointerPropertiesBuilder(int i10) {
                    return (PointerProperties.Builder) getPointerPropertiesFieldBuilder().getBuilder(i10);
                }

                public List<PointerProperties.Builder> getPointerPropertiesBuilderList() {
                    return getPointerPropertiesFieldBuilder().getBuilderList();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public int getPointerPropertiesCount() {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.pointerProperties_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public List<PointerProperties> getPointerPropertiesList() {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.pointerProperties_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public PointerPropertiesOrBuilder getPointerPropertiesOrBuilder(int i10) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.pointerProperties_.get(i10) : (PointerPropertiesOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public List<? extends PointerPropertiesOrBuilder> getPointerPropertiesOrBuilderList() {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.pointerProperties_);
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public float getX() {
                    return this.f19899x_;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEventOrBuilder
                public float getY() {
                    return this.f19900y_;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyDrawBoard.internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(TouchEvent.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return this;
                }

                public Builder removePointerCoords(int i10) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i10);
                        return this;
                    }
                    ensurePointerCoordsIsMutable();
                    this.pointerCoords_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removePointerProperties(int i10) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i10);
                        return this;
                    }
                    ensurePointerPropertiesIsMutable();
                    this.pointerProperties_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAction(int i10) {
                    this.action_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setEventTime(long j10) {
                    this.eventTime_ = j10;
                    onChanged();
                    return this;
                }

                public Builder setPointerCoords(int i10, PointerCoords pointerCoords) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i10, pointerCoords);
                        return this;
                    }
                    pointerCoords.getClass();
                    ensurePointerCoordsIsMutable();
                    this.pointerCoords_.set(i10, pointerCoords);
                    onChanged();
                    return this;
                }

                public Builder setPointerCount(int i10) {
                    this.pointerCount_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setPointerProperties(int i10, PointerProperties pointerProperties) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i10, pointerProperties);
                        return this;
                    }
                    pointerProperties.getClass();
                    ensurePointerPropertiesIsMutable();
                    this.pointerProperties_.set(i10, pointerProperties);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return this;
                }

                public Builder setX(float f10) {
                    this.f19899x_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setY(float f10) {
                    this.f19900y_ = f10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    List list = Collections.EMPTY_LIST;
                    this.pointerProperties_ = list;
                    this.pointerCoords_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public TouchEvent build() {
                    TouchEvent touchEventBuildPartial = buildPartial();
                    if (touchEventBuildPartial.isInitialized()) {
                        return touchEventBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchEventBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public TouchEvent buildPartial() {
                    TouchEvent touchEvent = new TouchEvent(this);
                    touchEvent.eventTime_ = this.eventTime_;
                    touchEvent.action_ = this.action_;
                    touchEvent.pointerCount_ = this.pointerCount_;
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        touchEvent.pointerProperties_ = repeatedFieldBuilderV3.build();
                    } else {
                        if ((this.bitField0_ & 8) == 8) {
                            this.pointerProperties_ = Collections.unmodifiableList(this.pointerProperties_);
                            this.bitField0_ &= -9;
                        }
                        touchEvent.pointerProperties_ = this.pointerProperties_;
                    }
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV32 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV32 != null) {
                        touchEvent.pointerCoords_ = repeatedFieldBuilderV32.build();
                    } else {
                        if ((this.bitField0_ & 16) == 16) {
                            this.pointerCoords_ = Collections.unmodifiableList(this.pointerCoords_);
                            this.bitField0_ &= -17;
                        }
                        touchEvent.pointerCoords_ = this.pointerCoords_;
                    }
                    touchEvent.f19897x_ = this.f19899x_;
                    touchEvent.f19898y_ = this.f19900y_;
                    touchEvent.bitField0_ = 0;
                    onBuilt();
                    return touchEvent;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public TouchEvent getDefaultInstanceForType() {
                    return TouchEvent.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                public PointerCoords.Builder addPointerCoordsBuilder(int i10) {
                    return (PointerCoords.Builder) getPointerCoordsFieldBuilder().addBuilder(i10, PointerCoords.getDefaultInstance());
                }

                public PointerProperties.Builder addPointerPropertiesBuilder(int i10) {
                    return (PointerProperties.Builder) getPointerPropertiesFieldBuilder().addBuilder(i10, PointerProperties.getDefaultInstance());
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.eventTime_ = 0L;
                    this.action_ = 0;
                    this.pointerCount_ = 0;
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.pointerProperties_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -9;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV32 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        this.pointerCoords_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -17;
                    } else {
                        repeatedFieldBuilderV32.clear();
                    }
                    this.f19899x_ = 0.0f;
                    this.f19900y_ = 0.0f;
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    List list = Collections.EMPTY_LIST;
                    this.pointerProperties_ = list;
                    this.pointerCoords_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addPointerCoords(int i10, PointerCoords pointerCoords) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        pointerCoords.getClass();
                        ensurePointerCoordsIsMutable();
                        this.pointerCoords_.add(i10, pointerCoords);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i10, pointerCoords);
                    return this;
                }

                public Builder addPointerProperties(int i10, PointerProperties pointerProperties) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        pointerProperties.getClass();
                        ensurePointerPropertiesIsMutable();
                        this.pointerProperties_.add(i10, pointerProperties);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i10, pointerProperties);
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo33979clone() {
                    return (Builder) super.mo33979clone();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof TouchEvent) {
                        return mergeFrom((TouchEvent) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setPointerCoords(int i10, PointerCoords.Builder builder) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensurePointerCoordsIsMutable();
                        this.pointerCoords_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                    return this;
                }

                public Builder setPointerProperties(int i10, PointerProperties.Builder builder) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensurePointerPropertiesIsMutable();
                        this.pointerProperties_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(TouchEvent touchEvent) {
                    if (touchEvent == TouchEvent.getDefaultInstance()) {
                        return this;
                    }
                    if (touchEvent.getEventTime() != 0) {
                        setEventTime(touchEvent.getEventTime());
                    }
                    if (touchEvent.getAction() != 0) {
                        setAction(touchEvent.getAction());
                    }
                    if (touchEvent.getPointerCount() != 0) {
                        setPointerCount(touchEvent.getPointerCount());
                    }
                    if (this.pointerPropertiesBuilder_ == null) {
                        if (!touchEvent.pointerProperties_.isEmpty()) {
                            if (this.pointerProperties_.isEmpty()) {
                                this.pointerProperties_ = touchEvent.pointerProperties_;
                                this.bitField0_ &= -9;
                            } else {
                                ensurePointerPropertiesIsMutable();
                                this.pointerProperties_.addAll(touchEvent.pointerProperties_);
                            }
                            onChanged();
                        }
                    } else if (!touchEvent.pointerProperties_.isEmpty()) {
                        if (!this.pointerPropertiesBuilder_.isEmpty()) {
                            this.pointerPropertiesBuilder_.addAllMessages(touchEvent.pointerProperties_);
                        } else {
                            this.pointerPropertiesBuilder_.dispose();
                            this.pointerPropertiesBuilder_ = null;
                            this.pointerProperties_ = touchEvent.pointerProperties_;
                            this.bitField0_ &= -9;
                            this.pointerPropertiesBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getPointerPropertiesFieldBuilder() : null;
                        }
                    }
                    if (this.pointerCoordsBuilder_ == null) {
                        if (!touchEvent.pointerCoords_.isEmpty()) {
                            if (this.pointerCoords_.isEmpty()) {
                                this.pointerCoords_ = touchEvent.pointerCoords_;
                                this.bitField0_ &= -17;
                            } else {
                                ensurePointerCoordsIsMutable();
                                this.pointerCoords_.addAll(touchEvent.pointerCoords_);
                            }
                            onChanged();
                        }
                    } else if (!touchEvent.pointerCoords_.isEmpty()) {
                        if (!this.pointerCoordsBuilder_.isEmpty()) {
                            this.pointerCoordsBuilder_.addAllMessages(touchEvent.pointerCoords_);
                        } else {
                            this.pointerCoordsBuilder_.dispose();
                            this.pointerCoordsBuilder_ = null;
                            this.pointerCoords_ = touchEvent.pointerCoords_;
                            this.bitField0_ &= -17;
                            this.pointerCoordsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getPointerCoordsFieldBuilder() : null;
                        }
                    }
                    if (touchEvent.getX() != 0.0f) {
                        setX(touchEvent.getX());
                    }
                    if (touchEvent.getY() != 0.0f) {
                        setY(touchEvent.getY());
                    }
                    onChanged();
                    return this;
                }

                public Builder addPointerCoords(PointerCoords.Builder builder) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensurePointerCoordsIsMutable();
                        this.pointerCoords_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }

                public Builder addPointerProperties(PointerProperties.Builder builder) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensurePointerPropertiesIsMutable();
                        this.pointerProperties_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }

                public Builder addPointerCoords(int i10, PointerCoords.Builder builder) {
                    RepeatedFieldBuilderV3<PointerCoords, PointerCoords.Builder, PointerCoordsOrBuilder> repeatedFieldBuilderV3 = this.pointerCoordsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensurePointerCoordsIsMutable();
                        this.pointerCoords_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                    return this;
                }

                public Builder addPointerProperties(int i10, PointerProperties.Builder builder) {
                    RepeatedFieldBuilderV3<PointerProperties, PointerProperties.Builder, PointerPropertiesOrBuilder> repeatedFieldBuilderV3 = this.pointerPropertiesBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensurePointerPropertiesIsMutable();
                        this.pointerProperties_.add(i10, builder.build());
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
                public com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.access$10600()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                        com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent r3 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                        com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent r4 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.TouchEvent.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder.smali:2455
                }
            }

            public static Builder newBuilder(TouchEvent touchEvent) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(touchEvent);
            }

            public static TouchEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private TouchEvent(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static TouchEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TouchEvent) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static TouchEvent parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TouchEvent getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static TouchEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private TouchEvent() {
                this.memoizedIsInitialized = (byte) -1;
                this.eventTime_ = 0L;
                this.action_ = 0;
                this.pointerCount_ = 0;
                List list = Collections.EMPTY_LIST;
                this.pointerProperties_ = list;
                this.pointerCoords_ = list;
                this.f19897x_ = 0.0f;
                this.f19898y_ = 0.0f;
            }

            public static TouchEvent parseFrom(InputStream inputStream) {
                return (TouchEvent) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static TouchEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TouchEvent) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static TouchEvent parseFrom(CodedInputStream codedInputStream) {
                return (TouchEvent) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static TouchEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TouchEvent) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private TouchEvent(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 16) {
                                    this.eventTime_ = codedInputStream.readInt64();
                                } else if (tag == 24) {
                                    this.action_ = codedInputStream.readInt32();
                                } else if (tag == 32) {
                                    this.pointerCount_ = codedInputStream.readInt32();
                                } else if (tag == 42) {
                                    if ((i10 & 8) != 8) {
                                        this.pointerProperties_ = new ArrayList();
                                        i10 |= 8;
                                    }
                                    this.pointerProperties_.add((PointerProperties) codedInputStream.readMessage(PointerProperties.parser(), extensionRegistryLite));
                                } else if (tag == 50) {
                                    if ((i10 & 16) != 16) {
                                        this.pointerCoords_ = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.pointerCoords_.add((PointerCoords) codedInputStream.readMessage(PointerCoords.parser(), extensionRegistryLite));
                                } else if (tag == 125) {
                                    this.f19897x_ = codedInputStream.readFloat();
                                } else if (tag != 133) {
                                    if (!codedInputStream.skipField(tag)) {
                                    }
                                } else {
                                    this.f19898y_ = codedInputStream.readFloat();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((i10 & 8) == 8) {
                            this.pointerProperties_ = Collections.unmodifiableList(this.pointerProperties_);
                        }
                        if ((i10 & 16) == 16) {
                            this.pointerCoords_ = Collections.unmodifiableList(this.pointerCoords_);
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i10 & 8) == 8) {
                    this.pointerProperties_ = Collections.unmodifiableList(this.pointerProperties_);
                }
                if ((i10 & 16) == 16) {
                    this.pointerCoords_ = Collections.unmodifiableList(this.pointerCoords_);
                }
                makeExtensionsImmutable();
            }
        }

        public interface TouchEventOrBuilder extends MessageOrBuilder {
            int getAction();

            long getEventTime();

            TouchEvent.PointerCoords getPointerCoords(int i10);

            int getPointerCoordsCount();

            List<TouchEvent.PointerCoords> getPointerCoordsList();

            TouchEvent.PointerCoordsOrBuilder getPointerCoordsOrBuilder(int i10);

            List<? extends TouchEvent.PointerCoordsOrBuilder> getPointerCoordsOrBuilderList();

            int getPointerCount();

            TouchEvent.PointerProperties getPointerProperties(int i10);

            int getPointerPropertiesCount();

            List<TouchEvent.PointerProperties> getPointerPropertiesList();

            TouchEvent.PointerPropertiesOrBuilder getPointerPropertiesOrBuilder(int i10);

            List<? extends TouchEvent.PointerPropertiesOrBuilder> getPointerPropertiesOrBuilderList();

            float getX();

            float getY();
        }

        public static ActionTouchEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionTouchEvent_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionTouchEvent parseDelimitedFrom(InputStream inputStream) {
            return (ActionTouchEvent) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionTouchEvent parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionTouchEvent> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionTouchEvent)) {
                return super.equals(obj);
            }
            ActionTouchEvent actionTouchEvent = (ActionTouchEvent) obj;
            return getType() == actionTouchEvent.getType() && getStartTime() == actionTouchEvent.getStartTime() && getEndTime() == actionTouchEvent.getEndTime() && getTouchEventList().equals(actionTouchEvent.getTouchEventList());
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionTouchEvent> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            long j11 = this.endTime_;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(3, j11);
            }
            for (int i12 = 0; i12 < this.touchEvent_.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.touchEvent_.get(i12));
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public TouchEvent getTouchEvent(int i10) {
            return this.touchEvent_.get(i10);
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public int getTouchEventCount() {
            return this.touchEvent_.size();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public List<TouchEvent> getTouchEventList() {
            return this.touchEvent_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public TouchEventOrBuilder getTouchEventOrBuilder(int i10) {
            return this.touchEvent_.get(i10);
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public List<? extends TouchEventOrBuilder> getTouchEventOrBuilderList() {
            return this.touchEvent_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 3) * 53) + Internal.hashLong(getEndTime());
            if (getTouchEventCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getTouchEventList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionTouchEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionTouchEvent.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            long j11 = this.endTime_;
            if (j11 != 0) {
                codedOutputStream.writeInt64(3, j11);
            }
            for (int i11 = 0; i11 < this.touchEvent_.size(); i11++) {
                codedOutputStream.writeMessage(4, this.touchEvent_.get(i11));
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionTouchEventOrBuilder {
            private int bitField0_;
            private long endTime_;
            private long startTime_;
            private RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> touchEventBuilder_;
            private List<TouchEvent> touchEvent_;
            private int type_;

            private void ensureTouchEventIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.touchEvent_ = new ArrayList(this.touchEvent_);
                    this.bitField0_ |= 8;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionTouchEvent_descriptor;
            }

            private RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> getTouchEventFieldBuilder() {
                if (this.touchEventBuilder_ == null) {
                    this.touchEventBuilder_ = new RepeatedFieldBuilderV3<>(this.touchEvent_, (this.bitField0_ & 8) == 8, getParentForChildren(), isClean());
                    this.touchEvent_ = null;
                }
                return this.touchEventBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getTouchEventFieldBuilder();
                }
            }

            public Builder addAllTouchEvent(Iterable<? extends TouchEvent> iterable) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureTouchEventIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.touchEvent_);
                onChanged();
                return this;
            }

            public Builder addTouchEvent(TouchEvent touchEvent) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(touchEvent);
                    return this;
                }
                touchEvent.getClass();
                ensureTouchEventIsMutable();
                this.touchEvent_.add(touchEvent);
                onChanged();
                return this;
            }

            public TouchEvent.Builder addTouchEventBuilder() {
                return (TouchEvent.Builder) getTouchEventFieldBuilder().addBuilder(TouchEvent.getDefaultInstance());
            }

            public Builder clearEndTime() {
                this.endTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTouchEvent() {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.touchEvent_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionTouchEvent_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public long getEndTime() {
                return this.endTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public TouchEvent getTouchEvent(int i10) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                return repeatedFieldBuilderV3 == null ? this.touchEvent_.get(i10) : (TouchEvent) repeatedFieldBuilderV3.getMessage(i10);
            }

            public TouchEvent.Builder getTouchEventBuilder(int i10) {
                return (TouchEvent.Builder) getTouchEventFieldBuilder().getBuilder(i10);
            }

            public List<TouchEvent.Builder> getTouchEventBuilderList() {
                return getTouchEventFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public int getTouchEventCount() {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                return repeatedFieldBuilderV3 == null ? this.touchEvent_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public List<TouchEvent> getTouchEventList() {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.touchEvent_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public TouchEventOrBuilder getTouchEventOrBuilder(int i10) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                return repeatedFieldBuilderV3 == null ? this.touchEvent_.get(i10) : (TouchEventOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public List<? extends TouchEventOrBuilder> getTouchEventOrBuilderList() {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.touchEvent_);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTouchEventOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionTouchEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionTouchEvent.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removeTouchEvent(int i10) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i10);
                    return this;
                }
                ensureTouchEventIsMutable();
                this.touchEvent_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setEndTime(long j10) {
                this.endTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setTouchEvent(int i10, TouchEvent touchEvent) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, touchEvent);
                    return this;
                }
                touchEvent.getClass();
                ensureTouchEventIsMutable();
                this.touchEvent_.set(i10, touchEvent);
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.touchEvent_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionTouchEvent build() {
                ActionTouchEvent actionTouchEventBuildPartial = buildPartial();
                if (actionTouchEventBuildPartial.isInitialized()) {
                    return actionTouchEventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionTouchEventBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionTouchEvent buildPartial() {
                ActionTouchEvent actionTouchEvent = new ActionTouchEvent(this);
                actionTouchEvent.type_ = this.type_;
                actionTouchEvent.startTime_ = this.startTime_;
                actionTouchEvent.endTime_ = this.endTime_;
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    actionTouchEvent.touchEvent_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 8) == 8) {
                        this.touchEvent_ = Collections.unmodifiableList(this.touchEvent_);
                        this.bitField0_ &= -9;
                    }
                    actionTouchEvent.touchEvent_ = this.touchEvent_;
                }
                actionTouchEvent.bitField0_ = 0;
                onBuilt();
                return actionTouchEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionTouchEvent getDefaultInstanceForType() {
                return ActionTouchEvent.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public TouchEvent.Builder addTouchEventBuilder(int i10) {
                return (TouchEvent.Builder) getTouchEventFieldBuilder().addBuilder(i10, TouchEvent.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.startTime_ = 0L;
                this.endTime_ = 0L;
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.touchEvent_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -9;
                    return this;
                }
                repeatedFieldBuilderV3.clear();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.touchEvent_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addTouchEvent(int i10, TouchEvent touchEvent) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    touchEvent.getClass();
                    ensureTouchEventIsMutable();
                    this.touchEvent_.add(i10, touchEvent);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, touchEvent);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionTouchEvent) {
                    return mergeFrom((ActionTouchEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setTouchEvent(int i10, TouchEvent.Builder builder) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureTouchEventIsMutable();
                    this.touchEvent_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(ActionTouchEvent actionTouchEvent) {
                if (actionTouchEvent == ActionTouchEvent.getDefaultInstance()) {
                    return this;
                }
                if (actionTouchEvent.getType() != 0) {
                    setType(actionTouchEvent.getType());
                }
                if (actionTouchEvent.getStartTime() != 0) {
                    setStartTime(actionTouchEvent.getStartTime());
                }
                if (actionTouchEvent.getEndTime() != 0) {
                    setEndTime(actionTouchEvent.getEndTime());
                }
                if (this.touchEventBuilder_ == null) {
                    if (!actionTouchEvent.touchEvent_.isEmpty()) {
                        if (this.touchEvent_.isEmpty()) {
                            this.touchEvent_ = actionTouchEvent.touchEvent_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureTouchEventIsMutable();
                            this.touchEvent_.addAll(actionTouchEvent.touchEvent_);
                        }
                        onChanged();
                    }
                } else if (!actionTouchEvent.touchEvent_.isEmpty()) {
                    if (!this.touchEventBuilder_.isEmpty()) {
                        this.touchEventBuilder_.addAllMessages(actionTouchEvent.touchEvent_);
                    } else {
                        this.touchEventBuilder_.dispose();
                        this.touchEventBuilder_ = null;
                        this.touchEvent_ = actionTouchEvent.touchEvent_;
                        this.bitField0_ &= -9;
                        this.touchEventBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getTouchEventFieldBuilder() : null;
                    }
                }
                onChanged();
                return this;
            }

            public Builder addTouchEvent(TouchEvent.Builder builder) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureTouchEventIsMutable();
                    this.touchEvent_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addTouchEvent(int i10, TouchEvent.Builder builder) {
                RepeatedFieldBuilderV3<TouchEvent, TouchEvent.Builder, TouchEventOrBuilder> repeatedFieldBuilderV3 = this.touchEventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureTouchEventIsMutable();
                    this.touchEvent_.add(i10, builder.build());
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
            public com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.access$11800()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionTouchEvent r3 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionTouchEvent r4 = (com.zykj.sketch.EzyDrawBoard.ActionTouchEvent) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionTouchEvent.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionTouchEvent$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder.smali:1554
            }
        }

        public static Builder newBuilder(ActionTouchEvent actionTouchEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionTouchEvent);
        }

        public static ActionTouchEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionTouchEvent(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionTouchEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionTouchEvent) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionTouchEvent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionTouchEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionTouchEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionTouchEvent() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.endTime_ = 0L;
            this.touchEvent_ = Collections.EMPTY_LIST;
        }

        public static ActionTouchEvent parseFrom(InputStream inputStream) {
            return (ActionTouchEvent) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionTouchEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionTouchEvent) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionTouchEvent parseFrom(CodedInputStream codedInputStream) {
            return (ActionTouchEvent) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private ActionTouchEvent(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag == 24) {
                                this.endTime_ = codedInputStream.readInt64();
                            } else if (tag != 34) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                if ((c10 & '\b') != 8) {
                                    this.touchEvent_ = new ArrayList();
                                    c10 = '\b';
                                }
                                this.touchEvent_.add((TouchEvent) codedInputStream.readMessage(TouchEvent.parser(), extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c10 & '\b') == 8) {
                        this.touchEvent_ = Collections.unmodifiableList(this.touchEvent_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c10 & '\b') == 8) {
                this.touchEvent_ = Collections.unmodifiableList(this.touchEvent_);
            }
            makeExtensionsImmutable();
        }

        public static ActionTouchEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionTouchEvent) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionTouchEventOrBuilder extends MessageOrBuilder {
        long getEndTime();

        long getStartTime();

        ActionTouchEvent.TouchEvent getTouchEvent(int i10);

        int getTouchEventCount();

        List<ActionTouchEvent.TouchEvent> getTouchEventList();

        ActionTouchEvent.TouchEventOrBuilder getTouchEventOrBuilder(int i10);

        List<? extends ActionTouchEvent.TouchEventOrBuilder> getTouchEventOrBuilderList();

        int getType();
    }

    public static final class ActionTranslation extends GeneratedMessageV3 implements ActionTranslationOrBuilder {
        public static final int KEEP_FIELD_NUMBER = 5;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TRANSX_FIELD_NUMBER = 3;
        public static final int TRANSY_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private boolean keep_;
        private byte memoizedIsInitialized;
        private long startTime_;
        private FloatValue transX_;
        private FloatValue transY_;
        private int type_;
        private static final ActionTranslation DEFAULT_INSTANCE = new ActionTranslation();
        private static final Parser<ActionTranslation> PARSER = new AbstractParser<ActionTranslation>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionTranslation.1
            @Override // com.google.protobuf.Parser
            public ActionTranslation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionTranslation(codedInputStream, extensionRegistryLite);
            }
        };

        public static ActionTranslation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionTranslation_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionTranslation parseDelimitedFrom(InputStream inputStream) {
            return (ActionTranslation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionTranslation parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionTranslation> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionTranslation)) {
                return super.equals(obj);
            }
            ActionTranslation actionTranslation = (ActionTranslation) obj;
            boolean z10 = getType() == actionTranslation.getType() && getStartTime() == actionTranslation.getStartTime() && hasTransX() == actionTranslation.hasTransX();
            if (hasTransX()) {
                z10 = z10 && getTransX().equals(actionTranslation.getTransX());
            }
            boolean z11 = z10 && hasTransY() == actionTranslation.hasTransY();
            if (hasTransY()) {
                z11 = z11 && getTransY().equals(actionTranslation.getTransY());
            }
            return z11 && getKeep() == actionTranslation.getKeep();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public boolean getKeep() {
            return this.keep_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionTranslation> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            if (this.transX_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, getTransX());
            }
            if (this.transY_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, getTransY());
            }
            boolean z10 = this.keep_;
            if (z10) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(5, z10);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public FloatValue getTransX() {
            FloatValue floatValue = this.transX_;
            return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public FloatValueOrBuilder getTransXOrBuilder() {
            return getTransX();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public FloatValue getTransY() {
            FloatValue floatValue = this.transY_;
            return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public FloatValueOrBuilder getTransYOrBuilder() {
            return getTransY();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public boolean hasTransX() {
            return this.transX_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
        public boolean hasTransY() {
            return this.transY_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime());
            if (hasTransX()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTransX().hashCode();
            }
            if (hasTransY()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getTransY().hashCode();
            }
            int iHashBoolean = (((((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getKeep())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashBoolean;
            return iHashBoolean;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionTranslation_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionTranslation.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            if (this.transX_ != null) {
                codedOutputStream.writeMessage(3, getTransX());
            }
            if (this.transY_ != null) {
                codedOutputStream.writeMessage(4, getTransY());
            }
            boolean z10 = this.keep_;
            if (z10) {
                codedOutputStream.writeBool(5, z10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionTranslationOrBuilder {
            private boolean keep_;
            private long startTime_;
            private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> transXBuilder_;
            private FloatValue transX_;
            private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> transYBuilder_;
            private FloatValue transY_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionTranslation_descriptor;
            }

            private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> getTransXFieldBuilder() {
                if (this.transXBuilder_ == null) {
                    this.transXBuilder_ = new SingleFieldBuilderV3<>(getTransX(), getParentForChildren(), isClean());
                    this.transX_ = null;
                }
                return this.transXBuilder_;
            }

            private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> getTransYFieldBuilder() {
                if (this.transYBuilder_ == null) {
                    this.transYBuilder_ = new SingleFieldBuilderV3<>(getTransY(), getParentForChildren(), isClean());
                    this.transY_ = null;
                }
                return this.transYBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearKeep() {
                this.keep_ = false;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTransX() {
                if (this.transXBuilder_ == null) {
                    this.transX_ = null;
                    onChanged();
                    return this;
                }
                this.transX_ = null;
                this.transXBuilder_ = null;
                return this;
            }

            public Builder clearTransY() {
                if (this.transYBuilder_ == null) {
                    this.transY_ = null;
                    onChanged();
                    return this;
                }
                this.transY_ = null;
                this.transYBuilder_ = null;
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionTranslation_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public boolean getKeep() {
                return this.keep_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public FloatValue getTransX() {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transXBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FloatValue) singleFieldBuilderV3.getMessage();
                }
                FloatValue floatValue = this.transX_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }

            public FloatValue.Builder getTransXBuilder() {
                onChanged();
                return (FloatValue.Builder) getTransXFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public FloatValueOrBuilder getTransXOrBuilder() {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transXBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FloatValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FloatValue floatValue = this.transX_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public FloatValue getTransY() {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transYBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FloatValue) singleFieldBuilderV3.getMessage();
                }
                FloatValue floatValue = this.transY_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }

            public FloatValue.Builder getTransYBuilder() {
                onChanged();
                return (FloatValue.Builder) getTransYFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public FloatValueOrBuilder getTransYOrBuilder() {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transYBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FloatValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FloatValue floatValue = this.transY_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public boolean hasTransX() {
                return (this.transXBuilder_ == null && this.transX_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionTranslationOrBuilder
            public boolean hasTransY() {
                return (this.transYBuilder_ == null && this.transY_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionTranslation_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionTranslation.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeTransX(FloatValue floatValue) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transXBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(floatValue);
                    return this;
                }
                FloatValue floatValue2 = this.transX_;
                if (floatValue2 != null) {
                    this.transX_ = FloatValue.newBuilder(floatValue2).mergeFrom(floatValue).buildPartial();
                } else {
                    this.transX_ = floatValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeTransY(FloatValue floatValue) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transYBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(floatValue);
                    return this;
                }
                FloatValue floatValue2 = this.transY_;
                if (floatValue2 != null) {
                    this.transY_ = FloatValue.newBuilder(floatValue2).mergeFrom(floatValue).buildPartial();
                } else {
                    this.transY_ = floatValue;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setKeep(boolean z10) {
                this.keep_ = z10;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setTransX(FloatValue floatValue) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transXBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(floatValue);
                    return this;
                }
                floatValue.getClass();
                this.transX_ = floatValue;
                onChanged();
                return this;
            }

            public Builder setTransY(FloatValue floatValue) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transYBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(floatValue);
                    return this;
                }
                floatValue.getClass();
                this.transY_ = floatValue;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.transX_ = null;
                this.transY_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionTranslation build() {
                ActionTranslation actionTranslationBuildPartial = buildPartial();
                if (actionTranslationBuildPartial.isInitialized()) {
                    return actionTranslationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionTranslationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionTranslation buildPartial() {
                ActionTranslation actionTranslation = new ActionTranslation(this);
                actionTranslation.type_ = this.type_;
                actionTranslation.startTime_ = this.startTime_;
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transXBuilder_;
                if (singleFieldBuilderV3 == null) {
                    actionTranslation.transX_ = this.transX_;
                } else {
                    actionTranslation.transX_ = (FloatValue) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV32 = this.transYBuilder_;
                if (singleFieldBuilderV32 == null) {
                    actionTranslation.transY_ = this.transY_;
                } else {
                    actionTranslation.transY_ = (FloatValue) singleFieldBuilderV32.build();
                }
                actionTranslation.keep_ = this.keep_;
                onBuilt();
                return actionTranslation;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionTranslation getDefaultInstanceForType() {
                return ActionTranslation.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                if (this.transXBuilder_ == null) {
                    this.transX_ = null;
                } else {
                    this.transX_ = null;
                    this.transXBuilder_ = null;
                }
                if (this.transYBuilder_ == null) {
                    this.transY_ = null;
                } else {
                    this.transY_ = null;
                    this.transYBuilder_ = null;
                }
                this.keep_ = false;
                return this;
            }

            public Builder setTransX(FloatValue.Builder builder) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transXBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.transX_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setTransY(FloatValue.Builder builder) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.transYBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.transY_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.transX_ = null;
                this.transY_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionTranslation) {
                    return mergeFrom((ActionTranslation) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionTranslation actionTranslation) {
                if (actionTranslation == ActionTranslation.getDefaultInstance()) {
                    return this;
                }
                if (actionTranslation.getType() != 0) {
                    setType(actionTranslation.getType());
                }
                if (actionTranslation.getStartTime() != 0) {
                    setStartTime(actionTranslation.getStartTime());
                }
                if (actionTranslation.hasTransX()) {
                    mergeTransX(actionTranslation.getTransX());
                }
                if (actionTranslation.hasTransY()) {
                    mergeTransY(actionTranslation.getTransY());
                }
                if (actionTranslation.getKeep()) {
                    setKeep(actionTranslation.getKeep());
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
            public com.zykj.sketch.EzyDrawBoard.ActionTranslation.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionTranslation.access$28000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionTranslation r3 = (com.zykj.sketch.EzyDrawBoard.ActionTranslation) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionTranslation r4 = (com.zykj.sketch.EzyDrawBoard.ActionTranslation) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionTranslation.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionTranslation$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder.smali:1402
            }
        }

        public static Builder newBuilder(ActionTranslation actionTranslation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionTranslation);
        }

        public static ActionTranslation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionTranslation(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionTranslation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionTranslation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionTranslation parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionTranslation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionTranslation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionTranslation() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.keep_ = false;
        }

        public static ActionTranslation parseFrom(InputStream inputStream) {
            return (ActionTranslation) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionTranslation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionTranslation) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionTranslation parseFrom(CodedInputStream codedInputStream) {
            return (ActionTranslation) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private ActionTranslation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            FloatValue.Builder builder;
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (tag == 26) {
                                    FloatValue floatValue = this.transX_;
                                    builder = floatValue != null ? floatValue.toBuilder() : null;
                                    FloatValue floatValue2 = (FloatValue) codedInputStream.readMessage(FloatValue.parser(), extensionRegistryLite);
                                    this.transX_ = floatValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(floatValue2);
                                        this.transX_ = builder.buildPartial();
                                    }
                                } else if (tag == 34) {
                                    FloatValue floatValue3 = this.transY_;
                                    builder = floatValue3 != null ? floatValue3.toBuilder() : null;
                                    FloatValue floatValue4 = (FloatValue) codedInputStream.readMessage(FloatValue.parser(), extensionRegistryLite);
                                    this.transY_ = floatValue4;
                                    if (builder != null) {
                                        builder.mergeFrom(floatValue4);
                                        this.transY_ = builder.buildPartial();
                                    }
                                } else if (tag != 40) {
                                    if (!codedInputStream.skipField(tag)) {
                                    }
                                } else {
                                    this.keep_ = codedInputStream.readBool();
                                }
                            } else {
                                this.startTime_ = codedInputStream.readInt64();
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

        public static ActionTranslation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionTranslation) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ActionTranslationOrBuilder extends MessageOrBuilder {
        boolean getKeep();

        long getStartTime();

        FloatValue getTransX();

        FloatValueOrBuilder getTransXOrBuilder();

        FloatValue getTransY();

        FloatValueOrBuilder getTransYOrBuilder();

        int getType();

        boolean hasTransX();

        boolean hasTransY();
    }

    public static final class ActionWebViewConfig extends GeneratedMessageV3 implements ActionWebViewConfigOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 5;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VIEWHEIGHT_FIELD_NUMBER = 7;
        public static final int VIEWWIDTH_FIELD_NUMBER = 6;
        public static final int WIDTH_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int height_;
        private byte memoizedIsInitialized;
        private volatile Object path_;
        private long startTime_;
        private int type_;
        private int viewHeight_;
        private int viewWidth_;
        private int width_;
        private static final ActionWebViewConfig DEFAULT_INSTANCE = new ActionWebViewConfig();
        private static final Parser<ActionWebViewConfig> PARSER = new AbstractParser<ActionWebViewConfig>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionWebViewConfig.1
            @Override // com.google.protobuf.Parser
            public ActionWebViewConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionWebViewConfig(codedInputStream, extensionRegistryLite);
            }
        };

        public static ActionWebViewConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionWebViewConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionWebViewConfig parseDelimitedFrom(InputStream inputStream) {
            return (ActionWebViewConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionWebViewConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionWebViewConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionWebViewConfig)) {
                return super.equals(obj);
            }
            ActionWebViewConfig actionWebViewConfig = (ActionWebViewConfig) obj;
            return getType() == actionWebViewConfig.getType() && getStartTime() == actionWebViewConfig.getStartTime() && getPath().equals(actionWebViewConfig.getPath()) && getWidth() == actionWebViewConfig.getWidth() && getHeight() == actionWebViewConfig.getHeight() && getViewWidth() == actionWebViewConfig.getViewWidth() && getViewHeight() == actionWebViewConfig.getViewHeight();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionWebViewConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public String getPath() {
            Object obj = this.path_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.path_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public ByteString getPathBytes() {
            Object obj = this.path_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.path_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            if (!getPathBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(3, this.path_);
            }
            int i12 = this.width_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i12);
            }
            int i13 = this.height_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i13);
            }
            int i14 = this.viewWidth_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i14);
            }
            int i15 = this.viewHeight_;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, i15);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public int getViewHeight() {
            return this.viewHeight_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public int getViewWidth() {
            return this.viewWidth_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 3) * 53) + getPath().hashCode()) * 37) + 4) * 53) + getWidth()) * 37) + 5) * 53) + getHeight()) * 37) + 6) * 53) + getViewWidth()) * 37) + 7) * 53) + getViewHeight()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionWebViewConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionWebViewConfig.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            if (!getPathBytes().isEmpty()) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.path_);
            }
            int i11 = this.width_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(4, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(5, i12);
            }
            int i13 = this.viewWidth_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(6, i13);
            }
            int i14 = this.viewHeight_;
            if (i14 != 0) {
                codedOutputStream.writeInt32(7, i14);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionWebViewConfigOrBuilder {
            private int height_;
            private Object path_;
            private long startTime_;
            private int type_;
            private int viewHeight_;
            private int viewWidth_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionWebViewConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPath() {
                this.path_ = ActionWebViewConfig.getDefaultInstance().getPath();
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionWebViewConfig_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public String getPath() {
                Object obj = this.path_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.path_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public ByteString getPathBytes() {
                Object obj = this.path_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.path_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public int getViewHeight() {
                return this.viewHeight_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public int getViewWidth() {
                return this.viewWidth_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionWebViewConfigOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionWebViewConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionWebViewConfig.class, Builder.class);
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

            public Builder setPath(String str) {
                str.getClass();
                this.path_ = str;
                onChanged();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.path_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setViewHeight(int i10) {
                this.viewHeight_ = i10;
                onChanged();
                return this;
            }

            public Builder setViewWidth(int i10) {
                this.viewWidth_ = i10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.path_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionWebViewConfig build() {
                ActionWebViewConfig actionWebViewConfigBuildPartial = buildPartial();
                if (actionWebViewConfigBuildPartial.isInitialized()) {
                    return actionWebViewConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionWebViewConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionWebViewConfig buildPartial() {
                ActionWebViewConfig actionWebViewConfig = new ActionWebViewConfig(this);
                actionWebViewConfig.type_ = this.type_;
                actionWebViewConfig.startTime_ = this.startTime_;
                actionWebViewConfig.path_ = this.path_;
                actionWebViewConfig.width_ = this.width_;
                actionWebViewConfig.height_ = this.height_;
                actionWebViewConfig.viewWidth_ = this.viewWidth_;
                actionWebViewConfig.viewHeight_ = this.viewHeight_;
                onBuilt();
                return actionWebViewConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionWebViewConfig getDefaultInstanceForType() {
                return ActionWebViewConfig.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                this.path_ = "";
                this.width_ = 0;
                this.height_ = 0;
                this.viewWidth_ = 0;
                this.viewHeight_ = 0;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.path_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionWebViewConfig) {
                    return mergeFrom((ActionWebViewConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionWebViewConfig actionWebViewConfig) {
                if (actionWebViewConfig == ActionWebViewConfig.getDefaultInstance()) {
                    return this;
                }
                if (actionWebViewConfig.getType() != 0) {
                    setType(actionWebViewConfig.getType());
                }
                if (actionWebViewConfig.getStartTime() != 0) {
                    setStartTime(actionWebViewConfig.getStartTime());
                }
                if (!actionWebViewConfig.getPath().isEmpty()) {
                    this.path_ = actionWebViewConfig.path_;
                    onChanged();
                }
                if (actionWebViewConfig.getWidth() != 0) {
                    setWidth(actionWebViewConfig.getWidth());
                }
                if (actionWebViewConfig.getHeight() != 0) {
                    setHeight(actionWebViewConfig.getHeight());
                }
                if (actionWebViewConfig.getViewWidth() != 0) {
                    setViewWidth(actionWebViewConfig.getViewWidth());
                }
                if (actionWebViewConfig.getViewHeight() != 0) {
                    setViewHeight(actionWebViewConfig.getViewHeight());
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
            public com.zykj.sketch.EzyDrawBoard.ActionWebViewConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionWebViewConfig.access$15000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionWebViewConfig r3 = (com.zykj.sketch.EzyDrawBoard.ActionWebViewConfig) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionWebViewConfig r4 = (com.zykj.sketch.EzyDrawBoard.ActionWebViewConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionWebViewConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionWebViewConfig$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder.smali:976
            }
        }

        public static Builder newBuilder(ActionWebViewConfig actionWebViewConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionWebViewConfig);
        }

        public static ActionWebViewConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionWebViewConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionWebViewConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionWebViewConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionWebViewConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionWebViewConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionWebViewConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionWebViewConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.path_ = "";
            this.width_ = 0;
            this.height_ = 0;
            this.viewWidth_ = 0;
            this.viewHeight_ = 0;
        }

        public static ActionWebViewConfig parseFrom(InputStream inputStream) {
            return (ActionWebViewConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionWebViewConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionWebViewConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionWebViewConfig parseFrom(CodedInputStream codedInputStream) {
            return (ActionWebViewConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionWebViewConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionWebViewConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ActionWebViewConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag == 26) {
                                this.path_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 32) {
                                this.width_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.height_ = codedInputStream.readInt32();
                            } else if (tag == 48) {
                                this.viewWidth_ = codedInputStream.readInt32();
                            } else if (tag != 56) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.viewHeight_ = codedInputStream.readInt32();
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
    }

    public interface ActionWebViewConfigOrBuilder extends MessageOrBuilder {
        int getHeight();

        String getPath();

        ByteString getPathBytes();

        long getStartTime();

        int getType();

        int getViewHeight();

        int getViewWidth();

        int getWidth();
    }

    public static final class ActionZoom extends GeneratedMessageV3 implements ActionZoomOrBuilder {
        public static final int CENTERX_FIELD_NUMBER = 5;
        public static final int CENTERY_FIELD_NUMBER = 6;
        public static final int KEEP_FIELD_NUMBER = 7;
        public static final int SCALEX_FIELD_NUMBER = 3;
        public static final int SCALEY_FIELD_NUMBER = 4;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float centerX_;
        private float centerY_;
        private boolean keep_;
        private byte memoizedIsInitialized;
        private float scaleX_;
        private float scaleY_;
        private long startTime_;
        private int type_;
        private static final ActionZoom DEFAULT_INSTANCE = new ActionZoom();
        private static final Parser<ActionZoom> PARSER = new AbstractParser<ActionZoom>() { // from class: com.zykj.sketch.EzyDrawBoard.ActionZoom.1
            @Override // com.google.protobuf.Parser
            public ActionZoom parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ActionZoom(codedInputStream, extensionRegistryLite);
            }
        };

        public static ActionZoom getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_ActionZoom_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionZoom parseDelimitedFrom(InputStream inputStream) {
            return (ActionZoom) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionZoom parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ActionZoom> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionZoom)) {
                return super.equals(obj);
            }
            ActionZoom actionZoom = (ActionZoom) obj;
            return getType() == actionZoom.getType() && getStartTime() == actionZoom.getStartTime() && Float.floatToIntBits(getScaleX()) == Float.floatToIntBits(actionZoom.getScaleX()) && Float.floatToIntBits(getScaleY()) == Float.floatToIntBits(actionZoom.getScaleY()) && Float.floatToIntBits(getCenterX()) == Float.floatToIntBits(actionZoom.getCenterX()) && Float.floatToIntBits(getCenterY()) == Float.floatToIntBits(actionZoom.getCenterY()) && getKeep() == actionZoom.getKeep();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public float getCenterX() {
            return this.centerX_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public float getCenterY() {
            return this.centerY_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public boolean getKeep() {
            return this.keep_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionZoom> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public float getScaleX() {
            return this.scaleX_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public float getScaleY() {
            return this.scaleY_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.type_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            long j10 = this.startTime_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j10);
            }
            float f10 = this.scaleX_;
            if (f10 != 0.0f) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(3, f10);
            }
            float f11 = this.scaleY_;
            if (f11 != 0.0f) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(4, f11);
            }
            float f12 = this.centerX_;
            if (f12 != 0.0f) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(5, f12);
            }
            float f13 = this.centerY_;
            if (f13 != 0.0f) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(6, f13);
            }
            boolean z10 = this.keep_;
            if (z10) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(7, z10);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
        public int getType() {
            return this.type_;
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
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getType()) * 37) + 2) * 53) + Internal.hashLong(getStartTime())) * 37) + 3) * 53) + Float.floatToIntBits(getScaleX())) * 37) + 4) * 53) + Float.floatToIntBits(getScaleY())) * 37) + 5) * 53) + Float.floatToIntBits(getCenterX())) * 37) + 6) * 53) + Float.floatToIntBits(getCenterY())) * 37) + 7) * 53) + Internal.hashBoolean(getKeep())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_ActionZoom_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionZoom.class, Builder.class);
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
            int i10 = this.type_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            float f10 = this.scaleX_;
            if (f10 != 0.0f) {
                codedOutputStream.writeFloat(3, f10);
            }
            float f11 = this.scaleY_;
            if (f11 != 0.0f) {
                codedOutputStream.writeFloat(4, f11);
            }
            float f12 = this.centerX_;
            if (f12 != 0.0f) {
                codedOutputStream.writeFloat(5, f12);
            }
            float f13 = this.centerY_;
            if (f13 != 0.0f) {
                codedOutputStream.writeFloat(6, f13);
            }
            boolean z10 = this.keep_;
            if (z10) {
                codedOutputStream.writeBool(7, z10);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionZoomOrBuilder {
            private float centerX_;
            private float centerY_;
            private boolean keep_;
            private float scaleX_;
            private float scaleY_;
            private long startTime_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_ActionZoom_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCenterX() {
                this.centerX_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCenterY() {
                this.centerY_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearKeep() {
                this.keep_ = false;
                onChanged();
                return this;
            }

            public Builder clearScaleX() {
                this.scaleX_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearScaleY() {
                this.scaleY_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public float getCenterX() {
                return this.centerX_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public float getCenterY() {
                return this.centerY_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_ActionZoom_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public boolean getKeep() {
                return this.keep_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public float getScaleX() {
                return this.scaleX_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public float getScaleY() {
                return this.scaleY_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.ActionZoomOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_ActionZoom_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionZoom.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setCenterX(float f10) {
                this.centerX_ = f10;
                onChanged();
                return this;
            }

            public Builder setCenterY(float f10) {
                this.centerY_ = f10;
                onChanged();
                return this;
            }

            public Builder setKeep(boolean z10) {
                this.keep_ = z10;
                onChanged();
                return this;
            }

            public Builder setScaleX(float f10) {
                this.scaleX_ = f10;
                onChanged();
                return this;
            }

            public Builder setScaleY(float f10) {
                this.scaleY_ = f10;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
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
            public ActionZoom build() {
                ActionZoom actionZoomBuildPartial = buildPartial();
                if (actionZoomBuildPartial.isInitialized()) {
                    return actionZoomBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionZoomBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionZoom buildPartial() {
                ActionZoom actionZoom = new ActionZoom(this);
                actionZoom.type_ = this.type_;
                actionZoom.startTime_ = this.startTime_;
                actionZoom.scaleX_ = this.scaleX_;
                actionZoom.scaleY_ = this.scaleY_;
                actionZoom.centerX_ = this.centerX_;
                actionZoom.centerY_ = this.centerY_;
                actionZoom.keep_ = this.keep_;
                onBuilt();
                return actionZoom;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionZoom getDefaultInstanceForType() {
                return ActionZoom.getDefaultInstance();
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
                this.type_ = 0;
                this.startTime_ = 0L;
                this.scaleX_ = 0.0f;
                this.scaleY_ = 0.0f;
                this.centerX_ = 0.0f;
                this.centerY_ = 0.0f;
                this.keep_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionZoom) {
                    return mergeFrom((ActionZoom) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionZoom actionZoom) {
                if (actionZoom == ActionZoom.getDefaultInstance()) {
                    return this;
                }
                if (actionZoom.getType() != 0) {
                    setType(actionZoom.getType());
                }
                if (actionZoom.getStartTime() != 0) {
                    setStartTime(actionZoom.getStartTime());
                }
                if (actionZoom.getScaleX() != 0.0f) {
                    setScaleX(actionZoom.getScaleX());
                }
                if (actionZoom.getScaleY() != 0.0f) {
                    setScaleY(actionZoom.getScaleY());
                }
                if (actionZoom.getCenterX() != 0.0f) {
                    setCenterX(actionZoom.getCenterX());
                }
                if (actionZoom.getCenterY() != 0.0f) {
                    setCenterY(actionZoom.getCenterY());
                }
                if (actionZoom.getKeep()) {
                    setKeep(actionZoom.getKeep());
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
            public com.zykj.sketch.EzyDrawBoard.ActionZoom.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.ActionZoom.access$26700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$ActionZoom r3 = (com.zykj.sketch.EzyDrawBoard.ActionZoom) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$ActionZoom r4 = (com.zykj.sketch.EzyDrawBoard.ActionZoom) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.ActionZoom.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$ActionZoom$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$ActionZoom$Builder.smali:878
            }
        }

        public static Builder newBuilder(ActionZoom actionZoom) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionZoom);
        }

        public static ActionZoom parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ActionZoom(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionZoom parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionZoom) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionZoom parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionZoom getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ActionZoom parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ActionZoom() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.startTime_ = 0L;
            this.scaleX_ = 0.0f;
            this.scaleY_ = 0.0f;
            this.centerX_ = 0.0f;
            this.centerY_ = 0.0f;
            this.keep_ = false;
        }

        public static ActionZoom parseFrom(InputStream inputStream) {
            return (ActionZoom) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ActionZoom parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionZoom) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionZoom parseFrom(CodedInputStream codedInputStream) {
            return (ActionZoom) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionZoom parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionZoom) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ActionZoom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.type_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag == 29) {
                                this.scaleX_ = codedInputStream.readFloat();
                            } else if (tag == 37) {
                                this.scaleY_ = codedInputStream.readFloat();
                            } else if (tag == 45) {
                                this.centerX_ = codedInputStream.readFloat();
                            } else if (tag == 53) {
                                this.centerY_ = codedInputStream.readFloat();
                            } else if (tag != 56) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.keep_ = codedInputStream.readBool();
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
    }

    public interface ActionZoomOrBuilder extends MessageOrBuilder {
        float getCenterX();

        float getCenterY();

        boolean getKeep();

        float getScaleX();

        float getScaleY();

        long getStartTime();

        int getType();
    }

    public static final class AudioStartAction extends GeneratedMessageV3 implements AudioStartActionOrBuilder {
        public static final int FILENAME_FIELD_NUMBER = 2;
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object fileName_;
        private byte memoizedIsInitialized;
        private long startTime_;
        private static final AudioStartAction DEFAULT_INSTANCE = new AudioStartAction();
        private static final Parser<AudioStartAction> PARSER = new AbstractParser<AudioStartAction>() { // from class: com.zykj.sketch.EzyDrawBoard.AudioStartAction.1
            @Override // com.google.protobuf.Parser
            public AudioStartAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AudioStartAction(codedInputStream, extensionRegistryLite);
            }
        };

        public static AudioStartAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_AudioStartAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioStartAction parseDelimitedFrom(InputStream inputStream) {
            return (AudioStartAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioStartAction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AudioStartAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioStartAction)) {
                return super.equals(obj);
            }
            AudioStartAction audioStartAction = (AudioStartAction) obj;
            return getStartTime() == audioStartAction.getStartTime() && getFileName().equals(audioStartAction.getFileName());
        }

        @Override // com.zykj.sketch.EzyDrawBoard.AudioStartActionOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fileName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.AudioStartActionOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AudioStartAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.startTime_;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            if (!getFileNameBytes().isEmpty()) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.fileName_);
            }
            this.memoizedSize = iComputeInt64Size;
            return iComputeInt64Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.AudioStartActionOrBuilder
        public long getStartTime() {
            return this.startTime_;
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
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getStartTime())) * 37) + 2) * 53) + getFileName().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_AudioStartAction_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioStartAction.class, Builder.class);
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
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            if (getFileNameBytes().isEmpty()) {
                return;
            }
            GeneratedMessage.writeString(codedOutputStream, 2, this.fileName_);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AudioStartActionOrBuilder {
            private Object fileName_;
            private long startTime_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_AudioStartAction_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearFileName() {
                this.fileName_ = AudioStartAction.getDefaultInstance().getFileName();
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_AudioStartAction_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.AudioStartActionOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fileName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.AudioStartActionOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.AudioStartActionOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_AudioStartAction_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioStartAction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fileName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.fileName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioStartAction build() {
                AudioStartAction audioStartActionBuildPartial = buildPartial();
                if (audioStartActionBuildPartial.isInitialized()) {
                    return audioStartActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioStartActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioStartAction buildPartial() {
                AudioStartAction audioStartAction = new AudioStartAction(this);
                audioStartAction.startTime_ = this.startTime_;
                audioStartAction.fileName_ = this.fileName_;
                onBuilt();
                return audioStartAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AudioStartAction getDefaultInstanceForType() {
                return AudioStartAction.getDefaultInstance();
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
                this.startTime_ = 0L;
                this.fileName_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fileName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AudioStartAction) {
                    return mergeFrom((AudioStartAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AudioStartAction audioStartAction) {
                if (audioStartAction == AudioStartAction.getDefaultInstance()) {
                    return this;
                }
                if (audioStartAction.getStartTime() != 0) {
                    setStartTime(audioStartAction.getStartTime());
                }
                if (!audioStartAction.getFileName().isEmpty()) {
                    this.fileName_ = audioStartAction.fileName_;
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
            public com.zykj.sketch.EzyDrawBoard.AudioStartAction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.AudioStartAction.access$29900()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$AudioStartAction r3 = (com.zykj.sketch.EzyDrawBoard.AudioStartAction) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$AudioStartAction r4 = (com.zykj.sketch.EzyDrawBoard.AudioStartAction) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.AudioStartAction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$AudioStartAction$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder.smali:774
            }
        }

        public static Builder newBuilder(AudioStartAction audioStartAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioStartAction);
        }

        public static AudioStartAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private AudioStartAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioStartAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioStartAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioStartAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AudioStartAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AudioStartAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AudioStartAction() {
            this.memoizedIsInitialized = (byte) -1;
            this.startTime_ = 0L;
            this.fileName_ = "";
        }

        public static AudioStartAction parseFrom(InputStream inputStream) {
            return (AudioStartAction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AudioStartAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioStartAction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private AudioStartAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag != 18) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.fileName_ = codedInputStream.readStringRequireUtf8();
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

        public static AudioStartAction parseFrom(CodedInputStream codedInputStream) {
            return (AudioStartAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static AudioStartAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioStartAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AudioStartActionOrBuilder extends MessageOrBuilder {
        String getFileName();

        ByteString getFileNameBytes();

        long getStartTime();
    }

    public static final class AudioStopAction extends GeneratedMessageV3 implements AudioStopActionOrBuilder {
        public static final int FILENAME_FIELD_NUMBER = 2;
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object fileName_;
        private byte memoizedIsInitialized;
        private long startTime_;
        private static final AudioStopAction DEFAULT_INSTANCE = new AudioStopAction();
        private static final Parser<AudioStopAction> PARSER = new AbstractParser<AudioStopAction>() { // from class: com.zykj.sketch.EzyDrawBoard.AudioStopAction.1
            @Override // com.google.protobuf.Parser
            public AudioStopAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AudioStopAction(codedInputStream, extensionRegistryLite);
            }
        };

        public static AudioStopAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_AudioStopAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioStopAction parseDelimitedFrom(InputStream inputStream) {
            return (AudioStopAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioStopAction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AudioStopAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioStopAction)) {
                return super.equals(obj);
            }
            AudioStopAction audioStopAction = (AudioStopAction) obj;
            return getStartTime() == audioStopAction.getStartTime() && getFileName().equals(audioStopAction.getFileName());
        }

        @Override // com.zykj.sketch.EzyDrawBoard.AudioStopActionOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fileName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.AudioStopActionOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AudioStopAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.startTime_;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            if (!getFileNameBytes().isEmpty()) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.fileName_);
            }
            this.memoizedSize = iComputeInt64Size;
            return iComputeInt64Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.AudioStopActionOrBuilder
        public long getStartTime() {
            return this.startTime_;
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
            int iHashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getStartTime())) * 37) + 2) * 53) + getFileName().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_AudioStopAction_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioStopAction.class, Builder.class);
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
            long j10 = this.startTime_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            if (getFileNameBytes().isEmpty()) {
                return;
            }
            GeneratedMessage.writeString(codedOutputStream, 2, this.fileName_);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AudioStopActionOrBuilder {
            private Object fileName_;
            private long startTime_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_AudioStopAction_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearFileName() {
                this.fileName_ = AudioStopAction.getDefaultInstance().getFileName();
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_AudioStopAction_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.AudioStopActionOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fileName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.AudioStopActionOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.AudioStopActionOrBuilder
            public long getStartTime() {
                return this.startTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_AudioStopAction_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioStopAction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fileName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStartTime(long j10) {
                this.startTime_ = j10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.fileName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioStopAction build() {
                AudioStopAction audioStopActionBuildPartial = buildPartial();
                if (audioStopActionBuildPartial.isInitialized()) {
                    return audioStopActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioStopActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioStopAction buildPartial() {
                AudioStopAction audioStopAction = new AudioStopAction(this);
                audioStopAction.startTime_ = this.startTime_;
                audioStopAction.fileName_ = this.fileName_;
                onBuilt();
                return audioStopAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AudioStopAction getDefaultInstanceForType() {
                return AudioStopAction.getDefaultInstance();
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
                this.startTime_ = 0L;
                this.fileName_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fileName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AudioStopAction) {
                    return mergeFrom((AudioStopAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AudioStopAction audioStopAction) {
                if (audioStopAction == AudioStopAction.getDefaultInstance()) {
                    return this;
                }
                if (audioStopAction.getStartTime() != 0) {
                    setStartTime(audioStopAction.getStartTime());
                }
                if (!audioStopAction.getFileName().isEmpty()) {
                    this.fileName_ = audioStopAction.fileName_;
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
            public com.zykj.sketch.EzyDrawBoard.AudioStopAction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.AudioStopAction.access$31000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$AudioStopAction r3 = (com.zykj.sketch.EzyDrawBoard.AudioStopAction) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$AudioStopAction r4 = (com.zykj.sketch.EzyDrawBoard.AudioStopAction) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.AudioStopAction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$AudioStopAction$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder.smali:774
            }
        }

        public static Builder newBuilder(AudioStopAction audioStopAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioStopAction);
        }

        public static AudioStopAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private AudioStopAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioStopAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioStopAction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioStopAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AudioStopAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AudioStopAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AudioStopAction() {
            this.memoizedIsInitialized = (byte) -1;
            this.startTime_ = 0L;
            this.fileName_ = "";
        }

        public static AudioStopAction parseFrom(InputStream inputStream) {
            return (AudioStopAction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AudioStopAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioStopAction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private AudioStopAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.startTime_ = codedInputStream.readInt64();
                            } else if (tag != 18) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.fileName_ = codedInputStream.readStringRequireUtf8();
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

        public static AudioStopAction parseFrom(CodedInputStream codedInputStream) {
            return (AudioStopAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static AudioStopAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioStopAction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AudioStopActionOrBuilder extends MessageOrBuilder {
        String getFileName();

        ByteString getFileNameBytes();

        long getStartTime();
    }

    public static final class BoardBody extends GeneratedMessageV3 implements BoardBodyOrBuilder {
        public static final int ACTIONCONTENT_FIELD_NUMBER = 1;
        private static final BoardBody DEFAULT_INSTANCE = new BoardBody();
        private static final Parser<BoardBody> PARSER = new AbstractParser<BoardBody>() { // from class: com.zykj.sketch.EzyDrawBoard.BoardBody.1
            @Override // com.google.protobuf.Parser
            public BoardBody parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BoardBody(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private List<ActionContent> actionContent_;
        private byte memoizedIsInitialized;

        public static BoardBody getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_BoardBody_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BoardBody parseDelimitedFrom(InputStream inputStream) {
            return (BoardBody) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BoardBody parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BoardBody> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof BoardBody) ? super.equals(obj) : getActionContentList().equals(((BoardBody) obj).getActionContentList());
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
        public ActionContent getActionContent(int i10) {
            return this.actionContent_.get(i10);
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
        public int getActionContentCount() {
            return this.actionContent_.size();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
        public List<ActionContent> getActionContentList() {
            return this.actionContent_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
        public ActionContentOrBuilder getActionContentOrBuilder(int i10) {
            return this.actionContent_.get(i10);
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
        public List<? extends ActionContentOrBuilder> getActionContentOrBuilderList() {
            return this.actionContent_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BoardBody> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.actionContent_.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.actionContent_.get(i11));
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
            if (getActionContentCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getActionContentList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_BoardBody_fieldAccessorTable.ensureFieldAccessorsInitialized(BoardBody.class, Builder.class);
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
            for (int i10 = 0; i10 < this.actionContent_.size(); i10++) {
                codedOutputStream.writeMessage(1, this.actionContent_.get(i10));
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BoardBodyOrBuilder {
            private RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> actionContentBuilder_;
            private List<ActionContent> actionContent_;
            private int bitField0_;

            private void ensureActionContentIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.actionContent_ = new ArrayList(this.actionContent_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> getActionContentFieldBuilder() {
                if (this.actionContentBuilder_ == null) {
                    this.actionContentBuilder_ = new RepeatedFieldBuilderV3<>(this.actionContent_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                    this.actionContent_ = null;
                }
                return this.actionContentBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_BoardBody_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getActionContentFieldBuilder();
                }
            }

            public Builder addActionContent(ActionContent actionContent) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(actionContent);
                    return this;
                }
                actionContent.getClass();
                ensureActionContentIsMutable();
                this.actionContent_.add(actionContent);
                onChanged();
                return this;
            }

            public ActionContent.Builder addActionContentBuilder() {
                return (ActionContent.Builder) getActionContentFieldBuilder().addBuilder(ActionContent.getDefaultInstance());
            }

            public Builder addAllActionContent(Iterable<? extends ActionContent> iterable) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureActionContentIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.actionContent_);
                onChanged();
                return this;
            }

            public Builder clearActionContent() {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.actionContent_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
            public ActionContent getActionContent(int i10) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actionContent_.get(i10) : (ActionContent) repeatedFieldBuilderV3.getMessage(i10);
            }

            public ActionContent.Builder getActionContentBuilder(int i10) {
                return (ActionContent.Builder) getActionContentFieldBuilder().getBuilder(i10);
            }

            public List<ActionContent.Builder> getActionContentBuilderList() {
                return getActionContentFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
            public int getActionContentCount() {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actionContent_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
            public List<ActionContent> getActionContentList() {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.actionContent_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
            public ActionContentOrBuilder getActionContentOrBuilder(int i10) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actionContent_.get(i10) : (ActionContentOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyOrBuilder
            public List<? extends ActionContentOrBuilder> getActionContentOrBuilderList() {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.actionContent_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_BoardBody_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_BoardBody_fieldAccessorTable.ensureFieldAccessorsInitialized(BoardBody.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removeActionContent(int i10) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i10);
                    return this;
                }
                ensureActionContentIsMutable();
                this.actionContent_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setActionContent(int i10, ActionContent actionContent) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, actionContent);
                    return this;
                }
                actionContent.getClass();
                ensureActionContentIsMutable();
                this.actionContent_.set(i10, actionContent);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.actionContent_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BoardBody build() {
                BoardBody boardBodyBuildPartial = buildPartial();
                if (boardBodyBuildPartial.isInitialized()) {
                    return boardBodyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) boardBodyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BoardBody buildPartial() {
                BoardBody boardBody = new BoardBody(this);
                int i10 = this.bitField0_;
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i10 & 1) == 1) {
                        this.actionContent_ = Collections.unmodifiableList(this.actionContent_);
                        this.bitField0_ &= -2;
                    }
                    boardBody.actionContent_ = this.actionContent_;
                } else {
                    boardBody.actionContent_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return boardBody;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BoardBody getDefaultInstanceForType() {
                return BoardBody.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public ActionContent.Builder addActionContentBuilder(int i10) {
                return (ActionContent.Builder) getActionContentFieldBuilder().addBuilder(i10, ActionContent.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.actionContent_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                repeatedFieldBuilderV3.clear();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.actionContent_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addActionContent(int i10, ActionContent actionContent) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    actionContent.getClass();
                    ensureActionContentIsMutable();
                    this.actionContent_.add(i10, actionContent);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, actionContent);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BoardBody) {
                    return mergeFrom((BoardBody) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActionContent(int i10, ActionContent.Builder builder) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionContentIsMutable();
                    this.actionContent_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(BoardBody boardBody) {
                if (boardBody == BoardBody.getDefaultInstance()) {
                    return this;
                }
                if (this.actionContentBuilder_ == null) {
                    if (!boardBody.actionContent_.isEmpty()) {
                        if (this.actionContent_.isEmpty()) {
                            this.actionContent_ = boardBody.actionContent_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureActionContentIsMutable();
                            this.actionContent_.addAll(boardBody.actionContent_);
                        }
                        onChanged();
                    }
                } else if (!boardBody.actionContent_.isEmpty()) {
                    if (!this.actionContentBuilder_.isEmpty()) {
                        this.actionContentBuilder_.addAllMessages(boardBody.actionContent_);
                    } else {
                        this.actionContentBuilder_.dispose();
                        this.actionContentBuilder_ = null;
                        this.actionContent_ = boardBody.actionContent_;
                        this.bitField0_ &= -2;
                        this.actionContentBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getActionContentFieldBuilder() : null;
                    }
                }
                onChanged();
                return this;
            }

            public Builder addActionContent(ActionContent.Builder builder) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionContentIsMutable();
                    this.actionContent_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addActionContent(int i10, ActionContent.Builder builder) {
                RepeatedFieldBuilderV3<ActionContent, ActionContent.Builder, ActionContentOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionContentIsMutable();
                    this.actionContent_.add(i10, builder.build());
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
            public com.zykj.sketch.EzyDrawBoard.BoardBody.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.BoardBody.access$4400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$BoardBody r3 = (com.zykj.sketch.EzyDrawBoard.BoardBody) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$BoardBody r4 = (com.zykj.sketch.EzyDrawBoard.BoardBody) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.BoardBody.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$BoardBody$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$BoardBody$Builder.smali:1418
            }
        }

        public static Builder newBuilder(BoardBody boardBody) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(boardBody);
        }

        public static BoardBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private BoardBody(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BoardBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardBody) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BoardBody parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BoardBody getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static BoardBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private BoardBody() {
            this.memoizedIsInitialized = (byte) -1;
            this.actionContent_ = Collections.EMPTY_LIST;
        }

        public static BoardBody parseFrom(InputStream inputStream) {
            return (BoardBody) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BoardBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardBody) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private BoardBody(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    this.actionContent_ = new ArrayList();
                                    z11 = true;
                                }
                                this.actionContent_.add((ActionContent) codedInputStream.readMessage(ActionContent.parser(), extensionRegistryLite));
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
                        this.actionContent_ = Collections.unmodifiableList(this.actionContent_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11) {
                this.actionContent_ = Collections.unmodifiableList(this.actionContent_);
            }
            makeExtensionsImmutable();
        }

        public static BoardBody parseFrom(CodedInputStream codedInputStream) {
            return (BoardBody) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static BoardBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardBody) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BoardBodyOrBuilder extends MessageOrBuilder {
        ActionContent getActionContent(int i10);

        int getActionContentCount();

        List<ActionContent> getActionContentList();

        ActionContentOrBuilder getActionContentOrBuilder(int i10);

        List<? extends ActionContentOrBuilder> getActionContentOrBuilderList();
    }

    public static final class BoardBodyV1 extends GeneratedMessageV3 implements BoardBodyV1OrBuilder {
        public static final int ACTIONCONTENT_FIELD_NUMBER = 1;
        private static final BoardBodyV1 DEFAULT_INSTANCE = new BoardBodyV1();
        private static final Parser<BoardBodyV1> PARSER = new AbstractParser<BoardBodyV1>() { // from class: com.zykj.sketch.EzyDrawBoard.BoardBodyV1.1
            @Override // com.google.protobuf.Parser
            public BoardBodyV1 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BoardBodyV1(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private List<Any> actionContent_;
        private byte memoizedIsInitialized;

        public static BoardBodyV1 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_BoardBodyV1_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BoardBodyV1 parseDelimitedFrom(InputStream inputStream) {
            return (BoardBodyV1) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BoardBodyV1 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BoardBodyV1> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof BoardBodyV1) ? super.equals(obj) : getActionContentList().equals(((BoardBodyV1) obj).getActionContentList());
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
        public Any getActionContent(int i10) {
            return this.actionContent_.get(i10);
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
        public int getActionContentCount() {
            return this.actionContent_.size();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
        public List<Any> getActionContentList() {
            return this.actionContent_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
        public AnyOrBuilder getActionContentOrBuilder(int i10) {
            return this.actionContent_.get(i10);
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
        public List<? extends AnyOrBuilder> getActionContentOrBuilderList() {
            return this.actionContent_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BoardBodyV1> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.actionContent_.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.actionContent_.get(i11));
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
            if (getActionContentCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getActionContentList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_BoardBodyV1_fieldAccessorTable.ensureFieldAccessorsInitialized(BoardBodyV1.class, Builder.class);
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
            for (int i10 = 0; i10 < this.actionContent_.size(); i10++) {
                codedOutputStream.writeMessage(1, this.actionContent_.get(i10));
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BoardBodyV1OrBuilder {
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> actionContentBuilder_;
            private List<Any> actionContent_;
            private int bitField0_;

            private void ensureActionContentIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.actionContent_ = new ArrayList(this.actionContent_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getActionContentFieldBuilder() {
                if (this.actionContentBuilder_ == null) {
                    this.actionContentBuilder_ = new RepeatedFieldBuilderV3<>(this.actionContent_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                    this.actionContent_ = null;
                }
                return this.actionContentBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_BoardBodyV1_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getActionContentFieldBuilder();
                }
            }

            public Builder addActionContent(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                    return this;
                }
                any.getClass();
                ensureActionContentIsMutable();
                this.actionContent_.add(any);
                onChanged();
                return this;
            }

            public Any.Builder addActionContentBuilder() {
                return (Any.Builder) getActionContentFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Builder addAllActionContent(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureActionContentIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.actionContent_);
                onChanged();
                return this;
            }

            public Builder clearActionContent() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.actionContent_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
            public Any getActionContent(int i10) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actionContent_.get(i10) : (Any) repeatedFieldBuilderV3.getMessage(i10);
            }

            public Any.Builder getActionContentBuilder(int i10) {
                return (Any.Builder) getActionContentFieldBuilder().getBuilder(i10);
            }

            public List<Any.Builder> getActionContentBuilderList() {
                return getActionContentFieldBuilder().getBuilderList();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
            public int getActionContentCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actionContent_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
            public List<Any> getActionContentList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.actionContent_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
            public AnyOrBuilder getActionContentOrBuilder(int i10) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actionContent_.get(i10) : (AnyOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardBodyV1OrBuilder
            public List<? extends AnyOrBuilder> getActionContentOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.actionContent_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_BoardBodyV1_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_BoardBodyV1_fieldAccessorTable.ensureFieldAccessorsInitialized(BoardBodyV1.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder removeActionContent(int i10) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i10);
                    return this;
                }
                ensureActionContentIsMutable();
                this.actionContent_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setActionContent(int i10, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, any);
                    return this;
                }
                any.getClass();
                ensureActionContentIsMutable();
                this.actionContent_.set(i10, any);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.actionContent_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BoardBodyV1 build() {
                BoardBodyV1 boardBodyV1BuildPartial = buildPartial();
                if (boardBodyV1BuildPartial.isInitialized()) {
                    return boardBodyV1BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) boardBodyV1BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BoardBodyV1 buildPartial() {
                BoardBodyV1 boardBodyV1 = new BoardBodyV1(this);
                int i10 = this.bitField0_;
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i10 & 1) == 1) {
                        this.actionContent_ = Collections.unmodifiableList(this.actionContent_);
                        this.bitField0_ &= -2;
                    }
                    boardBodyV1.actionContent_ = this.actionContent_;
                } else {
                    boardBodyV1.actionContent_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return boardBodyV1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BoardBodyV1 getDefaultInstanceForType() {
                return BoardBodyV1.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public Any.Builder addActionContentBuilder(int i10) {
                return (Any.Builder) getActionContentFieldBuilder().addBuilder(i10, Any.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.actionContent_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                repeatedFieldBuilderV3.clear();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.actionContent_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addActionContent(int i10, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureActionContentIsMutable();
                    this.actionContent_.add(i10, any);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i10, any);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BoardBodyV1) {
                    return mergeFrom((BoardBodyV1) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActionContent(int i10, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionContentIsMutable();
                    this.actionContent_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(BoardBodyV1 boardBodyV1) {
                if (boardBodyV1 == BoardBodyV1.getDefaultInstance()) {
                    return this;
                }
                if (this.actionContentBuilder_ == null) {
                    if (!boardBodyV1.actionContent_.isEmpty()) {
                        if (this.actionContent_.isEmpty()) {
                            this.actionContent_ = boardBodyV1.actionContent_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureActionContentIsMutable();
                            this.actionContent_.addAll(boardBodyV1.actionContent_);
                        }
                        onChanged();
                    }
                } else if (!boardBodyV1.actionContent_.isEmpty()) {
                    if (!this.actionContentBuilder_.isEmpty()) {
                        this.actionContentBuilder_.addAllMessages(boardBodyV1.actionContent_);
                    } else {
                        this.actionContentBuilder_.dispose();
                        this.actionContentBuilder_ = null;
                        this.actionContent_ = boardBodyV1.actionContent_;
                        this.bitField0_ &= -2;
                        this.actionContentBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getActionContentFieldBuilder() : null;
                    }
                }
                onChanged();
                return this;
            }

            public Builder addActionContent(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionContentIsMutable();
                    this.actionContent_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }

            public Builder addActionContent(int i10, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.actionContentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionContentIsMutable();
                    this.actionContent_.add(i10, builder.build());
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
            public com.zykj.sketch.EzyDrawBoard.BoardBodyV1.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.BoardBodyV1.access$5400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$BoardBodyV1 r3 = (com.zykj.sketch.EzyDrawBoard.BoardBodyV1) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$BoardBodyV1 r4 = (com.zykj.sketch.EzyDrawBoard.BoardBodyV1) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.BoardBodyV1.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$BoardBodyV1$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$BoardBodyV1$Builder.smali:1418
            }
        }

        public static Builder newBuilder(BoardBodyV1 boardBodyV1) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(boardBodyV1);
        }

        public static BoardBodyV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private BoardBodyV1(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BoardBodyV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardBodyV1) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BoardBodyV1 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BoardBodyV1 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static BoardBodyV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private BoardBodyV1() {
            this.memoizedIsInitialized = (byte) -1;
            this.actionContent_ = Collections.EMPTY_LIST;
        }

        public static BoardBodyV1 parseFrom(InputStream inputStream) {
            return (BoardBodyV1) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BoardBodyV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardBodyV1) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private BoardBodyV1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    this.actionContent_ = new ArrayList();
                                    z11 = true;
                                }
                                this.actionContent_.add((Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
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
                        this.actionContent_ = Collections.unmodifiableList(this.actionContent_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11) {
                this.actionContent_ = Collections.unmodifiableList(this.actionContent_);
            }
            makeExtensionsImmutable();
        }

        public static BoardBodyV1 parseFrom(CodedInputStream codedInputStream) {
            return (BoardBodyV1) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static BoardBodyV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardBodyV1) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BoardBodyV1OrBuilder extends MessageOrBuilder {
        Any getActionContent(int i10);

        int getActionContentCount();

        List<Any> getActionContentList();

        AnyOrBuilder getActionContentOrBuilder(int i10);

        List<? extends AnyOrBuilder> getActionContentOrBuilderList();
    }

    public static final class BoardHead extends GeneratedMessageV3 implements BoardHeadOrBuilder {
        public static final int AUTHOR_FIELD_NUMBER = 7;
        public static final int CREATEDATE_FIELD_NUMBER = 5;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 8;
        public static final int UPDATEDATE_FIELD_NUMBER = 6;
        public static final int VERSION_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object author_;
        private long createDate_;
        private int height_;
        private byte memoizedIsInitialized;
        private int type_;
        private long updateDate_;
        private int version_;
        private int width_;
        private static final BoardHead DEFAULT_INSTANCE = new BoardHead();
        private static final Parser<BoardHead> PARSER = new AbstractParser<BoardHead>() { // from class: com.zykj.sketch.EzyDrawBoard.BoardHead.1
            @Override // com.google.protobuf.Parser
            public BoardHead parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BoardHead(codedInputStream, extensionRegistryLite);
            }
        };

        public static BoardHead getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_BoardHead_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BoardHead parseDelimitedFrom(InputStream inputStream) {
            return (BoardHead) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BoardHead parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BoardHead> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BoardHead)) {
                return super.equals(obj);
            }
            BoardHead boardHead = (BoardHead) obj;
            return getVersion() == boardHead.getVersion() && getWidth() == boardHead.getWidth() && getHeight() == boardHead.getHeight() && getCreateDate() == boardHead.getCreateDate() && getUpdateDate() == boardHead.getUpdateDate() && getAuthor().equals(boardHead.getAuthor()) && getType() == boardHead.getType();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public String getAuthor() {
            Object obj = this.author_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.author_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public ByteString getAuthorBytes() {
            Object obj = this.author_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.author_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public long getCreateDate() {
            return this.createDate_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BoardHead> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.version_;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.width_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i12);
            }
            int i13 = this.height_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i13);
            }
            long j10 = this.createDate_;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j10);
            }
            long j11 = this.updateDate_;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j11);
            }
            if (!getAuthorBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(7, this.author_);
            }
            int i14 = this.type_;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, i14);
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public long getUpdateDate() {
            return this.updateDate_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 3) * 53) + getWidth()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + Internal.hashLong(getCreateDate())) * 37) + 6) * 53) + Internal.hashLong(getUpdateDate())) * 37) + 7) * 53) + getAuthor().hashCode()) * 37) + 8) * 53) + getType()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_BoardHead_fieldAccessorTable.ensureFieldAccessorsInitialized(BoardHead.class, Builder.class);
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
            int i10 = this.version_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.width_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(3, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(4, i12);
            }
            long j10 = this.createDate_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(5, j10);
            }
            long j11 = this.updateDate_;
            if (j11 != 0) {
                codedOutputStream.writeInt64(6, j11);
            }
            if (!getAuthorBytes().isEmpty()) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.author_);
            }
            int i13 = this.type_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(8, i13);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BoardHeadOrBuilder {
            private Object author_;
            private long createDate_;
            private int height_;
            private int type_;
            private long updateDate_;
            private int version_;
            private int width_;

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_BoardHead_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAuthor() {
                this.author_ = BoardHead.getDefaultInstance().getAuthor();
                onChanged();
                return this;
            }

            public Builder clearCreateDate() {
                this.createDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdateDate() {
                this.updateDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public String getAuthor() {
                Object obj = this.author_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.author_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public ByteString getAuthorBytes() {
                Object obj = this.author_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.author_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public long getCreateDate() {
                return this.createDate_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_BoardHead_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public long getUpdateDate() {
                return this.updateDate_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.BoardHeadOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_BoardHead_fieldAccessorTable.ensureFieldAccessorsInitialized(BoardHead.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setAuthor(String str) {
                str.getClass();
                this.author_ = str;
                onChanged();
                return this;
            }

            public Builder setAuthorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.author_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCreateDate(long j10) {
                this.createDate_ = j10;
                onChanged();
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setType(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setUpdateDate(long j10) {
                this.updateDate_ = j10;
                onChanged();
                return this;
            }

            public Builder setVersion(int i10) {
                this.version_ = i10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.author_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BoardHead build() {
                BoardHead boardHeadBuildPartial = buildPartial();
                if (boardHeadBuildPartial.isInitialized()) {
                    return boardHeadBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) boardHeadBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BoardHead buildPartial() {
                BoardHead boardHead = new BoardHead(this);
                boardHead.version_ = this.version_;
                boardHead.width_ = this.width_;
                boardHead.height_ = this.height_;
                boardHead.createDate_ = this.createDate_;
                boardHead.updateDate_ = this.updateDate_;
                boardHead.author_ = this.author_;
                boardHead.type_ = this.type_;
                onBuilt();
                return boardHead;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BoardHead getDefaultInstanceForType() {
                return BoardHead.getDefaultInstance();
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
                this.version_ = 0;
                this.width_ = 0;
                this.height_ = 0;
                this.createDate_ = 0L;
                this.updateDate_ = 0L;
                this.author_ = "";
                this.type_ = 0;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.author_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BoardHead) {
                    return mergeFrom((BoardHead) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BoardHead boardHead) {
                if (boardHead == BoardHead.getDefaultInstance()) {
                    return this;
                }
                if (boardHead.getVersion() != 0) {
                    setVersion(boardHead.getVersion());
                }
                if (boardHead.getWidth() != 0) {
                    setWidth(boardHead.getWidth());
                }
                if (boardHead.getHeight() != 0) {
                    setHeight(boardHead.getHeight());
                }
                if (boardHead.getCreateDate() != 0) {
                    setCreateDate(boardHead.getCreateDate());
                }
                if (boardHead.getUpdateDate() != 0) {
                    setUpdateDate(boardHead.getUpdateDate());
                }
                if (!boardHead.getAuthor().isEmpty()) {
                    this.author_ = boardHead.author_;
                    onChanged();
                }
                if (boardHead.getType() != 0) {
                    setType(boardHead.getType());
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
            public com.zykj.sketch.EzyDrawBoard.BoardHead.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.BoardHead.access$3300()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$BoardHead r3 = (com.zykj.sketch.EzyDrawBoard.BoardHead) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$BoardHead r4 = (com.zykj.sketch.EzyDrawBoard.BoardHead) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.BoardHead.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$BoardHead$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$BoardHead$Builder.smali:977
            }
        }

        public static Builder newBuilder(BoardHead boardHead) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(boardHead);
        }

        public static BoardHead parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private BoardHead(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BoardHead parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardHead) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BoardHead parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BoardHead getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static BoardHead parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private BoardHead() {
            this.memoizedIsInitialized = (byte) -1;
            this.version_ = 0;
            this.width_ = 0;
            this.height_ = 0;
            this.createDate_ = 0L;
            this.updateDate_ = 0L;
            this.author_ = "";
            this.type_ = 0;
        }

        public static BoardHead parseFrom(InputStream inputStream) {
            return (BoardHead) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BoardHead parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardHead) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BoardHead parseFrom(CodedInputStream codedInputStream) {
            return (BoardHead) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static BoardHead parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoardHead) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private BoardHead(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.version_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.width_ = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.height_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.createDate_ = codedInputStream.readInt64();
                            } else if (tag == 48) {
                                this.updateDate_ = codedInputStream.readInt64();
                            } else if (tag == 58) {
                                this.author_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 64) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                this.type_ = codedInputStream.readInt32();
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
    }

    public interface BoardHeadOrBuilder extends MessageOrBuilder {
        String getAuthor();

        ByteString getAuthorBytes();

        long getCreateDate();

        int getHeight();

        int getType();

        long getUpdateDate();

        int getVersion();

        int getWidth();
    }

    public static final class DrawArea extends GeneratedMessageV3 implements DrawAreaOrBuilder {
        public static final int LEFTTOPPOINT_FIELD_NUMBER = 1;
        public static final int MATRIX_FIELD_NUMBER = 3;
        public static final int RIGHTBOTTOMPOINT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GraphSnapshot.PointF leftTopPoint_;
        private int matrixMemoizedSerializedSize;
        private List<Float> matrix_;
        private byte memoizedIsInitialized;
        private GraphSnapshot.PointF rightBottomPoint_;
        private static final DrawArea DEFAULT_INSTANCE = new DrawArea();
        private static final Parser<DrawArea> PARSER = new AbstractParser<DrawArea>() { // from class: com.zykj.sketch.EzyDrawBoard.DrawArea.1
            @Override // com.google.protobuf.Parser
            public DrawArea parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new DrawArea(codedInputStream, extensionRegistryLite);
            }
        };

        public static DrawArea getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_DrawArea_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DrawArea parseDelimitedFrom(InputStream inputStream) {
            return (DrawArea) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DrawArea parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<DrawArea> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DrawArea)) {
                return super.equals(obj);
            }
            DrawArea drawArea = (DrawArea) obj;
            boolean z10 = hasLeftTopPoint() == drawArea.hasLeftTopPoint();
            if (hasLeftTopPoint()) {
                z10 = z10 && getLeftTopPoint().equals(drawArea.getLeftTopPoint());
            }
            boolean z11 = z10 && hasRightBottomPoint() == drawArea.hasRightBottomPoint();
            if (hasRightBottomPoint()) {
                z11 = z11 && getRightBottomPoint().equals(drawArea.getRightBottomPoint());
            }
            return z11 && getMatrixList().equals(drawArea.getMatrixList());
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public GraphSnapshot.PointF getLeftTopPoint() {
            GraphSnapshot.PointF pointF = this.leftTopPoint_;
            return pointF == null ? GraphSnapshot.PointF.getDefaultInstance() : pointF;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public GraphSnapshot.PointFOrBuilder getLeftTopPointOrBuilder() {
            return getLeftTopPoint();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public float getMatrix(int i10) {
            return this.matrix_.get(i10).floatValue();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public int getMatrixCount() {
            return this.matrix_.size();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public List<Float> getMatrixList() {
            return this.matrix_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DrawArea> getParserForType() {
            return PARSER;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public GraphSnapshot.PointF getRightBottomPoint() {
            GraphSnapshot.PointF pointF = this.rightBottomPoint_;
            return pointF == null ? GraphSnapshot.PointF.getDefaultInstance() : pointF;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public GraphSnapshot.PointFOrBuilder getRightBottomPointOrBuilder() {
            return getRightBottomPoint();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.leftTopPoint_ != null ? CodedOutputStream.computeMessageSize(1, getLeftTopPoint()) : 0;
            if (this.rightBottomPoint_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getRightBottomPoint());
            }
            int size = getMatrixList().size() * 4;
            int iComputeInt32SizeNoTag = iComputeMessageSize + size;
            if (!getMatrixList().isEmpty()) {
                iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + CodedOutputStream.computeInt32SizeNoTag(size);
            }
            this.matrixMemoizedSerializedSize = size;
            this.memoizedSize = iComputeInt32SizeNoTag;
            return iComputeInt32SizeNoTag;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public boolean hasLeftTopPoint() {
            return this.leftTopPoint_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
        public boolean hasRightBottomPoint() {
            return this.rightBottomPoint_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (hasLeftTopPoint()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getLeftTopPoint().hashCode();
            }
            if (hasRightBottomPoint()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRightBottomPoint().hashCode();
            }
            if (getMatrixCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMatrixList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_DrawArea_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawArea.class, Builder.class);
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
            if (this.leftTopPoint_ != null) {
                codedOutputStream.writeMessage(1, getLeftTopPoint());
            }
            if (this.rightBottomPoint_ != null) {
                codedOutputStream.writeMessage(2, getRightBottomPoint());
            }
            if (getMatrixList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.matrixMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.matrix_.size(); i10++) {
                codedOutputStream.writeFloatNoTag(this.matrix_.get(i10).floatValue());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawAreaOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> leftTopPointBuilder_;
            private GraphSnapshot.PointF leftTopPoint_;
            private List<Float> matrix_;
            private SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> rightBottomPointBuilder_;
            private GraphSnapshot.PointF rightBottomPoint_;

            private void ensureMatrixIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.matrix_ = new ArrayList(this.matrix_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_DrawArea_descriptor;
            }

            private SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> getLeftTopPointFieldBuilder() {
                if (this.leftTopPointBuilder_ == null) {
                    this.leftTopPointBuilder_ = new SingleFieldBuilderV3<>(getLeftTopPoint(), getParentForChildren(), isClean());
                    this.leftTopPoint_ = null;
                }
                return this.leftTopPointBuilder_;
            }

            private SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> getRightBottomPointFieldBuilder() {
                if (this.rightBottomPointBuilder_ == null) {
                    this.rightBottomPointBuilder_ = new SingleFieldBuilderV3<>(getRightBottomPoint(), getParentForChildren(), isClean());
                    this.rightBottomPoint_ = null;
                }
                return this.rightBottomPointBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllMatrix(Iterable<? extends Float> iterable) {
                ensureMatrixIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.matrix_);
                onChanged();
                return this;
            }

            public Builder addMatrix(float f10) {
                ensureMatrixIsMutable();
                this.matrix_.add(Float.valueOf(f10));
                onChanged();
                return this;
            }

            public Builder clearLeftTopPoint() {
                if (this.leftTopPointBuilder_ == null) {
                    this.leftTopPoint_ = null;
                    onChanged();
                    return this;
                }
                this.leftTopPoint_ = null;
                this.leftTopPointBuilder_ = null;
                return this;
            }

            public Builder clearMatrix() {
                this.matrix_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRightBottomPoint() {
                if (this.rightBottomPointBuilder_ == null) {
                    this.rightBottomPoint_ = null;
                    onChanged();
                    return this;
                }
                this.rightBottomPoint_ = null;
                this.rightBottomPointBuilder_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_DrawArea_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public GraphSnapshot.PointF getLeftTopPoint() {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.leftTopPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot.PointF) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot.PointF pointF = this.leftTopPoint_;
                return pointF == null ? GraphSnapshot.PointF.getDefaultInstance() : pointF;
            }

            public GraphSnapshot.PointF.Builder getLeftTopPointBuilder() {
                onChanged();
                return (GraphSnapshot.PointF.Builder) getLeftTopPointFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public GraphSnapshot.PointFOrBuilder getLeftTopPointOrBuilder() {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.leftTopPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot.PointFOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GraphSnapshot.PointF pointF = this.leftTopPoint_;
                return pointF == null ? GraphSnapshot.PointF.getDefaultInstance() : pointF;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public float getMatrix(int i10) {
                return this.matrix_.get(i10).floatValue();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public int getMatrixCount() {
                return this.matrix_.size();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public List<Float> getMatrixList() {
                return Collections.unmodifiableList(this.matrix_);
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public GraphSnapshot.PointF getRightBottomPoint() {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.rightBottomPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot.PointF) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot.PointF pointF = this.rightBottomPoint_;
                return pointF == null ? GraphSnapshot.PointF.getDefaultInstance() : pointF;
            }

            public GraphSnapshot.PointF.Builder getRightBottomPointBuilder() {
                onChanged();
                return (GraphSnapshot.PointF.Builder) getRightBottomPointFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public GraphSnapshot.PointFOrBuilder getRightBottomPointOrBuilder() {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.rightBottomPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot.PointFOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GraphSnapshot.PointF pointF = this.rightBottomPoint_;
                return pointF == null ? GraphSnapshot.PointF.getDefaultInstance() : pointF;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public boolean hasLeftTopPoint() {
                return (this.leftTopPointBuilder_ == null && this.leftTopPoint_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawAreaOrBuilder
            public boolean hasRightBottomPoint() {
                return (this.rightBottomPointBuilder_ == null && this.rightBottomPoint_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_DrawArea_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawArea.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeLeftTopPoint(GraphSnapshot.PointF pointF) {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.leftTopPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pointF);
                    return this;
                }
                GraphSnapshot.PointF pointF2 = this.leftTopPoint_;
                if (pointF2 != null) {
                    this.leftTopPoint_ = GraphSnapshot.PointF.newBuilder(pointF2).mergeFrom(pointF).buildPartial();
                } else {
                    this.leftTopPoint_ = pointF;
                }
                onChanged();
                return this;
            }

            public Builder mergeRightBottomPoint(GraphSnapshot.PointF pointF) {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.rightBottomPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pointF);
                    return this;
                }
                GraphSnapshot.PointF pointF2 = this.rightBottomPoint_;
                if (pointF2 != null) {
                    this.rightBottomPoint_ = GraphSnapshot.PointF.newBuilder(pointF2).mergeFrom(pointF).buildPartial();
                } else {
                    this.rightBottomPoint_ = pointF;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setLeftTopPoint(GraphSnapshot.PointF pointF) {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.leftTopPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(pointF);
                    return this;
                }
                pointF.getClass();
                this.leftTopPoint_ = pointF;
                onChanged();
                return this;
            }

            public Builder setMatrix(int i10, float f10) {
                ensureMatrixIsMutable();
                this.matrix_.set(i10, Float.valueOf(f10));
                onChanged();
                return this;
            }

            public Builder setRightBottomPoint(GraphSnapshot.PointF pointF) {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.rightBottomPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(pointF);
                    return this;
                }
                pointF.getClass();
                this.rightBottomPoint_ = pointF;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.leftTopPoint_ = null;
                this.rightBottomPoint_ = null;
                this.matrix_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrawArea build() {
                DrawArea drawAreaBuildPartial = buildPartial();
                if (drawAreaBuildPartial.isInitialized()) {
                    return drawAreaBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) drawAreaBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrawArea buildPartial() {
                DrawArea drawArea = new DrawArea(this);
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.leftTopPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    drawArea.leftTopPoint_ = this.leftTopPoint_;
                } else {
                    drawArea.leftTopPoint_ = (GraphSnapshot.PointF) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV32 = this.rightBottomPointBuilder_;
                if (singleFieldBuilderV32 == null) {
                    drawArea.rightBottomPoint_ = this.rightBottomPoint_;
                } else {
                    drawArea.rightBottomPoint_ = (GraphSnapshot.PointF) singleFieldBuilderV32.build();
                }
                if ((this.bitField0_ & 4) == 4) {
                    this.matrix_ = Collections.unmodifiableList(this.matrix_);
                    this.bitField0_ &= -5;
                }
                drawArea.matrix_ = this.matrix_;
                drawArea.bitField0_ = 0;
                onBuilt();
                return drawArea;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DrawArea getDefaultInstanceForType() {
                return DrawArea.getDefaultInstance();
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
                if (this.leftTopPointBuilder_ == null) {
                    this.leftTopPoint_ = null;
                } else {
                    this.leftTopPoint_ = null;
                    this.leftTopPointBuilder_ = null;
                }
                if (this.rightBottomPointBuilder_ == null) {
                    this.rightBottomPoint_ = null;
                } else {
                    this.rightBottomPoint_ = null;
                    this.rightBottomPointBuilder_ = null;
                }
                this.matrix_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                return this;
            }

            public Builder setLeftTopPoint(GraphSnapshot.PointF.Builder builder) {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.leftTopPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.leftTopPoint_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setRightBottomPoint(GraphSnapshot.PointF.Builder builder) {
                SingleFieldBuilderV3<GraphSnapshot.PointF, GraphSnapshot.PointF.Builder, GraphSnapshot.PointFOrBuilder> singleFieldBuilderV3 = this.rightBottomPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rightBottomPoint_ = builder.build();
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
                if (message instanceof DrawArea) {
                    return mergeFrom((DrawArea) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.leftTopPoint_ = null;
                this.rightBottomPoint_ = null;
                this.matrix_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(DrawArea drawArea) {
                if (drawArea == DrawArea.getDefaultInstance()) {
                    return this;
                }
                if (drawArea.hasLeftTopPoint()) {
                    mergeLeftTopPoint(drawArea.getLeftTopPoint());
                }
                if (drawArea.hasRightBottomPoint()) {
                    mergeRightBottomPoint(drawArea.getRightBottomPoint());
                }
                if (!drawArea.matrix_.isEmpty()) {
                    if (this.matrix_.isEmpty()) {
                        this.matrix_ = drawArea.matrix_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureMatrixIsMutable();
                        this.matrix_.addAll(drawArea.matrix_);
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
            public com.zykj.sketch.EzyDrawBoard.DrawArea.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.DrawArea.access$19600()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$DrawArea r3 = (com.zykj.sketch.EzyDrawBoard.DrawArea) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$DrawArea r4 = (com.zykj.sketch.EzyDrawBoard.DrawArea) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.DrawArea.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$DrawArea$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$DrawArea$Builder.smali:1576
            }
        }

        public static Builder newBuilder(DrawArea drawArea) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(drawArea);
        }

        public static DrawArea parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DrawArea(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.matrixMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DrawArea parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawArea) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrawArea parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DrawArea getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DrawArea parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DrawArea parseFrom(InputStream inputStream) {
            return (DrawArea) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private DrawArea() {
            this.matrixMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.matrix_ = Collections.EMPTY_LIST;
        }

        public static DrawArea parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawArea) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrawArea parseFrom(CodedInputStream codedInputStream) {
            return (DrawArea) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private DrawArea(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            GraphSnapshot.PointF.Builder builder;
            this();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                GraphSnapshot.PointF pointF = this.leftTopPoint_;
                                builder = pointF != null ? pointF.toBuilder() : null;
                                GraphSnapshot.PointF pointF2 = (GraphSnapshot.PointF) codedInputStream.readMessage(GraphSnapshot.PointF.parser(), extensionRegistryLite);
                                this.leftTopPoint_ = pointF2;
                                if (builder != null) {
                                    builder.mergeFrom(pointF2);
                                    this.leftTopPoint_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                GraphSnapshot.PointF pointF3 = this.rightBottomPoint_;
                                builder = pointF3 != null ? pointF3.toBuilder() : null;
                                GraphSnapshot.PointF pointF4 = (GraphSnapshot.PointF) codedInputStream.readMessage(GraphSnapshot.PointF.parser(), extensionRegistryLite);
                                this.rightBottomPoint_ = pointF4;
                                if (builder != null) {
                                    builder.mergeFrom(pointF4);
                                    this.rightBottomPoint_ = builder.buildPartial();
                                }
                            } else if (tag == 26) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((c10 & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.matrix_ = new ArrayList();
                                    c10 = 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.matrix_.add(Float.valueOf(codedInputStream.readFloat()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            } else if (tag != 29) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                if ((c10 & 4) != 4) {
                                    this.matrix_ = new ArrayList();
                                    c10 = 4;
                                }
                                this.matrix_.add(Float.valueOf(codedInputStream.readFloat()));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c10 & 4) == 4) {
                        this.matrix_ = Collections.unmodifiableList(this.matrix_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c10 & 4) == 4) {
                this.matrix_ = Collections.unmodifiableList(this.matrix_);
            }
            makeExtensionsImmutable();
        }

        public static DrawArea parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawArea) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DrawAreaOrBuilder extends MessageOrBuilder {
        GraphSnapshot.PointF getLeftTopPoint();

        GraphSnapshot.PointFOrBuilder getLeftTopPointOrBuilder();

        float getMatrix(int i10);

        int getMatrixCount();

        List<Float> getMatrixList();

        GraphSnapshot.PointF getRightBottomPoint();

        GraphSnapshot.PointFOrBuilder getRightBottomPointOrBuilder();

        boolean hasLeftTopPoint();

        boolean hasRightBottomPoint();
    }

    public static final class DrawBoard extends GeneratedMessageV3 implements DrawBoardOrBuilder {
        public static final int BOARDBODY_FIELD_NUMBER = 2;
        public static final int BOARDHEAD_FIELD_NUMBER = 1;
        private static final DrawBoard DEFAULT_INSTANCE = new DrawBoard();
        private static final Parser<DrawBoard> PARSER = new AbstractParser<DrawBoard>() { // from class: com.zykj.sketch.EzyDrawBoard.DrawBoard.1
            @Override // com.google.protobuf.Parser
            public DrawBoard parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new DrawBoard(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private BoardBody boardBody_;
        private BoardHead boardHead_;
        private byte memoizedIsInitialized;

        public static DrawBoard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_DrawBoard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DrawBoard parseDelimitedFrom(InputStream inputStream) {
            return (DrawBoard) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DrawBoard parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<DrawBoard> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DrawBoard)) {
                return super.equals(obj);
            }
            DrawBoard drawBoard = (DrawBoard) obj;
            boolean z10 = hasBoardHead() == drawBoard.hasBoardHead();
            if (hasBoardHead()) {
                z10 = z10 && getBoardHead().equals(drawBoard.getBoardHead());
            }
            boolean z11 = z10 && hasBoardBody() == drawBoard.hasBoardBody();
            return hasBoardBody() ? z11 && getBoardBody().equals(drawBoard.getBoardBody()) : z11;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
        public BoardBody getBoardBody() {
            BoardBody boardBody = this.boardBody_;
            return boardBody == null ? BoardBody.getDefaultInstance() : boardBody;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
        public BoardBodyOrBuilder getBoardBodyOrBuilder() {
            return getBoardBody();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
        public BoardHead getBoardHead() {
            BoardHead boardHead = this.boardHead_;
            return boardHead == null ? BoardHead.getDefaultInstance() : boardHead;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
        public BoardHeadOrBuilder getBoardHeadOrBuilder() {
            return getBoardHead();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DrawBoard> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.boardHead_ != null ? CodedOutputStream.computeMessageSize(1, getBoardHead()) : 0;
            if (this.boardBody_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getBoardBody());
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
        public boolean hasBoardBody() {
            return this.boardBody_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
        public boolean hasBoardHead() {
            return this.boardHead_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (hasBoardHead()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBoardHead().hashCode();
            }
            if (hasBoardBody()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBoardBody().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_DrawBoard_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawBoard.class, Builder.class);
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
            if (this.boardHead_ != null) {
                codedOutputStream.writeMessage(1, getBoardHead());
            }
            if (this.boardBody_ != null) {
                codedOutputStream.writeMessage(2, getBoardBody());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawBoardOrBuilder {
            private SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> boardBodyBuilder_;
            private BoardBody boardBody_;
            private SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> boardHeadBuilder_;
            private BoardHead boardHead_;

            private SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> getBoardBodyFieldBuilder() {
                if (this.boardBodyBuilder_ == null) {
                    this.boardBodyBuilder_ = new SingleFieldBuilderV3<>(getBoardBody(), getParentForChildren(), isClean());
                    this.boardBody_ = null;
                }
                return this.boardBodyBuilder_;
            }

            private SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> getBoardHeadFieldBuilder() {
                if (this.boardHeadBuilder_ == null) {
                    this.boardHeadBuilder_ = new SingleFieldBuilderV3<>(getBoardHead(), getParentForChildren(), isClean());
                    this.boardHead_ = null;
                }
                return this.boardHeadBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_DrawBoard_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBoardBody() {
                if (this.boardBodyBuilder_ == null) {
                    this.boardBody_ = null;
                    onChanged();
                    return this;
                }
                this.boardBody_ = null;
                this.boardBodyBuilder_ = null;
                return this;
            }

            public Builder clearBoardHead() {
                if (this.boardHeadBuilder_ == null) {
                    this.boardHead_ = null;
                    onChanged();
                    return this;
                }
                this.boardHead_ = null;
                this.boardHeadBuilder_ = null;
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
            public BoardBody getBoardBody() {
                SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> singleFieldBuilderV3 = this.boardBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardBody) singleFieldBuilderV3.getMessage();
                }
                BoardBody boardBody = this.boardBody_;
                return boardBody == null ? BoardBody.getDefaultInstance() : boardBody;
            }

            public BoardBody.Builder getBoardBodyBuilder() {
                onChanged();
                return (BoardBody.Builder) getBoardBodyFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
            public BoardBodyOrBuilder getBoardBodyOrBuilder() {
                SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> singleFieldBuilderV3 = this.boardBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardBodyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoardBody boardBody = this.boardBody_;
                return boardBody == null ? BoardBody.getDefaultInstance() : boardBody;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
            public BoardHead getBoardHead() {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardHead) singleFieldBuilderV3.getMessage();
                }
                BoardHead boardHead = this.boardHead_;
                return boardHead == null ? BoardHead.getDefaultInstance() : boardHead;
            }

            public BoardHead.Builder getBoardHeadBuilder() {
                onChanged();
                return (BoardHead.Builder) getBoardHeadFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
            public BoardHeadOrBuilder getBoardHeadOrBuilder() {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardHeadOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoardHead boardHead = this.boardHead_;
                return boardHead == null ? BoardHead.getDefaultInstance() : boardHead;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_DrawBoard_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
            public boolean hasBoardBody() {
                return (this.boardBodyBuilder_ == null && this.boardBody_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardOrBuilder
            public boolean hasBoardHead() {
                return (this.boardHeadBuilder_ == null && this.boardHead_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_DrawBoard_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawBoard.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBoardBody(BoardBody boardBody) {
                SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> singleFieldBuilderV3 = this.boardBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(boardBody);
                    return this;
                }
                BoardBody boardBody2 = this.boardBody_;
                if (boardBody2 != null) {
                    this.boardBody_ = BoardBody.newBuilder(boardBody2).mergeFrom(boardBody).buildPartial();
                } else {
                    this.boardBody_ = boardBody;
                }
                onChanged();
                return this;
            }

            public Builder mergeBoardHead(BoardHead boardHead) {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(boardHead);
                    return this;
                }
                BoardHead boardHead2 = this.boardHead_;
                if (boardHead2 != null) {
                    this.boardHead_ = BoardHead.newBuilder(boardHead2).mergeFrom(boardHead).buildPartial();
                } else {
                    this.boardHead_ = boardHead;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setBoardBody(BoardBody boardBody) {
                SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> singleFieldBuilderV3 = this.boardBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(boardBody);
                    return this;
                }
                boardBody.getClass();
                this.boardBody_ = boardBody;
                onChanged();
                return this;
            }

            public Builder setBoardHead(BoardHead boardHead) {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(boardHead);
                    return this;
                }
                boardHead.getClass();
                this.boardHead_ = boardHead;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.boardHead_ = null;
                this.boardBody_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrawBoard build() {
                DrawBoard drawBoardBuildPartial = buildPartial();
                if (drawBoardBuildPartial.isInitialized()) {
                    return drawBoardBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) drawBoardBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrawBoard buildPartial() {
                DrawBoard drawBoard = new DrawBoard(this);
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    drawBoard.boardHead_ = this.boardHead_;
                } else {
                    drawBoard.boardHead_ = (BoardHead) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> singleFieldBuilderV32 = this.boardBodyBuilder_;
                if (singleFieldBuilderV32 == null) {
                    drawBoard.boardBody_ = this.boardBody_;
                } else {
                    drawBoard.boardBody_ = (BoardBody) singleFieldBuilderV32.build();
                }
                onBuilt();
                return drawBoard;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DrawBoard getDefaultInstanceForType() {
                return DrawBoard.getDefaultInstance();
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
                if (this.boardHeadBuilder_ == null) {
                    this.boardHead_ = null;
                } else {
                    this.boardHead_ = null;
                    this.boardHeadBuilder_ = null;
                }
                if (this.boardBodyBuilder_ == null) {
                    this.boardBody_ = null;
                    return this;
                }
                this.boardBody_ = null;
                this.boardBodyBuilder_ = null;
                return this;
            }

            public Builder setBoardBody(BoardBody.Builder builder) {
                SingleFieldBuilderV3<BoardBody, BoardBody.Builder, BoardBodyOrBuilder> singleFieldBuilderV3 = this.boardBodyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.boardBody_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setBoardHead(BoardHead.Builder builder) {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.boardHead_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.boardHead_ = null;
                this.boardBody_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DrawBoard) {
                    return mergeFrom((DrawBoard) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DrawBoard drawBoard) {
                if (drawBoard == DrawBoard.getDefaultInstance()) {
                    return this;
                }
                if (drawBoard.hasBoardHead()) {
                    mergeBoardHead(drawBoard.getBoardHead());
                }
                if (drawBoard.hasBoardBody()) {
                    mergeBoardBody(drawBoard.getBoardBody());
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
            public com.zykj.sketch.EzyDrawBoard.DrawBoard.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.DrawBoard.access$800()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$DrawBoard r3 = (com.zykj.sketch.EzyDrawBoard.DrawBoard) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$DrawBoard r4 = (com.zykj.sketch.EzyDrawBoard.DrawBoard) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.DrawBoard.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$DrawBoard$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$DrawBoard$Builder.smali:1424
            }
        }

        public static Builder newBuilder(DrawBoard drawBoard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(drawBoard);
        }

        public static DrawBoard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DrawBoard(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DrawBoard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawBoard) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrawBoard parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DrawBoard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DrawBoard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DrawBoard() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DrawBoard parseFrom(InputStream inputStream) {
            return (DrawBoard) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private DrawBoard(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                BoardHead boardHead = this.boardHead_;
                                BoardHead.Builder builder = boardHead != null ? boardHead.toBuilder() : null;
                                BoardHead boardHead2 = (BoardHead) codedInputStream.readMessage(BoardHead.parser(), extensionRegistryLite);
                                this.boardHead_ = boardHead2;
                                if (builder != null) {
                                    builder.mergeFrom(boardHead2);
                                    this.boardHead_ = builder.buildPartial();
                                }
                            } else if (tag != 18) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                BoardBody boardBody = this.boardBody_;
                                BoardBody.Builder builder2 = boardBody != null ? boardBody.toBuilder() : null;
                                BoardBody boardBody2 = (BoardBody) codedInputStream.readMessage(BoardBody.parser(), extensionRegistryLite);
                                this.boardBody_ = boardBody2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(boardBody2);
                                    this.boardBody_ = builder2.buildPartial();
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

        public static DrawBoard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawBoard) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrawBoard parseFrom(CodedInputStream codedInputStream) {
            return (DrawBoard) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DrawBoard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawBoard) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DrawBoardOrBuilder extends MessageOrBuilder {
        BoardBody getBoardBody();

        BoardBodyOrBuilder getBoardBodyOrBuilder();

        BoardHead getBoardHead();

        BoardHeadOrBuilder getBoardHeadOrBuilder();

        boolean hasBoardBody();

        boolean hasBoardHead();
    }

    public static final class DrawBoardV1 extends GeneratedMessageV3 implements DrawBoardV1OrBuilder {
        public static final int BOARDBODYV1_FIELD_NUMBER = 2;
        public static final int BOARDHEAD_FIELD_NUMBER = 1;
        private static final DrawBoardV1 DEFAULT_INSTANCE = new DrawBoardV1();
        private static final Parser<DrawBoardV1> PARSER = new AbstractParser<DrawBoardV1>() { // from class: com.zykj.sketch.EzyDrawBoard.DrawBoardV1.1
            @Override // com.google.protobuf.Parser
            public DrawBoardV1 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new DrawBoardV1(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private BoardBodyV1 boardBodyV1_;
        private BoardHead boardHead_;
        private byte memoizedIsInitialized;

        public static DrawBoardV1 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_DrawBoardV1_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DrawBoardV1 parseDelimitedFrom(InputStream inputStream) {
            return (DrawBoardV1) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DrawBoardV1 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<DrawBoardV1> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DrawBoardV1)) {
                return super.equals(obj);
            }
            DrawBoardV1 drawBoardV1 = (DrawBoardV1) obj;
            boolean z10 = hasBoardHead() == drawBoardV1.hasBoardHead();
            if (hasBoardHead()) {
                z10 = z10 && getBoardHead().equals(drawBoardV1.getBoardHead());
            }
            boolean z11 = z10 && hasBoardBodyV1() == drawBoardV1.hasBoardBodyV1();
            return hasBoardBodyV1() ? z11 && getBoardBodyV1().equals(drawBoardV1.getBoardBodyV1()) : z11;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
        public BoardBodyV1 getBoardBodyV1() {
            BoardBodyV1 boardBodyV1 = this.boardBodyV1_;
            return boardBodyV1 == null ? BoardBodyV1.getDefaultInstance() : boardBodyV1;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
        public BoardBodyV1OrBuilder getBoardBodyV1OrBuilder() {
            return getBoardBodyV1();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
        public BoardHead getBoardHead() {
            BoardHead boardHead = this.boardHead_;
            return boardHead == null ? BoardHead.getDefaultInstance() : boardHead;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
        public BoardHeadOrBuilder getBoardHeadOrBuilder() {
            return getBoardHead();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DrawBoardV1> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.boardHead_ != null ? CodedOutputStream.computeMessageSize(1, getBoardHead()) : 0;
            if (this.boardBodyV1_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getBoardBodyV1());
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
        public boolean hasBoardBodyV1() {
            return this.boardBodyV1_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
        public boolean hasBoardHead() {
            return this.boardHead_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (hasBoardHead()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBoardHead().hashCode();
            }
            if (hasBoardBodyV1()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBoardBodyV1().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_DrawBoardV1_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawBoardV1.class, Builder.class);
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
            if (this.boardHead_ != null) {
                codedOutputStream.writeMessage(1, getBoardHead());
            }
            if (this.boardBodyV1_ != null) {
                codedOutputStream.writeMessage(2, getBoardBodyV1());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawBoardV1OrBuilder {
            private SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> boardBodyV1Builder_;
            private BoardBodyV1 boardBodyV1_;
            private SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> boardHeadBuilder_;
            private BoardHead boardHead_;

            private SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> getBoardBodyV1FieldBuilder() {
                if (this.boardBodyV1Builder_ == null) {
                    this.boardBodyV1Builder_ = new SingleFieldBuilderV3<>(getBoardBodyV1(), getParentForChildren(), isClean());
                    this.boardBodyV1_ = null;
                }
                return this.boardBodyV1Builder_;
            }

            private SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> getBoardHeadFieldBuilder() {
                if (this.boardHeadBuilder_ == null) {
                    this.boardHeadBuilder_ = new SingleFieldBuilderV3<>(getBoardHead(), getParentForChildren(), isClean());
                    this.boardHead_ = null;
                }
                return this.boardHeadBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_DrawBoardV1_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBoardBodyV1() {
                if (this.boardBodyV1Builder_ == null) {
                    this.boardBodyV1_ = null;
                    onChanged();
                    return this;
                }
                this.boardBodyV1_ = null;
                this.boardBodyV1Builder_ = null;
                return this;
            }

            public Builder clearBoardHead() {
                if (this.boardHeadBuilder_ == null) {
                    this.boardHead_ = null;
                    onChanged();
                    return this;
                }
                this.boardHead_ = null;
                this.boardHeadBuilder_ = null;
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
            public BoardBodyV1 getBoardBodyV1() {
                SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> singleFieldBuilderV3 = this.boardBodyV1Builder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardBodyV1) singleFieldBuilderV3.getMessage();
                }
                BoardBodyV1 boardBodyV1 = this.boardBodyV1_;
                return boardBodyV1 == null ? BoardBodyV1.getDefaultInstance() : boardBodyV1;
            }

            public BoardBodyV1.Builder getBoardBodyV1Builder() {
                onChanged();
                return (BoardBodyV1.Builder) getBoardBodyV1FieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
            public BoardBodyV1OrBuilder getBoardBodyV1OrBuilder() {
                SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> singleFieldBuilderV3 = this.boardBodyV1Builder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardBodyV1OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoardBodyV1 boardBodyV1 = this.boardBodyV1_;
                return boardBodyV1 == null ? BoardBodyV1.getDefaultInstance() : boardBodyV1;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
            public BoardHead getBoardHead() {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardHead) singleFieldBuilderV3.getMessage();
                }
                BoardHead boardHead = this.boardHead_;
                return boardHead == null ? BoardHead.getDefaultInstance() : boardHead;
            }

            public BoardHead.Builder getBoardHeadBuilder() {
                onChanged();
                return (BoardHead.Builder) getBoardHeadFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
            public BoardHeadOrBuilder getBoardHeadOrBuilder() {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoardHeadOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoardHead boardHead = this.boardHead_;
                return boardHead == null ? BoardHead.getDefaultInstance() : boardHead;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_DrawBoardV1_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
            public boolean hasBoardBodyV1() {
                return (this.boardBodyV1Builder_ == null && this.boardBodyV1_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.DrawBoardV1OrBuilder
            public boolean hasBoardHead() {
                return (this.boardHeadBuilder_ == null && this.boardHead_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_DrawBoardV1_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawBoardV1.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBoardBodyV1(BoardBodyV1 boardBodyV1) {
                SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> singleFieldBuilderV3 = this.boardBodyV1Builder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(boardBodyV1);
                    return this;
                }
                BoardBodyV1 boardBodyV12 = this.boardBodyV1_;
                if (boardBodyV12 != null) {
                    this.boardBodyV1_ = BoardBodyV1.newBuilder(boardBodyV12).mergeFrom(boardBodyV1).buildPartial();
                } else {
                    this.boardBodyV1_ = boardBodyV1;
                }
                onChanged();
                return this;
            }

            public Builder mergeBoardHead(BoardHead boardHead) {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(boardHead);
                    return this;
                }
                BoardHead boardHead2 = this.boardHead_;
                if (boardHead2 != null) {
                    this.boardHead_ = BoardHead.newBuilder(boardHead2).mergeFrom(boardHead).buildPartial();
                } else {
                    this.boardHead_ = boardHead;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setBoardBodyV1(BoardBodyV1 boardBodyV1) {
                SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> singleFieldBuilderV3 = this.boardBodyV1Builder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(boardBodyV1);
                    return this;
                }
                boardBodyV1.getClass();
                this.boardBodyV1_ = boardBodyV1;
                onChanged();
                return this;
            }

            public Builder setBoardHead(BoardHead boardHead) {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(boardHead);
                    return this;
                }
                boardHead.getClass();
                this.boardHead_ = boardHead;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.boardHead_ = null;
                this.boardBodyV1_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrawBoardV1 build() {
                DrawBoardV1 drawBoardV1BuildPartial = buildPartial();
                if (drawBoardV1BuildPartial.isInitialized()) {
                    return drawBoardV1BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) drawBoardV1BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrawBoardV1 buildPartial() {
                DrawBoardV1 drawBoardV1 = new DrawBoardV1(this);
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    drawBoardV1.boardHead_ = this.boardHead_;
                } else {
                    drawBoardV1.boardHead_ = (BoardHead) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> singleFieldBuilderV32 = this.boardBodyV1Builder_;
                if (singleFieldBuilderV32 == null) {
                    drawBoardV1.boardBodyV1_ = this.boardBodyV1_;
                } else {
                    drawBoardV1.boardBodyV1_ = (BoardBodyV1) singleFieldBuilderV32.build();
                }
                onBuilt();
                return drawBoardV1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DrawBoardV1 getDefaultInstanceForType() {
                return DrawBoardV1.getDefaultInstance();
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
                if (this.boardHeadBuilder_ == null) {
                    this.boardHead_ = null;
                } else {
                    this.boardHead_ = null;
                    this.boardHeadBuilder_ = null;
                }
                if (this.boardBodyV1Builder_ == null) {
                    this.boardBodyV1_ = null;
                    return this;
                }
                this.boardBodyV1_ = null;
                this.boardBodyV1Builder_ = null;
                return this;
            }

            public Builder setBoardBodyV1(BoardBodyV1.Builder builder) {
                SingleFieldBuilderV3<BoardBodyV1, BoardBodyV1.Builder, BoardBodyV1OrBuilder> singleFieldBuilderV3 = this.boardBodyV1Builder_;
                if (singleFieldBuilderV3 == null) {
                    this.boardBodyV1_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setBoardHead(BoardHead.Builder builder) {
                SingleFieldBuilderV3<BoardHead, BoardHead.Builder, BoardHeadOrBuilder> singleFieldBuilderV3 = this.boardHeadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.boardHead_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.boardHead_ = null;
                this.boardBodyV1_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo33979clone() {
                return (Builder) super.mo33979clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DrawBoardV1) {
                    return mergeFrom((DrawBoardV1) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DrawBoardV1 drawBoardV1) {
                if (drawBoardV1 == DrawBoardV1.getDefaultInstance()) {
                    return this;
                }
                if (drawBoardV1.hasBoardHead()) {
                    mergeBoardHead(drawBoardV1.getBoardHead());
                }
                if (drawBoardV1.hasBoardBodyV1()) {
                    mergeBoardBodyV1(drawBoardV1.getBoardBodyV1());
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
            public com.zykj.sketch.EzyDrawBoard.DrawBoardV1.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.DrawBoardV1.access$1800()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$DrawBoardV1 r3 = (com.zykj.sketch.EzyDrawBoard.DrawBoardV1) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$DrawBoardV1 r4 = (com.zykj.sketch.EzyDrawBoard.DrawBoardV1) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.DrawBoardV1.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$DrawBoardV1$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$DrawBoardV1$Builder.smali:1424
            }
        }

        public static Builder newBuilder(DrawBoardV1 drawBoardV1) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(drawBoardV1);
        }

        public static DrawBoardV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DrawBoardV1(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DrawBoardV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawBoardV1) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrawBoardV1 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DrawBoardV1 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DrawBoardV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DrawBoardV1() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DrawBoardV1 parseFrom(InputStream inputStream) {
            return (DrawBoardV1) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private DrawBoardV1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                BoardHead boardHead = this.boardHead_;
                                BoardHead.Builder builder = boardHead != null ? boardHead.toBuilder() : null;
                                BoardHead boardHead2 = (BoardHead) codedInputStream.readMessage(BoardHead.parser(), extensionRegistryLite);
                                this.boardHead_ = boardHead2;
                                if (builder != null) {
                                    builder.mergeFrom(boardHead2);
                                    this.boardHead_ = builder.buildPartial();
                                }
                            } else if (tag != 18) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                BoardBodyV1 boardBodyV1 = this.boardBodyV1_;
                                BoardBodyV1.Builder builder2 = boardBodyV1 != null ? boardBodyV1.toBuilder() : null;
                                BoardBodyV1 boardBodyV12 = (BoardBodyV1) codedInputStream.readMessage(BoardBodyV1.parser(), extensionRegistryLite);
                                this.boardBodyV1_ = boardBodyV12;
                                if (builder2 != null) {
                                    builder2.mergeFrom(boardBodyV12);
                                    this.boardBodyV1_ = builder2.buildPartial();
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

        public static DrawBoardV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawBoardV1) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrawBoardV1 parseFrom(CodedInputStream codedInputStream) {
            return (DrawBoardV1) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DrawBoardV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrawBoardV1) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DrawBoardV1OrBuilder extends MessageOrBuilder {
        BoardBodyV1 getBoardBodyV1();

        BoardBodyV1OrBuilder getBoardBodyV1OrBuilder();

        BoardHead getBoardHead();

        BoardHeadOrBuilder getBoardHeadOrBuilder();

        boolean hasBoardBodyV1();

        boolean hasBoardHead();
    }

    public static final class GraphResetData extends GeneratedMessageV3 implements GraphResetDataOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 5;
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 8;
        public static final int DRAWAREA_FIELD_NUMBER = 9;
        public static final int FACTORYACTIONGRAPHNAME_FIELD_NUMBER = 2;
        public static final int FACTORYGRAPHNAME_FIELD_NUMBER = 1;
        public static final int GRAPHCONFIG_FIELD_NUMBER = 6;
        public static final int MODECONFIG_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private ActionFactory action_;
        private int backgroundColor_;
        private DrawArea drawArea_;
        private volatile Object factoryActionGraphName_;
        private volatile Object factoryGraphName_;
        private ActionGraphConfig.GraphConfig graphConfig_;
        private byte memoizedIsInitialized;
        private int modeConfig_;
        private static final GraphResetData DEFAULT_INSTANCE = new GraphResetData();
        private static final Parser<GraphResetData> PARSER = new AbstractParser<GraphResetData>() { // from class: com.zykj.sketch.EzyDrawBoard.GraphResetData.1
            @Override // com.google.protobuf.Parser
            public GraphResetData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new GraphResetData(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class ActionFactory extends GeneratedMessageV3 implements ActionFactoryOrBuilder {
            public static final int BASEACTION_FIELD_NUMBER = 1;
            public static final int FACTORYACTIONGRAPHNAME_FIELD_NUMBER = 3;
            public static final int FACTORYGRAPHNAME_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int baseAction_;
            private volatile Object factoryActionGraphName_;
            private volatile Object factoryGraphName_;
            private byte memoizedIsInitialized;
            private static final ActionFactory DEFAULT_INSTANCE = new ActionFactory();
            private static final Parser<ActionFactory> PARSER = new AbstractParser<ActionFactory>() { // from class: com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactory.1
                @Override // com.google.protobuf.Parser
                public ActionFactory parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new ActionFactory(codedInputStream, extensionRegistryLite);
                }
            };

            public static ActionFactory getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_GraphResetData_ActionFactory_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ActionFactory parseDelimitedFrom(InputStream inputStream) {
                return (ActionFactory) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ActionFactory parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<ActionFactory> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ActionFactory)) {
                    return super.equals(obj);
                }
                ActionFactory actionFactory = (ActionFactory) obj;
                return this.baseAction_ == actionFactory.baseAction_ && getFactoryGraphName().equals(actionFactory.getFactoryGraphName()) && getFactoryActionGraphName().equals(actionFactory.getFactoryActionGraphName());
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
            public ActionModeConfig.Mode getBaseAction() {
                ActionModeConfig.Mode modeValueOf = ActionModeConfig.Mode.valueOf(this.baseAction_);
                return modeValueOf == null ? ActionModeConfig.Mode.UNRECOGNIZED : modeValueOf;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
            public int getBaseActionValue() {
                return this.baseAction_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
            public String getFactoryActionGraphName() {
                Object obj = this.factoryActionGraphName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.factoryActionGraphName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
            public ByteString getFactoryActionGraphNameBytes() {
                Object obj = this.factoryActionGraphName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.factoryActionGraphName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
            public String getFactoryGraphName() {
                Object obj = this.factoryGraphName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.factoryGraphName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
            public ByteString getFactoryGraphNameBytes() {
                Object obj = this.factoryGraphName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.factoryGraphName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ActionFactory> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.baseAction_ != ActionModeConfig.Mode.ACTION_SELECT.getNumber() ? CodedOutputStream.computeEnumSize(1, this.baseAction_) : 0;
                if (!getFactoryGraphNameBytes().isEmpty()) {
                    iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.factoryGraphName_);
                }
                if (!getFactoryActionGraphNameBytes().isEmpty()) {
                    iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.factoryActionGraphName_);
                }
                this.memoizedSize = iComputeEnumSize;
                return iComputeEnumSize;
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
                int iHashCode = ((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + this.baseAction_) * 37) + 2) * 53) + getFactoryGraphName().hashCode()) * 37) + 3) * 53) + getFactoryActionGraphName().hashCode()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_GraphResetData_ActionFactory_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionFactory.class, Builder.class);
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
                if (this.baseAction_ != ActionModeConfig.Mode.ACTION_SELECT.getNumber()) {
                    codedOutputStream.writeEnum(1, this.baseAction_);
                }
                if (!getFactoryGraphNameBytes().isEmpty()) {
                    GeneratedMessage.writeString(codedOutputStream, 2, this.factoryGraphName_);
                }
                if (getFactoryActionGraphNameBytes().isEmpty()) {
                    return;
                }
                GeneratedMessage.writeString(codedOutputStream, 3, this.factoryActionGraphName_);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionFactoryOrBuilder {
                private int baseAction_;
                private Object factoryActionGraphName_;
                private Object factoryGraphName_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyDrawBoard.internal_static_GraphResetData_ActionFactory_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
                }

                public Builder clearBaseAction() {
                    this.baseAction_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearFactoryActionGraphName() {
                    this.factoryActionGraphName_ = ActionFactory.getDefaultInstance().getFactoryActionGraphName();
                    onChanged();
                    return this;
                }

                public Builder clearFactoryGraphName() {
                    this.factoryGraphName_ = ActionFactory.getDefaultInstance().getFactoryGraphName();
                    onChanged();
                    return this;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
                public ActionModeConfig.Mode getBaseAction() {
                    ActionModeConfig.Mode modeValueOf = ActionModeConfig.Mode.valueOf(this.baseAction_);
                    return modeValueOf == null ? ActionModeConfig.Mode.UNRECOGNIZED : modeValueOf;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
                public int getBaseActionValue() {
                    return this.baseAction_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyDrawBoard.internal_static_GraphResetData_ActionFactory_descriptor;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
                public String getFactoryActionGraphName() {
                    Object obj = this.factoryActionGraphName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.factoryActionGraphName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
                public ByteString getFactoryActionGraphNameBytes() {
                    Object obj = this.factoryActionGraphName_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.factoryActionGraphName_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
                public String getFactoryGraphName() {
                    Object obj = this.factoryGraphName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.factoryGraphName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactoryOrBuilder
                public ByteString getFactoryGraphNameBytes() {
                    Object obj = this.factoryGraphName_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.factoryGraphName_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyDrawBoard.internal_static_GraphResetData_ActionFactory_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionFactory.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return this;
                }

                public Builder setBaseAction(ActionModeConfig.Mode mode) {
                    mode.getClass();
                    this.baseAction_ = mode.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setBaseActionValue(int i10) {
                    this.baseAction_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setFactoryActionGraphName(String str) {
                    str.getClass();
                    this.factoryActionGraphName_ = str;
                    onChanged();
                    return this;
                }

                public Builder setFactoryActionGraphNameBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.factoryActionGraphName_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setFactoryGraphName(String str) {
                    str.getClass();
                    this.factoryGraphName_ = str;
                    onChanged();
                    return this;
                }

                public Builder setFactoryGraphNameBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.factoryGraphName_ = byteString;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return this;
                }

                private Builder() {
                    this.baseAction_ = 0;
                    this.factoryGraphName_ = "";
                    this.factoryActionGraphName_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ActionFactory build() {
                    ActionFactory actionFactoryBuildPartial = buildPartial();
                    if (actionFactoryBuildPartial.isInitialized()) {
                        return actionFactoryBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionFactoryBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ActionFactory buildPartial() {
                    ActionFactory actionFactory = new ActionFactory(this);
                    actionFactory.baseAction_ = this.baseAction_;
                    actionFactory.factoryGraphName_ = this.factoryGraphName_;
                    actionFactory.factoryActionGraphName_ = this.factoryActionGraphName_;
                    onBuilt();
                    return actionFactory;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ActionFactory getDefaultInstanceForType() {
                    return ActionFactory.getDefaultInstance();
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
                    this.baseAction_ = 0;
                    this.factoryGraphName_ = "";
                    this.factoryActionGraphName_ = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo33979clone() {
                    return (Builder) super.mo33979clone();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ActionFactory) {
                        return mergeFrom((ActionFactory) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.baseAction_ = 0;
                    this.factoryGraphName_ = "";
                    this.factoryActionGraphName_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(ActionFactory actionFactory) {
                    if (actionFactory == ActionFactory.getDefaultInstance()) {
                        return this;
                    }
                    if (actionFactory.baseAction_ != 0) {
                        setBaseActionValue(actionFactory.getBaseActionValue());
                    }
                    if (!actionFactory.getFactoryGraphName().isEmpty()) {
                        this.factoryGraphName_ = actionFactory.factoryGraphName_;
                        onChanged();
                    }
                    if (!actionFactory.getFactoryActionGraphName().isEmpty()) {
                        this.factoryActionGraphName_ = actionFactory.factoryActionGraphName_;
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
                public com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactory.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactory.access$32400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                        com.zykj.sketch.EzyDrawBoard$GraphResetData$ActionFactory r3 = (com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactory) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                        com.zykj.sketch.EzyDrawBoard$GraphResetData$ActionFactory r4 = (com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactory) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.GraphResetData.ActionFactory.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$GraphResetData$ActionFactory$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder.smali:945
                }
            }

            public static Builder newBuilder(ActionFactory actionFactory) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionFactory);
            }

            public static ActionFactory parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private ActionFactory(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ActionFactory parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ActionFactory) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ActionFactory parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionFactory getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static ActionFactory parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private ActionFactory() {
                this.memoizedIsInitialized = (byte) -1;
                this.baseAction_ = 0;
                this.factoryGraphName_ = "";
                this.factoryActionGraphName_ = "";
            }

            public static ActionFactory parseFrom(InputStream inputStream) {
                return (ActionFactory) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ActionFactory parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ActionFactory) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ActionFactory parseFrom(CodedInputStream codedInputStream) {
                return (ActionFactory) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            private ActionFactory(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.baseAction_ = codedInputStream.readEnum();
                                } else if (tag == 18) {
                                    this.factoryGraphName_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 26) {
                                    if (!codedInputStream.skipField(tag)) {
                                    }
                                } else {
                                    this.factoryActionGraphName_ = codedInputStream.readStringRequireUtf8();
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

            public static ActionFactory parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ActionFactory) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ActionFactoryOrBuilder extends MessageOrBuilder {
            ActionModeConfig.Mode getBaseAction();

            int getBaseActionValue();

            String getFactoryActionGraphName();

            ByteString getFactoryActionGraphNameBytes();

            String getFactoryGraphName();

            ByteString getFactoryGraphNameBytes();
        }

        public static GraphResetData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyDrawBoard.internal_static_GraphResetData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GraphResetData parseDelimitedFrom(InputStream inputStream) {
            return (GraphResetData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GraphResetData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<GraphResetData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GraphResetData)) {
                return super.equals(obj);
            }
            GraphResetData graphResetData = (GraphResetData) obj;
            boolean z10 = getFactoryGraphName().equals(graphResetData.getFactoryGraphName()) && getFactoryActionGraphName().equals(graphResetData.getFactoryActionGraphName()) && hasAction() == graphResetData.hasAction();
            if (hasAction()) {
                z10 = z10 && getAction().equals(graphResetData.getAction());
            }
            boolean z11 = z10 && hasGraphConfig() == graphResetData.hasGraphConfig();
            if (hasGraphConfig()) {
                z11 = z11 && getGraphConfig().equals(graphResetData.getGraphConfig());
            }
            boolean z12 = ((z11 && this.modeConfig_ == graphResetData.modeConfig_) && getBackgroundColor() == graphResetData.getBackgroundColor()) && hasDrawArea() == graphResetData.hasDrawArea();
            return hasDrawArea() ? z12 && getDrawArea().equals(graphResetData.getDrawArea()) : z12;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ActionFactory getAction() {
            ActionFactory actionFactory = this.action_;
            return actionFactory == null ? ActionFactory.getDefaultInstance() : actionFactory;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ActionFactoryOrBuilder getActionOrBuilder() {
            return getAction();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public int getBackgroundColor() {
            return this.backgroundColor_;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public DrawArea getDrawArea() {
            DrawArea drawArea = this.drawArea_;
            return drawArea == null ? DrawArea.getDefaultInstance() : drawArea;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public DrawAreaOrBuilder getDrawAreaOrBuilder() {
            return getDrawArea();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public String getFactoryActionGraphName() {
            Object obj = this.factoryActionGraphName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.factoryActionGraphName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ByteString getFactoryActionGraphNameBytes() {
            Object obj = this.factoryActionGraphName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.factoryActionGraphName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public String getFactoryGraphName() {
            Object obj = this.factoryGraphName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.factoryGraphName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ByteString getFactoryGraphNameBytes() {
            Object obj = this.factoryGraphName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.factoryGraphName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ActionGraphConfig.GraphConfig getGraphConfig() {
            ActionGraphConfig.GraphConfig graphConfig = this.graphConfig_;
            return graphConfig == null ? ActionGraphConfig.GraphConfig.getDefaultInstance() : graphConfig;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ActionGraphConfig.GraphConfigOrBuilder getGraphConfigOrBuilder() {
            return getGraphConfig();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public ActionModeConfig.Mode getModeConfig() {
            ActionModeConfig.Mode modeValueOf = ActionModeConfig.Mode.valueOf(this.modeConfig_);
            return modeValueOf == null ? ActionModeConfig.Mode.UNRECOGNIZED : modeValueOf;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public int getModeConfigValue() {
            return this.modeConfig_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GraphResetData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getFactoryGraphNameBytes().isEmpty() ? GeneratedMessage.computeStringSize(1, this.factoryGraphName_) : 0;
            if (!getFactoryActionGraphNameBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.factoryActionGraphName_);
            }
            if (this.action_ != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, getAction());
            }
            if (this.graphConfig_ != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, getGraphConfig());
            }
            if (this.modeConfig_ != ActionModeConfig.Mode.ACTION_SELECT.getNumber()) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(7, this.modeConfig_);
            }
            int i11 = this.backgroundColor_;
            if (i11 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(8, i11);
            }
            if (this.drawArea_ != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, getDrawArea());
            }
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public boolean hasAction() {
            return this.action_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public boolean hasDrawArea() {
            return this.drawArea_ != null;
        }

        @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
        public boolean hasGraphConfig() {
            return this.graphConfig_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getFactoryGraphName().hashCode()) * 37) + 2) * 53) + getFactoryActionGraphName().hashCode();
            if (hasAction()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAction().hashCode();
            }
            if (hasGraphConfig()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getGraphConfig().hashCode();
            }
            int backgroundColor = (((((((iHashCode * 37) + 7) * 53) + this.modeConfig_) * 37) + 8) * 53) + getBackgroundColor();
            if (hasDrawArea()) {
                backgroundColor = (((backgroundColor * 37) + 9) * 53) + getDrawArea().hashCode();
            }
            int iHashCode2 = (backgroundColor * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyDrawBoard.internal_static_GraphResetData_fieldAccessorTable.ensureFieldAccessorsInitialized(GraphResetData.class, Builder.class);
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
            if (!getFactoryGraphNameBytes().isEmpty()) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.factoryGraphName_);
            }
            if (!getFactoryActionGraphNameBytes().isEmpty()) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.factoryActionGraphName_);
            }
            if (this.action_ != null) {
                codedOutputStream.writeMessage(5, getAction());
            }
            if (this.graphConfig_ != null) {
                codedOutputStream.writeMessage(6, getGraphConfig());
            }
            if (this.modeConfig_ != ActionModeConfig.Mode.ACTION_SELECT.getNumber()) {
                codedOutputStream.writeEnum(7, this.modeConfig_);
            }
            int i10 = this.backgroundColor_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(8, i10);
            }
            if (this.drawArea_ != null) {
                codedOutputStream.writeMessage(9, getDrawArea());
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GraphResetDataOrBuilder {
            private SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> actionBuilder_;
            private ActionFactory action_;
            private int backgroundColor_;
            private SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> drawAreaBuilder_;
            private DrawArea drawArea_;
            private Object factoryActionGraphName_;
            private Object factoryGraphName_;
            private SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> graphConfigBuilder_;
            private ActionGraphConfig.GraphConfig graphConfig_;
            private int modeConfig_;

            private SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> getActionFieldBuilder() {
                if (this.actionBuilder_ == null) {
                    this.actionBuilder_ = new SingleFieldBuilderV3<>(getAction(), getParentForChildren(), isClean());
                    this.action_ = null;
                }
                return this.actionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyDrawBoard.internal_static_GraphResetData_descriptor;
            }

            private SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> getDrawAreaFieldBuilder() {
                if (this.drawAreaBuilder_ == null) {
                    this.drawAreaBuilder_ = new SingleFieldBuilderV3<>(getDrawArea(), getParentForChildren(), isClean());
                    this.drawArea_ = null;
                }
                return this.drawAreaBuilder_;
            }

            private SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> getGraphConfigFieldBuilder() {
                if (this.graphConfigBuilder_ == null) {
                    this.graphConfigBuilder_ = new SingleFieldBuilderV3<>(getGraphConfig(), getParentForChildren(), isClean());
                    this.graphConfig_ = null;
                }
                return this.graphConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAction() {
                if (this.actionBuilder_ == null) {
                    this.action_ = null;
                    onChanged();
                    return this;
                }
                this.action_ = null;
                this.actionBuilder_ = null;
                return this;
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDrawArea() {
                if (this.drawAreaBuilder_ == null) {
                    this.drawArea_ = null;
                    onChanged();
                    return this;
                }
                this.drawArea_ = null;
                this.drawAreaBuilder_ = null;
                return this;
            }

            public Builder clearFactoryActionGraphName() {
                this.factoryActionGraphName_ = GraphResetData.getDefaultInstance().getFactoryActionGraphName();
                onChanged();
                return this;
            }

            public Builder clearFactoryGraphName() {
                this.factoryGraphName_ = GraphResetData.getDefaultInstance().getFactoryGraphName();
                onChanged();
                return this;
            }

            public Builder clearGraphConfig() {
                if (this.graphConfigBuilder_ == null) {
                    this.graphConfig_ = null;
                    onChanged();
                    return this;
                }
                this.graphConfig_ = null;
                this.graphConfigBuilder_ = null;
                return this;
            }

            public Builder clearModeConfig() {
                this.modeConfig_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ActionFactory getAction() {
                SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionFactory) singleFieldBuilderV3.getMessage();
                }
                ActionFactory actionFactory = this.action_;
                return actionFactory == null ? ActionFactory.getDefaultInstance() : actionFactory;
            }

            public ActionFactory.Builder getActionBuilder() {
                onChanged();
                return (ActionFactory.Builder) getActionFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ActionFactoryOrBuilder getActionOrBuilder() {
                SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionFactoryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActionFactory actionFactory = this.action_;
                return actionFactory == null ? ActionFactory.getDefaultInstance() : actionFactory;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public int getBackgroundColor() {
                return this.backgroundColor_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyDrawBoard.internal_static_GraphResetData_descriptor;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public DrawArea getDrawArea() {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DrawArea) singleFieldBuilderV3.getMessage();
                }
                DrawArea drawArea = this.drawArea_;
                return drawArea == null ? DrawArea.getDefaultInstance() : drawArea;
            }

            public DrawArea.Builder getDrawAreaBuilder() {
                onChanged();
                return (DrawArea.Builder) getDrawAreaFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public DrawAreaOrBuilder getDrawAreaOrBuilder() {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DrawAreaOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DrawArea drawArea = this.drawArea_;
                return drawArea == null ? DrawArea.getDefaultInstance() : drawArea;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public String getFactoryActionGraphName() {
                Object obj = this.factoryActionGraphName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.factoryActionGraphName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ByteString getFactoryActionGraphNameBytes() {
                Object obj = this.factoryActionGraphName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.factoryActionGraphName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public String getFactoryGraphName() {
                Object obj = this.factoryGraphName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.factoryGraphName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ByteString getFactoryGraphNameBytes() {
                Object obj = this.factoryGraphName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.factoryGraphName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ActionGraphConfig.GraphConfig getGraphConfig() {
                SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> singleFieldBuilderV3 = this.graphConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionGraphConfig.GraphConfig) singleFieldBuilderV3.getMessage();
                }
                ActionGraphConfig.GraphConfig graphConfig = this.graphConfig_;
                return graphConfig == null ? ActionGraphConfig.GraphConfig.getDefaultInstance() : graphConfig;
            }

            public ActionGraphConfig.GraphConfig.Builder getGraphConfigBuilder() {
                onChanged();
                return (ActionGraphConfig.GraphConfig.Builder) getGraphConfigFieldBuilder().getBuilder();
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ActionGraphConfig.GraphConfigOrBuilder getGraphConfigOrBuilder() {
                SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> singleFieldBuilderV3 = this.graphConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionGraphConfig.GraphConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActionGraphConfig.GraphConfig graphConfig = this.graphConfig_;
                return graphConfig == null ? ActionGraphConfig.GraphConfig.getDefaultInstance() : graphConfig;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public ActionModeConfig.Mode getModeConfig() {
                ActionModeConfig.Mode modeValueOf = ActionModeConfig.Mode.valueOf(this.modeConfig_);
                return modeValueOf == null ? ActionModeConfig.Mode.UNRECOGNIZED : modeValueOf;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public int getModeConfigValue() {
                return this.modeConfig_;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public boolean hasAction() {
                return (this.actionBuilder_ == null && this.action_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public boolean hasDrawArea() {
                return (this.drawAreaBuilder_ == null && this.drawArea_ == null) ? false : true;
            }

            @Override // com.zykj.sketch.EzyDrawBoard.GraphResetDataOrBuilder
            public boolean hasGraphConfig() {
                return (this.graphConfigBuilder_ == null && this.graphConfig_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyDrawBoard.internal_static_GraphResetData_fieldAccessorTable.ensureFieldAccessorsInitialized(GraphResetData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAction(ActionFactory actionFactory) {
                SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(actionFactory);
                    return this;
                }
                ActionFactory actionFactory2 = this.action_;
                if (actionFactory2 != null) {
                    this.action_ = ActionFactory.newBuilder(actionFactory2).mergeFrom(actionFactory).buildPartial();
                } else {
                    this.action_ = actionFactory;
                }
                onChanged();
                return this;
            }

            public Builder mergeDrawArea(DrawArea drawArea) {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(drawArea);
                    return this;
                }
                DrawArea drawArea2 = this.drawArea_;
                if (drawArea2 != null) {
                    this.drawArea_ = DrawArea.newBuilder(drawArea2).mergeFrom(drawArea).buildPartial();
                } else {
                    this.drawArea_ = drawArea;
                }
                onChanged();
                return this;
            }

            public Builder mergeGraphConfig(ActionGraphConfig.GraphConfig graphConfig) {
                SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> singleFieldBuilderV3 = this.graphConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphConfig);
                    return this;
                }
                ActionGraphConfig.GraphConfig graphConfig2 = this.graphConfig_;
                if (graphConfig2 != null) {
                    this.graphConfig_ = ActionGraphConfig.GraphConfig.newBuilder(graphConfig2).mergeFrom(graphConfig).buildPartial();
                } else {
                    this.graphConfig_ = graphConfig;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public Builder setAction(ActionFactory actionFactory) {
                SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(actionFactory);
                    return this;
                }
                actionFactory.getClass();
                this.action_ = actionFactory;
                onChanged();
                return this;
            }

            public Builder setBackgroundColor(int i10) {
                this.backgroundColor_ = i10;
                onChanged();
                return this;
            }

            public Builder setDrawArea(DrawArea drawArea) {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(drawArea);
                    return this;
                }
                drawArea.getClass();
                this.drawArea_ = drawArea;
                onChanged();
                return this;
            }

            public Builder setFactoryActionGraphName(String str) {
                str.getClass();
                this.factoryActionGraphName_ = str;
                onChanged();
                return this;
            }

            public Builder setFactoryActionGraphNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.factoryActionGraphName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFactoryGraphName(String str) {
                str.getClass();
                this.factoryGraphName_ = str;
                onChanged();
                return this;
            }

            public Builder setFactoryGraphNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.factoryGraphName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGraphConfig(ActionGraphConfig.GraphConfig graphConfig) {
                SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> singleFieldBuilderV3 = this.graphConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(graphConfig);
                    return this;
                }
                graphConfig.getClass();
                this.graphConfig_ = graphConfig;
                onChanged();
                return this;
            }

            public Builder setModeConfig(ActionModeConfig.Mode mode) {
                mode.getClass();
                this.modeConfig_ = mode.getNumber();
                onChanged();
                return this;
            }

            public Builder setModeConfigValue(int i10) {
                this.modeConfig_ = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            private Builder() {
                this.factoryGraphName_ = "";
                this.factoryActionGraphName_ = "";
                this.action_ = null;
                this.graphConfig_ = null;
                this.modeConfig_ = 0;
                this.drawArea_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GraphResetData build() {
                GraphResetData graphResetDataBuildPartial = buildPartial();
                if (graphResetDataBuildPartial.isInitialized()) {
                    return graphResetDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphResetDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GraphResetData buildPartial() {
                GraphResetData graphResetData = new GraphResetData(this);
                graphResetData.factoryGraphName_ = this.factoryGraphName_;
                graphResetData.factoryActionGraphName_ = this.factoryActionGraphName_;
                SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    graphResetData.action_ = this.action_;
                } else {
                    graphResetData.action_ = (ActionFactory) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> singleFieldBuilderV32 = this.graphConfigBuilder_;
                if (singleFieldBuilderV32 == null) {
                    graphResetData.graphConfig_ = this.graphConfig_;
                } else {
                    graphResetData.graphConfig_ = (ActionGraphConfig.GraphConfig) singleFieldBuilderV32.build();
                }
                graphResetData.modeConfig_ = this.modeConfig_;
                graphResetData.backgroundColor_ = this.backgroundColor_;
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV33 = this.drawAreaBuilder_;
                if (singleFieldBuilderV33 == null) {
                    graphResetData.drawArea_ = this.drawArea_;
                } else {
                    graphResetData.drawArea_ = (DrawArea) singleFieldBuilderV33.build();
                }
                onBuilt();
                return graphResetData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GraphResetData getDefaultInstanceForType() {
                return GraphResetData.getDefaultInstance();
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
                this.factoryGraphName_ = "";
                this.factoryActionGraphName_ = "";
                if (this.actionBuilder_ == null) {
                    this.action_ = null;
                } else {
                    this.action_ = null;
                    this.actionBuilder_ = null;
                }
                if (this.graphConfigBuilder_ == null) {
                    this.graphConfig_ = null;
                } else {
                    this.graphConfig_ = null;
                    this.graphConfigBuilder_ = null;
                }
                this.modeConfig_ = 0;
                this.backgroundColor_ = 0;
                if (this.drawAreaBuilder_ == null) {
                    this.drawArea_ = null;
                    return this;
                }
                this.drawArea_ = null;
                this.drawAreaBuilder_ = null;
                return this;
            }

            public Builder setAction(ActionFactory.Builder builder) {
                SingleFieldBuilderV3<ActionFactory, ActionFactory.Builder, ActionFactoryOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.action_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setDrawArea(DrawArea.Builder builder) {
                SingleFieldBuilderV3<DrawArea, DrawArea.Builder, DrawAreaOrBuilder> singleFieldBuilderV3 = this.drawAreaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.drawArea_ = builder.build();
                    onChanged();
                    return this;
                }
                singleFieldBuilderV3.setMessage(builder.build());
                return this;
            }

            public Builder setGraphConfig(ActionGraphConfig.GraphConfig.Builder builder) {
                SingleFieldBuilderV3<ActionGraphConfig.GraphConfig, ActionGraphConfig.GraphConfig.Builder, ActionGraphConfig.GraphConfigOrBuilder> singleFieldBuilderV3 = this.graphConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.graphConfig_ = builder.build();
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
                if (message instanceof GraphResetData) {
                    return mergeFrom((GraphResetData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GraphResetData graphResetData) {
                if (graphResetData == GraphResetData.getDefaultInstance()) {
                    return this;
                }
                if (!graphResetData.getFactoryGraphName().isEmpty()) {
                    this.factoryGraphName_ = graphResetData.factoryGraphName_;
                    onChanged();
                }
                if (!graphResetData.getFactoryActionGraphName().isEmpty()) {
                    this.factoryActionGraphName_ = graphResetData.factoryActionGraphName_;
                    onChanged();
                }
                if (graphResetData.hasAction()) {
                    mergeAction(graphResetData.getAction());
                }
                if (graphResetData.hasGraphConfig()) {
                    mergeGraphConfig(graphResetData.getGraphConfig());
                }
                if (graphResetData.modeConfig_ != 0) {
                    setModeConfigValue(graphResetData.getModeConfigValue());
                }
                if (graphResetData.getBackgroundColor() != 0) {
                    setBackgroundColor(graphResetData.getBackgroundColor());
                }
                if (graphResetData.hasDrawArea()) {
                    mergeDrawArea(graphResetData.getDrawArea());
                }
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.factoryGraphName_ = "";
                this.factoryActionGraphName_ = "";
                this.action_ = null;
                this.graphConfig_ = null;
                this.modeConfig_ = 0;
                this.drawArea_ = null;
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.sketch.EzyDrawBoard.GraphResetData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.sketch.EzyDrawBoard.GraphResetData.access$33900()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.sketch.EzyDrawBoard$GraphResetData r3 = (com.zykj.sketch.EzyDrawBoard.GraphResetData) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                    com.zykj.sketch.EzyDrawBoard$GraphResetData r4 = (com.zykj.sketch.EzyDrawBoard.GraphResetData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.EzyDrawBoard.GraphResetData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.sketch.EzyDrawBoard$GraphResetData$Builder"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard$GraphResetData$Builder.smali:2158
            }
        }

        public static Builder newBuilder(GraphResetData graphResetData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(graphResetData);
        }

        public static GraphResetData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GraphResetData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GraphResetData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GraphResetData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GraphResetData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GraphResetData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GraphResetData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GraphResetData() {
            this.memoizedIsInitialized = (byte) -1;
            this.factoryGraphName_ = "";
            this.factoryActionGraphName_ = "";
            this.modeConfig_ = 0;
            this.backgroundColor_ = 0;
        }

        public static GraphResetData parseFrom(InputStream inputStream) {
            return (GraphResetData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static GraphResetData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GraphResetData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GraphResetData parseFrom(CodedInputStream codedInputStream) {
            return (GraphResetData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private GraphResetData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.factoryGraphName_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 18) {
                                if (tag == 42) {
                                    ActionFactory actionFactory = this.action_;
                                    ActionFactory.Builder builder = actionFactory != null ? actionFactory.toBuilder() : null;
                                    ActionFactory actionFactory2 = (ActionFactory) codedInputStream.readMessage(ActionFactory.parser(), extensionRegistryLite);
                                    this.action_ = actionFactory2;
                                    if (builder != null) {
                                        builder.mergeFrom(actionFactory2);
                                        this.action_ = builder.buildPartial();
                                    }
                                } else if (tag == 50) {
                                    ActionGraphConfig.GraphConfig graphConfig = this.graphConfig_;
                                    ActionGraphConfig.GraphConfig.Builder builder2 = graphConfig != null ? graphConfig.toBuilder() : null;
                                    ActionGraphConfig.GraphConfig graphConfig2 = (ActionGraphConfig.GraphConfig) codedInputStream.readMessage(ActionGraphConfig.GraphConfig.parser(), extensionRegistryLite);
                                    this.graphConfig_ = graphConfig2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(graphConfig2);
                                        this.graphConfig_ = builder2.buildPartial();
                                    }
                                } else if (tag == 56) {
                                    this.modeConfig_ = codedInputStream.readEnum();
                                } else if (tag == 64) {
                                    this.backgroundColor_ = codedInputStream.readInt32();
                                } else if (tag != 74) {
                                    if (!codedInputStream.skipField(tag)) {
                                    }
                                } else {
                                    DrawArea drawArea = this.drawArea_;
                                    DrawArea.Builder builder3 = drawArea != null ? drawArea.toBuilder() : null;
                                    DrawArea drawArea2 = (DrawArea) codedInputStream.readMessage(DrawArea.parser(), extensionRegistryLite);
                                    this.drawArea_ = drawArea2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(drawArea2);
                                        this.drawArea_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.factoryActionGraphName_ = codedInputStream.readStringRequireUtf8();
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

        public static GraphResetData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GraphResetData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface GraphResetDataOrBuilder extends MessageOrBuilder {
        GraphResetData.ActionFactory getAction();

        GraphResetData.ActionFactoryOrBuilder getActionOrBuilder();

        int getBackgroundColor();

        DrawArea getDrawArea();

        DrawAreaOrBuilder getDrawAreaOrBuilder();

        String getFactoryActionGraphName();

        ByteString getFactoryActionGraphNameBytes();

        String getFactoryGraphName();

        ByteString getFactoryGraphNameBytes();

        ActionGraphConfig.GraphConfig getGraphConfig();

        ActionGraphConfig.GraphConfigOrBuilder getGraphConfigOrBuilder();

        ActionModeConfig.Mode getModeConfig();

        int getModeConfigValue();

        boolean hasAction();

        boolean hasDrawArea();

        boolean hasGraphConfig();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fDrawBoard.proto\u001a\u0019google/protobuf/any.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a\u0019SketchGraphSnapshot.proto\"I\n\tDrawBoard\u0012\u001d\n\tboardHead\u0018\u0001 \u0001(\u000b2\n.BoardHead\u0012\u001d\n\tboardBody\u0018\u0002 \u0001(\u000b2\n.BoardBody\"O\n\u000bDrawBoardV1\u0012\u001d\n\tboardHead\u0018\u0001 \u0001(\u000b2\n.BoardHead\u0012!\n\u000bboardBodyV1\u0018\u0002 \u0001(\u000b2\f.BoardBodyV1\"\u0081\u0001\n\tBoardHead\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0004 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0005 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006author\u0018\u0007 \u0001(\t\u0012\f\n\u0004type\u0018\b \u0001(\u0005\"2\n\tBoard", "Body\u0012%\n\rActionContent\u0018\u0001 \u0003(\u000b2\u000e.ActionContent\":\n\u000bBoardBodyV1\u0012+\n\rActionContent\u0018\u0001 \u0003(\u000b2\u0014.google.protobuf.Any\"\u0097\u0001\n\rActionContent\u0012\u0019\n\u0004type\u0018\u0001 \u0001(\u000e2\u000b.ActionEnum\u0012$\n\u0006action\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.Any\u0012!\n\rgraphSnapshot\u0018\u0003 \u0001(\u000b2\n.GraphData\u0012\"\n\tresetData\u0018\u0005 \u0001(\u000b2\u000f.GraphResetData\"¼\u0003\n\u0010ActionTouchEvent\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007endTime\u0018\u0003 \u0001(\u0003\u00120\n\ntouchEvent\u0018\u0004 \u0003(\u000b2\u001c.ActionTouchEvent.TouchEvent\u001aÃ\u0002\n\nTouchEvent\u0012\u0011\n\teve", "ntTime\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0003 \u0001(\u0005\u0012\u0014\n\fpointerCount\u0018\u0004 \u0001(\u0005\u0012I\n\u0011pointerProperties\u0018\u0005 \u0003(\u000b2..ActionTouchEvent.TouchEvent.PointerProperties\u0012A\n\rpointerCoords\u0018\u0006 \u0003(\u000b2*.ActionTouchEvent.TouchEvent.PointerCoords\u0012\t\n\u0001x\u0018\u000f \u0001(\u0002\u0012\t\n\u0001y\u0018\u0010 \u0001(\u0002\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\btoolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\"\u009e\u0001\n\u0011ActionImageConfig\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004path\u0018\u0003 \u0001(\t\u0012\r\n\u0005width\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0005", " \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0007 \u0001(\u0005\u0012\u0014\n\fpositionFlag\u0018\b \u0001(\u0005\"\u008a\u0001\n\u0013ActionWebViewConfig\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004path\u0018\u0003 \u0001(\t\u0012\r\n\u0005width\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0005 \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0007 \u0001(\u0005\"\u0091\u0001\n\u0011ActionGraphConfig\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012.\n\u0006config\u0018\u0004 \u0001(\u000b2\u001e.ActionGraphConfig.GraphConfig\u001a+\n\u000bGraphConfig\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\"i\n\u0010ActionDrawConfig\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTim", "e\u0018\u0002 \u0001(\u0003\u0012\u0017\n\u000fbackgroundColor\u0018\u0003 \u0001(\u0005\u0012\u001b\n\bdrawArea\u0018\u0004 \u0001(\u000b2\t.DrawArea\"\\\n\bDrawArea\u0012\u001d\n\fleftTopPoint\u0018\u0001 \u0001(\u000b2\u0007.PointF\u0012!\n\u0010rightBottomPoint\u0018\u0002 \u0001(\u000b2\u0007.PointF\u0012\u000e\n\u0006matrix\u0018\u0003 \u0003(\u0002\"º\u0002\n\u0010ActionModeConfig\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012$\n\u0004mode\u0018\u0004 \u0001(\u000e2\u0016.ActionModeConfig.Mode\"Þ\u0001\n\u0004Mode\u0012\u0011\n\rACTION_SELECT\u0010\u0000\u0012\u0012\n\u000eACTION_WRITING\u0010\u0001\u0012\u0017\n\u0013ACTION_SHAPE_CIRCLE\u0010\u0002\u0012\u0015\n\u0011ACTION_SHAPE_RECT\u0010\u0003\u0012\u0016\n\u0012ACTION_ERASER_VIEW\u0010\u0005\u0012\u0019\n\u0015ACTION_ERASER_WRITING\u0010\u0006\u0012\u0011\n\rAC", "TION_DELETE\u0010\u0007\u0012\u0017\n\u0013ACTION_WRITING_MOVE\u0010\b\u0012 \n\u001cACTION_WRITING_MOVE_VERTICAL\u0010\t\"~\n\u0012ActionFitterConfig\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\r\n\u0005scale\u0018\u0003 \u0001(\u0002\u0012\u000f\n\u0007centerX\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007centerY\u0018\u0005 \u0001(\u0005\u0012\n\n\u0002px\u0018\u0006 \u0001(\u0005\u0012\n\n\u0002py\u0018\u0007 \u0001(\u0005\"3\n\u0010ActionClearBoard\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"3\n\u0010ActionPrevAction\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"3\n\u0010ActionNextAction\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"}\n\nActionZoom\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime", "\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0004 \u0001(\u0002\u0012\u000f\n\u0007centerX\u0018\u0005 \u0001(\u0002\u0012\u000f\n\u0007centerY\u0018\u0006 \u0001(\u0002\u0012\f\n\u0004keep\u0018\u0007 \u0001(\b\"\u009c\u0001\n\u0011ActionTranslation\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012+\n\u0006transX\u0018\u0003 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012+\n\u0006transY\u0018\u0004 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012\f\n\u0004keep\u0018\u0005 \u0001(\b\"&\n\u0011ActionResetMatrix\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\"7\n\u0010AudioStartAction\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bfileName\u0018\u0002 \u0001(\t\"6\n\u000fAudioStopAction\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bfileName\u0018\u0002 \u0001(\t\"\u0087", "\u0003\n\u000eGraphResetData\u0012\u0018\n\u0010factoryGraphName\u0018\u0001 \u0001(\t\u0012\u001e\n\u0016factoryActionGraphName\u0018\u0002 \u0001(\t\u0012-\n\u0006action\u0018\u0005 \u0001(\u000b2\u001d.GraphResetData.ActionFactory\u00123\n\u000bgraphConfig\u0018\u0006 \u0001(\u000b2\u001e.ActionGraphConfig.GraphConfig\u0012*\n\nmodeConfig\u0018\u0007 \u0001(\u000e2\u0016.ActionModeConfig.Mode\u0012\u0017\n\u000fbackgroundColor\u0018\b \u0001(\u0005\u0012\u001b\n\bdrawArea\u0018\t \u0001(\u000b2\t.DrawArea\u001au\n\rActionFactory\u0012*\n\nbaseAction\u0018\u0001 \u0001(\u000e2\u0016.ActionModeConfig.Mode\u0012\u0018\n\u0010factoryGraphName\u0018\u0002 \u0001(\t\u0012\u001e\n\u0016factoryActionGraphName\u0018\u0003 \u0001(\t*³\u0002\n\nAct", "ionEnum\u0012\u0010\n\fACTION_TOUCH\u0010\u0000\u0012\u000f\n\u000bACTION_MODE\u0010\u0001\u0012\u0010\n\fACTION_GRAPH\u0010\u0002\u0012\u000e\n\nACTION_WEB\u0010\u0003\u0012\u0010\n\fACTION_IMAGE\u0010\u0004\u0012\u0011\n\rACTION_FILTER\u0010\u0005\u0012\u0016\n\u0012ACTION_CLEAR_BOARD\u0010\u0006\u0012\u000f\n\u000bACTION_NEXT\u0010\u0007\u0012\u000f\n\u000bACTION_PREV\u0010\b\u0012\u0016\n\u0012ACTION_AUDIO_START\u0010\t\u0012\u0015\n\u0011ACTION_AUDIO_STOP\u0010\n\u0012\u000f\n\u000bACTION_ZOOM\u0010\u000b\u0012\u0010\n\fACTION_TRANS\u0010\f\u0012\u0016\n\u0012ACTION_DRAW_CONFIG\u0010\r\u0012\u0017\n\u0013ACTION_RESET_MATRIX\u0010\u000eB\u001f\n\u000fcom.zykj.sketchB\fEzyDrawBoardb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), WrappersProto.getDescriptor(), GraphSnapshot.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zykj.sketch.EzyDrawBoard.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = EzyDrawBoard.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_DrawBoard_descriptor = descriptor2;
        internal_static_DrawBoard_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"BoardHead", "BoardBody"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_DrawBoardV1_descriptor = descriptor3;
        internal_static_DrawBoardV1_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"BoardHead", "BoardBodyV1"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_BoardHead_descriptor = descriptor4;
        internal_static_BoardHead_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Author", "Type"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_BoardBody_descriptor = descriptor5;
        internal_static_BoardBody_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ActionContent"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_BoardBodyV1_descriptor = descriptor6;
        internal_static_BoardBodyV1_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ActionContent"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_ActionContent_descriptor = descriptor7;
        internal_static_ActionContent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Type", "Action", "GraphSnapshot", "ResetData"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_ActionTouchEvent_descriptor = descriptor8;
        internal_static_ActionTouchEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Type", "StartTime", "EndTime", "TouchEvent"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_ActionTouchEvent_TouchEvent_descriptor = descriptor9;
        internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"EventTime", "Action", "PointerCount", "PointerProperties", "PointerCoords", "X", "Y"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f19895x13f7163 = descriptor10;
        f19896x12484e1 = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Id", "ToolType"});
        Descriptors.Descriptor descriptor11 = descriptor9.getNestedTypes().get(1);
        f19893x749fdd98 = descriptor11;
        f19894xa583ec16 = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(7);
        internal_static_ActionImageConfig_descriptor = descriptor12;
        internal_static_ActionImageConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Type", "StartTime", "Path", "Width", "Height", "ViewWidth", "ViewHeight", "PositionFlag"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(8);
        internal_static_ActionWebViewConfig_descriptor = descriptor13;
        internal_static_ActionWebViewConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Type", "StartTime", "Path", "Width", "Height", "ViewWidth", "ViewHeight"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(9);
        internal_static_ActionGraphConfig_descriptor = descriptor14;
        internal_static_ActionGraphConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Type", "StartTime", Config.TAG});
        Descriptors.Descriptor descriptor15 = descriptor14.getNestedTypes().get(0);
        internal_static_ActionGraphConfig_GraphConfig_descriptor = descriptor15;
        internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Width", "Color"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(10);
        internal_static_ActionDrawConfig_descriptor = descriptor16;
        internal_static_ActionDrawConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Type", "StartTime", "BackgroundColor", "DrawArea"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(11);
        internal_static_DrawArea_descriptor = descriptor17;
        internal_static_DrawArea_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"LeftTopPoint", "RightBottomPoint", "Matrix"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(12);
        internal_static_ActionModeConfig_descriptor = descriptor18;
        internal_static_ActionModeConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Type", "StartTime", "Mode"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(13);
        internal_static_ActionFitterConfig_descriptor = descriptor19;
        internal_static_ActionFitterConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Type", "StartTime", "Scale", "CenterX", "CenterY", "Px", "Py"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(14);
        internal_static_ActionClearBoard_descriptor = descriptor20;
        internal_static_ActionClearBoard_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Type", "StartTime"});
        Descriptors.Descriptor descriptor21 = getDescriptor().getMessageTypes().get(15);
        internal_static_ActionPrevAction_descriptor = descriptor21;
        internal_static_ActionPrevAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Type", "StartTime"});
        Descriptors.Descriptor descriptor22 = getDescriptor().getMessageTypes().get(16);
        internal_static_ActionNextAction_descriptor = descriptor22;
        internal_static_ActionNextAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Type", "StartTime"});
        Descriptors.Descriptor descriptor23 = getDescriptor().getMessageTypes().get(17);
        internal_static_ActionZoom_descriptor = descriptor23;
        internal_static_ActionZoom_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Type", "StartTime", "ScaleX", "ScaleY", "CenterX", "CenterY", "Keep"});
        Descriptors.Descriptor descriptor24 = getDescriptor().getMessageTypes().get(18);
        internal_static_ActionTranslation_descriptor = descriptor24;
        internal_static_ActionTranslation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Type", "StartTime", "TransX", "TransY", "Keep"});
        Descriptors.Descriptor descriptor25 = getDescriptor().getMessageTypes().get(19);
        internal_static_ActionResetMatrix_descriptor = descriptor25;
        internal_static_ActionResetMatrix_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"StartTime"});
        Descriptors.Descriptor descriptor26 = getDescriptor().getMessageTypes().get(20);
        internal_static_AudioStartAction_descriptor = descriptor26;
        internal_static_AudioStartAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"StartTime", "FileName"});
        Descriptors.Descriptor descriptor27 = getDescriptor().getMessageTypes().get(21);
        internal_static_AudioStopAction_descriptor = descriptor27;
        internal_static_AudioStopAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"StartTime", "FileName"});
        Descriptors.Descriptor descriptor28 = getDescriptor().getMessageTypes().get(22);
        internal_static_GraphResetData_descriptor = descriptor28;
        internal_static_GraphResetData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"FactoryGraphName", "FactoryActionGraphName", "Action", "GraphConfig", "ModeConfig", "BackgroundColor", "DrawArea"});
        Descriptors.Descriptor descriptor29 = descriptor28.getNestedTypes().get(0);
        internal_static_GraphResetData_ActionFactory_descriptor = descriptor29;
        internal_static_GraphResetData_ActionFactory_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"BaseAction", "FactoryGraphName", "FactoryActionGraphName"});
        AnyProto.getDescriptor();
        WrappersProto.getDescriptor();
        GraphSnapshot.getDescriptor();
    }

    private EzyDrawBoard() {
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

package com.zykj.board;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyCommand$CommandSource;
import p020b4.AbstractC3126f;
import p020b4.C3116b1;

/* renamed from: com.zykj.board.q */
/* loaded from: classes3.dex */
public final class C4386q extends GeneratedMessageV3.Builder implements InterfaceC4388r {

    /* renamed from: a */
    public int f5555a;

    /* renamed from: d */
    public EzyRectF$RectF f5558d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5559e;

    /* renamed from: h */
    public int f5562h;

    /* renamed from: b */
    public int f5556b = 0;

    /* renamed from: c */
    public Object f5557c = "";

    /* renamed from: f */
    public Object f5560f = "";

    /* renamed from: g */
    public Object f5561g = "";

    /* renamed from: i */
    public Object f5563i = "";

    public C4386q() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3808g();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4386q) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.GraphData build() {
        EzyCommand$CommandSource.CommandInfo.GraphData graphDataBuildPartial = buildPartial();
        if (graphDataBuildPartial.isInitialized()) {
            return graphDataBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphDataBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3807f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4386q) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4386q) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4386q) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.GraphData buildPartial() {
        int i;
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = new EzyCommand$CommandSource.CommandInfo.GraphData(this, null);
        int i8 = this.f5555a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                graphData.graphEnum_ = this.f5556b;
            }
            if ((i8 & 2) != 0) {
                graphData.graphId_ = this.f5557c;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5559e;
                graphData.outRect_ = singleFieldBuilderV3 == null ? this.f5558d : (EzyRectF$RectF) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                graphData.parentGraphId_ = this.f5560f;
            }
            if ((i8 & 16) != 0) {
                graphData.sourceFileName_ = this.f5561g;
            }
            if ((i8 & 32) != 0) {
                graphData.sourceId_ = this.f5562h;
            }
            if ((i8 & 64) != 0) {
                graphData.extras_ = this.f5563i;
            }
            EzyCommand$CommandSource.CommandInfo.GraphData.access$1776(graphData, i);
        }
        onBuilt();
        return graphData;
    }

    /* renamed from: f */
    public final void m3807f() {
        super.clear();
        this.f5555a = 0;
        this.f5556b = 0;
        this.f5557c = "";
        this.f5558d = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5559e;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5559e = null;
        }
        this.f5560f = "";
        this.f5561g = "";
        this.f5562h = 0;
        this.f5563i = "";
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3808g() {
        EzyRectF$RectF defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5559e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5558d;
                if (defaultInstance == null) {
                    defaultInstance = EzyRectF$RectF.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyRectF$RectF) singleFieldBuilderV3.getMessage();
            }
            this.f5559e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5558d = null;
        }
        return this.f5559e;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.GraphData.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1585e;
    }

    /* renamed from: h */
    public final void m3809h(EzyCommand$CommandSource.CommandInfo.GraphData graphData) {
        EzyRectF$RectF ezyRectF$RectF;
        if (graphData == EzyCommand$CommandSource.CommandInfo.GraphData.getDefaultInstance()) {
            return;
        }
        if (graphData.graphEnum_ != 0) {
            this.f5556b = graphData.getGraphEnumValue();
            this.f5555a |= 1;
            onChanged();
        }
        if (!graphData.getGraphId().isEmpty()) {
            this.f5557c = graphData.graphId_;
            this.f5555a |= 2;
            onChanged();
        }
        if (graphData.hasOutRect()) {
            EzyRectF$RectF outRect = graphData.getOutRect();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5559e;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(outRect);
            } else if ((this.f5555a & 4) == 0 || (ezyRectF$RectF = this.f5558d) == null || ezyRectF$RectF == EzyRectF$RectF.getDefaultInstance()) {
                this.f5558d = outRect;
            } else {
                this.f5555a |= 4;
                onChanged();
                ((C3116b1) m3808g().getBuilder()).m2088g(outRect);
            }
            if (this.f5558d != null) {
                this.f5555a |= 4;
                onChanged();
            }
        }
        if (!graphData.getParentGraphId().isEmpty()) {
            this.f5560f = graphData.parentGraphId_;
            this.f5555a |= 8;
            onChanged();
        }
        if (!graphData.getSourceFileName().isEmpty()) {
            this.f5561g = graphData.sourceFileName_;
            this.f5555a |= 16;
            onChanged();
        }
        if (graphData.getSourceId() != 0) {
            m3816o(graphData.getSourceId());
        }
        if (!graphData.getExtras().isEmpty()) {
            this.f5563i = graphData.extras_;
            this.f5555a |= 64;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3810i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.f5556b = codedInputStream.readEnum();
                            this.f5555a |= 1;
                        } else if (tag == 18) {
                            this.f5557c = codedInputStream.readStringRequireUtf8();
                            this.f5555a |= 2;
                        } else if (tag == 26) {
                            codedInputStream.readMessage(m3808g().getBuilder(), extensionRegistryLite);
                            this.f5555a |= 4;
                        } else if (tag == 34) {
                            this.f5560f = codedInputStream.readStringRequireUtf8();
                            this.f5555a |= 8;
                        } else if (tag == 42) {
                            this.f5561g = codedInputStream.readStringRequireUtf8();
                            this.f5555a |= 16;
                        } else if (tag == 48) {
                            this.f5562h = codedInputStream.readInt32();
                            this.f5555a |= 32;
                        } else if (tag == 58) {
                            this.f5563i = codedInputStream.readStringRequireUtf8();
                            this.f5555a |= 64;
                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                        }
                    }
                    z8 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.unwrapIOException();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3126f.f1586f.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.GraphData.class, C4386q.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m3811j(EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum) {
        ezyGraphEnum$GraphEnum.getClass();
        this.f5555a |= 1;
        this.f5556b = ezyGraphEnum$GraphEnum.getNumber();
        onChanged();
    }

    /* renamed from: k */
    public final void m3812k(String str) {
        str.getClass();
        this.f5557c = str;
        this.f5555a |= 2;
        onChanged();
    }

    /* renamed from: l */
    public final void m3813l(EzyRectF$RectF ezyRectF$RectF) {
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5559e;
        if (singleFieldBuilderV3 == null) {
            ezyRectF$RectF.getClass();
            this.f5558d = ezyRectF$RectF;
        } else {
            singleFieldBuilderV3.setMessage(ezyRectF$RectF);
        }
        this.f5555a |= 4;
        onChanged();
    }

    /* renamed from: m */
    public final void m3814m(String str) {
        str.getClass();
        this.f5560f = str;
        this.f5555a |= 8;
        onChanged();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3810i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4386q) super.mergeUnknownFields(unknownFieldSet);
    }

    /* renamed from: n */
    public final void m3815n(String str) {
        str.getClass();
        this.f5561g = str;
        this.f5555a |= 16;
        onChanged();
    }

    /* renamed from: o */
    public final void m3816o(int i) {
        this.f5562h = i;
        this.f5555a |= 32;
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4386q) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4386q) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4386q) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4386q) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3807f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4386q) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4386q) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4386q) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.GraphData.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3810i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4386q) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4386q) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4386q) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4386q) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3807f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4386q) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4386q) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3810i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4386q) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3807f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4386q) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3810i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4386q) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.GraphData) {
            m3809h((EzyCommand$CommandSource.CommandInfo.GraphData) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4386q) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.GraphData) {
            m3809h((EzyCommand$CommandSource.CommandInfo.GraphData) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

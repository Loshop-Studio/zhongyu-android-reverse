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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyCommand$CommandSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3126f;
import p020b4.C3115b0;

/* renamed from: com.zykj.board.t */
/* loaded from: classes3.dex */
public final class C4392t extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5570a;

    /* renamed from: c */
    public RepeatedFieldBuilderV3 f5572c;

    /* renamed from: d */
    public EzyMatrix$Matrix f5573d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5574e;

    /* renamed from: f */
    public EzyMatrix$Matrix f5575f;

    /* renamed from: g */
    public SingleFieldBuilderV3 f5576g;

    /* renamed from: i */
    public int f5578i;

    /* renamed from: b */
    public List f5571b = Collections.EMPTY_LIST;

    /* renamed from: h */
    public Object f5577h = "";

    public C4392t() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3830g();
            m3832i();
            m3831h();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4392t) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyCommand$CommandSource.CommandInfo.GraphMatrix graphMatrixBuildPartial = buildPartial();
        if (graphMatrixBuildPartial.isInitialized()) {
            return graphMatrixBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphMatrixBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.GraphMatrix buildPartial() {
        EzyCommand$CommandSource.CommandInfo.GraphMatrix graphMatrix = new EzyCommand$CommandSource.CommandInfo.GraphMatrix(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5572c;
        int i = 1;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5570a & 1) != 0) {
                this.f5571b = Collections.unmodifiableList(this.f5571b);
                this.f5570a &= -2;
            }
            graphMatrix.graphData_ = this.f5571b;
        } else {
            graphMatrix.graphData_ = repeatedFieldBuilderV3.build();
        }
        int i8 = this.f5570a;
        if (i8 != 0) {
            if ((i8 & 2) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5574e;
                graphMatrix.originMatrix_ = singleFieldBuilderV3 == null ? this.f5573d : (EzyMatrix$Matrix) singleFieldBuilderV3.build();
            } else {
                i = 0;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5576g;
                graphMatrix.lastMatrix_ = singleFieldBuilderV32 == null ? this.f5575f : (EzyMatrix$Matrix) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i8 & 8) != 0) {
                graphMatrix.sourceFileName_ = this.f5577h;
            }
            if ((i8 & 16) != 0) {
                graphMatrix.sourceId_ = this.f5578i;
            }
            EzyCommand$CommandSource.CommandInfo.GraphMatrix.access$4076(graphMatrix, i);
        }
        onBuilt();
        return graphMatrix;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3828e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4392t) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4392t) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4392t) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3828e() {
        super.clear();
        this.f5570a = 0;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5572c;
        if (repeatedFieldBuilderV3 == null) {
            this.f5571b = Collections.EMPTY_LIST;
        } else {
            this.f5571b = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5570a &= -2;
        this.f5573d = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5574e;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5574e = null;
        }
        this.f5575f = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5576g;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5576g = null;
        }
        this.f5577h = "";
        this.f5578i = 0;
    }

    /* renamed from: f */
    public final void m3829f() {
        if ((this.f5570a & 1) == 0) {
            this.f5571b = new ArrayList(this.f5571b);
            this.f5570a |= 1;
        }
    }

    /* renamed from: g */
    public final RepeatedFieldBuilderV3 m3830g() {
        if (this.f5572c == null) {
            this.f5572c = new RepeatedFieldBuilderV3(this.f5571b, (this.f5570a & 1) != 0, getParentForChildren(), isClean());
            this.f5571b = null;
        }
        return this.f5572c;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.GraphMatrix.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1589i;
    }

    /* renamed from: h */
    public final SingleFieldBuilderV3 m3831h() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5576g;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5575f;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5576g = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5575f = null;
        }
        return this.f5576g;
    }

    /* renamed from: i */
    public final SingleFieldBuilderV3 m3832i() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5574e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5573d;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5574e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5573d = null;
        }
        return this.f5574e;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3126f.f1590j.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.GraphMatrix.class, C4392t.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m3833j(EzyCommand$CommandSource.CommandInfo.GraphMatrix graphMatrix) {
        EzyMatrix$Matrix ezyMatrix$Matrix;
        EzyMatrix$Matrix ezyMatrix$Matrix2;
        if (graphMatrix == EzyCommand$CommandSource.CommandInfo.GraphMatrix.getDefaultInstance()) {
            return;
        }
        if (this.f5572c == null) {
            if (!graphMatrix.graphData_.isEmpty()) {
                if (this.f5571b.isEmpty()) {
                    this.f5571b = graphMatrix.graphData_;
                    this.f5570a &= -2;
                } else {
                    m3829f();
                    this.f5571b.addAll(graphMatrix.graphData_);
                }
                onChanged();
            }
        } else if (!graphMatrix.graphData_.isEmpty()) {
            if (this.f5572c.isEmpty()) {
                this.f5572c.dispose();
                this.f5572c = null;
                this.f5571b = graphMatrix.graphData_;
                this.f5570a &= -2;
                this.f5572c = GeneratedMessageV3.alwaysUseFieldBuilders ? m3830g() : null;
            } else {
                this.f5572c.addAllMessages(graphMatrix.graphData_);
            }
        }
        if (graphMatrix.hasOriginMatrix()) {
            EzyMatrix$Matrix originMatrix = graphMatrix.getOriginMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5574e;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(originMatrix);
            } else if ((this.f5570a & 2) == 0 || (ezyMatrix$Matrix2 = this.f5573d) == null || ezyMatrix$Matrix2 == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5573d = originMatrix;
            } else {
                this.f5570a |= 2;
                onChanged();
                ((C3115b0) m3832i().getBuilder()).m2073g(originMatrix);
            }
            if (this.f5573d != null) {
                this.f5570a |= 2;
                onChanged();
            }
        }
        if (graphMatrix.hasLastMatrix()) {
            EzyMatrix$Matrix lastMatrix = graphMatrix.getLastMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5576g;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(lastMatrix);
            } else if ((this.f5570a & 4) == 0 || (ezyMatrix$Matrix = this.f5575f) == null || ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5575f = lastMatrix;
            } else {
                this.f5570a |= 4;
                onChanged();
                ((C3115b0) m3831h().getBuilder()).m2073g(lastMatrix);
            }
            if (this.f5575f != null) {
                this.f5570a |= 4;
                onChanged();
            }
        }
        if (!graphMatrix.getSourceFileName().isEmpty()) {
            this.f5577h = graphMatrix.sourceFileName_;
            this.f5570a |= 8;
            onChanged();
        }
        if (graphMatrix.getSourceId() != 0) {
            this.f5578i = graphMatrix.getSourceId();
            this.f5570a |= 16;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: k */
    public final void m3834k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            EzyCommand$CommandSource.CommandInfo.GraphData graphData = (EzyCommand$CommandSource.CommandInfo.GraphData) codedInputStream.readMessage(EzyCommand$CommandSource.CommandInfo.GraphData.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5572c;
                            if (repeatedFieldBuilderV3 == null) {
                                m3829f();
                                this.f5571b.add(graphData);
                            } else {
                                repeatedFieldBuilderV3.addMessage(graphData);
                            }
                        } else if (tag == 18) {
                            codedInputStream.readMessage(m3832i().getBuilder(), extensionRegistryLite);
                            this.f5570a |= 2;
                        } else if (tag == 26) {
                            codedInputStream.readMessage(m3831h().getBuilder(), extensionRegistryLite);
                            this.f5570a |= 4;
                        } else if (tag == 34) {
                            this.f5577h = codedInputStream.readStringRequireUtf8();
                            this.f5570a |= 8;
                        } else if (tag == 40) {
                            this.f5578i = codedInputStream.readInt32();
                            this.f5570a |= 16;
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

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3834k(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4392t) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4392t) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4392t) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4392t) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4392t) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3828e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4392t) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4392t) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4392t) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.GraphMatrix.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3834k(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4392t) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4392t) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4392t) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4392t) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3828e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4392t) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4392t) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3834k(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4392t) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyCommand$CommandSource.CommandInfo.GraphMatrix graphMatrixBuildPartial = buildPartial();
        if (graphMatrixBuildPartial.isInitialized()) {
            return graphMatrixBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphMatrixBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3828e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4392t) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3834k(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4392t) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.GraphMatrix) {
            m3833j((EzyCommand$CommandSource.CommandInfo.GraphMatrix) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4392t) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.GraphMatrix) {
            m3833j((EzyCommand$CommandSource.CommandInfo.GraphMatrix) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

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
import p020b4.C3116b1;
import p020b4.C3157p0;

/* renamed from: com.zykj.board.o */
/* loaded from: classes3.dex */
public final class C4382o extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5539a;

    /* renamed from: d */
    public EzyRectF$RectF f5542d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5543e;

    /* renamed from: g */
    public EzyPaint$Paint f5545g;

    /* renamed from: h */
    public SingleFieldBuilderV3 f5546h;

    /* renamed from: j */
    public RepeatedFieldBuilderV3 f5548j;

    /* renamed from: k */
    public EzyMatrix$Matrix f5549k;

    /* renamed from: l */
    public SingleFieldBuilderV3 f5550l;

    /* renamed from: b */
    public Object f5540b = "";

    /* renamed from: c */
    public int f5541c = 0;

    /* renamed from: f */
    public Object f5544f = "";

    /* renamed from: i */
    public List f5547i = Collections.EMPTY_LIST;

    /* renamed from: m */
    public Object f5551m = "";

    public C4382o() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            getOutRectFieldBuilder();
            m3796f();
            getPointsFieldBuilder();
            m3797g();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4382o) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyCommand$CommandSource.CommandInfo.GraphChange graphChangeBuildPartial = buildPartial();
        if (graphChangeBuildPartial.isInitialized()) {
            return graphChangeBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphChangeBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.GraphChange buildPartial() {
        int i;
        EzyCommand$CommandSource.CommandInfo.GraphChange graphChange = new EzyCommand$CommandSource.CommandInfo.GraphChange(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5548j;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5539a & 32) != 0) {
                this.f5547i = Collections.unmodifiableList(this.f5547i);
                this.f5539a &= -33;
            }
            graphChange.points_ = this.f5547i;
        } else {
            graphChange.points_ = repeatedFieldBuilderV3.build();
        }
        int i8 = this.f5539a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                graphChange.graphId_ = this.f5540b;
            }
            if ((i8 & 2) != 0) {
                graphChange.graphEnum_ = this.f5541c;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5543e;
                graphChange.outRect_ = singleFieldBuilderV3 == null ? this.f5542d : (EzyRectF$RectF) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                graphChange.content_ = this.f5544f;
            }
            if ((i8 & 16) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5546h;
                graphChange.paint_ = singleFieldBuilderV32 == null ? this.f5545g : (EzyPaint$Paint) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i8 & 64) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f5550l;
                graphChange.renderMatrix_ = singleFieldBuilderV33 == null ? this.f5549k : (EzyMatrix$Matrix) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i8 & 128) != 0) {
                graphChange.filePath_ = this.f5551m;
            }
            EzyCommand$CommandSource.CommandInfo.GraphChange.access$5776(graphChange, i);
        }
        onBuilt();
        return graphChange;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3795e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4382o) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4382o) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4382o) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3795e() {
        super.clear();
        this.f5539a = 0;
        this.f5540b = "";
        this.f5541c = 0;
        this.f5542d = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5543e;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5543e = null;
        }
        this.f5544f = "";
        this.f5545g = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5546h;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5546h = null;
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5548j;
        if (repeatedFieldBuilderV3 == null) {
            this.f5547i = Collections.EMPTY_LIST;
        } else {
            this.f5547i = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5539a &= -33;
        this.f5549k = null;
        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f5550l;
        if (singleFieldBuilderV33 != null) {
            singleFieldBuilderV33.dispose();
            this.f5550l = null;
        }
        this.f5551m = "";
    }

    public final void ensurePointsIsMutable() {
        if ((this.f5539a & 32) == 0) {
            this.f5547i = new ArrayList(this.f5547i);
            this.f5539a |= 32;
        }
    }

    /* renamed from: f */
    public final SingleFieldBuilderV3 m3796f() {
        EzyPaint$Paint defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5546h;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5545g;
                if (defaultInstance == null) {
                    defaultInstance = EzyPaint$Paint.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyPaint$Paint) singleFieldBuilderV3.getMessage();
            }
            this.f5546h = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5545g = null;
        }
        return this.f5546h;
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3797g() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5550l;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5549k;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5550l = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5549k = null;
        }
        return this.f5550l;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.GraphChange.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1591k;
    }

    public final SingleFieldBuilderV3 getOutRectFieldBuilder() {
        EzyRectF$RectF defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5543e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5542d;
                if (defaultInstance == null) {
                    defaultInstance = EzyRectF$RectF.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyRectF$RectF) singleFieldBuilderV3.getMessage();
            }
            this.f5543e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5542d = null;
        }
        return this.f5543e;
    }

    public final RepeatedFieldBuilderV3 getPointsFieldBuilder() {
        if (this.f5548j == null) {
            this.f5548j = new RepeatedFieldBuilderV3(this.f5547i, (this.f5539a & 32) != 0, getParentForChildren(), isClean());
            this.f5547i = null;
        }
        return this.f5548j;
    }

    /* renamed from: h */
    public final void m3798h(EzyCommand$CommandSource.CommandInfo.GraphChange graphChange) {
        EzyMatrix$Matrix ezyMatrix$Matrix;
        EzyPaint$Paint ezyPaint$Paint;
        EzyRectF$RectF ezyRectF$RectF;
        if (graphChange == EzyCommand$CommandSource.CommandInfo.GraphChange.getDefaultInstance()) {
            return;
        }
        if (!graphChange.getGraphId().isEmpty()) {
            this.f5540b = graphChange.graphId_;
            this.f5539a |= 1;
            onChanged();
        }
        if (graphChange.graphEnum_ != 0) {
            this.f5541c = graphChange.getGraphEnumValue();
            this.f5539a |= 2;
            onChanged();
        }
        if (graphChange.hasOutRect()) {
            EzyRectF$RectF outRect = graphChange.getOutRect();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5543e;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(outRect);
            } else if ((this.f5539a & 4) == 0 || (ezyRectF$RectF = this.f5542d) == null || ezyRectF$RectF == EzyRectF$RectF.getDefaultInstance()) {
                this.f5542d = outRect;
            } else {
                this.f5539a |= 4;
                onChanged();
                ((C3116b1) getOutRectFieldBuilder().getBuilder()).m2088g(outRect);
            }
            if (this.f5542d != null) {
                this.f5539a |= 4;
                onChanged();
            }
        }
        if (!graphChange.getContent().isEmpty()) {
            this.f5544f = graphChange.content_;
            this.f5539a |= 8;
            onChanged();
        }
        if (graphChange.hasPaint()) {
            EzyPaint$Paint paint = graphChange.getPaint();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5546h;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(paint);
            } else if ((this.f5539a & 16) == 0 || (ezyPaint$Paint = this.f5545g) == null || ezyPaint$Paint == EzyPaint$Paint.getDefaultInstance()) {
                this.f5545g = paint;
            } else {
                this.f5539a |= 16;
                onChanged();
                ((C3157p0) m3796f().getBuilder()).m2101g(paint);
            }
            if (this.f5545g != null) {
                this.f5539a |= 16;
                onChanged();
            }
        }
        if (this.f5548j == null) {
            if (!graphChange.points_.isEmpty()) {
                if (this.f5547i.isEmpty()) {
                    this.f5547i = graphChange.points_;
                    this.f5539a &= -33;
                } else {
                    ensurePointsIsMutable();
                    this.f5547i.addAll(graphChange.points_);
                }
                onChanged();
            }
        } else if (!graphChange.points_.isEmpty()) {
            if (this.f5548j.isEmpty()) {
                this.f5548j.dispose();
                this.f5548j = null;
                this.f5547i = graphChange.points_;
                this.f5539a &= -33;
                this.f5548j = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
            } else {
                this.f5548j.addAllMessages(graphChange.points_);
            }
        }
        if (graphChange.hasRenderMatrix()) {
            EzyMatrix$Matrix renderMatrix = graphChange.getRenderMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f5550l;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.mergeFrom(renderMatrix);
            } else if ((this.f5539a & 64) == 0 || (ezyMatrix$Matrix = this.f5549k) == null || ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5549k = renderMatrix;
            } else {
                this.f5539a |= 64;
                onChanged();
                ((C3115b0) m3797g().getBuilder()).m2073g(renderMatrix);
            }
            if (this.f5549k != null) {
                this.f5539a |= 64;
                onChanged();
            }
        }
        if (!graphChange.getFilePath().isEmpty()) {
            this.f5551m = graphChange.filePath_;
            this.f5539a |= 128;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3799i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            this.f5540b = codedInputStream.readStringRequireUtf8();
                            this.f5539a |= 1;
                        } else if (tag == 16) {
                            this.f5541c = codedInputStream.readEnum();
                            this.f5539a |= 2;
                        } else if (tag == 26) {
                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                            this.f5539a |= 4;
                        } else if (tag == 34) {
                            this.f5544f = codedInputStream.readStringRequireUtf8();
                            this.f5539a |= 8;
                        } else if (tag == 42) {
                            codedInputStream.readMessage(m3796f().getBuilder(), extensionRegistryLite);
                            this.f5539a |= 16;
                        } else if (tag == 50) {
                            EzyPointF$PointF ezyPointF$PointF = (EzyPointF$PointF) codedInputStream.readMessage(EzyPointF$PointF.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5548j;
                            if (repeatedFieldBuilderV3 == null) {
                                ensurePointsIsMutable();
                                this.f5547i.add(ezyPointF$PointF);
                            } else {
                                repeatedFieldBuilderV3.addMessage(ezyPointF$PointF);
                            }
                        } else if (tag == 58) {
                            codedInputStream.readMessage(m3797g().getBuilder(), extensionRegistryLite);
                            this.f5539a |= 64;
                        } else if (tag == 66) {
                            this.f5551m = codedInputStream.readStringRequireUtf8();
                            this.f5539a |= 128;
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
        return AbstractC3126f.f1592l.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.GraphChange.class, C4382o.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3799i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4382o) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4382o) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4382o) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4382o) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4382o) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3795e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4382o) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4382o) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4382o) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.GraphChange.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3799i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4382o) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4382o) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4382o) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4382o) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3795e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4382o) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4382o) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3799i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4382o) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyCommand$CommandSource.CommandInfo.GraphChange graphChangeBuildPartial = buildPartial();
        if (graphChangeBuildPartial.isInitialized()) {
            return graphChangeBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphChangeBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3795e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4382o) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3799i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4382o) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.GraphChange) {
            m3798h((EzyCommand$CommandSource.CommandInfo.GraphChange) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4382o) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.GraphChange) {
            m3798h((EzyCommand$CommandSource.CommandInfo.GraphChange) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

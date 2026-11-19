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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3148m0;
import p020b4.C3115b0;
import p020b4.C3116b1;
import p020b4.C3157p0;

/* renamed from: com.zykj.board.d0 */
/* loaded from: classes3.dex */
public final class C4361d0 extends GeneratedMessageV3.Builder implements InterfaceC4363e0 {

    /* renamed from: a */
    public int f5458a;

    /* renamed from: b */
    public Object f5459b = "";

    /* renamed from: c */
    public int f5460c = 0;

    /* renamed from: d */
    public EzyRectF$RectF f5461d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5462e;

    /* renamed from: f */
    public EzyMatrix$Matrix f5463f;

    /* renamed from: g */
    public SingleFieldBuilderV3 f5464g;

    /* renamed from: h */
    public List f5465h;

    /* renamed from: i */
    public RepeatedFieldBuilderV3 f5466i;

    /* renamed from: j */
    public Object f5467j;

    /* renamed from: k */
    public int f5468k;

    /* renamed from: l */
    public int f5469l;

    /* renamed from: m */
    public EzyPaint$Paint f5470m;

    /* renamed from: n */
    public SingleFieldBuilderV3 f5471n;

    /* renamed from: o */
    public Object f5472o;

    /* renamed from: p */
    public List f5473p;

    /* renamed from: q */
    public RepeatedFieldBuilderV3 f5474q;

    /* renamed from: r */
    public Object f5475r;

    public C4361d0() {
        List list = Collections.EMPTY_LIST;
        this.f5465h = list;
        this.f5467j = "";
        this.f5472o = "";
        this.f5473p = list;
        this.f5475r = "";
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3714i();
            m3713h();
            getChildGraphFieldBuilder();
            m3715j();
            m3716k();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4361d0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyPageSnapshot$PageSnapshot.GraphSnapshot build() {
        EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshotBuildPartial = buildPartial();
        if (graphSnapshotBuildPartial.isInitialized()) {
            return graphSnapshotBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphSnapshotBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3711f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4361d0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4361d0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4361d0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzyPageSnapshot$PageSnapshot.GraphSnapshot buildPartial() {
        int i;
        EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot = new EzyPageSnapshot$PageSnapshot.GraphSnapshot(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5466i;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5458a & 16) != 0) {
                this.f5465h = Collections.unmodifiableList(this.f5465h);
                this.f5458a &= -17;
            }
            graphSnapshot.childGraph_ = this.f5465h;
        } else {
            graphSnapshot.childGraph_ = repeatedFieldBuilderV3.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5474q;
        if (repeatedFieldBuilderV32 == null) {
            if ((this.f5458a & 1024) != 0) {
                this.f5473p = Collections.unmodifiableList(this.f5473p);
                this.f5458a &= -1025;
            }
            graphSnapshot.pointList_ = this.f5473p;
        } else {
            graphSnapshot.pointList_ = repeatedFieldBuilderV32.build();
        }
        int i8 = this.f5458a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                graphSnapshot.id_ = this.f5459b;
            }
            if ((i8 & 2) != 0) {
                graphSnapshot.graphEnum_ = this.f5460c;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5462e;
                graphSnapshot.outRect_ = singleFieldBuilderV3 == null ? this.f5461d : (EzyRectF$RectF) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5464g;
                graphSnapshot.matrix_ = singleFieldBuilderV32 == null ? this.f5463f : (EzyMatrix$Matrix) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i8 & 32) != 0) {
                graphSnapshot.sourceFileName_ = this.f5467j;
            }
            if ((i8 & 64) != 0) {
                graphSnapshot.sourceId_ = this.f5468k;
            }
            if ((i8 & 128) != 0) {
                graphSnapshot.backgroundColor_ = this.f5469l;
            }
            if ((i8 & 256) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f5471n;
                graphSnapshot.paint_ = singleFieldBuilderV33 == null ? this.f5470m : (EzyPaint$Paint) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i8 & 512) != 0) {
                graphSnapshot.content_ = this.f5472o;
            }
            if ((i8 & 2048) != 0) {
                graphSnapshot.filePath_ = this.f5475r;
            }
            EzyPageSnapshot$PageSnapshot.GraphSnapshot.access$2076(graphSnapshot, i);
        }
        onBuilt();
        return graphSnapshot;
    }

    public final void ensureChildGraphIsMutable() {
        if ((this.f5458a & 16) == 0) {
            this.f5465h = new ArrayList(this.f5465h);
            this.f5458a |= 16;
        }
    }

    /* renamed from: f */
    public final void m3711f() {
        super.clear();
        this.f5458a = 0;
        this.f5459b = "";
        this.f5460c = 0;
        this.f5461d = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5462e;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5462e = null;
        }
        this.f5463f = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5464g;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5464g = null;
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5466i;
        if (repeatedFieldBuilderV3 == null) {
            this.f5465h = Collections.EMPTY_LIST;
        } else {
            this.f5465h = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5458a &= -17;
        this.f5467j = "";
        this.f5468k = 0;
        this.f5469l = 0;
        this.f5470m = null;
        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f5471n;
        if (singleFieldBuilderV33 != null) {
            singleFieldBuilderV33.dispose();
            this.f5471n = null;
        }
        this.f5472o = "";
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5474q;
        if (repeatedFieldBuilderV32 == null) {
            this.f5473p = Collections.EMPTY_LIST;
        } else {
            this.f5473p = null;
            repeatedFieldBuilderV32.clear();
        }
        this.f5458a &= -1025;
        this.f5475r = "";
    }

    /* renamed from: g */
    public final void m3712g() {
        if ((this.f5458a & 1024) == 0) {
            this.f5473p = new ArrayList(this.f5473p);
            this.f5458a |= 1024;
        }
    }

    public final RepeatedFieldBuilderV3 getChildGraphFieldBuilder() {
        if (this.f5466i == null) {
            this.f5466i = new RepeatedFieldBuilderV3(this.f5465h, (this.f5458a & 16) != 0, getParentForChildren(), isClean());
            this.f5465h = null;
        }
        return this.f5466i;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3148m0.f1621c;
    }

    /* renamed from: h */
    public final SingleFieldBuilderV3 m3713h() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5464g;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5463f;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5464g = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5463f = null;
        }
        return this.f5464g;
    }

    /* renamed from: i */
    public final SingleFieldBuilderV3 m3714i() {
        EzyRectF$RectF defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5462e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5461d;
                if (defaultInstance == null) {
                    defaultInstance = EzyRectF$RectF.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyRectF$RectF) singleFieldBuilderV3.getMessage();
            }
            this.f5462e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5461d = null;
        }
        return this.f5462e;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3148m0.f1622d.ensureFieldAccessorsInitialized(EzyPageSnapshot$PageSnapshot.GraphSnapshot.class, C4361d0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final SingleFieldBuilderV3 m3715j() {
        EzyPaint$Paint defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5471n;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5470m;
                if (defaultInstance == null) {
                    defaultInstance = EzyPaint$Paint.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyPaint$Paint) singleFieldBuilderV3.getMessage();
            }
            this.f5471n = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5470m = null;
        }
        return this.f5471n;
    }

    /* renamed from: k */
    public final RepeatedFieldBuilderV3 m3716k() {
        if (this.f5474q == null) {
            this.f5474q = new RepeatedFieldBuilderV3(this.f5473p, (this.f5458a & 1024) != 0, getParentForChildren(), isClean());
            this.f5473p = null;
        }
        return this.f5474q;
    }

    /* renamed from: l */
    public final void m3717l(EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot) {
        EzyPaint$Paint ezyPaint$Paint;
        EzyMatrix$Matrix ezyMatrix$Matrix;
        EzyRectF$RectF ezyRectF$RectF;
        if (graphSnapshot == EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance()) {
            return;
        }
        if (!graphSnapshot.getId().isEmpty()) {
            this.f5459b = graphSnapshot.id_;
            this.f5458a |= 1;
            onChanged();
        }
        if (graphSnapshot.graphEnum_ != 0) {
            this.f5460c = graphSnapshot.getGraphEnumValue();
            this.f5458a |= 2;
            onChanged();
        }
        if (graphSnapshot.hasOutRect()) {
            EzyRectF$RectF outRect = graphSnapshot.getOutRect();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5462e;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(outRect);
            } else if ((this.f5458a & 4) == 0 || (ezyRectF$RectF = this.f5461d) == null || ezyRectF$RectF == EzyRectF$RectF.getDefaultInstance()) {
                this.f5461d = outRect;
            } else {
                this.f5458a |= 4;
                onChanged();
                ((C3116b1) m3714i().getBuilder()).m2088g(outRect);
            }
            if (this.f5461d != null) {
                this.f5458a |= 4;
                onChanged();
            }
        }
        if (graphSnapshot.hasMatrix()) {
            EzyMatrix$Matrix matrix = graphSnapshot.getMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5464g;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(matrix);
            } else if ((this.f5458a & 8) == 0 || (ezyMatrix$Matrix = this.f5463f) == null || ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5463f = matrix;
            } else {
                this.f5458a |= 8;
                onChanged();
                ((C3115b0) m3713h().getBuilder()).m2073g(matrix);
            }
            if (this.f5463f != null) {
                this.f5458a |= 8;
                onChanged();
            }
        }
        if (this.f5466i == null) {
            if (!graphSnapshot.childGraph_.isEmpty()) {
                if (this.f5465h.isEmpty()) {
                    this.f5465h = graphSnapshot.childGraph_;
                    this.f5458a &= -17;
                } else {
                    ensureChildGraphIsMutable();
                    this.f5465h.addAll(graphSnapshot.childGraph_);
                }
                onChanged();
            }
        } else if (!graphSnapshot.childGraph_.isEmpty()) {
            if (this.f5466i.isEmpty()) {
                this.f5466i.dispose();
                this.f5466i = null;
                this.f5465h = graphSnapshot.childGraph_;
                this.f5458a &= -17;
                this.f5466i = GeneratedMessageV3.alwaysUseFieldBuilders ? getChildGraphFieldBuilder() : null;
            } else {
                this.f5466i.addAllMessages(graphSnapshot.childGraph_);
            }
        }
        if (!graphSnapshot.getSourceFileName().isEmpty()) {
            this.f5467j = graphSnapshot.sourceFileName_;
            this.f5458a |= 32;
            onChanged();
        }
        if (graphSnapshot.getSourceId() != 0) {
            this.f5468k = graphSnapshot.getSourceId();
            this.f5458a |= 64;
            onChanged();
        }
        if (graphSnapshot.getBackgroundColor() != 0) {
            this.f5469l = graphSnapshot.getBackgroundColor();
            this.f5458a |= 128;
            onChanged();
        }
        if (graphSnapshot.hasPaint()) {
            EzyPaint$Paint paint = graphSnapshot.getPaint();
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f5471n;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.mergeFrom(paint);
            } else if ((this.f5458a & 256) == 0 || (ezyPaint$Paint = this.f5470m) == null || ezyPaint$Paint == EzyPaint$Paint.getDefaultInstance()) {
                this.f5470m = paint;
            } else {
                this.f5458a |= 256;
                onChanged();
                ((C3157p0) m3715j().getBuilder()).m2101g(paint);
            }
            if (this.f5470m != null) {
                this.f5458a |= 256;
                onChanged();
            }
        }
        if (!graphSnapshot.getContent().isEmpty()) {
            this.f5472o = graphSnapshot.content_;
            this.f5458a |= 512;
            onChanged();
        }
        if (this.f5474q == null) {
            if (!graphSnapshot.pointList_.isEmpty()) {
                if (this.f5473p.isEmpty()) {
                    this.f5473p = graphSnapshot.pointList_;
                    this.f5458a &= -1025;
                } else {
                    m3712g();
                    this.f5473p.addAll(graphSnapshot.pointList_);
                }
                onChanged();
            }
        } else if (!graphSnapshot.pointList_.isEmpty()) {
            if (this.f5474q.isEmpty()) {
                this.f5474q.dispose();
                this.f5474q = null;
                this.f5473p = graphSnapshot.pointList_;
                this.f5458a &= -1025;
                this.f5474q = GeneratedMessageV3.alwaysUseFieldBuilders ? m3716k() : null;
            } else {
                this.f5474q.addAllMessages(graphSnapshot.pointList_);
            }
        }
        if (!graphSnapshot.getFilePath().isEmpty()) {
            this.f5475r = graphSnapshot.filePath_;
            this.f5458a |= 2048;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: m */
    public final void m3718m(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    switch (tag) {
                        case 0:
                            z8 = true;
                        case 10:
                            this.f5459b = codedInputStream.readStringRequireUtf8();
                            this.f5458a |= 1;
                        case 16:
                            this.f5460c = codedInputStream.readEnum();
                            this.f5458a |= 2;
                        case 26:
                            codedInputStream.readMessage(m3714i().getBuilder(), extensionRegistryLite);
                            this.f5458a |= 4;
                        case 34:
                            codedInputStream.readMessage(m3713h().getBuilder(), extensionRegistryLite);
                            this.f5458a |= 8;
                        case 42:
                            EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot = (EzyPageSnapshot$PageSnapshot.GraphSnapshot) codedInputStream.readMessage(EzyPageSnapshot$PageSnapshot.GraphSnapshot.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5466i;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureChildGraphIsMutable();
                                this.f5465h.add(graphSnapshot);
                            } else {
                                repeatedFieldBuilderV3.addMessage(graphSnapshot);
                            }
                        case 50:
                            this.f5467j = codedInputStream.readStringRequireUtf8();
                            this.f5458a |= 32;
                        case 56:
                            this.f5468k = codedInputStream.readInt32();
                            this.f5458a |= 64;
                        case 64:
                            this.f5469l = codedInputStream.readInt32();
                            this.f5458a |= 128;
                        case 74:
                            codedInputStream.readMessage(m3715j().getBuilder(), extensionRegistryLite);
                            this.f5458a |= 256;
                        case 82:
                            this.f5472o = codedInputStream.readStringRequireUtf8();
                            this.f5458a |= 512;
                        case 90:
                            EzyPointF$PointF ezyPointF$PointF = (EzyPointF$PointF) codedInputStream.readMessage(EzyPointF$PointF.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5474q;
                            if (repeatedFieldBuilderV32 == null) {
                                m3712g();
                                this.f5473p.add(ezyPointF$PointF);
                            } else {
                                repeatedFieldBuilderV32.addMessage(ezyPointF$PointF);
                            }
                        case 98:
                            this.f5475r = codedInputStream.readStringRequireUtf8();
                            this.f5458a |= 2048;
                        default:
                            if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z8 = true;
                            }
                    }
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
        m3718m(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4361d0) super.mergeUnknownFields(unknownFieldSet);
    }

    /* renamed from: n */
    public final void m3719n(EzyPaint$Paint ezyPaint$Paint) {
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5471n;
        if (singleFieldBuilderV3 == null) {
            ezyPaint$Paint.getClass();
            this.f5470m = ezyPaint$Paint;
        } else {
            singleFieldBuilderV3.setMessage(ezyPaint$Paint);
        }
        this.f5458a |= 256;
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4361d0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4361d0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4361d0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4361d0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3711f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4361d0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4361d0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4361d0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3718m(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4361d0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4361d0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4361d0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4361d0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3711f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4361d0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4361d0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3718m(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4361d0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3711f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4361d0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3718m(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4361d0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyPageSnapshot$PageSnapshot.GraphSnapshot) {
            m3717l((EzyPageSnapshot$PageSnapshot.GraphSnapshot) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4361d0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyPageSnapshot$PageSnapshot.GraphSnapshot) {
            m3717l((EzyPageSnapshot$PageSnapshot.GraphSnapshot) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

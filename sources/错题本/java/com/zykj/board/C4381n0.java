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
import com.zykj.board.EzySource$GeometrySource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3176v1;
import p020b4.C3157p0;
import p020b4.InterfaceC3155o1;

/* renamed from: com.zykj.board.n0 */
/* loaded from: classes3.dex */
public final class C4381n0 extends GeneratedMessageV3.Builder implements InterfaceC3155o1 {

    /* renamed from: a */
    public int f5533a;

    /* renamed from: b */
    public int f5534b = 0;

    /* renamed from: c */
    public List f5535c = Collections.EMPTY_LIST;

    /* renamed from: d */
    public RepeatedFieldBuilderV3 f5536d;

    /* renamed from: e */
    public EzyPaint$Paint f5537e;

    /* renamed from: f */
    public SingleFieldBuilderV3 f5538f;

    public C4381n0() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3791j();
            m3790i();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4381n0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzySource$GeometrySource.GeometryInfo build() {
        EzySource$GeometrySource.GeometryInfo geometryInfoBuildPartial = buildPartial();
        if (geometryInfoBuildPartial.isInitialized()) {
            return geometryInfoBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometryInfoBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3787f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4381n0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4381n0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder m13728clone() {
        return (C4381n0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzySource$GeometrySource.GeometryInfo buildPartial() {
        int i;
        EzySource$GeometrySource.GeometryInfo geometryInfo = new EzySource$GeometrySource.GeometryInfo(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5536d;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5533a & 2) != 0) {
                this.f5535c = Collections.unmodifiableList(this.f5535c);
                this.f5533a &= -3;
            }
            geometryInfo.points_ = this.f5535c;
        } else {
            geometryInfo.points_ = repeatedFieldBuilderV3.build();
        }
        int i8 = this.f5533a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                geometryInfo.geometryType_ = this.f5534b;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5538f;
                geometryInfo.paint_ = singleFieldBuilderV3 == null ? this.f5537e : (EzyPaint$Paint) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            EzySource$GeometrySource.GeometryInfo.access$9476(geometryInfo, i);
        }
        onBuilt();
        return geometryInfo;
    }

    /* renamed from: f */
    public final void m3787f() {
        super.clear();
        this.f5533a = 0;
        this.f5534b = 0;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5536d;
        if (repeatedFieldBuilderV3 == null) {
            this.f5535c = Collections.EMPTY_LIST;
        } else {
            this.f5535c = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5533a &= -3;
        this.f5537e = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5538f;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5538f = null;
        }
    }

    /* renamed from: g */
    public final void m3788g() {
        if ((this.f5533a & 2) == 0) {
            this.f5535c = new ArrayList(this.f5535c);
            this.f5533a |= 2;
        }
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzySource$GeometrySource.GeometryInfo.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3176v1.f1687s;
    }

    /* renamed from: h */
    public final C3157p0 m3789h() {
        this.f5533a |= 4;
        onChanged();
        return (C3157p0) m3790i().getBuilder();
    }

    /* renamed from: i */
    public final SingleFieldBuilderV3 m3790i() {
        EzyPaint$Paint defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5538f;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5537e;
                if (defaultInstance == null) {
                    defaultInstance = EzyPaint$Paint.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyPaint$Paint) singleFieldBuilderV3.getMessage();
            }
            this.f5538f = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5537e = null;
        }
        return this.f5538f;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1688t.ensureFieldAccessorsInitialized(EzySource$GeometrySource.GeometryInfo.class, C4381n0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final RepeatedFieldBuilderV3 m3791j() {
        if (this.f5536d == null) {
            this.f5536d = new RepeatedFieldBuilderV3(this.f5535c, (this.f5533a & 2) != 0, getParentForChildren(), isClean());
            this.f5535c = null;
        }
        return this.f5536d;
    }

    /* renamed from: k */
    public final void m3792k(EzySource$GeometrySource.GeometryInfo geometryInfo) {
        EzyPaint$Paint ezyPaint$Paint;
        if (geometryInfo == EzySource$GeometrySource.GeometryInfo.getDefaultInstance()) {
            return;
        }
        if (geometryInfo.geometryType_ != 0) {
            this.f5534b = geometryInfo.getGeometryTypeValue();
            this.f5533a |= 1;
            onChanged();
        }
        if (this.f5536d == null) {
            if (!geometryInfo.points_.isEmpty()) {
                if (this.f5535c.isEmpty()) {
                    this.f5535c = geometryInfo.points_;
                    this.f5533a &= -3;
                } else {
                    m3788g();
                    this.f5535c.addAll(geometryInfo.points_);
                }
                onChanged();
            }
        } else if (!geometryInfo.points_.isEmpty()) {
            if (this.f5536d.isEmpty()) {
                this.f5536d.dispose();
                this.f5536d = null;
                this.f5535c = geometryInfo.points_;
                this.f5533a &= -3;
                this.f5536d = GeneratedMessageV3.alwaysUseFieldBuilders ? m3791j() : null;
            } else {
                this.f5536d.addAllMessages(geometryInfo.points_);
            }
        }
        if (geometryInfo.hasPaint()) {
            EzyPaint$Paint paint = geometryInfo.getPaint();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5538f;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(paint);
            } else if ((this.f5533a & 4) == 0 || (ezyPaint$Paint = this.f5537e) == null || ezyPaint$Paint == EzyPaint$Paint.getDefaultInstance()) {
                this.f5537e = paint;
            } else {
                m3789h().m2101g(paint);
            }
            if (this.f5537e != null) {
                this.f5533a |= 4;
                onChanged();
            }
        }
        onChanged();
    }

    /* renamed from: l */
    public final void m3793l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.f5534b = codedInputStream.readEnum();
                            this.f5533a |= 1;
                        } else if (tag == 18) {
                            EzyPointF$PointF ezyPointF$PointF = (EzyPointF$PointF) codedInputStream.readMessage(EzyPointF$PointF.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5536d;
                            if (repeatedFieldBuilderV3 == null) {
                                m3788g();
                                this.f5535c.add(ezyPointF$PointF);
                            } else {
                                repeatedFieldBuilderV3.addMessage(ezyPointF$PointF);
                            }
                        } else if (tag == 26) {
                            codedInputStream.readMessage(m3790i().getBuilder(), extensionRegistryLite);
                            this.f5533a |= 4;
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
        m3793l(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4381n0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4381n0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4381n0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4381n0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4381n0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3787f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4381n0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4381n0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder m13728clone() {
        return (C4381n0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzySource$GeometrySource.GeometryInfo.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3793l(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4381n0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4381n0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4381n0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4381n0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3787f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4381n0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder m13728clone() {
        return (C4381n0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3793l(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4381n0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3787f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder m13728clone() {
        return (C4381n0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3793l(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder m13728clone() {
        return (C4381n0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$GeometrySource.GeometryInfo) {
            m3792k((EzySource$GeometrySource.GeometryInfo) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4381n0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$GeometrySource.GeometryInfo) {
            m3792k((EzySource$GeometrySource.GeometryInfo) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

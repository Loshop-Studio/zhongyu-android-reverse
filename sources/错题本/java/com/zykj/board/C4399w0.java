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
import com.zykj.board.EzySource$TouchSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3176v1;
import p020b4.C3157p0;
import p020b4.InterfaceC3173u1;

/* renamed from: com.zykj.board.w0 */
/* loaded from: classes3.dex */
public final class C4399w0 extends GeneratedMessageV3.Builder implements InterfaceC3173u1 {

    /* renamed from: a */
    public int f5589a;

    /* renamed from: b */
    public List f5590b = Collections.EMPTY_LIST;

    /* renamed from: c */
    public RepeatedFieldBuilderV3 f5591c;

    /* renamed from: d */
    public EzyPaint$Paint f5592d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5593e;

    public C4399w0() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            getTouchEventFieldBuilder();
            m3856h();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4399w0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzySource$TouchSource.TouchInfo build() {
        EzySource$TouchSource.TouchInfo touchInfoBuildPartial = buildPartial();
        if (touchInfoBuildPartial.isInitialized()) {
            return touchInfoBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchInfoBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3854f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4399w0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4399w0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder m13728clone() {
        return (C4399w0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzySource$TouchSource.TouchInfo buildPartial() {
        EzySource$TouchSource.TouchInfo touchInfo = new EzySource$TouchSource.TouchInfo(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5591c;
        int i = 1;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5589a & 1) != 0) {
                this.f5590b = Collections.unmodifiableList(this.f5590b);
                this.f5589a &= -2;
            }
            touchInfo.touchEvent_ = this.f5590b;
        } else {
            touchInfo.touchEvent_ = repeatedFieldBuilderV3.build();
        }
        int i8 = this.f5589a;
        if (i8 != 0) {
            if ((i8 & 2) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5593e;
                touchInfo.paint_ = singleFieldBuilderV3 == null ? this.f5592d : (EzyPaint$Paint) singleFieldBuilderV3.build();
            } else {
                i = 0;
            }
            EzySource$TouchSource.TouchInfo.access$1076(touchInfo, i);
        }
        onBuilt();
        return touchInfo;
    }

    public final void ensureTouchEventIsMutable() {
        if ((this.f5589a & 1) == 0) {
            this.f5590b = new ArrayList(this.f5590b);
            this.f5589a |= 1;
        }
    }

    /* renamed from: f */
    public final void m3854f() {
        super.clear();
        this.f5589a = 0;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5591c;
        if (repeatedFieldBuilderV3 == null) {
            this.f5590b = Collections.EMPTY_LIST;
        } else {
            this.f5590b = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5589a &= -2;
        this.f5592d = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5593e;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5593e = null;
        }
    }

    /* renamed from: g */
    public final C3157p0 m3855g() {
        this.f5589a |= 2;
        onChanged();
        return (C3157p0) m3856h().getBuilder();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzySource$TouchSource.TouchInfo.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3176v1.f1671c;
    }

    public final RepeatedFieldBuilderV3 getTouchEventFieldBuilder() {
        if (this.f5591c == null) {
            this.f5591c = new RepeatedFieldBuilderV3(this.f5590b, (this.f5589a & 1) != 0, getParentForChildren(), isClean());
            this.f5590b = null;
        }
        return this.f5591c;
    }

    /* renamed from: h */
    public final SingleFieldBuilderV3 m3856h() {
        EzyPaint$Paint defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5593e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5592d;
                if (defaultInstance == null) {
                    defaultInstance = EzyPaint$Paint.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyPaint$Paint) singleFieldBuilderV3.getMessage();
            }
            this.f5593e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5592d = null;
        }
        return this.f5593e;
    }

    /* renamed from: i */
    public final void m3857i(EzySource$TouchSource.TouchInfo touchInfo) {
        EzyPaint$Paint ezyPaint$Paint;
        if (touchInfo == EzySource$TouchSource.TouchInfo.getDefaultInstance()) {
            return;
        }
        if (this.f5591c == null) {
            if (!touchInfo.touchEvent_.isEmpty()) {
                if (this.f5590b.isEmpty()) {
                    this.f5590b = touchInfo.touchEvent_;
                    this.f5589a &= -2;
                } else {
                    ensureTouchEventIsMutable();
                    this.f5590b.addAll(touchInfo.touchEvent_);
                }
                onChanged();
            }
        } else if (!touchInfo.touchEvent_.isEmpty()) {
            if (this.f5591c.isEmpty()) {
                this.f5591c.dispose();
                this.f5591c = null;
                this.f5590b = touchInfo.touchEvent_;
                this.f5589a &= -2;
                this.f5591c = GeneratedMessageV3.alwaysUseFieldBuilders ? getTouchEventFieldBuilder() : null;
            } else {
                this.f5591c.addAllMessages(touchInfo.touchEvent_);
            }
        }
        if (touchInfo.hasPaint()) {
            EzyPaint$Paint paint = touchInfo.getPaint();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5593e;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(paint);
            } else if ((this.f5589a & 2) == 0 || (ezyPaint$Paint = this.f5592d) == null || ezyPaint$Paint == EzyPaint$Paint.getDefaultInstance()) {
                this.f5592d = paint;
            } else {
                m3855g().m2101g(paint);
            }
            if (this.f5592d != null) {
                this.f5589a |= 2;
                onChanged();
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1672d.ensureFieldAccessorsInitialized(EzySource$TouchSource.TouchInfo.class, C4399w0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m3858j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent = (EzyTouchEvent$TouchEvent) codedInputStream.readMessage(EzyTouchEvent$TouchEvent.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5591c;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureTouchEventIsMutable();
                                this.f5590b.add(ezyTouchEvent$TouchEvent);
                            } else {
                                repeatedFieldBuilderV3.addMessage(ezyTouchEvent$TouchEvent);
                            }
                        } else if (tag == 18) {
                            codedInputStream.readMessage(m3856h().getBuilder(), extensionRegistryLite);
                            this.f5589a |= 2;
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
        m3858j(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4399w0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4399w0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4399w0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4399w0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4399w0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3854f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4399w0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4399w0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder m13728clone() {
        return (C4399w0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzySource$TouchSource.TouchInfo.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3858j(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4399w0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4399w0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4399w0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4399w0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3854f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4399w0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder m13728clone() {
        return (C4399w0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3858j(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4399w0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3854f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder m13728clone() {
        return (C4399w0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3858j(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder m13728clone() {
        return (C4399w0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$TouchSource.TouchInfo) {
            m3857i((EzySource$TouchSource.TouchInfo) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4399w0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$TouchSource.TouchInfo) {
            m3857i((EzySource$TouchSource.TouchInfo) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

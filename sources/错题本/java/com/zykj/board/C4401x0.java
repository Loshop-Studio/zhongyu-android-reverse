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
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3113a2;

/* renamed from: com.zykj.board.x0 */
/* loaded from: classes3.dex */
public final class C4401x0 extends GeneratedMessageV3.Builder implements InterfaceC4359c1 {

    /* renamed from: a */
    public int f5600a;

    /* renamed from: b */
    public long f5601b;

    /* renamed from: c */
    public int f5602c;

    /* renamed from: d */
    public float f5603d;

    /* renamed from: e */
    public float f5604e;

    /* renamed from: f */
    public int f5605f;

    /* renamed from: g */
    public List f5606g;

    /* renamed from: h */
    public RepeatedFieldBuilderV3 f5607h;

    /* renamed from: i */
    public List f5608i;

    /* renamed from: j */
    public RepeatedFieldBuilderV3 f5609j;

    public C4401x0() {
        List list = Collections.EMPTY_LIST;
        this.f5606g = list;
        this.f5608i = list;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4401x0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyTouchEvent$TouchEvent build() {
        EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEventBuildPartial = buildPartial();
        if (ezyTouchEvent$TouchEventBuildPartial.isInitialized()) {
            return ezyTouchEvent$TouchEventBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyTouchEvent$TouchEventBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3867f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4401x0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4401x0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4401x0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzyTouchEvent$TouchEvent buildPartial() {
        EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent = new EzyTouchEvent$TouchEvent(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5607h;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5600a & 32) != 0) {
                this.f5606g = Collections.unmodifiableList(this.f5606g);
                this.f5600a &= -33;
            }
            ezyTouchEvent$TouchEvent.pointerProperties_ = this.f5606g;
        } else {
            ezyTouchEvent$TouchEvent.pointerProperties_ = repeatedFieldBuilderV3.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5609j;
        if (repeatedFieldBuilderV32 == null) {
            if ((this.f5600a & 64) != 0) {
                this.f5608i = Collections.unmodifiableList(this.f5608i);
                this.f5600a &= -65;
            }
            ezyTouchEvent$TouchEvent.pointerCoords_ = this.f5608i;
        } else {
            ezyTouchEvent$TouchEvent.pointerCoords_ = repeatedFieldBuilderV32.build();
        }
        int i = this.f5600a;
        if (i != 0) {
            if ((i & 1) != 0) {
                ezyTouchEvent$TouchEvent.eventTime_ = this.f5601b;
            }
            if ((i & 2) != 0) {
                ezyTouchEvent$TouchEvent.action_ = this.f5602c;
            }
            if ((i & 4) != 0) {
                ezyTouchEvent$TouchEvent.f5432x_ = this.f5603d;
            }
            if ((i & 8) != 0) {
                ezyTouchEvent$TouchEvent.f5433y_ = this.f5604e;
            }
            if ((i & 16) != 0) {
                ezyTouchEvent$TouchEvent.pointerCount_ = this.f5605f;
            }
        }
        onBuilt();
        return ezyTouchEvent$TouchEvent;
    }

    public final void ensurePointerCoordsIsMutable() {
        if ((this.f5600a & 64) == 0) {
            this.f5608i = new ArrayList(this.f5608i);
            this.f5600a |= 64;
        }
    }

    public final void ensurePointerPropertiesIsMutable() {
        if ((this.f5600a & 32) == 0) {
            this.f5606g = new ArrayList(this.f5606g);
            this.f5600a |= 32;
        }
    }

    /* renamed from: f */
    public final void m3867f() {
        super.clear();
        this.f5600a = 0;
        this.f5601b = 0L;
        this.f5602c = 0;
        this.f5603d = 0.0f;
        this.f5604e = 0.0f;
        this.f5605f = 0;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5607h;
        if (repeatedFieldBuilderV3 == null) {
            this.f5606g = Collections.EMPTY_LIST;
        } else {
            this.f5606g = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5600a &= -33;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5609j;
        if (repeatedFieldBuilderV32 == null) {
            this.f5608i = Collections.EMPTY_LIST;
        } else {
            this.f5608i = null;
            repeatedFieldBuilderV32.clear();
        }
        this.f5600a &= -65;
    }

    /* renamed from: g */
    public final void m3868g(EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent) {
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3;
        if (ezyTouchEvent$TouchEvent == EzyTouchEvent$TouchEvent.getDefaultInstance()) {
            return;
        }
        if (ezyTouchEvent$TouchEvent.getEventTime() != 0) {
            m3870i(ezyTouchEvent$TouchEvent.getEventTime());
        }
        if (ezyTouchEvent$TouchEvent.getAction() != 0) {
            this.f5602c = ezyTouchEvent$TouchEvent.getAction();
            this.f5600a |= 2;
            onChanged();
        }
        if (ezyTouchEvent$TouchEvent.getX() != 0.0f) {
            m3871j(ezyTouchEvent$TouchEvent.getX());
        }
        if (ezyTouchEvent$TouchEvent.getY() != 0.0f) {
            m3872k(ezyTouchEvent$TouchEvent.getY());
        }
        if (ezyTouchEvent$TouchEvent.getPointerCount() != 0) {
            this.f5605f = ezyTouchEvent$TouchEvent.getPointerCount();
            this.f5600a |= 16;
            onChanged();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = null;
        if (this.f5607h == null) {
            if (!ezyTouchEvent$TouchEvent.pointerProperties_.isEmpty()) {
                if (this.f5606g.isEmpty()) {
                    this.f5606g = ezyTouchEvent$TouchEvent.pointerProperties_;
                    this.f5600a &= -33;
                } else {
                    ensurePointerPropertiesIsMutable();
                    this.f5606g.addAll(ezyTouchEvent$TouchEvent.pointerProperties_);
                }
                onChanged();
            }
        } else if (!ezyTouchEvent$TouchEvent.pointerProperties_.isEmpty()) {
            if (this.f5607h.isEmpty()) {
                this.f5607h.dispose();
                this.f5607h = null;
                this.f5606g = ezyTouchEvent$TouchEvent.pointerProperties_;
                this.f5600a &= -33;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5607h == null) {
                        this.f5607h = new RepeatedFieldBuilderV3(this.f5606g, (this.f5600a & 32) != 0, getParentForChildren(), isClean());
                        this.f5606g = null;
                    }
                    repeatedFieldBuilderV3 = this.f5607h;
                } else {
                    repeatedFieldBuilderV3 = null;
                }
                this.f5607h = repeatedFieldBuilderV3;
            } else {
                this.f5607h.addAllMessages(ezyTouchEvent$TouchEvent.pointerProperties_);
            }
        }
        if (this.f5609j == null) {
            if (!ezyTouchEvent$TouchEvent.pointerCoords_.isEmpty()) {
                if (this.f5608i.isEmpty()) {
                    this.f5608i = ezyTouchEvent$TouchEvent.pointerCoords_;
                    this.f5600a &= -65;
                } else {
                    ensurePointerCoordsIsMutable();
                    this.f5608i.addAll(ezyTouchEvent$TouchEvent.pointerCoords_);
                }
                onChanged();
            }
        } else if (!ezyTouchEvent$TouchEvent.pointerCoords_.isEmpty()) {
            if (this.f5609j.isEmpty()) {
                this.f5609j.dispose();
                this.f5609j = null;
                this.f5608i = ezyTouchEvent$TouchEvent.pointerCoords_;
                this.f5600a &= -65;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5609j == null) {
                        this.f5609j = new RepeatedFieldBuilderV3(this.f5608i, (this.f5600a & 64) != 0, getParentForChildren(), isClean());
                        this.f5608i = null;
                    }
                    repeatedFieldBuilderV32 = this.f5609j;
                }
                this.f5609j = repeatedFieldBuilderV32;
            } else {
                this.f5609j.addAllMessages(ezyTouchEvent$TouchEvent.pointerCoords_);
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyTouchEvent$TouchEvent.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3113a2.f1551a;
    }

    /* renamed from: h */
    public final void m3869h(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.f5601b = codedInputStream.readInt64();
                            this.f5600a |= 1;
                        } else if (tag == 16) {
                            this.f5602c = codedInputStream.readInt32();
                            this.f5600a |= 2;
                        } else if (tag == 29) {
                            this.f5603d = codedInputStream.readFloat();
                            this.f5600a |= 4;
                        } else if (tag == 37) {
                            this.f5604e = codedInputStream.readFloat();
                            this.f5600a |= 8;
                        } else if (tag == 40) {
                            this.f5605f = codedInputStream.readInt32();
                            this.f5600a |= 16;
                        } else if (tag == 50) {
                            EzyTouchEvent$TouchEvent.PointerProperties pointerProperties = (EzyTouchEvent$TouchEvent.PointerProperties) codedInputStream.readMessage(EzyTouchEvent$TouchEvent.PointerProperties.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5607h;
                            if (repeatedFieldBuilderV3 == null) {
                                ensurePointerPropertiesIsMutable();
                                this.f5606g.add(pointerProperties);
                            } else {
                                repeatedFieldBuilderV3.addMessage(pointerProperties);
                            }
                        } else if (tag == 58) {
                            EzyTouchEvent$TouchEvent.PointerCoords pointerCoords = (EzyTouchEvent$TouchEvent.PointerCoords) codedInputStream.readMessage(EzyTouchEvent$TouchEvent.PointerCoords.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5609j;
                            if (repeatedFieldBuilderV32 == null) {
                                ensurePointerCoordsIsMutable();
                                this.f5608i.add(pointerCoords);
                            } else {
                                repeatedFieldBuilderV32.addMessage(pointerCoords);
                            }
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

    /* renamed from: i */
    public final void m3870i(long j7) {
        this.f5601b = j7;
        this.f5600a |= 1;
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3113a2.f1552b.ensureFieldAccessorsInitialized(EzyTouchEvent$TouchEvent.class, C4401x0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m3871j(float f) {
        this.f5603d = f;
        this.f5600a |= 4;
        onChanged();
    }

    /* renamed from: k */
    public final void m3872k(float f) {
        this.f5604e = f;
        this.f5600a |= 8;
        onChanged();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3869h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4401x0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4401x0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4401x0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4401x0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4401x0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3867f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4401x0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4401x0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4401x0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyTouchEvent$TouchEvent.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3869h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4401x0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4401x0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4401x0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4401x0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3867f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4401x0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4401x0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3869h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4401x0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3867f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4401x0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3869h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4401x0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyTouchEvent$TouchEvent) {
            m3868g((EzyTouchEvent$TouchEvent) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4401x0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyTouchEvent$TouchEvent) {
            m3868g((EzyTouchEvent$TouchEvent) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

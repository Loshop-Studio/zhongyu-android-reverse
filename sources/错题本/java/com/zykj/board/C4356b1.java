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
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import p020b4.AbstractC3113a2;
import p020b4.InterfaceC3188z1;

/* renamed from: com.zykj.board.b1 */
/* loaded from: classes3.dex */
public final class C4356b1 extends GeneratedMessageV3.Builder implements InterfaceC3188z1 {

    /* renamed from: a */
    public int f5451a;

    /* renamed from: b */
    public int f5452b;

    /* renamed from: c */
    public int f5453c;

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4356b1) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyTouchEvent$TouchEvent.PointerProperties pointerPropertiesBuildPartial = buildPartial();
        if (pointerPropertiesBuildPartial.isInitialized()) {
            return pointerPropertiesBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyTouchEvent$TouchEvent.PointerProperties buildPartial() {
        EzyTouchEvent$TouchEvent.PointerProperties pointerProperties = new EzyTouchEvent$TouchEvent.PointerProperties(this, null);
        int i = this.f5451a;
        if (i != 0) {
            if ((i & 1) != 0) {
                pointerProperties.id_ = this.f5452b;
            }
            if ((i & 2) != 0) {
                pointerProperties.toolType_ = this.f5453c;
            }
        }
        onBuilt();
        return pointerProperties;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clear() {
        super.clear();
        this.f5451a = 0;
        this.f5452b = 0;
        this.f5453c = 0;
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4356b1) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4356b1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4356b1) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3701e(EzyTouchEvent$TouchEvent.PointerProperties pointerProperties) {
        if (pointerProperties == EzyTouchEvent$TouchEvent.PointerProperties.getDefaultInstance()) {
            return;
        }
        if (pointerProperties.getId() != 0) {
            this.f5452b = pointerProperties.getId();
            this.f5451a |= 1;
            onChanged();
        }
        if (pointerProperties.getToolType() != 0) {
            this.f5453c = pointerProperties.getToolType();
            this.f5451a |= 2;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: f */
    public final void m3702f(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.f5452b = codedInputStream.readInt32();
                            this.f5451a |= 1;
                        } else if (tag == 16) {
                            this.f5453c = codedInputStream.readInt32();
                            this.f5451a |= 2;
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

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyTouchEvent$TouchEvent.PointerProperties.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3113a2.f1553c;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3113a2.f1554d.ensureFieldAccessorsInitialized(EzyTouchEvent$TouchEvent.PointerProperties.class, C4356b1.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3702f(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4356b1) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4356b1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4356b1) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4356b1) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4356b1) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4356b1) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4356b1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4356b1) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyTouchEvent$TouchEvent.PointerProperties.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3702f(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4356b1) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4356b1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4356b1) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4356b1) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4356b1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4356b1) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3702f(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4356b1) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyTouchEvent$TouchEvent.PointerProperties pointerPropertiesBuildPartial = buildPartial();
        if (pointerPropertiesBuildPartial.isInitialized()) {
            return pointerPropertiesBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4356b1) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3702f(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clear() {
        super.clear();
        this.f5451a = 0;
        this.f5452b = 0;
        this.f5453c = 0;
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4356b1) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyTouchEvent$TouchEvent.PointerProperties) {
            m3701e((EzyTouchEvent$TouchEvent.PointerProperties) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4356b1) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyTouchEvent$TouchEvent.PointerProperties) {
            m3701e((EzyTouchEvent$TouchEvent.PointerProperties) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clear() {
        super.clear();
        this.f5451a = 0;
        this.f5452b = 0;
        this.f5453c = 0;
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite.Builder clear() {
        super.clear();
        this.f5451a = 0;
        this.f5452b = 0;
        this.f5453c = 0;
        return this;
    }
}

package p020b4;

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
import com.zykj.board.EzyHeader$MoveConfig;

/* renamed from: b4.w */
/* loaded from: classes3.dex */
public final class C3177w extends GeneratedMessageV3.Builder implements InterfaceC3180x {

    /* renamed from: a */
    public int f1689a;

    /* renamed from: b */
    public boolean f1690b;

    /* renamed from: c */
    public boolean f1691c;

    /* renamed from: d */
    public boolean f1692d;

    /* renamed from: e */
    public boolean f1693e;

    /* renamed from: f */
    public boolean f1694f;

    /* renamed from: g */
    public int f1695g;

    /* renamed from: h */
    public int f1696h;

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3177w) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyHeader$MoveConfig ezyHeader$MoveConfigBuildPartial = buildPartial();
        if (ezyHeader$MoveConfigBuildPartial.isInitialized()) {
            return ezyHeader$MoveConfigBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyHeader$MoveConfigBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyHeader$MoveConfig buildPartial() {
        EzyHeader$MoveConfig ezyHeader$MoveConfig = new EzyHeader$MoveConfig(this, null);
        int i = this.f1689a;
        if (i != 0) {
            if ((i & 1) != 0) {
                ezyHeader$MoveConfig.isEnable_ = this.f1690b;
            }
            if ((i & 2) != 0) {
                ezyHeader$MoveConfig.verticalTranslate_ = this.f1691c;
            }
            if ((i & 4) != 0) {
                ezyHeader$MoveConfig.horizontalTranslate_ = this.f1692d;
            }
            if ((i & 8) != 0) {
                ezyHeader$MoveConfig.scale_ = this.f1693e;
            }
            if ((i & 16) != 0) {
                ezyHeader$MoveConfig.rotate_ = this.f1694f;
            }
            if ((i & 32) != 0) {
                ezyHeader$MoveConfig.maxHeightTimes_ = this.f1695g;
            }
            if ((i & 64) != 0) {
                ezyHeader$MoveConfig.maxWidthTimes_ = this.f1696h;
            }
        }
        onBuilt();
        return ezyHeader$MoveConfig;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m2133e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C3177w) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3177w) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C3177w) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m2133e() {
        super.clear();
        this.f1689a = 0;
        this.f1690b = false;
        this.f1691c = false;
        this.f1692d = false;
        this.f1693e = false;
        this.f1694f = false;
        this.f1695g = 0;
        this.f1696h = 0;
    }

    /* renamed from: f */
    public final void m2134f(EzyHeader$MoveConfig ezyHeader$MoveConfig) {
        if (ezyHeader$MoveConfig == EzyHeader$MoveConfig.getDefaultInstance()) {
            return;
        }
        if (ezyHeader$MoveConfig.getIsEnable()) {
            this.f1690b = ezyHeader$MoveConfig.getIsEnable();
            this.f1689a |= 1;
            onChanged();
        }
        if (ezyHeader$MoveConfig.getVerticalTranslate()) {
            this.f1691c = ezyHeader$MoveConfig.getVerticalTranslate();
            this.f1689a |= 2;
            onChanged();
        }
        if (ezyHeader$MoveConfig.getHorizontalTranslate()) {
            this.f1692d = ezyHeader$MoveConfig.getHorizontalTranslate();
            this.f1689a |= 4;
            onChanged();
        }
        if (ezyHeader$MoveConfig.getScale()) {
            this.f1693e = ezyHeader$MoveConfig.getScale();
            this.f1689a |= 8;
            onChanged();
        }
        if (ezyHeader$MoveConfig.getRotate()) {
            this.f1694f = ezyHeader$MoveConfig.getRotate();
            this.f1689a |= 16;
            onChanged();
        }
        if (ezyHeader$MoveConfig.getMaxHeightTimes() != 0) {
            this.f1695g = ezyHeader$MoveConfig.getMaxHeightTimes();
            this.f1689a |= 32;
            onChanged();
        }
        if (ezyHeader$MoveConfig.getMaxWidthTimes() != 0) {
            this.f1696h = ezyHeader$MoveConfig.getMaxWidthTimes();
            this.f1689a |= 64;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: g */
    public final void m2135g(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.f1690b = codedInputStream.readBool();
                            this.f1689a |= 1;
                        } else if (tag == 16) {
                            this.f1691c = codedInputStream.readBool();
                            this.f1689a |= 2;
                        } else if (tag == 24) {
                            this.f1692d = codedInputStream.readBool();
                            this.f1689a |= 4;
                        } else if (tag == 32) {
                            this.f1693e = codedInputStream.readBool();
                            this.f1689a |= 8;
                        } else if (tag == 40) {
                            this.f1694f = codedInputStream.readBool();
                            this.f1689a |= 16;
                        } else if (tag == 48) {
                            this.f1695g = codedInputStream.readInt32();
                            this.f1689a |= 32;
                        } else if (tag == 56) {
                            this.f1696h = codedInputStream.readInt32();
                            this.f1689a |= 64;
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
        return EzyHeader$MoveConfig.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3183y.f1702c;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3183y.f1703d.ensureFieldAccessorsInitialized(EzyHeader$MoveConfig.class, C3177w.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2135g(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3177w) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3177w) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C3177w) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3177w) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3177w) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m2133e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C3177w) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3177w) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C3177w) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyHeader$MoveConfig.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2135g(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3177w) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3177w) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C3177w) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3177w) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m2133e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3177w) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C3177w) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2135g(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3177w) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyHeader$MoveConfig ezyHeader$MoveConfigBuildPartial = buildPartial();
        if (ezyHeader$MoveConfigBuildPartial.isInitialized()) {
            return ezyHeader$MoveConfigBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyHeader$MoveConfigBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m2133e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C3177w) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2135g(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C3177w) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyHeader$MoveConfig) {
            m2134f((EzyHeader$MoveConfig) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C3177w) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyHeader$MoveConfig) {
            m2134f((EzyHeader$MoveConfig) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

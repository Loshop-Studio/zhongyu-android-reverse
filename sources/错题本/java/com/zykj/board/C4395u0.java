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
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzySource$TouchSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3176v1;

/* renamed from: com.zykj.board.u0 */
/* loaded from: classes3.dex */
public final class C4395u0 extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5583a;

    /* renamed from: b */
    public List f5584b = Collections.EMPTY_LIST;

    /* renamed from: c */
    public RepeatedFieldBuilderV3 f5585c;

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4395u0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzySource$TouchSource ezySource$TouchSourceBuildPartial = buildPartial();
        if (ezySource$TouchSourceBuildPartial.isInitialized()) {
            return ezySource$TouchSourceBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$TouchSourceBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzySource$TouchSource buildPartial() {
        EzySource$TouchSource ezySource$TouchSource = new EzySource$TouchSource(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5585c;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5583a & 1) != 0) {
                this.f5584b = Collections.unmodifiableList(this.f5584b);
                this.f5583a &= -2;
            }
            ezySource$TouchSource.touchInfo_ = this.f5584b;
        } else {
            ezySource$TouchSource.touchInfo_ = repeatedFieldBuilderV3.build();
        }
        onBuilt();
        return ezySource$TouchSource;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3843e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4395u0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4395u0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder m13728clone() {
        return (C4395u0) super.m13728clone();
    }

    /* renamed from: e */
    public final void m3843e() {
        super.clear();
        this.f5583a = 0;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5585c;
        if (repeatedFieldBuilderV3 == null) {
            this.f5584b = Collections.EMPTY_LIST;
        } else {
            this.f5584b = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5583a &= -2;
    }

    /* renamed from: f */
    public final void m3844f() {
        if ((this.f5583a & 1) == 0) {
            this.f5584b = new ArrayList(this.f5584b);
            this.f5583a |= 1;
        }
    }

    /* renamed from: g */
    public final void m3845g(EzySource$TouchSource ezySource$TouchSource) {
        if (ezySource$TouchSource == EzySource$TouchSource.getDefaultInstance()) {
            return;
        }
        if (this.f5585c == null) {
            if (!ezySource$TouchSource.touchInfo_.isEmpty()) {
                if (this.f5584b.isEmpty()) {
                    this.f5584b = ezySource$TouchSource.touchInfo_;
                    this.f5583a &= -2;
                } else {
                    m3844f();
                    this.f5584b.addAll(ezySource$TouchSource.touchInfo_);
                }
                onChanged();
            }
        } else if (!ezySource$TouchSource.touchInfo_.isEmpty()) {
            if (this.f5585c.isEmpty()) {
                this.f5585c.dispose();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
                this.f5585c = null;
                this.f5584b = ezySource$TouchSource.touchInfo_;
                this.f5583a &= -2;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5585c == null) {
                        this.f5585c = new RepeatedFieldBuilderV3(this.f5584b, (this.f5583a & 1) != 0, getParentForChildren(), isClean());
                        this.f5584b = null;
                    }
                    repeatedFieldBuilderV3 = this.f5585c;
                }
                this.f5585c = repeatedFieldBuilderV3;
            } else {
                this.f5585c.addAllMessages(ezySource$TouchSource.touchInfo_);
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzySource$TouchSource.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3176v1.f1669a;
    }

    /* renamed from: h */
    public final void m3846h(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            EzySource$TouchSource.TouchInfo touchInfo = (EzySource$TouchSource.TouchInfo) codedInputStream.readMessage(EzySource$TouchSource.TouchInfo.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5585c;
                            if (repeatedFieldBuilderV3 == null) {
                                m3844f();
                                this.f5584b.add(touchInfo);
                            } else {
                                repeatedFieldBuilderV3.addMessage(touchInfo);
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

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3176v1.f1670b.ensureFieldAccessorsInitialized(EzySource$TouchSource.class, C4395u0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3846h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4395u0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4395u0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4395u0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4395u0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4395u0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3843e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4395u0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4395u0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder m13728clone() {
        return (C4395u0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzySource$TouchSource.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3846h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4395u0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4395u0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4395u0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4395u0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3843e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4395u0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder m13728clone() {
        return (C4395u0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3846h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4395u0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzySource$TouchSource ezySource$TouchSourceBuildPartial = buildPartial();
        if (ezySource$TouchSourceBuildPartial.isInitialized()) {
            return ezySource$TouchSourceBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$TouchSourceBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3843e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder m13728clone() {
        return (C4395u0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3846h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder m13728clone() {
        return (C4395u0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$TouchSource) {
            m3845g((EzySource$TouchSource) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4395u0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$TouchSource) {
            m3845g((EzySource$TouchSource) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

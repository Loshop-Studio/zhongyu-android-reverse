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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import p020b4.AbstractC3126f;
import p020b4.C3162r;

/* renamed from: com.zykj.board.x */
/* loaded from: classes3.dex */
public final class C4400x extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5594a;

    /* renamed from: b */
    public EzyPageSnapshot$PageSnapshot.GraphSnapshot f5595b;

    /* renamed from: c */
    public SingleFieldBuilderV3 f5596c;

    /* renamed from: d */
    public int f5597d;

    /* renamed from: e */
    public EzyHeader$BackgroundLineConfig f5598e;

    /* renamed from: f */
    public SingleFieldBuilderV3 f5599f;

    public C4400x() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3862g();
            m3861f();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4400x) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyCommand$CommandSource.CommandInfo.REBUILD rebuildBuildPartial = buildPartial();
        if (rebuildBuildPartial.isInitialized()) {
            return rebuildBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) rebuildBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.REBUILD buildPartial() {
        int i;
        EzyCommand$CommandSource.CommandInfo.REBUILD rebuild = new EzyCommand$CommandSource.CommandInfo.REBUILD(this, null);
        int i8 = this.f5594a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5596c;
                rebuild.snapshot_ = singleFieldBuilderV3 == null ? this.f5595b : (EzyPageSnapshot$PageSnapshot.GraphSnapshot) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                rebuild.backgroundColor_ = this.f5597d;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5599f;
                rebuild.backgroundLineConfig_ = singleFieldBuilderV32 == null ? this.f5598e : (EzyHeader$BackgroundLineConfig) singleFieldBuilderV32.build();
                i |= 2;
            }
            EzyCommand$CommandSource.CommandInfo.REBUILD.access$12176(rebuild, i);
        }
        onBuilt();
        return rebuild;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3860e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4400x) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4400x) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4400x) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3860e() {
        super.clear();
        this.f5594a = 0;
        this.f5595b = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5596c;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5596c = null;
        }
        this.f5597d = 0;
        this.f5598e = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5599f;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5599f = null;
        }
    }

    /* renamed from: f */
    public final SingleFieldBuilderV3 m3861f() {
        EzyHeader$BackgroundLineConfig defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5599f;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5598e;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$BackgroundLineConfig.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$BackgroundLineConfig) singleFieldBuilderV3.getMessage();
            }
            this.f5599f = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5598e = null;
        }
        return this.f5599f;
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3862g() {
        EzyPageSnapshot$PageSnapshot.GraphSnapshot defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5596c;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5595b;
                if (defaultInstance == null) {
                    defaultInstance = EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyPageSnapshot$PageSnapshot.GraphSnapshot) singleFieldBuilderV3.getMessage();
            }
            this.f5596c = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5595b = null;
        }
        return this.f5596c;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.REBUILD.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1603w;
    }

    /* renamed from: h */
    public final void m3863h(EzyCommand$CommandSource.CommandInfo.REBUILD rebuild) {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig;
        EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot;
        if (rebuild == EzyCommand$CommandSource.CommandInfo.REBUILD.getDefaultInstance()) {
            return;
        }
        if (rebuild.hasSnapshot()) {
            EzyPageSnapshot$PageSnapshot.GraphSnapshot snapshot = rebuild.getSnapshot();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5596c;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(snapshot);
            } else if ((this.f5594a & 1) == 0 || (graphSnapshot = this.f5595b) == null || graphSnapshot == EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance()) {
                this.f5595b = snapshot;
            } else {
                this.f5594a |= 1;
                onChanged();
                ((C4361d0) m3862g().getBuilder()).m3717l(snapshot);
            }
            if (this.f5595b != null) {
                this.f5594a |= 1;
                onChanged();
            }
        }
        if (rebuild.getBackgroundColor() != 0) {
            this.f5597d = rebuild.getBackgroundColor();
            this.f5594a |= 2;
            onChanged();
        }
        if (rebuild.hasBackgroundLineConfig()) {
            EzyHeader$BackgroundLineConfig backgroundLineConfig = rebuild.getBackgroundLineConfig();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5599f;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(backgroundLineConfig);
            } else if ((this.f5594a & 4) == 0 || (ezyHeader$BackgroundLineConfig = this.f5598e) == null || ezyHeader$BackgroundLineConfig == EzyHeader$BackgroundLineConfig.getDefaultInstance()) {
                this.f5598e = backgroundLineConfig;
            } else {
                this.f5594a |= 4;
                onChanged();
                ((C3162r) m3861f().getBuilder()).m2112g(backgroundLineConfig);
            }
            if (this.f5598e != null) {
                this.f5594a |= 4;
                onChanged();
            }
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3864i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            codedInputStream.readMessage(m3862g().getBuilder(), extensionRegistryLite);
                            this.f5594a |= 1;
                        } else if (tag == 16) {
                            this.f5597d = codedInputStream.readInt32();
                            this.f5594a |= 2;
                        } else if (tag == 26) {
                            codedInputStream.readMessage(m3861f().getBuilder(), extensionRegistryLite);
                            this.f5594a |= 4;
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
        return AbstractC3126f.f1604x.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.REBUILD.class, C4400x.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3864i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4400x) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4400x) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4400x) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4400x) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4400x) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3860e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4400x) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4400x) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4400x) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.REBUILD.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3864i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4400x) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4400x) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4400x) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4400x) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3860e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4400x) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4400x) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3864i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4400x) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyCommand$CommandSource.CommandInfo.REBUILD rebuildBuildPartial = buildPartial();
        if (rebuildBuildPartial.isInitialized()) {
            return rebuildBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) rebuildBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3860e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4400x) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3864i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4400x) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.REBUILD) {
            m3863h((EzyCommand$CommandSource.CommandInfo.REBUILD) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4400x) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.REBUILD) {
            m3863h((EzyCommand$CommandSource.CommandInfo.REBUILD) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

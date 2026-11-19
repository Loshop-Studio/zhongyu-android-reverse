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
import p020b4.AbstractC3126f;
import p020b4.C3162r;

/* renamed from: com.zykj.board.k */
/* loaded from: classes3.dex */
public final class C4374k extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5515a;

    /* renamed from: b */
    public int f5516b;

    /* renamed from: c */
    public int f5517c;

    /* renamed from: d */
    public EzyHeader$BackgroundLineConfig f5518d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5519e;

    /* renamed from: f */
    public EzyHeader$BackgroundLineConfig f5520f;

    /* renamed from: g */
    public SingleFieldBuilderV3 f5521g;

    public C4374k() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3768g();
            m3767f();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4374k) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyCommand$CommandSource.CommandInfo.Config configBuildPartial = buildPartial();
        if (configBuildPartial.isInitialized()) {
            return configBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) configBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.Config buildPartial() {
        int i;
        EzyCommand$CommandSource.CommandInfo.Config config = new EzyCommand$CommandSource.CommandInfo.Config(this, null);
        int i8 = this.f5515a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                config.originBackground_ = this.f5516b;
            }
            if ((i8 & 2) != 0) {
                config.lastBackground_ = this.f5517c;
            }
            if ((i8 & 4) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5519e;
                config.originBackgroundLineConfig_ = singleFieldBuilderV3 == null ? this.f5518d : (EzyHeader$BackgroundLineConfig) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5521g;
                config.lastBackgroundLineConfig_ = singleFieldBuilderV32 == null ? this.f5520f : (EzyHeader$BackgroundLineConfig) singleFieldBuilderV32.build();
                i |= 2;
            }
            EzyCommand$CommandSource.CommandInfo.Config.access$10376(config, i);
        }
        onBuilt();
        return config;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3766e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4374k) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4374k) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4374k) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3766e() {
        super.clear();
        this.f5515a = 0;
        this.f5516b = 0;
        this.f5517c = 0;
        this.f5518d = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5519e;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5519e = null;
        }
        this.f5520f = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5521g;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5521g = null;
        }
    }

    /* renamed from: f */
    public final SingleFieldBuilderV3 m3767f() {
        EzyHeader$BackgroundLineConfig defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5521g;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5520f;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$BackgroundLineConfig.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$BackgroundLineConfig) singleFieldBuilderV3.getMessage();
            }
            this.f5521g = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5520f = null;
        }
        return this.f5521g;
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3768g() {
        EzyHeader$BackgroundLineConfig defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5519e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5518d;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$BackgroundLineConfig.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$BackgroundLineConfig) singleFieldBuilderV3.getMessage();
            }
            this.f5519e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5518d = null;
        }
        return this.f5519e;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.Config.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1599s;
    }

    /* renamed from: h */
    public final void m3769h(EzyCommand$CommandSource.CommandInfo.Config config) {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig;
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig2;
        if (config == EzyCommand$CommandSource.CommandInfo.Config.getDefaultInstance()) {
            return;
        }
        if (config.getOriginBackground() != 0) {
            this.f5516b = config.getOriginBackground();
            this.f5515a |= 1;
            onChanged();
        }
        if (config.getLastBackground() != 0) {
            this.f5517c = config.getLastBackground();
            this.f5515a |= 2;
            onChanged();
        }
        if (config.hasOriginBackgroundLineConfig()) {
            EzyHeader$BackgroundLineConfig originBackgroundLineConfig = config.getOriginBackgroundLineConfig();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5519e;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(originBackgroundLineConfig);
            } else if ((this.f5515a & 4) == 0 || (ezyHeader$BackgroundLineConfig2 = this.f5518d) == null || ezyHeader$BackgroundLineConfig2 == EzyHeader$BackgroundLineConfig.getDefaultInstance()) {
                this.f5518d = originBackgroundLineConfig;
            } else {
                this.f5515a |= 4;
                onChanged();
                ((C3162r) m3768g().getBuilder()).m2112g(originBackgroundLineConfig);
            }
            if (this.f5518d != null) {
                this.f5515a |= 4;
                onChanged();
            }
        }
        if (config.hasLastBackgroundLineConfig()) {
            EzyHeader$BackgroundLineConfig lastBackgroundLineConfig = config.getLastBackgroundLineConfig();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5521g;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(lastBackgroundLineConfig);
            } else if ((this.f5515a & 8) == 0 || (ezyHeader$BackgroundLineConfig = this.f5520f) == null || ezyHeader$BackgroundLineConfig == EzyHeader$BackgroundLineConfig.getDefaultInstance()) {
                this.f5520f = lastBackgroundLineConfig;
            } else {
                this.f5515a |= 8;
                onChanged();
                ((C3162r) m3767f().getBuilder()).m2112g(lastBackgroundLineConfig);
            }
            if (this.f5520f != null) {
                this.f5515a |= 8;
                onChanged();
            }
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3770i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.f5516b = codedInputStream.readInt32();
                            this.f5515a |= 1;
                        } else if (tag == 16) {
                            this.f5517c = codedInputStream.readInt32();
                            this.f5515a |= 2;
                        } else if (tag == 26) {
                            codedInputStream.readMessage(m3768g().getBuilder(), extensionRegistryLite);
                            this.f5515a |= 4;
                        } else if (tag == 34) {
                            codedInputStream.readMessage(m3767f().getBuilder(), extensionRegistryLite);
                            this.f5515a |= 8;
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
        return AbstractC3126f.f1600t.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.Config.class, C4374k.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3770i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4374k) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4374k) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4374k) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4374k) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4374k) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3766e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4374k) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4374k) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4374k) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.Config.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3770i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4374k) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4374k) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4374k) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4374k) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3766e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4374k) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4374k) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3770i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4374k) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyCommand$CommandSource.CommandInfo.Config configBuildPartial = buildPartial();
        if (configBuildPartial.isInitialized()) {
            return configBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) configBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3766e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4374k) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3770i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4374k) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.Config) {
            m3769h((EzyCommand$CommandSource.CommandInfo.Config) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4374k) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.Config) {
            m3769h((EzyCommand$CommandSource.CommandInfo.Config) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

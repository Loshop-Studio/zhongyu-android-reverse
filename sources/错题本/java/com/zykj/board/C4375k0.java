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
import com.zykj.board.EzySource$FileSource;
import p020b4.AbstractC3176v1;
import p020b4.InterfaceC3149m1;

/* renamed from: com.zykj.board.k0 */
/* loaded from: classes3.dex */
public final class C4375k0 extends GeneratedMessageV3.Builder implements InterfaceC3149m1 {

    /* renamed from: a */
    public int f5522a;

    /* renamed from: c */
    public int f5524c;

    /* renamed from: d */
    public int f5525d;

    /* renamed from: b */
    public Object f5523b = "";

    /* renamed from: e */
    public Object f5526e = "";

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4375k0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzySource$FileSource.FileInfo build() {
        EzySource$FileSource.FileInfo fileInfoBuildPartial = buildPartial();
        if (fileInfoBuildPartial.isInitialized()) {
            return fileInfoBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileInfoBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3773f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4375k0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4375k0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4375k0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzySource$FileSource.FileInfo buildPartial() {
        EzySource$FileSource.FileInfo fileInfo = new EzySource$FileSource.FileInfo(this, null);
        int i = this.f5522a;
        if (i != 0) {
            if ((i & 1) != 0) {
                fileInfo.name_ = this.f5523b;
            }
            if ((i & 2) != 0) {
                fileInfo.width_ = this.f5524c;
            }
            if ((i & 4) != 0) {
                fileInfo.height_ = this.f5525d;
            }
            if ((i & 8) != 0) {
                fileInfo.validate_ = this.f5526e;
            }
        }
        onBuilt();
        return fileInfo;
    }

    /* renamed from: f */
    public final void m3773f() {
        super.clear();
        this.f5522a = 0;
        this.f5523b = "";
        this.f5524c = 0;
        this.f5525d = 0;
        this.f5526e = "";
    }

    /* renamed from: g */
    public final void m3774g(EzySource$FileSource.FileInfo fileInfo) {
        if (fileInfo == EzySource$FileSource.FileInfo.getDefaultInstance()) {
            return;
        }
        if (!fileInfo.getName().isEmpty()) {
            this.f5523b = fileInfo.name_;
            this.f5522a |= 1;
            onChanged();
        }
        if (fileInfo.getWidth() != 0) {
            this.f5524c = fileInfo.getWidth();
            this.f5522a |= 2;
            onChanged();
        }
        if (fileInfo.getHeight() != 0) {
            this.f5525d = fileInfo.getHeight();
            this.f5522a |= 4;
            onChanged();
        }
        if (!fileInfo.getValidate().isEmpty()) {
            this.f5526e = fileInfo.validate_;
            this.f5522a |= 8;
            onChanged();
        }
        onChanged();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzySource$FileSource.FileInfo.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3176v1.f1679k;
    }

    /* renamed from: h */
    public final void m3775h(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            this.f5523b = codedInputStream.readStringRequireUtf8();
                            this.f5522a |= 1;
                        } else if (tag == 16) {
                            this.f5524c = codedInputStream.readInt32();
                            this.f5522a |= 2;
                        } else if (tag == 24) {
                            this.f5525d = codedInputStream.readInt32();
                            this.f5522a |= 4;
                        } else if (tag == 34) {
                            this.f5526e = codedInputStream.readStringRequireUtf8();
                            this.f5522a |= 8;
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
        return AbstractC3176v1.f1680l.ensureFieldAccessorsInitialized(EzySource$FileSource.FileInfo.class, C4375k0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3775h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4375k0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4375k0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4375k0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4375k0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4375k0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3773f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4375k0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4375k0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4375k0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzySource$FileSource.FileInfo.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3775h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4375k0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4375k0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4375k0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4375k0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3773f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4375k0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4375k0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3775h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4375k0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3773f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4375k0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3775h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4375k0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$FileSource.FileInfo) {
            m3774g((EzySource$FileSource.FileInfo) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4375k0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzySource$FileSource.FileInfo) {
            m3774g((EzySource$FileSource.FileInfo) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

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
import p020b4.C3115b0;

/* renamed from: com.zykj.board.g */
/* loaded from: classes3.dex */
public final class C4366g extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5497a;

    /* renamed from: b */
    public EzyMatrix$Matrix f5498b;

    /* renamed from: c */
    public SingleFieldBuilderV3 f5499c;

    /* renamed from: d */
    public EzyMatrix$Matrix f5500d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5501e;

    public C4366g() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3744g();
            m3743f();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4366g) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyCommand$CommandSource.CommandInfo.Camera cameraBuildPartial = buildPartial();
        if (cameraBuildPartial.isInitialized()) {
            return cameraBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.Camera buildPartial() {
        int i;
        EzyCommand$CommandSource.CommandInfo.Camera camera = new EzyCommand$CommandSource.CommandInfo.Camera(this, null);
        int i8 = this.f5497a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5499c;
                camera.originMatrix_ = singleFieldBuilderV3 == null ? this.f5498b : (EzyMatrix$Matrix) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5501e;
                camera.lastMatrix_ = singleFieldBuilderV32 == null ? this.f5500d : (EzyMatrix$Matrix) singleFieldBuilderV32.build();
                i |= 2;
            }
            EzyCommand$CommandSource.CommandInfo.Camera.access$9276(camera, i);
        }
        onBuilt();
        return camera;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3742e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4366g) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4366g) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4366g) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3742e() {
        super.clear();
        this.f5497a = 0;
        this.f5498b = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5499c;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5499c = null;
        }
        this.f5500d = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5501e;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5501e = null;
        }
    }

    /* renamed from: f */
    public final SingleFieldBuilderV3 m3743f() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5501e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5500d;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5501e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5500d = null;
        }
        return this.f5501e;
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3744g() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5499c;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5498b;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5499c = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5498b = null;
        }
        return this.f5499c;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.Camera.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1597q;
    }

    /* renamed from: h */
    public final void m3745h(EzyCommand$CommandSource.CommandInfo.Camera camera) {
        EzyMatrix$Matrix ezyMatrix$Matrix;
        EzyMatrix$Matrix ezyMatrix$Matrix2;
        if (camera == EzyCommand$CommandSource.CommandInfo.Camera.getDefaultInstance()) {
            return;
        }
        if (camera.hasOriginMatrix()) {
            EzyMatrix$Matrix originMatrix = camera.getOriginMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5499c;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(originMatrix);
            } else if ((this.f5497a & 1) == 0 || (ezyMatrix$Matrix2 = this.f5498b) == null || ezyMatrix$Matrix2 == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5498b = originMatrix;
            } else {
                this.f5497a |= 1;
                onChanged();
                ((C3115b0) m3744g().getBuilder()).m2073g(originMatrix);
            }
            if (this.f5498b != null) {
                this.f5497a |= 1;
                onChanged();
            }
        }
        if (camera.hasLastMatrix()) {
            EzyMatrix$Matrix lastMatrix = camera.getLastMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5501e;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(lastMatrix);
            } else if ((this.f5497a & 2) == 0 || (ezyMatrix$Matrix = this.f5500d) == null || ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5500d = lastMatrix;
            } else {
                this.f5497a |= 2;
                onChanged();
                ((C3115b0) m3743f().getBuilder()).m2073g(lastMatrix);
            }
            if (this.f5500d != null) {
                this.f5497a |= 2;
                onChanged();
            }
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3746i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            codedInputStream.readMessage(m3744g().getBuilder(), extensionRegistryLite);
                            this.f5497a |= 1;
                        } else if (tag == 18) {
                            codedInputStream.readMessage(m3743f().getBuilder(), extensionRegistryLite);
                            this.f5497a |= 2;
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
        return AbstractC3126f.f1598r.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.Camera.class, C4366g.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3746i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4366g) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4366g) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4366g) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4366g) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4366g) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3742e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4366g) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4366g) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4366g) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.Camera.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3746i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4366g) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4366g) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4366g) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4366g) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3742e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4366g) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4366g) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3746i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4366g) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyCommand$CommandSource.CommandInfo.Camera cameraBuildPartial = buildPartial();
        if (cameraBuildPartial.isInitialized()) {
            return cameraBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3742e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4366g) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3746i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4366g) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.Camera) {
            m3745h((EzyCommand$CommandSource.CommandInfo.Camera) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4366g) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.Camera) {
            m3745h((EzyCommand$CommandSource.CommandInfo.Camera) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

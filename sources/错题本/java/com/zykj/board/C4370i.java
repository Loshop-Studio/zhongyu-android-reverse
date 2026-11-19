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

/* renamed from: com.zykj.board.i */
/* loaded from: classes3.dex */
public final class C4370i extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5505a;

    /* renamed from: b */
    public EzyMatrix$Matrix f5506b;

    /* renamed from: c */
    public SingleFieldBuilderV3 f5507c;

    /* renamed from: d */
    public EzyMatrix$Matrix f5508d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5509e;

    /* renamed from: f */
    public Object f5510f = "";

    /* renamed from: g */
    public int f5511g;

    public C4370i() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3757g();
            m3756f();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4370i) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyCommand$CommandSource.CommandInfo.CameraMatrix cameraMatrixBuildPartial = buildPartial();
        if (cameraMatrixBuildPartial.isInitialized()) {
            return cameraMatrixBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraMatrixBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyCommand$CommandSource.CommandInfo.CameraMatrix buildPartial() {
        int i;
        EzyCommand$CommandSource.CommandInfo.CameraMatrix cameraMatrix = new EzyCommand$CommandSource.CommandInfo.CameraMatrix(this, null);
        int i8 = this.f5505a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5507c;
                cameraMatrix.originMatrix_ = singleFieldBuilderV3 == null ? this.f5506b : (EzyMatrix$Matrix) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5509e;
                cameraMatrix.lastMatrix_ = singleFieldBuilderV32 == null ? this.f5508d : (EzyMatrix$Matrix) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i8 & 4) != 0) {
                cameraMatrix.sourceFileName_ = this.f5510f;
            }
            if ((i8 & 8) != 0) {
                cameraMatrix.sourceId_ = this.f5511g;
            }
            EzyCommand$CommandSource.CommandInfo.CameraMatrix.access$8276(cameraMatrix, i);
        }
        onBuilt();
        return cameraMatrix;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3755e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4370i) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4370i) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4370i) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3755e() {
        super.clear();
        this.f5505a = 0;
        this.f5506b = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5507c;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5507c = null;
        }
        this.f5508d = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5509e;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5509e = null;
        }
        this.f5510f = "";
        this.f5511g = 0;
    }

    /* renamed from: f */
    public final SingleFieldBuilderV3 m3756f() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5509e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5508d;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5509e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5508d = null;
        }
        return this.f5509e;
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3757g() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5507c;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5506b;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5507c = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5506b = null;
        }
        return this.f5507c;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.CameraMatrix.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3126f.f1595o;
    }

    /* renamed from: h */
    public final void m3758h(EzyCommand$CommandSource.CommandInfo.CameraMatrix cameraMatrix) {
        EzyMatrix$Matrix ezyMatrix$Matrix;
        EzyMatrix$Matrix ezyMatrix$Matrix2;
        if (cameraMatrix == EzyCommand$CommandSource.CommandInfo.CameraMatrix.getDefaultInstance()) {
            return;
        }
        if (cameraMatrix.hasOriginMatrix()) {
            EzyMatrix$Matrix originMatrix = cameraMatrix.getOriginMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5507c;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(originMatrix);
            } else if ((this.f5505a & 1) == 0 || (ezyMatrix$Matrix2 = this.f5506b) == null || ezyMatrix$Matrix2 == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5506b = originMatrix;
            } else {
                this.f5505a |= 1;
                onChanged();
                ((C3115b0) m3757g().getBuilder()).m2073g(originMatrix);
            }
            if (this.f5506b != null) {
                this.f5505a |= 1;
                onChanged();
            }
        }
        if (cameraMatrix.hasLastMatrix()) {
            EzyMatrix$Matrix lastMatrix = cameraMatrix.getLastMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5509e;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(lastMatrix);
            } else if ((this.f5505a & 2) == 0 || (ezyMatrix$Matrix = this.f5508d) == null || ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5508d = lastMatrix;
            } else {
                this.f5505a |= 2;
                onChanged();
                ((C3115b0) m3756f().getBuilder()).m2073g(lastMatrix);
            }
            if (this.f5508d != null) {
                this.f5505a |= 2;
                onChanged();
            }
        }
        if (!cameraMatrix.getSourceFileName().isEmpty()) {
            this.f5510f = cameraMatrix.sourceFileName_;
            this.f5505a |= 4;
            onChanged();
        }
        if (cameraMatrix.getSourceId() != 0) {
            this.f5511g = cameraMatrix.getSourceId();
            this.f5505a |= 8;
            onChanged();
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3759i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            codedInputStream.readMessage(m3757g().getBuilder(), extensionRegistryLite);
                            this.f5505a |= 1;
                        } else if (tag == 18) {
                            codedInputStream.readMessage(m3756f().getBuilder(), extensionRegistryLite);
                            this.f5505a |= 2;
                        } else if (tag == 26) {
                            this.f5510f = codedInputStream.readStringRequireUtf8();
                            this.f5505a |= 4;
                        } else if (tag == 32) {
                            this.f5511g = codedInputStream.readInt32();
                            this.f5505a |= 8;
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
        return AbstractC3126f.f1596p.ensureFieldAccessorsInitialized(EzyCommand$CommandSource.CommandInfo.CameraMatrix.class, C4370i.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3759i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4370i) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4370i) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4370i) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4370i) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4370i) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3755e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4370i) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4370i) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4370i) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyCommand$CommandSource.CommandInfo.CameraMatrix.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3759i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4370i) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4370i) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4370i) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4370i) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3755e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4370i) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4370i) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3759i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4370i) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyCommand$CommandSource.CommandInfo.CameraMatrix cameraMatrixBuildPartial = buildPartial();
        if (cameraMatrixBuildPartial.isInitialized()) {
            return cameraMatrixBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraMatrixBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3755e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4370i) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3759i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4370i) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.CameraMatrix) {
            m3758h((EzyCommand$CommandSource.CommandInfo.CameraMatrix) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4370i) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyCommand$CommandSource.CommandInfo.CameraMatrix) {
            m3758h((EzyCommand$CommandSource.CommandInfo.CameraMatrix) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

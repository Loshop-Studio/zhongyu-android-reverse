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
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import p020b4.AbstractC3148m0;
import p020b4.C3115b0;

/* renamed from: com.zykj.board.b0 */
/* loaded from: classes3.dex */
public final class C4355b0 extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5446a;

    /* renamed from: b */
    public EzyMatrix$Matrix f5447b;

    /* renamed from: c */
    public SingleFieldBuilderV3 f5448c;

    /* renamed from: d */
    public EzyPageSnapshot$PageSnapshot.GraphSnapshot f5449d;

    /* renamed from: e */
    public SingleFieldBuilderV3 f5450e;

    public C4355b0() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m3695g();
            getGraphSnapshotFieldBuilder();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4355b0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyPageSnapshot$PageSnapshot build() {
        EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshotBuildPartial = buildPartial();
        if (ezyPageSnapshot$PageSnapshotBuildPartial.isInitialized()) {
            return ezyPageSnapshot$PageSnapshotBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyPageSnapshot$PageSnapshotBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3694f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4355b0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4355b0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder m13728clone() {
        return (C4355b0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzyPageSnapshot$PageSnapshot buildPartial() {
        int i;
        EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshot = new EzyPageSnapshot$PageSnapshot(this, null);
        int i8 = this.f5446a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5448c;
                ezyPageSnapshot$PageSnapshot.cameraMatrix_ = singleFieldBuilderV3 == null ? this.f5447b : (EzyMatrix$Matrix) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5450e;
                ezyPageSnapshot$PageSnapshot.graphSnapshot_ = singleFieldBuilderV32 == null ? this.f5449d : (EzyPageSnapshot$PageSnapshot.GraphSnapshot) singleFieldBuilderV32.build();
                i |= 2;
            }
            EzyPageSnapshot$PageSnapshot.access$3376(ezyPageSnapshot$PageSnapshot, i);
        }
        onBuilt();
        return ezyPageSnapshot$PageSnapshot;
    }

    /* renamed from: f */
    public final void m3694f() {
        super.clear();
        this.f5446a = 0;
        this.f5447b = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5448c;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f5448c = null;
        }
        this.f5449d = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5450e;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f5450e = null;
        }
    }

    /* renamed from: g */
    public final SingleFieldBuilderV3 m3695g() {
        EzyMatrix$Matrix defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5448c;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5447b;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            this.f5448c = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5447b = null;
        }
        return this.f5448c;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyPageSnapshot$PageSnapshot.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3148m0.f1619a;
    }

    public final SingleFieldBuilderV3 getGraphSnapshotFieldBuilder() {
        EzyPageSnapshot$PageSnapshot.GraphSnapshot defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5450e;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f5449d;
                if (defaultInstance == null) {
                    defaultInstance = EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyPageSnapshot$PageSnapshot.GraphSnapshot) singleFieldBuilderV3.getMessage();
            }
            this.f5450e = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f5449d = null;
        }
        return this.f5450e;
    }

    /* renamed from: h */
    public final void m3696h(EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshot) {
        EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot;
        EzyMatrix$Matrix ezyMatrix$Matrix;
        if (ezyPageSnapshot$PageSnapshot == EzyPageSnapshot$PageSnapshot.getDefaultInstance()) {
            return;
        }
        if (ezyPageSnapshot$PageSnapshot.hasCameraMatrix()) {
            EzyMatrix$Matrix cameraMatrix = ezyPageSnapshot$PageSnapshot.getCameraMatrix();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5448c;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(cameraMatrix);
            } else if ((this.f5446a & 1) == 0 || (ezyMatrix$Matrix = this.f5447b) == null || ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
                this.f5447b = cameraMatrix;
            } else {
                this.f5446a |= 1;
                onChanged();
                ((C3115b0) m3695g().getBuilder()).m2073g(cameraMatrix);
            }
            if (this.f5447b != null) {
                this.f5446a |= 1;
                onChanged();
            }
        }
        if (ezyPageSnapshot$PageSnapshot.hasGraphSnapshot()) {
            EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot2 = ezyPageSnapshot$PageSnapshot.getGraphSnapshot();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f5450e;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(graphSnapshot2);
            } else if ((this.f5446a & 2) == 0 || (graphSnapshot = this.f5449d) == null || graphSnapshot == EzyPageSnapshot$PageSnapshot.GraphSnapshot.getDefaultInstance()) {
                this.f5449d = graphSnapshot2;
            } else {
                this.f5446a |= 2;
                onChanged();
                ((C4361d0) getGraphSnapshotFieldBuilder().getBuilder()).m3717l(graphSnapshot2);
            }
            if (this.f5449d != null) {
                this.f5446a |= 2;
                onChanged();
            }
        }
        onChanged();
    }

    /* renamed from: i */
    public final void m3697i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            codedInputStream.readMessage(m3695g().getBuilder(), extensionRegistryLite);
                            this.f5446a |= 1;
                        } else if (tag == 18) {
                            codedInputStream.readMessage(getGraphSnapshotFieldBuilder().getBuilder(), extensionRegistryLite);
                            this.f5446a |= 2;
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
        return AbstractC3148m0.f1620b.ensureFieldAccessorsInitialized(EzyPageSnapshot$PageSnapshot.class, C4355b0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m3698j(EzyMatrix$Matrix ezyMatrix$Matrix) {
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5448c;
        if (singleFieldBuilderV3 == null) {
            ezyMatrix$Matrix.getClass();
            this.f5447b = ezyMatrix$Matrix;
        } else {
            singleFieldBuilderV3.setMessage(ezyMatrix$Matrix);
        }
        this.f5446a |= 1;
        onChanged();
    }

    /* renamed from: k */
    public final void m3699k(EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot) {
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f5450e;
        if (singleFieldBuilderV3 == null) {
            this.f5449d = graphSnapshot;
        } else {
            singleFieldBuilderV3.setMessage(graphSnapshot);
        }
        this.f5446a |= 2;
        onChanged();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3697i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4355b0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4355b0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4355b0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4355b0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4355b0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3694f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4355b0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4355b0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder m13728clone() {
        return (C4355b0) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyPageSnapshot$PageSnapshot.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3697i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4355b0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4355b0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4355b0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4355b0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3694f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4355b0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder m13728clone() {
        return (C4355b0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3697i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4355b0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3694f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder m13728clone() {
        return (C4355b0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3697i(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder m13728clone() {
        return (C4355b0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyPageSnapshot$PageSnapshot) {
            m3696h((EzyPageSnapshot$PageSnapshot) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4355b0) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyPageSnapshot$PageSnapshot) {
            m3696h((EzyPageSnapshot$PageSnapshot) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

package p020b4;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.zykj.board.EzyMatrix$Matrix;

/* renamed from: b4.b0 */
/* loaded from: classes3.dex */
public final class C3115b0 extends GeneratedMessageV3.Builder implements InterfaceC3118c0 {

    /* renamed from: a */
    public int f1559a;

    /* renamed from: b */
    public long f1560b;

    /* renamed from: c */
    public float f1561c;

    /* renamed from: d */
    public float f1562d;

    /* renamed from: e */
    public float f1563e;

    /* renamed from: f */
    public float f1564f;

    /* renamed from: g */
    public float f1565g;

    /* renamed from: h */
    public float f1566h;

    /* renamed from: i */
    public float f1567i;

    /* renamed from: j */
    public float f1568j;

    /* renamed from: k */
    public float f1569k;

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3115b0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyMatrix$Matrix build() {
        EzyMatrix$Matrix ezyMatrix$MatrixBuildPartial = buildPartial();
        if (ezyMatrix$MatrixBuildPartial.isInitialized()) {
            return ezyMatrix$MatrixBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyMatrix$MatrixBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m2072f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C3115b0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3115b0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C3115b0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzyMatrix$Matrix buildPartial() {
        EzyMatrix$Matrix ezyMatrix$Matrix = new EzyMatrix$Matrix(this, null);
        int i = this.f1559a;
        if (i != 0) {
            if ((i & 1) != 0) {
                ezyMatrix$Matrix.eventTime_ = this.f1560b;
            }
            if ((i & 2) != 0) {
                ezyMatrix$Matrix.scaleX_ = this.f1561c;
            }
            if ((i & 4) != 0) {
                ezyMatrix$Matrix.skewX_ = this.f1562d;
            }
            if ((i & 8) != 0) {
                ezyMatrix$Matrix.transX_ = this.f1563e;
            }
            if ((i & 16) != 0) {
                ezyMatrix$Matrix.skewY_ = this.f1564f;
            }
            if ((i & 32) != 0) {
                ezyMatrix$Matrix.scaleY_ = this.f1565g;
            }
            if ((i & 64) != 0) {
                ezyMatrix$Matrix.transY_ = this.f1566h;
            }
            if ((i & 128) != 0) {
                ezyMatrix$Matrix.perSp0_ = this.f1567i;
            }
            if ((i & 256) != 0) {
                ezyMatrix$Matrix.perSp1_ = this.f1568j;
            }
            if ((i & 512) != 0) {
                ezyMatrix$Matrix.perSp2_ = this.f1569k;
            }
        }
        onBuilt();
        return ezyMatrix$Matrix;
    }

    /* renamed from: f */
    public final void m2072f() {
        super.clear();
        this.f1559a = 0;
        this.f1560b = 0L;
        this.f1561c = 0.0f;
        this.f1562d = 0.0f;
        this.f1563e = 0.0f;
        this.f1564f = 0.0f;
        this.f1565g = 0.0f;
        this.f1566h = 0.0f;
        this.f1567i = 0.0f;
        this.f1568j = 0.0f;
        this.f1569k = 0.0f;
    }

    /* renamed from: g */
    public final void m2073g(EzyMatrix$Matrix ezyMatrix$Matrix) {
        if (ezyMatrix$Matrix == EzyMatrix$Matrix.getDefaultInstance()) {
            return;
        }
        if (ezyMatrix$Matrix.getEventTime() != 0) {
            m2075i(ezyMatrix$Matrix.getEventTime());
        }
        if (ezyMatrix$Matrix.getScaleX() != 0.0f) {
            m2079m(ezyMatrix$Matrix.getScaleX());
        }
        if (ezyMatrix$Matrix.getSkewX() != 0.0f) {
            m2081o(ezyMatrix$Matrix.getSkewX());
        }
        if (ezyMatrix$Matrix.getTransX() != 0.0f) {
            m2083q(ezyMatrix$Matrix.getTransX());
        }
        if (ezyMatrix$Matrix.getSkewY() != 0.0f) {
            m2082p(ezyMatrix$Matrix.getSkewY());
        }
        if (ezyMatrix$Matrix.getScaleY() != 0.0f) {
            m2080n(ezyMatrix$Matrix.getScaleY());
        }
        if (ezyMatrix$Matrix.getTransY() != 0.0f) {
            m2084r(ezyMatrix$Matrix.getTransY());
        }
        if (ezyMatrix$Matrix.getPerSp0() != 0.0f) {
            m2076j(ezyMatrix$Matrix.getPerSp0());
        }
        if (ezyMatrix$Matrix.getPerSp1() != 0.0f) {
            m2077k(ezyMatrix$Matrix.getPerSp1());
        }
        if (ezyMatrix$Matrix.getPerSp2() != 0.0f) {
            m2078l(ezyMatrix$Matrix.getPerSp2());
        }
        onChanged();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyMatrix$Matrix.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3121d0.f1575a;
    }

    /* renamed from: h */
    public final void m2074h(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    switch (tag) {
                        case 0:
                            z8 = true;
                        case 8:
                            this.f1560b = codedInputStream.readInt64();
                            this.f1559a |= 1;
                        case 21:
                            this.f1561c = codedInputStream.readFloat();
                            this.f1559a |= 2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            this.f1562d = codedInputStream.readFloat();
                            this.f1559a |= 4;
                        case 37:
                            this.f1563e = codedInputStream.readFloat();
                            this.f1559a |= 8;
                        case 45:
                            this.f1564f = codedInputStream.readFloat();
                            this.f1559a |= 16;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            this.f1565g = codedInputStream.readFloat();
                            this.f1559a |= 32;
                        case 61:
                            this.f1566h = codedInputStream.readFloat();
                            this.f1559a |= 64;
                        case 69:
                            this.f1567i = codedInputStream.readFloat();
                            this.f1559a |= 128;
                        case 77:
                            this.f1568j = codedInputStream.readFloat();
                            this.f1559a |= 256;
                        case 85:
                            this.f1569k = codedInputStream.readFloat();
                            this.f1559a |= 512;
                        default:
                            if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z8 = true;
                            }
                    }
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
    public final void m2075i(long j7) {
        this.f1560b = j7;
        this.f1559a |= 1;
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3121d0.f1576b.ensureFieldAccessorsInitialized(EzyMatrix$Matrix.class, C3115b0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m2076j(float f) {
        this.f1567i = f;
        this.f1559a |= 128;
        onChanged();
    }

    /* renamed from: k */
    public final void m2077k(float f) {
        this.f1568j = f;
        this.f1559a |= 256;
        onChanged();
    }

    /* renamed from: l */
    public final void m2078l(float f) {
        this.f1569k = f;
        this.f1559a |= 512;
        onChanged();
    }

    /* renamed from: m */
    public final void m2079m(float f) {
        this.f1561c = f;
        this.f1559a |= 2;
        onChanged();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2074h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3115b0) super.mergeUnknownFields(unknownFieldSet);
    }

    /* renamed from: n */
    public final void m2080n(float f) {
        this.f1565g = f;
        this.f1559a |= 32;
        onChanged();
    }

    /* renamed from: o */
    public final void m2081o(float f) {
        this.f1562d = f;
        this.f1559a |= 4;
        onChanged();
    }

    /* renamed from: p */
    public final void m2082p(float f) {
        this.f1564f = f;
        this.f1559a |= 16;
        onChanged();
    }

    /* renamed from: q */
    public final void m2083q(float f) {
        this.f1563e = f;
        this.f1559a |= 8;
        onChanged();
    }

    /* renamed from: r */
    public final void m2084r(float f) {
        this.f1566h = f;
        this.f1559a |= 64;
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3115b0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C3115b0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3115b0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3115b0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m2072f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C3115b0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3115b0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C3115b0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyMatrix$Matrix.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2074h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3115b0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3115b0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C3115b0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3115b0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m2072f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3115b0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C3115b0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2074h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3115b0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m2072f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C3115b0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2074h(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C3115b0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyMatrix$Matrix) {
            m2073g((EzyMatrix$Matrix) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone, reason: collision with other method in class */
    public final Object mo13724clone() {
        return (C3115b0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyMatrix$Matrix) {
            m2073g((EzyMatrix$Matrix) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}

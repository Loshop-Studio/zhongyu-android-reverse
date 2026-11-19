package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AnyProto;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class EzyRectF {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9369a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9370b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9371c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/RectF.proto\u001a\u0019google/protobuf/any.proto\"A\n\u0005RectF\u0012\f\n\u0004left\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003top\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyRectFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class RectF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final RectF f9372f = new RectF();

        /* renamed from: g */
        public static final Parser f9373g = new C7239a();

        /* renamed from: a */
        public float f9374a;

        /* renamed from: b */
        public float f9375b;

        /* renamed from: c */
        public float f9376c;

        /* renamed from: d */
        public float f9377d;

        /* renamed from: e */
        public byte f9378e;

        /* renamed from: com.zykj.board.EzyRectF$RectF$a */
        public class C7239a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RectF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7240b c7240bM8548h = RectF.m8548h();
                try {
                    c7240bM8548h.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7240bM8548h.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7240bM8548h.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7240bM8548h.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7240bM8548h.buildPartial());
                }
            }
        }

        /* renamed from: e */
        public static RectF m8547e() {
            return f9372f;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRectF.f9369a;
        }

        /* renamed from: h */
        public static C7240b m8548h() {
            return f9372f.toBuilder();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RectF)) {
                return super.equals(obj);
            }
            RectF rectF = (RectF) obj;
            return Float.floatToIntBits(getLeft()) == Float.floatToIntBits(rectF.getLeft()) && Float.floatToIntBits(getTop()) == Float.floatToIntBits(rectF.getTop()) && Float.floatToIntBits(getRight()) == Float.floatToIntBits(rectF.getRight()) && Float.floatToIntBits(getBottom()) == Float.floatToIntBits(rectF.getBottom()) && getUnknownFields().equals(rectF.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public RectF getDefaultInstanceForType() {
            return f9372f;
        }

        public float getBottom() {
            return this.f9377d;
        }

        public float getLeft() {
            return this.f9374a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9373g;
        }

        public float getRight() {
            return this.f9376c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f9374a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9374a) : 0;
            if (Float.floatToRawIntBits(this.f9375b) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f9375b);
            }
            if (Float.floatToRawIntBits(this.f9376c) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f9376c);
            }
            if (Float.floatToRawIntBits(this.f9377d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f9377d);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getTop() {
            return this.f9375b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getLeft())) * 37) + 2) * 53) + Float.floatToIntBits(getTop())) * 37) + 3) * 53) + Float.floatToIntBits(getRight())) * 37) + 4) * 53) + Float.floatToIntBits(getBottom())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C7240b newBuilderForType() {
            return m8548h();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRectF.f9370b.ensureFieldAccessorsInitialized(RectF.class, C7240b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9378e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9378e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7240b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7240b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7240b toBuilder() {
            return this == f9372f ? new C7240b() : new C7240b().m8565o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RectF();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (Float.floatToRawIntBits(this.f9374a) != 0) {
                codedOutputStream.writeFloat(1, this.f9374a);
            }
            if (Float.floatToRawIntBits(this.f9375b) != 0) {
                codedOutputStream.writeFloat(2, this.f9375b);
            }
            if (Float.floatToRawIntBits(this.f9376c) != 0) {
                codedOutputStream.writeFloat(3, this.f9376c);
            }
            if (Float.floatToRawIntBits(this.f9377d) != 0) {
                codedOutputStream.writeFloat(4, this.f9377d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRectF$RectF$b */
        public static final class C7240b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9379a;

            /* renamed from: b */
            public float f9380b;

            /* renamed from: c */
            public float f9381c;

            /* renamed from: d */
            public float f9382d;

            /* renamed from: e */
            public float f9383e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7240b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7240b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public RectF build() {
                RectF rectFBuildPartial = buildPartial();
                if (rectFBuildPartial.isInitialized()) {
                    return rectFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rectFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public RectF buildPartial() {
                RectF rectF = new RectF(this);
                if (this.f9379a != 0) {
                    m8557g(rectF);
                }
                onBuilt();
                return rectF;
            }

            /* renamed from: g */
            public final void m8557g(RectF rectF) {
                int i10 = this.f9379a;
                if ((i10 & 1) != 0) {
                    rectF.f9374a = this.f9380b;
                }
                if ((i10 & 2) != 0) {
                    rectF.f9375b = this.f9381c;
                }
                if ((i10 & 4) != 0) {
                    rectF.f9376c = this.f9382d;
                }
                if ((i10 & 8) != 0) {
                    rectF.f9377d = this.f9383e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRectF.f9369a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7240b clear() {
                super.clear();
                this.f9379a = 0;
                this.f9380b = 0.0f;
                this.f9381c = 0.0f;
                this.f9382d = 0.0f;
                this.f9383e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7240b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7240b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRectF.f9370b.ensureFieldAccessorsInitialized(RectF.class, C7240b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7240b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7240b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7240b mo27381clone() {
                return (C7240b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public RectF getDefaultInstanceForType() {
                return RectF.m8547e();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7240b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f9380b = codedInputStream.readFloat();
                                    this.f9379a |= 1;
                                } else if (tag == 21) {
                                    this.f9381c = codedInputStream.readFloat();
                                    this.f9379a |= 2;
                                } else if (tag == 29) {
                                    this.f9382d = codedInputStream.readFloat();
                                    this.f9379a |= 4;
                                } else if (tag == 37) {
                                    this.f9383e = codedInputStream.readFloat();
                                    this.f9379a |= 8;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7240b mergeFrom(Message message) {
                if (message instanceof RectF) {
                    return m8565o((RectF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7240b m8565o(RectF rectF) {
                if (rectF == RectF.m8547e()) {
                    return this;
                }
                if (rectF.getLeft() != 0.0f) {
                    m8569s(rectF.getLeft());
                }
                if (rectF.getTop() != 0.0f) {
                    m8572v(rectF.getTop());
                }
                if (rectF.getRight() != 0.0f) {
                    m8571u(rectF.getRight());
                }
                if (rectF.getBottom() != 0.0f) {
                    m8567q(rectF.getBottom());
                }
                mergeUnknownFields(rectF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7240b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7240b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7240b m8567q(float f10) {
                this.f9383e = f10;
                this.f9379a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7240b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7240b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C7240b m8569s(float f10) {
                this.f9380b = f10;
                this.f9379a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7240b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7240b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: u */
            public C7240b m8571u(float f10) {
                this.f9382d = f10;
                this.f9379a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7240b m8572v(float f10) {
                this.f9381c = f10;
                this.f9379a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7240b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7240b) super.setUnknownFields(unknownFieldSet);
            }

            public C7240b() {
            }

            public C7240b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public RectF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9374a = 0.0f;
            this.f9375b = 0.0f;
            this.f9376c = 0.0f;
            this.f9377d = 0.0f;
            this.f9378e = (byte) -1;
        }

        private RectF() {
            this.f9374a = 0.0f;
            this.f9375b = 0.0f;
            this.f9376c = 0.0f;
            this.f9377d = 0.0f;
            this.f9378e = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8542c().getMessageTypes().get(0);
        f9369a = descriptor;
        f9370b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Left", "Top", "Right", "Bottom"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8542c() {
        return f9371c;
    }
}

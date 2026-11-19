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
    public static final Descriptors.Descriptor f9642a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9643b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9644c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/RectF.proto\u001a\u0019google/protobuf/any.proto\"A\n\u0005RectF\u0012\f\n\u0004left\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003top\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyRectFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class RectF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final RectF f9645f = new RectF();

        /* renamed from: g */
        public static final Parser f9646g = new C7129a();

        /* renamed from: a */
        public float f9647a;

        /* renamed from: b */
        public float f9648b;

        /* renamed from: c */
        public float f9649c;

        /* renamed from: d */
        public float f9650d;

        /* renamed from: e */
        public byte f9651e;

        /* renamed from: com.zykj.board.EzyRectF$RectF$a */
        public class C7129a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RectF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7130b c7130bM9175t = RectF.m9175t();
                try {
                    c7130bM9175t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7130bM9175t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7130bM9175t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7130bM9175t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7130bM9175t.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRectF.f9642a;
        }

        /* renamed from: n */
        public static RectF m9174n() {
            return f9645f;
        }

        /* renamed from: t */
        public static C7130b m9175t() {
            return f9645f.toBuilder();
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

        public float getBottom() {
            return this.f9650d;
        }

        public float getLeft() {
            return this.f9647a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9646g;
        }

        public float getRight() {
            return this.f9649c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f9647a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9647a) : 0;
            if (Float.floatToRawIntBits(this.f9648b) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f9648b);
            }
            if (Float.floatToRawIntBits(this.f9649c) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f9649c);
            }
            if (Float.floatToRawIntBits(this.f9650d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f9650d);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getTop() {
            return this.f9648b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getLeft())) * 37) + 2) * 53) + Float.floatToIntBits(getTop())) * 37) + 3) * 53) + Float.floatToIntBits(getRight())) * 37) + 4) * 53) + Float.floatToIntBits(getBottom())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRectF.f9643b.ensureFieldAccessorsInitialized(RectF.class, C7130b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9651e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9651e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RectF();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public RectF getDefaultInstanceForType() {
            return f9645f;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7130b newBuilderForType() {
            return m9175t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7130b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7130b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C7130b toBuilder() {
            return this == f9645f ? new C7130b() : new C7130b().m9192o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f9647a) != 0) {
                codedOutputStream.writeFloat(1, this.f9647a);
            }
            if (Float.floatToRawIntBits(this.f9648b) != 0) {
                codedOutputStream.writeFloat(2, this.f9648b);
            }
            if (Float.floatToRawIntBits(this.f9649c) != 0) {
                codedOutputStream.writeFloat(3, this.f9649c);
            }
            if (Float.floatToRawIntBits(this.f9650d) != 0) {
                codedOutputStream.writeFloat(4, this.f9650d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRectF$RectF$b */
        public static final class C7130b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9652a;

            /* renamed from: b */
            public float f9653b;

            /* renamed from: c */
            public float f9654c;

            /* renamed from: d */
            public float f9655d;

            /* renamed from: e */
            public float f9656e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7130b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7130b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public RectF build() {
                RectF rectFBuildPartial = buildPartial();
                if (rectFBuildPartial.isInitialized()) {
                    return rectFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rectFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public RectF buildPartial() {
                RectF rectF = new RectF(this);
                if (this.f9652a != 0) {
                    m9184f(rectF);
                }
                onBuilt();
                return rectF;
            }

            /* renamed from: f */
            public final void m9184f(RectF rectF) {
                int i9 = this.f9652a;
                if ((i9 & 1) != 0) {
                    rectF.f9647a = this.f9653b;
                }
                if ((i9 & 2) != 0) {
                    rectF.f9648b = this.f9654c;
                }
                if ((i9 & 4) != 0) {
                    rectF.f9649c = this.f9655d;
                }
                if ((i9 & 8) != 0) {
                    rectF.f9650d = this.f9656e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7130b clear() {
                super.clear();
                this.f9652a = 0;
                this.f9653b = 0.0f;
                this.f9654c = 0.0f;
                this.f9655d = 0.0f;
                this.f9656e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRectF.f9642a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7130b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7130b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7130b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7130b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRectF.f9643b.ensureFieldAccessorsInitialized(RectF.class, C7130b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7130b mo24685clone() {
                return (C7130b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public RectF getDefaultInstanceForType() {
                return RectF.m9174n();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7130b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f9653b = codedInputStream.readFloat();
                                    this.f9652a |= 1;
                                } else if (tag == 21) {
                                    this.f9654c = codedInputStream.readFloat();
                                    this.f9652a |= 2;
                                } else if (tag == 29) {
                                    this.f9655d = codedInputStream.readFloat();
                                    this.f9652a |= 4;
                                } else if (tag == 37) {
                                    this.f9656e = codedInputStream.readFloat();
                                    this.f9652a |= 8;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z9 = true;
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
            public C7130b mergeFrom(Message message) {
                if (message instanceof RectF) {
                    return m9192o((RectF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7130b m9192o(RectF rectF) {
                if (rectF == RectF.m9174n()) {
                    return this;
                }
                if (rectF.getLeft() != 0.0f) {
                    m9196s(rectF.getLeft());
                }
                if (rectF.getTop() != 0.0f) {
                    m9199v(rectF.getTop());
                }
                if (rectF.getRight() != 0.0f) {
                    m9198u(rectF.getRight());
                }
                if (rectF.getBottom() != 0.0f) {
                    m9194q(rectF.getBottom());
                }
                mergeUnknownFields(rectF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7130b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7130b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7130b m9194q(float f10) {
                this.f9656e = f10;
                this.f9652a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7130b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7130b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C7130b m9196s(float f10) {
                this.f9653b = f10;
                this.f9652a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7130b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7130b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            /* renamed from: u */
            public C7130b m9198u(float f10) {
                this.f9655d = f10;
                this.f9652a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7130b m9199v(float f10) {
                this.f9654c = f10;
                this.f9652a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7130b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7130b) super.setUnknownFields(unknownFieldSet);
            }

            public C7130b() {
            }

            public C7130b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public RectF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9647a = 0.0f;
            this.f9648b = 0.0f;
            this.f9649c = 0.0f;
            this.f9650d = 0.0f;
            this.f9651e = (byte) -1;
        }

        private RectF() {
            this.f9647a = 0.0f;
            this.f9648b = 0.0f;
            this.f9649c = 0.0f;
            this.f9650d = 0.0f;
            this.f9651e = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9169c().getMessageTypes().get(0);
        f9642a = descriptor;
        f9643b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Left", "Top", "Right", "Bottom"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m9169c() {
        return f9644c;
    }
}

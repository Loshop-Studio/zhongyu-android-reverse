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
    public static final Descriptors.Descriptor f8354a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8355b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f8356c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/RectF.proto\u001a\u0019google/protobuf/any.proto\"A\n\u0005RectF\u0012\f\n\u0004left\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003top\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyRectFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class RectF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final RectF f8357f = new RectF();

        /* renamed from: g */
        public static final Parser f8358g = new C6810a();

        /* renamed from: a */
        public float f8359a;

        /* renamed from: b */
        public float f8360b;

        /* renamed from: c */
        public float f8361c;

        /* renamed from: d */
        public float f8362d;

        /* renamed from: e */
        public byte f8363e;

        /* renamed from: com.zykj.board.EzyRectF$RectF$a */
        public class C6810a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RectF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6811b c6811bM8043q = RectF.m8043q();
                try {
                    c6811bM8043q.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6811bM8043q.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6811bM8043q.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6811bM8043q.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6811bM8043q.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRectF.f8354a;
        }

        /* renamed from: m */
        public static RectF m8042m() {
            return f8357f;
        }

        /* renamed from: q */
        public static C6811b m8043q() {
            return f8357f.toBuilder();
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
            return this.f8362d;
        }

        public float getLeft() {
            return this.f8359a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8358g;
        }

        public float getRight() {
            return this.f8361c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f8359a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f8359a) : 0;
            if (Float.floatToRawIntBits(this.f8360b) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f8360b);
            }
            if (Float.floatToRawIntBits(this.f8361c) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f8361c);
            }
            if (Float.floatToRawIntBits(this.f8362d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f8362d);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getTop() {
            return this.f8360b;
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

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRectF.f8355b.ensureFieldAccessorsInitialized(RectF.class, C6811b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8363e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8363e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RectF();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public RectF getDefaultInstanceForType() {
            return f8357f;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C6811b newBuilderForType() {
            return m8043q();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6811b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6811b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C6811b toBuilder() {
            return this == f8357f ? new C6811b() : new C6811b().m8060n(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f8359a) != 0) {
                codedOutputStream.writeFloat(1, this.f8359a);
            }
            if (Float.floatToRawIntBits(this.f8360b) != 0) {
                codedOutputStream.writeFloat(2, this.f8360b);
            }
            if (Float.floatToRawIntBits(this.f8361c) != 0) {
                codedOutputStream.writeFloat(3, this.f8361c);
            }
            if (Float.floatToRawIntBits(this.f8362d) != 0) {
                codedOutputStream.writeFloat(4, this.f8362d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRectF$RectF$b */
        public static final class C6811b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8364a;

            /* renamed from: b */
            public float f8365b;

            /* renamed from: c */
            public float f8366c;

            /* renamed from: d */
            public float f8367d;

            /* renamed from: e */
            public float f8368e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6811b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6811b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public RectF build() {
                RectF rectFBuildPartial = buildPartial();
                if (rectFBuildPartial.isInitialized()) {
                    return rectFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rectFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public RectF buildPartial() {
                RectF rectF = new RectF(this);
                if (this.f8364a != 0) {
                    m8052e(rectF);
                }
                onBuilt();
                return rectF;
            }

            /* renamed from: e */
            public final void m8052e(RectF rectF) {
                int i10 = this.f8364a;
                if ((i10 & 1) != 0) {
                    rectF.f8359a = this.f8365b;
                }
                if ((i10 & 2) != 0) {
                    rectF.f8360b = this.f8366c;
                }
                if ((i10 & 4) != 0) {
                    rectF.f8361c = this.f8367d;
                }
                if ((i10 & 8) != 0) {
                    rectF.f8362d = this.f8368e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6811b clear() {
                super.clear();
                this.f8364a = 0;
                this.f8365b = 0.0f;
                this.f8366c = 0.0f;
                this.f8367d = 0.0f;
                this.f8368e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6811b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6811b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRectF.f8354a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6811b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6811b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6811b mo24228clone() {
                return (C6811b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRectF.f8355b.ensureFieldAccessorsInitialized(RectF.class, C6811b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public RectF getDefaultInstanceForType() {
                return RectF.m8042m();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6811b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f8365b = codedInputStream.readFloat();
                                    this.f8364a |= 1;
                                } else if (tag == 21) {
                                    this.f8366c = codedInputStream.readFloat();
                                    this.f8364a |= 2;
                                } else if (tag == 29) {
                                    this.f8367d = codedInputStream.readFloat();
                                    this.f8364a |= 4;
                                } else if (tag == 37) {
                                    this.f8368e = codedInputStream.readFloat();
                                    this.f8364a |= 8;
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
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C6811b mergeFrom(Message message) {
                if (message instanceof RectF) {
                    return m8060n((RectF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6811b m8060n(RectF rectF) {
                if (rectF == RectF.m8042m()) {
                    return this;
                }
                if (rectF.getLeft() != 0.0f) {
                    m8064s(rectF.getLeft());
                }
                if (rectF.getTop() != 0.0f) {
                    m8067v(rectF.getTop());
                }
                if (rectF.getRight() != 0.0f) {
                    m8066u(rectF.getRight());
                }
                if (rectF.getBottom() != 0.0f) {
                    m8062q(rectF.getBottom());
                }
                mergeUnknownFields(rectF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6811b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6811b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C6811b m8062q(float f10) {
                this.f8368e = f10;
                this.f8364a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6811b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6811b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C6811b m8064s(float f10) {
                this.f8365b = f10;
                this.f8364a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6811b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6811b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: u */
            public C6811b m8066u(float f10) {
                this.f8367d = f10;
                this.f8364a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C6811b m8067v(float f10) {
                this.f8366c = f10;
                this.f8364a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C6811b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6811b) super.setUnknownFields(unknownFieldSet);
            }

            public C6811b() {
            }

            public C6811b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public RectF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8359a = 0.0f;
            this.f8360b = 0.0f;
            this.f8361c = 0.0f;
            this.f8362d = 0.0f;
            this.f8363e = (byte) -1;
        }

        private RectF() {
            this.f8359a = 0.0f;
            this.f8360b = 0.0f;
            this.f8361c = 0.0f;
            this.f8362d = 0.0f;
            this.f8363e = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8037c().getMessageTypes().get(0);
        f8354a = descriptor;
        f8355b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Left", "Top", "Right", "Bottom"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8037c() {
        return f8356c;
    }
}

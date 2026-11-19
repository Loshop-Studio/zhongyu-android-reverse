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

/* loaded from: classes5.dex */
public abstract class EzyRectF {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19190a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19191b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f19192c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/RectF.proto\u001a\u0019google/protobuf/any.proto\"A\n\u0005RectF\u0012\f\n\u0004left\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003top\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyRectFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class RectF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final RectF f19193h = new RectF();

        /* renamed from: i */
        public static final Parser f19194i = new C8507a();

        /* renamed from: c */
        public float f19195c;

        /* renamed from: d */
        public float f19196d;

        /* renamed from: e */
        public float f19197e;

        /* renamed from: f */
        public float f19198f;

        /* renamed from: g */
        public byte f19199g;

        /* renamed from: com.zykj.board.EzyRectF$RectF$a */
        public class C8507a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RectF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8508b c8508bM15793k = RectF.m15793k();
                try {
                    c8508bM15793k.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8508bM15793k.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8508bM15793k.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8508bM15793k.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8508bM15793k.buildPartial());
                }
            }
        }

        /* renamed from: f */
        public static RectF m15792f() {
            return f19193h;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRectF.f19190a;
        }

        /* renamed from: k */
        public static C8508b m15793k() {
            return f19193h.toBuilder();
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
            return f19193h;
        }

        public float getBottom() {
            return this.f19198f;
        }

        public float getLeft() {
            return this.f19195c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19194i;
        }

        public float getRight() {
            return this.f19197e;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f19195c) != 0 ? CodedOutputStream.computeFloatSize(1, this.f19195c) : 0;
            if (Float.floatToRawIntBits(this.f19196d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f19196d);
            }
            if (Float.floatToRawIntBits(this.f19197e) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f19197e);
            }
            if (Float.floatToRawIntBits(this.f19198f) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f19198f);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getTop() {
            return this.f19196d;
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRectF.f19191b.ensureFieldAccessorsInitialized(RectF.class, C8508b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19199g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19199g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8508b newBuilderForType() {
            return m15793k();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8508b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8508b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RectF();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C8508b toBuilder() {
            return this == f19193h ? new C8508b() : new C8508b().m15810n(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (Float.floatToRawIntBits(this.f19195c) != 0) {
                codedOutputStream.writeFloat(1, this.f19195c);
            }
            if (Float.floatToRawIntBits(this.f19196d) != 0) {
                codedOutputStream.writeFloat(2, this.f19196d);
            }
            if (Float.floatToRawIntBits(this.f19197e) != 0) {
                codedOutputStream.writeFloat(3, this.f19197e);
            }
            if (Float.floatToRawIntBits(this.f19198f) != 0) {
                codedOutputStream.writeFloat(4, this.f19198f);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRectF$RectF$b */
        public static final class C8508b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19200c;

            /* renamed from: d */
            public float f19201d;

            /* renamed from: e */
            public float f19202e;

            /* renamed from: f */
            public float f19203f;

            /* renamed from: g */
            public float f19204g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8508b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8508b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f19200c != 0) {
                    m15802f(rectF);
                }
                onBuilt();
                return rectF;
            }

            /* renamed from: f */
            public final void m15802f(RectF rectF) {
                int i10 = this.f19200c;
                if ((i10 & 1) != 0) {
                    rectF.f19195c = this.f19201d;
                }
                if ((i10 & 2) != 0) {
                    rectF.f19196d = this.f19202e;
                }
                if ((i10 & 4) != 0) {
                    rectF.f19197e = this.f19203f;
                }
                if ((i10 & 8) != 0) {
                    rectF.f19198f = this.f19204g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8508b clear() {
                super.clear();
                this.f19200c = 0;
                this.f19201d = 0.0f;
                this.f19202e = 0.0f;
                this.f19203f = 0.0f;
                this.f19204g = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRectF.f19190a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8508b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8508b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8508b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8508b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRectF.f19191b.ensureFieldAccessorsInitialized(RectF.class, C8508b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8508b m33981clone() {
                return (C8508b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public RectF getDefaultInstanceForType() {
                return RectF.m15792f();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8508b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f19201d = codedInputStream.readFloat();
                                    this.f19200c |= 1;
                                } else if (tag == 21) {
                                    this.f19202e = codedInputStream.readFloat();
                                    this.f19200c |= 2;
                                } else if (tag == 29) {
                                    this.f19203f = codedInputStream.readFloat();
                                    this.f19200c |= 4;
                                } else if (tag == 37) {
                                    this.f19204g = codedInputStream.readFloat();
                                    this.f19200c |= 8;
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
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8508b mergeFrom(Message message) {
                if (message instanceof RectF) {
                    return m15810n((RectF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8508b m15810n(RectF rectF) {
                if (rectF == RectF.m15792f()) {
                    return this;
                }
                if (rectF.getLeft() != 0.0f) {
                    m15814r(rectF.getLeft());
                }
                if (rectF.getTop() != 0.0f) {
                    m15817u(rectF.getTop());
                }
                if (rectF.getRight() != 0.0f) {
                    m15816t(rectF.getRight());
                }
                if (rectF.getBottom() != 0.0f) {
                    m15812p(rectF.getBottom());
                }
                mergeUnknownFields(rectF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8508b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8508b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: p */
            public C8508b m15812p(float f10) {
                this.f19204g = f10;
                this.f19200c |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8508b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8508b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C8508b m15814r(float f10) {
                this.f19201d = f10;
                this.f19200c |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C8508b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8508b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: t */
            public C8508b m15816t(float f10) {
                this.f19203f = f10;
                this.f19200c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C8508b m15817u(float f10) {
                this.f19202e = f10;
                this.f19200c |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C8508b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8508b) super.setUnknownFields(unknownFieldSet);
            }

            public C8508b() {
            }

            public C8508b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public RectF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19195c = 0.0f;
            this.f19196d = 0.0f;
            this.f19197e = 0.0f;
            this.f19198f = 0.0f;
            this.f19199g = (byte) -1;
        }

        private RectF() {
            this.f19195c = 0.0f;
            this.f19196d = 0.0f;
            this.f19197e = 0.0f;
            this.f19198f = 0.0f;
            this.f19199g = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15787c().getMessageTypes().get(0);
        f19190a = descriptor;
        f19191b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Left", "Top", "Right", "Bottom"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m15787c() {
        return f19192c;
    }
}

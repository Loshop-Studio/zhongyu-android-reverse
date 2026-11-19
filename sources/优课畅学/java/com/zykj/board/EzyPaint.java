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
public abstract class EzyPaint {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9324a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9325b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9326c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/Paint.proto\u001a\u0019google/protobuf/any.proto\"k\n\u0005Paint\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007spacing\u0018\u0003 \u0001(\u0002\u0012\u0012\n\nitemLength\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005style\u0018\u0005 \u0001(\u0005\u0012\u0010\n\btextSize\u0018\u0006 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyPaintb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Paint extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final Paint f9327h = new Paint();

        /* renamed from: i */
        public static final Parser f9328i = new C7232a();

        /* renamed from: a */
        public float f9329a;

        /* renamed from: b */
        public int f9330b;

        /* renamed from: c */
        public float f9331c;

        /* renamed from: d */
        public float f9332d;

        /* renamed from: e */
        public int f9333e;

        /* renamed from: f */
        public float f9334f;

        /* renamed from: g */
        public byte f9335g;

        /* renamed from: com.zykj.board.EzyPaint$Paint$a */
        public class C7232a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Paint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7233b c7233bM8474n = Paint.m8474n();
                try {
                    c7233bM8474n.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7233bM8474n.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7233bM8474n.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7233bM8474n.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7233bM8474n.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPaint.f9324a;
        }

        /* renamed from: h */
        public static Paint m8473h() {
            return f9327h;
        }

        /* renamed from: n */
        public static C7233b m8474n() {
            return f9327h.toBuilder();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Paint)) {
                return super.equals(obj);
            }
            Paint paint = (Paint) obj;
            return Float.floatToIntBits(getWidth()) == Float.floatToIntBits(paint.getWidth()) && getColor() == paint.getColor() && Float.floatToIntBits(m8477k()) == Float.floatToIntBits(paint.m8477k()) && Float.floatToIntBits(m8476j()) == Float.floatToIntBits(paint.m8476j()) && m8478l() == paint.m8478l() && Float.floatToIntBits(m8479m()) == Float.floatToIntBits(paint.m8479m()) && getUnknownFields().equals(paint.getUnknownFields());
        }

        public int getColor() {
            return this.f9330b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9328i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f9329a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9329a) : 0;
            int i11 = this.f9330b;
            if (i11 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(2, i11);
            }
            if (Float.floatToRawIntBits(this.f9331c) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f9331c);
            }
            if (Float.floatToRawIntBits(this.f9332d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f9332d);
            }
            int i12 = this.f9333e;
            if (i12 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(5, i12);
            }
            if (Float.floatToRawIntBits(this.f9334f) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.f9334f);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getWidth() {
            return this.f9329a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getWidth())) * 37) + 2) * 53) + getColor()) * 37) + 3) * 53) + Float.floatToIntBits(m8477k())) * 37) + 4) * 53) + Float.floatToIntBits(m8476j())) * 37) + 5) * 53) + m8478l()) * 37) + 6) * 53) + Float.floatToIntBits(m8479m())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Paint getDefaultInstanceForType() {
            return f9327h;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPaint.f9325b.ensureFieldAccessorsInitialized(Paint.class, C7233b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9335g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9335g = (byte) 1;
            return true;
        }

        /* renamed from: j */
        public float m8476j() {
            return this.f9332d;
        }

        /* renamed from: k */
        public float m8477k() {
            return this.f9331c;
        }

        /* renamed from: l */
        public int m8478l() {
            return this.f9333e;
        }

        /* renamed from: m */
        public float m8479m() {
            return this.f9334f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Paint();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C7233b newBuilderForType() {
            return m8474n();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C7233b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7233b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C7233b toBuilder() {
            return this == f9327h ? new C7233b() : new C7233b().m8495o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (Float.floatToRawIntBits(this.f9329a) != 0) {
                codedOutputStream.writeFloat(1, this.f9329a);
            }
            int i10 = this.f9330b;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            if (Float.floatToRawIntBits(this.f9331c) != 0) {
                codedOutputStream.writeFloat(3, this.f9331c);
            }
            if (Float.floatToRawIntBits(this.f9332d) != 0) {
                codedOutputStream.writeFloat(4, this.f9332d);
            }
            int i11 = this.f9333e;
            if (i11 != 0) {
                codedOutputStream.writeInt32(5, i11);
            }
            if (Float.floatToRawIntBits(this.f9334f) != 0) {
                codedOutputStream.writeFloat(6, this.f9334f);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPaint$Paint$b */
        public static final class C7233b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9336a;

            /* renamed from: b */
            public float f9337b;

            /* renamed from: c */
            public int f9338c;

            /* renamed from: d */
            public float f9339d;

            /* renamed from: e */
            public float f9340e;

            /* renamed from: f */
            public int f9341f;

            /* renamed from: g */
            public float f9342g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7233b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7233b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Paint build() {
                Paint paintBuildPartial = buildPartial();
                if (paintBuildPartial.isInitialized()) {
                    return paintBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) paintBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Paint buildPartial() {
                Paint paint = new Paint(this);
                if (this.f9336a != 0) {
                    m8487g(paint);
                }
                onBuilt();
                return paint;
            }

            /* renamed from: g */
            public final void m8487g(Paint paint) {
                int i10 = this.f9336a;
                if ((i10 & 1) != 0) {
                    paint.f9329a = this.f9337b;
                }
                if ((i10 & 2) != 0) {
                    paint.f9330b = this.f9338c;
                }
                if ((i10 & 4) != 0) {
                    paint.f9331c = this.f9339d;
                }
                if ((i10 & 8) != 0) {
                    paint.f9332d = this.f9340e;
                }
                if ((i10 & 16) != 0) {
                    paint.f9333e = this.f9341f;
                }
                if ((i10 & 32) != 0) {
                    paint.f9334f = this.f9342g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPaint.f9324a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7233b clear() {
                super.clear();
                this.f9336a = 0;
                this.f9337b = 0.0f;
                this.f9338c = 0;
                this.f9339d = 0.0f;
                this.f9340e = 0.0f;
                this.f9341f = 0;
                this.f9342g = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7233b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7233b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPaint.f9325b.ensureFieldAccessorsInitialized(Paint.class, C7233b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7233b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7233b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7233b mo27381clone() {
                return (C7233b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Paint getDefaultInstanceForType() {
                return Paint.m8473h();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7233b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f9337b = codedInputStream.readFloat();
                                    this.f9336a |= 1;
                                } else if (tag == 16) {
                                    this.f9338c = codedInputStream.readInt32();
                                    this.f9336a |= 2;
                                } else if (tag == 29) {
                                    this.f9339d = codedInputStream.readFloat();
                                    this.f9336a |= 4;
                                } else if (tag == 37) {
                                    this.f9340e = codedInputStream.readFloat();
                                    this.f9336a |= 8;
                                } else if (tag == 40) {
                                    this.f9341f = codedInputStream.readInt32();
                                    this.f9336a |= 16;
                                } else if (tag == 53) {
                                    this.f9342g = codedInputStream.readFloat();
                                    this.f9336a |= 32;
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
            public C7233b mergeFrom(Message message) {
                if (message instanceof Paint) {
                    return m8495o((Paint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7233b m8495o(Paint paint) {
                if (paint == Paint.m8473h()) {
                    return this;
                }
                if (paint.getWidth() != 0.0f) {
                    m8505y(paint.getWidth());
                }
                if (paint.getColor() != 0) {
                    m8497q(paint.getColor());
                }
                if (paint.m8477k() != 0.0f) {
                    m8501u(paint.m8477k());
                }
                if (paint.m8476j() != 0.0f) {
                    m8499s(paint.m8476j());
                }
                if (paint.m8478l() != 0) {
                    m8502v(paint.m8478l());
                }
                if (paint.m8479m() != 0.0f) {
                    m8503w(paint.m8479m());
                }
                mergeUnknownFields(paint.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7233b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7233b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7233b m8497q(int i10) {
                this.f9338c = i10;
                this.f9336a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7233b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7233b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C7233b m8499s(float f10) {
                this.f9340e = f10;
                this.f9336a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7233b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7233b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: u */
            public C7233b m8501u(float f10) {
                this.f9339d = f10;
                this.f9336a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7233b m8502v(int i10) {
                this.f9341f = i10;
                this.f9336a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C7233b m8503w(float f10) {
                this.f9342g = f10;
                this.f9336a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7233b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7233b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: y */
            public C7233b m8505y(float f10) {
                this.f9337b = f10;
                this.f9336a |= 1;
                onChanged();
                return this;
            }

            public C7233b() {
            }

            public C7233b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Paint(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9329a = 0.0f;
            this.f9330b = 0;
            this.f9331c = 0.0f;
            this.f9332d = 0.0f;
            this.f9333e = 0;
            this.f9334f = 0.0f;
            this.f9335g = (byte) -1;
        }

        private Paint() {
            this.f9329a = 0.0f;
            this.f9330b = 0;
            this.f9331c = 0.0f;
            this.f9332d = 0.0f;
            this.f9333e = 0;
            this.f9334f = 0.0f;
            this.f9335g = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8466c().getMessageTypes().get(0);
        f9324a = descriptor;
        f9325b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Width", "Color", "Spacing", "ItemLength", "Style", "TextSize"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8466c() {
        return f9326c;
    }
}

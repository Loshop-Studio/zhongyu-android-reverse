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
    public static final Descriptors.Descriptor f9597a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9598b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9599c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/Paint.proto\u001a\u0019google/protobuf/any.proto\"k\n\u0005Paint\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007spacing\u0018\u0003 \u0001(\u0002\u0012\u0012\n\nitemLength\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005style\u0018\u0005 \u0001(\u0005\u0012\u0010\n\btextSize\u0018\u0006 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyPaintb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Paint extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final Paint f9600h = new Paint();

        /* renamed from: i */
        public static final Parser f9601i = new C7122a();

        /* renamed from: a */
        public float f9602a;

        /* renamed from: b */
        public int f9603b;

        /* renamed from: c */
        public float f9604c;

        /* renamed from: d */
        public float f9605d;

        /* renamed from: e */
        public int f9606e;

        /* renamed from: f */
        public float f9607f;

        /* renamed from: g */
        public byte f9608g;

        /* renamed from: com.zykj.board.EzyPaint$Paint$a */
        public class C7122a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Paint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7123b c7123bM9100z = Paint.m9100z();
                try {
                    c7123bM9100z.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7123bM9100z.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7123bM9100z.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7123bM9100z.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7123bM9100z.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPaint.f9597a;
        }

        /* renamed from: t */
        public static Paint m9099t() {
            return f9600h;
        }

        /* renamed from: z */
        public static C7123b m9100z() {
            return f9600h.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C7123b newBuilderForType() {
            return m9100z();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public C7123b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7123b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C7123b toBuilder() {
            return this == f9600h ? new C7123b() : new C7123b().m9121o(this);
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
            return Float.floatToIntBits(getWidth()) == Float.floatToIntBits(paint.getWidth()) && getColor() == paint.getColor() && Float.floatToIntBits(m9106w()) == Float.floatToIntBits(paint.m9106w()) && Float.floatToIntBits(m9105v()) == Float.floatToIntBits(paint.m9105v()) && m9107x() == paint.m9107x() && Float.floatToIntBits(m9108y()) == Float.floatToIntBits(paint.m9108y()) && getUnknownFields().equals(paint.getUnknownFields());
        }

        public int getColor() {
            return this.f9603b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9601i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f9602a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9602a) : 0;
            int i10 = this.f9603b;
            if (i10 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(2, i10);
            }
            if (Float.floatToRawIntBits(this.f9604c) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f9604c);
            }
            if (Float.floatToRawIntBits(this.f9605d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f9605d);
            }
            int i11 = this.f9606e;
            if (i11 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(5, i11);
            }
            if (Float.floatToRawIntBits(this.f9607f) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.f9607f);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getWidth() {
            return this.f9602a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getWidth())) * 37) + 2) * 53) + getColor()) * 37) + 3) * 53) + Float.floatToIntBits(m9106w())) * 37) + 4) * 53) + Float.floatToIntBits(m9105v())) * 37) + 5) * 53) + m9107x()) * 37) + 6) * 53) + Float.floatToIntBits(m9108y())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPaint.f9598b.ensureFieldAccessorsInitialized(Paint.class, C7123b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9608g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9608g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Paint();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public Paint getDefaultInstanceForType() {
            return f9600h;
        }

        /* renamed from: v */
        public float m9105v() {
            return this.f9605d;
        }

        /* renamed from: w */
        public float m9106w() {
            return this.f9604c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f9602a) != 0) {
                codedOutputStream.writeFloat(1, this.f9602a);
            }
            int i9 = this.f9603b;
            if (i9 != 0) {
                codedOutputStream.writeInt32(2, i9);
            }
            if (Float.floatToRawIntBits(this.f9604c) != 0) {
                codedOutputStream.writeFloat(3, this.f9604c);
            }
            if (Float.floatToRawIntBits(this.f9605d) != 0) {
                codedOutputStream.writeFloat(4, this.f9605d);
            }
            int i10 = this.f9606e;
            if (i10 != 0) {
                codedOutputStream.writeInt32(5, i10);
            }
            if (Float.floatToRawIntBits(this.f9607f) != 0) {
                codedOutputStream.writeFloat(6, this.f9607f);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: x */
        public int m9107x() {
            return this.f9606e;
        }

        /* renamed from: y */
        public float m9108y() {
            return this.f9607f;
        }

        /* renamed from: com.zykj.board.EzyPaint$Paint$b */
        public static final class C7123b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9609a;

            /* renamed from: b */
            public float f9610b;

            /* renamed from: c */
            public int f9611c;

            /* renamed from: d */
            public float f9612d;

            /* renamed from: e */
            public float f9613e;

            /* renamed from: f */
            public int f9614f;

            /* renamed from: g */
            public float f9615g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7123b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7123b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Paint build() {
                Paint paintBuildPartial = buildPartial();
                if (paintBuildPartial.isInitialized()) {
                    return paintBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) paintBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Paint buildPartial() {
                Paint paint = new Paint(this);
                if (this.f9609a != 0) {
                    m9113f(paint);
                }
                onBuilt();
                return paint;
            }

            /* renamed from: f */
            public final void m9113f(Paint paint) {
                int i9 = this.f9609a;
                if ((i9 & 1) != 0) {
                    paint.f9602a = this.f9610b;
                }
                if ((i9 & 2) != 0) {
                    paint.f9603b = this.f9611c;
                }
                if ((i9 & 4) != 0) {
                    paint.f9604c = this.f9612d;
                }
                if ((i9 & 8) != 0) {
                    paint.f9605d = this.f9613e;
                }
                if ((i9 & 16) != 0) {
                    paint.f9606e = this.f9614f;
                }
                if ((i9 & 32) != 0) {
                    paint.f9607f = this.f9615g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7123b clear() {
                super.clear();
                this.f9609a = 0;
                this.f9610b = 0.0f;
                this.f9611c = 0;
                this.f9612d = 0.0f;
                this.f9613e = 0.0f;
                this.f9614f = 0;
                this.f9615g = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPaint.f9597a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7123b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7123b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7123b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7123b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPaint.f9598b.ensureFieldAccessorsInitialized(Paint.class, C7123b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7123b mo24685clone() {
                return (C7123b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Paint getDefaultInstanceForType() {
                return Paint.m9099t();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7123b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f9610b = codedInputStream.readFloat();
                                    this.f9609a |= 1;
                                } else if (tag == 16) {
                                    this.f9611c = codedInputStream.readInt32();
                                    this.f9609a |= 2;
                                } else if (tag == 29) {
                                    this.f9612d = codedInputStream.readFloat();
                                    this.f9609a |= 4;
                                } else if (tag == 37) {
                                    this.f9613e = codedInputStream.readFloat();
                                    this.f9609a |= 8;
                                } else if (tag == 40) {
                                    this.f9614f = codedInputStream.readInt32();
                                    this.f9609a |= 16;
                                } else if (tag == 53) {
                                    this.f9615g = codedInputStream.readFloat();
                                    this.f9609a |= 32;
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
            public C7123b mergeFrom(Message message) {
                if (message instanceof Paint) {
                    return m9121o((Paint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7123b m9121o(Paint paint) {
                if (paint == Paint.m9099t()) {
                    return this;
                }
                if (paint.getWidth() != 0.0f) {
                    m9131y(paint.getWidth());
                }
                if (paint.getColor() != 0) {
                    m9123q(paint.getColor());
                }
                if (paint.m9106w() != 0.0f) {
                    m9127u(paint.m9106w());
                }
                if (paint.m9105v() != 0.0f) {
                    m9125s(paint.m9105v());
                }
                if (paint.m9107x() != 0) {
                    m9128v(paint.m9107x());
                }
                if (paint.m9108y() != 0.0f) {
                    m9129w(paint.m9108y());
                }
                mergeUnknownFields(paint.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7123b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7123b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7123b m9123q(int i9) {
                this.f9611c = i9;
                this.f9609a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7123b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7123b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C7123b m9125s(float f10) {
                this.f9613e = f10;
                this.f9609a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7123b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7123b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            /* renamed from: u */
            public C7123b m9127u(float f10) {
                this.f9612d = f10;
                this.f9609a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7123b m9128v(int i9) {
                this.f9614f = i9;
                this.f9609a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C7123b m9129w(float f10) {
                this.f9615g = f10;
                this.f9609a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7123b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7123b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: y */
            public C7123b m9131y(float f10) {
                this.f9610b = f10;
                this.f9609a |= 1;
                onChanged();
                return this;
            }

            public C7123b() {
            }

            public C7123b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Paint(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9602a = 0.0f;
            this.f9603b = 0;
            this.f9604c = 0.0f;
            this.f9605d = 0.0f;
            this.f9606e = 0;
            this.f9607f = 0.0f;
            this.f9608g = (byte) -1;
        }

        private Paint() {
            this.f9602a = 0.0f;
            this.f9603b = 0;
            this.f9604c = 0.0f;
            this.f9605d = 0.0f;
            this.f9606e = 0;
            this.f9607f = 0.0f;
            this.f9608g = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9092c().getMessageTypes().get(0);
        f9597a = descriptor;
        f9598b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Width", "Color", "Spacing", "ItemLength", "Style", "TextSize"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m9092c() {
        return f9599c;
    }
}

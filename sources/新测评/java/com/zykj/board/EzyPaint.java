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
    public static final Descriptors.Descriptor f8309a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8310b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f8311c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/Paint.proto\u001a\u0019google/protobuf/any.proto\"k\n\u0005Paint\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007spacing\u0018\u0003 \u0001(\u0002\u0012\u0012\n\nitemLength\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005style\u0018\u0005 \u0001(\u0005\u0012\u0010\n\btextSize\u0018\u0006 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyPaintb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Paint extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final Paint f8312h = new Paint();

        /* renamed from: i */
        public static final Parser f8313i = new C6803a();

        /* renamed from: a */
        public float f8314a;

        /* renamed from: b */
        public int f8315b;

        /* renamed from: c */
        public float f8316c;

        /* renamed from: d */
        public float f8317d;

        /* renamed from: e */
        public int f8318e;

        /* renamed from: f */
        public float f8319f;

        /* renamed from: g */
        public byte f8320g;

        /* renamed from: com.zykj.board.EzyPaint$Paint$a */
        public class C6803a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Paint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6804b c6804bM7968w = Paint.m7968w();
                try {
                    c6804bM7968w.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6804bM7968w.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6804bM7968w.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6804bM7968w.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6804bM7968w.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPaint.f8309a;
        }

        /* renamed from: q */
        public static Paint m7967q() {
            return f8312h;
        }

        /* renamed from: w */
        public static C6804b m7968w() {
            return f8312h.toBuilder();
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
            return Float.floatToIntBits(getWidth()) == Float.floatToIntBits(paint.getWidth()) && getColor() == paint.getColor() && Float.floatToIntBits(m7971t()) == Float.floatToIntBits(paint.m7971t()) && Float.floatToIntBits(m7970s()) == Float.floatToIntBits(paint.m7970s()) && m7972u() == paint.m7972u() && Float.floatToIntBits(m7973v()) == Float.floatToIntBits(paint.m7973v()) && getUnknownFields().equals(paint.getUnknownFields());
        }

        public int getColor() {
            return this.f8315b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8313i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f8314a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f8314a) : 0;
            int i11 = this.f8315b;
            if (i11 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(2, i11);
            }
            if (Float.floatToRawIntBits(this.f8316c) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f8316c);
            }
            if (Float.floatToRawIntBits(this.f8317d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f8317d);
            }
            int i12 = this.f8318e;
            if (i12 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(5, i12);
            }
            if (Float.floatToRawIntBits(this.f8319f) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.f8319f);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getWidth() {
            return this.f8314a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getWidth())) * 37) + 2) * 53) + getColor()) * 37) + 3) * 53) + Float.floatToIntBits(m7971t())) * 37) + 4) * 53) + Float.floatToIntBits(m7970s())) * 37) + 5) * 53) + m7972u()) * 37) + 6) * 53) + Float.floatToIntBits(m7973v())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPaint.f8310b.ensureFieldAccessorsInitialized(Paint.class, C6804b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8320g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8320g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Paint();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Paint getDefaultInstanceForType() {
            return f8312h;
        }

        /* renamed from: s */
        public float m7970s() {
            return this.f8317d;
        }

        /* renamed from: t */
        public float m7971t() {
            return this.f8316c;
        }

        /* renamed from: u */
        public int m7972u() {
            return this.f8318e;
        }

        /* renamed from: v */
        public float m7973v() {
            return this.f8319f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f8314a) != 0) {
                codedOutputStream.writeFloat(1, this.f8314a);
            }
            int i10 = this.f8315b;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            if (Float.floatToRawIntBits(this.f8316c) != 0) {
                codedOutputStream.writeFloat(3, this.f8316c);
            }
            if (Float.floatToRawIntBits(this.f8317d) != 0) {
                codedOutputStream.writeFloat(4, this.f8317d);
            }
            int i11 = this.f8318e;
            if (i11 != 0) {
                codedOutputStream.writeInt32(5, i11);
            }
            if (Float.floatToRawIntBits(this.f8319f) != 0) {
                codedOutputStream.writeFloat(6, this.f8319f);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C6804b newBuilderForType() {
            return m7968w();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C6804b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6804b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public C6804b toBuilder() {
            return this == f8312h ? new C6804b() : new C6804b().m7989n(this);
        }

        /* renamed from: com.zykj.board.EzyPaint$Paint$b */
        public static final class C6804b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8321a;

            /* renamed from: b */
            public float f8322b;

            /* renamed from: c */
            public int f8323c;

            /* renamed from: d */
            public float f8324d;

            /* renamed from: e */
            public float f8325e;

            /* renamed from: f */
            public int f8326f;

            /* renamed from: g */
            public float f8327g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6804b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6804b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Paint build() {
                Paint paintBuildPartial = buildPartial();
                if (paintBuildPartial.isInitialized()) {
                    return paintBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) paintBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Paint buildPartial() {
                Paint paint = new Paint(this);
                if (this.f8321a != 0) {
                    m7981e(paint);
                }
                onBuilt();
                return paint;
            }

            /* renamed from: e */
            public final void m7981e(Paint paint) {
                int i10 = this.f8321a;
                if ((i10 & 1) != 0) {
                    paint.f8314a = this.f8322b;
                }
                if ((i10 & 2) != 0) {
                    paint.f8315b = this.f8323c;
                }
                if ((i10 & 4) != 0) {
                    paint.f8316c = this.f8324d;
                }
                if ((i10 & 8) != 0) {
                    paint.f8317d = this.f8325e;
                }
                if ((i10 & 16) != 0) {
                    paint.f8318e = this.f8326f;
                }
                if ((i10 & 32) != 0) {
                    paint.f8319f = this.f8327g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6804b clear() {
                super.clear();
                this.f8321a = 0;
                this.f8322b = 0.0f;
                this.f8323c = 0;
                this.f8324d = 0.0f;
                this.f8325e = 0.0f;
                this.f8326f = 0;
                this.f8327g = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6804b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6804b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPaint.f8309a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6804b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6804b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6804b mo24228clone() {
                return (C6804b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPaint.f8310b.ensureFieldAccessorsInitialized(Paint.class, C6804b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Paint getDefaultInstanceForType() {
                return Paint.m7967q();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6804b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f8322b = codedInputStream.readFloat();
                                    this.f8321a |= 1;
                                } else if (tag == 16) {
                                    this.f8323c = codedInputStream.readInt32();
                                    this.f8321a |= 2;
                                } else if (tag == 29) {
                                    this.f8324d = codedInputStream.readFloat();
                                    this.f8321a |= 4;
                                } else if (tag == 37) {
                                    this.f8325e = codedInputStream.readFloat();
                                    this.f8321a |= 8;
                                } else if (tag == 40) {
                                    this.f8326f = codedInputStream.readInt32();
                                    this.f8321a |= 16;
                                } else if (tag == 53) {
                                    this.f8327g = codedInputStream.readFloat();
                                    this.f8321a |= 32;
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
            public C6804b mergeFrom(Message message) {
                if (message instanceof Paint) {
                    return m7989n((Paint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6804b m7989n(Paint paint) {
                if (paint == Paint.m7967q()) {
                    return this;
                }
                if (paint.getWidth() != 0.0f) {
                    m7999y(paint.getWidth());
                }
                if (paint.getColor() != 0) {
                    m7991q(paint.getColor());
                }
                if (paint.m7971t() != 0.0f) {
                    m7995u(paint.m7971t());
                }
                if (paint.m7970s() != 0.0f) {
                    m7993s(paint.m7970s());
                }
                if (paint.m7972u() != 0) {
                    m7996v(paint.m7972u());
                }
                if (paint.m7973v() != 0.0f) {
                    m7997w(paint.m7973v());
                }
                mergeUnknownFields(paint.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6804b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6804b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C6804b m7991q(int i10) {
                this.f8323c = i10;
                this.f8321a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6804b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6804b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C6804b m7993s(float f10) {
                this.f8325e = f10;
                this.f8321a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6804b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6804b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: u */
            public C6804b m7995u(float f10) {
                this.f8324d = f10;
                this.f8321a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C6804b m7996v(int i10) {
                this.f8326f = i10;
                this.f8321a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C6804b m7997w(float f10) {
                this.f8327g = f10;
                this.f8321a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C6804b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6804b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: y */
            public C6804b m7999y(float f10) {
                this.f8322b = f10;
                this.f8321a |= 1;
                onChanged();
                return this;
            }

            public C6804b() {
            }

            public C6804b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Paint(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8314a = 0.0f;
            this.f8315b = 0;
            this.f8316c = 0.0f;
            this.f8317d = 0.0f;
            this.f8318e = 0;
            this.f8319f = 0.0f;
            this.f8320g = (byte) -1;
        }

        private Paint() {
            this.f8314a = 0.0f;
            this.f8315b = 0;
            this.f8316c = 0.0f;
            this.f8317d = 0.0f;
            this.f8318e = 0;
            this.f8319f = 0.0f;
            this.f8320g = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7960c().getMessageTypes().get(0);
        f8309a = descriptor;
        f8310b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Width", "Color", "Spacing", "ItemLength", "Style", "TextSize"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m7960c() {
        return f8311c;
    }
}

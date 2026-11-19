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
public abstract class EzyPaint {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19145a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19146b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f19147c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011utils/Paint.proto\u001a\u0019google/protobuf/any.proto\"k\n\u0005Paint\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007spacing\u0018\u0003 \u0001(\u0002\u0012\u0012\n\nitemLength\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005style\u0018\u0005 \u0001(\u0005\u0012\u0010\n\btextSize\u0018\u0006 \u0001(\u0002B\u001a\n\u000ecom.zykj.boardB\bEzyPaintb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Paint extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: j */
        public static final Paint f19148j = new Paint();

        /* renamed from: k */
        public static final Parser f19149k = new C8500a();

        /* renamed from: c */
        public float f19150c;

        /* renamed from: d */
        public int f19151d;

        /* renamed from: e */
        public float f19152e;

        /* renamed from: f */
        public float f19153f;

        /* renamed from: g */
        public int f19154g;

        /* renamed from: h */
        public float f19155h;

        /* renamed from: i */
        public byte f19156i;

        /* renamed from: com.zykj.board.EzyPaint$Paint$a */
        public class C8500a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Paint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8501b c8501bM15719t = Paint.m15719t();
                try {
                    c8501bM15719t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8501bM15719t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8501bM15719t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8501bM15719t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8501bM15719t.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPaint.f19145a;
        }

        /* renamed from: k */
        public static Paint m15718k() {
            return f19148j;
        }

        /* renamed from: t */
        public static C8501b m15719t() {
            return f19148j.toBuilder();
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
            return Float.floatToIntBits(getWidth()) == Float.floatToIntBits(paint.getWidth()) && getColor() == paint.getColor() && Float.floatToIntBits(m15722o()) == Float.floatToIntBits(paint.m15722o()) && Float.floatToIntBits(m15721n()) == Float.floatToIntBits(paint.m15721n()) && m15723p() == paint.m15723p() && Float.floatToIntBits(m15724r()) == Float.floatToIntBits(paint.m15724r()) && getUnknownFields().equals(paint.getUnknownFields());
        }

        public int getColor() {
            return this.f19151d;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19149k;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f19150c) != 0 ? CodedOutputStream.computeFloatSize(1, this.f19150c) : 0;
            int i11 = this.f19151d;
            if (i11 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(2, i11);
            }
            if (Float.floatToRawIntBits(this.f19152e) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.f19152e);
            }
            if (Float.floatToRawIntBits(this.f19153f) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.f19153f);
            }
            int i12 = this.f19154g;
            if (i12 != 0) {
                iComputeFloatSize += CodedOutputStream.computeInt32Size(5, i12);
            }
            if (Float.floatToRawIntBits(this.f19155h) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.f19155h);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getWidth() {
            return this.f19150c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getWidth())) * 37) + 2) * 53) + getColor()) * 37) + 3) * 53) + Float.floatToIntBits(m15722o())) * 37) + 4) * 53) + Float.floatToIntBits(m15721n())) * 37) + 5) * 53) + m15723p()) * 37) + 6) * 53) + Float.floatToIntBits(m15724r())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPaint.f19146b.ensureFieldAccessorsInitialized(Paint.class, C8501b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19156i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19156i = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Paint getDefaultInstanceForType() {
            return f19148j;
        }

        /* renamed from: n */
        public float m15721n() {
            return this.f19153f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Paint();
        }

        /* renamed from: o */
        public float m15722o() {
            return this.f19152e;
        }

        /* renamed from: p */
        public int m15723p() {
            return this.f19154g;
        }

        /* renamed from: r */
        public float m15724r() {
            return this.f19155h;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C8501b newBuilderForType() {
            return m15719t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C8501b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8501b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (Float.floatToRawIntBits(this.f19150c) != 0) {
                codedOutputStream.writeFloat(1, this.f19150c);
            }
            int i10 = this.f19151d;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            if (Float.floatToRawIntBits(this.f19152e) != 0) {
                codedOutputStream.writeFloat(3, this.f19152e);
            }
            if (Float.floatToRawIntBits(this.f19153f) != 0) {
                codedOutputStream.writeFloat(4, this.f19153f);
            }
            int i11 = this.f19154g;
            if (i11 != 0) {
                codedOutputStream.writeInt32(5, i11);
            }
            if (Float.floatToRawIntBits(this.f19155h) != 0) {
                codedOutputStream.writeFloat(6, this.f19155h);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C8501b toBuilder() {
            return this == f19148j ? new C8501b() : new C8501b().m15740n(this);
        }

        /* renamed from: com.zykj.board.EzyPaint$Paint$b */
        public static final class C8501b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19157c;

            /* renamed from: d */
            public float f19158d;

            /* renamed from: e */
            public int f19159e;

            /* renamed from: f */
            public float f19160f;

            /* renamed from: g */
            public float f19161g;

            /* renamed from: h */
            public int f19162h;

            /* renamed from: i */
            public float f19163i;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8501b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8501b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f19157c != 0) {
                    m15732f(paint);
                }
                onBuilt();
                return paint;
            }

            /* renamed from: f */
            public final void m15732f(Paint paint) {
                int i10 = this.f19157c;
                if ((i10 & 1) != 0) {
                    paint.f19150c = this.f19158d;
                }
                if ((i10 & 2) != 0) {
                    paint.f19151d = this.f19159e;
                }
                if ((i10 & 4) != 0) {
                    paint.f19152e = this.f19160f;
                }
                if ((i10 & 8) != 0) {
                    paint.f19153f = this.f19161g;
                }
                if ((i10 & 16) != 0) {
                    paint.f19154g = this.f19162h;
                }
                if ((i10 & 32) != 0) {
                    paint.f19155h = this.f19163i;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8501b clear() {
                super.clear();
                this.f19157c = 0;
                this.f19158d = 0.0f;
                this.f19159e = 0;
                this.f19160f = 0.0f;
                this.f19161g = 0.0f;
                this.f19162h = 0;
                this.f19163i = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPaint.f19145a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8501b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8501b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8501b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8501b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPaint.f19146b.ensureFieldAccessorsInitialized(Paint.class, C8501b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8501b m33981clone() {
                return (C8501b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Paint getDefaultInstanceForType() {
                return Paint.m15718k();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8501b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f19158d = codedInputStream.readFloat();
                                    this.f19157c |= 1;
                                } else if (tag == 16) {
                                    this.f19159e = codedInputStream.readInt32();
                                    this.f19157c |= 2;
                                } else if (tag == 29) {
                                    this.f19160f = codedInputStream.readFloat();
                                    this.f19157c |= 4;
                                } else if (tag == 37) {
                                    this.f19161g = codedInputStream.readFloat();
                                    this.f19157c |= 8;
                                } else if (tag == 40) {
                                    this.f19162h = codedInputStream.readInt32();
                                    this.f19157c |= 16;
                                } else if (tag == 53) {
                                    this.f19163i = codedInputStream.readFloat();
                                    this.f19157c |= 32;
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
            public C8501b mergeFrom(Message message) {
                if (message instanceof Paint) {
                    return m15740n((Paint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8501b m15740n(Paint paint) {
                if (paint == Paint.m15718k()) {
                    return this;
                }
                if (paint.getWidth() != 0.0f) {
                    m15750x(paint.getWidth());
                }
                if (paint.getColor() != 0) {
                    m15742p(paint.getColor());
                }
                if (paint.m15722o() != 0.0f) {
                    m15746t(paint.m15722o());
                }
                if (paint.m15721n() != 0.0f) {
                    m15744r(paint.m15721n());
                }
                if (paint.m15723p() != 0) {
                    m15747u(paint.m15723p());
                }
                if (paint.m15724r() != 0.0f) {
                    m15748v(paint.m15724r());
                }
                mergeUnknownFields(paint.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8501b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8501b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: p */
            public C8501b m15742p(int i10) {
                this.f19159e = i10;
                this.f19157c |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8501b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8501b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C8501b m15744r(float f10) {
                this.f19161g = f10;
                this.f19157c |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C8501b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8501b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: t */
            public C8501b m15746t(float f10) {
                this.f19160f = f10;
                this.f19157c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C8501b m15747u(int i10) {
                this.f19162h = i10;
                this.f19157c |= 16;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C8501b m15748v(float f10) {
                this.f19163i = f10;
                this.f19157c |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8501b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8501b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: x */
            public C8501b m15750x(float f10) {
                this.f19158d = f10;
                this.f19157c |= 1;
                onChanged();
                return this;
            }

            public C8501b() {
            }

            public C8501b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Paint(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19150c = 0.0f;
            this.f19151d = 0;
            this.f19152e = 0.0f;
            this.f19153f = 0.0f;
            this.f19154g = 0;
            this.f19155h = 0.0f;
            this.f19156i = (byte) -1;
        }

        private Paint() {
            this.f19150c = 0.0f;
            this.f19151d = 0;
            this.f19152e = 0.0f;
            this.f19153f = 0.0f;
            this.f19154g = 0;
            this.f19155h = 0.0f;
            this.f19156i = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15711c().getMessageTypes().get(0);
        f19145a = descriptor;
        f19146b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Width", "Color", "Spacing", "ItemLength", "Style", "TextSize"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m15711c() {
        return f19147c;
    }
}

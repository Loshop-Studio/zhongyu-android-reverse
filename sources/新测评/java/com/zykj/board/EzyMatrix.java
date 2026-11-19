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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class EzyMatrix {

    /* renamed from: a */
    public static final Descriptors.Descriptor f8195a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8196b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f8197c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/Matrix.proto\u001a\u0019google/protobuf/any.proto\"©\u0001\n\u0006Matrix\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005skewX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006transX\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005skewY\u0018\u0005 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0006 \u0001(\u0002\u0012\u000e\n\u0006transY\u0018\u0007 \u0001(\u0002\u0012\u000e\n\u0006perSp0\u0018\b \u0001(\u0002\u0012\u000e\n\u0006perSp1\u0018\t \u0001(\u0002\u0012\u000e\n\u0006perSp2\u0018\n \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyMatrixb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Matrix extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: l */
        public static final Matrix f8198l = new Matrix();

        /* renamed from: m */
        public static final Parser f8199m = new C6789a();

        /* renamed from: a */
        public long f8200a;

        /* renamed from: b */
        public float f8201b;

        /* renamed from: c */
        public float f8202c;

        /* renamed from: d */
        public float f8203d;

        /* renamed from: e */
        public float f8204e;

        /* renamed from: f */
        public float f8205f;

        /* renamed from: g */
        public float f8206g;

        /* renamed from: h */
        public float f8207h;

        /* renamed from: i */
        public float f8208i;

        /* renamed from: j */
        public float f8209j;

        /* renamed from: k */
        public byte f8210k;

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$a */
        public class C6789a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Matrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6790b c6790bM7710D = Matrix.m7710D();
                try {
                    c6790bM7710D.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6790bM7710D.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6790bM7710D.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6790bM7710D.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6790bM7710D.buildPartial());
                }
            }
        }

        /* renamed from: D */
        public static C6790b m7710D() {
            return f8198l.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyMatrix.f8195a;
        }

        public static Parser parser() {
            return f8199m;
        }

        /* renamed from: u */
        public static Matrix m7721u() {
            return f8198l;
        }

        /* renamed from: A */
        public float m7722A() {
            return this.f8204e;
        }

        /* renamed from: B */
        public float m7723B() {
            return this.f8203d;
        }

        /* renamed from: C */
        public float m7724C() {
            return this.f8206g;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C6790b newBuilderForType() {
            return m7710D();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C6790b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6790b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C6790b toBuilder() {
            return this == f8198l ? new C6790b() : new C6790b().m7748n(this);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Matrix)) {
                return super.equals(obj);
            }
            Matrix matrix = (Matrix) obj;
            return getEventTime() == matrix.getEventTime() && Float.floatToIntBits(getScaleX()) == Float.floatToIntBits(matrix.getScaleX()) && Float.floatToIntBits(m7732z()) == Float.floatToIntBits(matrix.m7732z()) && Float.floatToIntBits(m7723B()) == Float.floatToIntBits(matrix.m7723B()) && Float.floatToIntBits(m7722A()) == Float.floatToIntBits(matrix.m7722A()) && Float.floatToIntBits(getScaleY()) == Float.floatToIntBits(matrix.getScaleY()) && Float.floatToIntBits(m7724C()) == Float.floatToIntBits(matrix.m7724C()) && Float.floatToIntBits(m7729w()) == Float.floatToIntBits(matrix.m7729w()) && Float.floatToIntBits(m7730x()) == Float.floatToIntBits(matrix.m7730x()) && Float.floatToIntBits(m7731y()) == Float.floatToIntBits(matrix.m7731y()) && getUnknownFields().equals(matrix.getUnknownFields());
        }

        public long getEventTime() {
            return this.f8200a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8199m;
        }

        public float getScaleX() {
            return this.f8201b;
        }

        public float getScaleY() {
            return this.f8205f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f8200a;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            if (Float.floatToRawIntBits(this.f8201b) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(2, this.f8201b);
            }
            if (Float.floatToRawIntBits(this.f8202c) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f8202c);
            }
            if (Float.floatToRawIntBits(this.f8203d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f8203d);
            }
            if (Float.floatToRawIntBits(this.f8204e) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(5, this.f8204e);
            }
            if (Float.floatToRawIntBits(this.f8205f) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(6, this.f8205f);
            }
            if (Float.floatToRawIntBits(this.f8206g) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(7, this.f8206g);
            }
            if (Float.floatToRawIntBits(this.f8207h) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(8, this.f8207h);
            }
            if (Float.floatToRawIntBits(this.f8208i) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(9, this.f8208i);
            }
            if (Float.floatToRawIntBits(this.f8209j) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(10, this.f8209j);
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getEventTime())) * 37) + 2) * 53) + Float.floatToIntBits(getScaleX())) * 37) + 3) * 53) + Float.floatToIntBits(m7732z())) * 37) + 4) * 53) + Float.floatToIntBits(m7723B())) * 37) + 5) * 53) + Float.floatToIntBits(m7722A())) * 37) + 6) * 53) + Float.floatToIntBits(getScaleY())) * 37) + 7) * 53) + Float.floatToIntBits(m7724C())) * 37) + 8) * 53) + Float.floatToIntBits(m7729w())) * 37) + 9) * 53) + Float.floatToIntBits(m7730x())) * 37) + 10) * 53) + Float.floatToIntBits(m7731y())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyMatrix.f8196b.ensureFieldAccessorsInitialized(Matrix.class, C6790b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8210k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8210k = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Matrix();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public Matrix getDefaultInstanceForType() {
            return f8198l;
        }

        /* renamed from: w */
        public float m7729w() {
            return this.f8207h;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.f8200a;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            if (Float.floatToRawIntBits(this.f8201b) != 0) {
                codedOutputStream.writeFloat(2, this.f8201b);
            }
            if (Float.floatToRawIntBits(this.f8202c) != 0) {
                codedOutputStream.writeFloat(3, this.f8202c);
            }
            if (Float.floatToRawIntBits(this.f8203d) != 0) {
                codedOutputStream.writeFloat(4, this.f8203d);
            }
            if (Float.floatToRawIntBits(this.f8204e) != 0) {
                codedOutputStream.writeFloat(5, this.f8204e);
            }
            if (Float.floatToRawIntBits(this.f8205f) != 0) {
                codedOutputStream.writeFloat(6, this.f8205f);
            }
            if (Float.floatToRawIntBits(this.f8206g) != 0) {
                codedOutputStream.writeFloat(7, this.f8206g);
            }
            if (Float.floatToRawIntBits(this.f8207h) != 0) {
                codedOutputStream.writeFloat(8, this.f8207h);
            }
            if (Float.floatToRawIntBits(this.f8208i) != 0) {
                codedOutputStream.writeFloat(9, this.f8208i);
            }
            if (Float.floatToRawIntBits(this.f8209j) != 0) {
                codedOutputStream.writeFloat(10, this.f8209j);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: x */
        public float m7730x() {
            return this.f8208i;
        }

        /* renamed from: y */
        public float m7731y() {
            return this.f8209j;
        }

        /* renamed from: z */
        public float m7732z() {
            return this.f8202c;
        }

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$b */
        public static final class C6790b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8211a;

            /* renamed from: b */
            public long f8212b;

            /* renamed from: c */
            public float f8213c;

            /* renamed from: d */
            public float f8214d;

            /* renamed from: e */
            public float f8215e;

            /* renamed from: f */
            public float f8216f;

            /* renamed from: g */
            public float f8217g;

            /* renamed from: h */
            public float f8218h;

            /* renamed from: i */
            public float f8219i;

            /* renamed from: j */
            public float f8220j;

            /* renamed from: k */
            public float f8221k;

            /* renamed from: A */
            public C6790b m7734A(float f10) {
                this.f8215e = f10;
                this.f8211a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: B */
            public C6790b m7735B(float f10) {
                this.f8218h = f10;
                this.f8211a |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public final C6790b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6790b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6790b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6790b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Matrix build() {
                Matrix matrixBuildPartial = buildPartial();
                if (matrixBuildPartial.isInitialized()) {
                    return matrixBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Matrix buildPartial() {
                Matrix matrix = new Matrix(this);
                if (this.f8211a != 0) {
                    m7740e(matrix);
                }
                onBuilt();
                return matrix;
            }

            /* renamed from: e */
            public final void m7740e(Matrix matrix) {
                int i10 = this.f8211a;
                if ((i10 & 1) != 0) {
                    matrix.f8200a = this.f8212b;
                }
                if ((i10 & 2) != 0) {
                    matrix.f8201b = this.f8213c;
                }
                if ((i10 & 4) != 0) {
                    matrix.f8202c = this.f8214d;
                }
                if ((i10 & 8) != 0) {
                    matrix.f8203d = this.f8215e;
                }
                if ((i10 & 16) != 0) {
                    matrix.f8204e = this.f8216f;
                }
                if ((i10 & 32) != 0) {
                    matrix.f8205f = this.f8217g;
                }
                if ((i10 & 64) != 0) {
                    matrix.f8206g = this.f8218h;
                }
                if ((i10 & 128) != 0) {
                    matrix.f8207h = this.f8219i;
                }
                if ((i10 & 256) != 0) {
                    matrix.f8208i = this.f8220j;
                }
                if ((i10 & 512) != 0) {
                    matrix.f8209j = this.f8221k;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6790b clear() {
                super.clear();
                this.f8211a = 0;
                this.f8212b = 0L;
                this.f8213c = 0.0f;
                this.f8214d = 0.0f;
                this.f8215e = 0.0f;
                this.f8216f = 0.0f;
                this.f8217g = 0.0f;
                this.f8218h = 0.0f;
                this.f8219i = 0.0f;
                this.f8220j = 0.0f;
                this.f8221k = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6790b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6790b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyMatrix.f8195a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6790b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6790b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6790b mo24228clone() {
                return (C6790b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyMatrix.f8196b.ensureFieldAccessorsInitialized(Matrix.class, C6790b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Matrix getDefaultInstanceForType() {
                return Matrix.m7721u();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6790b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z9 = true;
                                case 8:
                                    this.f8212b = codedInputStream.readInt64();
                                    this.f8211a |= 1;
                                case 21:
                                    this.f8213c = codedInputStream.readFloat();
                                    this.f8211a |= 2;
                                case 29:
                                    this.f8214d = codedInputStream.readFloat();
                                    this.f8211a |= 4;
                                case 37:
                                    this.f8215e = codedInputStream.readFloat();
                                    this.f8211a |= 8;
                                case 45:
                                    this.f8216f = codedInputStream.readFloat();
                                    this.f8211a |= 16;
                                case 53:
                                    this.f8217g = codedInputStream.readFloat();
                                    this.f8211a |= 32;
                                case 61:
                                    this.f8218h = codedInputStream.readFloat();
                                    this.f8211a |= 64;
                                case 69:
                                    this.f8219i = codedInputStream.readFloat();
                                    this.f8211a |= 128;
                                case 77:
                                    this.f8220j = codedInputStream.readFloat();
                                    this.f8211a |= 256;
                                case 85:
                                    this.f8221k = codedInputStream.readFloat();
                                    this.f8211a |= 512;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z9 = true;
                                    }
                            }
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
            public C6790b mergeFrom(Message message) {
                if (message instanceof Matrix) {
                    return m7748n((Matrix) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6790b m7748n(Matrix matrix) {
                if (matrix == Matrix.m7721u()) {
                    return this;
                }
                if (matrix.getEventTime() != 0) {
                    m7750q(matrix.getEventTime());
                }
                if (matrix.getScaleX() != 0.0f) {
                    m7756w(matrix.getScaleX());
                }
                if (matrix.m7732z() != 0.0f) {
                    m7758y(matrix.m7732z());
                }
                if (matrix.m7723B() != 0.0f) {
                    m7734A(matrix.m7723B());
                }
                if (matrix.m7722A() != 0.0f) {
                    m7759z(matrix.m7722A());
                }
                if (matrix.getScaleY() != 0.0f) {
                    m7757x(matrix.getScaleY());
                }
                if (matrix.m7724C() != 0.0f) {
                    m7735B(matrix.m7724C());
                }
                if (matrix.m7729w() != 0.0f) {
                    m7752s(matrix.m7729w());
                }
                if (matrix.m7730x() != 0.0f) {
                    m7753t(matrix.m7730x());
                }
                if (matrix.m7731y() != 0.0f) {
                    m7754u(matrix.m7731y());
                }
                mergeUnknownFields(matrix.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6790b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6790b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C6790b m7750q(long j10) {
                this.f8212b = j10;
                this.f8211a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6790b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6790b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C6790b m7752s(float f10) {
                this.f8219i = f10;
                this.f8211a |= 128;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C6790b m7753t(float f10) {
                this.f8220j = f10;
                this.f8211a |= 256;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C6790b m7754u(float f10) {
                this.f8221k = f10;
                this.f8211a |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C6790b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6790b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: w */
            public C6790b m7756w(float f10) {
                this.f8213c = f10;
                this.f8211a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C6790b m7757x(float f10) {
                this.f8217g = f10;
                this.f8211a |= 32;
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C6790b m7758y(float f10) {
                this.f8214d = f10;
                this.f8211a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: z */
            public C6790b m7759z(float f10) {
                this.f8216f = f10;
                this.f8211a |= 16;
                onChanged();
                return this;
            }

            public C6790b() {
            }

            public C6790b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Matrix(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8200a = 0L;
            this.f8201b = 0.0f;
            this.f8202c = 0.0f;
            this.f8203d = 0.0f;
            this.f8204e = 0.0f;
            this.f8205f = 0.0f;
            this.f8206g = 0.0f;
            this.f8207h = 0.0f;
            this.f8208i = 0.0f;
            this.f8209j = 0.0f;
            this.f8210k = (byte) -1;
        }

        private Matrix() {
            this.f8200a = 0L;
            this.f8201b = 0.0f;
            this.f8202c = 0.0f;
            this.f8203d = 0.0f;
            this.f8204e = 0.0f;
            this.f8205f = 0.0f;
            this.f8206g = 0.0f;
            this.f8207h = 0.0f;
            this.f8208i = 0.0f;
            this.f8209j = 0.0f;
            this.f8210k = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7709c().getMessageTypes().get(0);
        f8195a = descriptor;
        f8196b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "ScaleX", "SkewX", "TransX", "SkewY", "ScaleY", "TransY", "PerSp0", "PerSp1", "PerSp2"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m7709c() {
        return f8197c;
    }
}

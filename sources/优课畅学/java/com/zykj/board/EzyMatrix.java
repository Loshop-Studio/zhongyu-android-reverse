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
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class EzyMatrix {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9210a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9211b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9212c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/Matrix.proto\u001a\u0019google/protobuf/any.proto\"©\u0001\n\u0006Matrix\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005skewX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006transX\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005skewY\u0018\u0005 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0006 \u0001(\u0002\u0012\u000e\n\u0006transY\u0018\u0007 \u0001(\u0002\u0012\u000e\n\u0006perSp0\u0018\b \u0001(\u0002\u0012\u000e\n\u0006perSp1\u0018\t \u0001(\u0002\u0012\u000e\n\u0006perSp2\u0018\n \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyMatrixb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Matrix extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: l */
        public static final Matrix f9213l = new Matrix();

        /* renamed from: m */
        public static final Parser f9214m = new C7218a();

        /* renamed from: a */
        public long f9215a;

        /* renamed from: b */
        public float f9216b;

        /* renamed from: c */
        public float f9217c;

        /* renamed from: d */
        public float f9218d;

        /* renamed from: e */
        public float f9219e;

        /* renamed from: f */
        public float f9220f;

        /* renamed from: g */
        public float f9221g;

        /* renamed from: h */
        public float f9222h;

        /* renamed from: i */
        public float f9223i;

        /* renamed from: j */
        public float f9224j;

        /* renamed from: k */
        public byte f9225k;

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$a */
        public class C7218a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Matrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7219b c7219bM8226u = Matrix.m8226u();
                try {
                    c7219bM8226u.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7219bM8226u.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7219bM8226u.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7219bM8226u.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7219bM8226u.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyMatrix.f9210a;
        }

        /* renamed from: l */
        public static Matrix m8225l() {
            return f9213l;
        }

        public static Parser parser() {
            return f9214m;
        }

        /* renamed from: u */
        public static C7219b m8226u() {
            return f9213l.toBuilder();
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
            return getEventTime() == matrix.getEventTime() && Float.floatToIntBits(getScaleX()) == Float.floatToIntBits(matrix.getScaleX()) && Float.floatToIntBits(m8231q()) == Float.floatToIntBits(matrix.m8231q()) && Float.floatToIntBits(m8233s()) == Float.floatToIntBits(matrix.m8233s()) && Float.floatToIntBits(m8232r()) == Float.floatToIntBits(matrix.m8232r()) && Float.floatToIntBits(getScaleY()) == Float.floatToIntBits(matrix.getScaleY()) && Float.floatToIntBits(m8234t()) == Float.floatToIntBits(matrix.m8234t()) && Float.floatToIntBits(m8228n()) == Float.floatToIntBits(matrix.m8228n()) && Float.floatToIntBits(m8229o()) == Float.floatToIntBits(matrix.m8229o()) && Float.floatToIntBits(m8230p()) == Float.floatToIntBits(matrix.m8230p()) && getUnknownFields().equals(matrix.getUnknownFields());
        }

        public long getEventTime() {
            return this.f9215a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9214m;
        }

        public float getScaleX() {
            return this.f9216b;
        }

        public float getScaleY() {
            return this.f9220f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f9215a;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            if (Float.floatToRawIntBits(this.f9216b) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(2, this.f9216b);
            }
            if (Float.floatToRawIntBits(this.f9217c) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f9217c);
            }
            if (Float.floatToRawIntBits(this.f9218d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f9218d);
            }
            if (Float.floatToRawIntBits(this.f9219e) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(5, this.f9219e);
            }
            if (Float.floatToRawIntBits(this.f9220f) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(6, this.f9220f);
            }
            if (Float.floatToRawIntBits(this.f9221g) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(7, this.f9221g);
            }
            if (Float.floatToRawIntBits(this.f9222h) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(8, this.f9222h);
            }
            if (Float.floatToRawIntBits(this.f9223i) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(9, this.f9223i);
            }
            if (Float.floatToRawIntBits(this.f9224j) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(10, this.f9224j);
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
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getEventTime())) * 37) + 2) * 53) + Float.floatToIntBits(getScaleX())) * 37) + 3) * 53) + Float.floatToIntBits(m8231q())) * 37) + 4) * 53) + Float.floatToIntBits(m8233s())) * 37) + 5) * 53) + Float.floatToIntBits(m8232r())) * 37) + 6) * 53) + Float.floatToIntBits(getScaleY())) * 37) + 7) * 53) + Float.floatToIntBits(m8234t())) * 37) + 8) * 53) + Float.floatToIntBits(m8228n())) * 37) + 9) * 53) + Float.floatToIntBits(m8229o())) * 37) + 10) * 53) + Float.floatToIntBits(m8230p())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyMatrix.f9211b.ensureFieldAccessorsInitialized(Matrix.class, C7219b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9225k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9225k = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Matrix getDefaultInstanceForType() {
            return f9213l;
        }

        /* renamed from: n */
        public float m8228n() {
            return this.f9222h;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Matrix();
        }

        /* renamed from: o */
        public float m8229o() {
            return this.f9223i;
        }

        /* renamed from: p */
        public float m8230p() {
            return this.f9224j;
        }

        /* renamed from: q */
        public float m8231q() {
            return this.f9217c;
        }

        /* renamed from: r */
        public float m8232r() {
            return this.f9219e;
        }

        /* renamed from: s */
        public float m8233s() {
            return this.f9218d;
        }

        /* renamed from: t */
        public float m8234t() {
            return this.f9221g;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7219b newBuilderForType() {
            return m8226u();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C7219b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7219b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            long j10 = this.f9215a;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            if (Float.floatToRawIntBits(this.f9216b) != 0) {
                codedOutputStream.writeFloat(2, this.f9216b);
            }
            if (Float.floatToRawIntBits(this.f9217c) != 0) {
                codedOutputStream.writeFloat(3, this.f9217c);
            }
            if (Float.floatToRawIntBits(this.f9218d) != 0) {
                codedOutputStream.writeFloat(4, this.f9218d);
            }
            if (Float.floatToRawIntBits(this.f9219e) != 0) {
                codedOutputStream.writeFloat(5, this.f9219e);
            }
            if (Float.floatToRawIntBits(this.f9220f) != 0) {
                codedOutputStream.writeFloat(6, this.f9220f);
            }
            if (Float.floatToRawIntBits(this.f9221g) != 0) {
                codedOutputStream.writeFloat(7, this.f9221g);
            }
            if (Float.floatToRawIntBits(this.f9222h) != 0) {
                codedOutputStream.writeFloat(8, this.f9222h);
            }
            if (Float.floatToRawIntBits(this.f9223i) != 0) {
                codedOutputStream.writeFloat(9, this.f9223i);
            }
            if (Float.floatToRawIntBits(this.f9224j) != 0) {
                codedOutputStream.writeFloat(10, this.f9224j);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C7219b toBuilder() {
            return this == f9213l ? new C7219b() : new C7219b().m8253o(this);
        }

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$b */
        public static final class C7219b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9226a;

            /* renamed from: b */
            public long f9227b;

            /* renamed from: c */
            public float f9228c;

            /* renamed from: d */
            public float f9229d;

            /* renamed from: e */
            public float f9230e;

            /* renamed from: f */
            public float f9231f;

            /* renamed from: g */
            public float f9232g;

            /* renamed from: h */
            public float f9233h;

            /* renamed from: i */
            public float f9234i;

            /* renamed from: j */
            public float f9235j;

            /* renamed from: k */
            public float f9236k;

            /* renamed from: A */
            public C7219b m8239A(float f10) {
                this.f9230e = f10;
                this.f9226a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: B */
            public C7219b m8240B(float f10) {
                this.f9233h = f10;
                this.f9226a |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public final C7219b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7219b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7219b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7219b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Matrix build() {
                Matrix matrixBuildPartial = buildPartial();
                if (matrixBuildPartial.isInitialized()) {
                    return matrixBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Matrix buildPartial() {
                Matrix matrix = new Matrix(this);
                if (this.f9226a != 0) {
                    m8245g(matrix);
                }
                onBuilt();
                return matrix;
            }

            /* renamed from: g */
            public final void m8245g(Matrix matrix) {
                int i10 = this.f9226a;
                if ((i10 & 1) != 0) {
                    matrix.f9215a = this.f9227b;
                }
                if ((i10 & 2) != 0) {
                    matrix.f9216b = this.f9228c;
                }
                if ((i10 & 4) != 0) {
                    matrix.f9217c = this.f9229d;
                }
                if ((i10 & 8) != 0) {
                    matrix.f9218d = this.f9230e;
                }
                if ((i10 & 16) != 0) {
                    matrix.f9219e = this.f9231f;
                }
                if ((i10 & 32) != 0) {
                    matrix.f9220f = this.f9232g;
                }
                if ((i10 & 64) != 0) {
                    matrix.f9221g = this.f9233h;
                }
                if ((i10 & 128) != 0) {
                    matrix.f9222h = this.f9234i;
                }
                if ((i10 & 256) != 0) {
                    matrix.f9223i = this.f9235j;
                }
                if ((i10 & 512) != 0) {
                    matrix.f9224j = this.f9236k;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyMatrix.f9210a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7219b clear() {
                super.clear();
                this.f9226a = 0;
                this.f9227b = 0L;
                this.f9228c = 0.0f;
                this.f9229d = 0.0f;
                this.f9230e = 0.0f;
                this.f9231f = 0.0f;
                this.f9232g = 0.0f;
                this.f9233h = 0.0f;
                this.f9234i = 0.0f;
                this.f9235j = 0.0f;
                this.f9236k = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7219b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7219b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyMatrix.f9211b.ensureFieldAccessorsInitialized(Matrix.class, C7219b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7219b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7219b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7219b mo27381clone() {
                return (C7219b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Matrix getDefaultInstanceForType() {
                return Matrix.m8225l();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7219b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.f9227b = codedInputStream.readInt64();
                                    this.f9226a |= 1;
                                case 21:
                                    this.f9228c = codedInputStream.readFloat();
                                    this.f9226a |= 2;
                                case 29:
                                    this.f9229d = codedInputStream.readFloat();
                                    this.f9226a |= 4;
                                case 37:
                                    this.f9230e = codedInputStream.readFloat();
                                    this.f9226a |= 8;
                                case 45:
                                    this.f9231f = codedInputStream.readFloat();
                                    this.f9226a |= 16;
                                case 53:
                                    this.f9232g = codedInputStream.readFloat();
                                    this.f9226a |= 32;
                                case 61:
                                    this.f9233h = codedInputStream.readFloat();
                                    this.f9226a |= 64;
                                case 69:
                                    this.f9234i = codedInputStream.readFloat();
                                    this.f9226a |= 128;
                                case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                                    this.f9235j = codedInputStream.readFloat();
                                    this.f9226a |= 256;
                                case 85:
                                    this.f9236k = codedInputStream.readFloat();
                                    this.f9226a |= 512;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z10 = true;
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7219b mergeFrom(Message message) {
                if (message instanceof Matrix) {
                    return m8253o((Matrix) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7219b m8253o(Matrix matrix) {
                if (matrix == Matrix.m8225l()) {
                    return this;
                }
                if (matrix.getEventTime() != 0) {
                    m8255q(matrix.getEventTime());
                }
                if (matrix.getScaleX() != 0.0f) {
                    m8261w(matrix.getScaleX());
                }
                if (matrix.m8231q() != 0.0f) {
                    m8263y(matrix.m8231q());
                }
                if (matrix.m8233s() != 0.0f) {
                    m8239A(matrix.m8233s());
                }
                if (matrix.m8232r() != 0.0f) {
                    m8264z(matrix.m8232r());
                }
                if (matrix.getScaleY() != 0.0f) {
                    m8262x(matrix.getScaleY());
                }
                if (matrix.m8234t() != 0.0f) {
                    m8240B(matrix.m8234t());
                }
                if (matrix.m8228n() != 0.0f) {
                    m8257s(matrix.m8228n());
                }
                if (matrix.m8229o() != 0.0f) {
                    m8258t(matrix.m8229o());
                }
                if (matrix.m8230p() != 0.0f) {
                    m8259u(matrix.m8230p());
                }
                mergeUnknownFields(matrix.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7219b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7219b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7219b m8255q(long j10) {
                this.f9227b = j10;
                this.f9226a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7219b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7219b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C7219b m8257s(float f10) {
                this.f9234i = f10;
                this.f9226a |= 128;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C7219b m8258t(float f10) {
                this.f9235j = f10;
                this.f9226a |= 256;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7219b m8259u(float f10) {
                this.f9236k = f10;
                this.f9226a |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7219b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7219b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: w */
            public C7219b m8261w(float f10) {
                this.f9228c = f10;
                this.f9226a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C7219b m8262x(float f10) {
                this.f9232g = f10;
                this.f9226a |= 32;
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C7219b m8263y(float f10) {
                this.f9229d = f10;
                this.f9226a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: z */
            public C7219b m8264z(float f10) {
                this.f9231f = f10;
                this.f9226a |= 16;
                onChanged();
                return this;
            }

            public C7219b() {
            }

            public C7219b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Matrix(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9215a = 0L;
            this.f9216b = 0.0f;
            this.f9217c = 0.0f;
            this.f9218d = 0.0f;
            this.f9219e = 0.0f;
            this.f9220f = 0.0f;
            this.f9221g = 0.0f;
            this.f9222h = 0.0f;
            this.f9223i = 0.0f;
            this.f9224j = 0.0f;
            this.f9225k = (byte) -1;
        }

        private Matrix() {
            this.f9215a = 0L;
            this.f9216b = 0.0f;
            this.f9217c = 0.0f;
            this.f9218d = 0.0f;
            this.f9219e = 0.0f;
            this.f9220f = 0.0f;
            this.f9221g = 0.0f;
            this.f9222h = 0.0f;
            this.f9223i = 0.0f;
            this.f9224j = 0.0f;
            this.f9225k = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8214c().getMessageTypes().get(0);
        f9210a = descriptor;
        f9211b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "ScaleX", "SkewX", "TransX", "SkewY", "ScaleY", "TransY", "PerSp0", "PerSp1", "PerSp2"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8214c() {
        return f9212c;
    }
}

package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.taobao.sophix.PatchStatus;
import java.io.IOException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public abstract class EzyMatrix {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9483a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9484b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9485c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/Matrix.proto\u001a\u0019google/protobuf/any.proto\"©\u0001\n\u0006Matrix\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005skewX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006transX\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005skewY\u0018\u0005 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0006 \u0001(\u0002\u0012\u000e\n\u0006transY\u0018\u0007 \u0001(\u0002\u0012\u000e\n\u0006perSp0\u0018\b \u0001(\u0002\u0012\u000e\n\u0006perSp1\u0018\t \u0001(\u0002\u0012\u000e\n\u0006perSp2\u0018\n \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyMatrixb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Matrix extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: l */
        public static final Matrix f9486l = new Matrix();

        /* renamed from: m */
        public static final Parser f9487m = new C7108a();

        /* renamed from: a */
        public long f9488a;

        /* renamed from: b */
        public float f9489b;

        /* renamed from: c */
        public float f9490c;

        /* renamed from: d */
        public float f9491d;

        /* renamed from: e */
        public float f9492e;

        /* renamed from: f */
        public float f9493f;

        /* renamed from: g */
        public float f9494g;

        /* renamed from: h */
        public float f9495h;

        /* renamed from: i */
        public float f9496i;

        /* renamed from: j */
        public float f9497j;

        /* renamed from: k */
        public byte f9498k;

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$a */
        public class C7108a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Matrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7109b c7109bM8839G = Matrix.m8839G();
                try {
                    c7109bM8839G.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7109bM8839G.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7109bM8839G.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7109bM8839G.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7109bM8839G.buildPartial());
                }
            }
        }

        /* renamed from: G */
        public static C7109b m8839G() {
            return f9486l.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyMatrix.f9483a;
        }

        public static Parser parser() {
            return f9487m;
        }

        /* renamed from: x */
        public static Matrix m8850x() {
            return f9486l;
        }

        /* renamed from: A */
        public float m8851A() {
            return this.f9496i;
        }

        /* renamed from: B */
        public float m8852B() {
            return this.f9497j;
        }

        /* renamed from: C */
        public float m8853C() {
            return this.f9490c;
        }

        /* renamed from: D */
        public float m8854D() {
            return this.f9492e;
        }

        /* renamed from: E */
        public float m8855E() {
            return this.f9491d;
        }

        /* renamed from: F */
        public float m8856F() {
            return this.f9494g;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public C7109b newBuilderForType() {
            return m8839G();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public C7109b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7109b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public C7109b toBuilder() {
            return this == f9486l ? new C7109b() : new C7109b().m8877o(this);
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
            return getEventTime() == matrix.getEventTime() && Float.floatToIntBits(getScaleX()) == Float.floatToIntBits(matrix.getScaleX()) && Float.floatToIntBits(m8853C()) == Float.floatToIntBits(matrix.m8853C()) && Float.floatToIntBits(m8855E()) == Float.floatToIntBits(matrix.m8855E()) && Float.floatToIntBits(m8854D()) == Float.floatToIntBits(matrix.m8854D()) && Float.floatToIntBits(getScaleY()) == Float.floatToIntBits(matrix.getScaleY()) && Float.floatToIntBits(m8856F()) == Float.floatToIntBits(matrix.m8856F()) && Float.floatToIntBits(m8861z()) == Float.floatToIntBits(matrix.m8861z()) && Float.floatToIntBits(m8851A()) == Float.floatToIntBits(matrix.m8851A()) && Float.floatToIntBits(m8852B()) == Float.floatToIntBits(matrix.m8852B()) && getUnknownFields().equals(matrix.getUnknownFields());
        }

        public long getEventTime() {
            return this.f9488a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9487m;
        }

        public float getScaleX() {
            return this.f9489b;
        }

        public float getScaleY() {
            return this.f9493f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            long j9 = this.f9488a;
            int iComputeInt64Size = j9 != 0 ? CodedOutputStream.computeInt64Size(1, j9) : 0;
            if (Float.floatToRawIntBits(this.f9489b) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(2, this.f9489b);
            }
            if (Float.floatToRawIntBits(this.f9490c) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f9490c);
            }
            if (Float.floatToRawIntBits(this.f9491d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f9491d);
            }
            if (Float.floatToRawIntBits(this.f9492e) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(5, this.f9492e);
            }
            if (Float.floatToRawIntBits(this.f9493f) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(6, this.f9493f);
            }
            if (Float.floatToRawIntBits(this.f9494g) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(7, this.f9494g);
            }
            if (Float.floatToRawIntBits(this.f9495h) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(8, this.f9495h);
            }
            if (Float.floatToRawIntBits(this.f9496i) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(9, this.f9496i);
            }
            if (Float.floatToRawIntBits(this.f9497j) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(10, this.f9497j);
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getEventTime())) * 37) + 2) * 53) + Float.floatToIntBits(getScaleX())) * 37) + 3) * 53) + Float.floatToIntBits(m8853C())) * 37) + 4) * 53) + Float.floatToIntBits(m8855E())) * 37) + 5) * 53) + Float.floatToIntBits(m8854D())) * 37) + 6) * 53) + Float.floatToIntBits(getScaleY())) * 37) + 7) * 53) + Float.floatToIntBits(m8856F())) * 37) + 8) * 53) + Float.floatToIntBits(m8861z())) * 37) + 9) * 53) + Float.floatToIntBits(m8851A())) * 37) + 10) * 53) + Float.floatToIntBits(m8852B())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyMatrix.f9484b.ensureFieldAccessorsInitialized(Matrix.class, C7109b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9498k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9498k = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Matrix();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j9 = this.f9488a;
            if (j9 != 0) {
                codedOutputStream.writeInt64(1, j9);
            }
            if (Float.floatToRawIntBits(this.f9489b) != 0) {
                codedOutputStream.writeFloat(2, this.f9489b);
            }
            if (Float.floatToRawIntBits(this.f9490c) != 0) {
                codedOutputStream.writeFloat(3, this.f9490c);
            }
            if (Float.floatToRawIntBits(this.f9491d) != 0) {
                codedOutputStream.writeFloat(4, this.f9491d);
            }
            if (Float.floatToRawIntBits(this.f9492e) != 0) {
                codedOutputStream.writeFloat(5, this.f9492e);
            }
            if (Float.floatToRawIntBits(this.f9493f) != 0) {
                codedOutputStream.writeFloat(6, this.f9493f);
            }
            if (Float.floatToRawIntBits(this.f9494g) != 0) {
                codedOutputStream.writeFloat(7, this.f9494g);
            }
            if (Float.floatToRawIntBits(this.f9495h) != 0) {
                codedOutputStream.writeFloat(8, this.f9495h);
            }
            if (Float.floatToRawIntBits(this.f9496i) != 0) {
                codedOutputStream.writeFloat(9, this.f9496i);
            }
            if (Float.floatToRawIntBits(this.f9497j) != 0) {
                codedOutputStream.writeFloat(10, this.f9497j);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Matrix getDefaultInstanceForType() {
            return f9486l;
        }

        /* renamed from: z */
        public float m8861z() {
            return this.f9495h;
        }

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$b */
        public static final class C7109b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9499a;

            /* renamed from: b */
            public long f9500b;

            /* renamed from: c */
            public float f9501c;

            /* renamed from: d */
            public float f9502d;

            /* renamed from: e */
            public float f9503e;

            /* renamed from: f */
            public float f9504f;

            /* renamed from: g */
            public float f9505g;

            /* renamed from: h */
            public float f9506h;

            /* renamed from: i */
            public float f9507i;

            /* renamed from: j */
            public float f9508j;

            /* renamed from: k */
            public float f9509k;

            /* renamed from: A */
            public C7109b m8863A(float f10) {
                this.f9503e = f10;
                this.f9499a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: B */
            public C7109b m8864B(float f10) {
                this.f9506h = f10;
                this.f9499a |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public final C7109b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7109b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7109b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7109b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Matrix build() {
                Matrix matrixBuildPartial = buildPartial();
                if (matrixBuildPartial.isInitialized()) {
                    return matrixBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Matrix buildPartial() {
                Matrix matrix = new Matrix(this);
                if (this.f9499a != 0) {
                    m8869f(matrix);
                }
                onBuilt();
                return matrix;
            }

            /* renamed from: f */
            public final void m8869f(Matrix matrix) {
                int i9 = this.f9499a;
                if ((i9 & 1) != 0) {
                    matrix.f9488a = this.f9500b;
                }
                if ((i9 & 2) != 0) {
                    matrix.f9489b = this.f9501c;
                }
                if ((i9 & 4) != 0) {
                    matrix.f9490c = this.f9502d;
                }
                if ((i9 & 8) != 0) {
                    matrix.f9491d = this.f9503e;
                }
                if ((i9 & 16) != 0) {
                    matrix.f9492e = this.f9504f;
                }
                if ((i9 & 32) != 0) {
                    matrix.f9493f = this.f9505g;
                }
                if ((i9 & 64) != 0) {
                    matrix.f9494g = this.f9506h;
                }
                if ((i9 & 128) != 0) {
                    matrix.f9495h = this.f9507i;
                }
                if ((i9 & 256) != 0) {
                    matrix.f9496i = this.f9508j;
                }
                if ((i9 & 512) != 0) {
                    matrix.f9497j = this.f9509k;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7109b clear() {
                super.clear();
                this.f9499a = 0;
                this.f9500b = 0L;
                this.f9501c = 0.0f;
                this.f9502d = 0.0f;
                this.f9503e = 0.0f;
                this.f9504f = 0.0f;
                this.f9505g = 0.0f;
                this.f9506h = 0.0f;
                this.f9507i = 0.0f;
                this.f9508j = 0.0f;
                this.f9509k = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyMatrix.f9483a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7109b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7109b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7109b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7109b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyMatrix.f9484b.ensureFieldAccessorsInitialized(Matrix.class, C7109b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7109b mo24685clone() {
                return (C7109b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Matrix getDefaultInstanceForType() {
                return Matrix.m8850x();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7109b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    this.f9500b = codedInputStream.readInt64();
                                    this.f9499a |= 1;
                                case 21:
                                    this.f9501c = codedInputStream.readFloat();
                                    this.f9499a |= 2;
                                case 29:
                                    this.f9502d = codedInputStream.readFloat();
                                    this.f9499a |= 4;
                                case 37:
                                    this.f9503e = codedInputStream.readFloat();
                                    this.f9499a |= 8;
                                case 45:
                                    this.f9504f = codedInputStream.readFloat();
                                    this.f9499a |= 16;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                    this.f9505g = codedInputStream.readFloat();
                                    this.f9499a |= 32;
                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                    this.f9506h = codedInputStream.readFloat();
                                    this.f9499a |= 64;
                                case 69:
                                    this.f9507i = codedInputStream.readFloat();
                                    this.f9499a |= 128;
                                case PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT /* 77 */:
                                    this.f9508j = codedInputStream.readFloat();
                                    this.f9499a |= 256;
                                case PatchStatus.CODE_LOAD_FIND_FIELD /* 85 */:
                                    this.f9509k = codedInputStream.readFloat();
                                    this.f9499a |= 512;
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7109b mergeFrom(Message message) {
                if (message instanceof Matrix) {
                    return m8877o((Matrix) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7109b m8877o(Matrix matrix) {
                if (matrix == Matrix.m8850x()) {
                    return this;
                }
                if (matrix.getEventTime() != 0) {
                    m8879q(matrix.getEventTime());
                }
                if (matrix.getScaleX() != 0.0f) {
                    m8885w(matrix.getScaleX());
                }
                if (matrix.m8853C() != 0.0f) {
                    m8887y(matrix.m8853C());
                }
                if (matrix.m8855E() != 0.0f) {
                    m8863A(matrix.m8855E());
                }
                if (matrix.m8854D() != 0.0f) {
                    m8888z(matrix.m8854D());
                }
                if (matrix.getScaleY() != 0.0f) {
                    m8886x(matrix.getScaleY());
                }
                if (matrix.m8856F() != 0.0f) {
                    m8864B(matrix.m8856F());
                }
                if (matrix.m8861z() != 0.0f) {
                    m8881s(matrix.m8861z());
                }
                if (matrix.m8851A() != 0.0f) {
                    m8882t(matrix.m8851A());
                }
                if (matrix.m8852B() != 0.0f) {
                    m8883u(matrix.m8852B());
                }
                mergeUnknownFields(matrix.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7109b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7109b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7109b m8879q(long j9) {
                this.f9500b = j9;
                this.f9499a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7109b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7109b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: s */
            public C7109b m8881s(float f10) {
                this.f9507i = f10;
                this.f9499a |= 128;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C7109b m8882t(float f10) {
                this.f9508j = f10;
                this.f9499a |= 256;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7109b m8883u(float f10) {
                this.f9509k = f10;
                this.f9499a |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7109b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7109b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            /* renamed from: w */
            public C7109b m8885w(float f10) {
                this.f9501c = f10;
                this.f9499a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C7109b m8886x(float f10) {
                this.f9505g = f10;
                this.f9499a |= 32;
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C7109b m8887y(float f10) {
                this.f9502d = f10;
                this.f9499a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: z */
            public C7109b m8888z(float f10) {
                this.f9504f = f10;
                this.f9499a |= 16;
                onChanged();
                return this;
            }

            public C7109b() {
            }

            public C7109b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Matrix(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9488a = 0L;
            this.f9489b = 0.0f;
            this.f9490c = 0.0f;
            this.f9491d = 0.0f;
            this.f9492e = 0.0f;
            this.f9493f = 0.0f;
            this.f9494g = 0.0f;
            this.f9495h = 0.0f;
            this.f9496i = 0.0f;
            this.f9497j = 0.0f;
            this.f9498k = (byte) -1;
        }

        private Matrix() {
            this.f9488a = 0L;
            this.f9489b = 0.0f;
            this.f9490c = 0.0f;
            this.f9491d = 0.0f;
            this.f9492e = 0.0f;
            this.f9493f = 0.0f;
            this.f9494g = 0.0f;
            this.f9495h = 0.0f;
            this.f9496i = 0.0f;
            this.f9497j = 0.0f;
            this.f9498k = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8838c().getMessageTypes().get(0);
        f9483a = descriptor;
        f9484b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "ScaleX", "SkewX", "TransX", "SkewY", "ScaleY", "TransY", "PerSp0", "PerSp1", "PerSp2"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8838c() {
        return f9485c;
    }
}

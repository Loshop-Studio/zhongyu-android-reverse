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

/* loaded from: classes5.dex */
public abstract class EzyMatrix {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19031a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19032b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f19033c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/Matrix.proto\u001a\u0019google/protobuf/any.proto\"©\u0001\n\u0006Matrix\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005skewX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006transX\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005skewY\u0018\u0005 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0006 \u0001(\u0002\u0012\u000e\n\u0006transY\u0018\u0007 \u0001(\u0002\u0012\u000e\n\u0006perSp0\u0018\b \u0001(\u0002\u0012\u000e\n\u0006perSp1\u0018\t \u0001(\u0002\u0012\u000e\n\u0006perSp2\u0018\n \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyMatrixb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class Matrix extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: n */
        public static final Matrix f19034n = new Matrix();

        /* renamed from: o */
        public static final Parser f19035o = new C8486a();

        /* renamed from: c */
        public long f19036c;

        /* renamed from: d */
        public float f19037d;

        /* renamed from: e */
        public float f19038e;

        /* renamed from: f */
        public float f19039f;

        /* renamed from: g */
        public float f19040g;

        /* renamed from: h */
        public float f19041h;

        /* renamed from: i */
        public float f19042i;

        /* renamed from: j */
        public float f19043j;

        /* renamed from: k */
        public float f19044k;

        /* renamed from: l */
        public float f19045l;

        /* renamed from: m */
        public byte f19046m;

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$a */
        public class C8486a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Matrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8487b c8487bM15455D = Matrix.m15455D();
                try {
                    c8487bM15455D.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8487bM15455D.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8487bM15455D.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8487bM15455D.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8487bM15455D.buildPartial());
                }
            }
        }

        /* renamed from: D */
        public static C8487b m15455D() {
            return f19034n.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyMatrix.f19031a;
        }

        /* renamed from: p */
        public static Matrix m15466p() {
            return f19034n;
        }

        public static Parser parser() {
            return f19035o;
        }

        /* renamed from: A */
        public float m15467A() {
            return this.f19039f;
        }

        /* renamed from: C */
        public float m15468C() {
            return this.f19042i;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C8487b newBuilderForType() {
            return m15455D();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C8487b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8487b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C8487b toBuilder() {
            return this == f19034n ? new C8487b() : new C8487b().m15492n(this);
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
            return getEventTime() == matrix.getEventTime() && Float.floatToIntBits(getScaleX()) == Float.floatToIntBits(matrix.getScaleX()) && Float.floatToIntBits(m15476y()) == Float.floatToIntBits(matrix.m15476y()) && Float.floatToIntBits(m15467A()) == Float.floatToIntBits(matrix.m15467A()) && Float.floatToIntBits(m15477z()) == Float.floatToIntBits(matrix.m15477z()) && Float.floatToIntBits(getScaleY()) == Float.floatToIntBits(matrix.getScaleY()) && Float.floatToIntBits(m15468C()) == Float.floatToIntBits(matrix.m15468C()) && Float.floatToIntBits(m15473t()) == Float.floatToIntBits(matrix.m15473t()) && Float.floatToIntBits(m15474u()) == Float.floatToIntBits(matrix.m15474u()) && Float.floatToIntBits(m15475v()) == Float.floatToIntBits(matrix.m15475v()) && getUnknownFields().equals(matrix.getUnknownFields());
        }

        public long getEventTime() {
            return this.f19036c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19035o;
        }

        public float getScaleX() {
            return this.f19037d;
        }

        public float getScaleY() {
            return this.f19041h;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f19036c;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            if (Float.floatToRawIntBits(this.f19037d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(2, this.f19037d);
            }
            if (Float.floatToRawIntBits(this.f19038e) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f19038e);
            }
            if (Float.floatToRawIntBits(this.f19039f) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f19039f);
            }
            if (Float.floatToRawIntBits(this.f19040g) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(5, this.f19040g);
            }
            if (Float.floatToRawIntBits(this.f19041h) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(6, this.f19041h);
            }
            if (Float.floatToRawIntBits(this.f19042i) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(7, this.f19042i);
            }
            if (Float.floatToRawIntBits(this.f19043j) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(8, this.f19043j);
            }
            if (Float.floatToRawIntBits(this.f19044k) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(9, this.f19044k);
            }
            if (Float.floatToRawIntBits(this.f19045l) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(10, this.f19045l);
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
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getEventTime())) * 37) + 2) * 53) + Float.floatToIntBits(getScaleX())) * 37) + 3) * 53) + Float.floatToIntBits(m15476y())) * 37) + 4) * 53) + Float.floatToIntBits(m15467A())) * 37) + 5) * 53) + Float.floatToIntBits(m15477z())) * 37) + 6) * 53) + Float.floatToIntBits(getScaleY())) * 37) + 7) * 53) + Float.floatToIntBits(m15468C())) * 37) + 8) * 53) + Float.floatToIntBits(m15473t())) * 37) + 9) * 53) + Float.floatToIntBits(m15474u())) * 37) + 10) * 53) + Float.floatToIntBits(m15475v())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyMatrix.f19032b.ensureFieldAccessorsInitialized(Matrix.class, C8487b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19046m;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19046m = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Matrix();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Matrix getDefaultInstanceForType() {
            return f19034n;
        }

        /* renamed from: t */
        public float m15473t() {
            return this.f19043j;
        }

        /* renamed from: u */
        public float m15474u() {
            return this.f19044k;
        }

        /* renamed from: v */
        public float m15475v() {
            return this.f19045l;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            long j10 = this.f19036c;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            if (Float.floatToRawIntBits(this.f19037d) != 0) {
                codedOutputStream.writeFloat(2, this.f19037d);
            }
            if (Float.floatToRawIntBits(this.f19038e) != 0) {
                codedOutputStream.writeFloat(3, this.f19038e);
            }
            if (Float.floatToRawIntBits(this.f19039f) != 0) {
                codedOutputStream.writeFloat(4, this.f19039f);
            }
            if (Float.floatToRawIntBits(this.f19040g) != 0) {
                codedOutputStream.writeFloat(5, this.f19040g);
            }
            if (Float.floatToRawIntBits(this.f19041h) != 0) {
                codedOutputStream.writeFloat(6, this.f19041h);
            }
            if (Float.floatToRawIntBits(this.f19042i) != 0) {
                codedOutputStream.writeFloat(7, this.f19042i);
            }
            if (Float.floatToRawIntBits(this.f19043j) != 0) {
                codedOutputStream.writeFloat(8, this.f19043j);
            }
            if (Float.floatToRawIntBits(this.f19044k) != 0) {
                codedOutputStream.writeFloat(9, this.f19044k);
            }
            if (Float.floatToRawIntBits(this.f19045l) != 0) {
                codedOutputStream.writeFloat(10, this.f19045l);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: y */
        public float m15476y() {
            return this.f19038e;
        }

        /* renamed from: z */
        public float m15477z() {
            return this.f19040g;
        }

        /* renamed from: com.zykj.board.EzyMatrix$Matrix$b */
        public static final class C8487b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19047c;

            /* renamed from: d */
            public long f19048d;

            /* renamed from: e */
            public float f19049e;

            /* renamed from: f */
            public float f19050f;

            /* renamed from: g */
            public float f19051g;

            /* renamed from: h */
            public float f19052h;

            /* renamed from: i */
            public float f19053i;

            /* renamed from: j */
            public float f19054j;

            /* renamed from: k */
            public float f19055k;

            /* renamed from: l */
            public float f19056l;

            /* renamed from: m */
            public float f19057m;

            /* renamed from: A */
            public C8487b m15479A(float f10) {
                this.f19054j = f10;
                this.f19047c |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public final C8487b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8487b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8487b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8487b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f19047c != 0) {
                    m15484f(matrix);
                }
                onBuilt();
                return matrix;
            }

            /* renamed from: f */
            public final void m15484f(Matrix matrix) {
                int i10 = this.f19047c;
                if ((i10 & 1) != 0) {
                    matrix.f19036c = this.f19048d;
                }
                if ((i10 & 2) != 0) {
                    matrix.f19037d = this.f19049e;
                }
                if ((i10 & 4) != 0) {
                    matrix.f19038e = this.f19050f;
                }
                if ((i10 & 8) != 0) {
                    matrix.f19039f = this.f19051g;
                }
                if ((i10 & 16) != 0) {
                    matrix.f19040g = this.f19052h;
                }
                if ((i10 & 32) != 0) {
                    matrix.f19041h = this.f19053i;
                }
                if ((i10 & 64) != 0) {
                    matrix.f19042i = this.f19054j;
                }
                if ((i10 & 128) != 0) {
                    matrix.f19043j = this.f19055k;
                }
                if ((i10 & 256) != 0) {
                    matrix.f19044k = this.f19056l;
                }
                if ((i10 & 512) != 0) {
                    matrix.f19045l = this.f19057m;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8487b clear() {
                super.clear();
                this.f19047c = 0;
                this.f19048d = 0L;
                this.f19049e = 0.0f;
                this.f19050f = 0.0f;
                this.f19051g = 0.0f;
                this.f19052h = 0.0f;
                this.f19053i = 0.0f;
                this.f19054j = 0.0f;
                this.f19055k = 0.0f;
                this.f19056l = 0.0f;
                this.f19057m = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyMatrix.f19031a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8487b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8487b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8487b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8487b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyMatrix.f19032b.ensureFieldAccessorsInitialized(Matrix.class, C8487b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8487b m33981clone() {
                return (C8487b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Matrix getDefaultInstanceForType() {
                return Matrix.m15466p();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8487b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    this.f19048d = codedInputStream.readInt64();
                                    this.f19047c |= 1;
                                case 21:
                                    this.f19049e = codedInputStream.readFloat();
                                    this.f19047c |= 2;
                                case 29:
                                    this.f19050f = codedInputStream.readFloat();
                                    this.f19047c |= 4;
                                case 37:
                                    this.f19051g = codedInputStream.readFloat();
                                    this.f19047c |= 8;
                                case 45:
                                    this.f19052h = codedInputStream.readFloat();
                                    this.f19047c |= 16;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                    this.f19053i = codedInputStream.readFloat();
                                    this.f19047c |= 32;
                                case 61:
                                    this.f19054j = codedInputStream.readFloat();
                                    this.f19047c |= 64;
                                case 69:
                                    this.f19055k = codedInputStream.readFloat();
                                    this.f19047c |= 128;
                                case 77:
                                    this.f19056l = codedInputStream.readFloat();
                                    this.f19047c |= 256;
                                case PatchStatus.CODE_LOAD_FIND_FIELD /* 85 */:
                                    this.f19057m = codedInputStream.readFloat();
                                    this.f19047c |= 512;
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
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8487b mergeFrom(Message message) {
                if (message instanceof Matrix) {
                    return m15492n((Matrix) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8487b m15492n(Matrix matrix) {
                if (matrix == Matrix.m15466p()) {
                    return this;
                }
                if (matrix.getEventTime() != 0) {
                    m15494p(matrix.getEventTime());
                }
                if (matrix.getScaleX() != 0.0f) {
                    m15500v(matrix.getScaleX());
                }
                if (matrix.m15476y() != 0.0f) {
                    m15502x(matrix.m15476y());
                }
                if (matrix.m15467A() != 0.0f) {
                    m15504z(matrix.m15467A());
                }
                if (matrix.m15477z() != 0.0f) {
                    m15503y(matrix.m15477z());
                }
                if (matrix.getScaleY() != 0.0f) {
                    m15501w(matrix.getScaleY());
                }
                if (matrix.m15468C() != 0.0f) {
                    m15479A(matrix.m15468C());
                }
                if (matrix.m15473t() != 0.0f) {
                    m15496r(matrix.m15473t());
                }
                if (matrix.m15474u() != 0.0f) {
                    m15497s(matrix.m15474u());
                }
                if (matrix.m15475v() != 0.0f) {
                    m15498t(matrix.m15475v());
                }
                mergeUnknownFields(matrix.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8487b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8487b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: p */
            public C8487b m15494p(long j10) {
                this.f19048d = j10;
                this.f19047c |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8487b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8487b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C8487b m15496r(float f10) {
                this.f19055k = f10;
                this.f19047c |= 128;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C8487b m15497s(float f10) {
                this.f19056l = f10;
                this.f19047c |= 256;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C8487b m15498t(float f10) {
                this.f19057m = f10;
                this.f19047c |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8487b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8487b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: v */
            public C8487b m15500v(float f10) {
                this.f19049e = f10;
                this.f19047c |= 2;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C8487b m15501w(float f10) {
                this.f19053i = f10;
                this.f19047c |= 32;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C8487b m15502x(float f10) {
                this.f19050f = f10;
                this.f19047c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C8487b m15503y(float f10) {
                this.f19052h = f10;
                this.f19047c |= 16;
                onChanged();
                return this;
            }

            /* renamed from: z */
            public C8487b m15504z(float f10) {
                this.f19051g = f10;
                this.f19047c |= 8;
                onChanged();
                return this;
            }

            public C8487b() {
            }

            public C8487b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public Matrix(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19036c = 0L;
            this.f19037d = 0.0f;
            this.f19038e = 0.0f;
            this.f19039f = 0.0f;
            this.f19040g = 0.0f;
            this.f19041h = 0.0f;
            this.f19042i = 0.0f;
            this.f19043j = 0.0f;
            this.f19044k = 0.0f;
            this.f19045l = 0.0f;
            this.f19046m = (byte) -1;
        }

        private Matrix() {
            this.f19036c = 0L;
            this.f19037d = 0.0f;
            this.f19038e = 0.0f;
            this.f19039f = 0.0f;
            this.f19040g = 0.0f;
            this.f19041h = 0.0f;
            this.f19042i = 0.0f;
            this.f19043j = 0.0f;
            this.f19044k = 0.0f;
            this.f19045l = 0.0f;
            this.f19046m = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15454c().getMessageTypes().get(0);
        f19031a = descriptor;
        f19032b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "ScaleX", "SkewX", "TransX", "SkewY", "ScaleY", "TransY", "PerSp0", "PerSp1", "PerSp2"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m15454c() {
        return f19033c;
    }
}

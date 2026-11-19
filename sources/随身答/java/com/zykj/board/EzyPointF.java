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
public abstract class EzyPointF {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9616a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9617b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9618c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/PointF.proto\u001a\u0019google/protobuf/any.proto\"\u001e\n\u0006PointF\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyPointFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class PointF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: d */
        public static final PointF f9619d = new PointF();

        /* renamed from: e */
        public static final Parser f9620e = new C7125a();

        /* renamed from: a */
        public float f9621a;

        /* renamed from: b */
        public float f9622b;

        /* renamed from: c */
        public byte f9623c;

        /* renamed from: com.zykj.board.EzyPointF$PointF$a */
        public class C7125a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PointF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7126b c7126bM9138n = PointF.m9138n();
                try {
                    c7126bM9138n.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7126bM9138n.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7126bM9138n.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7126bM9138n.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7126bM9138n.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static PointF m9137g() {
            return f9619d;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPointF.f9616a;
        }

        /* renamed from: n */
        public static C7126b m9138n() {
            return f9619d.toBuilder();
        }

        public static Parser parser() {
            return f9620e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PointF)) {
                return super.equals(obj);
            }
            PointF pointF = (PointF) obj;
            return Float.floatToIntBits(getX()) == Float.floatToIntBits(pointF.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(pointF.getY()) && getUnknownFields().equals(pointF.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9620e;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f9621a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9621a) : 0;
            if (Float.floatToRawIntBits(this.f9622b) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f9622b);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f9621a;
        }

        public float getY() {
            return this.f9622b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPointF.f9617b.ensureFieldAccessorsInitialized(PointF.class, C7126b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9623c;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9623c = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF getDefaultInstanceForType() {
            return f9619d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PointF();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C7126b newBuilderForType() {
            return m9138n();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C7126b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7126b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7126b toBuilder() {
            return this == f9619d ? new C7126b() : new C7126b().m9155o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f9621a) != 0) {
                codedOutputStream.writeFloat(1, this.f9621a);
            }
            if (Float.floatToRawIntBits(this.f9622b) != 0) {
                codedOutputStream.writeFloat(2, this.f9622b);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPointF$PointF$b */
        public static final class C7126b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9624a;

            /* renamed from: b */
            public float f9625b;

            /* renamed from: c */
            public float f9626c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7126b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7126b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PointF build() {
                PointF pointFBuildPartial = buildPartial();
                if (pointFBuildPartial.isInitialized()) {
                    return pointFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PointF buildPartial() {
                PointF pointF = new PointF(this);
                if (this.f9624a != 0) {
                    m9147f(pointF);
                }
                onBuilt();
                return pointF;
            }

            /* renamed from: f */
            public final void m9147f(PointF pointF) {
                int i9 = this.f9624a;
                if ((i9 & 1) != 0) {
                    pointF.f9621a = this.f9625b;
                }
                if ((i9 & 2) != 0) {
                    pointF.f9622b = this.f9626c;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7126b clear() {
                super.clear();
                this.f9624a = 0;
                this.f9625b = 0.0f;
                this.f9626c = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPointF.f9616a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7126b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7126b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7126b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7126b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPointF.f9617b.ensureFieldAccessorsInitialized(PointF.class, C7126b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7126b mo24685clone() {
                return (C7126b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public PointF getDefaultInstanceForType() {
                return PointF.m9137g();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7126b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f9625b = codedInputStream.readFloat();
                                    this.f9624a |= 1;
                                } else if (tag == 21) {
                                    this.f9626c = codedInputStream.readFloat();
                                    this.f9624a |= 2;
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
            public C7126b mergeFrom(Message message) {
                if (message instanceof PointF) {
                    return m9155o((PointF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7126b m9155o(PointF pointF) {
                if (pointF == PointF.m9137g()) {
                    return this;
                }
                if (pointF.getX() != 0.0f) {
                    m9160t(pointF.getX());
                }
                if (pointF.getY() != 0.0f) {
                    m9161u(pointF.getY());
                }
                mergeUnknownFields(pointF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7126b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7126b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7126b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7126b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7126b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7126b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C7126b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7126b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: t */
            public C7126b m9160t(float f10) {
                this.f9625b = f10;
                this.f9624a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7126b m9161u(float f10) {
                this.f9626c = f10;
                this.f9624a |= 2;
                onChanged();
                return this;
            }

            public C7126b() {
            }

            public C7126b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public PointF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9621a = 0.0f;
            this.f9622b = 0.0f;
            this.f9623c = (byte) -1;
        }

        private PointF() {
            this.f9621a = 0.0f;
            this.f9622b = 0.0f;
            this.f9623c = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9134c().getMessageTypes().get(0);
        f9616a = descriptor;
        f9617b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"X", "Y"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m9134c() {
        return f9618c;
    }
}

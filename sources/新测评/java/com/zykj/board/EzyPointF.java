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
    public static final Descriptors.Descriptor f8328a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8329b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f8330c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/PointF.proto\u001a\u0019google/protobuf/any.proto\"\u001e\n\u0006PointF\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyPointFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class PointF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: d */
        public static final PointF f8331d = new PointF();

        /* renamed from: e */
        public static final Parser f8332e = new C6806a();

        /* renamed from: a */
        public float f8333a;

        /* renamed from: b */
        public float f8334b;

        /* renamed from: c */
        public byte f8335c;

        /* renamed from: com.zykj.board.EzyPointF$PointF$a */
        public class C6806a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PointF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6807b c6807bM8006m = PointF.m8006m();
                try {
                    c6807bM8006m.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6807bM8006m.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6807bM8006m.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6807bM8006m.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6807bM8006m.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPointF.f8328a;
        }

        /* renamed from: j */
        public static PointF m8005j() {
            return f8331d;
        }

        /* renamed from: m */
        public static C6807b m8006m() {
            return f8331d.toBuilder();
        }

        public static Parser parser() {
            return f8332e;
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
            return f8332e;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f8333a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f8333a) : 0;
            if (Float.floatToRawIntBits(this.f8334b) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f8334b);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f8333a;
        }

        public float getY() {
            return this.f8334b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPointF.f8329b.ensureFieldAccessorsInitialized(PointF.class, C6807b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8335c;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8335c = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF getDefaultInstanceForType() {
            return f8331d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PointF();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C6807b newBuilderForType() {
            return m8006m();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6807b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6807b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C6807b toBuilder() {
            return this == f8331d ? new C6807b() : new C6807b().m8023n(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Float.floatToRawIntBits(this.f8333a) != 0) {
                codedOutputStream.writeFloat(1, this.f8333a);
            }
            if (Float.floatToRawIntBits(this.f8334b) != 0) {
                codedOutputStream.writeFloat(2, this.f8334b);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPointF$PointF$b */
        public static final class C6807b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8336a;

            /* renamed from: b */
            public float f8337b;

            /* renamed from: c */
            public float f8338c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6807b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6807b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public PointF build() {
                PointF pointFBuildPartial = buildPartial();
                if (pointFBuildPartial.isInitialized()) {
                    return pointFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PointF buildPartial() {
                PointF pointF = new PointF(this);
                if (this.f8336a != 0) {
                    m8015e(pointF);
                }
                onBuilt();
                return pointF;
            }

            /* renamed from: e */
            public final void m8015e(PointF pointF) {
                int i10 = this.f8336a;
                if ((i10 & 1) != 0) {
                    pointF.f8333a = this.f8337b;
                }
                if ((i10 & 2) != 0) {
                    pointF.f8334b = this.f8338c;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6807b clear() {
                super.clear();
                this.f8336a = 0;
                this.f8337b = 0.0f;
                this.f8338c = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6807b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6807b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPointF.f8328a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6807b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6807b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6807b mo24228clone() {
                return (C6807b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPointF.f8329b.ensureFieldAccessorsInitialized(PointF.class, C6807b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public PointF getDefaultInstanceForType() {
                return PointF.m8005j();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6807b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f8337b = codedInputStream.readFloat();
                                    this.f8336a |= 1;
                                } else if (tag == 21) {
                                    this.f8338c = codedInputStream.readFloat();
                                    this.f8336a |= 2;
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
            public C6807b mergeFrom(Message message) {
                if (message instanceof PointF) {
                    return m8023n((PointF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6807b m8023n(PointF pointF) {
                if (pointF == PointF.m8005j()) {
                    return this;
                }
                if (pointF.getX() != 0.0f) {
                    m8028t(pointF.getX());
                }
                if (pointF.getY() != 0.0f) {
                    m8029u(pointF.getY());
                }
                mergeUnknownFields(pointF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6807b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6807b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6807b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6807b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6807b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6807b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6807b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6807b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: t */
            public C6807b m8028t(float f10) {
                this.f8337b = f10;
                this.f8336a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C6807b m8029u(float f10) {
                this.f8338c = f10;
                this.f8336a |= 2;
                onChanged();
                return this;
            }

            public C6807b() {
            }

            public C6807b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public PointF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8333a = 0.0f;
            this.f8334b = 0.0f;
            this.f8335c = (byte) -1;
        }

        private PointF() {
            this.f8333a = 0.0f;
            this.f8334b = 0.0f;
            this.f8335c = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8002c().getMessageTypes().get(0);
        f8328a = descriptor;
        f8329b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"X", "Y"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8002c() {
        return f8330c;
    }
}

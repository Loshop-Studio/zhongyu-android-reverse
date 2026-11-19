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
    public static final Descriptors.Descriptor f9343a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9344b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f9345c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/PointF.proto\u001a\u0019google/protobuf/any.proto\"\u001e\n\u0006PointF\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyPointFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class PointF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: d */
        public static final PointF f9346d = new PointF();

        /* renamed from: e */
        public static final Parser f9347e = new C7235a();

        /* renamed from: a */
        public float f9348a;

        /* renamed from: b */
        public float f9349b;

        /* renamed from: c */
        public byte f9350c;

        /* renamed from: com.zykj.board.EzyPointF$PointF$a */
        public class C7235a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PointF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7236b c7236bM8512e = PointF.m8512e();
                try {
                    c7236bM8512e.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7236bM8512e.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7236bM8512e.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7236bM8512e.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7236bM8512e.buildPartial());
                }
            }
        }

        /* renamed from: c */
        public static PointF m8511c() {
            return f9346d;
        }

        /* renamed from: e */
        public static C7236b m8512e() {
            return f9346d.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPointF.f9343a;
        }

        public static Parser parser() {
            return f9347e;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public PointF getDefaultInstanceForType() {
            return f9346d;
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

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C7236b newBuilderForType() {
            return m8512e();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9347e;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f9348a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9348a) : 0;
            if (Float.floatToRawIntBits(this.f9349b) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f9349b);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f9348a;
        }

        public float getY() {
            return this.f9349b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C7236b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7236b(builderParent);
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

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C7236b toBuilder() {
            return this == f9346d ? new C7236b() : new C7236b().m8529o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPointF.f9344b.ensureFieldAccessorsInitialized(PointF.class, C7236b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9350c;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9350c = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PointF();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (Float.floatToRawIntBits(this.f9348a) != 0) {
                codedOutputStream.writeFloat(1, this.f9348a);
            }
            if (Float.floatToRawIntBits(this.f9349b) != 0) {
                codedOutputStream.writeFloat(2, this.f9349b);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPointF$PointF$b */
        public static final class C7236b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9351a;

            /* renamed from: b */
            public float f9352b;

            /* renamed from: c */
            public float f9353c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7236b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7236b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PointF build() {
                PointF pointFBuildPartial = buildPartial();
                if (pointFBuildPartial.isInitialized()) {
                    return pointFBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointFBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public PointF buildPartial() {
                PointF pointF = new PointF(this);
                if (this.f9351a != 0) {
                    m8521g(pointF);
                }
                onBuilt();
                return pointF;
            }

            /* renamed from: g */
            public final void m8521g(PointF pointF) {
                int i10 = this.f9351a;
                if ((i10 & 1) != 0) {
                    pointF.f9348a = this.f9352b;
                }
                if ((i10 & 2) != 0) {
                    pointF.f9349b = this.f9353c;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPointF.f9343a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7236b clear() {
                super.clear();
                this.f9351a = 0;
                this.f9352b = 0.0f;
                this.f9353c = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7236b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7236b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPointF.f9344b.ensureFieldAccessorsInitialized(PointF.class, C7236b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7236b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7236b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7236b mo27381clone() {
                return (C7236b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public PointF getDefaultInstanceForType() {
                return PointF.m8511c();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7236b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f9352b = codedInputStream.readFloat();
                                    this.f9351a |= 1;
                                } else if (tag == 21) {
                                    this.f9353c = codedInputStream.readFloat();
                                    this.f9351a |= 2;
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
            public C7236b mergeFrom(Message message) {
                if (message instanceof PointF) {
                    return m8529o((PointF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7236b m8529o(PointF pointF) {
                if (pointF == PointF.m8511c()) {
                    return this;
                }
                if (pointF.getX() != 0.0f) {
                    m8534t(pointF.getX());
                }
                if (pointF.getY() != 0.0f) {
                    m8535u(pointF.getY());
                }
                mergeUnknownFields(pointF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7236b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7236b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7236b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7236b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7236b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7236b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C7236b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7236b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: t */
            public C7236b m8534t(float f10) {
                this.f9352b = f10;
                this.f9351a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7236b m8535u(float f10) {
                this.f9353c = f10;
                this.f9351a |= 2;
                onChanged();
                return this;
            }

            public C7236b() {
            }

            public C7236b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public PointF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9348a = 0.0f;
            this.f9349b = 0.0f;
            this.f9350c = (byte) -1;
        }

        private PointF() {
            this.f9348a = 0.0f;
            this.f9349b = 0.0f;
            this.f9350c = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8508c().getMessageTypes().get(0);
        f9343a = descriptor;
        f9344b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"X", "Y"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m8508c() {
        return f9345c;
    }
}

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
public abstract class EzyPointF {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19164a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19165b;

    /* renamed from: c */
    public static Descriptors.FileDescriptor f19166c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012utils/PointF.proto\u001a\u0019google/protobuf/any.proto\"\u001e\n\u0006PointF\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyPointFb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});

    public static final class PointF extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final PointF f19167f = new PointF();

        /* renamed from: g */
        public static final Parser f19168g = new C8503a();

        /* renamed from: c */
        public float f19169c;

        /* renamed from: d */
        public float f19170d;

        /* renamed from: e */
        public byte f19171e;

        /* renamed from: com.zykj.board.EzyPointF$PointF$a */
        public class C8503a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PointF parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8504b c8504bM15757f = PointF.m15757f();
                try {
                    c8504bM15757f.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8504bM15757f.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8504bM15757f.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8504bM15757f.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8504bM15757f.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static PointF m15756d() {
            return f19167f;
        }

        /* renamed from: f */
        public static C8504b m15757f() {
            return f19167f.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPointF.f19164a;
        }

        public static Parser parser() {
            return f19168g;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public PointF getDefaultInstanceForType() {
            return f19167f;
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
        public C8504b newBuilderForType() {
            return m15757f();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19168g;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.f19169c) != 0 ? CodedOutputStream.computeFloatSize(1, this.f19169c) : 0;
            if (Float.floatToRawIntBits(this.f19170d) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f19170d);
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f19169c;
        }

        public float getY() {
            return this.f19170d;
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPointF.f19165b.ensureFieldAccessorsInitialized(PointF.class, C8504b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19171e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19171e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C8504b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8504b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8504b toBuilder() {
            return this == f19167f ? new C8504b() : new C8504b().m15774n(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PointF();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (Float.floatToRawIntBits(this.f19169c) != 0) {
                codedOutputStream.writeFloat(1, this.f19169c);
            }
            if (Float.floatToRawIntBits(this.f19170d) != 0) {
                codedOutputStream.writeFloat(2, this.f19170d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPointF$PointF$b */
        public static final class C8504b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19172c;

            /* renamed from: d */
            public float f19173d;

            /* renamed from: e */
            public float f19174e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8504b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8504b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f19172c != 0) {
                    m15766f(pointF);
                }
                onBuilt();
                return pointF;
            }

            /* renamed from: f */
            public final void m15766f(PointF pointF) {
                int i10 = this.f19172c;
                if ((i10 & 1) != 0) {
                    pointF.f19169c = this.f19173d;
                }
                if ((i10 & 2) != 0) {
                    pointF.f19170d = this.f19174e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8504b clear() {
                super.clear();
                this.f19172c = 0;
                this.f19173d = 0.0f;
                this.f19174e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPointF.f19164a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8504b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8504b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8504b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8504b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPointF.f19165b.ensureFieldAccessorsInitialized(PointF.class, C8504b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8504b m33981clone() {
                return (C8504b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public PointF getDefaultInstanceForType() {
                return PointF.m15756d();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8504b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.f19173d = codedInputStream.readFloat();
                                    this.f19172c |= 1;
                                } else if (tag == 21) {
                                    this.f19174e = codedInputStream.readFloat();
                                    this.f19172c |= 2;
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
            public C8504b mergeFrom(Message message) {
                if (message instanceof PointF) {
                    return m15774n((PointF) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8504b m15774n(PointF pointF) {
                if (pointF == PointF.m15756d()) {
                    return this;
                }
                if (pointF.getX() != 0.0f) {
                    m15779s(pointF.getX());
                }
                if (pointF.getY() != 0.0f) {
                    m15780t(pointF.getY());
                }
                mergeUnknownFields(pointF.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8504b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8504b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8504b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8504b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8504b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8504b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final C8504b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8504b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: s */
            public C8504b m15779s(float f10) {
                this.f19173d = f10;
                this.f19172c |= 1;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C8504b m15780t(float f10) {
                this.f19174e = f10;
                this.f19172c |= 2;
                onChanged();
                return this;
            }

            public C8504b() {
            }

            public C8504b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public PointF(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19169c = 0.0f;
            this.f19170d = 0.0f;
            this.f19171e = (byte) -1;
        }

        private PointF() {
            this.f19169c = 0.0f;
            this.f19170d = 0.0f;
            this.f19171e = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15753c().getMessageTypes().get(0);
        f19164a = descriptor;
        f19165b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"X", "Y"});
        AnyProto.getDescriptor();
    }

    /* renamed from: c */
    public static Descriptors.FileDescriptor m15753c() {
        return f19166c;
    }
}

package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzyTouchEvent {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9548a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9549b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9550c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9551d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9552e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9553f;

    /* renamed from: g */
    public static Descriptors.FileDescriptor f9554g = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016utils/TouchEvent.proto\"¡\u0002\n\nTouchEvent\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0002 \u0001(\u0005\u0012\t\n\u0001x\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0004 \u0001(\u0002\u0012\u0014\n\fpointerCount\u0018\u0005 \u0001(\u0005\u00128\n\u0011pointerProperties\u0018\u0006 \u0003(\u000b2\u001d.TouchEvent.PointerProperties\u00120\n\rpointerCoords\u0018\u0007 \u0003(\u000b2\u0019.TouchEvent.PointerCoords\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\btoolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001f\n\u000ecom.zykj.boardB\rEzyTouchEventb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class TouchEvent extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final TouchEvent f9555i = new TouchEvent();

        /* renamed from: j */
        public static final Parser f9556j = new C7273a();

        /* renamed from: a */
        public long f9557a;

        /* renamed from: b */
        public int f9558b;

        /* renamed from: c */
        public float f9559c;

        /* renamed from: d */
        public float f9560d;

        /* renamed from: e */
        public int f9561e;

        /* renamed from: f */
        public List f9562f;

        /* renamed from: g */
        public List f9563g;

        /* renamed from: h */
        public byte f9564h;

        public static final class PointerCoords extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PointerCoords f9565d = new PointerCoords();

            /* renamed from: e */
            public static final Parser f9566e = new C7269a();

            /* renamed from: a */
            public float f9567a;

            /* renamed from: b */
            public float f9568b;

            /* renamed from: c */
            public byte f9569c;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$a */
            public class C7269a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerCoords parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7270b c7270bM9092e = PointerCoords.m9092e();
                    try {
                        c7270bM9092e.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7270bM9092e.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7270bM9092e.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7270bM9092e.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7270bM9092e.buildPartial());
                    }
                }
            }

            /* renamed from: c */
            public static PointerCoords m9091c() {
                return f9565d;
            }

            /* renamed from: e */
            public static C7270b m9092e() {
                return f9565d.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f9552e;
            }

            public static Parser parser() {
                return f9566e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PointerCoords getDefaultInstanceForType() {
                return f9565d;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PointerCoords)) {
                    return super.equals(obj);
                }
                PointerCoords pointerCoords = (PointerCoords) obj;
                return Float.floatToIntBits(getX()) == Float.floatToIntBits(pointerCoords.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(pointerCoords.getY()) && getUnknownFields().equals(pointerCoords.getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7270b newBuilderForType() {
                return m9092e();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9566e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeFloatSize = Float.floatToRawIntBits(this.f9567a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9567a) : 0;
                if (Float.floatToRawIntBits(this.f9568b) != 0) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f9568b);
                }
                int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public float getX() {
                return this.f9567a;
            }

            public float getY() {
                return this.f9568b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7270b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7270b(builderParent);
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
            public C7270b toBuilder() {
                return this == f9565d ? new C7270b() : new C7270b().m9109o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f9553f.ensureFieldAccessorsInitialized(PointerCoords.class, C7270b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9569c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9569c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerCoords();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (Float.floatToRawIntBits(this.f9567a) != 0) {
                    codedOutputStream.writeFloat(1, this.f9567a);
                }
                if (Float.floatToRawIntBits(this.f9568b) != 0) {
                    codedOutputStream.writeFloat(2, this.f9568b);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$b */
            public static final class C7270b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9570a;

                /* renamed from: b */
                public float f9571b;

                /* renamed from: c */
                public float f9572c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7270b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7270b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public PointerCoords build() {
                    PointerCoords pointerCoordsBuildPartial = buildPartial();
                    if (pointerCoordsBuildPartial.isInitialized()) {
                        return pointerCoordsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerCoordsBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public PointerCoords buildPartial() {
                    PointerCoords pointerCoords = new PointerCoords(this);
                    if (this.f9570a != 0) {
                        m9101g(pointerCoords);
                    }
                    onBuilt();
                    return pointerCoords;
                }

                /* renamed from: g */
                public final void m9101g(PointerCoords pointerCoords) {
                    int i10 = this.f9570a;
                    if ((i10 & 1) != 0) {
                        pointerCoords.f9567a = this.f9571b;
                    }
                    if ((i10 & 2) != 0) {
                        pointerCoords.f9568b = this.f9572c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f9552e;
                }

                public float getX() {
                    return this.f9571b;
                }

                public float getY() {
                    return this.f9572c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7270b clear() {
                    super.clear();
                    this.f9570a = 0;
                    this.f9571b = 0.0f;
                    this.f9572c = 0.0f;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7270b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7270b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f9553f.ensureFieldAccessorsInitialized(PointerCoords.class, C7270b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7270b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7270b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7270b mo27381clone() {
                    return (C7270b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public PointerCoords getDefaultInstanceForType() {
                    return PointerCoords.m9091c();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7270b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 13) {
                                        this.f9571b = codedInputStream.readFloat();
                                        this.f9570a |= 1;
                                    } else if (tag == 21) {
                                        this.f9572c = codedInputStream.readFloat();
                                        this.f9570a |= 2;
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
                public C7270b mergeFrom(Message message) {
                    if (message instanceof PointerCoords) {
                        return m9109o((PointerCoords) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7270b m9109o(PointerCoords pointerCoords) {
                    if (pointerCoords == PointerCoords.m9091c()) {
                        return this;
                    }
                    if (pointerCoords.getX() != 0.0f) {
                        m9114t(pointerCoords.getX());
                    }
                    if (pointerCoords.getY() != 0.0f) {
                        m9115u(pointerCoords.getY());
                    }
                    mergeUnknownFields(pointerCoords.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7270b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7270b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7270b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7270b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7270b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7270b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C7270b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7270b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: t */
                public C7270b m9114t(float f10) {
                    this.f9571b = f10;
                    this.f9570a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C7270b m9115u(float f10) {
                    this.f9572c = f10;
                    this.f9570a |= 2;
                    onChanged();
                    return this;
                }

                public C7270b() {
                }

                public C7270b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerCoords(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9567a = 0.0f;
                this.f9568b = 0.0f;
                this.f9569c = (byte) -1;
            }

            private PointerCoords() {
                this.f9567a = 0.0f;
                this.f9568b = 0.0f;
                this.f9569c = (byte) -1;
            }
        }

        public static final class PointerProperties extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PointerProperties f9573d = new PointerProperties();

            /* renamed from: e */
            public static final Parser f9574e = new C7271a();

            /* renamed from: a */
            public int f9575a;

            /* renamed from: b */
            public int f9576b;

            /* renamed from: c */
            public byte f9577c;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$a */
            public class C7271a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerProperties parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7272b c7272bM9119e = PointerProperties.m9119e();
                    try {
                        c7272bM9119e.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7272bM9119e.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7272bM9119e.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7272bM9119e.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7272bM9119e.buildPartial());
                    }
                }
            }

            /* renamed from: c */
            public static PointerProperties m9118c() {
                return f9573d;
            }

            /* renamed from: e */
            public static C7272b m9119e() {
                return f9573d.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f9550c;
            }

            public static Parser parser() {
                return f9574e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PointerProperties getDefaultInstanceForType() {
                return f9573d;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PointerProperties)) {
                    return super.equals(obj);
                }
                PointerProperties pointerProperties = (PointerProperties) obj;
                return getId() == pointerProperties.getId() && getToolType() == pointerProperties.getToolType() && getUnknownFields().equals(pointerProperties.getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7272b newBuilderForType() {
                return m9119e();
            }

            public int getId() {
                return this.f9575a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9574e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.f9575a;
                int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                int i12 = this.f9576b;
                if (i12 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getToolType() {
                return this.f9576b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7272b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7272b(builderParent);
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + getToolType()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7272b toBuilder() {
                return this == f9573d ? new C7272b() : new C7272b().m9136o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f9551d.ensureFieldAccessorsInitialized(PointerProperties.class, C7272b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9577c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9577c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerProperties();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                int i10 = this.f9575a;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(1, i10);
                }
                int i11 = this.f9576b;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(2, i11);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$b */
            public static final class C7272b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9578a;

                /* renamed from: b */
                public int f9579b;

                /* renamed from: c */
                public int f9580c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7272b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7272b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public PointerProperties build() {
                    PointerProperties pointerPropertiesBuildPartial = buildPartial();
                    if (pointerPropertiesBuildPartial.isInitialized()) {
                        return pointerPropertiesBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public PointerProperties buildPartial() {
                    PointerProperties pointerProperties = new PointerProperties(this);
                    if (this.f9578a != 0) {
                        m9128g(pointerProperties);
                    }
                    onBuilt();
                    return pointerProperties;
                }

                /* renamed from: g */
                public final void m9128g(PointerProperties pointerProperties) {
                    int i10 = this.f9578a;
                    if ((i10 & 1) != 0) {
                        pointerProperties.f9575a = this.f9579b;
                    }
                    if ((i10 & 2) != 0) {
                        pointerProperties.f9576b = this.f9580c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f9550c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7272b clear() {
                    super.clear();
                    this.f9578a = 0;
                    this.f9579b = 0;
                    this.f9580c = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7272b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7272b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f9551d.ensureFieldAccessorsInitialized(PointerProperties.class, C7272b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7272b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7272b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7272b mo27381clone() {
                    return (C7272b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public PointerProperties getDefaultInstanceForType() {
                    return PointerProperties.m9118c();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7272b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f9579b = codedInputStream.readInt32();
                                        this.f9578a |= 1;
                                    } else if (tag == 16) {
                                        this.f9580c = codedInputStream.readInt32();
                                        this.f9578a |= 2;
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
                public C7272b mergeFrom(Message message) {
                    if (message instanceof PointerProperties) {
                        return m9136o((PointerProperties) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7272b m9136o(PointerProperties pointerProperties) {
                    if (pointerProperties == PointerProperties.m9118c()) {
                        return this;
                    }
                    if (pointerProperties.getId() != 0) {
                        m9139r(pointerProperties.getId());
                    }
                    if (pointerProperties.getToolType() != 0) {
                        m9141t(pointerProperties.getToolType());
                    }
                    mergeUnknownFields(pointerProperties.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7272b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7272b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7272b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7272b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7272b m9139r(int i10) {
                    this.f9579b = i10;
                    this.f9578a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7272b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7272b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                /* renamed from: t */
                public C7272b m9141t(int i10) {
                    this.f9580c = i10;
                    this.f9578a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C7272b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7272b) super.setUnknownFields(unknownFieldSet);
                }

                public C7272b() {
                }

                public C7272b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerProperties(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9575a = 0;
                this.f9576b = 0;
                this.f9577c = (byte) -1;
            }

            private PointerProperties() {
                this.f9575a = 0;
                this.f9576b = 0;
                this.f9577c = (byte) -1;
            }
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$a */
        public class C7273a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7274b c7274bM9083o = TouchEvent.m9083o();
                try {
                    c7274bM9083o.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7274bM9083o.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7274bM9083o.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7274bM9083o.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7274bM9083o.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyTouchEvent.f9548a;
        }

        /* renamed from: l */
        public static TouchEvent m9082l() {
            return f9555i;
        }

        /* renamed from: o */
        public static C7274b m9083o() {
            return f9555i.toBuilder();
        }

        public static Parser parser() {
            return f9556j;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TouchEvent)) {
                return super.equals(obj);
            }
            TouchEvent touchEvent = (TouchEvent) obj;
            return getEventTime() == touchEvent.getEventTime() && getAction() == touchEvent.getAction() && Float.floatToIntBits(getX()) == Float.floatToIntBits(touchEvent.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(touchEvent.getY()) && getPointerCount() == touchEvent.getPointerCount() && getPointerPropertiesList().equals(touchEvent.getPointerPropertiesList()) && getPointerCoordsList().equals(touchEvent.getPointerCoordsList()) && getUnknownFields().equals(touchEvent.getUnknownFields());
        }

        public int getAction() {
            return this.f9558b;
        }

        public long getEventTime() {
            return this.f9557a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9556j;
        }

        public int getPointerCoordsCount() {
            return this.f9563g.size();
        }

        public List getPointerCoordsList() {
            return this.f9563g;
        }

        public int getPointerCount() {
            return this.f9561e;
        }

        public int getPointerPropertiesCount() {
            return this.f9562f.size();
        }

        public List getPointerPropertiesList() {
            return this.f9562f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f9557a;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            int i11 = this.f9558b;
            if (i11 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i11);
            }
            if (Float.floatToRawIntBits(this.f9559c) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f9559c);
            }
            if (Float.floatToRawIntBits(this.f9560d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f9560d);
            }
            int i12 = this.f9561e;
            if (i12 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i12);
            }
            for (int i13 = 0; i13 < this.f9562f.size(); i13++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f9562f.get(i13));
            }
            for (int i14 = 0; i14 < this.f9563g.size(); i14++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f9563g.get(i14));
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f9559c;
        }

        public float getY() {
            return this.f9560d;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getEventTime())) * 37) + 2) * 53) + getAction()) * 37) + 3) * 53) + Float.floatToIntBits(getX())) * 37) + 4) * 53) + Float.floatToIntBits(getY())) * 37) + 5) * 53) + getPointerCount();
            if (getPointerPropertiesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getPointerPropertiesList().hashCode();
            }
            if (getPointerCoordsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getPointerCoordsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyTouchEvent.f9549b.ensureFieldAccessorsInitialized(TouchEvent.class, C7274b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9564h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9564h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public TouchEvent getDefaultInstanceForType() {
            return f9555i;
        }

        /* renamed from: n */
        public PointerCoords m9085n(int i10) {
            return (PointerCoords) this.f9563g.get(i10);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchEvent();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C7274b newBuilderForType() {
            return m9083o();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C7274b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7274b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C7274b toBuilder() {
            return this == f9555i ? new C7274b() : new C7274b().m9162s(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            long j10 = this.f9557a;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            int i10 = this.f9558b;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            if (Float.floatToRawIntBits(this.f9559c) != 0) {
                codedOutputStream.writeFloat(3, this.f9559c);
            }
            if (Float.floatToRawIntBits(this.f9560d) != 0) {
                codedOutputStream.writeFloat(4, this.f9560d);
            }
            int i11 = this.f9561e;
            if (i11 != 0) {
                codedOutputStream.writeInt32(5, i11);
            }
            for (int i12 = 0; i12 < this.f9562f.size(); i12++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f9562f.get(i12));
            }
            for (int i13 = 0; i13 < this.f9563g.size(); i13++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f9563g.get(i13));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$b */
        public static final class C7274b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9581a;

            /* renamed from: b */
            public long f9582b;

            /* renamed from: c */
            public int f9583c;

            /* renamed from: d */
            public float f9584d;

            /* renamed from: e */
            public float f9585e;

            /* renamed from: f */
            public int f9586f;

            /* renamed from: g */
            public List f9587g;

            /* renamed from: h */
            public RepeatedFieldBuilderV3 f9588h;

            /* renamed from: i */
            public List f9589i;

            /* renamed from: j */
            public RepeatedFieldBuilderV3 f9590j;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public final C7274b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7274b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: B */
            public C7274b m9145B(float f10) {
                this.f9584d = f10;
                this.f9581a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: C */
            public C7274b m9146C(float f10) {
                this.f9585e = f10;
                this.f9581a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: c */
            public C7274b m9147c(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9590j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerCoordsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f9589i);
                onChanged();
                return this;
            }

            /* renamed from: e */
            public C7274b m9148e(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9588h;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerPropertiesIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f9587g);
                onChanged();
                return this;
            }

            public final void ensurePointerCoordsIsMutable() {
                if ((this.f9581a & 64) == 0) {
                    this.f9589i = new ArrayList(this.f9589i);
                    this.f9581a |= 64;
                }
            }

            public final void ensurePointerPropertiesIsMutable() {
                if ((this.f9581a & 32) == 0) {
                    this.f9587g = new ArrayList(this.f9587g);
                    this.f9581a |= 32;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C7274b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7274b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public TouchEvent build() {
                TouchEvent touchEventBuildPartial = buildPartial();
                if (touchEventBuildPartial.isInitialized()) {
                    return touchEventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchEventBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyTouchEvent.f9548a;
            }

            public final RepeatedFieldBuilderV3 getPointerCoordsFieldBuilder() {
                if (this.f9590j == null) {
                    this.f9590j = new RepeatedFieldBuilderV3(this.f9589i, (this.f9581a & 64) != 0, getParentForChildren(), isClean());
                    this.f9589i = null;
                }
                return this.f9590j;
            }

            public int getPointerCount() {
                return this.f9586f;
            }

            public final RepeatedFieldBuilderV3 getPointerPropertiesFieldBuilder() {
                if (this.f9588h == null) {
                    this.f9588h = new RepeatedFieldBuilderV3(this.f9587g, (this.f9581a & 32) != 0, getParentForChildren(), isClean());
                    this.f9587g = null;
                }
                return this.f9588h;
            }

            public float getX() {
                return this.f9584d;
            }

            public float getY() {
                return this.f9585e;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public TouchEvent buildPartial() {
                TouchEvent touchEvent = new TouchEvent(this);
                m9153j(touchEvent);
                if (this.f9581a != 0) {
                    m9152i(touchEvent);
                }
                onBuilt();
                return touchEvent;
            }

            /* renamed from: i */
            public final void m9152i(TouchEvent touchEvent) {
                int i10 = this.f9581a;
                if ((i10 & 1) != 0) {
                    touchEvent.f9557a = this.f9582b;
                }
                if ((i10 & 2) != 0) {
                    touchEvent.f9558b = this.f9583c;
                }
                if ((i10 & 4) != 0) {
                    touchEvent.f9559c = this.f9584d;
                }
                if ((i10 & 8) != 0) {
                    touchEvent.f9560d = this.f9585e;
                }
                if ((i10 & 16) != 0) {
                    touchEvent.f9561e = this.f9586f;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f9549b.ensureFieldAccessorsInitialized(TouchEvent.class, C7274b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: j */
            public final void m9153j(TouchEvent touchEvent) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9588h;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f9581a & 32) != 0) {
                        this.f9587g = Collections.unmodifiableList(this.f9587g);
                        this.f9581a &= -33;
                    }
                    touchEvent.f9562f = this.f9587g;
                } else {
                    touchEvent.f9562f = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9590j;
                if (repeatedFieldBuilderV32 != null) {
                    touchEvent.f9563g = repeatedFieldBuilderV32.build();
                    return;
                }
                if ((this.f9581a & 64) != 0) {
                    this.f9589i = Collections.unmodifiableList(this.f9589i);
                    this.f9581a &= -65;
                }
                touchEvent.f9563g = this.f9589i;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7274b clear() {
                super.clear();
                this.f9581a = 0;
                this.f9582b = 0L;
                this.f9583c = 0;
                this.f9584d = 0.0f;
                this.f9585e = 0.0f;
                this.f9586f = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9588h;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9587g = Collections.EMPTY_LIST;
                } else {
                    this.f9587g = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9581a &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9590j;
                if (repeatedFieldBuilderV32 == null) {
                    this.f9589i = Collections.EMPTY_LIST;
                } else {
                    this.f9589i = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f9581a &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7274b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7274b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7274b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7274b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7274b mo27381clone() {
                return (C7274b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public TouchEvent getDefaultInstanceForType() {
                return TouchEvent.m9082l();
            }

            /* renamed from: p */
            public PointerCoords m9159p(int i10) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9590j;
                return repeatedFieldBuilderV3 == null ? (PointerCoords) this.f9589i.get(i10) : (PointerCoords) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7274b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f9582b = codedInputStream.readInt64();
                                    this.f9581a |= 1;
                                } else if (tag == 16) {
                                    this.f9583c = codedInputStream.readInt32();
                                    this.f9581a |= 2;
                                } else if (tag == 29) {
                                    this.f9584d = codedInputStream.readFloat();
                                    this.f9581a |= 4;
                                } else if (tag == 37) {
                                    this.f9585e = codedInputStream.readFloat();
                                    this.f9581a |= 8;
                                } else if (tag == 40) {
                                    this.f9586f = codedInputStream.readInt32();
                                    this.f9581a |= 16;
                                } else if (tag == 50) {
                                    PointerProperties pointerProperties = (PointerProperties) codedInputStream.readMessage(PointerProperties.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9588h;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePointerPropertiesIsMutable();
                                        this.f9587g.add(pointerProperties);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(pointerProperties);
                                    }
                                } else if (tag == 58) {
                                    PointerCoords pointerCoords = (PointerCoords) codedInputStream.readMessage(PointerCoords.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9590j;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensurePointerCoordsIsMutable();
                                        this.f9589i.add(pointerCoords);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(pointerCoords);
                                    }
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
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7274b mergeFrom(Message message) {
                if (message instanceof TouchEvent) {
                    return m9162s((TouchEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C7274b m9162s(TouchEvent touchEvent) {
                if (touchEvent == TouchEvent.m9082l()) {
                    return this;
                }
                if (touchEvent.getEventTime() != 0) {
                    m9165v(touchEvent.getEventTime());
                }
                if (touchEvent.getAction() != 0) {
                    m9164u(touchEvent.getAction());
                }
                if (touchEvent.getX() != 0.0f) {
                    m9145B(touchEvent.getX());
                }
                if (touchEvent.getY() != 0.0f) {
                    m9146C(touchEvent.getY());
                }
                if (touchEvent.getPointerCount() != 0) {
                    m9168y(touchEvent.getPointerCount());
                }
                if (this.f9588h == null) {
                    if (!touchEvent.f9562f.isEmpty()) {
                        if (this.f9587g.isEmpty()) {
                            this.f9587g = touchEvent.f9562f;
                            this.f9581a &= -33;
                        } else {
                            ensurePointerPropertiesIsMutable();
                            this.f9587g.addAll(touchEvent.f9562f);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f9562f.isEmpty()) {
                    if (this.f9588h.isEmpty()) {
                        this.f9588h.dispose();
                        this.f9588h = null;
                        this.f9587g = touchEvent.f9562f;
                        this.f9581a &= -33;
                        this.f9588h = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointerPropertiesFieldBuilder() : null;
                    } else {
                        this.f9588h.addAllMessages(touchEvent.f9562f);
                    }
                }
                if (this.f9590j == null) {
                    if (!touchEvent.f9563g.isEmpty()) {
                        if (this.f9589i.isEmpty()) {
                            this.f9589i = touchEvent.f9563g;
                            this.f9581a &= -65;
                        } else {
                            ensurePointerCoordsIsMutable();
                            this.f9589i.addAll(touchEvent.f9563g);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f9563g.isEmpty()) {
                    if (this.f9590j.isEmpty()) {
                        this.f9590j.dispose();
                        this.f9590j = null;
                        this.f9589i = touchEvent.f9563g;
                        this.f9581a &= -65;
                        this.f9590j = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointerCoordsFieldBuilder() : null;
                    } else {
                        this.f9590j.addAllMessages(touchEvent.f9563g);
                    }
                }
                mergeUnknownFields(touchEvent.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C7274b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7274b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: u */
            public C7274b m9164u(int i10) {
                this.f9583c = i10;
                this.f9581a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7274b m9165v(long j10) {
                this.f9582b = j10;
                this.f9581a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7274b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7274b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: x */
            public C7274b m9167x(int i10, PointerCoords.C7270b c7270b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9590j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, c7270b.build());
                    return this;
                }
                ensurePointerCoordsIsMutable();
                this.f9589i.set(i10, c7270b.build());
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C7274b m9168y(int i10) {
                this.f9586f = i10;
                this.f9581a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C7274b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7274b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public C7274b() {
                List list = Collections.EMPTY_LIST;
                this.f9587g = list;
                this.f9589i = list;
            }

            public C7274b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f9587g = list;
                this.f9589i = list;
            }
        }

        public TouchEvent(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9557a = 0L;
            this.f9558b = 0;
            this.f9559c = 0.0f;
            this.f9560d = 0.0f;
            this.f9561e = 0;
            this.f9564h = (byte) -1;
        }

        private TouchEvent() {
            this.f9557a = 0L;
            this.f9558b = 0;
            this.f9559c = 0.0f;
            this.f9560d = 0.0f;
            this.f9561e = 0;
            this.f9564h = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f9562f = list;
            this.f9563g = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9071g().getMessageTypes().get(0);
        f9548a = descriptor;
        f9549b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "Action", "X", "Y", "PointerCount", "PointerProperties", "PointerCoords"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9550c = descriptor2;
        f9551d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "ToolType"});
        Descriptors.Descriptor descriptor3 = descriptor.getNestedTypes().get(1);
        f9552e = descriptor3;
        f9553f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"X", "Y"});
    }

    /* renamed from: g */
    public static Descriptors.FileDescriptor m9071g() {
        return f9554g;
    }
}

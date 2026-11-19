package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
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

/* loaded from: classes5.dex */
public abstract class EzyTouchEvent {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19369a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19370b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f19371c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f19372d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f19373e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f19374f;

    /* renamed from: g */
    public static Descriptors.FileDescriptor f19375g = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016utils/TouchEvent.proto\"¡\u0002\n\nTouchEvent\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0002 \u0001(\u0005\u0012\t\n\u0001x\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0004 \u0001(\u0002\u0012\u0014\n\fpointerCount\u0018\u0005 \u0001(\u0005\u00128\n\u0011pointerProperties\u0018\u0006 \u0003(\u000b2\u001d.TouchEvent.PointerProperties\u00120\n\rpointerCoords\u0018\u0007 \u0003(\u000b2\u0019.TouchEvent.PointerCoords\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\btoolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001f\n\u000ecom.zykj.boardB\rEzyTouchEventb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class TouchEvent extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: k */
        public static final TouchEvent f19376k = new TouchEvent();

        /* renamed from: l */
        public static final Parser f19377l = new C8541a();

        /* renamed from: c */
        public long f19378c;

        /* renamed from: d */
        public int f19379d;

        /* renamed from: e */
        public float f19380e;

        /* renamed from: f */
        public float f19381f;

        /* renamed from: g */
        public int f19382g;

        /* renamed from: h */
        public List f19383h;

        /* renamed from: i */
        public List f19384i;

        /* renamed from: j */
        public byte f19385j;

        public static final class PointerCoords extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final PointerCoords f19386f = new PointerCoords();

            /* renamed from: g */
            public static final Parser f19387g = new C8537a();

            /* renamed from: c */
            public float f19388c;

            /* renamed from: d */
            public float f19389d;

            /* renamed from: e */
            public byte f19390e;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$a */
            public class C8537a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerCoords parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8538b c8538bM16344f = PointerCoords.m16344f();
                    try {
                        c8538bM16344f.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8538bM16344f.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8538bM16344f.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8538bM16344f.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8538bM16344f.buildPartial());
                    }
                }
            }

            /* renamed from: d */
            public static PointerCoords m16343d() {
                return f19386f;
            }

            /* renamed from: f */
            public static C8538b m16344f() {
                return f19386f.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f19373e;
            }

            public static Parser parser() {
                return f19387g;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PointerCoords getDefaultInstanceForType() {
                return f19386f;
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
            public C8538b newBuilderForType() {
                return m16344f();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19387g;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeFloatSize = Float.floatToRawIntBits(this.f19388c) != 0 ? CodedOutputStream.computeFloatSize(1, this.f19388c) : 0;
                if (Float.floatToRawIntBits(this.f19389d) != 0) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f19389d);
                }
                int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public float getX() {
                return this.f19388c;
            }

            public float getY() {
                return this.f19389d;
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
                return EzyTouchEvent.f19374f.ensureFieldAccessorsInitialized(PointerCoords.class, C8538b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19390e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19390e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8538b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8538b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8538b toBuilder() {
                return this == f19386f ? new C8538b() : new C8538b().m16361n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerCoords();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (Float.floatToRawIntBits(this.f19388c) != 0) {
                    codedOutputStream.writeFloat(1, this.f19388c);
                }
                if (Float.floatToRawIntBits(this.f19389d) != 0) {
                    codedOutputStream.writeFloat(2, this.f19389d);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$b */
            public static final class C8538b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19391c;

                /* renamed from: d */
                public float f19392d;

                /* renamed from: e */
                public float f19393e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8538b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8538b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public PointerCoords build() {
                    PointerCoords pointerCoordsBuildPartial = buildPartial();
                    if (pointerCoordsBuildPartial.isInitialized()) {
                        return pointerCoordsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerCoordsBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public PointerCoords buildPartial() {
                    PointerCoords pointerCoords = new PointerCoords(this);
                    if (this.f19391c != 0) {
                        m16353f(pointerCoords);
                    }
                    onBuilt();
                    return pointerCoords;
                }

                /* renamed from: f */
                public final void m16353f(PointerCoords pointerCoords) {
                    int i10 = this.f19391c;
                    if ((i10 & 1) != 0) {
                        pointerCoords.f19388c = this.f19392d;
                    }
                    if ((i10 & 2) != 0) {
                        pointerCoords.f19389d = this.f19393e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8538b clear() {
                    super.clear();
                    this.f19391c = 0;
                    this.f19392d = 0.0f;
                    this.f19393e = 0.0f;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f19373e;
                }

                public float getX() {
                    return this.f19392d;
                }

                public float getY() {
                    return this.f19393e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8538b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8538b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8538b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8538b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f19374f.ensureFieldAccessorsInitialized(PointerCoords.class, C8538b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8538b mo33979clone() {
                    return (C8538b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public PointerCoords getDefaultInstanceForType() {
                    return PointerCoords.m16343d();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8538b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 13) {
                                        this.f19392d = codedInputStream.readFloat();
                                        this.f19391c |= 1;
                                    } else if (tag == 21) {
                                        this.f19393e = codedInputStream.readFloat();
                                        this.f19391c |= 2;
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
                public C8538b mergeFrom(Message message) {
                    if (message instanceof PointerCoords) {
                        return m16361n((PointerCoords) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C8538b m16361n(PointerCoords pointerCoords) {
                    if (pointerCoords == PointerCoords.m16343d()) {
                        return this;
                    }
                    if (pointerCoords.getX() != 0.0f) {
                        m16366s(pointerCoords.getX());
                    }
                    if (pointerCoords.getY() != 0.0f) {
                        m16367t(pointerCoords.getY());
                    }
                    mergeUnknownFields(pointerCoords.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final C8538b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8538b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8538b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8538b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C8538b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8538b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final C8538b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8538b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: s */
                public C8538b m16366s(float f10) {
                    this.f19392d = f10;
                    this.f19391c |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: t */
                public C8538b m16367t(float f10) {
                    this.f19393e = f10;
                    this.f19391c |= 2;
                    onChanged();
                    return this;
                }

                public C8538b() {
                }

                public C8538b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerCoords(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19388c = 0.0f;
                this.f19389d = 0.0f;
                this.f19390e = (byte) -1;
            }

            private PointerCoords() {
                this.f19388c = 0.0f;
                this.f19389d = 0.0f;
                this.f19390e = (byte) -1;
            }
        }

        public static final class PointerProperties extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final PointerProperties f19394f = new PointerProperties();

            /* renamed from: g */
            public static final Parser f19395g = new C8539a();

            /* renamed from: c */
            public int f19396c;

            /* renamed from: d */
            public int f19397d;

            /* renamed from: e */
            public byte f19398e;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$a */
            public class C8539a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerProperties parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8540b c8540bM16371f = PointerProperties.m16371f();
                    try {
                        c8540bM16371f.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8540bM16371f.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8540bM16371f.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8540bM16371f.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8540bM16371f.buildPartial());
                    }
                }
            }

            /* renamed from: d */
            public static PointerProperties m16370d() {
                return f19394f;
            }

            /* renamed from: f */
            public static C8540b m16371f() {
                return f19394f.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f19371c;
            }

            public static Parser parser() {
                return f19395g;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PointerProperties getDefaultInstanceForType() {
                return f19394f;
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
            public C8540b newBuilderForType() {
                return m16371f();
            }

            public int getId() {
                return this.f19396c;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19395g;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.f19396c;
                int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                int i12 = this.f19397d;
                if (i12 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getToolType() {
                return this.f19397d;
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

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f19372d.ensureFieldAccessorsInitialized(PointerProperties.class, C8540b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19398e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19398e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8540b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8540b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8540b toBuilder() {
                return this == f19394f ? new C8540b() : new C8540b().m16388n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerProperties();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                int i10 = this.f19396c;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(1, i10);
                }
                int i11 = this.f19397d;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(2, i11);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$b */
            public static final class C8540b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19399c;

                /* renamed from: d */
                public int f19400d;

                /* renamed from: e */
                public int f19401e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8540b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8540b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public PointerProperties build() {
                    PointerProperties pointerPropertiesBuildPartial = buildPartial();
                    if (pointerPropertiesBuildPartial.isInitialized()) {
                        return pointerPropertiesBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public PointerProperties buildPartial() {
                    PointerProperties pointerProperties = new PointerProperties(this);
                    if (this.f19399c != 0) {
                        m16380f(pointerProperties);
                    }
                    onBuilt();
                    return pointerProperties;
                }

                /* renamed from: f */
                public final void m16380f(PointerProperties pointerProperties) {
                    int i10 = this.f19399c;
                    if ((i10 & 1) != 0) {
                        pointerProperties.f19396c = this.f19400d;
                    }
                    if ((i10 & 2) != 0) {
                        pointerProperties.f19397d = this.f19401e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8540b clear() {
                    super.clear();
                    this.f19399c = 0;
                    this.f19400d = 0;
                    this.f19401e = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f19371c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8540b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8540b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8540b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8540b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f19372d.ensureFieldAccessorsInitialized(PointerProperties.class, C8540b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8540b mo33979clone() {
                    return (C8540b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public PointerProperties getDefaultInstanceForType() {
                    return PointerProperties.m16370d();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8540b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f19400d = codedInputStream.readInt32();
                                        this.f19399c |= 1;
                                    } else if (tag == 16) {
                                        this.f19401e = codedInputStream.readInt32();
                                        this.f19399c |= 2;
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
                public C8540b mergeFrom(Message message) {
                    if (message instanceof PointerProperties) {
                        return m16388n((PointerProperties) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C8540b m16388n(PointerProperties pointerProperties) {
                    if (pointerProperties == PointerProperties.m16370d()) {
                        return this;
                    }
                    if (pointerProperties.getId() != 0) {
                        m16391q(pointerProperties.getId());
                    }
                    if (pointerProperties.getToolType() != 0) {
                        m16393s(pointerProperties.getToolType());
                    }
                    mergeUnknownFields(pointerProperties.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final C8540b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8540b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8540b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8540b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: q */
                public C8540b m16391q(int i10) {
                    this.f19400d = i10;
                    this.f19399c |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C8540b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8540b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                /* renamed from: s */
                public C8540b m16393s(int i10) {
                    this.f19401e = i10;
                    this.f19399c |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C8540b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8540b) super.setUnknownFields(unknownFieldSet);
                }

                public C8540b() {
                }

                public C8540b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerProperties(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19396c = 0;
                this.f19397d = 0;
                this.f19398e = (byte) -1;
            }

            private PointerProperties() {
                this.f19396c = 0;
                this.f19397d = 0;
                this.f19398e = (byte) -1;
            }
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$a */
        public class C8541a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8542b c8542bM16335u = TouchEvent.m16335u();
                try {
                    c8542bM16335u.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8542bM16335u.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8542bM16335u.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8542bM16335u.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8542bM16335u.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyTouchEvent.f19369a;
        }

        /* renamed from: p */
        public static TouchEvent m16334p() {
            return f19376k;
        }

        public static Parser parser() {
            return f19377l;
        }

        /* renamed from: u */
        public static C8542b m16335u() {
            return f19376k.toBuilder();
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
            return this.f19379d;
        }

        public long getEventTime() {
            return this.f19378c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19377l;
        }

        public int getPointerCoordsCount() {
            return this.f19384i.size();
        }

        public List getPointerCoordsList() {
            return this.f19384i;
        }

        public int getPointerCount() {
            return this.f19382g;
        }

        public int getPointerPropertiesCount() {
            return this.f19383h.size();
        }

        public List getPointerPropertiesList() {
            return this.f19383h;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f19378c;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            int i11 = this.f19379d;
            if (i11 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i11);
            }
            if (Float.floatToRawIntBits(this.f19380e) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f19380e);
            }
            if (Float.floatToRawIntBits(this.f19381f) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f19381f);
            }
            int i12 = this.f19382g;
            if (i12 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i12);
            }
            for (int i13 = 0; i13 < this.f19383h.size(); i13++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f19383h.get(i13));
            }
            for (int i14 = 0; i14 < this.f19384i.size(); i14++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f19384i.get(i14));
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f19380e;
        }

        public float getY() {
            return this.f19381f;
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyTouchEvent.f19370b.ensureFieldAccessorsInitialized(TouchEvent.class, C8542b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19385j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19385j = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchEvent();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public TouchEvent getDefaultInstanceForType() {
            return f19376k;
        }

        /* renamed from: t */
        public PointerCoords m16337t(int i10) {
            return (PointerCoords) this.f19384i.get(i10);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C8542b newBuilderForType() {
            return m16335u();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            long j10 = this.f19378c;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            int i10 = this.f19379d;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            if (Float.floatToRawIntBits(this.f19380e) != 0) {
                codedOutputStream.writeFloat(3, this.f19380e);
            }
            if (Float.floatToRawIntBits(this.f19381f) != 0) {
                codedOutputStream.writeFloat(4, this.f19381f);
            }
            int i11 = this.f19382g;
            if (i11 != 0) {
                codedOutputStream.writeInt32(5, i11);
            }
            for (int i12 = 0; i12 < this.f19383h.size(); i12++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f19383h.get(i12));
            }
            for (int i13 = 0; i13 < this.f19384i.size(); i13++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f19384i.get(i13));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C8542b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8542b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public C8542b toBuilder() {
            return this == f19376k ? new C8542b() : new C8542b().m16413r(this);
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$b */
        public static final class C8542b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19402c;

            /* renamed from: d */
            public long f19403d;

            /* renamed from: e */
            public int f19404e;

            /* renamed from: f */
            public float f19405f;

            /* renamed from: g */
            public float f19406g;

            /* renamed from: h */
            public int f19407h;

            /* renamed from: i */
            public List f19408i;

            /* renamed from: j */
            public RepeatedFieldBuilderV3 f19409j;

            /* renamed from: k */
            public List f19410k;

            /* renamed from: l */
            public RepeatedFieldBuilderV3 f19411l;

            /* renamed from: A */
            public C8542b m16396A(float f10) {
                this.f19405f = f10;
                this.f19402c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: B */
            public C8542b m16397B(float f10) {
                this.f19406g = f10;
                this.f19402c |= 8;
                onChanged();
                return this;
            }

            /* renamed from: b */
            public C8542b m16398b(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19411l;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerCoordsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f19410k);
                onChanged();
                return this;
            }

            /* renamed from: d */
            public C8542b m16399d(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19409j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerPropertiesIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f19408i);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C8542b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8542b) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final void ensurePointerCoordsIsMutable() {
                if ((this.f19402c & 64) == 0) {
                    this.f19410k = new ArrayList(this.f19410k);
                    this.f19402c |= 64;
                }
            }

            public final void ensurePointerPropertiesIsMutable() {
                if ((this.f19402c & 32) == 0) {
                    this.f19408i = new ArrayList(this.f19408i);
                    this.f19402c |= 32;
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TouchEvent build() {
                TouchEvent touchEventBuildPartial = buildPartial();
                if (touchEventBuildPartial.isInitialized()) {
                    return touchEventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchEventBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public TouchEvent buildPartial() {
                TouchEvent touchEvent = new TouchEvent(this);
                m16404i(touchEvent);
                if (this.f19402c != 0) {
                    m16403h(touchEvent);
                }
                onBuilt();
                return touchEvent;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyTouchEvent.f19369a;
            }

            public final RepeatedFieldBuilderV3 getPointerCoordsFieldBuilder() {
                if (this.f19411l == null) {
                    this.f19411l = new RepeatedFieldBuilderV3(this.f19410k, (this.f19402c & 64) != 0, getParentForChildren(), isClean());
                    this.f19410k = null;
                }
                return this.f19411l;
            }

            public int getPointerCount() {
                return this.f19407h;
            }

            public final RepeatedFieldBuilderV3 getPointerPropertiesFieldBuilder() {
                if (this.f19409j == null) {
                    this.f19409j = new RepeatedFieldBuilderV3(this.f19408i, (this.f19402c & 32) != 0, getParentForChildren(), isClean());
                    this.f19408i = null;
                }
                return this.f19409j;
            }

            public float getX() {
                return this.f19405f;
            }

            public float getY() {
                return this.f19406g;
            }

            /* renamed from: h */
            public final void m16403h(TouchEvent touchEvent) {
                int i10 = this.f19402c;
                if ((i10 & 1) != 0) {
                    touchEvent.f19378c = this.f19403d;
                }
                if ((i10 & 2) != 0) {
                    touchEvent.f19379d = this.f19404e;
                }
                if ((i10 & 4) != 0) {
                    touchEvent.f19380e = this.f19405f;
                }
                if ((i10 & 8) != 0) {
                    touchEvent.f19381f = this.f19406g;
                }
                if ((i10 & 16) != 0) {
                    touchEvent.f19382g = this.f19407h;
                }
            }

            /* renamed from: i */
            public final void m16404i(TouchEvent touchEvent) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19409j;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f19402c & 32) != 0) {
                        this.f19408i = Collections.unmodifiableList(this.f19408i);
                        this.f19402c &= -33;
                    }
                    touchEvent.f19383h = this.f19408i;
                } else {
                    touchEvent.f19383h = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19411l;
                if (repeatedFieldBuilderV32 != null) {
                    touchEvent.f19384i = repeatedFieldBuilderV32.build();
                    return;
                }
                if ((this.f19402c & 64) != 0) {
                    this.f19410k = Collections.unmodifiableList(this.f19410k);
                    this.f19402c &= -65;
                }
                touchEvent.f19384i = this.f19410k;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f19370b.ensureFieldAccessorsInitialized(TouchEvent.class, C8542b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8542b clear() {
                super.clear();
                this.f19402c = 0;
                this.f19403d = 0L;
                this.f19404e = 0;
                this.f19405f = 0.0f;
                this.f19406g = 0.0f;
                this.f19407h = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19409j;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19408i = Collections.EMPTY_LIST;
                } else {
                    this.f19408i = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19402c &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19411l;
                if (repeatedFieldBuilderV32 == null) {
                    this.f19410k = Collections.EMPTY_LIST;
                } else {
                    this.f19410k = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f19402c &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8542b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8542b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8542b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8542b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8542b mo33979clone() {
                return (C8542b) super.mo33979clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public TouchEvent getDefaultInstanceForType() {
                return TouchEvent.m16334p();
            }

            /* renamed from: o */
            public PointerCoords m16410o(int i10) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19411l;
                return repeatedFieldBuilderV3 == null ? (PointerCoords) this.f19410k.get(i10) : (PointerCoords) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8542b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f19403d = codedInputStream.readInt64();
                                    this.f19402c |= 1;
                                } else if (tag == 16) {
                                    this.f19404e = codedInputStream.readInt32();
                                    this.f19402c |= 2;
                                } else if (tag == 29) {
                                    this.f19405f = codedInputStream.readFloat();
                                    this.f19402c |= 4;
                                } else if (tag == 37) {
                                    this.f19406g = codedInputStream.readFloat();
                                    this.f19402c |= 8;
                                } else if (tag == 40) {
                                    this.f19407h = codedInputStream.readInt32();
                                    this.f19402c |= 16;
                                } else if (tag == 50) {
                                    PointerProperties pointerProperties = (PointerProperties) codedInputStream.readMessage(PointerProperties.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19409j;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePointerPropertiesIsMutable();
                                        this.f19408i.add(pointerProperties);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(pointerProperties);
                                    }
                                } else if (tag == 58) {
                                    PointerCoords pointerCoords = (PointerCoords) codedInputStream.readMessage(PointerCoords.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19411l;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensurePointerCoordsIsMutable();
                                        this.f19410k.add(pointerCoords);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8542b mergeFrom(Message message) {
                if (message instanceof TouchEvent) {
                    return m16413r((TouchEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C8542b m16413r(TouchEvent touchEvent) {
                if (touchEvent == TouchEvent.m16334p()) {
                    return this;
                }
                if (touchEvent.getEventTime() != 0) {
                    m16416u(touchEvent.getEventTime());
                }
                if (touchEvent.getAction() != 0) {
                    m16415t(touchEvent.getAction());
                }
                if (touchEvent.getX() != 0.0f) {
                    m16396A(touchEvent.getX());
                }
                if (touchEvent.getY() != 0.0f) {
                    m16397B(touchEvent.getY());
                }
                if (touchEvent.getPointerCount() != 0) {
                    m16419x(touchEvent.getPointerCount());
                }
                if (this.f19409j == null) {
                    if (!touchEvent.f19383h.isEmpty()) {
                        if (this.f19408i.isEmpty()) {
                            this.f19408i = touchEvent.f19383h;
                            this.f19402c &= -33;
                        } else {
                            ensurePointerPropertiesIsMutable();
                            this.f19408i.addAll(touchEvent.f19383h);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f19383h.isEmpty()) {
                    if (this.f19409j.isEmpty()) {
                        this.f19409j.dispose();
                        this.f19409j = null;
                        this.f19408i = touchEvent.f19383h;
                        this.f19402c &= -33;
                        this.f19409j = GeneratedMessage.alwaysUseFieldBuilders ? getPointerPropertiesFieldBuilder() : null;
                    } else {
                        this.f19409j.addAllMessages(touchEvent.f19383h);
                    }
                }
                if (this.f19411l == null) {
                    if (!touchEvent.f19384i.isEmpty()) {
                        if (this.f19410k.isEmpty()) {
                            this.f19410k = touchEvent.f19384i;
                            this.f19402c &= -65;
                        } else {
                            ensurePointerCoordsIsMutable();
                            this.f19410k.addAll(touchEvent.f19384i);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f19384i.isEmpty()) {
                    if (this.f19411l.isEmpty()) {
                        this.f19411l.dispose();
                        this.f19411l = null;
                        this.f19410k = touchEvent.f19384i;
                        this.f19402c &= -65;
                        this.f19411l = GeneratedMessage.alwaysUseFieldBuilders ? getPointerCoordsFieldBuilder() : null;
                    } else {
                        this.f19411l.addAllMessages(touchEvent.f19384i);
                    }
                }
                mergeUnknownFields(touchEvent.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C8542b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8542b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: t */
            public C8542b m16415t(int i10) {
                this.f19404e = i10;
                this.f19402c |= 2;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C8542b m16416u(long j10) {
                this.f19403d = j10;
                this.f19402c |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8542b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8542b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: w */
            public C8542b m16418w(int i10, PointerCoords.C8538b c8538b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19411l;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, c8538b.build());
                    return this;
                }
                ensurePointerCoordsIsMutable();
                this.f19410k.set(i10, c8538b.build());
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C8542b m16419x(int i10) {
                this.f19407h = i10;
                this.f19402c |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C8542b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8542b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public final C8542b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8542b) super.setUnknownFields(unknownFieldSet);
            }

            public C8542b() {
                List list = Collections.EMPTY_LIST;
                this.f19408i = list;
                this.f19410k = list;
            }

            public C8542b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f19408i = list;
                this.f19410k = list;
            }
        }

        public TouchEvent(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19378c = 0L;
            this.f19379d = 0;
            this.f19380e = 0.0f;
            this.f19381f = 0.0f;
            this.f19382g = 0;
            this.f19385j = (byte) -1;
        }

        private TouchEvent() {
            this.f19378c = 0L;
            this.f19379d = 0;
            this.f19380e = 0.0f;
            this.f19381f = 0.0f;
            this.f19382g = 0;
            this.f19385j = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f19383h = list;
            this.f19384i = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m16323g().getMessageTypes().get(0);
        f19369a = descriptor;
        f19370b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "Action", "X", "Y", "PointerCount", "PointerProperties", "PointerCoords"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f19371c = descriptor2;
        f19372d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "ToolType"});
        Descriptors.Descriptor descriptor3 = descriptor.getNestedTypes().get(1);
        f19373e = descriptor3;
        f19374f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"X", "Y"});
    }

    /* renamed from: g */
    public static Descriptors.FileDescriptor m16323g() {
        return f19375g;
    }
}

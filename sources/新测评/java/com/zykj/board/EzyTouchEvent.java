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
    public static final Descriptors.Descriptor f8533a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8534b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8535c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8536d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f8537e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f8538f;

    /* renamed from: g */
    public static Descriptors.FileDescriptor f8539g = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016utils/TouchEvent.proto\"¡\u0002\n\nTouchEvent\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0002 \u0001(\u0005\u0012\t\n\u0001x\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0004 \u0001(\u0002\u0012\u0014\n\fpointerCount\u0018\u0005 \u0001(\u0005\u00128\n\u0011pointerProperties\u0018\u0006 \u0003(\u000b2\u001d.TouchEvent.PointerProperties\u00120\n\rpointerCoords\u0018\u0007 \u0003(\u000b2\u0019.TouchEvent.PointerCoords\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\btoolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001f\n\u000ecom.zykj.boardB\rEzyTouchEventb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class TouchEvent extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final TouchEvent f8540i = new TouchEvent();

        /* renamed from: j */
        public static final Parser f8541j = new C6844a();

        /* renamed from: a */
        public long f8542a;

        /* renamed from: b */
        public int f8543b;

        /* renamed from: c */
        public float f8544c;

        /* renamed from: d */
        public float f8545d;

        /* renamed from: e */
        public int f8546e;

        /* renamed from: f */
        public List f8547f;

        /* renamed from: g */
        public List f8548g;

        /* renamed from: h */
        public byte f8549h;

        public static final class PointerCoords extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PointerCoords f8550d = new PointerCoords();

            /* renamed from: e */
            public static final Parser f8551e = new C6840a();

            /* renamed from: a */
            public float f8552a;

            /* renamed from: b */
            public float f8553b;

            /* renamed from: c */
            public byte f8554c;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$a */
            public class C6840a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerCoords parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6841b c6841bM8556m = PointerCoords.m8556m();
                    try {
                        c6841bM8556m.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6841bM8556m.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6841bM8556m.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6841bM8556m.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6841bM8556m.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f8537e;
            }

            /* renamed from: j */
            public static PointerCoords m8555j() {
                return f8550d;
            }

            /* renamed from: m */
            public static C6841b m8556m() {
                return f8550d.toBuilder();
            }

            public static Parser parser() {
                return f8551e;
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

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8551e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeFloatSize = Float.floatToRawIntBits(this.f8552a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f8552a) : 0;
                if (Float.floatToRawIntBits(this.f8553b) != 0) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f8553b);
                }
                int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public float getX() {
                return this.f8552a;
            }

            public float getY() {
                return this.f8553b;
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
                return EzyTouchEvent.f8538f.ensureFieldAccessorsInitialized(PointerCoords.class, C6841b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8554c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8554c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public PointerCoords getDefaultInstanceForType() {
                return f8550d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerCoords();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C6841b newBuilderForType() {
                return m8556m();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6841b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6841b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6841b toBuilder() {
                return this == f8550d ? new C6841b() : new C6841b().m8573n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (Float.floatToRawIntBits(this.f8552a) != 0) {
                    codedOutputStream.writeFloat(1, this.f8552a);
                }
                if (Float.floatToRawIntBits(this.f8553b) != 0) {
                    codedOutputStream.writeFloat(2, this.f8553b);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$b */
            public static final class C6841b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8555a;

                /* renamed from: b */
                public float f8556b;

                /* renamed from: c */
                public float f8557c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6841b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6841b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public PointerCoords build() {
                    PointerCoords pointerCoordsBuildPartial = buildPartial();
                    if (pointerCoordsBuildPartial.isInitialized()) {
                        return pointerCoordsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerCoordsBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public PointerCoords buildPartial() {
                    PointerCoords pointerCoords = new PointerCoords(this);
                    if (this.f8555a != 0) {
                        m8565e(pointerCoords);
                    }
                    onBuilt();
                    return pointerCoords;
                }

                /* renamed from: e */
                public final void m8565e(PointerCoords pointerCoords) {
                    int i10 = this.f8555a;
                    if ((i10 & 1) != 0) {
                        pointerCoords.f8552a = this.f8556b;
                    }
                    if ((i10 & 2) != 0) {
                        pointerCoords.f8553b = this.f8557c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6841b clear() {
                    super.clear();
                    this.f8555a = 0;
                    this.f8556b = 0.0f;
                    this.f8557c = 0.0f;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6841b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6841b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f8537e;
                }

                public float getX() {
                    return this.f8556b;
                }

                public float getY() {
                    return this.f8557c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6841b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6841b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6841b mo24228clone() {
                    return (C6841b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f8538f.ensureFieldAccessorsInitialized(PointerCoords.class, C6841b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public PointerCoords getDefaultInstanceForType() {
                    return PointerCoords.m8555j();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6841b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 13) {
                                        this.f8556b = codedInputStream.readFloat();
                                        this.f8555a |= 1;
                                    } else if (tag == 21) {
                                        this.f8557c = codedInputStream.readFloat();
                                        this.f8555a |= 2;
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
                public C6841b mergeFrom(Message message) {
                    if (message instanceof PointerCoords) {
                        return m8573n((PointerCoords) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C6841b m8573n(PointerCoords pointerCoords) {
                    if (pointerCoords == PointerCoords.m8555j()) {
                        return this;
                    }
                    if (pointerCoords.getX() != 0.0f) {
                        m8578t(pointerCoords.getX());
                    }
                    if (pointerCoords.getY() != 0.0f) {
                        m8579u(pointerCoords.getY());
                    }
                    mergeUnknownFields(pointerCoords.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C6841b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6841b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C6841b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6841b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C6841b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6841b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C6841b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6841b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: t */
                public C6841b m8578t(float f10) {
                    this.f8556b = f10;
                    this.f8555a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C6841b m8579u(float f10) {
                    this.f8557c = f10;
                    this.f8555a |= 2;
                    onChanged();
                    return this;
                }

                public C6841b() {
                }

                public C6841b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerCoords(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8552a = 0.0f;
                this.f8553b = 0.0f;
                this.f8554c = (byte) -1;
            }

            private PointerCoords() {
                this.f8552a = 0.0f;
                this.f8553b = 0.0f;
                this.f8554c = (byte) -1;
            }
        }

        public static final class PointerProperties extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PointerProperties f8558d = new PointerProperties();

            /* renamed from: e */
            public static final Parser f8559e = new C6842a();

            /* renamed from: a */
            public int f8560a;

            /* renamed from: b */
            public int f8561b;

            /* renamed from: c */
            public byte f8562c;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$a */
            public class C6842a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerProperties parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6843b c6843bM8583m = PointerProperties.m8583m();
                    try {
                        c6843bM8583m.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6843bM8583m.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6843bM8583m.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6843bM8583m.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6843bM8583m.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f8535c;
            }

            /* renamed from: j */
            public static PointerProperties m8582j() {
                return f8558d;
            }

            /* renamed from: m */
            public static C6843b m8583m() {
                return f8558d.toBuilder();
            }

            public static Parser parser() {
                return f8559e;
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

            public int getId() {
                return this.f8560a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8559e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.f8560a;
                int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                int i12 = this.f8561b;
                if (i12 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getToolType() {
                return this.f8561b;
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

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f8536d.ensureFieldAccessorsInitialized(PointerProperties.class, C6843b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8562c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8562c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public PointerProperties getDefaultInstanceForType() {
                return f8558d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerProperties();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C6843b newBuilderForType() {
                return m8583m();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6843b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6843b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6843b toBuilder() {
                return this == f8558d ? new C6843b() : new C6843b().m8600n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i10 = this.f8560a;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(1, i10);
                }
                int i11 = this.f8561b;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(2, i11);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$b */
            public static final class C6843b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8563a;

                /* renamed from: b */
                public int f8564b;

                /* renamed from: c */
                public int f8565c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6843b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6843b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public PointerProperties build() {
                    PointerProperties pointerPropertiesBuildPartial = buildPartial();
                    if (pointerPropertiesBuildPartial.isInitialized()) {
                        return pointerPropertiesBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public PointerProperties buildPartial() {
                    PointerProperties pointerProperties = new PointerProperties(this);
                    if (this.f8563a != 0) {
                        m8592e(pointerProperties);
                    }
                    onBuilt();
                    return pointerProperties;
                }

                /* renamed from: e */
                public final void m8592e(PointerProperties pointerProperties) {
                    int i10 = this.f8563a;
                    if ((i10 & 1) != 0) {
                        pointerProperties.f8560a = this.f8564b;
                    }
                    if ((i10 & 2) != 0) {
                        pointerProperties.f8561b = this.f8565c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6843b clear() {
                    super.clear();
                    this.f8563a = 0;
                    this.f8564b = 0;
                    this.f8565c = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6843b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6843b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f8535c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6843b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6843b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6843b mo24228clone() {
                    return (C6843b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f8536d.ensureFieldAccessorsInitialized(PointerProperties.class, C6843b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public PointerProperties getDefaultInstanceForType() {
                    return PointerProperties.m8582j();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6843b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f8564b = codedInputStream.readInt32();
                                        this.f8563a |= 1;
                                    } else if (tag == 16) {
                                        this.f8565c = codedInputStream.readInt32();
                                        this.f8563a |= 2;
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
                public C6843b mergeFrom(Message message) {
                    if (message instanceof PointerProperties) {
                        return m8600n((PointerProperties) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C6843b m8600n(PointerProperties pointerProperties) {
                    if (pointerProperties == PointerProperties.m8582j()) {
                        return this;
                    }
                    if (pointerProperties.getId() != 0) {
                        m8603r(pointerProperties.getId());
                    }
                    if (pointerProperties.getToolType() != 0) {
                        m8605t(pointerProperties.getToolType());
                    }
                    mergeUnknownFields(pointerProperties.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C6843b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6843b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C6843b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6843b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C6843b m8603r(int i10) {
                    this.f8564b = i10;
                    this.f8563a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C6843b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6843b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                /* renamed from: t */
                public C6843b m8605t(int i10) {
                    this.f8565c = i10;
                    this.f8563a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C6843b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6843b) super.setUnknownFields(unknownFieldSet);
                }

                public C6843b() {
                }

                public C6843b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerProperties(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8560a = 0;
                this.f8561b = 0;
                this.f8562c = (byte) -1;
            }

            private PointerProperties() {
                this.f8560a = 0;
                this.f8561b = 0;
                this.f8562c = (byte) -1;
            }
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$a */
        public class C6844a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6845b c6845bM8547x = TouchEvent.m8547x();
                try {
                    c6845bM8547x.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6845bM8547x.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6845bM8547x.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6845bM8547x.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6845bM8547x.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyTouchEvent.f8533a;
        }

        public static Parser parser() {
            return f8541j;
        }

        /* renamed from: u */
        public static TouchEvent m8546u() {
            return f8540i;
        }

        /* renamed from: x */
        public static C6845b m8547x() {
            return f8540i.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C6845b toBuilder() {
            return this == f8540i ? new C6845b() : new C6845b().m8626s(this);
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
            return this.f8543b;
        }

        public long getEventTime() {
            return this.f8542a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8541j;
        }

        public int getPointerCoordsCount() {
            return this.f8548g.size();
        }

        public List getPointerCoordsList() {
            return this.f8548g;
        }

        public int getPointerCount() {
            return this.f8546e;
        }

        public int getPointerPropertiesCount() {
            return this.f8547f.size();
        }

        public List getPointerPropertiesList() {
            return this.f8547f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f8542a;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
            int i11 = this.f8543b;
            if (i11 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i11);
            }
            if (Float.floatToRawIntBits(this.f8544c) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f8544c);
            }
            if (Float.floatToRawIntBits(this.f8545d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f8545d);
            }
            int i12 = this.f8546e;
            if (i12 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i12);
            }
            for (int i13 = 0; i13 < this.f8547f.size(); i13++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f8547f.get(i13));
            }
            for (int i14 = 0; i14 < this.f8548g.size(); i14++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f8548g.get(i14));
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f8544c;
        }

        public float getY() {
            return this.f8545d;
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
            return EzyTouchEvent.f8534b.ensureFieldAccessorsInitialized(TouchEvent.class, C6845b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8549h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8549h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchEvent();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public TouchEvent getDefaultInstanceForType() {
            return f8540i;
        }

        /* renamed from: w */
        public PointerCoords m8550w(int i10) {
            return (PointerCoords) this.f8548g.get(i10);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.f8542a;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            int i10 = this.f8543b;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            if (Float.floatToRawIntBits(this.f8544c) != 0) {
                codedOutputStream.writeFloat(3, this.f8544c);
            }
            if (Float.floatToRawIntBits(this.f8545d) != 0) {
                codedOutputStream.writeFloat(4, this.f8545d);
            }
            int i11 = this.f8546e;
            if (i11 != 0) {
                codedOutputStream.writeInt32(5, i11);
            }
            for (int i12 = 0; i12 < this.f8547f.size(); i12++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f8547f.get(i12));
            }
            for (int i13 = 0; i13 < this.f8548g.size(); i13++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f8548g.get(i13));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C6845b newBuilderForType() {
            return m8547x();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public C6845b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6845b(builderParent);
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$b */
        public static final class C6845b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8566a;

            /* renamed from: b */
            public long f8567b;

            /* renamed from: c */
            public int f8568c;

            /* renamed from: d */
            public float f8569d;

            /* renamed from: e */
            public float f8570e;

            /* renamed from: f */
            public int f8571f;

            /* renamed from: g */
            public List f8572g;

            /* renamed from: h */
            public RepeatedFieldBuilderV3 f8573h;

            /* renamed from: i */
            public List f8574i;

            /* renamed from: j */
            public RepeatedFieldBuilderV3 f8575j;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public final C6845b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6845b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: B */
            public C6845b m8609B(float f10) {
                this.f8569d = f10;
                this.f8566a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: C */
            public C6845b m8610C(float f10) {
                this.f8570e = f10;
                this.f8566a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: b */
            public C6845b m8611b(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8575j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerCoordsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f8574i);
                onChanged();
                return this;
            }

            /* renamed from: c */
            public C6845b m8612c(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8573h;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerPropertiesIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f8572g);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C6845b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6845b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public TouchEvent build() {
                TouchEvent touchEventBuildPartial = buildPartial();
                if (touchEventBuildPartial.isInitialized()) {
                    return touchEventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchEventBuildPartial);
            }

            public final void ensurePointerCoordsIsMutable() {
                if ((this.f8566a & 64) == 0) {
                    this.f8574i = new ArrayList(this.f8574i);
                    this.f8566a |= 64;
                }
            }

            public final void ensurePointerPropertiesIsMutable() {
                if ((this.f8566a & 32) == 0) {
                    this.f8572g = new ArrayList(this.f8572g);
                    this.f8566a |= 32;
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TouchEvent buildPartial() {
                TouchEvent touchEvent = new TouchEvent(this);
                m8617h(touchEvent);
                if (this.f8566a != 0) {
                    m8616g(touchEvent);
                }
                onBuilt();
                return touchEvent;
            }

            /* renamed from: g */
            public final void m8616g(TouchEvent touchEvent) {
                int i10 = this.f8566a;
                if ((i10 & 1) != 0) {
                    touchEvent.f8542a = this.f8567b;
                }
                if ((i10 & 2) != 0) {
                    touchEvent.f8543b = this.f8568c;
                }
                if ((i10 & 4) != 0) {
                    touchEvent.f8544c = this.f8569d;
                }
                if ((i10 & 8) != 0) {
                    touchEvent.f8545d = this.f8570e;
                }
                if ((i10 & 16) != 0) {
                    touchEvent.f8546e = this.f8571f;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyTouchEvent.f8533a;
            }

            public final RepeatedFieldBuilderV3 getPointerCoordsFieldBuilder() {
                if (this.f8575j == null) {
                    this.f8575j = new RepeatedFieldBuilderV3(this.f8574i, (this.f8566a & 64) != 0, getParentForChildren(), isClean());
                    this.f8574i = null;
                }
                return this.f8575j;
            }

            public int getPointerCount() {
                return this.f8571f;
            }

            public final RepeatedFieldBuilderV3 getPointerPropertiesFieldBuilder() {
                if (this.f8573h == null) {
                    this.f8573h = new RepeatedFieldBuilderV3(this.f8572g, (this.f8566a & 32) != 0, getParentForChildren(), isClean());
                    this.f8572g = null;
                }
                return this.f8573h;
            }

            public float getX() {
                return this.f8569d;
            }

            public float getY() {
                return this.f8570e;
            }

            /* renamed from: h */
            public final void m8617h(TouchEvent touchEvent) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8573h;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f8566a & 32) != 0) {
                        this.f8572g = Collections.unmodifiableList(this.f8572g);
                        this.f8566a &= -33;
                    }
                    touchEvent.f8547f = this.f8572g;
                } else {
                    touchEvent.f8547f = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8575j;
                if (repeatedFieldBuilderV32 != null) {
                    touchEvent.f8548g = repeatedFieldBuilderV32.build();
                    return;
                }
                if ((this.f8566a & 64) != 0) {
                    this.f8574i = Collections.unmodifiableList(this.f8574i);
                    this.f8566a &= -65;
                }
                touchEvent.f8548g = this.f8574i;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6845b clear() {
                super.clear();
                this.f8566a = 0;
                this.f8567b = 0L;
                this.f8568c = 0;
                this.f8569d = 0.0f;
                this.f8570e = 0.0f;
                this.f8571f = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8573h;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8572g = Collections.EMPTY_LIST;
                } else {
                    this.f8572g = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8566a &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8575j;
                if (repeatedFieldBuilderV32 == null) {
                    this.f8574i = Collections.EMPTY_LIST;
                } else {
                    this.f8574i = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f8566a &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f8534b.ensureFieldAccessorsInitialized(TouchEvent.class, C6845b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6845b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6845b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6845b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6845b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C6845b mo24228clone() {
                return (C6845b) super.mo24228clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public TouchEvent getDefaultInstanceForType() {
                return TouchEvent.m8546u();
            }

            /* renamed from: p */
            public PointerCoords m8623p(int i10) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8575j;
                return repeatedFieldBuilderV3 == null ? (PointerCoords) this.f8574i.get(i10) : (PointerCoords) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6845b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f8567b = codedInputStream.readInt64();
                                    this.f8566a |= 1;
                                } else if (tag == 16) {
                                    this.f8568c = codedInputStream.readInt32();
                                    this.f8566a |= 2;
                                } else if (tag == 29) {
                                    this.f8569d = codedInputStream.readFloat();
                                    this.f8566a |= 4;
                                } else if (tag == 37) {
                                    this.f8570e = codedInputStream.readFloat();
                                    this.f8566a |= 8;
                                } else if (tag == 40) {
                                    this.f8571f = codedInputStream.readInt32();
                                    this.f8566a |= 16;
                                } else if (tag == 50) {
                                    PointerProperties pointerProperties = (PointerProperties) codedInputStream.readMessage(PointerProperties.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8573h;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePointerPropertiesIsMutable();
                                        this.f8572g.add(pointerProperties);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(pointerProperties);
                                    }
                                } else if (tag == 58) {
                                    PointerCoords pointerCoords = (PointerCoords) codedInputStream.readMessage(PointerCoords.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8575j;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensurePointerCoordsIsMutable();
                                        this.f8574i.add(pointerCoords);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(pointerCoords);
                                    }
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
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6845b mergeFrom(Message message) {
                if (message instanceof TouchEvent) {
                    return m8626s((TouchEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C6845b m8626s(TouchEvent touchEvent) {
                if (touchEvent == TouchEvent.m8546u()) {
                    return this;
                }
                if (touchEvent.getEventTime() != 0) {
                    m8629v(touchEvent.getEventTime());
                }
                if (touchEvent.getAction() != 0) {
                    m8628u(touchEvent.getAction());
                }
                if (touchEvent.getX() != 0.0f) {
                    m8609B(touchEvent.getX());
                }
                if (touchEvent.getY() != 0.0f) {
                    m8610C(touchEvent.getY());
                }
                if (touchEvent.getPointerCount() != 0) {
                    m8632y(touchEvent.getPointerCount());
                }
                if (this.f8573h == null) {
                    if (!touchEvent.f8547f.isEmpty()) {
                        if (this.f8572g.isEmpty()) {
                            this.f8572g = touchEvent.f8547f;
                            this.f8566a &= -33;
                        } else {
                            ensurePointerPropertiesIsMutable();
                            this.f8572g.addAll(touchEvent.f8547f);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f8547f.isEmpty()) {
                    if (this.f8573h.isEmpty()) {
                        this.f8573h.dispose();
                        this.f8573h = null;
                        this.f8572g = touchEvent.f8547f;
                        this.f8566a &= -33;
                        this.f8573h = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointerPropertiesFieldBuilder() : null;
                    } else {
                        this.f8573h.addAllMessages(touchEvent.f8547f);
                    }
                }
                if (this.f8575j == null) {
                    if (!touchEvent.f8548g.isEmpty()) {
                        if (this.f8574i.isEmpty()) {
                            this.f8574i = touchEvent.f8548g;
                            this.f8566a &= -65;
                        } else {
                            ensurePointerCoordsIsMutable();
                            this.f8574i.addAll(touchEvent.f8548g);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f8548g.isEmpty()) {
                    if (this.f8575j.isEmpty()) {
                        this.f8575j.dispose();
                        this.f8575j = null;
                        this.f8574i = touchEvent.f8548g;
                        this.f8566a &= -65;
                        this.f8575j = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointerCoordsFieldBuilder() : null;
                    } else {
                        this.f8575j.addAllMessages(touchEvent.f8548g);
                    }
                }
                mergeUnknownFields(touchEvent.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C6845b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6845b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: u */
            public C6845b m8628u(int i10) {
                this.f8568c = i10;
                this.f8566a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C6845b m8629v(long j10) {
                this.f8567b = j10;
                this.f8566a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C6845b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6845b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: x */
            public C6845b m8631x(int i10, PointerCoords.C6841b c6841b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8575j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i10, c6841b.build());
                    return this;
                }
                ensurePointerCoordsIsMutable();
                this.f8574i.set(i10, c6841b.build());
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C6845b m8632y(int i10) {
                this.f8571f = i10;
                this.f8566a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C6845b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6845b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public C6845b() {
                List list = Collections.EMPTY_LIST;
                this.f8572g = list;
                this.f8574i = list;
            }

            public C6845b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f8572g = list;
                this.f8574i = list;
            }
        }

        public TouchEvent(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8542a = 0L;
            this.f8543b = 0;
            this.f8544c = 0.0f;
            this.f8545d = 0.0f;
            this.f8546e = 0;
            this.f8549h = (byte) -1;
        }

        private TouchEvent() {
            this.f8542a = 0L;
            this.f8543b = 0;
            this.f8544c = 0.0f;
            this.f8545d = 0.0f;
            this.f8546e = 0;
            this.f8549h = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f8547f = list;
            this.f8548g = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8535g().getMessageTypes().get(0);
        f8533a = descriptor;
        f8534b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "Action", "X", "Y", "PointerCount", "PointerProperties", "PointerCoords"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f8535c = descriptor2;
        f8536d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "ToolType"});
        Descriptors.Descriptor descriptor3 = descriptor.getNestedTypes().get(1);
        f8537e = descriptor3;
        f8538f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"X", "Y"});
    }

    /* renamed from: g */
    public static Descriptors.FileDescriptor m8535g() {
        return f8539g;
    }
}

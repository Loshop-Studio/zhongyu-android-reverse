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
    public static final Descriptors.Descriptor f9821a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9822b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9823c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9824d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9825e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9826f;

    /* renamed from: g */
    public static Descriptors.FileDescriptor f9827g = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016utils/TouchEvent.proto\"¡\u0002\n\nTouchEvent\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0002 \u0001(\u0005\u0012\t\n\u0001x\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0004 \u0001(\u0002\u0012\u0014\n\fpointerCount\u0018\u0005 \u0001(\u0005\u00128\n\u0011pointerProperties\u0018\u0006 \u0003(\u000b2\u001d.TouchEvent.PointerProperties\u00120\n\rpointerCoords\u0018\u0007 \u0003(\u000b2\u0019.TouchEvent.PointerCoords\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\btoolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001f\n\u000ecom.zykj.boardB\rEzyTouchEventb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class TouchEvent extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final TouchEvent f9828i = new TouchEvent();

        /* renamed from: j */
        public static final Parser f9829j = new C7163a();

        /* renamed from: a */
        public long f9830a;

        /* renamed from: b */
        public int f9831b;

        /* renamed from: c */
        public float f9832c;

        /* renamed from: d */
        public float f9833d;

        /* renamed from: e */
        public int f9834e;

        /* renamed from: f */
        public List f9835f;

        /* renamed from: g */
        public List f9836g;

        /* renamed from: h */
        public byte f9837h;

        public static final class PointerCoords extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PointerCoords f9838d = new PointerCoords();

            /* renamed from: e */
            public static final Parser f9839e = new C7159a();

            /* renamed from: a */
            public float f9840a;

            /* renamed from: b */
            public float f9841b;

            /* renamed from: c */
            public byte f9842c;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$a */
            public class C7159a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerCoords parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7160b c7160bM9715n = PointerCoords.m9715n();
                    try {
                        c7160bM9715n.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7160bM9715n.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7160bM9715n.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7160bM9715n.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7160bM9715n.buildPartial());
                    }
                }
            }

            /* renamed from: g */
            public static PointerCoords m9714g() {
                return f9838d;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f9825e;
            }

            /* renamed from: n */
            public static C7160b m9715n() {
                return f9838d.toBuilder();
            }

            public static Parser parser() {
                return f9839e;
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
                return f9839e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeFloatSize = Float.floatToRawIntBits(this.f9840a) != 0 ? CodedOutputStream.computeFloatSize(1, this.f9840a) : 0;
                if (Float.floatToRawIntBits(this.f9841b) != 0) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.f9841b);
                }
                int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public float getX() {
                return this.f9840a;
            }

            public float getY() {
                return this.f9841b;
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
                return EzyTouchEvent.f9826f.ensureFieldAccessorsInitialized(PointerCoords.class, C7160b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9842c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9842c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public PointerCoords getDefaultInstanceForType() {
                return f9838d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerCoords();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7160b newBuilderForType() {
                return m9715n();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7160b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7160b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7160b toBuilder() {
                return this == f9838d ? new C7160b() : new C7160b().m9732o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (Float.floatToRawIntBits(this.f9840a) != 0) {
                    codedOutputStream.writeFloat(1, this.f9840a);
                }
                if (Float.floatToRawIntBits(this.f9841b) != 0) {
                    codedOutputStream.writeFloat(2, this.f9841b);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords$b */
            public static final class C7160b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9843a;

                /* renamed from: b */
                public float f9844b;

                /* renamed from: c */
                public float f9845c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7160b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7160b) super.addRepeatedField(fieldDescriptor, obj);
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
                    if (this.f9843a != 0) {
                        m9724f(pointerCoords);
                    }
                    onBuilt();
                    return pointerCoords;
                }

                /* renamed from: f */
                public final void m9724f(PointerCoords pointerCoords) {
                    int i9 = this.f9843a;
                    if ((i9 & 1) != 0) {
                        pointerCoords.f9840a = this.f9844b;
                    }
                    if ((i9 & 2) != 0) {
                        pointerCoords.f9841b = this.f9845c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7160b clear() {
                    super.clear();
                    this.f9843a = 0;
                    this.f9844b = 0.0f;
                    this.f9845c = 0.0f;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f9825e;
                }

                public float getX() {
                    return this.f9844b;
                }

                public float getY() {
                    return this.f9845c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7160b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7160b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7160b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7160b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f9826f.ensureFieldAccessorsInitialized(PointerCoords.class, C7160b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7160b mo24685clone() {
                    return (C7160b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public PointerCoords getDefaultInstanceForType() {
                    return PointerCoords.m9714g();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7160b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 13) {
                                        this.f9844b = codedInputStream.readFloat();
                                        this.f9843a |= 1;
                                    } else if (tag == 21) {
                                        this.f9845c = codedInputStream.readFloat();
                                        this.f9843a |= 2;
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
                public C7160b mergeFrom(Message message) {
                    if (message instanceof PointerCoords) {
                        return m9732o((PointerCoords) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7160b m9732o(PointerCoords pointerCoords) {
                    if (pointerCoords == PointerCoords.m9714g()) {
                        return this;
                    }
                    if (pointerCoords.getX() != 0.0f) {
                        m9737t(pointerCoords.getX());
                    }
                    if (pointerCoords.getY() != 0.0f) {
                        m9738u(pointerCoords.getY());
                    }
                    mergeUnknownFields(pointerCoords.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7160b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7160b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7160b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7160b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7160b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7160b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C7160b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7160b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: t */
                public C7160b m9737t(float f10) {
                    this.f9844b = f10;
                    this.f9843a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C7160b m9738u(float f10) {
                    this.f9845c = f10;
                    this.f9843a |= 2;
                    onChanged();
                    return this;
                }

                public C7160b() {
                }

                public C7160b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerCoords(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9840a = 0.0f;
                this.f9841b = 0.0f;
                this.f9842c = (byte) -1;
            }

            private PointerCoords() {
                this.f9840a = 0.0f;
                this.f9841b = 0.0f;
                this.f9842c = (byte) -1;
            }
        }

        public static final class PointerProperties extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PointerProperties f9846d = new PointerProperties();

            /* renamed from: e */
            public static final Parser f9847e = new C7161a();

            /* renamed from: a */
            public int f9848a;

            /* renamed from: b */
            public int f9849b;

            /* renamed from: c */
            public byte f9850c;

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$a */
            public class C7161a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PointerProperties parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7162b c7162bM9742n = PointerProperties.m9742n();
                    try {
                        c7162bM9742n.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7162bM9742n.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7162bM9742n.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7162bM9742n.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7162bM9742n.buildPartial());
                    }
                }
            }

            /* renamed from: g */
            public static PointerProperties m9741g() {
                return f9846d;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyTouchEvent.f9823c;
            }

            /* renamed from: n */
            public static C7162b m9742n() {
                return f9846d.toBuilder();
            }

            public static Parser parser() {
                return f9847e;
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
                return this.f9848a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9847e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int i10 = this.f9848a;
                int iComputeInt32Size = i10 != 0 ? CodedOutputStream.computeInt32Size(1, i10) : 0;
                int i11 = this.f9849b;
                if (i11 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i11);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getToolType() {
                return this.f9849b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + getToolType()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f9824d.ensureFieldAccessorsInitialized(PointerProperties.class, C7162b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9850c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9850c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public PointerProperties getDefaultInstanceForType() {
                return f9846d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PointerProperties();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7162b newBuilderForType() {
                return m9742n();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7162b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7162b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7162b toBuilder() {
                return this == f9846d ? new C7162b() : new C7162b().m9759o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i9 = this.f9848a;
                if (i9 != 0) {
                    codedOutputStream.writeInt32(1, i9);
                }
                int i10 = this.f9849b;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$PointerProperties$b */
            public static final class C7162b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9851a;

                /* renamed from: b */
                public int f9852b;

                /* renamed from: c */
                public int f9853c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7162b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7162b) super.addRepeatedField(fieldDescriptor, obj);
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
                    if (this.f9851a != 0) {
                        m9751f(pointerProperties);
                    }
                    onBuilt();
                    return pointerProperties;
                }

                /* renamed from: f */
                public final void m9751f(PointerProperties pointerProperties) {
                    int i9 = this.f9851a;
                    if ((i9 & 1) != 0) {
                        pointerProperties.f9848a = this.f9852b;
                    }
                    if ((i9 & 2) != 0) {
                        pointerProperties.f9849b = this.f9853c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7162b clear() {
                    super.clear();
                    this.f9851a = 0;
                    this.f9852b = 0;
                    this.f9853c = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyTouchEvent.f9823c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7162b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7162b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7162b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7162b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyTouchEvent.f9824d.ensureFieldAccessorsInitialized(PointerProperties.class, C7162b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7162b mo24685clone() {
                    return (C7162b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public PointerProperties getDefaultInstanceForType() {
                    return PointerProperties.m9741g();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7162b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f9852b = codedInputStream.readInt32();
                                        this.f9851a |= 1;
                                    } else if (tag == 16) {
                                        this.f9853c = codedInputStream.readInt32();
                                        this.f9851a |= 2;
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
                public C7162b mergeFrom(Message message) {
                    if (message instanceof PointerProperties) {
                        return m9759o((PointerProperties) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7162b m9759o(PointerProperties pointerProperties) {
                    if (pointerProperties == PointerProperties.m9741g()) {
                        return this;
                    }
                    if (pointerProperties.getId() != 0) {
                        m9762r(pointerProperties.getId());
                    }
                    if (pointerProperties.getToolType() != 0) {
                        m9764t(pointerProperties.getToolType());
                    }
                    mergeUnknownFields(pointerProperties.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7162b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7162b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7162b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7162b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7162b m9762r(int i9) {
                    this.f9852b = i9;
                    this.f9851a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7162b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7162b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                /* renamed from: t */
                public C7162b m9764t(int i9) {
                    this.f9853c = i9;
                    this.f9851a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C7162b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7162b) super.setUnknownFields(unknownFieldSet);
                }

                public C7162b() {
                }

                public C7162b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }
            }

            public PointerProperties(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9848a = 0;
                this.f9849b = 0;
                this.f9850c = (byte) -1;
            }

            private PointerProperties() {
                this.f9848a = 0;
                this.f9849b = 0;
                this.f9850c = (byte) -1;
            }
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$a */
        public class C7163a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7164b c7164bM9695A = TouchEvent.m9695A();
                try {
                    c7164bM9695A.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7164bM9695A.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7164bM9695A.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7164bM9695A.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7164bM9695A.buildPartial());
                }
            }
        }

        /* renamed from: A */
        public static C7164b m9695A() {
            return f9828i.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyTouchEvent.f9821a;
        }

        public static Parser parser() {
            return f9829j;
        }

        /* renamed from: x */
        public static TouchEvent m9706x() {
            return f9828i;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public C7164b newBuilderForType() {
            return m9695A();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C7164b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7164b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C7164b toBuilder() {
            return this == f9828i ? new C7164b() : new C7164b().m9785s(this);
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
            return this.f9831b;
        }

        public long getEventTime() {
            return this.f9830a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9829j;
        }

        public int getPointerCoordsCount() {
            return this.f9836g.size();
        }

        public List getPointerCoordsList() {
            return this.f9836g;
        }

        public int getPointerCount() {
            return this.f9834e;
        }

        public int getPointerPropertiesCount() {
            return this.f9835f.size();
        }

        public List getPointerPropertiesList() {
            return this.f9835f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            long j9 = this.f9830a;
            int iComputeInt64Size = j9 != 0 ? CodedOutputStream.computeInt64Size(1, j9) : 0;
            int i10 = this.f9831b;
            if (i10 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i10);
            }
            if (Float.floatToRawIntBits(this.f9832c) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(3, this.f9832c);
            }
            if (Float.floatToRawIntBits(this.f9833d) != 0) {
                iComputeInt64Size += CodedOutputStream.computeFloatSize(4, this.f9833d);
            }
            int i11 = this.f9834e;
            if (i11 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i11);
            }
            for (int i12 = 0; i12 < this.f9835f.size(); i12++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f9835f.get(i12));
            }
            for (int i13 = 0; i13 < this.f9836g.size(); i13++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f9836g.get(i13));
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public float getX() {
            return this.f9832c;
        }

        public float getY() {
            return this.f9833d;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
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
            return EzyTouchEvent.f9822b.ensureFieldAccessorsInitialized(TouchEvent.class, C7164b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9837h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9837h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchEvent();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j9 = this.f9830a;
            if (j9 != 0) {
                codedOutputStream.writeInt64(1, j9);
            }
            int i9 = this.f9831b;
            if (i9 != 0) {
                codedOutputStream.writeInt32(2, i9);
            }
            if (Float.floatToRawIntBits(this.f9832c) != 0) {
                codedOutputStream.writeFloat(3, this.f9832c);
            }
            if (Float.floatToRawIntBits(this.f9833d) != 0) {
                codedOutputStream.writeFloat(4, this.f9833d);
            }
            int i10 = this.f9834e;
            if (i10 != 0) {
                codedOutputStream.writeInt32(5, i10);
            }
            for (int i11 = 0; i11 < this.f9835f.size(); i11++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f9835f.get(i11));
            }
            for (int i12 = 0; i12 < this.f9836g.size(); i12++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f9836g.get(i12));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public TouchEvent getDefaultInstanceForType() {
            return f9828i;
        }

        /* renamed from: z */
        public PointerCoords m9711z(int i9) {
            return (PointerCoords) this.f9836g.get(i9);
        }

        /* renamed from: com.zykj.board.EzyTouchEvent$TouchEvent$b */
        public static final class C7164b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9854a;

            /* renamed from: b */
            public long f9855b;

            /* renamed from: c */
            public int f9856c;

            /* renamed from: d */
            public float f9857d;

            /* renamed from: e */
            public float f9858e;

            /* renamed from: f */
            public int f9859f;

            /* renamed from: g */
            public List f9860g;

            /* renamed from: h */
            public RepeatedFieldBuilderV3 f9861h;

            /* renamed from: i */
            public List f9862i;

            /* renamed from: j */
            public RepeatedFieldBuilderV3 f9863j;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public final C7164b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7164b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: B */
            public C7164b m9768B(float f10) {
                this.f9857d = f10;
                this.f9854a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: C */
            public C7164b m9769C(float f10) {
                this.f9858e = f10;
                this.f9854a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: b */
            public C7164b m9770b(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9863j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerCoordsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f9862i);
                onChanged();
                return this;
            }

            /* renamed from: d */
            public C7164b m9771d(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9861h;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointerPropertiesIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.f9860g);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C7164b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7164b) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final void ensurePointerCoordsIsMutable() {
                if ((this.f9854a & 64) == 0) {
                    this.f9862i = new ArrayList(this.f9862i);
                    this.f9854a |= 64;
                }
            }

            public final void ensurePointerPropertiesIsMutable() {
                if ((this.f9854a & 32) == 0) {
                    this.f9860g = new ArrayList(this.f9860g);
                    this.f9854a |= 32;
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
                m9776i(touchEvent);
                if (this.f9854a != 0) {
                    m9775h(touchEvent);
                }
                onBuilt();
                return touchEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyTouchEvent.f9821a;
            }

            public final RepeatedFieldBuilderV3 getPointerCoordsFieldBuilder() {
                if (this.f9863j == null) {
                    this.f9863j = new RepeatedFieldBuilderV3(this.f9862i, (this.f9854a & 64) != 0, getParentForChildren(), isClean());
                    this.f9862i = null;
                }
                return this.f9863j;
            }

            public int getPointerCount() {
                return this.f9859f;
            }

            public final RepeatedFieldBuilderV3 getPointerPropertiesFieldBuilder() {
                if (this.f9861h == null) {
                    this.f9861h = new RepeatedFieldBuilderV3(this.f9860g, (this.f9854a & 32) != 0, getParentForChildren(), isClean());
                    this.f9860g = null;
                }
                return this.f9861h;
            }

            public float getX() {
                return this.f9857d;
            }

            public float getY() {
                return this.f9858e;
            }

            /* renamed from: h */
            public final void m9775h(TouchEvent touchEvent) {
                int i9 = this.f9854a;
                if ((i9 & 1) != 0) {
                    touchEvent.f9830a = this.f9855b;
                }
                if ((i9 & 2) != 0) {
                    touchEvent.f9831b = this.f9856c;
                }
                if ((i9 & 4) != 0) {
                    touchEvent.f9832c = this.f9857d;
                }
                if ((i9 & 8) != 0) {
                    touchEvent.f9833d = this.f9858e;
                }
                if ((i9 & 16) != 0) {
                    touchEvent.f9834e = this.f9859f;
                }
            }

            /* renamed from: i */
            public final void m9776i(TouchEvent touchEvent) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9861h;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f9854a & 32) != 0) {
                        this.f9860g = Collections.unmodifiableList(this.f9860g);
                        this.f9854a &= -33;
                    }
                    touchEvent.f9835f = this.f9860g;
                } else {
                    touchEvent.f9835f = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9863j;
                if (repeatedFieldBuilderV32 != null) {
                    touchEvent.f9836g = repeatedFieldBuilderV32.build();
                    return;
                }
                if ((this.f9854a & 64) != 0) {
                    this.f9862i = Collections.unmodifiableList(this.f9862i);
                    this.f9854a &= -65;
                }
                touchEvent.f9836g = this.f9862i;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyTouchEvent.f9822b.ensureFieldAccessorsInitialized(TouchEvent.class, C7164b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7164b clear() {
                super.clear();
                this.f9854a = 0;
                this.f9855b = 0L;
                this.f9856c = 0;
                this.f9857d = 0.0f;
                this.f9858e = 0.0f;
                this.f9859f = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9861h;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9860g = Collections.EMPTY_LIST;
                } else {
                    this.f9860g = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9854a &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9863j;
                if (repeatedFieldBuilderV32 == null) {
                    this.f9862i = Collections.EMPTY_LIST;
                } else {
                    this.f9862i = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f9854a &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7164b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7164b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7164b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7164b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7164b mo24685clone() {
                return (C7164b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public TouchEvent getDefaultInstanceForType() {
                return TouchEvent.m9706x();
            }

            /* renamed from: p */
            public PointerCoords m9782p(int i9) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9863j;
                return repeatedFieldBuilderV3 == null ? (PointerCoords) this.f9862i.get(i9) : (PointerCoords) repeatedFieldBuilderV3.getMessage(i9);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7164b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f9855b = codedInputStream.readInt64();
                                    this.f9854a |= 1;
                                } else if (tag == 16) {
                                    this.f9856c = codedInputStream.readInt32();
                                    this.f9854a |= 2;
                                } else if (tag == 29) {
                                    this.f9857d = codedInputStream.readFloat();
                                    this.f9854a |= 4;
                                } else if (tag == 37) {
                                    this.f9858e = codedInputStream.readFloat();
                                    this.f9854a |= 8;
                                } else if (tag == 40) {
                                    this.f9859f = codedInputStream.readInt32();
                                    this.f9854a |= 16;
                                } else if (tag == 50) {
                                    PointerProperties pointerProperties = (PointerProperties) codedInputStream.readMessage(PointerProperties.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9861h;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePointerPropertiesIsMutable();
                                        this.f9860g.add(pointerProperties);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(pointerProperties);
                                    }
                                } else if (tag == 58) {
                                    PointerCoords pointerCoords = (PointerCoords) codedInputStream.readMessage(PointerCoords.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9863j;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensurePointerCoordsIsMutable();
                                        this.f9862i.add(pointerCoords);
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
            public C7164b mergeFrom(Message message) {
                if (message instanceof TouchEvent) {
                    return m9785s((TouchEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C7164b m9785s(TouchEvent touchEvent) {
                if (touchEvent == TouchEvent.m9706x()) {
                    return this;
                }
                if (touchEvent.getEventTime() != 0) {
                    m9788v(touchEvent.getEventTime());
                }
                if (touchEvent.getAction() != 0) {
                    m9787u(touchEvent.getAction());
                }
                if (touchEvent.getX() != 0.0f) {
                    m9768B(touchEvent.getX());
                }
                if (touchEvent.getY() != 0.0f) {
                    m9769C(touchEvent.getY());
                }
                if (touchEvent.getPointerCount() != 0) {
                    m9791y(touchEvent.getPointerCount());
                }
                if (this.f9861h == null) {
                    if (!touchEvent.f9835f.isEmpty()) {
                        if (this.f9860g.isEmpty()) {
                            this.f9860g = touchEvent.f9835f;
                            this.f9854a &= -33;
                        } else {
                            ensurePointerPropertiesIsMutable();
                            this.f9860g.addAll(touchEvent.f9835f);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f9835f.isEmpty()) {
                    if (this.f9861h.isEmpty()) {
                        this.f9861h.dispose();
                        this.f9861h = null;
                        this.f9860g = touchEvent.f9835f;
                        this.f9854a &= -33;
                        this.f9861h = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointerPropertiesFieldBuilder() : null;
                    } else {
                        this.f9861h.addAllMessages(touchEvent.f9835f);
                    }
                }
                if (this.f9863j == null) {
                    if (!touchEvent.f9836g.isEmpty()) {
                        if (this.f9862i.isEmpty()) {
                            this.f9862i = touchEvent.f9836g;
                            this.f9854a &= -65;
                        } else {
                            ensurePointerCoordsIsMutable();
                            this.f9862i.addAll(touchEvent.f9836g);
                        }
                        onChanged();
                    }
                } else if (!touchEvent.f9836g.isEmpty()) {
                    if (this.f9863j.isEmpty()) {
                        this.f9863j.dispose();
                        this.f9863j = null;
                        this.f9862i = touchEvent.f9836g;
                        this.f9854a &= -65;
                        this.f9863j = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointerCoordsFieldBuilder() : null;
                    } else {
                        this.f9863j.addAllMessages(touchEvent.f9836g);
                    }
                }
                mergeUnknownFields(touchEvent.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C7164b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7164b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: u */
            public C7164b m9787u(int i9) {
                this.f9856c = i9;
                this.f9854a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7164b m9788v(long j9) {
                this.f9855b = j9;
                this.f9854a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7164b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7164b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: x */
            public C7164b m9790x(int i9, PointerCoords.C7160b c7160b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9863j;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i9, c7160b.build());
                    return this;
                }
                ensurePointerCoordsIsMutable();
                this.f9862i.set(i9, c7160b.build());
                onChanged();
                return this;
            }

            /* renamed from: y */
            public C7164b m9791y(int i9) {
                this.f9859f = i9;
                this.f9854a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C7164b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7164b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            public C7164b() {
                List list = Collections.EMPTY_LIST;
                this.f9860g = list;
                this.f9862i = list;
            }

            public C7164b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f9860g = list;
                this.f9862i = list;
            }
        }

        public TouchEvent(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9830a = 0L;
            this.f9831b = 0;
            this.f9832c = 0.0f;
            this.f9833d = 0.0f;
            this.f9834e = 0;
            this.f9837h = (byte) -1;
        }

        private TouchEvent() {
            this.f9830a = 0L;
            this.f9831b = 0;
            this.f9832c = 0.0f;
            this.f9833d = 0.0f;
            this.f9834e = 0;
            this.f9837h = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f9835f = list;
            this.f9836g = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9694g().getMessageTypes().get(0);
        f9821a = descriptor;
        f9822b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "Action", "X", "Y", "PointerCount", "PointerProperties", "PointerCoords"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9823c = descriptor2;
        f9824d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "ToolType"});
        Descriptors.Descriptor descriptor3 = descriptor.getNestedTypes().get(1);
        f9825e = descriptor3;
        f9826f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"X", "Y"});
    }

    /* renamed from: g */
    public static Descriptors.FileDescriptor m9694g() {
        return f9827g;
    }
}

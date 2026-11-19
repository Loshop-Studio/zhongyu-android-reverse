package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzyRouterRecord {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9384a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9385b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9386c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9387d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f9388e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012RouterRecord.proto\"ó\u0003\n\fRouterRecord\u00128\n\rcommandRecord\u0018\u0001 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u00126\n\u000baudioRecord\u0018\u0002 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012<\n\u0011touchSourceRecord\u0018\u0003 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012=\n\u0012matrixSourceRecord\u0018\u0004 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010fileSourceRecord\u0018\u0005 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010textSourceRecord\u0018\u0006 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012?\n\u0014geometrySourceRecord\u0018\u0007 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u001a9\n\u0013SourceCommandRecord\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bvalidate\u0018\u0002 \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyRouterRecordb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class RouterRecord extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final RouterRecord f9389i = new RouterRecord();

        /* renamed from: j */
        public static final Parser f9390j = new C7244a();

        /* renamed from: a */
        public List f9391a;

        /* renamed from: b */
        public List f9392b;

        /* renamed from: c */
        public List f9393c;

        /* renamed from: d */
        public List f9394d;

        /* renamed from: e */
        public List f9395e;

        /* renamed from: f */
        public List f9396f;

        /* renamed from: g */
        public List f9397g;

        /* renamed from: h */
        public byte f9398h;

        public static final class SourceCommandRecord extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final SourceCommandRecord f9399d = new SourceCommandRecord();

            /* renamed from: e */
            public static final Parser f9400e = new C7242a();

            /* renamed from: a */
            public volatile Object f9401a;

            /* renamed from: b */
            public volatile Object f9402b;

            /* renamed from: c */
            public byte f9403c;

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$a */
            public class C7242a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7243b c7243bM8622i = SourceCommandRecord.m8622i();
                    try {
                        c7243bM8622i.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7243bM8622i.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7243bM8622i.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7243bM8622i.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7243bM8622i.buildPartial());
                    }
                }
            }

            /* renamed from: e */
            public static SourceCommandRecord m8621e() {
                return f9399d;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyRouterRecord.f9386c;
            }

            /* renamed from: i */
            public static C7243b m8622i() {
                return f9399d.toBuilder();
            }

            public static Parser parser() {
                return f9400e;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SourceCommandRecord)) {
                    return super.equals(obj);
                }
                SourceCommandRecord sourceCommandRecord = (SourceCommandRecord) obj;
                return getFileName().equals(sourceCommandRecord.getFileName()) && m8624h().equals(sourceCommandRecord.m8624h()) && getUnknownFields().equals(sourceCommandRecord.getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public SourceCommandRecord getDefaultInstanceForType() {
                return f9399d;
            }

            public String getFileName() {
                Object obj = this.f9401a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9401a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9400e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9401a) ? GeneratedMessageV3.computeStringSize(1, this.f9401a) : 0;
                if (!GeneratedMessageV3.isStringEmpty(this.f9402b)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f9402b);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            /* renamed from: h */
            public String m8624h() {
                Object obj = this.f9402b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9402b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + m8624h().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f9387d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C7243b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9403c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9403c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7243b newBuilderForType() {
                return m8622i();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7243b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7243b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7243b toBuilder() {
                return this == f9399d ? new C7243b() : new C7243b().m8640o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new SourceCommandRecord();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessageV3.isStringEmpty(this.f9401a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9401a);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9402b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.f9402b);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$b */
            public static final class C7243b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9404a;

                /* renamed from: b */
                public Object f9405b;

                /* renamed from: c */
                public Object f9406c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7243b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7243b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord build() {
                    SourceCommandRecord sourceCommandRecordBuildPartial = buildPartial();
                    if (sourceCommandRecordBuildPartial.isInitialized()) {
                        return sourceCommandRecordBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sourceCommandRecordBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord buildPartial() {
                    SourceCommandRecord sourceCommandRecord = new SourceCommandRecord(this);
                    if (this.f9404a != 0) {
                        m8632g(sourceCommandRecord);
                    }
                    onBuilt();
                    return sourceCommandRecord;
                }

                /* renamed from: g */
                public final void m8632g(SourceCommandRecord sourceCommandRecord) {
                    int i10 = this.f9404a;
                    if ((i10 & 1) != 0) {
                        sourceCommandRecord.f9401a = this.f9405b;
                    }
                    if ((i10 & 2) != 0) {
                        sourceCommandRecord.f9402b = this.f9406c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyRouterRecord.f9386c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7243b clear() {
                    super.clear();
                    this.f9404a = 0;
                    this.f9405b = "";
                    this.f9406c = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7243b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7243b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyRouterRecord.f9387d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C7243b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7243b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7243b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public C7243b mo27381clone() {
                    return (C7243b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord getDefaultInstanceForType() {
                    return SourceCommandRecord.m8621e();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7243b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9405b = codedInputStream.readStringRequireUtf8();
                                        this.f9404a |= 1;
                                    } else if (tag == 18) {
                                        this.f9406c = codedInputStream.readStringRequireUtf8();
                                        this.f9404a |= 2;
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
                public C7243b mergeFrom(Message message) {
                    if (message instanceof SourceCommandRecord) {
                        return m8640o((SourceCommandRecord) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7243b m8640o(SourceCommandRecord sourceCommandRecord) {
                    if (sourceCommandRecord == SourceCommandRecord.m8621e()) {
                        return this;
                    }
                    if (!sourceCommandRecord.getFileName().isEmpty()) {
                        this.f9405b = sourceCommandRecord.f9401a;
                        this.f9404a |= 1;
                        onChanged();
                    }
                    if (!sourceCommandRecord.m8624h().isEmpty()) {
                        this.f9406c = sourceCommandRecord.f9402b;
                        this.f9404a |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(sourceCommandRecord.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7243b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7243b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7243b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7243b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7243b m8643r(String str) {
                    str.getClass();
                    this.f9405b = str;
                    this.f9404a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7243b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7243b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C7243b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7243b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: u */
                public C7243b m8646u(String str) {
                    str.getClass();
                    this.f9406c = str;
                    this.f9404a |= 2;
                    onChanged();
                    return this;
                }

                public C7243b() {
                    this.f9405b = "";
                    this.f9406c = "";
                }

                public C7243b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9405b = "";
                    this.f9406c = "";
                }
            }

            public SourceCommandRecord(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9401a = "";
                this.f9402b = "";
                this.f9403c = (byte) -1;
            }

            private SourceCommandRecord() {
                this.f9401a = "";
                this.f9402b = "";
                this.f9403c = (byte) -1;
                this.f9401a = "";
                this.f9402b = "";
            }
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$a */
        public class C7244a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RouterRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7245b c7245bM8579I = RouterRecord.m8579I();
                try {
                    c7245bM8579I.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7245bM8579I.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7245bM8579I.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7245bM8579I.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7245bM8579I.buildPartial());
                }
            }
        }

        /* renamed from: I */
        public static C7245b m8579I() {
            return f9389i.toBuilder();
        }

        /* renamed from: L */
        public static RouterRecord m8580L(InputStream inputStream) {
            return (RouterRecord) GeneratedMessageV3.parseWithIOException(f9390j, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRouterRecord.f9384a;
        }

        /* renamed from: w */
        public static RouterRecord m8598w() {
            return f9389i;
        }

        /* renamed from: A */
        public int m8599A() {
            return this.f9397g.size();
        }

        /* renamed from: B */
        public List m8600B() {
            return this.f9397g;
        }

        /* renamed from: C */
        public int m8601C() {
            return this.f9394d.size();
        }

        /* renamed from: D */
        public List m8602D() {
            return this.f9394d;
        }

        /* renamed from: E */
        public int m8603E() {
            return this.f9396f.size();
        }

        /* renamed from: F */
        public List m8604F() {
            return this.f9396f;
        }

        /* renamed from: G */
        public int m8605G() {
            return this.f9393c.size();
        }

        /* renamed from: H */
        public List m8606H() {
            return this.f9393c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public C7245b newBuilderForType() {
            return m8579I();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public C7245b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7245b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public C7245b toBuilder() {
            return this == f9389i ? new C7245b() : new C7245b().m8658K(this);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RouterRecord)) {
                return super.equals(obj);
            }
            RouterRecord routerRecord = (RouterRecord) obj;
            return m8613v().equals(routerRecord.m8613v()) && m8611t().equals(routerRecord.m8611t()) && m8606H().equals(routerRecord.m8606H()) && m8602D().equals(routerRecord.m8602D()) && m8616z().equals(routerRecord.m8616z()) && m8604F().equals(routerRecord.m8604F()) && m8600B().equals(routerRecord.m8600B()) && getUnknownFields().equals(routerRecord.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9390j;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9391a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9391a.get(i11));
            }
            for (int i12 = 0; i12 < this.f9392b.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f9392b.get(i12));
            }
            for (int i13 = 0; i13 < this.f9393c.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f9393c.get(i13));
            }
            for (int i14 = 0; i14 < this.f9394d.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f9394d.get(i14));
            }
            for (int i15 = 0; i15 < this.f9395e.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f9395e.get(i15));
            }
            for (int i16 = 0; i16 < this.f9396f.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f9396f.get(i16));
            }
            for (int i17 = 0; i17 < this.f9397g.size(); i17++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f9397g.get(i17));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8612u() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8613v().hashCode();
            }
            if (m8610s() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m8611t().hashCode();
            }
            if (m8605G() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + m8606H().hashCode();
            }
            if (m8601C() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + m8602D().hashCode();
            }
            if (m8615y() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + m8616z().hashCode();
            }
            if (m8603E() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + m8604F().hashCode();
            }
            if (m8599A() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m8600B().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRouterRecord.f9385b.ensureFieldAccessorsInitialized(RouterRecord.class, C7245b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9398h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9398h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RouterRecord();
        }

        /* renamed from: s */
        public int m8610s() {
            return this.f9392b.size();
        }

        /* renamed from: t */
        public List m8611t() {
            return this.f9392b;
        }

        /* renamed from: u */
        public int m8612u() {
            return this.f9391a.size();
        }

        /* renamed from: v */
        public List m8613v() {
            return this.f9391a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9391a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9391a.get(i10));
            }
            for (int i11 = 0; i11 < this.f9392b.size(); i11++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f9392b.get(i11));
            }
            for (int i12 = 0; i12 < this.f9393c.size(); i12++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f9393c.get(i12));
            }
            for (int i13 = 0; i13 < this.f9394d.size(); i13++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f9394d.get(i13));
            }
            for (int i14 = 0; i14 < this.f9395e.size(); i14++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f9395e.get(i14));
            }
            for (int i15 = 0; i15 < this.f9396f.size(); i15++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f9396f.get(i15));
            }
            for (int i16 = 0; i16 < this.f9397g.size(); i16++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f9397g.get(i16));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public RouterRecord getDefaultInstanceForType() {
            return f9389i;
        }

        /* renamed from: y */
        public int m8615y() {
            return this.f9395e.size();
        }

        /* renamed from: z */
        public List m8616z() {
            return this.f9395e;
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$b */
        public static final class C7245b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9407a;

            /* renamed from: b */
            public List f9408b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9409c;

            /* renamed from: d */
            public List f9410d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f9411e;

            /* renamed from: f */
            public List f9412f;

            /* renamed from: g */
            public RepeatedFieldBuilderV3 f9413g;

            /* renamed from: h */
            public List f9414h;

            /* renamed from: i */
            public RepeatedFieldBuilderV3 f9415i;

            /* renamed from: j */
            public List f9416j;

            /* renamed from: k */
            public RepeatedFieldBuilderV3 f9417k;

            /* renamed from: l */
            public List f9418l;

            /* renamed from: m */
            public RepeatedFieldBuilderV3 f9419m;

            /* renamed from: n */
            public List f9420n;

            /* renamed from: o */
            public RepeatedFieldBuilderV3 f9421o;

            /* renamed from: A */
            public final RepeatedFieldBuilderV3 m8648A() {
                if (this.f9411e == null) {
                    this.f9411e = new RepeatedFieldBuilderV3(this.f9410d, (this.f9407a & 2) != 0, getParentForChildren(), isClean());
                    this.f9410d = null;
                }
                return this.f9411e;
            }

            /* renamed from: B */
            public final RepeatedFieldBuilderV3 m8649B() {
                if (this.f9409c == null) {
                    this.f9409c = new RepeatedFieldBuilderV3(this.f9408b, (this.f9407a & 1) != 0, getParentForChildren(), isClean());
                    this.f9408b = null;
                }
                return this.f9409c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public RouterRecord getDefaultInstanceForType() {
                return RouterRecord.m8598w();
            }

            /* renamed from: D */
            public final RepeatedFieldBuilderV3 m8651D() {
                if (this.f9417k == null) {
                    this.f9417k = new RepeatedFieldBuilderV3(this.f9416j, (this.f9407a & 16) != 0, getParentForChildren(), isClean());
                    this.f9416j = null;
                }
                return this.f9417k;
            }

            /* renamed from: E */
            public final RepeatedFieldBuilderV3 m8652E() {
                if (this.f9421o == null) {
                    this.f9421o = new RepeatedFieldBuilderV3(this.f9420n, (this.f9407a & 64) != 0, getParentForChildren(), isClean());
                    this.f9420n = null;
                }
                return this.f9421o;
            }

            /* renamed from: F */
            public final RepeatedFieldBuilderV3 m8653F() {
                if (this.f9415i == null) {
                    this.f9415i = new RepeatedFieldBuilderV3(this.f9414h, (this.f9407a & 8) != 0, getParentForChildren(), isClean());
                    this.f9414h = null;
                }
                return this.f9415i;
            }

            /* renamed from: G */
            public final RepeatedFieldBuilderV3 m8654G() {
                if (this.f9419m == null) {
                    this.f9419m = new RepeatedFieldBuilderV3(this.f9418l, (this.f9407a & 32) != 0, getParentForChildren(), isClean());
                    this.f9418l = null;
                }
                return this.f9419m;
            }

            /* renamed from: H */
            public final RepeatedFieldBuilderV3 m8655H() {
                if (this.f9413g == null) {
                    this.f9413g = new RepeatedFieldBuilderV3(this.f9412f, (this.f9407a & 4) != 0, getParentForChildren(), isClean());
                    this.f9412f = null;
                }
                return this.f9413g;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public C7245b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    SourceCommandRecord sourceCommandRecord = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9409c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8680u();
                                        this.f9408b.add(sourceCommandRecord);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sourceCommandRecord);
                                    }
                                } else if (tag == 18) {
                                    SourceCommandRecord sourceCommandRecord2 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9411e;
                                    if (repeatedFieldBuilderV32 == null) {
                                        m8679t();
                                        this.f9410d.add(sourceCommandRecord2);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(sourceCommandRecord2);
                                    }
                                } else if (tag == 26) {
                                    SourceCommandRecord sourceCommandRecord3 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f9413g;
                                    if (repeatedFieldBuilderV33 == null) {
                                        m8685z();
                                        this.f9412f.add(sourceCommandRecord3);
                                    } else {
                                        repeatedFieldBuilderV33.addMessage(sourceCommandRecord3);
                                    }
                                } else if (tag == 34) {
                                    SourceCommandRecord sourceCommandRecord4 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f9415i;
                                    if (repeatedFieldBuilderV34 == null) {
                                        m8683x();
                                        this.f9414h.add(sourceCommandRecord4);
                                    } else {
                                        repeatedFieldBuilderV34.addMessage(sourceCommandRecord4);
                                    }
                                } else if (tag == 42) {
                                    SourceCommandRecord sourceCommandRecord5 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f9417k;
                                    if (repeatedFieldBuilderV35 == null) {
                                        m8681v();
                                        this.f9416j.add(sourceCommandRecord5);
                                    } else {
                                        repeatedFieldBuilderV35.addMessage(sourceCommandRecord5);
                                    }
                                } else if (tag == 50) {
                                    SourceCommandRecord sourceCommandRecord6 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f9419m;
                                    if (repeatedFieldBuilderV36 == null) {
                                        m8684y();
                                        this.f9418l.add(sourceCommandRecord6);
                                    } else {
                                        repeatedFieldBuilderV36.addMessage(sourceCommandRecord6);
                                    }
                                } else if (tag == 58) {
                                    SourceCommandRecord sourceCommandRecord7 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f9421o;
                                    if (repeatedFieldBuilderV37 == null) {
                                        m8682w();
                                        this.f9420n.add(sourceCommandRecord7);
                                    } else {
                                        repeatedFieldBuilderV37.addMessage(sourceCommandRecord7);
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
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            public C7245b mergeFrom(Message message) {
                if (message instanceof RouterRecord) {
                    return m8658K((RouterRecord) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: K */
            public C7245b m8658K(RouterRecord routerRecord) {
                if (routerRecord == RouterRecord.m8598w()) {
                    return this;
                }
                if (this.f9409c == null) {
                    if (!routerRecord.f9391a.isEmpty()) {
                        if (this.f9408b.isEmpty()) {
                            this.f9408b = routerRecord.f9391a;
                            this.f9407a &= -2;
                        } else {
                            m8680u();
                            this.f9408b.addAll(routerRecord.f9391a);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9391a.isEmpty()) {
                    if (this.f9409c.isEmpty()) {
                        this.f9409c.dispose();
                        this.f9409c = null;
                        this.f9408b = routerRecord.f9391a;
                        this.f9407a &= -2;
                        this.f9409c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8649B() : null;
                    } else {
                        this.f9409c.addAllMessages(routerRecord.f9391a);
                    }
                }
                if (this.f9411e == null) {
                    if (!routerRecord.f9392b.isEmpty()) {
                        if (this.f9410d.isEmpty()) {
                            this.f9410d = routerRecord.f9392b;
                            this.f9407a &= -3;
                        } else {
                            m8679t();
                            this.f9410d.addAll(routerRecord.f9392b);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9392b.isEmpty()) {
                    if (this.f9411e.isEmpty()) {
                        this.f9411e.dispose();
                        this.f9411e = null;
                        this.f9410d = routerRecord.f9392b;
                        this.f9407a &= -3;
                        this.f9411e = GeneratedMessageV3.alwaysUseFieldBuilders ? m8648A() : null;
                    } else {
                        this.f9411e.addAllMessages(routerRecord.f9392b);
                    }
                }
                if (this.f9413g == null) {
                    if (!routerRecord.f9393c.isEmpty()) {
                        if (this.f9412f.isEmpty()) {
                            this.f9412f = routerRecord.f9393c;
                            this.f9407a &= -5;
                        } else {
                            m8685z();
                            this.f9412f.addAll(routerRecord.f9393c);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9393c.isEmpty()) {
                    if (this.f9413g.isEmpty()) {
                        this.f9413g.dispose();
                        this.f9413g = null;
                        this.f9412f = routerRecord.f9393c;
                        this.f9407a &= -5;
                        this.f9413g = GeneratedMessageV3.alwaysUseFieldBuilders ? m8655H() : null;
                    } else {
                        this.f9413g.addAllMessages(routerRecord.f9393c);
                    }
                }
                if (this.f9415i == null) {
                    if (!routerRecord.f9394d.isEmpty()) {
                        if (this.f9414h.isEmpty()) {
                            this.f9414h = routerRecord.f9394d;
                            this.f9407a &= -9;
                        } else {
                            m8683x();
                            this.f9414h.addAll(routerRecord.f9394d);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9394d.isEmpty()) {
                    if (this.f9415i.isEmpty()) {
                        this.f9415i.dispose();
                        this.f9415i = null;
                        this.f9414h = routerRecord.f9394d;
                        this.f9407a &= -9;
                        this.f9415i = GeneratedMessageV3.alwaysUseFieldBuilders ? m8653F() : null;
                    } else {
                        this.f9415i.addAllMessages(routerRecord.f9394d);
                    }
                }
                if (this.f9417k == null) {
                    if (!routerRecord.f9395e.isEmpty()) {
                        if (this.f9416j.isEmpty()) {
                            this.f9416j = routerRecord.f9395e;
                            this.f9407a &= -17;
                        } else {
                            m8681v();
                            this.f9416j.addAll(routerRecord.f9395e);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9395e.isEmpty()) {
                    if (this.f9417k.isEmpty()) {
                        this.f9417k.dispose();
                        this.f9417k = null;
                        this.f9416j = routerRecord.f9395e;
                        this.f9407a &= -17;
                        this.f9417k = GeneratedMessageV3.alwaysUseFieldBuilders ? m8651D() : null;
                    } else {
                        this.f9417k.addAllMessages(routerRecord.f9395e);
                    }
                }
                if (this.f9419m == null) {
                    if (!routerRecord.f9396f.isEmpty()) {
                        if (this.f9418l.isEmpty()) {
                            this.f9418l = routerRecord.f9396f;
                            this.f9407a &= -33;
                        } else {
                            m8684y();
                            this.f9418l.addAll(routerRecord.f9396f);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9396f.isEmpty()) {
                    if (this.f9419m.isEmpty()) {
                        this.f9419m.dispose();
                        this.f9419m = null;
                        this.f9418l = routerRecord.f9396f;
                        this.f9407a &= -33;
                        this.f9419m = GeneratedMessageV3.alwaysUseFieldBuilders ? m8654G() : null;
                    } else {
                        this.f9419m.addAllMessages(routerRecord.f9396f);
                    }
                }
                if (this.f9421o == null) {
                    if (!routerRecord.f9397g.isEmpty()) {
                        if (this.f9420n.isEmpty()) {
                            this.f9420n = routerRecord.f9397g;
                            this.f9407a &= -65;
                        } else {
                            m8682w();
                            this.f9420n.addAll(routerRecord.f9397g);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9397g.isEmpty()) {
                    if (this.f9421o.isEmpty()) {
                        this.f9421o.dispose();
                        this.f9421o = null;
                        this.f9420n = routerRecord.f9397g;
                        this.f9407a &= -65;
                        this.f9421o = GeneratedMessageV3.alwaysUseFieldBuilders ? m8652E() : null;
                    } else {
                        this.f9421o.addAllMessages(routerRecord.f9397g);
                    }
                }
                mergeUnknownFields(routerRecord.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: L, reason: merged with bridge method [inline-methods] */
            public final C7245b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7245b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            public C7245b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7245b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public C7245b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7245b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            public final C7245b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7245b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: c */
            public C7245b m8663c(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9411e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8679t();
                this.f9410d.add(c7243b.build());
                onChanged();
                return this;
            }

            /* renamed from: e */
            public C7245b m8664e(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9409c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8680u();
                this.f9408b.add(c7243b.build());
                onChanged();
                return this;
            }

            /* renamed from: f */
            public C7245b m8665f(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9417k;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8681v();
                this.f9416j.add(c7243b.build());
                onChanged();
                return this;
            }

            /* renamed from: g */
            public C7245b m8666g(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9421o;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8682w();
                this.f9420n.add(c7243b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRouterRecord.f9384a;
            }

            /* renamed from: h */
            public C7245b m8667h(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9415i;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8683x();
                this.f9414h.add(c7243b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7245b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7245b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f9385b.ensureFieldAccessorsInitialized(RouterRecord.class, C7245b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: j */
            public C7245b m8669j(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9419m;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8684y();
                this.f9418l.add(c7243b.build());
                onChanged();
                return this;
            }

            /* renamed from: k */
            public C7245b m8670k(SourceCommandRecord.C7243b c7243b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9413g;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7243b.build());
                    return this;
                }
                m8685z();
                this.f9412f.add(c7243b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public RouterRecord build() {
                RouterRecord routerRecordBuildPartial = buildPartial();
                if (routerRecordBuildPartial.isInitialized()) {
                    return routerRecordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) routerRecordBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public RouterRecord buildPartial() {
                RouterRecord routerRecord = new RouterRecord(this);
                m8674o(routerRecord);
                if (this.f9407a != 0) {
                    m8673n(routerRecord);
                }
                onBuilt();
                return routerRecord;
            }

            /* renamed from: n */
            public final void m8673n(RouterRecord routerRecord) {
            }

            /* renamed from: o */
            public final void m8674o(RouterRecord routerRecord) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9409c;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f9407a & 1) != 0) {
                        this.f9408b = Collections.unmodifiableList(this.f9408b);
                        this.f9407a &= -2;
                    }
                    routerRecord.f9391a = this.f9408b;
                } else {
                    routerRecord.f9391a = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9411e;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.f9407a & 2) != 0) {
                        this.f9410d = Collections.unmodifiableList(this.f9410d);
                        this.f9407a &= -3;
                    }
                    routerRecord.f9392b = this.f9410d;
                } else {
                    routerRecord.f9392b = repeatedFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f9413g;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.f9407a & 4) != 0) {
                        this.f9412f = Collections.unmodifiableList(this.f9412f);
                        this.f9407a &= -5;
                    }
                    routerRecord.f9393c = this.f9412f;
                } else {
                    routerRecord.f9393c = repeatedFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f9415i;
                if (repeatedFieldBuilderV34 == null) {
                    if ((this.f9407a & 8) != 0) {
                        this.f9414h = Collections.unmodifiableList(this.f9414h);
                        this.f9407a &= -9;
                    }
                    routerRecord.f9394d = this.f9414h;
                } else {
                    routerRecord.f9394d = repeatedFieldBuilderV34.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f9417k;
                if (repeatedFieldBuilderV35 == null) {
                    if ((this.f9407a & 16) != 0) {
                        this.f9416j = Collections.unmodifiableList(this.f9416j);
                        this.f9407a &= -17;
                    }
                    routerRecord.f9395e = this.f9416j;
                } else {
                    routerRecord.f9395e = repeatedFieldBuilderV35.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f9419m;
                if (repeatedFieldBuilderV36 == null) {
                    if ((this.f9407a & 32) != 0) {
                        this.f9418l = Collections.unmodifiableList(this.f9418l);
                        this.f9407a &= -33;
                    }
                    routerRecord.f9396f = this.f9418l;
                } else {
                    routerRecord.f9396f = repeatedFieldBuilderV36.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f9421o;
                if (repeatedFieldBuilderV37 != null) {
                    routerRecord.f9397g = repeatedFieldBuilderV37.build();
                    return;
                }
                if ((this.f9407a & 64) != 0) {
                    this.f9420n = Collections.unmodifiableList(this.f9420n);
                    this.f9407a &= -65;
                }
                routerRecord.f9397g = this.f9420n;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C7245b clear() {
                super.clear();
                this.f9407a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9409c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9408b = Collections.EMPTY_LIST;
                } else {
                    this.f9408b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9407a &= -2;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9411e;
                if (repeatedFieldBuilderV32 == null) {
                    this.f9410d = Collections.EMPTY_LIST;
                } else {
                    this.f9410d = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f9407a &= -3;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f9413g;
                if (repeatedFieldBuilderV33 == null) {
                    this.f9412f = Collections.EMPTY_LIST;
                } else {
                    this.f9412f = null;
                    repeatedFieldBuilderV33.clear();
                }
                this.f9407a &= -5;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f9415i;
                if (repeatedFieldBuilderV34 == null) {
                    this.f9414h = Collections.EMPTY_LIST;
                } else {
                    this.f9414h = null;
                    repeatedFieldBuilderV34.clear();
                }
                this.f9407a &= -9;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f9417k;
                if (repeatedFieldBuilderV35 == null) {
                    this.f9416j = Collections.EMPTY_LIST;
                } else {
                    this.f9416j = null;
                    repeatedFieldBuilderV35.clear();
                }
                this.f9407a &= -17;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f9419m;
                if (repeatedFieldBuilderV36 == null) {
                    this.f9418l = Collections.EMPTY_LIST;
                } else {
                    this.f9418l = null;
                    repeatedFieldBuilderV36.clear();
                }
                this.f9407a &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f9421o;
                if (repeatedFieldBuilderV37 == null) {
                    this.f9420n = Collections.EMPTY_LIST;
                } else {
                    this.f9420n = null;
                    repeatedFieldBuilderV37.clear();
                }
                this.f9407a &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7245b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7245b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7245b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7245b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7245b mo27381clone() {
                return (C7245b) super.mo27381clone();
            }

            /* renamed from: t */
            public final void m8679t() {
                if ((this.f9407a & 2) == 0) {
                    this.f9410d = new ArrayList(this.f9410d);
                    this.f9407a |= 2;
                }
            }

            /* renamed from: u */
            public final void m8680u() {
                if ((this.f9407a & 1) == 0) {
                    this.f9408b = new ArrayList(this.f9408b);
                    this.f9407a |= 1;
                }
            }

            /* renamed from: v */
            public final void m8681v() {
                if ((this.f9407a & 16) == 0) {
                    this.f9416j = new ArrayList(this.f9416j);
                    this.f9407a |= 16;
                }
            }

            /* renamed from: w */
            public final void m8682w() {
                if ((this.f9407a & 64) == 0) {
                    this.f9420n = new ArrayList(this.f9420n);
                    this.f9407a |= 64;
                }
            }

            /* renamed from: x */
            public final void m8683x() {
                if ((this.f9407a & 8) == 0) {
                    this.f9414h = new ArrayList(this.f9414h);
                    this.f9407a |= 8;
                }
            }

            /* renamed from: y */
            public final void m8684y() {
                if ((this.f9407a & 32) == 0) {
                    this.f9418l = new ArrayList(this.f9418l);
                    this.f9407a |= 32;
                }
            }

            /* renamed from: z */
            public final void m8685z() {
                if ((this.f9407a & 4) == 0) {
                    this.f9412f = new ArrayList(this.f9412f);
                    this.f9407a |= 4;
                }
            }

            public C7245b() {
                List list = Collections.EMPTY_LIST;
                this.f9408b = list;
                this.f9410d = list;
                this.f9412f = list;
                this.f9414h = list;
                this.f9416j = list;
                this.f9418l = list;
                this.f9420n = list;
            }

            public C7245b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f9408b = list;
                this.f9410d = list;
                this.f9412f = list;
                this.f9414h = list;
                this.f9416j = list;
                this.f9418l = list;
                this.f9420n = list;
            }
        }

        public RouterRecord(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9398h = (byte) -1;
        }

        private RouterRecord() {
            this.f9398h = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f9391a = list;
            this.f9392b = list;
            this.f9393c = list;
            this.f9394d = list;
            this.f9395e = list;
            this.f9396f = list;
            this.f9397g = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8578e().getMessageTypes().get(0);
        f9384a = descriptor;
        f9385b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandRecord", "AudioRecord", "TouchSourceRecord", "MatrixSourceRecord", "FileSourceRecord", "TextSourceRecord", "GeometrySourceRecord"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9386c = descriptor2;
        f9387d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"FileName", "Validate"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m8578e() {
        return f9388e;
    }
}

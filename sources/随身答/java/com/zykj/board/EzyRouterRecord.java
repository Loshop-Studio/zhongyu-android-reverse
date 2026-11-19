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
    public static final Descriptors.Descriptor f9657a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9658b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9659c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9660d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f9661e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012RouterRecord.proto\"ó\u0003\n\fRouterRecord\u00128\n\rcommandRecord\u0018\u0001 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u00126\n\u000baudioRecord\u0018\u0002 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012<\n\u0011touchSourceRecord\u0018\u0003 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012=\n\u0012matrixSourceRecord\u0018\u0004 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010fileSourceRecord\u0018\u0005 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010textSourceRecord\u0018\u0006 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012?\n\u0014geometrySourceRecord\u0018\u0007 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u001a9\n\u0013SourceCommandRecord\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bvalidate\u0018\u0002 \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyRouterRecordb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class RouterRecord extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final RouterRecord f9662i = new RouterRecord();

        /* renamed from: j */
        public static final Parser f9663j = new C7134a();

        /* renamed from: a */
        public List f9664a;

        /* renamed from: b */
        public List f9665b;

        /* renamed from: c */
        public List f9666c;

        /* renamed from: d */
        public List f9667d;

        /* renamed from: e */
        public List f9668e;

        /* renamed from: f */
        public List f9669f;

        /* renamed from: g */
        public List f9670g;

        /* renamed from: h */
        public byte f9671h;

        public static final class SourceCommandRecord extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final SourceCommandRecord f9672d = new SourceCommandRecord();

            /* renamed from: e */
            public static final Parser f9673e = new C7132a();

            /* renamed from: a */
            public volatile Object f9674a;

            /* renamed from: b */
            public volatile Object f9675b;

            /* renamed from: c */
            public byte f9676c;

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$a */
            public class C7132a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7133b c7133bM9249u = SourceCommandRecord.m9249u();
                    try {
                        c7133bM9249u.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7133bM9249u.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7133bM9249u.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7133bM9249u.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7133bM9249u.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyRouterRecord.f9659c;
            }

            /* renamed from: n */
            public static SourceCommandRecord m9248n() {
                return f9672d;
            }

            public static Parser parser() {
                return f9673e;
            }

            /* renamed from: u */
            public static C7133b m9249u() {
                return f9672d.toBuilder();
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
                return getFileName().equals(sourceCommandRecord.getFileName()) && m9251t().equals(sourceCommandRecord.m9251t()) && getUnknownFields().equals(sourceCommandRecord.getUnknownFields());
            }

            public String getFileName() {
                Object obj = this.f9674a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9674a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9673e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9674a) ? GeneratedMessageV3.computeStringSize(1, this.f9674a) : 0;
                if (!GeneratedMessageV3.isStringEmpty(this.f9675b)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f9675b);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + m9251t().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f9660d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C7133b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9676c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9676c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new SourceCommandRecord();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public SourceCommandRecord getDefaultInstanceForType() {
                return f9672d;
            }

            /* renamed from: t */
            public String m9251t() {
                Object obj = this.f9675b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9675b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7133b newBuilderForType() {
                return m9249u();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7133b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7133b(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f9674a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9674a);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9675b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.f9675b);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public C7133b toBuilder() {
                return this == f9672d ? new C7133b() : new C7133b().m9267o(this);
            }

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$b */
            public static final class C7133b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9677a;

                /* renamed from: b */
                public Object f9678b;

                /* renamed from: c */
                public Object f9679c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7133b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7133b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord build() {
                    SourceCommandRecord sourceCommandRecordBuildPartial = buildPartial();
                    if (sourceCommandRecordBuildPartial.isInitialized()) {
                        return sourceCommandRecordBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sourceCommandRecordBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord buildPartial() {
                    SourceCommandRecord sourceCommandRecord = new SourceCommandRecord(this);
                    if (this.f9677a != 0) {
                        m9259f(sourceCommandRecord);
                    }
                    onBuilt();
                    return sourceCommandRecord;
                }

                /* renamed from: f */
                public final void m9259f(SourceCommandRecord sourceCommandRecord) {
                    int i9 = this.f9677a;
                    if ((i9 & 1) != 0) {
                        sourceCommandRecord.f9674a = this.f9678b;
                    }
                    if ((i9 & 2) != 0) {
                        sourceCommandRecord.f9675b = this.f9679c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7133b clear() {
                    super.clear();
                    this.f9677a = 0;
                    this.f9678b = "";
                    this.f9679c = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyRouterRecord.f9659c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7133b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7133b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7133b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7133b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyRouterRecord.f9660d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C7133b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7133b mo24685clone() {
                    return (C7133b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord getDefaultInstanceForType() {
                    return SourceCommandRecord.m9248n();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7133b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9678b = codedInputStream.readStringRequireUtf8();
                                        this.f9677a |= 1;
                                    } else if (tag == 18) {
                                        this.f9679c = codedInputStream.readStringRequireUtf8();
                                        this.f9677a |= 2;
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
                public C7133b mergeFrom(Message message) {
                    if (message instanceof SourceCommandRecord) {
                        return m9267o((SourceCommandRecord) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7133b m9267o(SourceCommandRecord sourceCommandRecord) {
                    if (sourceCommandRecord == SourceCommandRecord.m9248n()) {
                        return this;
                    }
                    if (!sourceCommandRecord.getFileName().isEmpty()) {
                        this.f9678b = sourceCommandRecord.f9674a;
                        this.f9677a |= 1;
                        onChanged();
                    }
                    if (!sourceCommandRecord.m9251t().isEmpty()) {
                        this.f9679c = sourceCommandRecord.f9675b;
                        this.f9677a |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(sourceCommandRecord.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7133b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7133b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7133b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7133b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7133b m9270r(String str) {
                    str.getClass();
                    this.f9678b = str;
                    this.f9677a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7133b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7133b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C7133b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7133b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: u */
                public C7133b m9273u(String str) {
                    str.getClass();
                    this.f9679c = str;
                    this.f9677a |= 2;
                    onChanged();
                    return this;
                }

                public C7133b() {
                    this.f9678b = "";
                    this.f9679c = "";
                }

                public C7133b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9678b = "";
                    this.f9679c = "";
                }
            }

            public SourceCommandRecord(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9674a = "";
                this.f9675b = "";
                this.f9676c = (byte) -1;
            }

            private SourceCommandRecord() {
                this.f9674a = "";
                this.f9675b = "";
                this.f9676c = (byte) -1;
                this.f9674a = "";
                this.f9675b = "";
            }
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$a */
        public class C7134a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RouterRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7135b c7135bM9211U = RouterRecord.m9211U();
                try {
                    c7135bM9211U.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7135bM9211U.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7135bM9211U.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7135bM9211U.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7135bM9211U.buildPartial());
                }
            }
        }

        /* renamed from: I */
        public static RouterRecord m9210I() {
            return f9662i;
        }

        /* renamed from: U */
        public static C7135b m9211U() {
            return f9662i.toBuilder();
        }

        /* renamed from: X */
        public static RouterRecord m9212X(InputStream inputStream) {
            return (RouterRecord) GeneratedMessageV3.parseWithIOException(f9663j, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRouterRecord.f9657a;
        }

        /* renamed from: E */
        public int m9226E() {
            return this.f9665b.size();
        }

        /* renamed from: F */
        public List m9227F() {
            return this.f9665b;
        }

        /* renamed from: G */
        public int m9228G() {
            return this.f9664a.size();
        }

        /* renamed from: H */
        public List m9229H() {
            return this.f9664a;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public RouterRecord getDefaultInstanceForType() {
            return f9662i;
        }

        /* renamed from: K */
        public int m9231K() {
            return this.f9668e.size();
        }

        /* renamed from: L */
        public List m9232L() {
            return this.f9668e;
        }

        /* renamed from: M */
        public int m9233M() {
            return this.f9670g.size();
        }

        /* renamed from: N */
        public List m9234N() {
            return this.f9670g;
        }

        /* renamed from: O */
        public int m9235O() {
            return this.f9667d.size();
        }

        /* renamed from: P */
        public List m9236P() {
            return this.f9667d;
        }

        /* renamed from: Q */
        public int m9237Q() {
            return this.f9669f.size();
        }

        /* renamed from: R */
        public List m9238R() {
            return this.f9669f;
        }

        /* renamed from: S */
        public int m9239S() {
            return this.f9666c.size();
        }

        /* renamed from: T */
        public List m9240T() {
            return this.f9666c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public C7135b newBuilderForType() {
            return m9211U();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public C7135b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7135b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public C7135b toBuilder() {
            return this == f9662i ? new C7135b() : new C7135b().m9285K(this);
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
            return m9229H().equals(routerRecord.m9229H()) && m9227F().equals(routerRecord.m9227F()) && m9240T().equals(routerRecord.m9240T()) && m9236P().equals(routerRecord.m9236P()) && m9232L().equals(routerRecord.m9232L()) && m9238R().equals(routerRecord.m9238R()) && m9234N().equals(routerRecord.m9234N()) && getUnknownFields().equals(routerRecord.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9663j;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9664a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9664a.get(i10));
            }
            for (int i11 = 0; i11 < this.f9665b.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f9665b.get(i11));
            }
            for (int i12 = 0; i12 < this.f9666c.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f9666c.get(i12));
            }
            for (int i13 = 0; i13 < this.f9667d.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f9667d.get(i13));
            }
            for (int i14 = 0; i14 < this.f9668e.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f9668e.get(i14));
            }
            for (int i15 = 0; i15 < this.f9669f.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f9669f.get(i15));
            }
            for (int i16 = 0; i16 < this.f9670g.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f9670g.get(i16));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m9228G() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9229H().hashCode();
            }
            if (m9226E() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m9227F().hashCode();
            }
            if (m9239S() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + m9240T().hashCode();
            }
            if (m9235O() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + m9236P().hashCode();
            }
            if (m9231K() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + m9232L().hashCode();
            }
            if (m9237Q() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + m9238R().hashCode();
            }
            if (m9233M() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m9234N().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRouterRecord.f9658b.ensureFieldAccessorsInitialized(RouterRecord.class, C7135b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9671h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9671h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RouterRecord();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9664a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9664a.get(i9));
            }
            for (int i10 = 0; i10 < this.f9665b.size(); i10++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f9665b.get(i10));
            }
            for (int i11 = 0; i11 < this.f9666c.size(); i11++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f9666c.get(i11));
            }
            for (int i12 = 0; i12 < this.f9667d.size(); i12++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f9667d.get(i12));
            }
            for (int i13 = 0; i13 < this.f9668e.size(); i13++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f9668e.get(i13));
            }
            for (int i14 = 0; i14 < this.f9669f.size(); i14++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f9669f.get(i14));
            }
            for (int i15 = 0; i15 < this.f9670g.size(); i15++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f9670g.get(i15));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$b */
        public static final class C7135b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9680a;

            /* renamed from: b */
            public List f9681b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9682c;

            /* renamed from: d */
            public List f9683d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f9684e;

            /* renamed from: f */
            public List f9685f;

            /* renamed from: g */
            public RepeatedFieldBuilderV3 f9686g;

            /* renamed from: h */
            public List f9687h;

            /* renamed from: i */
            public RepeatedFieldBuilderV3 f9688i;

            /* renamed from: j */
            public List f9689j;

            /* renamed from: k */
            public RepeatedFieldBuilderV3 f9690k;

            /* renamed from: l */
            public List f9691l;

            /* renamed from: m */
            public RepeatedFieldBuilderV3 f9692m;

            /* renamed from: n */
            public List f9693n;

            /* renamed from: o */
            public RepeatedFieldBuilderV3 f9694o;

            /* renamed from: A */
            public final RepeatedFieldBuilderV3 m9275A() {
                if (this.f9684e == null) {
                    this.f9684e = new RepeatedFieldBuilderV3(this.f9683d, (this.f9680a & 2) != 0, getParentForChildren(), isClean());
                    this.f9683d = null;
                }
                return this.f9684e;
            }

            /* renamed from: B */
            public final RepeatedFieldBuilderV3 m9276B() {
                if (this.f9682c == null) {
                    this.f9682c = new RepeatedFieldBuilderV3(this.f9681b, (this.f9680a & 1) != 0, getParentForChildren(), isClean());
                    this.f9681b = null;
                }
                return this.f9682c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public RouterRecord getDefaultInstanceForType() {
                return RouterRecord.m9210I();
            }

            /* renamed from: D */
            public final RepeatedFieldBuilderV3 m9278D() {
                if (this.f9690k == null) {
                    this.f9690k = new RepeatedFieldBuilderV3(this.f9689j, (this.f9680a & 16) != 0, getParentForChildren(), isClean());
                    this.f9689j = null;
                }
                return this.f9690k;
            }

            /* renamed from: E */
            public final RepeatedFieldBuilderV3 m9279E() {
                if (this.f9694o == null) {
                    this.f9694o = new RepeatedFieldBuilderV3(this.f9693n, (this.f9680a & 64) != 0, getParentForChildren(), isClean());
                    this.f9693n = null;
                }
                return this.f9694o;
            }

            /* renamed from: F */
            public final RepeatedFieldBuilderV3 m9280F() {
                if (this.f9688i == null) {
                    this.f9688i = new RepeatedFieldBuilderV3(this.f9687h, (this.f9680a & 8) != 0, getParentForChildren(), isClean());
                    this.f9687h = null;
                }
                return this.f9688i;
            }

            /* renamed from: G */
            public final RepeatedFieldBuilderV3 m9281G() {
                if (this.f9692m == null) {
                    this.f9692m = new RepeatedFieldBuilderV3(this.f9691l, (this.f9680a & 32) != 0, getParentForChildren(), isClean());
                    this.f9691l = null;
                }
                return this.f9692m;
            }

            /* renamed from: H */
            public final RepeatedFieldBuilderV3 m9282H() {
                if (this.f9686g == null) {
                    this.f9686g = new RepeatedFieldBuilderV3(this.f9685f, (this.f9680a & 4) != 0, getParentForChildren(), isClean());
                    this.f9685f = null;
                }
                return this.f9686g;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public C7135b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    SourceCommandRecord sourceCommandRecord = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9682c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9307u();
                                        this.f9681b.add(sourceCommandRecord);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sourceCommandRecord);
                                    }
                                } else if (tag == 18) {
                                    SourceCommandRecord sourceCommandRecord2 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9684e;
                                    if (repeatedFieldBuilderV32 == null) {
                                        m9306t();
                                        this.f9683d.add(sourceCommandRecord2);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(sourceCommandRecord2);
                                    }
                                } else if (tag == 26) {
                                    SourceCommandRecord sourceCommandRecord3 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f9686g;
                                    if (repeatedFieldBuilderV33 == null) {
                                        m9312z();
                                        this.f9685f.add(sourceCommandRecord3);
                                    } else {
                                        repeatedFieldBuilderV33.addMessage(sourceCommandRecord3);
                                    }
                                } else if (tag == 34) {
                                    SourceCommandRecord sourceCommandRecord4 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f9688i;
                                    if (repeatedFieldBuilderV34 == null) {
                                        m9310x();
                                        this.f9687h.add(sourceCommandRecord4);
                                    } else {
                                        repeatedFieldBuilderV34.addMessage(sourceCommandRecord4);
                                    }
                                } else if (tag == 42) {
                                    SourceCommandRecord sourceCommandRecord5 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f9690k;
                                    if (repeatedFieldBuilderV35 == null) {
                                        m9308v();
                                        this.f9689j.add(sourceCommandRecord5);
                                    } else {
                                        repeatedFieldBuilderV35.addMessage(sourceCommandRecord5);
                                    }
                                } else if (tag == 50) {
                                    SourceCommandRecord sourceCommandRecord6 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f9692m;
                                    if (repeatedFieldBuilderV36 == null) {
                                        m9311y();
                                        this.f9691l.add(sourceCommandRecord6);
                                    } else {
                                        repeatedFieldBuilderV36.addMessage(sourceCommandRecord6);
                                    }
                                } else if (tag == 58) {
                                    SourceCommandRecord sourceCommandRecord7 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f9694o;
                                    if (repeatedFieldBuilderV37 == null) {
                                        m9309w();
                                        this.f9693n.add(sourceCommandRecord7);
                                    } else {
                                        repeatedFieldBuilderV37.addMessage(sourceCommandRecord7);
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
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            public C7135b mergeFrom(Message message) {
                if (message instanceof RouterRecord) {
                    return m9285K((RouterRecord) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: K */
            public C7135b m9285K(RouterRecord routerRecord) {
                if (routerRecord == RouterRecord.m9210I()) {
                    return this;
                }
                if (this.f9682c == null) {
                    if (!routerRecord.f9664a.isEmpty()) {
                        if (this.f9681b.isEmpty()) {
                            this.f9681b = routerRecord.f9664a;
                            this.f9680a &= -2;
                        } else {
                            m9307u();
                            this.f9681b.addAll(routerRecord.f9664a);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9664a.isEmpty()) {
                    if (this.f9682c.isEmpty()) {
                        this.f9682c.dispose();
                        this.f9682c = null;
                        this.f9681b = routerRecord.f9664a;
                        this.f9680a &= -2;
                        this.f9682c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9276B() : null;
                    } else {
                        this.f9682c.addAllMessages(routerRecord.f9664a);
                    }
                }
                if (this.f9684e == null) {
                    if (!routerRecord.f9665b.isEmpty()) {
                        if (this.f9683d.isEmpty()) {
                            this.f9683d = routerRecord.f9665b;
                            this.f9680a &= -3;
                        } else {
                            m9306t();
                            this.f9683d.addAll(routerRecord.f9665b);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9665b.isEmpty()) {
                    if (this.f9684e.isEmpty()) {
                        this.f9684e.dispose();
                        this.f9684e = null;
                        this.f9683d = routerRecord.f9665b;
                        this.f9680a &= -3;
                        this.f9684e = GeneratedMessageV3.alwaysUseFieldBuilders ? m9275A() : null;
                    } else {
                        this.f9684e.addAllMessages(routerRecord.f9665b);
                    }
                }
                if (this.f9686g == null) {
                    if (!routerRecord.f9666c.isEmpty()) {
                        if (this.f9685f.isEmpty()) {
                            this.f9685f = routerRecord.f9666c;
                            this.f9680a &= -5;
                        } else {
                            m9312z();
                            this.f9685f.addAll(routerRecord.f9666c);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9666c.isEmpty()) {
                    if (this.f9686g.isEmpty()) {
                        this.f9686g.dispose();
                        this.f9686g = null;
                        this.f9685f = routerRecord.f9666c;
                        this.f9680a &= -5;
                        this.f9686g = GeneratedMessageV3.alwaysUseFieldBuilders ? m9282H() : null;
                    } else {
                        this.f9686g.addAllMessages(routerRecord.f9666c);
                    }
                }
                if (this.f9688i == null) {
                    if (!routerRecord.f9667d.isEmpty()) {
                        if (this.f9687h.isEmpty()) {
                            this.f9687h = routerRecord.f9667d;
                            this.f9680a &= -9;
                        } else {
                            m9310x();
                            this.f9687h.addAll(routerRecord.f9667d);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9667d.isEmpty()) {
                    if (this.f9688i.isEmpty()) {
                        this.f9688i.dispose();
                        this.f9688i = null;
                        this.f9687h = routerRecord.f9667d;
                        this.f9680a &= -9;
                        this.f9688i = GeneratedMessageV3.alwaysUseFieldBuilders ? m9280F() : null;
                    } else {
                        this.f9688i.addAllMessages(routerRecord.f9667d);
                    }
                }
                if (this.f9690k == null) {
                    if (!routerRecord.f9668e.isEmpty()) {
                        if (this.f9689j.isEmpty()) {
                            this.f9689j = routerRecord.f9668e;
                            this.f9680a &= -17;
                        } else {
                            m9308v();
                            this.f9689j.addAll(routerRecord.f9668e);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9668e.isEmpty()) {
                    if (this.f9690k.isEmpty()) {
                        this.f9690k.dispose();
                        this.f9690k = null;
                        this.f9689j = routerRecord.f9668e;
                        this.f9680a &= -17;
                        this.f9690k = GeneratedMessageV3.alwaysUseFieldBuilders ? m9278D() : null;
                    } else {
                        this.f9690k.addAllMessages(routerRecord.f9668e);
                    }
                }
                if (this.f9692m == null) {
                    if (!routerRecord.f9669f.isEmpty()) {
                        if (this.f9691l.isEmpty()) {
                            this.f9691l = routerRecord.f9669f;
                            this.f9680a &= -33;
                        } else {
                            m9311y();
                            this.f9691l.addAll(routerRecord.f9669f);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9669f.isEmpty()) {
                    if (this.f9692m.isEmpty()) {
                        this.f9692m.dispose();
                        this.f9692m = null;
                        this.f9691l = routerRecord.f9669f;
                        this.f9680a &= -33;
                        this.f9692m = GeneratedMessageV3.alwaysUseFieldBuilders ? m9281G() : null;
                    } else {
                        this.f9692m.addAllMessages(routerRecord.f9669f);
                    }
                }
                if (this.f9694o == null) {
                    if (!routerRecord.f9670g.isEmpty()) {
                        if (this.f9693n.isEmpty()) {
                            this.f9693n = routerRecord.f9670g;
                            this.f9680a &= -65;
                        } else {
                            m9309w();
                            this.f9693n.addAll(routerRecord.f9670g);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f9670g.isEmpty()) {
                    if (this.f9694o.isEmpty()) {
                        this.f9694o.dispose();
                        this.f9694o = null;
                        this.f9693n = routerRecord.f9670g;
                        this.f9680a &= -65;
                        this.f9694o = GeneratedMessageV3.alwaysUseFieldBuilders ? m9279E() : null;
                    } else {
                        this.f9694o.addAllMessages(routerRecord.f9670g);
                    }
                }
                mergeUnknownFields(routerRecord.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: L, reason: merged with bridge method [inline-methods] */
            public final C7135b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7135b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            public C7135b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7135b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public C7135b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7135b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            public final C7135b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7135b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: b */
            public C7135b m9290b(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9684e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9306t();
                this.f9683d.add(c7133b.build());
                onChanged();
                return this;
            }

            /* renamed from: d */
            public C7135b m9291d(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9682c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9307u();
                this.f9681b.add(c7133b.build());
                onChanged();
                return this;
            }

            /* renamed from: e */
            public C7135b m9292e(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9690k;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9308v();
                this.f9689j.add(c7133b.build());
                onChanged();
                return this;
            }

            /* renamed from: f */
            public C7135b m9293f(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9694o;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9309w();
                this.f9693n.add(c7133b.build());
                onChanged();
                return this;
            }

            /* renamed from: g */
            public C7135b m9294g(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9688i;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9310x();
                this.f9687h.add(c7133b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRouterRecord.f9657a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7135b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7135b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: i */
            public C7135b m9296i(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9692m;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9311y();
                this.f9691l.add(c7133b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f9658b.ensureFieldAccessorsInitialized(RouterRecord.class, C7135b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: j */
            public C7135b m9297j(SourceCommandRecord.C7133b c7133b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9686g;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7133b.build());
                    return this;
                }
                m9312z();
                this.f9685f.add(c7133b.build());
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
                m9301o(routerRecord);
                if (this.f9680a != 0) {
                    m9300n(routerRecord);
                }
                onBuilt();
                return routerRecord;
            }

            /* renamed from: n */
            public final void m9300n(RouterRecord routerRecord) {
            }

            /* renamed from: o */
            public final void m9301o(RouterRecord routerRecord) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9682c;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f9680a & 1) != 0) {
                        this.f9681b = Collections.unmodifiableList(this.f9681b);
                        this.f9680a &= -2;
                    }
                    routerRecord.f9664a = this.f9681b;
                } else {
                    routerRecord.f9664a = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9684e;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.f9680a & 2) != 0) {
                        this.f9683d = Collections.unmodifiableList(this.f9683d);
                        this.f9680a &= -3;
                    }
                    routerRecord.f9665b = this.f9683d;
                } else {
                    routerRecord.f9665b = repeatedFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f9686g;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.f9680a & 4) != 0) {
                        this.f9685f = Collections.unmodifiableList(this.f9685f);
                        this.f9680a &= -5;
                    }
                    routerRecord.f9666c = this.f9685f;
                } else {
                    routerRecord.f9666c = repeatedFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f9688i;
                if (repeatedFieldBuilderV34 == null) {
                    if ((this.f9680a & 8) != 0) {
                        this.f9687h = Collections.unmodifiableList(this.f9687h);
                        this.f9680a &= -9;
                    }
                    routerRecord.f9667d = this.f9687h;
                } else {
                    routerRecord.f9667d = repeatedFieldBuilderV34.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f9690k;
                if (repeatedFieldBuilderV35 == null) {
                    if ((this.f9680a & 16) != 0) {
                        this.f9689j = Collections.unmodifiableList(this.f9689j);
                        this.f9680a &= -17;
                    }
                    routerRecord.f9668e = this.f9689j;
                } else {
                    routerRecord.f9668e = repeatedFieldBuilderV35.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f9692m;
                if (repeatedFieldBuilderV36 == null) {
                    if ((this.f9680a & 32) != 0) {
                        this.f9691l = Collections.unmodifiableList(this.f9691l);
                        this.f9680a &= -33;
                    }
                    routerRecord.f9669f = this.f9691l;
                } else {
                    routerRecord.f9669f = repeatedFieldBuilderV36.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f9694o;
                if (repeatedFieldBuilderV37 != null) {
                    routerRecord.f9670g = repeatedFieldBuilderV37.build();
                    return;
                }
                if ((this.f9680a & 64) != 0) {
                    this.f9693n = Collections.unmodifiableList(this.f9693n);
                    this.f9680a &= -65;
                }
                routerRecord.f9670g = this.f9693n;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C7135b clear() {
                super.clear();
                this.f9680a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9682c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9681b = Collections.EMPTY_LIST;
                } else {
                    this.f9681b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9680a &= -2;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9684e;
                if (repeatedFieldBuilderV32 == null) {
                    this.f9683d = Collections.EMPTY_LIST;
                } else {
                    this.f9683d = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f9680a &= -3;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f9686g;
                if (repeatedFieldBuilderV33 == null) {
                    this.f9685f = Collections.EMPTY_LIST;
                } else {
                    this.f9685f = null;
                    repeatedFieldBuilderV33.clear();
                }
                this.f9680a &= -5;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f9688i;
                if (repeatedFieldBuilderV34 == null) {
                    this.f9687h = Collections.EMPTY_LIST;
                } else {
                    this.f9687h = null;
                    repeatedFieldBuilderV34.clear();
                }
                this.f9680a &= -9;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f9690k;
                if (repeatedFieldBuilderV35 == null) {
                    this.f9689j = Collections.EMPTY_LIST;
                } else {
                    this.f9689j = null;
                    repeatedFieldBuilderV35.clear();
                }
                this.f9680a &= -17;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f9692m;
                if (repeatedFieldBuilderV36 == null) {
                    this.f9691l = Collections.EMPTY_LIST;
                } else {
                    this.f9691l = null;
                    repeatedFieldBuilderV36.clear();
                }
                this.f9680a &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f9694o;
                if (repeatedFieldBuilderV37 == null) {
                    this.f9693n = Collections.EMPTY_LIST;
                } else {
                    this.f9693n = null;
                    repeatedFieldBuilderV37.clear();
                }
                this.f9680a &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7135b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7135b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7135b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7135b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7135b mo24685clone() {
                return (C7135b) super.mo24685clone();
            }

            /* renamed from: t */
            public final void m9306t() {
                if ((this.f9680a & 2) == 0) {
                    this.f9683d = new ArrayList(this.f9683d);
                    this.f9680a |= 2;
                }
            }

            /* renamed from: u */
            public final void m9307u() {
                if ((this.f9680a & 1) == 0) {
                    this.f9681b = new ArrayList(this.f9681b);
                    this.f9680a |= 1;
                }
            }

            /* renamed from: v */
            public final void m9308v() {
                if ((this.f9680a & 16) == 0) {
                    this.f9689j = new ArrayList(this.f9689j);
                    this.f9680a |= 16;
                }
            }

            /* renamed from: w */
            public final void m9309w() {
                if ((this.f9680a & 64) == 0) {
                    this.f9693n = new ArrayList(this.f9693n);
                    this.f9680a |= 64;
                }
            }

            /* renamed from: x */
            public final void m9310x() {
                if ((this.f9680a & 8) == 0) {
                    this.f9687h = new ArrayList(this.f9687h);
                    this.f9680a |= 8;
                }
            }

            /* renamed from: y */
            public final void m9311y() {
                if ((this.f9680a & 32) == 0) {
                    this.f9691l = new ArrayList(this.f9691l);
                    this.f9680a |= 32;
                }
            }

            /* renamed from: z */
            public final void m9312z() {
                if ((this.f9680a & 4) == 0) {
                    this.f9685f = new ArrayList(this.f9685f);
                    this.f9680a |= 4;
                }
            }

            public C7135b() {
                List list = Collections.EMPTY_LIST;
                this.f9681b = list;
                this.f9683d = list;
                this.f9685f = list;
                this.f9687h = list;
                this.f9689j = list;
                this.f9691l = list;
                this.f9693n = list;
            }

            public C7135b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f9681b = list;
                this.f9683d = list;
                this.f9685f = list;
                this.f9687h = list;
                this.f9689j = list;
                this.f9691l = list;
                this.f9693n = list;
            }
        }

        public RouterRecord(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9671h = (byte) -1;
        }

        private RouterRecord() {
            this.f9671h = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f9664a = list;
            this.f9665b = list;
            this.f9666c = list;
            this.f9667d = list;
            this.f9668e = list;
            this.f9669f = list;
            this.f9670g = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9205e().getMessageTypes().get(0);
        f9657a = descriptor;
        f9658b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandRecord", "AudioRecord", "TouchSourceRecord", "MatrixSourceRecord", "FileSourceRecord", "TextSourceRecord", "GeometrySourceRecord"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9659c = descriptor2;
        f9660d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"FileName", "Validate"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m9205e() {
        return f9661e;
    }
}

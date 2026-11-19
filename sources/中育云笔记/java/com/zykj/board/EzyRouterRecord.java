package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
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

/* loaded from: classes5.dex */
public abstract class EzyRouterRecord {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19205a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19206b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f19207c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f19208d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f19209e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012RouterRecord.proto\"ó\u0003\n\fRouterRecord\u00128\n\rcommandRecord\u0018\u0001 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u00126\n\u000baudioRecord\u0018\u0002 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012<\n\u0011touchSourceRecord\u0018\u0003 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012=\n\u0012matrixSourceRecord\u0018\u0004 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010fileSourceRecord\u0018\u0005 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010textSourceRecord\u0018\u0006 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012?\n\u0014geometrySourceRecord\u0018\u0007 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u001a9\n\u0013SourceCommandRecord\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bvalidate\u0018\u0002 \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyRouterRecordb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class RouterRecord extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: k */
        public static final RouterRecord f19210k = new RouterRecord();

        /* renamed from: l */
        public static final Parser f19211l = new C8512a();

        /* renamed from: c */
        public List f19212c;

        /* renamed from: d */
        public List f19213d;

        /* renamed from: e */
        public List f19214e;

        /* renamed from: f */
        public List f19215f;

        /* renamed from: g */
        public List f19216g;

        /* renamed from: h */
        public List f19217h;

        /* renamed from: i */
        public List f19218i;

        /* renamed from: j */
        public byte f19219j;

        public static final class SourceCommandRecord extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final SourceCommandRecord f19220f = new SourceCommandRecord();

            /* renamed from: g */
            public static final Parser f19221g = new C8510a();

            /* renamed from: c */
            public volatile Object f19222c;

            /* renamed from: d */
            public volatile Object f19223d;

            /* renamed from: e */
            public byte f19224e;

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$a */
            public class C8510a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8511b c8511bM15867m = SourceCommandRecord.m15867m();
                    try {
                        c8511bM15867m.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8511bM15867m.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8511bM15867m.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8511bM15867m.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8511bM15867m.buildPartial());
                    }
                }
            }

            /* renamed from: f */
            public static SourceCommandRecord m15866f() {
                return f19220f;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyRouterRecord.f19207c;
            }

            /* renamed from: m */
            public static C8511b m15867m() {
                return f19220f.toBuilder();
            }

            public static Parser parser() {
                return f19221g;
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
                return getFileName().equals(sourceCommandRecord.getFileName()) && m15869k().equals(sourceCommandRecord.m15869k()) && getUnknownFields().equals(sourceCommandRecord.getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public SourceCommandRecord getDefaultInstanceForType() {
                return f19220f;
            }

            public String getFileName() {
                Object obj = this.f19222c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19222c = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19221g;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f19222c) ? GeneratedMessage.computeStringSize(1, this.f19222c) : 0;
                if (!GeneratedMessage.isStringEmpty(this.f19223d)) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(2, this.f19223d);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + m15869k().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f19208d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C8511b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19224e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19224e = (byte) 1;
                return true;
            }

            /* renamed from: k */
            public String m15869k() {
                Object obj = this.f19223d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19223d = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C8511b newBuilderForType() {
                return m15867m();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new SourceCommandRecord();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C8511b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8511b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8511b toBuilder() {
                return this == f19220f ? new C8511b() : new C8511b().m15885n(this);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessage.isStringEmpty(this.f19222c)) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.f19222c);
                }
                if (!GeneratedMessage.isStringEmpty(this.f19223d)) {
                    GeneratedMessage.writeString(codedOutputStream, 2, this.f19223d);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$b */
            public static final class C8511b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19225c;

                /* renamed from: d */
                public Object f19226d;

                /* renamed from: e */
                public Object f19227e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8511b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8511b) super.addRepeatedField(fieldDescriptor, obj);
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
                    if (this.f19225c != 0) {
                        m15877f(sourceCommandRecord);
                    }
                    onBuilt();
                    return sourceCommandRecord;
                }

                /* renamed from: f */
                public final void m15877f(SourceCommandRecord sourceCommandRecord) {
                    int i10 = this.f19225c;
                    if ((i10 & 1) != 0) {
                        sourceCommandRecord.f19222c = this.f19226d;
                    }
                    if ((i10 & 2) != 0) {
                        sourceCommandRecord.f19223d = this.f19227e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8511b clear() {
                    super.clear();
                    this.f19225c = 0;
                    this.f19226d = "";
                    this.f19227e = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyRouterRecord.f19207c;
                }

                public String getFileName() {
                    Object obj = this.f19226d;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f19226d = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8511b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8511b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8511b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8511b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyRouterRecord.f19208d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C8511b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8511b m33981clone() {
                    return (C8511b) super.m33981clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord getDefaultInstanceForType() {
                    return SourceCommandRecord.m15866f();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8511b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f19226d = codedInputStream.readStringRequireUtf8();
                                        this.f19225c |= 1;
                                    } else if (tag == 18) {
                                        this.f19227e = codedInputStream.readStringRequireUtf8();
                                        this.f19225c |= 2;
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
                public C8511b mergeFrom(Message message) {
                    if (message instanceof SourceCommandRecord) {
                        return m15885n((SourceCommandRecord) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C8511b m15885n(SourceCommandRecord sourceCommandRecord) {
                    if (sourceCommandRecord == SourceCommandRecord.m15866f()) {
                        return this;
                    }
                    if (!sourceCommandRecord.getFileName().isEmpty()) {
                        this.f19226d = sourceCommandRecord.f19222c;
                        this.f19225c |= 1;
                        onChanged();
                    }
                    if (!sourceCommandRecord.m15869k().isEmpty()) {
                        this.f19227e = sourceCommandRecord.f19223d;
                        this.f19225c |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(sourceCommandRecord.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final C8511b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8511b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8511b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8511b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: q */
                public C8511b m15888q(String str) {
                    str.getClass();
                    this.f19226d = str;
                    this.f19225c |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C8511b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8511b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C8511b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8511b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: t */
                public C8511b m15891t(String str) {
                    str.getClass();
                    this.f19227e = str;
                    this.f19225c |= 2;
                    onChanged();
                    return this;
                }

                public C8511b() {
                    this.f19226d = "";
                    this.f19227e = "";
                }

                public C8511b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19226d = "";
                    this.f19227e = "";
                }
            }

            public SourceCommandRecord(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19222c = "";
                this.f19223d = "";
                this.f19224e = (byte) -1;
            }

            private SourceCommandRecord() {
                this.f19222c = "";
                this.f19223d = "";
                this.f19224e = (byte) -1;
                this.f19222c = "";
                this.f19223d = "";
            }
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$a */
        public class C8512a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RouterRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8513b c8513bM15825R = RouterRecord.m15825R();
                try {
                    c8513bM15825R.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8513bM15825R.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8513bM15825R.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8513bM15825R.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8513bM15825R.buildPartial());
                }
            }
        }

        /* renamed from: F */
        public static RouterRecord m15824F() {
            return f19210k;
        }

        /* renamed from: R */
        public static C8513b m15825R() {
            return f19210k.toBuilder();
        }

        /* renamed from: U */
        public static RouterRecord m15826U(InputStream inputStream) {
            return (RouterRecord) GeneratedMessage.parseWithIOException(f19211l, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRouterRecord.f19205a;
        }

        /* renamed from: A */
        public int m15844A() {
            return this.f19213d.size();
        }

        /* renamed from: C */
        public List m15845C() {
            return this.f19213d;
        }

        /* renamed from: D */
        public int m15846D() {
            return this.f19212c.size();
        }

        /* renamed from: E */
        public List m15847E() {
            return this.f19212c;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public RouterRecord getDefaultInstanceForType() {
            return f19210k;
        }

        /* renamed from: H */
        public int m15849H() {
            return this.f19216g.size();
        }

        /* renamed from: I */
        public List m15850I() {
            return this.f19216g;
        }

        /* renamed from: J */
        public int m15851J() {
            return this.f19218i.size();
        }

        /* renamed from: K */
        public List m15852K() {
            return this.f19218i;
        }

        /* renamed from: L */
        public int m15853L() {
            return this.f19215f.size();
        }

        /* renamed from: M */
        public List m15854M() {
            return this.f19215f;
        }

        /* renamed from: N */
        public int m15855N() {
            return this.f19217h.size();
        }

        /* renamed from: O */
        public List m15856O() {
            return this.f19217h;
        }

        /* renamed from: P */
        public int m15857P() {
            return this.f19214e.size();
        }

        /* renamed from: Q */
        public List m15858Q() {
            return this.f19214e;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public C8513b newBuilderForType() {
            return m15825R();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public C8513b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8513b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public C8513b toBuilder() {
            return this == f19210k ? new C8513b() : new C8513b().m15914V(this);
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
            return m15847E().equals(routerRecord.m15847E()) && m15845C().equals(routerRecord.m15845C()) && m15858Q().equals(routerRecord.m15858Q()) && m15854M().equals(routerRecord.m15854M()) && m15850I().equals(routerRecord.m15850I()) && m15856O().equals(routerRecord.m15856O()) && m15852K().equals(routerRecord.m15852K()) && getUnknownFields().equals(routerRecord.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19211l;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19212c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19212c.get(i11));
            }
            for (int i12 = 0; i12 < this.f19213d.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f19213d.get(i12));
            }
            for (int i13 = 0; i13 < this.f19214e.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f19214e.get(i13));
            }
            for (int i14 = 0; i14 < this.f19215f.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f19215f.get(i14));
            }
            for (int i15 = 0; i15 < this.f19216g.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f19216g.get(i15));
            }
            for (int i16 = 0; i16 < this.f19217h.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f19217h.get(i16));
            }
            for (int i17 = 0; i17 < this.f19218i.size(); i17++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f19218i.get(i17));
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
            if (m15846D() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m15847E().hashCode();
            }
            if (m15844A() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m15845C().hashCode();
            }
            if (m15857P() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + m15858Q().hashCode();
            }
            if (m15853L() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + m15854M().hashCode();
            }
            if (m15849H() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + m15850I().hashCode();
            }
            if (m15855N() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + m15856O().hashCode();
            }
            if (m15851J() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m15852K().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRouterRecord.f19206b.ensureFieldAccessorsInitialized(RouterRecord.class, C8513b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19219j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19219j = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RouterRecord();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19212c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19212c.get(i10));
            }
            for (int i11 = 0; i11 < this.f19213d.size(); i11++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f19213d.get(i11));
            }
            for (int i12 = 0; i12 < this.f19214e.size(); i12++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f19214e.get(i12));
            }
            for (int i13 = 0; i13 < this.f19215f.size(); i13++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f19215f.get(i13));
            }
            for (int i14 = 0; i14 < this.f19216g.size(); i14++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f19216g.get(i14));
            }
            for (int i15 = 0; i15 < this.f19217h.size(); i15++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f19217h.get(i15));
            }
            for (int i16 = 0; i16 < this.f19218i.size(); i16++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f19218i.get(i16));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$b */
        public static final class C8513b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19228c;

            /* renamed from: d */
            public List f19229d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19230e;

            /* renamed from: f */
            public List f19231f;

            /* renamed from: g */
            public RepeatedFieldBuilderV3 f19232g;

            /* renamed from: h */
            public List f19233h;

            /* renamed from: i */
            public RepeatedFieldBuilderV3 f19234i;

            /* renamed from: j */
            public List f19235j;

            /* renamed from: k */
            public RepeatedFieldBuilderV3 f19236k;

            /* renamed from: l */
            public List f19237l;

            /* renamed from: m */
            public RepeatedFieldBuilderV3 f19238m;

            /* renamed from: n */
            public List f19239n;

            /* renamed from: o */
            public RepeatedFieldBuilderV3 f19240o;

            /* renamed from: p */
            public List f19241p;

            /* renamed from: q */
            public RepeatedFieldBuilderV3 f19242q;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C8513b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8513b) super.clearOneof(oneofDescriptor);
            }

            /* renamed from: B */
            public C8513b m15894B() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19240o;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f19239n = Collections.EMPTY_LIST;
                this.f19228c &= -33;
                onChanged();
                return this;
            }

            /* renamed from: C */
            public C8513b m15895C() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19234i;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f19233h = Collections.EMPTY_LIST;
                this.f19228c &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public C8513b m33981clone() {
                return (C8513b) super.m33981clone();
            }

            /* renamed from: E */
            public final void m15897E() {
                if ((this.f19228c & 2) == 0) {
                    this.f19231f = new ArrayList(this.f19231f);
                    this.f19228c |= 2;
                }
            }

            /* renamed from: F */
            public final void m15898F() {
                if ((this.f19228c & 1) == 0) {
                    this.f19229d = new ArrayList(this.f19229d);
                    this.f19228c |= 1;
                }
            }

            /* renamed from: G */
            public final void m15899G() {
                if ((this.f19228c & 16) == 0) {
                    this.f19237l = new ArrayList(this.f19237l);
                    this.f19228c |= 16;
                }
            }

            /* renamed from: H */
            public final void m15900H() {
                if ((this.f19228c & 64) == 0) {
                    this.f19241p = new ArrayList(this.f19241p);
                    this.f19228c |= 64;
                }
            }

            /* renamed from: I */
            public final void m15901I() {
                if ((this.f19228c & 8) == 0) {
                    this.f19235j = new ArrayList(this.f19235j);
                    this.f19228c |= 8;
                }
            }

            /* renamed from: J */
            public final void m15902J() {
                if ((this.f19228c & 32) == 0) {
                    this.f19239n = new ArrayList(this.f19239n);
                    this.f19228c |= 32;
                }
            }

            /* renamed from: K */
            public final void m15903K() {
                if ((this.f19228c & 4) == 0) {
                    this.f19233h = new ArrayList(this.f19233h);
                    this.f19228c |= 4;
                }
            }

            /* renamed from: L */
            public final RepeatedFieldBuilderV3 m15904L() {
                if (this.f19232g == null) {
                    this.f19232g = new RepeatedFieldBuilderV3(this.f19231f, (this.f19228c & 2) != 0, getParentForChildren(), isClean());
                    this.f19231f = null;
                }
                return this.f19232g;
            }

            /* renamed from: M */
            public final RepeatedFieldBuilderV3 m15905M() {
                if (this.f19230e == null) {
                    this.f19230e = new RepeatedFieldBuilderV3(this.f19229d, (this.f19228c & 1) != 0, getParentForChildren(), isClean());
                    this.f19229d = null;
                }
                return this.f19230e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public RouterRecord getDefaultInstanceForType() {
                return RouterRecord.m15824F();
            }

            /* renamed from: O */
            public final RepeatedFieldBuilderV3 m15907O() {
                if (this.f19238m == null) {
                    this.f19238m = new RepeatedFieldBuilderV3(this.f19237l, (this.f19228c & 16) != 0, getParentForChildren(), isClean());
                    this.f19237l = null;
                }
                return this.f19238m;
            }

            /* renamed from: P */
            public final RepeatedFieldBuilderV3 m15908P() {
                if (this.f19242q == null) {
                    this.f19242q = new RepeatedFieldBuilderV3(this.f19241p, (this.f19228c & 64) != 0, getParentForChildren(), isClean());
                    this.f19241p = null;
                }
                return this.f19242q;
            }

            /* renamed from: Q */
            public final RepeatedFieldBuilderV3 m15909Q() {
                if (this.f19236k == null) {
                    this.f19236k = new RepeatedFieldBuilderV3(this.f19235j, (this.f19228c & 8) != 0, getParentForChildren(), isClean());
                    this.f19235j = null;
                }
                return this.f19236k;
            }

            /* renamed from: R */
            public final RepeatedFieldBuilderV3 m15910R() {
                if (this.f19240o == null) {
                    this.f19240o = new RepeatedFieldBuilderV3(this.f19239n, (this.f19228c & 32) != 0, getParentForChildren(), isClean());
                    this.f19239n = null;
                }
                return this.f19240o;
            }

            /* renamed from: S */
            public final RepeatedFieldBuilderV3 m15911S() {
                if (this.f19234i == null) {
                    this.f19234i = new RepeatedFieldBuilderV3(this.f19233h, (this.f19228c & 4) != 0, getParentForChildren(), isClean());
                    this.f19233h = null;
                }
                return this.f19234i;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            public C8513b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    SourceCommandRecord sourceCommandRecord = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19230e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m15898F();
                                        this.f19229d.add(sourceCommandRecord);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sourceCommandRecord);
                                    }
                                } else if (tag == 18) {
                                    SourceCommandRecord sourceCommandRecord2 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19232g;
                                    if (repeatedFieldBuilderV32 == null) {
                                        m15897E();
                                        this.f19231f.add(sourceCommandRecord2);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(sourceCommandRecord2);
                                    }
                                } else if (tag == 26) {
                                    SourceCommandRecord sourceCommandRecord3 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f19234i;
                                    if (repeatedFieldBuilderV33 == null) {
                                        m15903K();
                                        this.f19233h.add(sourceCommandRecord3);
                                    } else {
                                        repeatedFieldBuilderV33.addMessage(sourceCommandRecord3);
                                    }
                                } else if (tag == 34) {
                                    SourceCommandRecord sourceCommandRecord4 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f19236k;
                                    if (repeatedFieldBuilderV34 == null) {
                                        m15901I();
                                        this.f19235j.add(sourceCommandRecord4);
                                    } else {
                                        repeatedFieldBuilderV34.addMessage(sourceCommandRecord4);
                                    }
                                } else if (tag == 42) {
                                    SourceCommandRecord sourceCommandRecord5 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f19238m;
                                    if (repeatedFieldBuilderV35 == null) {
                                        m15899G();
                                        this.f19237l.add(sourceCommandRecord5);
                                    } else {
                                        repeatedFieldBuilderV35.addMessage(sourceCommandRecord5);
                                    }
                                } else if (tag == 50) {
                                    SourceCommandRecord sourceCommandRecord6 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f19240o;
                                    if (repeatedFieldBuilderV36 == null) {
                                        m15902J();
                                        this.f19239n.add(sourceCommandRecord6);
                                    } else {
                                        repeatedFieldBuilderV36.addMessage(sourceCommandRecord6);
                                    }
                                } else if (tag == 58) {
                                    SourceCommandRecord sourceCommandRecord7 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f19242q;
                                    if (repeatedFieldBuilderV37 == null) {
                                        m15900H();
                                        this.f19241p.add(sourceCommandRecord7);
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
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            public C8513b mergeFrom(Message message) {
                if (message instanceof RouterRecord) {
                    return m15914V((RouterRecord) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: V */
            public C8513b m15914V(RouterRecord routerRecord) {
                if (routerRecord == RouterRecord.m15824F()) {
                    return this;
                }
                if (this.f19230e == null) {
                    if (!routerRecord.f19212c.isEmpty()) {
                        if (this.f19229d.isEmpty()) {
                            this.f19229d = routerRecord.f19212c;
                            this.f19228c &= -2;
                        } else {
                            m15898F();
                            this.f19229d.addAll(routerRecord.f19212c);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19212c.isEmpty()) {
                    if (this.f19230e.isEmpty()) {
                        this.f19230e.dispose();
                        this.f19230e = null;
                        this.f19229d = routerRecord.f19212c;
                        this.f19228c &= -2;
                        this.f19230e = GeneratedMessage.alwaysUseFieldBuilders ? m15905M() : null;
                    } else {
                        this.f19230e.addAllMessages(routerRecord.f19212c);
                    }
                }
                if (this.f19232g == null) {
                    if (!routerRecord.f19213d.isEmpty()) {
                        if (this.f19231f.isEmpty()) {
                            this.f19231f = routerRecord.f19213d;
                            this.f19228c &= -3;
                        } else {
                            m15897E();
                            this.f19231f.addAll(routerRecord.f19213d);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19213d.isEmpty()) {
                    if (this.f19232g.isEmpty()) {
                        this.f19232g.dispose();
                        this.f19232g = null;
                        this.f19231f = routerRecord.f19213d;
                        this.f19228c &= -3;
                        this.f19232g = GeneratedMessage.alwaysUseFieldBuilders ? m15904L() : null;
                    } else {
                        this.f19232g.addAllMessages(routerRecord.f19213d);
                    }
                }
                if (this.f19234i == null) {
                    if (!routerRecord.f19214e.isEmpty()) {
                        if (this.f19233h.isEmpty()) {
                            this.f19233h = routerRecord.f19214e;
                            this.f19228c &= -5;
                        } else {
                            m15903K();
                            this.f19233h.addAll(routerRecord.f19214e);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19214e.isEmpty()) {
                    if (this.f19234i.isEmpty()) {
                        this.f19234i.dispose();
                        this.f19234i = null;
                        this.f19233h = routerRecord.f19214e;
                        this.f19228c &= -5;
                        this.f19234i = GeneratedMessage.alwaysUseFieldBuilders ? m15911S() : null;
                    } else {
                        this.f19234i.addAllMessages(routerRecord.f19214e);
                    }
                }
                if (this.f19236k == null) {
                    if (!routerRecord.f19215f.isEmpty()) {
                        if (this.f19235j.isEmpty()) {
                            this.f19235j = routerRecord.f19215f;
                            this.f19228c &= -9;
                        } else {
                            m15901I();
                            this.f19235j.addAll(routerRecord.f19215f);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19215f.isEmpty()) {
                    if (this.f19236k.isEmpty()) {
                        this.f19236k.dispose();
                        this.f19236k = null;
                        this.f19235j = routerRecord.f19215f;
                        this.f19228c &= -9;
                        this.f19236k = GeneratedMessage.alwaysUseFieldBuilders ? m15909Q() : null;
                    } else {
                        this.f19236k.addAllMessages(routerRecord.f19215f);
                    }
                }
                if (this.f19238m == null) {
                    if (!routerRecord.f19216g.isEmpty()) {
                        if (this.f19237l.isEmpty()) {
                            this.f19237l = routerRecord.f19216g;
                            this.f19228c &= -17;
                        } else {
                            m15899G();
                            this.f19237l.addAll(routerRecord.f19216g);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19216g.isEmpty()) {
                    if (this.f19238m.isEmpty()) {
                        this.f19238m.dispose();
                        this.f19238m = null;
                        this.f19237l = routerRecord.f19216g;
                        this.f19228c &= -17;
                        this.f19238m = GeneratedMessage.alwaysUseFieldBuilders ? m15907O() : null;
                    } else {
                        this.f19238m.addAllMessages(routerRecord.f19216g);
                    }
                }
                if (this.f19240o == null) {
                    if (!routerRecord.f19217h.isEmpty()) {
                        if (this.f19239n.isEmpty()) {
                            this.f19239n = routerRecord.f19217h;
                            this.f19228c &= -33;
                        } else {
                            m15902J();
                            this.f19239n.addAll(routerRecord.f19217h);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19217h.isEmpty()) {
                    if (this.f19240o.isEmpty()) {
                        this.f19240o.dispose();
                        this.f19240o = null;
                        this.f19239n = routerRecord.f19217h;
                        this.f19228c &= -33;
                        this.f19240o = GeneratedMessage.alwaysUseFieldBuilders ? m15910R() : null;
                    } else {
                        this.f19240o.addAllMessages(routerRecord.f19217h);
                    }
                }
                if (this.f19242q == null) {
                    if (!routerRecord.f19218i.isEmpty()) {
                        if (this.f19241p.isEmpty()) {
                            this.f19241p = routerRecord.f19218i;
                            this.f19228c &= -65;
                        } else {
                            m15900H();
                            this.f19241p.addAll(routerRecord.f19218i);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f19218i.isEmpty()) {
                    if (this.f19242q.isEmpty()) {
                        this.f19242q.dispose();
                        this.f19242q = null;
                        this.f19241p = routerRecord.f19218i;
                        this.f19228c &= -65;
                        this.f19242q = GeneratedMessage.alwaysUseFieldBuilders ? m15908P() : null;
                    } else {
                        this.f19242q.addAllMessages(routerRecord.f19218i);
                    }
                }
                mergeUnknownFields(routerRecord.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public final C8513b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8513b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public C8513b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8513b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: Y, reason: merged with bridge method [inline-methods] */
            public C8513b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8513b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final C8513b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8513b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: b */
            public C8513b m15919b(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19232g;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m15897E();
                AbstractMessageLite.Builder.addAll(iterable, this.f19231f);
                onChanged();
                return this;
            }

            /* renamed from: d */
            public C8513b m15920d(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19230e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m15898F();
                AbstractMessageLite.Builder.addAll(iterable, this.f19229d);
                onChanged();
                return this;
            }

            /* renamed from: e */
            public C8513b m15921e(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19238m;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m15899G();
                AbstractMessageLite.Builder.addAll(iterable, this.f19237l);
                onChanged();
                return this;
            }

            /* renamed from: f */
            public C8513b m15922f(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19236k;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m15901I();
                AbstractMessageLite.Builder.addAll(iterable, this.f19235j);
                onChanged();
                return this;
            }

            /* renamed from: g */
            public C8513b m15923g(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19240o;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m15902J();
                AbstractMessageLite.Builder.addAll(iterable, this.f19239n);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRouterRecord.f19205a;
            }

            /* renamed from: h */
            public C8513b m15924h(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19234i;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m15903K();
                AbstractMessageLite.Builder.addAll(iterable, this.f19233h);
                onChanged();
                return this;
            }

            /* renamed from: i */
            public C8513b m15925i(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19232g;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15897E();
                this.f19231f.add(c8511b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f19206b.ensureFieldAccessorsInitialized(RouterRecord.class, C8513b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: j */
            public C8513b m15926j(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19230e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15898F();
                this.f19229d.add(c8511b.build());
                onChanged();
                return this;
            }

            /* renamed from: k */
            public C8513b m15927k(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19238m;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15899G();
                this.f19237l.add(c8511b.build());
                onChanged();
                return this;
            }

            /* renamed from: l */
            public C8513b m15928l(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19242q;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15900H();
                this.f19241p.add(c8511b.build());
                onChanged();
                return this;
            }

            /* renamed from: m */
            public C8513b m15929m(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19236k;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15901I();
                this.f19235j.add(c8511b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C8513b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8513b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: o */
            public C8513b m15931o(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19240o;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15902J();
                this.f19239n.add(c8511b.build());
                onChanged();
                return this;
            }

            /* renamed from: p */
            public C8513b m15932p(SourceCommandRecord.C8511b c8511b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19234i;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8511b.build());
                    return this;
                }
                m15903K();
                this.f19233h.add(c8511b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public RouterRecord build() {
                RouterRecord routerRecordBuildPartial = buildPartial();
                if (routerRecordBuildPartial.isInitialized()) {
                    return routerRecordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) routerRecordBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public RouterRecord buildPartial() {
                RouterRecord routerRecord = new RouterRecord(this);
                m15936t(routerRecord);
                if (this.f19228c != 0) {
                    m15935s(routerRecord);
                }
                onBuilt();
                return routerRecord;
            }

            /* renamed from: s */
            public final void m15935s(RouterRecord routerRecord) {
            }

            /* renamed from: t */
            public final void m15936t(RouterRecord routerRecord) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19230e;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f19228c & 1) != 0) {
                        this.f19229d = Collections.unmodifiableList(this.f19229d);
                        this.f19228c &= -2;
                    }
                    routerRecord.f19212c = this.f19229d;
                } else {
                    routerRecord.f19212c = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19232g;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.f19228c & 2) != 0) {
                        this.f19231f = Collections.unmodifiableList(this.f19231f);
                        this.f19228c &= -3;
                    }
                    routerRecord.f19213d = this.f19231f;
                } else {
                    routerRecord.f19213d = repeatedFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f19234i;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.f19228c & 4) != 0) {
                        this.f19233h = Collections.unmodifiableList(this.f19233h);
                        this.f19228c &= -5;
                    }
                    routerRecord.f19214e = this.f19233h;
                } else {
                    routerRecord.f19214e = repeatedFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f19236k;
                if (repeatedFieldBuilderV34 == null) {
                    if ((this.f19228c & 8) != 0) {
                        this.f19235j = Collections.unmodifiableList(this.f19235j);
                        this.f19228c &= -9;
                    }
                    routerRecord.f19215f = this.f19235j;
                } else {
                    routerRecord.f19215f = repeatedFieldBuilderV34.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f19238m;
                if (repeatedFieldBuilderV35 == null) {
                    if ((this.f19228c & 16) != 0) {
                        this.f19237l = Collections.unmodifiableList(this.f19237l);
                        this.f19228c &= -17;
                    }
                    routerRecord.f19216g = this.f19237l;
                } else {
                    routerRecord.f19216g = repeatedFieldBuilderV35.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f19240o;
                if (repeatedFieldBuilderV36 == null) {
                    if ((this.f19228c & 32) != 0) {
                        this.f19239n = Collections.unmodifiableList(this.f19239n);
                        this.f19228c &= -33;
                    }
                    routerRecord.f19217h = this.f19239n;
                } else {
                    routerRecord.f19217h = repeatedFieldBuilderV36.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f19242q;
                if (repeatedFieldBuilderV37 != null) {
                    routerRecord.f19218i = repeatedFieldBuilderV37.build();
                    return;
                }
                if ((this.f19228c & 64) != 0) {
                    this.f19241p = Collections.unmodifiableList(this.f19241p);
                    this.f19228c &= -65;
                }
                routerRecord.f19218i = this.f19241p;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8513b clear() {
                super.clear();
                this.f19228c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19230e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19229d = Collections.EMPTY_LIST;
                } else {
                    this.f19229d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19228c &= -2;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19232g;
                if (repeatedFieldBuilderV32 == null) {
                    this.f19231f = Collections.EMPTY_LIST;
                } else {
                    this.f19231f = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f19228c &= -3;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f19234i;
                if (repeatedFieldBuilderV33 == null) {
                    this.f19233h = Collections.EMPTY_LIST;
                } else {
                    this.f19233h = null;
                    repeatedFieldBuilderV33.clear();
                }
                this.f19228c &= -5;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f19236k;
                if (repeatedFieldBuilderV34 == null) {
                    this.f19235j = Collections.EMPTY_LIST;
                } else {
                    this.f19235j = null;
                    repeatedFieldBuilderV34.clear();
                }
                this.f19228c &= -9;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f19238m;
                if (repeatedFieldBuilderV35 == null) {
                    this.f19237l = Collections.EMPTY_LIST;
                } else {
                    this.f19237l = null;
                    repeatedFieldBuilderV35.clear();
                }
                this.f19228c &= -17;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f19240o;
                if (repeatedFieldBuilderV36 == null) {
                    this.f19239n = Collections.EMPTY_LIST;
                } else {
                    this.f19239n = null;
                    repeatedFieldBuilderV36.clear();
                }
                this.f19228c &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f19242q;
                if (repeatedFieldBuilderV37 == null) {
                    this.f19241p = Collections.EMPTY_LIST;
                } else {
                    this.f19241p = null;
                    repeatedFieldBuilderV37.clear();
                }
                this.f19228c &= -65;
                return this;
            }

            /* renamed from: v */
            public C8513b m15938v() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19232g;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f19231f = Collections.EMPTY_LIST;
                this.f19228c &= -3;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C8513b m15939w() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19230e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f19229d = Collections.EMPTY_LIST;
                this.f19228c &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public C8513b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8513b) super.clearField(fieldDescriptor);
            }

            /* renamed from: y */
            public C8513b m15941y() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19238m;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f19237l = Collections.EMPTY_LIST;
                this.f19228c &= -17;
                onChanged();
                return this;
            }

            /* renamed from: z */
            public C8513b m15942z() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19236k;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f19235j = Collections.EMPTY_LIST;
                this.f19228c &= -9;
                onChanged();
                return this;
            }

            public C8513b() {
                List list = Collections.EMPTY_LIST;
                this.f19229d = list;
                this.f19231f = list;
                this.f19233h = list;
                this.f19235j = list;
                this.f19237l = list;
                this.f19239n = list;
                this.f19241p = list;
            }

            public C8513b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f19229d = list;
                this.f19231f = list;
                this.f19233h = list;
                this.f19235j = list;
                this.f19237l = list;
                this.f19239n = list;
                this.f19241p = list;
            }
        }

        public RouterRecord(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19219j = (byte) -1;
        }

        private RouterRecord() {
            this.f19219j = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f19212c = list;
            this.f19213d = list;
            this.f19214e = list;
            this.f19215f = list;
            this.f19216g = list;
            this.f19217h = list;
            this.f19218i = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15823e().getMessageTypes().get(0);
        f19205a = descriptor;
        f19206b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandRecord", "AudioRecord", "TouchSourceRecord", "MatrixSourceRecord", "FileSourceRecord", "TextSourceRecord", "GeometrySourceRecord"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f19207c = descriptor2;
        f19208d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"FileName", "Validate"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m15823e() {
        return f19209e;
    }
}

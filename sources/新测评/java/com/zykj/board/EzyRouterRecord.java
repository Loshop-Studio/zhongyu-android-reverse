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
    public static final Descriptors.Descriptor f8369a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8370b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8371c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8372d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f8373e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012RouterRecord.proto\"ó\u0003\n\fRouterRecord\u00128\n\rcommandRecord\u0018\u0001 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u00126\n\u000baudioRecord\u0018\u0002 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012<\n\u0011touchSourceRecord\u0018\u0003 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012=\n\u0012matrixSourceRecord\u0018\u0004 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010fileSourceRecord\u0018\u0005 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010textSourceRecord\u0018\u0006 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012?\n\u0014geometrySourceRecord\u0018\u0007 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u001a9\n\u0013SourceCommandRecord\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bvalidate\u0018\u0002 \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyRouterRecordb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class RouterRecord extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final RouterRecord f8374i = new RouterRecord();

        /* renamed from: j */
        public static final Parser f8375j = new C6815a();

        /* renamed from: a */
        public List f8376a;

        /* renamed from: b */
        public List f8377b;

        /* renamed from: c */
        public List f8378c;

        /* renamed from: d */
        public List f8379d;

        /* renamed from: e */
        public List f8380e;

        /* renamed from: f */
        public List f8381f;

        /* renamed from: g */
        public List f8382g;

        /* renamed from: h */
        public byte f8383h;

        public static final class SourceCommandRecord extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final SourceCommandRecord f8384d = new SourceCommandRecord();

            /* renamed from: e */
            public static final Parser f8385e = new C6813a();

            /* renamed from: a */
            public volatile Object f8386a;

            /* renamed from: b */
            public volatile Object f8387b;

            /* renamed from: c */
            public byte f8388c;

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$a */
            public class C6813a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6814b c6814bM8117r = SourceCommandRecord.m8117r();
                    try {
                        c6814bM8117r.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6814bM8117r.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6814bM8117r.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6814bM8117r.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6814bM8117r.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyRouterRecord.f8371c;
            }

            /* renamed from: m */
            public static SourceCommandRecord m8116m() {
                return f8384d;
            }

            public static Parser parser() {
                return f8385e;
            }

            /* renamed from: r */
            public static C6814b m8117r() {
                return f8384d.toBuilder();
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
                return getFileName().equals(sourceCommandRecord.getFileName()) && m8119q().equals(sourceCommandRecord.m8119q()) && getUnknownFields().equals(sourceCommandRecord.getUnknownFields());
            }

            public String getFileName() {
                Object obj = this.f8386a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8386a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8385e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8386a) ? GeneratedMessageV3.computeStringSize(1, this.f8386a) : 0;
                if (!GeneratedMessageV3.isStringEmpty(this.f8387b)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f8387b);
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + m8119q().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f8372d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C6814b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8388c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8388c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new SourceCommandRecord();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public SourceCommandRecord getDefaultInstanceForType() {
                return f8384d;
            }

            /* renamed from: q */
            public String m8119q() {
                Object obj = this.f8387b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8387b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C6814b newBuilderForType() {
                return m8117r();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6814b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6814b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6814b toBuilder() {
                return this == f8384d ? new C6814b() : new C6814b().m8135n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f8386a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8386a);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8387b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.f8387b);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$SourceCommandRecord$b */
            public static final class C6814b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8389a;

                /* renamed from: b */
                public Object f8390b;

                /* renamed from: c */
                public Object f8391c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6814b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6814b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord build() {
                    SourceCommandRecord sourceCommandRecordBuildPartial = buildPartial();
                    if (sourceCommandRecordBuildPartial.isInitialized()) {
                        return sourceCommandRecordBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sourceCommandRecordBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord buildPartial() {
                    SourceCommandRecord sourceCommandRecord = new SourceCommandRecord(this);
                    if (this.f8389a != 0) {
                        m8127e(sourceCommandRecord);
                    }
                    onBuilt();
                    return sourceCommandRecord;
                }

                /* renamed from: e */
                public final void m8127e(SourceCommandRecord sourceCommandRecord) {
                    int i10 = this.f8389a;
                    if ((i10 & 1) != 0) {
                        sourceCommandRecord.f8386a = this.f8390b;
                    }
                    if ((i10 & 2) != 0) {
                        sourceCommandRecord.f8387b = this.f8391c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6814b clear() {
                    super.clear();
                    this.f8389a = 0;
                    this.f8390b = "";
                    this.f8391c = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6814b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6814b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyRouterRecord.f8371c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6814b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6814b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6814b mo24228clone() {
                    return (C6814b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyRouterRecord.f8372d.ensureFieldAccessorsInitialized(SourceCommandRecord.class, C6814b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public SourceCommandRecord getDefaultInstanceForType() {
                    return SourceCommandRecord.m8116m();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6814b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f8390b = codedInputStream.readStringRequireUtf8();
                                        this.f8389a |= 1;
                                    } else if (tag == 18) {
                                        this.f8391c = codedInputStream.readStringRequireUtf8();
                                        this.f8389a |= 2;
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
                public C6814b mergeFrom(Message message) {
                    if (message instanceof SourceCommandRecord) {
                        return m8135n((SourceCommandRecord) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C6814b m8135n(SourceCommandRecord sourceCommandRecord) {
                    if (sourceCommandRecord == SourceCommandRecord.m8116m()) {
                        return this;
                    }
                    if (!sourceCommandRecord.getFileName().isEmpty()) {
                        this.f8390b = sourceCommandRecord.f8386a;
                        this.f8389a |= 1;
                        onChanged();
                    }
                    if (!sourceCommandRecord.m8119q().isEmpty()) {
                        this.f8391c = sourceCommandRecord.f8387b;
                        this.f8389a |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(sourceCommandRecord.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C6814b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6814b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C6814b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6814b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C6814b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6814b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C6814b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6814b) super.setUnknownFields(unknownFieldSet);
                }

                public C6814b() {
                    this.f8390b = "";
                    this.f8391c = "";
                }

                public C6814b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8390b = "";
                    this.f8391c = "";
                }
            }

            public SourceCommandRecord(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8386a = "";
                this.f8387b = "";
                this.f8388c = (byte) -1;
            }

            private SourceCommandRecord() {
                this.f8386a = "";
                this.f8387b = "";
                this.f8388c = (byte) -1;
                this.f8386a = "";
                this.f8387b = "";
            }
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$a */
        public class C6815a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RouterRecord parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6816b c6816bM8076R = RouterRecord.m8076R();
                try {
                    c6816bM8076R.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6816bM8076R.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6816bM8076R.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6816bM8076R.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6816bM8076R.buildPartial());
                }
            }
        }

        /* renamed from: F */
        public static RouterRecord m8075F() {
            return f8374i;
        }

        /* renamed from: R */
        public static C6816b m8076R() {
            return f8374i.toBuilder();
        }

        /* renamed from: U */
        public static RouterRecord m8077U(InputStream inputStream) {
            return (RouterRecord) GeneratedMessageV3.parseWithIOException(f8375j, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyRouterRecord.f8369a;
        }

        /* renamed from: B */
        public int m8094B() {
            return this.f8377b.size();
        }

        /* renamed from: C */
        public List m8095C() {
            return this.f8377b;
        }

        /* renamed from: D */
        public int m8096D() {
            return this.f8376a.size();
        }

        /* renamed from: E */
        public List m8097E() {
            return this.f8376a;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public RouterRecord getDefaultInstanceForType() {
            return f8374i;
        }

        /* renamed from: H */
        public int m8099H() {
            return this.f8380e.size();
        }

        /* renamed from: I */
        public List m8100I() {
            return this.f8380e;
        }

        /* renamed from: J */
        public int m8101J() {
            return this.f8382g.size();
        }

        /* renamed from: K */
        public List m8102K() {
            return this.f8382g;
        }

        /* renamed from: L */
        public int m8103L() {
            return this.f8379d.size();
        }

        /* renamed from: M */
        public List m8104M() {
            return this.f8379d;
        }

        /* renamed from: N */
        public int m8105N() {
            return this.f8381f.size();
        }

        /* renamed from: O */
        public List m8106O() {
            return this.f8381f;
        }

        /* renamed from: P */
        public int m8107P() {
            return this.f8378c.size();
        }

        /* renamed from: Q */
        public List m8108Q() {
            return this.f8378c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public C6816b newBuilderForType() {
            return m8076R();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public C6816b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6816b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public C6816b toBuilder() {
            return this == f8374i ? new C6816b() : new C6816b().m8144D(this);
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
            return m8097E().equals(routerRecord.m8097E()) && m8095C().equals(routerRecord.m8095C()) && m8108Q().equals(routerRecord.m8108Q()) && m8104M().equals(routerRecord.m8104M()) && m8100I().equals(routerRecord.m8100I()) && m8106O().equals(routerRecord.m8106O()) && m8102K().equals(routerRecord.m8102K()) && getUnknownFields().equals(routerRecord.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8375j;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8376a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8376a.get(i11));
            }
            for (int i12 = 0; i12 < this.f8377b.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f8377b.get(i12));
            }
            for (int i13 = 0; i13 < this.f8378c.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f8378c.get(i13));
            }
            for (int i14 = 0; i14 < this.f8379d.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f8379d.get(i14));
            }
            for (int i15 = 0; i15 < this.f8380e.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f8380e.get(i15));
            }
            for (int i16 = 0; i16 < this.f8381f.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f8381f.get(i16));
            }
            for (int i17 = 0; i17 < this.f8382g.size(); i17++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f8382g.get(i17));
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
            if (m8096D() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8097E().hashCode();
            }
            if (m8094B() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m8095C().hashCode();
            }
            if (m8107P() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + m8108Q().hashCode();
            }
            if (m8103L() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + m8104M().hashCode();
            }
            if (m8099H() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + m8100I().hashCode();
            }
            if (m8105N() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + m8106O().hashCode();
            }
            if (m8101J() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m8102K().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyRouterRecord.f8370b.ensureFieldAccessorsInitialized(RouterRecord.class, C6816b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8383h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8383h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RouterRecord();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8376a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8376a.get(i10));
            }
            for (int i11 = 0; i11 < this.f8377b.size(); i11++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f8377b.get(i11));
            }
            for (int i12 = 0; i12 < this.f8378c.size(); i12++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f8378c.get(i12));
            }
            for (int i13 = 0; i13 < this.f8379d.size(); i13++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f8379d.get(i13));
            }
            for (int i14 = 0; i14 < this.f8380e.size(); i14++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f8380e.get(i14));
            }
            for (int i15 = 0; i15 < this.f8381f.size(); i15++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f8381f.get(i15));
            }
            for (int i16 = 0; i16 < this.f8382g.size(); i16++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f8382g.get(i16));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyRouterRecord$RouterRecord$b */
        public static final class C6816b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8392a;

            /* renamed from: b */
            public List f8393b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8394c;

            /* renamed from: d */
            public List f8395d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f8396e;

            /* renamed from: f */
            public List f8397f;

            /* renamed from: g */
            public RepeatedFieldBuilderV3 f8398g;

            /* renamed from: h */
            public List f8399h;

            /* renamed from: i */
            public RepeatedFieldBuilderV3 f8400i;

            /* renamed from: j */
            public List f8401j;

            /* renamed from: k */
            public RepeatedFieldBuilderV3 f8402k;

            /* renamed from: l */
            public List f8403l;

            /* renamed from: m */
            public RepeatedFieldBuilderV3 f8404m;

            /* renamed from: n */
            public List f8405n;

            /* renamed from: o */
            public RepeatedFieldBuilderV3 f8406o;

            /* renamed from: A */
            public final RepeatedFieldBuilderV3 m8141A() {
                if (this.f8398g == null) {
                    this.f8398g = new RepeatedFieldBuilderV3(this.f8397f, (this.f8392a & 4) != 0, getParentForChildren(), isClean());
                    this.f8397f = null;
                }
                return this.f8398g;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public C6816b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    SourceCommandRecord sourceCommandRecord = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8394c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8159m();
                                        this.f8393b.add(sourceCommandRecord);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sourceCommandRecord);
                                    }
                                } else if (tag == 18) {
                                    SourceCommandRecord sourceCommandRecord2 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8396e;
                                    if (repeatedFieldBuilderV32 == null) {
                                        m8158l();
                                        this.f8395d.add(sourceCommandRecord2);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(sourceCommandRecord2);
                                    }
                                } else if (tag == 26) {
                                    SourceCommandRecord sourceCommandRecord3 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f8398g;
                                    if (repeatedFieldBuilderV33 == null) {
                                        m8164s();
                                        this.f8397f.add(sourceCommandRecord3);
                                    } else {
                                        repeatedFieldBuilderV33.addMessage(sourceCommandRecord3);
                                    }
                                } else if (tag == 34) {
                                    SourceCommandRecord sourceCommandRecord4 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f8400i;
                                    if (repeatedFieldBuilderV34 == null) {
                                        m8162q();
                                        this.f8399h.add(sourceCommandRecord4);
                                    } else {
                                        repeatedFieldBuilderV34.addMessage(sourceCommandRecord4);
                                    }
                                } else if (tag == 42) {
                                    SourceCommandRecord sourceCommandRecord5 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f8402k;
                                    if (repeatedFieldBuilderV35 == null) {
                                        m8160n();
                                        this.f8401j.add(sourceCommandRecord5);
                                    } else {
                                        repeatedFieldBuilderV35.addMessage(sourceCommandRecord5);
                                    }
                                } else if (tag == 50) {
                                    SourceCommandRecord sourceCommandRecord6 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f8404m;
                                    if (repeatedFieldBuilderV36 == null) {
                                        m8163r();
                                        this.f8403l.add(sourceCommandRecord6);
                                    } else {
                                        repeatedFieldBuilderV36.addMessage(sourceCommandRecord6);
                                    }
                                } else if (tag == 58) {
                                    SourceCommandRecord sourceCommandRecord7 = (SourceCommandRecord) codedInputStream.readMessage(SourceCommandRecord.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f8406o;
                                    if (repeatedFieldBuilderV37 == null) {
                                        m8161p();
                                        this.f8405n.add(sourceCommandRecord7);
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
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public C6816b mergeFrom(Message message) {
                if (message instanceof RouterRecord) {
                    return m8144D((RouterRecord) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: D */
            public C6816b m8144D(RouterRecord routerRecord) {
                if (routerRecord == RouterRecord.m8075F()) {
                    return this;
                }
                if (this.f8394c == null) {
                    if (!routerRecord.f8376a.isEmpty()) {
                        if (this.f8393b.isEmpty()) {
                            this.f8393b = routerRecord.f8376a;
                            this.f8392a &= -2;
                        } else {
                            m8159m();
                            this.f8393b.addAll(routerRecord.f8376a);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8376a.isEmpty()) {
                    if (this.f8394c.isEmpty()) {
                        this.f8394c.dispose();
                        this.f8394c = null;
                        this.f8393b = routerRecord.f8376a;
                        this.f8392a &= -2;
                        this.f8394c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8166u() : null;
                    } else {
                        this.f8394c.addAllMessages(routerRecord.f8376a);
                    }
                }
                if (this.f8396e == null) {
                    if (!routerRecord.f8377b.isEmpty()) {
                        if (this.f8395d.isEmpty()) {
                            this.f8395d = routerRecord.f8377b;
                            this.f8392a &= -3;
                        } else {
                            m8158l();
                            this.f8395d.addAll(routerRecord.f8377b);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8377b.isEmpty()) {
                    if (this.f8396e.isEmpty()) {
                        this.f8396e.dispose();
                        this.f8396e = null;
                        this.f8395d = routerRecord.f8377b;
                        this.f8392a &= -3;
                        this.f8396e = GeneratedMessageV3.alwaysUseFieldBuilders ? m8165t() : null;
                    } else {
                        this.f8396e.addAllMessages(routerRecord.f8377b);
                    }
                }
                if (this.f8398g == null) {
                    if (!routerRecord.f8378c.isEmpty()) {
                        if (this.f8397f.isEmpty()) {
                            this.f8397f = routerRecord.f8378c;
                            this.f8392a &= -5;
                        } else {
                            m8164s();
                            this.f8397f.addAll(routerRecord.f8378c);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8378c.isEmpty()) {
                    if (this.f8398g.isEmpty()) {
                        this.f8398g.dispose();
                        this.f8398g = null;
                        this.f8397f = routerRecord.f8378c;
                        this.f8392a &= -5;
                        this.f8398g = GeneratedMessageV3.alwaysUseFieldBuilders ? m8141A() : null;
                    } else {
                        this.f8398g.addAllMessages(routerRecord.f8378c);
                    }
                }
                if (this.f8400i == null) {
                    if (!routerRecord.f8379d.isEmpty()) {
                        if (this.f8399h.isEmpty()) {
                            this.f8399h = routerRecord.f8379d;
                            this.f8392a &= -9;
                        } else {
                            m8162q();
                            this.f8399h.addAll(routerRecord.f8379d);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8379d.isEmpty()) {
                    if (this.f8400i.isEmpty()) {
                        this.f8400i.dispose();
                        this.f8400i = null;
                        this.f8399h = routerRecord.f8379d;
                        this.f8392a &= -9;
                        this.f8400i = GeneratedMessageV3.alwaysUseFieldBuilders ? m8170y() : null;
                    } else {
                        this.f8400i.addAllMessages(routerRecord.f8379d);
                    }
                }
                if (this.f8402k == null) {
                    if (!routerRecord.f8380e.isEmpty()) {
                        if (this.f8401j.isEmpty()) {
                            this.f8401j = routerRecord.f8380e;
                            this.f8392a &= -17;
                        } else {
                            m8160n();
                            this.f8401j.addAll(routerRecord.f8380e);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8380e.isEmpty()) {
                    if (this.f8402k.isEmpty()) {
                        this.f8402k.dispose();
                        this.f8402k = null;
                        this.f8401j = routerRecord.f8380e;
                        this.f8392a &= -17;
                        this.f8402k = GeneratedMessageV3.alwaysUseFieldBuilders ? m8168w() : null;
                    } else {
                        this.f8402k.addAllMessages(routerRecord.f8380e);
                    }
                }
                if (this.f8404m == null) {
                    if (!routerRecord.f8381f.isEmpty()) {
                        if (this.f8403l.isEmpty()) {
                            this.f8403l = routerRecord.f8381f;
                            this.f8392a &= -33;
                        } else {
                            m8163r();
                            this.f8403l.addAll(routerRecord.f8381f);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8381f.isEmpty()) {
                    if (this.f8404m.isEmpty()) {
                        this.f8404m.dispose();
                        this.f8404m = null;
                        this.f8403l = routerRecord.f8381f;
                        this.f8392a &= -33;
                        this.f8404m = GeneratedMessageV3.alwaysUseFieldBuilders ? m8171z() : null;
                    } else {
                        this.f8404m.addAllMessages(routerRecord.f8381f);
                    }
                }
                if (this.f8406o == null) {
                    if (!routerRecord.f8382g.isEmpty()) {
                        if (this.f8405n.isEmpty()) {
                            this.f8405n = routerRecord.f8382g;
                            this.f8392a &= -65;
                        } else {
                            m8161p();
                            this.f8405n.addAll(routerRecord.f8382g);
                        }
                        onChanged();
                    }
                } else if (!routerRecord.f8382g.isEmpty()) {
                    if (this.f8406o.isEmpty()) {
                        this.f8406o.dispose();
                        this.f8406o = null;
                        this.f8405n = routerRecord.f8382g;
                        this.f8392a &= -65;
                        this.f8406o = GeneratedMessageV3.alwaysUseFieldBuilders ? m8169x() : null;
                    } else {
                        this.f8406o.addAllMessages(routerRecord.f8382g);
                    }
                }
                mergeUnknownFields(routerRecord.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public final C6816b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6816b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public C6816b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6816b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public C6816b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6816b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public final C6816b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6816b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6816b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6816b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public RouterRecord build() {
                RouterRecord routerRecordBuildPartial = buildPartial();
                if (routerRecordBuildPartial.isInitialized()) {
                    return routerRecordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) routerRecordBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public RouterRecord buildPartial() {
                RouterRecord routerRecord = new RouterRecord(this);
                m8153f(routerRecord);
                if (this.f8392a != 0) {
                    m8152e(routerRecord);
                }
                onBuilt();
                return routerRecord;
            }

            /* renamed from: e */
            public final void m8152e(RouterRecord routerRecord) {
            }

            /* renamed from: f */
            public final void m8153f(RouterRecord routerRecord) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8394c;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f8392a & 1) != 0) {
                        this.f8393b = Collections.unmodifiableList(this.f8393b);
                        this.f8392a &= -2;
                    }
                    routerRecord.f8376a = this.f8393b;
                } else {
                    routerRecord.f8376a = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8396e;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.f8392a & 2) != 0) {
                        this.f8395d = Collections.unmodifiableList(this.f8395d);
                        this.f8392a &= -3;
                    }
                    routerRecord.f8377b = this.f8395d;
                } else {
                    routerRecord.f8377b = repeatedFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f8398g;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.f8392a & 4) != 0) {
                        this.f8397f = Collections.unmodifiableList(this.f8397f);
                        this.f8392a &= -5;
                    }
                    routerRecord.f8378c = this.f8397f;
                } else {
                    routerRecord.f8378c = repeatedFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f8400i;
                if (repeatedFieldBuilderV34 == null) {
                    if ((this.f8392a & 8) != 0) {
                        this.f8399h = Collections.unmodifiableList(this.f8399h);
                        this.f8392a &= -9;
                    }
                    routerRecord.f8379d = this.f8399h;
                } else {
                    routerRecord.f8379d = repeatedFieldBuilderV34.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f8402k;
                if (repeatedFieldBuilderV35 == null) {
                    if ((this.f8392a & 16) != 0) {
                        this.f8401j = Collections.unmodifiableList(this.f8401j);
                        this.f8392a &= -17;
                    }
                    routerRecord.f8380e = this.f8401j;
                } else {
                    routerRecord.f8380e = repeatedFieldBuilderV35.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f8404m;
                if (repeatedFieldBuilderV36 == null) {
                    if ((this.f8392a & 32) != 0) {
                        this.f8403l = Collections.unmodifiableList(this.f8403l);
                        this.f8392a &= -33;
                    }
                    routerRecord.f8381f = this.f8403l;
                } else {
                    routerRecord.f8381f = repeatedFieldBuilderV36.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f8406o;
                if (repeatedFieldBuilderV37 != null) {
                    routerRecord.f8382g = repeatedFieldBuilderV37.build();
                    return;
                }
                if ((this.f8392a & 64) != 0) {
                    this.f8405n = Collections.unmodifiableList(this.f8405n);
                    this.f8392a &= -65;
                }
                routerRecord.f8382g = this.f8405n;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6816b clear() {
                super.clear();
                this.f8392a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8394c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8393b = Collections.EMPTY_LIST;
                } else {
                    this.f8393b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8392a &= -2;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8396e;
                if (repeatedFieldBuilderV32 == null) {
                    this.f8395d = Collections.EMPTY_LIST;
                } else {
                    this.f8395d = null;
                    repeatedFieldBuilderV32.clear();
                }
                this.f8392a &= -3;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f8398g;
                if (repeatedFieldBuilderV33 == null) {
                    this.f8397f = Collections.EMPTY_LIST;
                } else {
                    this.f8397f = null;
                    repeatedFieldBuilderV33.clear();
                }
                this.f8392a &= -5;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f8400i;
                if (repeatedFieldBuilderV34 == null) {
                    this.f8399h = Collections.EMPTY_LIST;
                } else {
                    this.f8399h = null;
                    repeatedFieldBuilderV34.clear();
                }
                this.f8392a &= -9;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f8402k;
                if (repeatedFieldBuilderV35 == null) {
                    this.f8401j = Collections.EMPTY_LIST;
                } else {
                    this.f8401j = null;
                    repeatedFieldBuilderV35.clear();
                }
                this.f8392a &= -17;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f8404m;
                if (repeatedFieldBuilderV36 == null) {
                    this.f8403l = Collections.EMPTY_LIST;
                } else {
                    this.f8403l = null;
                    repeatedFieldBuilderV36.clear();
                }
                this.f8392a &= -33;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f8406o;
                if (repeatedFieldBuilderV37 == null) {
                    this.f8405n = Collections.EMPTY_LIST;
                } else {
                    this.f8405n = null;
                    repeatedFieldBuilderV37.clear();
                }
                this.f8392a &= -65;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyRouterRecord.f8369a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6816b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6816b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6816b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6816b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyRouterRecord.f8370b.ensureFieldAccessorsInitialized(RouterRecord.class, C6816b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6816b mo24228clone() {
                return (C6816b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m8158l() {
                if ((this.f8392a & 2) == 0) {
                    this.f8395d = new ArrayList(this.f8395d);
                    this.f8392a |= 2;
                }
            }

            /* renamed from: m */
            public final void m8159m() {
                if ((this.f8392a & 1) == 0) {
                    this.f8393b = new ArrayList(this.f8393b);
                    this.f8392a |= 1;
                }
            }

            /* renamed from: n */
            public final void m8160n() {
                if ((this.f8392a & 16) == 0) {
                    this.f8401j = new ArrayList(this.f8401j);
                    this.f8392a |= 16;
                }
            }

            /* renamed from: p */
            public final void m8161p() {
                if ((this.f8392a & 64) == 0) {
                    this.f8405n = new ArrayList(this.f8405n);
                    this.f8392a |= 64;
                }
            }

            /* renamed from: q */
            public final void m8162q() {
                if ((this.f8392a & 8) == 0) {
                    this.f8399h = new ArrayList(this.f8399h);
                    this.f8392a |= 8;
                }
            }

            /* renamed from: r */
            public final void m8163r() {
                if ((this.f8392a & 32) == 0) {
                    this.f8403l = new ArrayList(this.f8403l);
                    this.f8392a |= 32;
                }
            }

            /* renamed from: s */
            public final void m8164s() {
                if ((this.f8392a & 4) == 0) {
                    this.f8397f = new ArrayList(this.f8397f);
                    this.f8392a |= 4;
                }
            }

            /* renamed from: t */
            public final RepeatedFieldBuilderV3 m8165t() {
                if (this.f8396e == null) {
                    this.f8396e = new RepeatedFieldBuilderV3(this.f8395d, (this.f8392a & 2) != 0, getParentForChildren(), isClean());
                    this.f8395d = null;
                }
                return this.f8396e;
            }

            /* renamed from: u */
            public final RepeatedFieldBuilderV3 m8166u() {
                if (this.f8394c == null) {
                    this.f8394c = new RepeatedFieldBuilderV3(this.f8393b, (this.f8392a & 1) != 0, getParentForChildren(), isClean());
                    this.f8393b = null;
                }
                return this.f8394c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public RouterRecord getDefaultInstanceForType() {
                return RouterRecord.m8075F();
            }

            /* renamed from: w */
            public final RepeatedFieldBuilderV3 m8168w() {
                if (this.f8402k == null) {
                    this.f8402k = new RepeatedFieldBuilderV3(this.f8401j, (this.f8392a & 16) != 0, getParentForChildren(), isClean());
                    this.f8401j = null;
                }
                return this.f8402k;
            }

            /* renamed from: x */
            public final RepeatedFieldBuilderV3 m8169x() {
                if (this.f8406o == null) {
                    this.f8406o = new RepeatedFieldBuilderV3(this.f8405n, (this.f8392a & 64) != 0, getParentForChildren(), isClean());
                    this.f8405n = null;
                }
                return this.f8406o;
            }

            /* renamed from: y */
            public final RepeatedFieldBuilderV3 m8170y() {
                if (this.f8400i == null) {
                    this.f8400i = new RepeatedFieldBuilderV3(this.f8399h, (this.f8392a & 8) != 0, getParentForChildren(), isClean());
                    this.f8399h = null;
                }
                return this.f8400i;
            }

            /* renamed from: z */
            public final RepeatedFieldBuilderV3 m8171z() {
                if (this.f8404m == null) {
                    this.f8404m = new RepeatedFieldBuilderV3(this.f8403l, (this.f8392a & 32) != 0, getParentForChildren(), isClean());
                    this.f8403l = null;
                }
                return this.f8404m;
            }

            public C6816b() {
                List list = Collections.EMPTY_LIST;
                this.f8393b = list;
                this.f8395d = list;
                this.f8397f = list;
                this.f8399h = list;
                this.f8401j = list;
                this.f8403l = list;
                this.f8405n = list;
            }

            public C6816b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.f8393b = list;
                this.f8395d = list;
                this.f8397f = list;
                this.f8399h = list;
                this.f8401j = list;
                this.f8403l = list;
                this.f8405n = list;
            }
        }

        public RouterRecord(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8383h = (byte) -1;
        }

        private RouterRecord() {
            this.f8383h = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f8376a = list;
            this.f8377b = list;
            this.f8378c = list;
            this.f8379d = list;
            this.f8380e = list;
            this.f8381f = list;
            this.f8382g = list;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8073e().getMessageTypes().get(0);
        f8369a = descriptor;
        f8370b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandRecord", "AudioRecord", "TouchSourceRecord", "MatrixSourceRecord", "FileSourceRecord", "TextSourceRecord", "GeometrySourceRecord"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f8371c = descriptor2;
        f8372d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"FileName", "Validate"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m8073e() {
        return f8373e;
    }
}

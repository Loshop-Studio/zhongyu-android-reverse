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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzyHeader {

    /* renamed from: a */
    public static final Descriptors.Descriptor f8102a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8103b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8104c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8105d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f8106e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f8107f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f8108g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f8109h;

    /* renamed from: i */
    public static Descriptors.FileDescriptor f8110i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fHeader.proto\u001a\u0010PageRouter.proto\u001a\"enums/BackgroundLineTypeEnum.proto\"\u008d\u0003\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003\u0012\u0017\n\u0006author\u0018\u0007 \u0001(\u000b2\u0007.Author\u0012\u0012\n\nconvertUrl\u0018\b \u0001(\t\u0012\u0019\n\bprovider\u0018\t \u0003(\u000b2\u0007.Author\u0012\u001e\n\u0016defaultBackgroundColor\u0018\n \u0001(\u0005\u0012\u001b\n\u0013lastBackgroundColor\u0018\u000b \u0001(\u0005\u0012\u001f\n\nmoveConfig\u0018\f \u0001(\u000b2\u000b.MoveConfig\u0012:\n\u001bdefaultBackgroundLineConfig\u0018\r \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u000e \u0001(\u000b2\u0015.BackgroundLineConfig\"¤\u0001\n\nMoveConfig\u0012\u0010\n\bisEnable\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011verticalTranslate\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013horizontalTranslate\u0018\u0003 \u0001(\b\u0012\r\n\u0005scale\u0018\u0004 \u0001(\b\u0012\u000e\n\u0006rotate\u0018\u0005 \u0001(\b\u0012\u0016\n\u000emaxHeightTimes\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rmaxWidthTimes\u0018\u0007 \u0001(\u0005\"z\n\u0014BackgroundLineConfig\u0012\u0011\n\tlineColor\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tlineSpace\u0018\u0002 \u0001(\u0002\u0012)\n\blineType\u0018\u0003 \u0001(\u000e2\u0017.BackgroundLineTypeEnum\u0012\u0011\n\tlineWidth\u0018\u0004 \u0001(\u0002\"r\n\u0006Author\u0012\u0012\n\nauthorName\u0018\u0001 \u0001(\t\u0012\u0010\n\bschoolId\u0018\u0002 \u0001(\t\u0012\u0010\n\bauthorId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003B\u001b\n\u000ecom.zykj.boardB\tEzyHeaderb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyPageRouter.m7769e(), EzyBackgroundLineTypeEnum.m6907a()});

    public static final class Author extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final Author f8111h = new Author();

        /* renamed from: i */
        public static final Parser f8112i = new C6780a();

        /* renamed from: a */
        public volatile Object f8113a;

        /* renamed from: b */
        public volatile Object f8114b;

        /* renamed from: c */
        public volatile Object f8115c;

        /* renamed from: d */
        public volatile Object f8116d;

        /* renamed from: e */
        public long f8117e;

        /* renamed from: f */
        public long f8118f;

        /* renamed from: g */
        public byte f8119g;

        /* renamed from: com.zykj.board.EzyHeader$Author$a */
        public class C6780a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Author parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6781b c6781bM7502B = Author.m7502B();
                try {
                    c6781bM7502B.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6781bM7502B.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6781bM7502B.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6781bM7502B.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6781bM7502B.buildPartial());
                }
            }
        }

        /* renamed from: B */
        public static C6781b m7502B() {
            return f8111h.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f8108g;
        }

        public static Parser parser() {
            return f8112i;
        }

        /* renamed from: w */
        public static Author m7513w() {
            return f8111h;
        }

        /* renamed from: A */
        public String m7514A() {
            Object obj = this.f8116d;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f8116d = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C6781b newBuilderForType() {
            return m7502B();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C6781b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6781b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C6781b toBuilder() {
            return this == f8111h ? new C6781b() : new C6781b().m7535n(this);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Author)) {
                return super.equals(obj);
            }
            Author author = (Author) obj;
            return m7519v().equals(author.m7519v()) && m7522z().equals(author.m7522z()) && m7518u().equals(author.m7518u()) && m7514A().equals(author.m7514A()) && getStartTime() == author.getStartTime() && m7521y() == author.m7521y() && getUnknownFields().equals(author.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8112i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8113a) ? GeneratedMessageV3.computeStringSize(1, this.f8113a) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.f8114b)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f8114b);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8115c)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f8115c);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8116d)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f8116d);
            }
            long j10 = this.f8117e;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(5, j10);
            }
            long j11 = this.f8118f;
            if (j11 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(6, j11);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getStartTime() {
            return this.f8117e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7519v().hashCode()) * 37) + 2) * 53) + m7522z().hashCode()) * 37) + 3) * 53) + m7518u().hashCode()) * 37) + 4) * 53) + m7514A().hashCode()) * 37) + 5) * 53) + Internal.hashLong(getStartTime())) * 37) + 6) * 53) + Internal.hashLong(m7521y())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f8109h.ensureFieldAccessorsInitialized(Author.class, C6781b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8119g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8119g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Author();
        }

        /* renamed from: u */
        public String m7518u() {
            Object obj = this.f8115c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f8115c = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: v */
        public String m7519v() {
            Object obj = this.f8113a;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f8113a = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f8113a)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8113a);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8114b)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f8114b);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8115c)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f8115c);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8116d)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f8116d);
            }
            long j10 = this.f8117e;
            if (j10 != 0) {
                codedOutputStream.writeInt64(5, j10);
            }
            long j11 = this.f8118f;
            if (j11 != 0) {
                codedOutputStream.writeInt64(6, j11);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Author getDefaultInstanceForType() {
            return f8111h;
        }

        /* renamed from: y */
        public long m7521y() {
            return this.f8118f;
        }

        /* renamed from: z */
        public String m7522z() {
            Object obj = this.f8114b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f8114b = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: com.zykj.board.EzyHeader$Author$b */
        public static final class C6781b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8120a;

            /* renamed from: b */
            public Object f8121b;

            /* renamed from: c */
            public Object f8122c;

            /* renamed from: d */
            public Object f8123d;

            /* renamed from: e */
            public Object f8124e;

            /* renamed from: f */
            public long f8125f;

            /* renamed from: g */
            public long f8126g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6781b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6781b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Author build() {
                Author authorBuildPartial = buildPartial();
                if (authorBuildPartial.isInitialized()) {
                    return authorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) authorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Author buildPartial() {
                Author author = new Author(this);
                if (this.f8120a != 0) {
                    m7527e(author);
                }
                onBuilt();
                return author;
            }

            /* renamed from: e */
            public final void m7527e(Author author) {
                int i10 = this.f8120a;
                if ((i10 & 1) != 0) {
                    author.f8113a = this.f8121b;
                }
                if ((i10 & 2) != 0) {
                    author.f8114b = this.f8122c;
                }
                if ((i10 & 4) != 0) {
                    author.f8115c = this.f8123d;
                }
                if ((i10 & 8) != 0) {
                    author.f8116d = this.f8124e;
                }
                if ((i10 & 16) != 0) {
                    author.f8117e = this.f8125f;
                }
                if ((i10 & 32) != 0) {
                    author.f8118f = this.f8126g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6781b clear() {
                super.clear();
                this.f8120a = 0;
                this.f8121b = "";
                this.f8122c = "";
                this.f8123d = "";
                this.f8124e = "";
                this.f8125f = 0L;
                this.f8126g = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6781b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6781b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f8108g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6781b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6781b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6781b mo24228clone() {
                return (C6781b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f8109h.ensureFieldAccessorsInitialized(Author.class, C6781b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Author getDefaultInstanceForType() {
                return Author.m7513w();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6781b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f8121b = codedInputStream.readStringRequireUtf8();
                                    this.f8120a |= 1;
                                } else if (tag == 18) {
                                    this.f8122c = codedInputStream.readStringRequireUtf8();
                                    this.f8120a |= 2;
                                } else if (tag == 26) {
                                    this.f8123d = codedInputStream.readStringRequireUtf8();
                                    this.f8120a |= 4;
                                } else if (tag == 34) {
                                    this.f8124e = codedInputStream.readStringRequireUtf8();
                                    this.f8120a |= 8;
                                } else if (tag == 40) {
                                    this.f8125f = codedInputStream.readInt64();
                                    this.f8120a |= 16;
                                } else if (tag == 48) {
                                    this.f8126g = codedInputStream.readInt64();
                                    this.f8120a |= 32;
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
            public C6781b mergeFrom(Message message) {
                if (message instanceof Author) {
                    return m7535n((Author) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6781b m7535n(Author author) {
                if (author == Author.m7513w()) {
                    return this;
                }
                if (!author.m7519v().isEmpty()) {
                    this.f8121b = author.f8113a;
                    this.f8120a |= 1;
                    onChanged();
                }
                if (!author.m7522z().isEmpty()) {
                    this.f8122c = author.f8114b;
                    this.f8120a |= 2;
                    onChanged();
                }
                if (!author.m7518u().isEmpty()) {
                    this.f8123d = author.f8115c;
                    this.f8120a |= 4;
                    onChanged();
                }
                if (!author.m7514A().isEmpty()) {
                    this.f8124e = author.f8116d;
                    this.f8120a |= 8;
                    onChanged();
                }
                if (author.getStartTime() != 0) {
                    m7540t(author.getStartTime());
                }
                if (author.m7521y() != 0) {
                    m7537q(author.m7521y());
                }
                mergeUnknownFields(author.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6781b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6781b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C6781b m7537q(long j10) {
                this.f8126g = j10;
                this.f8120a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6781b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6781b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C6781b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6781b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: t */
            public C6781b m7540t(long j10) {
                this.f8125f = j10;
                this.f8120a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C6781b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6781b) super.setUnknownFields(unknownFieldSet);
            }

            public C6781b() {
                this.f8121b = "";
                this.f8122c = "";
                this.f8123d = "";
                this.f8124e = "";
            }

            public C6781b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8121b = "";
                this.f8122c = "";
                this.f8123d = "";
                this.f8124e = "";
            }
        }

        public Author(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8113a = "";
            this.f8114b = "";
            this.f8115c = "";
            this.f8116d = "";
            this.f8117e = 0L;
            this.f8118f = 0L;
            this.f8119g = (byte) -1;
        }

        private Author() {
            this.f8113a = "";
            this.f8114b = "";
            this.f8115c = "";
            this.f8116d = "";
            this.f8117e = 0L;
            this.f8118f = 0L;
            this.f8119g = (byte) -1;
            this.f8113a = "";
            this.f8114b = "";
            this.f8115c = "";
            this.f8116d = "";
        }
    }

    public static final class BackgroundLineConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final BackgroundLineConfig f8127f = new BackgroundLineConfig();

        /* renamed from: g */
        public static final Parser f8128g = new C6782a();

        /* renamed from: a */
        public int f8129a;

        /* renamed from: b */
        public float f8130b;

        /* renamed from: c */
        public int f8131c;

        /* renamed from: d */
        public float f8132d;

        /* renamed from: e */
        public byte f8133e;

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$a */
        public class C6782a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6783b c6783bM7548w = BackgroundLineConfig.m7548w();
                try {
                    c6783bM7548w.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6783bM7548w.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6783bM7548w.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6783bM7548w.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6783bM7548w.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f8106e;
        }

        /* renamed from: o */
        public static BackgroundLineConfig m7547o() {
            return f8127f;
        }

        /* renamed from: w */
        public static C6783b m7548w() {
            return f8127f.toBuilder();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BackgroundLineConfig)) {
                return super.equals(obj);
            }
            BackgroundLineConfig backgroundLineConfig = (BackgroundLineConfig) obj;
            return m7550r() == backgroundLineConfig.m7550r() && Float.floatToIntBits(m7551s()) == Float.floatToIntBits(backgroundLineConfig.m7551s()) && this.f8131c == backgroundLineConfig.f8131c && Float.floatToIntBits(m7554v()) == Float.floatToIntBits(backgroundLineConfig.m7554v()) && getUnknownFields().equals(backgroundLineConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8128g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f8129a;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            if (Float.floatToRawIntBits(this.f8130b) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(2, this.f8130b);
            }
            if (this.f8131c != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f8131c);
            }
            if (Float.floatToRawIntBits(this.f8132d) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(4, this.f8132d);
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7550r()) * 37) + 2) * 53) + Float.floatToIntBits(m7551s())) * 37) + 3) * 53) + this.f8131c) * 37) + 4) * 53) + Float.floatToIntBits(m7554v())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f8107f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C6783b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8133e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8133e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BackgroundLineConfig();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public BackgroundLineConfig getDefaultInstanceForType() {
            return f8127f;
        }

        /* renamed from: r */
        public int m7550r() {
            return this.f8129a;
        }

        /* renamed from: s */
        public float m7551s() {
            return this.f8130b;
        }

        /* renamed from: t */
        public EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m7552t() {
            EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM6909f = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m6909f(this.f8131c);
            return backgroundLineTypeEnumM6909f == null ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.UNRECOGNIZED : backgroundLineTypeEnumM6909f;
        }

        /* renamed from: u */
        public int m7553u() {
            return this.f8131c;
        }

        /* renamed from: v */
        public float m7554v() {
            return this.f8132d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i10 = this.f8129a;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            if (Float.floatToRawIntBits(this.f8130b) != 0) {
                codedOutputStream.writeFloat(2, this.f8130b);
            }
            if (this.f8131c != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                codedOutputStream.writeEnum(3, this.f8131c);
            }
            if (Float.floatToRawIntBits(this.f8132d) != 0) {
                codedOutputStream.writeFloat(4, this.f8132d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C6783b newBuilderForType() {
            return m7548w();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C6783b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6783b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public C6783b toBuilder() {
            return this == f8127f ? new C6783b() : new C6783b().m7570n(this);
        }

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$b */
        public static final class C6783b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8134a;

            /* renamed from: b */
            public int f8135b;

            /* renamed from: c */
            public float f8136c;

            /* renamed from: d */
            public int f8137d;

            /* renamed from: e */
            public float f8138e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6783b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6783b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig build() {
                BackgroundLineConfig backgroundLineConfigBuildPartial = buildPartial();
                if (backgroundLineConfigBuildPartial.isInitialized()) {
                    return backgroundLineConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) backgroundLineConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig buildPartial() {
                BackgroundLineConfig backgroundLineConfig = new BackgroundLineConfig(this);
                if (this.f8134a != 0) {
                    m7562e(backgroundLineConfig);
                }
                onBuilt();
                return backgroundLineConfig;
            }

            /* renamed from: e */
            public final void m7562e(BackgroundLineConfig backgroundLineConfig) {
                int i10 = this.f8134a;
                if ((i10 & 1) != 0) {
                    backgroundLineConfig.f8129a = this.f8135b;
                }
                if ((i10 & 2) != 0) {
                    backgroundLineConfig.f8130b = this.f8136c;
                }
                if ((i10 & 4) != 0) {
                    backgroundLineConfig.f8131c = this.f8137d;
                }
                if ((i10 & 8) != 0) {
                    backgroundLineConfig.f8132d = this.f8138e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6783b clear() {
                super.clear();
                this.f8134a = 0;
                this.f8135b = 0;
                this.f8136c = 0.0f;
                this.f8137d = 0;
                this.f8138e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6783b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6783b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f8106e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6783b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6783b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6783b mo24228clone() {
                return (C6783b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f8107f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C6783b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig getDefaultInstanceForType() {
                return BackgroundLineConfig.m7547o();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6783b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f8135b = codedInputStream.readInt32();
                                    this.f8134a |= 1;
                                } else if (tag == 21) {
                                    this.f8136c = codedInputStream.readFloat();
                                    this.f8134a |= 2;
                                } else if (tag == 24) {
                                    this.f8137d = codedInputStream.readEnum();
                                    this.f8134a |= 4;
                                } else if (tag == 37) {
                                    this.f8138e = codedInputStream.readFloat();
                                    this.f8134a |= 8;
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
            public C6783b mergeFrom(Message message) {
                if (message instanceof BackgroundLineConfig) {
                    return m7570n((BackgroundLineConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6783b m7570n(BackgroundLineConfig backgroundLineConfig) {
                if (backgroundLineConfig == BackgroundLineConfig.m7547o()) {
                    return this;
                }
                if (backgroundLineConfig.m7550r() != 0) {
                    m7573r(backgroundLineConfig.m7550r());
                }
                if (backgroundLineConfig.m7551s() != 0.0f) {
                    m7574s(backgroundLineConfig.m7551s());
                }
                if (backgroundLineConfig.f8131c != 0) {
                    m7576u(backgroundLineConfig.m7553u());
                }
                if (backgroundLineConfig.m7554v() != 0.0f) {
                    m7577v(backgroundLineConfig.m7554v());
                }
                mergeUnknownFields(backgroundLineConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6783b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6783b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6783b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6783b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C6783b m7573r(int i10) {
                this.f8135b = i10;
                this.f8134a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C6783b m7574s(float f10) {
                this.f8136c = f10;
                this.f8134a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C6783b m7575t(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
                backgroundLineTypeEnum.getClass();
                this.f8134a |= 4;
                this.f8137d = backgroundLineTypeEnum.getNumber();
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C6783b m7576u(int i10) {
                this.f8137d = i10;
                this.f8134a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C6783b m7577v(float f10) {
                this.f8138e = f10;
                this.f8134a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C6783b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6783b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C6783b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6783b) super.setUnknownFields(unknownFieldSet);
            }

            public C6783b() {
                this.f8137d = 0;
            }

            public C6783b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8137d = 0;
            }
        }

        public BackgroundLineConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8129a = 0;
            this.f8130b = 0.0f;
            this.f8131c = 0;
            this.f8132d = 0.0f;
            this.f8133e = (byte) -1;
        }

        private BackgroundLineConfig() {
            this.f8129a = 0;
            this.f8130b = 0.0f;
            this.f8132d = 0.0f;
            this.f8133e = (byte) -1;
            this.f8131c = 0;
        }
    }

    public static final class Header extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: q */
        public static final Header f8139q = new Header();

        /* renamed from: r */
        public static final Parser f8140r = new C6784a();

        /* renamed from: a */
        public int f8141a;

        /* renamed from: b */
        public int f8142b;

        /* renamed from: c */
        public int f8143c;

        /* renamed from: d */
        public int f8144d;

        /* renamed from: e */
        public long f8145e;

        /* renamed from: f */
        public long f8146f;

        /* renamed from: g */
        public long f8147g;

        /* renamed from: h */
        public Author f8148h;

        /* renamed from: i */
        public volatile Object f8149i;

        /* renamed from: j */
        public List f8150j;

        /* renamed from: k */
        public int f8151k;

        /* renamed from: l */
        public int f8152l;

        /* renamed from: m */
        public MoveConfig f8153m;

        /* renamed from: n */
        public BackgroundLineConfig f8154n;

        /* renamed from: o */
        public BackgroundLineConfig f8155o;

        /* renamed from: p */
        public byte f8156p;

        /* renamed from: com.zykj.board.EzyHeader$Header$a */
        public class C6784a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Header parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6785b c6785bM7583S = Header.m7583S();
                try {
                    c6785bM7583S.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6785bM7583S.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6785bM7583S.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6785bM7583S.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6785bM7583S.buildPartial());
                }
            }
        }

        /* renamed from: G */
        public static Header m7582G() {
            return f8139q;
        }

        /* renamed from: S */
        public static C6785b m7583S() {
            return f8139q.toBuilder();
        }

        /* renamed from: V */
        public static Header m7584V(InputStream inputStream) {
            return (Header) GeneratedMessageV3.parseWithIOException(f8140r, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f8102a;
        }

        /* renamed from: v */
        public static /* synthetic */ int m7596v(Header header, int i10) {
            int i11 = i10 | header.f8141a;
            header.f8141a = i11;
            return i11;
        }

        /* renamed from: C */
        public Author m7601C() {
            Author author = this.f8148h;
            return author == null ? Author.m7513w() : author;
        }

        /* renamed from: D */
        public String m7602D() {
            Object obj = this.f8149i;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f8149i = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: E */
        public int m7603E() {
            return this.f8151k;
        }

        /* renamed from: F */
        public BackgroundLineConfig m7604F() {
            BackgroundLineConfig backgroundLineConfig = this.f8154n;
            return backgroundLineConfig == null ? BackgroundLineConfig.m7547o() : backgroundLineConfig;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public Header getDefaultInstanceForType() {
            return f8139q;
        }

        /* renamed from: I */
        public long m7606I() {
            return this.f8147g;
        }

        /* renamed from: J */
        public int m7607J() {
            return this.f8152l;
        }

        /* renamed from: K */
        public BackgroundLineConfig m7608K() {
            BackgroundLineConfig backgroundLineConfig = this.f8155o;
            return backgroundLineConfig == null ? BackgroundLineConfig.m7547o() : backgroundLineConfig;
        }

        /* renamed from: L */
        public MoveConfig m7609L() {
            MoveConfig moveConfig = this.f8153m;
            return moveConfig == null ? MoveConfig.m7671r() : moveConfig;
        }

        /* renamed from: M */
        public int m7610M() {
            return this.f8150j.size();
        }

        /* renamed from: N */
        public List m7611N() {
            return this.f8150j;
        }

        /* renamed from: O */
        public boolean m7612O() {
            return (this.f8141a & 1) != 0;
        }

        /* renamed from: P */
        public boolean m7613P() {
            return (this.f8141a & 4) != 0;
        }

        /* renamed from: Q */
        public boolean m7614Q() {
            return (this.f8141a & 8) != 0;
        }

        /* renamed from: R */
        public boolean m7615R() {
            return (this.f8141a & 2) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public C6785b newBuilderForType() {
            return m7583S();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public C6785b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6785b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public C6785b toBuilder() {
            return this == f8139q ? new C6785b() : new C6785b().m7626F(this);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return super.equals(obj);
            }
            Header header = (Header) obj;
            if (getVersion() != header.getVersion() || getWidth() != header.getWidth() || getHeight() != header.getHeight() || getCreateDate() != header.getCreateDate() || getUpdateDate() != header.getUpdateDate() || m7606I() != header.m7606I() || m7612O() != header.m7612O()) {
                return false;
            }
            if ((m7612O() && !m7601C().equals(header.m7601C())) || !m7602D().equals(header.m7602D()) || !m7611N().equals(header.m7611N()) || m7603E() != header.m7603E() || m7607J() != header.m7607J() || m7615R() != header.m7615R()) {
                return false;
            }
            if ((m7615R() && !m7609L().equals(header.m7609L())) || m7613P() != header.m7613P()) {
                return false;
            }
            if ((!m7613P() || m7604F().equals(header.m7604F())) && m7614Q() == header.m7614Q()) {
                return (!m7614Q() || m7608K().equals(header.m7608K())) && getUnknownFields().equals(header.getUnknownFields());
            }
            return false;
        }

        public long getCreateDate() {
            return this.f8145e;
        }

        public int getHeight() {
            return this.f8144d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8140r;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f8142b;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.f8143c;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.f8144d;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            long j10 = this.f8145e;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j10);
            }
            long j11 = this.f8146f;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j11);
            }
            long j12 = this.f8147g;
            if (j12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j12);
            }
            if ((1 & this.f8141a) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, m7601C());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8149i)) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(8, this.f8149i);
            }
            for (int i14 = 0; i14 < this.f8150j.size(); i14++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f8150j.get(i14));
            }
            int i15 = this.f8151k;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, i15);
            }
            int i16 = this.f8152l;
            if (i16 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, i16);
            }
            if ((this.f8141a & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, m7609L());
            }
            if ((this.f8141a & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, m7604F());
            }
            if ((this.f8141a & 8) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(14, m7608K());
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getUpdateDate() {
            return this.f8146f;
        }

        public int getVersion() {
            return this.f8142b;
        }

        public int getWidth() {
            return this.f8143c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + Internal.hashLong(getCreateDate())) * 37) + 5) * 53) + Internal.hashLong(getUpdateDate())) * 37) + 6) * 53) + Internal.hashLong(m7606I());
            if (m7612O()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m7601C().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 8) * 53) + m7602D().hashCode();
            if (m7610M() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m7611N().hashCode();
            }
            int iM7603E = (((((((iHashCode2 * 37) + 10) * 53) + m7603E()) * 37) + 11) * 53) + m7607J();
            if (m7615R()) {
                iM7603E = (((iM7603E * 37) + 12) * 53) + m7609L().hashCode();
            }
            if (m7613P()) {
                iM7603E = (((iM7603E * 37) + 13) * 53) + m7604F().hashCode();
            }
            if (m7614Q()) {
                iM7603E = (((iM7603E * 37) + 14) * 53) + m7608K().hashCode();
            }
            int iHashCode3 = (iM7603E * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f8103b.ensureFieldAccessorsInitialized(Header.class, C6785b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8156p;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8156p = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Header();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i10 = this.f8142b;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.f8143c;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.f8144d;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            long j10 = this.f8145e;
            if (j10 != 0) {
                codedOutputStream.writeInt64(4, j10);
            }
            long j11 = this.f8146f;
            if (j11 != 0) {
                codedOutputStream.writeInt64(5, j11);
            }
            long j12 = this.f8147g;
            if (j12 != 0) {
                codedOutputStream.writeInt64(6, j12);
            }
            if ((this.f8141a & 1) != 0) {
                codedOutputStream.writeMessage(7, m7601C());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f8149i)) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.f8149i);
            }
            for (int i13 = 0; i13 < this.f8150j.size(); i13++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.f8150j.get(i13));
            }
            int i14 = this.f8151k;
            if (i14 != 0) {
                codedOutputStream.writeInt32(10, i14);
            }
            int i15 = this.f8152l;
            if (i15 != 0) {
                codedOutputStream.writeInt32(11, i15);
            }
            if ((this.f8141a & 2) != 0) {
                codedOutputStream.writeMessage(12, m7609L());
            }
            if ((this.f8141a & 4) != 0) {
                codedOutputStream.writeMessage(13, m7604F());
            }
            if ((this.f8141a & 8) != 0) {
                codedOutputStream.writeMessage(14, m7608K());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyHeader$Header$b */
        public static final class C6785b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8157a;

            /* renamed from: b */
            public int f8158b;

            /* renamed from: c */
            public int f8159c;

            /* renamed from: d */
            public int f8160d;

            /* renamed from: e */
            public long f8161e;

            /* renamed from: f */
            public long f8162f;

            /* renamed from: g */
            public long f8163g;

            /* renamed from: h */
            public Author f8164h;

            /* renamed from: i */
            public SingleFieldBuilderV3 f8165i;

            /* renamed from: j */
            public Object f8166j;

            /* renamed from: k */
            public List f8167k;

            /* renamed from: l */
            public RepeatedFieldBuilderV3 f8168l;

            /* renamed from: m */
            public int f8169m;

            /* renamed from: n */
            public int f8170n;

            /* renamed from: o */
            public MoveConfig f8171o;

            /* renamed from: p */
            public SingleFieldBuilderV3 f8172p;

            /* renamed from: q */
            public BackgroundLineConfig f8173q;

            /* renamed from: r */
            public SingleFieldBuilderV3 f8174r;

            /* renamed from: s */
            public BackgroundLineConfig f8175s;

            /* renamed from: t */
            public SingleFieldBuilderV3 f8176t;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m7653p();
                    m7621A();
                    m7662z();
                    m7656s();
                    m7620w();
                }
            }

            /* renamed from: w */
            private SingleFieldBuilderV3 m7620w() {
                if (this.f8176t == null) {
                    this.f8176t = new SingleFieldBuilderV3(m7658u(), getParentForChildren(), isClean());
                    this.f8175s = null;
                }
                return this.f8176t;
            }

            /* renamed from: A */
            public final RepeatedFieldBuilderV3 m7621A() {
                if (this.f8168l == null) {
                    this.f8168l = new RepeatedFieldBuilderV3(this.f8167k, (this.f8157a & 256) != 0, getParentForChildren(), isClean());
                    this.f8167k = null;
                }
                return this.f8168l;
            }

            /* renamed from: B */
            public C6785b m7622B(Author author) {
                Author author2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8165i;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(author);
                } else if ((this.f8157a & 64) == 0 || (author2 = this.f8164h) == null || author2 == Author.m7513w()) {
                    this.f8164h = author;
                } else {
                    m7652n().m7535n(author);
                }
                if (this.f8164h != null) {
                    this.f8157a |= 64;
                    onChanged();
                }
                return this;
            }

            /* renamed from: C */
            public C6785b m7623C(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8174r;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f8157a & 4096) == 0 || (backgroundLineConfig2 = this.f8173q) == null || backgroundLineConfig2 == BackgroundLineConfig.m7547o()) {
                    this.f8173q = backgroundLineConfig;
                } else {
                    m7655r().m7570n(backgroundLineConfig);
                }
                if (this.f8173q != null) {
                    this.f8157a |= 4096;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public C6785b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z9 = true;
                                case 8:
                                    this.f8158b = codedInputStream.readInt32();
                                    this.f8157a |= 1;
                                case 16:
                                    this.f8159c = codedInputStream.readInt32();
                                    this.f8157a |= 2;
                                case 24:
                                    this.f8160d = codedInputStream.readInt32();
                                    this.f8157a |= 4;
                                case 32:
                                    this.f8161e = codedInputStream.readInt64();
                                    this.f8157a |= 8;
                                case 40:
                                    this.f8162f = codedInputStream.readInt64();
                                    this.f8157a |= 16;
                                case 48:
                                    this.f8163g = codedInputStream.readInt64();
                                    this.f8157a |= 32;
                                case 58:
                                    codedInputStream.readMessage(m7653p().getBuilder(), extensionRegistryLite);
                                    this.f8157a |= 64;
                                case 66:
                                    this.f8166j = codedInputStream.readStringRequireUtf8();
                                    this.f8157a |= 128;
                                case 74:
                                    Author author = (Author) codedInputStream.readMessage(Author.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8168l;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m7650l();
                                        this.f8167k.add(author);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(author);
                                    }
                                case 80:
                                    this.f8169m = codedInputStream.readInt32();
                                    this.f8157a |= 512;
                                case 88:
                                    this.f8170n = codedInputStream.readInt32();
                                    this.f8157a |= 1024;
                                case 98:
                                    codedInputStream.readMessage(m7662z().getBuilder(), extensionRegistryLite);
                                    this.f8157a |= 2048;
                                case 106:
                                    codedInputStream.readMessage(m7656s().getBuilder(), extensionRegistryLite);
                                    this.f8157a |= 4096;
                                case 114:
                                    codedInputStream.readMessage(m7620w().getBuilder(), extensionRegistryLite);
                                    this.f8157a |= 8192;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z9 = true;
                                    }
                            }
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
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public C6785b mergeFrom(Message message) {
                if (message instanceof Header) {
                    return m7626F((Header) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: F */
            public C6785b m7626F(Header header) {
                if (header == Header.m7582G()) {
                    return this;
                }
                if (header.getVersion() != 0) {
                    m7639S(header.getVersion());
                }
                if (header.getWidth() != 0) {
                    m7640T(header.getWidth());
                }
                if (header.getHeight() != 0) {
                    m7634N(header.getHeight());
                }
                if (header.getCreateDate() != 0) {
                    m7630J(header.getCreateDate());
                }
                if (header.getUpdateDate() != 0) {
                    m7638R(header.getUpdateDate());
                }
                if (header.m7606I() != 0) {
                    m7632L(header.m7606I());
                }
                if (header.m7612O()) {
                    m7622B(header.m7601C());
                }
                if (!header.m7602D().isEmpty()) {
                    this.f8166j = header.f8149i;
                    this.f8157a |= 128;
                    onChanged();
                }
                if (this.f8168l == null) {
                    if (!header.f8150j.isEmpty()) {
                        if (this.f8167k.isEmpty()) {
                            this.f8167k = header.f8150j;
                            this.f8157a &= -257;
                        } else {
                            m7650l();
                            this.f8167k.addAll(header.f8150j);
                        }
                        onChanged();
                    }
                } else if (!header.f8150j.isEmpty()) {
                    if (this.f8168l.isEmpty()) {
                        this.f8168l.dispose();
                        this.f8168l = null;
                        this.f8167k = header.f8150j;
                        this.f8157a &= -257;
                        this.f8168l = GeneratedMessageV3.alwaysUseFieldBuilders ? m7621A() : null;
                    } else {
                        this.f8168l.addAllMessages(header.f8150j);
                    }
                }
                if (header.m7603E() != 0) {
                    m7631K(header.m7603E());
                }
                if (header.m7607J() != 0) {
                    m7635O(header.m7607J());
                }
                if (header.m7615R()) {
                    m7628H(header.m7609L());
                }
                if (header.m7613P()) {
                    m7623C(header.m7604F());
                }
                if (header.m7614Q()) {
                    m7627G(header.m7608K());
                }
                mergeUnknownFields(header.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: G */
            public C6785b m7627G(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8176t;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f8157a & 8192) == 0 || (backgroundLineConfig2 = this.f8175s) == null || backgroundLineConfig2 == BackgroundLineConfig.m7547o()) {
                    this.f8175s = backgroundLineConfig;
                } else {
                    m7659v().m7570n(backgroundLineConfig);
                }
                if (this.f8175s != null) {
                    this.f8157a |= 8192;
                    onChanged();
                }
                return this;
            }

            /* renamed from: H */
            public C6785b m7628H(MoveConfig moveConfig) {
                MoveConfig moveConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8172p;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(moveConfig);
                } else if ((this.f8157a & 2048) == 0 || (moveConfig2 = this.f8171o) == null || moveConfig2 == MoveConfig.m7671r()) {
                    this.f8171o = moveConfig;
                } else {
                    m7661y().m7695n(moveConfig);
                }
                if (this.f8171o != null) {
                    this.f8157a |= 2048;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public final C6785b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6785b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: J */
            public C6785b m7630J(long j10) {
                this.f8161e = j10;
                this.f8157a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: K */
            public C6785b m7631K(int i10) {
                this.f8169m = i10;
                this.f8157a |= 512;
                onChanged();
                return this;
            }

            /* renamed from: L */
            public C6785b m7632L(long j10) {
                this.f8163g = j10;
                this.f8157a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            public C6785b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6785b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: N */
            public C6785b m7634N(int i10) {
                this.f8160d = i10;
                this.f8157a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: O */
            public C6785b m7635O(int i10) {
                this.f8170n = i10;
                this.f8157a |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: P, reason: merged with bridge method [inline-methods] */
            public C6785b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6785b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final C6785b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6785b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: R */
            public C6785b m7638R(long j10) {
                this.f8162f = j10;
                this.f8157a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: S */
            public C6785b m7639S(int i10) {
                this.f8158b = i10;
                this.f8157a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: T */
            public C6785b m7640T(int i10) {
                this.f8159c = i10;
                this.f8157a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6785b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6785b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Header build() {
                Header headerBuildPartial = buildPartial();
                if (headerBuildPartial.isInitialized()) {
                    return headerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Header buildPartial() {
                Header header = new Header(this);
                m7645f(header);
                if (this.f8157a != 0) {
                    m7644e(header);
                }
                onBuilt();
                return header;
            }

            /* renamed from: e */
            public final void m7644e(Header header) {
                int i10;
                int i11 = this.f8157a;
                if ((i11 & 1) != 0) {
                    header.f8142b = this.f8158b;
                }
                if ((i11 & 2) != 0) {
                    header.f8143c = this.f8159c;
                }
                if ((i11 & 4) != 0) {
                    header.f8144d = this.f8160d;
                }
                if ((i11 & 8) != 0) {
                    header.f8145e = this.f8161e;
                }
                if ((i11 & 16) != 0) {
                    header.f8146f = this.f8162f;
                }
                if ((i11 & 32) != 0) {
                    header.f8147g = this.f8163g;
                }
                if ((i11 & 64) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8165i;
                    header.f8148h = singleFieldBuilderV3 == null ? this.f8164h : (Author) singleFieldBuilderV3.build();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 128) != 0) {
                    header.f8149i = this.f8166j;
                }
                if ((i11 & 512) != 0) {
                    header.f8151k = this.f8169m;
                }
                if ((i11 & 1024) != 0) {
                    header.f8152l = this.f8170n;
                }
                if ((i11 & 2048) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8172p;
                    header.f8153m = singleFieldBuilderV32 == null ? this.f8171o : (MoveConfig) singleFieldBuilderV32.build();
                    i10 |= 2;
                }
                if ((i11 & 4096) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f8174r;
                    header.f8154n = singleFieldBuilderV33 == null ? this.f8173q : (BackgroundLineConfig) singleFieldBuilderV33.build();
                    i10 |= 4;
                }
                if ((i11 & 8192) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV34 = this.f8176t;
                    header.f8155o = singleFieldBuilderV34 == null ? this.f8175s : (BackgroundLineConfig) singleFieldBuilderV34.build();
                    i10 |= 8;
                }
                Header.m7596v(header, i10);
            }

            /* renamed from: f */
            public final void m7645f(Header header) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8168l;
                if (repeatedFieldBuilderV3 != null) {
                    header.f8150j = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8157a & 256) != 0) {
                    this.f8167k = Collections.unmodifiableList(this.f8167k);
                    this.f8157a &= -257;
                }
                header.f8150j = this.f8167k;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6785b clear() {
                super.clear();
                this.f8157a = 0;
                this.f8158b = 0;
                this.f8159c = 0;
                this.f8160d = 0;
                this.f8161e = 0L;
                this.f8162f = 0L;
                this.f8163g = 0L;
                this.f8164h = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8165i;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f8165i = null;
                }
                this.f8166j = "";
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8168l;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8167k = Collections.EMPTY_LIST;
                } else {
                    this.f8167k = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8157a &= -257;
                this.f8169m = 0;
                this.f8170n = 0;
                this.f8171o = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8172p;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f8172p = null;
                }
                this.f8173q = null;
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f8174r;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.dispose();
                    this.f8174r = null;
                }
                this.f8175s = null;
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.f8176t;
                if (singleFieldBuilderV34 != null) {
                    singleFieldBuilderV34.dispose();
                    this.f8176t = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f8102a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6785b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6785b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6785b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6785b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f8103b.ensureFieldAccessorsInitialized(Header.class, C6785b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6785b mo24228clone() {
                return (C6785b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m7650l() {
                if ((this.f8157a & 256) == 0) {
                    this.f8167k = new ArrayList(this.f8167k);
                    this.f8157a |= 256;
                }
            }

            /* renamed from: m */
            public Author m7651m() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8165i;
                if (singleFieldBuilderV3 != null) {
                    return (Author) singleFieldBuilderV3.getMessage();
                }
                Author author = this.f8164h;
                return author == null ? Author.m7513w() : author;
            }

            /* renamed from: n */
            public Author.C6781b m7652n() {
                this.f8157a |= 64;
                onChanged();
                return (Author.C6781b) m7653p().getBuilder();
            }

            /* renamed from: p */
            public final SingleFieldBuilderV3 m7653p() {
                if (this.f8165i == null) {
                    this.f8165i = new SingleFieldBuilderV3(m7651m(), getParentForChildren(), isClean());
                    this.f8164h = null;
                }
                return this.f8165i;
            }

            /* renamed from: q */
            public BackgroundLineConfig m7654q() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8174r;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f8173q;
                return backgroundLineConfig == null ? BackgroundLineConfig.m7547o() : backgroundLineConfig;
            }

            /* renamed from: r */
            public BackgroundLineConfig.C6783b m7655r() {
                this.f8157a |= 4096;
                onChanged();
                return (BackgroundLineConfig.C6783b) m7656s().getBuilder();
            }

            /* renamed from: s */
            public final SingleFieldBuilderV3 m7656s() {
                if (this.f8174r == null) {
                    this.f8174r = new SingleFieldBuilderV3(m7654q(), getParentForChildren(), isClean());
                    this.f8173q = null;
                }
                return this.f8174r;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public Header getDefaultInstanceForType() {
                return Header.m7582G();
            }

            /* renamed from: u */
            public BackgroundLineConfig m7658u() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8176t;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f8175s;
                return backgroundLineConfig == null ? BackgroundLineConfig.m7547o() : backgroundLineConfig;
            }

            /* renamed from: v */
            public BackgroundLineConfig.C6783b m7659v() {
                this.f8157a |= 8192;
                onChanged();
                return (BackgroundLineConfig.C6783b) m7620w().getBuilder();
            }

            /* renamed from: x */
            public MoveConfig m7660x() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8172p;
                if (singleFieldBuilderV3 != null) {
                    return (MoveConfig) singleFieldBuilderV3.getMessage();
                }
                MoveConfig moveConfig = this.f8171o;
                return moveConfig == null ? MoveConfig.m7671r() : moveConfig;
            }

            /* renamed from: y */
            public MoveConfig.C6787b m7661y() {
                this.f8157a |= 2048;
                onChanged();
                return (MoveConfig.C6787b) m7662z().getBuilder();
            }

            /* renamed from: z */
            public final SingleFieldBuilderV3 m7662z() {
                if (this.f8172p == null) {
                    this.f8172p = new SingleFieldBuilderV3(m7660x(), getParentForChildren(), isClean());
                    this.f8171o = null;
                }
                return this.f8172p;
            }

            public C6785b() {
                this.f8166j = "";
                this.f8167k = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public C6785b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8166j = "";
                this.f8167k = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        public Header(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8142b = 0;
            this.f8143c = 0;
            this.f8144d = 0;
            this.f8145e = 0L;
            this.f8146f = 0L;
            this.f8147g = 0L;
            this.f8149i = "";
            this.f8151k = 0;
            this.f8152l = 0;
            this.f8156p = (byte) -1;
        }

        private Header() {
            this.f8142b = 0;
            this.f8143c = 0;
            this.f8144d = 0;
            this.f8145e = 0L;
            this.f8146f = 0L;
            this.f8147g = 0L;
            this.f8149i = "";
            this.f8151k = 0;
            this.f8152l = 0;
            this.f8156p = (byte) -1;
            this.f8149i = "";
            this.f8150j = Collections.EMPTY_LIST;
        }
    }

    public static final class MoveConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final MoveConfig f8177i = new MoveConfig();

        /* renamed from: j */
        public static final Parser f8178j = new C6786a();

        /* renamed from: a */
        public boolean f8179a;

        /* renamed from: b */
        public boolean f8180b;

        /* renamed from: c */
        public boolean f8181c;

        /* renamed from: d */
        public boolean f8182d;

        /* renamed from: e */
        public boolean f8183e;

        /* renamed from: f */
        public int f8184f;

        /* renamed from: g */
        public int f8185g;

        /* renamed from: h */
        public byte f8186h;

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$a */
        public class C6786a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MoveConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6787b c6787bM7663A = MoveConfig.m7663A();
                try {
                    c6787bM7663A.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6787bM7663A.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6787bM7663A.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6787bM7663A.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6787bM7663A.buildPartial());
                }
            }
        }

        /* renamed from: A */
        public static C6787b m7663A() {
            return f8177i.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f8104c;
        }

        /* renamed from: r */
        public static MoveConfig m7671r() {
            return f8177i;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public C6787b newBuilderForType() {
            return m7663A();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C6787b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6787b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C6787b toBuilder() {
            return this == f8177i ? new C6787b() : new C6787b().m7695n(this);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MoveConfig)) {
                return super.equals(obj);
            }
            MoveConfig moveConfig = (MoveConfig) obj;
            return m7677u() == moveConfig.m7677u() && m7682z() == moveConfig.m7682z() && m7676t() == moveConfig.m7676t() && m7681y() == moveConfig.m7681y() && m7680x() == moveConfig.m7680x() && m7678v() == moveConfig.m7678v() && m7679w() == moveConfig.m7679w() && getUnknownFields().equals(moveConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8178j;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            boolean z9 = this.f8179a;
            int iComputeBoolSize = z9 ? CodedOutputStream.computeBoolSize(1, z9) : 0;
            boolean z10 = this.f8180b;
            if (z10) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z10);
            }
            boolean z11 = this.f8181c;
            if (z11) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, z11);
            }
            boolean z12 = this.f8182d;
            if (z12) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, z12);
            }
            boolean z13 = this.f8183e;
            if (z13) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, z13);
            }
            int i11 = this.f8184f;
            if (i11 != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(6, i11);
            }
            int i12 = this.f8185g;
            if (i12 != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(7, i12);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(m7677u())) * 37) + 2) * 53) + Internal.hashBoolean(m7682z())) * 37) + 3) * 53) + Internal.hashBoolean(m7676t())) * 37) + 4) * 53) + Internal.hashBoolean(m7681y())) * 37) + 5) * 53) + Internal.hashBoolean(m7680x())) * 37) + 6) * 53) + m7678v()) * 37) + 7) * 53) + m7679w()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f8105d.ensureFieldAccessorsInitialized(MoveConfig.class, C6787b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8186h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8186h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MoveConfig();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public MoveConfig getDefaultInstanceForType() {
            return f8177i;
        }

        /* renamed from: t */
        public boolean m7676t() {
            return this.f8181c;
        }

        /* renamed from: u */
        public boolean m7677u() {
            return this.f8179a;
        }

        /* renamed from: v */
        public int m7678v() {
            return this.f8184f;
        }

        /* renamed from: w */
        public int m7679w() {
            return this.f8185g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z9 = this.f8179a;
            if (z9) {
                codedOutputStream.writeBool(1, z9);
            }
            boolean z10 = this.f8180b;
            if (z10) {
                codedOutputStream.writeBool(2, z10);
            }
            boolean z11 = this.f8181c;
            if (z11) {
                codedOutputStream.writeBool(3, z11);
            }
            boolean z12 = this.f8182d;
            if (z12) {
                codedOutputStream.writeBool(4, z12);
            }
            boolean z13 = this.f8183e;
            if (z13) {
                codedOutputStream.writeBool(5, z13);
            }
            int i10 = this.f8184f;
            if (i10 != 0) {
                codedOutputStream.writeInt32(6, i10);
            }
            int i11 = this.f8185g;
            if (i11 != 0) {
                codedOutputStream.writeInt32(7, i11);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: x */
        public boolean m7680x() {
            return this.f8183e;
        }

        /* renamed from: y */
        public boolean m7681y() {
            return this.f8182d;
        }

        /* renamed from: z */
        public boolean m7682z() {
            return this.f8180b;
        }

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$b */
        public static final class C6787b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8187a;

            /* renamed from: b */
            public boolean f8188b;

            /* renamed from: c */
            public boolean f8189c;

            /* renamed from: d */
            public boolean f8190d;

            /* renamed from: e */
            public boolean f8191e;

            /* renamed from: f */
            public boolean f8192f;

            /* renamed from: g */
            public int f8193g;

            /* renamed from: h */
            public int f8194h;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6787b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6787b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public MoveConfig build() {
                MoveConfig moveConfigBuildPartial = buildPartial();
                if (moveConfigBuildPartial.isInitialized()) {
                    return moveConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) moveConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public MoveConfig buildPartial() {
                MoveConfig moveConfig = new MoveConfig(this);
                if (this.f8187a != 0) {
                    m7687e(moveConfig);
                }
                onBuilt();
                return moveConfig;
            }

            /* renamed from: e */
            public final void m7687e(MoveConfig moveConfig) {
                int i10 = this.f8187a;
                if ((i10 & 1) != 0) {
                    moveConfig.f8179a = this.f8188b;
                }
                if ((i10 & 2) != 0) {
                    moveConfig.f8180b = this.f8189c;
                }
                if ((i10 & 4) != 0) {
                    moveConfig.f8181c = this.f8190d;
                }
                if ((i10 & 8) != 0) {
                    moveConfig.f8182d = this.f8191e;
                }
                if ((i10 & 16) != 0) {
                    moveConfig.f8183e = this.f8192f;
                }
                if ((i10 & 32) != 0) {
                    moveConfig.f8184f = this.f8193g;
                }
                if ((i10 & 64) != 0) {
                    moveConfig.f8185g = this.f8194h;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6787b clear() {
                super.clear();
                this.f8187a = 0;
                this.f8188b = false;
                this.f8189c = false;
                this.f8190d = false;
                this.f8191e = false;
                this.f8192f = false;
                this.f8193g = 0;
                this.f8194h = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6787b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6787b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f8104c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6787b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6787b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6787b mo24228clone() {
                return (C6787b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f8105d.ensureFieldAccessorsInitialized(MoveConfig.class, C6787b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public MoveConfig getDefaultInstanceForType() {
                return MoveConfig.m7671r();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C6787b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f8188b = codedInputStream.readBool();
                                    this.f8187a |= 1;
                                } else if (tag == 16) {
                                    this.f8189c = codedInputStream.readBool();
                                    this.f8187a |= 2;
                                } else if (tag == 24) {
                                    this.f8190d = codedInputStream.readBool();
                                    this.f8187a |= 4;
                                } else if (tag == 32) {
                                    this.f8191e = codedInputStream.readBool();
                                    this.f8187a |= 8;
                                } else if (tag == 40) {
                                    this.f8192f = codedInputStream.readBool();
                                    this.f8187a |= 16;
                                } else if (tag == 48) {
                                    this.f8193g = codedInputStream.readInt32();
                                    this.f8187a |= 32;
                                } else if (tag == 56) {
                                    this.f8194h = codedInputStream.readInt32();
                                    this.f8187a |= 64;
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
            public C6787b mergeFrom(Message message) {
                if (message instanceof MoveConfig) {
                    return m7695n((MoveConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C6787b m7695n(MoveConfig moveConfig) {
                if (moveConfig == MoveConfig.m7671r()) {
                    return this;
                }
                if (moveConfig.m7677u()) {
                    m7699s(moveConfig.m7677u());
                }
                if (moveConfig.m7682z()) {
                    m7706z(moveConfig.m7682z());
                }
                if (moveConfig.m7676t()) {
                    m7698r(moveConfig.m7676t());
                }
                if (moveConfig.m7681y()) {
                    m7704x(moveConfig.m7681y());
                }
                if (moveConfig.m7680x()) {
                    m7703w(moveConfig.m7680x());
                }
                if (moveConfig.m7678v() != 0) {
                    m7700t(moveConfig.m7678v());
                }
                if (moveConfig.m7679w() != 0) {
                    m7701u(moveConfig.m7679w());
                }
                mergeUnknownFields(moveConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C6787b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6787b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6787b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6787b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C6787b m7698r(boolean z9) {
                this.f8190d = z9;
                this.f8187a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C6787b m7699s(boolean z9) {
                this.f8188b = z9;
                this.f8187a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C6787b m7700t(int i10) {
                this.f8193g = i10;
                this.f8187a |= 32;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C6787b m7701u(int i10) {
                this.f8194h = i10;
                this.f8187a |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C6787b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6787b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: w */
            public C6787b m7703w(boolean z9) {
                this.f8192f = z9;
                this.f8187a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C6787b m7704x(boolean z9) {
                this.f8191e = z9;
                this.f8187a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public final C6787b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6787b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: z */
            public C6787b m7706z(boolean z9) {
                this.f8189c = z9;
                this.f8187a |= 2;
                onChanged();
                return this;
            }

            public C6787b() {
            }

            public C6787b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public MoveConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8179a = false;
            this.f8180b = false;
            this.f8181c = false;
            this.f8182d = false;
            this.f8183e = false;
            this.f8184f = 0;
            this.f8185g = 0;
            this.f8186h = (byte) -1;
        }

        private MoveConfig() {
            this.f8179a = false;
            this.f8180b = false;
            this.f8181c = false;
            this.f8182d = false;
            this.f8183e = false;
            this.f8184f = 0;
            this.f8185g = 0;
            this.f8186h = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7501i().getMessageTypes().get(0);
        f8102a = descriptor;
        f8103b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Duration", "Author", "ConvertUrl", "Provider", "DefaultBackgroundColor", "LastBackgroundColor", "MoveConfig", "DefaultBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor2 = m7501i().getMessageTypes().get(1);
        f8104c = descriptor2;
        f8105d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IsEnable", "VerticalTranslate", "HorizontalTranslate", "Scale", "Rotate", "MaxHeightTimes", "MaxWidthTimes"});
        Descriptors.Descriptor descriptor3 = m7501i().getMessageTypes().get(2);
        f8106e = descriptor3;
        f8107f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"LineColor", "LineSpace", "LineType", "LineWidth"});
        Descriptors.Descriptor descriptor4 = m7501i().getMessageTypes().get(3);
        f8108g = descriptor4;
        f8109h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AuthorName", "SchoolId", "AuthorId", "Url", "StartTime", "Duration"});
        EzyPageRouter.m7769e();
        EzyBackgroundLineTypeEnum.m6907a();
    }

    /* renamed from: i */
    public static Descriptors.FileDescriptor m7501i() {
        return f8110i;
    }
}

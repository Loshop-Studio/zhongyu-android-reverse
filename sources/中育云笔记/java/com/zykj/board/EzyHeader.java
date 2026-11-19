package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.taobao.sophix.PatchStatus;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public abstract class EzyHeader {

    /* renamed from: a */
    public static final Descriptors.Descriptor f18938a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f18939b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f18940c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f18941d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f18942e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f18943f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f18944g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f18945h;

    /* renamed from: i */
    public static Descriptors.FileDescriptor f18946i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fHeader.proto\u001a\u0010PageRouter.proto\u001a\"enums/BackgroundLineTypeEnum.proto\"\u008d\u0003\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003\u0012\u0017\n\u0006author\u0018\u0007 \u0001(\u000b2\u0007.Author\u0012\u0012\n\nconvertUrl\u0018\b \u0001(\t\u0012\u0019\n\bprovider\u0018\t \u0003(\u000b2\u0007.Author\u0012\u001e\n\u0016defaultBackgroundColor\u0018\n \u0001(\u0005\u0012\u001b\n\u0013lastBackgroundColor\u0018\u000b \u0001(\u0005\u0012\u001f\n\nmoveConfig\u0018\f \u0001(\u000b2\u000b.MoveConfig\u0012:\n\u001bdefaultBackgroundLineConfig\u0018\r \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u000e \u0001(\u000b2\u0015.BackgroundLineConfig\"¤\u0001\n\nMoveConfig\u0012\u0010\n\bisEnable\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011verticalTranslate\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013horizontalTranslate\u0018\u0003 \u0001(\b\u0012\r\n\u0005scale\u0018\u0004 \u0001(\b\u0012\u000e\n\u0006rotate\u0018\u0005 \u0001(\b\u0012\u0016\n\u000emaxHeightTimes\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rmaxWidthTimes\u0018\u0007 \u0001(\u0005\"z\n\u0014BackgroundLineConfig\u0012\u0011\n\tlineColor\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tlineSpace\u0018\u0002 \u0001(\u0002\u0012)\n\blineType\u0018\u0003 \u0001(\u000e2\u0017.BackgroundLineTypeEnum\u0012\u0011\n\tlineWidth\u0018\u0004 \u0001(\u0002\"r\n\u0006Author\u0012\u0012\n\nauthorName\u0018\u0001 \u0001(\t\u0012\u0010\n\bschoolId\u0018\u0002 \u0001(\t\u0012\u0010\n\bauthorId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003B\u001b\n\u000ecom.zykj.boardB\tEzyHeaderb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyPageRouter.m15513e(), EzyBackgroundLineTypeEnum.m14643a()});

    public static final class Author extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: j */
        public static final Author f18947j = new Author();

        /* renamed from: k */
        public static final Parser f18948k = new C8477a();

        /* renamed from: c */
        public volatile Object f18949c;

        /* renamed from: d */
        public volatile Object f18950d;

        /* renamed from: e */
        public volatile Object f18951e;

        /* renamed from: f */
        public volatile Object f18952f;

        /* renamed from: g */
        public long f18953g;

        /* renamed from: h */
        public long f18954h;

        /* renamed from: i */
        public byte f18955i;

        /* renamed from: com.zykj.board.EzyHeader$Author$a */
        public class C8477a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Author parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8478b c8478bM15238A = Author.m15238A();
                try {
                    c8478bM15238A.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8478bM15238A.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8478bM15238A.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8478bM15238A.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8478bM15238A.buildPartial());
                }
            }
        }

        /* renamed from: A */
        public static C8478b m15238A() {
            return f18947j.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f18944g;
        }

        public static Parser parser() {
            return f18948k;
        }

        /* renamed from: t */
        public static Author m15249t() {
            return f18947j;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C8478b newBuilderForType() {
            return m15238A();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C8478b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8478b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C8478b toBuilder() {
            return this == f18947j ? new C8478b() : new C8478b().m15271n(this);
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
            return m15254r().equals(author.m15254r()) && m15257y().equals(author.m15257y()) && m15253p().equals(author.m15253p()) && m15258z().equals(author.m15258z()) && getStartTime() == author.getStartTime() && m15256v() == author.m15256v() && getUnknownFields().equals(author.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f18948k;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f18949c) ? GeneratedMessage.computeStringSize(1, this.f18949c) : 0;
            if (!GeneratedMessage.isStringEmpty(this.f18950d)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.f18950d);
            }
            if (!GeneratedMessage.isStringEmpty(this.f18951e)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.f18951e);
            }
            if (!GeneratedMessage.isStringEmpty(this.f18952f)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.f18952f);
            }
            long j10 = this.f18953g;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(5, j10);
            }
            long j11 = this.f18954h;
            if (j11 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(6, j11);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getStartTime() {
            return this.f18953g;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m15254r().hashCode()) * 37) + 2) * 53) + m15257y().hashCode()) * 37) + 3) * 53) + m15253p().hashCode()) * 37) + 4) * 53) + m15258z().hashCode()) * 37) + 5) * 53) + Internal.hashLong(getStartTime())) * 37) + 6) * 53) + Internal.hashLong(m15256v())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f18945h.ensureFieldAccessorsInitialized(Author.class, C8478b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18955i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18955i = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Author();
        }

        /* renamed from: p */
        public String m15253p() {
            Object obj = this.f18951e;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f18951e = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: r */
        public String m15254r() {
            Object obj = this.f18949c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f18949c = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public Author getDefaultInstanceForType() {
            return f18947j;
        }

        /* renamed from: v */
        public long m15256v() {
            return this.f18954h;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!GeneratedMessage.isStringEmpty(this.f18949c)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.f18949c);
            }
            if (!GeneratedMessage.isStringEmpty(this.f18950d)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.f18950d);
            }
            if (!GeneratedMessage.isStringEmpty(this.f18951e)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.f18951e);
            }
            if (!GeneratedMessage.isStringEmpty(this.f18952f)) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.f18952f);
            }
            long j10 = this.f18953g;
            if (j10 != 0) {
                codedOutputStream.writeInt64(5, j10);
            }
            long j11 = this.f18954h;
            if (j11 != 0) {
                codedOutputStream.writeInt64(6, j11);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: y */
        public String m15257y() {
            Object obj = this.f18950d;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f18950d = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: z */
        public String m15258z() {
            Object obj = this.f18952f;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f18952f = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: com.zykj.board.EzyHeader$Author$b */
        public static final class C8478b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f18956c;

            /* renamed from: d */
            public Object f18957d;

            /* renamed from: e */
            public Object f18958e;

            /* renamed from: f */
            public Object f18959f;

            /* renamed from: g */
            public Object f18960g;

            /* renamed from: h */
            public long f18961h;

            /* renamed from: i */
            public long f18962i;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8478b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8478b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Author build() {
                Author authorBuildPartial = buildPartial();
                if (authorBuildPartial.isInitialized()) {
                    return authorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) authorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Author buildPartial() {
                Author author = new Author(this);
                if (this.f18956c != 0) {
                    m15263f(author);
                }
                onBuilt();
                return author;
            }

            /* renamed from: f */
            public final void m15263f(Author author) {
                int i10 = this.f18956c;
                if ((i10 & 1) != 0) {
                    author.f18949c = this.f18957d;
                }
                if ((i10 & 2) != 0) {
                    author.f18950d = this.f18958e;
                }
                if ((i10 & 4) != 0) {
                    author.f18951e = this.f18959f;
                }
                if ((i10 & 8) != 0) {
                    author.f18952f = this.f18960g;
                }
                if ((i10 & 16) != 0) {
                    author.f18953g = this.f18961h;
                }
                if ((i10 & 32) != 0) {
                    author.f18954h = this.f18962i;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8478b clear() {
                super.clear();
                this.f18956c = 0;
                this.f18957d = "";
                this.f18958e = "";
                this.f18959f = "";
                this.f18960g = "";
                this.f18961h = 0L;
                this.f18962i = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f18944g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8478b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8478b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8478b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8478b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f18945h.ensureFieldAccessorsInitialized(Author.class, C8478b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8478b mo33979clone() {
                return (C8478b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Author getDefaultInstanceForType() {
                return Author.m15249t();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8478b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f18957d = codedInputStream.readStringRequireUtf8();
                                    this.f18956c |= 1;
                                } else if (tag == 18) {
                                    this.f18958e = codedInputStream.readStringRequireUtf8();
                                    this.f18956c |= 2;
                                } else if (tag == 26) {
                                    this.f18959f = codedInputStream.readStringRequireUtf8();
                                    this.f18956c |= 4;
                                } else if (tag == 34) {
                                    this.f18960g = codedInputStream.readStringRequireUtf8();
                                    this.f18956c |= 8;
                                } else if (tag == 40) {
                                    this.f18961h = codedInputStream.readInt64();
                                    this.f18956c |= 16;
                                } else if (tag == 48) {
                                    this.f18962i = codedInputStream.readInt64();
                                    this.f18956c |= 32;
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
            public C8478b mergeFrom(Message message) {
                if (message instanceof Author) {
                    return m15271n((Author) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8478b m15271n(Author author) {
                if (author == Author.m15249t()) {
                    return this;
                }
                if (!author.m15254r().isEmpty()) {
                    this.f18957d = author.f18949c;
                    this.f18956c |= 1;
                    onChanged();
                }
                if (!author.m15257y().isEmpty()) {
                    this.f18958e = author.f18950d;
                    this.f18956c |= 2;
                    onChanged();
                }
                if (!author.m15253p().isEmpty()) {
                    this.f18959f = author.f18951e;
                    this.f18956c |= 4;
                    onChanged();
                }
                if (!author.m15258z().isEmpty()) {
                    this.f18960g = author.f18952f;
                    this.f18956c |= 8;
                    onChanged();
                }
                if (author.getStartTime() != 0) {
                    m15279v(author.getStartTime());
                }
                if (author.m15256v() != 0) {
                    m15275r(author.m15256v());
                }
                mergeUnknownFields(author.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8478b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8478b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: p */
            public C8478b m15273p(String str) {
                str.getClass();
                this.f18959f = str;
                this.f18956c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: q */
            public C8478b m15274q(String str) {
                str.getClass();
                this.f18957d = str;
                this.f18956c |= 1;
                onChanged();
                return this;
            }

            /* renamed from: r */
            public C8478b m15275r(long j10) {
                this.f18962i = j10;
                this.f18956c |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C8478b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8478b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C8478b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8478b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: u */
            public C8478b m15278u(String str) {
                str.getClass();
                this.f18958e = str;
                this.f18956c |= 2;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C8478b m15279v(long j10) {
                this.f18961h = j10;
                this.f18956c |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8478b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8478b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: x */
            public C8478b m15281x(String str) {
                str.getClass();
                this.f18960g = str;
                this.f18956c |= 8;
                onChanged();
                return this;
            }

            public C8478b() {
                this.f18957d = "";
                this.f18958e = "";
                this.f18959f = "";
                this.f18960g = "";
            }

            public C8478b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18957d = "";
                this.f18958e = "";
                this.f18959f = "";
                this.f18960g = "";
            }
        }

        public Author(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f18949c = "";
            this.f18950d = "";
            this.f18951e = "";
            this.f18952f = "";
            this.f18953g = 0L;
            this.f18954h = 0L;
            this.f18955i = (byte) -1;
        }

        private Author() {
            this.f18949c = "";
            this.f18950d = "";
            this.f18951e = "";
            this.f18952f = "";
            this.f18953g = 0L;
            this.f18954h = 0L;
            this.f18955i = (byte) -1;
            this.f18949c = "";
            this.f18950d = "";
            this.f18951e = "";
            this.f18952f = "";
        }
    }

    public static final class BackgroundLineConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final BackgroundLineConfig f18963h = new BackgroundLineConfig();

        /* renamed from: i */
        public static final Parser f18964i = new C8479a();

        /* renamed from: c */
        public int f18965c;

        /* renamed from: d */
        public float f18966d;

        /* renamed from: e */
        public int f18967e;

        /* renamed from: f */
        public float f18968f;

        /* renamed from: g */
        public byte f18969g;

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$a */
        public class C8479a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8480b c8480bM15288t = BackgroundLineConfig.m15288t();
                try {
                    c8480bM15288t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8480bM15288t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8480bM15288t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8480bM15288t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8480bM15288t.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static BackgroundLineConfig m15287g() {
            return f18963h;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f18942e;
        }

        /* renamed from: t */
        public static C8480b m15288t() {
            return f18963h.toBuilder();
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
            return m15290m() == backgroundLineConfig.m15290m() && Float.floatToIntBits(m15291n()) == Float.floatToIntBits(backgroundLineConfig.m15291n()) && this.f18967e == backgroundLineConfig.f18967e && Float.floatToIntBits(m15294r()) == Float.floatToIntBits(backgroundLineConfig.m15294r()) && getUnknownFields().equals(backgroundLineConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f18964i;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f18965c;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            if (Float.floatToRawIntBits(this.f18966d) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(2, this.f18966d);
            }
            if (this.f18967e != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f18967e);
            }
            if (Float.floatToRawIntBits(this.f18968f) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(4, this.f18968f);
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
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m15290m()) * 37) + 2) * 53) + Float.floatToIntBits(m15291n())) * 37) + 3) * 53) + this.f18967e) * 37) + 4) * 53) + Float.floatToIntBits(m15294r())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f18943f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C8480b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18969g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18969g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public BackgroundLineConfig getDefaultInstanceForType() {
            return f18963h;
        }

        /* renamed from: m */
        public int m15290m() {
            return this.f18965c;
        }

        /* renamed from: n */
        public float m15291n() {
            return this.f18966d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BackgroundLineConfig();
        }

        /* renamed from: o */
        public EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m15292o() {
            EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM14644a = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m14644a(this.f18967e);
            return backgroundLineTypeEnumM14644a == null ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.UNRECOGNIZED : backgroundLineTypeEnumM14644a;
        }

        /* renamed from: p */
        public int m15293p() {
            return this.f18967e;
        }

        /* renamed from: r */
        public float m15294r() {
            return this.f18968f;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C8480b newBuilderForType() {
            return m15288t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C8480b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8480b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.f18965c;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            if (Float.floatToRawIntBits(this.f18966d) != 0) {
                codedOutputStream.writeFloat(2, this.f18966d);
            }
            if (this.f18967e != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                codedOutputStream.writeEnum(3, this.f18967e);
            }
            if (Float.floatToRawIntBits(this.f18968f) != 0) {
                codedOutputStream.writeFloat(4, this.f18968f);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C8480b toBuilder() {
            return this == f18963h ? new C8480b() : new C8480b().m15310n(this);
        }

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$b */
        public static final class C8480b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f18970c;

            /* renamed from: d */
            public int f18971d;

            /* renamed from: e */
            public float f18972e;

            /* renamed from: f */
            public int f18973f;

            /* renamed from: g */
            public float f18974g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8480b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8480b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig build() {
                BackgroundLineConfig backgroundLineConfigBuildPartial = buildPartial();
                if (backgroundLineConfigBuildPartial.isInitialized()) {
                    return backgroundLineConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) backgroundLineConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig buildPartial() {
                BackgroundLineConfig backgroundLineConfig = new BackgroundLineConfig(this);
                if (this.f18970c != 0) {
                    m15302f(backgroundLineConfig);
                }
                onBuilt();
                return backgroundLineConfig;
            }

            /* renamed from: f */
            public final void m15302f(BackgroundLineConfig backgroundLineConfig) {
                int i10 = this.f18970c;
                if ((i10 & 1) != 0) {
                    backgroundLineConfig.f18965c = this.f18971d;
                }
                if ((i10 & 2) != 0) {
                    backgroundLineConfig.f18966d = this.f18972e;
                }
                if ((i10 & 4) != 0) {
                    backgroundLineConfig.f18967e = this.f18973f;
                }
                if ((i10 & 8) != 0) {
                    backgroundLineConfig.f18968f = this.f18974g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8480b clear() {
                super.clear();
                this.f18970c = 0;
                this.f18971d = 0;
                this.f18972e = 0.0f;
                this.f18973f = 0;
                this.f18974g = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f18942e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8480b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8480b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8480b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8480b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f18943f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C8480b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8480b mo33979clone() {
                return (C8480b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig getDefaultInstanceForType() {
                return BackgroundLineConfig.m15287g();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8480b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f18971d = codedInputStream.readInt32();
                                    this.f18970c |= 1;
                                } else if (tag == 21) {
                                    this.f18972e = codedInputStream.readFloat();
                                    this.f18970c |= 2;
                                } else if (tag == 24) {
                                    this.f18973f = codedInputStream.readEnum();
                                    this.f18970c |= 4;
                                } else if (tag == 37) {
                                    this.f18974g = codedInputStream.readFloat();
                                    this.f18970c |= 8;
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
            public C8480b mergeFrom(Message message) {
                if (message instanceof BackgroundLineConfig) {
                    return m15310n((BackgroundLineConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8480b m15310n(BackgroundLineConfig backgroundLineConfig) {
                if (backgroundLineConfig == BackgroundLineConfig.m15287g()) {
                    return this;
                }
                if (backgroundLineConfig.m15290m() != 0) {
                    m15313q(backgroundLineConfig.m15290m());
                }
                if (backgroundLineConfig.m15291n() != 0.0f) {
                    m15314r(backgroundLineConfig.m15291n());
                }
                if (backgroundLineConfig.f18967e != 0) {
                    m15316t(backgroundLineConfig.m15293p());
                }
                if (backgroundLineConfig.m15294r() != 0.0f) {
                    m15317u(backgroundLineConfig.m15294r());
                }
                mergeUnknownFields(backgroundLineConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8480b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8480b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8480b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8480b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: q */
            public C8480b m15313q(int i10) {
                this.f18971d = i10;
                this.f18970c |= 1;
                onChanged();
                return this;
            }

            /* renamed from: r */
            public C8480b m15314r(float f10) {
                this.f18972e = f10;
                this.f18970c |= 2;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C8480b m15315s(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
                backgroundLineTypeEnum.getClass();
                this.f18970c |= 4;
                this.f18973f = backgroundLineTypeEnum.getNumber();
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C8480b m15316t(int i10) {
                this.f18973f = i10;
                this.f18970c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C8480b m15317u(float f10) {
                this.f18974g = f10;
                this.f18970c |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8480b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8480b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8480b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8480b) super.setUnknownFields(unknownFieldSet);
            }

            public C8480b() {
                this.f18973f = 0;
            }

            public C8480b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18973f = 0;
            }
        }

        public BackgroundLineConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f18965c = 0;
            this.f18966d = 0.0f;
            this.f18967e = 0;
            this.f18968f = 0.0f;
            this.f18969g = (byte) -1;
        }

        private BackgroundLineConfig() {
            this.f18965c = 0;
            this.f18966d = 0.0f;
            this.f18968f = 0.0f;
            this.f18969g = (byte) -1;
            this.f18967e = 0;
        }
    }

    public static final class Header extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: s */
        public static final Header f18975s = new Header();

        /* renamed from: t */
        public static final Parser f18976t = new C8481a();

        /* renamed from: c */
        public int f18977c;

        /* renamed from: d */
        public int f18978d;

        /* renamed from: e */
        public int f18979e;

        /* renamed from: f */
        public int f18980f;

        /* renamed from: g */
        public long f18981g;

        /* renamed from: h */
        public long f18982h;

        /* renamed from: i */
        public long f18983i;

        /* renamed from: j */
        public Author f18984j;

        /* renamed from: k */
        public volatile Object f18985k;

        /* renamed from: l */
        public List f18986l;

        /* renamed from: m */
        public int f18987m;

        /* renamed from: n */
        public int f18988n;

        /* renamed from: o */
        public MoveConfig f18989o;

        /* renamed from: p */
        public BackgroundLineConfig f18990p;

        /* renamed from: q */
        public BackgroundLineConfig f18991q;

        /* renamed from: r */
        public byte f18992r;

        /* renamed from: com.zykj.board.EzyHeader$Header$a */
        public class C8481a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Header parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8482b c8482bM15322S = Header.m15322S();
                try {
                    c8482bM15322S.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8482bM15322S.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8482bM15322S.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8482bM15322S.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8482bM15322S.buildPartial());
                }
            }
        }

        /* renamed from: G */
        public static Header m15321G() {
            return f18975s;
        }

        /* renamed from: S */
        public static C8482b m15322S() {
            return f18975s.toBuilder();
        }

        /* renamed from: V */
        public static Header m15323V(InputStream inputStream) {
            return (Header) GeneratedMessage.parseWithIOException(f18976t, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f18938a;
        }

        /* renamed from: r */
        public static /* synthetic */ int m15335r(Header header, int i10) {
            int i11 = i10 | header.f18977c;
            header.f18977c = i11;
            return i11;
        }

        /* renamed from: C */
        public Author m15341C() {
            Author author = this.f18984j;
            return author == null ? Author.m15249t() : author;
        }

        /* renamed from: D */
        public String m15342D() {
            Object obj = this.f18985k;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f18985k = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: E */
        public int m15343E() {
            return this.f18987m;
        }

        /* renamed from: F */
        public BackgroundLineConfig m15344F() {
            BackgroundLineConfig backgroundLineConfig = this.f18990p;
            return backgroundLineConfig == null ? BackgroundLineConfig.m15287g() : backgroundLineConfig;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public Header getDefaultInstanceForType() {
            return f18975s;
        }

        /* renamed from: I */
        public long m15346I() {
            return this.f18983i;
        }

        /* renamed from: J */
        public int m15347J() {
            return this.f18988n;
        }

        /* renamed from: K */
        public BackgroundLineConfig m15348K() {
            BackgroundLineConfig backgroundLineConfig = this.f18991q;
            return backgroundLineConfig == null ? BackgroundLineConfig.m15287g() : backgroundLineConfig;
        }

        /* renamed from: L */
        public MoveConfig m15349L() {
            MoveConfig moveConfig = this.f18989o;
            return moveConfig == null ? MoveConfig.m15415m() : moveConfig;
        }

        /* renamed from: M */
        public int m15350M() {
            return this.f18986l.size();
        }

        /* renamed from: N */
        public List m15351N() {
            return this.f18986l;
        }

        /* renamed from: O */
        public boolean m15352O() {
            return (this.f18977c & 1) != 0;
        }

        /* renamed from: P */
        public boolean m15353P() {
            return (this.f18977c & 4) != 0;
        }

        /* renamed from: Q */
        public boolean m15354Q() {
            return (this.f18977c & 8) != 0;
        }

        /* renamed from: R */
        public boolean m15355R() {
            return (this.f18977c & 2) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public C8482b newBuilderForType() {
            return m15322S();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public C8482b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8482b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public C8482b toBuilder() {
            return this == f18975s ? new C8482b() : new C8482b().m15366F(this);
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
            if (getVersion() != header.getVersion() || getWidth() != header.getWidth() || getHeight() != header.getHeight() || getCreateDate() != header.getCreateDate() || getUpdateDate() != header.getUpdateDate() || m15346I() != header.m15346I() || m15352O() != header.m15352O()) {
                return false;
            }
            if ((m15352O() && !m15341C().equals(header.m15341C())) || !m15342D().equals(header.m15342D()) || !m15351N().equals(header.m15351N()) || m15343E() != header.m15343E() || m15347J() != header.m15347J() || m15355R() != header.m15355R()) {
                return false;
            }
            if ((m15355R() && !m15349L().equals(header.m15349L())) || m15353P() != header.m15353P()) {
                return false;
            }
            if ((!m15353P() || m15344F().equals(header.m15344F())) && m15354Q() == header.m15354Q()) {
                return (!m15354Q() || m15348K().equals(header.m15348K())) && getUnknownFields().equals(header.getUnknownFields());
            }
            return false;
        }

        public long getCreateDate() {
            return this.f18981g;
        }

        public int getHeight() {
            return this.f18980f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f18976t;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f18978d;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.f18979e;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.f18980f;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            long j10 = this.f18981g;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j10);
            }
            long j11 = this.f18982h;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j11);
            }
            long j12 = this.f18983i;
            if (j12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j12);
            }
            if ((1 & this.f18977c) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, m15341C());
            }
            if (!GeneratedMessage.isStringEmpty(this.f18985k)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(8, this.f18985k);
            }
            for (int i14 = 0; i14 < this.f18986l.size(); i14++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f18986l.get(i14));
            }
            int i15 = this.f18987m;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, i15);
            }
            int i16 = this.f18988n;
            if (i16 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, i16);
            }
            if ((this.f18977c & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, m15349L());
            }
            if ((this.f18977c & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, m15344F());
            }
            if ((this.f18977c & 8) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(14, m15348K());
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getUpdateDate() {
            return this.f18982h;
        }

        public int getVersion() {
            return this.f18978d;
        }

        public int getWidth() {
            return this.f18979e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + Internal.hashLong(getCreateDate())) * 37) + 5) * 53) + Internal.hashLong(getUpdateDate())) * 37) + 6) * 53) + Internal.hashLong(m15346I());
            if (m15352O()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m15341C().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 8) * 53) + m15342D().hashCode();
            if (m15350M() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m15351N().hashCode();
            }
            int iM15343E = (((((((iHashCode2 * 37) + 10) * 53) + m15343E()) * 37) + 11) * 53) + m15347J();
            if (m15355R()) {
                iM15343E = (((iM15343E * 37) + 12) * 53) + m15349L().hashCode();
            }
            if (m15353P()) {
                iM15343E = (((iM15343E * 37) + 13) * 53) + m15344F().hashCode();
            }
            if (m15354Q()) {
                iM15343E = (((iM15343E * 37) + 14) * 53) + m15348K().hashCode();
            }
            int iHashCode3 = (iM15343E * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f18939b.ensureFieldAccessorsInitialized(Header.class, C8482b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18992r;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18992r = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Header();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.f18978d;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.f18979e;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.f18980f;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            long j10 = this.f18981g;
            if (j10 != 0) {
                codedOutputStream.writeInt64(4, j10);
            }
            long j11 = this.f18982h;
            if (j11 != 0) {
                codedOutputStream.writeInt64(5, j11);
            }
            long j12 = this.f18983i;
            if (j12 != 0) {
                codedOutputStream.writeInt64(6, j12);
            }
            if ((this.f18977c & 1) != 0) {
                codedOutputStream.writeMessage(7, m15341C());
            }
            if (!GeneratedMessage.isStringEmpty(this.f18985k)) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.f18985k);
            }
            for (int i13 = 0; i13 < this.f18986l.size(); i13++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.f18986l.get(i13));
            }
            int i14 = this.f18987m;
            if (i14 != 0) {
                codedOutputStream.writeInt32(10, i14);
            }
            int i15 = this.f18988n;
            if (i15 != 0) {
                codedOutputStream.writeInt32(11, i15);
            }
            if ((this.f18977c & 2) != 0) {
                codedOutputStream.writeMessage(12, m15349L());
            }
            if ((this.f18977c & 4) != 0) {
                codedOutputStream.writeMessage(13, m15344F());
            }
            if ((this.f18977c & 8) != 0) {
                codedOutputStream.writeMessage(14, m15348K());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyHeader$Header$b */
        public static final class C8482b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f18993c;

            /* renamed from: d */
            public int f18994d;

            /* renamed from: e */
            public int f18995e;

            /* renamed from: f */
            public int f18996f;

            /* renamed from: g */
            public long f18997g;

            /* renamed from: h */
            public long f18998h;

            /* renamed from: i */
            public long f18999i;

            /* renamed from: j */
            public Author f19000j;

            /* renamed from: k */
            public SingleFieldBuilderV3 f19001k;

            /* renamed from: l */
            public Object f19002l;

            /* renamed from: m */
            public List f19003m;

            /* renamed from: n */
            public RepeatedFieldBuilderV3 f19004n;

            /* renamed from: o */
            public int f19005o;

            /* renamed from: p */
            public int f19006p;

            /* renamed from: q */
            public MoveConfig f19007q;

            /* renamed from: r */
            public SingleFieldBuilderV3 f19008r;

            /* renamed from: s */
            public BackgroundLineConfig f19009s;

            /* renamed from: t */
            public SingleFieldBuilderV3 f19010t;

            /* renamed from: u */
            public BackgroundLineConfig f19011u;

            /* renamed from: v */
            public SingleFieldBuilderV3 f19012v;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    m15398p();
                    m15361A();
                    m15407z();
                    m15401s();
                    m15360w();
                }
            }

            /* renamed from: w */
            private SingleFieldBuilderV3 m15360w() {
                if (this.f19012v == null) {
                    this.f19012v = new SingleFieldBuilderV3(m15403u(), getParentForChildren(), isClean());
                    this.f19011u = null;
                }
                return this.f19012v;
            }

            /* renamed from: A */
            public final RepeatedFieldBuilderV3 m15361A() {
                if (this.f19004n == null) {
                    this.f19004n = new RepeatedFieldBuilderV3(this.f19003m, (this.f18993c & 256) != 0, getParentForChildren(), isClean());
                    this.f19003m = null;
                }
                return this.f19004n;
            }

            /* renamed from: B */
            public C8482b m15362B(Author author) {
                Author author2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19001k;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(author);
                } else if ((this.f18993c & 64) == 0 || (author2 = this.f19000j) == null || author2 == Author.m15249t()) {
                    this.f19000j = author;
                } else {
                    m15397o().m15271n(author);
                }
                if (this.f19000j != null) {
                    this.f18993c |= 64;
                    onChanged();
                }
                return this;
            }

            /* renamed from: C */
            public C8482b m15363C(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19010t;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f18993c & 4096) == 0 || (backgroundLineConfig2 = this.f19009s) == null || backgroundLineConfig2 == BackgroundLineConfig.m15287g()) {
                    this.f19009s = backgroundLineConfig;
                } else {
                    m15400r().m15310n(backgroundLineConfig);
                }
                if (this.f19009s != null) {
                    this.f18993c |= 4096;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public C8482b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.f18994d = codedInputStream.readInt32();
                                    this.f18993c |= 1;
                                case 16:
                                    this.f18995e = codedInputStream.readInt32();
                                    this.f18993c |= 2;
                                case 24:
                                    this.f18996f = codedInputStream.readInt32();
                                    this.f18993c |= 4;
                                case 32:
                                    this.f18997g = codedInputStream.readInt64();
                                    this.f18993c |= 8;
                                case 40:
                                    this.f18998h = codedInputStream.readInt64();
                                    this.f18993c |= 16;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                    this.f18999i = codedInputStream.readInt64();
                                    this.f18993c |= 32;
                                case Opcodes.ASTORE /* 58 */:
                                    codedInputStream.readMessage(m15398p().getBuilder(), extensionRegistryLite);
                                    this.f18993c |= 64;
                                case 66:
                                    this.f19002l = codedInputStream.readStringRequireUtf8();
                                    this.f18993c |= 128;
                                case PatchStatus.CODE_LOAD_COPY_FILE /* 74 */:
                                    Author author = (Author) codedInputStream.readMessage(Author.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19004n;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m15395m();
                                        this.f19003m.add(author);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(author);
                                    }
                                case 80:
                                    this.f19005o = codedInputStream.readInt32();
                                    this.f18993c |= 512;
                                case IjkMediaMeta.FF_PROFILE_H264_EXTENDED /* 88 */:
                                    this.f19006p = codedInputStream.readInt32();
                                    this.f18993c |= 1024;
                                case 98:
                                    codedInputStream.readMessage(m15407z().getBuilder(), extensionRegistryLite);
                                    this.f18993c |= 2048;
                                case 106:
                                    codedInputStream.readMessage(m15401s().getBuilder(), extensionRegistryLite);
                                    this.f18993c |= 4096;
                                case 114:
                                    codedInputStream.readMessage(m15360w().getBuilder(), extensionRegistryLite);
                                    this.f18993c |= 8192;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z10 = true;
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
            public C8482b mergeFrom(Message message) {
                if (message instanceof Header) {
                    return m15366F((Header) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: F */
            public C8482b m15366F(Header header) {
                if (header == Header.m15321G()) {
                    return this;
                }
                if (header.getVersion() != 0) {
                    m15383W(header.getVersion());
                }
                if (header.getWidth() != 0) {
                    m15384X(header.getWidth());
                }
                if (header.getHeight() != 0) {
                    m15376P(header.getHeight());
                }
                if (header.getCreateDate() != 0) {
                    m15371K(header.getCreateDate());
                }
                if (header.getUpdateDate() != 0) {
                    m15382V(header.getUpdateDate());
                }
                if (header.m15346I() != 0) {
                    m15374N(header.m15346I());
                }
                if (header.m15352O()) {
                    m15362B(header.m15341C());
                }
                if (!header.m15342D().isEmpty()) {
                    this.f19002l = header.f18985k;
                    this.f18993c |= 128;
                    onChanged();
                }
                if (this.f19004n == null) {
                    if (!header.f18986l.isEmpty()) {
                        if (this.f19003m.isEmpty()) {
                            this.f19003m = header.f18986l;
                            this.f18993c &= -257;
                        } else {
                            m15395m();
                            this.f19003m.addAll(header.f18986l);
                        }
                        onChanged();
                    }
                } else if (!header.f18986l.isEmpty()) {
                    if (this.f19004n.isEmpty()) {
                        this.f19004n.dispose();
                        this.f19004n = null;
                        this.f19003m = header.f18986l;
                        this.f18993c &= -257;
                        this.f19004n = GeneratedMessage.alwaysUseFieldBuilders ? m15361A() : null;
                    } else {
                        this.f19004n.addAllMessages(header.f18986l);
                    }
                }
                if (header.m15343E() != 0) {
                    m15372L(header.m15343E());
                }
                if (header.m15347J() != 0) {
                    m15377Q(header.m15347J());
                }
                if (header.m15355R()) {
                    m15368H(header.m15349L());
                }
                if (header.m15353P()) {
                    m15363C(header.m15344F());
                }
                if (header.m15354Q()) {
                    m15367G(header.m15348K());
                }
                mergeUnknownFields(header.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: G */
            public C8482b m15367G(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19012v;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f18993c & 8192) == 0 || (backgroundLineConfig2 = this.f19011u) == null || backgroundLineConfig2 == BackgroundLineConfig.m15287g()) {
                    this.f19011u = backgroundLineConfig;
                } else {
                    m15404v().m15310n(backgroundLineConfig);
                }
                if (this.f19011u != null) {
                    this.f18993c |= 8192;
                    onChanged();
                }
                return this;
            }

            /* renamed from: H */
            public C8482b m15368H(MoveConfig moveConfig) {
                MoveConfig moveConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19008r;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(moveConfig);
                } else if ((this.f18993c & 2048) == 0 || (moveConfig2 = this.f19007q) == null || moveConfig2 == MoveConfig.m15415m()) {
                    this.f19007q = moveConfig;
                } else {
                    m15406y().m15440n(moveConfig);
                }
                if (this.f19007q != null) {
                    this.f18993c |= 2048;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public final C8482b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8482b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: J */
            public C8482b m15370J(Author author) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19001k;
                if (singleFieldBuilderV3 == null) {
                    author.getClass();
                    this.f19000j = author;
                } else {
                    singleFieldBuilderV3.setMessage(author);
                }
                this.f18993c |= 64;
                onChanged();
                return this;
            }

            /* renamed from: K */
            public C8482b m15371K(long j10) {
                this.f18997g = j10;
                this.f18993c |= 8;
                onChanged();
                return this;
            }

            /* renamed from: L */
            public C8482b m15372L(int i10) {
                this.f19005o = i10;
                this.f18993c |= 512;
                onChanged();
                return this;
            }

            /* renamed from: M */
            public C8482b m15373M(BackgroundLineConfig backgroundLineConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19010t;
                if (singleFieldBuilderV3 == null) {
                    backgroundLineConfig.getClass();
                    this.f19009s = backgroundLineConfig;
                } else {
                    singleFieldBuilderV3.setMessage(backgroundLineConfig);
                }
                this.f18993c |= 4096;
                onChanged();
                return this;
            }

            /* renamed from: N */
            public C8482b m15374N(long j10) {
                this.f18999i = j10;
                this.f18993c |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            public C8482b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8482b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: P */
            public C8482b m15376P(int i10) {
                this.f18996f = i10;
                this.f18993c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: Q */
            public C8482b m15377Q(int i10) {
                this.f19006p = i10;
                this.f18993c |= 1024;
                onChanged();
                return this;
            }

            /* renamed from: R */
            public C8482b m15378R(BackgroundLineConfig backgroundLineConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19012v;
                if (singleFieldBuilderV3 == null) {
                    backgroundLineConfig.getClass();
                    this.f19011u = backgroundLineConfig;
                } else {
                    singleFieldBuilderV3.setMessage(backgroundLineConfig);
                }
                this.f18993c |= 8192;
                onChanged();
                return this;
            }

            /* renamed from: S */
            public C8482b m15379S(MoveConfig moveConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19008r;
                if (singleFieldBuilderV3 == null) {
                    moveConfig.getClass();
                    this.f19007q = moveConfig;
                } else {
                    singleFieldBuilderV3.setMessage(moveConfig);
                }
                this.f18993c |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            public C8482b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8482b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            public final C8482b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8482b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: V */
            public C8482b m15382V(long j10) {
                this.f18998h = j10;
                this.f18993c |= 16;
                onChanged();
                return this;
            }

            /* renamed from: W */
            public C8482b m15383W(int i10) {
                this.f18994d = i10;
                this.f18993c |= 1;
                onChanged();
                return this;
            }

            /* renamed from: X */
            public C8482b m15384X(int i10) {
                this.f18995e = i10;
                this.f18993c |= 2;
                onChanged();
                return this;
            }

            /* renamed from: b */
            public C8482b m15385b(Author author) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19004n;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(author);
                    return this;
                }
                author.getClass();
                m15395m();
                this.f19003m.add(author);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C8482b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8482b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Header build() {
                Header headerBuildPartial = buildPartial();
                if (headerBuildPartial.isInitialized()) {
                    return headerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Header buildPartial() {
                Header header = new Header(this);
                m15390h(header);
                if (this.f18993c != 0) {
                    m15389g(header);
                }
                onBuilt();
                return header;
            }

            /* renamed from: g */
            public final void m15389g(Header header) {
                int i10;
                int i11 = this.f18993c;
                if ((i11 & 1) != 0) {
                    header.f18978d = this.f18994d;
                }
                if ((i11 & 2) != 0) {
                    header.f18979e = this.f18995e;
                }
                if ((i11 & 4) != 0) {
                    header.f18980f = this.f18996f;
                }
                if ((i11 & 8) != 0) {
                    header.f18981g = this.f18997g;
                }
                if ((i11 & 16) != 0) {
                    header.f18982h = this.f18998h;
                }
                if ((i11 & 32) != 0) {
                    header.f18983i = this.f18999i;
                }
                if ((i11 & 64) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19001k;
                    header.f18984j = singleFieldBuilderV3 == null ? this.f19000j : (Author) singleFieldBuilderV3.build();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 128) != 0) {
                    header.f18985k = this.f19002l;
                }
                if ((i11 & 512) != 0) {
                    header.f18987m = this.f19005o;
                }
                if ((i11 & 1024) != 0) {
                    header.f18988n = this.f19006p;
                }
                if ((i11 & 2048) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f19008r;
                    header.f18989o = singleFieldBuilderV32 == null ? this.f19007q : (MoveConfig) singleFieldBuilderV32.build();
                    i10 |= 2;
                }
                if ((i11 & 4096) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f19010t;
                    header.f18990p = singleFieldBuilderV33 == null ? this.f19009s : (BackgroundLineConfig) singleFieldBuilderV33.build();
                    i10 |= 4;
                }
                if ((i11 & 8192) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV34 = this.f19012v;
                    header.f18991q = singleFieldBuilderV34 == null ? this.f19011u : (BackgroundLineConfig) singleFieldBuilderV34.build();
                    i10 |= 8;
                }
                Header.m15335r(header, i10);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f18938a;
            }

            /* renamed from: h */
            public final void m15390h(Header header) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19004n;
                if (repeatedFieldBuilderV3 != null) {
                    header.f18986l = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f18993c & 256) != 0) {
                    this.f19003m = Collections.unmodifiableList(this.f19003m);
                    this.f18993c &= -257;
                }
                header.f18986l = this.f19003m;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8482b clear() {
                super.clear();
                this.f18993c = 0;
                this.f18994d = 0;
                this.f18995e = 0;
                this.f18996f = 0;
                this.f18997g = 0L;
                this.f18998h = 0L;
                this.f18999i = 0L;
                this.f19000j = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19001k;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f19001k = null;
                }
                this.f19002l = "";
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19004n;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19003m = Collections.EMPTY_LIST;
                } else {
                    this.f19003m = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f18993c &= -257;
                this.f19005o = 0;
                this.f19006p = 0;
                this.f19007q = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f19008r;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f19008r = null;
                }
                this.f19009s = null;
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f19010t;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.dispose();
                    this.f19010t = null;
                }
                this.f19011u = null;
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.f19012v;
                if (singleFieldBuilderV34 != null) {
                    singleFieldBuilderV34.dispose();
                    this.f19012v = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f18939b.ensureFieldAccessorsInitialized(Header.class, C8482b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8482b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8482b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8482b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8482b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8482b mo33979clone() {
                return (C8482b) super.m33981clone();
            }

            /* renamed from: m */
            public final void m15395m() {
                if ((this.f18993c & 256) == 0) {
                    this.f19003m = new ArrayList(this.f19003m);
                    this.f18993c |= 256;
                }
            }

            /* renamed from: n */
            public Author m15396n() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19001k;
                if (singleFieldBuilderV3 != null) {
                    return (Author) singleFieldBuilderV3.getMessage();
                }
                Author author = this.f19000j;
                return author == null ? Author.m15249t() : author;
            }

            /* renamed from: o */
            public Author.C8478b m15397o() {
                this.f18993c |= 64;
                onChanged();
                return (Author.C8478b) m15398p().getBuilder();
            }

            /* renamed from: p */
            public final SingleFieldBuilderV3 m15398p() {
                if (this.f19001k == null) {
                    this.f19001k = new SingleFieldBuilderV3(m15396n(), getParentForChildren(), isClean());
                    this.f19000j = null;
                }
                return this.f19001k;
            }

            /* renamed from: q */
            public BackgroundLineConfig m15399q() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19010t;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f19009s;
                return backgroundLineConfig == null ? BackgroundLineConfig.m15287g() : backgroundLineConfig;
            }

            /* renamed from: r */
            public BackgroundLineConfig.C8480b m15400r() {
                this.f18993c |= 4096;
                onChanged();
                return (BackgroundLineConfig.C8480b) m15401s().getBuilder();
            }

            /* renamed from: s */
            public final SingleFieldBuilderV3 m15401s() {
                if (this.f19010t == null) {
                    this.f19010t = new SingleFieldBuilderV3(m15399q(), getParentForChildren(), isClean());
                    this.f19009s = null;
                }
                return this.f19010t;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public Header getDefaultInstanceForType() {
                return Header.m15321G();
            }

            /* renamed from: u */
            public BackgroundLineConfig m15403u() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19012v;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f19011u;
                return backgroundLineConfig == null ? BackgroundLineConfig.m15287g() : backgroundLineConfig;
            }

            /* renamed from: v */
            public BackgroundLineConfig.C8480b m15404v() {
                this.f18993c |= 8192;
                onChanged();
                return (BackgroundLineConfig.C8480b) m15360w().getBuilder();
            }

            /* renamed from: x */
            public MoveConfig m15405x() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19008r;
                if (singleFieldBuilderV3 != null) {
                    return (MoveConfig) singleFieldBuilderV3.getMessage();
                }
                MoveConfig moveConfig = this.f19007q;
                return moveConfig == null ? MoveConfig.m15415m() : moveConfig;
            }

            /* renamed from: y */
            public MoveConfig.C8484b m15406y() {
                this.f18993c |= 2048;
                onChanged();
                return (MoveConfig.C8484b) m15407z().getBuilder();
            }

            /* renamed from: z */
            public final SingleFieldBuilderV3 m15407z() {
                if (this.f19008r == null) {
                    this.f19008r = new SingleFieldBuilderV3(m15405x(), getParentForChildren(), isClean());
                    this.f19007q = null;
                }
                return this.f19008r;
            }

            public C8482b() {
                this.f19002l = "";
                this.f19003m = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public C8482b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19002l = "";
                this.f19003m = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        public Header(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f18978d = 0;
            this.f18979e = 0;
            this.f18980f = 0;
            this.f18981g = 0L;
            this.f18982h = 0L;
            this.f18983i = 0L;
            this.f18985k = "";
            this.f18987m = 0;
            this.f18988n = 0;
            this.f18992r = (byte) -1;
        }

        private Header() {
            this.f18978d = 0;
            this.f18979e = 0;
            this.f18980f = 0;
            this.f18981g = 0L;
            this.f18982h = 0L;
            this.f18983i = 0L;
            this.f18985k = "";
            this.f18987m = 0;
            this.f18988n = 0;
            this.f18992r = (byte) -1;
            this.f18985k = "";
            this.f18986l = Collections.EMPTY_LIST;
        }
    }

    public static final class MoveConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: k */
        public static final MoveConfig f19013k = new MoveConfig();

        /* renamed from: l */
        public static final Parser f19014l = new C8483a();

        /* renamed from: c */
        public boolean f19015c;

        /* renamed from: d */
        public boolean f19016d;

        /* renamed from: e */
        public boolean f19017e;

        /* renamed from: f */
        public boolean f19018f;

        /* renamed from: g */
        public boolean f19019g;

        /* renamed from: h */
        public int f19020h;

        /* renamed from: i */
        public int f19021i;

        /* renamed from: j */
        public byte f19022j;

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$a */
        public class C8483a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MoveConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8484b c8484bM15416z = MoveConfig.m15416z();
                try {
                    c8484bM15416z.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8484bM15416z.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8484bM15416z.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8484bM15416z.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8484bM15416z.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f18940c;
        }

        /* renamed from: m */
        public static MoveConfig m15415m() {
            return f19013k;
        }

        /* renamed from: z */
        public static C8484b m15416z() {
            return f19013k.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C8484b newBuilderForType() {
            return m15416z();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C8484b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8484b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C8484b toBuilder() {
            return this == f19013k ? new C8484b() : new C8484b().m15440n(this);
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
            return m15422p() == moveConfig.m15422p() && m15427y() == moveConfig.m15427y() && m15421o() == moveConfig.m15421o() && m15426v() == moveConfig.m15426v() && m15425u() == moveConfig.m15425u() && m15423r() == moveConfig.m15423r() && m15424t() == moveConfig.m15424t() && getUnknownFields().equals(moveConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19014l;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            boolean z10 = this.f19015c;
            int iComputeBoolSize = z10 ? CodedOutputStream.computeBoolSize(1, z10) : 0;
            boolean z11 = this.f19016d;
            if (z11) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z11);
            }
            boolean z12 = this.f19017e;
            if (z12) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, z12);
            }
            boolean z13 = this.f19018f;
            if (z13) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, z13);
            }
            boolean z14 = this.f19019g;
            if (z14) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, z14);
            }
            int i11 = this.f19020h;
            if (i11 != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(6, i11);
            }
            int i12 = this.f19021i;
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
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(m15422p())) * 37) + 2) * 53) + Internal.hashBoolean(m15427y())) * 37) + 3) * 53) + Internal.hashBoolean(m15421o())) * 37) + 4) * 53) + Internal.hashBoolean(m15426v())) * 37) + 5) * 53) + Internal.hashBoolean(m15425u())) * 37) + 6) * 53) + m15423r()) * 37) + 7) * 53) + m15424t()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f18941d.ensureFieldAccessorsInitialized(MoveConfig.class, C8484b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19022j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19022j = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public MoveConfig getDefaultInstanceForType() {
            return f19013k;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MoveConfig();
        }

        /* renamed from: o */
        public boolean m15421o() {
            return this.f19017e;
        }

        /* renamed from: p */
        public boolean m15422p() {
            return this.f19015c;
        }

        /* renamed from: r */
        public int m15423r() {
            return this.f19020h;
        }

        /* renamed from: t */
        public int m15424t() {
            return this.f19021i;
        }

        /* renamed from: u */
        public boolean m15425u() {
            return this.f19019g;
        }

        /* renamed from: v */
        public boolean m15426v() {
            return this.f19018f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            boolean z10 = this.f19015c;
            if (z10) {
                codedOutputStream.writeBool(1, z10);
            }
            boolean z11 = this.f19016d;
            if (z11) {
                codedOutputStream.writeBool(2, z11);
            }
            boolean z12 = this.f19017e;
            if (z12) {
                codedOutputStream.writeBool(3, z12);
            }
            boolean z13 = this.f19018f;
            if (z13) {
                codedOutputStream.writeBool(4, z13);
            }
            boolean z14 = this.f19019g;
            if (z14) {
                codedOutputStream.writeBool(5, z14);
            }
            int i10 = this.f19020h;
            if (i10 != 0) {
                codedOutputStream.writeInt32(6, i10);
            }
            int i11 = this.f19021i;
            if (i11 != 0) {
                codedOutputStream.writeInt32(7, i11);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: y */
        public boolean m15427y() {
            return this.f19016d;
        }

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$b */
        public static final class C8484b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19023c;

            /* renamed from: d */
            public boolean f19024d;

            /* renamed from: e */
            public boolean f19025e;

            /* renamed from: f */
            public boolean f19026f;

            /* renamed from: g */
            public boolean f19027g;

            /* renamed from: h */
            public boolean f19028h;

            /* renamed from: i */
            public int f19029i;

            /* renamed from: j */
            public int f19030j;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8484b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8484b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public MoveConfig build() {
                MoveConfig moveConfigBuildPartial = buildPartial();
                if (moveConfigBuildPartial.isInitialized()) {
                    return moveConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) moveConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public MoveConfig buildPartial() {
                MoveConfig moveConfig = new MoveConfig(this);
                if (this.f19023c != 0) {
                    m15432f(moveConfig);
                }
                onBuilt();
                return moveConfig;
            }

            /* renamed from: f */
            public final void m15432f(MoveConfig moveConfig) {
                int i10 = this.f19023c;
                if ((i10 & 1) != 0) {
                    moveConfig.f19015c = this.f19024d;
                }
                if ((i10 & 2) != 0) {
                    moveConfig.f19016d = this.f19025e;
                }
                if ((i10 & 4) != 0) {
                    moveConfig.f19017e = this.f19026f;
                }
                if ((i10 & 8) != 0) {
                    moveConfig.f19018f = this.f19027g;
                }
                if ((i10 & 16) != 0) {
                    moveConfig.f19019g = this.f19028h;
                }
                if ((i10 & 32) != 0) {
                    moveConfig.f19020h = this.f19029i;
                }
                if ((i10 & 64) != 0) {
                    moveConfig.f19021i = this.f19030j;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8484b clear() {
                super.clear();
                this.f19023c = 0;
                this.f19024d = false;
                this.f19025e = false;
                this.f19026f = false;
                this.f19027g = false;
                this.f19028h = false;
                this.f19029i = 0;
                this.f19030j = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f18940c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8484b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8484b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8484b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8484b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f18941d.ensureFieldAccessorsInitialized(MoveConfig.class, C8484b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8484b mo33979clone() {
                return (C8484b) super.m33981clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public MoveConfig getDefaultInstanceForType() {
                return MoveConfig.m15415m();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8484b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f19024d = codedInputStream.readBool();
                                    this.f19023c |= 1;
                                } else if (tag == 16) {
                                    this.f19025e = codedInputStream.readBool();
                                    this.f19023c |= 2;
                                } else if (tag == 24) {
                                    this.f19026f = codedInputStream.readBool();
                                    this.f19023c |= 4;
                                } else if (tag == 32) {
                                    this.f19027g = codedInputStream.readBool();
                                    this.f19023c |= 8;
                                } else if (tag == 40) {
                                    this.f19028h = codedInputStream.readBool();
                                    this.f19023c |= 16;
                                } else if (tag == 48) {
                                    this.f19029i = codedInputStream.readInt32();
                                    this.f19023c |= 32;
                                } else if (tag == 56) {
                                    this.f19030j = codedInputStream.readInt32();
                                    this.f19023c |= 64;
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
            public C8484b mergeFrom(Message message) {
                if (message instanceof MoveConfig) {
                    return m15440n((MoveConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: n */
            public C8484b m15440n(MoveConfig moveConfig) {
                if (moveConfig == MoveConfig.m15415m()) {
                    return this;
                }
                if (moveConfig.m15422p()) {
                    m15444r(moveConfig.m15422p());
                }
                if (moveConfig.m15427y()) {
                    m15451y(moveConfig.m15427y());
                }
                if (moveConfig.m15421o()) {
                    m15443q(moveConfig.m15421o());
                }
                if (moveConfig.m15426v()) {
                    m15449w(moveConfig.m15426v());
                }
                if (moveConfig.m15425u()) {
                    m15448v(moveConfig.m15425u());
                }
                if (moveConfig.m15423r() != 0) {
                    m15445s(moveConfig.m15423r());
                }
                if (moveConfig.m15424t() != 0) {
                    m15446t(moveConfig.m15424t());
                }
                mergeUnknownFields(moveConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final C8484b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8484b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8484b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8484b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: q */
            public C8484b m15443q(boolean z10) {
                this.f19026f = z10;
                this.f19023c |= 4;
                onChanged();
                return this;
            }

            /* renamed from: r */
            public C8484b m15444r(boolean z10) {
                this.f19024d = z10;
                this.f19023c |= 1;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C8484b m15445s(int i10) {
                this.f19029i = i10;
                this.f19023c |= 32;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C8484b m15446t(int i10) {
                this.f19030j = i10;
                this.f19023c |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8484b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8484b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: v */
            public C8484b m15448v(boolean z10) {
                this.f19028h = z10;
                this.f19023c |= 16;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C8484b m15449w(boolean z10) {
                this.f19027g = z10;
                this.f19023c |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C8484b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8484b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: y */
            public C8484b m15451y(boolean z10) {
                this.f19025e = z10;
                this.f19023c |= 2;
                onChanged();
                return this;
            }

            public C8484b() {
            }

            public C8484b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public MoveConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19015c = false;
            this.f19016d = false;
            this.f19017e = false;
            this.f19018f = false;
            this.f19019g = false;
            this.f19020h = 0;
            this.f19021i = 0;
            this.f19022j = (byte) -1;
        }

        private MoveConfig() {
            this.f19015c = false;
            this.f19016d = false;
            this.f19017e = false;
            this.f19018f = false;
            this.f19019g = false;
            this.f19020h = 0;
            this.f19021i = 0;
            this.f19022j = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15237i().getMessageTypes().get(0);
        f18938a = descriptor;
        f18939b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Duration", "Author", "ConvertUrl", "Provider", "DefaultBackgroundColor", "LastBackgroundColor", "MoveConfig", "DefaultBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor2 = m15237i().getMessageTypes().get(1);
        f18940c = descriptor2;
        f18941d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IsEnable", "VerticalTranslate", "HorizontalTranslate", "Scale", "Rotate", "MaxHeightTimes", "MaxWidthTimes"});
        Descriptors.Descriptor descriptor3 = m15237i().getMessageTypes().get(2);
        f18942e = descriptor3;
        f18943f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"LineColor", "LineSpace", "LineType", "LineWidth"});
        Descriptors.Descriptor descriptor4 = m15237i().getMessageTypes().get(3);
        f18944g = descriptor4;
        f18945h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AuthorName", "SchoolId", "AuthorId", "Url", "StartTime", "Duration"});
        EzyPageRouter.m15513e();
        EzyBackgroundLineTypeEnum.m14643a();
    }

    /* renamed from: i */
    public static Descriptors.FileDescriptor m15237i() {
        return f18946i;
    }
}

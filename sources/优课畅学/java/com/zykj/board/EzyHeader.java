package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.databinding.library.baseAdapters.C3721BR;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzyHeader {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9117a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9118b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9119c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9120d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9121e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9122f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f9123g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f9124h;

    /* renamed from: i */
    public static Descriptors.FileDescriptor f9125i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fHeader.proto\u001a\u0010PageRouter.proto\u001a\"enums/BackgroundLineTypeEnum.proto\"\u008d\u0003\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003\u0012\u0017\n\u0006author\u0018\u0007 \u0001(\u000b2\u0007.Author\u0012\u0012\n\nconvertUrl\u0018\b \u0001(\t\u0012\u0019\n\bprovider\u0018\t \u0003(\u000b2\u0007.Author\u0012\u001e\n\u0016defaultBackgroundColor\u0018\n \u0001(\u0005\u0012\u001b\n\u0013lastBackgroundColor\u0018\u000b \u0001(\u0005\u0012\u001f\n\nmoveConfig\u0018\f \u0001(\u000b2\u000b.MoveConfig\u0012:\n\u001bdefaultBackgroundLineConfig\u0018\r \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u000e \u0001(\u000b2\u0015.BackgroundLineConfig\"¤\u0001\n\nMoveConfig\u0012\u0010\n\bisEnable\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011verticalTranslate\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013horizontalTranslate\u0018\u0003 \u0001(\b\u0012\r\n\u0005scale\u0018\u0004 \u0001(\b\u0012\u000e\n\u0006rotate\u0018\u0005 \u0001(\b\u0012\u0016\n\u000emaxHeightTimes\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rmaxWidthTimes\u0018\u0007 \u0001(\u0005\"z\n\u0014BackgroundLineConfig\u0012\u0011\n\tlineColor\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tlineSpace\u0018\u0002 \u0001(\u0002\u0012)\n\blineType\u0018\u0003 \u0001(\u000e2\u0017.BackgroundLineTypeEnum\u0012\u0011\n\tlineWidth\u0018\u0004 \u0001(\u0002\"r\n\u0006Author\u0012\u0012\n\nauthorName\u0018\u0001 \u0001(\t\u0012\u0010\n\bschoolId\u0018\u0002 \u0001(\t\u0012\u0010\n\bauthorId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003B\u001b\n\u000ecom.zykj.boardB\tEzyHeaderb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyPageRouter.m8273e(), EzyBackgroundLineTypeEnum.m7397a()});

    public static final class Author extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final Author f9126h = new Author();

        /* renamed from: i */
        public static final Parser f9127i = new C7209a();

        /* renamed from: a */
        public volatile Object f9128a;

        /* renamed from: b */
        public volatile Object f9129b;

        /* renamed from: c */
        public volatile Object f9130c;

        /* renamed from: d */
        public volatile Object f9131d;

        /* renamed from: e */
        public long f9132e;

        /* renamed from: f */
        public long f9133f;

        /* renamed from: g */
        public byte f9134g;

        /* renamed from: com.zykj.board.EzyHeader$Author$a */
        public class C7209a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Author parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7210b c7210bM8008s = Author.m8008s();
                try {
                    c7210bM8008s.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7210bM8008s.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7210bM8008s.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7210bM8008s.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7210bM8008s.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9123g;
        }

        /* renamed from: n */
        public static Author m8007n() {
            return f9126h;
        }

        public static Parser parser() {
            return f9127i;
        }

        /* renamed from: s */
        public static C7210b m8008s() {
            return f9126h.toBuilder();
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
            return m8010m().equals(author.m8010m()) && m8013q().equals(author.m8013q()) && m8009l().equals(author.m8009l()) && m8014r().equals(author.m8014r()) && getStartTime() == author.getStartTime() && m8012p() == author.m8012p() && getUnknownFields().equals(author.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9127i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9128a) ? GeneratedMessageV3.computeStringSize(1, this.f9128a) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.f9129b)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f9129b);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9130c)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f9130c);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9131d)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f9131d);
            }
            long j10 = this.f9132e;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(5, j10);
            }
            long j11 = this.f9133f;
            if (j11 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(6, j11);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getStartTime() {
            return this.f9132e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8010m().hashCode()) * 37) + 2) * 53) + m8013q().hashCode()) * 37) + 3) * 53) + m8009l().hashCode()) * 37) + 4) * 53) + m8014r().hashCode()) * 37) + 5) * 53) + Internal.hashLong(getStartTime())) * 37) + 6) * 53) + Internal.hashLong(m8012p())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9124h.ensureFieldAccessorsInitialized(Author.class, C7210b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9134g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9134g = (byte) 1;
            return true;
        }

        /* renamed from: l */
        public String m8009l() {
            Object obj = this.f9130c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9130c = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: m */
        public String m8010m() {
            Object obj = this.f9128a;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9128a = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Author();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Author getDefaultInstanceForType() {
            return f9126h;
        }

        /* renamed from: p */
        public long m8012p() {
            return this.f9133f;
        }

        /* renamed from: q */
        public String m8013q() {
            Object obj = this.f9129b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9129b = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: r */
        public String m8014r() {
            Object obj = this.f9131d;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9131d = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C7210b newBuilderForType() {
            return m8008s();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7210b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7210b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7210b toBuilder() {
            return this == f9126h ? new C7210b() : new C7210b().m8030o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!GeneratedMessageV3.isStringEmpty(this.f9128a)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9128a);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9129b)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f9129b);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9130c)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f9130c);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9131d)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9131d);
            }
            long j10 = this.f9132e;
            if (j10 != 0) {
                codedOutputStream.writeInt64(5, j10);
            }
            long j11 = this.f9133f;
            if (j11 != 0) {
                codedOutputStream.writeInt64(6, j11);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyHeader$Author$b */
        public static final class C7210b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9135a;

            /* renamed from: b */
            public Object f9136b;

            /* renamed from: c */
            public Object f9137c;

            /* renamed from: d */
            public Object f9138d;

            /* renamed from: e */
            public Object f9139e;

            /* renamed from: f */
            public long f9140f;

            /* renamed from: g */
            public long f9141g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7210b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7210b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Author build() {
                Author authorBuildPartial = buildPartial();
                if (authorBuildPartial.isInitialized()) {
                    return authorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) authorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Author buildPartial() {
                Author author = new Author(this);
                if (this.f9135a != 0) {
                    m8022g(author);
                }
                onBuilt();
                return author;
            }

            /* renamed from: g */
            public final void m8022g(Author author) {
                int i10 = this.f9135a;
                if ((i10 & 1) != 0) {
                    author.f9128a = this.f9136b;
                }
                if ((i10 & 2) != 0) {
                    author.f9129b = this.f9137c;
                }
                if ((i10 & 4) != 0) {
                    author.f9130c = this.f9138d;
                }
                if ((i10 & 8) != 0) {
                    author.f9131d = this.f9139e;
                }
                if ((i10 & 16) != 0) {
                    author.f9132e = this.f9140f;
                }
                if ((i10 & 32) != 0) {
                    author.f9133f = this.f9141g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9123g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7210b clear() {
                super.clear();
                this.f9135a = 0;
                this.f9136b = "";
                this.f9137c = "";
                this.f9138d = "";
                this.f9139e = "";
                this.f9140f = 0L;
                this.f9141g = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7210b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7210b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9124h.ensureFieldAccessorsInitialized(Author.class, C7210b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7210b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7210b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7210b mo27381clone() {
                return (C7210b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Author getDefaultInstanceForType() {
                return Author.m8007n();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7210b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f9136b = codedInputStream.readStringRequireUtf8();
                                    this.f9135a |= 1;
                                } else if (tag == 18) {
                                    this.f9137c = codedInputStream.readStringRequireUtf8();
                                    this.f9135a |= 2;
                                } else if (tag == 26) {
                                    this.f9138d = codedInputStream.readStringRequireUtf8();
                                    this.f9135a |= 4;
                                } else if (tag == 34) {
                                    this.f9139e = codedInputStream.readStringRequireUtf8();
                                    this.f9135a |= 8;
                                } else if (tag == 40) {
                                    this.f9140f = codedInputStream.readInt64();
                                    this.f9135a |= 16;
                                } else if (tag == 48) {
                                    this.f9141g = codedInputStream.readInt64();
                                    this.f9135a |= 32;
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
            public C7210b mergeFrom(Message message) {
                if (message instanceof Author) {
                    return m8030o((Author) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7210b m8030o(Author author) {
                if (author == Author.m8007n()) {
                    return this;
                }
                if (!author.m8010m().isEmpty()) {
                    this.f9136b = author.f9128a;
                    this.f9135a |= 1;
                    onChanged();
                }
                if (!author.m8013q().isEmpty()) {
                    this.f9137c = author.f9129b;
                    this.f9135a |= 2;
                    onChanged();
                }
                if (!author.m8009l().isEmpty()) {
                    this.f9138d = author.f9130c;
                    this.f9135a |= 4;
                    onChanged();
                }
                if (!author.m8014r().isEmpty()) {
                    this.f9139e = author.f9131d;
                    this.f9135a |= 8;
                    onChanged();
                }
                if (author.getStartTime() != 0) {
                    m8038w(author.getStartTime());
                }
                if (author.m8012p() != 0) {
                    m8034s(author.m8012p());
                }
                mergeUnknownFields(author.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7210b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7210b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7210b m8032q(String str) {
                str.getClass();
                this.f9138d = str;
                this.f9135a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: r */
            public C7210b m8033r(String str) {
                str.getClass();
                this.f9136b = str;
                this.f9135a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C7210b m8034s(long j10) {
                this.f9141g = j10;
                this.f9135a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7210b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7210b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7210b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7210b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: v */
            public C7210b m8037v(String str) {
                str.getClass();
                this.f9137c = str;
                this.f9135a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C7210b m8038w(long j10) {
                this.f9140f = j10;
                this.f9135a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7210b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7210b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: y */
            public C7210b m8040y(String str) {
                str.getClass();
                this.f9139e = str;
                this.f9135a |= 8;
                onChanged();
                return this;
            }

            public C7210b() {
                this.f9136b = "";
                this.f9137c = "";
                this.f9138d = "";
                this.f9139e = "";
            }

            public C7210b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9136b = "";
                this.f9137c = "";
                this.f9138d = "";
                this.f9139e = "";
            }
        }

        public Author(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9128a = "";
            this.f9129b = "";
            this.f9130c = "";
            this.f9131d = "";
            this.f9132e = 0L;
            this.f9133f = 0L;
            this.f9134g = (byte) -1;
        }

        private Author() {
            this.f9128a = "";
            this.f9129b = "";
            this.f9130c = "";
            this.f9131d = "";
            this.f9132e = 0L;
            this.f9133f = 0L;
            this.f9134g = (byte) -1;
            this.f9128a = "";
            this.f9129b = "";
            this.f9130c = "";
            this.f9131d = "";
        }
    }

    public static final class BackgroundLineConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final BackgroundLineConfig f9142f = new BackgroundLineConfig();

        /* renamed from: g */
        public static final Parser f9143g = new C7211a();

        /* renamed from: a */
        public int f9144a;

        /* renamed from: b */
        public float f9145b;

        /* renamed from: c */
        public int f9146c;

        /* renamed from: d */
        public float f9147d;

        /* renamed from: e */
        public byte f9148e;

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$a */
        public class C7211a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7212b c7212bM8047n = BackgroundLineConfig.m8047n();
                try {
                    c7212bM8047n.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7212bM8047n.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7212bM8047n.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7212bM8047n.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7212bM8047n.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static BackgroundLineConfig m8046g() {
            return f9142f;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9121e;
        }

        /* renamed from: n */
        public static C7212b m8047n() {
            return f9142f.toBuilder();
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
            return m8049i() == backgroundLineConfig.m8049i() && Float.floatToIntBits(m8050j()) == Float.floatToIntBits(backgroundLineConfig.m8050j()) && this.f9146c == backgroundLineConfig.f9146c && Float.floatToIntBits(m8053m()) == Float.floatToIntBits(backgroundLineConfig.m8053m()) && getUnknownFields().equals(backgroundLineConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9143g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f9144a;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            if (Float.floatToRawIntBits(this.f9145b) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(2, this.f9145b);
            }
            if (this.f9146c != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f9146c);
            }
            if (Float.floatToRawIntBits(this.f9147d) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(4, this.f9147d);
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public BackgroundLineConfig getDefaultInstanceForType() {
            return f9142f;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8049i()) * 37) + 2) * 53) + Float.floatToIntBits(m8050j())) * 37) + 3) * 53) + this.f9146c) * 37) + 4) * 53) + Float.floatToIntBits(m8053m())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        /* renamed from: i */
        public int m8049i() {
            return this.f9144a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9122f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C7212b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9148e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9148e = (byte) 1;
            return true;
        }

        /* renamed from: j */
        public float m8050j() {
            return this.f9145b;
        }

        /* renamed from: k */
        public EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m8051k() {
            EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM7398a = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m7398a(this.f9146c);
            return backgroundLineTypeEnumM7398a == null ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.UNRECOGNIZED : backgroundLineTypeEnumM7398a;
        }

        /* renamed from: l */
        public int m8052l() {
            return this.f9146c;
        }

        /* renamed from: m */
        public float m8053m() {
            return this.f9147d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BackgroundLineConfig();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C7212b newBuilderForType() {
            return m8047n();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C7212b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7212b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C7212b toBuilder() {
            return this == f9142f ? new C7212b() : new C7212b().m8069o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.f9144a;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            if (Float.floatToRawIntBits(this.f9145b) != 0) {
                codedOutputStream.writeFloat(2, this.f9145b);
            }
            if (this.f9146c != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                codedOutputStream.writeEnum(3, this.f9146c);
            }
            if (Float.floatToRawIntBits(this.f9147d) != 0) {
                codedOutputStream.writeFloat(4, this.f9147d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$b */
        public static final class C7212b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9149a;

            /* renamed from: b */
            public int f9150b;

            /* renamed from: c */
            public float f9151c;

            /* renamed from: d */
            public int f9152d;

            /* renamed from: e */
            public float f9153e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7212b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7212b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig build() {
                BackgroundLineConfig backgroundLineConfigBuildPartial = buildPartial();
                if (backgroundLineConfigBuildPartial.isInitialized()) {
                    return backgroundLineConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) backgroundLineConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig buildPartial() {
                BackgroundLineConfig backgroundLineConfig = new BackgroundLineConfig(this);
                if (this.f9149a != 0) {
                    m8061g(backgroundLineConfig);
                }
                onBuilt();
                return backgroundLineConfig;
            }

            /* renamed from: g */
            public final void m8061g(BackgroundLineConfig backgroundLineConfig) {
                int i10 = this.f9149a;
                if ((i10 & 1) != 0) {
                    backgroundLineConfig.f9144a = this.f9150b;
                }
                if ((i10 & 2) != 0) {
                    backgroundLineConfig.f9145b = this.f9151c;
                }
                if ((i10 & 4) != 0) {
                    backgroundLineConfig.f9146c = this.f9152d;
                }
                if ((i10 & 8) != 0) {
                    backgroundLineConfig.f9147d = this.f9153e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9121e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7212b clear() {
                super.clear();
                this.f9149a = 0;
                this.f9150b = 0;
                this.f9151c = 0.0f;
                this.f9152d = 0;
                this.f9153e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7212b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7212b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9122f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C7212b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7212b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7212b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7212b mo27381clone() {
                return (C7212b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig getDefaultInstanceForType() {
                return BackgroundLineConfig.m8046g();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7212b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f9150b = codedInputStream.readInt32();
                                    this.f9149a |= 1;
                                } else if (tag == 21) {
                                    this.f9151c = codedInputStream.readFloat();
                                    this.f9149a |= 2;
                                } else if (tag == 24) {
                                    this.f9152d = codedInputStream.readEnum();
                                    this.f9149a |= 4;
                                } else if (tag == 37) {
                                    this.f9153e = codedInputStream.readFloat();
                                    this.f9149a |= 8;
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
            public C7212b mergeFrom(Message message) {
                if (message instanceof BackgroundLineConfig) {
                    return m8069o((BackgroundLineConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7212b m8069o(BackgroundLineConfig backgroundLineConfig) {
                if (backgroundLineConfig == BackgroundLineConfig.m8046g()) {
                    return this;
                }
                if (backgroundLineConfig.m8049i() != 0) {
                    m8072r(backgroundLineConfig.m8049i());
                }
                if (backgroundLineConfig.m8050j() != 0.0f) {
                    m8073s(backgroundLineConfig.m8050j());
                }
                if (backgroundLineConfig.f9146c != 0) {
                    m8075u(backgroundLineConfig.m8052l());
                }
                if (backgroundLineConfig.m8053m() != 0.0f) {
                    m8076v(backgroundLineConfig.m8053m());
                }
                mergeUnknownFields(backgroundLineConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7212b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7212b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7212b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7212b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C7212b m8072r(int i10) {
                this.f9150b = i10;
                this.f9149a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C7212b m8073s(float f10) {
                this.f9151c = f10;
                this.f9149a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C7212b m8074t(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
                backgroundLineTypeEnum.getClass();
                this.f9149a |= 4;
                this.f9152d = backgroundLineTypeEnum.getNumber();
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7212b m8075u(int i10) {
                this.f9152d = i10;
                this.f9149a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7212b m8076v(float f10) {
                this.f9153e = f10;
                this.f9149a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7212b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7212b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7212b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7212b) super.setUnknownFields(unknownFieldSet);
            }

            public C7212b() {
                this.f9152d = 0;
            }

            public C7212b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9152d = 0;
            }
        }

        public BackgroundLineConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9144a = 0;
            this.f9145b = 0.0f;
            this.f9146c = 0;
            this.f9147d = 0.0f;
            this.f9148e = (byte) -1;
        }

        private BackgroundLineConfig() {
            this.f9144a = 0;
            this.f9145b = 0.0f;
            this.f9147d = 0.0f;
            this.f9148e = (byte) -1;
            this.f9146c = 0;
        }
    }

    public static final class Header extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: q */
        public static final Header f9154q = new Header();

        /* renamed from: r */
        public static final Parser f9155r = new C7213a();

        /* renamed from: a */
        public int f9156a;

        /* renamed from: b */
        public int f9157b;

        /* renamed from: c */
        public int f9158c;

        /* renamed from: d */
        public int f9159d;

        /* renamed from: e */
        public long f9160e;

        /* renamed from: f */
        public long f9161f;

        /* renamed from: g */
        public long f9162g;

        /* renamed from: h */
        public Author f9163h;

        /* renamed from: i */
        public volatile Object f9164i;

        /* renamed from: j */
        public List f9165j;

        /* renamed from: k */
        public int f9166k;

        /* renamed from: l */
        public int f9167l;

        /* renamed from: m */
        public MoveConfig f9168m;

        /* renamed from: n */
        public BackgroundLineConfig f9169n;

        /* renamed from: o */
        public BackgroundLineConfig f9170o;

        /* renamed from: p */
        public byte f9171p;

        /* renamed from: com.zykj.board.EzyHeader$Header$a */
        public class C7213a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Header parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7214b c7214bM8079J = Header.m8079J();
                try {
                    c7214bM8079J.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7214bM8079J.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7214bM8079J.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7214bM8079J.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7214bM8079J.buildPartial());
                }
            }
        }

        /* renamed from: J */
        public static C7214b m8079J() {
            return f9154q.toBuilder();
        }

        /* renamed from: M */
        public static Header m8080M(InputStream inputStream) {
            return (Header) GeneratedMessageV3.parseWithIOException(f9155r, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9117a;
        }

        /* renamed from: m */
        public static /* synthetic */ int m8092m(Header header, int i10) {
            int i11 = i10 | header.f9156a;
            header.f9156a = i11;
            return i11;
        }

        /* renamed from: x */
        public static Header m8099x() {
            return f9154q;
        }

        /* renamed from: A */
        public int m8100A() {
            return this.f9167l;
        }

        /* renamed from: B */
        public BackgroundLineConfig m8101B() {
            BackgroundLineConfig backgroundLineConfig = this.f9170o;
            return backgroundLineConfig == null ? BackgroundLineConfig.m8046g() : backgroundLineConfig;
        }

        /* renamed from: C */
        public MoveConfig m8102C() {
            MoveConfig moveConfig = this.f9168m;
            return moveConfig == null ? MoveConfig.m8175i() : moveConfig;
        }

        /* renamed from: D */
        public int m8103D() {
            return this.f9165j.size();
        }

        /* renamed from: E */
        public List m8104E() {
            return this.f9165j;
        }

        /* renamed from: F */
        public boolean m8105F() {
            return (this.f9156a & 1) != 0;
        }

        /* renamed from: G */
        public boolean m8106G() {
            return (this.f9156a & 4) != 0;
        }

        /* renamed from: H */
        public boolean m8107H() {
            return (this.f9156a & 8) != 0;
        }

        /* renamed from: I */
        public boolean m8108I() {
            return (this.f9156a & 2) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public C7214b newBuilderForType() {
            return m8079J();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public C7214b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7214b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public C7214b toBuilder() {
            return this == f9154q ? new C7214b() : new C7214b().m8127H(this);
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
            if (getVersion() != header.getVersion() || getWidth() != header.getWidth() || getHeight() != header.getHeight() || getCreateDate() != header.getCreateDate() || getUpdateDate() != header.getUpdateDate() || m8117z() != header.m8117z() || m8105F() != header.m8105F()) {
                return false;
            }
            if ((m8105F() && !m8112t().equals(header.m8112t())) || !m8113u().equals(header.m8113u()) || !m8104E().equals(header.m8104E()) || m8114v() != header.m8114v() || m8100A() != header.m8100A() || m8108I() != header.m8108I()) {
                return false;
            }
            if ((m8108I() && !m8102C().equals(header.m8102C())) || m8106G() != header.m8106G()) {
                return false;
            }
            if ((!m8106G() || m8115w().equals(header.m8115w())) && m8107H() == header.m8107H()) {
                return (!m8107H() || m8101B().equals(header.m8101B())) && getUnknownFields().equals(header.getUnknownFields());
            }
            return false;
        }

        public long getCreateDate() {
            return this.f9160e;
        }

        public int getHeight() {
            return this.f9159d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9155r;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f9157b;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.f9158c;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.f9159d;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            long j10 = this.f9160e;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j10);
            }
            long j11 = this.f9161f;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j11);
            }
            long j12 = this.f9162g;
            if (j12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j12);
            }
            if ((1 & this.f9156a) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, m8112t());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9164i)) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(8, this.f9164i);
            }
            for (int i14 = 0; i14 < this.f9165j.size(); i14++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f9165j.get(i14));
            }
            int i15 = this.f9166k;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, i15);
            }
            int i16 = this.f9167l;
            if (i16 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, i16);
            }
            if ((this.f9156a & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, m8102C());
            }
            if ((this.f9156a & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, m8115w());
            }
            if ((this.f9156a & 8) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(14, m8101B());
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getUpdateDate() {
            return this.f9161f;
        }

        public int getVersion() {
            return this.f9157b;
        }

        public int getWidth() {
            return this.f9158c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + Internal.hashLong(getCreateDate())) * 37) + 5) * 53) + Internal.hashLong(getUpdateDate())) * 37) + 6) * 53) + Internal.hashLong(m8117z());
            if (m8105F()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m8112t().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 8) * 53) + m8113u().hashCode();
            if (m8103D() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m8104E().hashCode();
            }
            int iM8114v = (((((((iHashCode2 * 37) + 10) * 53) + m8114v()) * 37) + 11) * 53) + m8100A();
            if (m8108I()) {
                iM8114v = (((iM8114v * 37) + 12) * 53) + m8102C().hashCode();
            }
            if (m8106G()) {
                iM8114v = (((iM8114v * 37) + 13) * 53) + m8115w().hashCode();
            }
            if (m8107H()) {
                iM8114v = (((iM8114v * 37) + 14) * 53) + m8101B().hashCode();
            }
            int iHashCode3 = (iM8114v * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9118b.ensureFieldAccessorsInitialized(Header.class, C7214b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9171p;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9171p = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Header();
        }

        /* renamed from: t */
        public Author m8112t() {
            Author author = this.f9163h;
            return author == null ? Author.m8007n() : author;
        }

        /* renamed from: u */
        public String m8113u() {
            Object obj = this.f9164i;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9164i = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: v */
        public int m8114v() {
            return this.f9166k;
        }

        /* renamed from: w */
        public BackgroundLineConfig m8115w() {
            BackgroundLineConfig backgroundLineConfig = this.f9169n;
            return backgroundLineConfig == null ? BackgroundLineConfig.m8046g() : backgroundLineConfig;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.f9157b;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.f9158c;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.f9159d;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            long j10 = this.f9160e;
            if (j10 != 0) {
                codedOutputStream.writeInt64(4, j10);
            }
            long j11 = this.f9161f;
            if (j11 != 0) {
                codedOutputStream.writeInt64(5, j11);
            }
            long j12 = this.f9162g;
            if (j12 != 0) {
                codedOutputStream.writeInt64(6, j12);
            }
            if ((this.f9156a & 1) != 0) {
                codedOutputStream.writeMessage(7, m8112t());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9164i)) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.f9164i);
            }
            for (int i13 = 0; i13 < this.f9165j.size(); i13++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.f9165j.get(i13));
            }
            int i14 = this.f9166k;
            if (i14 != 0) {
                codedOutputStream.writeInt32(10, i14);
            }
            int i15 = this.f9167l;
            if (i15 != 0) {
                codedOutputStream.writeInt32(11, i15);
            }
            if ((this.f9156a & 2) != 0) {
                codedOutputStream.writeMessage(12, m8102C());
            }
            if ((this.f9156a & 4) != 0) {
                codedOutputStream.writeMessage(13, m8115w());
            }
            if ((this.f9156a & 8) != 0) {
                codedOutputStream.writeMessage(14, m8101B());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Header getDefaultInstanceForType() {
            return f9154q;
        }

        /* renamed from: z */
        public long m8117z() {
            return this.f9162g;
        }

        /* renamed from: com.zykj.board.EzyHeader$Header$b */
        public static final class C7214b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9172a;

            /* renamed from: b */
            public int f9173b;

            /* renamed from: c */
            public int f9174c;

            /* renamed from: d */
            public int f9175d;

            /* renamed from: e */
            public long f9176e;

            /* renamed from: f */
            public long f9177f;

            /* renamed from: g */
            public long f9178g;

            /* renamed from: h */
            public Author f9179h;

            /* renamed from: i */
            public SingleFieldBuilderV3 f9180i;

            /* renamed from: j */
            public Object f9181j;

            /* renamed from: k */
            public List f9182k;

            /* renamed from: l */
            public RepeatedFieldBuilderV3 f9183l;

            /* renamed from: m */
            public int f9184m;

            /* renamed from: n */
            public int f9185n;

            /* renamed from: o */
            public MoveConfig f9186o;

            /* renamed from: p */
            public SingleFieldBuilderV3 f9187p;

            /* renamed from: q */
            public BackgroundLineConfig f9188q;

            /* renamed from: r */
            public SingleFieldBuilderV3 f9189r;

            /* renamed from: s */
            public BackgroundLineConfig f9190s;

            /* renamed from: t */
            public SingleFieldBuilderV3 f9191t;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m8160r();
                    m8122C();
                    m8121B();
                    m8163u();
                    m8119y();
                }
            }

            /* renamed from: y */
            private SingleFieldBuilderV3 m8119y() {
                if (this.f9191t == null) {
                    this.f9191t = new SingleFieldBuilderV3(m8165w(), getParentForChildren(), isClean());
                    this.f9190s = null;
                }
                return this.f9191t;
            }

            /* renamed from: A */
            public MoveConfig.C7216b m8120A() {
                this.f9172a |= 2048;
                onChanged();
                return (MoveConfig.C7216b) m8121B().getBuilder();
            }

            /* renamed from: B */
            public final SingleFieldBuilderV3 m8121B() {
                if (this.f9187p == null) {
                    this.f9187p = new SingleFieldBuilderV3(m8167z(), getParentForChildren(), isClean());
                    this.f9186o = null;
                }
                return this.f9187p;
            }

            /* renamed from: C */
            public final RepeatedFieldBuilderV3 m8122C() {
                if (this.f9183l == null) {
                    this.f9183l = new RepeatedFieldBuilderV3(this.f9182k, (this.f9172a & 256) != 0, getParentForChildren(), isClean());
                    this.f9182k = null;
                }
                return this.f9183l;
            }

            /* renamed from: D */
            public C7214b m8123D(Author author) {
                Author author2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9180i;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(author);
                } else if ((this.f9172a & 64) == 0 || (author2 = this.f9179h) == null || author2 == Author.m8007n()) {
                    this.f9179h = author;
                } else {
                    m8159q().m8030o(author);
                }
                if (this.f9179h != null) {
                    this.f9172a |= 64;
                    onChanged();
                }
                return this;
            }

            /* renamed from: E */
            public C7214b m8124E(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9189r;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f9172a & 4096) == 0 || (backgroundLineConfig2 = this.f9188q) == null || backgroundLineConfig2 == BackgroundLineConfig.m8046g()) {
                    this.f9188q = backgroundLineConfig;
                } else {
                    m8162t().m8069o(backgroundLineConfig);
                }
                if (this.f9188q != null) {
                    this.f9172a |= 4096;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public C7214b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    this.f9173b = codedInputStream.readInt32();
                                    this.f9172a |= 1;
                                case 16:
                                    this.f9174c = codedInputStream.readInt32();
                                    this.f9172a |= 2;
                                case 24:
                                    this.f9175d = codedInputStream.readInt32();
                                    this.f9172a |= 4;
                                case 32:
                                    this.f9176e = codedInputStream.readInt64();
                                    this.f9172a |= 8;
                                case 40:
                                    this.f9177f = codedInputStream.readInt64();
                                    this.f9172a |= 16;
                                case 48:
                                    this.f9178g = codedInputStream.readInt64();
                                    this.f9172a |= 32;
                                case C3721BR.versionViewModel /* 58 */:
                                    codedInputStream.readMessage(m8160r().getBuilder(), extensionRegistryLite);
                                    this.f9172a |= 64;
                                case 66:
                                    this.f9181j = codedInputStream.readStringRequireUtf8();
                                    this.f9172a |= 128;
                                case 74:
                                    Author author = (Author) codedInputStream.readMessage(Author.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9183l;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8157o();
                                        this.f9182k.add(author);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(author);
                                    }
                                case 80:
                                    this.f9184m = codedInputStream.readInt32();
                                    this.f9172a |= 512;
                                case IjkMediaMeta.FF_PROFILE_H264_EXTENDED /* 88 */:
                                    this.f9185n = codedInputStream.readInt32();
                                    this.f9172a |= 1024;
                                case 98:
                                    codedInputStream.readMessage(m8121B().getBuilder(), extensionRegistryLite);
                                    this.f9172a |= 2048;
                                case TbsListener.ErrorCode.FILE_DELETED /* 106 */:
                                    codedInputStream.readMessage(m8163u().getBuilder(), extensionRegistryLite);
                                    this.f9172a |= 4096;
                                case 114:
                                    codedInputStream.readMessage(m8119y().getBuilder(), extensionRegistryLite);
                                    this.f9172a |= 8192;
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
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public C7214b mergeFrom(Message message) {
                if (message instanceof Header) {
                    return m8127H((Header) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: H */
            public C7214b m8127H(Header header) {
                if (header == Header.m8099x()) {
                    return this;
                }
                if (header.getVersion() != 0) {
                    m8144Y(header.getVersion());
                }
                if (header.getWidth() != 0) {
                    m8145Z(header.getWidth());
                }
                if (header.getHeight() != 0) {
                    m8137R(header.getHeight());
                }
                if (header.getCreateDate() != 0) {
                    m8132M(header.getCreateDate());
                }
                if (header.getUpdateDate() != 0) {
                    m8143X(header.getUpdateDate());
                }
                if (header.m8117z() != 0) {
                    m8135P(header.m8117z());
                }
                if (header.m8105F()) {
                    m8123D(header.m8112t());
                }
                if (!header.m8113u().isEmpty()) {
                    this.f9181j = header.f9164i;
                    this.f9172a |= 128;
                    onChanged();
                }
                if (this.f9183l == null) {
                    if (!header.f9165j.isEmpty()) {
                        if (this.f9182k.isEmpty()) {
                            this.f9182k = header.f9165j;
                            this.f9172a &= -257;
                        } else {
                            m8157o();
                            this.f9182k.addAll(header.f9165j);
                        }
                        onChanged();
                    }
                } else if (!header.f9165j.isEmpty()) {
                    if (this.f9183l.isEmpty()) {
                        this.f9183l.dispose();
                        this.f9183l = null;
                        this.f9182k = header.f9165j;
                        this.f9172a &= -257;
                        this.f9183l = GeneratedMessageV3.alwaysUseFieldBuilders ? m8122C() : null;
                    } else {
                        this.f9183l.addAllMessages(header.f9165j);
                    }
                }
                if (header.m8114v() != 0) {
                    m8133N(header.m8114v());
                }
                if (header.m8100A() != 0) {
                    m8138S(header.m8100A());
                }
                if (header.m8108I()) {
                    m8129J(header.m8102C());
                }
                if (header.m8106G()) {
                    m8124E(header.m8115w());
                }
                if (header.m8107H()) {
                    m8128I(header.m8101B());
                }
                mergeUnknownFields(header.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: I */
            public C7214b m8128I(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9191t;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f9172a & 8192) == 0 || (backgroundLineConfig2 = this.f9190s) == null || backgroundLineConfig2 == BackgroundLineConfig.m8046g()) {
                    this.f9190s = backgroundLineConfig;
                } else {
                    m8166x().m8069o(backgroundLineConfig);
                }
                if (this.f9190s != null) {
                    this.f9172a |= 8192;
                    onChanged();
                }
                return this;
            }

            /* renamed from: J */
            public C7214b m8129J(MoveConfig moveConfig) {
                MoveConfig moveConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9187p;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(moveConfig);
                } else if ((this.f9172a & 2048) == 0 || (moveConfig2 = this.f9186o) == null || moveConfig2 == MoveConfig.m8175i()) {
                    this.f9186o = moveConfig;
                } else {
                    m8120A().m8200o(moveConfig);
                }
                if (this.f9186o != null) {
                    this.f9172a |= 2048;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: K, reason: merged with bridge method [inline-methods] */
            public final C7214b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7214b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: L */
            public C7214b m8131L(Author author) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9180i;
                if (singleFieldBuilderV3 == null) {
                    author.getClass();
                    this.f9179h = author;
                } else {
                    singleFieldBuilderV3.setMessage(author);
                }
                this.f9172a |= 64;
                onChanged();
                return this;
            }

            /* renamed from: M */
            public C7214b m8132M(long j10) {
                this.f9176e = j10;
                this.f9172a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: N */
            public C7214b m8133N(int i10) {
                this.f9184m = i10;
                this.f9172a |= 512;
                onChanged();
                return this;
            }

            /* renamed from: O */
            public C7214b m8134O(BackgroundLineConfig backgroundLineConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9189r;
                if (singleFieldBuilderV3 == null) {
                    backgroundLineConfig.getClass();
                    this.f9188q = backgroundLineConfig;
                } else {
                    singleFieldBuilderV3.setMessage(backgroundLineConfig);
                }
                this.f9172a |= 4096;
                onChanged();
                return this;
            }

            /* renamed from: P */
            public C7214b m8135P(long j10) {
                this.f9178g = j10;
                this.f9172a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: Q, reason: merged with bridge method [inline-methods] */
            public C7214b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7214b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: R */
            public C7214b m8137R(int i10) {
                this.f9175d = i10;
                this.f9172a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: S */
            public C7214b m8138S(int i10) {
                this.f9185n = i10;
                this.f9172a |= 1024;
                onChanged();
                return this;
            }

            /* renamed from: T */
            public C7214b m8139T(BackgroundLineConfig backgroundLineConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9191t;
                if (singleFieldBuilderV3 == null) {
                    backgroundLineConfig.getClass();
                    this.f9190s = backgroundLineConfig;
                } else {
                    singleFieldBuilderV3.setMessage(backgroundLineConfig);
                }
                this.f9172a |= 8192;
                onChanged();
                return this;
            }

            /* renamed from: U */
            public C7214b m8140U(MoveConfig moveConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9187p;
                if (singleFieldBuilderV3 == null) {
                    moveConfig.getClass();
                    this.f9186o = moveConfig;
                } else {
                    singleFieldBuilderV3.setMessage(moveConfig);
                }
                this.f9172a |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public C7214b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7214b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public final C7214b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7214b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: X */
            public C7214b m8143X(long j10) {
                this.f9177f = j10;
                this.f9172a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: Y */
            public C7214b m8144Y(int i10) {
                this.f9173b = i10;
                this.f9172a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: Z */
            public C7214b m8145Z(int i10) {
                this.f9174c = i10;
                this.f9172a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: c */
            public C7214b m8146c(Iterable iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9183l;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                m8157o();
                AbstractMessageLite.Builder.addAll(iterable, this.f9182k);
                onChanged();
                return this;
            }

            /* renamed from: e */
            public C7214b m8147e(Author author) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9183l;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(author);
                    return this;
                }
                author.getClass();
                m8157o();
                this.f9182k.add(author);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C7214b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7214b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public Header build() {
                Header headerBuildPartial = buildPartial();
                if (headerBuildPartial.isInitialized()) {
                    return headerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9117a;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Header buildPartial() {
                Header header = new Header(this);
                m8152j(header);
                if (this.f9172a != 0) {
                    m8151i(header);
                }
                onBuilt();
                return header;
            }

            /* renamed from: i */
            public final void m8151i(Header header) {
                int i10;
                int i11 = this.f9172a;
                if ((i11 & 1) != 0) {
                    header.f9157b = this.f9173b;
                }
                if ((i11 & 2) != 0) {
                    header.f9158c = this.f9174c;
                }
                if ((i11 & 4) != 0) {
                    header.f9159d = this.f9175d;
                }
                if ((i11 & 8) != 0) {
                    header.f9160e = this.f9176e;
                }
                if ((i11 & 16) != 0) {
                    header.f9161f = this.f9177f;
                }
                if ((i11 & 32) != 0) {
                    header.f9162g = this.f9178g;
                }
                if ((i11 & 64) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9180i;
                    header.f9163h = singleFieldBuilderV3 == null ? this.f9179h : (Author) singleFieldBuilderV3.build();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 128) != 0) {
                    header.f9164i = this.f9181j;
                }
                if ((i11 & 512) != 0) {
                    header.f9166k = this.f9184m;
                }
                if ((i11 & 1024) != 0) {
                    header.f9167l = this.f9185n;
                }
                if ((i11 & 2048) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9187p;
                    header.f9168m = singleFieldBuilderV32 == null ? this.f9186o : (MoveConfig) singleFieldBuilderV32.build();
                    i10 |= 2;
                }
                if ((i11 & 4096) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9189r;
                    header.f9169n = singleFieldBuilderV33 == null ? this.f9188q : (BackgroundLineConfig) singleFieldBuilderV33.build();
                    i10 |= 4;
                }
                if ((i11 & 8192) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV34 = this.f9191t;
                    header.f9170o = singleFieldBuilderV34 == null ? this.f9190s : (BackgroundLineConfig) singleFieldBuilderV34.build();
                    i10 |= 8;
                }
                Header.m8092m(header, i10);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9118b.ensureFieldAccessorsInitialized(Header.class, C7214b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: j */
            public final void m8152j(Header header) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9183l;
                if (repeatedFieldBuilderV3 != null) {
                    header.f9165j = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9172a & 256) != 0) {
                    this.f9182k = Collections.unmodifiableList(this.f9182k);
                    this.f9172a &= -257;
                }
                header.f9165j = this.f9182k;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7214b clear() {
                super.clear();
                this.f9172a = 0;
                this.f9173b = 0;
                this.f9174c = 0;
                this.f9175d = 0;
                this.f9176e = 0L;
                this.f9177f = 0L;
                this.f9178g = 0L;
                this.f9179h = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9180i;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f9180i = null;
                }
                this.f9181j = "";
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9183l;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9182k = Collections.EMPTY_LIST;
                } else {
                    this.f9182k = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9172a &= -257;
                this.f9184m = 0;
                this.f9185n = 0;
                this.f9186o = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9187p;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f9187p = null;
                }
                this.f9188q = null;
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9189r;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.dispose();
                    this.f9189r = null;
                }
                this.f9190s = null;
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.f9191t;
                if (singleFieldBuilderV34 != null) {
                    singleFieldBuilderV34.dispose();
                    this.f9191t = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7214b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7214b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7214b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7214b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7214b mo27381clone() {
                return (C7214b) super.mo27381clone();
            }

            /* renamed from: o */
            public final void m8157o() {
                if ((this.f9172a & 256) == 0) {
                    this.f9182k = new ArrayList(this.f9182k);
                    this.f9172a |= 256;
                }
            }

            /* renamed from: p */
            public Author m8158p() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9180i;
                if (singleFieldBuilderV3 != null) {
                    return (Author) singleFieldBuilderV3.getMessage();
                }
                Author author = this.f9179h;
                return author == null ? Author.m8007n() : author;
            }

            /* renamed from: q */
            public Author.C7210b m8159q() {
                this.f9172a |= 64;
                onChanged();
                return (Author.C7210b) m8160r().getBuilder();
            }

            /* renamed from: r */
            public final SingleFieldBuilderV3 m8160r() {
                if (this.f9180i == null) {
                    this.f9180i = new SingleFieldBuilderV3(m8158p(), getParentForChildren(), isClean());
                    this.f9179h = null;
                }
                return this.f9180i;
            }

            /* renamed from: s */
            public BackgroundLineConfig m8161s() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9189r;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f9188q;
                return backgroundLineConfig == null ? BackgroundLineConfig.m8046g() : backgroundLineConfig;
            }

            /* renamed from: t */
            public BackgroundLineConfig.C7212b m8162t() {
                this.f9172a |= 4096;
                onChanged();
                return (BackgroundLineConfig.C7212b) m8163u().getBuilder();
            }

            /* renamed from: u */
            public final SingleFieldBuilderV3 m8163u() {
                if (this.f9189r == null) {
                    this.f9189r = new SingleFieldBuilderV3(m8161s(), getParentForChildren(), isClean());
                    this.f9188q = null;
                }
                return this.f9189r;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Header getDefaultInstanceForType() {
                return Header.m8099x();
            }

            /* renamed from: w */
            public BackgroundLineConfig m8165w() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9191t;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f9190s;
                return backgroundLineConfig == null ? BackgroundLineConfig.m8046g() : backgroundLineConfig;
            }

            /* renamed from: x */
            public BackgroundLineConfig.C7212b m8166x() {
                this.f9172a |= 8192;
                onChanged();
                return (BackgroundLineConfig.C7212b) m8119y().getBuilder();
            }

            /* renamed from: z */
            public MoveConfig m8167z() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9187p;
                if (singleFieldBuilderV3 != null) {
                    return (MoveConfig) singleFieldBuilderV3.getMessage();
                }
                MoveConfig moveConfig = this.f9186o;
                return moveConfig == null ? MoveConfig.m8175i() : moveConfig;
            }

            public C7214b() {
                this.f9181j = "";
                this.f9182k = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public C7214b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9181j = "";
                this.f9182k = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        public Header(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9157b = 0;
            this.f9158c = 0;
            this.f9159d = 0;
            this.f9160e = 0L;
            this.f9161f = 0L;
            this.f9162g = 0L;
            this.f9164i = "";
            this.f9166k = 0;
            this.f9167l = 0;
            this.f9171p = (byte) -1;
        }

        private Header() {
            this.f9157b = 0;
            this.f9158c = 0;
            this.f9159d = 0;
            this.f9160e = 0L;
            this.f9161f = 0L;
            this.f9162g = 0L;
            this.f9164i = "";
            this.f9166k = 0;
            this.f9167l = 0;
            this.f9171p = (byte) -1;
            this.f9164i = "";
            this.f9165j = Collections.EMPTY_LIST;
        }
    }

    public static final class MoveConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final MoveConfig f9192i = new MoveConfig();

        /* renamed from: j */
        public static final Parser f9193j = new C7215a();

        /* renamed from: a */
        public boolean f9194a;

        /* renamed from: b */
        public boolean f9195b;

        /* renamed from: c */
        public boolean f9196c;

        /* renamed from: d */
        public boolean f9197d;

        /* renamed from: e */
        public boolean f9198e;

        /* renamed from: f */
        public int f9199f;

        /* renamed from: g */
        public int f9200g;

        /* renamed from: h */
        public byte f9201h;

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$a */
        public class C7215a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MoveConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7216b c7216bM8176r = MoveConfig.m8176r();
                try {
                    c7216bM8176r.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7216bM8176r.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7216bM8176r.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7216bM8176r.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7216bM8176r.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9119c;
        }

        /* renamed from: i */
        public static MoveConfig m8175i() {
            return f9192i;
        }

        /* renamed from: r */
        public static C7216b m8176r() {
            return f9192i.toBuilder();
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
            return m8179l() == moveConfig.m8179l() && m8184q() == moveConfig.m8184q() && m8178k() == moveConfig.m8178k() && m8183p() == moveConfig.m8183p() && m8182o() == moveConfig.m8182o() && m8180m() == moveConfig.m8180m() && m8181n() == moveConfig.m8181n() && getUnknownFields().equals(moveConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9193j;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            boolean z10 = this.f9194a;
            int iComputeBoolSize = z10 ? CodedOutputStream.computeBoolSize(1, z10) : 0;
            boolean z11 = this.f9195b;
            if (z11) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z11);
            }
            boolean z12 = this.f9196c;
            if (z12) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, z12);
            }
            boolean z13 = this.f9197d;
            if (z13) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, z13);
            }
            boolean z14 = this.f9198e;
            if (z14) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, z14);
            }
            int i11 = this.f9199f;
            if (i11 != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(6, i11);
            }
            int i12 = this.f9200g;
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
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(m8179l())) * 37) + 2) * 53) + Internal.hashBoolean(m8184q())) * 37) + 3) * 53) + Internal.hashBoolean(m8178k())) * 37) + 4) * 53) + Internal.hashBoolean(m8183p())) * 37) + 5) * 53) + Internal.hashBoolean(m8182o())) * 37) + 6) * 53) + m8180m()) * 37) + 7) * 53) + m8181n()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9120d.ensureFieldAccessorsInitialized(MoveConfig.class, C7216b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9201h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9201h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public MoveConfig getDefaultInstanceForType() {
            return f9192i;
        }

        /* renamed from: k */
        public boolean m8178k() {
            return this.f9196c;
        }

        /* renamed from: l */
        public boolean m8179l() {
            return this.f9194a;
        }

        /* renamed from: m */
        public int m8180m() {
            return this.f9199f;
        }

        /* renamed from: n */
        public int m8181n() {
            return this.f9200g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MoveConfig();
        }

        /* renamed from: o */
        public boolean m8182o() {
            return this.f9198e;
        }

        /* renamed from: p */
        public boolean m8183p() {
            return this.f9197d;
        }

        /* renamed from: q */
        public boolean m8184q() {
            return this.f9195b;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C7216b newBuilderForType() {
            return m8176r();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C7216b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7216b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7216b toBuilder() {
            return this == f9192i ? new C7216b() : new C7216b().m8200o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            boolean z10 = this.f9194a;
            if (z10) {
                codedOutputStream.writeBool(1, z10);
            }
            boolean z11 = this.f9195b;
            if (z11) {
                codedOutputStream.writeBool(2, z11);
            }
            boolean z12 = this.f9196c;
            if (z12) {
                codedOutputStream.writeBool(3, z12);
            }
            boolean z13 = this.f9197d;
            if (z13) {
                codedOutputStream.writeBool(4, z13);
            }
            boolean z14 = this.f9198e;
            if (z14) {
                codedOutputStream.writeBool(5, z14);
            }
            int i10 = this.f9199f;
            if (i10 != 0) {
                codedOutputStream.writeInt32(6, i10);
            }
            int i11 = this.f9200g;
            if (i11 != 0) {
                codedOutputStream.writeInt32(7, i11);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$b */
        public static final class C7216b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9202a;

            /* renamed from: b */
            public boolean f9203b;

            /* renamed from: c */
            public boolean f9204c;

            /* renamed from: d */
            public boolean f9205d;

            /* renamed from: e */
            public boolean f9206e;

            /* renamed from: f */
            public boolean f9207f;

            /* renamed from: g */
            public int f9208g;

            /* renamed from: h */
            public int f9209h;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7216b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7216b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public MoveConfig build() {
                MoveConfig moveConfigBuildPartial = buildPartial();
                if (moveConfigBuildPartial.isInitialized()) {
                    return moveConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) moveConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public MoveConfig buildPartial() {
                MoveConfig moveConfig = new MoveConfig(this);
                if (this.f9202a != 0) {
                    m8192g(moveConfig);
                }
                onBuilt();
                return moveConfig;
            }

            /* renamed from: g */
            public final void m8192g(MoveConfig moveConfig) {
                int i10 = this.f9202a;
                if ((i10 & 1) != 0) {
                    moveConfig.f9194a = this.f9203b;
                }
                if ((i10 & 2) != 0) {
                    moveConfig.f9195b = this.f9204c;
                }
                if ((i10 & 4) != 0) {
                    moveConfig.f9196c = this.f9205d;
                }
                if ((i10 & 8) != 0) {
                    moveConfig.f9197d = this.f9206e;
                }
                if ((i10 & 16) != 0) {
                    moveConfig.f9198e = this.f9207f;
                }
                if ((i10 & 32) != 0) {
                    moveConfig.f9199f = this.f9208g;
                }
                if ((i10 & 64) != 0) {
                    moveConfig.f9200g = this.f9209h;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9119c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7216b clear() {
                super.clear();
                this.f9202a = 0;
                this.f9203b = false;
                this.f9204c = false;
                this.f9205d = false;
                this.f9206e = false;
                this.f9207f = false;
                this.f9208g = 0;
                this.f9209h = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7216b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7216b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9120d.ensureFieldAccessorsInitialized(MoveConfig.class, C7216b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7216b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7216b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7216b mo27381clone() {
                return (C7216b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public MoveConfig getDefaultInstanceForType() {
                return MoveConfig.m8175i();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7216b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f9203b = codedInputStream.readBool();
                                    this.f9202a |= 1;
                                } else if (tag == 16) {
                                    this.f9204c = codedInputStream.readBool();
                                    this.f9202a |= 2;
                                } else if (tag == 24) {
                                    this.f9205d = codedInputStream.readBool();
                                    this.f9202a |= 4;
                                } else if (tag == 32) {
                                    this.f9206e = codedInputStream.readBool();
                                    this.f9202a |= 8;
                                } else if (tag == 40) {
                                    this.f9207f = codedInputStream.readBool();
                                    this.f9202a |= 16;
                                } else if (tag == 48) {
                                    this.f9208g = codedInputStream.readInt32();
                                    this.f9202a |= 32;
                                } else if (tag == 56) {
                                    this.f9209h = codedInputStream.readInt32();
                                    this.f9202a |= 64;
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
            public C7216b mergeFrom(Message message) {
                if (message instanceof MoveConfig) {
                    return m8200o((MoveConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7216b m8200o(MoveConfig moveConfig) {
                if (moveConfig == MoveConfig.m8175i()) {
                    return this;
                }
                if (moveConfig.m8179l()) {
                    m8204s(moveConfig.m8179l());
                }
                if (moveConfig.m8184q()) {
                    m8211z(moveConfig.m8184q());
                }
                if (moveConfig.m8178k()) {
                    m8203r(moveConfig.m8178k());
                }
                if (moveConfig.m8183p()) {
                    m8209x(moveConfig.m8183p());
                }
                if (moveConfig.m8182o()) {
                    m8208w(moveConfig.m8182o());
                }
                if (moveConfig.m8180m() != 0) {
                    m8205t(moveConfig.m8180m());
                }
                if (moveConfig.m8181n() != 0) {
                    m8206u(moveConfig.m8181n());
                }
                mergeUnknownFields(moveConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7216b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7216b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7216b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7216b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C7216b m8203r(boolean z10) {
                this.f9205d = z10;
                this.f9202a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C7216b m8204s(boolean z10) {
                this.f9203b = z10;
                this.f9202a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C7216b m8205t(int i10) {
                this.f9208g = i10;
                this.f9202a |= 32;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7216b m8206u(int i10) {
                this.f9209h = i10;
                this.f9202a |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7216b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7216b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: w */
            public C7216b m8208w(boolean z10) {
                this.f9207f = z10;
                this.f9202a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C7216b m8209x(boolean z10) {
                this.f9206e = z10;
                this.f9202a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public final C7216b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7216b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: z */
            public C7216b m8211z(boolean z10) {
                this.f9204c = z10;
                this.f9202a |= 2;
                onChanged();
                return this;
            }

            public C7216b() {
            }

            public C7216b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public MoveConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9194a = false;
            this.f9195b = false;
            this.f9196c = false;
            this.f9197d = false;
            this.f9198e = false;
            this.f9199f = 0;
            this.f9200g = 0;
            this.f9201h = (byte) -1;
        }

        private MoveConfig() {
            this.f9194a = false;
            this.f9195b = false;
            this.f9196c = false;
            this.f9197d = false;
            this.f9198e = false;
            this.f9199f = 0;
            this.f9200g = 0;
            this.f9201h = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7996i().getMessageTypes().get(0);
        f9117a = descriptor;
        f9118b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Duration", "Author", "ConvertUrl", "Provider", "DefaultBackgroundColor", "LastBackgroundColor", "MoveConfig", "DefaultBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor2 = m7996i().getMessageTypes().get(1);
        f9119c = descriptor2;
        f9120d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IsEnable", "VerticalTranslate", "HorizontalTranslate", "Scale", "Rotate", "MaxHeightTimes", "MaxWidthTimes"});
        Descriptors.Descriptor descriptor3 = m7996i().getMessageTypes().get(2);
        f9121e = descriptor3;
        f9122f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"LineColor", "LineSpace", "LineType", "LineWidth"});
        Descriptors.Descriptor descriptor4 = m7996i().getMessageTypes().get(3);
        f9123g = descriptor4;
        f9124h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AuthorName", "SchoolId", "AuthorId", "Url", "StartTime", "Duration"});
        EzyPageRouter.m8273e();
        EzyBackgroundLineTypeEnum.m7397a();
    }

    /* renamed from: i */
    public static Descriptors.FileDescriptor m7996i() {
        return f9125i;
    }
}

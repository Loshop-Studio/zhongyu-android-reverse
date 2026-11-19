package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.p071uc.crashsdk.export.ExitType;
import com.taobao.sophix.PatchStatus;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzyHeader {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9390a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9391b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9392c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9393d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9394e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9395f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f9396g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f9397h;

    /* renamed from: i */
    public static Descriptors.FileDescriptor f9398i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fHeader.proto\u001a\u0010PageRouter.proto\u001a\"enums/BackgroundLineTypeEnum.proto\"\u008d\u0003\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003\u0012\u0017\n\u0006author\u0018\u0007 \u0001(\u000b2\u0007.Author\u0012\u0012\n\nconvertUrl\u0018\b \u0001(\t\u0012\u0019\n\bprovider\u0018\t \u0003(\u000b2\u0007.Author\u0012\u001e\n\u0016defaultBackgroundColor\u0018\n \u0001(\u0005\u0012\u001b\n\u0013lastBackgroundColor\u0018\u000b \u0001(\u0005\u0012\u001f\n\nmoveConfig\u0018\f \u0001(\u000b2\u000b.MoveConfig\u0012:\n\u001bdefaultBackgroundLineConfig\u0018\r \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u000e \u0001(\u000b2\u0015.BackgroundLineConfig\"¤\u0001\n\nMoveConfig\u0012\u0010\n\bisEnable\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011verticalTranslate\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013horizontalTranslate\u0018\u0003 \u0001(\b\u0012\r\n\u0005scale\u0018\u0004 \u0001(\b\u0012\u000e\n\u0006rotate\u0018\u0005 \u0001(\b\u0012\u0016\n\u000emaxHeightTimes\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rmaxWidthTimes\u0018\u0007 \u0001(\u0005\"z\n\u0014BackgroundLineConfig\u0012\u0011\n\tlineColor\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tlineSpace\u0018\u0002 \u0001(\u0002\u0012)\n\blineType\u0018\u0003 \u0001(\u000e2\u0017.BackgroundLineTypeEnum\u0012\u0011\n\tlineWidth\u0018\u0004 \u0001(\u0002\"r\n\u0006Author\u0012\u0012\n\nauthorName\u0018\u0001 \u0001(\t\u0012\u0010\n\bschoolId\u0018\u0002 \u0001(\t\u0012\u0010\n\bauthorId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003B\u001b\n\u000ecom.zykj.boardB\tEzyHeaderb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyPageRouter.m8898e(), EzyBackgroundLineTypeEnum.m8023a()});

    public static final class Author extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: h */
        public static final Author f9399h = new Author();

        /* renamed from: i */
        public static final Parser f9400i = new C7099a();

        /* renamed from: a */
        public volatile Object f9401a;

        /* renamed from: b */
        public volatile Object f9402b;

        /* renamed from: c */
        public volatile Object f9403c;

        /* renamed from: d */
        public volatile Object f9404d;

        /* renamed from: e */
        public long f9405e;

        /* renamed from: f */
        public long f9406f;

        /* renamed from: g */
        public byte f9407g;

        /* renamed from: com.zykj.board.EzyHeader$Author$a */
        public class C7099a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Author parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7100b c7100bM8622E = Author.m8622E();
                try {
                    c7100bM8622E.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7100bM8622E.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7100bM8622E.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7100bM8622E.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7100bM8622E.buildPartial());
                }
            }
        }

        /* renamed from: E */
        public static C7100b m8622E() {
            return f9399h.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9396g;
        }

        public static Parser parser() {
            return f9400i;
        }

        /* renamed from: z */
        public static Author m8633z() {
            return f9399h;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Author getDefaultInstanceForType() {
            return f9399h;
        }

        /* renamed from: B */
        public long m8635B() {
            return this.f9406f;
        }

        /* renamed from: C */
        public String m8636C() {
            Object obj = this.f9402b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9402b = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: D */
        public String m8637D() {
            Object obj = this.f9404d;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9404d = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C7100b newBuilderForType() {
            return m8622E();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C7100b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7100b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public C7100b toBuilder() {
            return this == f9399h ? new C7100b() : new C7100b().m8655o(this);
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
            return m8642y().equals(author.m8642y()) && m8636C().equals(author.m8636C()) && m8641x().equals(author.m8641x()) && m8637D().equals(author.m8637D()) && getStartTime() == author.getStartTime() && m8635B() == author.m8635B() && getUnknownFields().equals(author.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9400i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9401a) ? GeneratedMessageV3.computeStringSize(1, this.f9401a) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.f9402b)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f9402b);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9403c)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f9403c);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9404d)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f9404d);
            }
            long j9 = this.f9405e;
            if (j9 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(5, j9);
            }
            long j10 = this.f9406f;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(6, j10);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getStartTime() {
            return this.f9405e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8642y().hashCode()) * 37) + 2) * 53) + m8636C().hashCode()) * 37) + 3) * 53) + m8641x().hashCode()) * 37) + 4) * 53) + m8637D().hashCode()) * 37) + 5) * 53) + Internal.hashLong(getStartTime())) * 37) + 6) * 53) + Internal.hashLong(m8635B())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9397h.ensureFieldAccessorsInitialized(Author.class, C7100b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9407g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9407g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Author();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f9401a)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9401a);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9402b)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f9402b);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9403c)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f9403c);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9404d)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9404d);
            }
            long j9 = this.f9405e;
            if (j9 != 0) {
                codedOutputStream.writeInt64(5, j9);
            }
            long j10 = this.f9406f;
            if (j10 != 0) {
                codedOutputStream.writeInt64(6, j10);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: x */
        public String m8641x() {
            Object obj = this.f9403c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9403c = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: y */
        public String m8642y() {
            Object obj = this.f9401a;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9401a = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: com.zykj.board.EzyHeader$Author$b */
        public static final class C7100b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9408a;

            /* renamed from: b */
            public Object f9409b;

            /* renamed from: c */
            public Object f9410c;

            /* renamed from: d */
            public Object f9411d;

            /* renamed from: e */
            public Object f9412e;

            /* renamed from: f */
            public long f9413f;

            /* renamed from: g */
            public long f9414g;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7100b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7100b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f9408a != 0) {
                    m8647f(author);
                }
                onBuilt();
                return author;
            }

            /* renamed from: f */
            public final void m8647f(Author author) {
                int i9 = this.f9408a;
                if ((i9 & 1) != 0) {
                    author.f9401a = this.f9409b;
                }
                if ((i9 & 2) != 0) {
                    author.f9402b = this.f9410c;
                }
                if ((i9 & 4) != 0) {
                    author.f9403c = this.f9411d;
                }
                if ((i9 & 8) != 0) {
                    author.f9404d = this.f9412e;
                }
                if ((i9 & 16) != 0) {
                    author.f9405e = this.f9413f;
                }
                if ((i9 & 32) != 0) {
                    author.f9406f = this.f9414g;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7100b clear() {
                super.clear();
                this.f9408a = 0;
                this.f9409b = "";
                this.f9410c = "";
                this.f9411d = "";
                this.f9412e = "";
                this.f9413f = 0L;
                this.f9414g = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9396g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7100b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7100b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7100b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7100b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9397h.ensureFieldAccessorsInitialized(Author.class, C7100b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7100b mo24685clone() {
                return (C7100b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public Author getDefaultInstanceForType() {
                return Author.m8633z();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7100b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f9409b = codedInputStream.readStringRequireUtf8();
                                    this.f9408a |= 1;
                                } else if (tag == 18) {
                                    this.f9410c = codedInputStream.readStringRequireUtf8();
                                    this.f9408a |= 2;
                                } else if (tag == 26) {
                                    this.f9411d = codedInputStream.readStringRequireUtf8();
                                    this.f9408a |= 4;
                                } else if (tag == 34) {
                                    this.f9412e = codedInputStream.readStringRequireUtf8();
                                    this.f9408a |= 8;
                                } else if (tag == 40) {
                                    this.f9413f = codedInputStream.readInt64();
                                    this.f9408a |= 16;
                                } else if (tag == 48) {
                                    this.f9414g = codedInputStream.readInt64();
                                    this.f9408a |= 32;
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
            public C7100b mergeFrom(Message message) {
                if (message instanceof Author) {
                    return m8655o((Author) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7100b m8655o(Author author) {
                if (author == Author.m8633z()) {
                    return this;
                }
                if (!author.m8642y().isEmpty()) {
                    this.f9409b = author.f9401a;
                    this.f9408a |= 1;
                    onChanged();
                }
                if (!author.m8636C().isEmpty()) {
                    this.f9410c = author.f9402b;
                    this.f9408a |= 2;
                    onChanged();
                }
                if (!author.m8641x().isEmpty()) {
                    this.f9411d = author.f9403c;
                    this.f9408a |= 4;
                    onChanged();
                }
                if (!author.m8637D().isEmpty()) {
                    this.f9412e = author.f9404d;
                    this.f9408a |= 8;
                    onChanged();
                }
                if (author.getStartTime() != 0) {
                    m8663w(author.getStartTime());
                }
                if (author.m8635B() != 0) {
                    m8659s(author.m8635B());
                }
                mergeUnknownFields(author.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7100b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7100b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: q */
            public C7100b m8657q(String str) {
                str.getClass();
                this.f9411d = str;
                this.f9408a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: r */
            public C7100b m8658r(String str) {
                str.getClass();
                this.f9409b = str;
                this.f9408a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C7100b m8659s(long j9) {
                this.f9414g = j9;
                this.f9408a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7100b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7100b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7100b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7100b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            /* renamed from: v */
            public C7100b m8662v(String str) {
                str.getClass();
                this.f9410c = str;
                this.f9408a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: w */
            public C7100b m8663w(long j9) {
                this.f9413f = j9;
                this.f9408a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7100b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7100b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: y */
            public C7100b m8665y(String str) {
                str.getClass();
                this.f9412e = str;
                this.f9408a |= 8;
                onChanged();
                return this;
            }

            public C7100b() {
                this.f9409b = "";
                this.f9410c = "";
                this.f9411d = "";
                this.f9412e = "";
            }

            public C7100b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9409b = "";
                this.f9410c = "";
                this.f9411d = "";
                this.f9412e = "";
            }
        }

        public Author(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9401a = "";
            this.f9402b = "";
            this.f9403c = "";
            this.f9404d = "";
            this.f9405e = 0L;
            this.f9406f = 0L;
            this.f9407g = (byte) -1;
        }

        private Author() {
            this.f9401a = "";
            this.f9402b = "";
            this.f9403c = "";
            this.f9404d = "";
            this.f9405e = 0L;
            this.f9406f = 0L;
            this.f9407g = (byte) -1;
            this.f9401a = "";
            this.f9402b = "";
            this.f9403c = "";
            this.f9404d = "";
        }
    }

    public static final class BackgroundLineConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: f */
        public static final BackgroundLineConfig f9415f = new BackgroundLineConfig();

        /* renamed from: g */
        public static final Parser f9416g = new C7101a();

        /* renamed from: a */
        public int f9417a;

        /* renamed from: b */
        public float f9418b;

        /* renamed from: c */
        public int f9419c;

        /* renamed from: d */
        public float f9420d;

        /* renamed from: e */
        public byte f9421e;

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$a */
        public class C7101a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7102b c7102bM8672z = BackgroundLineConfig.m8672z();
                try {
                    c7102bM8672z.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7102bM8672z.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7102bM8672z.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7102bM8672z.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7102bM8672z.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9394e;
        }

        /* renamed from: q */
        public static BackgroundLineConfig m8671q() {
            return f9415f;
        }

        /* renamed from: z */
        public static C7102b m8672z() {
            return f9415f.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C7102b newBuilderForType() {
            return m8672z();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public C7102b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7102b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public C7102b toBuilder() {
            return this == f9415f ? new C7102b() : new C7102b().m8694o(this);
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
            return m8677u() == backgroundLineConfig.m8677u() && Float.floatToIntBits(m8678v()) == Float.floatToIntBits(backgroundLineConfig.m8678v()) && this.f9419c == backgroundLineConfig.f9419c && Float.floatToIntBits(m8681y()) == Float.floatToIntBits(backgroundLineConfig.m8681y()) && getUnknownFields().equals(backgroundLineConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9416g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int i10 = this.f9417a;
            int iComputeInt32Size = i10 != 0 ? CodedOutputStream.computeInt32Size(1, i10) : 0;
            if (Float.floatToRawIntBits(this.f9418b) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(2, this.f9418b);
            }
            if (this.f9419c != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f9419c);
            }
            if (Float.floatToRawIntBits(this.f9420d) != 0) {
                iComputeInt32Size += CodedOutputStream.computeFloatSize(4, this.f9420d);
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8677u()) * 37) + 2) * 53) + Float.floatToIntBits(m8678v())) * 37) + 3) * 53) + this.f9419c) * 37) + 4) * 53) + Float.floatToIntBits(m8681y())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9395f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C7102b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9421e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9421e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BackgroundLineConfig();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public BackgroundLineConfig getDefaultInstanceForType() {
            return f9415f;
        }

        /* renamed from: u */
        public int m8677u() {
            return this.f9417a;
        }

        /* renamed from: v */
        public float m8678v() {
            return this.f9418b;
        }

        /* renamed from: w */
        public EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m8679w() {
            EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM8025c = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m8025c(this.f9419c);
            return backgroundLineTypeEnumM8025c == null ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.UNRECOGNIZED : backgroundLineTypeEnumM8025c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i9 = this.f9417a;
            if (i9 != 0) {
                codedOutputStream.writeInt32(1, i9);
            }
            if (Float.floatToRawIntBits(this.f9418b) != 0) {
                codedOutputStream.writeFloat(2, this.f9418b);
            }
            if (this.f9419c != EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL.getNumber()) {
                codedOutputStream.writeEnum(3, this.f9419c);
            }
            if (Float.floatToRawIntBits(this.f9420d) != 0) {
                codedOutputStream.writeFloat(4, this.f9420d);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: x */
        public int m8680x() {
            return this.f9419c;
        }

        /* renamed from: y */
        public float m8681y() {
            return this.f9420d;
        }

        /* renamed from: com.zykj.board.EzyHeader$BackgroundLineConfig$b */
        public static final class C7102b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9422a;

            /* renamed from: b */
            public int f9423b;

            /* renamed from: c */
            public float f9424c;

            /* renamed from: d */
            public int f9425d;

            /* renamed from: e */
            public float f9426e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7102b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7102b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f9422a != 0) {
                    m8686f(backgroundLineConfig);
                }
                onBuilt();
                return backgroundLineConfig;
            }

            /* renamed from: f */
            public final void m8686f(BackgroundLineConfig backgroundLineConfig) {
                int i9 = this.f9422a;
                if ((i9 & 1) != 0) {
                    backgroundLineConfig.f9417a = this.f9423b;
                }
                if ((i9 & 2) != 0) {
                    backgroundLineConfig.f9418b = this.f9424c;
                }
                if ((i9 & 4) != 0) {
                    backgroundLineConfig.f9419c = this.f9425d;
                }
                if ((i9 & 8) != 0) {
                    backgroundLineConfig.f9420d = this.f9426e;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7102b clear() {
                super.clear();
                this.f9422a = 0;
                this.f9423b = 0;
                this.f9424c = 0.0f;
                this.f9425d = 0;
                this.f9426e = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9394e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7102b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7102b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7102b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7102b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9395f.ensureFieldAccessorsInitialized(BackgroundLineConfig.class, C7102b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7102b mo24685clone() {
                return (C7102b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public BackgroundLineConfig getDefaultInstanceForType() {
                return BackgroundLineConfig.m8671q();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7102b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f9423b = codedInputStream.readInt32();
                                    this.f9422a |= 1;
                                } else if (tag == 21) {
                                    this.f9424c = codedInputStream.readFloat();
                                    this.f9422a |= 2;
                                } else if (tag == 24) {
                                    this.f9425d = codedInputStream.readEnum();
                                    this.f9422a |= 4;
                                } else if (tag == 37) {
                                    this.f9426e = codedInputStream.readFloat();
                                    this.f9422a |= 8;
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
            public C7102b mergeFrom(Message message) {
                if (message instanceof BackgroundLineConfig) {
                    return m8694o((BackgroundLineConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7102b m8694o(BackgroundLineConfig backgroundLineConfig) {
                if (backgroundLineConfig == BackgroundLineConfig.m8671q()) {
                    return this;
                }
                if (backgroundLineConfig.m8677u() != 0) {
                    m8697r(backgroundLineConfig.m8677u());
                }
                if (backgroundLineConfig.m8678v() != 0.0f) {
                    m8698s(backgroundLineConfig.m8678v());
                }
                if (backgroundLineConfig.f9419c != 0) {
                    m8700u(backgroundLineConfig.m8680x());
                }
                if (backgroundLineConfig.m8681y() != 0.0f) {
                    m8701v(backgroundLineConfig.m8681y());
                }
                mergeUnknownFields(backgroundLineConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7102b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7102b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7102b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7102b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C7102b m8697r(int i9) {
                this.f9423b = i9;
                this.f9422a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C7102b m8698s(float f10) {
                this.f9424c = f10;
                this.f9422a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C7102b m8699t(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
                backgroundLineTypeEnum.getClass();
                this.f9422a |= 4;
                this.f9425d = backgroundLineTypeEnum.getNumber();
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7102b m8700u(int i9) {
                this.f9425d = i9;
                this.f9422a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7102b m8701v(float f10) {
                this.f9426e = f10;
                this.f9422a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7102b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7102b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7102b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7102b) super.setUnknownFields(unknownFieldSet);
            }

            public C7102b() {
                this.f9425d = 0;
            }

            public C7102b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9425d = 0;
            }
        }

        public BackgroundLineConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9417a = 0;
            this.f9418b = 0.0f;
            this.f9419c = 0;
            this.f9420d = 0.0f;
            this.f9421e = (byte) -1;
        }

        private BackgroundLineConfig() {
            this.f9417a = 0;
            this.f9418b = 0.0f;
            this.f9420d = 0.0f;
            this.f9421e = (byte) -1;
            this.f9419c = 0;
        }
    }

    public static final class Header extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: q */
        public static final Header f9427q = new Header();

        /* renamed from: r */
        public static final Parser f9428r = new C7103a();

        /* renamed from: a */
        public int f9429a;

        /* renamed from: b */
        public int f9430b;

        /* renamed from: c */
        public int f9431c;

        /* renamed from: d */
        public int f9432d;

        /* renamed from: e */
        public long f9433e;

        /* renamed from: f */
        public long f9434f;

        /* renamed from: g */
        public long f9435g;

        /* renamed from: h */
        public Author f9436h;

        /* renamed from: i */
        public volatile Object f9437i;

        /* renamed from: j */
        public List f9438j;

        /* renamed from: k */
        public int f9439k;

        /* renamed from: l */
        public int f9440l;

        /* renamed from: m */
        public MoveConfig f9441m;

        /* renamed from: n */
        public BackgroundLineConfig f9442n;

        /* renamed from: o */
        public BackgroundLineConfig f9443o;

        /* renamed from: p */
        public byte f9444p;

        /* renamed from: com.zykj.board.EzyHeader$Header$a */
        public class C7103a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Header parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7104b c7104bM8710V = Header.m8710V();
                try {
                    c7104bM8710V.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7104bM8710V.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7104bM8710V.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7104bM8710V.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7104bM8710V.buildPartial());
                }
            }
        }

        /* renamed from: J */
        public static Header m8709J() {
            return f9427q;
        }

        /* renamed from: V */
        public static C7104b m8710V() {
            return f9427q.toBuilder();
        }

        /* renamed from: Y */
        public static Header m8711Y(InputStream inputStream) {
            return (Header) GeneratedMessageV3.parseWithIOException(f9428r, inputStream);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9390a;
        }

        /* renamed from: y */
        public static /* synthetic */ int m8723y(Header header, int i9) {
            int i10 = i9 | header.f9429a;
            header.f9429a = i10;
            return i10;
        }

        /* renamed from: F */
        public Author m8725F() {
            Author author = this.f9436h;
            return author == null ? Author.m8633z() : author;
        }

        /* renamed from: G */
        public String m8726G() {
            Object obj = this.f9437i;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f9437i = stringUtf8;
            return stringUtf8;
        }

        /* renamed from: H */
        public int m8727H() {
            return this.f9439k;
        }

        /* renamed from: I */
        public BackgroundLineConfig m8728I() {
            BackgroundLineConfig backgroundLineConfig = this.f9442n;
            return backgroundLineConfig == null ? BackgroundLineConfig.m8671q() : backgroundLineConfig;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public Header getDefaultInstanceForType() {
            return f9427q;
        }

        /* renamed from: L */
        public long m8730L() {
            return this.f9435g;
        }

        /* renamed from: M */
        public int m8731M() {
            return this.f9440l;
        }

        /* renamed from: N */
        public BackgroundLineConfig m8732N() {
            BackgroundLineConfig backgroundLineConfig = this.f9443o;
            return backgroundLineConfig == null ? BackgroundLineConfig.m8671q() : backgroundLineConfig;
        }

        /* renamed from: O */
        public MoveConfig m8733O() {
            MoveConfig moveConfig = this.f9441m;
            return moveConfig == null ? MoveConfig.m8800u() : moveConfig;
        }

        /* renamed from: P */
        public int m8734P() {
            return this.f9438j.size();
        }

        /* renamed from: Q */
        public List m8735Q() {
            return this.f9438j;
        }

        /* renamed from: R */
        public boolean m8736R() {
            return (this.f9429a & 1) != 0;
        }

        /* renamed from: S */
        public boolean m8737S() {
            return (this.f9429a & 4) != 0;
        }

        /* renamed from: T */
        public boolean m8738T() {
            return (this.f9429a & 8) != 0;
        }

        /* renamed from: U */
        public boolean m8739U() {
            return (this.f9429a & 2) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public C7104b newBuilderForType() {
            return m8710V();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public C7104b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7104b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public C7104b toBuilder() {
            return this == f9427q ? new C7104b() : new C7104b().m8751G(this);
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
            if (getVersion() != header.getVersion() || getWidth() != header.getWidth() || getHeight() != header.getHeight() || getCreateDate() != header.getCreateDate() || getUpdateDate() != header.getUpdateDate() || m8730L() != header.m8730L() || m8736R() != header.m8736R()) {
                return false;
            }
            if ((m8736R() && !m8725F().equals(header.m8725F())) || !m8726G().equals(header.m8726G()) || !m8735Q().equals(header.m8735Q()) || m8727H() != header.m8727H() || m8731M() != header.m8731M() || m8739U() != header.m8739U()) {
                return false;
            }
            if ((m8739U() && !m8733O().equals(header.m8733O())) || m8737S() != header.m8737S()) {
                return false;
            }
            if ((!m8737S() || m8728I().equals(header.m8728I())) && m8738T() == header.m8738T()) {
                return (!m8738T() || m8732N().equals(header.m8732N())) && getUnknownFields().equals(header.getUnknownFields());
            }
            return false;
        }

        public long getCreateDate() {
            return this.f9433e;
        }

        public int getHeight() {
            return this.f9432d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9428r;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int i10 = this.f9430b;
            int iComputeInt32Size = i10 != 0 ? CodedOutputStream.computeInt32Size(1, i10) : 0;
            int i11 = this.f9431c;
            if (i11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i11);
            }
            int i12 = this.f9432d;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i12);
            }
            long j9 = this.f9433e;
            if (j9 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j9);
            }
            long j10 = this.f9434f;
            if (j10 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j10);
            }
            long j11 = this.f9435g;
            if (j11 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j11);
            }
            if ((1 & this.f9429a) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, m8725F());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9437i)) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(8, this.f9437i);
            }
            for (int i13 = 0; i13 < this.f9438j.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f9438j.get(i13));
            }
            int i14 = this.f9439k;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, i14);
            }
            int i15 = this.f9440l;
            if (i15 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, i15);
            }
            if ((this.f9429a & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, m8733O());
            }
            if ((this.f9429a & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, m8728I());
            }
            if ((this.f9429a & 8) != 0) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(14, m8732N());
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getUpdateDate() {
            return this.f9434f;
        }

        public int getVersion() {
            return this.f9430b;
        }

        public int getWidth() {
            return this.f9431c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + Internal.hashLong(getCreateDate())) * 37) + 5) * 53) + Internal.hashLong(getUpdateDate())) * 37) + 6) * 53) + Internal.hashLong(m8730L());
            if (m8736R()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m8725F().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 8) * 53) + m8726G().hashCode();
            if (m8734P() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m8735Q().hashCode();
            }
            int iM8727H = (((((((iHashCode2 * 37) + 10) * 53) + m8727H()) * 37) + 11) * 53) + m8731M();
            if (m8739U()) {
                iM8727H = (((iM8727H * 37) + 12) * 53) + m8733O().hashCode();
            }
            if (m8737S()) {
                iM8727H = (((iM8727H * 37) + 13) * 53) + m8728I().hashCode();
            }
            if (m8738T()) {
                iM8727H = (((iM8727H * 37) + 14) * 53) + m8732N().hashCode();
            }
            int iHashCode3 = (iM8727H * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9391b.ensureFieldAccessorsInitialized(Header.class, C7104b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9444p;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9444p = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Header();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i9 = this.f9430b;
            if (i9 != 0) {
                codedOutputStream.writeInt32(1, i9);
            }
            int i10 = this.f9431c;
            if (i10 != 0) {
                codedOutputStream.writeInt32(2, i10);
            }
            int i11 = this.f9432d;
            if (i11 != 0) {
                codedOutputStream.writeInt32(3, i11);
            }
            long j9 = this.f9433e;
            if (j9 != 0) {
                codedOutputStream.writeInt64(4, j9);
            }
            long j10 = this.f9434f;
            if (j10 != 0) {
                codedOutputStream.writeInt64(5, j10);
            }
            long j11 = this.f9435g;
            if (j11 != 0) {
                codedOutputStream.writeInt64(6, j11);
            }
            if ((this.f9429a & 1) != 0) {
                codedOutputStream.writeMessage(7, m8725F());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f9437i)) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.f9437i);
            }
            for (int i12 = 0; i12 < this.f9438j.size(); i12++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.f9438j.get(i12));
            }
            int i13 = this.f9439k;
            if (i13 != 0) {
                codedOutputStream.writeInt32(10, i13);
            }
            int i14 = this.f9440l;
            if (i14 != 0) {
                codedOutputStream.writeInt32(11, i14);
            }
            if ((this.f9429a & 2) != 0) {
                codedOutputStream.writeMessage(12, m8733O());
            }
            if ((this.f9429a & 4) != 0) {
                codedOutputStream.writeMessage(13, m8728I());
            }
            if ((this.f9429a & 8) != 0) {
                codedOutputStream.writeMessage(14, m8732N());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyHeader$Header$b */
        public static final class C7104b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9445a;

            /* renamed from: b */
            public int f9446b;

            /* renamed from: c */
            public int f9447c;

            /* renamed from: d */
            public int f9448d;

            /* renamed from: e */
            public long f9449e;

            /* renamed from: f */
            public long f9450f;

            /* renamed from: g */
            public long f9451g;

            /* renamed from: h */
            public Author f9452h;

            /* renamed from: i */
            public SingleFieldBuilderV3 f9453i;

            /* renamed from: j */
            public Object f9454j;

            /* renamed from: k */
            public List f9455k;

            /* renamed from: l */
            public RepeatedFieldBuilderV3 f9456l;

            /* renamed from: m */
            public int f9457m;

            /* renamed from: n */
            public int f9458n;

            /* renamed from: o */
            public MoveConfig f9459o;

            /* renamed from: p */
            public SingleFieldBuilderV3 f9460p;

            /* renamed from: q */
            public BackgroundLineConfig f9461q;

            /* renamed from: r */
            public SingleFieldBuilderV3 f9462r;

            /* renamed from: s */
            public BackgroundLineConfig f9463s;

            /* renamed from: t */
            public SingleFieldBuilderV3 f9464t;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m8783q();
                    m8746B();
                    m8745A();
                    m8786t();
                    m8744x();
                }
            }

            /* renamed from: x */
            private SingleFieldBuilderV3 m8744x() {
                if (this.f9464t == null) {
                    this.f9464t = new SingleFieldBuilderV3(m8788v(), getParentForChildren(), isClean());
                    this.f9463s = null;
                }
                return this.f9464t;
            }

            /* renamed from: A */
            public final SingleFieldBuilderV3 m8745A() {
                if (this.f9460p == null) {
                    this.f9460p = new SingleFieldBuilderV3(m8790y(), getParentForChildren(), isClean());
                    this.f9459o = null;
                }
                return this.f9460p;
            }

            /* renamed from: B */
            public final RepeatedFieldBuilderV3 m8746B() {
                if (this.f9456l == null) {
                    this.f9456l = new RepeatedFieldBuilderV3(this.f9455k, (this.f9445a & 256) != 0, getParentForChildren(), isClean());
                    this.f9455k = null;
                }
                return this.f9456l;
            }

            /* renamed from: C */
            public C7104b m8747C(Author author) {
                Author author2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9453i;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(author);
                } else if ((this.f9445a & 64) == 0 || (author2 = this.f9452h) == null || author2 == Author.m8633z()) {
                    this.f9452h = author;
                } else {
                    m8782p().m8655o(author);
                }
                if (this.f9452h != null) {
                    this.f9445a |= 64;
                    onChanged();
                }
                return this;
            }

            /* renamed from: D */
            public C7104b m8748D(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9462r;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f9445a & 4096) == 0 || (backgroundLineConfig2 = this.f9461q) == null || backgroundLineConfig2 == BackgroundLineConfig.m8671q()) {
                    this.f9461q = backgroundLineConfig;
                } else {
                    m8785s().m8694o(backgroundLineConfig);
                }
                if (this.f9461q != null) {
                    this.f9445a |= 4096;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public C7104b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    this.f9446b = codedInputStream.readInt32();
                                    this.f9445a |= 1;
                                case 16:
                                    this.f9447c = codedInputStream.readInt32();
                                    this.f9445a |= 2;
                                case 24:
                                    this.f9448d = codedInputStream.readInt32();
                                    this.f9445a |= 4;
                                case 32:
                                    this.f9449e = codedInputStream.readInt64();
                                    this.f9445a |= 8;
                                case 40:
                                    this.f9450f = codedInputStream.readInt64();
                                    this.f9445a |= 16;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                    this.f9451g = codedInputStream.readInt64();
                                    this.f9445a |= 32;
                                case 58:
                                    codedInputStream.readMessage(m8783q().getBuilder(), extensionRegistryLite);
                                    this.f9445a |= 64;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                    this.f9454j = codedInputStream.readStringRequireUtf8();
                                    this.f9445a |= 128;
                                case PatchStatus.CODE_LOAD_COPY_FILE /* 74 */:
                                    Author author = (Author) codedInputStream.readMessage(Author.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9456l;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8780n();
                                        this.f9455k.add(author);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(author);
                                    }
                                case PatchStatus.CODE_LOAD_DELETE_OPT /* 80 */:
                                    this.f9457m = codedInputStream.readInt32();
                                    this.f9445a |= 512;
                                case 88:
                                    this.f9458n = codedInputStream.readInt32();
                                    this.f9445a |= 1024;
                                case ExitType.UNEXP_BACKGROUND_CRASH /* 98 */:
                                    codedInputStream.readMessage(m8745A().getBuilder(), extensionRegistryLite);
                                    this.f9445a |= 2048;
                                case 106:
                                    codedInputStream.readMessage(m8786t().getBuilder(), extensionRegistryLite);
                                    this.f9445a |= 4096;
                                case 114:
                                    codedInputStream.readMessage(m8744x().getBuilder(), extensionRegistryLite);
                                    this.f9445a |= 8192;
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
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public C7104b mergeFrom(Message message) {
                if (message instanceof Header) {
                    return m8751G((Header) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: G */
            public C7104b m8751G(Header header) {
                if (header == Header.m8709J()) {
                    return this;
                }
                if (header.getVersion() != 0) {
                    m8768X(header.getVersion());
                }
                if (header.getWidth() != 0) {
                    m8769Y(header.getWidth());
                }
                if (header.getHeight() != 0) {
                    m8761Q(header.getHeight());
                }
                if (header.getCreateDate() != 0) {
                    m8756L(header.getCreateDate());
                }
                if (header.getUpdateDate() != 0) {
                    m8767W(header.getUpdateDate());
                }
                if (header.m8730L() != 0) {
                    m8759O(header.m8730L());
                }
                if (header.m8736R()) {
                    m8747C(header.m8725F());
                }
                if (!header.m8726G().isEmpty()) {
                    this.f9454j = header.f9437i;
                    this.f9445a |= 128;
                    onChanged();
                }
                if (this.f9456l == null) {
                    if (!header.f9438j.isEmpty()) {
                        if (this.f9455k.isEmpty()) {
                            this.f9455k = header.f9438j;
                            this.f9445a &= -257;
                        } else {
                            m8780n();
                            this.f9455k.addAll(header.f9438j);
                        }
                        onChanged();
                    }
                } else if (!header.f9438j.isEmpty()) {
                    if (this.f9456l.isEmpty()) {
                        this.f9456l.dispose();
                        this.f9456l = null;
                        this.f9455k = header.f9438j;
                        this.f9445a &= -257;
                        this.f9456l = GeneratedMessageV3.alwaysUseFieldBuilders ? m8746B() : null;
                    } else {
                        this.f9456l.addAllMessages(header.f9438j);
                    }
                }
                if (header.m8727H() != 0) {
                    m8757M(header.m8727H());
                }
                if (header.m8731M() != 0) {
                    m8762R(header.m8731M());
                }
                if (header.m8739U()) {
                    m8753I(header.m8733O());
                }
                if (header.m8737S()) {
                    m8748D(header.m8728I());
                }
                if (header.m8738T()) {
                    m8752H(header.m8732N());
                }
                mergeUnknownFields(header.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: H */
            public C7104b m8752H(BackgroundLineConfig backgroundLineConfig) {
                BackgroundLineConfig backgroundLineConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9464t;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                } else if ((this.f9445a & 8192) == 0 || (backgroundLineConfig2 = this.f9463s) == null || backgroundLineConfig2 == BackgroundLineConfig.m8671q()) {
                    this.f9463s = backgroundLineConfig;
                } else {
                    m8789w().m8694o(backgroundLineConfig);
                }
                if (this.f9463s != null) {
                    this.f9445a |= 8192;
                    onChanged();
                }
                return this;
            }

            /* renamed from: I */
            public C7104b m8753I(MoveConfig moveConfig) {
                MoveConfig moveConfig2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9460p;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(moveConfig);
                } else if ((this.f9445a & 2048) == 0 || (moveConfig2 = this.f9459o) == null || moveConfig2 == MoveConfig.m8800u()) {
                    this.f9459o = moveConfig;
                } else {
                    m8791z().m8824o(moveConfig);
                }
                if (this.f9459o != null) {
                    this.f9445a |= 2048;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            public final C7104b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7104b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: K */
            public C7104b m8755K(Author author) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9453i;
                if (singleFieldBuilderV3 == null) {
                    author.getClass();
                    this.f9452h = author;
                } else {
                    singleFieldBuilderV3.setMessage(author);
                }
                this.f9445a |= 64;
                onChanged();
                return this;
            }

            /* renamed from: L */
            public C7104b m8756L(long j9) {
                this.f9449e = j9;
                this.f9445a |= 8;
                onChanged();
                return this;
            }

            /* renamed from: M */
            public C7104b m8757M(int i9) {
                this.f9457m = i9;
                this.f9445a |= 512;
                onChanged();
                return this;
            }

            /* renamed from: N */
            public C7104b m8758N(BackgroundLineConfig backgroundLineConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9462r;
                if (singleFieldBuilderV3 == null) {
                    backgroundLineConfig.getClass();
                    this.f9461q = backgroundLineConfig;
                } else {
                    singleFieldBuilderV3.setMessage(backgroundLineConfig);
                }
                this.f9445a |= 4096;
                onChanged();
                return this;
            }

            /* renamed from: O */
            public C7104b m8759O(long j9) {
                this.f9451g = j9;
                this.f9445a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: P, reason: merged with bridge method [inline-methods] */
            public C7104b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7104b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: Q */
            public C7104b m8761Q(int i9) {
                this.f9448d = i9;
                this.f9445a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: R */
            public C7104b m8762R(int i9) {
                this.f9458n = i9;
                this.f9445a |= 1024;
                onChanged();
                return this;
            }

            /* renamed from: S */
            public C7104b m8763S(BackgroundLineConfig backgroundLineConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9464t;
                if (singleFieldBuilderV3 == null) {
                    backgroundLineConfig.getClass();
                    this.f9463s = backgroundLineConfig;
                } else {
                    singleFieldBuilderV3.setMessage(backgroundLineConfig);
                }
                this.f9445a |= 8192;
                onChanged();
                return this;
            }

            /* renamed from: T */
            public C7104b m8764T(MoveConfig moveConfig) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9460p;
                if (singleFieldBuilderV3 == null) {
                    moveConfig.getClass();
                    this.f9459o = moveConfig;
                } else {
                    singleFieldBuilderV3.setMessage(moveConfig);
                }
                this.f9445a |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            public C7104b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7104b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public final C7104b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7104b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: W */
            public C7104b m8767W(long j9) {
                this.f9450f = j9;
                this.f9445a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: X */
            public C7104b m8768X(int i9) {
                this.f9446b = i9;
                this.f9445a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: Y */
            public C7104b m8769Y(int i9) {
                this.f9447c = i9;
                this.f9445a |= 2;
                onChanged();
                return this;
            }

            /* renamed from: b */
            public C7104b m8770b(Author author) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9456l;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(author);
                    return this;
                }
                author.getClass();
                m8780n();
                this.f9455k.add(author);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7104b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7104b) super.addRepeatedField(fieldDescriptor, obj);
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
                m8775h(header);
                if (this.f9445a != 0) {
                    m8774g(header);
                }
                onBuilt();
                return header;
            }

            /* renamed from: g */
            public final void m8774g(Header header) {
                int i9;
                int i10 = this.f9445a;
                if ((i10 & 1) != 0) {
                    header.f9430b = this.f9446b;
                }
                if ((i10 & 2) != 0) {
                    header.f9431c = this.f9447c;
                }
                if ((i10 & 4) != 0) {
                    header.f9432d = this.f9448d;
                }
                if ((i10 & 8) != 0) {
                    header.f9433e = this.f9449e;
                }
                if ((i10 & 16) != 0) {
                    header.f9434f = this.f9450f;
                }
                if ((i10 & 32) != 0) {
                    header.f9435g = this.f9451g;
                }
                if ((i10 & 64) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9453i;
                    header.f9436h = singleFieldBuilderV3 == null ? this.f9452h : (Author) singleFieldBuilderV3.build();
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                if ((i10 & 128) != 0) {
                    header.f9437i = this.f9454j;
                }
                if ((i10 & 512) != 0) {
                    header.f9439k = this.f9457m;
                }
                if ((i10 & 1024) != 0) {
                    header.f9440l = this.f9458n;
                }
                if ((i10 & 2048) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9460p;
                    header.f9441m = singleFieldBuilderV32 == null ? this.f9459o : (MoveConfig) singleFieldBuilderV32.build();
                    i9 |= 2;
                }
                if ((i10 & 4096) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9462r;
                    header.f9442n = singleFieldBuilderV33 == null ? this.f9461q : (BackgroundLineConfig) singleFieldBuilderV33.build();
                    i9 |= 4;
                }
                if ((i10 & 8192) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV34 = this.f9464t;
                    header.f9443o = singleFieldBuilderV34 == null ? this.f9463s : (BackgroundLineConfig) singleFieldBuilderV34.build();
                    i9 |= 8;
                }
                Header.m8723y(header, i9);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9390a;
            }

            /* renamed from: h */
            public final void m8775h(Header header) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9456l;
                if (repeatedFieldBuilderV3 != null) {
                    header.f9438j = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9445a & 256) != 0) {
                    this.f9455k = Collections.unmodifiableList(this.f9455k);
                    this.f9445a &= -257;
                }
                header.f9438j = this.f9455k;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7104b clear() {
                super.clear();
                this.f9445a = 0;
                this.f9446b = 0;
                this.f9447c = 0;
                this.f9448d = 0;
                this.f9449e = 0L;
                this.f9450f = 0L;
                this.f9451g = 0L;
                this.f9452h = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9453i;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f9453i = null;
                }
                this.f9454j = "";
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9456l;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9455k = Collections.EMPTY_LIST;
                } else {
                    this.f9455k = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9445a &= -257;
                this.f9457m = 0;
                this.f9458n = 0;
                this.f9459o = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9460p;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f9460p = null;
                }
                this.f9461q = null;
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9462r;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.dispose();
                    this.f9462r = null;
                }
                this.f9463s = null;
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.f9464t;
                if (singleFieldBuilderV34 != null) {
                    singleFieldBuilderV34.dispose();
                    this.f9464t = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9391b.ensureFieldAccessorsInitialized(Header.class, C7104b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7104b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7104b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7104b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7104b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7104b mo24685clone() {
                return (C7104b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m8780n() {
                if ((this.f9445a & 256) == 0) {
                    this.f9455k = new ArrayList(this.f9455k);
                    this.f9445a |= 256;
                }
            }

            /* renamed from: o */
            public Author m8781o() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9453i;
                if (singleFieldBuilderV3 != null) {
                    return (Author) singleFieldBuilderV3.getMessage();
                }
                Author author = this.f9452h;
                return author == null ? Author.m8633z() : author;
            }

            /* renamed from: p */
            public Author.C7100b m8782p() {
                this.f9445a |= 64;
                onChanged();
                return (Author.C7100b) m8783q().getBuilder();
            }

            /* renamed from: q */
            public final SingleFieldBuilderV3 m8783q() {
                if (this.f9453i == null) {
                    this.f9453i = new SingleFieldBuilderV3(m8781o(), getParentForChildren(), isClean());
                    this.f9452h = null;
                }
                return this.f9453i;
            }

            /* renamed from: r */
            public BackgroundLineConfig m8784r() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9462r;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f9461q;
                return backgroundLineConfig == null ? BackgroundLineConfig.m8671q() : backgroundLineConfig;
            }

            /* renamed from: s */
            public BackgroundLineConfig.C7102b m8785s() {
                this.f9445a |= 4096;
                onChanged();
                return (BackgroundLineConfig.C7102b) m8786t().getBuilder();
            }

            /* renamed from: t */
            public final SingleFieldBuilderV3 m8786t() {
                if (this.f9462r == null) {
                    this.f9462r = new SingleFieldBuilderV3(m8784r(), getParentForChildren(), isClean());
                    this.f9461q = null;
                }
                return this.f9462r;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public Header getDefaultInstanceForType() {
                return Header.m8709J();
            }

            /* renamed from: v */
            public BackgroundLineConfig m8788v() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9464t;
                if (singleFieldBuilderV3 != null) {
                    return (BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                }
                BackgroundLineConfig backgroundLineConfig = this.f9463s;
                return backgroundLineConfig == null ? BackgroundLineConfig.m8671q() : backgroundLineConfig;
            }

            /* renamed from: w */
            public BackgroundLineConfig.C7102b m8789w() {
                this.f9445a |= 8192;
                onChanged();
                return (BackgroundLineConfig.C7102b) m8744x().getBuilder();
            }

            /* renamed from: y */
            public MoveConfig m8790y() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9460p;
                if (singleFieldBuilderV3 != null) {
                    return (MoveConfig) singleFieldBuilderV3.getMessage();
                }
                MoveConfig moveConfig = this.f9459o;
                return moveConfig == null ? MoveConfig.m8800u() : moveConfig;
            }

            /* renamed from: z */
            public MoveConfig.C7106b m8791z() {
                this.f9445a |= 2048;
                onChanged();
                return (MoveConfig.C7106b) m8745A().getBuilder();
            }

            public C7104b() {
                this.f9454j = "";
                this.f9455k = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public C7104b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9454j = "";
                this.f9455k = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        public Header(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9430b = 0;
            this.f9431c = 0;
            this.f9432d = 0;
            this.f9433e = 0L;
            this.f9434f = 0L;
            this.f9435g = 0L;
            this.f9437i = "";
            this.f9439k = 0;
            this.f9440l = 0;
            this.f9444p = (byte) -1;
        }

        private Header() {
            this.f9430b = 0;
            this.f9431c = 0;
            this.f9432d = 0;
            this.f9433e = 0L;
            this.f9434f = 0L;
            this.f9435g = 0L;
            this.f9437i = "";
            this.f9439k = 0;
            this.f9440l = 0;
            this.f9444p = (byte) -1;
            this.f9437i = "";
            this.f9438j = Collections.EMPTY_LIST;
        }
    }

    public static final class MoveConfig extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: i */
        public static final MoveConfig f9465i = new MoveConfig();

        /* renamed from: j */
        public static final Parser f9466j = new C7105a();

        /* renamed from: a */
        public boolean f9467a;

        /* renamed from: b */
        public boolean f9468b;

        /* renamed from: c */
        public boolean f9469c;

        /* renamed from: d */
        public boolean f9470d;

        /* renamed from: e */
        public boolean f9471e;

        /* renamed from: f */
        public int f9472f;

        /* renamed from: g */
        public int f9473g;

        /* renamed from: h */
        public byte f9474h;

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$a */
        public class C7105a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MoveConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7106b c7106bM8792D = MoveConfig.m8792D();
                try {
                    c7106bM8792D.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7106bM8792D.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7106bM8792D.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7106bM8792D.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7106bM8792D.buildPartial());
                }
            }
        }

        /* renamed from: D */
        public static C7106b m8792D() {
            return f9465i.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyHeader.f9392c;
        }

        /* renamed from: u */
        public static MoveConfig m8800u() {
            return f9465i;
        }

        /* renamed from: A */
        public boolean m8801A() {
            return this.f9471e;
        }

        /* renamed from: B */
        public boolean m8802B() {
            return this.f9470d;
        }

        /* renamed from: C */
        public boolean m8803C() {
            return this.f9468b;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C7106b newBuilderForType() {
            return m8792D();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C7106b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7106b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C7106b toBuilder() {
            return this == f9465i ? new C7106b() : new C7106b().m8824o(this);
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
            return m8809x() == moveConfig.m8809x() && m8803C() == moveConfig.m8803C() && m8808w() == moveConfig.m8808w() && m8802B() == moveConfig.m8802B() && m8801A() == moveConfig.m8801A() && m8810y() == moveConfig.m8810y() && m8811z() == moveConfig.m8811z() && getUnknownFields().equals(moveConfig.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9466j;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            boolean z9 = this.f9467a;
            int iComputeBoolSize = z9 ? CodedOutputStream.computeBoolSize(1, z9) : 0;
            boolean z10 = this.f9468b;
            if (z10) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z10);
            }
            boolean z11 = this.f9469c;
            if (z11) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, z11);
            }
            boolean z12 = this.f9470d;
            if (z12) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, z12);
            }
            boolean z13 = this.f9471e;
            if (z13) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, z13);
            }
            int i10 = this.f9472f;
            if (i10 != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(6, i10);
            }
            int i11 = this.f9473g;
            if (i11 != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(7, i11);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(m8809x())) * 37) + 2) * 53) + Internal.hashBoolean(m8803C())) * 37) + 3) * 53) + Internal.hashBoolean(m8808w())) * 37) + 4) * 53) + Internal.hashBoolean(m8802B())) * 37) + 5) * 53) + Internal.hashBoolean(m8801A())) * 37) + 6) * 53) + m8810y()) * 37) + 7) * 53) + m8811z()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyHeader.f9393d.ensureFieldAccessorsInitialized(MoveConfig.class, C7106b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9474h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9474h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MoveConfig();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public MoveConfig getDefaultInstanceForType() {
            return f9465i;
        }

        /* renamed from: w */
        public boolean m8808w() {
            return this.f9469c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z9 = this.f9467a;
            if (z9) {
                codedOutputStream.writeBool(1, z9);
            }
            boolean z10 = this.f9468b;
            if (z10) {
                codedOutputStream.writeBool(2, z10);
            }
            boolean z11 = this.f9469c;
            if (z11) {
                codedOutputStream.writeBool(3, z11);
            }
            boolean z12 = this.f9470d;
            if (z12) {
                codedOutputStream.writeBool(4, z12);
            }
            boolean z13 = this.f9471e;
            if (z13) {
                codedOutputStream.writeBool(5, z13);
            }
            int i9 = this.f9472f;
            if (i9 != 0) {
                codedOutputStream.writeInt32(6, i9);
            }
            int i10 = this.f9473g;
            if (i10 != 0) {
                codedOutputStream.writeInt32(7, i10);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: x */
        public boolean m8809x() {
            return this.f9467a;
        }

        /* renamed from: y */
        public int m8810y() {
            return this.f9472f;
        }

        /* renamed from: z */
        public int m8811z() {
            return this.f9473g;
        }

        /* renamed from: com.zykj.board.EzyHeader$MoveConfig$b */
        public static final class C7106b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9475a;

            /* renamed from: b */
            public boolean f9476b;

            /* renamed from: c */
            public boolean f9477c;

            /* renamed from: d */
            public boolean f9478d;

            /* renamed from: e */
            public boolean f9479e;

            /* renamed from: f */
            public boolean f9480f;

            /* renamed from: g */
            public int f9481g;

            /* renamed from: h */
            public int f9482h;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7106b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7106b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f9475a != 0) {
                    m8816f(moveConfig);
                }
                onBuilt();
                return moveConfig;
            }

            /* renamed from: f */
            public final void m8816f(MoveConfig moveConfig) {
                int i9 = this.f9475a;
                if ((i9 & 1) != 0) {
                    moveConfig.f9467a = this.f9476b;
                }
                if ((i9 & 2) != 0) {
                    moveConfig.f9468b = this.f9477c;
                }
                if ((i9 & 4) != 0) {
                    moveConfig.f9469c = this.f9478d;
                }
                if ((i9 & 8) != 0) {
                    moveConfig.f9470d = this.f9479e;
                }
                if ((i9 & 16) != 0) {
                    moveConfig.f9471e = this.f9480f;
                }
                if ((i9 & 32) != 0) {
                    moveConfig.f9472f = this.f9481g;
                }
                if ((i9 & 64) != 0) {
                    moveConfig.f9473g = this.f9482h;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7106b clear() {
                super.clear();
                this.f9475a = 0;
                this.f9476b = false;
                this.f9477c = false;
                this.f9478d = false;
                this.f9479e = false;
                this.f9480f = false;
                this.f9481g = 0;
                this.f9482h = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyHeader.f9392c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7106b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7106b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7106b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7106b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyHeader.f9393d.ensureFieldAccessorsInitialized(MoveConfig.class, C7106b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7106b mo24685clone() {
                return (C7106b) super.mo24685clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public MoveConfig getDefaultInstanceForType() {
                return MoveConfig.m8800u();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7106b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f9476b = codedInputStream.readBool();
                                    this.f9475a |= 1;
                                } else if (tag == 16) {
                                    this.f9477c = codedInputStream.readBool();
                                    this.f9475a |= 2;
                                } else if (tag == 24) {
                                    this.f9478d = codedInputStream.readBool();
                                    this.f9475a |= 4;
                                } else if (tag == 32) {
                                    this.f9479e = codedInputStream.readBool();
                                    this.f9475a |= 8;
                                } else if (tag == 40) {
                                    this.f9480f = codedInputStream.readBool();
                                    this.f9475a |= 16;
                                } else if (tag == 48) {
                                    this.f9481g = codedInputStream.readInt32();
                                    this.f9475a |= 32;
                                } else if (tag == 56) {
                                    this.f9482h = codedInputStream.readInt32();
                                    this.f9475a |= 64;
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
            public C7106b mergeFrom(Message message) {
                if (message instanceof MoveConfig) {
                    return m8824o((MoveConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7106b m8824o(MoveConfig moveConfig) {
                if (moveConfig == MoveConfig.m8800u()) {
                    return this;
                }
                if (moveConfig.m8809x()) {
                    m8828s(moveConfig.m8809x());
                }
                if (moveConfig.m8803C()) {
                    m8835z(moveConfig.m8803C());
                }
                if (moveConfig.m8808w()) {
                    m8827r(moveConfig.m8808w());
                }
                if (moveConfig.m8802B()) {
                    m8833x(moveConfig.m8802B());
                }
                if (moveConfig.m8801A()) {
                    m8832w(moveConfig.m8801A());
                }
                if (moveConfig.m8810y() != 0) {
                    m8829t(moveConfig.m8810y());
                }
                if (moveConfig.m8811z() != 0) {
                    m8830u(moveConfig.m8811z());
                }
                mergeUnknownFields(moveConfig.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7106b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7106b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7106b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7106b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: r */
            public C7106b m8827r(boolean z9) {
                this.f9478d = z9;
                this.f9475a |= 4;
                onChanged();
                return this;
            }

            /* renamed from: s */
            public C7106b m8828s(boolean z9) {
                this.f9476b = z9;
                this.f9475a |= 1;
                onChanged();
                return this;
            }

            /* renamed from: t */
            public C7106b m8829t(int i9) {
                this.f9481g = i9;
                this.f9475a |= 32;
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C7106b m8830u(int i9) {
                this.f9482h = i9;
                this.f9475a |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7106b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7106b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            /* renamed from: w */
            public C7106b m8832w(boolean z9) {
                this.f9480f = z9;
                this.f9475a |= 16;
                onChanged();
                return this;
            }

            /* renamed from: x */
            public C7106b m8833x(boolean z9) {
                this.f9479e = z9;
                this.f9475a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public final C7106b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7106b) super.setUnknownFields(unknownFieldSet);
            }

            /* renamed from: z */
            public C7106b m8835z(boolean z9) {
                this.f9477c = z9;
                this.f9475a |= 2;
                onChanged();
                return this;
            }

            public C7106b() {
            }

            public C7106b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }
        }

        public MoveConfig(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9467a = false;
            this.f9468b = false;
            this.f9469c = false;
            this.f9470d = false;
            this.f9471e = false;
            this.f9472f = 0;
            this.f9473g = 0;
            this.f9474h = (byte) -1;
        }

        private MoveConfig() {
            this.f9467a = false;
            this.f9468b = false;
            this.f9469c = false;
            this.f9470d = false;
            this.f9471e = false;
            this.f9472f = 0;
            this.f9473g = 0;
            this.f9474h = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8621i().getMessageTypes().get(0);
        f9390a = descriptor;
        f9391b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Duration", "Author", "ConvertUrl", "Provider", "DefaultBackgroundColor", "LastBackgroundColor", "MoveConfig", "DefaultBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor2 = m8621i().getMessageTypes().get(1);
        f9392c = descriptor2;
        f9393d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IsEnable", "VerticalTranslate", "HorizontalTranslate", "Scale", "Rotate", "MaxHeightTimes", "MaxWidthTimes"});
        Descriptors.Descriptor descriptor3 = m8621i().getMessageTypes().get(2);
        f9394e = descriptor3;
        f9395f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"LineColor", "LineSpace", "LineType", "LineWidth"});
        Descriptors.Descriptor descriptor4 = m8621i().getMessageTypes().get(3);
        f9396g = descriptor4;
        f9397h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AuthorName", "SchoolId", "AuthorId", "Url", "StartTime", "Duration"});
        EzyPageRouter.m8898e();
        EzyBackgroundLineTypeEnum.m8023a();
    }

    /* renamed from: i */
    public static Descriptors.FileDescriptor m8621i() {
        return f9398i;
    }
}

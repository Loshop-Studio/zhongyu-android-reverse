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
public abstract class EzyPageRouter {

    /* renamed from: a */
    public static final Descriptors.Descriptor f8239a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8240b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8241c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8242d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f8243e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010PageRouter.proto\"a\n\nPageRouter\u0012&\n\bpageInfo\u0018\u0001 \u0003(\u000b2\u0014.PageRouter.PageInfo\u001a+\n\bPageInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0011\n\tpageIndex\u0018\u0002 \u0001(\u0005B\u001f\n\u000ecom.zykj.boardB\rEzyPageRouterb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class PageRouter extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final PageRouter f8244c = new PageRouter();

        /* renamed from: d */
        public static final Parser f8245d = new C6795a();

        /* renamed from: a */
        public List f8246a;

        /* renamed from: b */
        public byte f8247b;

        public static final class PageInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PageInfo f8248d = new PageInfo();

            /* renamed from: e */
            public static final Parser f8249e = new C6793a();

            /* renamed from: a */
            public volatile Object f8250a;

            /* renamed from: b */
            public int f8251b;

            /* renamed from: c */
            public byte f8252c;

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$a */
            public class C6793a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PageInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6794b c6794bM7785q = PageInfo.m7785q();
                    try {
                        c6794bM7785q.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6794bM7785q.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6794bM7785q.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6794bM7785q.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6794bM7785q.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageRouter.f8241c;
            }

            /* renamed from: k */
            public static PageInfo m7784k() {
                return f8248d;
            }

            public static Parser parser() {
                return f8249e;
            }

            /* renamed from: q */
            public static C6794b m7785q() {
                return f8248d.toBuilder();
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PageInfo)) {
                    return super.equals(obj);
                }
                PageInfo pageInfo = (PageInfo) obj;
                return getName().equals(pageInfo.getName()) && m7787o() == pageInfo.m7787o() && getUnknownFields().equals(pageInfo.getUnknownFields());
            }

            public String getName() {
                Object obj = this.f8250a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8250a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8249e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8250a) ? GeneratedMessageV3.computeStringSize(1, this.f8250a) : 0;
                int i11 = this.f8251b;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i11);
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + m7787o()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f8242d.ensureFieldAccessorsInitialized(PageInfo.class, C6794b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8252c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8252c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public PageInfo getDefaultInstanceForType() {
                return f8248d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PageInfo();
            }

            /* renamed from: o */
            public int m7787o() {
                return this.f8251b;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6794b newBuilderForType() {
                return m7785q();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C6794b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6794b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6794b toBuilder() {
                return this == f8248d ? new C6794b() : new C6794b().m7803n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f8250a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8250a);
                }
                int i10 = this.f8251b;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$b */
            public static final class C6794b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8253a;

                /* renamed from: b */
                public Object f8254b;

                /* renamed from: c */
                public int f8255c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6794b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6794b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public PageInfo build() {
                    PageInfo pageInfoBuildPartial = buildPartial();
                    if (pageInfoBuildPartial.isInitialized()) {
                        return pageInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public PageInfo buildPartial() {
                    PageInfo pageInfo = new PageInfo(this);
                    if (this.f8253a != 0) {
                        m7795e(pageInfo);
                    }
                    onBuilt();
                    return pageInfo;
                }

                /* renamed from: e */
                public final void m7795e(PageInfo pageInfo) {
                    int i10 = this.f8253a;
                    if ((i10 & 1) != 0) {
                        pageInfo.f8250a = this.f8254b;
                    }
                    if ((i10 & 2) != 0) {
                        pageInfo.f8251b = this.f8255c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6794b clear() {
                    super.clear();
                    this.f8253a = 0;
                    this.f8254b = "";
                    this.f8255c = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6794b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6794b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageRouter.f8241c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6794b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6794b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6794b mo24228clone() {
                    return (C6794b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageRouter.f8242d.ensureFieldAccessorsInitialized(PageInfo.class, C6794b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public PageInfo getDefaultInstanceForType() {
                    return PageInfo.m7784k();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6794b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f8254b = codedInputStream.readStringRequireUtf8();
                                        this.f8253a |= 1;
                                    } else if (tag == 16) {
                                        this.f8255c = codedInputStream.readInt32();
                                        this.f8253a |= 2;
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
                public C6794b mergeFrom(Message message) {
                    if (message instanceof PageInfo) {
                        return m7803n((PageInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C6794b m7803n(PageInfo pageInfo) {
                    if (pageInfo == PageInfo.m7784k()) {
                        return this;
                    }
                    if (!pageInfo.getName().isEmpty()) {
                        this.f8254b = pageInfo.f8250a;
                        this.f8253a |= 1;
                        onChanged();
                    }
                    if (pageInfo.m7787o() != 0) {
                        m7806r(pageInfo.m7787o());
                    }
                    mergeUnknownFields(pageInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C6794b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6794b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C6794b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6794b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C6794b m7806r(int i10) {
                    this.f8255c = i10;
                    this.f8253a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C6794b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6794b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C6794b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6794b) super.setUnknownFields(unknownFieldSet);
                }

                public C6794b() {
                    this.f8254b = "";
                }

                public C6794b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8254b = "";
                }
            }

            public PageInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8250a = "";
                this.f8251b = 0;
                this.f8252c = (byte) -1;
            }

            private PageInfo() {
                this.f8250a = "";
                this.f8251b = 0;
                this.f8252c = (byte) -1;
                this.f8250a = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$a */
        public class C6795a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageRouter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6796b c6796bM7773q = PageRouter.m7773q();
                try {
                    c6796bM7773q.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6796bM7773q.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6796bM7773q.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6796bM7773q.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6796bM7773q.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageRouter.f8239a;
        }

        /* renamed from: j */
        public static PageRouter m7772j() {
            return f8244c;
        }

        /* renamed from: q */
        public static C6796b m7773q() {
            return f8244c.toBuilder();
        }

        /* renamed from: t */
        public static PageRouter m7774t(InputStream inputStream) {
            return (PageRouter) GeneratedMessageV3.parseWithIOException(f8245d, inputStream);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PageRouter)) {
                return super.equals(obj);
            }
            PageRouter pageRouter = (PageRouter) obj;
            return m7777o().equals(pageRouter.m7777o()) && getUnknownFields().equals(pageRouter.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8245d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8246a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8246a.get(i11));
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
            if (m7776m() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m7777o().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageRouter.f8240b.ensureFieldAccessorsInitialized(PageRouter.class, C6796b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8247b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8247b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public PageRouter getDefaultInstanceForType() {
            return f8244c;
        }

        /* renamed from: m */
        public int m7776m() {
            return this.f8246a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageRouter();
        }

        /* renamed from: o */
        public List m7777o() {
            return this.f8246a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C6796b newBuilderForType() {
            return m7773q();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6796b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6796b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C6796b toBuilder() {
            return this == f8244c ? new C6796b() : new C6796b().m7824r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8246a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8246a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$b */
        public static final class C6796b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8256a;

            /* renamed from: b */
            public List f8257b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8258c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6796b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6796b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public PageRouter build() {
                PageRouter pageRouterBuildPartial = buildPartial();
                if (pageRouterBuildPartial.isInitialized()) {
                    return pageRouterBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageRouterBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PageRouter buildPartial() {
                PageRouter pageRouter = new PageRouter(this);
                m7814f(pageRouter);
                if (this.f8256a != 0) {
                    m7813e(pageRouter);
                }
                onBuilt();
                return pageRouter;
            }

            /* renamed from: e */
            public final void m7813e(PageRouter pageRouter) {
            }

            /* renamed from: f */
            public final void m7814f(PageRouter pageRouter) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8258c;
                if (repeatedFieldBuilderV3 != null) {
                    pageRouter.f8246a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8256a & 1) != 0) {
                    this.f8257b = Collections.unmodifiableList(this.f8257b);
                    this.f8256a &= -2;
                }
                pageRouter.f8246a = this.f8257b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6796b clear() {
                super.clear();
                this.f8256a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8258c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8257b = Collections.EMPTY_LIST;
                } else {
                    this.f8257b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8256a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageRouter.f8239a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6796b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6796b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6796b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6796b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f8240b.ensureFieldAccessorsInitialized(PageRouter.class, C6796b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6796b mo24228clone() {
                return (C6796b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m7819l() {
                if ((this.f8256a & 1) == 0) {
                    this.f8257b = new ArrayList(this.f8257b);
                    this.f8256a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public PageRouter getDefaultInstanceForType() {
                return PageRouter.m7772j();
            }

            /* renamed from: n */
            public final RepeatedFieldBuilderV3 m7821n() {
                if (this.f8258c == null) {
                    this.f8258c = new RepeatedFieldBuilderV3(this.f8257b, (this.f8256a & 1) != 0, getParentForChildren(), isClean());
                    this.f8257b = null;
                }
                return this.f8258c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6796b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    PageInfo pageInfo = (PageInfo) codedInputStream.readMessage(PageInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8258c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m7819l();
                                        this.f8257b.add(pageInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(pageInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6796b mergeFrom(Message message) {
                if (message instanceof PageRouter) {
                    return m7824r((PageRouter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6796b m7824r(PageRouter pageRouter) {
                if (pageRouter == PageRouter.m7772j()) {
                    return this;
                }
                if (this.f8258c == null) {
                    if (!pageRouter.f8246a.isEmpty()) {
                        if (this.f8257b.isEmpty()) {
                            this.f8257b = pageRouter.f8246a;
                            this.f8256a &= -2;
                        } else {
                            m7819l();
                            this.f8257b.addAll(pageRouter.f8246a);
                        }
                        onChanged();
                    }
                } else if (!pageRouter.f8246a.isEmpty()) {
                    if (this.f8258c.isEmpty()) {
                        this.f8258c.dispose();
                        this.f8258c = null;
                        this.f8257b = pageRouter.f8246a;
                        this.f8256a &= -2;
                        this.f8258c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7821n() : null;
                    } else {
                        this.f8258c.addAllMessages(pageRouter.f8246a);
                    }
                }
                mergeUnknownFields(pageRouter.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6796b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6796b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6796b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6796b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6796b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6796b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6796b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6796b) super.setUnknownFields(unknownFieldSet);
            }

            public C6796b() {
                this.f8257b = Collections.EMPTY_LIST;
            }

            public C6796b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8257b = Collections.EMPTY_LIST;
            }
        }

        public PageRouter(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8247b = (byte) -1;
        }

        private PageRouter() {
            this.f8247b = (byte) -1;
            this.f8246a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7769e().getMessageTypes().get(0);
        f8239a = descriptor;
        f8240b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"PageInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f8241c = descriptor2;
        f8242d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "PageIndex"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m7769e() {
        return f8243e;
    }
}

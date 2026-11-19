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
    public static final Descriptors.Descriptor f9527a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9528b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9529c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9530d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f9531e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010PageRouter.proto\"a\n\nPageRouter\u0012&\n\bpageInfo\u0018\u0001 \u0003(\u000b2\u0014.PageRouter.PageInfo\u001a+\n\bPageInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0011\n\tpageIndex\u0018\u0002 \u0001(\u0005B\u001f\n\u000ecom.zykj.boardB\rEzyPageRouterb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class PageRouter extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final PageRouter f9532c = new PageRouter();

        /* renamed from: d */
        public static final Parser f9533d = new C7114a();

        /* renamed from: a */
        public List f9534a;

        /* renamed from: b */
        public byte f9535b;

        public static final class PageInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PageInfo f9536d = new PageInfo();

            /* renamed from: e */
            public static final Parser f9537e = new C7112a();

            /* renamed from: a */
            public volatile Object f9538a;

            /* renamed from: b */
            public int f9539b;

            /* renamed from: c */
            public byte f9540c;

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$a */
            public class C7112a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PageInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7113b c7113bM8914t = PageInfo.m8914t();
                    try {
                        c7113bM8914t.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7113bM8914t.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7113bM8914t.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7113bM8914t.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7113bM8914t.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageRouter.f9529c;
            }

            /* renamed from: k */
            public static PageInfo m8913k() {
                return f9536d;
            }

            public static Parser parser() {
                return f9537e;
            }

            /* renamed from: t */
            public static C7113b m8914t() {
                return f9536d.toBuilder();
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
                return getName().equals(pageInfo.getName()) && m8916q() == pageInfo.m8916q() && getUnknownFields().equals(pageInfo.getUnknownFields());
            }

            public String getName() {
                Object obj = this.f9538a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9538a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9537e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9538a) ? GeneratedMessageV3.computeStringSize(1, this.f9538a) : 0;
                int i10 = this.f9539b;
                if (i10 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i10);
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + m8916q()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f9530d.ensureFieldAccessorsInitialized(PageInfo.class, C7113b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9540c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9540c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public PageInfo getDefaultInstanceForType() {
                return f9536d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PageInfo();
            }

            /* renamed from: q */
            public int m8916q() {
                return this.f9539b;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7113b newBuilderForType() {
                return m8914t();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7113b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7113b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7113b toBuilder() {
                return this == f9536d ? new C7113b() : new C7113b().m8932o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f9538a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9538a);
                }
                int i9 = this.f9539b;
                if (i9 != 0) {
                    codedOutputStream.writeInt32(2, i9);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$b */
            public static final class C7113b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9541a;

                /* renamed from: b */
                public Object f9542b;

                /* renamed from: c */
                public int f9543c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7113b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7113b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public PageInfo build() {
                    PageInfo pageInfoBuildPartial = buildPartial();
                    if (pageInfoBuildPartial.isInitialized()) {
                        return pageInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public PageInfo buildPartial() {
                    PageInfo pageInfo = new PageInfo(this);
                    if (this.f9541a != 0) {
                        m8924f(pageInfo);
                    }
                    onBuilt();
                    return pageInfo;
                }

                /* renamed from: f */
                public final void m8924f(PageInfo pageInfo) {
                    int i9 = this.f9541a;
                    if ((i9 & 1) != 0) {
                        pageInfo.f9538a = this.f9542b;
                    }
                    if ((i9 & 2) != 0) {
                        pageInfo.f9539b = this.f9543c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7113b clear() {
                    super.clear();
                    this.f9541a = 0;
                    this.f9542b = "";
                    this.f9543c = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageRouter.f9529c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7113b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7113b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7113b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7113b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageRouter.f9530d.ensureFieldAccessorsInitialized(PageInfo.class, C7113b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7113b mo24685clone() {
                    return (C7113b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public PageInfo getDefaultInstanceForType() {
                    return PageInfo.m8913k();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7113b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9542b = codedInputStream.readStringRequireUtf8();
                                        this.f9541a |= 1;
                                    } else if (tag == 16) {
                                        this.f9543c = codedInputStream.readInt32();
                                        this.f9541a |= 2;
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
                public C7113b mergeFrom(Message message) {
                    if (message instanceof PageInfo) {
                        return m8932o((PageInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7113b m8932o(PageInfo pageInfo) {
                    if (pageInfo == PageInfo.m8913k()) {
                        return this;
                    }
                    if (!pageInfo.getName().isEmpty()) {
                        this.f9542b = pageInfo.f9538a;
                        this.f9541a |= 1;
                        onChanged();
                    }
                    if (pageInfo.m8916q() != 0) {
                        m8936s(pageInfo.m8916q());
                    }
                    mergeUnknownFields(pageInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7113b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7113b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7113b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7113b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7113b m8935r(String str) {
                    str.getClass();
                    this.f9542b = str;
                    this.f9541a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7113b m8936s(int i9) {
                    this.f9543c = i9;
                    this.f9541a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C7113b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7113b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C7113b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7113b) super.setUnknownFields(unknownFieldSet);
                }

                public C7113b() {
                    this.f9542b = "";
                }

                public C7113b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9542b = "";
                }
            }

            public PageInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9538a = "";
                this.f9539b = 0;
                this.f9540c = (byte) -1;
            }

            private PageInfo() {
                this.f9538a = "";
                this.f9539b = 0;
                this.f9540c = (byte) -1;
                this.f9538a = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$a */
        public class C7114a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageRouter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7115b c7115bM8902t = PageRouter.m8902t();
                try {
                    c7115bM8902t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7115bM8902t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7115bM8902t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7115bM8902t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7115bM8902t.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static PageRouter m8901g() {
            return f9532c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageRouter.f9527a;
        }

        /* renamed from: t */
        public static C7115b m8902t() {
            return f9532c.toBuilder();
        }

        /* renamed from: w */
        public static PageRouter m8903w(InputStream inputStream) {
            return (PageRouter) GeneratedMessageV3.parseWithIOException(f9533d, inputStream);
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
            return m8906q().equals(pageRouter.m8906q()) && getUnknownFields().equals(pageRouter.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9533d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9534a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9534a.get(i10));
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
            if (m8905n() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8906q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageRouter.f9528b.ensureFieldAccessorsInitialized(PageRouter.class, C7115b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9535b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9535b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public PageRouter getDefaultInstanceForType() {
            return f9532c;
        }

        /* renamed from: n */
        public int m8905n() {
            return this.f9534a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageRouter();
        }

        /* renamed from: q */
        public List m8906q() {
            return this.f9534a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7115b newBuilderForType() {
            return m8902t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7115b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7115b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9534a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9534a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C7115b toBuilder() {
            return this == f9532c ? new C7115b() : new C7115b().m8955s(this);
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$b */
        public static final class C7115b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9544a;

            /* renamed from: b */
            public List f9545b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9546c;

            /* renamed from: b */
            public C7115b m8940b(PageInfo.C7113b c7113b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9546c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7113b.build());
                    return this;
                }
                m8950n();
                this.f9545b.add(c7113b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7115b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7115b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PageRouter build() {
                PageRouter pageRouterBuildPartial = buildPartial();
                if (pageRouterBuildPartial.isInitialized()) {
                    return pageRouterBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageRouterBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public PageRouter buildPartial() {
                PageRouter pageRouter = new PageRouter(this);
                m8945h(pageRouter);
                if (this.f9544a != 0) {
                    m8944g(pageRouter);
                }
                onBuilt();
                return pageRouter;
            }

            /* renamed from: g */
            public final void m8944g(PageRouter pageRouter) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageRouter.f9527a;
            }

            /* renamed from: h */
            public final void m8945h(PageRouter pageRouter) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9546c;
                if (repeatedFieldBuilderV3 != null) {
                    pageRouter.f9534a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9544a & 1) != 0) {
                    this.f9545b = Collections.unmodifiableList(this.f9545b);
                    this.f9544a &= -2;
                }
                pageRouter.f9534a = this.f9545b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7115b clear() {
                super.clear();
                this.f9544a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9546c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9545b = Collections.EMPTY_LIST;
                } else {
                    this.f9545b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9544a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f9528b.ensureFieldAccessorsInitialized(PageRouter.class, C7115b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7115b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7115b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7115b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7115b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7115b mo24685clone() {
                return (C7115b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m8950n() {
                if ((this.f9544a & 1) == 0) {
                    this.f9545b = new ArrayList(this.f9545b);
                    this.f9544a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public PageRouter getDefaultInstanceForType() {
                return PageRouter.m8901g();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m8952p() {
                if (this.f9546c == null) {
                    this.f9546c = new RepeatedFieldBuilderV3(this.f9545b, (this.f9544a & 1) != 0, getParentForChildren(), isClean());
                    this.f9545b = null;
                }
                return this.f9546c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7115b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    PageInfo pageInfo = (PageInfo) codedInputStream.readMessage(PageInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9546c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8950n();
                                        this.f9545b.add(pageInfo);
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
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7115b mergeFrom(Message message) {
                if (message instanceof PageRouter) {
                    return m8955s((PageRouter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C7115b m8955s(PageRouter pageRouter) {
                if (pageRouter == PageRouter.m8901g()) {
                    return this;
                }
                if (this.f9546c == null) {
                    if (!pageRouter.f9534a.isEmpty()) {
                        if (this.f9545b.isEmpty()) {
                            this.f9545b = pageRouter.f9534a;
                            this.f9544a &= -2;
                        } else {
                            m8950n();
                            this.f9545b.addAll(pageRouter.f9534a);
                        }
                        onChanged();
                    }
                } else if (!pageRouter.f9534a.isEmpty()) {
                    if (this.f9546c.isEmpty()) {
                        this.f9546c.dispose();
                        this.f9546c = null;
                        this.f9545b = pageRouter.f9534a;
                        this.f9544a &= -2;
                        this.f9546c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8952p() : null;
                    } else {
                        this.f9546c.addAllMessages(pageRouter.f9534a);
                    }
                }
                mergeUnknownFields(pageRouter.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C7115b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7115b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7115b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7115b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7115b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7115b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7115b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7115b) super.setUnknownFields(unknownFieldSet);
            }

            public C7115b() {
                this.f9545b = Collections.EMPTY_LIST;
            }

            public C7115b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9545b = Collections.EMPTY_LIST;
            }
        }

        public PageRouter(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9535b = (byte) -1;
        }

        private PageRouter() {
            this.f9535b = (byte) -1;
            this.f9534a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8898e().getMessageTypes().get(0);
        f9527a = descriptor;
        f9528b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"PageInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9529c = descriptor2;
        f9530d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "PageIndex"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m8898e() {
        return f9531e;
    }
}

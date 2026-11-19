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
    public static final Descriptors.Descriptor f9254a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9255b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9256c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9257d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f9258e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010PageRouter.proto\"a\n\nPageRouter\u0012&\n\bpageInfo\u0018\u0001 \u0003(\u000b2\u0014.PageRouter.PageInfo\u001a+\n\bPageInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0011\n\tpageIndex\u0018\u0002 \u0001(\u0005B\u001f\n\u000ecom.zykj.boardB\rEzyPageRouterb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class PageRouter extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final PageRouter f9259c = new PageRouter();

        /* renamed from: d */
        public static final Parser f9260d = new C7224a();

        /* renamed from: a */
        public List f9261a;

        /* renamed from: b */
        public byte f9262b;

        public static final class PageInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: d */
            public static final PageInfo f9263d = new PageInfo();

            /* renamed from: e */
            public static final Parser f9264e = new C7222a();

            /* renamed from: a */
            public volatile Object f9265a;

            /* renamed from: b */
            public int f9266b;

            /* renamed from: c */
            public byte f9267c;

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$a */
            public class C7222a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PageInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7223b c7223bM8289h = PageInfo.m8289h();
                    try {
                        c7223bM8289h.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7223bM8289h.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7223bM8289h.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7223bM8289h.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7223bM8289h.buildPartial());
                    }
                }
            }

            /* renamed from: d */
            public static PageInfo m8288d() {
                return f9263d;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageRouter.f9256c;
            }

            /* renamed from: h */
            public static C7223b m8289h() {
                return f9263d.toBuilder();
            }

            public static Parser parser() {
                return f9264e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PageInfo getDefaultInstanceForType() {
                return f9263d;
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
                return getName().equals(pageInfo.getName()) && m8291g() == pageInfo.m8291g() && getUnknownFields().equals(pageInfo.getUnknownFields());
            }

            /* renamed from: g */
            public int m8291g() {
                return this.f9266b;
            }

            public String getName() {
                Object obj = this.f9265a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9265a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9264e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9265a) ? GeneratedMessageV3.computeStringSize(1, this.f9265a) : 0;
                int i11 = this.f9266b;
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + m8291g()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7223b newBuilderForType() {
                return m8289h();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f9257d.ensureFieldAccessorsInitialized(PageInfo.class, C7223b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9267c;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9267c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7223b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7223b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7223b toBuilder() {
                return this == f9263d ? new C7223b() : new C7223b().m8307o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PageInfo();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessageV3.isStringEmpty(this.f9265a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9265a);
                }
                int i10 = this.f9266b;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$b */
            public static final class C7223b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9268a;

                /* renamed from: b */
                public Object f9269b;

                /* renamed from: c */
                public int f9270c;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7223b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7223b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public PageInfo build() {
                    PageInfo pageInfoBuildPartial = buildPartial();
                    if (pageInfoBuildPartial.isInitialized()) {
                        return pageInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public PageInfo buildPartial() {
                    PageInfo pageInfo = new PageInfo(this);
                    if (this.f9268a != 0) {
                        m8299g(pageInfo);
                    }
                    onBuilt();
                    return pageInfo;
                }

                /* renamed from: g */
                public final void m8299g(PageInfo pageInfo) {
                    int i10 = this.f9268a;
                    if ((i10 & 1) != 0) {
                        pageInfo.f9265a = this.f9269b;
                    }
                    if ((i10 & 2) != 0) {
                        pageInfo.f9266b = this.f9270c;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageRouter.f9256c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7223b clear() {
                    super.clear();
                    this.f9268a = 0;
                    this.f9269b = "";
                    this.f9270c = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7223b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7223b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageRouter.f9257d.ensureFieldAccessorsInitialized(PageInfo.class, C7223b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7223b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7223b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7223b mo27381clone() {
                    return (C7223b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public PageInfo getDefaultInstanceForType() {
                    return PageInfo.m8288d();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7223b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9269b = codedInputStream.readStringRequireUtf8();
                                        this.f9268a |= 1;
                                    } else if (tag == 16) {
                                        this.f9270c = codedInputStream.readInt32();
                                        this.f9268a |= 2;
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
                public C7223b mergeFrom(Message message) {
                    if (message instanceof PageInfo) {
                        return m8307o((PageInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7223b m8307o(PageInfo pageInfo) {
                    if (pageInfo == PageInfo.m8288d()) {
                        return this;
                    }
                    if (!pageInfo.getName().isEmpty()) {
                        this.f9269b = pageInfo.f9265a;
                        this.f9268a |= 1;
                        onChanged();
                    }
                    if (pageInfo.m8291g() != 0) {
                        m8311s(pageInfo.m8291g());
                    }
                    mergeUnknownFields(pageInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7223b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7223b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7223b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7223b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7223b m8310r(String str) {
                    str.getClass();
                    this.f9269b = str;
                    this.f9268a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7223b m8311s(int i10) {
                    this.f9270c = i10;
                    this.f9268a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C7223b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7223b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C7223b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7223b) super.setUnknownFields(unknownFieldSet);
                }

                public C7223b() {
                    this.f9269b = "";
                }

                public C7223b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9269b = "";
                }
            }

            public PageInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9265a = "";
                this.f9266b = 0;
                this.f9267c = (byte) -1;
            }

            private PageInfo() {
                this.f9265a = "";
                this.f9266b = 0;
                this.f9267c = (byte) -1;
                this.f9265a = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$a */
        public class C7224a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageRouter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7225b c7225bM8277h = PageRouter.m8277h();
                try {
                    c7225bM8277h.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7225bM8277h.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7225bM8277h.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7225bM8277h.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7225bM8277h.buildPartial());
                }
            }
        }

        /* renamed from: c */
        public static PageRouter m8276c() {
            return f9259c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageRouter.f9254a;
        }

        /* renamed from: h */
        public static C7225b m8277h() {
            return f9259c.toBuilder();
        }

        /* renamed from: k */
        public static PageRouter m8278k(InputStream inputStream) {
            return (PageRouter) GeneratedMessageV3.parseWithIOException(f9260d, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public PageRouter getDefaultInstanceForType() {
            return f9259c;
        }

        /* renamed from: e */
        public int m8280e() {
            return this.f9261a.size();
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
            return m8281g().equals(pageRouter.m8281g()) && getUnknownFields().equals(pageRouter.getUnknownFields());
        }

        /* renamed from: g */
        public List m8281g() {
            return this.f9261a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9260d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9261a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9261a.get(i11));
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
            if (m8280e() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8281g().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C7225b newBuilderForType() {
            return m8277h();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageRouter.f9255b.ensureFieldAccessorsInitialized(PageRouter.class, C7225b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9262b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9262b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7225b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7225b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public C7225b toBuilder() {
            return this == f9259c ? new C7225b() : new C7225b().m8330s(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageRouter();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9261a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9261a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$b */
        public static final class C7225b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9271a;

            /* renamed from: b */
            public List f9272b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9273c;

            /* renamed from: c */
            public C7225b m8315c(PageInfo.C7223b c7223b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9273c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7223b.build());
                    return this;
                }
                m8325n();
                this.f9272b.add(c7223b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C7225b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7225b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public PageRouter build() {
                PageRouter pageRouterBuildPartial = buildPartial();
                if (pageRouterBuildPartial.isInitialized()) {
                    return pageRouterBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageRouterBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public PageRouter buildPartial() {
                PageRouter pageRouter = new PageRouter(this);
                m8320i(pageRouter);
                if (this.f9271a != 0) {
                    m8319h(pageRouter);
                }
                onBuilt();
                return pageRouter;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageRouter.f9254a;
            }

            /* renamed from: h */
            public final void m8319h(PageRouter pageRouter) {
            }

            /* renamed from: i */
            public final void m8320i(PageRouter pageRouter) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9273c;
                if (repeatedFieldBuilderV3 != null) {
                    pageRouter.f9261a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9271a & 1) != 0) {
                    this.f9272b = Collections.unmodifiableList(this.f9272b);
                    this.f9271a &= -2;
                }
                pageRouter.f9261a = this.f9272b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f9255b.ensureFieldAccessorsInitialized(PageRouter.class, C7225b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7225b clear() {
                super.clear();
                this.f9271a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9273c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9272b = Collections.EMPTY_LIST;
                } else {
                    this.f9272b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9271a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7225b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7225b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7225b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7225b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7225b mo27381clone() {
                return (C7225b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m8325n() {
                if ((this.f9271a & 1) == 0) {
                    this.f9272b = new ArrayList(this.f9272b);
                    this.f9271a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public PageRouter getDefaultInstanceForType() {
                return PageRouter.m8276c();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m8327p() {
                if (this.f9273c == null) {
                    this.f9273c = new RepeatedFieldBuilderV3(this.f9272b, (this.f9271a & 1) != 0, getParentForChildren(), isClean());
                    this.f9272b = null;
                }
                return this.f9273c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7225b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    PageInfo pageInfo = (PageInfo) codedInputStream.readMessage(PageInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9273c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8325n();
                                        this.f9272b.add(pageInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(pageInfo);
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
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7225b mergeFrom(Message message) {
                if (message instanceof PageRouter) {
                    return m8330s((PageRouter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C7225b m8330s(PageRouter pageRouter) {
                if (pageRouter == PageRouter.m8276c()) {
                    return this;
                }
                if (this.f9273c == null) {
                    if (!pageRouter.f9261a.isEmpty()) {
                        if (this.f9272b.isEmpty()) {
                            this.f9272b = pageRouter.f9261a;
                            this.f9271a &= -2;
                        } else {
                            m8325n();
                            this.f9272b.addAll(pageRouter.f9261a);
                        }
                        onChanged();
                    }
                } else if (!pageRouter.f9261a.isEmpty()) {
                    if (this.f9273c.isEmpty()) {
                        this.f9273c.dispose();
                        this.f9273c = null;
                        this.f9272b = pageRouter.f9261a;
                        this.f9271a &= -2;
                        this.f9273c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8327p() : null;
                    } else {
                        this.f9273c.addAllMessages(pageRouter.f9261a);
                    }
                }
                mergeUnknownFields(pageRouter.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C7225b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7225b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7225b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7225b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7225b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7225b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7225b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7225b) super.setUnknownFields(unknownFieldSet);
            }

            public C7225b() {
                this.f9272b = Collections.EMPTY_LIST;
            }

            public C7225b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9272b = Collections.EMPTY_LIST;
            }
        }

        public PageRouter(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9262b = (byte) -1;
        }

        private PageRouter() {
            this.f9262b = (byte) -1;
            this.f9261a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8273e().getMessageTypes().get(0);
        f9254a = descriptor;
        f9255b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"PageInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9256c = descriptor2;
        f9257d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "PageIndex"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m8273e() {
        return f9258e;
    }
}

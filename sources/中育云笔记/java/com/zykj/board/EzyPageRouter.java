package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
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
public abstract class EzyPageRouter {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19075a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19076b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f19077c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f19078d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f19079e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010PageRouter.proto\"a\n\nPageRouter\u0012&\n\bpageInfo\u0018\u0001 \u0003(\u000b2\u0014.PageRouter.PageInfo\u001a+\n\bPageInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0011\n\tpageIndex\u0018\u0002 \u0001(\u0005B\u001f\n\u000ecom.zykj.boardB\rEzyPageRouterb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static final class PageRouter extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final PageRouter f19080e = new PageRouter();

        /* renamed from: f */
        public static final Parser f19081f = new C8492a();

        /* renamed from: c */
        public List f19082c;

        /* renamed from: d */
        public byte f19083d;

        public static final class PageInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final PageInfo f19084f = new PageInfo();

            /* renamed from: g */
            public static final Parser f19085g = new C8490a();

            /* renamed from: c */
            public volatile Object f19086c;

            /* renamed from: d */
            public int f19087d;

            /* renamed from: e */
            public byte f19088e;

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$a */
            public class C8490a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public PageInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8491b c8491bM15529k = PageInfo.m15529k();
                    try {
                        c8491bM15529k.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8491bM15529k.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8491bM15529k.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8491bM15529k.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8491bM15529k.buildPartial());
                    }
                }
            }

            /* renamed from: e */
            public static PageInfo m15528e() {
                return f19084f;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageRouter.f19077c;
            }

            /* renamed from: k */
            public static C8491b m15529k() {
                return f19084f.toBuilder();
            }

            public static Parser parser() {
                return f19085g;
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
                return getName().equals(pageInfo.getName()) && m15531g() == pageInfo.m15531g() && getUnknownFields().equals(pageInfo.getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public PageInfo getDefaultInstanceForType() {
                return f19084f;
            }

            /* renamed from: g */
            public int m15531g() {
                return this.f19087d;
            }

            public String getName() {
                Object obj = this.f19086c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19086c = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19085g;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f19086c) ? GeneratedMessage.computeStringSize(1, this.f19086c) : 0;
                int i11 = this.f19087d;
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + m15531g()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f19078d.ensureFieldAccessorsInitialized(PageInfo.class, C8491b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19088e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19088e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8491b newBuilderForType() {
                return m15529k();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C8491b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8491b(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new PageInfo();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C8491b toBuilder() {
                return this == f19084f ? new C8491b() : new C8491b().m15547n(this);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessage.isStringEmpty(this.f19086c)) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.f19086c);
                }
                int i10 = this.f19087d;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$PageInfo$b */
            public static final class C8491b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19089c;

                /* renamed from: d */
                public Object f19090d;

                /* renamed from: e */
                public int f19091e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8491b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8491b) super.addRepeatedField(fieldDescriptor, obj);
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
                    if (this.f19089c != 0) {
                        m15539f(pageInfo);
                    }
                    onBuilt();
                    return pageInfo;
                }

                /* renamed from: f */
                public final void m15539f(PageInfo pageInfo) {
                    int i10 = this.f19089c;
                    if ((i10 & 1) != 0) {
                        pageInfo.f19086c = this.f19090d;
                    }
                    if ((i10 & 2) != 0) {
                        pageInfo.f19087d = this.f19091e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8491b clear() {
                    super.clear();
                    this.f19089c = 0;
                    this.f19090d = "";
                    this.f19091e = 0;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageRouter.f19077c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8491b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8491b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8491b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8491b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageRouter.f19078d.ensureFieldAccessorsInitialized(PageInfo.class, C8491b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8491b m33981clone() {
                    return (C8491b) super.m33981clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public PageInfo getDefaultInstanceForType() {
                    return PageInfo.m15528e();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8491b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f19090d = codedInputStream.readStringRequireUtf8();
                                        this.f19089c |= 1;
                                    } else if (tag == 16) {
                                        this.f19091e = codedInputStream.readInt32();
                                        this.f19089c |= 2;
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
                public C8491b mergeFrom(Message message) {
                    if (message instanceof PageInfo) {
                        return m15547n((PageInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C8491b m15547n(PageInfo pageInfo) {
                    if (pageInfo == PageInfo.m15528e()) {
                        return this;
                    }
                    if (!pageInfo.getName().isEmpty()) {
                        this.f19090d = pageInfo.f19086c;
                        this.f19089c |= 1;
                        onChanged();
                    }
                    if (pageInfo.m15531g() != 0) {
                        m15551r(pageInfo.m15531g());
                    }
                    mergeUnknownFields(pageInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final C8491b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8491b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8491b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8491b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: q */
                public C8491b m15550q(String str) {
                    str.getClass();
                    this.f19090d = str;
                    this.f19089c |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C8491b m15551r(int i10) {
                    this.f19091e = i10;
                    this.f19089c |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C8491b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8491b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C8491b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8491b) super.setUnknownFields(unknownFieldSet);
                }

                public C8491b() {
                    this.f19090d = "";
                }

                public C8491b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19090d = "";
                }
            }

            public PageInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19086c = "";
                this.f19087d = 0;
                this.f19088e = (byte) -1;
            }

            private PageInfo() {
                this.f19086c = "";
                this.f19087d = 0;
                this.f19088e = (byte) -1;
                this.f19086c = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$a */
        public class C8492a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageRouter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8493b c8493bM15517k = PageRouter.m15517k();
                try {
                    c8493bM15517k.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8493bM15517k.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8493bM15517k.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8493bM15517k.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8493bM15517k.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static PageRouter m15516d() {
            return f19080e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageRouter.f19075a;
        }

        /* renamed from: k */
        public static C8493b m15517k() {
            return f19080e.toBuilder();
        }

        /* renamed from: o */
        public static PageRouter m15518o(InputStream inputStream) {
            return (PageRouter) GeneratedMessage.parseWithIOException(f19081f, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public PageRouter getDefaultInstanceForType() {
            return f19080e;
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
            return m15521g().equals(pageRouter.m15521g()) && getUnknownFields().equals(pageRouter.getUnknownFields());
        }

        /* renamed from: f */
        public int m15520f() {
            return this.f19082c.size();
        }

        /* renamed from: g */
        public List m15521g() {
            return this.f19082c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19081f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19082c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19082c.get(i11));
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
            if (m15520f() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m15521g().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageRouter.f19076b.ensureFieldAccessorsInitialized(PageRouter.class, C8493b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19083d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19083d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8493b newBuilderForType() {
            return m15517k();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8493b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8493b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageRouter();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C8493b toBuilder() {
            return this == f19080e ? new C8493b() : new C8493b().m15571s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19082c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19082c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPageRouter$PageRouter$b */
        public static final class C8493b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19092c;

            /* renamed from: d */
            public List f19093d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19094e;

            /* renamed from: b */
            public C8493b m15555b(PageInfo.C8491b c8491b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19094e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8491b.build());
                    return this;
                }
                m15566n();
                this.f19093d.add(c8491b.build());
                onChanged();
                return this;
            }

            /* renamed from: d */
            public C8493b m15556d(PageInfo pageInfo) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19094e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(pageInfo);
                    return this;
                }
                pageInfo.getClass();
                m15566n();
                this.f19093d.add(pageInfo);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C8493b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8493b) super.addRepeatedField(fieldDescriptor, obj);
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
                m15561i(pageRouter);
                if (this.f19092c != 0) {
                    m15560h(pageRouter);
                }
                onBuilt();
                return pageRouter;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageRouter.f19075a;
            }

            /* renamed from: h */
            public final void m15560h(PageRouter pageRouter) {
            }

            /* renamed from: i */
            public final void m15561i(PageRouter pageRouter) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19094e;
                if (repeatedFieldBuilderV3 != null) {
                    pageRouter.f19082c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f19092c & 1) != 0) {
                    this.f19093d = Collections.unmodifiableList(this.f19093d);
                    this.f19092c &= -2;
                }
                pageRouter.f19082c = this.f19093d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageRouter.f19076b.ensureFieldAccessorsInitialized(PageRouter.class, C8493b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8493b clear() {
                super.clear();
                this.f19092c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19094e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19093d = Collections.EMPTY_LIST;
                } else {
                    this.f19093d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19092c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8493b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8493b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8493b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8493b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8493b m33981clone() {
                return (C8493b) super.m33981clone();
            }

            /* renamed from: n */
            public final void m15566n() {
                if ((this.f19092c & 1) == 0) {
                    this.f19093d = new ArrayList(this.f19093d);
                    this.f19092c |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public PageRouter getDefaultInstanceForType() {
                return PageRouter.m15516d();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m15568p() {
                if (this.f19094e == null) {
                    this.f19094e = new RepeatedFieldBuilderV3(this.f19093d, (this.f19092c & 1) != 0, getParentForChildren(), isClean());
                    this.f19093d = null;
                }
                return this.f19094e;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8493b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    PageInfo pageInfo = (PageInfo) codedInputStream.readMessage(PageInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19094e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m15566n();
                                        this.f19093d.add(pageInfo);
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
            public C8493b mergeFrom(Message message) {
                if (message instanceof PageRouter) {
                    return m15571s((PageRouter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8493b m15571s(PageRouter pageRouter) {
                if (pageRouter == PageRouter.m15516d()) {
                    return this;
                }
                if (this.f19094e == null) {
                    if (!pageRouter.f19082c.isEmpty()) {
                        if (this.f19093d.isEmpty()) {
                            this.f19093d = pageRouter.f19082c;
                            this.f19092c &= -2;
                        } else {
                            m15566n();
                            this.f19093d.addAll(pageRouter.f19082c);
                        }
                        onChanged();
                    }
                } else if (!pageRouter.f19082c.isEmpty()) {
                    if (this.f19094e.isEmpty()) {
                        this.f19094e.dispose();
                        this.f19094e = null;
                        this.f19093d = pageRouter.f19082c;
                        this.f19092c &= -2;
                        this.f19094e = GeneratedMessage.alwaysUseFieldBuilders ? m15568p() : null;
                    } else {
                        this.f19094e.addAllMessages(pageRouter.f19082c);
                    }
                }
                mergeUnknownFields(pageRouter.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8493b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8493b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8493b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8493b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8493b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8493b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8493b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8493b) super.setUnknownFields(unknownFieldSet);
            }

            public C8493b() {
                this.f19093d = Collections.EMPTY_LIST;
            }

            public C8493b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19093d = Collections.EMPTY_LIST;
            }
        }

        public PageRouter(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19083d = (byte) -1;
        }

        private PageRouter() {
            this.f19083d = (byte) -1;
            this.f19082c = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15513e().getMessageTypes().get(0);
        f19075a = descriptor;
        f19076b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"PageInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f19077c = descriptor2;
        f19078d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "PageIndex"});
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m15513e() {
        return f19079e;
    }
}

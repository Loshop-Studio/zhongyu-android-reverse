package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.compose.material3.AbstractC1923c;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3130g0;
import p020b4.AbstractC3139j0;
import p020b4.C3133h0;
import p020b4.InterfaceC3136i0;

/* loaded from: classes3.dex */
public final class EzyPageRouter$PageRouter extends GeneratedMessageV3 implements MessageOrBuilder {
    public static final int PAGEINFO_FIELD_NUMBER = 1;

    /* renamed from: a */
    public static final EzyPageRouter$PageRouter f5384a = new EzyPageRouter$PageRouter();

    /* renamed from: b */
    public static final C3133h0 f5385b = new C3133h0();
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<PageInfo> pageInfo_;

    public static final class PageInfo extends GeneratedMessageV3 implements InterfaceC3136i0 {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int PAGEINDEX_FIELD_NUMBER = 2;

        /* renamed from: a */
        public static final PageInfo f5386a = new PageInfo();

        /* renamed from: b */
        public static final C4404z f5387b = new C4404z();
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int pageIndex_;

        public PageInfo(GeneratedMessageV3.Builder builder, AbstractC3130g0 abstractC3130g0) {
            super(builder);
            this.name_ = "";
            this.pageIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PageInfo getDefaultInstance() {
            return f5386a;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AbstractC3139j0.f1614c;
        }

        public static C4352a0 newBuilder() {
            return f5386a.toBuilder();
        }

        public static PageInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PageInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5387b, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PageInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PageInfo) f5387b.parseFrom(byteBuffer);
        }

        public static Parser<PageInfo> parser() {
            return f5387b;
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
            return getName().equals(pageInfo.getName()) && getPageIndex() == pageInfo.getPageIndex() && getUnknownFields().equals(pageInfo.getUnknownFields());
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public int getPageIndex() {
            return this.pageIndex_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PageInfo> getParserForType() {
            return f5387b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            int i8 = this.pageIndex_;
            if (i8 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(2, i8);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getPageIndex() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AbstractC3139j0.f1615d.ensureFieldAccessorsInitialized(PageInfo.class, C4352a0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b6 = this.memoizedIsInitialized;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageInfo();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            int i = this.pageIndex_;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static C4352a0 newBuilder(PageInfo pageInfo) {
            C4352a0 builder = f5386a.toBuilder();
            builder.m3690g(pageInfo);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PageInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PageInfo) f5387b.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PageInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PageInfo) GeneratedMessageV3.parseDelimitedWithIOException(f5387b, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PageInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PageInfo) f5387b.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PageInfo getDefaultInstanceForType() {
            return f5386a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4352a0 toBuilder() {
            if (this == f5386a) {
                return new C4352a0();
            }
            C4352a0 c4352a0 = new C4352a0();
            c4352a0.m3690g(this);
            return c4352a0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PageInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PageInfo) f5387b.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public C4352a0 newBuilderForType() {
            return newBuilder();
        }

        private PageInfo() {
            this.name_ = "";
            this.pageIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PageInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PageInfo) f5387b.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public C4352a0 newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            C4352a0 c4352a0 = new C4352a0(builderParent);
            c4352a0.f5444b = "";
            return c4352a0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static PageInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PageInfo) f5387b.parseFrom(bArr, extensionRegistryLite);
        }

        public static PageInfo parseFrom(InputStream inputStream) throws IOException {
            return (PageInfo) GeneratedMessageV3.parseWithIOException(f5387b, inputStream);
        }

        public static PageInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PageInfo) GeneratedMessageV3.parseWithIOException(f5387b, inputStream, extensionRegistryLite);
        }

        public static PageInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PageInfo) GeneratedMessageV3.parseWithIOException(f5387b, codedInputStream);
        }

        public static PageInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PageInfo) GeneratedMessageV3.parseWithIOException(f5387b, codedInputStream, extensionRegistryLite);
        }
    }

    public EzyPageRouter$PageRouter(GeneratedMessageV3.Builder builder, AbstractC3130g0 abstractC3130g0) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EzyPageRouter$PageRouter getDefaultInstance() {
        return f5384a;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AbstractC3139j0.f1612a;
    }

    public static C4402y newBuilder() {
        return f5384a.toBuilder();
    }

    public static EzyPageRouter$PageRouter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EzyPageRouter$PageRouter) GeneratedMessageV3.parseDelimitedWithIOException(f5385b, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageRouter$PageRouter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EzyPageRouter$PageRouter) f5385b.parseFrom(byteBuffer);
    }

    public static Parser<EzyPageRouter$PageRouter> parser() {
        return f5385b;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EzyPageRouter$PageRouter)) {
            return super.equals(obj);
        }
        EzyPageRouter$PageRouter ezyPageRouter$PageRouter = (EzyPageRouter$PageRouter) obj;
        return getPageInfoList().equals(ezyPageRouter$PageRouter.getPageInfoList()) && getUnknownFields().equals(ezyPageRouter$PageRouter.getUnknownFields());
    }

    public PageInfo getPageInfo(int i) {
        return this.pageInfo_.get(i);
    }

    public int getPageInfoCount() {
        return this.pageInfo_.size();
    }

    public List<PageInfo> getPageInfoList() {
        return this.pageInfo_;
    }

    public InterfaceC3136i0 getPageInfoOrBuilder(int i) {
        return this.pageInfo_.get(i);
    }

    public List<? extends InterfaceC3136i0> getPageInfoOrBuilderList() {
        return this.pageInfo_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<EzyPageRouter$PageRouter> getParserForType() {
        return f5385b;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i8 = 0; i8 < this.pageInfo_.size(); i8++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.pageInfo_.get(i8));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getPageInfoCount() > 0) {
            iHashCode = AbstractC1923c.m1038b(iHashCode, 37, 1, 53) + getPageInfoList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3139j0.f1613b.ensureFieldAccessorsInitialized(EzyPageRouter$PageRouter.class, C4402y.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b6 = this.memoizedIsInitialized;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new EzyPageRouter$PageRouter();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.pageInfo_.size(); i++) {
            codedOutputStream.writeMessage(1, this.pageInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static C4402y newBuilder(EzyPageRouter$PageRouter ezyPageRouter$PageRouter) {
        C4402y builder = f5384a.toBuilder();
        builder.m3876g(ezyPageRouter$PageRouter);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageRouter$PageRouter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPageRouter$PageRouter) f5385b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private EzyPageRouter$PageRouter() {
        this.memoizedIsInitialized = (byte) -1;
        this.pageInfo_ = Collections.EMPTY_LIST;
    }

    public static EzyPageRouter$PageRouter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPageRouter$PageRouter) GeneratedMessageV3.parseDelimitedWithIOException(f5385b, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageRouter$PageRouter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EzyPageRouter$PageRouter) f5385b.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public EzyPageRouter$PageRouter getDefaultInstanceForType() {
        return f5384a;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4402y toBuilder() {
        if (this == f5384a) {
            return new C4402y();
        }
        C4402y c4402y = new C4402y();
        c4402y.m3876g(this);
        return c4402y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageRouter$PageRouter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPageRouter$PageRouter) f5385b.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public C4402y newBuilderForType() {
        return newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageRouter$PageRouter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EzyPageRouter$PageRouter) f5385b.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public C4402y newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        C4402y c4402y = new C4402y(builderParent);
        c4402y.f5611b = Collections.EMPTY_LIST;
        return c4402y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EzyPageRouter$PageRouter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EzyPageRouter$PageRouter) f5385b.parseFrom(bArr, extensionRegistryLite);
    }

    public static EzyPageRouter$PageRouter parseFrom(InputStream inputStream) throws IOException {
        return (EzyPageRouter$PageRouter) GeneratedMessageV3.parseWithIOException(f5385b, inputStream);
    }

    public static EzyPageRouter$PageRouter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPageRouter$PageRouter) GeneratedMessageV3.parseWithIOException(f5385b, inputStream, extensionRegistryLite);
    }

    public static EzyPageRouter$PageRouter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EzyPageRouter$PageRouter) GeneratedMessageV3.parseWithIOException(f5385b, codedInputStream);
    }

    public static EzyPageRouter$PageRouter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EzyPageRouter$PageRouter) GeneratedMessageV3.parseWithIOException(f5385b, codedInputStream, extensionRegistryLite);
    }
}

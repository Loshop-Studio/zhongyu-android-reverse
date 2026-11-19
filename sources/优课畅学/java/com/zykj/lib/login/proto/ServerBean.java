package com.zykj.lib.login.proto;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ServerBean extends GeneratedMessageLite<ServerBean, Builder> implements ServerBeanOrBuilder {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 3;
    private static final ServerBean DEFAULT_INSTANCE;
    private static volatile Parser<ServerBean> PARSER = null;
    public static final int REFRESHTOKEN_FIELD_NUMBER = 4;
    public static final int SCHOOLCODE_FIELD_NUMBER = 1;
    public static final int SERVERURL_FIELD_NUMBER = 2;
    public static final int WEBSERVERURL_FIELD_NUMBER = 5;
    private String schoolCode_ = "";
    private String serverUrl_ = "";
    private String accessToken_ = "";
    private String refreshToken_ = "";
    private String webServerUrl_ = "";

    /* renamed from: com.zykj.lib.login.proto.ServerBean$1 */
    public static /* synthetic */ class C73241 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f9907xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f9907xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9907xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9907xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9907xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9907xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9907xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9907xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ServerBean, Builder> implements ServerBeanOrBuilder {
        public Builder clearAccessToken() {
            copyOnWrite();
            ((ServerBean) this.instance).clearAccessToken();
            return this;
        }

        public Builder clearRefreshToken() {
            copyOnWrite();
            ((ServerBean) this.instance).clearRefreshToken();
            return this;
        }

        public Builder clearSchoolCode() {
            copyOnWrite();
            ((ServerBean) this.instance).clearSchoolCode();
            return this;
        }

        public Builder clearServerUrl() {
            copyOnWrite();
            ((ServerBean) this.instance).clearServerUrl();
            return this;
        }

        public Builder clearWebServerUrl() {
            copyOnWrite();
            ((ServerBean) this.instance).clearWebServerUrl();
            return this;
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public String getAccessToken() {
            return ((ServerBean) this.instance).getAccessToken();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public ByteString getAccessTokenBytes() {
            return ((ServerBean) this.instance).getAccessTokenBytes();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public String getRefreshToken() {
            return ((ServerBean) this.instance).getRefreshToken();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public ByteString getRefreshTokenBytes() {
            return ((ServerBean) this.instance).getRefreshTokenBytes();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public String getSchoolCode() {
            return ((ServerBean) this.instance).getSchoolCode();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public ByteString getSchoolCodeBytes() {
            return ((ServerBean) this.instance).getSchoolCodeBytes();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public String getServerUrl() {
            return ((ServerBean) this.instance).getServerUrl();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public ByteString getServerUrlBytes() {
            return ((ServerBean) this.instance).getServerUrlBytes();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public String getWebServerUrl() {
            return ((ServerBean) this.instance).getWebServerUrl();
        }

        @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
        public ByteString getWebServerUrlBytes() {
            return ((ServerBean) this.instance).getWebServerUrlBytes();
        }

        public Builder setAccessToken(String str) {
            copyOnWrite();
            ((ServerBean) this.instance).setAccessToken(str);
            return this;
        }

        public Builder setAccessTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((ServerBean) this.instance).setAccessTokenBytes(byteString);
            return this;
        }

        public Builder setRefreshToken(String str) {
            copyOnWrite();
            ((ServerBean) this.instance).setRefreshToken(str);
            return this;
        }

        public Builder setRefreshTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((ServerBean) this.instance).setRefreshTokenBytes(byteString);
            return this;
        }

        public Builder setSchoolCode(String str) {
            copyOnWrite();
            ((ServerBean) this.instance).setSchoolCode(str);
            return this;
        }

        public Builder setSchoolCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((ServerBean) this.instance).setSchoolCodeBytes(byteString);
            return this;
        }

        public Builder setServerUrl(String str) {
            copyOnWrite();
            ((ServerBean) this.instance).setServerUrl(str);
            return this;
        }

        public Builder setServerUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ServerBean) this.instance).setServerUrlBytes(byteString);
            return this;
        }

        public Builder setWebServerUrl(String str) {
            copyOnWrite();
            ((ServerBean) this.instance).setWebServerUrl(str);
            return this;
        }

        public Builder setWebServerUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ServerBean) this.instance).setWebServerUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(ServerBean.DEFAULT_INSTANCE);
        }
    }

    static {
        ServerBean serverBean = new ServerBean();
        DEFAULT_INSTANCE = serverBean;
        GeneratedMessageLite.registerDefaultInstance(ServerBean.class, serverBean);
    }

    private ServerBean() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessToken() {
        this.accessToken_ = getDefaultInstance().getAccessToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshToken() {
        this.refreshToken_ = getDefaultInstance().getRefreshToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchoolCode() {
        this.schoolCode_ = getDefaultInstance().getSchoolCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerUrl() {
        this.serverUrl_ = getDefaultInstance().getServerUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebServerUrl() {
        this.webServerUrl_ = getDefaultInstance().getWebServerUrl();
    }

    public static ServerBean getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ServerBean parseDelimitedFrom(InputStream inputStream) {
        return (ServerBean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ServerBean parseFrom(ByteBuffer byteBuffer) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ServerBean> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessToken(String str) {
        str.getClass();
        this.accessToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.accessToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshToken(String str) {
        str.getClass();
        this.refreshToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.refreshToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchoolCode(String str) {
        str.getClass();
        this.schoolCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchoolCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.schoolCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerUrl(String str) {
        str.getClass();
        this.serverUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.serverUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebServerUrl(String str) {
        str.getClass();
        this.webServerUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebServerUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webServerUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C73241.f9907xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ServerBean();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"schoolCode_", "serverUrl_", "accessToken_", "refreshToken_", "webServerUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ServerBean> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ServerBean.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public String getAccessToken() {
        return this.accessToken_;
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public ByteString getAccessTokenBytes() {
        return ByteString.copyFromUtf8(this.accessToken_);
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public String getRefreshToken() {
        return this.refreshToken_;
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public ByteString getRefreshTokenBytes() {
        return ByteString.copyFromUtf8(this.refreshToken_);
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public String getSchoolCode() {
        return this.schoolCode_;
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public ByteString getSchoolCodeBytes() {
        return ByteString.copyFromUtf8(this.schoolCode_);
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public String getServerUrl() {
        return this.serverUrl_;
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public ByteString getServerUrlBytes() {
        return ByteString.copyFromUtf8(this.serverUrl_);
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public String getWebServerUrl() {
        return this.webServerUrl_;
    }

    @Override // com.zykj.lib.login.proto.ServerBeanOrBuilder
    public ByteString getWebServerUrlBytes() {
        return ByteString.copyFromUtf8(this.webServerUrl_);
    }

    public static Builder newBuilder(ServerBean serverBean) {
        return DEFAULT_INSTANCE.createBuilder(serverBean);
    }

    public static ServerBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerBean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ServerBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ServerBean parseFrom(ByteString byteString) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ServerBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ServerBean parseFrom(byte[] bArr) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ServerBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ServerBean parseFrom(InputStream inputStream) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ServerBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ServerBean parseFrom(CodedInputStream codedInputStream) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ServerBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

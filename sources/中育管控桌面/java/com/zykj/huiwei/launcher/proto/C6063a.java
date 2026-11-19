package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.zykj.huiwei.launcher.proto.a */
/* loaded from: classes4.dex */
public final class C6063a extends GeneratedMessageLite implements InterfaceC6065c {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 3;
    private static final C6063a DEFAULT_INSTANCE;
    public static final int IMACCESSTOKEN_FIELD_NUMBER = 5;
    public static final int MOBILE_FIELD_NUMBER = 6;
    public static final int NEEDCHANGEPWD_FIELD_NUMBER = 8;
    public static final int NEEDSMSVERIFY_FIELD_NUMBER = 7;
    private static volatile Parser<C6063a> PARSER = null;
    public static final int REFRESHTOKEN_FIELD_NUMBER = 4;
    public static final int SCHOOLCODE_FIELD_NUMBER = 1;
    public static final int SERVERURL_FIELD_NUMBER = 2;
    public static final int USERID_FIELD_NUMBER = 9;
    public static final int WEBSERVERURL_FIELD_NUMBER = 10;
    private boolean needChangePwd_;
    private boolean needSmsVerify_;
    private long userId_;
    private String schoolCode_ = "";
    private String serverUrl_ = "";
    private String accessToken_ = "";
    private String refreshToken_ = "";
    private String imAccessToken_ = "";
    private String mobile_ = "";
    private String webServerUrl_ = "";

    /* renamed from: com.zykj.huiwei.launcher.proto.a$a */
    public static /* synthetic */ class a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6122xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6122xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6122xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6122xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6122xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6122xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6122xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6122xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.proto.a$b */
    public static final class b extends GeneratedMessageLite.Builder implements InterfaceC6065c {
        public b clearAccessToken() {
            copyOnWrite();
            ((C6063a) this.instance).clearAccessToken();
            return this;
        }

        public b clearImAccessToken() {
            copyOnWrite();
            ((C6063a) this.instance).clearImAccessToken();
            return this;
        }

        public b clearMobile() {
            copyOnWrite();
            ((C6063a) this.instance).clearMobile();
            return this;
        }

        public b clearNeedChangePwd() {
            copyOnWrite();
            ((C6063a) this.instance).clearNeedChangePwd();
            return this;
        }

        public b clearNeedSmsVerify() {
            copyOnWrite();
            ((C6063a) this.instance).clearNeedSmsVerify();
            return this;
        }

        public b clearRefreshToken() {
            copyOnWrite();
            ((C6063a) this.instance).clearRefreshToken();
            return this;
        }

        public b clearSchoolCode() {
            copyOnWrite();
            ((C6063a) this.instance).clearSchoolCode();
            return this;
        }

        public b clearServerUrl() {
            copyOnWrite();
            ((C6063a) this.instance).clearServerUrl();
            return this;
        }

        public b clearUserId() {
            copyOnWrite();
            ((C6063a) this.instance).clearUserId();
            return this;
        }

        public b clearWebServerUrl() {
            copyOnWrite();
            ((C6063a) this.instance).clearWebServerUrl();
            return this;
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getAccessToken() {
            return ((C6063a) this.instance).getAccessToken();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getAccessTokenBytes() {
            return ((C6063a) this.instance).getAccessTokenBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getImAccessToken() {
            return ((C6063a) this.instance).getImAccessToken();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getImAccessTokenBytes() {
            return ((C6063a) this.instance).getImAccessTokenBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getMobile() {
            return ((C6063a) this.instance).getMobile();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getMobileBytes() {
            return ((C6063a) this.instance).getMobileBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public boolean getNeedChangePwd() {
            return ((C6063a) this.instance).getNeedChangePwd();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public boolean getNeedSmsVerify() {
            return ((C6063a) this.instance).getNeedSmsVerify();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getRefreshToken() {
            return ((C6063a) this.instance).getRefreshToken();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getRefreshTokenBytes() {
            return ((C6063a) this.instance).getRefreshTokenBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getSchoolCode() {
            return ((C6063a) this.instance).getSchoolCode();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getSchoolCodeBytes() {
            return ((C6063a) this.instance).getSchoolCodeBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getServerUrl() {
            return ((C6063a) this.instance).getServerUrl();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getServerUrlBytes() {
            return ((C6063a) this.instance).getServerUrlBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public long getUserId() {
            return ((C6063a) this.instance).getUserId();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public String getWebServerUrl() {
            return ((C6063a) this.instance).getWebServerUrl();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
        public ByteString getWebServerUrlBytes() {
            return ((C6063a) this.instance).getWebServerUrlBytes();
        }

        public b setAccessToken(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setAccessToken(str);
            return this;
        }

        public b setAccessTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setAccessTokenBytes(byteString);
            return this;
        }

        public b setImAccessToken(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setImAccessToken(str);
            return this;
        }

        public b setImAccessTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setImAccessTokenBytes(byteString);
            return this;
        }

        public b setMobile(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setMobile(str);
            return this;
        }

        public b setMobileBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setMobileBytes(byteString);
            return this;
        }

        public b setNeedChangePwd(boolean z6) {
            copyOnWrite();
            ((C6063a) this.instance).setNeedChangePwd(z6);
            return this;
        }

        public b setNeedSmsVerify(boolean z6) {
            copyOnWrite();
            ((C6063a) this.instance).setNeedSmsVerify(z6);
            return this;
        }

        public b setRefreshToken(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setRefreshToken(str);
            return this;
        }

        public b setRefreshTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setRefreshTokenBytes(byteString);
            return this;
        }

        public b setSchoolCode(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setSchoolCode(str);
            return this;
        }

        public b setSchoolCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setSchoolCodeBytes(byteString);
            return this;
        }

        public b setServerUrl(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setServerUrl(str);
            return this;
        }

        public b setServerUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setServerUrlBytes(byteString);
            return this;
        }

        public b setUserId(long j6) {
            copyOnWrite();
            ((C6063a) this.instance).setUserId(j6);
            return this;
        }

        public b setWebServerUrl(String str) {
            copyOnWrite();
            ((C6063a) this.instance).setWebServerUrl(str);
            return this;
        }

        public b setWebServerUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((C6063a) this.instance).setWebServerUrlBytes(byteString);
            return this;
        }

        private b() {
            super(C6063a.DEFAULT_INSTANCE);
        }
    }

    static {
        C6063a c6063a = new C6063a();
        DEFAULT_INSTANCE = c6063a;
        GeneratedMessageLite.registerDefaultInstance(C6063a.class, c6063a);
    }

    private C6063a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessToken() {
        this.accessToken_ = getDefaultInstance().getAccessToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImAccessToken() {
        this.imAccessToken_ = getDefaultInstance().getImAccessToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobile() {
        this.mobile_ = getDefaultInstance().getMobile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedChangePwd() {
        this.needChangePwd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedSmsVerify() {
        this.needSmsVerify_ = false;
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
    public void clearUserId() {
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebServerUrl() {
        this.webServerUrl_ = getDefaultInstance().getWebServerUrl();
    }

    public static C6063a getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static C6063a parseDelimitedFrom(InputStream inputStream) {
        return (C6063a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6063a parseFrom(ByteBuffer byteBuffer) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<C6063a> parser() {
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
    public void setImAccessToken(String str) {
        str.getClass();
        this.imAccessToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImAccessTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imAccessToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobile(String str) {
        str.getClass();
        this.mobile_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mobile_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedChangePwd(boolean z6) {
        this.needChangePwd_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedSmsVerify(boolean z6) {
        this.needSmsVerify_ = z6;
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
    public void setUserId(long j6) {
        this.userId_ = j6;
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
        switch (a.f6122xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new C6063a();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u0007\t\u0002\nȈ", new Object[]{"schoolCode_", "serverUrl_", "accessToken_", "refreshToken_", "imAccessToken_", "mobile_", "needSmsVerify_", "needChangePwd_", "userId_", "webServerUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C6063a> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C6063a.class) {
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
            default:
                throw null;
        }
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getAccessToken() {
        return this.accessToken_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getAccessTokenBytes() {
        return ByteString.copyFromUtf8(this.accessToken_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getImAccessToken() {
        return this.imAccessToken_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getImAccessTokenBytes() {
        return ByteString.copyFromUtf8(this.imAccessToken_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getMobile() {
        return this.mobile_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getMobileBytes() {
        return ByteString.copyFromUtf8(this.mobile_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public boolean getNeedChangePwd() {
        return this.needChangePwd_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public boolean getNeedSmsVerify() {
        return this.needSmsVerify_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getRefreshToken() {
        return this.refreshToken_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getRefreshTokenBytes() {
        return ByteString.copyFromUtf8(this.refreshToken_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getSchoolCode() {
        return this.schoolCode_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getSchoolCodeBytes() {
        return ByteString.copyFromUtf8(this.schoolCode_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getServerUrl() {
        return this.serverUrl_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getServerUrlBytes() {
        return ByteString.copyFromUtf8(this.serverUrl_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public long getUserId() {
        return this.userId_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public String getWebServerUrl() {
        return this.webServerUrl_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6065c
    public ByteString getWebServerUrlBytes() {
        return ByteString.copyFromUtf8(this.webServerUrl_);
    }

    public static b newBuilder(C6063a c6063a) {
        return (b) DEFAULT_INSTANCE.createBuilder(c6063a);
    }

    public static C6063a parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6063a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6063a parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static C6063a parseFrom(ByteString byteString) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static C6063a parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static C6063a parseFrom(byte[] bArr) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static C6063a parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static C6063a parseFrom(InputStream inputStream) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6063a parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6063a parseFrom(CodedInputStream codedInputStream) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static C6063a parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6063a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

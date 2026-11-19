package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.zykj.huiwei.launcher.proto.d */
/* loaded from: classes4.dex */
public final class C6066d extends GeneratedMessageLite implements InterfaceC6068f {
    private static final C6066d DEFAULT_INSTANCE;
    public static final int ISFIRSTINSTALL_FIELD_NUMBER = 3;
    public static final int ISLOGINSUCCESS_FIELD_NUMBER = 2;
    public static final int NEEDCHECKCRACK_FIELD_NUMBER = 1;
    private static volatile Parser<C6066d> PARSER = null;
    public static final int WHITEIPLIST_FIELD_NUMBER = 4;
    public static final int WIFIINFO_FIELD_NUMBER = 5;
    private boolean isFirstInstall_;
    private boolean isLoginSuccess_;
    private boolean needCheckCrack_;
    private String whiteIpList_ = "";
    private String wifiInfo_ = "";

    /* renamed from: com.zykj.huiwei.launcher.proto.d$a */
    public static /* synthetic */ class a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6123xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6123xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6123xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6123xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6123xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6123xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6123xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6123xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.proto.d$b */
    public static final class b extends GeneratedMessageLite.Builder implements InterfaceC6068f {
        public b clearIsFirstInstall() {
            copyOnWrite();
            ((C6066d) this.instance).clearIsFirstInstall();
            return this;
        }

        public b clearIsLoginSuccess() {
            copyOnWrite();
            ((C6066d) this.instance).clearIsLoginSuccess();
            return this;
        }

        public b clearNeedCheckCrack() {
            copyOnWrite();
            ((C6066d) this.instance).clearNeedCheckCrack();
            return this;
        }

        public b clearWhiteIpList() {
            copyOnWrite();
            ((C6066d) this.instance).clearWhiteIpList();
            return this;
        }

        public b clearWifiInfo() {
            copyOnWrite();
            ((C6066d) this.instance).clearWifiInfo();
            return this;
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public boolean getIsFirstInstall() {
            return ((C6066d) this.instance).getIsFirstInstall();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public boolean getIsLoginSuccess() {
            return ((C6066d) this.instance).getIsLoginSuccess();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public boolean getNeedCheckCrack() {
            return ((C6066d) this.instance).getNeedCheckCrack();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public String getWhiteIpList() {
            return ((C6066d) this.instance).getWhiteIpList();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public ByteString getWhiteIpListBytes() {
            return ((C6066d) this.instance).getWhiteIpListBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public String getWifiInfo() {
            return ((C6066d) this.instance).getWifiInfo();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
        public ByteString getWifiInfoBytes() {
            return ((C6066d) this.instance).getWifiInfoBytes();
        }

        public b setIsFirstInstall(boolean z6) {
            copyOnWrite();
            ((C6066d) this.instance).setIsFirstInstall(z6);
            return this;
        }

        public b setIsLoginSuccess(boolean z6) {
            copyOnWrite();
            ((C6066d) this.instance).setIsLoginSuccess(z6);
            return this;
        }

        public b setNeedCheckCrack(boolean z6) {
            copyOnWrite();
            ((C6066d) this.instance).setNeedCheckCrack(z6);
            return this;
        }

        public b setWhiteIpList(String str) {
            copyOnWrite();
            ((C6066d) this.instance).setWhiteIpList(str);
            return this;
        }

        public b setWhiteIpListBytes(ByteString byteString) {
            copyOnWrite();
            ((C6066d) this.instance).setWhiteIpListBytes(byteString);
            return this;
        }

        public b setWifiInfo(String str) {
            copyOnWrite();
            ((C6066d) this.instance).setWifiInfo(str);
            return this;
        }

        public b setWifiInfoBytes(ByteString byteString) {
            copyOnWrite();
            ((C6066d) this.instance).setWifiInfoBytes(byteString);
            return this;
        }

        private b() {
            super(C6066d.DEFAULT_INSTANCE);
        }
    }

    static {
        C6066d c6066d = new C6066d();
        DEFAULT_INSTANCE = c6066d;
        GeneratedMessageLite.registerDefaultInstance(C6066d.class, c6066d);
    }

    private C6066d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFirstInstall() {
        this.isFirstInstall_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLoginSuccess() {
        this.isLoginSuccess_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedCheckCrack() {
        this.needCheckCrack_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWhiteIpList() {
        this.whiteIpList_ = getDefaultInstance().getWhiteIpList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWifiInfo() {
        this.wifiInfo_ = getDefaultInstance().getWifiInfo();
    }

    public static C6066d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static C6066d parseDelimitedFrom(InputStream inputStream) {
        return (C6066d) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6066d parseFrom(ByteBuffer byteBuffer) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<C6066d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstInstall(boolean z6) {
        this.isFirstInstall_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLoginSuccess(boolean z6) {
        this.isLoginSuccess_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedCheckCrack(boolean z6) {
        this.needCheckCrack_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhiteIpList(String str) {
        str.getClass();
        this.whiteIpList_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhiteIpListBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.whiteIpList_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWifiInfo(String str) {
        str.getClass();
        this.wifiInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWifiInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wifiInfo_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f6123xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new C6066d();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004Ȉ\u0005Ȉ", new Object[]{"needCheckCrack_", "isLoginSuccess_", "isFirstInstall_", "whiteIpList_", "wifiInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C6066d> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C6066d.class) {
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

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public boolean getIsFirstInstall() {
        return this.isFirstInstall_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public boolean getIsLoginSuccess() {
        return this.isLoginSuccess_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public boolean getNeedCheckCrack() {
        return this.needCheckCrack_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public String getWhiteIpList() {
        return this.whiteIpList_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public ByteString getWhiteIpListBytes() {
        return ByteString.copyFromUtf8(this.whiteIpList_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public String getWifiInfo() {
        return this.wifiInfo_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6068f
    public ByteString getWifiInfoBytes() {
        return ByteString.copyFromUtf8(this.wifiInfo_);
    }

    public static b newBuilder(C6066d c6066d) {
        return (b) DEFAULT_INSTANCE.createBuilder(c6066d);
    }

    public static C6066d parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6066d) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6066d parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static C6066d parseFrom(ByteString byteString) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static C6066d parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static C6066d parseFrom(byte[] bArr) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static C6066d parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static C6066d parseFrom(InputStream inputStream) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6066d parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6066d parseFrom(CodedInputStream codedInputStream) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static C6066d parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6066d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

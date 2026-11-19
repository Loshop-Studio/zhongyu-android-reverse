package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.zykj.huiwei.launcher.proto.m */
/* loaded from: classes4.dex */
public final class C6075m extends GeneratedMessageLite implements InterfaceC6077o {
    public static final int AVATAR_FIELD_NUMBER = 5;
    private static final C6075m DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<C6075m> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 3;
    public static final int REALNAME_FIELD_NUMBER = 4;
    public static final int ROLE_FIELD_NUMBER = 6;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int role_;
    private String id_ = "";
    private String userName_ = "";
    private String password_ = "";
    private String realName_ = "";
    private String avatar_ = "";

    /* renamed from: com.zykj.huiwei.launcher.proto.m$a */
    public static /* synthetic */ class a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6126xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6126xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6126xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6126xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6126xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6126xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6126xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6126xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.proto.m$b */
    public static final class b extends GeneratedMessageLite.Builder implements InterfaceC6077o {
        public b clearAvatar() {
            copyOnWrite();
            ((C6075m) this.instance).clearAvatar();
            return this;
        }

        public b clearId() {
            copyOnWrite();
            ((C6075m) this.instance).clearId();
            return this;
        }

        public b clearPassword() {
            copyOnWrite();
            ((C6075m) this.instance).clearPassword();
            return this;
        }

        public b clearRealName() {
            copyOnWrite();
            ((C6075m) this.instance).clearRealName();
            return this;
        }

        public b clearRole() {
            copyOnWrite();
            ((C6075m) this.instance).clearRole();
            return this;
        }

        public b clearUserName() {
            copyOnWrite();
            ((C6075m) this.instance).clearUserName();
            return this;
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public String getAvatar() {
            return ((C6075m) this.instance).getAvatar();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public ByteString getAvatarBytes() {
            return ((C6075m) this.instance).getAvatarBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public String getId() {
            return ((C6075m) this.instance).getId();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public ByteString getIdBytes() {
            return ((C6075m) this.instance).getIdBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public String getPassword() {
            return ((C6075m) this.instance).getPassword();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public ByteString getPasswordBytes() {
            return ((C6075m) this.instance).getPasswordBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public String getRealName() {
            return ((C6075m) this.instance).getRealName();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public ByteString getRealNameBytes() {
            return ((C6075m) this.instance).getRealNameBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public RoleType getRole() {
            return ((C6075m) this.instance).getRole();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public int getRoleValue() {
            return ((C6075m) this.instance).getRoleValue();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public String getUserName() {
            return ((C6075m) this.instance).getUserName();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
        public ByteString getUserNameBytes() {
            return ((C6075m) this.instance).getUserNameBytes();
        }

        public b setAvatar(String str) {
            copyOnWrite();
            ((C6075m) this.instance).setAvatar(str);
            return this;
        }

        public b setAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((C6075m) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public b setId(String str) {
            copyOnWrite();
            ((C6075m) this.instance).setId(str);
            return this;
        }

        public b setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((C6075m) this.instance).setIdBytes(byteString);
            return this;
        }

        public b setPassword(String str) {
            copyOnWrite();
            ((C6075m) this.instance).setPassword(str);
            return this;
        }

        public b setPasswordBytes(ByteString byteString) {
            copyOnWrite();
            ((C6075m) this.instance).setPasswordBytes(byteString);
            return this;
        }

        public b setRealName(String str) {
            copyOnWrite();
            ((C6075m) this.instance).setRealName(str);
            return this;
        }

        public b setRealNameBytes(ByteString byteString) {
            copyOnWrite();
            ((C6075m) this.instance).setRealNameBytes(byteString);
            return this;
        }

        public b setRole(RoleType roleType) {
            copyOnWrite();
            ((C6075m) this.instance).setRole(roleType);
            return this;
        }

        public b setRoleValue(int i6) {
            copyOnWrite();
            ((C6075m) this.instance).setRoleValue(i6);
            return this;
        }

        public b setUserName(String str) {
            copyOnWrite();
            ((C6075m) this.instance).setUserName(str);
            return this;
        }

        public b setUserNameBytes(ByteString byteString) {
            copyOnWrite();
            ((C6075m) this.instance).setUserNameBytes(byteString);
            return this;
        }

        private b() {
            super(C6075m.DEFAULT_INSTANCE);
        }
    }

    static {
        C6075m c6075m = new C6075m();
        DEFAULT_INSTANCE = c6075m;
        GeneratedMessageLite.registerDefaultInstance(C6075m.class, c6075m);
    }

    private C6075m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = getDefaultInstance().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealName() {
        this.realName_ = getDefaultInstance().getRealName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRole() {
        this.role_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserName() {
        this.userName_ = getDefaultInstance().getUserName();
    }

    public static C6075m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static C6075m parseDelimitedFrom(InputStream inputStream) {
        return (C6075m) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6075m parseFrom(ByteBuffer byteBuffer) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<C6075m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        str.getClass();
        this.avatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.avatar_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        str.getClass();
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.password_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealName(String str) {
        str.getClass();
        this.realName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRole(RoleType roleType) {
        this.role_ = roleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleValue(int i6) {
        this.role_ = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserName(String str) {
        str.getClass();
        this.userName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f6126xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new C6075m();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f", new Object[]{"id_", "userName_", "password_", "realName_", "avatar_", "role_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C6075m> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C6075m.class) {
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

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.avatar_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public String getId() {
        return this.id_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public String getPassword() {
        return this.password_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.password_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public String getRealName() {
        return this.realName_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public ByteString getRealNameBytes() {
        return ByteString.copyFromUtf8(this.realName_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public RoleType getRole() {
        RoleType roleTypeForNumber = RoleType.forNumber(this.role_);
        return roleTypeForNumber == null ? RoleType.UNRECOGNIZED : roleTypeForNumber;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public int getRoleValue() {
        return this.role_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public String getUserName() {
        return this.userName_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6077o
    public ByteString getUserNameBytes() {
        return ByteString.copyFromUtf8(this.userName_);
    }

    public static b newBuilder(C6075m c6075m) {
        return (b) DEFAULT_INSTANCE.createBuilder(c6075m);
    }

    public static C6075m parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6075m) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6075m parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static C6075m parseFrom(ByteString byteString) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static C6075m parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static C6075m parseFrom(byte[] bArr) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static C6075m parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static C6075m parseFrom(InputStream inputStream) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6075m parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6075m parseFrom(CodedInputStream codedInputStream) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static C6075m parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6075m) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

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
public final class UserBean extends GeneratedMessageLite<UserBean, Builder> implements UserBeanOrBuilder {
    public static final int AVATAR_FIELD_NUMBER = 4;
    private static final UserBean DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<UserBean> PARSER = null;
    public static final int REALNAME_FIELD_NUMBER = 3;
    public static final int ROLE_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int role_;
    private String id_ = "";
    private String userName_ = "";
    private String realName_ = "";
    private String avatar_ = "";

    /* renamed from: com.zykj.lib.login.proto.UserBean$1 */
    public static /* synthetic */ class C73251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f9908xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f9908xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9908xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9908xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9908xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9908xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9908xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9908xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UserBean, Builder> implements UserBeanOrBuilder {
        public Builder clearAvatar() {
            copyOnWrite();
            ((UserBean) this.instance).clearAvatar();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((UserBean) this.instance).clearId();
            return this;
        }

        public Builder clearRealName() {
            copyOnWrite();
            ((UserBean) this.instance).clearRealName();
            return this;
        }

        public Builder clearRole() {
            copyOnWrite();
            ((UserBean) this.instance).clearRole();
            return this;
        }

        public Builder clearUserName() {
            copyOnWrite();
            ((UserBean) this.instance).clearUserName();
            return this;
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public String getAvatar() {
            return ((UserBean) this.instance).getAvatar();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public ByteString getAvatarBytes() {
            return ((UserBean) this.instance).getAvatarBytes();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public String getId() {
            return ((UserBean) this.instance).getId();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public ByteString getIdBytes() {
            return ((UserBean) this.instance).getIdBytes();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public String getRealName() {
            return ((UserBean) this.instance).getRealName();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public ByteString getRealNameBytes() {
            return ((UserBean) this.instance).getRealNameBytes();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public RoleType getRole() {
            return ((UserBean) this.instance).getRole();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public int getRoleValue() {
            return ((UserBean) this.instance).getRoleValue();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public String getUserName() {
            return ((UserBean) this.instance).getUserName();
        }

        @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
        public ByteString getUserNameBytes() {
            return ((UserBean) this.instance).getUserNameBytes();
        }

        public Builder setAvatar(String str) {
            copyOnWrite();
            ((UserBean) this.instance).setAvatar(str);
            return this;
        }

        public Builder setAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((UserBean) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((UserBean) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((UserBean) this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setRealName(String str) {
            copyOnWrite();
            ((UserBean) this.instance).setRealName(str);
            return this;
        }

        public Builder setRealNameBytes(ByteString byteString) {
            copyOnWrite();
            ((UserBean) this.instance).setRealNameBytes(byteString);
            return this;
        }

        public Builder setRole(RoleType roleType) {
            copyOnWrite();
            ((UserBean) this.instance).setRole(roleType);
            return this;
        }

        public Builder setRoleValue(int i10) {
            copyOnWrite();
            ((UserBean) this.instance).setRoleValue(i10);
            return this;
        }

        public Builder setUserName(String str) {
            copyOnWrite();
            ((UserBean) this.instance).setUserName(str);
            return this;
        }

        public Builder setUserNameBytes(ByteString byteString) {
            copyOnWrite();
            ((UserBean) this.instance).setUserNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(UserBean.DEFAULT_INSTANCE);
        }
    }

    static {
        UserBean userBean = new UserBean();
        DEFAULT_INSTANCE = userBean;
        GeneratedMessageLite.registerDefaultInstance(UserBean.class, userBean);
    }

    private UserBean() {
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

    public static UserBean getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserBean parseDelimitedFrom(InputStream inputStream) {
        return (UserBean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserBean parseFrom(ByteBuffer byteBuffer) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserBean> parser() {
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
    public void setRoleValue(int i10) {
        this.role_ = i10;
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
        switch (C73251.f9908xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserBean();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"id_", "userName_", "realName_", "avatar_", "role_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserBean> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UserBean.class) {
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

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.avatar_);
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public String getRealName() {
        return this.realName_;
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public ByteString getRealNameBytes() {
        return ByteString.copyFromUtf8(this.realName_);
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public RoleType getRole() {
        RoleType roleTypeForNumber = RoleType.forNumber(this.role_);
        return roleTypeForNumber == null ? RoleType.UNRECOGNIZED : roleTypeForNumber;
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public int getRoleValue() {
        return this.role_;
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public String getUserName() {
        return this.userName_;
    }

    @Override // com.zykj.lib.login.proto.UserBeanOrBuilder
    public ByteString getUserNameBytes() {
        return ByteString.copyFromUtf8(this.userName_);
    }

    public static Builder newBuilder(UserBean userBean) {
        return DEFAULT_INSTANCE.createBuilder(userBean);
    }

    public static UserBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserBean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserBean parseFrom(ByteString byteString) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserBean parseFrom(byte[] bArr) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserBean parseFrom(InputStream inputStream) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserBean parseFrom(CodedInputStream codedInputStream) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

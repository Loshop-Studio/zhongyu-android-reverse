package com.zykj.lib.login.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes4.dex */
public interface UserBeanOrBuilder extends MessageLiteOrBuilder {
    String getAvatar();

    ByteString getAvatarBytes();

    String getId();

    ByteString getIdBytes();

    String getRealName();

    ByteString getRealNameBytes();

    RoleType getRole();

    int getRoleValue();

    String getUserName();

    ByteString getUserNameBytes();
}

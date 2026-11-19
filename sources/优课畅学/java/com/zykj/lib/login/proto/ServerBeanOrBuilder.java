package com.zykj.lib.login.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes4.dex */
public interface ServerBeanOrBuilder extends MessageLiteOrBuilder {
    String getAccessToken();

    ByteString getAccessTokenBytes();

    String getRefreshToken();

    ByteString getRefreshTokenBytes();

    String getSchoolCode();

    ByteString getSchoolCodeBytes();

    String getServerUrl();

    ByteString getServerUrlBytes();

    String getWebServerUrl();

    ByteString getWebServerUrlBytes();
}

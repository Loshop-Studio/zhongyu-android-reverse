package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.zykj.huiwei.launcher.proto.c */
/* loaded from: classes4.dex */
public interface InterfaceC6065c extends MessageLiteOrBuilder {
    String getAccessToken();

    ByteString getAccessTokenBytes();

    String getImAccessToken();

    ByteString getImAccessTokenBytes();

    String getMobile();

    ByteString getMobileBytes();

    boolean getNeedChangePwd();

    boolean getNeedSmsVerify();

    String getRefreshToken();

    ByteString getRefreshTokenBytes();

    String getSchoolCode();

    ByteString getSchoolCodeBytes();

    String getServerUrl();

    ByteString getServerUrlBytes();

    long getUserId();

    String getWebServerUrl();

    ByteString getWebServerUrlBytes();
}

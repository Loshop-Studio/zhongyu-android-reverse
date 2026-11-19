package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.zykj.huiwei.launcher.proto.f */
/* loaded from: classes4.dex */
public interface InterfaceC6068f extends MessageLiteOrBuilder {
    boolean getIsFirstInstall();

    boolean getIsLoginSuccess();

    boolean getNeedCheckCrack();

    String getWhiteIpList();

    ByteString getWhiteIpListBytes();

    String getWifiInfo();

    ByteString getWifiInfoBytes();
}

package com.p074ta.utdid2.device;

import android.app.Application;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.sender.AlicloudSender;
import com.alibaba.sdk.android.sender.SdkInfo;
import com.alibaba.sdk.android.sender.SenderLog;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.p099e.C7744e;

/* loaded from: classes5.dex */
public class SophixInvoker {
    private static final String TAG = "SophixInvoker";

    public static void invokeAlicloudReport(Application application, String str) {
        SdkInfo sdkInfo = new SdkInfo();
        sdkInfo.setSdkId("hotfix");
        sdkInfo.setSdkVersion(SophixManager.VERSION);
        sdkInfo.setAppKey(str);
        AlicloudSender.asyncSend(application, sdkInfo);
        C7744e.m10393a(TAG, "device is active.", new Object[0]);
    }

    public static void invokeAlicloudSenderDebug(boolean z10) {
        if (z10) {
            SenderLog.setLevel(LogLevel.DEBUG);
        } else {
            SenderLog.setLevel(LogLevel.WARN);
        }
    }
}

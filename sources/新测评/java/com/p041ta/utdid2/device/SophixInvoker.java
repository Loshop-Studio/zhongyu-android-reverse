package com.p041ta.utdid2.device;

import android.app.Application;
import com.alibaba.sdk.android.logger.LogLevel;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.p052e.C6378e;
import p072e0.AbstractC7321a;
import p072e0.AbstractC7323c;
import p072e0.C7322b;

/* loaded from: classes4.dex */
public class SophixInvoker {
    private static final String TAG = "SophixInvoker";

    public static void invokeAlicloudReport(Application application, String str) {
        C7322b c7322b = new C7322b();
        c7322b.m11640e("hotfix");
        c7322b.m11641f(SophixManager.VERSION);
        c7322b.m11639d(str);
        AbstractC7321a.m11625g(application, c7322b);
        C6378e.m4702a(TAG, "device is active.", new Object[0]);
    }

    public static void invokeAlicloudSenderDebug(boolean z9) {
        if (z9) {
            AbstractC7323c.m11643b(LogLevel.DEBUG);
        } else {
            AbstractC7323c.m11643b(LogLevel.WARN);
        }
    }
}

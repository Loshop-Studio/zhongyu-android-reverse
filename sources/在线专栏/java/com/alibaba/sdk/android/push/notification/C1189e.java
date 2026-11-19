package com.alibaba.sdk.android.push.notification;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Random;

/* renamed from: com.alibaba.sdk.android.push.notification.e */
/* loaded from: classes.dex */
public class C1189e {

    /* renamed from: a */
    private static Random f6914a;

    /* renamed from: a */
    public static boolean m5363a(Context context) {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Exception unused) {
            return false;
        }
    }
}

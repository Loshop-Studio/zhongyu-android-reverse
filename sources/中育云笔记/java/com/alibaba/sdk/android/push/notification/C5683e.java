package com.alibaba.sdk.android.push.notification;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Random;

/* renamed from: com.alibaba.sdk.android.push.notification.e */
/* loaded from: classes3.dex */
public class C5683e {

    /* renamed from: a */
    private static Random f4440a;

    /* renamed from: a */
    public static boolean m3814a(Context context) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        try {
            runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Exception unused) {
        }
        return runningAppProcessInfo.importance == 100;
    }
}

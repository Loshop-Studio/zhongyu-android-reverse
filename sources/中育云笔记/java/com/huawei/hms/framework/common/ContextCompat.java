package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Process;

/* loaded from: classes5.dex */
public class ContextCompat {
    public static boolean checkSelfPermission(Context context, String str) {
        if (context == null || str == null) {
            Logger.m8588w("ContextCompat", "param is null");
            return false;
        }
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (RuntimeException e10) {
            Logger.m8574e("ContextCompat", "dealType rethrowFromSystemServer:", e10);
            return false;
        }
    }

    public static Context getProtectedStorageContext(Context context) {
        if (context != null) {
            return context.createDeviceProtectedStorageContext();
        }
        Logger.m8588w("ContextCompat", "context is null");
        return null;
    }

    public static Object getSystemService(Context context, String str) {
        if (context == null) {
            Logger.m8588w("ContextCompat", "context is null");
            return null;
        }
        try {
            return context.getSystemService(str);
        } catch (RuntimeException e10) {
            Logger.m8574e("ContextCompat", "SystemServer error:", e10);
            return null;
        }
    }
}

package com.p074ta.utdid2.device;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.p074ta.p075a.p078c.C7585f;
import java.lang.reflect.Method;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.ta.utdid2.device.c */
/* loaded from: classes5.dex */
class C7594c {

    /* renamed from: e */
    private static String f12870e;

    /* renamed from: a */
    private static PackageInfo m9821a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception e10) {
            C7585f.m9795a("", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m9823c(Context context) {
        try {
            String strM9825e = m9825e(context);
            String strM9822c = m9822c(context);
            C7585f.m9796a("", "curProcessName", strM9822c);
            if (!TextUtils.isEmpty(strM9822c) && !TextUtils.isEmpty(strM9825e)) {
                return strM9822c.equals(strM9825e);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static String m9824d(Context context) {
        try {
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    private static String m9825e(Context context) {
        PackageInfo packageInfoM9821a = m9821a(context);
        return packageInfoM9821a != null ? packageInfoM9821a.packageName : "";
    }

    /* renamed from: n */
    private static String m9826n() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: o */
    private static String m9827o() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            C7585f.m9795a("", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private static String m9822c(Context context) {
        if (!TextUtils.isEmpty(f12870e)) {
            return f12870e;
        }
        String strM9826n = m9826n();
        f12870e = strM9826n;
        C7585f.m9796a("", "currentProcessName", strM9826n);
        if (!TextUtils.isEmpty(f12870e)) {
            return f12870e;
        }
        String strM9827o = m9827o();
        f12870e = strM9827o;
        C7585f.m9796a("", "currentProcessName2", strM9827o);
        if (!TextUtils.isEmpty(f12870e)) {
            return f12870e;
        }
        String strM9824d = m9824d(context);
        f12870e = strM9824d;
        C7585f.m9796a("", "currentProcessName3", strM9824d);
        return f12870e;
    }
}

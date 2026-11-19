package com.p053ta.utdid2.device;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.p053ta.p054a.p057c.C1688f;
import java.lang.reflect.Method;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.ta.utdid2.device.c */
/* loaded from: classes.dex */
class C1697c {

    /* renamed from: e */
    private static String f7472e;

    /* renamed from: a */
    private static PackageInfo m5795a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception e4) {
            C1688f.m5769a("", e4, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m5797c(Context context) {
        try {
            String strM5799e = m5799e(context);
            String strM5796c = m5796c(context);
            C1688f.m5770a("", "curProcessName", strM5796c);
            if (!TextUtils.isEmpty(strM5796c) && !TextUtils.isEmpty(strM5799e)) {
                return strM5796c.equals(strM5799e);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static String m5798d(Context context) {
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
    private static String m5799e(Context context) {
        PackageInfo packageInfoM5795a = m5795a(context);
        return packageInfoM5795a != null ? packageInfoM5795a.packageName : "";
    }

    /* renamed from: n */
    private static String m5800n() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: o */
    private static String m5801o() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            C1688f.m5769a("", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private static String m5796c(Context context) {
        if (!TextUtils.isEmpty(f7472e)) {
            return f7472e;
        }
        String strM5800n = m5800n();
        f7472e = strM5800n;
        C1688f.m5770a("", "currentProcessName", strM5800n);
        if (!TextUtils.isEmpty(f7472e)) {
            return f7472e;
        }
        String strM5801o = m5801o();
        f7472e = strM5801o;
        C1688f.m5770a("", "currentProcessName2", strM5801o);
        if (!TextUtils.isEmpty(f7472e)) {
            return f7472e;
        }
        String strM5798d = m5798d(context);
        f7472e = strM5798d;
        C1688f.m5770a("", "currentProcessName3", strM5798d);
        return f7472e;
    }
}

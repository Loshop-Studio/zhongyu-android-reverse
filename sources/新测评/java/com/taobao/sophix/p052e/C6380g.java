package com.taobao.sophix.p052e;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* renamed from: com.taobao.sophix.e.g */
/* loaded from: classes4.dex */
public class C6380g {

    /* renamed from: a */
    private static String f4971a;

    /* renamed from: b */
    private static String f4972b;

    /* renamed from: a */
    public static boolean m4717a(Application application) {
        try {
            m4719b(application);
            if (TextUtils.isEmpty(f4971a)) {
                f4971a = application.getPackageManager().getPackageInfo(application.getBaseContext().getPackageName(), 0).applicationInfo.processName;
            }
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(f4971a) && f4971a.equals(f4972b);
    }

    /* renamed from: b */
    private static void m4719b(Application application) {
        if (TextUtils.isEmpty(f4972b)) {
            m4716a();
            if (TextUtils.isEmpty(f4972b)) {
                m4718b();
                if (TextUtils.isEmpty(f4972b)) {
                    m4720c(application);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m4720c(Application application) {
        if (TextUtils.isEmpty(f4972b)) {
            try {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            String str = runningAppProcessInfo.processName;
                            f4972b = str;
                            C6378e.m4702a("ProcessUtils", "process name am", str);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m4716a() {
        if (TextUtils.isEmpty(f4972b) && Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            f4972b = processName;
            C6378e.m4702a("ProcessUtils", "process name ap", processName);
        }
    }

    /* renamed from: b */
    private static void m4718b() {
        if (TextUtils.isEmpty(f4972b)) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    String str = (String) objInvoke;
                    f4972b = str;
                    C6378e.m4702a("ProcessUtils", "process name at", str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

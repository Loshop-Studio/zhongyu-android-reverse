package com.taobao.sophix.p069e;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* renamed from: com.taobao.sophix.e.g */
/* loaded from: classes4.dex */
public class C6640g {

    /* renamed from: a */
    private static String f5548a;

    /* renamed from: b */
    private static String f5549b;

    /* renamed from: a */
    public static boolean m4896a(Application application) {
        try {
            m4898b(application);
            if (TextUtils.isEmpty(f5548a)) {
                f5548a = application.getPackageManager().getPackageInfo(application.getBaseContext().getPackageName(), 0).applicationInfo.processName;
            }
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(f5548a) && f5548a.equals(f5549b);
    }

    /* renamed from: b */
    private static void m4898b(Application application) {
        if (TextUtils.isEmpty(f5549b)) {
            m4895a();
            if (TextUtils.isEmpty(f5549b)) {
                m4897b();
                if (TextUtils.isEmpty(f5549b)) {
                    m4899c(application);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m4899c(Application application) {
        if (TextUtils.isEmpty(f5549b)) {
            try {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            String str = runningAppProcessInfo.processName;
                            f5549b = str;
                            C6638e.m4881a("ProcessUtils", "process name am", str);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m4895a() {
        if (TextUtils.isEmpty(f5549b) && Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            f5549b = processName;
            C6638e.m4881a("ProcessUtils", "process name ap", processName);
        }
    }

    /* renamed from: b */
    private static void m4897b() {
        if (TextUtils.isEmpty(f5549b)) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    String str = (String) objInvoke;
                    f5549b = str;
                    C6638e.m4881a("ProcessUtils", "process name at", str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

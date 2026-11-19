package com.taobao.sophix.p099e;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.taobao.sophix.e.g */
/* loaded from: classes5.dex */
public class C7746g {

    /* renamed from: a */
    private static String f13413a;

    /* renamed from: b */
    private static String f13414b;

    /* renamed from: a */
    public static boolean m10408a(Application application) {
        try {
            m10410b(application);
            if (TextUtils.isEmpty(f13413a)) {
                f13413a = application.getPackageManager().getPackageInfo(application.getBaseContext().getPackageName(), 0).applicationInfo.processName;
            }
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(f13413a) && f13413a.equals(f13414b);
    }

    /* renamed from: b */
    private static void m10410b(Application application) {
        if (TextUtils.isEmpty(f13414b)) {
            m10407a();
            if (TextUtils.isEmpty(f13414b)) {
                m10409b();
                if (TextUtils.isEmpty(f13414b)) {
                    m10411c(application);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m10411c(Application application) {
        if (TextUtils.isEmpty(f13414b)) {
            try {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) application.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            String str = runningAppProcessInfo.processName;
                            f13414b = str;
                            C7744e.m10393a("ProcessUtils", "process name am", str);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m10407a() {
        if (TextUtils.isEmpty(f13414b) && Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            f13414b = processName;
            C7744e.m10393a("ProcessUtils", "process name ap", processName);
        }
    }

    /* renamed from: b */
    private static void m10409b() {
        if (TextUtils.isEmpty(f13414b)) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    String str = (String) objInvoke;
                    f13414b = str;
                    C7744e.m10393a("ProcessUtils", "process name at", str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

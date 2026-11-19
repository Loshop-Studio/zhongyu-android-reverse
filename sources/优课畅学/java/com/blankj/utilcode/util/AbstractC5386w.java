package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.w */
/* loaded from: classes3.dex */
public abstract class AbstractC5386w {
    /* renamed from: a */
    public static String m2669a() throws IOException {
        String strM2671c = m2671c();
        if (!TextUtils.isEmpty(strM2671c)) {
            return strM2671c;
        }
        String strM2670b = m2670b();
        return !TextUtils.isEmpty(strM2670b) ? strM2670b : m2672d();
    }

    /* renamed from: b */
    public static String m2670b() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) AbstractC5366h0.m2478a().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int iMyPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid && (str = runningAppProcessInfo.processName) != null) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: c */
    public static String m2671c() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return strTrim;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m2672d() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Application applicationM2478a = AbstractC5366h0.m2478a();
            Field field = applicationM2478a.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationM2478a);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}

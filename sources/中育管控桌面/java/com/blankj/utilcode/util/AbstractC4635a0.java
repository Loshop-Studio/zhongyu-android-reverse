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

/* renamed from: com.blankj.utilcode.util.a0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4635a0 {
    /* renamed from: a */
    public static String m2124a() throws IOException {
        String strM2126c = m2126c();
        if (!TextUtils.isEmpty(strM2126c)) {
            return strM2126c;
        }
        String strM2125b = m2125b();
        return !TextUtils.isEmpty(strM2125b) ? strM2125b : m2127d();
    }

    /* renamed from: b */
    public static String m2125b() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) AbstractC4657l0.m2250a().getSystemService("activity");
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
    public static String m2126c() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return strTrim;
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m2127d() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Application applicationM2250a = AbstractC4657l0.m2250a();
            Field field = applicationM2250a.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationM2250a);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }
}

package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3383c0 {
    /* renamed from: a */
    public static String m2322a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = AbstractC3382c.f2130a;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (byte b6 : bArr) {
            int i8 = i + 1;
            cArr2[i] = cArr[(b6 >> 4) & 15];
            i += 2;
            cArr2[i8] = cArr[b6 & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: b */
    public static int m2323b(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static LinkedList m2324c() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objM2294c;
        LinkedList linkedList = C3381b0.f2122g.f2124a;
        if (!linkedList.isEmpty()) {
            return new LinkedList(linkedList);
        }
        LinkedList linkedList2 = new LinkedList();
        Activity activity = null;
        try {
            objM2294c = C3381b0.m2294c();
        } catch (Exception e) {
            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e.getMessage());
        }
        if (objM2294c != null) {
            Field declaredField = objM2294c.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objM2294c);
            if (obj instanceof Map) {
                for (Object obj2 : ((Map) obj).values()) {
                    Class<?> cls = obj2.getClass();
                    Field declaredField2 = cls.getDeclaredField("activity");
                    declaredField2.setAccessible(true);
                    Activity activity2 = (Activity) declaredField2.get(obj2);
                    if (activity == null) {
                        Field declaredField3 = cls.getDeclaredField("paused");
                        declaredField3.setAccessible(true);
                        if (declaredField3.getBoolean(obj2)) {
                            linkedList2.addFirst(activity2);
                        } else {
                            activity = activity2;
                        }
                    } else {
                        linkedList2.addFirst(activity2);
                    }
                }
                if (activity != null) {
                    linkedList2.addFirst(activity);
                }
            }
        }
        linkedList.addAll(linkedList2);
        return new LinkedList(linkedList);
    }

    /* renamed from: d */
    public static String m2325d() throws IllegalAccessException, NoSuchFieldException, IOException, SecurityException, IllegalArgumentException {
        String strTrim;
        String str;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str2;
        String str3 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            strTrim = "";
        }
        if (!TextUtils.isEmpty(strTrim)) {
            return strTrim;
        }
        try {
            activityManager = (ActivityManager) AbstractC3382c.m2303d().getSystemService("activity");
        } catch (Exception unused) {
        }
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() == 0) {
            str = "";
        } else {
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid && (str2 = runningAppProcessInfo.processName) != null) {
                    str = str2;
                    break;
                }
            }
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Application applicationM2303d = AbstractC3382c.m2303d();
            Field field = applicationM2303d.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationM2303d);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            str3 = (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return str3;
    }

    /* renamed from: e */
    public static boolean m2326e(File file) throws IOException {
        int i = AbstractC3385e.f2155a;
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            String absolutePath = file.getAbsolutePath();
            File fileM2335g = AbstractC3385e.m2335g(absolutePath);
            if (fileM2335g == null) {
                return false;
            }
            if (!fileM2335g.exists()) {
                if (Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = AbstractC3382c.m2303d().getContentResolver().openAssetFileDescriptor(Uri.parse(absolutePath), "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        return false;
                    }
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (FileNotFoundException unused2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m2327f(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static void m2328g(Runnable runnable) {
        Handler handler = AbstractC3396p.f2173a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            AbstractC3396p.f2173a.post(runnable);
        }
    }
}

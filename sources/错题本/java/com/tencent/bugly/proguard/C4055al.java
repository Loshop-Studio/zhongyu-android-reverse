package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.al */
/* loaded from: classes3.dex */
public final class C4055al {

    /* renamed from: a */
    public static String f3520a = "CrashReportInfo";

    /* renamed from: b */
    public static String f3521b = "CrashReport";

    /* renamed from: c */
    public static boolean f3522c = false;

    /* renamed from: a */
    private static boolean m3018a(int i, String str, Object... objArr) {
        if (!f3522c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i == 0) {
            Log.i(f3521b, str);
            return true;
        }
        if (i == 1) {
            Log.d(f3521b, str);
            return true;
        }
        if (i == 2) {
            Log.w(f3521b, str);
            return true;
        }
        if (i == 3) {
            Log.e(f3521b, str);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Log.i(f3520a, str);
        return true;
    }

    /* renamed from: b */
    public static boolean m3023b(String str, Object... objArr) {
        return m3018a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m3025c(String str, Object... objArr) {
        return m3018a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m3026d(String str, Object... objArr) {
        return m3018a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m3027e(String str, Object... objArr) {
        return m3018a(3, str, objArr);
    }

    /* renamed from: b */
    public static boolean m3024b(Throwable th) {
        return m3019a(3, th);
    }

    /* renamed from: a */
    private static boolean m3019a(int i, Throwable th) {
        if (f3522c) {
            return m3018a(i, C4059ap.m3062a(th), new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3021a(String str, Object... objArr) {
        return m3018a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m3020a(Class cls, String str, Object... objArr) {
        Locale locale = Locale.US;
        return m3018a(0, "[" + cls.getSimpleName() + "] " + str, objArr);
    }

    /* renamed from: a */
    public static boolean m3022a(Throwable th) {
        return m3019a(2, th);
    }
}

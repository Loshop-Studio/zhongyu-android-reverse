package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.al */
/* loaded from: classes4.dex */
public final class C6414al {

    /* renamed from: a */
    public static String f5289a = "CrashReportInfo";

    /* renamed from: b */
    public static String f5290b = "CrashReport";

    /* renamed from: c */
    public static boolean f5291c = false;

    /* renamed from: a */
    private static boolean m4920a(int i10, String str, Object... objArr) {
        if (!f5291c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i10 == 0) {
            Log.i(f5290b, str);
            return true;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Log.e(f5290b, str);
                    return true;
                }
                if (i10 != 5) {
                    return false;
                }
                Log.i(f5289a, str);
                return true;
            }
            Log.w(f5290b, str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4925b(String str, Object... objArr) {
        return m4920a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m4927c(String str, Object... objArr) {
        return m4920a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m4928d(String str, Object... objArr) {
        return m4920a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m4929e(String str, Object... objArr) {
        return m4920a(3, str, objArr);
    }

    /* renamed from: b */
    public static boolean m4926b(Throwable th) {
        return m4921a(3, th);
    }

    /* renamed from: a */
    private static boolean m4921a(int i10, Throwable th) {
        if (f5291c) {
            return m4920a(i10, C6418ap.m4964a(th), new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4923a(String str, Object... objArr) {
        return m4920a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m4922a(Class cls, String str, Object... objArr) {
        return m4920a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: a */
    public static boolean m4924a(Throwable th) {
        return m4921a(2, th);
    }
}

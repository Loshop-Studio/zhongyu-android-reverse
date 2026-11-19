package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.al */
/* loaded from: classes3.dex */
public final class C5791al {

    /* renamed from: a */
    public static String f4010a = "CrashReportInfo";

    /* renamed from: b */
    public static String f4011b = "CrashReport";

    /* renamed from: c */
    public static boolean f4012c = false;

    /* renamed from: a */
    private static boolean m3925a(int i6, String str, Object... objArr) {
        if (!f4012c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i6 == 0) {
            Log.i(f4011b, str);
            return true;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    Log.e(f4011b, str);
                    return true;
                }
                if (i6 != 5) {
                    return false;
                }
                Log.i(f4010a, str);
                return true;
            }
            Log.w(f4011b, str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m3930b(String str, Object... objArr) {
        return m3925a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m3932c(String str, Object... objArr) {
        return m3925a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m3933d(String str, Object... objArr) {
        return m3925a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m3934e(String str, Object... objArr) {
        return m3925a(3, str, objArr);
    }

    /* renamed from: b */
    public static boolean m3931b(Throwable th) {
        return m3926a(3, th);
    }

    /* renamed from: a */
    private static boolean m3926a(int i6, Throwable th) {
        if (f4012c) {
            return m3925a(i6, C5795ap.m3969a(th), new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3928a(String str, Object... objArr) {
        return m3925a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m3927a(Class cls, String str, Object... objArr) {
        return m3925a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: a */
    public static boolean m3929a(Throwable th) {
        return m3926a(2, th);
    }
}

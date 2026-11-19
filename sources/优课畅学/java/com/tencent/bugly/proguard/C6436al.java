package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.al */
/* loaded from: classes4.dex */
public final class C6436al {

    /* renamed from: a */
    public static String f4632a = "CrashReportInfo";

    /* renamed from: b */
    public static String f4633b = "CrashReport";

    /* renamed from: c */
    public static boolean f4634c = false;

    /* renamed from: a */
    private static boolean m4280a(int i10, String str, Object... objArr) {
        if (!f4634c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i10 == 0) {
            Log.i(f4633b, str);
            return true;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Log.e(f4633b, str);
                    return true;
                }
                if (i10 != 5) {
                    return false;
                }
                Log.i(f4632a, str);
                return true;
            }
            Log.w(f4633b, str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4285b(String str, Object... objArr) {
        return m4280a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m4287c(String str, Object... objArr) {
        return m4280a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m4288d(String str, Object... objArr) {
        return m4280a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m4289e(String str, Object... objArr) {
        return m4280a(3, str, objArr);
    }

    /* renamed from: b */
    public static boolean m4286b(Throwable th) {
        return m4281a(3, th);
    }

    /* renamed from: a */
    private static boolean m4281a(int i10, Throwable th) {
        if (f4634c) {
            return m4280a(i10, C6440ap.m4324a(th), new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4283a(String str, Object... objArr) {
        return m4280a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m4282a(Class cls, String str, Object... objArr) {
        return m4280a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: a */
    public static boolean m4284a(Throwable th) {
        return m4281a(2, th);
    }
}

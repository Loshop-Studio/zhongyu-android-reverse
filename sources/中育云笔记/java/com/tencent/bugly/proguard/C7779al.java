package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.al */
/* loaded from: classes5.dex */
public final class C7779al {

    /* renamed from: a */
    public static String f13731a = "CrashReportInfo";

    /* renamed from: b */
    public static String f13732b = "CrashReport";

    /* renamed from: c */
    public static boolean f13733c = false;

    /* renamed from: a */
    private static boolean m10610a(int i10, String str, Object... objArr) {
        if (!f13733c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i10 == 0) {
            Log.i(f13732b, str);
            return true;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Log.e(f13732b, str);
                    return true;
                }
                if (i10 != 5) {
                    return false;
                }
                Log.i(f13731a, str);
                return true;
            }
            Log.w(f13732b, str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m10615b(String str, Object... objArr) {
        return m10610a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m10617c(String str, Object... objArr) {
        return m10610a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m10618d(String str, Object... objArr) {
        return m10610a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m10619e(String str, Object... objArr) {
        return m10610a(3, str, objArr);
    }

    /* renamed from: b */
    public static boolean m10616b(Throwable th) {
        return m10611a(3, th);
    }

    /* renamed from: a */
    private static boolean m10611a(int i10, Throwable th) {
        if (f13733c) {
            return m10610a(i10, C7783ap.m10654a(th), new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m10613a(String str, Object... objArr) {
        return m10610a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m10612a(Class cls, String str, Object... objArr) {
        return m10610a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: a */
    public static boolean m10614a(Throwable th) {
        return m10611a(2, th);
    }
}

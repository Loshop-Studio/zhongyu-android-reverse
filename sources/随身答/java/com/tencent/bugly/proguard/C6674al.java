package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.al */
/* loaded from: classes4.dex */
public final class C6674al {

    /* renamed from: a */
    public static String f5866a = "CrashReportInfo";

    /* renamed from: b */
    public static String f5867b = "CrashReport";

    /* renamed from: c */
    public static boolean f5868c = false;

    /* renamed from: a */
    private static boolean m5099a(int i9, String str, Object... objArr) {
        if (!f5868c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i9 == 0) {
            Log.i(f5867b, str);
            return true;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    Log.e(f5867b, str);
                    return true;
                }
                if (i9 != 5) {
                    return false;
                }
                Log.i(f5866a, str);
                return true;
            }
            Log.w(f5867b, str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m5104b(String str, Object... objArr) {
        return m5099a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m5106c(String str, Object... objArr) {
        return m5099a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m5107d(String str, Object... objArr) {
        return m5099a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m5108e(String str, Object... objArr) {
        return m5099a(3, str, objArr);
    }

    /* renamed from: b */
    public static boolean m5105b(Throwable th) {
        return m5100a(3, th);
    }

    /* renamed from: a */
    private static boolean m5100a(int i9, Throwable th) {
        if (f5868c) {
            return m5099a(i9, C6678ap.m5143a(th), new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5102a(String str, Object... objArr) {
        return m5099a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m5101a(Class cls, String str, Object... objArr) {
        return m5099a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: a */
    public static boolean m5103a(Throwable th) {
        return m5100a(2, th);
    }
}

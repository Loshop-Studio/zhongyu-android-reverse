package com.taobao.sophix.p052e;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.taobao.sophix.e.e */
/* loaded from: classes4.dex */
public class C6378e {

    /* renamed from: a */
    private static boolean f4962a = true;

    /* renamed from: b */
    private static a f4963b = a.I;

    /* renamed from: com.taobao.sophix.e.e$a */
    public enum a {
        V,
        D,
        I,
        W,
        E
    }

    /* renamed from: a */
    public static void m4707a(boolean z9) {
        f4962a = z9;
    }

    /* renamed from: b */
    public static int m4709b(String str, String str2, Object... objArr) {
        if (f4962a && m4710b(a.D)) {
            return Log.d(m4704a(str), m4705a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public static int m4711c(String str, String str2, Object... objArr) {
        if (f4962a && m4710b(a.I)) {
            return Log.i(m4704a(str), m4705a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: d */
    public static int m4712d(String str, String str2, Object... objArr) {
        return m4701a(str, str2, null, objArr);
    }

    /* renamed from: e */
    public static int m4713e(String str, String str2, Object... objArr) {
        return m4708b(str, str2, null, objArr);
    }

    /* renamed from: a */
    public static void m4706a(a aVar) {
        if (aVar != null) {
            f4963b = aVar;
            if (f4962a) {
                m4711c("LogLevel", "set", "value", aVar);
            }
        }
    }

    /* renamed from: b */
    public static int m4708b(String str, String str2, Throwable th, Object... objArr) {
        if (f4962a && m4710b(a.E)) {
            return Log.e(m4704a(str), m4705a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m4702a(String str, String str2, Object... objArr) {
        if (f4962a && m4710b(a.V)) {
            return Log.v(m4704a(str), m4705a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m4710b(a aVar) {
        return aVar.ordinal() >= f4963b.ordinal();
    }

    /* renamed from: a */
    public static int m4701a(String str, String str2, Throwable th, Object... objArr) {
        if (f4962a && m4710b(a.W)) {
            return Log.w(m4704a(str), m4705a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: a */
    private static String m4704a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "Sophix." + str;
    }

    /* renamed from: a */
    private static String m4705a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(m4703a(objArr[i10], objArr[i11]));
                i10 += 2;
            }
            if (i10 == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i10]);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m4703a(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(": ");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }
}

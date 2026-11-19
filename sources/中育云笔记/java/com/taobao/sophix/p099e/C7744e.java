package com.taobao.sophix.p099e;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.taobao.sophix.e.e */
/* loaded from: classes5.dex */
public class C7744e {

    /* renamed from: a */
    private static boolean f13404a = true;

    /* renamed from: b */
    private static a f13405b = a.I;

    /* renamed from: com.taobao.sophix.e.e$a */
    public enum a {
        V,
        D,
        I,
        W,
        E
    }

    /* renamed from: a */
    public static void m10398a(boolean z10) {
        f13404a = z10;
    }

    /* renamed from: b */
    public static int m10400b(String str, String str2, Object... objArr) {
        if (f13404a && m10401b(a.D)) {
            return Log.d(m10395a(str), m10396a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public static int m10402c(String str, String str2, Object... objArr) {
        if (f13404a && m10401b(a.I)) {
            return Log.i(m10395a(str), m10396a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: d */
    public static int m10403d(String str, String str2, Object... objArr) {
        return m10392a(str, str2, null, objArr);
    }

    /* renamed from: e */
    public static int m10404e(String str, String str2, Object... objArr) {
        return m10399b(str, str2, null, objArr);
    }

    /* renamed from: a */
    public static void m10397a(a aVar) {
        if (aVar != null) {
            f13405b = aVar;
            if (f13404a) {
                m10402c("LogLevel", "set", "value", aVar);
            }
        }
    }

    /* renamed from: b */
    public static int m10399b(String str, String str2, Throwable th, Object... objArr) {
        if (f13404a && m10401b(a.E)) {
            return Log.e(m10395a(str), m10396a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m10393a(String str, String str2, Object... objArr) {
        if (f13404a && m10401b(a.V)) {
            return Log.v(m10395a(str), m10396a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m10401b(a aVar) {
        return aVar.ordinal() >= f13405b.ordinal();
    }

    /* renamed from: a */
    public static int m10392a(String str, String str2, Throwable th, Object... objArr) {
        if (f13404a && m10401b(a.W)) {
            return Log.w(m10395a(str), m10396a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: a */
    private static String m10395a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "Sophix." + str;
    }

    /* renamed from: a */
    private static String m10396a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(" ");
                sb2.append(m10394a(objArr[i10], objArr[i11]));
                i10 += 2;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static String m10394a(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb2.append(obj);
        sb2.append(": ");
        if (obj2 == null) {
            obj2 = "";
        }
        sb2.append(obj2);
        return sb2.toString();
    }
}

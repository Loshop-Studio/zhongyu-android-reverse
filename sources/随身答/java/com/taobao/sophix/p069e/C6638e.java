package com.taobao.sophix.p069e;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.taobao.sophix.e.e */
/* loaded from: classes4.dex */
public class C6638e {

    /* renamed from: a */
    private static boolean f5539a = true;

    /* renamed from: b */
    private static a f5540b = a.I;

    /* renamed from: com.taobao.sophix.e.e$a */
    public enum a {
        V,
        D,
        I,
        W,
        E
    }

    /* renamed from: a */
    public static void m4886a(boolean z9) {
        f5539a = z9;
    }

    /* renamed from: b */
    public static int m4888b(String str, String str2, Object... objArr) {
        if (f5539a && m4889b(a.D)) {
            return Log.d(m4883a(str), m4884a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public static int m4890c(String str, String str2, Object... objArr) {
        if (f5539a && m4889b(a.I)) {
            return Log.i(m4883a(str), m4884a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: d */
    public static int m4891d(String str, String str2, Object... objArr) {
        return m4880a(str, str2, null, objArr);
    }

    /* renamed from: e */
    public static int m4892e(String str, String str2, Object... objArr) {
        return m4887b(str, str2, null, objArr);
    }

    /* renamed from: a */
    public static void m4885a(a aVar) {
        if (aVar != null) {
            f5540b = aVar;
            if (f5539a) {
                m4890c("LogLevel", "set", "value", aVar);
            }
        }
    }

    /* renamed from: b */
    public static int m4887b(String str, String str2, Throwable th, Object... objArr) {
        if (f5539a && m4889b(a.E)) {
            return Log.e(m4883a(str), m4884a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m4881a(String str, String str2, Object... objArr) {
        if (f5539a && m4889b(a.V)) {
            return Log.v(m4883a(str), m4884a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m4889b(a aVar) {
        return aVar.ordinal() >= f5540b.ordinal();
    }

    /* renamed from: a */
    public static int m4880a(String str, String str2, Throwable th, Object... objArr) {
        if (f5539a && m4889b(a.W)) {
            return Log.w(m4883a(str), m4884a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: a */
    private static String m4883a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "Sophix." + str;
    }

    /* renamed from: a */
    private static String m4884a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i10 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(m4882a(objArr[i9], objArr[i10]));
                i9 += 2;
            }
            if (i9 == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i9]);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m4882a(Object obj, Object obj2) {
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

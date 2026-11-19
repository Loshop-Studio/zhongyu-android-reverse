package com.umeng.analytics.pro;

import android.util.Log;

/* renamed from: com.umeng.analytics.pro.ah */
/* loaded from: classes.dex */
public class C1850ah {

    /* renamed from: a */
    private static final String f8223a = "OpenId";

    /* renamed from: b */
    private static boolean f8224b = false;

    /* renamed from: a */
    public static void m6759a(boolean z3) {
        Log.d(f8223a, "setDebug:" + z3);
        f8224b = z3;
    }

    /* renamed from: b */
    public static void m6760b(String str, Object... objArr) {
        if (f8224b) {
            Log.i(f8223a, m6763e(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m6761c(String str, Object... objArr) {
        if (f8224b) {
            Log.w(f8223a, m6763e(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m6762d(String str, Object... objArr) {
        if (f8224b) {
            Log.e(f8223a, m6763e(str, objArr));
        }
    }

    /* renamed from: e */
    private static String m6763e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        int i4 = 0;
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= objArr.length) {
                    break;
                }
                sb.append(m6757a(objArr[i4], objArr[i5]));
                if (i5 < length - 1) {
                    sb.append(",");
                }
                i4 = i5 + 1;
            }
            if (i4 == objArr.length - 1) {
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m6758a(String str, Object... objArr) {
        if (f8224b) {
            Log.d(f8223a, m6763e(str, objArr));
        }
    }

    /* renamed from: a */
    private static String m6757a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }
}

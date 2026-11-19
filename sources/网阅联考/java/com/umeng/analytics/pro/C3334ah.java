package com.umeng.analytics.pro;

import android.util.Log;

/* renamed from: com.umeng.analytics.pro.ah */
/* loaded from: classes2.dex */
public class C3334ah {

    /* renamed from: a */
    private static final String f1631a = "OpenId";

    /* renamed from: b */
    private static boolean f1632b = false;

    /* renamed from: a */
    public static void m2836a(boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDebug:");
        sb.append(z3);
        f1632b = z3;
    }

    /* renamed from: b */
    public static void m2837b(String str, Object... objArr) {
        if (f1632b) {
            Log.i(f1631a, m2840e(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m2838c(String str, Object... objArr) {
        if (f1632b) {
            Log.w(f1631a, m2840e(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m2839d(String str, Object... objArr) {
        if (f1632b) {
            Log.e(f1631a, m2840e(str, objArr));
        }
    }

    /* renamed from: e */
    private static String m2840e(String str, Object... objArr) {
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
                sb.append(m2834a(objArr[i4], objArr[i5]));
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
    public static void m2835a(String str, Object... objArr) {
        if (f1632b) {
            m2840e(str, objArr);
        }
    }

    /* renamed from: a */
    private static String m2834a(Object obj, Object obj2) {
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

package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.C3422b;

/* renamed from: com.umeng.analytics.c */
/* loaded from: classes2.dex */
public class C3321c {

    /* renamed from: a */
    private static String[] f1602a = new String[2];

    /* renamed from: a */
    public static void m2813a(Context context, String str, String str2) {
        String[] strArr = f1602a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C3422b.m3382a(context).m3386a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m2815b(Context context) {
        String[] strArr = f1602a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C3422b.m3382a(context).m3388b();
        }
    }

    /* renamed from: a */
    public static String[] m2814a(Context context) {
        String[] strArrM3387a;
        if (!TextUtils.isEmpty(f1602a[0]) && !TextUtils.isEmpty(f1602a[1])) {
            return f1602a;
        }
        if (context == null || (strArrM3387a = C3422b.m3382a(context).m3387a()) == null) {
            return null;
        }
        String[] strArr = f1602a;
        strArr[0] = strArrM3387a[0];
        strArr[1] = strArrM3387a[1];
        return strArr;
    }
}

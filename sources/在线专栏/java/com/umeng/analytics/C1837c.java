package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.C1938b;

/* renamed from: com.umeng.analytics.c */
/* loaded from: classes.dex */
public class C1837c {

    /* renamed from: a */
    private static String[] f8194a = new String[2];

    /* renamed from: a */
    public static void m6736a(Context context, String str, String str2) {
        String[] strArr = f8194a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C1938b.m7305a(context).m7309a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m6738b(Context context) {
        String[] strArr = f8194a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C1938b.m7305a(context).m7311b();
        }
    }

    /* renamed from: a */
    public static String[] m6737a(Context context) {
        String[] strArrM7310a;
        if (!TextUtils.isEmpty(f8194a[0]) && !TextUtils.isEmpty(f8194a[1])) {
            return f8194a;
        }
        if (context == null || (strArrM7310a = C1938b.m7305a(context).m7310a()) == null) {
            return null;
        }
        String[] strArr = f8194a;
        strArr[0] = strArrM7310a[0];
        strArr[1] = strArrM7310a[1];
        return strArr;
    }
}

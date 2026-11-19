package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.umeng.commonsdk.internal.utils.j */
/* loaded from: classes2.dex */
public class C3463j {

    /* renamed from: a */
    private static final String f2680a = "um_pri";

    /* renamed from: b */
    private static final String f2681b = "um_common_strength";

    /* renamed from: c */
    private static final String f2682c = "um_common_battery";

    /* renamed from: a */
    public static String m3565a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f2680a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f2682c, null);
    }

    /* renamed from: a */
    public static void m3566a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f2680a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(f2682c, str).commit();
    }
}

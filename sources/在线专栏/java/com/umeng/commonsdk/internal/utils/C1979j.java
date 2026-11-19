package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.umeng.commonsdk.internal.utils.j */
/* loaded from: classes.dex */
public class C1979j {

    /* renamed from: a */
    private static final String f9272a = "um_pri";

    /* renamed from: b */
    private static final String f9273b = "um_common_strength";

    /* renamed from: c */
    private static final String f9274c = "um_common_battery";

    /* renamed from: a */
    public static String m7488a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9272a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f9274c, null);
    }

    /* renamed from: a */
    public static void m7489a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9272a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(f9274c, str).commit();
    }
}

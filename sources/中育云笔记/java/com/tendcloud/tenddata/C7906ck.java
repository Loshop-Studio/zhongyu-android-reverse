package com.tendcloud.tenddata;

import android.content.Context;

/* renamed from: com.tendcloud.tenddata.ck */
/* loaded from: classes5.dex */
public class C7906ck {
    /* renamed from: a */
    public static void m11566a(Context context, String str, String str2, long j10) {
        try {
            context.getSharedPreferences(str, 0).edit().putLong(str2, j10).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static long m11568b(Context context, String str, String str2, long j10) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    /* renamed from: a */
    public static void m11567a(Context context, String str, String str2, String str3) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, str3).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static String m11569b(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }
}

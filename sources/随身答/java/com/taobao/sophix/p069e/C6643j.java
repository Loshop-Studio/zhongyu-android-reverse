package com.taobao.sophix.p069e;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.taobao.sophix.e.j */
/* loaded from: classes4.dex */
public class C6643j {
    /* renamed from: a */
    public static int m4912a(Context context, String str, int i9) {
        return context == null ? i9 : context.getSharedPreferences("sp_sophix", 0).getInt(str, i9);
    }

    /* renamed from: b */
    public static void m4917b(Context context, String str, int i9) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putInt(str, i9);
        if (editorEdit.commit()) {
            return;
        }
        C6638e.m4891d("SharedPrefUtils", "putInt fail", "key", str);
    }

    /* renamed from: a */
    public static boolean m4916a(Context context, String str, boolean z9) {
        return context == null ? z9 : context.getSharedPreferences("sp_sophix", 0).getBoolean(str, z9);
    }

    /* renamed from: a */
    public static String m4913a(Context context, String str, String str2) {
        return context == null ? str2 : context.getSharedPreferences("sp_sophix", 0).getString(str, str2);
    }

    /* renamed from: b */
    public static void m4919b(Context context, String str, boolean z9) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putBoolean(str, z9);
        if (editorEdit.commit()) {
            return;
        }
        C6638e.m4891d("SharedPrefUtils", "putBoolean fail", "key", str);
    }

    /* renamed from: a */
    public static void m4915a(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.remove(str);
        if (editorEdit.commit()) {
            return;
        }
        C6638e.m4891d("SharedPrefUtils", "remove fail", "key", str);
    }

    /* renamed from: b */
    public static void m4918b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putString(str, str2);
        if (editorEdit.commit()) {
            return;
        }
        C6638e.m4891d("SharedPrefUtils", "putString fail", "key", str);
    }

    /* renamed from: a */
    public static void m4914a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.clear();
        if (editorEdit.commit()) {
            return;
        }
        C6638e.m4891d("SharedPrefUtils", "clear fail", new Object[0]);
    }
}

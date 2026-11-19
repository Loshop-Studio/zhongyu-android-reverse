package com.taobao.sophix.p099e;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.taobao.sophix.e.j */
/* loaded from: classes5.dex */
public class C7749j {
    /* renamed from: a */
    public static int m10424a(Context context, String str, int i10) {
        return context == null ? i10 : context.getSharedPreferences("sp_sophix", 0).getInt(str, i10);
    }

    /* renamed from: b */
    public static void m10429b(Context context, String str, int i10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putInt(str, i10);
        if (editorEdit.commit()) {
            return;
        }
        C7744e.m10403d("SharedPrefUtils", "putInt fail", "key", str);
    }

    /* renamed from: a */
    public static boolean m10428a(Context context, String str, boolean z10) {
        return context == null ? z10 : context.getSharedPreferences("sp_sophix", 0).getBoolean(str, z10);
    }

    /* renamed from: a */
    public static String m10425a(Context context, String str, String str2) {
        return context == null ? str2 : context.getSharedPreferences("sp_sophix", 0).getString(str, str2);
    }

    /* renamed from: b */
    public static void m10431b(Context context, String str, boolean z10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putBoolean(str, z10);
        if (editorEdit.commit()) {
            return;
        }
        C7744e.m10403d("SharedPrefUtils", "putBoolean fail", "key", str);
    }

    /* renamed from: a */
    public static void m10427a(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.remove(str);
        if (editorEdit.commit()) {
            return;
        }
        C7744e.m10403d("SharedPrefUtils", "remove fail", "key", str);
    }

    /* renamed from: b */
    public static void m10430b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putString(str, str2);
        if (editorEdit.commit()) {
            return;
        }
        C7744e.m10403d("SharedPrefUtils", "putString fail", "key", str);
    }

    /* renamed from: a */
    public static void m10426a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.clear();
        if (editorEdit.commit()) {
            return;
        }
        C7744e.m10403d("SharedPrefUtils", "clear fail", new Object[0]);
    }
}

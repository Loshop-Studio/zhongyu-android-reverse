package com.taobao.sophix.p052e;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.taobao.sophix.e.j */
/* loaded from: classes4.dex */
public class C6383j {
    /* renamed from: a */
    public static int m4733a(Context context, String str, int i10) {
        return context == null ? i10 : context.getSharedPreferences("sp_sophix", 0).getInt(str, i10);
    }

    /* renamed from: b */
    public static void m4738b(Context context, String str, int i10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putInt(str, i10);
        if (editorEdit.commit()) {
            return;
        }
        C6378e.m4712d("SharedPrefUtils", "putInt fail", "key", str);
    }

    /* renamed from: a */
    public static boolean m4737a(Context context, String str, boolean z9) {
        return context == null ? z9 : context.getSharedPreferences("sp_sophix", 0).getBoolean(str, z9);
    }

    /* renamed from: a */
    public static String m4734a(Context context, String str, String str2) {
        return context == null ? str2 : context.getSharedPreferences("sp_sophix", 0).getString(str, str2);
    }

    /* renamed from: b */
    public static void m4740b(Context context, String str, boolean z9) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putBoolean(str, z9);
        if (editorEdit.commit()) {
            return;
        }
        C6378e.m4712d("SharedPrefUtils", "putBoolean fail", "key", str);
    }

    /* renamed from: a */
    public static void m4736a(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.remove(str);
        if (editorEdit.commit()) {
            return;
        }
        C6378e.m4712d("SharedPrefUtils", "remove fail", "key", str);
    }

    /* renamed from: b */
    public static void m4739b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.putString(str, str2);
        if (editorEdit.commit()) {
            return;
        }
        C6378e.m4712d("SharedPrefUtils", "putString fail", "key", str);
    }

    /* renamed from: a */
    public static void m4735a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sp_sophix", 0).edit();
        editorEdit.clear();
        if (editorEdit.commit()) {
            return;
        }
        C6378e.m4712d("SharedPrefUtils", "clear fail", new Object[0]);
    }
}

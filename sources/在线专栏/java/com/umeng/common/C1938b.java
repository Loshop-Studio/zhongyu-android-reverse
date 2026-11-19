package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* renamed from: com.umeng.common.b */
/* loaded from: classes.dex */
public final class C1938b {

    /* renamed from: a */
    private static C1938b f8992a = null;

    /* renamed from: b */
    private static Context f8993b = null;

    /* renamed from: c */
    private static String f8994c = null;

    /* renamed from: d */
    private static final String f8995d = "mobclick_agent_user_";

    /* renamed from: com.umeng.common.b$a */
    private static final class a {

        /* renamed from: a */
        private static final C1938b f8996a = new C1938b();

        private a() {
        }
    }

    /* renamed from: a */
    public static synchronized C1938b m7305a(Context context) {
        if (f8993b == null && context != null) {
            f8993b = context.getApplicationContext();
        }
        if (f8993b != null) {
            f8994c = context.getPackageName();
        }
        return a.f8996a;
    }

    /* renamed from: e */
    private SharedPreferences m7306e() {
        Context context = f8993b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f8995d + f8994c, 0);
    }

    /* renamed from: b */
    public void m7311b() {
        SharedPreferences sharedPreferencesM7306e = m7306e();
        if (sharedPreferencesM7306e != null) {
            sharedPreferencesM7306e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* renamed from: c */
    public String m7312c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8993b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: d */
    public int m7313d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8993b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void m7309a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m7306e().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* renamed from: a */
    public String[] m7310a() {
        SharedPreferences sharedPreferencesM7306e = m7306e();
        if (sharedPreferencesM7306e == null) {
            return null;
        }
        String string = sharedPreferencesM7306e.getString("au_p", null);
        String string2 = sharedPreferencesM7306e.getString("au_u", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new String[]{string, string2};
    }

    /* renamed from: a */
    public void m7308a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8993b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void m7307a(int i4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8993b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i4).commit();
        }
    }
}

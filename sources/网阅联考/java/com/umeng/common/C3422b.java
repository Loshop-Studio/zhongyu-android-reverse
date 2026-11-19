package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* renamed from: com.umeng.common.b */
/* loaded from: classes2.dex */
public final class C3422b {

    /* renamed from: a */
    private static C3422b f2400a = null;

    /* renamed from: b */
    private static Context f2401b = null;

    /* renamed from: c */
    private static String f2402c = null;

    /* renamed from: d */
    private static final String f2403d = "mobclick_agent_user_";

    /* renamed from: com.umeng.common.b$a */
    public static final class a {

        /* renamed from: a */
        private static final C3422b f2404a = new C3422b();

        private a() {
        }
    }

    /* renamed from: a */
    public static synchronized C3422b m3382a(Context context) {
        if (f2401b == null && context != null) {
            f2401b = context.getApplicationContext();
        }
        if (f2401b != null) {
            f2402c = context.getPackageName();
        }
        return a.f2404a;
    }

    /* renamed from: e */
    private SharedPreferences m3383e() {
        Context context = f2401b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f2403d + f2402c, 0);
    }

    /* renamed from: b */
    public void m3388b() {
        SharedPreferences sharedPreferencesM3383e = m3383e();
        if (sharedPreferencesM3383e != null) {
            sharedPreferencesM3383e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* renamed from: c */
    public String m3389c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2401b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: d */
    public int m3390d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2401b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void m3386a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m3383e().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* renamed from: a */
    public String[] m3387a() {
        SharedPreferences sharedPreferencesM3383e = m3383e();
        if (sharedPreferencesM3383e != null) {
            String string = sharedPreferencesM3383e.getString("au_p", null);
            String string2 = sharedPreferencesM3383e.getString("au_u", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return new String[]{string, string2};
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3385a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2401b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void m3384a(int i4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2401b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i4).commit();
        }
    }
}

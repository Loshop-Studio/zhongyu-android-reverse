package p144j2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import p290x2.AbstractC9866a;

/* renamed from: j2.b */
/* loaded from: classes4.dex */
public final class C8211b {

    /* renamed from: a */
    public static Context f14231a;

    /* renamed from: b */
    public static String f14232b;

    /* renamed from: j2.b$a */
    public static final class a {

        /* renamed from: a */
        public static final C8211b f14233a = new C8211b();
    }

    /* renamed from: a */
    public static synchronized C8211b m13226a(Context context) {
        try {
            if (f14231a == null && context != null) {
                f14231a = context.getApplicationContext();
            }
            if (f14231a != null) {
                f14232b = context.getPackageName();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a.f14233a;
    }

    /* renamed from: b */
    public void m13227b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m13232g().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* renamed from: c */
    public String[] m13228c() {
        SharedPreferences sharedPreferencesM13232g = m13232g();
        if (sharedPreferencesM13232g != null) {
            String string = sharedPreferencesM13232g.getString("au_p", null);
            String string2 = sharedPreferencesM13232g.getString("au_u", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return new String[]{string, string2};
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m13229d() {
        SharedPreferences sharedPreferencesM13232g = m13232g();
        if (sharedPreferencesM13232g != null) {
            sharedPreferencesM13232g.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* renamed from: e */
    public String m13230e() {
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f14231a);
        if (sharedPreferencesM16841a != null) {
            return sharedPreferencesM16841a.getString("st", null);
        }
        return null;
    }

    /* renamed from: f */
    public int m13231f() {
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f14231a);
        if (sharedPreferencesM16841a != null) {
            return sharedPreferencesM16841a.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: g */
    public final SharedPreferences m13232g() {
        Context context = f14231a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("mobclick_agent_user_" + f14232b, 0);
    }
}

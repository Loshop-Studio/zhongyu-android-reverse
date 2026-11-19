package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.d0 */
/* loaded from: classes3.dex */
public final class C4641d0 {

    /* renamed from: b */
    public static final Map f2062b = new HashMap();

    /* renamed from: a */
    public SharedPreferences f2063a;

    public C4641d0(String str, int i6) {
        this.f2063a = AbstractC4657l0.m2250a().getSharedPreferences(str, i6);
    }

    /* renamed from: a */
    public static C4641d0 m2157a() {
        return m2159c("", 0);
    }

    /* renamed from: b */
    public static C4641d0 m2158b(String str) {
        return m2159c(str, 0);
    }

    /* renamed from: c */
    public static C4641d0 m2159c(String str, int i6) {
        C4641d0 c4641d0;
        if (m2160f(str)) {
            str = "spUtils";
        }
        Map map = f2062b;
        C4641d0 c4641d02 = (C4641d0) map.get(str);
        if (c4641d02 != null) {
            return c4641d02;
        }
        synchronized (C4641d0.class) {
            try {
                c4641d0 = (C4641d0) map.get(str);
                if (c4641d0 == null) {
                    c4641d0 = new C4641d0(str, i6);
                    map.put(str, c4641d0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4641d0;
    }

    /* renamed from: f */
    public static boolean m2160f(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!Character.isWhitespace(str.charAt(i6))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public String m2161d(String str) {
        return m2162e(str, "");
    }

    /* renamed from: e */
    public String m2162e(String str, String str2) {
        return this.f2063a.getString(str, str2);
    }

    /* renamed from: g */
    public void m2163g(String str, String str2) {
        m2164h(str, str2, false);
    }

    /* renamed from: h */
    public void m2164h(String str, String str2, boolean z6) {
        if (z6) {
            this.f2063a.edit().putString(str, str2).commit();
        } else {
            this.f2063a.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: i */
    public void m2165i(String str) {
        m2166j(str, false);
    }

    /* renamed from: j */
    public void m2166j(String str, boolean z6) {
        if (z6) {
            this.f2063a.edit().remove(str).commit();
        } else {
            this.f2063a.edit().remove(str).apply();
        }
    }
}

package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.z */
/* loaded from: classes3.dex */
public final class C5389z {

    /* renamed from: b */
    public static final Map f2789b = new HashMap();

    /* renamed from: a */
    public SharedPreferences f2790a;

    public C5389z(String str, int i10) {
        this.f2790a = AbstractC5366h0.m2478a().getSharedPreferences(str, i10);
    }

    /* renamed from: f */
    public static C5389z m2685f(String str) {
        return m2686g(str, 0);
    }

    /* renamed from: g */
    public static C5389z m2686g(String str, int i10) {
        C5389z c5389z;
        if (m2687n(str)) {
            str = "spUtils";
        }
        Map map = f2789b;
        C5389z c5389z2 = (C5389z) map.get(str);
        if (c5389z2 != null) {
            return c5389z2;
        }
        synchronized (C5389z.class) {
            try {
                c5389z = (C5389z) map.get(str);
                if (c5389z == null) {
                    c5389z = new C5389z(str, i10);
                    map.put(str, c5389z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5389z;
    }

    /* renamed from: n */
    public static boolean m2687n(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m2688a(String str) {
        return this.f2790a.contains(str);
    }

    /* renamed from: b */
    public boolean m2689b(String str) {
        return m2690c(str, false);
    }

    /* renamed from: c */
    public boolean m2690c(String str, boolean z10) {
        return this.f2790a.getBoolean(str, z10);
    }

    /* renamed from: d */
    public float m2691d(String str) {
        return m2692e(str, -1.0f);
    }

    /* renamed from: e */
    public float m2692e(String str, float f10) {
        return this.f2790a.getFloat(str, f10);
    }

    /* renamed from: h */
    public int m2693h(String str) {
        return m2694i(str, -1);
    }

    /* renamed from: i */
    public int m2694i(String str, int i10) {
        return this.f2790a.getInt(str, i10);
    }

    /* renamed from: j */
    public long m2695j(String str) {
        return m2696k(str, -1L);
    }

    /* renamed from: k */
    public long m2696k(String str, long j10) {
        return this.f2790a.getLong(str, j10);
    }

    /* renamed from: l */
    public String m2697l(String str) {
        return m2698m(str, "");
    }

    /* renamed from: m */
    public String m2698m(String str, String str2) {
        return this.f2790a.getString(str, str2);
    }

    /* renamed from: o */
    public void m2699o(String str, float f10) {
        m2700p(str, f10, false);
    }

    /* renamed from: p */
    public void m2700p(String str, float f10, boolean z10) {
        if (z10) {
            this.f2790a.edit().putFloat(str, f10).commit();
        } else {
            this.f2790a.edit().putFloat(str, f10).apply();
        }
    }

    /* renamed from: q */
    public void m2701q(String str, int i10) {
        m2702r(str, i10, false);
    }

    /* renamed from: r */
    public void m2702r(String str, int i10, boolean z10) {
        if (z10) {
            this.f2790a.edit().putInt(str, i10).commit();
        } else {
            this.f2790a.edit().putInt(str, i10).apply();
        }
    }

    /* renamed from: s */
    public void m2703s(String str, long j10) {
        m2704t(str, j10, false);
    }

    /* renamed from: t */
    public void m2704t(String str, long j10, boolean z10) {
        if (z10) {
            this.f2790a.edit().putLong(str, j10).commit();
        } else {
            this.f2790a.edit().putLong(str, j10).apply();
        }
    }

    /* renamed from: u */
    public void m2705u(String str, boolean z10) {
        m2706v(str, z10, false);
    }

    /* renamed from: v */
    public void m2706v(String str, boolean z10, boolean z11) {
        if (z11) {
            this.f2790a.edit().putBoolean(str, z10).commit();
        } else {
            this.f2790a.edit().putBoolean(str, z10).apply();
        }
    }

    /* renamed from: w */
    public void m2707w(String str) {
        m2708x(str, false);
    }

    /* renamed from: x */
    public void m2708x(String str, boolean z10) {
        if (z10) {
            this.f2790a.edit().remove(str).commit();
        } else {
            this.f2790a.edit().remove(str).apply();
        }
    }
}

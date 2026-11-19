package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.blankj.utilcode.util.l */
/* loaded from: classes2.dex */
public final class C3392l {

    /* renamed from: b */
    public static final HashMap f2168b = new HashMap();

    /* renamed from: a */
    public SharedPreferences f2169a;

    /* renamed from: a */
    public static C3392l m2345a(String str) {
        C3392l c3392l;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                str = "spUtils";
                break;
            }
            if (!Character.isWhitespace(str.charAt(i))) {
                break;
            }
            i++;
        }
        HashMap map = f2168b;
        C3392l c3392l2 = (C3392l) map.get(str);
        if (c3392l2 != null) {
            return c3392l2;
        }
        synchronized (C3392l.class) {
            try {
                c3392l = (C3392l) map.get(str);
                if (c3392l == null) {
                    c3392l = new C3392l();
                    c3392l.f2169a = AbstractC3382c.m2303d().getSharedPreferences(str, 0);
                    map.put(str, c3392l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3392l;
    }

    /* renamed from: b */
    public final int m2346b(String str) {
        return this.f2169a.getInt(str, -1);
    }

    /* renamed from: c */
    public final void m2347c(String str, int i) {
        this.f2169a.edit().putInt(str, i).apply();
    }
}

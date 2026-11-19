package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.b */
/* loaded from: classes.dex */
public class C1951b implements InterfaceC1955f {

    /* renamed from: a */
    private static Map<String, Boolean> f9021a = new HashMap();

    /* renamed from: b */
    private static Object f9022b = new Object();

    /* renamed from: com.umeng.commonsdk.config.b$a */
    private static class a {

        /* renamed from: a */
        private static final C1951b f9023a = new C1951b();

        private a() {
        }
    }

    /* renamed from: b */
    public static C1951b m7341b() {
        return a.f9023a;
    }

    /* renamed from: a */
    public void m7342a() {
        synchronized (f9022b) {
            f9021a.clear();
        }
    }

    private C1951b() {
    }

    /* renamed from: a */
    public static boolean m7340a(String str) {
        if (!C1953d.m7346a(str)) {
            return false;
        }
        synchronized (f9022b) {
            if (!f9021a.containsKey(str)) {
                return true;
            }
            return f9021a.get(str).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.InterfaceC1955f
    /* renamed from: a */
    public void mo7343a(String str, Boolean bool) {
        if (C1953d.m7346a(str)) {
            synchronized (f9022b) {
                Map<String, Boolean> map = f9021a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}

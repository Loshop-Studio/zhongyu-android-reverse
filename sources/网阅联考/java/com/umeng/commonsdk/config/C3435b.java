package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.b */
/* loaded from: classes2.dex */
public class C3435b implements InterfaceC3439f {

    /* renamed from: a */
    private static Map<String, Boolean> f2429a = new HashMap();

    /* renamed from: b */
    private static Object f2430b = new Object();

    /* renamed from: com.umeng.commonsdk.config.b$a */
    public static class a {

        /* renamed from: a */
        private static final C3435b f2431a = new C3435b();

        private a() {
        }
    }

    /* renamed from: b */
    public static C3435b m3418b() {
        return a.f2431a;
    }

    /* renamed from: a */
    public void m3419a() {
        synchronized (f2430b) {
            f2429a.clear();
        }
    }

    private C3435b() {
    }

    /* renamed from: a */
    public static boolean m3417a(String str) {
        if (!C3437d.m3423a(str)) {
            return false;
        }
        synchronized (f2430b) {
            if (!f2429a.containsKey(str)) {
                return true;
            }
            return f2429a.get(str).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.InterfaceC3439f
    /* renamed from: a */
    public void mo3420a(String str, Boolean bool) {
        if (C3437d.m3423a(str)) {
            synchronized (f2430b) {
                Map<String, Boolean> map = f2429a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}

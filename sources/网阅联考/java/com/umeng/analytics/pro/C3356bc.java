package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.bc */
/* loaded from: classes2.dex */
public class C3356bc implements Serializable {

    /* renamed from: d */
    private static Map<Class<? extends InterfaceC3343aq>, Map<? extends InterfaceC3350ax, C3356bc>> f1845d = new HashMap();

    /* renamed from: a */
    public final String f1846a;

    /* renamed from: b */
    public final byte f1847b;

    /* renamed from: c */
    public final C3357bd f1848c;

    public C3356bc(String str, byte b4, C3357bd c3357bd) {
        this.f1846a = str;
        this.f1847b = b4;
        this.f1848c = c3357bd;
    }

    /* renamed from: a */
    public static void m3030a(Class<? extends InterfaceC3343aq> cls, Map<? extends InterfaceC3350ax, C3356bc> map) {
        f1845d.put(cls, map);
    }

    /* renamed from: a */
    public static Map<? extends InterfaceC3350ax, C3356bc> m3029a(Class<? extends InterfaceC3343aq> cls) throws IllegalAccessException, InstantiationException {
        if (!f1845d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e4.getMessage());
            } catch (InstantiationException e5) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e5.getMessage());
            }
        }
        return f1845d.get(cls);
    }
}

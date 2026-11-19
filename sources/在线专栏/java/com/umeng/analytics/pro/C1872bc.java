package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.bc */
/* loaded from: classes.dex */
public class C1872bc implements Serializable {

    /* renamed from: d */
    private static Map<Class<? extends InterfaceC1859aq>, Map<? extends InterfaceC1866ax, C1872bc>> f8437d = new HashMap();

    /* renamed from: a */
    public final String f8438a;

    /* renamed from: b */
    public final byte f8439b;

    /* renamed from: c */
    public final C1873bd f8440c;

    public C1872bc(String str, byte b4, C1873bd c1873bd) {
        this.f8438a = str;
        this.f8439b = b4;
        this.f8440c = c1873bd;
    }

    /* renamed from: a */
    public static void m6953a(Class<? extends InterfaceC1859aq> cls, Map<? extends InterfaceC1866ax, C1872bc> map) {
        f8437d.put(cls, map);
    }

    /* renamed from: a */
    public static Map<? extends InterfaceC1866ax, C1872bc> m6952a(Class<? extends InterfaceC1859aq> cls) throws IllegalAccessException, InstantiationException {
        if (!f8437d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e4.getMessage());
            } catch (InstantiationException e5) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e5.getMessage());
            }
        }
        return f8437d.get(cls);
    }
}

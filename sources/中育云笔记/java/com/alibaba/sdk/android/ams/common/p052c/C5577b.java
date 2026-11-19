package com.alibaba.sdk.android.ams.common.p052c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.ams.common.c.b */
/* loaded from: classes3.dex */
class C5577b {

    /* renamed from: a */
    static Map<Class<?>, InterfaceC5576a<?>> f3998a;

    static {
        HashMap map = new HashMap();
        for (InterfaceC5576a interfaceC5576a : C5579d.m3416a(InterfaceC5576a.class, C5578c.class.getClassLoader())) {
            InterfaceC5576a interfaceC5576a2 = (InterfaceC5576a) map.get(interfaceC5576a.mo3413a());
            if (map.containsKey(interfaceC5576a.mo3413a())) {
                throw new IllegalStateException("Ambiguous providers: " + interfaceC5576a.getClass().getCanonicalName() + " versus " + interfaceC5576a2.getClass().getCanonicalName());
            }
            map.put(interfaceC5576a.mo3413a(), interfaceC5576a);
        }
        f3998a = map;
    }
}

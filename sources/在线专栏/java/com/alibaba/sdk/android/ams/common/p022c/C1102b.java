package com.alibaba.sdk.android.ams.common.p022c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.ams.common.c.b */
/* loaded from: classes.dex */
class C1102b {

    /* renamed from: a */
    static Map<Class<?>, InterfaceC1101a<?>> f6513a;

    static {
        HashMap map = new HashMap();
        for (InterfaceC1101a interfaceC1101a : C1104d.m5015a(InterfaceC1101a.class, C1103c.class.getClassLoader())) {
            InterfaceC1101a interfaceC1101a2 = (InterfaceC1101a) map.get(interfaceC1101a.mo5012a());
            if (map.containsKey(interfaceC1101a.mo5012a())) {
                throw new IllegalStateException("Ambiguous providers: " + interfaceC1101a.getClass().getCanonicalName() + " versus " + interfaceC1101a2.getClass().getCanonicalName());
            }
            map.put(interfaceC1101a.mo5012a(), interfaceC1101a);
        }
        f6513a = map;
    }
}

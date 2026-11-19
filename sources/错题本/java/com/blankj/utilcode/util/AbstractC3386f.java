package com.blankj.utilcode.util;

import com.google.gson.C3841g;
import com.google.gson.C3842h;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3386f {

    /* renamed from: a */
    public static final ConcurrentHashMap f2156a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C3841g m2337a() {
        ConcurrentHashMap concurrentHashMap = f2156a;
        C3841g c3841g = (C3841g) concurrentHashMap.get("delegateGson");
        if (c3841g != null) {
            return c3841g;
        }
        C3841g c3841g2 = (C3841g) concurrentHashMap.get("defaultGson");
        if (c3841g2 != null) {
            return c3841g2;
        }
        C3842h c3842h = new C3842h();
        c3842h.f3003g = true;
        c3842h.f3007k = false;
        C3841g c3841gM2790a = c3842h.m2790a();
        concurrentHashMap.put("defaultGson", c3841gM2790a);
        return c3841gM2790a;
    }
}

package com.efs.sdk.base.p035a.p037b;

import com.efs.sdk.base.p035a.p046h.C1329d;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.b */
/* loaded from: classes.dex */
public final class C1278b {

    /* renamed from: a */
    private ConcurrentHashMap<Byte, InterfaceC1281e> f7000a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final InterfaceC1281e m5437a(byte b4) {
        if (!this.f7000a.containsKey(Byte.valueOf(b4))) {
            if (b4 == 1) {
                this.f7000a.putIfAbsent(Byte.valueOf(b4), new HandlerC1283g());
            } else if (b4 != 2) {
                C1329d.m5572a("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b4)), null);
            } else {
                this.f7000a.putIfAbsent(Byte.valueOf(b4), new C1280d());
            }
        }
        return this.f7000a.get(Byte.valueOf(b4));
    }
}

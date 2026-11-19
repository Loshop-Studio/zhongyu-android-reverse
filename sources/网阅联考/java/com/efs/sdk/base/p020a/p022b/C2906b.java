package com.efs.sdk.base.p020a.p022b;

import android.support.annotation.Nullable;
import com.efs.sdk.base.p020a.p031h.C2957d;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.b */
/* loaded from: classes2.dex */
public final class C2906b {

    /* renamed from: a */
    private ConcurrentHashMap<Byte, InterfaceC2909e> f1030a = new ConcurrentHashMap<>();

    @Nullable
    /* renamed from: a */
    public final InterfaceC2909e m2078a(byte b4) {
        if (!this.f1030a.containsKey(Byte.valueOf(b4))) {
            if (b4 == 1) {
                this.f1030a.putIfAbsent(Byte.valueOf(b4), new HandlerC2911g());
            } else if (b4 != 2) {
                C2957d.m2213a("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b4)), null);
            } else {
                this.f1030a.putIfAbsent(Byte.valueOf(b4), new C2908d());
            }
        }
        return this.f1030a.get(Byte.valueOf(b4));
    }
}

package com.efs.sdk.base.p039a.p041b;

import androidx.annotation.Nullable;
import com.efs.sdk.base.p039a.p050h.C5697d;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.b */
/* loaded from: classes3.dex */
public final class C5646b {

    /* renamed from: a */
    private ConcurrentHashMap<Byte, InterfaceC5649e> f4634a = new ConcurrentHashMap<>();

    @Nullable
    /* renamed from: a */
    public final InterfaceC5649e m4047a(byte b10) {
        if (!this.f4634a.containsKey(Byte.valueOf(b10))) {
            if (b10 == 1) {
                this.f4634a.putIfAbsent(Byte.valueOf(b10), new HandlerC5651g());
            } else if (b10 != 2) {
                C5697d.m4182a("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b10)), null);
            } else {
                this.f4634a.putIfAbsent(Byte.valueOf(b10), new C5648d());
            }
        }
        return this.f4634a.get(Byte.valueOf(b10));
    }
}

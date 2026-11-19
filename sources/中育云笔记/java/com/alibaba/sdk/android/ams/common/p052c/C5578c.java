package com.alibaba.sdk.android.ams.common.p052c;

/* renamed from: com.alibaba.sdk.android.ams.common.c.c */
/* loaded from: classes3.dex */
public final class C5578c {
    /* renamed from: a */
    public static <T> T m3415a(Class<T> cls) {
        InterfaceC5576a<?> interfaceC5576a = C5577b.f3998a.get(cls);
        if (interfaceC5576a != null) {
            return cls.cast(interfaceC5576a.mo3414b());
        }
        throw new IllegalArgumentException("No factory was registered for " + cls.getCanonicalName());
    }
}

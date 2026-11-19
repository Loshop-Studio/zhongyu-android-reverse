package com.alibaba.sdk.android.ams.common.p022c;

/* renamed from: com.alibaba.sdk.android.ams.common.c.c */
/* loaded from: classes.dex */
public final class C1103c {
    /* renamed from: a */
    public static <T> T m5014a(Class<T> cls) {
        InterfaceC1101a<?> interfaceC1101a = C1102b.f6513a.get(cls);
        if (interfaceC1101a != null) {
            return cls.cast(interfaceC1101a.mo5013b());
        }
        throw new IllegalArgumentException("No factory was registered for " + cls.getCanonicalName());
    }
}

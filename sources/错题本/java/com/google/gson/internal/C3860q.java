package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.q */
/* loaded from: classes2.dex */
public final class C3860q extends AbstractC3862s {

    /* renamed from: b */
    public final /* synthetic */ Method f3054b;

    public C3860q(Method method) {
        this.f3054b = method;
    }

    @Override // com.google.gson.internal.AbstractC3862s
    /* renamed from: a */
    public final Object mo2815a(Class cls) {
        String strM2795a = C3845b.m2795a(cls);
        if (strM2795a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM2795a));
        }
        return this.f3054b.invoke(null, cls, Object.class);
    }
}

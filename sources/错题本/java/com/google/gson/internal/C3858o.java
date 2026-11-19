package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.o */
/* loaded from: classes2.dex */
public final class C3858o extends AbstractC3862s {

    /* renamed from: b */
    public final /* synthetic */ Method f3050b;

    /* renamed from: c */
    public final /* synthetic */ Object f3051c;

    public C3858o(Method method, Object obj) {
        this.f3050b = method;
        this.f3051c = obj;
    }

    @Override // com.google.gson.internal.AbstractC3862s
    /* renamed from: a */
    public final Object mo2815a(Class cls) {
        String strM2795a = C3845b.m2795a(cls);
        if (strM2795a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM2795a));
        }
        return this.f3050b.invoke(this.f3051c, cls);
    }
}

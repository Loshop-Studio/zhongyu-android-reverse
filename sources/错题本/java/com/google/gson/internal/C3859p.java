package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.p */
/* loaded from: classes2.dex */
public final class C3859p extends AbstractC3862s {

    /* renamed from: b */
    public final /* synthetic */ Method f3052b;

    /* renamed from: c */
    public final /* synthetic */ int f3053c;

    public C3859p(Method method, int i) {
        this.f3052b = method;
        this.f3053c = i;
    }

    @Override // com.google.gson.internal.AbstractC3862s
    /* renamed from: a */
    public final Object mo2815a(Class cls) {
        String strM2795a = C3845b.m2795a(cls);
        if (strM2795a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM2795a));
        }
        return this.f3052b.invoke(null, cls, Integer.valueOf(this.f3053c));
    }
}

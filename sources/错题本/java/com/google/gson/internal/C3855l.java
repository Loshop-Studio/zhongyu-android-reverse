package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.l */
/* loaded from: classes2.dex */
public final class C3855l extends AbstractC3857n {

    /* renamed from: b */
    public final /* synthetic */ Method f3048b;

    public C3855l(Method method) {
        this.f3048b = method;
    }

    @Override // com.google.gson.internal.AbstractC3857n
    /* renamed from: a */
    public final boolean mo2814a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f3048b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}

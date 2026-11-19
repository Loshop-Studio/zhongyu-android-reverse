package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* renamed from: com.google.gson.internal.n */
/* loaded from: classes2.dex */
public abstract class AbstractC3857n {

    /* renamed from: a */
    public static final AbstractC3857n f3049a;

    static {
        AbstractC3857n c3855l;
        if (AbstractC3849f.f3031a >= 9) {
            try {
                c3855l = new C3855l(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        } else {
            c3855l = null;
        }
        if (c3855l == null) {
            c3855l = new C3856m();
        }
        f3049a = c3855l;
    }

    /* renamed from: a */
    public abstract boolean mo2814a(Object obj, AccessibleObject accessibleObject);
}

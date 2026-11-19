package com.google.gson.internal;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p078i1.AbstractC5673c;
import p095k1.C5752a;
import p185v7.AbstractC6675d;

/* renamed from: com.google.gson.internal.d */
/* loaded from: classes2.dex */
public final class C3847d implements InterfaceC3870q, Cloneable {

    /* renamed from: c */
    public static final C3847d f3027c = new C3847d();

    /* renamed from: a */
    public final List f3028a;

    /* renamed from: b */
    public final List f3029b;

    public C3847d() {
        List list = Collections.EMPTY_LIST;
        this.f3028a = list;
        this.f3029b = list;
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        Class cls = c5752a.f9103a;
        boolean zM2799e = m2799e(cls, true);
        boolean zM2799e2 = m2799e(cls, false);
        if (zM2799e || zM2799e2) {
            return new C3846c(this, zM2799e2, zM2799e, c3841g, c5752a);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (C3847d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final boolean m2799e(Class cls, boolean z8) {
        if (!z8 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z8 ? this.f3028a : this.f3029b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}

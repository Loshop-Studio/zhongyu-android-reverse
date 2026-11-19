package com.google.gson;

import p063g1.AbstractC5542a0;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: com.google.gson.f */
/* loaded from: classes2.dex */
public class C3840f extends AbstractC5542a0 {

    /* renamed from: a */
    public AbstractC3869p f2980a = null;

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        AbstractC3869p abstractC3869p = this.f2980a;
        if (abstractC3869p != null) {
            return abstractC3869p.mo2779b(c6046a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) {
        AbstractC3869p abstractC3869p = this.f2980a;
        if (abstractC3869p == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC3869p.mo2780c(c6047b, obj);
    }

    @Override // p063g1.AbstractC5542a0
    /* renamed from: d */
    public final AbstractC3869p mo2781d() {
        AbstractC3869p abstractC3869p = this.f2980a;
        if (abstractC3869p != null) {
            return abstractC3869p;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}

package com.bumptech.glide;

import p027b1.C5141a;
import p027b1.InterfaceC5143c;
import p109d1.AbstractC8910k;

/* renamed from: com.bumptech.glide.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5817i implements Cloneable {

    /* renamed from: c */
    public InterfaceC5143c f4665c = C5141a.m2658b();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5817i clone() {
        try {
            return (AbstractC5817i) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d */
    public final InterfaceC5143c m4025d() {
        return this.f4665c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC5817i) {
            return AbstractC8910k.m17473d(this.f4665c, ((AbstractC5817i) obj).f4665c);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC5143c interfaceC5143c = this.f4665c;
        if (interfaceC5143c != null) {
            return interfaceC5143c.hashCode();
        }
        return 0;
    }
}

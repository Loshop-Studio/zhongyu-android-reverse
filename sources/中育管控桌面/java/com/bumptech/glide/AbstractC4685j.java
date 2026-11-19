package com.bumptech.glide;

import p016b1.AbstractC4409k;
import p195z0.C7929a;
import p195z0.InterfaceC7931c;

/* renamed from: com.bumptech.glide.j */
/* loaded from: classes3.dex */
public abstract class AbstractC4685j implements Cloneable {

    /* renamed from: a */
    public InterfaceC7931c f2253a = C7929a.m9732b();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC4685j clone() {
        try {
            return (AbstractC4685j) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* renamed from: d */
    public final InterfaceC7931c m2553d() {
        return this.f2253a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4685j) {
            return AbstractC4409k.m1443d(this.f2253a, ((AbstractC4685j) obj).f2253a);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC7931c interfaceC7931c = this.f2253a;
        if (interfaceC7931c != null) {
            return interfaceC7931c.hashCode();
        }
        return 0;
    }
}

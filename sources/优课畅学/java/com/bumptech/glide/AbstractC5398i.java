package com.bumptech.glide;

import p093f0.C8403a;
import p093f0.InterfaceC8405c;
import p116h0.AbstractC8707k;

/* renamed from: com.bumptech.glide.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5398i implements Cloneable {

    /* renamed from: a */
    public InterfaceC8405c f2895a = C8403a.m13697b();

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC5398i clone() {
        try {
            return (AbstractC5398i) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: e */
    public final InterfaceC8405c m2819e() {
        return this.f2895a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC5398i) {
            return AbstractC8707k.m14186d(this.f2895a, ((AbstractC5398i) obj).f2895a);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC8405c interfaceC8405c = this.f2895a;
        if (interfaceC8405c != null) {
            return interfaceC8405c.hashCode();
        }
        return 0;
    }
}

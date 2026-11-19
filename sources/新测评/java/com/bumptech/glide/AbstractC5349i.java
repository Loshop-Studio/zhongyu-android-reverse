package com.bumptech.glide;

import p095g1.C7508a;
import p095g1.InterfaceC7510c;
import p117i1.AbstractC7652k;

/* renamed from: com.bumptech.glide.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5349i implements Cloneable {

    /* renamed from: a */
    public InterfaceC7510c f3462a = C7508a.m12215b();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5349i clone() {
        try {
            return (AbstractC5349i) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public final InterfaceC7510c m3372c() {
        return this.f3462a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC5349i) {
            return AbstractC7652k.m12688d(this.f3462a, ((AbstractC5349i) obj).f3462a);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC7510c interfaceC7510c = this.f3462a;
        if (interfaceC7510c != null) {
            return interfaceC7510c.hashCode();
        }
        return 0;
    }
}

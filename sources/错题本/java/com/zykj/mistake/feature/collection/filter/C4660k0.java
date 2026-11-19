package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.filter.k0 */
/* loaded from: classes3.dex */
public final class C4660k0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final int f6651a;

    public C4660k0(int i) {
        this.f6651a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4660k0) && this.f6651a == ((C4660k0) obj).f6651a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6651a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6651a, "SelectOtherCollectionType(type=", ")");
    }
}

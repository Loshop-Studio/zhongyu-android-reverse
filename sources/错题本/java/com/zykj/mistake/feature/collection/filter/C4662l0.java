package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.filter.l0 */
/* loaded from: classes3.dex */
public final class C4662l0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final int f6662a;

    public C4662l0(int i) {
        this.f6662a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4662l0) && this.f6662a == ((C4662l0) obj).f6662a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6662a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6662a, "SelectTimeType(type=", ")");
    }
}

package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.filter.g0 */
/* loaded from: classes3.dex */
public final class C4652g0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final int f6640a;

    public C4652g0(int i) {
        this.f6640a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4652g0) && this.f6640a == ((C4652g0) obj).f6640a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6640a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6640a, "SelectCurrentCollectionType(type=", ")");
    }
}

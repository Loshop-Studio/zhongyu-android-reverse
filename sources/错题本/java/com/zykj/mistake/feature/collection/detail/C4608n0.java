package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.detail.n0 */
/* loaded from: classes3.dex */
public final class C4608n0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final int f6512a;

    public C4608n0(int i) {
        this.f6512a = i;
    }

    /* renamed from: a */
    public final int m4046a() {
        return this.f6512a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4608n0) && this.f6512a == ((C4608n0) obj).f6512a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6512a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6512a, "SelectCurrentCollectionType(type=", ")");
    }
}

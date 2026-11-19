package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.detail.r0 */
/* loaded from: classes3.dex */
public final class C4616r0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final int f6520a;

    public C4616r0(int i) {
        this.f6520a = i;
    }

    /* renamed from: a */
    public final int m4050a() {
        return this.f6520a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4616r0) && this.f6520a == ((C4616r0) obj).f6520a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6520a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6520a, "SelectOtherCollectionType(type=", ")");
    }
}

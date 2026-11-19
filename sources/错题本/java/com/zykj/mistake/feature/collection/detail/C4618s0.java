package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.detail.s0 */
/* loaded from: classes3.dex */
public final class C4618s0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final int f6522a;

    public C4618s0(int i) {
        this.f6522a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4618s0) && this.f6522a == ((C4618s0) obj).f6522a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6522a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6522a, "SelectTimeType(type=", ")");
    }
}

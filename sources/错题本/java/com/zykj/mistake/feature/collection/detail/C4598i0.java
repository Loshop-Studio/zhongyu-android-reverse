package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.detail.i0 */
/* loaded from: classes3.dex */
public final class C4598i0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final int f6494a;

    public C4598i0(int i) {
        this.f6494a = i;
    }

    /* renamed from: a */
    public final int m4043a() {
        return this.f6494a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4598i0) && this.f6494a == ((C4598i0) obj).f6494a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6494a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6494a, "RefreshAfterAdd(addedCount=", ")");
    }
}

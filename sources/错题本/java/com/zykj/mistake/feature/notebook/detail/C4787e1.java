package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.notebook.detail.e1 */
/* loaded from: classes3.dex */
public final class C4787e1 extends AbstractC4823k1 {

    /* renamed from: a */
    public final int f6977a;

    public C4787e1(int i) {
        this.f6977a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4787e1) && this.f6977a == ((C4787e1) obj).f6977a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6977a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6977a, "RemoveSuccess(itemId=", ")");
    }
}

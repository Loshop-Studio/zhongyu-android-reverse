package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.filter.n0 */
/* loaded from: classes3.dex */
public final class C4666n0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final int f6666a;

    public C4666n0(int i) {
        this.f6666a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4666n0) && this.f6666a == ((C4666n0) obj).f6666a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6666a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6666a, "ToggleSelectMistake(itemId=", ")");
    }
}

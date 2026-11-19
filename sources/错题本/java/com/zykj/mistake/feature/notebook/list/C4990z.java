package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.notebook.list.z */
/* loaded from: classes3.dex */
public final class C4990z extends AbstractC4938d1 {

    /* renamed from: a */
    public final int f7626a;

    public C4990z(int i) {
        this.f7626a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4990z) && this.f7626a == ((C4990z) obj).f7626a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7626a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f7626a, "AccountReady(version=", ")");
    }
}

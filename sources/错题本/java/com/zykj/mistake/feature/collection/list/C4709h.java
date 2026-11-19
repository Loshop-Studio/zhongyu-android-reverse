package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.list.h */
/* loaded from: classes3.dex */
public final class C4709h extends AbstractC4722u {

    /* renamed from: a */
    public final int f6761a;

    public C4709h(int i) {
        this.f6761a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4709h) && this.f6761a == ((C4709h) obj).f6761a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6761a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6761a, "AccountReady(version=", ")");
    }
}

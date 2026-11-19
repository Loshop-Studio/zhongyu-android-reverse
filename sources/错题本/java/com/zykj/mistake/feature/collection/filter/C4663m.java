package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.feature.collection.filter.m */
/* loaded from: classes3.dex */
public final class C4663m extends AbstractC4671q {

    /* renamed from: a */
    public final int f6663a;

    public C4663m(int i) {
        this.f6663a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4663m) && this.f6663a == ((C4663m) obj).f6663a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6663a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f6663a, "AddToCollectionSuccess(addedCount=", ")");
    }
}

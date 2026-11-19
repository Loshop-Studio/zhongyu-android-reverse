package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.p */
/* loaded from: classes3.dex */
public final class C4669p extends AbstractC4671q {

    /* renamed from: a */
    public final String f6670a;

    public C4669p(String message) {
        AbstractC5830k.m5330g(message, "message");
        this.f6670a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4669p) && AbstractC5830k.m5325b(this.f6670a, ((C4669p) obj).f6670a);
    }

    public final int hashCode() {
        return this.f6670a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f6670a, ")");
    }
}

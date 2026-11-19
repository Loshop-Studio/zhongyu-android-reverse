package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.u */
/* loaded from: classes3.dex */
public final class C4621u extends AbstractC4630y0 {

    /* renamed from: a */
    public final String f6525a;

    public C4621u(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f6525a = id;
    }

    /* renamed from: a */
    public final String m4051a() {
        return this.f6525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4621u) && AbstractC5830k.m5325b(this.f6525a, ((C4621u) obj).f6525a);
    }

    public final int hashCode() {
        return this.f6525a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ClickMistake(id=", this.f6525a, ")");
    }
}

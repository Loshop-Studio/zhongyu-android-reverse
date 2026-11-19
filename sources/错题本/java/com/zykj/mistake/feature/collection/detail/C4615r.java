package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.r */
/* loaded from: classes3.dex */
public final class C4615r extends AbstractC4630y0 {

    /* renamed from: a */
    public final String f6519a;

    public C4615r(String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f6519a = name;
    }

    /* renamed from: a */
    public final String m4049a() {
        return this.f6519a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4615r) && AbstractC5830k.m5325b(this.f6519a, ((C4615r) obj).f6519a);
    }

    public final int hashCode() {
        return this.f6519a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ChangeEditName(name=", this.f6519a, ")");
    }
}

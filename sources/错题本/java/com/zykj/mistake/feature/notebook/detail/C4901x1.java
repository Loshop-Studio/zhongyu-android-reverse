package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.x1 */
/* loaded from: classes3.dex */
public final class C4901x1 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7401a;

    public C4901x1(String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f7401a = name;
    }

    /* renamed from: a */
    public final String m4270a() {
        return this.f7401a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4901x1) && AbstractC5830k.m5325b(this.f7401a, ((C4901x1) obj).f7401a);
    }

    public final int hashCode() {
        return this.f7401a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("CreateCustomTag(name=", this.f7401a, ")");
    }
}

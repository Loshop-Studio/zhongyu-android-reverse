package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.c1 */
/* loaded from: classes3.dex */
public final class C4935c1 extends AbstractC4938d1 {

    /* renamed from: a */
    public final String f7491a;

    public C4935c1(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f7491a = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4935c1) && AbstractC5830k.m5325b(this.f7491a, ((C4935c1) obj).f7491a);
    }

    public final int hashCode() {
        return this.f7491a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ToggleSelectMistake(id=", this.f7491a, ")");
    }
}

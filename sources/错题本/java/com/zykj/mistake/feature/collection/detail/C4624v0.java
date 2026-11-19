package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.v0 */
/* loaded from: classes3.dex */
public final class C4624v0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final String f6528a;

    public C4624v0(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f6528a = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4624v0) && AbstractC5830k.m5325b(this.f6528a, ((C4624v0) obj).f6528a);
    }

    public final int hashCode() {
        return this.f6528a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ToggleSelectMistake(id=", this.f6528a, ")");
    }
}

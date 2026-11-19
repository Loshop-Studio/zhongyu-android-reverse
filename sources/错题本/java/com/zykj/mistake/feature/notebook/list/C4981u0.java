package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.u0 */
/* loaded from: classes3.dex */
public final class C4981u0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final String f7617a;

    public C4981u0(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f7617a = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4981u0) && AbstractC5830k.m5325b(this.f7617a, ((C4981u0) obj).f7617a);
    }

    public final int hashCode() {
        return this.f7617a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ManageMistake(id=", this.f7617a, ")");
    }
}

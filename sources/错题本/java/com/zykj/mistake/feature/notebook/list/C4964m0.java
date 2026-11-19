package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.m0 */
/* loaded from: classes3.dex */
public final class C4964m0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final String f7586a;

    public C4964m0(String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f7586a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4964m0) && AbstractC5830k.m5325b(this.f7586a, ((C4964m0) obj).f7586a);
    }

    public final int hashCode() {
        return this.f7586a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("CreateCustomTag(name=", this.f7586a, ")");
    }
}

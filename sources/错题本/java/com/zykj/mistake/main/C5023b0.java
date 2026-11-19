package com.zykj.mistake.main;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.b0 */
/* loaded from: classes3.dex */
public final class C5023b0 extends AbstractC5057l {

    /* renamed from: a */
    public final String f7833a;

    public C5023b0(String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f7833a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5023b0) && AbstractC5830k.m5325b(this.f7833a, ((C5023b0) obj).f7833a);
    }

    public final int hashCode() {
        return this.f7833a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ChangeCustomTagName(name=", this.f7833a, ")");
    }
}

package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.i0 */
/* loaded from: classes3.dex */
public final class C5052i0 extends AbstractC5057l {

    /* renamed from: a */
    public final TagEditorTarget f7923a;

    /* renamed from: b */
    public final C5087z0 f7924b;

    public C5052i0(TagEditorTarget target, C5087z0 selection) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(selection, "selection");
        this.f7923a = target;
        this.f7924b = selection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5052i0)) {
            return false;
        }
        C5052i0 c5052i0 = (C5052i0) obj;
        return this.f7923a == c5052i0.f7923a && AbstractC5830k.m5325b(this.f7924b, c5052i0.f7924b);
    }

    public final int hashCode() {
        return this.f7924b.hashCode() + (this.f7923a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmTagEditor(target=" + this.f7923a + ", selection=" + this.f7924b + ")";
    }
}

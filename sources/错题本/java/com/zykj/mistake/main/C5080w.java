package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.w */
/* loaded from: classes3.dex */
public final class C5080w extends AbstractC5020a0 {

    /* renamed from: a */
    public final TagEditorTarget f7968a;

    /* renamed from: b */
    public final C5087z0 f7969b;

    public C5080w(TagEditorTarget target, C5087z0 selection) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(selection, "selection");
        this.f7968a = target;
        this.f7969b = selection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5080w)) {
            return false;
        }
        C5080w c5080w = (C5080w) obj;
        return this.f7968a == c5080w.f7968a && AbstractC5830k.m5325b(this.f7969b, c5080w.f7969b);
    }

    public final int hashCode() {
        return this.f7969b.hashCode() + (this.f7968a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmTagEditor(target=" + this.f7968a + ", selection=" + this.f7969b + ")";
    }
}

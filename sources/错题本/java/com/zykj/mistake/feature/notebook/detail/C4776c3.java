package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c3 */
/* loaded from: classes3.dex */
public final class C4776c3 extends AbstractC4813i3 {

    /* renamed from: a */
    public final MistakeDetailNewContract$DetailTab f6941a;

    public C4776c3(MistakeDetailNewContract$DetailTab tab) {
        AbstractC5830k.m5330g(tab, "tab");
        this.f6941a = tab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4776c3) && this.f6941a == ((C4776c3) obj).f6941a;
    }

    public final int hashCode() {
        return this.f6941a.hashCode();
    }

    public final String toString() {
        return "SelectTab(tab=" + this.f6941a + ")";
    }
}

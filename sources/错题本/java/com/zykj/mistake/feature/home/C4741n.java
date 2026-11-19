package com.zykj.mistake.feature.home;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.home.n */
/* loaded from: classes3.dex */
public final class C4741n extends AbstractC4738k {

    /* renamed from: a */
    public final HomeTab f6845a;

    public C4741n(HomeTab tab) {
        AbstractC5830k.m5330g(tab, "tab");
        this.f6845a = tab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4741n) && this.f6845a == ((C4741n) obj).f6845a;
    }

    public final int hashCode() {
        return this.f6845a.hashCode();
    }

    public final String toString() {
        return "SelectTab(tab=" + this.f6845a + ")";
    }
}

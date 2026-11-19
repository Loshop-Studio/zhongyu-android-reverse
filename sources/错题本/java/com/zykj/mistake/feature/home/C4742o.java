package com.zykj.mistake.feature.home;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.home.o */
/* loaded from: classes3.dex */
public final class C4742o {

    /* renamed from: a */
    public final HomeTab f6846a;

    /* renamed from: b */
    public final boolean f6847b;

    public C4742o(HomeTab selectedTab, boolean z8) {
        AbstractC5830k.m5330g(selectedTab, "selectedTab");
        this.f6846a = selectedTab;
        this.f6847b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4742o)) {
            return false;
        }
        C4742o c4742o = (C4742o) obj;
        return this.f6846a == c4742o.f6846a && this.f6847b == c4742o.f6847b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6847b) + (this.f6846a.hashCode() * 31);
    }

    public final String toString() {
        return "State(selectedTab=" + this.f6846a + ", initialTabResolved=" + this.f6847b + ")";
    }
}

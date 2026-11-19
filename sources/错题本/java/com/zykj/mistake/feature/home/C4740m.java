package com.zykj.mistake.feature.home;

/* renamed from: com.zykj.mistake.feature.home.m */
/* loaded from: classes3.dex */
public final class C4740m extends AbstractC4738k {

    /* renamed from: a */
    public final boolean f6844a;

    public C4740m(boolean z8) {
        this.f6844a = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4740m) && this.f6844a == ((C4740m) obj).f6844a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6844a);
    }

    public final String toString() {
        return "ResolveInitialTab(shouldDefaultReviewTab=" + this.f6844a + ")";
    }
}

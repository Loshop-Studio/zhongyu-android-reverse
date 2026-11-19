package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.r0 */
/* loaded from: classes3.dex */
public final class C4864r0 extends AbstractC4823k1 {

    /* renamed from: a */
    public final boolean f7278a;

    /* renamed from: b */
    public final Integer f7279b;

    /* renamed from: c */
    public final boolean f7280c;

    public C4864r0(boolean z8, Integer num, boolean z9) {
        this.f7278a = z8;
        this.f7279b = num;
        this.f7280c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4864r0)) {
            return false;
        }
        C4864r0 c4864r0 = (C4864r0) obj;
        return this.f7278a == c4864r0.f7278a && AbstractC5830k.m5325b(this.f7279b, c4864r0.f7279b) && this.f7280c == c4864r0.f7280c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7278a) * 31;
        Integer num = this.f7279b;
        return Boolean.hashCode(this.f7280c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Back(refreshNotebook=" + this.f7278a + ", removedItemId=" + this.f7279b + ", removedItemIsMastered=" + this.f7280c + ")";
    }
}

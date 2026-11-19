package com.zykj.mistake.feature.review;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.d */
/* loaded from: classes3.dex */
public final class C4996d extends AbstractC5000h {

    /* renamed from: a */
    public final int f7642a;

    /* renamed from: b */
    public final String f7643b;

    public C4996d(int i, String str) {
        this.f7642a = i;
        this.f7643b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4996d)) {
            return false;
        }
        C4996d c4996d = (C4996d) obj;
        return this.f7642a == c4996d.f7642a && AbstractC5830k.m5325b(this.f7643b, c4996d.f7643b);
    }

    public final int hashCode() {
        return this.f7643b.hashCode() + (Integer.hashCode(this.f7642a) * 31);
    }

    public final String toString() {
        return "AccountReady(version=" + this.f7642a + ", studentName=" + this.f7643b + ")";
    }
}

package com.zykj.mistake.feature.review;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.f */
/* loaded from: classes3.dex */
public final class C4998f extends AbstractC5000h {

    /* renamed from: a */
    public final ReviewContract$PracticePoolType f7645a;

    public C4998f(ReviewContract$PracticePoolType poolType) {
        AbstractC5830k.m5330g(poolType, "poolType");
        this.f7645a = poolType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4998f) && this.f7645a == ((C4998f) obj).f7645a;
    }

    public final int hashCode() {
        return this.f7645a.hashCode();
    }

    public final String toString() {
        return "StartPoolPractice(poolType=" + this.f7645a + ")";
    }
}

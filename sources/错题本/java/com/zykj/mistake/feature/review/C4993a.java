package com.zykj.mistake.feature.review;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.a */
/* loaded from: classes3.dex */
public final class C4993a extends AbstractC4995c {

    /* renamed from: a */
    public final ReviewContract$PracticeScene f7639a;

    /* renamed from: b */
    public final ReviewContract$PracticePoolType f7640b;

    public C4993a(ReviewContract$PracticeScene scene, ReviewContract$PracticePoolType reviewContract$PracticePoolType) {
        AbstractC5830k.m5330g(scene, "scene");
        this.f7639a = scene;
        this.f7640b = reviewContract$PracticePoolType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4993a)) {
            return false;
        }
        C4993a c4993a = (C4993a) obj;
        return this.f7639a == c4993a.f7639a && this.f7640b == c4993a.f7640b;
    }

    public final int hashCode() {
        int iHashCode = this.f7639a.hashCode() * 31;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType = this.f7640b;
        return iHashCode + (reviewContract$PracticePoolType == null ? 0 : reviewContract$PracticePoolType.hashCode());
    }

    public final String toString() {
        return "OpenRecommendPractice(scene=" + this.f7639a + ", poolType=" + this.f7640b + ")";
    }
}

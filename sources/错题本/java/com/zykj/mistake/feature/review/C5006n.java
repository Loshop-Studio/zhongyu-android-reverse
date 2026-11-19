package com.zykj.mistake.feature.review;

import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.n */
/* loaded from: classes3.dex */
public final class C5006n {

    /* renamed from: a */
    public final String f7695a;

    /* renamed from: b */
    public final int f7696b;

    /* renamed from: c */
    public final ReviewContract$PracticeScene f7697c;

    /* renamed from: d */
    public final int f7698d;

    /* renamed from: e */
    public final C5007o f7699e;

    /* renamed from: f */
    public final int f7700f;

    /* renamed from: g */
    public final int f7701g;

    /* renamed from: h */
    public final boolean f7702h;

    /* renamed from: i */
    public final boolean f7703i;

    public C5006n(String sessionId, int i, ReviewContract$PracticeScene scene, int i8, C5007o c5007o, int i9, int i10, boolean z8, boolean z9) {
        AbstractC5830k.m5330g(sessionId, "sessionId");
        AbstractC5830k.m5330g(scene, "scene");
        this.f7695a = sessionId;
        this.f7696b = i;
        this.f7697c = scene;
        this.f7698d = i8;
        this.f7699e = c5007o;
        this.f7700f = i9;
        this.f7701g = i10;
        this.f7702h = z8;
        this.f7703i = z9;
    }

    /* renamed from: a */
    public static C5006n m4323a(C5006n c5006n, int i, C5007o c5007o, int i8, int i9, boolean z8, boolean z9, int i10) {
        String sessionId = c5006n.f7695a;
        int i11 = c5006n.f7696b;
        ReviewContract$PracticeScene scene = c5006n.f7697c;
        if ((i10 & 8) != 0) {
            i = c5006n.f7698d;
        }
        int i12 = i;
        if ((i10 & 16) != 0) {
            c5007o = c5006n.f7699e;
        }
        C5007o c5007o2 = c5007o;
        if ((i10 & 32) != 0) {
            i8 = c5006n.f7700f;
        }
        c5006n.getClass();
        AbstractC5830k.m5330g(sessionId, "sessionId");
        AbstractC5830k.m5330g(scene, "scene");
        return new C5006n(sessionId, i11, scene, i12, c5007o2, i8, i9, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5006n)) {
            return false;
        }
        C5006n c5006n = (C5006n) obj;
        return AbstractC5830k.m5325b(this.f7695a, c5006n.f7695a) && this.f7696b == c5006n.f7696b && this.f7697c == c5006n.f7697c && this.f7698d == c5006n.f7698d && AbstractC5830k.m5325b(this.f7699e, c5006n.f7699e) && this.f7700f == c5006n.f7700f && this.f7701g == c5006n.f7701g && this.f7702h == c5006n.f7702h && this.f7703i == c5006n.f7703i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7703i) + AbstractC0584a.m908i(this.f7702h, AbstractC0584a.m902c(this.f7701g, AbstractC0584a.m902c(this.f7700f, (this.f7699e.hashCode() + AbstractC0584a.m902c(this.f7698d, (this.f7697c.hashCode() + AbstractC0584a.m902c(this.f7696b, this.f7695a.hashCode() * 31, 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Session(sessionId=" + this.f7695a + ", mode=" + this.f7696b + ", scene=" + this.f7697c + ", nextRoundIndex=" + this.f7698d + ", summary=" + this.f7699e + ", roundStartSubmittedCount=" + this.f7700f + ", currentRoundPracticeCount=" + this.f7701g + ", isCurrentRoundCompleted=" + this.f7702h + ", isAllCompleted=" + this.f7703i + ")";
    }
}

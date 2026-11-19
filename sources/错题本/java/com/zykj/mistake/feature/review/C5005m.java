package com.zykj.mistake.feature.review;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.m */
/* loaded from: classes3.dex */
public final class C5005m {

    /* renamed from: a */
    public final String f7691a;

    /* renamed from: b */
    public final String f7692b;

    /* renamed from: c */
    public final List f7693c;

    /* renamed from: d */
    public final ReviewContract$PracticeScene f7694d;

    public C5005m(String sessionId, String roundId, List list, ReviewContract$PracticeScene scene) {
        AbstractC5830k.m5330g(sessionId, "sessionId");
        AbstractC5830k.m5330g(roundId, "roundId");
        AbstractC5830k.m5330g(scene, "scene");
        this.f7691a = sessionId;
        this.f7692b = roundId;
        this.f7693c = list;
        this.f7694d = scene;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5005m)) {
            return false;
        }
        C5005m c5005m = (C5005m) obj;
        return AbstractC5830k.m5325b(this.f7691a, c5005m.f7691a) && AbstractC5830k.m5325b(this.f7692b, c5005m.f7692b) && this.f7693c.equals(c5005m.f7693c) && this.f7694d == c5005m.f7694d;
    }

    public final int hashCode() {
        return this.f7694d.hashCode() + AbstractC0584a.m908i(true, AbstractC0584a.m907h(this.f7693c, AbstractC0584a.m903d(this.f7691a.hashCode() * 31, 31, this.f7692b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("Round(sessionId=", this.f7691a, ", roundId=", this.f7692b, ", items=");
        sbM101z.append(this.f7693c);
        sbM101z.append(", hasMore=true, scene=");
        sbM101z.append(this.f7694d);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}

package com.zykj.mistake.main;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.q0 */
/* loaded from: classes3.dex */
public final class C5069q0 extends AbstractC5057l {

    /* renamed from: a */
    public final List f7956a;

    /* renamed from: b */
    public final List f7957b;

    public C5069q0(List subjects, List customTags) {
        AbstractC5830k.m5330g(subjects, "subjects");
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f7956a = subjects;
        this.f7957b = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5069q0)) {
            return false;
        }
        C5069q0 c5069q0 = (C5069q0) obj;
        return AbstractC5830k.m5325b(this.f7956a, c5069q0.f7956a) && AbstractC5830k.m5325b(this.f7957b, c5069q0.f7957b);
    }

    public final int hashCode() {
        return this.f7957b.hashCode() + (this.f7956a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenNotebookFilter(subjects=" + this.f7956a + ", customTags=" + this.f7957b + ")";
    }
}

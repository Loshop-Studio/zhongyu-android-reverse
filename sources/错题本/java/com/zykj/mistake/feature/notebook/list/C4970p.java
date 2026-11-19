package com.zykj.mistake.feature.notebook.list;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.p */
/* loaded from: classes3.dex */
public final class C4970p extends AbstractC4988y {

    /* renamed from: a */
    public final List f7591a;

    /* renamed from: b */
    public final List f7592b;

    public C4970p(List subjects, List customTags) {
        AbstractC5830k.m5330g(subjects, "subjects");
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f7591a = subjects;
        this.f7592b = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4970p)) {
            return false;
        }
        C4970p c4970p = (C4970p) obj;
        return AbstractC5830k.m5325b(this.f7591a, c4970p.f7591a) && AbstractC5830k.m5325b(this.f7592b, c4970p.f7592b);
    }

    public final int hashCode() {
        return this.f7592b.hashCode() + (this.f7591a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFilterDrawer(subjects=" + this.f7591a + ", customTags=" + this.f7592b + ")";
    }
}

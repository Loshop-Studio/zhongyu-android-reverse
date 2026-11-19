package com.zykj.mistake.feature.notebook.detail;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.b1 */
/* loaded from: classes3.dex */
public final class C4767b1 extends AbstractC4823k1 {

    /* renamed from: a */
    public final List f6921a;

    public C4767b1(List customTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f6921a = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4767b1) && AbstractC5830k.m5325b(this.f6921a, ((C4767b1) obj).f6921a);
    }

    public final int hashCode() {
        return this.f6921a.hashCode();
    }

    public final String toString() {
        return "OpenTagEditor(customTags=" + this.f6921a + ")";
    }
}

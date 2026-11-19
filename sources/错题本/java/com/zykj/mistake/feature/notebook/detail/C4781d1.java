package com.zykj.mistake.feature.notebook.detail;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.d1 */
/* loaded from: classes3.dex */
public final class C4781d1 extends AbstractC4823k1 {

    /* renamed from: a */
    public final List f6960a;

    public C4781d1(List customTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f6960a = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4781d1) && AbstractC5830k.m5325b(this.f6960a, ((C4781d1) obj).f6960a);
    }

    public final int hashCode() {
        return this.f6960a.hashCode();
    }

    public final String toString() {
        return "RefreshTagEditor(customTags=" + this.f6960a + ")";
    }
}

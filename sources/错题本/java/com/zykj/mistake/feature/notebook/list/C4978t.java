package com.zykj.mistake.feature.notebook.list;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.t */
/* loaded from: classes3.dex */
public final class C4978t extends AbstractC4988y {

    /* renamed from: a */
    public final List f7614a;

    public C4978t(List customTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f7614a = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4978t) && AbstractC5830k.m5325b(this.f7614a, ((C4978t) obj).f7614a);
    }

    public final int hashCode() {
        return this.f7614a.hashCode();
    }

    public final String toString() {
        return "RefreshTagDrawer(customTags=" + this.f7614a + ")";
    }
}

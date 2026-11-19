package com.zykj.mistake.feature.notebook.list;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.s */
/* loaded from: classes3.dex */
public final class C4976s extends AbstractC4988y {

    /* renamed from: a */
    public final List f7612a;

    public C4976s(List customTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f7612a = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4976s) && AbstractC5830k.m5325b(this.f7612a, ((C4976s) obj).f7612a);
    }

    public final int hashCode() {
        return this.f7612a.hashCode();
    }

    public final String toString() {
        return "OpenTagDrawer(customTags=" + this.f7612a + ")";
    }
}

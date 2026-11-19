package com.zykj.mistake.main;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.o0 */
/* loaded from: classes3.dex */
public final class C5065o0 extends AbstractC5057l {

    /* renamed from: a */
    public final List f7937a;

    /* renamed from: b */
    public final List f7938b;

    public C5065o0(List customTags, List displayTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(displayTags, "displayTags");
        this.f7937a = customTags;
        this.f7938b = displayTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5065o0)) {
            return false;
        }
        C5065o0 c5065o0 = (C5065o0) obj;
        return AbstractC5830k.m5325b(this.f7937a, c5065o0.f7937a) && AbstractC5830k.m5325b(this.f7938b, c5065o0.f7938b);
    }

    public final int hashCode() {
        return this.f7938b.hashCode() + (this.f7937a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenDetailTagEditor(customTags=" + this.f7937a + ", displayTags=" + this.f7938b + ")";
    }
}

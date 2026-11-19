package com.zykj.mistake.feature.ask;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.r */
/* loaded from: classes3.dex */
public final class C4542r extends AbstractC4545u {

    /* renamed from: a */
    public final MistakeAskMaterialContract$MaterialType f6294a;

    public C4542r(MistakeAskMaterialContract$MaterialType type) {
        AbstractC5830k.m5330g(type, "type");
        this.f6294a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4542r) && this.f6294a == ((C4542r) obj).f6294a;
    }

    public final int hashCode() {
        return this.f6294a.hashCode();
    }

    public final String toString() {
        return "SelectGroup(type=" + this.f6294a + ")";
    }
}

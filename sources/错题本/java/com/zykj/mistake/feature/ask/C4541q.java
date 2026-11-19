package com.zykj.mistake.feature.ask;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.q */
/* loaded from: classes3.dex */
public final class C4541q extends AbstractC4545u {

    /* renamed from: a */
    public final C4520f f6293a;

    public C4541q(C4520f bundle) {
        AbstractC5830k.m5330g(bundle, "bundle");
        this.f6293a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4541q) && AbstractC5830k.m5325b(this.f6293a, ((C4541q) obj).f6293a);
    }

    public final int hashCode() {
        return this.f6293a.f6235a.hashCode();
    }

    public final String toString() {
        return "Init(bundle=" + this.f6293a + ")";
    }
}

package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.d */
/* loaded from: classes3.dex */
public final class C5028d extends AbstractC5057l {

    /* renamed from: a */
    public final C5021a1 f7838a;

    public C5028d(C5021a1 state) {
        AbstractC5830k.m5330g(state, "state");
        this.f7838a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5028d) && AbstractC5830k.m5325b(this.f7838a, ((C5028d) obj).f7838a);
    }

    public final int hashCode() {
        return this.f7838a.hashCode();
    }

    public final String toString() {
        return "TagEditor(state=" + this.f7838a + ")";
    }
}

package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c2 */
/* loaded from: classes3.dex */
public final class C4775c2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final MistakeDetailNewContract$DraftNavigation f6940a;

    public C4775c2(MistakeDetailNewContract$DraftNavigation navigation) {
        AbstractC5830k.m5330g(navigation, "navigation");
        this.f6940a = navigation;
    }

    /* renamed from: a */
    public final MistakeDetailNewContract$DraftNavigation m4177a() {
        return this.f6940a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4775c2) && this.f6940a == ((C4775c2) obj).f6940a;
    }

    public final int hashCode() {
        return this.f6940a.hashCode();
    }

    public final String toString() {
        return "DraftLocalDiscarded(navigation=" + this.f6940a + ")";
    }
}

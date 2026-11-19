package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.d2 */
/* loaded from: classes3.dex */
public final class C4782d2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final MistakeDetailNewContract$DraftNavigation f6961a;

    public C4782d2(MistakeDetailNewContract$DraftNavigation navigation) {
        AbstractC5830k.m5330g(navigation, "navigation");
        this.f6961a = navigation;
    }

    /* renamed from: a */
    public final MistakeDetailNewContract$DraftNavigation m4180a() {
        return this.f6961a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4782d2) && this.f6961a == ((C4782d2) obj).f6961a;
    }

    public final int hashCode() {
        return this.f6961a.hashCode();
    }

    public final String toString() {
        return "DraftLocalSaveCompleted(navigation=" + this.f6961a + ")";
    }
}

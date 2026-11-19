package com.zykj.mistake.feature.notebook.detail;

/* renamed from: com.zykj.mistake.feature.notebook.detail.e2 */
/* loaded from: classes3.dex */
public final class C4788e2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final MistakeDetailNewContract$DraftNavigation f6978a;

    public C4788e2(MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation) {
        this.f6978a = mistakeDetailNewContract$DraftNavigation;
    }

    /* renamed from: a */
    public final MistakeDetailNewContract$DraftNavigation m4182a() {
        return this.f6978a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4788e2) && this.f6978a == ((C4788e2) obj).f6978a;
    }

    public final int hashCode() {
        MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation = this.f6978a;
        if (mistakeDetailNewContract$DraftNavigation == null) {
            return 0;
        }
        return mistakeDetailNewContract$DraftNavigation.hashCode();
    }

    public final String toString() {
        return "DraftLocalSaveFailed(navigation=" + this.f6978a + ")";
    }
}

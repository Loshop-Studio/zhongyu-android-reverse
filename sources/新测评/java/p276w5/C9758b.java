package p276w5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p276w5.AbstractC9755a;

/* renamed from: w5.b */
/* loaded from: classes4.dex */
public final class C9758b {

    /* renamed from: a */
    public final String f17188a;

    /* renamed from: b */
    public final AbstractC9755a f17189b;

    /* renamed from: c */
    public final boolean f17190c;

    public C9758b(String option, AbstractC9755a choiceAnswerState, boolean z9) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(choiceAnswerState, "choiceAnswerState");
        this.f17188a = option;
        this.f17189b = choiceAnswerState;
        this.f17190c = z9;
    }

    /* renamed from: b */
    public static /* synthetic */ C9758b m16353b(C9758b c9758b, String str, AbstractC9755a abstractC9755a, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c9758b.f17188a;
        }
        if ((i10 & 2) != 0) {
            abstractC9755a = c9758b.f17189b;
        }
        if ((i10 & 4) != 0) {
            z9 = c9758b.f17190c;
        }
        return c9758b.m16354a(str, abstractC9755a, z9);
    }

    /* renamed from: a */
    public final C9758b m16354a(String option, AbstractC9755a choiceAnswerState, boolean z9) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(choiceAnswerState, "choiceAnswerState");
        return new C9758b(option, choiceAnswerState, z9);
    }

    /* renamed from: c */
    public final AbstractC9755a m16355c() {
        return this.f17189b;
    }

    /* renamed from: d */
    public final String m16356d() {
        return this.f17188a;
    }

    /* renamed from: e */
    public final boolean m16357e() {
        return this.f17190c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9758b)) {
            return false;
        }
        C9758b c9758b = (C9758b) obj;
        return Intrinsics.areEqual(this.f17188a, c9758b.f17188a) && Intrinsics.areEqual(this.f17189b, c9758b.f17189b) && this.f17190c == c9758b.f17190c;
    }

    public int hashCode() {
        return (((this.f17188a.hashCode() * 31) + this.f17189b.hashCode()) * 31) + Boolean.hashCode(this.f17190c);
    }

    public String toString() {
        return "DetailChoiceOption(option=" + this.f17188a + ", choiceAnswerState=" + this.f17189b + ", showRightAnswer=" + this.f17190c + ")";
    }

    public /* synthetic */ C9758b(String str, AbstractC9755a abstractC9755a, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? AbstractC9755a.b.f17181c : abstractC9755a, (i10 & 4) != 0 ? false : z9);
    }
}

package p026b7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b7.t0 */
/* loaded from: classes4.dex */
public final class C5031t0 {

    /* renamed from: a */
    public Function3 f2552a;

    /* renamed from: b */
    public Function0 f2553b;

    public C5031t0(Function3 function3, Function0 function0) {
        this.f2552a = function3;
        this.f2553b = function0;
    }

    /* renamed from: a */
    public final Function0 m2510a() {
        return this.f2553b;
    }

    /* renamed from: b */
    public final Function3 m2511b() {
        return this.f2552a;
    }

    /* renamed from: c */
    public final void m2512c(Function0 function0) {
        this.f2553b = function0;
    }

    /* renamed from: d */
    public final void m2513d(Function3 function3) {
        this.f2552a = function3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5031t0)) {
            return false;
        }
        C5031t0 c5031t0 = (C5031t0) obj;
        return Intrinsics.areEqual(this.f2552a, c5031t0.f2552a) && Intrinsics.areEqual(this.f2553b, c5031t0.f2553b);
    }

    public int hashCode() {
        Function3 function3 = this.f2552a;
        int iHashCode = (function3 == null ? 0 : function3.hashCode()) * 31;
        Function0 function0 = this.f2553b;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        return "CorrectFunction(rebuildPageQuestionAnswerData=" + this.f2552a + ", rebuildAnswerCorrectData=" + this.f2553b + ")";
    }

    public /* synthetic */ C5031t0(Function3 function3, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function3, (i10 & 2) != 0 ? null : function0);
    }
}

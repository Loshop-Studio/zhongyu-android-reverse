package p026b7;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p099g5.AbstractC7531f;
import p099g5.InterfaceC7529d;

/* renamed from: b7.l */
/* loaded from: classes4.dex */
public final class C5014l {

    /* renamed from: a */
    public Function1 f2522a;

    /* renamed from: b */
    public Function1 f2523b;

    /* renamed from: c */
    public Function1 f2524c;

    /* renamed from: d */
    public Function2 f2525d;

    /* renamed from: e */
    public Function0 f2526e;

    /* renamed from: f */
    public Function0 f2527f;

    /* renamed from: g */
    public Function1 f2528g;

    public C5014l(Function1 setDelegate, Function1 setOnLightStatusListener, Function1 startSpot, Function2 startSpotAndShow, Function0 startCamera, Function0 stopCamera, Function1 setIndex) {
        Intrinsics.checkNotNullParameter(setDelegate, "setDelegate");
        Intrinsics.checkNotNullParameter(setOnLightStatusListener, "setOnLightStatusListener");
        Intrinsics.checkNotNullParameter(startSpot, "startSpot");
        Intrinsics.checkNotNullParameter(startSpotAndShow, "startSpotAndShow");
        Intrinsics.checkNotNullParameter(startCamera, "startCamera");
        Intrinsics.checkNotNullParameter(stopCamera, "stopCamera");
        Intrinsics.checkNotNullParameter(setIndex, "setIndex");
        this.f2522a = setDelegate;
        this.f2523b = setOnLightStatusListener;
        this.f2524c = startSpot;
        this.f2525d = startSpotAndShow;
        this.f2526e = startCamera;
        this.f2527f = stopCamera;
        this.f2528g = setIndex;
    }

    /* renamed from: h */
    public static final Unit m2483h(AbstractC7531f.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m2484i(InterfaceC7529d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m2485j(boolean z9) {
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m2486k(boolean z9, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m2487l() {
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m2488m() {
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m2489n(int i10) {
        return Unit.INSTANCE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5014l)) {
            return false;
        }
        C5014l c5014l = (C5014l) obj;
        return Intrinsics.areEqual(this.f2522a, c5014l.f2522a) && Intrinsics.areEqual(this.f2523b, c5014l.f2523b) && Intrinsics.areEqual(this.f2524c, c5014l.f2524c) && Intrinsics.areEqual(this.f2525d, c5014l.f2525d) && Intrinsics.areEqual(this.f2526e, c5014l.f2526e) && Intrinsics.areEqual(this.f2527f, c5014l.f2527f) && Intrinsics.areEqual(this.f2528g, c5014l.f2528g);
    }

    public int hashCode() {
        return (((((((((((this.f2522a.hashCode() * 31) + this.f2523b.hashCode()) * 31) + this.f2524c.hashCode()) * 31) + this.f2525d.hashCode()) * 31) + this.f2526e.hashCode()) * 31) + this.f2527f.hashCode()) * 31) + this.f2528g.hashCode();
    }

    /* renamed from: o */
    public final Function1 m2490o() {
        return this.f2528g;
    }

    /* renamed from: p */
    public final Function1 m2491p() {
        return this.f2524c;
    }

    /* renamed from: q */
    public final Function0 m2492q() {
        return this.f2527f;
    }

    /* renamed from: r */
    public final void m2493r(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f2522a = function1;
    }

    /* renamed from: s */
    public final void m2494s(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f2528g = function1;
    }

    /* renamed from: t */
    public final void m2495t(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f2523b = function1;
    }

    public String toString() {
        return "AnswerSheetFunctions(setDelegate=" + this.f2522a + ", setOnLightStatusListener=" + this.f2523b + ", startSpot=" + this.f2524c + ", startSpotAndShow=" + this.f2525d + ", startCamera=" + this.f2526e + ", stopCamera=" + this.f2527f + ", setIndex=" + this.f2528g + ")";
    }

    /* renamed from: u */
    public final void m2496u(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f2526e = function0;
    }

    /* renamed from: v */
    public final void m2497v(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f2524c = function1;
    }

    /* renamed from: w */
    public final void m2498w(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f2525d = function2;
    }

    /* renamed from: x */
    public final void m2499x(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f2527f = function0;
    }

    public /* synthetic */ C5014l(Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function0 function0, Function0 function02, Function1 function14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function1() { // from class: b7.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5014l.m2483h((AbstractC7531f.d) obj);
            }
        } : function1, (i10 & 2) != 0 ? new Function1() { // from class: b7.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5014l.m2484i((InterfaceC7529d) obj);
            }
        } : function12, (i10 & 4) != 0 ? new Function1() { // from class: b7.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5014l.m2485j(((Boolean) obj).booleanValue());
            }
        } : function13, (i10 & 8) != 0 ? new Function2() { // from class: b7.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C5014l.m2486k(((Boolean) obj).booleanValue(), (String) obj2);
            }
        } : function2, (i10 & 16) != 0 ? new Function0() { // from class: b7.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5014l.m2487l();
            }
        } : function0, (i10 & 32) != 0 ? new Function0() { // from class: b7.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5014l.m2488m();
            }
        } : function02, (i10 & 64) != 0 ? new Function1() { // from class: b7.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5014l.m2489n(((Integer) obj).intValue());
            }
        } : function14);
    }
}

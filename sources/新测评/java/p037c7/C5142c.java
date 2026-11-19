package p037c7;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c7.c */
/* loaded from: classes4.dex */
public final class C5142c {

    /* renamed from: a */
    public Function0 f2715a;

    /* renamed from: b */
    public Function1 f2716b;

    public C5142c(Function0 getCurrentProgress, Function1 callbackForBack) {
        Intrinsics.checkNotNullParameter(getCurrentProgress, "getCurrentProgress");
        Intrinsics.checkNotNullParameter(callbackForBack, "callbackForBack");
        this.f2715a = getCurrentProgress;
        this.f2716b = callbackForBack;
    }

    /* renamed from: c */
    public static final float m2791c() {
        return 0.0f;
    }

    /* renamed from: d */
    public static final Unit m2792d(float f10) {
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public final Function1 m2793e() {
        return this.f2716b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5142c)) {
            return false;
        }
        C5142c c5142c = (C5142c) obj;
        return Intrinsics.areEqual(this.f2715a, c5142c.f2715a) && Intrinsics.areEqual(this.f2716b, c5142c.f2716b);
    }

    /* renamed from: f */
    public final Function0 m2794f() {
        return this.f2715a;
    }

    /* renamed from: g */
    public final void m2795g(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f2715a = function0;
    }

    public int hashCode() {
        return (this.f2715a.hashCode() * 31) + this.f2716b.hashCode();
    }

    public String toString() {
        return "SketchPlayFunction(getCurrentProgress=" + this.f2715a + ", callbackForBack=" + this.f2716b + ")";
    }

    public /* synthetic */ C5142c(Function0 function0, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: c7.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(C5142c.m2791c());
            }
        } : function0, (i10 & 2) != 0 ? new Function1() { // from class: c7.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5142c.m2792d(((Float) obj).floatValue());
            }
        } : function1);
    }
}

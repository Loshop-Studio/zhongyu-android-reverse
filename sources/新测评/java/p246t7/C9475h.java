package p246t7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t7.h */
/* loaded from: classes5.dex */
public final class C9475h {

    /* renamed from: a */
    public final boolean f16559a;

    /* renamed from: b */
    public final boolean f16560b;

    /* renamed from: c */
    public final boolean f16561c;

    /* renamed from: d */
    public final boolean f16562d;

    /* renamed from: e */
    public final Function0 f16563e;

    /* renamed from: f */
    public final Function1 f16564f;

    /* renamed from: g */
    public final Function1 f16565g;

    public C9475h(boolean z9, boolean z10, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12) {
        this.f16559a = z9;
        this.f16560b = z10;
        this.f16561c = z11;
        this.f16562d = z12;
        this.f16563e = function0;
        this.f16564f = function1;
        this.f16565g = function12;
    }

    /* renamed from: a */
    public final boolean m15856a() {
        return this.f16560b;
    }

    /* renamed from: b */
    public final Function1 m15857b() {
        return this.f16565g;
    }

    /* renamed from: c */
    public final Function0 m15858c() {
        return this.f16563e;
    }

    /* renamed from: d */
    public final boolean m15859d() {
        return this.f16561c;
    }

    /* renamed from: e */
    public final boolean m15860e() {
        return this.f16559a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9475h)) {
            return false;
        }
        C9475h c9475h = (C9475h) obj;
        return this.f16559a == c9475h.f16559a && this.f16560b == c9475h.f16560b && this.f16561c == c9475h.f16561c && this.f16562d == c9475h.f16562d && Intrinsics.areEqual(this.f16563e, c9475h.f16563e) && Intrinsics.areEqual(this.f16564f, c9475h.f16564f) && Intrinsics.areEqual(this.f16565g, c9475h.f16565g);
    }

    /* renamed from: f */
    public final Function1 m15861f() {
        return this.f16564f;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f16559a) * 31) + Boolean.hashCode(this.f16560b)) * 31) + Boolean.hashCode(this.f16561c)) * 31) + Boolean.hashCode(this.f16562d)) * 31;
        Function0 function0 = this.f16563e;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1 function1 = this.f16564f;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f16565g;
        return iHashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    public String toString() {
        return "SketchPlayExtraConfig(showFullscreenButton=" + this.f16559a + ", autoHideSeekBar=" + this.f16560b + ", seekBarVisibleManually=" + this.f16561c + ", interceptWhenVideo=" + this.f16562d + ", onAutoHideAction=" + this.f16563e + ", sketchTapAction=" + this.f16564f + ", fullscreenClickListener=" + this.f16565g + ")";
    }

    public /* synthetic */ C9475h(boolean z9, boolean z10, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? true : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? null : function0, (i10 & 32) != 0 ? null : function1, (i10 & 64) != 0 ? null : function12);
    }
}

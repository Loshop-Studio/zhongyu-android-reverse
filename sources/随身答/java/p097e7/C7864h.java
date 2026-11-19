package p097e7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.h */
/* loaded from: classes5.dex */
public final class C7864h {

    /* renamed from: a */
    public final boolean f13226a;

    /* renamed from: b */
    public final boolean f13227b;

    /* renamed from: c */
    public final boolean f13228c;

    /* renamed from: d */
    public final boolean f13229d;

    /* renamed from: e */
    public final Function0 f13230e;

    /* renamed from: f */
    public final Function1 f13231f;

    /* renamed from: g */
    public final Function1 f13232g;

    public C7864h(boolean z9, boolean z10, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12) {
        this.f13226a = z9;
        this.f13227b = z10;
        this.f13228c = z11;
        this.f13229d = z12;
        this.f13230e = function0;
        this.f13231f = function1;
        this.f13232g = function12;
    }

    /* renamed from: b */
    public static /* synthetic */ C7864h m12355b(C7864h c7864h, boolean z9, boolean z10, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = c7864h.f13226a;
        }
        if ((i9 & 2) != 0) {
            z10 = c7864h.f13227b;
        }
        if ((i9 & 4) != 0) {
            z11 = c7864h.f13228c;
        }
        if ((i9 & 8) != 0) {
            z12 = c7864h.f13229d;
        }
        if ((i9 & 16) != 0) {
            function0 = c7864h.f13230e;
        }
        if ((i9 & 32) != 0) {
            function1 = c7864h.f13231f;
        }
        if ((i9 & 64) != 0) {
            function12 = c7864h.f13232g;
        }
        Function1 function13 = function1;
        Function1 function14 = function12;
        Function0 function02 = function0;
        boolean z13 = z11;
        return c7864h.m12356a(z9, z10, z13, z12, function02, function13, function14);
    }

    /* renamed from: a */
    public final C7864h m12356a(boolean z9, boolean z10, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12) {
        return new C7864h(z9, z10, z11, z12, function0, function1, function12);
    }

    /* renamed from: c */
    public final boolean m12357c() {
        return this.f13227b;
    }

    /* renamed from: d */
    public final Function1 m12358d() {
        return this.f13232g;
    }

    /* renamed from: e */
    public final Function0 m12359e() {
        return this.f13230e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7864h)) {
            return false;
        }
        C7864h c7864h = (C7864h) obj;
        return this.f13226a == c7864h.f13226a && this.f13227b == c7864h.f13227b && this.f13228c == c7864h.f13228c && this.f13229d == c7864h.f13229d && Intrinsics.areEqual(this.f13230e, c7864h.f13230e) && Intrinsics.areEqual(this.f13231f, c7864h.f13231f) && Intrinsics.areEqual(this.f13232g, c7864h.f13232g);
    }

    /* renamed from: f */
    public final boolean m12360f() {
        return this.f13228c;
    }

    /* renamed from: g */
    public final boolean m12361g() {
        return this.f13226a;
    }

    /* renamed from: h */
    public final Function1 m12362h() {
        return this.f13231f;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f13226a) * 31) + Boolean.hashCode(this.f13227b)) * 31) + Boolean.hashCode(this.f13228c)) * 31) + Boolean.hashCode(this.f13229d)) * 31;
        Function0 function0 = this.f13230e;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1 function1 = this.f13231f;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f13232g;
        return iHashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    public String toString() {
        return "SketchPlayExtraConfig(showFullscreenButton=" + this.f13226a + ", autoHideSeekBar=" + this.f13227b + ", seekBarVisibleManually=" + this.f13228c + ", interceptWhenVideo=" + this.f13229d + ", onAutoHideAction=" + this.f13230e + ", sketchTapAction=" + this.f13231f + ", fullscreenClickListener=" + this.f13232g + ")";
    }

    public /* synthetic */ C7864h(boolean z9, boolean z10, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? true : z11, (i9 & 8) != 0 ? false : z12, (i9 & 16) != 0 ? null : function0, (i9 & 32) != 0 ? null : function1, (i9 & 64) != 0 ? null : function12);
    }
}

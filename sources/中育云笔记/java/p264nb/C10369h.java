package p264nb;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* renamed from: nb.h */
/* loaded from: classes6.dex */
public final class C10369h {

    /* renamed from: a */
    public final boolean f24698a;

    /* renamed from: b */
    public final boolean f24699b;

    /* renamed from: c */
    public final boolean f24700c;

    /* renamed from: d */
    public final boolean f24701d;

    /* renamed from: e */
    public final InterfaceC9529a f24702e;

    /* renamed from: f */
    public final InterfaceC9540l f24703f;

    /* renamed from: g */
    public final InterfaceC9540l f24704g;

    public C10369h(boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.f24698a = z10;
        this.f24699b = z11;
        this.f24700c = z12;
        this.f24701d = z13;
        this.f24702e = interfaceC9529a;
        this.f24703f = interfaceC9540l;
        this.f24704g = interfaceC9540l2;
    }

    /* renamed from: a */
    public final boolean m21708a() {
        return this.f24699b;
    }

    /* renamed from: b */
    public final InterfaceC9540l m21709b() {
        return this.f24704g;
    }

    /* renamed from: c */
    public final InterfaceC9529a m21710c() {
        return this.f24702e;
    }

    /* renamed from: d */
    public final boolean m21711d() {
        return this.f24700c;
    }

    /* renamed from: e */
    public final boolean m21712e() {
        return this.f24698a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10369h)) {
            return false;
        }
        C10369h c10369h = (C10369h) obj;
        return this.f24698a == c10369h.f24698a && this.f24699b == c10369h.f24699b && this.f24700c == c10369h.f24700c && this.f24701d == c10369h.f24701d && AbstractC9979u.m20289b(this.f24702e, c10369h.f24702e) && AbstractC9979u.m20289b(this.f24703f, c10369h.f24703f) && AbstractC9979u.m20289b(this.f24704g, c10369h.f24704g);
    }

    /* renamed from: f */
    public final InterfaceC9540l m21713f() {
        return this.f24703f;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f24698a) * 31) + Boolean.hashCode(this.f24699b)) * 31) + Boolean.hashCode(this.f24700c)) * 31) + Boolean.hashCode(this.f24701d)) * 31;
        InterfaceC9529a interfaceC9529a = this.f24702e;
        int iHashCode2 = (iHashCode + (interfaceC9529a == null ? 0 : interfaceC9529a.hashCode())) * 31;
        InterfaceC9540l interfaceC9540l = this.f24703f;
        int iHashCode3 = (iHashCode2 + (interfaceC9540l == null ? 0 : interfaceC9540l.hashCode())) * 31;
        InterfaceC9540l interfaceC9540l2 = this.f24704g;
        return iHashCode3 + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0);
    }

    public String toString() {
        return "SketchPlayExtraConfig(showFullscreenButton=" + this.f24698a + ", autoHideSeekBar=" + this.f24699b + ", seekBarVisibleManually=" + this.f24700c + ", interceptWhenVideo=" + this.f24701d + ", onAutoHideAction=" + this.f24702e + ", sketchTapAction=" + this.f24703f + ", fullscreenClickListener=" + this.f24704g + ")";
    }

    public /* synthetic */ C10369h(boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? null : interfaceC9529a, (i10 & 32) != 0 ? null : interfaceC9540l, (i10 & 64) != 0 ? null : interfaceC9540l2);
    }
}

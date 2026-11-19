package p243s5;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: s5.h */
/* loaded from: classes5.dex */
public final class C10025h {

    /* renamed from: a */
    public final boolean f20060a;

    /* renamed from: b */
    public final boolean f20061b;

    /* renamed from: c */
    public final boolean f20062c;

    /* renamed from: d */
    public final boolean f20063d;

    /* renamed from: e */
    public final InterfaceC10559a f20064e;

    /* renamed from: f */
    public final InterfaceC10570l f20065f;

    /* renamed from: g */
    public final InterfaceC10570l f20066g;

    public C10025h(boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.f20060a = z10;
        this.f20061b = z11;
        this.f20062c = z12;
        this.f20063d = z13;
        this.f20064e = interfaceC10559a;
        this.f20065f = interfaceC10570l;
        this.f20066g = interfaceC10570l2;
    }

    /* renamed from: a */
    public final boolean m18734a() {
        return this.f20061b;
    }

    /* renamed from: b */
    public final InterfaceC10570l m18735b() {
        return this.f20066g;
    }

    /* renamed from: c */
    public final InterfaceC10559a m18736c() {
        return this.f20064e;
    }

    /* renamed from: d */
    public final boolean m18737d() {
        return this.f20062c;
    }

    /* renamed from: e */
    public final boolean m18738e() {
        return this.f20060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10025h)) {
            return false;
        }
        C10025h c10025h = (C10025h) obj;
        return this.f20060a == c10025h.f20060a && this.f20061b == c10025h.f20061b && this.f20062c == c10025h.f20062c && this.f20063d == c10025h.f20063d && AbstractC9133u.m16128b(this.f20064e, c10025h.f20064e) && AbstractC9133u.m16128b(this.f20065f, c10025h.f20065f) && AbstractC9133u.m16128b(this.f20066g, c10025h.f20066g);
    }

    /* renamed from: f */
    public final InterfaceC10570l m18739f() {
        return this.f20065f;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f20060a) * 31) + Boolean.hashCode(this.f20061b)) * 31) + Boolean.hashCode(this.f20062c)) * 31) + Boolean.hashCode(this.f20063d)) * 31;
        InterfaceC10559a interfaceC10559a = this.f20064e;
        int iHashCode2 = (iHashCode + (interfaceC10559a == null ? 0 : interfaceC10559a.hashCode())) * 31;
        InterfaceC10570l interfaceC10570l = this.f20065f;
        int iHashCode3 = (iHashCode2 + (interfaceC10570l == null ? 0 : interfaceC10570l.hashCode())) * 31;
        InterfaceC10570l interfaceC10570l2 = this.f20066g;
        return iHashCode3 + (interfaceC10570l2 != null ? interfaceC10570l2.hashCode() : 0);
    }

    public String toString() {
        return "SketchPlayExtraConfig(showFullscreenButton=" + this.f20060a + ", autoHideSeekBar=" + this.f20061b + ", seekBarVisibleManually=" + this.f20062c + ", interceptWhenVideo=" + this.f20063d + ", onAutoHideAction=" + this.f20064e + ", sketchTapAction=" + this.f20065f + ", fullscreenClickListener=" + this.f20066g + ")";
    }

    public /* synthetic */ C10025h(boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? null : interfaceC10559a, (i10 & 32) != 0 ? null : interfaceC10570l, (i10 & 64) != 0 ? null : interfaceC10570l2);
    }
}

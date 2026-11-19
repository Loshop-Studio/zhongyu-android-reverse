package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8221q;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.p */
/* loaded from: classes5.dex */
public final class C8220p {

    /* renamed from: a */
    public final boolean f15065a;

    /* renamed from: b */
    public final boolean f15066b;

    /* renamed from: c */
    public final boolean f15067c;

    /* renamed from: d */
    public final boolean f15068d;

    /* renamed from: e */
    public final boolean f15069e;

    /* renamed from: f */
    public final AbstractC8221q f15070f;

    public C8220p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8221q mainToolType) {
        AbstractC9133u.m16133g(mainToolType, "mainToolType");
        this.f15065a = z10;
        this.f15066b = z11;
        this.f15067c = z12;
        this.f15068d = z13;
        this.f15069e = z14;
        this.f15070f = mainToolType;
    }

    /* renamed from: b */
    public static /* synthetic */ C8220p m12883b(C8220p c8220p, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8221q abstractC8221q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8220p.f15065a;
        }
        if ((i10 & 2) != 0) {
            z11 = c8220p.f15066b;
        }
        if ((i10 & 4) != 0) {
            z12 = c8220p.f15067c;
        }
        if ((i10 & 8) != 0) {
            z13 = c8220p.f15068d;
        }
        if ((i10 & 16) != 0) {
            z14 = c8220p.f15069e;
        }
        if ((i10 & 32) != 0) {
            abstractC8221q = c8220p.f15070f;
        }
        boolean z15 = z14;
        AbstractC8221q abstractC8221q2 = abstractC8221q;
        return c8220p.m12884a(z10, z11, z12, z13, z15, abstractC8221q2);
    }

    /* renamed from: a */
    public final C8220p m12884a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8221q mainToolType) {
        AbstractC9133u.m16133g(mainToolType, "mainToolType");
        return new C8220p(z10, z11, z12, z13, z14, mainToolType);
    }

    /* renamed from: c */
    public final AbstractC8221q m12885c() {
        return this.f15070f;
    }

    /* renamed from: d */
    public final boolean m12886d() {
        return this.f15065a;
    }

    /* renamed from: e */
    public final boolean m12887e() {
        return this.f15066b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8220p)) {
            return false;
        }
        C8220p c8220p = (C8220p) obj;
        return this.f15065a == c8220p.f15065a && this.f15066b == c8220p.f15066b && this.f15067c == c8220p.f15067c && this.f15068d == c8220p.f15068d && this.f15069e == c8220p.f15069e && AbstractC9133u.m16128b(this.f15070f, c8220p.f15070f);
    }

    /* renamed from: f */
    public final boolean m12888f() {
        return this.f15068d;
    }

    /* renamed from: g */
    public final boolean m12889g() {
        return this.f15069e;
    }

    /* renamed from: h */
    public final boolean m12890h() {
        return this.f15067c;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f15065a) * 31) + Boolean.hashCode(this.f15066b)) * 31) + Boolean.hashCode(this.f15067c)) * 31) + Boolean.hashCode(this.f15068d)) * 31) + Boolean.hashCode(this.f15069e)) * 31) + this.f15070f.hashCode();
    }

    public String toString() {
        return "MainToolState(revokeVisible=" + this.f15065a + ", zoomVisible=" + this.f15066b + ", isWithdrawEnable=" + this.f15067c + ", isRecoverEnable=" + this.f15068d + ", isTouchable=" + this.f15069e + ", mainToolType=" + this.f15070f + ")";
    }

    public /* synthetic */ C8220p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8221q abstractC8221q, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? AbstractC8221q.d.f15078e : abstractC8221q);
    }
}

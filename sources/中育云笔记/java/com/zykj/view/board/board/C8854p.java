package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8855q;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.p */
/* loaded from: classes6.dex */
public final class C8854p {

    /* renamed from: a */
    public final boolean f20281a;

    /* renamed from: b */
    public final boolean f20282b;

    /* renamed from: c */
    public final boolean f20283c;

    /* renamed from: d */
    public final boolean f20284d;

    /* renamed from: e */
    public final boolean f20285e;

    /* renamed from: f */
    public final AbstractC8855q f20286f;

    public C8854p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8855q mainToolType) {
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        this.f20281a = z10;
        this.f20282b = z11;
        this.f20283c = z12;
        this.f20284d = z13;
        this.f20285e = z14;
        this.f20286f = mainToolType;
    }

    /* renamed from: b */
    public static /* synthetic */ C8854p m16999b(C8854p c8854p, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8855q abstractC8855q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8854p.f20281a;
        }
        if ((i10 & 2) != 0) {
            z11 = c8854p.f20282b;
        }
        if ((i10 & 4) != 0) {
            z12 = c8854p.f20283c;
        }
        if ((i10 & 8) != 0) {
            z13 = c8854p.f20284d;
        }
        if ((i10 & 16) != 0) {
            z14 = c8854p.f20285e;
        }
        if ((i10 & 32) != 0) {
            abstractC8855q = c8854p.f20286f;
        }
        boolean z15 = z14;
        AbstractC8855q abstractC8855q2 = abstractC8855q;
        return c8854p.m17000a(z10, z11, z12, z13, z15, abstractC8855q2);
    }

    /* renamed from: a */
    public final C8854p m17000a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8855q mainToolType) {
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        return new C8854p(z10, z11, z12, z13, z14, mainToolType);
    }

    /* renamed from: c */
    public final AbstractC8855q m17001c() {
        return this.f20286f;
    }

    /* renamed from: d */
    public final boolean m17002d() {
        return this.f20281a;
    }

    /* renamed from: e */
    public final boolean m17003e() {
        return this.f20282b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8854p)) {
            return false;
        }
        C8854p c8854p = (C8854p) obj;
        return this.f20281a == c8854p.f20281a && this.f20282b == c8854p.f20282b && this.f20283c == c8854p.f20283c && this.f20284d == c8854p.f20284d && this.f20285e == c8854p.f20285e && AbstractC9979u.m20289b(this.f20286f, c8854p.f20286f);
    }

    /* renamed from: f */
    public final boolean m17004f() {
        return this.f20284d;
    }

    /* renamed from: g */
    public final boolean m17005g() {
        return this.f20285e;
    }

    /* renamed from: h */
    public final boolean m17006h() {
        return this.f20283c;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f20281a) * 31) + Boolean.hashCode(this.f20282b)) * 31) + Boolean.hashCode(this.f20283c)) * 31) + Boolean.hashCode(this.f20284d)) * 31) + Boolean.hashCode(this.f20285e)) * 31) + this.f20286f.hashCode();
    }

    public String toString() {
        return "MainToolState(revokeVisible=" + this.f20281a + ", zoomVisible=" + this.f20282b + ", isWithdrawEnable=" + this.f20283c + ", isRecoverEnable=" + this.f20284d + ", isTouchable=" + this.f20285e + ", mainToolType=" + this.f20286f + ")";
    }

    public /* synthetic */ C8854p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC8855q abstractC8855q, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? AbstractC8855q.d.f20294e : abstractC8855q);
    }
}

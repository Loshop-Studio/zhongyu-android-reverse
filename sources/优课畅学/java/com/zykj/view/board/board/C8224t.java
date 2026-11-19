package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8223s;
import com.zykj.view.board.board.AbstractC8225u;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.t */
/* loaded from: classes5.dex */
public final class C8224t {

    /* renamed from: a */
    public final boolean f15098a;

    /* renamed from: b */
    public final boolean f15099b;

    /* renamed from: c */
    public final AbstractC8225u f15100c;

    /* renamed from: d */
    public final int f15101d;

    /* renamed from: e */
    public final AbstractC8223s f15102e;

    public C8224t(boolean z10, boolean z11, AbstractC8225u penType, int i10, AbstractC8223s penColor) {
        AbstractC9133u.m16133g(penType, "penType");
        AbstractC9133u.m16133g(penColor, "penColor");
        this.f15098a = z10;
        this.f15099b = z11;
        this.f15100c = penType;
        this.f15101d = i10;
        this.f15102e = penColor;
    }

    /* renamed from: b */
    public static /* synthetic */ C8224t m12901b(C8224t c8224t, boolean z10, boolean z11, AbstractC8225u abstractC8225u, int i10, AbstractC8223s abstractC8223s, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c8224t.f15098a;
        }
        if ((i11 & 2) != 0) {
            z11 = c8224t.f15099b;
        }
        if ((i11 & 4) != 0) {
            abstractC8225u = c8224t.f15100c;
        }
        if ((i11 & 8) != 0) {
            i10 = c8224t.f15101d;
        }
        if ((i11 & 16) != 0) {
            abstractC8223s = c8224t.f15102e;
        }
        AbstractC8223s abstractC8223s2 = abstractC8223s;
        AbstractC8225u abstractC8225u2 = abstractC8225u;
        return c8224t.m12902a(z10, z11, abstractC8225u2, i10, abstractC8223s2);
    }

    /* renamed from: a */
    public final C8224t m12902a(boolean z10, boolean z11, AbstractC8225u penType, int i10, AbstractC8223s penColor) {
        AbstractC9133u.m16133g(penType, "penType");
        AbstractC9133u.m16133g(penColor, "penColor");
        return new C8224t(z10, z11, penType, i10, penColor);
    }

    /* renamed from: c */
    public final boolean m12903c() {
        return this.f15098a;
    }

    /* renamed from: d */
    public final boolean m12904d() {
        return this.f15099b;
    }

    /* renamed from: e */
    public final AbstractC8223s m12905e() {
        return this.f15102e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8224t)) {
            return false;
        }
        C8224t c8224t = (C8224t) obj;
        return this.f15098a == c8224t.f15098a && this.f15099b == c8224t.f15099b && AbstractC9133u.m16128b(this.f15100c, c8224t.f15100c) && this.f15101d == c8224t.f15101d && AbstractC9133u.m16128b(this.f15102e, c8224t.f15102e);
    }

    /* renamed from: f */
    public final int m12906f() {
        return this.f15101d;
    }

    /* renamed from: g */
    public final AbstractC8225u m12907g() {
        return this.f15100c;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f15098a) * 31) + Boolean.hashCode(this.f15099b)) * 31) + this.f15100c.hashCode()) * 31) + Integer.hashCode(this.f15101d)) * 31) + this.f15102e.hashCode();
    }

    public String toString() {
        return "PenToolState(dotVisible=" + this.f15098a + ", highlighterVisible=" + this.f15099b + ", penType=" + this.f15100c + ", penSizeLevel=" + this.f15101d + ", penColor=" + this.f15102e + ")";
    }

    public /* synthetic */ C8224t(boolean z10, boolean z11, AbstractC8225u abstractC8225u, int i10, AbstractC8223s abstractC8223s, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? AbstractC8225u.b.f15109f : abstractC8225u, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? AbstractC8223s.a.f15090c : abstractC8223s);
    }
}

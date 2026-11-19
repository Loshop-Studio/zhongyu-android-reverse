package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8214j;
import com.zykj.view.board.board.AbstractC8216l;
import com.zykj.view.board.board.AbstractC8221q;
import com.zykj.view.board.board.AbstractC8222r;
import com.zykj.view.board.board.AbstractC8223s;
import com.zykj.view.board.simple.AbstractC8252c;
import com.zykj.view.board.simple.AbstractC8253d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.simple.e */
/* loaded from: classes5.dex */
public final class C8254e {

    /* renamed from: a */
    public final boolean f15297a;

    /* renamed from: b */
    public final AbstractC8221q f15298b;

    /* renamed from: c */
    public final AbstractC8222r f15299c;

    /* renamed from: d */
    public final AbstractC8253d f15300d;

    /* renamed from: e */
    public final AbstractC8252c f15301e;

    /* renamed from: f */
    public final AbstractC8223s f15302f;

    /* renamed from: g */
    public final AbstractC8214j f15303g;

    /* renamed from: h */
    public final AbstractC8216l f15304h;

    public C8254e(boolean z10, AbstractC8221q mainToolType, AbstractC8222r minorToolType, AbstractC8253d penType, AbstractC8252c penSize, AbstractC8223s penColor, AbstractC8214j eraserType, AbstractC8216l expandStatus) {
        AbstractC9133u.m16133g(mainToolType, "mainToolType");
        AbstractC9133u.m16133g(minorToolType, "minorToolType");
        AbstractC9133u.m16133g(penType, "penType");
        AbstractC9133u.m16133g(penSize, "penSize");
        AbstractC9133u.m16133g(penColor, "penColor");
        AbstractC9133u.m16133g(eraserType, "eraserType");
        AbstractC9133u.m16133g(expandStatus, "expandStatus");
        this.f15297a = z10;
        this.f15298b = mainToolType;
        this.f15299c = minorToolType;
        this.f15300d = penType;
        this.f15301e = penSize;
        this.f15302f = penColor;
        this.f15303g = eraserType;
        this.f15304h = expandStatus;
    }

    /* renamed from: b */
    public static /* synthetic */ C8254e m13248b(C8254e c8254e, boolean z10, AbstractC8221q abstractC8221q, AbstractC8222r abstractC8222r, AbstractC8253d abstractC8253d, AbstractC8252c abstractC8252c, AbstractC8223s abstractC8223s, AbstractC8214j abstractC8214j, AbstractC8216l abstractC8216l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8254e.f15297a;
        }
        if ((i10 & 2) != 0) {
            abstractC8221q = c8254e.f15298b;
        }
        if ((i10 & 4) != 0) {
            abstractC8222r = c8254e.f15299c;
        }
        if ((i10 & 8) != 0) {
            abstractC8253d = c8254e.f15300d;
        }
        if ((i10 & 16) != 0) {
            abstractC8252c = c8254e.f15301e;
        }
        if ((i10 & 32) != 0) {
            abstractC8223s = c8254e.f15302f;
        }
        if ((i10 & 64) != 0) {
            abstractC8214j = c8254e.f15303g;
        }
        if ((i10 & 128) != 0) {
            abstractC8216l = c8254e.f15304h;
        }
        AbstractC8214j abstractC8214j2 = abstractC8214j;
        AbstractC8216l abstractC8216l2 = abstractC8216l;
        AbstractC8252c abstractC8252c2 = abstractC8252c;
        AbstractC8223s abstractC8223s2 = abstractC8223s;
        return c8254e.m13249a(z10, abstractC8221q, abstractC8222r, abstractC8253d, abstractC8252c2, abstractC8223s2, abstractC8214j2, abstractC8216l2);
    }

    /* renamed from: a */
    public final C8254e m13249a(boolean z10, AbstractC8221q mainToolType, AbstractC8222r minorToolType, AbstractC8253d penType, AbstractC8252c penSize, AbstractC8223s penColor, AbstractC8214j eraserType, AbstractC8216l expandStatus) {
        AbstractC9133u.m16133g(mainToolType, "mainToolType");
        AbstractC9133u.m16133g(minorToolType, "minorToolType");
        AbstractC9133u.m16133g(penType, "penType");
        AbstractC9133u.m16133g(penSize, "penSize");
        AbstractC9133u.m16133g(penColor, "penColor");
        AbstractC9133u.m16133g(eraserType, "eraserType");
        AbstractC9133u.m16133g(expandStatus, "expandStatus");
        return new C8254e(z10, mainToolType, minorToolType, penType, penSize, penColor, eraserType, expandStatus);
    }

    /* renamed from: c */
    public final AbstractC8214j m13250c() {
        return this.f15303g;
    }

    /* renamed from: d */
    public final AbstractC8216l m13251d() {
        return this.f15304h;
    }

    /* renamed from: e */
    public final AbstractC8221q m13252e() {
        return this.f15298b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8254e)) {
            return false;
        }
        C8254e c8254e = (C8254e) obj;
        return this.f15297a == c8254e.f15297a && AbstractC9133u.m16128b(this.f15298b, c8254e.f15298b) && AbstractC9133u.m16128b(this.f15299c, c8254e.f15299c) && AbstractC9133u.m16128b(this.f15300d, c8254e.f15300d) && AbstractC9133u.m16128b(this.f15301e, c8254e.f15301e) && AbstractC9133u.m16128b(this.f15302f, c8254e.f15302f) && AbstractC9133u.m16128b(this.f15303g, c8254e.f15303g) && AbstractC9133u.m16128b(this.f15304h, c8254e.f15304h);
    }

    /* renamed from: f */
    public final AbstractC8222r m13253f() {
        return this.f15299c;
    }

    /* renamed from: g */
    public final AbstractC8223s m13254g() {
        return this.f15302f;
    }

    /* renamed from: h */
    public final AbstractC8252c m13255h() {
        return this.f15301e;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f15297a) * 31) + this.f15298b.hashCode()) * 31) + this.f15299c.hashCode()) * 31) + this.f15300d.hashCode()) * 31) + this.f15301e.hashCode()) * 31) + this.f15302f.hashCode()) * 31) + this.f15303g.hashCode()) * 31) + this.f15304h.hashCode();
    }

    /* renamed from: i */
    public final AbstractC8253d m13256i() {
        return this.f15300d;
    }

    /* renamed from: j */
    public final boolean m13257j() {
        return this.f15297a;
    }

    public String toString() {
        return "SimpleUIState(isTouchable=" + this.f15297a + ", mainToolType=" + this.f15298b + ", minorToolType=" + this.f15299c + ", penType=" + this.f15300d + ", penSize=" + this.f15301e + ", penColor=" + this.f15302f + ", eraserType=" + this.f15303g + ", expandStatus=" + this.f15304h + ")";
    }

    public /* synthetic */ C8254e(boolean z10, AbstractC8221q abstractC8221q, AbstractC8222r abstractC8222r, AbstractC8253d abstractC8253d, AbstractC8252c abstractC8252c, AbstractC8223s abstractC8223s, AbstractC8214j abstractC8214j, AbstractC8216l abstractC8216l, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? AbstractC8221q.c.f15077e : abstractC8221q, (i10 & 4) != 0 ? AbstractC8222r.d.f15086e : abstractC8222r, (i10 & 8) != 0 ? AbstractC8253d.a.f15294d : abstractC8253d, (i10 & 16) != 0 ? AbstractC8252c.b.f15289c : abstractC8252c, (i10 & 32) != 0 ? AbstractC8223s.a.f15090c : abstractC8223s, (i10 & 64) != 0 ? AbstractC8214j.b.f15037c : abstractC8214j, (i10 & 128) != 0 ? AbstractC8216l.b.f15042b : abstractC8216l);
    }
}

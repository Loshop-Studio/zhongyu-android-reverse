package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8848j;
import com.zykj.view.board.board.AbstractC8850l;
import com.zykj.view.board.board.AbstractC8855q;
import com.zykj.view.board.board.AbstractC8856r;
import com.zykj.view.board.board.AbstractC8857s;
import com.zykj.view.board.simple.AbstractC8885c;
import com.zykj.view.board.simple.AbstractC8886d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.simple.e */
/* loaded from: classes6.dex */
public final class C8887e {

    /* renamed from: a */
    public final boolean f20508a;

    /* renamed from: b */
    public final AbstractC8855q f20509b;

    /* renamed from: c */
    public final AbstractC8856r f20510c;

    /* renamed from: d */
    public final AbstractC8886d f20511d;

    /* renamed from: e */
    public final AbstractC8885c f20512e;

    /* renamed from: f */
    public final AbstractC8857s f20513f;

    /* renamed from: g */
    public final AbstractC8848j f20514g;

    /* renamed from: h */
    public final AbstractC8850l f20515h;

    public C8887e(boolean z10, AbstractC8855q mainToolType, AbstractC8856r minorToolType, AbstractC8886d penType, AbstractC8885c penSize, AbstractC8857s penColor, AbstractC8848j eraserType, AbstractC8850l expandStatus) {
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        AbstractC9979u.m20294g(minorToolType, "minorToolType");
        AbstractC9979u.m20294g(penType, "penType");
        AbstractC9979u.m20294g(penSize, "penSize");
        AbstractC9979u.m20294g(penColor, "penColor");
        AbstractC9979u.m20294g(eraserType, "eraserType");
        AbstractC9979u.m20294g(expandStatus, "expandStatus");
        this.f20508a = z10;
        this.f20509b = mainToolType;
        this.f20510c = minorToolType;
        this.f20511d = penType;
        this.f20512e = penSize;
        this.f20513f = penColor;
        this.f20514g = eraserType;
        this.f20515h = expandStatus;
    }

    /* renamed from: b */
    public static /* synthetic */ C8887e m17320b(C8887e c8887e, boolean z10, AbstractC8855q abstractC8855q, AbstractC8856r abstractC8856r, AbstractC8886d abstractC8886d, AbstractC8885c abstractC8885c, AbstractC8857s abstractC8857s, AbstractC8848j abstractC8848j, AbstractC8850l abstractC8850l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8887e.f20508a;
        }
        if ((i10 & 2) != 0) {
            abstractC8855q = c8887e.f20509b;
        }
        if ((i10 & 4) != 0) {
            abstractC8856r = c8887e.f20510c;
        }
        if ((i10 & 8) != 0) {
            abstractC8886d = c8887e.f20511d;
        }
        if ((i10 & 16) != 0) {
            abstractC8885c = c8887e.f20512e;
        }
        if ((i10 & 32) != 0) {
            abstractC8857s = c8887e.f20513f;
        }
        if ((i10 & 64) != 0) {
            abstractC8848j = c8887e.f20514g;
        }
        if ((i10 & 128) != 0) {
            abstractC8850l = c8887e.f20515h;
        }
        AbstractC8848j abstractC8848j2 = abstractC8848j;
        AbstractC8850l abstractC8850l2 = abstractC8850l;
        AbstractC8885c abstractC8885c2 = abstractC8885c;
        AbstractC8857s abstractC8857s2 = abstractC8857s;
        return c8887e.m17321a(z10, abstractC8855q, abstractC8856r, abstractC8886d, abstractC8885c2, abstractC8857s2, abstractC8848j2, abstractC8850l2);
    }

    /* renamed from: a */
    public final C8887e m17321a(boolean z10, AbstractC8855q mainToolType, AbstractC8856r minorToolType, AbstractC8886d penType, AbstractC8885c penSize, AbstractC8857s penColor, AbstractC8848j eraserType, AbstractC8850l expandStatus) {
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        AbstractC9979u.m20294g(minorToolType, "minorToolType");
        AbstractC9979u.m20294g(penType, "penType");
        AbstractC9979u.m20294g(penSize, "penSize");
        AbstractC9979u.m20294g(penColor, "penColor");
        AbstractC9979u.m20294g(eraserType, "eraserType");
        AbstractC9979u.m20294g(expandStatus, "expandStatus");
        return new C8887e(z10, mainToolType, minorToolType, penType, penSize, penColor, eraserType, expandStatus);
    }

    /* renamed from: c */
    public final AbstractC8848j m17322c() {
        return this.f20514g;
    }

    /* renamed from: d */
    public final AbstractC8850l m17323d() {
        return this.f20515h;
    }

    /* renamed from: e */
    public final AbstractC8855q m17324e() {
        return this.f20509b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8887e)) {
            return false;
        }
        C8887e c8887e = (C8887e) obj;
        return this.f20508a == c8887e.f20508a && AbstractC9979u.m20289b(this.f20509b, c8887e.f20509b) && AbstractC9979u.m20289b(this.f20510c, c8887e.f20510c) && AbstractC9979u.m20289b(this.f20511d, c8887e.f20511d) && AbstractC9979u.m20289b(this.f20512e, c8887e.f20512e) && AbstractC9979u.m20289b(this.f20513f, c8887e.f20513f) && AbstractC9979u.m20289b(this.f20514g, c8887e.f20514g) && AbstractC9979u.m20289b(this.f20515h, c8887e.f20515h);
    }

    /* renamed from: f */
    public final AbstractC8856r m17325f() {
        return this.f20510c;
    }

    /* renamed from: g */
    public final AbstractC8857s m17326g() {
        return this.f20513f;
    }

    /* renamed from: h */
    public final AbstractC8885c m17327h() {
        return this.f20512e;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f20508a) * 31) + this.f20509b.hashCode()) * 31) + this.f20510c.hashCode()) * 31) + this.f20511d.hashCode()) * 31) + this.f20512e.hashCode()) * 31) + this.f20513f.hashCode()) * 31) + this.f20514g.hashCode()) * 31) + this.f20515h.hashCode();
    }

    /* renamed from: i */
    public final AbstractC8886d m17328i() {
        return this.f20511d;
    }

    /* renamed from: j */
    public final boolean m17329j() {
        return this.f20508a;
    }

    public String toString() {
        return "SimpleUIState(isTouchable=" + this.f20508a + ", mainToolType=" + this.f20509b + ", minorToolType=" + this.f20510c + ", penType=" + this.f20511d + ", penSize=" + this.f20512e + ", penColor=" + this.f20513f + ", eraserType=" + this.f20514g + ", expandStatus=" + this.f20515h + ")";
    }

    public /* synthetic */ C8887e(boolean z10, AbstractC8855q abstractC8855q, AbstractC8856r abstractC8856r, AbstractC8886d abstractC8886d, AbstractC8885c abstractC8885c, AbstractC8857s abstractC8857s, AbstractC8848j abstractC8848j, AbstractC8850l abstractC8850l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? AbstractC8855q.c.f20293e : abstractC8855q, (i10 & 4) != 0 ? AbstractC8856r.d.f20302e : abstractC8856r, (i10 & 8) != 0 ? AbstractC8886d.a.f20505d : abstractC8886d, (i10 & 16) != 0 ? AbstractC8885c.b.f20500c : abstractC8885c, (i10 & 32) != 0 ? AbstractC8857s.a.f20306c : abstractC8857s, (i10 & 64) != 0 ? AbstractC8848j.b.f20253c : abstractC8848j, (i10 & 128) != 0 ? AbstractC8850l.b.f20258b : abstractC8850l);
    }
}

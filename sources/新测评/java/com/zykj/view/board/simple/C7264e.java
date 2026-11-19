package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC7220g;
import com.zykj.view.board.board.AbstractC7222i;
import com.zykj.view.board.board.AbstractC7227n;
import com.zykj.view.board.board.AbstractC7228o;
import com.zykj.view.board.board.AbstractC7229p;
import com.zykj.view.board.simple.AbstractC7262c;
import com.zykj.view.board.simple.AbstractC7263d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.simple.e */
/* loaded from: classes5.dex */
public final class C7264e {

    /* renamed from: a */
    public final boolean f11299a;

    /* renamed from: b */
    public final AbstractC7227n f11300b;

    /* renamed from: c */
    public final AbstractC7228o f11301c;

    /* renamed from: d */
    public final AbstractC7263d f11302d;

    /* renamed from: e */
    public final AbstractC7262c f11303e;

    /* renamed from: f */
    public final AbstractC7229p f11304f;

    /* renamed from: g */
    public final AbstractC7220g f11305g;

    /* renamed from: h */
    public final AbstractC7222i f11306h;

    public C7264e(boolean z9, AbstractC7227n mainToolType, AbstractC7228o minorToolType, AbstractC7263d penType, AbstractC7262c penSize, AbstractC7229p penColor, AbstractC7220g eraserType, AbstractC7222i expandStatus) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penSize, "penSize");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        this.f11299a = z9;
        this.f11300b = mainToolType;
        this.f11301c = minorToolType;
        this.f11302d = penType;
        this.f11303e = penSize;
        this.f11304f = penColor;
        this.f11305g = eraserType;
        this.f11306h = expandStatus;
    }

    /* renamed from: b */
    public static /* synthetic */ C7264e m11376b(C7264e c7264e, boolean z9, AbstractC7227n abstractC7227n, AbstractC7228o abstractC7228o, AbstractC7263d abstractC7263d, AbstractC7262c abstractC7262c, AbstractC7229p abstractC7229p, AbstractC7220g abstractC7220g, AbstractC7222i abstractC7222i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c7264e.f11299a;
        }
        if ((i10 & 2) != 0) {
            abstractC7227n = c7264e.f11300b;
        }
        if ((i10 & 4) != 0) {
            abstractC7228o = c7264e.f11301c;
        }
        if ((i10 & 8) != 0) {
            abstractC7263d = c7264e.f11302d;
        }
        if ((i10 & 16) != 0) {
            abstractC7262c = c7264e.f11303e;
        }
        if ((i10 & 32) != 0) {
            abstractC7229p = c7264e.f11304f;
        }
        if ((i10 & 64) != 0) {
            abstractC7220g = c7264e.f11305g;
        }
        if ((i10 & 128) != 0) {
            abstractC7222i = c7264e.f11306h;
        }
        AbstractC7220g abstractC7220g2 = abstractC7220g;
        AbstractC7222i abstractC7222i2 = abstractC7222i;
        AbstractC7262c abstractC7262c2 = abstractC7262c;
        AbstractC7229p abstractC7229p2 = abstractC7229p;
        return c7264e.m11377a(z9, abstractC7227n, abstractC7228o, abstractC7263d, abstractC7262c2, abstractC7229p2, abstractC7220g2, abstractC7222i2);
    }

    /* renamed from: a */
    public final C7264e m11377a(boolean z9, AbstractC7227n mainToolType, AbstractC7228o minorToolType, AbstractC7263d penType, AbstractC7262c penSize, AbstractC7229p penColor, AbstractC7220g eraserType, AbstractC7222i expandStatus) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penSize, "penSize");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        return new C7264e(z9, mainToolType, minorToolType, penType, penSize, penColor, eraserType, expandStatus);
    }

    /* renamed from: c */
    public final AbstractC7220g m11378c() {
        return this.f11305g;
    }

    /* renamed from: d */
    public final AbstractC7222i m11379d() {
        return this.f11306h;
    }

    /* renamed from: e */
    public final AbstractC7227n m11380e() {
        return this.f11300b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7264e)) {
            return false;
        }
        C7264e c7264e = (C7264e) obj;
        return this.f11299a == c7264e.f11299a && Intrinsics.areEqual(this.f11300b, c7264e.f11300b) && Intrinsics.areEqual(this.f11301c, c7264e.f11301c) && Intrinsics.areEqual(this.f11302d, c7264e.f11302d) && Intrinsics.areEqual(this.f11303e, c7264e.f11303e) && Intrinsics.areEqual(this.f11304f, c7264e.f11304f) && Intrinsics.areEqual(this.f11305g, c7264e.f11305g) && Intrinsics.areEqual(this.f11306h, c7264e.f11306h);
    }

    /* renamed from: f */
    public final AbstractC7228o m11381f() {
        return this.f11301c;
    }

    /* renamed from: g */
    public final AbstractC7229p m11382g() {
        return this.f11304f;
    }

    /* renamed from: h */
    public final AbstractC7262c m11383h() {
        return this.f11303e;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f11299a) * 31) + this.f11300b.hashCode()) * 31) + this.f11301c.hashCode()) * 31) + this.f11302d.hashCode()) * 31) + this.f11303e.hashCode()) * 31) + this.f11304f.hashCode()) * 31) + this.f11305g.hashCode()) * 31) + this.f11306h.hashCode();
    }

    /* renamed from: i */
    public final AbstractC7263d m11384i() {
        return this.f11302d;
    }

    /* renamed from: j */
    public final boolean m11385j() {
        return this.f11299a;
    }

    public String toString() {
        return "SimpleUIState(isTouchable=" + this.f11299a + ", mainToolType=" + this.f11300b + ", minorToolType=" + this.f11301c + ", penType=" + this.f11302d + ", penSize=" + this.f11303e + ", penColor=" + this.f11304f + ", eraserType=" + this.f11305g + ", expandStatus=" + this.f11306h + ")";
    }

    public /* synthetic */ C7264e(boolean z9, AbstractC7227n abstractC7227n, AbstractC7228o abstractC7228o, AbstractC7263d abstractC7263d, AbstractC7262c abstractC7262c, AbstractC7229p abstractC7229p, AbstractC7220g abstractC7220g, AbstractC7222i abstractC7222i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? AbstractC7227n.c.f11069e : abstractC7227n, (i10 & 4) != 0 ? AbstractC7228o.d.f11079f : abstractC7228o, (i10 & 8) != 0 ? AbstractC7263d.a.f11296d : abstractC7263d, (i10 & 16) != 0 ? AbstractC7262c.b.f11291c : abstractC7262c, (i10 & 32) != 0 ? AbstractC7229p.a.f11084c : abstractC7229p, (i10 & 64) != 0 ? AbstractC7220g.b.f11029c : abstractC7220g, (i10 & 128) != 0 ? AbstractC7222i.b.f11034b : abstractC7222i);
    }
}

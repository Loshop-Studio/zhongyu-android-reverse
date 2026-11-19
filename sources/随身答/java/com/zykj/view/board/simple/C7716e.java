package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC7669l;
import com.zykj.view.board.board.AbstractC7671n;
import com.zykj.view.board.board.AbstractC7676s;
import com.zykj.view.board.board.AbstractC7677t;
import com.zykj.view.board.board.AbstractC7678u;
import com.zykj.view.board.simple.AbstractC7714c;
import com.zykj.view.board.simple.AbstractC7715d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.simple.e */
/* loaded from: classes5.dex */
public final class C7716e {

    /* renamed from: a */
    public final boolean f12536a;

    /* renamed from: b */
    public final AbstractC7676s f12537b;

    /* renamed from: c */
    public final AbstractC7677t f12538c;

    /* renamed from: d */
    public final AbstractC7715d f12539d;

    /* renamed from: e */
    public final AbstractC7714c f12540e;

    /* renamed from: f */
    public final AbstractC7678u f12541f;

    /* renamed from: g */
    public final AbstractC7669l f12542g;

    /* renamed from: h */
    public final AbstractC7671n f12543h;

    public C7716e(boolean z9, AbstractC7676s mainToolType, AbstractC7677t minorToolType, AbstractC7715d penType, AbstractC7714c penSize, AbstractC7678u penColor, AbstractC7669l eraserType, AbstractC7671n expandStatus) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penSize, "penSize");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        this.f12536a = z9;
        this.f12537b = mainToolType;
        this.f12538c = minorToolType;
        this.f12539d = penType;
        this.f12540e = penSize;
        this.f12541f = penColor;
        this.f12542g = eraserType;
        this.f12543h = expandStatus;
    }

    /* renamed from: b */
    public static /* synthetic */ C7716e m11865b(C7716e c7716e, boolean z9, AbstractC7676s abstractC7676s, AbstractC7677t abstractC7677t, AbstractC7715d abstractC7715d, AbstractC7714c abstractC7714c, AbstractC7678u abstractC7678u, AbstractC7669l abstractC7669l, AbstractC7671n abstractC7671n, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = c7716e.f12536a;
        }
        if ((i9 & 2) != 0) {
            abstractC7676s = c7716e.f12537b;
        }
        if ((i9 & 4) != 0) {
            abstractC7677t = c7716e.f12538c;
        }
        if ((i9 & 8) != 0) {
            abstractC7715d = c7716e.f12539d;
        }
        if ((i9 & 16) != 0) {
            abstractC7714c = c7716e.f12540e;
        }
        if ((i9 & 32) != 0) {
            abstractC7678u = c7716e.f12541f;
        }
        if ((i9 & 64) != 0) {
            abstractC7669l = c7716e.f12542g;
        }
        if ((i9 & 128) != 0) {
            abstractC7671n = c7716e.f12543h;
        }
        AbstractC7669l abstractC7669l2 = abstractC7669l;
        AbstractC7671n abstractC7671n2 = abstractC7671n;
        AbstractC7714c abstractC7714c2 = abstractC7714c;
        AbstractC7678u abstractC7678u2 = abstractC7678u;
        return c7716e.m11866a(z9, abstractC7676s, abstractC7677t, abstractC7715d, abstractC7714c2, abstractC7678u2, abstractC7669l2, abstractC7671n2);
    }

    /* renamed from: a */
    public final C7716e m11866a(boolean z9, AbstractC7676s mainToolType, AbstractC7677t minorToolType, AbstractC7715d penType, AbstractC7714c penSize, AbstractC7678u penColor, AbstractC7669l eraserType, AbstractC7671n expandStatus) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penSize, "penSize");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        return new C7716e(z9, mainToolType, minorToolType, penType, penSize, penColor, eraserType, expandStatus);
    }

    /* renamed from: c */
    public final AbstractC7669l m11867c() {
        return this.f12542g;
    }

    /* renamed from: d */
    public final AbstractC7671n m11868d() {
        return this.f12543h;
    }

    /* renamed from: e */
    public final AbstractC7676s m11869e() {
        return this.f12537b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7716e)) {
            return false;
        }
        C7716e c7716e = (C7716e) obj;
        return this.f12536a == c7716e.f12536a && Intrinsics.areEqual(this.f12537b, c7716e.f12537b) && Intrinsics.areEqual(this.f12538c, c7716e.f12538c) && Intrinsics.areEqual(this.f12539d, c7716e.f12539d) && Intrinsics.areEqual(this.f12540e, c7716e.f12540e) && Intrinsics.areEqual(this.f12541f, c7716e.f12541f) && Intrinsics.areEqual(this.f12542g, c7716e.f12542g) && Intrinsics.areEqual(this.f12543h, c7716e.f12543h);
    }

    /* renamed from: f */
    public final AbstractC7677t m11870f() {
        return this.f12538c;
    }

    /* renamed from: g */
    public final AbstractC7678u m11871g() {
        return this.f12541f;
    }

    /* renamed from: h */
    public final AbstractC7714c m11872h() {
        return this.f12540e;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f12536a) * 31) + this.f12537b.hashCode()) * 31) + this.f12538c.hashCode()) * 31) + this.f12539d.hashCode()) * 31) + this.f12540e.hashCode()) * 31) + this.f12541f.hashCode()) * 31) + this.f12542g.hashCode()) * 31) + this.f12543h.hashCode();
    }

    /* renamed from: i */
    public final AbstractC7715d m11873i() {
        return this.f12539d;
    }

    /* renamed from: j */
    public final boolean m11874j() {
        return this.f12536a;
    }

    public String toString() {
        return "SimpleUIState(isTouchable=" + this.f12536a + ", mainToolType=" + this.f12537b + ", minorToolType=" + this.f12538c + ", penType=" + this.f12539d + ", penSize=" + this.f12540e + ", penColor=" + this.f12541f + ", eraserType=" + this.f12542g + ", expandStatus=" + this.f12543h + ")";
    }

    public /* synthetic */ C7716e(boolean z9, AbstractC7676s abstractC7676s, AbstractC7677t abstractC7677t, AbstractC7715d abstractC7715d, AbstractC7714c abstractC7714c, AbstractC7678u abstractC7678u, AbstractC7669l abstractC7669l, AbstractC7671n abstractC7671n, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? AbstractC7676s.c.f12288e : abstractC7676s, (i9 & 4) != 0 ? AbstractC7677t.d.f12298f : abstractC7677t, (i9 & 8) != 0 ? AbstractC7715d.a.f12533d : abstractC7715d, (i9 & 16) != 0 ? AbstractC7714c.b.f12528c : abstractC7714c, (i9 & 32) != 0 ? AbstractC7678u.a.f12303c : abstractC7678u, (i9 & 64) != 0 ? AbstractC7669l.b.f12248c : abstractC7669l, (i9 & 128) != 0 ? AbstractC7671n.b.f12253b : abstractC7671n);
    }
}

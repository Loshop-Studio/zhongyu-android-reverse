package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7229p;
import com.zykj.view.board.board.AbstractC7231r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.q */
/* loaded from: classes5.dex */
public final class C7230q {

    /* renamed from: a */
    public final boolean f11087a;

    /* renamed from: b */
    public final boolean f11088b;

    /* renamed from: c */
    public final AbstractC7231r f11089c;

    /* renamed from: d */
    public final int f11090d;

    /* renamed from: e */
    public final AbstractC7229p f11091e;

    /* renamed from: f */
    public final int f11092f;

    /* renamed from: g */
    public final boolean f11093g;

    public C7230q(boolean z9, boolean z10, AbstractC7231r penType, int i10, AbstractC7229p penColor, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        this.f11087a = z9;
        this.f11088b = z10;
        this.f11089c = penType;
        this.f11090d = i10;
        this.f11091e = penColor;
        this.f11092f = i11;
        this.f11093g = z11;
    }

    /* renamed from: b */
    public static /* synthetic */ C7230q m11023b(C7230q c7230q, boolean z9, boolean z10, AbstractC7231r abstractC7231r, int i10, AbstractC7229p abstractC7229p, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z9 = c7230q.f11087a;
        }
        if ((i12 & 2) != 0) {
            z10 = c7230q.f11088b;
        }
        if ((i12 & 4) != 0) {
            abstractC7231r = c7230q.f11089c;
        }
        if ((i12 & 8) != 0) {
            i10 = c7230q.f11090d;
        }
        if ((i12 & 16) != 0) {
            abstractC7229p = c7230q.f11091e;
        }
        if ((i12 & 32) != 0) {
            i11 = c7230q.f11092f;
        }
        if ((i12 & 64) != 0) {
            z11 = c7230q.f11093g;
        }
        int i13 = i11;
        boolean z12 = z11;
        AbstractC7229p abstractC7229p2 = abstractC7229p;
        AbstractC7231r abstractC7231r2 = abstractC7231r;
        return c7230q.m11024a(z9, z10, abstractC7231r2, i10, abstractC7229p2, i13, z12);
    }

    /* renamed from: a */
    public final C7230q m11024a(boolean z9, boolean z10, AbstractC7231r penType, int i10, AbstractC7229p penColor, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        return new C7230q(z9, z10, penType, i10, penColor, i11, z11);
    }

    /* renamed from: c */
    public final boolean m11025c() {
        return this.f11087a;
    }

    /* renamed from: d */
    public final boolean m11026d() {
        return this.f11088b;
    }

    /* renamed from: e */
    public final AbstractC7229p m11027e() {
        return this.f11091e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7230q)) {
            return false;
        }
        C7230q c7230q = (C7230q) obj;
        return this.f11087a == c7230q.f11087a && this.f11088b == c7230q.f11088b && Intrinsics.areEqual(this.f11089c, c7230q.f11089c) && this.f11090d == c7230q.f11090d && Intrinsics.areEqual(this.f11091e, c7230q.f11091e) && this.f11092f == c7230q.f11092f && this.f11093g == c7230q.f11093g;
    }

    /* renamed from: f */
    public final int m11028f() {
        return this.f11092f;
    }

    /* renamed from: g */
    public final int m11029g() {
        return this.f11090d;
    }

    /* renamed from: h */
    public final AbstractC7231r m11030h() {
        return this.f11089c;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f11087a) * 31) + Boolean.hashCode(this.f11088b)) * 31) + this.f11089c.hashCode()) * 31) + Integer.hashCode(this.f11090d)) * 31) + this.f11091e.hashCode()) * 31) + Integer.hashCode(this.f11092f)) * 31) + Boolean.hashCode(this.f11093g);
    }

    /* renamed from: i */
    public final boolean m11031i() {
        return this.f11093g;
    }

    public String toString() {
        return "PenToolState(dotVisible=" + this.f11087a + ", highlighterVisible=" + this.f11088b + ", penType=" + this.f11089c + ", penSizeLevel=" + this.f11090d + ", penColor=" + this.f11091e + ", penCustomColor=" + this.f11092f + ", isShowCustomColor=" + this.f11093g + ")";
    }

    public /* synthetic */ C7230q(boolean z9, boolean z10, AbstractC7231r abstractC7231r, int i10, AbstractC7229p abstractC7229p, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z9, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? AbstractC7231r.b.f11100f : abstractC7231r, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? AbstractC7229p.a.f11084c : abstractC7229p, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? false : z11);
    }
}

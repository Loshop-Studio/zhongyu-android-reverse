package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.m */
/* loaded from: classes5.dex */
public final class C8217m {

    /* renamed from: a */
    public final AbstractC8222r f15043a;

    /* renamed from: b */
    public final AbstractC8211g f15044b;

    /* renamed from: c */
    public final boolean f15045c;

    /* renamed from: d */
    public final boolean f15046d;

    /* renamed from: e */
    public final float f15047e;

    /* renamed from: f */
    public final float f15048f;

    /* renamed from: g */
    public final boolean f15049g;

    /* renamed from: h */
    public final float f15050h;

    /* renamed from: i */
    public final float f15051i;

    public C8217m(AbstractC8222r minorToolType, AbstractC8211g confirmButtonType, boolean z10, boolean z11, float f10, float f11, boolean z12, float f12, float f13) {
        AbstractC9133u.m16133g(minorToolType, "minorToolType");
        AbstractC9133u.m16133g(confirmButtonType, "confirmButtonType");
        this.f15043a = minorToolType;
        this.f15044b = confirmButtonType;
        this.f15045c = z10;
        this.f15046d = z11;
        this.f15047e = f10;
        this.f15048f = f11;
        this.f15049g = z12;
        this.f15050h = f12;
        this.f15051i = f13;
    }

    /* renamed from: b */
    public static /* synthetic */ C8217m m12861b(C8217m c8217m, AbstractC8222r abstractC8222r, AbstractC8211g abstractC8211g, boolean z10, boolean z11, float f10, float f11, boolean z12, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC8222r = c8217m.f15043a;
        }
        if ((i10 & 2) != 0) {
            abstractC8211g = c8217m.f15044b;
        }
        if ((i10 & 4) != 0) {
            z10 = c8217m.f15045c;
        }
        if ((i10 & 8) != 0) {
            z11 = c8217m.f15046d;
        }
        if ((i10 & 16) != 0) {
            f10 = c8217m.f15047e;
        }
        if ((i10 & 32) != 0) {
            f11 = c8217m.f15048f;
        }
        if ((i10 & 64) != 0) {
            z12 = c8217m.f15049g;
        }
        if ((i10 & 128) != 0) {
            f12 = c8217m.f15050h;
        }
        if ((i10 & 256) != 0) {
            f13 = c8217m.f15051i;
        }
        float f14 = f12;
        float f15 = f13;
        float f16 = f11;
        boolean z13 = z12;
        float f17 = f10;
        boolean z14 = z10;
        return c8217m.m12862a(abstractC8222r, abstractC8211g, z14, z11, f17, f16, z13, f14, f15);
    }

    /* renamed from: a */
    public final C8217m m12862a(AbstractC8222r minorToolType, AbstractC8211g confirmButtonType, boolean z10, boolean z11, float f10, float f11, boolean z12, float f12, float f13) {
        AbstractC9133u.m16133g(minorToolType, "minorToolType");
        AbstractC9133u.m16133g(confirmButtonType, "confirmButtonType");
        return new C8217m(minorToolType, confirmButtonType, z10, z11, f10, f11, z12, f12, f13);
    }

    /* renamed from: c */
    public final AbstractC8211g m12863c() {
        return this.f15044b;
    }

    /* renamed from: d */
    public final float m12864d() {
        return this.f15050h;
    }

    /* renamed from: e */
    public final float m12865e() {
        return this.f15051i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8217m)) {
            return false;
        }
        C8217m c8217m = (C8217m) obj;
        return AbstractC9133u.m16128b(this.f15043a, c8217m.f15043a) && AbstractC9133u.m16128b(this.f15044b, c8217m.f15044b) && this.f15045c == c8217m.f15045c && this.f15046d == c8217m.f15046d && Float.compare(this.f15047e, c8217m.f15047e) == 0 && Float.compare(this.f15048f, c8217m.f15048f) == 0 && this.f15049g == c8217m.f15049g && Float.compare(this.f15050h, c8217m.f15050h) == 0 && Float.compare(this.f15051i, c8217m.f15051i) == 0;
    }

    /* renamed from: f */
    public final AbstractC8222r m12866f() {
        return this.f15043a;
    }

    /* renamed from: g */
    public final float m12867g() {
        return this.f15047e;
    }

    /* renamed from: h */
    public final float m12868h() {
        return this.f15048f;
    }

    public int hashCode() {
        return (((((((((((((((this.f15043a.hashCode() * 31) + this.f15044b.hashCode()) * 31) + Boolean.hashCode(this.f15045c)) * 31) + Boolean.hashCode(this.f15046d)) * 31) + Float.hashCode(this.f15047e)) * 31) + Float.hashCode(this.f15048f)) * 31) + Boolean.hashCode(this.f15049g)) * 31) + Float.hashCode(this.f15050h)) * 31) + Float.hashCode(this.f15051i);
    }

    /* renamed from: i */
    public final boolean m12869i() {
        return this.f15045c;
    }

    /* renamed from: j */
    public final boolean m12870j() {
        return this.f15049g;
    }

    /* renamed from: k */
    public final boolean m12871k() {
        return this.f15046d;
    }

    public String toString() {
        return "ExtraUIState(minorToolType=" + this.f15043a + ", confirmButtonType=" + this.f15044b + ", isDeleteDraftVisible=" + this.f15045c + ", isVerticalProgressTouchable=" + this.f15046d + ", verticalProgress=" + this.f15047e + ", verticalThumbTime=" + this.f15048f + ", isHorizontalProgressTouchable=" + this.f15049g + ", horizontalProgress=" + this.f15050h + ", horizontalThumbTime=" + this.f15051i + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C8217m(com.zykj.view.board.board.AbstractC8222r r4, com.zykj.view.board.board.AbstractC8211g r5, boolean r6, boolean r7, float r8, float r9, boolean r10, float r11, float r12, int r13, kotlin.jvm.internal.AbstractC9126n r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            com.zykj.view.board.board.r$d r4 = com.zykj.view.board.board.AbstractC8222r.d.f15086e
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            com.zykj.view.board.board.g$b r5 = com.zykj.view.board.board.AbstractC8211g.b.f15027c
        Lc:
            r14 = r13 & 4
            if (r14 == 0) goto L11
            r6 = 0
        L11:
            r14 = r13 & 8
            r0 = 1
            if (r14 == 0) goto L17
            r7 = r0
        L17:
            r14 = r13 & 16
            r1 = 0
            if (r14 == 0) goto L1d
            r8 = r1
        L1d:
            r14 = r13 & 32
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L24
            r9 = r2
        L24:
            r14 = r13 & 64
            if (r14 == 0) goto L29
            r10 = r0
        L29:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L2e
            r11 = r1
        L2e:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L3d
            r14 = r2
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r3
            goto L47
        L3d:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
        L47:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.C8217m.<init>(com.zykj.view.board.board.r, com.zykj.view.board.board.g, boolean, boolean, float, float, boolean, float, float, int, kotlin.jvm.internal.n):void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/view/board/board/m.smali:71
    }
}

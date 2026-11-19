package com.zykj.view.board.board;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.j */
/* loaded from: classes5.dex */
public final class C7223j {

    /* renamed from: a */
    public final AbstractC7228o f11035a;

    /* renamed from: b */
    public final AbstractC7217d f11036b;

    /* renamed from: c */
    public final boolean f11037c;

    /* renamed from: d */
    public final boolean f11038d;

    /* renamed from: e */
    public final float f11039e;

    /* renamed from: f */
    public final float f11040f;

    /* renamed from: g */
    public final boolean f11041g;

    /* renamed from: h */
    public final float f11042h;

    /* renamed from: i */
    public final float f11043i;

    public C7223j(AbstractC7228o minorToolType, AbstractC7217d confirmButtonType, boolean z9, boolean z10, float f10, float f11, boolean z11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(confirmButtonType, "confirmButtonType");
        this.f11035a = minorToolType;
        this.f11036b = confirmButtonType;
        this.f11037c = z9;
        this.f11038d = z10;
        this.f11039e = f10;
        this.f11040f = f11;
        this.f11041g = z11;
        this.f11042h = f12;
        this.f11043i = f13;
    }

    /* renamed from: b */
    public static /* synthetic */ C7223j m10982b(C7223j c7223j, AbstractC7228o abstractC7228o, AbstractC7217d abstractC7217d, boolean z9, boolean z10, float f10, float f11, boolean z11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC7228o = c7223j.f11035a;
        }
        if ((i10 & 2) != 0) {
            abstractC7217d = c7223j.f11036b;
        }
        if ((i10 & 4) != 0) {
            z9 = c7223j.f11037c;
        }
        if ((i10 & 8) != 0) {
            z10 = c7223j.f11038d;
        }
        if ((i10 & 16) != 0) {
            f10 = c7223j.f11039e;
        }
        if ((i10 & 32) != 0) {
            f11 = c7223j.f11040f;
        }
        if ((i10 & 64) != 0) {
            z11 = c7223j.f11041g;
        }
        if ((i10 & 128) != 0) {
            f12 = c7223j.f11042h;
        }
        if ((i10 & 256) != 0) {
            f13 = c7223j.f11043i;
        }
        float f14 = f12;
        float f15 = f13;
        float f16 = f11;
        boolean z12 = z11;
        float f17 = f10;
        boolean z13 = z9;
        return c7223j.m10983a(abstractC7228o, abstractC7217d, z13, z10, f17, f16, z12, f14, f15);
    }

    /* renamed from: a */
    public final C7223j m10983a(AbstractC7228o minorToolType, AbstractC7217d confirmButtonType, boolean z9, boolean z10, float f10, float f11, boolean z11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(confirmButtonType, "confirmButtonType");
        return new C7223j(minorToolType, confirmButtonType, z9, z10, f10, f11, z11, f12, f13);
    }

    /* renamed from: c */
    public final AbstractC7217d m10984c() {
        return this.f11036b;
    }

    /* renamed from: d */
    public final float m10985d() {
        return this.f11042h;
    }

    /* renamed from: e */
    public final float m10986e() {
        return this.f11043i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7223j)) {
            return false;
        }
        C7223j c7223j = (C7223j) obj;
        return Intrinsics.areEqual(this.f11035a, c7223j.f11035a) && Intrinsics.areEqual(this.f11036b, c7223j.f11036b) && this.f11037c == c7223j.f11037c && this.f11038d == c7223j.f11038d && Float.compare(this.f11039e, c7223j.f11039e) == 0 && Float.compare(this.f11040f, c7223j.f11040f) == 0 && this.f11041g == c7223j.f11041g && Float.compare(this.f11042h, c7223j.f11042h) == 0 && Float.compare(this.f11043i, c7223j.f11043i) == 0;
    }

    /* renamed from: f */
    public final AbstractC7228o m10987f() {
        return this.f11035a;
    }

    /* renamed from: g */
    public final float m10988g() {
        return this.f11039e;
    }

    /* renamed from: h */
    public final float m10989h() {
        return this.f11040f;
    }

    public int hashCode() {
        return (((((((((((((((this.f11035a.hashCode() * 31) + this.f11036b.hashCode()) * 31) + Boolean.hashCode(this.f11037c)) * 31) + Boolean.hashCode(this.f11038d)) * 31) + Float.hashCode(this.f11039e)) * 31) + Float.hashCode(this.f11040f)) * 31) + Boolean.hashCode(this.f11041g)) * 31) + Float.hashCode(this.f11042h)) * 31) + Float.hashCode(this.f11043i);
    }

    /* renamed from: i */
    public final boolean m10990i() {
        return this.f11037c;
    }

    /* renamed from: j */
    public final boolean m10991j() {
        return this.f11041g;
    }

    /* renamed from: k */
    public final boolean m10992k() {
        return this.f11038d;
    }

    public String toString() {
        return "ExtraUIState(minorToolType=" + this.f11035a + ", confirmButtonType=" + this.f11036b + ", isDeleteDraftVisible=" + this.f11037c + ", isVerticalProgressTouchable=" + this.f11038d + ", verticalProgress=" + this.f11039e + ", verticalThumbTime=" + this.f11040f + ", isHorizontalProgressTouchable=" + this.f11041g + ", horizontalProgress=" + this.f11042h + ", horizontalThumbTime=" + this.f11043i + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C7223j(com.zykj.view.board.board.AbstractC7228o r4, com.zykj.view.board.board.AbstractC7217d r5, boolean r6, boolean r7, float r8, float r9, boolean r10, float r11, float r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            com.zykj.view.board.board.o$d r4 = com.zykj.view.board.board.AbstractC7228o.d.f11079f
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            com.zykj.view.board.board.d$a r5 = com.zykj.view.board.board.AbstractC7217d.a.f11018c
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.C7223j.<init>(com.zykj.view.board.board.o, com.zykj.view.board.board.d, boolean, boolean, float, float, boolean, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void"); // DEX body: android/新测评/smali_classes5/com/zykj/view/board/board/j.smali:71
    }
}

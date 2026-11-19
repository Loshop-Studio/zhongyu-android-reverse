package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.m */
/* loaded from: classes6.dex */
public final class C8851m {

    /* renamed from: a */
    public final AbstractC8856r f20259a;

    /* renamed from: b */
    public final AbstractC8845g f20260b;

    /* renamed from: c */
    public final boolean f20261c;

    /* renamed from: d */
    public final boolean f20262d;

    /* renamed from: e */
    public final float f20263e;

    /* renamed from: f */
    public final float f20264f;

    /* renamed from: g */
    public final boolean f20265g;

    /* renamed from: h */
    public final float f20266h;

    /* renamed from: i */
    public final float f20267i;

    public C8851m(AbstractC8856r minorToolType, AbstractC8845g confirmButtonType, boolean z10, boolean z11, float f10, float f11, boolean z12, float f12, float f13) {
        AbstractC9979u.m20294g(minorToolType, "minorToolType");
        AbstractC9979u.m20294g(confirmButtonType, "confirmButtonType");
        this.f20259a = minorToolType;
        this.f20260b = confirmButtonType;
        this.f20261c = z10;
        this.f20262d = z11;
        this.f20263e = f10;
        this.f20264f = f11;
        this.f20265g = z12;
        this.f20266h = f12;
        this.f20267i = f13;
    }

    /* renamed from: b */
    public static /* synthetic */ C8851m m16977b(C8851m c8851m, AbstractC8856r abstractC8856r, AbstractC8845g abstractC8845g, boolean z10, boolean z11, float f10, float f11, boolean z12, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC8856r = c8851m.f20259a;
        }
        if ((i10 & 2) != 0) {
            abstractC8845g = c8851m.f20260b;
        }
        if ((i10 & 4) != 0) {
            z10 = c8851m.f20261c;
        }
        if ((i10 & 8) != 0) {
            z11 = c8851m.f20262d;
        }
        if ((i10 & 16) != 0) {
            f10 = c8851m.f20263e;
        }
        if ((i10 & 32) != 0) {
            f11 = c8851m.f20264f;
        }
        if ((i10 & 64) != 0) {
            z12 = c8851m.f20265g;
        }
        if ((i10 & 128) != 0) {
            f12 = c8851m.f20266h;
        }
        if ((i10 & 256) != 0) {
            f13 = c8851m.f20267i;
        }
        float f14 = f12;
        float f15 = f13;
        float f16 = f11;
        boolean z13 = z12;
        float f17 = f10;
        boolean z14 = z10;
        return c8851m.m16978a(abstractC8856r, abstractC8845g, z14, z11, f17, f16, z13, f14, f15);
    }

    /* renamed from: a */
    public final C8851m m16978a(AbstractC8856r minorToolType, AbstractC8845g confirmButtonType, boolean z10, boolean z11, float f10, float f11, boolean z12, float f12, float f13) {
        AbstractC9979u.m20294g(minorToolType, "minorToolType");
        AbstractC9979u.m20294g(confirmButtonType, "confirmButtonType");
        return new C8851m(minorToolType, confirmButtonType, z10, z11, f10, f11, z12, f12, f13);
    }

    /* renamed from: c */
    public final AbstractC8845g m16979c() {
        return this.f20260b;
    }

    /* renamed from: d */
    public final float m16980d() {
        return this.f20266h;
    }

    /* renamed from: e */
    public final float m16981e() {
        return this.f20267i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8851m)) {
            return false;
        }
        C8851m c8851m = (C8851m) obj;
        return AbstractC9979u.m20289b(this.f20259a, c8851m.f20259a) && AbstractC9979u.m20289b(this.f20260b, c8851m.f20260b) && this.f20261c == c8851m.f20261c && this.f20262d == c8851m.f20262d && Float.compare(this.f20263e, c8851m.f20263e) == 0 && Float.compare(this.f20264f, c8851m.f20264f) == 0 && this.f20265g == c8851m.f20265g && Float.compare(this.f20266h, c8851m.f20266h) == 0 && Float.compare(this.f20267i, c8851m.f20267i) == 0;
    }

    /* renamed from: f */
    public final AbstractC8856r m16982f() {
        return this.f20259a;
    }

    /* renamed from: g */
    public final float m16983g() {
        return this.f20263e;
    }

    /* renamed from: h */
    public final float m16984h() {
        return this.f20264f;
    }

    public int hashCode() {
        return (((((((((((((((this.f20259a.hashCode() * 31) + this.f20260b.hashCode()) * 31) + Boolean.hashCode(this.f20261c)) * 31) + Boolean.hashCode(this.f20262d)) * 31) + Float.hashCode(this.f20263e)) * 31) + Float.hashCode(this.f20264f)) * 31) + Boolean.hashCode(this.f20265g)) * 31) + Float.hashCode(this.f20266h)) * 31) + Float.hashCode(this.f20267i);
    }

    /* renamed from: i */
    public final boolean m16985i() {
        return this.f20261c;
    }

    /* renamed from: j */
    public final boolean m16986j() {
        return this.f20265g;
    }

    /* renamed from: k */
    public final boolean m16987k() {
        return this.f20262d;
    }

    public String toString() {
        return "ExtraUIState(minorToolType=" + this.f20259a + ", confirmButtonType=" + this.f20260b + ", isDeleteDraftVisible=" + this.f20261c + ", isVerticalProgressTouchable=" + this.f20262d + ", verticalProgress=" + this.f20263e + ", verticalThumbTime=" + this.f20264f + ", isHorizontalProgressTouchable=" + this.f20265g + ", horizontalProgress=" + this.f20266h + ", horizontalThumbTime=" + this.f20267i + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C8851m(com.zykj.view.board.board.AbstractC8856r r4, com.zykj.view.board.board.AbstractC8845g r5, boolean r6, boolean r7, float r8, float r9, boolean r10, float r11, float r12, int r13, kotlin.jvm.internal.AbstractC9972n r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            com.zykj.view.board.board.r$d r4 = com.zykj.view.board.board.AbstractC8856r.d.f20302e
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            com.zykj.view.board.board.g$a r5 = com.zykj.view.board.board.AbstractC8845g.a.f20243c
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.C8851m.<init>(com.zykj.view.board.board.r, com.zykj.view.board.board.g, boolean, boolean, float, float, boolean, float, float, int, kotlin.jvm.internal.n):void"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/view/board/board/m.smali:71
    }
}

package com.zykj.view.board.board;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.o */
/* loaded from: classes5.dex */
public final class C7672o {

    /* renamed from: a */
    public final AbstractC7677t f12254a;

    /* renamed from: b */
    public final AbstractC7666i f12255b;

    /* renamed from: c */
    public final boolean f12256c;

    /* renamed from: d */
    public final boolean f12257d;

    /* renamed from: e */
    public final float f12258e;

    /* renamed from: f */
    public final float f12259f;

    /* renamed from: g */
    public final boolean f12260g;

    /* renamed from: h */
    public final float f12261h;

    /* renamed from: i */
    public final float f12262i;

    public C7672o(AbstractC7677t minorToolType, AbstractC7666i confirmButtonType, boolean z9, boolean z10, float f10, float f11, boolean z11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(confirmButtonType, "confirmButtonType");
        this.f12254a = minorToolType;
        this.f12255b = confirmButtonType;
        this.f12256c = z9;
        this.f12257d = z10;
        this.f12258e = f10;
        this.f12259f = f11;
        this.f12260g = z11;
        this.f12261h = f12;
        this.f12262i = f13;
    }

    /* renamed from: b */
    public static /* synthetic */ C7672o m11412b(C7672o c7672o, AbstractC7677t abstractC7677t, AbstractC7666i abstractC7666i, boolean z9, boolean z10, float f10, float f11, boolean z11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            abstractC7677t = c7672o.f12254a;
        }
        if ((i9 & 2) != 0) {
            abstractC7666i = c7672o.f12255b;
        }
        if ((i9 & 4) != 0) {
            z9 = c7672o.f12256c;
        }
        if ((i9 & 8) != 0) {
            z10 = c7672o.f12257d;
        }
        if ((i9 & 16) != 0) {
            f10 = c7672o.f12258e;
        }
        if ((i9 & 32) != 0) {
            f11 = c7672o.f12259f;
        }
        if ((i9 & 64) != 0) {
            z11 = c7672o.f12260g;
        }
        if ((i9 & 128) != 0) {
            f12 = c7672o.f12261h;
        }
        if ((i9 & 256) != 0) {
            f13 = c7672o.f12262i;
        }
        float f14 = f12;
        float f15 = f13;
        float f16 = f11;
        boolean z12 = z11;
        float f17 = f10;
        boolean z13 = z9;
        return c7672o.m11413a(abstractC7677t, abstractC7666i, z13, z10, f17, f16, z12, f14, f15);
    }

    /* renamed from: a */
    public final C7672o m11413a(AbstractC7677t minorToolType, AbstractC7666i confirmButtonType, boolean z9, boolean z10, float f10, float f11, boolean z11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(minorToolType, "minorToolType");
        Intrinsics.checkNotNullParameter(confirmButtonType, "confirmButtonType");
        return new C7672o(minorToolType, confirmButtonType, z9, z10, f10, f11, z11, f12, f13);
    }

    /* renamed from: c */
    public final AbstractC7666i m11414c() {
        return this.f12255b;
    }

    /* renamed from: d */
    public final float m11415d() {
        return this.f12261h;
    }

    /* renamed from: e */
    public final float m11416e() {
        return this.f12262i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7672o)) {
            return false;
        }
        C7672o c7672o = (C7672o) obj;
        return Intrinsics.areEqual(this.f12254a, c7672o.f12254a) && Intrinsics.areEqual(this.f12255b, c7672o.f12255b) && this.f12256c == c7672o.f12256c && this.f12257d == c7672o.f12257d && Float.compare(this.f12258e, c7672o.f12258e) == 0 && Float.compare(this.f12259f, c7672o.f12259f) == 0 && this.f12260g == c7672o.f12260g && Float.compare(this.f12261h, c7672o.f12261h) == 0 && Float.compare(this.f12262i, c7672o.f12262i) == 0;
    }

    /* renamed from: f */
    public final AbstractC7677t m11417f() {
        return this.f12254a;
    }

    /* renamed from: g */
    public final float m11418g() {
        return this.f12258e;
    }

    /* renamed from: h */
    public final float m11419h() {
        return this.f12259f;
    }

    public int hashCode() {
        return (((((((((((((((this.f12254a.hashCode() * 31) + this.f12255b.hashCode()) * 31) + Boolean.hashCode(this.f12256c)) * 31) + Boolean.hashCode(this.f12257d)) * 31) + Float.hashCode(this.f12258e)) * 31) + Float.hashCode(this.f12259f)) * 31) + Boolean.hashCode(this.f12260g)) * 31) + Float.hashCode(this.f12261h)) * 31) + Float.hashCode(this.f12262i);
    }

    /* renamed from: i */
    public final boolean m11420i() {
        return this.f12256c;
    }

    /* renamed from: j */
    public final boolean m11421j() {
        return this.f12260g;
    }

    /* renamed from: k */
    public final boolean m11422k() {
        return this.f12257d;
    }

    public String toString() {
        return "ExtraUIState(minorToolType=" + this.f12254a + ", confirmButtonType=" + this.f12255b + ", isDeleteDraftVisible=" + this.f12256c + ", isVerticalProgressTouchable=" + this.f12257d + ", verticalProgress=" + this.f12258e + ", verticalThumbTime=" + this.f12259f + ", isHorizontalProgressTouchable=" + this.f12260g + ", horizontalProgress=" + this.f12261h + ", horizontalThumbTime=" + this.f12262i + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C7672o(com.zykj.view.board.board.AbstractC7677t r4, com.zykj.view.board.board.AbstractC7666i r5, boolean r6, boolean r7, float r8, float r9, boolean r10, float r11, float r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            com.zykj.view.board.board.t$d r4 = com.zykj.view.board.board.AbstractC7677t.d.f12298f
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            com.zykj.view.board.board.i$b r5 = com.zykj.view.board.board.AbstractC7666i.b.f12237c
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.C7672o.<init>(com.zykj.view.board.board.t, com.zykj.view.board.board.i, boolean, boolean, float, float, boolean, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void"); // DEX body: android/随身答/smali_classes5/com/zykj/view/board/board/o.smali:71
    }
}

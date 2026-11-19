package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7227n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.m */
/* loaded from: classes5.dex */
public final class C7226m {

    /* renamed from: a */
    public final boolean f11057a;

    /* renamed from: b */
    public final boolean f11058b;

    /* renamed from: c */
    public final boolean f11059c;

    /* renamed from: d */
    public final boolean f11060d;

    /* renamed from: e */
    public final boolean f11061e;

    /* renamed from: f */
    public final AbstractC7227n f11062f;

    public C7226m(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7227n mainToolType) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        this.f11057a = z9;
        this.f11058b = z10;
        this.f11059c = z11;
        this.f11060d = z12;
        this.f11061e = z13;
        this.f11062f = mainToolType;
    }

    /* renamed from: b */
    public static /* synthetic */ C7226m m11004b(C7226m c7226m, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7227n abstractC7227n, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c7226m.f11057a;
        }
        if ((i10 & 2) != 0) {
            z10 = c7226m.f11058b;
        }
        if ((i10 & 4) != 0) {
            z11 = c7226m.f11059c;
        }
        if ((i10 & 8) != 0) {
            z12 = c7226m.f11060d;
        }
        if ((i10 & 16) != 0) {
            z13 = c7226m.f11061e;
        }
        if ((i10 & 32) != 0) {
            abstractC7227n = c7226m.f11062f;
        }
        boolean z14 = z13;
        AbstractC7227n abstractC7227n2 = abstractC7227n;
        return c7226m.m11005a(z9, z10, z11, z12, z14, abstractC7227n2);
    }

    /* renamed from: a */
    public final C7226m m11005a(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7227n mainToolType) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        return new C7226m(z9, z10, z11, z12, z13, mainToolType);
    }

    /* renamed from: c */
    public final AbstractC7227n m11006c() {
        return this.f11062f;
    }

    /* renamed from: d */
    public final boolean m11007d() {
        return this.f11057a;
    }

    /* renamed from: e */
    public final boolean m11008e() {
        return this.f11058b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7226m)) {
            return false;
        }
        C7226m c7226m = (C7226m) obj;
        return this.f11057a == c7226m.f11057a && this.f11058b == c7226m.f11058b && this.f11059c == c7226m.f11059c && this.f11060d == c7226m.f11060d && this.f11061e == c7226m.f11061e && Intrinsics.areEqual(this.f11062f, c7226m.f11062f);
    }

    /* renamed from: f */
    public final boolean m11009f() {
        return this.f11060d;
    }

    /* renamed from: g */
    public final boolean m11010g() {
        return this.f11061e;
    }

    /* renamed from: h */
    public final boolean m11011h() {
        return this.f11059c;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f11057a) * 31) + Boolean.hashCode(this.f11058b)) * 31) + Boolean.hashCode(this.f11059c)) * 31) + Boolean.hashCode(this.f11060d)) * 31) + Boolean.hashCode(this.f11061e)) * 31) + this.f11062f.hashCode();
    }

    public String toString() {
        return "MainToolState(revokeVisible=" + this.f11057a + ", zoomVisible=" + this.f11058b + ", isWithdrawEnable=" + this.f11059c + ", isRecoverEnable=" + this.f11060d + ", isTouchable=" + this.f11061e + ", mainToolType=" + this.f11062f + ")";
    }

    public /* synthetic */ C7226m(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7227n abstractC7227n, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? AbstractC7227n.d.f11070e : abstractC7227n);
    }
}

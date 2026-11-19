package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7676s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.r */
/* loaded from: classes5.dex */
public final class C7675r {

    /* renamed from: a */
    public final boolean f12276a;

    /* renamed from: b */
    public final boolean f12277b;

    /* renamed from: c */
    public final boolean f12278c;

    /* renamed from: d */
    public final boolean f12279d;

    /* renamed from: e */
    public final boolean f12280e;

    /* renamed from: f */
    public final AbstractC7676s f12281f;

    public C7675r(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7676s mainToolType) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        this.f12276a = z9;
        this.f12277b = z10;
        this.f12278c = z11;
        this.f12279d = z12;
        this.f12280e = z13;
        this.f12281f = mainToolType;
    }

    /* renamed from: b */
    public static /* synthetic */ C7675r m11434b(C7675r c7675r, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7676s abstractC7676s, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = c7675r.f12276a;
        }
        if ((i9 & 2) != 0) {
            z10 = c7675r.f12277b;
        }
        if ((i9 & 4) != 0) {
            z11 = c7675r.f12278c;
        }
        if ((i9 & 8) != 0) {
            z12 = c7675r.f12279d;
        }
        if ((i9 & 16) != 0) {
            z13 = c7675r.f12280e;
        }
        if ((i9 & 32) != 0) {
            abstractC7676s = c7675r.f12281f;
        }
        boolean z14 = z13;
        AbstractC7676s abstractC7676s2 = abstractC7676s;
        return c7675r.m11435a(z9, z10, z11, z12, z14, abstractC7676s2);
    }

    /* renamed from: a */
    public final C7675r m11435a(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7676s mainToolType) {
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        return new C7675r(z9, z10, z11, z12, z13, mainToolType);
    }

    /* renamed from: c */
    public final AbstractC7676s m11436c() {
        return this.f12281f;
    }

    /* renamed from: d */
    public final boolean m11437d() {
        return this.f12276a;
    }

    /* renamed from: e */
    public final boolean m11438e() {
        return this.f12277b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7675r)) {
            return false;
        }
        C7675r c7675r = (C7675r) obj;
        return this.f12276a == c7675r.f12276a && this.f12277b == c7675r.f12277b && this.f12278c == c7675r.f12278c && this.f12279d == c7675r.f12279d && this.f12280e == c7675r.f12280e && Intrinsics.areEqual(this.f12281f, c7675r.f12281f);
    }

    /* renamed from: f */
    public final boolean m11439f() {
        return this.f12279d;
    }

    /* renamed from: g */
    public final boolean m11440g() {
        return this.f12280e;
    }

    /* renamed from: h */
    public final boolean m11441h() {
        return this.f12278c;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f12276a) * 31) + Boolean.hashCode(this.f12277b)) * 31) + Boolean.hashCode(this.f12278c)) * 31) + Boolean.hashCode(this.f12279d)) * 31) + Boolean.hashCode(this.f12280e)) * 31) + this.f12281f.hashCode();
    }

    public String toString() {
        return "MainToolState(revokeVisible=" + this.f12276a + ", zoomVisible=" + this.f12277b + ", isWithdrawEnable=" + this.f12278c + ", isRecoverEnable=" + this.f12279d + ", isTouchable=" + this.f12280e + ", mainToolType=" + this.f12281f + ")";
    }

    public /* synthetic */ C7675r(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC7676s abstractC7676s, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? false : z12, (i9 & 16) != 0 ? false : z13, (i9 & 32) != 0 ? AbstractC7676s.d.f12289e : abstractC7676s);
    }
}

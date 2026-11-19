package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7678u;
import com.zykj.view.board.board.AbstractC7680w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.v */
/* loaded from: classes5.dex */
public final class C7679v {

    /* renamed from: a */
    public final boolean f12306a;

    /* renamed from: b */
    public final boolean f12307b;

    /* renamed from: c */
    public final AbstractC7680w f12308c;

    /* renamed from: d */
    public final int f12309d;

    /* renamed from: e */
    public final AbstractC7678u f12310e;

    /* renamed from: f */
    public final int f12311f;

    /* renamed from: g */
    public final boolean f12312g;

    public C7679v(boolean z9, boolean z10, AbstractC7680w penType, int i9, AbstractC7678u penColor, int i10, boolean z11) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        this.f12306a = z9;
        this.f12307b = z10;
        this.f12308c = penType;
        this.f12309d = i9;
        this.f12310e = penColor;
        this.f12311f = i10;
        this.f12312g = z11;
    }

    /* renamed from: b */
    public static /* synthetic */ C7679v m11453b(C7679v c7679v, boolean z9, boolean z10, AbstractC7680w abstractC7680w, int i9, AbstractC7678u abstractC7678u, int i10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z9 = c7679v.f12306a;
        }
        if ((i11 & 2) != 0) {
            z10 = c7679v.f12307b;
        }
        if ((i11 & 4) != 0) {
            abstractC7680w = c7679v.f12308c;
        }
        if ((i11 & 8) != 0) {
            i9 = c7679v.f12309d;
        }
        if ((i11 & 16) != 0) {
            abstractC7678u = c7679v.f12310e;
        }
        if ((i11 & 32) != 0) {
            i10 = c7679v.f12311f;
        }
        if ((i11 & 64) != 0) {
            z11 = c7679v.f12312g;
        }
        int i12 = i10;
        boolean z12 = z11;
        AbstractC7678u abstractC7678u2 = abstractC7678u;
        AbstractC7680w abstractC7680w2 = abstractC7680w;
        return c7679v.m11454a(z9, z10, abstractC7680w2, i9, abstractC7678u2, i12, z12);
    }

    /* renamed from: a */
    public final C7679v m11454a(boolean z9, boolean z10, AbstractC7680w penType, int i9, AbstractC7678u penColor, int i10, boolean z11) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        Intrinsics.checkNotNullParameter(penColor, "penColor");
        return new C7679v(z9, z10, penType, i9, penColor, i10, z11);
    }

    /* renamed from: c */
    public final boolean m11455c() {
        return this.f12306a;
    }

    /* renamed from: d */
    public final boolean m11456d() {
        return this.f12307b;
    }

    /* renamed from: e */
    public final AbstractC7678u m11457e() {
        return this.f12310e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7679v)) {
            return false;
        }
        C7679v c7679v = (C7679v) obj;
        return this.f12306a == c7679v.f12306a && this.f12307b == c7679v.f12307b && Intrinsics.areEqual(this.f12308c, c7679v.f12308c) && this.f12309d == c7679v.f12309d && Intrinsics.areEqual(this.f12310e, c7679v.f12310e) && this.f12311f == c7679v.f12311f && this.f12312g == c7679v.f12312g;
    }

    /* renamed from: f */
    public final int m11458f() {
        return this.f12311f;
    }

    /* renamed from: g */
    public final int m11459g() {
        return this.f12309d;
    }

    /* renamed from: h */
    public final AbstractC7680w m11460h() {
        return this.f12308c;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f12306a) * 31) + Boolean.hashCode(this.f12307b)) * 31) + this.f12308c.hashCode()) * 31) + Integer.hashCode(this.f12309d)) * 31) + this.f12310e.hashCode()) * 31) + Integer.hashCode(this.f12311f)) * 31) + Boolean.hashCode(this.f12312g);
    }

    /* renamed from: i */
    public final boolean m11461i() {
        return this.f12312g;
    }

    public String toString() {
        return "PenToolState(dotVisible=" + this.f12306a + ", highlighterVisible=" + this.f12307b + ", penType=" + this.f12308c + ", penSizeLevel=" + this.f12309d + ", penColor=" + this.f12310e + ", penCustomColor=" + this.f12311f + ", isShowCustomColor=" + this.f12312g + ")";
    }

    public /* synthetic */ C7679v(boolean z9, boolean z10, AbstractC7680w abstractC7680w, int i9, AbstractC7678u abstractC7678u, int i10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z9, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? AbstractC7680w.b.f12319f : abstractC7680w, (i11 & 8) != 0 ? 0 : i9, (i11 & 16) != 0 ? AbstractC7678u.a.f12303c : abstractC7678u, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? false : z11);
    }
}

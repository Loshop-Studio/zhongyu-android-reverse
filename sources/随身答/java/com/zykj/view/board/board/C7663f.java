package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7666i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.f */
/* loaded from: classes5.dex */
public final class C7663f {

    /* renamed from: a */
    public final boolean f12220a;

    /* renamed from: b */
    public final boolean f12221b;

    /* renamed from: c */
    public final boolean f12222c;

    /* renamed from: d */
    public final boolean f12223d;

    /* renamed from: e */
    public final boolean f12224e;

    /* renamed from: f */
    public final boolean f12225f;

    /* renamed from: g */
    public final boolean f12226g;

    /* renamed from: h */
    public final boolean f12227h;

    /* renamed from: i */
    public final boolean f12228i;

    /* renamed from: j */
    public final AbstractC7666i f12229j;

    public C7663f(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, AbstractC7666i confirmButtonType) {
        Intrinsics.checkNotNullParameter(confirmButtonType, "confirmButtonType");
        this.f12220a = z9;
        this.f12221b = z10;
        this.f12222c = z11;
        this.f12223d = z12;
        this.f12224e = z13;
        this.f12225f = z14;
        this.f12226g = z15;
        this.f12227h = z16;
        this.f12228i = z17;
        this.f12229j = confirmButtonType;
    }

    /* renamed from: a */
    public final AbstractC7666i m11387a() {
        return this.f12229j;
    }

    /* renamed from: b */
    public final boolean m11388b() {
        return this.f12228i;
    }

    /* renamed from: c */
    public final boolean m11389c() {
        return this.f12225f;
    }

    /* renamed from: d */
    public final boolean m11390d() {
        return this.f12222c;
    }

    /* renamed from: e */
    public final boolean m11391e() {
        return this.f12224e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7663f)) {
            return false;
        }
        C7663f c7663f = (C7663f) obj;
        return this.f12220a == c7663f.f12220a && this.f12221b == c7663f.f12221b && this.f12222c == c7663f.f12222c && this.f12223d == c7663f.f12223d && this.f12224e == c7663f.f12224e && this.f12225f == c7663f.f12225f && this.f12226g == c7663f.f12226g && this.f12227h == c7663f.f12227h && this.f12228i == c7663f.f12228i && Intrinsics.areEqual(this.f12229j, c7663f.f12229j);
    }

    /* renamed from: f */
    public final boolean m11392f() {
        return this.f12227h;
    }

    /* renamed from: g */
    public final boolean m11393g() {
        return this.f12223d;
    }

    /* renamed from: h */
    public final boolean m11394h() {
        return this.f12220a;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.f12220a) * 31) + Boolean.hashCode(this.f12221b)) * 31) + Boolean.hashCode(this.f12222c)) * 31) + Boolean.hashCode(this.f12223d)) * 31) + Boolean.hashCode(this.f12224e)) * 31) + Boolean.hashCode(this.f12225f)) * 31) + Boolean.hashCode(this.f12226g)) * 31) + Boolean.hashCode(this.f12227h)) * 31) + Boolean.hashCode(this.f12228i)) * 31) + this.f12229j.hashCode();
    }

    /* renamed from: i */
    public final boolean m11395i() {
        return this.f12226g;
    }

    /* renamed from: j */
    public final boolean m11396j() {
        return this.f12221b;
    }

    public String toString() {
        return "BoardViewConfig(needRevoke=" + this.f12220a + ", needZoom=" + this.f12221b + ", needDot=" + this.f12222c + ", needPenHighlighter=" + this.f12223d + ", needGallery=" + this.f12224e + ", needCamera=" + this.f12225f + ", needText=" + this.f12226g + ", needGraph=" + this.f12227h + ", needBackgroundLine=" + this.f12228i + ", confirmButtonType=" + this.f12229j + ")";
    }

    public /* synthetic */ C7663f(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, AbstractC7666i abstractC7666i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? false : z12, (i9 & 16) != 0 ? false : z13, (i9 & 32) != 0 ? false : z14, (i9 & 64) != 0 ? false : z15, (i9 & 128) != 0 ? false : z16, (i9 & 256) != 0 ? false : z17, (i9 & 512) != 0 ? AbstractC7666i.b.f12237c : abstractC7666i);
    }
}

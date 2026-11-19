package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.d */
/* loaded from: classes6.dex */
public final class C8842d {

    /* renamed from: a */
    public final boolean f20227a;

    /* renamed from: b */
    public final boolean f20228b;

    /* renamed from: c */
    public final boolean f20229c;

    /* renamed from: d */
    public final boolean f20230d;

    /* renamed from: e */
    public final boolean f20231e;

    /* renamed from: f */
    public final boolean f20232f;

    /* renamed from: g */
    public final boolean f20233g;

    /* renamed from: h */
    public final boolean f20234h;

    /* renamed from: i */
    public final boolean f20235i;

    /* renamed from: j */
    public final AbstractC8845g f20236j;

    public C8842d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, AbstractC8845g confirmButtonType) {
        AbstractC9979u.m20294g(confirmButtonType, "confirmButtonType");
        this.f20227a = z10;
        this.f20228b = z11;
        this.f20229c = z12;
        this.f20230d = z13;
        this.f20231e = z14;
        this.f20232f = z15;
        this.f20233g = z16;
        this.f20234h = z17;
        this.f20235i = z18;
        this.f20236j = confirmButtonType;
    }

    /* renamed from: a */
    public final AbstractC8845g m16953a() {
        return this.f20236j;
    }

    /* renamed from: b */
    public final boolean m16954b() {
        return this.f20235i;
    }

    /* renamed from: c */
    public final boolean m16955c() {
        return this.f20232f;
    }

    /* renamed from: d */
    public final boolean m16956d() {
        return this.f20229c;
    }

    /* renamed from: e */
    public final boolean m16957e() {
        return this.f20231e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8842d)) {
            return false;
        }
        C8842d c8842d = (C8842d) obj;
        return this.f20227a == c8842d.f20227a && this.f20228b == c8842d.f20228b && this.f20229c == c8842d.f20229c && this.f20230d == c8842d.f20230d && this.f20231e == c8842d.f20231e && this.f20232f == c8842d.f20232f && this.f20233g == c8842d.f20233g && this.f20234h == c8842d.f20234h && this.f20235i == c8842d.f20235i && AbstractC9979u.m20289b(this.f20236j, c8842d.f20236j);
    }

    /* renamed from: f */
    public final boolean m16958f() {
        return this.f20234h;
    }

    /* renamed from: g */
    public final boolean m16959g() {
        return this.f20230d;
    }

    /* renamed from: h */
    public final boolean m16960h() {
        return this.f20227a;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.f20227a) * 31) + Boolean.hashCode(this.f20228b)) * 31) + Boolean.hashCode(this.f20229c)) * 31) + Boolean.hashCode(this.f20230d)) * 31) + Boolean.hashCode(this.f20231e)) * 31) + Boolean.hashCode(this.f20232f)) * 31) + Boolean.hashCode(this.f20233g)) * 31) + Boolean.hashCode(this.f20234h)) * 31) + Boolean.hashCode(this.f20235i)) * 31) + this.f20236j.hashCode();
    }

    /* renamed from: i */
    public final boolean m16961i() {
        return this.f20233g;
    }

    /* renamed from: j */
    public final boolean m16962j() {
        return this.f20228b;
    }

    public String toString() {
        return "BoardViewConfig(needRevoke=" + this.f20227a + ", needZoom=" + this.f20228b + ", needDot=" + this.f20229c + ", needPenHighlighter=" + this.f20230d + ", needGallery=" + this.f20231e + ", needCamera=" + this.f20232f + ", needText=" + this.f20233g + ", needGraph=" + this.f20234h + ", needBackgroundLine=" + this.f20235i + ", confirmButtonType=" + this.f20236j + ")";
    }
}

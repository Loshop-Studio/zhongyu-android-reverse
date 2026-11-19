package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8211g;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.d */
/* loaded from: classes5.dex */
public final class C8208d {

    /* renamed from: a */
    public final boolean f15010a;

    /* renamed from: b */
    public final boolean f15011b;

    /* renamed from: c */
    public final boolean f15012c;

    /* renamed from: d */
    public final boolean f15013d;

    /* renamed from: e */
    public final boolean f15014e;

    /* renamed from: f */
    public final boolean f15015f;

    /* renamed from: g */
    public final boolean f15016g;

    /* renamed from: h */
    public final boolean f15017h;

    /* renamed from: i */
    public final boolean f15018i;

    /* renamed from: j */
    public final AbstractC8211g f15019j;

    public C8208d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, AbstractC8211g confirmButtonType) {
        AbstractC9133u.m16133g(confirmButtonType, "confirmButtonType");
        this.f15010a = z10;
        this.f15011b = z11;
        this.f15012c = z12;
        this.f15013d = z13;
        this.f15014e = z14;
        this.f15015f = z15;
        this.f15016g = z16;
        this.f15017h = z17;
        this.f15018i = z18;
        this.f15019j = confirmButtonType;
    }

    /* renamed from: a */
    public final AbstractC8211g m12837a() {
        return this.f15019j;
    }

    /* renamed from: b */
    public final boolean m12838b() {
        return this.f15018i;
    }

    /* renamed from: c */
    public final boolean m12839c() {
        return this.f15015f;
    }

    /* renamed from: d */
    public final boolean m12840d() {
        return this.f15012c;
    }

    /* renamed from: e */
    public final boolean m12841e() {
        return this.f15014e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8208d)) {
            return false;
        }
        C8208d c8208d = (C8208d) obj;
        return this.f15010a == c8208d.f15010a && this.f15011b == c8208d.f15011b && this.f15012c == c8208d.f15012c && this.f15013d == c8208d.f15013d && this.f15014e == c8208d.f15014e && this.f15015f == c8208d.f15015f && this.f15016g == c8208d.f15016g && this.f15017h == c8208d.f15017h && this.f15018i == c8208d.f15018i && AbstractC9133u.m16128b(this.f15019j, c8208d.f15019j);
    }

    /* renamed from: f */
    public final boolean m12842f() {
        return this.f15017h;
    }

    /* renamed from: g */
    public final boolean m12843g() {
        return this.f15013d;
    }

    /* renamed from: h */
    public final boolean m12844h() {
        return this.f15010a;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.f15010a) * 31) + Boolean.hashCode(this.f15011b)) * 31) + Boolean.hashCode(this.f15012c)) * 31) + Boolean.hashCode(this.f15013d)) * 31) + Boolean.hashCode(this.f15014e)) * 31) + Boolean.hashCode(this.f15015f)) * 31) + Boolean.hashCode(this.f15016g)) * 31) + Boolean.hashCode(this.f15017h)) * 31) + Boolean.hashCode(this.f15018i)) * 31) + this.f15019j.hashCode();
    }

    /* renamed from: i */
    public final boolean m12845i() {
        return this.f15016g;
    }

    /* renamed from: j */
    public final boolean m12846j() {
        return this.f15011b;
    }

    public String toString() {
        return "BoardViewConfig(needRevoke=" + this.f15010a + ", needZoom=" + this.f15011b + ", needDot=" + this.f15012c + ", needPenHighlighter=" + this.f15013d + ", needGallery=" + this.f15014e + ", needCamera=" + this.f15015f + ", needText=" + this.f15016g + ", needGraph=" + this.f15017h + ", needBackgroundLine=" + this.f15018i + ", confirmButtonType=" + this.f15019j + ")";
    }

    public /* synthetic */ C8208d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, AbstractC8211g abstractC8211g, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? false : z16, (i10 & 128) != 0 ? false : z17, (i10 & 256) != 0 ? false : z18, (i10 & 512) != 0 ? AbstractC8211g.b.f15027c : abstractC8211g);
    }
}

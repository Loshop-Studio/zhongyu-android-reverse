package com.xuexiang.xui.widget.banner.recycler.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p060o.p061b.AbstractC0397t;
import p000a.p060o.p061b.C0392o;

/* loaded from: classes.dex */
public class OverFlyingLayoutManager extends RecyclerView.AbstractC0538l implements RecyclerView.AbstractC0548v.b {

    /* renamed from: A */
    public float f5138A;

    /* renamed from: B */
    public int f5139B;

    /* renamed from: C */
    public int f5140C;

    /* renamed from: r */
    public int f5141r;

    /* renamed from: s */
    public int f5142s;

    /* renamed from: t */
    public int f5143t;

    /* renamed from: u */
    public int f5144u;

    /* renamed from: v */
    public float f5145v;

    /* renamed from: w */
    public AbstractC0397t f5146w;

    /* renamed from: x */
    public boolean f5147x;

    /* renamed from: y */
    public int f5148y;

    /* renamed from: z */
    public C0956a f5149z;

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$a */
    public static class C0956a implements Parcelable {
        public static final Parcelable.Creator<C0956a> CREATOR = new a();

        /* renamed from: b */
        public int f5150b;

        /* renamed from: c */
        public float f5151c;

        /* renamed from: d */
        public boolean f5152d;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$a$a */
        public static class a implements Parcelable.Creator<C0956a> {
            @Override // android.os.Parcelable.Creator
            public C0956a createFromParcel(Parcel parcel) {
                return new C0956a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0956a[] newArray(int i) {
                return new C0956a[i];
            }
        }

        public C0956a() {
        }

        public C0956a(Parcel parcel) {
            this.f5150b = parcel.readInt();
            this.f5151c = parcel.readFloat();
            this.f5152d = parcel.readInt() == 1;
        }

        public C0956a(C0956a c0956a) {
            this.f5150b = c0956a.f5150b;
            this.f5151c = c0956a.f5151c;
            this.f5152d = c0956a.f5152d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5150b);
            parcel.writeFloat(this.f5151c);
            parcel.writeInt(this.f5152d ? 1 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: B0 */
    public void mo1767B0(Parcelable parcelable) {
        if (parcelable instanceof C0956a) {
            this.f5149z = new C0956a((C0956a) parcelable);
            m1930L0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: C0 */
    public Parcelable mo1769C0() {
        C0956a c0956a = this.f5149z;
        if (c0956a != null) {
            return new C0956a(c0956a);
        }
        C0956a c0956a2 = new C0956a();
        c0956a2.f5150b = this.f5148y;
        c0956a2.f5151c = this.f5145v;
        c0956a2.f5152d = this.f5147x;
        return c0956a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: M0 */
    public int mo1733M0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return m2747i1(i, c0544r);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: N0 */
    public void mo1775N0(int i) {
        this.f5148y = i;
        this.f5145v = i * (this.f5147x ? -this.f5138A : this.f5138A);
        m1930L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: O0 */
    public int mo1736O0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: X0 */
    public void mo1778X0(RecyclerView recyclerView, RecyclerView.C0549w c0549w, int i) {
        C0392o c0392o = new C0392o(recyclerView.getContext());
        c0392o.f3391a = i;
        m1946Y0(c0392o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0548v.b
    /* renamed from: a */
    public PointF mo1779a(int i) {
        if (m1967y() == 0) {
            return null;
        }
        return new PointF((i < m1938R(m1966x(0))) == (this.f5147x ^ true) ? -1.0f : 1.0f, 0.0f);
    }

    /* renamed from: a1 */
    public int m2739a1(float f2) {
        return (int) f2;
    }

    /* renamed from: b1 */
    public int m2740b1(float f2) {
        return 0;
    }

    /* renamed from: c1 */
    public final int m2741c1() {
        if (m1967y() == 0) {
            return 0;
        }
        return !this.f5147x ? Math.abs(m2742d1()) : (m1925J() - Math.abs(m2742d1())) - 1;
    }

    /* renamed from: d1 */
    public final int m2742d1() {
        return Math.round(this.f5145v / this.f5138A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: e */
    public boolean mo1784e() {
        return true;
    }

    /* renamed from: e1 */
    public final float m2743e1() {
        if (this.f5147x) {
            return 0.0f;
        }
        return (m1925J() - 1) * this.f5138A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: f */
    public boolean mo1786f() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: f0 */
    public void mo1955f0(RecyclerView.AbstractC0530d abstractC0530d, RecyclerView.AbstractC0530d abstractC0530d2) {
        int iM1967y = m1967y();
        while (true) {
            iM1967y--;
            if (iM1967y < 0) {
                this.f5145v = 0.0f;
                return;
            }
            this.f3348a.m1335l(iM1967y);
        }
    }

    /* renamed from: f1 */
    public final float m2744f1() {
        if (this.f5147x) {
            return (-(m1925J() - 1)) * this.f5138A;
        }
        return 0.0f;
    }

    /* renamed from: g1 */
    public final void m2745g1(RecyclerView.C0544r c0544r) {
        int i;
        m1962q(c0544r);
        int iM2742d1 = (this.f5147x ? -m2742d1() : m2742d1()) + 0 + 1;
        int iM1925J = m1925J();
        if (iM2742d1 < 0) {
            iM2742d1 = 0;
        }
        int i2 = iM2742d1;
        if (iM2742d1 > iM1925J) {
            iM2742d1 = iM1925J;
        }
        float f2 = Float.MIN_VALUE;
        while (i2 < iM2742d1) {
            if (i2 >= iM1925J) {
                i = i2 % iM1925J;
            } else if (i2 < 0) {
                int i3 = (-i2) % iM1925J;
                if (i3 == 0) {
                    i3 = iM1925J;
                }
                i = iM1925J - i3;
            } else {
                i = i2;
            }
            View viewM1979e = c0544r.m1979e(i);
            m1952c0(viewM1979e, 0, 0);
            viewM1979e.setRotation(0.0f);
            viewM1979e.setRotationY(0.0f);
            viewM1979e.setRotationX(0.0f);
            viewM1979e.setScaleX(1.0f);
            viewM1979e.setScaleY(1.0f);
            viewM1979e.setAlpha(1.0f);
            m2746h1(viewM1979e, (i2 * (this.f5147x ? -this.f5138A : this.f5138A)) - this.f5145v);
            float f3 = i;
            if (f3 > f2) {
                m1951c(viewM1979e, -1, false);
            } else {
                m1951c(viewM1979e, 0, false);
            }
            i2++;
            f2 = f3;
        }
    }

    /* renamed from: h1 */
    public final void m2746h1(View view, float f2) {
        int iM2739a1 = m2739a1(f2);
        int iM2740b1 = m2740b1(f2);
        int i = this.f5143t + iM2739a1;
        int i2 = this.f5144u + iM2740b1;
        m1948a0(view, i, i2, i + this.f5141r, i2 + this.f5142s);
        float fAbs = ((Math.abs((this.f5143t + f2) - ((this.f5146w.mo1401l() - this.f5141r) / 2.0f)) * (-1.0f)) / (this.f5146w.mo1401l() / 2.0f)) + 1.0f;
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        view.setElevation(0.0f);
        view.setRotationY(((-0.0f) / this.f5138A) * f2);
    }

    /* renamed from: i1 */
    public final int m2747i1(int i, RecyclerView.C0544r c0544r) {
        if (m1967y() == 0 || i == 0) {
            return 0;
        }
        if (this.f5146w == null) {
            this.f5146w = AbstractC0397t.m1405a(this, 0);
        }
        float f2 = i;
        float f3 = f2 / 1.0f;
        if (Math.abs(f3) < 1.0E-8f) {
            return 0;
        }
        float f4 = this.f5145v + f3;
        if (f4 < m2744f1()) {
            i = (int) (f2 - ((f4 - m2744f1()) * 1.0f));
        } else if (f4 > m2743e1()) {
            i = (int) ((m2743e1() - this.f5145v) * 1.0f);
        }
        float f5 = i / 1.0f;
        this.f5145v += f5;
        for (int i2 = 0; i2 < m1967y(); i2++) {
            m2746h1(m1966x(i2), (r2.getLeft() - this.f5143t) - f5);
        }
        m2745g1(c0544r);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: j0 */
    public void mo1793j0(RecyclerView recyclerView, RecyclerView.C0544r c0544r) {
        m1958i0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: k */
    public int mo1795k(RecyclerView.C0549w c0549w) {
        return m1967y() == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l */
    public int mo1747l(RecyclerView.C0549w c0549w) {
        return m2741c1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: m */
    public int mo1748m(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        return m1925J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: n */
    public int mo1800n(RecyclerView.C0549w c0549w) {
        return m1967y() == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: o */
    public int mo1749o(RecyclerView.C0549w c0549w) {
        return m2741c1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: p */
    public int mo1751p(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        return m1925J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: u */
    public RecyclerView.C0539m mo1757u() {
        return new RecyclerView.C0539m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w0 */
    public void mo1761w0(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (c0549w.m1995b() == 0) {
            m1920G0(c0544r);
            this.f5145v = 0.0f;
            return;
        }
        if (this.f5146w == null) {
            this.f5146w = AbstractC0397t.m1405a(this, 0);
        }
        if (m1927K() == 1) {
            this.f5147x = !this.f5147x;
        }
        View viewM1979e = c0544r.m1979e(0);
        m1952c0(viewM1979e, 0, 0);
        this.f5141r = this.f5146w.mo1392c(viewM1979e);
        this.f5142s = this.f5146w.mo1393d(viewM1979e);
        this.f5143t = (this.f5146w.mo1401l() - this.f5141r) / 2;
        this.f5144u = (((this.f3364q - m1936Q()) - m1932N()) - this.f5142s) / 2;
        int i = this.f5141r;
        this.f5138A = i + 0;
        this.f5139B = ((int) Math.abs((((-i) - this.f5146w.mo1400k()) - this.f5143t) / this.f5138A)) + 1;
        this.f5140C = ((int) Math.abs((this.f5146w.mo1401l() - this.f5143t) / this.f5138A)) + 1;
        C0956a c0956a = this.f5149z;
        if (c0956a != null) {
            this.f5147x = c0956a.f5152d;
            this.f5148y = c0956a.f5150b;
            this.f5145v = c0956a.f5151c;
        }
        int i2 = this.f5148y;
        if (i2 != -1) {
            this.f5145v = i2 * (this.f5147x ? -this.f5138A : this.f5138A);
        }
        m1962q(c0544r);
        m2745g1(c0544r);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: x0 */
    public void mo1763x0(RecyclerView.C0549w c0549w) {
        this.f5149z = null;
        this.f5148y = -1;
    }
}

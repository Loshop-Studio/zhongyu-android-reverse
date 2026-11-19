package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p000a.p060o.p061b.AbstractC0397t;

/* loaded from: classes.dex */
public class BannerLayoutManager extends RecyclerView.AbstractC0538l {

    /* renamed from: A */
    public C0955a f5122A;

    /* renamed from: B */
    public float f5123B;

    /* renamed from: C */
    public int f5124C;

    /* renamed from: D */
    public int f5125D;

    /* renamed from: r */
    public int f5126r;

    /* renamed from: s */
    public int f5127s;

    /* renamed from: t */
    public int f5128t;

    /* renamed from: u */
    public int f5129u;

    /* renamed from: v */
    public float f5130v;

    /* renamed from: w */
    public AbstractC0397t f5131w;

    /* renamed from: x */
    public boolean f5132x;

    /* renamed from: y */
    public boolean f5133y;

    /* renamed from: z */
    public int f5134z;

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public static class C0955a implements Parcelable {
        public static final Parcelable.Creator<C0955a> CREATOR = new a();

        /* renamed from: b */
        public int f5135b;

        /* renamed from: c */
        public float f5136c;

        /* renamed from: d */
        public boolean f5137d;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a$a */
        public static class a implements Parcelable.Creator<C0955a> {
            @Override // android.os.Parcelable.Creator
            public C0955a createFromParcel(Parcel parcel) {
                return new C0955a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0955a[] newArray(int i) {
                return new C0955a[i];
            }
        }

        public C0955a() {
        }

        public C0955a(Parcel parcel) {
            this.f5135b = parcel.readInt();
            this.f5136c = parcel.readFloat();
            this.f5137d = parcel.readInt() == 1;
        }

        public C0955a(C0955a c0955a) {
            this.f5135b = c0955a.f5135b;
            this.f5136c = c0955a.f5136c;
            this.f5137d = c0955a.f5137d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5135b);
            parcel.writeFloat(this.f5136c);
            parcel.writeInt(this.f5137d ? 1 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: B0 */
    public void mo1767B0(Parcelable parcelable) {
        if (parcelable instanceof C0955a) {
            this.f5122A = new C0955a((C0955a) parcelable);
            m1930L0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: C0 */
    public Parcelable mo1769C0() {
        C0955a c0955a = this.f5122A;
        if (c0955a != null) {
            return new C0955a(c0955a);
        }
        C0955a c0955a2 = new C0955a();
        c0955a2.f5135b = this.f5134z;
        c0955a2.f5136c = this.f5130v;
        c0955a2.f5137d = this.f5133y;
        return c0955a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: M0 */
    public int mo1733M0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return m2738f1(i, c0544r);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: N0 */
    public void mo1775N0(int i) {
        if (i < 0 || i >= m1925J()) {
            return;
        }
        this.f5134z = i;
        this.f5130v = i * (this.f5133y ? -this.f5123B : this.f5123B);
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
        recyclerView.m1866k0((int) (((i * (!this.f5133y ? this.f5123B : -this.f5123B)) - this.f5130v) * Float.MAX_VALUE), 0, null);
    }

    /* renamed from: a1 */
    public final int m2733a1() {
        if (m1967y() == 0) {
            return 0;
        }
        return !this.f5133y ? m2734b1() : (m1925J() - m2734b1()) - 1;
    }

    /* renamed from: b1 */
    public int m2734b1() {
        if (m1925J() == 0) {
            return 0;
        }
        return Math.abs(m2735c1());
    }

    /* renamed from: c1 */
    public final int m2735c1() {
        return Math.round(this.f5130v / this.f5123B);
    }

    /* renamed from: d1 */
    public float m2736d1() {
        if (this.f5133y) {
            return 0.0f;
        }
        return (m1925J() - 1) * this.f5123B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: e */
    public boolean mo1784e() {
        return true;
    }

    /* renamed from: e1 */
    public float m2737e1() {
        if (this.f5133y) {
            return (-(m1925J() - 1)) * this.f5123B;
        }
        return 0.0f;
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
                this.f5130v = 0.0f;
                return;
            }
            this.f3348a.m1335l(iM1967y);
        }
    }

    /* renamed from: f1 */
    public final int m2738f1(int i, RecyclerView.C0544r c0544r) {
        if (m1967y() == 0 || i == 0) {
            return 0;
        }
        if (this.f5131w == null) {
            this.f5131w = AbstractC0397t.m1405a(this, 0);
        }
        float f2 = i;
        float f3 = f2 / Float.MAX_VALUE;
        if (Math.abs(f3) < 1.0E-8f) {
            return 0;
        }
        float f4 = this.f5130v + f3;
        if (f4 < m2737e1()) {
            i = (int) (f2 - ((f4 - m2737e1()) * Float.MAX_VALUE));
        } else if (f4 > m2736d1()) {
            i = (int) ((m2736d1() - this.f5130v) * Float.MAX_VALUE);
        }
        this.f5130v += i / Float.MAX_VALUE;
        m1962q(c0544r);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: g0 */
    public boolean mo1956g0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
        mo1806t(m2734b1());
        return true;
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
    /* renamed from: k0 */
    public View mo1746k0(View view, int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l */
    public int mo1747l(RecyclerView.C0549w c0549w) {
        return m2733a1();
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
        return m2733a1();
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
    /* renamed from: t */
    public View mo1806t(int i) {
        if (m1925J() == 0) {
            return null;
        }
        throw null;
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
            this.f5130v = 0.0f;
            return;
        }
        if (this.f5131w == null) {
            this.f5131w = AbstractC0397t.m1405a(this, 0);
        }
        if (m1927K() == 1) {
            this.f5132x = !this.f5132x;
        }
        View viewM1979e = c0544r.m1979e(0);
        m1952c0(viewM1979e, 0, 0);
        this.f5126r = this.f5131w.mo1392c(viewM1979e);
        this.f5127s = this.f5131w.mo1393d(viewM1979e);
        this.f5128t = (this.f5131w.mo1401l() - this.f5126r) / 2;
        this.f5129u = (((this.f3364q - m1936Q()) - m1932N()) - this.f5127s) - 0;
        this.f5123B = (this.f5126r * 0.5f) + 0;
        this.f5124C = ((int) Math.abs((((-r6) - this.f5131w.mo1400k()) - this.f5128t) / this.f5123B)) + 1;
        this.f5125D = ((int) Math.abs((this.f5131w.mo1401l() - this.f5128t) / this.f5123B)) + 1;
        C0955a c0955a = this.f5122A;
        if (c0955a != null) {
            this.f5133y = c0955a.f5137d;
            this.f5134z = c0955a.f5135b;
            this.f5130v = c0955a.f5136c;
        }
        int i = this.f5134z;
        if (i != -1) {
            this.f5130v = i * (this.f5133y ? -this.f5123B : this.f5123B);
        }
        m1962q(c0544r);
        m1962q(c0544r);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: x0 */
    public void mo1763x0(RecyclerView.C0549w c0549w) {
        this.f5122A = null;
        this.f5134z = -1;
    }
}

package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.p031h.p032b.C0190e;
import p000a.p060o.p061b.AbstractC0397t;
import p000a.p060o.p061b.C0392o;
import p000a.p060o.p061b.RunnableC0390m;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0538l implements RecyclerView.AbstractC0548v.b {

    /* renamed from: A */
    public int f3223A;

    /* renamed from: B */
    public C0526d f3224B;

    /* renamed from: C */
    public final C0523a f3225C;

    /* renamed from: D */
    public final C0524b f3226D;

    /* renamed from: E */
    public int f3227E;

    /* renamed from: F */
    public int[] f3228F;

    /* renamed from: r */
    public int f3229r;

    /* renamed from: s */
    public C0525c f3230s;

    /* renamed from: t */
    public AbstractC0397t f3231t;

    /* renamed from: u */
    public boolean f3232u;

    /* renamed from: v */
    public boolean f3233v;

    /* renamed from: w */
    public boolean f3234w;

    /* renamed from: x */
    public boolean f3235x;

    /* renamed from: y */
    public boolean f3236y;

    /* renamed from: z */
    public int f3237z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0523a {

        /* renamed from: a */
        public AbstractC0397t f3238a;

        /* renamed from: b */
        public int f3239b;

        /* renamed from: c */
        public int f3240c;

        /* renamed from: d */
        public boolean f3241d;

        /* renamed from: e */
        public boolean f3242e;

        public C0523a() {
            m1815d();
        }

        /* renamed from: a */
        public void m1812a() {
            this.f3240c = this.f3241d ? this.f3238a.mo1396g() : this.f3238a.mo1400k();
        }

        /* renamed from: b */
        public void m1813b(View view, int i) {
            if (this.f3241d) {
                this.f3240c = this.f3238a.m1406m() + this.f3238a.mo1391b(view);
            } else {
                this.f3240c = this.f3238a.mo1394e(view);
            }
            this.f3239b = i;
        }

        /* renamed from: c */
        public void m1814c(View view, int i) {
            int iMin;
            int iM1406m = this.f3238a.m1406m();
            if (iM1406m >= 0) {
                m1813b(view, i);
                return;
            }
            this.f3239b = i;
            if (this.f3241d) {
                int iMo1396g = (this.f3238a.mo1396g() - iM1406m) - this.f3238a.mo1391b(view);
                this.f3240c = this.f3238a.mo1396g() - iMo1396g;
                if (iMo1396g <= 0) {
                    return;
                }
                int iMo1392c = this.f3240c - this.f3238a.mo1392c(view);
                int iMo1400k = this.f3238a.mo1400k();
                int iMin2 = iMo1392c - (Math.min(this.f3238a.mo1394e(view) - iMo1400k, 0) + iMo1400k);
                if (iMin2 >= 0) {
                    return;
                }
                iMin = Math.min(iMo1396g, -iMin2) + this.f3240c;
            } else {
                int iMo1394e = this.f3238a.mo1394e(view);
                int iMo1400k2 = iMo1394e - this.f3238a.mo1400k();
                this.f3240c = iMo1394e;
                if (iMo1400k2 <= 0) {
                    return;
                }
                int iMo1396g2 = (this.f3238a.mo1396g() - Math.min(0, (this.f3238a.mo1396g() - iM1406m) - this.f3238a.mo1391b(view))) - (this.f3238a.mo1392c(view) + iMo1394e);
                if (iMo1396g2 >= 0) {
                    return;
                } else {
                    iMin = this.f3240c - Math.min(iMo1400k2, -iMo1396g2);
                }
            }
            this.f3240c = iMin;
        }

        /* renamed from: d */
        public void m1815d() {
            this.f3239b = -1;
            this.f3240c = Integer.MIN_VALUE;
            this.f3241d = false;
            this.f3242e = false;
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("AnchorInfo{mPosition=");
            sbM2079g.append(this.f3239b);
            sbM2079g.append(", mCoordinate=");
            sbM2079g.append(this.f3240c);
            sbM2079g.append(", mLayoutFromEnd=");
            sbM2079g.append(this.f3241d);
            sbM2079g.append(", mValid=");
            sbM2079g.append(this.f3242e);
            sbM2079g.append('}');
            return sbM2079g.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0524b {

        /* renamed from: a */
        public int f3243a;

        /* renamed from: b */
        public boolean f3244b;

        /* renamed from: c */
        public boolean f3245c;

        /* renamed from: d */
        public boolean f3246d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0525c {

        /* renamed from: b */
        public int f3248b;

        /* renamed from: c */
        public int f3249c;

        /* renamed from: d */
        public int f3250d;

        /* renamed from: e */
        public int f3251e;

        /* renamed from: f */
        public int f3252f;

        /* renamed from: g */
        public int f3253g;

        /* renamed from: j */
        public int f3256j;

        /* renamed from: l */
        public boolean f3258l;

        /* renamed from: a */
        public boolean f3247a = true;

        /* renamed from: h */
        public int f3254h = 0;

        /* renamed from: i */
        public int f3255i = 0;

        /* renamed from: k */
        public List<RecyclerView.AbstractC0552z> f3257k = null;

        /* renamed from: a */
        public void m1816a(View view) {
            int iM1970a;
            int size = this.f3257k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3257k.get(i2).f3428a;
                RecyclerView.C0539m c0539m = (RecyclerView.C0539m) view3.getLayoutParams();
                if (view3 != view && !c0539m.m1972c() && (iM1970a = (c0539m.m1970a() - this.f3250d) * this.f3251e) >= 0 && iM1970a < i) {
                    view2 = view3;
                    if (iM1970a == 0) {
                        break;
                    } else {
                        i = iM1970a;
                    }
                }
            }
            this.f3250d = view2 == null ? -1 : ((RecyclerView.C0539m) view2.getLayoutParams()).m1970a();
        }

        /* renamed from: b */
        public boolean m1817b(RecyclerView.C0549w c0549w) {
            int i = this.f3250d;
            return i >= 0 && i < c0549w.m1995b();
        }

        /* renamed from: c */
        public View m1818c(RecyclerView.C0544r c0544r) {
            List<RecyclerView.AbstractC0552z> list = this.f3257k;
            if (list == null) {
                View viewM1979e = c0544r.m1979e(this.f3250d);
                this.f3250d += this.f3251e;
                return viewM1979e;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3257k.get(i).f3428a;
                RecyclerView.C0539m c0539m = (RecyclerView.C0539m) view.getLayoutParams();
                if (!c0539m.m1972c() && this.f3250d == c0539m.m1970a()) {
                    m1816a(view);
                    return view;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0526d implements Parcelable {
        public static final Parcelable.Creator<C0526d> CREATOR = new a();

        /* renamed from: b */
        public int f3259b;

        /* renamed from: c */
        public int f3260c;

        /* renamed from: d */
        public boolean f3261d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class a implements Parcelable.Creator<C0526d> {
            @Override // android.os.Parcelable.Creator
            public C0526d createFromParcel(Parcel parcel) {
                return new C0526d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0526d[] newArray(int i) {
                return new C0526d[i];
            }
        }

        public C0526d() {
        }

        public C0526d(Parcel parcel) {
            this.f3259b = parcel.readInt();
            this.f3260c = parcel.readInt();
            this.f3261d = parcel.readInt() == 1;
        }

        public C0526d(C0526d c0526d) {
            this.f3259b = c0526d.f3259b;
            this.f3260c = c0526d.f3260c;
            this.f3261d = c0526d.f3261d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: m */
        public boolean m1819m() {
            return this.f3259b >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3259b);
            parcel.writeInt(this.f3260c);
            parcel.writeInt(this.f3261d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f3229r = 1;
        this.f3233v = false;
        this.f3234w = false;
        this.f3235x = false;
        this.f3236y = true;
        this.f3237z = -1;
        this.f3223A = Integer.MIN_VALUE;
        this.f3224B = null;
        this.f3225C = new C0523a();
        this.f3226D = new C0524b();
        this.f3227E = 2;
        this.f3228F = new int[2];
        m1771D1(i);
        mo1782d(null);
        if (z == this.f3233v) {
            return;
        }
        this.f3233v = z;
        m1930L0();
    }

    /* renamed from: A1 */
    public boolean m1766A1() {
        return this.f3231t.mo1398i() == 0 && this.f3231t.mo1395f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: B0 */
    public void mo1767B0(Parcelable parcelable) {
        if (parcelable instanceof C0526d) {
            this.f3224B = (C0526d) parcelable;
            m1930L0();
        }
    }

    /* renamed from: B1 */
    public final void m1768B1() {
        this.f3234w = (this.f3229r == 1 || !m1809v1()) ? this.f3233v : !this.f3233v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: C0 */
    public Parcelable mo1769C0() {
        C0526d c0526d = this.f3224B;
        if (c0526d != null) {
            return new C0526d(c0526d);
        }
        C0526d c0526d2 = new C0526d();
        if (m1967y() > 0) {
            m1788g1();
            boolean z = this.f3232u ^ this.f3234w;
            c0526d2.f3261d = z;
            if (z) {
                View viewM1807t1 = m1807t1();
                c0526d2.f3260c = this.f3231t.mo1396g() - this.f3231t.mo1391b(viewM1807t1);
                c0526d2.f3259b = m1938R(viewM1807t1);
            } else {
                View viewM1808u1 = m1808u1();
                c0526d2.f3259b = m1938R(viewM1808u1);
                c0526d2.f3260c = this.f3231t.mo1394e(viewM1808u1) - this.f3231t.mo1400k();
            }
        } else {
            c0526d2.f3259b = -1;
        }
        return c0526d2;
    }

    /* renamed from: C1 */
    public int m1770C1(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (m1967y() == 0 || i == 0) {
            return 0;
        }
        m1788g1();
        this.f3230s.f3247a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m1772F1(i2, iAbs, true, c0549w);
        C0525c c0525c = this.f3230s;
        int iM1789h1 = m1789h1(c0544r, c0525c, c0549w, false) + c0525c.f3253g;
        if (iM1789h1 < 0) {
            return 0;
        }
        if (iAbs > iM1789h1) {
            i = i2 * iM1789h1;
        }
        this.f3231t.mo1404p(-i);
        this.f3230s.f3256j = i;
        return i;
    }

    /* renamed from: D1 */
    public void m1771D1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo1782d(null);
        if (i != this.f3229r || this.f3231t == null) {
            AbstractC0397t abstractC0397tM1405a = AbstractC0397t.m1405a(this, i);
            this.f3231t = abstractC0397tM1405a;
            this.f3225C.f3238a = abstractC0397tM1405a;
            this.f3229r = i;
            m1930L0();
        }
    }

    /* renamed from: E1 */
    public void mo1728E1(boolean z) {
        mo1782d(null);
        if (this.f3235x == z) {
            return;
        }
        this.f3235x = z;
        m1930L0();
    }

    /* renamed from: F1 */
    public final void m1772F1(int i, int i2, boolean z, RecyclerView.C0549w c0549w) {
        int iMo1400k;
        this.f3230s.f3258l = m1766A1();
        this.f3230s.f3252f = i;
        int[] iArr = this.f3228F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1780a1(c0549w, iArr);
        int iMax = Math.max(0, this.f3228F[0]);
        int iMax2 = Math.max(0, this.f3228F[1]);
        boolean z2 = i == 1;
        C0525c c0525c = this.f3230s;
        int i3 = z2 ? iMax2 : iMax;
        c0525c.f3254h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0525c.f3255i = iMax;
        if (z2) {
            c0525c.f3254h = this.f3231t.mo1397h() + i3;
            View viewM1807t1 = m1807t1();
            C0525c c0525c2 = this.f3230s;
            c0525c2.f3251e = this.f3234w ? -1 : 1;
            int iM1938R = m1938R(viewM1807t1);
            C0525c c0525c3 = this.f3230s;
            c0525c2.f3250d = iM1938R + c0525c3.f3251e;
            c0525c3.f3248b = this.f3231t.mo1391b(viewM1807t1);
            iMo1400k = this.f3231t.mo1391b(viewM1807t1) - this.f3231t.mo1396g();
        } else {
            View viewM1808u1 = m1808u1();
            C0525c c0525c4 = this.f3230s;
            c0525c4.f3254h = this.f3231t.mo1400k() + c0525c4.f3254h;
            C0525c c0525c5 = this.f3230s;
            c0525c5.f3251e = this.f3234w ? 1 : -1;
            int iM1938R2 = m1938R(viewM1808u1);
            C0525c c0525c6 = this.f3230s;
            c0525c5.f3250d = iM1938R2 + c0525c6.f3251e;
            c0525c6.f3248b = this.f3231t.mo1394e(viewM1808u1);
            iMo1400k = (-this.f3231t.mo1394e(viewM1808u1)) + this.f3231t.mo1400k();
        }
        C0525c c0525c7 = this.f3230s;
        c0525c7.f3249c = i2;
        if (z) {
            c0525c7.f3249c = i2 - iMo1400k;
        }
        c0525c7.f3253g = iMo1400k;
    }

    /* renamed from: G1 */
    public final void m1773G1(int i, int i2) {
        this.f3230s.f3249c = this.f3231t.mo1396g() - i2;
        C0525c c0525c = this.f3230s;
        c0525c.f3251e = this.f3234w ? -1 : 1;
        c0525c.f3250d = i;
        c0525c.f3252f = 1;
        c0525c.f3248b = i2;
        c0525c.f3253g = Integer.MIN_VALUE;
    }

    /* renamed from: H1 */
    public final void m1774H1(int i, int i2) {
        this.f3230s.f3249c = i2 - this.f3231t.mo1400k();
        C0525c c0525c = this.f3230s;
        c0525c.f3250d = i;
        c0525c.f3251e = this.f3234w ? 1 : -1;
        c0525c.f3252f = -1;
        c0525c.f3248b = i2;
        c0525c.f3253g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: M0 */
    public int mo1733M0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (this.f3229r == 1) {
            return 0;
        }
        return m1770C1(i, c0544r, c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: N0 */
    public void mo1775N0(int i) {
        this.f3237z = i;
        this.f3223A = Integer.MIN_VALUE;
        C0526d c0526d = this.f3224B;
        if (c0526d != null) {
            c0526d.f3259b = -1;
        }
        m1930L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: O0 */
    public int mo1736O0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (this.f3229r == 0) {
            return 0;
        }
        return m1770C1(i, c0544r, c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: V0 */
    public boolean mo1776V0() {
        boolean z;
        if (this.f3362o == 1073741824 || this.f3361n == 1073741824) {
            return false;
        }
        int iM1967y = m1967y();
        int i = 0;
        while (true) {
            if (i >= iM1967y) {
                z = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = m1966x(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: W */
    public boolean mo1777W() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: X0 */
    public void mo1778X0(RecyclerView recyclerView, RecyclerView.C0549w c0549w, int i) {
        C0392o c0392o = new C0392o(recyclerView.getContext());
        c0392o.f3391a = i;
        m1946Y0(c0392o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: Z0 */
    public boolean mo1743Z0() {
        return this.f3224B == null && this.f3232u == this.f3235x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0548v.b
    /* renamed from: a */
    public PointF mo1779a(int i) {
        if (m1967y() == 0) {
            return null;
        }
        int i2 = (i < m1938R(m1966x(0))) != this.f3234w ? -1 : 1;
        return this.f3229r == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a1 */
    public void mo1780a1(RecyclerView.C0549w c0549w, int[] iArr) {
        int i;
        int iMo1401l = c0549w.f3406a != -1 ? this.f3231t.mo1401l() : 0;
        if (this.f3230s.f3252f == -1) {
            i = 0;
        } else {
            i = iMo1401l;
            iMo1401l = 0;
        }
        iArr[0] = iMo1401l;
        iArr[1] = i;
    }

    /* renamed from: b1 */
    public void mo1744b1(RecyclerView.C0549w c0549w, C0525c c0525c, RecyclerView.AbstractC0538l.c cVar) {
        int i = c0525c.f3250d;
        if (i < 0 || i >= c0549w.m1995b()) {
            return;
        }
        ((RunnableC0390m.b) cVar).m1377a(i, Math.max(0, c0525c.f3253g));
    }

    /* renamed from: c1 */
    public final int m1781c1(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        m1788g1();
        return C0190e.m714i(c0549w, this.f3231t, m1796k1(!this.f3236y, true), m1794j1(!this.f3236y, true), this, this.f3236y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: d */
    public void mo1782d(String str) {
        RecyclerView recyclerView;
        if (this.f3224B != null || (recyclerView = this.f3349b) == null) {
            return;
        }
        recyclerView.m1862i(str);
    }

    /* renamed from: d1 */
    public final int m1783d1(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        m1788g1();
        return C0190e.m715j(c0549w, this.f3231t, m1796k1(!this.f3236y, true), m1794j1(!this.f3236y, true), this, this.f3236y, this.f3234w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: e */
    public boolean mo1784e() {
        return this.f3229r == 0;
    }

    /* renamed from: e1 */
    public final int m1785e1(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        m1788g1();
        return C0190e.m716k(c0549w, this.f3231t, m1796k1(!this.f3236y, true), m1794j1(!this.f3236y, true), this, this.f3236y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: f */
    public boolean mo1786f() {
        return this.f3229r == 1;
    }

    /* renamed from: f1 */
    public int m1787f1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3229r == 1) ? 1 : Integer.MIN_VALUE : this.f3229r == 0 ? 1 : Integer.MIN_VALUE : this.f3229r == 1 ? -1 : Integer.MIN_VALUE : this.f3229r == 0 ? -1 : Integer.MIN_VALUE : (this.f3229r != 1 && m1809v1()) ? -1 : 1 : (this.f3229r != 1 && m1809v1()) ? 1 : -1;
    }

    /* renamed from: g1 */
    public void m1788g1() {
        if (this.f3230s == null) {
            this.f3230s = new C0525c();
        }
    }

    /* renamed from: h1 */
    public int m1789h1(RecyclerView.C0544r c0544r, C0525c c0525c, RecyclerView.C0549w c0549w, boolean z) {
        int i = c0525c.f3249c;
        int i2 = c0525c.f3253g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0525c.f3253g = i2 + i;
            }
            m1810y1(c0544r, c0525c);
        }
        int i3 = c0525c.f3249c + c0525c.f3254h;
        C0524b c0524b = this.f3226D;
        while (true) {
            if ((!c0525c.f3258l && i3 <= 0) || !c0525c.m1817b(c0549w)) {
                break;
            }
            c0524b.f3243a = 0;
            c0524b.f3244b = false;
            c0524b.f3245c = false;
            c0524b.f3246d = false;
            mo1762w1(c0544r, c0549w, c0525c, c0524b);
            if (!c0524b.f3244b) {
                int i4 = c0525c.f3248b;
                int i5 = c0524b.f3243a;
                c0525c.f3248b = (c0525c.f3252f * i5) + i4;
                if (!c0524b.f3245c || c0525c.f3257k != null || !c0549w.f3412g) {
                    c0525c.f3249c -= i5;
                    i3 -= i5;
                }
                int i6 = c0525c.f3253g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    c0525c.f3253g = i7;
                    int i8 = c0525c.f3249c;
                    if (i8 < 0) {
                        c0525c.f3253g = i7 + i8;
                    }
                    m1810y1(c0544r, c0525c);
                }
                if (z && c0524b.f3246d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0525c.f3249c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: i */
    public void mo1790i(int i, int i2, RecyclerView.C0549w c0549w, RecyclerView.AbstractC0538l.c cVar) {
        if (this.f3229r != 0) {
            i = i2;
        }
        if (m1967y() == 0 || i == 0) {
            return;
        }
        m1788g1();
        m1772F1(i > 0 ? 1 : -1, Math.abs(i), true, c0549w);
        mo1744b1(c0549w, this.f3230s, cVar);
    }

    /* renamed from: i1 */
    public final View m1791i1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return mo1753q1(c0544r, c0549w, 0, m1967y(), c0549w.m1995b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: j */
    public void mo1792j(int i, RecyclerView.AbstractC0538l.c cVar) {
        boolean z;
        int i2;
        C0526d c0526d = this.f3224B;
        if (c0526d == null || !c0526d.m1819m()) {
            m1768B1();
            z = this.f3234w;
            i2 = this.f3237z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0526d c0526d2 = this.f3224B;
            z = c0526d2.f3261d;
            i2 = c0526d2.f3259b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f3227E && i2 >= 0 && i2 < i; i4++) {
            ((RunnableC0390m.b) cVar).m1377a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: j0 */
    public void mo1793j0(RecyclerView recyclerView, RecyclerView.C0544r c0544r) {
        m1958i0();
    }

    /* renamed from: j1 */
    public View m1794j1(boolean z, boolean z2) {
        int iM1967y;
        int iM1967y2;
        if (this.f3234w) {
            iM1967y = 0;
            iM1967y2 = m1967y();
        } else {
            iM1967y = m1967y() - 1;
            iM1967y2 = -1;
        }
        return m1803p1(iM1967y, iM1967y2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: k */
    public int mo1795k(RecyclerView.C0549w c0549w) {
        return m1781c1(c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: k0 */
    public View mo1746k0(View view, int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        int iM1787f1;
        m1768B1();
        if (m1967y() == 0 || (iM1787f1 = m1787f1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m1788g1();
        m1772F1(iM1787f1, (int) (this.f3231t.mo1401l() * 0.33333334f), false, c0549w);
        C0525c c0525c = this.f3230s;
        c0525c.f3253g = Integer.MIN_VALUE;
        c0525c.f3247a = false;
        m1789h1(c0544r, c0525c, c0549w, true);
        View viewM1802o1 = iM1787f1 == -1 ? this.f3234w ? m1802o1(m1967y() - 1, -1) : m1802o1(0, m1967y()) : this.f3234w ? m1802o1(0, m1967y()) : m1802o1(m1967y() - 1, -1);
        View viewM1808u1 = iM1787f1 == -1 ? m1808u1() : m1807t1();
        if (!viewM1808u1.hasFocusable()) {
            return viewM1802o1;
        }
        if (viewM1802o1 == null) {
            return null;
        }
        return viewM1808u1;
    }

    /* renamed from: k1 */
    public View m1796k1(boolean z, boolean z2) {
        int iM1967y;
        int iM1967y2;
        if (this.f3234w) {
            iM1967y = m1967y() - 1;
            iM1967y2 = -1;
        } else {
            iM1967y = 0;
            iM1967y2 = m1967y();
        }
        return m1803p1(iM1967y, iM1967y2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l */
    public int mo1747l(RecyclerView.C0549w c0549w) {
        return m1783d1(c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l0 */
    public void mo1797l0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0544r c0544r = this.f3349b.f3291c;
        m1959m0(accessibilityEvent);
        if (m1967y() > 0) {
            accessibilityEvent.setFromIndex(m1798l1());
            accessibilityEvent.setToIndex(m1801n1());
        }
    }

    /* renamed from: l1 */
    public int m1798l1() {
        View viewM1803p1 = m1803p1(0, m1967y(), false, true);
        if (viewM1803p1 == null) {
            return -1;
        }
        return m1938R(viewM1803p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: m */
    public int mo1748m(RecyclerView.C0549w c0549w) {
        return m1785e1(c0549w);
    }

    /* renamed from: m1 */
    public final View m1799m1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return mo1753q1(c0544r, c0549w, m1967y() - 1, -1, c0549w.m1995b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: n */
    public int mo1800n(RecyclerView.C0549w c0549w) {
        return m1781c1(c0549w);
    }

    /* renamed from: n1 */
    public int m1801n1() {
        View viewM1803p1 = m1803p1(m1967y() - 1, -1, false, true);
        if (viewM1803p1 == null) {
            return -1;
        }
        return m1938R(viewM1803p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: o */
    public int mo1749o(RecyclerView.C0549w c0549w) {
        return m1783d1(c0549w);
    }

    /* renamed from: o1 */
    public View m1802o1(int i, int i2) {
        int i3;
        int i4;
        m1788g1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m1966x(i);
        }
        if (this.f3231t.mo1394e(m1966x(i)) < this.f3231t.mo1400k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f3229r == 0 ? this.f3352e : this.f3353f).m1315a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: p */
    public int mo1751p(RecyclerView.C0549w c0549w) {
        return m1785e1(c0549w);
    }

    /* renamed from: p1 */
    public View m1803p1(int i, int i2, boolean z, boolean z2) {
        m1788g1();
        return (this.f3229r == 0 ? this.f3352e : this.f3353f).m1315a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    /* renamed from: q1 */
    public View mo1753q1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, int i, int i2, int i3) {
        m1788g1();
        int iMo1400k = this.f3231t.mo1400k();
        int iMo1396g = this.f3231t.mo1396g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM1966x = m1966x(i);
            int iM1938R = m1938R(viewM1966x);
            if (iM1938R >= 0 && iM1938R < i3) {
                if (((RecyclerView.C0539m) viewM1966x.getLayoutParams()).m1972c()) {
                    if (view2 == null) {
                        view2 = viewM1966x;
                    }
                } else {
                    if (this.f3231t.mo1394e(viewM1966x) < iMo1396g && this.f3231t.mo1391b(viewM1966x) >= iMo1400k) {
                        return viewM1966x;
                    }
                    if (view == null) {
                        view = viewM1966x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: r1 */
    public final int m1804r1(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, boolean z) {
        int iMo1396g;
        int iMo1396g2 = this.f3231t.mo1396g() - i;
        if (iMo1396g2 <= 0) {
            return 0;
        }
        int i2 = -m1770C1(-iMo1396g2, c0544r, c0549w);
        int i3 = i + i2;
        if (!z || (iMo1396g = this.f3231t.mo1396g() - i3) <= 0) {
            return i2;
        }
        this.f3231t.mo1404p(iMo1396g);
        return iMo1396g + i2;
    }

    /* renamed from: s1 */
    public final int m1805s1(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, boolean z) {
        int iMo1400k;
        int iMo1400k2 = i - this.f3231t.mo1400k();
        if (iMo1400k2 <= 0) {
            return 0;
        }
        int i2 = -m1770C1(iMo1400k2, c0544r, c0549w);
        int i3 = i + i2;
        if (!z || (iMo1400k = i3 - this.f3231t.mo1400k()) <= 0) {
            return i2;
        }
        this.f3231t.mo1404p(-iMo1400k);
        return i2 - iMo1400k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: t */
    public View mo1806t(int i) {
        int iM1967y = m1967y();
        if (iM1967y == 0) {
            return null;
        }
        int iM1938R = i - m1938R(m1966x(0));
        if (iM1938R >= 0 && iM1938R < iM1967y) {
            View viewM1966x = m1966x(iM1938R);
            if (m1938R(viewM1966x) == i) {
                return viewM1966x;
            }
        }
        return super.mo1806t(i);
    }

    /* renamed from: t1 */
    public final View m1807t1() {
        return m1966x(this.f3234w ? 0 : m1967y() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: u */
    public RecyclerView.C0539m mo1757u() {
        return new RecyclerView.C0539m(-2, -2);
    }

    /* renamed from: u1 */
    public final View m1808u1() {
        return m1966x(this.f3234w ? m1967y() - 1 : 0);
    }

    /* renamed from: v1 */
    public boolean m1809v1() {
        return m1927K() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0175  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1761w0(androidx.recyclerview.widget.RecyclerView.C0544r r17, androidx.recyclerview.widget.RecyclerView.C0549w r18) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1761w0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    /* renamed from: w1 */
    public void mo1762w1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, C0525c c0525c, C0524b c0524b) {
        int i;
        int i2;
        int i3;
        int iM1933O;
        int iMo1393d;
        View viewM1818c = c0525c.m1818c(c0544r);
        if (viewM1818c == null) {
            c0524b.f3244b = true;
            return;
        }
        RecyclerView.C0539m c0539m = (RecyclerView.C0539m) viewM1818c.getLayoutParams();
        if (c0525c.f3257k == null) {
            if (this.f3234w == (c0525c.f3252f == -1)) {
                m1951c(viewM1818c, -1, false);
            } else {
                m1951c(viewM1818c, 0, false);
            }
        } else {
            if (this.f3234w == (c0525c.f3252f == -1)) {
                m1951c(viewM1818c, -1, true);
            } else {
                m1951c(viewM1818c, 0, true);
            }
        }
        m1952c0(viewM1818c, 0, 0);
        c0524b.f3243a = this.f3231t.mo1392c(viewM1818c);
        if (this.f3229r == 1) {
            if (m1809v1()) {
                iMo1393d = this.f3363p - m1934P();
                iM1933O = iMo1393d - this.f3231t.mo1393d(viewM1818c);
            } else {
                iM1933O = m1933O();
                iMo1393d = this.f3231t.mo1393d(viewM1818c) + iM1933O;
            }
            int i4 = c0525c.f3252f;
            int i5 = c0525c.f3248b;
            if (i4 == -1) {
                i3 = i5;
                i2 = iMo1393d;
                i = i5 - c0524b.f3243a;
            } else {
                i = i5;
                i2 = iMo1393d;
                i3 = c0524b.f3243a + i5;
            }
        } else {
            int iM1936Q = m1936Q();
            int iMo1393d2 = this.f3231t.mo1393d(viewM1818c) + iM1936Q;
            int i6 = c0525c.f3252f;
            int i7 = c0525c.f3248b;
            if (i6 == -1) {
                i2 = i7;
                i = iM1936Q;
                i3 = iMo1393d2;
                iM1933O = i7 - c0524b.f3243a;
            } else {
                i = iM1936Q;
                i2 = c0524b.f3243a + i7;
                i3 = iMo1393d2;
                iM1933O = i7;
            }
        }
        m1950b0(viewM1818c, iM1933O, i, i2, i3);
        if (c0539m.m1972c() || c0539m.m1971b()) {
            c0524b.f3245c = true;
        }
        c0524b.f3246d = viewM1818c.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: x0 */
    public void mo1763x0(RecyclerView.C0549w c0549w) {
        this.f3224B = null;
        this.f3237z = -1;
        this.f3223A = Integer.MIN_VALUE;
        this.f3225C.m1815d();
    }

    /* renamed from: x1 */
    public void mo1764x1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, C0523a c0523a, int i) {
    }

    /* renamed from: y1 */
    public final void m1810y1(RecyclerView.C0544r c0544r, C0525c c0525c) {
        if (!c0525c.f3247a || c0525c.f3258l) {
            return;
        }
        int i = c0525c.f3253g;
        int i2 = c0525c.f3255i;
        if (c0525c.f3252f == -1) {
            int iM1967y = m1967y();
            if (i < 0) {
                return;
            }
            int iMo1395f = (this.f3231t.mo1395f() - i) + i2;
            if (this.f3234w) {
                for (int i3 = 0; i3 < iM1967y; i3++) {
                    View viewM1966x = m1966x(i3);
                    if (this.f3231t.mo1394e(viewM1966x) < iMo1395f || this.f3231t.mo1403o(viewM1966x) < iMo1395f) {
                        m1811z1(c0544r, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM1967y - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM1966x2 = m1966x(i5);
                if (this.f3231t.mo1394e(viewM1966x2) < iMo1395f || this.f3231t.mo1403o(viewM1966x2) < iMo1395f) {
                    m1811z1(c0544r, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM1967y2 = m1967y();
        if (!this.f3234w) {
            for (int i7 = 0; i7 < iM1967y2; i7++) {
                View viewM1966x3 = m1966x(i7);
                if (this.f3231t.mo1391b(viewM1966x3) > i6 || this.f3231t.mo1402n(viewM1966x3) > i6) {
                    m1811z1(c0544r, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM1967y2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM1966x4 = m1966x(i9);
            if (this.f3231t.mo1391b(viewM1966x4) > i6 || this.f3231t.mo1402n(viewM1966x4) > i6) {
                m1811z1(c0544r, i8, i9);
                return;
            }
        }
    }

    /* renamed from: z1 */
    public final void m1811z1(RecyclerView.C0544r c0544r, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m1926J0(i, c0544r);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m1926J0(i3, c0544r);
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3229r = 1;
        this.f3233v = false;
        this.f3234w = false;
        this.f3235x = false;
        this.f3236y = true;
        this.f3237z = -1;
        this.f3223A = Integer.MIN_VALUE;
        this.f3224B = null;
        this.f3225C = new C0523a();
        this.f3226D = new C0524b();
        this.f3227E = 2;
        this.f3228F = new int[2];
        RecyclerView.AbstractC0538l.d dVarM1906S = RecyclerView.AbstractC0538l.m1906S(context, attributeSet, i, i2);
        m1771D1(dVarM1906S.f3367a);
        boolean z = dVarM1906S.f3369c;
        mo1782d(null);
        if (z != this.f3233v) {
            this.f3233v = z;
            m1930L0();
        }
        mo1728E1(dVarM1906S.f3370d);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p060o.p061b.RunnableC0390m;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: G */
    public boolean f3211G;

    /* renamed from: H */
    public int f3212H;

    /* renamed from: I */
    public int[] f3213I;

    /* renamed from: J */
    public View[] f3214J;

    /* renamed from: K */
    public final SparseIntArray f3215K;

    /* renamed from: L */
    public final SparseIntArray f3216L;

    /* renamed from: M */
    public AbstractC0522c f3217M;

    /* renamed from: N */
    public final Rect f3218N;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0520a extends AbstractC0522c {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0521b extends RecyclerView.C0539m {

        /* renamed from: e */
        public int f3219e;

        /* renamed from: f */
        public int f3220f;

        public C0521b(int i, int i2) {
            super(i, i2);
            this.f3219e = -1;
            this.f3220f = 0;
        }

        public C0521b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3219e = -1;
            this.f3220f = 0;
        }

        public C0521b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3219e = -1;
            this.f3220f = 0;
        }

        public C0521b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3219e = -1;
            this.f3220f = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0522c {

        /* renamed from: a */
        public final SparseIntArray f3221a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f3222b = new SparseIntArray();

        /* renamed from: a */
        public int m1765a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        this.f3211G = false;
        this.f3212H = -1;
        this.f3215K = new SparseIntArray();
        this.f3216L = new SparseIntArray();
        this.f3217M = new C0520a();
        this.f3218N = new Rect();
        m1739Q1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3211G = false;
        this.f3212H = -1;
        this.f3215K = new SparseIntArray();
        this.f3216L = new SparseIntArray();
        this.f3217M = new C0520a();
        this.f3218N = new Rect();
        m1739Q1(RecyclerView.AbstractC0538l.m1906S(context, attributeSet, i, i2).f3368b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: A */
    public int mo1727A(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (this.f3229r == 1) {
            return this.f3212H;
        }
        if (c0549w.m1995b() < 1) {
            return 0;
        }
        return m1732L1(c0544r, c0549w, c0549w.m1995b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E1 */
    public void mo1728E1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        mo1782d(null);
        if (this.f3235x) {
            this.f3235x = false;
            m1930L0();
        }
    }

    /* renamed from: I1 */
    public final void m1729I1(int i) {
        int i2;
        int[] iArr = this.f3213I;
        int i3 = this.f3212H;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f3213I = iArr;
    }

    /* renamed from: J1 */
    public final void m1730J1() {
        View[] viewArr = this.f3214J;
        if (viewArr == null || viewArr.length != this.f3212H) {
            this.f3214J = new View[this.f3212H];
        }
    }

    /* renamed from: K1 */
    public int m1731K1(int i, int i2) {
        if (this.f3229r != 1 || !m1809v1()) {
            int[] iArr = this.f3213I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3213I;
        int i3 = this.f3212H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: L1 */
    public final int m1732L1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, int i) {
        if (!c0549w.f3412g) {
            return this.f3217M.m1765a(i, this.f3212H);
        }
        int iM1977c = c0544r.m1977c(i);
        if (iM1977c != -1) {
            return this.f3217M.m1765a(iM1977c, this.f3212H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: M0 */
    public int mo1733M0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        m1741R1();
        m1730J1();
        if (this.f3229r == 1) {
            return 0;
        }
        return m1770C1(i, c0544r, c0549w);
    }

    /* renamed from: M1 */
    public final int m1734M1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, int i) {
        if (!c0549w.f3412g) {
            AbstractC0522c abstractC0522c = this.f3217M;
            int i2 = this.f3212H;
            Objects.requireNonNull(abstractC0522c);
            return i % i2;
        }
        int i3 = this.f3216L.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM1977c = c0544r.m1977c(i);
        if (iM1977c != -1) {
            AbstractC0522c abstractC0522c2 = this.f3217M;
            int i4 = this.f3212H;
            Objects.requireNonNull(abstractC0522c2);
            return iM1977c % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: N1 */
    public final int m1735N1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, int i) {
        if (!c0549w.f3412g) {
            Objects.requireNonNull(this.f3217M);
            return 1;
        }
        int i2 = this.f3215K.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0544r.m1977c(i) != -1) {
            Objects.requireNonNull(this.f3217M);
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: O0 */
    public int mo1736O0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        m1741R1();
        m1730J1();
        if (this.f3229r == 0) {
            return 0;
        }
        return m1770C1(i, c0544r, c0549w);
    }

    /* renamed from: O1 */
    public final void m1737O1(View view, int i, boolean z) {
        int iM1909z;
        int iM1909z2;
        C0521b c0521b = (C0521b) view.getLayoutParams();
        Rect rect = c0521b.f3372b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0521b).topMargin + ((ViewGroup.MarginLayoutParams) c0521b).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0521b).leftMargin + ((ViewGroup.MarginLayoutParams) c0521b).rightMargin;
        int iM1731K1 = m1731K1(c0521b.f3219e, c0521b.f3220f);
        if (this.f3229r == 1) {
            iM1909z2 = RecyclerView.AbstractC0538l.m1909z(iM1731K1, i, i3, ((ViewGroup.MarginLayoutParams) c0521b).width, false);
            iM1909z = RecyclerView.AbstractC0538l.m1909z(this.f3231t.mo1401l(), this.f3362o, i2, ((ViewGroup.MarginLayoutParams) c0521b).height, true);
        } else {
            int iM1909z3 = RecyclerView.AbstractC0538l.m1909z(iM1731K1, i, i2, ((ViewGroup.MarginLayoutParams) c0521b).height, false);
            int iM1909z4 = RecyclerView.AbstractC0538l.m1909z(this.f3231t.mo1401l(), this.f3361n, i3, ((ViewGroup.MarginLayoutParams) c0521b).width, true);
            iM1909z = iM1909z3;
            iM1909z2 = iM1909z4;
        }
        m1738P1(view, iM1909z2, iM1909z, z);
    }

    /* renamed from: P1 */
    public final void m1738P1(View view, int i, int i2, boolean z) {
        RecyclerView.C0539m c0539m = (RecyclerView.C0539m) view.getLayoutParams();
        if (z ? m1944W0(view, i, i2, c0539m) : m1942U0(view, i, i2, c0539m)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: Q1 */
    public void m1739Q1(int i) {
        if (i == this.f3212H) {
            return;
        }
        this.f3211G = true;
        if (i >= 1) {
            this.f3212H = i;
            this.f3217M.f3221a.clear();
            m1930L0();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: R0 */
    public void mo1740R0(Rect rect, int i, int i2) {
        int iM1908h;
        int iM1908h2;
        if (this.f3213I == null) {
            super.mo1740R0(rect, i, i2);
        }
        int iM1934P = m1934P() + m1933O();
        int iM1932N = m1932N() + m1936Q();
        if (this.f3229r == 1) {
            iM1908h2 = RecyclerView.AbstractC0538l.m1908h(i2, rect.height() + iM1932N, m1929L());
            int[] iArr = this.f3213I;
            iM1908h = RecyclerView.AbstractC0538l.m1908h(i, iArr[iArr.length - 1] + iM1934P, m1931M());
        } else {
            iM1908h = RecyclerView.AbstractC0538l.m1908h(i, rect.width() + iM1934P, m1931M());
            int[] iArr2 = this.f3213I;
            iM1908h2 = RecyclerView.AbstractC0538l.m1908h(i2, iArr2[iArr2.length - 1] + iM1932N, m1929L());
        }
        this.f3349b.setMeasuredDimension(iM1908h, iM1908h2);
    }

    /* renamed from: R1 */
    public final void m1741R1() {
        int iM1932N;
        int iM1936Q;
        if (this.f3229r == 1) {
            iM1932N = this.f3363p - m1934P();
            iM1936Q = m1933O();
        } else {
            iM1932N = this.f3364q - m1932N();
            iM1936Q = m1936Q();
        }
        m1729I1(iM1932N - iM1936Q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: T */
    public int mo1742T(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (this.f3229r == 0) {
            return this.f3212H;
        }
        if (c0549w.m1995b() < 1) {
            return 0;
        }
        return m1732L1(c0544r, c0549w, c0549w.m1995b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: Z0 */
    public boolean mo1743Z0() {
        return this.f3224B == null && !this.f3211G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: b1 */
    public void mo1744b1(RecyclerView.C0549w c0549w, LinearLayoutManager.C0525c c0525c, RecyclerView.AbstractC0538l.c cVar) {
        int i = this.f3212H;
        for (int i2 = 0; i2 < this.f3212H && c0525c.m1817b(c0549w) && i > 0; i2++) {
            ((RunnableC0390m.b) cVar).m1377a(c0525c.f3250d, Math.max(0, c0525c.f3253g));
            Objects.requireNonNull(this.f3217M);
            i--;
            c0525c.f3250d += c0525c.f3251e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: g */
    public boolean mo1745g(RecyclerView.C0539m c0539m) {
        return c0539m instanceof C0521b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo1746k0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0544r r25, androidx.recyclerview.widget.RecyclerView.C0549w r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1746k0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l */
    public int mo1747l(RecyclerView.C0549w c0549w) {
        return m1783d1(c0549w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: m */
    public int mo1748m(RecyclerView.C0549w c0549w) {
        return m1785e1(c0549w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: o */
    public int mo1749o(RecyclerView.C0549w c0549w) {
        return m1783d1(c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: o0 */
    public void mo1750o0(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, View view, C0245b c0245b) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0521b)) {
            m1960n0(view, c0245b);
            return;
        }
        C0521b c0521b = (C0521b) layoutParams;
        int iM1732L1 = m1732L1(c0544r, c0549w, c0521b.m1970a());
        if (this.f3229r == 0) {
            i4 = c0521b.f3219e;
            i = c0521b.f3220f;
            i3 = 1;
            z = false;
            z2 = false;
            i2 = iM1732L1;
        } else {
            i = 1;
            i2 = c0521b.f3219e;
            i3 = c0521b.f3220f;
            z = false;
            z2 = false;
            i4 = iM1732L1;
        }
        c0245b.m825j(C0245b.c.m828a(i4, i, i2, i3, z, z2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: p */
    public int mo1751p(RecyclerView.C0549w c0549w) {
        return m1785e1(c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: q0 */
    public void mo1752q0(RecyclerView recyclerView, int i, int i2) {
        this.f3217M.f3221a.clear();
        this.f3217M.f3222b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (iM1938R >= 0 && iM1938R < i3 && m1734M1(c0544r, c0549w, iM1938R) == 0) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: r0 */
    public void mo1754r0(RecyclerView recyclerView) {
        this.f3217M.f3221a.clear();
        this.f3217M.f3222b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: s0 */
    public void mo1755s0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3217M.f3221a.clear();
        this.f3217M.f3222b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: t0 */
    public void mo1756t0(RecyclerView recyclerView, int i, int i2) {
        this.f3217M.f3221a.clear();
        this.f3217M.f3222b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: u */
    public RecyclerView.C0539m mo1757u() {
        return this.f3229r == 0 ? new C0521b(-2, -1) : new C0521b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: v */
    public RecyclerView.C0539m mo1758v(Context context, AttributeSet attributeSet) {
        return new C0521b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: v0 */
    public void mo1759v0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3217M.f3221a.clear();
        this.f3217M.f3222b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w */
    public RecyclerView.C0539m mo1760w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0521b((ViewGroup.MarginLayoutParams) layoutParams) : new C0521b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w0 */
    public void mo1761w0(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (c0549w.f3412g) {
            int iM1967y = m1967y();
            for (int i = 0; i < iM1967y; i++) {
                C0521b c0521b = (C0521b) m1966x(i).getLayoutParams();
                int iM1970a = c0521b.m1970a();
                this.f3215K.put(iM1970a, c0521b.f3220f);
                this.f3216L.put(iM1970a, c0521b.f3219e);
            }
        }
        super.mo1761w0(c0544r, c0549w);
        this.f3215K.clear();
        this.f3216L.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1762w1(androidx.recyclerview.widget.RecyclerView.C0544r r19, androidx.recyclerview.widget.RecyclerView.C0549w r20, androidx.recyclerview.widget.LinearLayoutManager.C0525c r21, androidx.recyclerview.widget.LinearLayoutManager.C0524b r22) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1762w1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: x0 */
    public void mo1763x0(RecyclerView.C0549w c0549w) {
        this.f3224B = null;
        this.f3237z = -1;
        this.f3223A = Integer.MIN_VALUE;
        this.f3225C.m1815d();
        this.f3211G = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: x1 */
    public void mo1764x1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, LinearLayoutManager.C0523a c0523a, int i) {
        m1741R1();
        if (c0549w.m1995b() > 0 && !c0549w.f3412g) {
            boolean z = i == 1;
            int iM1734M1 = m1734M1(c0544r, c0549w, c0523a.f3239b);
            if (z) {
                while (iM1734M1 > 0) {
                    int i2 = c0523a.f3239b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0523a.f3239b = i3;
                    iM1734M1 = m1734M1(c0544r, c0549w, i3);
                }
            } else {
                int iM1995b = c0549w.m1995b() - 1;
                int i4 = c0523a.f3239b;
                while (i4 < iM1995b) {
                    int i5 = i4 + 1;
                    int iM1734M12 = m1734M1(c0544r, c0549w, i5);
                    if (iM1734M12 <= iM1734M1) {
                        break;
                    }
                    i4 = i5;
                    iM1734M1 = iM1734M12;
                }
                c0523a.f3239b = i4;
            }
        }
        m1730J1();
    }
}

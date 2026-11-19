package p000a.p060o.p061b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.b.p */
/* loaded from: classes.dex */
public class C0393p extends AbstractC0402y {

    /* renamed from: d */
    public AbstractC0397t f2335d;

    /* renamed from: e */
    public AbstractC0397t f2336e;

    @Override // p000a.p060o.p061b.AbstractC0402y
    /* renamed from: a */
    public int[] mo1384a(RecyclerView.AbstractC0538l abstractC0538l, View view) {
        int[] iArr = new int[2];
        if (abstractC0538l.mo1784e()) {
            iArr[0] = m1386d(view, m1389g(abstractC0538l));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0538l.mo1786f()) {
            iArr[1] = m1386d(view, m1390h(abstractC0538l));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p000a.p060o.p061b.AbstractC0402y
    /* renamed from: b */
    public View mo1385b(RecyclerView.AbstractC0538l abstractC0538l) {
        AbstractC0397t abstractC0397tM1389g;
        if (abstractC0538l.mo1786f()) {
            abstractC0397tM1389g = m1390h(abstractC0538l);
        } else {
            if (!abstractC0538l.mo1784e()) {
                return null;
            }
            abstractC0397tM1389g = m1389g(abstractC0538l);
        }
        return m1388f(abstractC0538l, abstractC0397tM1389g);
    }

    /* renamed from: d */
    public final int m1386d(View view, AbstractC0397t abstractC0397t) {
        return ((abstractC0397t.mo1392c(view) / 2) + abstractC0397t.mo1394e(view)) - ((abstractC0397t.mo1401l() / 2) + abstractC0397t.mo1400k());
    }

    /* renamed from: e */
    public final int m1387e(RecyclerView.AbstractC0538l abstractC0538l, AbstractC0397t abstractC0397t, int i, int i2) {
        int iMax;
        this.f2349b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f2349b.getFinalX(), this.f2349b.getFinalY()};
        int iM1967y = abstractC0538l.m1967y();
        float f2 = 1.0f;
        if (iM1967y != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iM1967y; i5++) {
                View viewM1966x = abstractC0538l.m1966x(i5);
                int iM1938R = abstractC0538l.m1938R(viewM1966x);
                if (iM1938R != -1) {
                    if (iM1938R < i4) {
                        view = viewM1966x;
                        i4 = iM1938R;
                    }
                    if (iM1938R > i3) {
                        view2 = viewM1966x;
                        i3 = iM1938R;
                    }
                }
            }
            if (view != null && view2 != null && (iMax = Math.max(abstractC0397t.mo1391b(view), abstractC0397t.mo1391b(view2)) - Math.min(abstractC0397t.mo1394e(view), abstractC0397t.mo1394e(view2))) != 0) {
                f2 = (iMax * 1.0f) / ((i3 - i4) + 1);
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f2);
    }

    /* renamed from: f */
    public final View m1388f(RecyclerView.AbstractC0538l abstractC0538l, AbstractC0397t abstractC0397t) {
        int iM1967y = abstractC0538l.m1967y();
        View view = null;
        if (iM1967y == 0) {
            return null;
        }
        int iMo1401l = (abstractC0397t.mo1401l() / 2) + abstractC0397t.mo1400k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM1967y; i2++) {
            View viewM1966x = abstractC0538l.m1966x(i2);
            int iAbs = Math.abs(((abstractC0397t.mo1392c(viewM1966x) / 2) + abstractC0397t.mo1394e(viewM1966x)) - iMo1401l);
            if (iAbs < i) {
                view = viewM1966x;
                i = iAbs;
            }
        }
        return view;
    }

    /* renamed from: g */
    public final AbstractC0397t m1389g(RecyclerView.AbstractC0538l abstractC0538l) {
        AbstractC0397t abstractC0397t = this.f2336e;
        if (abstractC0397t == null || abstractC0397t.f2338a != abstractC0538l) {
            this.f2336e = new C0395r(abstractC0538l);
        }
        return this.f2336e;
    }

    /* renamed from: h */
    public final AbstractC0397t m1390h(RecyclerView.AbstractC0538l abstractC0538l) {
        AbstractC0397t abstractC0397t = this.f2335d;
        if (abstractC0397t == null || abstractC0397t.f2338a != abstractC0538l) {
            this.f2335d = new C0396s(abstractC0538l);
        }
        return this.f2335d;
    }
}

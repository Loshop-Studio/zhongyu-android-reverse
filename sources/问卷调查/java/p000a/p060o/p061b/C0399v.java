package p000a.p060o.p061b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p060o.p061b.C0376a;

/* renamed from: a.o.b.v */
/* loaded from: classes.dex */
public class C0399v implements C0376a.a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2342a;

    public C0399v(RecyclerView recyclerView) {
        this.f2342a = recyclerView;
    }

    /* renamed from: a */
    public void m1410a(C0376a.b bVar) {
        int i = bVar.f2194a;
        if (i == 1) {
            RecyclerView recyclerView = this.f2342a;
            recyclerView.f3311m.mo1752q0(recyclerView, bVar.f2195b, bVar.f2197d);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView2 = this.f2342a;
            recyclerView2.f3311m.mo1756t0(recyclerView2, bVar.f2195b, bVar.f2197d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f2342a;
            recyclerView3.f3311m.mo1759v0(recyclerView3, bVar.f2195b, bVar.f2197d, bVar.f2196c);
        } else {
            if (i != 8) {
                return;
            }
            RecyclerView recyclerView4 = this.f2342a;
            recyclerView4.f3311m.mo1755s0(recyclerView4, bVar.f2195b, bVar.f2197d, 1);
        }
    }

    /* renamed from: b */
    public RecyclerView.AbstractC0552z m1411b(int i) {
        RecyclerView recyclerView = this.f2342a;
        int iM1331h = recyclerView.f3297f.m1331h();
        int i2 = 0;
        RecyclerView.AbstractC0552z abstractC0552z = null;
        while (true) {
            if (i2 >= iM1331h) {
                break;
            }
            RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(recyclerView.f3297f.m1330g(i2));
            if (abstractC0552zM1821K != null && !abstractC0552zM1821K.m2010l() && abstractC0552zM1821K.f3430c == i) {
                if (!recyclerView.f3297f.m1334k(abstractC0552zM1821K.f3428a)) {
                    abstractC0552z = abstractC0552zM1821K;
                    break;
                }
                abstractC0552z = abstractC0552zM1821K;
            }
            i2++;
        }
        if (abstractC0552z == null || this.f2342a.f3297f.m1334k(abstractC0552z.f3428a)) {
            return null;
        }
        return abstractC0552z;
    }

    /* renamed from: c */
    public void m1412c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2342a;
        int iM1331h = recyclerView.f3297f.m1331h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM1331h; i6++) {
            View viewM1330g = recyclerView.f3297f.m1330g(i6);
            RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(viewM1330g);
            if (abstractC0552zM1821K != null && !abstractC0552zM1821K.m2018t() && (i4 = abstractC0552zM1821K.f3430c) >= i && i4 < i5) {
                abstractC0552zM1821K.m2000b(2);
                abstractC0552zM1821K.m1999a(obj);
                ((RecyclerView.C0539m) viewM1330g.getLayoutParams()).f3373c = true;
            }
        }
        RecyclerView.C0544r c0544r = recyclerView.f3291c;
        int size = c0544r.f3383c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f2342a.f3306j0 = true;
                return;
            }
            RecyclerView.AbstractC0552z abstractC0552z = c0544r.f3383c.get(size);
            if (abstractC0552z != null && (i3 = abstractC0552z.f3430c) >= i && i3 < i5) {
                abstractC0552z.m2000b(2);
                c0544r.m1981g(size);
            }
        }
    }

    /* renamed from: d */
    public void m1413d(int i, int i2) {
        RecyclerView recyclerView = this.f2342a;
        int iM1331h = recyclerView.f3297f.m1331h();
        for (int i3 = 0; i3 < iM1331h; i3++) {
            RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(recyclerView.f3297f.m1330g(i3));
            if (abstractC0552zM1821K != null && !abstractC0552zM1821K.m2018t() && abstractC0552zM1821K.f3430c >= i) {
                abstractC0552zM1821K.m2014p(i2, false);
                recyclerView.f3298f0.f3411f = true;
            }
        }
        RecyclerView.C0544r c0544r = recyclerView.f3291c;
        int size = c0544r.f3383c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.AbstractC0552z abstractC0552z = c0544r.f3383c.get(i4);
            if (abstractC0552z != null && abstractC0552z.f3430c >= i) {
                abstractC0552z.m2014p(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f2342a.f3304i0 = true;
    }

    /* renamed from: e */
    public void m1414e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2342a;
        int iM1331h = recyclerView.f3297f.m1331h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM1331h; i11++) {
            RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(recyclerView.f3297f.m1330g(i11));
            if (abstractC0552zM1821K != null && (i9 = abstractC0552zM1821K.f3430c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    abstractC0552zM1821K.m2014p(i2 - i, false);
                } else {
                    abstractC0552zM1821K.m2014p(i5, false);
                }
                recyclerView.f3298f0.f3411f = true;
            }
        }
        RecyclerView.C0544r c0544r = recyclerView.f3291c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = c0544r.f3383c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.AbstractC0552z abstractC0552z = c0544r.f3383c.get(i12);
            if (abstractC0552z != null && (i8 = abstractC0552z.f3430c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0552z.m2014p(i2 - i, false);
                } else {
                    abstractC0552z.m2014p(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2342a.f3304i0 = true;
    }
}

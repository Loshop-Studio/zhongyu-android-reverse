package p000a.p060o.p061b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.o.b.k */
/* loaded from: classes.dex */
public class C0388k extends AbstractC0401x {

    /* renamed from: s */
    public static TimeInterpolator f2244s;

    /* renamed from: h */
    public ArrayList<RecyclerView.AbstractC0552z> f2245h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.AbstractC0552z> f2246i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<b> f2247j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<a> f2248k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.AbstractC0552z>> f2249l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<b>> f2250m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<a>> f2251n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.AbstractC0552z> f2252o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.AbstractC0552z> f2253p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.AbstractC0552z> f2254q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.AbstractC0552z> f2255r = new ArrayList<>();

    /* renamed from: a.o.b.k$a */
    public static class a {

        /* renamed from: a */
        public RecyclerView.AbstractC0552z f2256a;

        /* renamed from: b */
        public RecyclerView.AbstractC0552z f2257b;

        /* renamed from: c */
        public int f2258c;

        /* renamed from: d */
        public int f2259d;

        /* renamed from: e */
        public int f2260e;

        /* renamed from: f */
        public int f2261f;

        public a(RecyclerView.AbstractC0552z abstractC0552z, RecyclerView.AbstractC0552z abstractC0552z2, int i, int i2, int i3, int i4) {
            this.f2256a = abstractC0552z;
            this.f2257b = abstractC0552z2;
            this.f2258c = i;
            this.f2259d = i2;
            this.f2260e = i3;
            this.f2261f = i4;
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("ChangeInfo{oldHolder=");
            sbM2079g.append(this.f2256a);
            sbM2079g.append(", newHolder=");
            sbM2079g.append(this.f2257b);
            sbM2079g.append(", fromX=");
            sbM2079g.append(this.f2258c);
            sbM2079g.append(", fromY=");
            sbM2079g.append(this.f2259d);
            sbM2079g.append(", toX=");
            sbM2079g.append(this.f2260e);
            sbM2079g.append(", toY=");
            sbM2079g.append(this.f2261f);
            sbM2079g.append('}');
            return sbM2079g.toString();
        }
    }

    /* renamed from: a.o.b.k$b */
    public static class b {

        /* renamed from: a */
        public RecyclerView.AbstractC0552z f2262a;

        /* renamed from: b */
        public int f2263b;

        /* renamed from: c */
        public int f2264c;

        /* renamed from: d */
        public int f2265d;

        /* renamed from: e */
        public int f2266e;

        public b(RecyclerView.AbstractC0552z abstractC0552z, int i, int i2, int i3, int i4) {
            this.f2262a = abstractC0552z;
            this.f2263b = i;
            this.f2264c = i2;
            this.f2265d = i3;
            this.f2266e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0535i
    /* renamed from: e */
    public void mo1354e(RecyclerView.AbstractC0552z abstractC0552z) {
        View view = abstractC0552z.f3428a;
        view.animate().cancel();
        int size = this.f2247j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f2247j.get(size).f2262a == abstractC0552z) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m1901c(abstractC0552z);
                this.f2247j.remove(size);
            }
        }
        m1360l(this.f2248k, abstractC0552z);
        if (this.f2245h.remove(abstractC0552z)) {
            view.setAlpha(1.0f);
            m1901c(abstractC0552z);
        }
        if (this.f2246i.remove(abstractC0552z)) {
            view.setAlpha(1.0f);
            m1901c(abstractC0552z);
        }
        int size2 = this.f2251n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.f2251n.get(size2);
            m1360l(arrayList, abstractC0552z);
            if (arrayList.isEmpty()) {
                this.f2251n.remove(size2);
            }
        }
        int size3 = this.f2250m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.f2250m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f2262a == abstractC0552z) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m1901c(abstractC0552z);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2250m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2249l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f2254q.remove(abstractC0552z);
                this.f2252o.remove(abstractC0552z);
                this.f2255r.remove(abstractC0552z);
                this.f2253p.remove(abstractC0552z);
                m1359k();
                return;
            }
            ArrayList<RecyclerView.AbstractC0552z> arrayList3 = this.f2249l.get(size5);
            if (arrayList3.remove(abstractC0552z)) {
                view.setAlpha(1.0f);
                m1901c(abstractC0552z);
                if (arrayList3.isEmpty()) {
                    this.f2249l.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0535i
    /* renamed from: f */
    public void mo1355f() {
        int size = this.f2247j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2247j.get(size);
            View view = bVar.f2262a.f3428a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m1901c(bVar.f2262a);
            this.f2247j.remove(size);
        }
        int size2 = this.f2245h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m1901c(this.f2245h.get(size2));
            this.f2245h.remove(size2);
        }
        int size3 = this.f2246i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0552z abstractC0552z = this.f2246i.get(size3);
            abstractC0552z.f3428a.setAlpha(1.0f);
            m1901c(abstractC0552z);
            this.f2246i.remove(size3);
        }
        int size4 = this.f2248k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f2248k.get(size4);
            RecyclerView.AbstractC0552z abstractC0552z2 = aVar.f2256a;
            if (abstractC0552z2 != null) {
                m1361m(aVar, abstractC0552z2);
            }
            RecyclerView.AbstractC0552z abstractC0552z3 = aVar.f2257b;
            if (abstractC0552z3 != null) {
                m1361m(aVar, abstractC0552z3);
            }
        }
        this.f2248k.clear();
        if (!mo1356g()) {
            return;
        }
        int size5 = this.f2250m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.f2250m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f2262a.f3428a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m1901c(bVar2.f2262a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2250m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f2249l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.AbstractC0552z> arrayList2 = this.f2249l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.AbstractC0552z abstractC0552z4 = arrayList2.get(size8);
                    abstractC0552z4.f3428a.setAlpha(1.0f);
                    m1901c(abstractC0552z4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2249l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f2251n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                m1358j(this.f2254q);
                m1358j(this.f2253p);
                m1358j(this.f2252o);
                m1358j(this.f2255r);
                m1902d();
                return;
            }
            ArrayList<a> arrayList3 = this.f2251n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    a aVar2 = arrayList3.get(size10);
                    RecyclerView.AbstractC0552z abstractC0552z5 = aVar2.f2256a;
                    if (abstractC0552z5 != null) {
                        m1361m(aVar2, abstractC0552z5);
                    }
                    RecyclerView.AbstractC0552z abstractC0552z6 = aVar2.f2257b;
                    if (abstractC0552z6 != null) {
                        m1361m(aVar2, abstractC0552z6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f2251n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0535i
    /* renamed from: g */
    public boolean mo1356g() {
        return (this.f2246i.isEmpty() && this.f2248k.isEmpty() && this.f2247j.isEmpty() && this.f2245h.isEmpty() && this.f2253p.isEmpty() && this.f2254q.isEmpty() && this.f2252o.isEmpty() && this.f2255r.isEmpty() && this.f2250m.isEmpty() && this.f2249l.isEmpty() && this.f2251n.isEmpty()) ? false : true;
    }

    @Override // p000a.p060o.p061b.AbstractC0401x
    /* renamed from: i */
    public boolean mo1357i(RecyclerView.AbstractC0552z abstractC0552z, int i, int i2, int i3, int i4) {
        View view = abstractC0552z.f3428a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0552z.f3428a.getTranslationY());
        m1362n(abstractC0552z);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m1901c(abstractC0552z);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f2247j.add(new b(abstractC0552z, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: j */
    public void m1358j(List<RecyclerView.AbstractC0552z> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).f3428a.animate().cancel();
            }
        }
    }

    /* renamed from: k */
    public void m1359k() {
        if (mo1356g()) {
            return;
        }
        m1902d();
    }

    /* renamed from: l */
    public final void m1360l(List<a> list, RecyclerView.AbstractC0552z abstractC0552z) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = list.get(size);
            if (m1361m(aVar, abstractC0552z) && aVar.f2256a == null && aVar.f2257b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: m */
    public final boolean m1361m(a aVar, RecyclerView.AbstractC0552z abstractC0552z) {
        if (aVar.f2257b == abstractC0552z) {
            aVar.f2257b = null;
        } else {
            if (aVar.f2256a != abstractC0552z) {
                return false;
            }
            aVar.f2256a = null;
        }
        abstractC0552z.f3428a.setAlpha(1.0f);
        abstractC0552z.f3428a.setTranslationX(0.0f);
        abstractC0552z.f3428a.setTranslationY(0.0f);
        m1901c(abstractC0552z);
        return true;
    }

    /* renamed from: n */
    public final void m1362n(RecyclerView.AbstractC0552z abstractC0552z) {
        if (f2244s == null) {
            f2244s = new ValueAnimator().getInterpolator();
        }
        abstractC0552z.f3428a.animate().setInterpolator(f2244s);
        mo1354e(abstractC0552z);
    }
}

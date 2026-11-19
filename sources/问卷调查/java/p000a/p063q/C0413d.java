package p000a.p063q;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p052k.p053b.AbstractC0337u0;
import p000a.p063q.AbstractC0417h;
import p000a.p063q.C0421l;

@SuppressLint({"RestrictedApi"})
/* renamed from: a.q.d */
/* loaded from: classes.dex */
public class C0413d extends AbstractC0337u0 {

    /* renamed from: a.q.d$a */
    public class a extends AbstractC0417h.c {
        public a(C0413d c0413d, Rect rect) {
        }
    }

    /* renamed from: a.q.d$b */
    public class b implements AbstractC0417h.d {

        /* renamed from: a */
        public final /* synthetic */ View f2399a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2400b;

        public b(C0413d c0413d, View view, ArrayList arrayList) {
            this.f2399a = view;
            this.f2400b = arrayList;
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: a */
        public void mo1432a(AbstractC0417h abstractC0417h) {
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: b */
        public void mo1433b(AbstractC0417h abstractC0417h) {
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) {
            abstractC0417h.mo1467v(this);
            this.f2399a.setVisibility(8);
            int size = this.f2400b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2400b.get(i)).setVisibility(0);
            }
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: d */
        public void mo1435d(AbstractC0417h abstractC0417h) {
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: e */
        public void mo1436e(AbstractC0417h abstractC0417h) {
        }
    }

    /* renamed from: a.q.d$c */
    public class c extends C0420k {

        /* renamed from: a */
        public final /* synthetic */ Object f2401a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2402b;

        /* renamed from: c */
        public final /* synthetic */ Object f2403c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2404d;

        /* renamed from: e */
        public final /* synthetic */ Object f2405e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2406f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2401a = obj;
            this.f2402b = arrayList;
            this.f2403c = obj2;
            this.f2404d = arrayList2;
            this.f2405e = obj3;
            this.f2406f = arrayList3;
        }

        @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
        /* renamed from: a */
        public void mo1432a(AbstractC0417h abstractC0417h) {
            Object obj = this.f2401a;
            if (obj != null) {
                C0413d.this.mo1225p(obj, this.f2402b, null);
            }
            Object obj2 = this.f2403c;
            if (obj2 != null) {
                C0413d.this.mo1225p(obj2, this.f2404d, null);
            }
            Object obj3 = this.f2405e;
            if (obj3 != null) {
                C0413d.this.mo1225p(obj3, this.f2406f, null);
            }
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) {
            abstractC0417h.mo1467v(this);
        }
    }

    /* renamed from: a.q.d$d */
    public class d extends AbstractC0417h.c {
        public d(C0413d c0413d, Rect rect) {
        }
    }

    /* renamed from: z */
    public static boolean m1442z(AbstractC0417h abstractC0417h) {
        return (AbstractC0337u0.m1236k(abstractC0417h.f2415f) && AbstractC0337u0.m1236k(null) && AbstractC0337u0.m1236k(null)) ? false : true;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: a */
    public void mo1217a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0417h) obj).mo1455b(view);
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: b */
    public void mo1218b(Object obj, ArrayList<View> arrayList) {
        AbstractC0417h abstractC0417h = (AbstractC0417h) obj;
        if (abstractC0417h == null) {
            return;
        }
        int i = 0;
        if (abstractC0417h instanceof C0423n) {
            C0423n c0423n = (C0423n) abstractC0417h;
            int size = c0423n.f2449y.size();
            while (i < size) {
                mo1218b(c0423n.m1474I(i), arrayList);
                i++;
            }
            return;
        }
        if (m1442z(abstractC0417h) || !AbstractC0337u0.m1236k(abstractC0417h.f2416g)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            abstractC0417h.mo1455b(arrayList.get(i));
            i++;
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: c */
    public void mo1219c(ViewGroup viewGroup, Object obj) {
        AbstractC0417h abstractC0417h = (AbstractC0417h) obj;
        if (C0421l.f2441c.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (viewGroup.isLaidOut()) {
            C0421l.f2441c.add(viewGroup);
            if (abstractC0417h == null) {
                abstractC0417h = C0421l.f2439a;
            }
            AbstractC0417h abstractC0417hClone = abstractC0417h.clone();
            ArrayList<AbstractC0417h> orDefault = C0421l.m1472a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<AbstractC0417h> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().mo1466u(viewGroup);
                }
            }
            if (abstractC0417hClone != null) {
                abstractC0417hClone.m1458h(viewGroup, true);
            }
            if (((C0416g) viewGroup.getTag(C1088R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(C1088R.id.transition_current_scene, null);
            if (abstractC0417hClone != null) {
                C0421l.a aVar = new C0421l.a(abstractC0417hClone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: e */
    public boolean mo1220e(Object obj) {
        return obj instanceof AbstractC0417h;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: g */
    public Object mo1221g(Object obj) {
        if (obj != null) {
            return ((AbstractC0417h) obj).clone();
        }
        return null;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: l */
    public Object mo1222l(Object obj, Object obj2, Object obj3) {
        AbstractC0417h abstractC0417h = (AbstractC0417h) obj;
        AbstractC0417h abstractC0417h2 = (AbstractC0417h) obj2;
        AbstractC0417h abstractC0417h3 = (AbstractC0417h) obj3;
        if (abstractC0417h != null && abstractC0417h2 != null) {
            C0423n c0423n = new C0423n();
            c0423n.m1473H(abstractC0417h);
            c0423n.m1473H(abstractC0417h2);
            c0423n.m1475J(1);
            abstractC0417h = c0423n;
        } else if (abstractC0417h == null) {
            abstractC0417h = abstractC0417h2 != null ? abstractC0417h2 : null;
        }
        if (abstractC0417h3 == null) {
            return abstractC0417h;
        }
        C0423n c0423n2 = new C0423n();
        if (abstractC0417h != null) {
            c0423n2.m1473H(abstractC0417h);
        }
        c0423n2.m1473H(abstractC0417h3);
        return c0423n2;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: m */
    public Object mo1223m(Object obj, Object obj2, Object obj3) {
        C0423n c0423n = new C0423n();
        if (obj != null) {
            c0423n.m1473H((AbstractC0417h) obj);
        }
        if (obj2 != null) {
            c0423n.m1473H((AbstractC0417h) obj2);
        }
        if (obj3 != null) {
            c0423n.m1473H((AbstractC0417h) obj3);
        }
        return c0423n;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: o */
    public void mo1224o(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0417h) obj).mo1468w(view);
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: p */
    public void mo1225p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0417h abstractC0417h = (AbstractC0417h) obj;
        int i = 0;
        if (abstractC0417h instanceof C0423n) {
            C0423n c0423n = (C0423n) abstractC0417h;
            int size = c0423n.f2449y.size();
            while (i < size) {
                mo1225p(c0423n.m1474I(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m1442z(abstractC0417h)) {
            return;
        }
        ArrayList<View> arrayList3 = abstractC0417h.f2416g;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            abstractC0417h.mo1455b(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC0417h.mo1468w(arrayList.get(size3));
            }
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: q */
    public void mo1226q(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0417h) obj).mo1454a(new b(this, view, arrayList));
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: r */
    public void mo1227r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0417h) obj).mo1454a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: s */
    public void mo1228s(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0417h) obj).mo1447A(new d(this, rect));
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: t */
    public void mo1229t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1239j(view, rect);
            ((AbstractC0417h) obj).mo1447A(new a(this, rect));
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: w */
    public void mo1231w(Object obj, View view, ArrayList<View> arrayList) {
        C0423n c0423n = (C0423n) obj;
        ArrayList<View> arrayList2 = c0423n.f2416g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0337u0.m1234d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1218b(c0423n, arrayList);
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: x */
    public void mo1232x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0423n c0423n = (C0423n) obj;
        if (c0423n != null) {
            c0423n.f2416g.clear();
            c0423n.f2416g.addAll(arrayList2);
            mo1225p(c0423n, arrayList, arrayList2);
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: y */
    public Object mo1233y(Object obj) {
        if (obj == null) {
            return null;
        }
        C0423n c0423n = new C0423n();
        c0423n.m1473H((AbstractC0417h) obj);
        return c0423n;
    }
}

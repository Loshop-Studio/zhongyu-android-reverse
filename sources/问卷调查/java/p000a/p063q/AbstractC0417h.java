package p000a.p063q;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.p021e.C0129a;
import p000a.p021e.C0132d;
import p000a.p021e.C0133e;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.q.h */
/* loaded from: classes.dex */
public abstract class AbstractC0417h implements Cloneable {

    /* renamed from: v */
    public static final int[] f2408v = {2, 1, 3, 4};

    /* renamed from: w */
    public static final AbstractC0414e f2409w = new a();

    /* renamed from: x */
    public static ThreadLocal<C0129a<Animator, b>> f2410x = new ThreadLocal<>();

    /* renamed from: l */
    public ArrayList<C0425p> f2421l;

    /* renamed from: m */
    public ArrayList<C0425p> f2422m;

    /* renamed from: t */
    public c f2429t;

    /* renamed from: b */
    public String f2411b = getClass().getName();

    /* renamed from: c */
    public long f2412c = -1;

    /* renamed from: d */
    public long f2413d = -1;

    /* renamed from: e */
    public TimeInterpolator f2414e = null;

    /* renamed from: f */
    public ArrayList<Integer> f2415f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f2416g = new ArrayList<>();

    /* renamed from: h */
    public C0426q f2417h = new C0426q();

    /* renamed from: i */
    public C0426q f2418i = new C0426q();

    /* renamed from: j */
    public C0423n f2419j = null;

    /* renamed from: k */
    public int[] f2420k = f2408v;

    /* renamed from: n */
    public ArrayList<Animator> f2423n = new ArrayList<>();

    /* renamed from: o */
    public int f2424o = 0;

    /* renamed from: p */
    public boolean f2425p = false;

    /* renamed from: q */
    public boolean f2426q = false;

    /* renamed from: r */
    public ArrayList<d> f2427r = null;

    /* renamed from: s */
    public ArrayList<Animator> f2428s = new ArrayList<>();

    /* renamed from: u */
    public AbstractC0414e f2430u = f2409w;

    /* renamed from: a.q.h$a */
    public static class a extends AbstractC0414e {
        @Override // p000a.p063q.AbstractC0414e
        /* renamed from: a */
        public Path mo1443a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* renamed from: a.q.h$b */
    public static class b {

        /* renamed from: a */
        public View f2431a;

        /* renamed from: b */
        public String f2432b;

        /* renamed from: c */
        public C0425p f2433c;

        /* renamed from: d */
        public InterfaceC0412c0 f2434d;

        /* renamed from: e */
        public AbstractC0417h f2435e;

        public b(View view, String str, AbstractC0417h abstractC0417h, InterfaceC0412c0 interfaceC0412c0, C0425p c0425p) {
            this.f2431a = view;
            this.f2432b = str;
            this.f2433c = c0425p;
            this.f2434d = interfaceC0412c0;
            this.f2435e = abstractC0417h;
        }
    }

    /* renamed from: a.q.h$c */
    public static abstract class c {
    }

    /* renamed from: a.q.h$d */
    public interface d {
        /* renamed from: a */
        void mo1432a(AbstractC0417h abstractC0417h);

        /* renamed from: b */
        void mo1433b(AbstractC0417h abstractC0417h);

        /* renamed from: c */
        void mo1434c(AbstractC0417h abstractC0417h);

        /* renamed from: d */
        void mo1435d(AbstractC0417h abstractC0417h);

        /* renamed from: e */
        void mo1436e(AbstractC0417h abstractC0417h);
    }

    /* renamed from: c */
    public static void m1444c(C0426q c0426q, View view, C0425p c0425p) {
        c0426q.f2459a.put(view, c0425p);
        int id = view.getId();
        if (id >= 0) {
            if (c0426q.f2460b.indexOfKey(id) >= 0) {
                c0426q.f2460b.put(id, null);
            } else {
                c0426q.f2460b.put(id, view);
            }
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c0426q.f2462d.m511e(transitionName) >= 0) {
                c0426q.f2462d.put(transitionName, null);
            } else {
                c0426q.f2462d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0133e<View> c0133e = c0426q.f2461c;
                if (c0133e.f918b) {
                    c0133e.m494d();
                }
                if (C0132d.m486b(c0133e.f919c, c0133e.f921e, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0426q.f2461c.m497g(itemIdAtPosition, view);
                    return;
                }
                View viewM495e = c0426q.f2461c.m495e(itemIdAtPosition);
                if (viewM495e != null) {
                    viewM495e.setHasTransientState(false);
                    c0426q.f2461c.m497g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: o */
    public static C0129a<Animator, b> m1445o() {
        C0129a<Animator, b> c0129a = f2410x.get();
        if (c0129a != null) {
            return c0129a;
        }
        C0129a<Animator, b> c0129a2 = new C0129a<>();
        f2410x.set(c0129a2);
        return c0129a2;
    }

    /* renamed from: t */
    public static boolean m1446t(C0425p c0425p, C0425p c0425p2, String str) {
        Object obj = c0425p.f2456a.get(str);
        Object obj2 = c0425p2.f2456a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo1447A(c cVar) {
        this.f2429t = cVar;
    }

    /* renamed from: B */
    public AbstractC0417h mo1448B(TimeInterpolator timeInterpolator) {
        this.f2414e = timeInterpolator;
        return this;
    }

    /* renamed from: C */
    public void mo1449C(AbstractC0414e abstractC0414e) {
        if (abstractC0414e == null) {
            abstractC0414e = f2409w;
        }
        this.f2430u = abstractC0414e;
    }

    /* renamed from: D */
    public void mo1450D(AbstractC0422m abstractC0422m) {
    }

    /* renamed from: E */
    public AbstractC0417h mo1451E(long j) {
        this.f2412c = j;
        return this;
    }

    /* renamed from: F */
    public void m1452F() {
        if (this.f2424o == 0) {
            ArrayList<d> arrayList = this.f2427r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2427r.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).mo1432a(this);
                }
            }
            this.f2426q = false;
        }
        this.f2424o++;
    }

    /* renamed from: G */
    public String mo1453G(String str) {
        StringBuilder sbM2079g = C0561a.m2079g(str);
        sbM2079g.append(getClass().getSimpleName());
        sbM2079g.append("@");
        sbM2079g.append(Integer.toHexString(hashCode()));
        sbM2079g.append(": ");
        String string = sbM2079g.toString();
        if (this.f2413d != -1) {
            string = string + "dur(" + this.f2413d + ") ";
        }
        if (this.f2412c != -1) {
            string = string + "dly(" + this.f2412c + ") ";
        }
        if (this.f2414e != null) {
            string = string + "interp(" + this.f2414e + ") ";
        }
        if (this.f2415f.size() <= 0 && this.f2416g.size() <= 0) {
            return string;
        }
        String strM2076d = C0561a.m2076d(string, "tgts(");
        if (this.f2415f.size() > 0) {
            for (int i = 0; i < this.f2415f.size(); i++) {
                if (i > 0) {
                    strM2076d = C0561a.m2076d(strM2076d, ", ");
                }
                StringBuilder sbM2079g2 = C0561a.m2079g(strM2076d);
                sbM2079g2.append(this.f2415f.get(i));
                strM2076d = sbM2079g2.toString();
            }
        }
        if (this.f2416g.size() > 0) {
            for (int i2 = 0; i2 < this.f2416g.size(); i2++) {
                if (i2 > 0) {
                    strM2076d = C0561a.m2076d(strM2076d, ", ");
                }
                StringBuilder sbM2079g3 = C0561a.m2079g(strM2076d);
                sbM2079g3.append(this.f2416g.get(i2));
                strM2076d = sbM2079g3.toString();
            }
        }
        return C0561a.m2076d(strM2076d, ")");
    }

    /* renamed from: a */
    public AbstractC0417h mo1454a(d dVar) {
        if (this.f2427r == null) {
            this.f2427r = new ArrayList<>();
        }
        this.f2427r.add(dVar);
        return this;
    }

    /* renamed from: b */
    public AbstractC0417h mo1455b(View view) {
        this.f2416g.add(view);
        return this;
    }

    /* renamed from: d */
    public abstract void mo1428d(C0425p c0425p);

    /* renamed from: e */
    public final void m1456e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0425p c0425p = new C0425p(view);
            if (z) {
                mo1440g(c0425p);
            } else {
                mo1428d(c0425p);
            }
            c0425p.f2458c.add(this);
            mo1457f(c0425p);
            m1444c(z ? this.f2417h : this.f2418i, view, c0425p);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1456e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: f */
    public void mo1457f(C0425p c0425p) {
    }

    /* renamed from: g */
    public abstract void mo1440g(C0425p c0425p);

    /* renamed from: h */
    public void m1458h(ViewGroup viewGroup, boolean z) {
        m1459i(z);
        if (this.f2415f.size() <= 0 && this.f2416g.size() <= 0) {
            m1456e(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f2415f.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(this.f2415f.get(i).intValue());
            if (viewFindViewById != null) {
                C0425p c0425p = new C0425p(viewFindViewById);
                if (z) {
                    mo1440g(c0425p);
                } else {
                    mo1428d(c0425p);
                }
                c0425p.f2458c.add(this);
                mo1457f(c0425p);
                m1444c(z ? this.f2417h : this.f2418i, viewFindViewById, c0425p);
            }
        }
        for (int i2 = 0; i2 < this.f2416g.size(); i2++) {
            View view = this.f2416g.get(i2);
            C0425p c0425p2 = new C0425p(view);
            if (z) {
                mo1440g(c0425p2);
            } else {
                mo1428d(c0425p2);
            }
            c0425p2.f2458c.add(this);
            mo1457f(c0425p2);
            m1444c(z ? this.f2417h : this.f2418i, view, c0425p2);
        }
    }

    /* renamed from: i */
    public void m1459i(boolean z) {
        C0426q c0426q;
        if (z) {
            this.f2417h.f2459a.clear();
            this.f2417h.f2460b.clear();
            c0426q = this.f2417h;
        } else {
            this.f2418i.f2459a.clear();
            this.f2418i.f2460b.clear();
            c0426q = this.f2418i;
        }
        c0426q.f2461c.m492b();
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC0417h clone() {
        try {
            AbstractC0417h abstractC0417h = (AbstractC0417h) super.clone();
            abstractC0417h.f2428s = new ArrayList<>();
            abstractC0417h.f2417h = new C0426q();
            abstractC0417h.f2418i = new C0426q();
            abstractC0417h.f2421l = null;
            abstractC0417h.f2422m = null;
            return abstractC0417h;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public Animator mo1429k(ViewGroup viewGroup, C0425p c0425p, C0425p c0425p2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1461l(android.view.ViewGroup r20, p000a.p063q.C0426q r21, p000a.p063q.C0426q r22, java.util.ArrayList<p000a.p063q.C0425p> r23, java.util.ArrayList<p000a.p063q.C0425p> r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p063q.AbstractC0417h.mo1461l(android.view.ViewGroup, a.q.q, a.q.q, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: m */
    public void m1462m() {
        int i = this.f2424o - 1;
        this.f2424o = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.f2427r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2427r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).mo1434c(this);
                }
            }
            for (int i3 = 0; i3 < this.f2417h.f2461c.m498h(); i3++) {
                View viewM499i = this.f2417h.f2461c.m499i(i3);
                if (viewM499i != null) {
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    viewM499i.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.f2418i.f2461c.m498h(); i4++) {
                View viewM499i2 = this.f2418i.f2461c.m499i(i4);
                if (viewM499i2 != null) {
                    WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                    viewM499i2.setHasTransientState(false);
                }
            }
            this.f2426q = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.f2422m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.f2421l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000a.p063q.C0425p m1463n(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            a.q.n r0 = r6.f2419j
            if (r0 == 0) goto L9
            a.q.p r7 = r0.m1463n(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<a.q.p> r0 = r6.f2421l
            goto L10
        Le:
            java.util.ArrayList<a.q.p> r0 = r6.f2422m
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            a.q.p r5 = (p000a.p063q.C0425p) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f2457b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<a.q.p> r7 = r6.f2422m
            goto L37
        L35:
            java.util.ArrayList<a.q.p> r7 = r6.f2421l
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            a.q.p r1 = (p000a.p063q.C0425p) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p063q.AbstractC0417h.m1463n(android.view.View, boolean):a.q.p");
    }

    /* renamed from: p */
    public String[] mo1430p() {
        return null;
    }

    /* renamed from: q */
    public C0425p m1464q(View view, boolean z) {
        C0423n c0423n = this.f2419j;
        if (c0423n != null) {
            return c0423n.m1464q(view, z);
        }
        return (z ? this.f2417h : this.f2418i).f2459a.getOrDefault(view, null);
    }

    /* renamed from: r */
    public boolean mo1431r(C0425p c0425p, C0425p c0425p2) {
        if (c0425p == null || c0425p2 == null) {
            return false;
        }
        String[] strArrMo1430p = mo1430p();
        if (strArrMo1430p == null) {
            Iterator<String> it = c0425p.f2456a.keySet().iterator();
            while (it.hasNext()) {
                if (m1446t(c0425p, c0425p2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo1430p) {
            if (!m1446t(c0425p, c0425p2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: s */
    public boolean m1465s(View view) {
        return (this.f2415f.size() == 0 && this.f2416g.size() == 0) || this.f2415f.contains(Integer.valueOf(view.getId())) || this.f2416g.contains(view);
    }

    public String toString() {
        return mo1453G(BuildConfig.FLAVOR);
    }

    /* renamed from: u */
    public void mo1466u(View view) {
        if (this.f2426q) {
            return;
        }
        C0129a<Animator, b> c0129aM1445o = m1445o();
        int i = c0129aM1445o.f950d;
        C0434y c0434y = C0428s.f2464a;
        C0410b0 c0410b0 = new C0410b0(view);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            b bVarM517k = c0129aM1445o.m517k(i2);
            if (bVarM517k.f2431a != null && c0410b0.equals(bVarM517k.f2434d)) {
                c0129aM1445o.m514h(i2).pause();
            }
        }
        ArrayList<d> arrayList = this.f2427r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2427r.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((d) arrayList2.get(i3)).mo1435d(this);
            }
        }
        this.f2425p = true;
    }

    /* renamed from: v */
    public AbstractC0417h mo1467v(d dVar) {
        ArrayList<d> arrayList = this.f2427r;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f2427r.size() == 0) {
            this.f2427r = null;
        }
        return this;
    }

    /* renamed from: w */
    public AbstractC0417h mo1468w(View view) {
        this.f2416g.remove(view);
        return this;
    }

    /* renamed from: x */
    public void mo1469x(View view) {
        if (this.f2425p) {
            if (!this.f2426q) {
                C0129a<Animator, b> c0129aM1445o = m1445o();
                int i = c0129aM1445o.f950d;
                C0434y c0434y = C0428s.f2464a;
                C0410b0 c0410b0 = new C0410b0(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    b bVarM517k = c0129aM1445o.m517k(i2);
                    if (bVarM517k.f2431a != null && c0410b0.equals(bVarM517k.f2434d)) {
                        c0129aM1445o.m514h(i2).resume();
                    }
                }
                ArrayList<d> arrayList = this.f2427r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2427r.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList2.get(i3)).mo1436e(this);
                    }
                }
            }
            this.f2425p = false;
        }
    }

    /* renamed from: y */
    public void mo1470y() {
        m1452F();
        C0129a<Animator, b> c0129aM1445o = m1445o();
        Iterator<Animator> it = this.f2428s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c0129aM1445o.containsKey(next)) {
                m1452F();
                if (next != null) {
                    next.addListener(new C0418i(this, c0129aM1445o));
                    long j = this.f2413d;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f2412c;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f2414e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C0419j(this));
                    next.start();
                }
            }
        }
        this.f2428s.clear();
        m1462m();
    }

    /* renamed from: z */
    public AbstractC0417h mo1471z(long j) {
        this.f2413d = j;
        return this;
    }
}

package p000a.p052k.p053b;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p021e.AbstractC0135g;
import p000a.p021e.C0129a;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p039f.C0217a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.ViewTreeObserverOnPreDrawListenerC0265n;
import p000a.p052k.p053b.AbstractC0347z0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.c */
/* loaded from: classes.dex */
public class C0300c extends AbstractC0347z0 {

    /* renamed from: a.k.b.c$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f1784b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC0347z0.d f1785c;

        public a(List list, AbstractC0347z0.d dVar) {
            this.f1784b = list;
            this.f1785c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1784b.contains(this.f1785c)) {
                this.f1784b.remove(this.f1785c);
                C0300c c0300c = C0300c.this;
                AbstractC0347z0.d dVar = this.f1785c;
                Objects.requireNonNull(c0300c);
                dVar.f2135a.m1263a(dVar.f2137c.f1963G);
            }
        }
    }

    /* renamed from: a.k.b.c$b */
    public static class b extends c {

        /* renamed from: c */
        public boolean f1787c;

        /* renamed from: d */
        public boolean f1788d;

        /* renamed from: e */
        public C0334t f1789e;

        public b(AbstractC0347z0.d dVar, C0217a c0217a, boolean z) {
            super(dVar, c0217a);
            this.f1788d = false;
            this.f1787c = z;
        }

        /* renamed from: c */
        public C0334t m1001c(Context context) throws Resources.NotFoundException {
            if (this.f1788d) {
                return this.f1789e;
            }
            AbstractC0347z0.d dVar = this.f1790a;
            C0334t c0334tM689B = C0190e.m689B(context, dVar.f2137c, dVar.f2135a == AbstractC0347z0.d.c.VISIBLE, this.f1787c);
            this.f1789e = c0334tM689B;
            this.f1788d = true;
            return c0334tM689B;
        }
    }

    /* renamed from: a.k.b.c$c */
    public static class c {

        /* renamed from: a */
        public final AbstractC0347z0.d f1790a;

        /* renamed from: b */
        public final C0217a f1791b;

        public c(AbstractC0347z0.d dVar, C0217a c0217a) {
            this.f1790a = dVar;
            this.f1791b = c0217a;
        }

        /* renamed from: a */
        public void m1002a() {
            AbstractC0347z0.d dVar = this.f1790a;
            if (dVar.f2139e.remove(this.f1791b) && dVar.f2139e.isEmpty()) {
                dVar.mo1257b();
            }
        }

        /* renamed from: b */
        public boolean m1003b() {
            AbstractC0347z0.d.c cVar;
            AbstractC0347z0.d.c cVarM1262c = AbstractC0347z0.d.c.m1262c(this.f1790a.f2137c.f1963G);
            AbstractC0347z0.d.c cVar2 = this.f1790a.f2135a;
            return cVarM1262c == cVar2 || !(cVarM1262c == (cVar = AbstractC0347z0.d.c.VISIBLE) || cVar2 == cVar);
        }
    }

    /* renamed from: a.k.b.c$d */
    public static class d extends c {

        /* renamed from: c */
        public final Object f1792c;

        /* renamed from: d */
        public final boolean f1793d;

        /* renamed from: e */
        public final Object f1794e;

        public d(AbstractC0347z0.d dVar, C0217a c0217a, boolean z, boolean z2) {
            Object objM1192z;
            Object objM1190x;
            super(dVar, c0217a);
            if (dVar.f2135a == AbstractC0347z0.d.c.VISIBLE) {
                if (z) {
                    objM1190x = dVar.f2137c.m1190x();
                } else {
                    dVar.f2137c.m1168m();
                    objM1190x = null;
                }
                this.f1792c = objM1190x;
                if (z) {
                    ComponentCallbacksC0320m.b bVar = dVar.f2137c.f1966J;
                } else {
                    ComponentCallbacksC0320m.b bVar2 = dVar.f2137c.f1966J;
                }
            } else {
                if (z) {
                    objM1192z = dVar.f2137c.m1192z();
                } else {
                    dVar.f2137c.m1174p();
                    objM1192z = null;
                }
                this.f1792c = objM1192z;
            }
            this.f1793d = true;
            if (z2) {
                if (z) {
                    this.f1794e = dVar.f2137c.m1131B();
                    return;
                }
                dVar.f2137c.m1130A();
            }
            this.f1794e = null;
        }

        /* renamed from: c */
        public final AbstractC0337u0 m1004c(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0337u0 abstractC0337u0 = C0333s0.f2074b;
            if (obj instanceof Transition) {
                return abstractC0337u0;
            }
            AbstractC0337u0 abstractC0337u02 = C0333s0.f2075c;
            if (abstractC0337u02 != null && abstractC0337u02.mo1220e(obj)) {
                return abstractC0337u02;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1790a.f2137c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C0300c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p052k.p053b.AbstractC0347z0
    /* renamed from: b */
    public void mo997b(List<AbstractC0347z0.d> list, boolean z) throws Resources.NotFoundException {
        AbstractC0347z0.d.c cVar;
        Boolean bool;
        ArrayList arrayList;
        HashMap map;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        AbstractC0347z0.d dVar;
        View view;
        AbstractC0347z0.d.c cVar2;
        View view2;
        ArrayList<View> arrayList2;
        AbstractC0347z0.d.c cVar3;
        Boolean bool2;
        C0129a c0129a;
        AbstractC0347z0.d dVar2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        View view3;
        HashMap map2;
        Rect rect;
        Boolean bool3;
        AbstractC0337u0 abstractC0337u0;
        AbstractC0347z0.d dVar3;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        int i;
        View view4;
        StringBuilder sb;
        String str3;
        C0334t c0334tM1001c;
        Iterator it;
        ArrayList arrayList9;
        boolean z4 = z;
        AbstractC0347z0.d.c cVar4 = AbstractC0347z0.d.c.GONE;
        Boolean bool4 = Boolean.TRUE;
        AbstractC0347z0.d.c cVar5 = AbstractC0347z0.d.c.VISIBLE;
        AbstractC0347z0.d dVar4 = null;
        AbstractC0347z0.d dVar5 = null;
        for (AbstractC0347z0.d dVar6 : list) {
            AbstractC0347z0.d.c cVarM1262c = AbstractC0347z0.d.c.m1262c(dVar6.f2137c.f1963G);
            int iOrdinal = dVar6.f2135a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                    }
                } else if (cVarM1262c != cVar5) {
                    dVar5 = dVar6;
                }
            }
            if (cVarM1262c == cVar5 && dVar4 == null) {
                dVar4 = dVar6;
            }
        }
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(list);
        Iterator<AbstractC0347z0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC0347z0.d next = it2.next();
            C0217a c0217a = new C0217a();
            next.mo1258d();
            next.f2139e.add(c0217a);
            arrayList10.add(new b(next, c0217a, z4));
            C0217a c0217a2 = new C0217a();
            next.mo1258d();
            next.f2139e.add(c0217a2);
            arrayList11.add(new d(next, c0217a2, z4, !z4 ? next != dVar5 : next != dVar4));
            next.f2138d.add(new a(arrayList12, next));
        }
        Boolean bool5 = Boolean.FALSE;
        HashMap map3 = new HashMap();
        Iterator it3 = arrayList11.iterator();
        AbstractC0337u0 abstractC0337u02 = null;
        while (it3.hasNext()) {
            d dVar7 = (d) it3.next();
            if (dVar7.m1003b()) {
                it = it3;
                arrayList9 = arrayList10;
            } else {
                AbstractC0337u0 abstractC0337u0M1004c = dVar7.m1004c(dVar7.f1792c);
                it = it3;
                AbstractC0337u0 abstractC0337u0M1004c2 = dVar7.m1004c(dVar7.f1794e);
                arrayList9 = arrayList10;
                if (abstractC0337u0M1004c != null && abstractC0337u0M1004c2 != null && abstractC0337u0M1004c != abstractC0337u0M1004c2) {
                    StringBuilder sbM2079g = C0561a.m2079g("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbM2079g.append(dVar7.f1790a.f2137c);
                    sbM2079g.append(" returned Transition ");
                    sbM2079g.append(dVar7.f1792c);
                    sbM2079g.append(" which uses a different Transition  type than its shared element transition ");
                    sbM2079g.append(dVar7.f1794e);
                    throw new IllegalArgumentException(sbM2079g.toString());
                }
                if (abstractC0337u0M1004c == null) {
                    abstractC0337u0M1004c = abstractC0337u0M1004c2;
                }
                if (abstractC0337u02 == null) {
                    abstractC0337u02 = abstractC0337u0M1004c;
                } else if (abstractC0337u0M1004c != null && abstractC0337u02 != abstractC0337u0M1004c) {
                    StringBuilder sbM2079g2 = C0561a.m2079g("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbM2079g2.append(dVar7.f1790a.f2137c);
                    sbM2079g2.append(" returned Transition ");
                    sbM2079g2.append(dVar7.f1792c);
                    sbM2079g2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sbM2079g2.toString());
                }
            }
            it3 = it;
            arrayList10 = arrayList9;
        }
        ArrayList arrayList13 = arrayList10;
        if (abstractC0337u02 == null) {
            Iterator it4 = arrayList11.iterator();
            while (it4.hasNext()) {
                d dVar8 = (d) it4.next();
                map3.put(dVar8.f1790a, bool5);
                dVar8.m1002a();
            }
            z2 = false;
            z3 = true;
            cVar = cVar4;
            bool = bool4;
            str = "FragmentManager";
            arrayList = arrayList12;
            map = map3;
        } else {
            View view5 = new View(this.f2125a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList14 = new ArrayList<>();
            String str4 = "FragmentManager";
            ArrayList<View> arrayList15 = new ArrayList<>();
            AbstractC0347z0.d.c cVar6 = cVar5;
            C0129a c0129a2 = new C0129a();
            Iterator it5 = arrayList11.iterator();
            Rect rect3 = rect2;
            Object obj = null;
            View view6 = null;
            boolean z5 = false;
            View view7 = view5;
            HashMap map4 = map3;
            AbstractC0347z0.d dVar9 = dVar4;
            AbstractC0347z0.d dVar10 = dVar5;
            while (it5.hasNext()) {
                Boolean bool6 = bool5;
                Object obj2 = ((d) it5.next()).f1794e;
                if (!(obj2 != null) || dVar9 == null || dVar10 == null) {
                    arrayList2 = arrayList14;
                    cVar3 = cVar4;
                    bool2 = bool4;
                    c0129a = c0129a2;
                    dVar2 = dVar5;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList12;
                    view3 = view7;
                    map2 = map4;
                    rect = rect3;
                    bool3 = bool6;
                    abstractC0337u0 = abstractC0337u02;
                    dVar3 = dVar4;
                } else {
                    Object objMo1233y = abstractC0337u02.mo1233y(abstractC0337u02.mo1221g(obj2));
                    ComponentCallbacksC0320m.b bVar = dVar10.f2137c.f1966J;
                    if (bVar == null || (arrayList5 = bVar.f2011i) == null) {
                        arrayList5 = new ArrayList<>();
                    }
                    AbstractC0337u0 abstractC0337u03 = abstractC0337u02;
                    ComponentCallbacksC0320m.b bVar2 = dVar9.f2137c.f1966J;
                    if (bVar2 == null || (arrayList6 = bVar2.f2011i) == null) {
                        arrayList6 = new ArrayList<>();
                    }
                    ComponentCallbacksC0320m.b bVar3 = dVar9.f2137c.f1966J;
                    if (bVar3 == null || (arrayList7 = bVar3.f2012j) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    cVar3 = cVar4;
                    arrayList4 = arrayList12;
                    int i2 = 0;
                    while (i2 < arrayList7.size()) {
                        int iIndexOf = arrayList5.indexOf(arrayList7.get(i2));
                        ArrayList<String> arrayList16 = arrayList7;
                        if (iIndexOf != -1) {
                            arrayList5.set(iIndexOf, arrayList6.get(i2));
                        }
                        i2++;
                        arrayList7 = arrayList16;
                    }
                    ComponentCallbacksC0320m.b bVar4 = dVar10.f2137c.f1966J;
                    if (bVar4 == null || (arrayList8 = bVar4.f2012j) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList17 = arrayList8;
                    if (z4) {
                        dVar9.f2137c.m1170n();
                        dVar10.f2137c.m1176q();
                    } else {
                        dVar9.f2137c.m1176q();
                        dVar10.f2137c.m1170n();
                    }
                    int i3 = 0;
                    for (int size = arrayList5.size(); i3 < size; size = size) {
                        c0129a2.put(arrayList5.get(i3), arrayList17.get(i3));
                        i3++;
                    }
                    C0129a<String, View> c0129a3 = new C0129a<>();
                    m999k(c0129a3, dVar9.f2137c.f1963G);
                    AbstractC0135g.m504k(c0129a3, arrayList5);
                    AbstractC0135g.m504k(c0129a2, c0129a3.keySet());
                    C0129a<String, View> c0129a4 = new C0129a<>();
                    m999k(c0129a4, dVar10.f2137c.f1963G);
                    AbstractC0135g.m504k(c0129a4, arrayList17);
                    AbstractC0135g.m504k(c0129a4, c0129a2.values());
                    C0333s0.m1212m(c0129a2, c0129a4);
                    m1000l(c0129a3, c0129a2.keySet());
                    m1000l(c0129a4, c0129a2.values());
                    if (c0129a2.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj = null;
                        arrayList2 = arrayList14;
                        bool2 = bool4;
                        c0129a = c0129a2;
                        dVar3 = dVar4;
                        dVar2 = dVar5;
                        arrayList3 = arrayList11;
                        view3 = view7;
                        map2 = map4;
                        abstractC0337u0 = abstractC0337u03;
                        rect = rect3;
                        bool3 = bool6;
                    } else {
                        C0333s0.m1202c(dVar10.f2137c, dVar9.f2137c, z4, c0129a3, true);
                        arrayList2 = arrayList14;
                        c0129a = c0129a2;
                        rect = rect3;
                        ArrayList<String> arrayList18 = arrayList5;
                        Boolean bool7 = bool4;
                        arrayList3 = arrayList11;
                        View view8 = view7;
                        AbstractC0347z0.d dVar11 = dVar5;
                        AbstractC0347z0.d dVar12 = dVar5;
                        abstractC0337u0 = abstractC0337u03;
                        AbstractC0347z0.d dVar13 = dVar4;
                        AbstractC0347z0.d dVar14 = dVar4;
                        HashMap map5 = map4;
                        bool3 = bool6;
                        ViewTreeObserverOnPreDrawListenerC0265n.m860a(this.f2125a, new RunnableC0310h(this, dVar11, dVar13, z, c0129a4));
                        arrayList2.addAll(c0129a3.values());
                        if (arrayList18.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            View view9 = (View) c0129a3.get(arrayList18.get(0));
                            abstractC0337u0.mo1229t(objMo1233y, view9);
                            view6 = view9;
                        }
                        arrayList15.addAll(c0129a4.values());
                        if (!arrayList17.isEmpty() && (view4 = (View) c0129a4.get(arrayList17.get(i))) != null) {
                            ViewTreeObserverOnPreDrawListenerC0265n.m860a(this.f2125a, new RunnableC0312i(this, abstractC0337u0, view4, rect));
                            z5 = true;
                        }
                        view3 = view8;
                        abstractC0337u0.mo1231w(objMo1233y, view3, arrayList2);
                        abstractC0337u0.mo1227r(objMo1233y, null, null, null, null, objMo1233y, arrayList15);
                        bool2 = bool7;
                        dVar3 = dVar14;
                        map2 = map5;
                        map2.put(dVar3, bool2);
                        dVar2 = dVar12;
                        map2.put(dVar2, bool2);
                        dVar9 = dVar3;
                        dVar10 = dVar2;
                        obj = objMo1233y;
                    }
                }
                view7 = view3;
                dVar4 = dVar3;
                arrayList14 = arrayList2;
                map4 = map2;
                rect3 = rect;
                abstractC0337u02 = abstractC0337u0;
                arrayList12 = arrayList4;
                c0129a2 = c0129a;
                arrayList11 = arrayList3;
                z4 = z;
                dVar5 = dVar2;
                bool4 = bool2;
                cVar4 = cVar3;
                bool5 = bool3;
            }
            ArrayList<View> arrayList19 = arrayList14;
            AbstractC0337u0 abstractC0337u04 = abstractC0337u02;
            Boolean bool8 = bool5;
            cVar = cVar4;
            bool = bool4;
            C0129a c0129a5 = c0129a2;
            ArrayList arrayList20 = arrayList11;
            arrayList = arrayList12;
            View view10 = view7;
            map = map4;
            Rect rect4 = rect3;
            ArrayList arrayList21 = new ArrayList();
            Iterator it6 = arrayList20.iterator();
            Object objMo1223m = null;
            Object objMo1223m2 = null;
            while (it6.hasNext()) {
                d dVar15 = (d) it6.next();
                if (dVar15.m1003b()) {
                    map.put(dVar15.f1790a, bool8);
                    dVar15.m1002a();
                    it6 = it6;
                    objMo1223m = objMo1223m;
                } else {
                    Iterator it7 = it6;
                    Object obj3 = objMo1223m;
                    Boolean bool9 = bool8;
                    Object objMo1221g = abstractC0337u04.mo1221g(dVar15.f1792c);
                    Object obj4 = objMo1223m2;
                    AbstractC0347z0.d dVar16 = dVar15.f1790a;
                    boolean z6 = obj != null && (dVar16 == dVar9 || dVar16 == dVar10);
                    if (objMo1221g == null) {
                        if (!z6) {
                            map.put(dVar16, bool9);
                            dVar15.m1002a();
                        }
                        view = view10;
                        dVar = dVar10;
                        bool8 = bool9;
                        cVar2 = cVar6;
                        view2 = view6;
                        objMo1223m = obj3;
                        objMo1223m2 = obj4;
                    } else {
                        bool8 = bool9;
                        ArrayList<View> arrayList22 = new ArrayList<>();
                        dVar = dVar10;
                        m998j(arrayList22, dVar16.f2137c.f1963G);
                        if (z6) {
                            if (dVar16 == dVar9) {
                                arrayList22.removeAll(arrayList19);
                            } else {
                                arrayList22.removeAll(arrayList15);
                            }
                        }
                        if (arrayList22.isEmpty()) {
                            abstractC0337u04.mo1217a(objMo1221g, view10);
                            view = view10;
                        } else {
                            abstractC0337u04.mo1218b(objMo1221g, arrayList22);
                            abstractC0337u04.mo1227r(objMo1221g, objMo1221g, arrayList22, null, null, null, null);
                            view = view10;
                            AbstractC0347z0.d.c cVar7 = cVar;
                            if (dVar16.f2135a == cVar7) {
                                arrayList.remove(dVar16);
                                ArrayList<View> arrayList23 = new ArrayList<>(arrayList22);
                                cVar = cVar7;
                                arrayList23.remove(dVar16.f2137c.f1963G);
                                abstractC0337u04.mo1226q(objMo1221g, dVar16.f2137c.f1963G, arrayList23);
                                ViewTreeObserverOnPreDrawListenerC0265n.m860a(this.f2125a, new RunnableC0314j(this, arrayList22));
                            } else {
                                cVar = cVar7;
                            }
                        }
                        cVar2 = cVar6;
                        if (dVar16.f2135a == cVar2) {
                            arrayList21.addAll(arrayList22);
                            if (z5) {
                                abstractC0337u04.mo1228s(objMo1221g, rect4);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            abstractC0337u04.mo1229t(objMo1221g, view2);
                        }
                        map.put(dVar16, bool);
                        if (dVar15.f1793d) {
                            objMo1223m2 = abstractC0337u04.mo1223m(obj4, objMo1221g, null);
                            objMo1223m = obj3;
                        } else {
                            objMo1223m2 = obj4;
                            objMo1223m = abstractC0337u04.mo1223m(obj3, objMo1221g, null);
                        }
                    }
                    view6 = view2;
                    cVar6 = cVar2;
                    view10 = view;
                    it6 = it7;
                    dVar10 = dVar;
                }
            }
            AbstractC0347z0.d dVar17 = dVar10;
            Object objMo1222l = abstractC0337u04.mo1222l(objMo1223m2, objMo1223m, obj);
            Iterator it8 = arrayList20.iterator();
            while (it8.hasNext()) {
                d dVar18 = (d) it8.next();
                if (!dVar18.m1003b()) {
                    Object obj5 = dVar18.f1792c;
                    AbstractC0347z0.d dVar19 = dVar18.f1790a;
                    AbstractC0347z0.d dVar20 = dVar17;
                    boolean z7 = obj != null && (dVar19 == dVar9 || dVar19 == dVar20);
                    if (obj5 != null || z7) {
                        ViewGroup viewGroup = this.f2125a;
                        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                        if (viewGroup.isLaidOut()) {
                            str2 = str4;
                            abstractC0337u04.mo1230u(dVar18.f1790a.f2137c, objMo1222l, dVar18.f1791b, new RunnableC0316k(this, dVar18));
                            dVar9 = dVar9;
                        } else {
                            if (AbstractC0301c0.m1005N(2)) {
                                StringBuilder sbM2079g3 = C0561a.m2079g("SpecialEffectsController: Container ");
                                sbM2079g3.append(this.f2125a);
                                sbM2079g3.append(" has not been laid out. Completing operation ");
                                sbM2079g3.append(dVar19);
                                str2 = str4;
                                Log.v(str2, sbM2079g3.toString());
                            } else {
                                str2 = str4;
                            }
                            dVar18.m1002a();
                        }
                    } else {
                        str2 = str4;
                    }
                    str4 = str2;
                    dVar17 = dVar20;
                }
            }
            str = str4;
            ViewGroup viewGroup2 = this.f2125a;
            WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
            if (viewGroup2.isLaidOut()) {
                C0333s0.m1214o(arrayList21, 4);
                ArrayList<String> arrayListM1240n = abstractC0337u04.m1240n(arrayList15);
                abstractC0337u04.mo1219c(this.f2125a, objMo1222l);
                abstractC0337u04.m1241v(this.f2125a, arrayList19, arrayList15, arrayListM1240n, c0129a5);
                z2 = false;
                C0333s0.m1214o(arrayList21, 0);
                abstractC0337u04.mo1232x(obj, arrayList19, arrayList15);
            } else {
                z2 = false;
            }
            z3 = true;
        }
        boolean zContainsValue = map.containsValue(bool);
        ViewGroup viewGroup3 = this.f2125a;
        Context context = viewGroup3.getContext();
        ArrayList arrayList24 = new ArrayList();
        Iterator it9 = arrayList13.iterator();
        boolean z8 = z2;
        while (it9.hasNext()) {
            b bVar5 = (b) it9.next();
            if (!bVar5.m1003b() && (c0334tM1001c = bVar5.m1001c(context)) != null) {
                Animator animator = c0334tM1001c.f2083b;
                if (animator == null) {
                    arrayList24.add(bVar5);
                } else {
                    AbstractC0347z0.d dVar21 = bVar5.f1790a;
                    ComponentCallbacksC0320m componentCallbacksC0320m = dVar21.f2137c;
                    if (!bool.equals(map.get(dVar21))) {
                        AbstractC0347z0.d.c cVar8 = cVar;
                        boolean z9 = dVar21.f2135a == cVar8 ? z3 : z2;
                        ArrayList arrayList25 = arrayList;
                        if (z9) {
                            arrayList25.remove(dVar21);
                        }
                        View view11 = componentCallbacksC0320m.f1963G;
                        viewGroup3.startViewTransition(view11);
                        animator.addListener(new C0302d(this, viewGroup3, view11, z9, dVar21, bVar5));
                        animator.setTarget(view11);
                        animator.start();
                        bVar5.f1791b.m789b(new C0304e(this, animator));
                        z2 = false;
                        z8 = z3;
                        map = map;
                        cVar = cVar8;
                        arrayList = arrayList25;
                        bool = bool;
                    } else if (AbstractC0301c0.m1005N(2)) {
                        Log.v(str, "Ignoring Animator set on " + componentCallbacksC0320m + " as this Fragment was involved in a Transition.");
                    }
                }
            }
            bVar5.m1002a();
        }
        ArrayList arrayList26 = arrayList;
        Iterator it10 = arrayList24.iterator();
        while (it10.hasNext()) {
            b bVar6 = (b) it10.next();
            AbstractC0347z0.d dVar22 = bVar6.f1790a;
            ComponentCallbacksC0320m componentCallbacksC0320m2 = dVar22.f2137c;
            if (zContainsValue) {
                if (AbstractC0301c0.m1005N(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(componentCallbacksC0320m2);
                    str3 = " as Animations cannot run alongside Transitions.";
                    sb.append(str3);
                    Log.v(str, sb.toString());
                }
                bVar6.m1002a();
            } else if (z8) {
                if (AbstractC0301c0.m1005N(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(componentCallbacksC0320m2);
                    str3 = " as Animations cannot run alongside Animators.";
                    sb.append(str3);
                    Log.v(str, sb.toString());
                }
                bVar6.m1002a();
            } else {
                View view12 = componentCallbacksC0320m2.f1963G;
                C0334t c0334tM1001c2 = bVar6.m1001c(context);
                Objects.requireNonNull(c0334tM1001c2);
                Animation animation = c0334tM1001c2.f2082a;
                Objects.requireNonNull(animation);
                if (dVar22.f2135a != AbstractC0347z0.d.c.REMOVED) {
                    view12.startAnimation(animation);
                    bVar6.m1002a();
                } else {
                    viewGroup3.startViewTransition(view12);
                    RunnableC0336u runnableC0336u = new RunnableC0336u(animation, viewGroup3, view12);
                    runnableC0336u.setAnimationListener(new AnimationAnimationListenerC0306f(this, viewGroup3, view12, bVar6));
                    view12.startAnimation(runnableC0336u);
                }
                bVar6.f1791b.m789b(new C0308g(this, view12, viewGroup3, bVar6));
            }
        }
        Iterator it11 = arrayList26.iterator();
        while (it11.hasNext()) {
            AbstractC0347z0.d dVar23 = (AbstractC0347z0.d) it11.next();
            dVar23.f2135a.m1263a(dVar23.f2137c.f1963G);
        }
        arrayList26.clear();
    }

    /* renamed from: j */
    public void m998j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m998j(arrayList, childAt);
            }
        }
    }

    /* renamed from: k */
    public void m999k(Map<String, View> map, View view) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m999k(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public void m1000l(C0129a<String, View> c0129a, Collection<String> collection) {
        Iterator it = ((AbstractC0135g.b) c0129a.entrySet()).iterator();
        while (true) {
            AbstractC0135g.d dVar = (AbstractC0135g.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            View view = (View) dVar.getValue();
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (!collection.contains(view.getTransitionName())) {
                dVar.remove();
            }
        }
    }
}

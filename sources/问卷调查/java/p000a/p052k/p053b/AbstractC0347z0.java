package p000a.p052k.p053b;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p039f.C0217a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC0347z0 {

    /* renamed from: a */
    public final ViewGroup f2125a;

    /* renamed from: b */
    public final ArrayList<d> f2126b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<d> f2127c = new ArrayList<>();

    /* renamed from: d */
    public boolean f2128d = false;

    /* renamed from: e */
    public boolean f2129e = false;

    /* renamed from: a.k.b.z0$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ c f2130b;

        public a(c cVar) {
            this.f2130b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0347z0.this.f2126b.contains(this.f2130b)) {
                c cVar = this.f2130b;
                cVar.f2135a.m1263a(cVar.f2137c.f1963G);
            }
        }
    }

    /* renamed from: a.k.b.z0$b */
    public class b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ c f2132b;

        public b(c cVar) {
            this.f2132b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0347z0.this.f2126b.remove(this.f2132b);
            AbstractC0347z0.this.f2127c.remove(this.f2132b);
        }
    }

    /* renamed from: a.k.b.z0$c */
    public static class c extends d {

        /* renamed from: h */
        public final C0315j0 f2134h;

        public c(d.c cVar, d.b bVar, C0315j0 c0315j0, C0217a c0217a) {
            super(cVar, bVar, c0315j0.f1904c, c0217a);
            this.f2134h = c0315j0;
        }

        @Override // p000a.p052k.p053b.AbstractC0347z0.d
        /* renamed from: b */
        public void mo1257b() {
            super.mo1257b();
            this.f2134h.m1094k();
        }

        @Override // p000a.p052k.p053b.AbstractC0347z0.d
        /* renamed from: d */
        public void mo1258d() {
            if (this.f2136b == d.b.ADDING) {
                ComponentCallbacksC0320m componentCallbacksC0320m = this.f2134h.f1904c;
                View viewFindFocus = componentCallbacksC0320m.f1963G.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC0320m.m1157g().f2017o = viewFindFocus;
                    if (AbstractC0301c0.m1005N(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC0320m);
                    }
                }
                View viewM1167l0 = this.f2137c.m1167l0();
                if (viewM1167l0.getParent() == null) {
                    this.f2134h.m1085b();
                    viewM1167l0.setAlpha(0.0f);
                }
                if (viewM1167l0.getAlpha() == 0.0f && viewM1167l0.getVisibility() == 0) {
                    viewM1167l0.setVisibility(4);
                }
                ComponentCallbacksC0320m.b bVar = componentCallbacksC0320m.f1966J;
                viewM1167l0.setAlpha(bVar == null ? 1.0f : bVar.f2016n);
            }
        }
    }

    /* renamed from: a.k.b.z0$d */
    public static class d {

        /* renamed from: a */
        public c f2135a;

        /* renamed from: b */
        public b f2136b;

        /* renamed from: c */
        public final ComponentCallbacksC0320m f2137c;

        /* renamed from: d */
        public final List<Runnable> f2138d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C0217a> f2139e = new HashSet<>();

        /* renamed from: f */
        public boolean f2140f = false;

        /* renamed from: g */
        public boolean f2141g = false;

        /* renamed from: a.k.b.z0$d$a */
        public class a implements C0217a.a {
            public a() {
            }

            @Override // p000a.p031h.p039f.C0217a.a
            /* renamed from: a */
            public void mo790a() {
                d.this.m1259a();
            }
        }

        /* renamed from: a.k.b.z0$d$b */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: a.k.b.z0$d$c */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            public static c m1261b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            public static c m1262c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m1261b(view.getVisibility());
            }

            /* renamed from: a */
            public void m1263a(View view) {
                int i;
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (AbstractC0301c0.m1005N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (AbstractC0301c0.m1005N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i = 0;
                } else if (iOrdinal == 2) {
                    if (AbstractC0301c0.m1005N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i = 8;
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    if (AbstractC0301c0.m1005N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    i = 4;
                }
                view.setVisibility(i);
            }
        }

        public d(c cVar, b bVar, ComponentCallbacksC0320m componentCallbacksC0320m, C0217a c0217a) {
            this.f2135a = cVar;
            this.f2136b = bVar;
            this.f2137c = componentCallbacksC0320m;
            c0217a.m789b(new a());
        }

        /* renamed from: a */
        public final void m1259a() {
            if (this.f2140f) {
                return;
            }
            this.f2140f = true;
            if (this.f2139e.isEmpty()) {
                mo1257b();
                return;
            }
            Iterator it = new ArrayList(this.f2139e).iterator();
            while (it.hasNext()) {
                ((C0217a) it.next()).m788a();
            }
        }

        /* renamed from: b */
        public void mo1257b() {
            if (this.f2141g) {
                return;
            }
            if (AbstractC0301c0.m1005N(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2141g = true;
            Iterator<Runnable> it = this.f2138d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: c */
        public final void m1260c(c cVar, b bVar) {
            b bVar2;
            c cVar2 = c.REMOVED;
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                if (this.f2135a != cVar2) {
                    if (AbstractC0301c0.m1005N(2)) {
                        StringBuilder sbM2079g = C0561a.m2079g("SpecialEffectsController: For fragment ");
                        sbM2079g.append(this.f2137c);
                        sbM2079g.append(" mFinalState = ");
                        sbM2079g.append(this.f2135a);
                        sbM2079g.append(" -> ");
                        sbM2079g.append(cVar);
                        sbM2079g.append(". ");
                        Log.v("FragmentManager", sbM2079g.toString());
                    }
                    this.f2135a = cVar;
                    return;
                }
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    return;
                }
                if (AbstractC0301c0.m1005N(2)) {
                    StringBuilder sbM2079g2 = C0561a.m2079g("SpecialEffectsController: For fragment ");
                    sbM2079g2.append(this.f2137c);
                    sbM2079g2.append(" mFinalState = ");
                    sbM2079g2.append(this.f2135a);
                    sbM2079g2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sbM2079g2.append(this.f2136b);
                    sbM2079g2.append(" to REMOVING.");
                    Log.v("FragmentManager", sbM2079g2.toString());
                }
                this.f2135a = cVar2;
                bVar2 = b.REMOVING;
            } else {
                if (this.f2135a != cVar2) {
                    return;
                }
                if (AbstractC0301c0.m1005N(2)) {
                    StringBuilder sbM2079g3 = C0561a.m2079g("SpecialEffectsController: For fragment ");
                    sbM2079g3.append(this.f2137c);
                    sbM2079g3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sbM2079g3.append(this.f2136b);
                    sbM2079g3.append(" to ADDING.");
                    Log.v("FragmentManager", sbM2079g3.toString());
                }
                this.f2135a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2136b = bVar2;
        }

        /* renamed from: d */
        public void mo1258d() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2135a + "} {mLifecycleImpact = " + this.f2136b + "} {mFragment = " + this.f2137c + "}";
        }
    }

    public AbstractC0347z0(ViewGroup viewGroup) {
        this.f2125a = viewGroup;
    }

    /* renamed from: f */
    public static AbstractC0347z0 m1249f(ViewGroup viewGroup, AbstractC0301c0 abstractC0301c0) {
        return m1250g(viewGroup, abstractC0301c0.m1017L());
    }

    /* renamed from: g */
    public static AbstractC0347z0 m1250g(ViewGroup viewGroup, InterfaceC0296a1 interfaceC0296a1) {
        Object tag = viewGroup.getTag(C1088R.id.special_effects_controller_view_tag);
        if (tag instanceof AbstractC0347z0) {
            return (AbstractC0347z0) tag;
        }
        Objects.requireNonNull((AbstractC0301c0.f) interfaceC0296a1);
        C0300c c0300c = new C0300c(viewGroup);
        viewGroup.setTag(C1088R.id.special_effects_controller_view_tag, c0300c);
        return c0300c;
    }

    /* renamed from: a */
    public final void m1251a(d.c cVar, d.b bVar, C0315j0 c0315j0) {
        synchronized (this.f2126b) {
            C0217a c0217a = new C0217a();
            d dVarM1253d = m1253d(c0315j0.f1904c);
            if (dVarM1253d != null) {
                dVarM1253d.m1260c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, c0315j0, c0217a);
            this.f2126b.add(cVar2);
            cVar2.f2138d.add(new a(cVar2));
            cVar2.f2138d.add(new b(cVar2));
        }
    }

    /* renamed from: b */
    public abstract void mo997b(List<d> list, boolean z);

    /* renamed from: c */
    public void m1252c() {
        if (this.f2129e) {
            return;
        }
        ViewGroup viewGroup = this.f2125a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (!viewGroup.isAttachedToWindow()) {
            m1254e();
            this.f2128d = false;
            return;
        }
        synchronized (this.f2126b) {
            if (!this.f2126b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2127c);
                this.f2127c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (AbstractC0301c0.m1005N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                    }
                    dVar.m1259a();
                    if (!dVar.f2141g) {
                        this.f2127c.add(dVar);
                    }
                }
                m1256i();
                ArrayList arrayList2 = new ArrayList(this.f2126b);
                this.f2126b.clear();
                this.f2127c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).mo1258d();
                }
                mo997b(arrayList2, this.f2128d);
                this.f2128d = false;
            }
        }
    }

    /* renamed from: d */
    public final d m1253d(ComponentCallbacksC0320m componentCallbacksC0320m) {
        Iterator<d> it = this.f2126b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f2137c.equals(componentCallbacksC0320m) && !next.f2140f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m1254e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f2125a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f2126b) {
            m1256i();
            Iterator<d> it = this.f2126b.iterator();
            while (it.hasNext()) {
                it.next().mo1258d();
            }
            Iterator it2 = new ArrayList(this.f2127c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (AbstractC0301c0.m1005N(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (zIsAttachedToWindow) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f2125a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.m1259a();
            }
            Iterator it3 = new ArrayList(this.f2126b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (AbstractC0301c0.m1005N(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (zIsAttachedToWindow) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f2125a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.m1259a();
            }
        }
    }

    /* renamed from: h */
    public void m1255h() {
        synchronized (this.f2126b) {
            m1256i();
            this.f2129e = false;
            int size = this.f2126b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.f2126b.get(size);
                d.c cVarM1262c = d.c.m1262c(dVar.f2137c.f1963G);
                d.c cVar = dVar.f2135a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && cVarM1262c != cVar2) {
                    this.f2129e = dVar.f2137c.m1134E();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void m1256i() {
        Iterator<d> it = this.f2126b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f2136b == d.b.ADDING) {
                next.m1260c(d.c.m1261b(next.f2137c.m1167l0().getVisibility()), d.b.NONE);
            }
        }
    }
}

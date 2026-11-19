package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p099i0.C2663b;
import p172y.C3483b;

/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
abstract class AbstractC0476y {

    /* renamed from: a */
    private final ViewGroup f3321a;

    /* renamed from: b */
    final ArrayList<e> f3322b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<e> f3323c = new ArrayList<>();

    /* renamed from: d */
    boolean f3324d = false;

    /* renamed from: e */
    boolean f3325e = false;

    /* renamed from: androidx.fragment.app.y$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f3326a;

        a(d dVar) {
            this.f3326a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0476y.this.f3322b.contains(this.f3326a)) {
                this.f3326a.m2795e().m2804a(this.f3326a.m2796f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f3328a;

        b(d dVar) {
            this.f3328a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0476y.this.f3322b.remove(this.f3328a);
            AbstractC0476y.this.f3323c.remove(this.f3328a);
        }
    }

    /* renamed from: androidx.fragment.app.y$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f3330a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3331b;

        static {
            int[] iArr = new int[e.b.values().length];
            f3331b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3331b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3331b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f3330a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3330a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3330a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3330a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$d */
    private static class d extends e {

        /* renamed from: h */
        private final C0467p f3332h;

        d(e.c cVar, e.b bVar, C0467p c0467p, C3483b c3483b) {
            super(cVar, bVar, c0467p.m2664k(), c3483b);
            this.f3332h = c0467p;
        }

        @Override // androidx.fragment.app.AbstractC0476y.e
        /* renamed from: c */
        public void mo2790c() {
            super.mo2790c();
            this.f3332h.m2665m();
        }

        @Override // androidx.fragment.app.AbstractC0476y.e
        /* renamed from: l */
        void mo2791l() {
            if (m2797g() == e.b.ADDING) {
                Fragment fragmentM2664k = this.f3332h.m2664k();
                View viewFindFocus = fragmentM2664k.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentM2664k.setFocusedView(viewFindFocus);
                    if (FragmentManager.m2388H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentM2664k);
                    }
                }
                View viewRequireView = m2796f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f3332h.m2655b();
                    viewRequireView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
                }
                if (viewRequireView.getAlpha() == IGoodView.DEFAULT_TO_ALPHA && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentM2664k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$e */
    static class e {

        /* renamed from: a */
        private c f3333a;

        /* renamed from: b */
        private b f3334b;

        /* renamed from: c */
        private final Fragment f3335c;

        /* renamed from: d */
        private final List<Runnable> f3336d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C3483b> f3337e = new HashSet<>();

        /* renamed from: f */
        private boolean f3338f = false;

        /* renamed from: g */
        private boolean f3339g = false;

        /* renamed from: androidx.fragment.app.y$e$a */
        class a implements C3483b.a {
            a() {
            }

            @Override // p172y.C3483b.a
            /* renamed from: a */
            public void mo2572a() {
                e.this.m2793b();
            }
        }

        /* renamed from: androidx.fragment.app.y$e$b */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.y$e$c */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static c m2802b(int i4) {
                if (i4 == 0) {
                    return VISIBLE;
                }
                if (i4 == 4) {
                    return INVISIBLE;
                }
                if (i4 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i4);
            }

            /* renamed from: c */
            static c m2803c(View view) {
                return (view.getAlpha() == IGoodView.DEFAULT_TO_ALPHA && view.getVisibility() == 0) ? INVISIBLE : m2802b(view.getVisibility());
            }

            /* renamed from: a */
            void m2804a(View view) {
                int i4 = c.f3330a[ordinal()];
                if (i4 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m2388H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i4 == 2) {
                    if (FragmentManager.m2388H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i4 == 3) {
                    if (FragmentManager.m2388H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i4 != 4) {
                    return;
                }
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, C3483b c3483b) {
            this.f3333a = cVar;
            this.f3334b = bVar;
            this.f3335c = fragment;
            c3483b.m10557c(new a());
        }

        /* renamed from: a */
        final void m2792a(Runnable runnable) {
            this.f3336d.add(runnable);
        }

        /* renamed from: b */
        final void m2793b() {
            if (m2798h()) {
                return;
            }
            this.f3338f = true;
            if (this.f3337e.isEmpty()) {
                mo2790c();
                return;
            }
            Iterator it = new ArrayList(this.f3337e).iterator();
            while (it.hasNext()) {
                ((C3483b) it.next()).m10555a();
            }
        }

        /* renamed from: c */
        public void mo2790c() {
            if (this.f3339g) {
                return;
            }
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3339g = true;
            Iterator<Runnable> it = this.f3336d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: d */
        public final void m2794d(C3483b c3483b) {
            if (this.f3337e.remove(c3483b) && this.f3337e.isEmpty()) {
                mo2790c();
            }
        }

        /* renamed from: e */
        public c m2795e() {
            return this.f3333a;
        }

        /* renamed from: f */
        public final Fragment m2796f() {
            return this.f3335c;
        }

        /* renamed from: g */
        b m2797g() {
            return this.f3334b;
        }

        /* renamed from: h */
        final boolean m2798h() {
            return this.f3338f;
        }

        /* renamed from: i */
        final boolean m2799i() {
            return this.f3339g;
        }

        /* renamed from: j */
        public final void m2800j(C3483b c3483b) {
            mo2791l();
            this.f3337e.add(c3483b);
        }

        /* renamed from: k */
        final void m2801k(c cVar, b bVar) {
            int i4 = c.f3331b[bVar.ordinal()];
            if (i4 == 1) {
                if (this.f3333a == c.REMOVED) {
                    if (FragmentManager.m2388H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3335c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3334b + " to ADDING.");
                    }
                    this.f3333a = c.VISIBLE;
                    this.f3334b = b.ADDING;
                    return;
                }
                return;
            }
            if (i4 == 2) {
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3335c + " mFinalState = " + this.f3333a + " -> REMOVED. mLifecycleImpact  = " + this.f3334b + " to REMOVING.");
                }
                this.f3333a = c.REMOVED;
                this.f3334b = b.REMOVING;
                return;
            }
            if (i4 == 3 && this.f3333a != c.REMOVED) {
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3335c + " mFinalState = " + this.f3333a + " -> " + cVar + ". ");
                }
                this.f3333a = cVar;
            }
        }

        /* renamed from: l */
        void mo2791l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3333a + "} {mLifecycleImpact = " + this.f3334b + "} {mFragment = " + this.f3335c + "}";
        }
    }

    AbstractC0476y(ViewGroup viewGroup) {
        this.f3321a = viewGroup;
    }

    /* renamed from: a */
    private void m2773a(e.c cVar, e.b bVar, C0467p c0467p) {
        synchronized (this.f3322b) {
            C3483b c3483b = new C3483b();
            e eVarM2774h = m2774h(c0467p.m2664k());
            if (eVarM2774h != null) {
                eVarM2774h.m2801k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0467p, c3483b);
            this.f3322b.add(dVar);
            dVar.m2792a(new a(dVar));
            dVar.m2792a(new b(dVar));
        }
    }

    /* renamed from: h */
    private e m2774h(Fragment fragment) {
        Iterator<e> it = this.f3322b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m2796f().equals(fragment) && !next.m2798h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private e m2775i(Fragment fragment) {
        Iterator<e> it = this.f3323c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m2796f().equals(fragment) && !next.m2798h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    static AbstractC0476y m2776n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m2777o(viewGroup, fragmentManager.m2424A0());
    }

    /* renamed from: o */
    static AbstractC0476y m2777o(ViewGroup viewGroup, InterfaceC0477z interfaceC0477z) {
        int i4 = C2663b.f10586b;
        Object tag = viewGroup.getTag(i4);
        if (tag instanceof AbstractC0476y) {
            return (AbstractC0476y) tag;
        }
        AbstractC0476y abstractC0476yMo2520a = interfaceC0477z.mo2520a(viewGroup);
        viewGroup.setTag(i4, abstractC0476yMo2520a);
        return abstractC0476yMo2520a;
    }

    /* renamed from: q */
    private void m2778q() {
        Iterator<e> it = this.f3322b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m2797g() == e.b.ADDING) {
                next.m2801k(e.c.m2802b(next.m2796f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* renamed from: b */
    void m2779b(e.c cVar, C0467p c0467p) {
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0467p.m2664k());
        }
        m2773a(cVar, e.b.ADDING, c0467p);
    }

    /* renamed from: c */
    void m2780c(C0467p c0467p) {
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0467p.m2664k());
        }
        m2773a(e.c.GONE, e.b.NONE, c0467p);
    }

    /* renamed from: d */
    void m2781d(C0467p c0467p) {
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0467p.m2664k());
        }
        m2773a(e.c.REMOVED, e.b.REMOVING, c0467p);
    }

    /* renamed from: e */
    void m2782e(C0467p c0467p) {
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0467p.m2664k());
        }
        m2773a(e.c.VISIBLE, e.b.NONE, c0467p);
    }

    /* renamed from: f */
    abstract void mo2567f(List<e> list, boolean z3);

    /* renamed from: g */
    void m2783g() {
        if (this.f3325e) {
            return;
        }
        if (!C0358u.m2012U(this.f3321a)) {
            m2784j();
            this.f3324d = false;
            return;
        }
        synchronized (this.f3322b) {
            if (!this.f3322b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3323c);
                this.f3323c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.m2388H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m2793b();
                    if (!eVar.m2799i()) {
                        this.f3323c.add(eVar);
                    }
                }
                m2778q();
                ArrayList arrayList2 = new ArrayList(this.f3322b);
                this.f3322b.clear();
                this.f3323c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo2791l();
                }
                mo2567f(arrayList2, this.f3324d);
                this.f3324d = false;
            }
        }
    }

    /* renamed from: j */
    void m2784j() {
        String str;
        String str2;
        boolean zM2012U = C0358u.m2012U(this.f3321a);
        synchronized (this.f3322b) {
            m2778q();
            Iterator<e> it = this.f3322b.iterator();
            while (it.hasNext()) {
                it.next().mo2791l();
            }
            Iterator it2 = new ArrayList(this.f3323c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.m2388H0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (zM2012U) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3321a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.m2793b();
            }
            Iterator it3 = new ArrayList(this.f3322b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.m2388H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (zM2012U) {
                        str = "";
                    } else {
                        str = "Container " + this.f3321a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.m2793b();
            }
        }
    }

    /* renamed from: k */
    void m2785k() {
        if (this.f3325e) {
            this.f3325e = false;
            m2783g();
        }
    }

    /* renamed from: l */
    e.b m2786l(C0467p c0467p) {
        e eVarM2774h = m2774h(c0467p.m2664k());
        e.b bVarM2797g = eVarM2774h != null ? eVarM2774h.m2797g() : null;
        e eVarM2775i = m2775i(c0467p.m2664k());
        return (eVarM2775i == null || !(bVarM2797g == null || bVarM2797g == e.b.NONE)) ? bVarM2797g : eVarM2775i.m2797g();
    }

    /* renamed from: m */
    public ViewGroup m2787m() {
        return this.f3321a;
    }

    /* renamed from: p */
    void m2788p() {
        synchronized (this.f3322b) {
            m2778q();
            this.f3325e = false;
            int size = this.f3322b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3322b.get(size);
                e.c cVarM2803c = e.c.m2803c(eVar.m2796f().mView);
                e.c cVarM2795e = eVar.m2795e();
                e.c cVar = e.c.VISIBLE;
                if (cVarM2795e == cVar && cVarM2803c != cVar) {
                    this.f3325e = eVar.m2796f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: r */
    void m2789r(boolean z3) {
        this.f3324d = z3;
    }
}

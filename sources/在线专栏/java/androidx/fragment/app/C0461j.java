package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
class C0461j {

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f3195a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f3196b;

    /* renamed from: androidx.fragment.app.j$a */
    private static final class a {

        /* renamed from: a */
        final boolean f3197a;
    }

    C0461j(FragmentManager fragmentManager) {
        this.f3196b = fragmentManager;
    }

    /* renamed from: a */
    void m2624a(Fragment fragment, Bundle bundle, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2624a(fragment, bundle, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: b */
    void m2625b(Fragment fragment, boolean z3) {
        this.f3196b.m2505v0().m2619f();
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2625b(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: c */
    void m2626c(Fragment fragment, Bundle bundle, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2626c(fragment, bundle, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: d */
    void m2627d(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2627d(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: e */
    void m2628e(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2628e(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: f */
    void m2629f(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2629f(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: g */
    void m2630g(Fragment fragment, boolean z3) {
        this.f3196b.m2505v0().m2619f();
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2630g(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: h */
    void m2631h(Fragment fragment, Bundle bundle, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2631h(fragment, bundle, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: i */
    void m2632i(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2632i(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: j */
    void m2633j(Fragment fragment, Bundle bundle, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2633j(fragment, bundle, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: k */
    void m2634k(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2634k(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: l */
    void m2635l(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2635l(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: m */
    void m2636m(Fragment fragment, View view, Bundle bundle, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2636m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }

    /* renamed from: n */
    void m2637n(Fragment fragment, boolean z3) {
        Fragment fragmentM2510y0 = this.f3196b.m2510y0();
        if (fragmentM2510y0 != null) {
            fragmentM2510y0.getParentFragmentManager().m2508x0().m2637n(fragment, true);
        }
        Iterator<a> it = this.f3195a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f3197a) {
                Objects.requireNonNull(next);
                throw null;
            }
        }
    }
}

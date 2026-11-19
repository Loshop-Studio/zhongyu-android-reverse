package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0489b0;
import androidx.lifecycle.C0491c0;
import androidx.lifecycle.C0493d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
final class C0463l extends AbstractC0489b0 {

    /* renamed from: j */
    private static final C0491c0.b f3198j = new a();

    /* renamed from: f */
    private final boolean f3202f;

    /* renamed from: c */
    private final HashMap<String, Fragment> f3199c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0463l> f3200d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0493d0> f3201e = new HashMap<>();

    /* renamed from: g */
    private boolean f3203g = false;

    /* renamed from: h */
    private boolean f3204h = false;

    /* renamed from: i */
    private boolean f3205i = false;

    /* renamed from: androidx.fragment.app.l$a */
    class a implements C0491c0.b {
        a() {
        }

        @Override // androidx.lifecycle.C0491c0.b
        /* renamed from: a */
        public <T extends AbstractC0489b0> T mo2650a(Class<T> cls) {
            return new C0463l(true);
        }
    }

    C0463l(boolean z3) {
        this.f3202f = z3;
    }

    /* renamed from: j */
    static C0463l m2638j(C0493d0 c0493d0) {
        return (C0463l) new C0491c0(c0493d0, f3198j).m2850a(C0463l.class);
    }

    @Override // androidx.lifecycle.AbstractC0489b0
    /* renamed from: d */
    protected void mo2639d() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3203g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0463l.class != obj.getClass()) {
            return false;
        }
        C0463l c0463l = (C0463l) obj;
        return this.f3199c.equals(c0463l.f3199c) && this.f3200d.equals(c0463l.f3200d) && this.f3201e.equals(c0463l.f3201e);
    }

    /* renamed from: f */
    void m2640f(Fragment fragment) {
        if (this.f3205i) {
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3199c.containsKey(fragment.mWho)) {
                return;
            }
            this.f3199c.put(fragment.mWho, fragment);
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: g */
    void m2641g(Fragment fragment) {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0463l c0463l = this.f3200d.get(fragment.mWho);
        if (c0463l != null) {
            c0463l.mo2639d();
            this.f3200d.remove(fragment.mWho);
        }
        C0493d0 c0493d0 = this.f3201e.get(fragment.mWho);
        if (c0493d0 != null) {
            c0493d0.m2862a();
            this.f3201e.remove(fragment.mWho);
        }
    }

    /* renamed from: h */
    Fragment m2642h(String str) {
        return this.f3199c.get(str);
    }

    public int hashCode() {
        return (((this.f3199c.hashCode() * 31) + this.f3200d.hashCode()) * 31) + this.f3201e.hashCode();
    }

    /* renamed from: i */
    C0463l m2643i(Fragment fragment) {
        C0463l c0463l = this.f3200d.get(fragment.mWho);
        if (c0463l != null) {
            return c0463l;
        }
        C0463l c0463l2 = new C0463l(this.f3202f);
        this.f3200d.put(fragment.mWho, c0463l2);
        return c0463l2;
    }

    /* renamed from: k */
    Collection<Fragment> m2644k() {
        return new ArrayList(this.f3199c.values());
    }

    /* renamed from: l */
    C0493d0 m2645l(Fragment fragment) {
        C0493d0 c0493d0 = this.f3201e.get(fragment.mWho);
        if (c0493d0 != null) {
            return c0493d0;
        }
        C0493d0 c0493d02 = new C0493d0();
        this.f3201e.put(fragment.mWho, c0493d02);
        return c0493d02;
    }

    /* renamed from: m */
    boolean m2646m() {
        return this.f3203g;
    }

    /* renamed from: n */
    void m2647n(Fragment fragment) {
        if (this.f3205i) {
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3199c.remove(fragment.mWho) != null) && FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: o */
    void m2648o(boolean z3) {
        this.f3205i = z3;
    }

    /* renamed from: p */
    boolean m2649p(Fragment fragment) {
        if (this.f3199c.containsKey(fragment.mWho)) {
            return this.f3202f ? this.f3203g : !this.f3204h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3199c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3200d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3201e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

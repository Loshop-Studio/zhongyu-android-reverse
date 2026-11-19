package p146z;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.ComponentCallbacks2C2862g;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: z.k */
/* loaded from: classes2.dex */
public class FragmentC4699k extends Fragment {

    /* renamed from: a */
    public final C4689a f6044a;

    /* renamed from: b */
    public final InterfaceC4702n f6045b;

    /* renamed from: c */
    public final Set f6046c;

    /* renamed from: d */
    public ComponentCallbacks2C2862g f6047d;

    /* renamed from: e */
    public FragmentC4699k f6048e;

    /* renamed from: f */
    public Fragment f6049f;

    /* renamed from: z.k$a */
    public class a implements InterfaceC4702n {
        public a() {
        }

        @Override // p146z.InterfaceC4702n
        /* renamed from: a */
        public Set mo2020a() {
            Set<FragmentC4699k> setM6663b = FragmentC4699k.this.m6663b();
            HashSet hashSet = new HashSet(setM6663b.size());
            for (FragmentC4699k fragmentC4699k : setM6663b) {
                if (fragmentC4699k.m6666e() != null) {
                    hashSet.add(fragmentC4699k.m6666e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC4699k.this + "}";
        }
    }

    public FragmentC4699k() {
        this(new C4689a());
    }

    /* renamed from: a */
    public final void m6662a(FragmentC4699k fragmentC4699k) {
        this.f6046c.add(fragmentC4699k);
    }

    /* renamed from: b */
    public Set m6663b() {
        if (equals(this.f6048e)) {
            return Collections.unmodifiableSet(this.f6046c);
        }
        if (this.f6048e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (FragmentC4699k fragmentC4699k : this.f6048e.m6663b()) {
            if (m6668g(fragmentC4699k.getParentFragment())) {
                hashSet.add(fragmentC4699k);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: c */
    public C4689a m6664c() {
        return this.f6044a;
    }

    /* renamed from: d */
    public final Fragment m6665d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f6049f;
    }

    /* renamed from: e */
    public ComponentCallbacks2C2862g m6666e() {
        return this.f6047d;
    }

    /* renamed from: f */
    public InterfaceC4702n m6667f() {
        return this.f6045b;
    }

    /* renamed from: g */
    public final boolean m6668g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    public final void m6669h(Activity activity) {
        m6673l();
        FragmentC4699k fragmentC4699kM6691p = ComponentCallbacks2C2858c.m1680c(activity).m1696k().m6691p(activity);
        this.f6048e = fragmentC4699kM6691p;
        if (equals(fragmentC4699kM6691p)) {
            return;
        }
        this.f6048e.m6662a(this);
    }

    /* renamed from: i */
    public final void m6670i(FragmentC4699k fragmentC4699k) {
        this.f6046c.remove(fragmentC4699k);
    }

    /* renamed from: j */
    public void m6671j(Fragment fragment) {
        this.f6049f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m6669h(fragment.getActivity());
    }

    /* renamed from: k */
    public void m6672k(ComponentCallbacks2C2862g componentCallbacks2C2862g) {
        this.f6047d = componentCallbacks2C2862g;
    }

    /* renamed from: l */
    public final void m6673l() {
        FragmentC4699k fragmentC4699k = this.f6048e;
        if (fragmentC4699k != null) {
            fragmentC4699k.m6670i(this);
            this.f6048e = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m6669h(activity);
        } catch (IllegalStateException e4) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e4);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f6044a.m6655c();
        m6673l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m6673l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f6044a.m6656d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f6044a.m6657e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m6665d() + "}";
    }

    public FragmentC4699k(C4689a c4689a) {
        this.f6045b = new a();
        this.f6046c = new HashSet();
        this.f6044a = c4689a;
    }
}

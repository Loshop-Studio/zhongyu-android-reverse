package p288x0;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.ComponentCallbacks2C5475f;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: x0.k */
/* loaded from: classes3.dex */
public class FragmentC9858k extends Fragment {

    /* renamed from: a */
    public final C9848a f17587a;

    /* renamed from: b */
    public final InterfaceC9861n f17588b;

    /* renamed from: c */
    public final Set f17589c;

    /* renamed from: d */
    public ComponentCallbacks2C5475f f17590d;

    /* renamed from: e */
    public FragmentC9858k f17591e;

    /* renamed from: f */
    public Fragment f17592f;

    /* renamed from: x0.k$a */
    public class a implements InterfaceC9861n {
        public a() {
        }

        @Override // p288x0.InterfaceC9861n
        /* renamed from: a */
        public Set mo3342a() {
            Set<FragmentC9858k> setM16796b = FragmentC9858k.this.m16796b();
            HashSet hashSet = new HashSet(setM16796b.size());
            for (FragmentC9858k fragmentC9858k : setM16796b) {
                if (fragmentC9858k.m16799e() != null) {
                    hashSet.add(fragmentC9858k.m16799e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC9858k.this + "}";
        }
    }

    public FragmentC9858k() {
        this(new C9848a());
    }

    /* renamed from: a */
    public final void m16795a(FragmentC9858k fragmentC9858k) {
        this.f17589c.add(fragmentC9858k);
    }

    /* renamed from: b */
    public Set m16796b() {
        if (equals(this.f17591e)) {
            return Collections.unmodifiableSet(this.f17589c);
        }
        if (this.f17591e == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (FragmentC9858k fragmentC9858k : this.f17591e.m16796b()) {
            if (m16801g(fragmentC9858k.getParentFragment())) {
                hashSet.add(fragmentC9858k);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: c */
    public C9848a m16797c() {
        return this.f17587a;
    }

    /* renamed from: d */
    public final Fragment m16798d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f17592f;
    }

    /* renamed from: e */
    public ComponentCallbacks2C5475f m16799e() {
        return this.f17590d;
    }

    /* renamed from: f */
    public InterfaceC9861n m16800f() {
        return this.f17588b;
    }

    /* renamed from: g */
    public final boolean m16801g(Fragment fragment) {
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
    public final void m16802h(Activity activity) {
        m16806l();
        FragmentC9858k fragmentC9858kM16824p = ComponentCallbacks2C5471b.m3006c(activity).m3022k().m16824p(activity);
        this.f17591e = fragmentC9858kM16824p;
        if (equals(fragmentC9858kM16824p)) {
            return;
        }
        this.f17591e.m16795a(this);
    }

    /* renamed from: i */
    public final void m16803i(FragmentC9858k fragmentC9858k) {
        this.f17589c.remove(fragmentC9858k);
    }

    /* renamed from: j */
    public void m16804j(Fragment fragment) {
        this.f17592f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m16802h(fragment.getActivity());
    }

    /* renamed from: k */
    public void m16805k(ComponentCallbacks2C5475f componentCallbacks2C5475f) {
        this.f17590d = componentCallbacks2C5475f;
    }

    /* renamed from: l */
    public final void m16806l() {
        FragmentC9858k fragmentC9858k = this.f17591e;
        if (fragmentC9858k != null) {
            fragmentC9858k.m16803i(this);
            this.f17591e = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m16802h(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f17587a.m16788c();
        m16806l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m16806l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f17587a.m16789d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f17587a.m16790e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m16798d() + "}";
    }

    public FragmentC9858k(C9848a c9848a) {
        this.f17588b = new a();
        this.f17589c = new HashSet();
        this.f17587a = c9848a;
    }
}

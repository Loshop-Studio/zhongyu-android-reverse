package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.ComponentCallbacks2C5475f;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p288x0.C9848a;
import p288x0.InterfaceC9861n;

/* loaded from: classes3.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: a */
    public final C9848a f3597a;

    /* renamed from: b */
    public final InterfaceC9861n f3598b;

    /* renamed from: c */
    public final Set f3599c;

    /* renamed from: d */
    public SupportRequestManagerFragment f3600d;

    /* renamed from: e */
    public ComponentCallbacks2C5475f f3601e;

    /* renamed from: f */
    public Fragment f3602f;

    /* renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C5510a implements InterfaceC9861n {
        public C5510a() {
        }

        @Override // p288x0.InterfaceC9861n
        /* renamed from: a */
        public Set mo3342a() {
            Set<SupportRequestManagerFragment> setM3331d = SupportRequestManagerFragment.this.m3331d();
            HashSet hashSet = new HashSet(setM3331d.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setM3331d) {
                if (supportRequestManagerFragment.m3334g() != null) {
                    hashSet.add(supportRequestManagerFragment.m3334g());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new C9848a());
    }

    /* renamed from: i */
    public static FragmentManager m3329i(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: c */
    public final void m3330c(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f3599c.add(supportRequestManagerFragment);
    }

    /* renamed from: d */
    public Set m3331d() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f3600d;
        if (supportRequestManagerFragment == null) {
            return Collections.EMPTY_SET;
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f3599c);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f3600d.m3331d()) {
            if (m3336j(supportRequestManagerFragment2.m3333f())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    public C9848a m3332e() {
        return this.f3597a;
    }

    /* renamed from: f */
    public final Fragment m3333f() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f3602f;
    }

    /* renamed from: g */
    public ComponentCallbacks2C5475f m3334g() {
        return this.f3601e;
    }

    /* renamed from: h */
    public InterfaceC9861n m3335h() {
        return this.f3598b;
    }

    /* renamed from: j */
    public final boolean m3336j(Fragment fragment) {
        Fragment fragmentM3333f = m3333f();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentM3333f)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: k */
    public final void m3337k(Context context, FragmentManager fragmentManager) {
        m3341o();
        SupportRequestManagerFragment supportRequestManagerFragmentM16826r = ComponentCallbacks2C5471b.m3006c(context).m3022k().m16826r(context, fragmentManager);
        this.f3600d = supportRequestManagerFragmentM16826r;
        if (equals(supportRequestManagerFragmentM16826r)) {
            return;
        }
        this.f3600d.m3330c(this);
    }

    /* renamed from: l */
    public final void m3338l(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f3599c.remove(supportRequestManagerFragment);
    }

    /* renamed from: m */
    public void m3339m(Fragment fragment) {
        FragmentManager fragmentManagerM3329i;
        this.f3602f = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerM3329i = m3329i(fragment)) == null) {
            return;
        }
        m3337k(fragment.getContext(), fragmentManagerM3329i);
    }

    /* renamed from: n */
    public void m3340n(ComponentCallbacks2C5475f componentCallbacks2C5475f) {
        this.f3601e = componentCallbacks2C5475f;
    }

    /* renamed from: o */
    public final void m3341o() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f3600d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.m3338l(this);
            this.f3600d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerM3329i = m3329i(this);
        if (fragmentManagerM3329i == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m3337k(getContext(), fragmentManagerM3329i);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f3597a.m16788c();
        m3341o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f3602f = null;
        m3341o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f3597a.m16789d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f3597a.m16790e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m3333f() + "}";
    }

    public SupportRequestManagerFragment(C9848a c9848a) {
        this.f3598b = new C5510a();
        this.f3599c = new HashSet();
        this.f3597a = c9848a;
    }
}

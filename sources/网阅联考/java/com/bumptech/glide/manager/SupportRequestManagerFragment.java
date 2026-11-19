package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.ComponentCallbacks2C2862g;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p146z.C4689a;
import p146z.InterfaceC4702n;

/* loaded from: classes2.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: a */
    public final C4689a f943a;

    /* renamed from: b */
    public final InterfaceC4702n f944b;

    /* renamed from: c */
    public final Set f945c;

    /* renamed from: d */
    public SupportRequestManagerFragment f946d;

    /* renamed from: e */
    public ComponentCallbacks2C2862g f947e;

    /* renamed from: f */
    public Fragment f948f;

    /* renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C2897a implements InterfaceC4702n {
        public C2897a() {
        }

        @Override // p146z.InterfaceC4702n
        /* renamed from: a */
        public Set mo2020a() {
            Set<SupportRequestManagerFragment> setM2009b = SupportRequestManagerFragment.this.m2009b();
            HashSet hashSet = new HashSet(setM2009b.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setM2009b) {
                if (supportRequestManagerFragment.m2012e() != null) {
                    hashSet.add(supportRequestManagerFragment.m2012e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new C4689a());
    }

    /* renamed from: g */
    public static FragmentManager m2007g(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: a */
    public final void m2008a(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f945c.add(supportRequestManagerFragment);
    }

    /* renamed from: b */
    public Set m2009b() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f946d;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f945c);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f946d.m2009b()) {
            if (m2014h(supportRequestManagerFragment2.m2011d())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: c */
    public C4689a m2010c() {
        return this.f943a;
    }

    /* renamed from: d */
    public final Fragment m2011d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f948f;
    }

    /* renamed from: e */
    public ComponentCallbacks2C2862g m2012e() {
        return this.f947e;
    }

    /* renamed from: f */
    public InterfaceC4702n m2013f() {
        return this.f944b;
    }

    /* renamed from: h */
    public final boolean m2014h(Fragment fragment) {
        Fragment fragmentM2011d = m2011d();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentM2011d)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: i */
    public final void m2015i(Context context, FragmentManager fragmentManager) {
        m2019m();
        SupportRequestManagerFragment supportRequestManagerFragmentM6693r = ComponentCallbacks2C2858c.m1680c(context).m1696k().m6693r(context, fragmentManager);
        this.f946d = supportRequestManagerFragmentM6693r;
        if (equals(supportRequestManagerFragmentM6693r)) {
            return;
        }
        this.f946d.m2008a(this);
    }

    /* renamed from: j */
    public final void m2016j(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f945c.remove(supportRequestManagerFragment);
    }

    /* renamed from: k */
    public void m2017k(Fragment fragment) {
        FragmentManager fragmentManagerM2007g;
        this.f948f = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerM2007g = m2007g(fragment)) == null) {
            return;
        }
        m2015i(fragment.getContext(), fragmentManagerM2007g);
    }

    /* renamed from: l */
    public void m2018l(ComponentCallbacks2C2862g componentCallbacks2C2862g) {
        this.f947e = componentCallbacks2C2862g;
    }

    /* renamed from: m */
    public final void m2019m() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f946d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.m2016j(this);
            this.f946d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerM2007g = m2007g(this);
        if (fragmentManagerM2007g == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m2015i(getContext(), fragmentManagerM2007g);
            } catch (IllegalStateException e4) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e4);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f943a.m6655c();
        m2019m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f948f = null;
        m2019m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f943a.m6656d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f943a.m6657e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m2011d() + "}";
    }

    public SupportRequestManagerFragment(C4689a c4689a) {
        this.f944b = new C2897a();
        this.f945c = new HashSet();
        this.f943a = c4689a;
    }
}

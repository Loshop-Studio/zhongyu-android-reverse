package p288x0;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.ComponentCallbacks2C5475f;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;

/* renamed from: x0.m */
/* loaded from: classes3.dex */
public class C9860m implements Handler.Callback {

    /* renamed from: i */
    public static final b f17594i = new a();

    /* renamed from: a */
    public volatile ComponentCallbacks2C5475f f17595a;

    /* renamed from: d */
    public final Handler f17598d;

    /* renamed from: e */
    public final b f17599e;

    /* renamed from: b */
    public final Map f17596b = new HashMap();

    /* renamed from: c */
    public final Map f17597c = new HashMap();

    /* renamed from: f */
    public final ArrayMap f17600f = new ArrayMap();

    /* renamed from: g */
    public final ArrayMap f17601g = new ArrayMap();

    /* renamed from: h */
    public final Bundle f17602h = new Bundle();

    /* renamed from: x0.m$a */
    public class a implements b {
        @Override // p288x0.C9860m.b
        /* renamed from: a */
        public ComponentCallbacks2C5475f mo16829a(ComponentCallbacks2C5471b componentCallbacks2C5471b, InterfaceC9855h interfaceC9855h, InterfaceC9861n interfaceC9861n, Context context) {
            return new ComponentCallbacks2C5475f(componentCallbacks2C5471b, interfaceC9855h, interfaceC9861n, context);
        }
    }

    /* renamed from: x0.m$b */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C5475f mo16829a(ComponentCallbacks2C5471b componentCallbacks2C5471b, InterfaceC9855h interfaceC9855h, InterfaceC9861n interfaceC9861n, Context context);
    }

    public C9860m(b bVar) {
        this.f17599e = bVar == null ? f17594i : bVar;
        this.f17598d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public static void m16808a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static Activity m16809b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m16809b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: e */
    public static void m16810e(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m16810e(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: t */
    public static boolean m16811t(Context context) {
        Activity activityM16809b = m16809b(context);
        return activityM16809b == null || !activityM16809b.isFinishing();
    }

    /* renamed from: c */
    public final void m16812c(FragmentManager fragmentManager, ArrayMap arrayMap) {
        if (Build.VERSION.SDK_INT < 26) {
            m16813d(fragmentManager, arrayMap);
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                m16812c(fragment.getChildFragmentManager(), arrayMap);
            }
        }
    }

    /* renamed from: d */
    public final void m16813d(FragmentManager fragmentManager, ArrayMap arrayMap) {
        android.app.Fragment fragment;
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            this.f17602h.putInt("key", i9);
            try {
                fragment = fragmentManager.getFragment(this.f17602h, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                m16812c(fragment.getChildFragmentManager(), arrayMap);
            }
            i9 = i10;
        }
    }

    /* renamed from: f */
    public final android.app.Fragment m16814f(View view, Activity activity) {
        this.f17601g.clear();
        m16812c(activity.getFragmentManager(), this.f17601g);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (android.app.Fragment) this.f17601g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f17601g.clear();
        return fragment;
    }

    /* renamed from: g */
    public final Fragment m16815g(View view, FragmentActivity fragmentActivity) {
        this.f17600f.clear();
        m16810e(fragmentActivity.getSupportFragmentManager().getFragments(), this.f17600f);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f17600f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f17600f.clear();
        return fragment;
    }

    /* renamed from: h */
    public final ComponentCallbacks2C5475f m16816h(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z9) {
        FragmentC9858k fragmentC9858kM16825q = m16825q(fragmentManager, fragment, z9);
        ComponentCallbacks2C5475f componentCallbacks2C5475fM16799e = fragmentC9858kM16825q.m16799e();
        if (componentCallbacks2C5475fM16799e != null) {
            return componentCallbacks2C5475fM16799e;
        }
        ComponentCallbacks2C5475f componentCallbacks2C5475fMo16829a = this.f17599e.mo16829a(ComponentCallbacks2C5471b.m3006c(context), fragmentC9858kM16825q.m16797c(), fragmentC9858kM16825q.m16800f(), context);
        fragmentC9858kM16825q.m16805k(componentCallbacks2C5475fMo16829a);
        return componentCallbacks2C5475fMo16829a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i9 = message.what;
        boolean z9 = true;
        if (i9 == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f17596b.remove(obj);
        } else {
            if (i9 != 2) {
                obj3 = null;
                z9 = false;
                obj2 = null;
                if (z9 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z9;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            objRemove = this.f17597c.remove(obj);
        }
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z9) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z9;
    }

    /* renamed from: i */
    public ComponentCallbacks2C5475f m16817i(Activity activity) {
        if (AbstractC7838j.m12272o()) {
            return m16819k(activity.getApplicationContext());
        }
        m16808a(activity);
        return m16816h(activity, activity.getFragmentManager(), null, m16811t(activity));
    }

    /* renamed from: j */
    public ComponentCallbacks2C5475f m16818j(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (AbstractC7838j.m12272o()) {
            return m16819k(fragment.getActivity().getApplicationContext());
        }
        return m16816h(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: k */
    public ComponentCallbacks2C5475f m16819k(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC7838j.m12273p() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m16822n((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m16817i((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m16819k(contextWrapper.getBaseContext());
                }
            }
        }
        return m16823o(context);
    }

    /* renamed from: l */
    public ComponentCallbacks2C5475f m16820l(View view) {
        if (AbstractC7838j.m12272o()) {
            return m16819k(view.getContext().getApplicationContext());
        }
        AbstractC7837i.m12256d(view);
        AbstractC7837i.m12257e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM16809b = m16809b(view.getContext());
        if (activityM16809b == null) {
            return m16819k(view.getContext().getApplicationContext());
        }
        if (!(activityM16809b instanceof FragmentActivity)) {
            android.app.Fragment fragmentM16814f = m16814f(view, activityM16809b);
            return fragmentM16814f == null ? m16817i(activityM16809b) : m16818j(fragmentM16814f);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM16809b;
        Fragment fragmentM16815g = m16815g(view, fragmentActivity);
        return fragmentM16815g != null ? m16821m(fragmentM16815g) : m16822n(fragmentActivity);
    }

    /* renamed from: m */
    public ComponentCallbacks2C5475f m16821m(Fragment fragment) {
        AbstractC7837i.m12257e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC7838j.m12272o()) {
            return m16819k(fragment.getContext().getApplicationContext());
        }
        return m16828u(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: n */
    public ComponentCallbacks2C5475f m16822n(FragmentActivity fragmentActivity) {
        if (AbstractC7838j.m12272o()) {
            return m16819k(fragmentActivity.getApplicationContext());
        }
        m16808a(fragmentActivity);
        return m16828u(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, m16811t(fragmentActivity));
    }

    /* renamed from: o */
    public final ComponentCallbacks2C5475f m16823o(Context context) {
        if (this.f17595a == null) {
            synchronized (this) {
                try {
                    if (this.f17595a == null) {
                        this.f17595a = this.f17599e.mo16829a(ComponentCallbacks2C5471b.m3006c(context.getApplicationContext()), new C9849b(), new C9854g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f17595a;
    }

    /* renamed from: p */
    public FragmentC9858k m16824p(Activity activity) {
        return m16825q(activity.getFragmentManager(), null, m16811t(activity));
    }

    /* renamed from: q */
    public final FragmentC9858k m16825q(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z9) {
        FragmentC9858k fragmentC9858k = (FragmentC9858k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC9858k == null && (fragmentC9858k = (FragmentC9858k) this.f17596b.get(fragmentManager)) == null) {
            fragmentC9858k = new FragmentC9858k();
            fragmentC9858k.m16804j(fragment);
            if (z9) {
                fragmentC9858k.m16797c().m16789d();
            }
            this.f17596b.put(fragmentManager, fragmentC9858k);
            fragmentManager.beginTransaction().add(fragmentC9858k, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f17598d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC9858k;
    }

    /* renamed from: r */
    public SupportRequestManagerFragment m16826r(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m16827s(fragmentManager, null, m16811t(context));
    }

    /* renamed from: s */
    public final SupportRequestManagerFragment m16827s(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z9) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = (SupportRequestManagerFragment) this.f17597c.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.m3339m(fragment);
            if (z9) {
                supportRequestManagerFragment.m3332e().m16789d();
            }
            this.f17597c.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.beginTransaction().add(supportRequestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f17598d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    /* renamed from: u */
    public final ComponentCallbacks2C5475f m16828u(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z9) {
        SupportRequestManagerFragment supportRequestManagerFragmentM16827s = m16827s(fragmentManager, fragment, z9);
        ComponentCallbacks2C5475f componentCallbacks2C5475fM3334g = supportRequestManagerFragmentM16827s.m3334g();
        if (componentCallbacks2C5475fM3334g != null) {
            return componentCallbacks2C5475fM3334g;
        }
        ComponentCallbacks2C5475f componentCallbacks2C5475fMo16829a = this.f17599e.mo16829a(ComponentCallbacks2C5471b.m3006c(context), supportRequestManagerFragmentM16827s.m3332e(), supportRequestManagerFragmentM16827s.m3335h(), context);
        supportRequestManagerFragmentM16827s.m3340n(componentCallbacks2C5475fMo16829a);
        return componentCallbacks2C5475fMo16829a;
    }
}

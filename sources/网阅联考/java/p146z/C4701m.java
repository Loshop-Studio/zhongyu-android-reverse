package p146z;

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
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.ComponentCallbacks2C2862g;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;

/* renamed from: z.m */
/* loaded from: classes2.dex */
public class C4701m implements Handler.Callback {

    /* renamed from: i */
    public static final b f6051i = new a();

    /* renamed from: a */
    public volatile ComponentCallbacks2C2862g f6052a;

    /* renamed from: d */
    public final Handler f6055d;

    /* renamed from: e */
    public final b f6056e;

    /* renamed from: b */
    public final Map f6053b = new HashMap();

    /* renamed from: c */
    public final Map f6054c = new HashMap();

    /* renamed from: f */
    public final ArrayMap f6057f = new ArrayMap();

    /* renamed from: g */
    public final ArrayMap f6058g = new ArrayMap();

    /* renamed from: h */
    public final Bundle f6059h = new Bundle();

    /* renamed from: z.m$a */
    public class a implements b {
        @Override // p146z.C4701m.b
        /* renamed from: a */
        public ComponentCallbacks2C2862g mo6696a(ComponentCallbacks2C2858c componentCallbacks2C2858c, InterfaceC4696h interfaceC4696h, InterfaceC4702n interfaceC4702n, Context context) {
            return new ComponentCallbacks2C2862g(componentCallbacks2C2858c, interfaceC4696h, interfaceC4702n, context);
        }
    }

    /* renamed from: z.m$b */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C2862g mo6696a(ComponentCallbacks2C2858c componentCallbacks2C2858c, InterfaceC4696h interfaceC4696h, InterfaceC4702n interfaceC4702n, Context context);
    }

    public C4701m(b bVar) {
        this.f6056e = bVar == null ? f6051i : bVar;
        this.f6055d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public static void m6675a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static Activity m6676b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6676b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: e */
    public static void m6677e(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m6677e(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: t */
    public static boolean m6678t(Context context) {
        Activity activityM6676b = m6676b(context);
        return activityM6676b == null || !activityM6676b.isFinishing();
    }

    /* renamed from: c */
    public final void m6679c(FragmentManager fragmentManager, ArrayMap arrayMap) {
        if (Build.VERSION.SDK_INT < 26) {
            m6680d(fragmentManager, arrayMap);
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                m6679c(fragment.getChildFragmentManager(), arrayMap);
            }
        }
    }

    /* renamed from: d */
    public final void m6680d(FragmentManager fragmentManager, ArrayMap arrayMap) {
        android.app.Fragment fragment;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            this.f6059h.putInt("key", i4);
            try {
                fragment = fragmentManager.getFragment(this.f6059h, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                m6679c(fragment.getChildFragmentManager(), arrayMap);
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final android.app.Fragment m6681f(View view, Activity activity) {
        this.f6058g.clear();
        m6679c(activity.getFragmentManager(), this.f6058g);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (android.app.Fragment) this.f6058g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f6058g.clear();
        return fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final Fragment m6682g(View view, FragmentActivity fragmentActivity) {
        this.f6057f.clear();
        m6677e(fragmentActivity.getSupportFragmentManager().getFragments(), this.f6057f);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f6057f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f6057f.clear();
        return fragment;
    }

    /* renamed from: h */
    public final ComponentCallbacks2C2862g m6683h(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z3) {
        FragmentC4699k fragmentC4699kM6692q = m6692q(fragmentManager, fragment, z3);
        ComponentCallbacks2C2862g componentCallbacks2C2862gM6666e = fragmentC4699kM6692q.m6666e();
        if (componentCallbacks2C2862gM6666e != null) {
            return componentCallbacks2C2862gM6666e;
        }
        ComponentCallbacks2C2862g componentCallbacks2C2862gMo6696a = this.f6056e.mo6696a(ComponentCallbacks2C2858c.m1680c(context), fragmentC4699kM6692q.m6664c(), fragmentC4699kM6692q.m6667f(), context);
        fragmentC4699kM6692q.m6672k(componentCallbacks2C2862gMo6696a);
        return componentCallbacks2C2862gMo6696a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i4 = message.what;
        boolean z3 = true;
        if (i4 == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f6053b.remove(obj);
        } else {
            if (i4 != 2) {
                obj3 = null;
                z3 = false;
                obj2 = null;
                if (z3 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z3;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            objRemove = this.f6054c.remove(obj);
        }
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z3) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z3;
    }

    /* renamed from: i */
    public ComponentCallbacks2C2862g m6684i(Activity activity) {
        if (AbstractC3750j.m4784o()) {
            return m6686k(activity.getApplicationContext());
        }
        m6675a(activity);
        return m6683h(activity, activity.getFragmentManager(), null, m6678t(activity));
    }

    /* renamed from: j */
    public ComponentCallbacks2C2862g m6685j(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (AbstractC3750j.m4784o()) {
            return m6686k(fragment.getActivity().getApplicationContext());
        }
        return m6683h(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: k */
    public ComponentCallbacks2C2862g m6686k(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC3750j.m4785p() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m6689n((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m6684i((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m6686k(contextWrapper.getBaseContext());
                }
            }
        }
        return m6690o(context);
    }

    /* renamed from: l */
    public ComponentCallbacks2C2862g m6687l(View view) {
        if (AbstractC3750j.m4784o()) {
            return m6686k(view.getContext().getApplicationContext());
        }
        AbstractC3749i.m4768d(view);
        AbstractC3749i.m4769e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM6676b = m6676b(view.getContext());
        if (activityM6676b == null) {
            return m6686k(view.getContext().getApplicationContext());
        }
        if (!(activityM6676b instanceof FragmentActivity)) {
            android.app.Fragment fragmentM6681f = m6681f(view, activityM6676b);
            return fragmentM6681f == null ? m6684i(activityM6676b) : m6685j(fragmentM6681f);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM6676b;
        Fragment fragmentM6682g = m6682g(view, fragmentActivity);
        return fragmentM6682g != null ? m6688m(fragmentM6682g) : m6689n(fragmentActivity);
    }

    /* renamed from: m */
    public ComponentCallbacks2C2862g m6688m(Fragment fragment) {
        AbstractC3749i.m4769e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC3750j.m4784o()) {
            return m6686k(fragment.getContext().getApplicationContext());
        }
        return m6695u(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: n */
    public ComponentCallbacks2C2862g m6689n(FragmentActivity fragmentActivity) {
        if (AbstractC3750j.m4784o()) {
            return m6686k(fragmentActivity.getApplicationContext());
        }
        m6675a(fragmentActivity);
        return m6695u(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, m6678t(fragmentActivity));
    }

    /* renamed from: o */
    public final ComponentCallbacks2C2862g m6690o(Context context) {
        if (this.f6052a == null) {
            synchronized (this) {
                if (this.f6052a == null) {
                    this.f6052a = this.f6056e.mo6696a(ComponentCallbacks2C2858c.m1680c(context.getApplicationContext()), new C4690b(), new C4695g(), context.getApplicationContext());
                }
            }
        }
        return this.f6052a;
    }

    /* renamed from: p */
    public FragmentC4699k m6691p(Activity activity) {
        return m6692q(activity.getFragmentManager(), null, m6678t(activity));
    }

    /* renamed from: q */
    public final FragmentC4699k m6692q(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z3) {
        FragmentC4699k fragmentC4699k = (FragmentC4699k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC4699k == null && (fragmentC4699k = (FragmentC4699k) this.f6053b.get(fragmentManager)) == null) {
            fragmentC4699k = new FragmentC4699k();
            fragmentC4699k.m6671j(fragment);
            if (z3) {
                fragmentC4699k.m6664c().m6656d();
            }
            this.f6053b.put(fragmentManager, fragmentC4699k);
            fragmentManager.beginTransaction().add(fragmentC4699k, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f6055d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC4699k;
    }

    /* renamed from: r */
    public SupportRequestManagerFragment m6693r(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m6694s(fragmentManager, null, m6678t(context));
    }

    /* renamed from: s */
    public final SupportRequestManagerFragment m6694s(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z3) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = (SupportRequestManagerFragment) this.f6054c.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.m2017k(fragment);
            if (z3) {
                supportRequestManagerFragment.m2010c().m6656d();
            }
            this.f6054c.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.beginTransaction().add(supportRequestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f6055d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    /* renamed from: u */
    public final ComponentCallbacks2C2862g m6695u(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z3) {
        SupportRequestManagerFragment supportRequestManagerFragmentM6694s = m6694s(fragmentManager, fragment, z3);
        ComponentCallbacks2C2862g componentCallbacks2C2862gM2012e = supportRequestManagerFragmentM6694s.m2012e();
        if (componentCallbacks2C2862gM2012e != null) {
            return componentCallbacks2C2862gM2012e;
        }
        ComponentCallbacks2C2862g componentCallbacks2C2862gMo6696a = this.f6056e.mo6696a(ComponentCallbacks2C2858c.m1680c(context), supportRequestManagerFragmentM6694s.m2010c(), supportRequestManagerFragmentM6694s.m2013f(), context);
        supportRequestManagerFragmentM6694s.m2018l(componentCallbacks2C2862gMo6696a);
        return componentCallbacks2C2862gMo6696a;
    }
}

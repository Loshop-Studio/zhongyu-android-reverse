package p020b1;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.ComponentCallbacks2C5348h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p261v0.C9647t;

/* renamed from: b1.o */
/* loaded from: classes3.dex */
public class C4956o implements Handler.Callback {

    /* renamed from: f */
    public static final b f2369f = new a();

    /* renamed from: a */
    public volatile ComponentCallbacks2C5348h f2370a;

    /* renamed from: b */
    public final b f2371b;

    /* renamed from: c */
    public final ArrayMap f2372c = new ArrayMap();

    /* renamed from: d */
    public final InterfaceC4950i f2373d;

    /* renamed from: e */
    public final C4954m f2374e;

    /* renamed from: b1.o$a */
    public class a implements b {
        @Override // p020b1.C4956o.b
        /* renamed from: a */
        public ComponentCallbacks2C5348h mo2351a(ComponentCallbacks2C5342b componentCallbacks2C5342b, InterfaceC4951j interfaceC4951j, InterfaceC4957p interfaceC4957p, Context context) {
            return new ComponentCallbacks2C5348h(componentCallbacks2C5342b, interfaceC4951j, interfaceC4957p, context);
        }
    }

    /* renamed from: b1.o$b */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C5348h mo2351a(ComponentCallbacks2C5342b componentCallbacks2C5342b, InterfaceC4951j interfaceC4951j, InterfaceC4957p interfaceC4957p, Context context);
    }

    public C4956o(b bVar) {
        bVar = bVar == null ? f2369f : bVar;
        this.f2371b = bVar;
        this.f2374e = new C4954m(bVar);
        this.f2373d = m2341b();
    }

    /* renamed from: a */
    public static void m2340a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static InterfaceC4950i m2341b() {
        return (C9647t.f16832f && C9647t.f16831e) ? new C4949h() : new C4947f();
    }

    /* renamed from: c */
    public static Activity m2342c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m2342c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    public static void m2343d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m2343d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: k */
    public static boolean m2344k(Context context) {
        Activity activityM2342c = m2342c(context);
        return activityM2342c == null || !activityM2342c.isFinishing();
    }

    /* renamed from: e */
    public final Fragment m2345e(View view, FragmentActivity fragmentActivity) {
        this.f2372c.clear();
        m2343d(fragmentActivity.getSupportFragmentManager().getFragments(), this.f2372c);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f2372c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f2372c.clear();
        return fragment;
    }

    /* renamed from: f */
    public ComponentCallbacks2C5348h m2346f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC7652k.m12702r() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m2349i((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m2346f(contextWrapper.getBaseContext());
                }
            }
        }
        return m2350j(context);
    }

    /* renamed from: g */
    public ComponentCallbacks2C5348h m2347g(View view) {
        if (AbstractC7652k.m12701q()) {
            return m2346f(view.getContext().getApplicationContext());
        }
        AbstractC7651j.m12683d(view);
        AbstractC7651j.m12684e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM2342c = m2342c(view.getContext());
        if (activityM2342c == null) {
            return m2346f(view.getContext().getApplicationContext());
        }
        if (!(activityM2342c instanceof FragmentActivity)) {
            return m2346f(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM2342c;
        Fragment fragmentM2345e = m2345e(view, fragmentActivity);
        return fragmentM2345e != null ? m2348h(fragmentM2345e) : m2349i(fragmentActivity);
    }

    /* renamed from: h */
    public ComponentCallbacks2C5348h m2348h(Fragment fragment) {
        AbstractC7651j.m12684e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC7652k.m12701q()) {
            return m2346f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f2373d.mo2334a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f2374e.m2338b(context, ComponentCallbacks2C5342b.m3291c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: i */
    public ComponentCallbacks2C5348h m2349i(FragmentActivity fragmentActivity) {
        if (AbstractC7652k.m12701q()) {
            return m2346f(fragmentActivity.getApplicationContext());
        }
        m2340a(fragmentActivity);
        this.f2373d.mo2334a(fragmentActivity);
        boolean zM2344k = m2344k(fragmentActivity);
        return this.f2374e.m2338b(fragmentActivity, ComponentCallbacks2C5342b.m3291c(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zM2344k);
    }

    /* renamed from: j */
    public final ComponentCallbacks2C5348h m2350j(Context context) {
        if (this.f2370a == null) {
            synchronized (this) {
                try {
                    if (this.f2370a == null) {
                        this.f2370a = this.f2371b.mo2351a(ComponentCallbacks2C5342b.m3291c(context.getApplicationContext()), new C4942a(), new C4948g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f2370a;
    }
}

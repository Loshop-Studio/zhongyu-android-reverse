package p160u0;

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
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.ComponentCallbacks2C4684i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p118o0.C7509t;

/* renamed from: u0.o */
/* loaded from: classes3.dex */
public class C7762o implements Handler.Callback {

    /* renamed from: f */
    public static final b f10259f = new a();

    /* renamed from: a */
    public volatile ComponentCallbacks2C4684i f10260a;

    /* renamed from: b */
    public final b f10261b;

    /* renamed from: c */
    public final ArrayMap f10262c = new ArrayMap();

    /* renamed from: d */
    public final InterfaceC7756i f10263d;

    /* renamed from: e */
    public final C7760m f10264e;

    /* renamed from: u0.o$a */
    public class a implements b {
        @Override // p160u0.C7762o.b
        /* renamed from: a */
        public ComponentCallbacks2C4684i mo2468a(ComponentCallbacks2C4678c componentCallbacks2C4678c, InterfaceC7757j interfaceC7757j, InterfaceC7763p interfaceC7763p, Context context) {
            return new ComponentCallbacks2C4684i(componentCallbacks2C4678c, interfaceC7757j, interfaceC7763p, context);
        }
    }

    /* renamed from: u0.o$b */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C4684i mo2468a(ComponentCallbacks2C4678c componentCallbacks2C4678c, InterfaceC7757j interfaceC7757j, InterfaceC7763p interfaceC7763p, Context context);
    }

    public C7762o(b bVar) {
        bVar = bVar == null ? f10259f : bVar;
        this.f10261b = bVar;
        this.f10264e = new C7760m(bVar);
        this.f10263d = m9269b();
    }

    /* renamed from: a */
    public static void m9268a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static InterfaceC7756i m9269b() {
        return (C7509t.f9689f && C7509t.f9688e) ? new C7755h() : new C7753f();
    }

    /* renamed from: c */
    public static Activity m9270c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m9270c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    public static void m9271d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m9271d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: k */
    public static boolean m9272k(Context context) {
        Activity activityM9270c = m9270c(context);
        return activityM9270c == null || !activityM9270c.isFinishing();
    }

    /* renamed from: e */
    public final Fragment m9273e(View view, FragmentActivity fragmentActivity) {
        this.f10262c.clear();
        m9271d(fragmentActivity.getSupportFragmentManager().getFragments(), this.f10262c);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f10262c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f10262c.clear();
        return fragment;
    }

    /* renamed from: f */
    public ComponentCallbacks2C4684i m9274f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC4409k.m1457r() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m9277i((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m9274f(contextWrapper.getBaseContext());
                }
            }
        }
        return m9278j(context);
    }

    /* renamed from: g */
    public ComponentCallbacks2C4684i m9275g(View view) {
        if (AbstractC4409k.m1456q()) {
            return m9274f(view.getContext().getApplicationContext());
        }
        AbstractC4408j.m1438d(view);
        AbstractC4408j.m1439e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM9270c = m9270c(view.getContext());
        if (activityM9270c == null) {
            return m9274f(view.getContext().getApplicationContext());
        }
        if (!(activityM9270c instanceof FragmentActivity)) {
            return m9274f(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM9270c;
        Fragment fragmentM9273e = m9273e(view, fragmentActivity);
        return fragmentM9273e != null ? m9276h(fragmentM9273e) : m9277i(fragmentActivity);
    }

    /* renamed from: h */
    public ComponentCallbacks2C4684i m9276h(Fragment fragment) {
        AbstractC4408j.m1439e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC4409k.m1456q()) {
            return m9274f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f10263d.mo9262a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f10264e.m9266b(context, ComponentCallbacks2C4678c.m2470c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: i */
    public ComponentCallbacks2C4684i m9277i(FragmentActivity fragmentActivity) {
        if (AbstractC4409k.m1456q()) {
            return m9274f(fragmentActivity.getApplicationContext());
        }
        m9268a(fragmentActivity);
        this.f10263d.mo9262a(fragmentActivity);
        boolean zM9272k = m9272k(fragmentActivity);
        return this.f10264e.m9266b(fragmentActivity, ComponentCallbacks2C4678c.m2470c(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zM9272k);
    }

    /* renamed from: j */
    public final ComponentCallbacks2C4684i m9278j(Context context) {
        if (this.f10260a == null) {
            synchronized (this) {
                try {
                    if (this.f10260a == null) {
                        this.f10260a = this.f10261b.mo2468a(ComponentCallbacks2C4678c.m2470c(context.getApplicationContext()), new C7748a(), new C7754g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f10260a;
    }
}

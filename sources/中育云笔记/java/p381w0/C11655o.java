package p381w0;

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
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.ComponentCallbacks2C5816h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p298q0.C10710s;

/* renamed from: w0.o */
/* loaded from: classes3.dex */
public class C11655o implements Handler.Callback {

    /* renamed from: h */
    public static final b f27661h = new a();

    /* renamed from: c */
    public volatile ComponentCallbacks2C5816h f27662c;

    /* renamed from: d */
    public final b f27663d;

    /* renamed from: e */
    public final ArrayMap f27664e = new ArrayMap();

    /* renamed from: f */
    public final InterfaceC11649i f27665f;

    /* renamed from: g */
    public final C11653m f27666g;

    /* renamed from: w0.o$a */
    public class a implements b {
        @Override // p381w0.C11655o.b
        /* renamed from: a */
        public ComponentCallbacks2C5816h mo25780a(ComponentCallbacks2C5810b componentCallbacks2C5810b, InterfaceC11650j interfaceC11650j, InterfaceC11656p interfaceC11656p, Context context) {
            return new ComponentCallbacks2C5816h(componentCallbacks2C5810b, interfaceC11650j, interfaceC11656p, context);
        }
    }

    /* renamed from: w0.o$b */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C5816h mo25780a(ComponentCallbacks2C5810b componentCallbacks2C5810b, InterfaceC11650j interfaceC11650j, InterfaceC11656p interfaceC11656p, Context context);
    }

    public C11655o(b bVar) {
        bVar = bVar == null ? f27661h : bVar;
        this.f27663d = bVar;
        this.f27666g = new C11653m(bVar);
        this.f27665f = m25770b();
    }

    /* renamed from: a */
    public static void m25769a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static InterfaceC11649i m25770b() {
        return (C10710s.f25772f && C10710s.f25771e) ? new C11648h() : new C11646f();
    }

    /* renamed from: c */
    public static Activity m25771c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m25771c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    public static void m25772d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m25772d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: k */
    public static boolean m25773k(Context context) {
        Activity activityM25771c = m25771c(context);
        return activityM25771c == null || !activityM25771c.isFinishing();
    }

    /* renamed from: e */
    public final Fragment m25774e(View view, FragmentActivity fragmentActivity) {
        this.f27664e.clear();
        m25772d(fragmentActivity.getSupportFragmentManager().getFragments(), this.f27664e);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f27664e.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f27664e.clear();
        return fragment;
    }

    /* renamed from: f */
    public ComponentCallbacks2C5816h m25775f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC8910k.m17488s() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m25778i((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m25775f(contextWrapper.getBaseContext());
                }
            }
        }
        return m25779j(context);
    }

    /* renamed from: g */
    public ComponentCallbacks2C5816h m25776g(View view) {
        if (AbstractC8910k.m17487r()) {
            return m25775f(view.getContext().getApplicationContext());
        }
        AbstractC8909j.m17468d(view);
        AbstractC8909j.m17469e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM25771c = m25771c(view.getContext());
        if (activityM25771c == null) {
            return m25775f(view.getContext().getApplicationContext());
        }
        if (!(activityM25771c instanceof FragmentActivity)) {
            return m25775f(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM25771c;
        Fragment fragmentM25774e = m25774e(view, fragmentActivity);
        return fragmentM25774e != null ? m25777h(fragmentM25774e) : m25778i(fragmentActivity);
    }

    /* renamed from: h */
    public ComponentCallbacks2C5816h m25777h(Fragment fragment) {
        AbstractC8909j.m17469e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC8910k.m17487r()) {
            return m25775f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f27665f.mo25763a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f27666g.m25767b(context, ComponentCallbacks2C5810b.m3940c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: i */
    public ComponentCallbacks2C5816h m25778i(FragmentActivity fragmentActivity) {
        if (AbstractC8910k.m17487r()) {
            return m25775f(fragmentActivity.getApplicationContext());
        }
        m25769a(fragmentActivity);
        this.f27665f.mo25763a(fragmentActivity);
        boolean zM25773k = m25773k(fragmentActivity);
        return this.f27666g.m25767b(fragmentActivity, ComponentCallbacks2C5810b.m3940c(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zM25773k);
    }

    /* renamed from: j */
    public final ComponentCallbacks2C5816h m25779j(Context context) {
        if (this.f27662c == null) {
            synchronized (this) {
                try {
                    if (this.f27662c == null) {
                        this.f27662c = this.f27663d.mo25780a(ComponentCallbacks2C5810b.m3940c(context.getApplicationContext()), new C11641a(), new C11647g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f27662c;
    }
}

package p001a0;

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
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.ComponentCallbacks2C5397h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p259u.C10159w;

/* renamed from: a0.o */
/* loaded from: classes3.dex */
public class C0015o implements Handler.Callback {

    /* renamed from: f */
    public static final b f31f = new a();

    /* renamed from: a */
    public volatile ComponentCallbacks2C5397h f32a;

    /* renamed from: b */
    public final b f33b;

    /* renamed from: c */
    public final ArrayMap f34c = new ArrayMap();

    /* renamed from: d */
    public final InterfaceC0009i f35d;

    /* renamed from: e */
    public final C0013m f36e;

    /* renamed from: a0.o$a */
    public class a implements b {
        @Override // p001a0.C0015o.b
        /* renamed from: a */
        public ComponentCallbacks2C5397h mo23a(ComponentCallbacks2C5391b componentCallbacks2C5391b, InterfaceC0010j interfaceC0010j, InterfaceC0016p interfaceC0016p, Context context) {
            return new ComponentCallbacks2C5397h(componentCallbacks2C5391b, interfaceC0010j, interfaceC0016p, context);
        }
    }

    /* renamed from: a0.o$b */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C5397h mo23a(ComponentCallbacks2C5391b componentCallbacks2C5391b, InterfaceC0010j interfaceC0010j, InterfaceC0016p interfaceC0016p, Context context);
    }

    public C0015o(b bVar) {
        bVar = bVar == null ? f31f : bVar;
        this.f33b = bVar;
        this.f36e = new C0013m(bVar);
        this.f35d = m13b();
    }

    /* renamed from: a */
    public static void m12a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static InterfaceC0009i m13b() {
        return (C10159w.f20277f && C10159w.f20276e) ? new C0008h() : new C0006f();
    }

    /* renamed from: c */
    public static Activity m14c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m14c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    public static void m15d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m15d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: k */
    public static boolean m16k(Context context) {
        Activity activityM14c = m14c(context);
        return activityM14c == null || !activityM14c.isFinishing();
    }

    /* renamed from: e */
    public final Fragment m17e(View view, FragmentActivity fragmentActivity) {
        this.f34c.clear();
        m15d(fragmentActivity.getSupportFragmentManager().getFragments(), this.f34c);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f34c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f34c.clear();
        return fragment;
    }

    /* renamed from: f */
    public ComponentCallbacks2C5397h m18f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC8707k.m14201s() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m21i((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m18f(contextWrapper.getBaseContext());
                }
            }
        }
        return m22j(context);
    }

    /* renamed from: g */
    public ComponentCallbacks2C5397h m19g(View view) {
        if (AbstractC8707k.m14200r()) {
            return m18f(view.getContext().getApplicationContext());
        }
        AbstractC8706j.m14181d(view);
        AbstractC8706j.m14182e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM14c = m14c(view.getContext());
        if (activityM14c == null) {
            return m18f(view.getContext().getApplicationContext());
        }
        if (!(activityM14c instanceof FragmentActivity)) {
            return m18f(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM14c;
        Fragment fragmentM17e = m17e(view, fragmentActivity);
        return fragmentM17e != null ? m20h(fragmentM17e) : m21i(fragmentActivity);
    }

    /* renamed from: h */
    public ComponentCallbacks2C5397h m20h(Fragment fragment) {
        AbstractC8706j.m14182e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC8707k.m14200r()) {
            return m18f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f35d.mo6a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f36e.m10b(context, ComponentCallbacks2C5391b.m2732c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: i */
    public ComponentCallbacks2C5397h m21i(FragmentActivity fragmentActivity) {
        if (AbstractC8707k.m14200r()) {
            return m18f(fragmentActivity.getApplicationContext());
        }
        m12a(fragmentActivity);
        this.f35d.mo6a(fragmentActivity);
        boolean zM16k = m16k(fragmentActivity);
        return this.f36e.m10b(fragmentActivity, ComponentCallbacks2C5391b.m2732c(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zM16k);
    }

    /* renamed from: j */
    public final ComponentCallbacks2C5397h m22j(Context context) {
        if (this.f32a == null) {
            synchronized (this) {
                try {
                    if (this.f32a == null) {
                        this.f32a = this.f33b.mo23a(ComponentCallbacks2C5391b.m2732c(context.getApplicationContext()), new C0001a(), new C0007g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f32a;
    }
}

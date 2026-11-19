package p127o0;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import io.reactivex.internal.operators.observable.C5707c;
import io.reactivex.internal.operators.observable.C5712h;
import java.util.HashMap;
import p032c8.C3238c;
import p129o2.C6268a;
import p180v0.AbstractC6664k;

/* renamed from: o0.h */
/* loaded from: classes2.dex */
public final class C6262h implements Handler.Callback {

    /* renamed from: f */
    public static final C3238c f10011f = new C3238c();

    /* renamed from: a */
    public volatile ComponentCallbacks2C3414h f10012a;

    /* renamed from: b */
    public final HashMap f10013b = new HashMap();

    /* renamed from: c */
    public final HashMap f10014c = new HashMap();

    /* renamed from: d */
    public final Handler f10015d;

    /* renamed from: e */
    public final C3238c f10016e;

    public C6262h() {
        new ArrayMap();
        new ArrayMap();
        new Bundle();
        this.f10016e = f10011f;
        this.f10015d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public static Activity m5860a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5860a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m5861f(Context context) {
        Activity activityM5860a = m5860a(context);
        return activityM5860a == null || !activityM5860a.isFinishing();
    }

    /* renamed from: b */
    public final ComponentCallbacks2C3414h m5862b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC6664k.f11243a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m5863c((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return m5862b(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                RequestManagerFragment requestManagerFragmentM5864d = m5864d(activity.getFragmentManager(), m5861f(activity));
                ComponentCallbacks2C3414h componentCallbacks2C3414h = requestManagerFragmentM5864d.f2323d;
                if (componentCallbacks2C3414h != null) {
                    return componentCallbacks2C3414h;
                }
                ComponentCallbacks2C3408b componentCallbacks2C3408bM2360c = ComponentCallbacks2C3408b.m2360c(activity);
                C3238c c3238c = this.f10016e;
                C6255a c6255a = requestManagerFragmentM5864d.f2320a;
                C6268a c6268a = requestManagerFragmentM5864d.f2321b;
                c3238c.getClass();
                ComponentCallbacks2C3414h componentCallbacks2C3414h2 = new ComponentCallbacks2C3414h(componentCallbacks2C3408bM2360c, c6255a, c6268a, activity);
                requestManagerFragmentM5864d.f2323d = componentCallbacks2C3414h2;
                return componentCallbacks2C3414h2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m5862b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f10012a == null) {
            synchronized (this) {
                try {
                    if (this.f10012a == null) {
                        ComponentCallbacks2C3408b componentCallbacks2C3408bM2360c2 = ComponentCallbacks2C3408b.m2360c(context.getApplicationContext());
                        C3238c c3238c2 = this.f10016e;
                        C5707c c5707c = new C5707c();
                        C5712h c5712h = new C5712h(7);
                        Context applicationContext = context.getApplicationContext();
                        c3238c2.getClass();
                        this.f10012a = new ComponentCallbacks2C3414h(componentCallbacks2C3408bM2360c2, c5707c, c5712h, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.f10012a;
    }

    /* renamed from: c */
    public final ComponentCallbacks2C3414h m5863c(FragmentActivity fragmentActivity) {
        char[] cArr = AbstractC6664k.f11243a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return m5862b(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        SupportRequestManagerFragment supportRequestManagerFragmentM5865e = m5865e(fragmentActivity.getSupportFragmentManager(), null, m5861f(fragmentActivity));
        ComponentCallbacks2C3414h componentCallbacks2C3414h = supportRequestManagerFragmentM5865e.f2329e;
        if (componentCallbacks2C3414h != null) {
            return componentCallbacks2C3414h;
        }
        ComponentCallbacks2C3408b componentCallbacks2C3408bM2360c = ComponentCallbacks2C3408b.m2360c(fragmentActivity);
        C6255a c6255a = supportRequestManagerFragmentM5865e.f2325a;
        C6268a c6268a = supportRequestManagerFragmentM5865e.f2326b;
        this.f10016e.getClass();
        ComponentCallbacks2C3414h componentCallbacks2C3414h2 = new ComponentCallbacks2C3414h(componentCallbacks2C3408bM2360c, c6255a, c6268a, fragmentActivity);
        supportRequestManagerFragmentM5865e.f2329e = componentCallbacks2C3414h2;
        return componentCallbacks2C3414h2;
    }

    /* renamed from: d */
    public final RequestManagerFragment m5864d(FragmentManager fragmentManager, boolean z8) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        HashMap map = this.f10013b;
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) map.get(fragmentManager);
        if (requestManagerFragment2 == null) {
            requestManagerFragment2 = new RequestManagerFragment();
            if (z8) {
                requestManagerFragment2.f2320a.m5857b();
            }
            map.put(fragmentManager, requestManagerFragment2);
            fragmentManager.beginTransaction().add(requestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f10015d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment2;
    }

    /* renamed from: e */
    public final SupportRequestManagerFragment m5865e(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z8) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        HashMap map = this.f10014c;
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) map.get(fragmentManager);
        if (supportRequestManagerFragment2 == null) {
            supportRequestManagerFragment2 = new SupportRequestManagerFragment();
            supportRequestManagerFragment2.f2330f = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment parentFragment = fragment;
                while (parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = parentFragment.getFragmentManager();
                if (fragmentManager2 != null) {
                    supportRequestManagerFragment2.m2418e(fragment.getContext(), fragmentManager2);
                }
            }
            if (z8) {
                supportRequestManagerFragment2.f2325a.m5857b();
            }
            map.put(fragmentManager, supportRequestManagerFragment2);
            fragmentManager.beginTransaction().add(supportRequestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f10015d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i = message.what;
        boolean z8 = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f10013b.remove(obj);
        } else {
            if (i != 2) {
                obj3 = null;
                z8 = false;
                obj2 = null;
                if (z8 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z8;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            objRemove = this.f10014c.remove(obj);
        }
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z8) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z8;
    }
}

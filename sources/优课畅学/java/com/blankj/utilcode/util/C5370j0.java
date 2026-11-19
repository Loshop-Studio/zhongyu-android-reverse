package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC5366h0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.blankj.utilcode.util.j0 */
/* loaded from: classes3.dex */
public final class C5370j0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public static final C5370j0 f2709g = new C5370j0();

    /* renamed from: h */
    public static final Activity f2710h = new Activity();

    /* renamed from: a */
    public final LinkedList f2711a = new LinkedList();

    /* renamed from: b */
    public final List f2712b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Map f2713c = new ConcurrentHashMap();

    /* renamed from: d */
    public int f2714d = 0;

    /* renamed from: e */
    public int f2715e = 0;

    /* renamed from: f */
    public boolean f2716f = false;

    /* renamed from: com.blankj.utilcode.util.j0$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2717a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC5366h0.a f2718b;

        public a(Activity activity, AbstractC5366h0.a aVar) {
            this.f2717a = activity;
            this.f2718b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5370j0.this.m2501e(this.f2717a, this.f2718b);
        }
    }

    /* renamed from: com.blankj.utilcode.util.j0$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2720a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC5366h0.a f2721b;

        public b(Activity activity, AbstractC5366h0.a aVar) {
            this.f2720a = activity;
            this.f2721b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5370j0.this.m2516t(this.f2720a, this.f2721b);
        }
    }

    /* renamed from: com.blankj.utilcode.util.j0$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2723a;

        /* renamed from: b */
        public final /* synthetic */ Object f2724b;

        public c(Activity activity, Object obj) {
            this.f2723a = activity;
            this.f2724b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Window window = this.f2723a.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.f2724b).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    public static void m2498u() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                    Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void m2499c(Activity activity, AbstractC5366h0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        AbstractC5372k0.m2539J(new a(activity, aVar));
    }

    /* renamed from: d */
    public void m2500d(AbstractC5366h0.a aVar) {
        m2499c(f2710h, aVar);
    }

    /* renamed from: e */
    public final void m2501e(Activity activity, AbstractC5366h0.a aVar) {
        List copyOnWriteArrayList = (List) this.f2713c.get(activity);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f2713c.put(activity, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(aVar)) {
            return;
        }
        copyOnWriteArrayList.add(aVar);
    }

    /* renamed from: f */
    public final void m2502f(Activity activity, Lifecycle.Event event) {
        m2503g(activity, event, (List) this.f2713c.get(activity));
        m2503g(activity, event, (List) this.f2713c.get(f2710h));
    }

    /* renamed from: g */
    public final void m2503g(Activity activity, Lifecycle.Event event, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5366h0.a aVar = (AbstractC5366h0.a) it.next();
            aVar.m2485g(activity, event);
            if (event.equals(Lifecycle.Event.ON_CREATE)) {
                aVar.mo2418a(activity);
            } else if (event.equals(Lifecycle.Event.ON_START)) {
                aVar.m2483e(activity);
            } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                aVar.m2482d(activity);
            } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                aVar.m2481c(activity);
            } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                aVar.m2484f(activity);
            } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                aVar.m2480b(activity);
            }
        }
        if (event.equals(Lifecycle.Event.ON_DESTROY)) {
            this.f2713c.remove(activity);
        }
    }

    /* renamed from: h */
    public final List m2504h() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objM2506j;
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            objM2506j = m2506j();
        } catch (Exception e10) {
            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e10.getMessage());
        }
        if (objM2506j != null) {
            Field declaredField = objM2506j.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objM2506j);
            if (obj instanceof Map) {
                for (Object obj2 : ((Map) obj).values()) {
                    Class<?> cls = obj2.getClass();
                    Field declaredField2 = cls.getDeclaredField("activity");
                    declaredField2.setAccessible(true);
                    Activity activity2 = (Activity) declaredField2.get(obj2);
                    if (activity == null) {
                        Field declaredField3 = cls.getDeclaredField("paused");
                        declaredField3.setAccessible(true);
                        if (declaredField3.getBoolean(obj2)) {
                            linkedList.addFirst(activity2);
                        } else {
                            activity = activity2;
                        }
                    } else {
                        linkedList.addFirst(activity2);
                    }
                }
                if (activity != null) {
                    linkedList.addFirst(activity);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: i */
    public List m2505i() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f2711a.isEmpty()) {
            return new LinkedList(this.f2711a);
        }
        this.f2711a.addAll(m2504h());
        return new LinkedList(this.f2711a);
    }

    /* renamed from: j */
    public final Object m2506j() throws NoSuchFieldException, SecurityException {
        Object objM2507k = m2507k();
        return objM2507k != null ? objM2507k : m2508l();
    }

    /* renamed from: k */
    public final Object m2507k() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e10) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: l */
    public final Object m2508l() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
        } catch (Exception e10) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: m */
    public Application m2509m() throws ClassNotFoundException {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objM2506j = m2506j();
            if (objM2506j == null || (objInvoke = cls.getMethod("getApplication", null).invoke(objM2506j, null)) == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public void m2510n(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: o */
    public boolean m2511o() {
        return !this.f2716f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f2711a.size() == 0) {
            m2512p(activity, true);
        }
        AbstractC5378o.m2589a(activity);
        m2498u();
        m2517v(activity);
        m2502f(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f2711a.remove(activity);
        AbstractC5372k0.m2552h(activity);
        m2502f(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m2502f(activity, Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m2517v(activity);
        if (this.f2716f) {
            this.f2716f = false;
            m2512p(activity, true);
        }
        m2513q(activity, false);
        m2502f(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!this.f2716f) {
            m2517v(activity);
        }
        int i10 = this.f2715e;
        if (i10 < 0) {
            this.f2715e = i10 + 1;
        } else {
            this.f2714d++;
        }
        m2502f(activity, Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f2715e--;
        } else {
            int i10 = this.f2714d - 1;
            this.f2714d = i10;
            if (i10 <= 0) {
                this.f2716f = true;
                m2512p(activity, false);
            }
        }
        m2513q(activity, true);
        m2502f(activity, Lifecycle.Event.ON_STOP);
    }

    /* renamed from: p */
    public final void m2512p(Activity activity, boolean z10) {
        if (this.f2712b.isEmpty()) {
            return;
        }
        Iterator it = this.f2712b.iterator();
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public final void m2513q(Activity activity, boolean z10) {
        try {
            if (z10) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
                return;
            }
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                AbstractC5372k0.m2540K(new c(activity, tag), 100L);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: r */
    public void m2514r(Activity activity, AbstractC5366h0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        AbstractC5372k0.m2539J(new b(activity, aVar));
    }

    /* renamed from: s */
    public void m2515s(AbstractC5366h0.a aVar) {
        m2514r(f2710h, aVar);
    }

    /* renamed from: t */
    public final void m2516t(Activity activity, AbstractC5366h0.a aVar) {
        List list = (List) this.f2713c.get(activity);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(aVar);
    }

    /* renamed from: v */
    public final void m2517v(Activity activity) {
        if (!this.f2711a.contains(activity)) {
            this.f2711a.addFirst(activity);
        } else {
            if (((Activity) this.f2711a.getFirst()).equals(activity)) {
                return;
            }
            this.f2711a.remove(activity);
            this.f2711a.addFirst(activity);
        }
    }

    /* renamed from: w */
    public void m2518w(Application application) {
        this.f2711a.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }
}

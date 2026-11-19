package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC4657l0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p087k.AbstractC6619r;

/* renamed from: com.blankj.utilcode.util.n0 */
/* loaded from: classes3.dex */
public final class C4661n0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public static final C4661n0 f2091g = new C4661n0();

    /* renamed from: h */
    public static final Activity f2092h = new Activity();

    /* renamed from: a */
    public final LinkedList f2093a = new LinkedList();

    /* renamed from: b */
    public final List f2094b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Map f2095c = new ConcurrentHashMap();

    /* renamed from: d */
    public int f2096d = 0;

    /* renamed from: e */
    public int f2097e = 0;

    /* renamed from: f */
    public boolean f2098f = false;

    /* renamed from: com.blankj.utilcode.util.n0$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2099a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC4657l0.a f2100b;

        public a(Activity activity, AbstractC4657l0.a aVar) {
            this.f2099a = activity;
            this.f2100b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4661n0.this.m2278e(this.f2099a, this.f2100b);
        }
    }

    /* renamed from: com.blankj.utilcode.util.n0$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2102a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC4657l0.a f2103b;

        public b(Activity activity, AbstractC4657l0.a aVar) {
            this.f2102a = activity;
            this.f2103b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4661n0.this.m2294u(this.f2102a, this.f2103b);
        }
    }

    /* renamed from: com.blankj.utilcode.util.n0$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2105a;

        /* renamed from: b */
        public final /* synthetic */ Object f2106b;

        public c(Activity activity, Object obj) {
            this.f2105a = activity;
            this.f2106b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Window window = this.f2105a.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.f2106b).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: v */
    public static void m2275v() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                    Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
                }
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void m2276c(Activity activity, AbstractC4657l0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        AbstractC4663o0.m2310M(new a(activity, aVar));
    }

    /* renamed from: d */
    public void m2277d(AbstractC4657l0.a aVar) {
        m2276c(f2092h, aVar);
    }

    /* renamed from: e */
    public final void m2278e(Activity activity, AbstractC4657l0.a aVar) {
        List copyOnWriteArrayList = (List) this.f2095c.get(activity);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f2095c.put(activity, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(aVar)) {
            return;
        }
        copyOnWriteArrayList.add(aVar);
    }

    /* renamed from: f */
    public final void m2279f(Activity activity, Lifecycle.Event event) {
        m2280g(activity, event, (List) this.f2095c.get(activity));
        m2280g(activity, event, (List) this.f2095c.get(f2092h));
    }

    /* renamed from: g */
    public final void m2280g(Activity activity, Lifecycle.Event event, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4657l0.a aVar = (AbstractC4657l0.a) it.next();
            aVar.m2257g(activity, event);
            if (event.equals(Lifecycle.Event.ON_CREATE)) {
                aVar.mo2111a(activity);
            } else if (event.equals(Lifecycle.Event.ON_START)) {
                aVar.m2255e(activity);
            } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                aVar.m2254d(activity);
            } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                aVar.m2253c(activity);
            } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                aVar.m2256f(activity);
            } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                aVar.m2252b(activity);
            }
        }
        if (event.equals(Lifecycle.Event.ON_DESTROY)) {
            this.f2095c.remove(activity);
        }
    }

    /* renamed from: h */
    public final List m2281h() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objM2283j;
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            objM2283j = m2283j();
        } catch (Exception e6) {
            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e6.getMessage());
        }
        if (objM2283j != null) {
            Field declaredField = objM2283j.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objM2283j);
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
    public List m2282i() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f2093a.isEmpty()) {
            return new LinkedList(this.f2093a);
        }
        this.f2093a.addAll(m2281h());
        return new LinkedList(this.f2093a);
    }

    /* renamed from: j */
    public final Object m2283j() throws NoSuchFieldException, SecurityException {
        Object objM2284k = m2284k();
        return objM2284k != null ? objM2284k : m2285l();
    }

    /* renamed from: k */
    public final Object m2284k() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e6) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e6.getMessage());
            return null;
        }
    }

    /* renamed from: l */
    public final Object m2285l() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
        } catch (Exception e6) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e6.getMessage());
            return null;
        }
    }

    /* renamed from: m */
    public Application m2286m() throws ClassNotFoundException {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objM2283j = m2283j();
            if (objM2283j == null || (objInvoke = cls.getMethod("getApplication", null).invoke(objM2283j, null)) == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public Activity m2287n() {
        for (Activity activity : m2282i()) {
            if (AbstractC4663o0.m2298A(activity)) {
                return activity;
            }
        }
        return null;
    }

    /* renamed from: o */
    public void m2288o(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f2093a.size() == 0) {
            m2290q(activity, true);
        }
        AbstractC4667r.m2352a(activity);
        m2275v();
        m2295w(activity);
        m2279f(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f2093a.remove(activity);
        AbstractC4663o0.m2324i(activity);
        m2279f(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m2279f(activity, Lifecycle.Event.ON_PAUSE);
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
        m2295w(activity);
        if (this.f2098f) {
            this.f2098f = false;
            m2290q(activity, true);
        }
        m2291r(activity, false);
        m2279f(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!this.f2098f) {
            m2295w(activity);
        }
        int i6 = this.f2097e;
        if (i6 < 0) {
            this.f2097e = i6 + 1;
        } else {
            this.f2096d++;
        }
        m2279f(activity, Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f2097e--;
        } else {
            int i6 = this.f2096d - 1;
            this.f2096d = i6;
            if (i6 <= 0) {
                this.f2098f = true;
                m2290q(activity, false);
            }
        }
        m2291r(activity, true);
        m2279f(activity, Lifecycle.Event.ON_STOP);
    }

    /* renamed from: p */
    public boolean m2289p() {
        return !this.f2098f;
    }

    /* renamed from: q */
    public final void m2290q(Activity activity, boolean z6) {
        if (this.f2094b.isEmpty()) {
            return;
        }
        Iterator it = this.f2094b.iterator();
        if (it.hasNext()) {
            AbstractC6619r.m7572a(it.next());
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: r */
    public final void m2291r(Activity activity, boolean z6) {
        try {
            if (z6) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
                return;
            }
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                AbstractC4663o0.m2311N(new c(activity, tag), 100L);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    public void m2292s(Activity activity, AbstractC4657l0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        AbstractC4663o0.m2310M(new b(activity, aVar));
    }

    /* renamed from: t */
    public void m2293t(AbstractC4657l0.a aVar) {
        m2292s(f2092h, aVar);
    }

    /* renamed from: u */
    public final void m2294u(Activity activity, AbstractC4657l0.a aVar) {
        List list = (List) this.f2095c.get(activity);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(aVar);
    }

    /* renamed from: w */
    public final void m2295w(Activity activity) {
        if (!this.f2093a.contains(activity)) {
            this.f2093a.addFirst(activity);
        } else {
            if (((Activity) this.f2093a.getFirst()).equals(activity)) {
                return;
            }
            this.f2093a.remove(activity);
            this.f2093a.addFirst(activity);
        }
    }

    /* renamed from: x */
    public void m2296x(Application application) {
        this.f2093a.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }
}

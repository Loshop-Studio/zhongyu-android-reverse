package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
final class C0322c {

    /* renamed from: a */
    protected static final Class<?> f2643a;

    /* renamed from: b */
    protected static final Field f2644b;

    /* renamed from: c */
    protected static final Field f2645c;

    /* renamed from: d */
    protected static final Method f2646d;

    /* renamed from: e */
    protected static final Method f2647e;

    /* renamed from: f */
    protected static final Method f2648f;

    /* renamed from: g */
    private static final Handler f2649g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f2650a;

        /* renamed from: b */
        final /* synthetic */ Object f2651b;

        a(d dVar, Object obj) {
            this.f2650a = dVar;
            this.f2651b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2650a.f2656a = this.f2651b;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Application f2652a;

        /* renamed from: b */
        final /* synthetic */ d f2653b;

        b(Application application, d dVar) {
            this.f2652a = application;
            this.f2653b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2652a.unregisterActivityLifecycleCallbacks(this.f2653b);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f2654a;

        /* renamed from: b */
        final /* synthetic */ Object f2655b;

        c(Object obj, Object obj2) {
            this.f2654a = obj;
            this.f2655b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0322c.f2646d;
                if (method != null) {
                    method.invoke(this.f2654a, this.f2655b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0322c.f2647e.invoke(this.f2654a, this.f2655b, Boolean.FALSE);
                }
            } catch (RuntimeException e4) {
                if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                    throw e4;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f2656a;

        /* renamed from: b */
        private Activity f2657b;

        /* renamed from: c */
        private final int f2658c;

        /* renamed from: d */
        private boolean f2659d = false;

        /* renamed from: e */
        private boolean f2660e = false;

        /* renamed from: f */
        private boolean f2661f = false;

        d(Activity activity) {
            this.f2657b = activity;
            this.f2658c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2657b == activity) {
                this.f2657b = null;
                this.f2660e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2660e || this.f2661f || this.f2659d || !C0322c.m1773h(this.f2656a, this.f2658c, activity)) {
                return;
            }
            this.f2661f = true;
            this.f2656a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2657b == activity) {
                this.f2659d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsM1766a = m1766a();
        f2643a = clsM1766a;
        f2644b = m1767b();
        f2645c = m1771f();
        f2646d = m1769d(clsM1766a);
        f2647e = m1768c(clsM1766a);
        f2648f = m1770e(clsM1766a);
    }

    /* renamed from: a */
    private static Class<?> m1766a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m1767b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1768c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m1769d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m1770e(Class<?> cls) {
        if (m1772g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m1771f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m1772g() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 == 26 || i4 == 27;
    }

    /* renamed from: h */
    protected static boolean m1773h(Object obj, int i4, Activity activity) {
        try {
            Object obj2 = f2645c.get(activity);
            if (obj2 == obj && activity.hashCode() == i4) {
                f2649g.postAtFrontOfQueue(new c(f2644b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m1774i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m1772g() && f2648f == null) {
            return false;
        }
        if (f2647e == null && f2646d == null) {
            return false;
        }
        try {
            Object obj2 = f2645c.get(activity);
            if (obj2 == null || (obj = f2644b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f2649g;
            handler.post(new a(dVar, obj2));
            try {
                if (m1772g()) {
                    Method method = f2648f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f2649g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}

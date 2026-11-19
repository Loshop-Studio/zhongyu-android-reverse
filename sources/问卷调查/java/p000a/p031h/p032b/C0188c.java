package p000a.p031h.p032b;

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

/* renamed from: a.h.b.c */
/* loaded from: classes.dex */
public final class C0188c {

    /* renamed from: a */
    public static final Class<?> f1403a;

    /* renamed from: b */
    public static final Field f1404b;

    /* renamed from: c */
    public static final Field f1405c;

    /* renamed from: d */
    public static final Method f1406d;

    /* renamed from: e */
    public static final Method f1407e;

    /* renamed from: f */
    public static final Method f1408f;

    /* renamed from: g */
    public static final Handler f1409g;

    /* renamed from: a.h.b.c$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ c f1410b;

        /* renamed from: c */
        public final /* synthetic */ Object f1411c;

        public a(c cVar, Object obj) {
            this.f1410b = cVar;
            this.f1411c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1410b.f1414a = this.f1411c;
        }
    }

    /* renamed from: a.h.b.c$b */
    public class b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Application f1412b;

        /* renamed from: c */
        public final /* synthetic */ c f1413c;

        public b(Application application, c cVar) {
            this.f1412b = application;
            this.f1413c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1412b.unregisterActivityLifecycleCallbacks(this.f1413c);
        }
    }

    /* renamed from: a.h.b.c$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f1414a;

        /* renamed from: b */
        public Activity f1415b;

        /* renamed from: c */
        public final int f1416c;

        /* renamed from: d */
        public boolean f1417d = false;

        /* renamed from: e */
        public boolean f1418e = false;

        /* renamed from: f */
        public boolean f1419f = false;

        public c(Activity activity) {
            this.f1415b = activity;
            this.f1416c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1415b == activity) {
                this.f1415b = null;
                this.f1418e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1418e || this.f1419f || this.f1417d) {
                return;
            }
            Object obj = this.f1414a;
            int i = this.f1416c;
            boolean z = false;
            try {
                Object obj2 = C0188c.f1405c.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    C0188c.f1409g.postAtFrontOfQueue(new RunnableC0189d(C0188c.f1404b.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z) {
                this.f1419f = true;
                this.f1414a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1415b == activity) {
                this.f1417d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Class<?> cls2 = Boolean.TYPE;
        f1409g = new Handler(Looper.getMainLooper());
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f1403a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f1404b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f1405c = declaredField2;
        Class<?> cls3 = f1403a;
        if (cls3 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls3.getDeclaredMethod("performStopActivity", IBinder.class, cls2, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f1406d = declaredMethod;
        Class<?> cls4 = f1403a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls2);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f1407e = declaredMethod2;
        Class<?> cls5 = f1403a;
        if (m686a() && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f1408f = method;
    }

    /* renamed from: a */
    public static boolean m686a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    public static boolean m687b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m686a() && f1408f == null) {
            return false;
        }
        if (f1407e == null && f1406d == null) {
            return false;
        }
        try {
            Object obj2 = f1405c.get(activity);
            if (obj2 == null || (obj = f1404b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            c cVar = new c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            Handler handler = f1409g;
            handler.post(new a(cVar, obj2));
            try {
                if (m686a()) {
                    Method method = f1408f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable th) {
                f1409g.post(new b(application, cVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}

package p048cb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cb.a */
/* loaded from: classes6.dex */
public class C5415a {

    /* renamed from: e */
    public static C5415a f3494e = new C5415a();

    /* renamed from: c */
    public b f3497c;

    /* renamed from: a */
    public List f3495a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f3496b = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f3498d = new a();

    /* renamed from: cb.a$b */
    public interface b {
        void onResume();
    }

    /* renamed from: i */
    public static C5415a m2883i() {
        return f3494e;
    }

    /* renamed from: c */
    public void m2884c() {
        m2885d();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    public void m2885d() {
        for (Activity activity : this.f3495a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: e */
    public Activity m2886e() {
        if (this.f3495a.size() == 0) {
            return null;
        }
        return (Activity) this.f3495a.get(r0.size() - 1);
    }

    /* renamed from: f */
    public void m2887f(Application application) {
        if (this.f3496b) {
            return;
        }
        this.f3496b = true;
        application.registerActivityLifecycleCallbacks(this.f3498d);
    }

    /* renamed from: g */
    public void m2888g(b bVar) {
        this.f3497c = bVar;
    }

    /* renamed from: h */
    public void m2889h(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.f3498d);
    }

    /* renamed from: cb.a$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C5415a.this.f3495a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C5415a.this.f3495a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (C5415a.this.f3497c != null) {
                C5415a.this.f3497c.onResume();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}

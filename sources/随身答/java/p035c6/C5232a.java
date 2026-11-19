package p035c6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c6.a */
/* loaded from: classes4.dex */
public class C5232a {

    /* renamed from: e */
    public static C5232a f2466e = new C5232a();

    /* renamed from: c */
    public b f2469c;

    /* renamed from: a */
    public List f2467a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f2468b = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f2470d = new a();

    /* renamed from: c6.a$b */
    public interface b {
        void onResume();
    }

    /* renamed from: h */
    public static C5232a m2394h() {
        return f2466e;
    }

    /* renamed from: c */
    public void m2395c() {
        m2396d();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    public void m2396d() {
        for (Activity activity : this.f2467a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: e */
    public Activity m2397e() {
        if (this.f2467a.size() == 0) {
            return null;
        }
        return (Activity) this.f2467a.get(r0.size() - 1);
    }

    /* renamed from: f */
    public void m2398f(Application application) {
        if (this.f2468b) {
            return;
        }
        this.f2468b = true;
        application.registerActivityLifecycleCallbacks(this.f2470d);
    }

    /* renamed from: g */
    public void m2399g(b bVar) {
        this.f2469c = bVar;
    }

    /* renamed from: c6.a$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C5232a.this.f2467a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C5232a.this.f2467a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (C5232a.this.f2469c != null) {
                C5232a.this.f2469c.onResume();
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

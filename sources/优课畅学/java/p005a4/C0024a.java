package p005a4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a4.a */
/* loaded from: classes4.dex */
public class C0024a {

    /* renamed from: e */
    public static C0024a f67e = new C0024a();

    /* renamed from: c */
    public b f70c;

    /* renamed from: a */
    public List f68a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f69b = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f71d = new a();

    /* renamed from: a4.a$b */
    public interface b {
        void onResume();
    }

    /* renamed from: i */
    public static C0024a m54i() {
        return f67e;
    }

    /* renamed from: c */
    public void m55c() {
        m56d();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    public void m56d() {
        for (Activity activity : this.f68a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: e */
    public Activity m57e() {
        if (this.f68a.size() == 0) {
            return null;
        }
        return (Activity) this.f68a.get(r0.size() - 1);
    }

    /* renamed from: f */
    public void m58f(Application application) {
        if (this.f69b) {
            return;
        }
        this.f69b = true;
        application.registerActivityLifecycleCallbacks(this.f71d);
    }

    /* renamed from: g */
    public void m59g(b bVar) {
        this.f70c = bVar;
    }

    /* renamed from: h */
    public void m60h(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.f71d);
    }

    /* renamed from: a4.a$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0024a.this.f68a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C0024a.this.f68a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (C0024a.this.f70c != null) {
                C0024a.this.f70c.onResume();
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

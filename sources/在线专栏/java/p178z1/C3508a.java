package p178z1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: z1.a */
/* loaded from: classes.dex */
public class C3508a {

    /* renamed from: e */
    private static C3508a f12303e = new C3508a();

    /* renamed from: c */
    private b f12306c;

    /* renamed from: a */
    private List<Activity> f12304a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean f12305b = false;

    /* renamed from: d */
    private Application.ActivityLifecycleCallbacks f12307d = new a();

    /* renamed from: z1.a$a */
    class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C3508a.this.f12304a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C3508a.this.f12304a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (C3508a.this.f12306c != null) {
                C3508a.this.f12306c.mo10694a();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: z1.a$b */
    public interface b {
        /* renamed from: a */
        void mo10694a();
    }

    private C3508a() {
    }

    /* renamed from: i */
    public static C3508a m10687i() {
        return f12303e;
    }

    /* renamed from: c */
    public void m10688c() {
        m10689d();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    public void m10689d() {
        for (Activity activity : this.f12304a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: e */
    public Activity m10690e() {
        if (this.f12304a.size() == 0) {
            return null;
        }
        return this.f12304a.get(r0.size() - 1);
    }

    /* renamed from: f */
    public void m10691f(Application application) {
        if (this.f12305b) {
            return;
        }
        this.f12305b = true;
        application.registerActivityLifecycleCallbacks(this.f12307d);
    }

    /* renamed from: g */
    public void m10692g(b bVar) {
        this.f12306c = bVar;
    }

    /* renamed from: h */
    public void m10693h(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.f12307d);
    }
}

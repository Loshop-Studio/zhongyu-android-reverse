package p070b.p146d.p147a.p148b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: b.d.a.b.a */
/* loaded from: classes.dex */
public class C0880a {

    /* renamed from: e */
    public static C0880a f4685e = new C0880a();

    /* renamed from: c */
    public b f4688c;

    /* renamed from: a */
    public List<Activity> f4686a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f4687b = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f4689d = new a();

    /* renamed from: b.d.a.b.a$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0880a.this.f4686a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C0880a.this.f4686a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b bVar = C0880a.this.f4688c;
            if (bVar != null) {
                bVar.mo2575a();
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

    /* renamed from: b.d.a.b.a$b */
    public interface b {
        /* renamed from: a */
        void mo2575a();
    }

    /* renamed from: a */
    public void m2572a() {
        m2573b();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: b */
    public void m2573b() {
        for (Activity activity : this.f4686a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: c */
    public Activity m2574c() {
        if (this.f4686a.size() == 0) {
            return null;
        }
        return this.f4686a.get(r0.size() - 1);
    }
}

package p158l7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: l7.a */
/* loaded from: classes.dex */
public class C8514a {

    /* renamed from: e */
    public static C8514a f14122e = new C8514a();

    /* renamed from: c */
    public b f14125c;

    /* renamed from: a */
    public List f14123a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f14124b = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f14126d = new a();

    /* renamed from: l7.a$b */
    public interface b {
        void onResume();
    }

    /* renamed from: h */
    public static C8514a m13989h() {
        return f14122e;
    }

    /* renamed from: c */
    public void m13990c() {
        m13991d();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    public void m13991d() {
        for (Activity activity : this.f14123a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: e */
    public Activity m13992e() {
        if (this.f14123a.size() == 0) {
            return null;
        }
        return (Activity) this.f14123a.get(r0.size() - 1);
    }

    /* renamed from: f */
    public void m13993f(Application application) {
        if (this.f14124b) {
            return;
        }
        this.f14124b = true;
        application.registerActivityLifecycleCallbacks(this.f14126d);
    }

    /* renamed from: g */
    public void m13994g(b bVar) {
        this.f14125c = bVar;
    }

    /* renamed from: l7.a$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8514a.this.f14123a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C8514a.this.f14123a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (C8514a.this.f14125c != null) {
                C8514a.this.f14125c.onResume();
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

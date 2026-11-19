package p144y1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: y1.a */
/* loaded from: classes2.dex */
public class C4685a {

    /* renamed from: e */
    public static C4685a f6000e = new C4685a();

    /* renamed from: c */
    public b f6003c;

    /* renamed from: a */
    public List f6001a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f6002b = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f6004d = new a();

    /* renamed from: y1.a$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C4685a.this.f6001a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C4685a.this.f6001a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (C4685a.this.f6003c != null) {
                C4685a.this.f6003c.onResume();
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

    /* renamed from: y1.a$b */
    public interface b {
        void onResume();
    }

    /* renamed from: i */
    public static C4685a m6621i() {
        return f6000e;
    }

    /* renamed from: c */
    public void m6622c() {
        m6623d();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    public void m6623d() {
        for (Activity activity : this.f6001a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: e */
    public Activity m6624e() {
        if (this.f6001a.size() == 0) {
            return null;
        }
        return (Activity) this.f6001a.get(r0.size() - 1);
    }

    /* renamed from: f */
    public void m6625f(Application application) {
        if (this.f6002b) {
            return;
        }
        this.f6002b = true;
        application.registerActivityLifecycleCallbacks(this.f6004d);
    }

    /* renamed from: g */
    public void m6626g(b bVar) {
        this.f6003c = bVar;
    }

    /* renamed from: h */
    public void m6627h(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.f6004d);
    }
}

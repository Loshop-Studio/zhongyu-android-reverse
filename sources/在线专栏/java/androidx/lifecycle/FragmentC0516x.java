package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0496f;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class FragmentC0516x extends Fragment {

    /* renamed from: a */
    private a f3455a;

    /* renamed from: androidx.lifecycle.x$a */
    interface a {
        /* renamed from: a */
        void m2916a();

        void onCreate();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.x$b */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0516x.m2910a(activity, AbstractC0496f.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0516x.m2910a(activity, AbstractC0496f.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0516x.m2910a(activity, AbstractC0496f.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0516x.m2910a(activity, AbstractC0496f.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0516x.m2910a(activity, AbstractC0496f.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0516x.m2910a(activity, AbstractC0496f.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static void m2910a(Activity activity, AbstractC0496f.b bVar) {
        if (activity instanceof InterfaceC0507o) {
            ((InterfaceC0507o) activity).getLifecycle().m2891h(bVar);
        } else if (activity instanceof InterfaceC0504l) {
            AbstractC0496f lifecycle = ((InterfaceC0504l) activity).getLifecycle();
            if (lifecycle instanceof C0506n) {
                ((C0506n) lifecycle).m2891h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m2911b(AbstractC0496f.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m2910a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m2912c(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: d */
    private void m2913d(a aVar) {
        if (aVar != null) {
            aVar.m2916a();
        }
    }

    /* renamed from: e */
    private void m2914e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    public static void m2915f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0516x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2912c(this.f3455a);
        m2911b(AbstractC0496f.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m2911b(AbstractC0496f.b.ON_DESTROY);
        this.f3455a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m2911b(AbstractC0496f.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m2913d(this.f3455a);
        m2911b(AbstractC0496f.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m2914e(this.f3455a);
        m2911b(AbstractC0496f.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m2911b(AbstractC0496f.b.ON_STOP);
    }
}

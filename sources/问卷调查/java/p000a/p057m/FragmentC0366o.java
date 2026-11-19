package p000a.p057m;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import p000a.p057m.AbstractC0355d;

/* renamed from: a.m.o */
/* loaded from: classes.dex */
public class FragmentC0366o extends Fragment {

    /* renamed from: a.m.o$a */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new a());
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
            FragmentC0366o.m1291a(activity, AbstractC0355d.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0366o.m1291a(activity, AbstractC0355d.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0366o.m1291a(activity, AbstractC0355d.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0366o.m1291a(activity, AbstractC0355d.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0366o.m1291a(activity, AbstractC0355d.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0366o.m1291a(activity, AbstractC0355d.a.ON_STOP);
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
    public static void m1291a(Activity activity, AbstractC0355d.a aVar) {
        if (activity instanceof InterfaceC0360i) {
            C0359h c0359hMo1151a = ((InterfaceC0360i) activity).mo1151a();
            c0359hMo1151a.m1281c("handleLifecycleEvent");
            c0359hMo1151a.m1283f(aVar.m1277a());
        } else if (activity instanceof InterfaceC0358g) {
            AbstractC0355d abstractC0355dMo1151a = ((InterfaceC0358g) activity).mo1151a();
            if (abstractC0355dMo1151a instanceof C0359h) {
                C0359h c0359h = (C0359h) abstractC0355dMo1151a;
                c0359h.m1281c("handleLifecycleEvent");
                c0359h.m1283f(aVar.m1277a());
            }
        }
    }

    /* renamed from: c */
    public static void m1292c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0366o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void m1293b(AbstractC0355d.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m1291a(getActivity(), aVar);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1293b(AbstractC0355d.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m1293b(AbstractC0355d.a.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m1293b(AbstractC0355d.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m1293b(AbstractC0355d.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m1293b(AbstractC0355d.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m1293b(AbstractC0355d.a.ON_STOP);
    }
}

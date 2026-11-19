package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.lifecycle.Lifecycle;

/* renamed from: com.blankj.utilcode.util.h0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5366h0 {

    /* renamed from: a */
    public static Application f2707a;

    /* renamed from: com.blankj.utilcode.util.h0$a */
    public static class a {
        /* renamed from: a */
        public abstract void mo2418a(Activity activity);

        /* renamed from: b */
        public void m2480b(Activity activity) {
        }

        /* renamed from: c */
        public void m2481c(Activity activity) {
        }

        /* renamed from: d */
        public void m2482d(Activity activity) {
        }

        /* renamed from: e */
        public void m2483e(Activity activity) {
        }

        /* renamed from: f */
        public void m2484f(Activity activity) {
        }

        /* renamed from: g */
        public void m2485g(Activity activity, Lifecycle.Event event) {
        }
    }

    /* renamed from: com.blankj.utilcode.util.h0$b */
    public interface b {
        void accept(Object obj);
    }

    /* renamed from: a */
    public static Application m2478a() {
        Application application = f2707a;
        if (application != null) {
            return application;
        }
        m2479b(AbstractC5372k0.m2557m());
        if (f2707a == null) {
            throw new NullPointerException("reflect failed.");
        }
        Log.i("Utils", AbstractC5372k0.m2558n() + " reflect app success.");
        return f2707a;
    }

    /* renamed from: b */
    public static void m2479b(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = f2707a;
        if (application2 == null) {
            f2707a = application;
            AbstractC5372k0.m2567w(application);
            AbstractC5372k0.m2536G();
        } else {
            if (application2.equals(application)) {
                return;
            }
            AbstractC5372k0.m2541L(f2707a);
            f2707a = application;
            AbstractC5372k0.m2567w(application);
        }
    }
}

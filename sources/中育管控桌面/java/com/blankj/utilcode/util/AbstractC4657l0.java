package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.lifecycle.Lifecycle;

/* renamed from: com.blankj.utilcode.util.l0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4657l0 {

    /* renamed from: a */
    public static Application f2089a;

    /* renamed from: com.blankj.utilcode.util.l0$a */
    public static class a {
        /* renamed from: a */
        public abstract void mo2111a(Activity activity);

        /* renamed from: b */
        public void m2252b(Activity activity) {
        }

        /* renamed from: c */
        public void m2253c(Activity activity) {
        }

        /* renamed from: d */
        public void m2254d(Activity activity) {
        }

        /* renamed from: e */
        public void m2255e(Activity activity) {
        }

        /* renamed from: f */
        public void m2256f(Activity activity) {
        }

        /* renamed from: g */
        public void m2257g(Activity activity, Lifecycle.Event event) {
        }
    }

    /* renamed from: com.blankj.utilcode.util.l0$b */
    public interface b {
        void accept(Object obj);
    }

    /* renamed from: a */
    public static Application m2250a() {
        Application application = f2089a;
        if (application != null) {
            return application;
        }
        m2251b(AbstractC4663o0.m2329n());
        if (f2089a == null) {
            throw new NullPointerException("reflect failed.");
        }
        Log.i("Utils", AbstractC4663o0.m2330o() + " reflect app success.");
        return f2089a;
    }

    /* renamed from: b */
    public static void m2251b(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = f2089a;
        if (application2 == null) {
            f2089a = application;
            AbstractC4663o0.m2341z(application);
            AbstractC4663o0.m2307J();
        } else {
            if (application2.equals(application)) {
                return;
            }
            AbstractC4663o0.m2312O(f2089a);
            f2089a = application;
            AbstractC4663o0.m2341z(application);
        }
    }
}

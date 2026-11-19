package com.p040uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p040uc.crashsdk.p041a.C3299a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.uc.crashsdk.c */
/* loaded from: classes2.dex */
final class C3308c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f1451a = false;

    /* renamed from: b */
    private boolean f1452b = false;

    /* renamed from: a */
    private void m2514a(Activity activity, int i4) {
        if (1 == i4) {
            String unused = C3307b.f1418ac = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = C3307b.f1418ac = "";
        }
        C3307b.m2445A();
        if (C3312g.m2702J()) {
            C3307b.m2456L();
            synchronized (C3307b.f1416aa) {
                C3307b.f1416aa.put(activity, Integer.valueOf(i4));
                m2513a(i4);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m2514a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C3312g.m2702J()) {
            C3307b.m2456L();
            synchronized (C3307b.f1416aa) {
                C3307b.f1416aa.remove(activity);
                m2513a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m2514a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m2514a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m2514a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m2514a(activity, 2);
    }

    /* renamed from: a */
    private void m2513a(int i4) {
        if (C3310e.m2648t()) {
            C3299a.m2319a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z3 = true;
        boolean z4 = 1 == i4;
        if (z4) {
            z3 = z4;
        } else {
            Iterator it = C3307b.f1416aa.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
            z3 = z4;
        }
        if (this.f1451a != z3) {
            C3307b.m2485b(z3);
            this.f1451a = z3;
        }
        boolean zIsEmpty = C3307b.f1416aa.isEmpty();
        if (this.f1452b != zIsEmpty) {
            if (zIsEmpty) {
                C3307b.m2506t();
            }
            this.f1452b = zIsEmpty;
        }
    }
}

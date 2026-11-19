package com.p071uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p071uc.crashsdk.p072a.C6738a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.uc.crashsdk.c */
/* loaded from: classes4.dex */
final class C6747c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f6449a = false;

    /* renamed from: b */
    private boolean f6450b = false;

    /* renamed from: a */
    private void m5758a(Activity activity, int i9) {
        if (1 == i9) {
            String unused = C6746b.f6416ac = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = C6746b.f6416ac = "";
        }
        C6746b.m5689A();
        if (C6751g.m5946J()) {
            C6746b.m5700L();
            synchronized (C6746b.f6414aa) {
                C6746b.f6414aa.put(activity, Integer.valueOf(i9));
                m5757a(i9);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m5758a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C6751g.m5946J()) {
            C6746b.m5700L();
            synchronized (C6746b.f6414aa) {
                C6746b.f6414aa.remove(activity);
                m5757a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m5758a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m5758a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m5758a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m5758a(activity, 2);
    }

    /* renamed from: a */
    private void m5757a(int i9) {
        if (C6749e.m5892t()) {
            C6738a.m5563a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z9 = true;
        boolean z10 = 1 == i9;
        if (z10) {
            z9 = z10;
        } else {
            Iterator it = C6746b.f6414aa.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
            z9 = z10;
        }
        if (this.f6449a != z9) {
            C6746b.m5729b(z9);
            this.f6449a = z9;
        }
        boolean zIsEmpty = C6746b.f6414aa.isEmpty();
        if (this.f6450b != zIsEmpty) {
            if (zIsEmpty) {
                C6746b.m5750t();
            }
            this.f6450b = zIsEmpty;
        }
    }
}

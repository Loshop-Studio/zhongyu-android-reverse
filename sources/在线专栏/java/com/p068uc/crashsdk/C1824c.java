package com.p068uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p068uc.crashsdk.p069a.C1815a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.uc.crashsdk.c */
/* loaded from: classes.dex */
final class C1824c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f8043a = false;

    /* renamed from: b */
    private boolean f8044b = false;

    C1824c() {
    }

    /* renamed from: a */
    private void m6437a(Activity activity, int i4) {
        if (1 == i4) {
            String unused = C1823b.f8010ac = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = C1823b.f8010ac = "";
        }
        C1823b.m6368A();
        if (C1828g.m6625J()) {
            C1823b.m6379L();
            synchronized (C1823b.f8008aa) {
                C1823b.f8008aa.put(activity, Integer.valueOf(i4));
                m6436a(i4);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m6437a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C1828g.m6625J()) {
            C1823b.m6379L();
            synchronized (C1823b.f8008aa) {
                C1823b.f8008aa.remove(activity);
                m6436a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m6437a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m6437a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m6437a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m6437a(activity, 2);
    }

    /* renamed from: a */
    private void m6436a(int i4) {
        if (C1826e.m6571t()) {
            C1815a.m6242a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z3 = true;
        boolean z4 = 1 == i4;
        if (z4) {
            z3 = z4;
        } else {
            Iterator it = C1823b.f8008aa.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
            z3 = z4;
        }
        if (this.f8043a != z3) {
            C1823b.m6408b(z3);
            this.f8043a = z3;
        }
        boolean zIsEmpty = C1823b.f8008aa.isEmpty();
        if (this.f8044b != zIsEmpty) {
            if (zIsEmpty) {
                C1823b.m6429t();
            }
            this.f8044b = zIsEmpty;
        }
    }
}

package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.tencent.bugly.proguard.h1 */
/* loaded from: classes3.dex */
public final class C4112h1 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String name = activity.getClass().getName();
        if (C4135s.f3887l == null || C4135s.f3887l.getName().equals(name)) {
            C4055al.m3025c(">>> %s onCreated <<<", name);
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b != null) {
                c4044aaM2890b.f3393L.add(C4135s.m3352a(name, "onCreated"));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String name = activity.getClass().getName();
        if (C4135s.f3887l == null || C4135s.f3887l.getName().equals(name)) {
            C4055al.m3025c(">>> %s onDestroyed <<<", name);
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b != null) {
                c4044aaM2890b.f3393L.add(C4135s.m3352a(name, "onDestroyed"));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String name = activity.getClass().getName();
        if (C4135s.f3887l == null || C4135s.f3887l.getName().equals(name)) {
            C4055al.m3025c(">>> %s onPaused <<<", name);
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b == null) {
                return;
            }
            c4044aaM2890b.f3393L.add(C4135s.m3352a(name, "onPaused"));
            long jCurrentTimeMillis = System.currentTimeMillis();
            c4044aaM2890b.f3382A = jCurrentTimeMillis;
            c4044aaM2890b.f3383B = jCurrentTimeMillis - c4044aaM2890b.f3456z;
            long unused = C4135s.f3883h = jCurrentTimeMillis;
            if (c4044aaM2890b.f3383B < 0) {
                c4044aaM2890b.f3383B = 0L;
            }
            c4044aaM2890b.f3455y = "background";
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String name = activity.getClass().getName();
        if (C4135s.f3887l == null || C4135s.f3887l.getName().equals(name)) {
            C4055al.m3025c(">>> %s onResumed <<<", name);
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b == null) {
                return;
            }
            c4044aaM2890b.f3393L.add(C4135s.m3352a(name, "onResumed"));
            c4044aaM2890b.f3455y = name;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c4044aaM2890b.f3456z = jCurrentTimeMillis;
            c4044aaM2890b.f3384C = jCurrentTimeMillis - C4135s.f3884i;
            long j7 = c4044aaM2890b.f3456z - C4135s.f3883h;
            if (j7 > (C4135s.f3881f > 0 ? C4135s.f3881f : C4135s.f3880e)) {
                c4044aaM2890b.m2899c();
                C4135s.m3367g();
                C4055al.m3021a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j7 / 1000), Long.valueOf(C4135s.f3880e / 1000));
                if (C4135s.f3882g % C4135s.f3878c == 0) {
                    C4135s.f3877b.m3349a(4, C4135s.f3888m);
                    return;
                }
                C4135s.f3877b.m3349a(4, false);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - C4135s.f3885j > C4135s.f3879d) {
                    long unused = C4135s.f3885j = jCurrentTimeMillis2;
                    C4055al.m3021a("add a timer to upload hot start user info", new Object[0]);
                    if (C4135s.f3888m) {
                        C4054ak.m3012a().m3015a(new RunnableC4106f1(C4135s.f3877b, null, true), C4135s.f3879d);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C4055al.m3025c(">>> %s onStart <<<", activity.getClass().getName());
        C4044aa.m2890b().m2893a(activity.hashCode(), true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C4055al.m3025c(">>> %s onStop <<<", activity.getClass().getName());
        C4044aa.m2890b().m2893a(activity.hashCode(), false);
    }
}

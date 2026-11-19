package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;

/* renamed from: com.umeng.analytics.pro.l */
/* loaded from: classes2.dex */
public class C3395l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C3395l f2230a = new C3395l();

    /* renamed from: b */
    private final int f2231b = PathInterpolatorCompat.MAX_NUM_POINTS;

    /* renamed from: c */
    private boolean f2232c = false;

    /* renamed from: d */
    private boolean f2233d = true;

    /* renamed from: e */
    private Handler f2234e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private ArrayList<InterfaceC3396m> f2235f = new ArrayList<>();

    /* renamed from: g */
    private a f2236g = new a();

    /* renamed from: com.umeng.analytics.pro.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C3395l.this.f2232c || !C3395l.this.f2233d) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
                return;
            }
            C3395l.this.f2232c = false;
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> went background.");
            for (int i4 = 0; i4 < C3395l.this.f2235f.size(); i4++) {
                ((InterfaceC3396m) C3395l.this.f2235f.get(i4)).mo2811n();
            }
        }
    }

    private C3395l() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f2233d = true;
        a aVar = this.f2236g;
        if (aVar != null) {
            this.f2234e.removeCallbacks(aVar);
            this.f2234e.postDelayed(this.f2236g, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f2233d = false;
        this.f2232c = true;
        a aVar = this.f2236g;
        if (aVar != null) {
            this.f2234e.removeCallbacks(aVar);
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

    /* renamed from: b */
    public synchronized void m3224b(InterfaceC3396m interfaceC3396m) {
        if (interfaceC3396m != null) {
            for (int i4 = 0; i4 < this.f2235f.size(); i4++) {
                if (this.f2235f.get(i4) == interfaceC3396m) {
                    this.f2235f.remove(i4);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3218a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f2230a);
        }
    }

    /* renamed from: a */
    public static C3395l m3217a() {
        return f2230a;
    }

    /* renamed from: a */
    public synchronized void m3223a(InterfaceC3396m interfaceC3396m) {
        if (interfaceC3396m != null) {
            this.f2235f.add(interfaceC3396m);
        }
    }
}

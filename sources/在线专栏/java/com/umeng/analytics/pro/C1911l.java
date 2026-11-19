package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler;
import java.util.ArrayList;

/* renamed from: com.umeng.analytics.pro.l */
/* loaded from: classes.dex */
public class C1911l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C1911l f8822a = new C1911l();

    /* renamed from: b */
    private final int f8823b = MessageHandler.WHAT_ITEM_SELECTED;

    /* renamed from: c */
    private boolean f8824c = false;

    /* renamed from: d */
    private boolean f8825d = true;

    /* renamed from: e */
    private Handler f8826e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private ArrayList<InterfaceC1912m> f8827f = new ArrayList<>();

    /* renamed from: g */
    private a f8828g = new a();

    /* renamed from: com.umeng.analytics.pro.l$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C1911l.this.f8824c || !C1911l.this.f8825d) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
                return;
            }
            C1911l.this.f8824c = false;
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> went background.");
            for (int i4 = 0; i4 < C1911l.this.f8827f.size(); i4++) {
                ((InterfaceC1912m) C1911l.this.f8827f.get(i4)).mo6734n();
            }
        }
    }

    private C1911l() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f8825d = true;
        a aVar = this.f8828g;
        if (aVar != null) {
            this.f8826e.removeCallbacks(aVar);
            this.f8826e.postDelayed(this.f8828g, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f8825d = false;
        this.f8824c = true;
        a aVar = this.f8828g;
        if (aVar != null) {
            this.f8826e.removeCallbacks(aVar);
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
    public synchronized void m7147b(InterfaceC1912m interfaceC1912m) {
        if (interfaceC1912m != null) {
            for (int i4 = 0; i4 < this.f8827f.size(); i4++) {
                if (this.f8827f.get(i4) == interfaceC1912m) {
                    this.f8827f.remove(i4);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m7141a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f8822a);
        }
    }

    /* renamed from: a */
    public static C1911l m7140a() {
        return f8822a;
    }

    /* renamed from: a */
    public synchronized void m7146a(InterfaceC1912m interfaceC1912m) {
        if (interfaceC1912m != null) {
            this.f8827f.add(interfaceC1912m);
        }
    }
}

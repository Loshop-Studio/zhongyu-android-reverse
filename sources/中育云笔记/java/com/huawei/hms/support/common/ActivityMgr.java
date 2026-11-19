package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();

    /* renamed from: a */
    public WeakReference f11752a;

    /* renamed from: a */
    public static String m8704a(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public Activity getCurrentActivity() {
        if (this.f11752a == null) {
            HMSLog.m8727i("ActivityMgr", "mCurrentActivity is " + this.f11752a);
            return null;
        }
        HMSLog.m8727i("ActivityMgr", "mCurrentActivity.get() is " + this.f11752a.get());
        return (Activity) this.f11752a.get();
    }

    public void init(Application application) {
        HMSLog.m8722d("ActivityMgr", "init");
        if (application == null) {
            HMSLog.m8728w("ActivityMgr", "init failed for app is null");
            return;
        }
        ActivityMgr activityMgr = INST;
        application.unregisterActivityLifecycleCallbacks(activityMgr);
        application.registerActivityLifecycleCallbacks(activityMgr);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        HMSLog.m8722d("ActivityMgr", "onCreated:" + m8704a(activity));
        this.f11752a = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        HMSLog.m8722d("ActivityMgr", "onResumed:" + m8704a(activity));
        this.f11752a = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        HMSLog.m8722d("ActivityMgr", "onStarted:" + m8704a(activity));
        this.f11752a = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}

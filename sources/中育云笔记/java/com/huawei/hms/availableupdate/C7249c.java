package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* renamed from: com.huawei.hms.availableupdate.c */
/* loaded from: classes5.dex */
public class C7249c {

    /* renamed from: b */
    public static final C7249c f11420b = new C7249c();

    /* renamed from: a */
    public WeakReference f11421a;

    /* renamed from: a */
    public void m8389a(Activity activity) {
        HMSLog.m8727i("UpdateAdapterMgr", "onActivityCreate");
        Activity activityM8388a = m8388a();
        if (activityM8388a != null) {
            activityM8388a.finish();
            HMSLog.m8727i("UpdateAdapterMgr", "finish old activity.");
        }
        this.f11421a = new WeakReference(activity);
    }

    /* renamed from: b */
    public boolean m8391b() {
        Activity activityM8388a = m8388a();
        if (activityM8388a == null) {
            return true;
        }
        if (activityM8388a.isTaskRoot()) {
            return false;
        }
        activityM8388a.finish();
        HMSLog.m8727i("UpdateAdapterMgr", " finish old activity.");
        return true;
    }

    /* renamed from: b */
    public void m8390b(Activity activity) {
        HMSLog.m8727i("UpdateAdapterMgr", "onActivityDestroy");
        Activity activityM8388a = m8388a();
        if (activity == null || !activity.equals(activityM8388a)) {
            return;
        }
        HMSLog.m8727i("UpdateAdapterMgr", "reset");
        this.f11421a = null;
    }

    /* renamed from: a */
    public final Activity m8388a() {
        Activity activity;
        WeakReference weakReference = this.f11421a;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || activity.isFinishing()) {
            return null;
        }
        return activity;
    }
}

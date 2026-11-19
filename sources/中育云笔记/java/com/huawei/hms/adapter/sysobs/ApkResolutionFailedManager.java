package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class ApkResolutionFailedManager {

    /* renamed from: c */
    public static final ApkResolutionFailedManager f11339c = new ApkResolutionFailedManager();

    /* renamed from: a */
    public final Handler f11340a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Map f11341b = new HashMap(2);

    public static ApkResolutionFailedManager getInstance() {
        return f11339c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.m8725e("ApkResolutionFailedManager", "postTask is not in main thread");
        } else {
            this.f11341b.put(str, runnable);
            this.f11340a.postDelayed(runnable, 2000L);
        }
    }

    public void removeTask(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.m8725e("ApkResolutionFailedManager", "removeTask is not in main thread");
            return;
        }
        Runnable runnable = (Runnable) this.f11341b.remove(str);
        if (runnable == null) {
            HMSLog.m8725e("ApkResolutionFailedManager", "cancel runnable is null");
        } else {
            this.f11340a.removeCallbacks(runnable);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.m8725e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        } else {
            this.f11341b.remove(str);
        }
    }
}

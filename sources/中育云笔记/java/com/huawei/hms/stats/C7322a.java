package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.huawei.hms.stats.a */
/* loaded from: classes5.dex */
public class C7322a {

    /* renamed from: f */
    public static final C7322a f11703f = new C7322a();

    /* renamed from: a */
    public final Object f11704a = new Object();

    /* renamed from: b */
    public boolean f11705b = false;

    /* renamed from: c */
    public final List f11706c = new ArrayList();

    /* renamed from: d */
    public final Handler f11707d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final Runnable f11708e = new a();

    /* renamed from: com.huawei.hms.stats.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m8727i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                C7322a.this.m8669b();
            } else {
                C7322a.this.m8667a();
            }
        }
    }

    /* renamed from: c */
    public static C7322a m8666c() {
        return f11703f;
    }

    /* renamed from: a */
    public void m8668a(Runnable runnable) {
        synchronized (this.f11704a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.f11705b) {
                    return;
                }
                if (this.f11706c.size() >= 60) {
                    return;
                }
                this.f11706c.add(runnable);
                this.f11707d.removeCallbacks(this.f11708e);
                this.f11707d.postDelayed(this.f11708e, WorkRequest.MIN_BACKOFF_MILLIS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m8669b() {
        synchronized (this.f11704a) {
            HMSLog.m8727i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f11706c.size());
            this.f11705b = true;
            try {
                Iterator it = this.f11706c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                    it.remove();
                }
            } catch (Throwable th) {
                HMSLog.m8725e("AnalyticsCacheManager", "<execCacheBi> failed. " + th.getMessage());
                m8667a();
            }
            this.f11705b = false;
        }
    }

    /* renamed from: a */
    public void m8667a() {
        synchronized (this.f11704a) {
            HMSLog.m8727i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f11706c.clear();
        }
    }
}

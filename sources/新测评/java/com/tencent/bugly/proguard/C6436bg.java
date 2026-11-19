package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.bg */
/* loaded from: classes4.dex */
public final class C6436bg extends Thread {

    /* renamed from: a */
    public RunnableC6435bf f5475a;

    /* renamed from: g */
    private a f5481g;

    /* renamed from: c */
    private boolean f5477c = false;

    /* renamed from: d */
    private boolean f5478d = true;

    /* renamed from: e */
    private boolean f5479e = false;

    /* renamed from: f */
    private int f5480f = 1;

    /* renamed from: b */
    public boolean f5476b = true;

    /* renamed from: com.tencent.bugly.proguard.bg$a */
    public interface a {
    }

    /* renamed from: a */
    public final boolean m5128a() {
        this.f5477c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e10) {
            C6414al.m4926b(e10);
        }
        C6414al.m4928d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f5475a = null;
        return true;
    }

    /* renamed from: b */
    public final boolean m5129b() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC6435bf runnableC6435bf = this.f5475a;
        if (runnableC6435bf != null) {
            runnableC6435bf.f5469b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        } else {
            this.f5475a = new RunnableC6435bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e10) {
            C6414al.m4926b(e10);
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized void m5130c() {
        this.f5478d = false;
        C6414al.m4927c("Record stack trace is disabled.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void m5131d() {
        this.f5479e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RunnableC6435bf runnableC6435bf;
        boolean z9;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f5477c) {
            try {
                runnableC6435bf = this.f5475a;
                z9 = false;
            } catch (Exception e10) {
                C6414al.m4926b(e10);
            } catch (OutOfMemoryError e11) {
                C6414al.m4926b(e11);
            }
            if (runnableC6435bf == null) {
                C6414al.m4927c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                return;
            }
            if (runnableC6435bf.f5470c) {
                runnableC6435bf.f5470c = false;
                runnableC6435bf.f5471d = SystemClock.uptimeMillis();
                runnableC6435bf.f5468a.post(runnableC6435bf);
            }
            m5127a(runnableC6435bf);
            if (this.f5476b && this.f5478d) {
                long jM5124b = runnableC6435bf.m5124b();
                if (jM5124b > 1510 && jM5124b < 199990) {
                    boolean z10 = true;
                    if (jM5124b <= 5010) {
                        this.f5480f = 1;
                        C6414al.m4927c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    } else {
                        int i10 = this.f5480f;
                        int i11 = i10 + 1;
                        this.f5480f = i11;
                        if ((i10 & i11) != 0) {
                            z10 = false;
                        }
                        if (z10) {
                            C6414al.m4927c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                        }
                    }
                    z9 = z10;
                }
            }
            if (z9) {
                runnableC6435bf.m5126d();
            }
            if (this.f5481g != null && this.f5478d) {
                runnableC6435bf.m5123a();
                runnableC6435bf.m5124b();
            }
            C6418ap.m4982b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
        }
    }

    /* renamed from: a */
    private synchronized void m5127a(RunnableC6435bf runnableC6435bf) {
        if (this.f5478d) {
            return;
        }
        if (this.f5479e && !runnableC6435bf.m5123a()) {
            C6414al.m4927c("Restart getting main stack trace.", new Object[0]);
            this.f5478d = true;
            this.f5479e = false;
        }
    }
}

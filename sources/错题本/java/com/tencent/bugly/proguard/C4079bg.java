package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.bg */
/* loaded from: classes3.dex */
public final class C4079bg extends Thread {

    /* renamed from: a */
    public RunnableC4078bf f3677a;

    /* renamed from: g */
    private a f3683g;

    /* renamed from: c */
    private boolean f3679c = false;

    /* renamed from: d */
    private boolean f3680d = true;

    /* renamed from: e */
    private boolean f3681e = false;

    /* renamed from: f */
    private int f3682f = 1;

    /* renamed from: b */
    public boolean f3678b = true;

    /* renamed from: com.tencent.bugly.proguard.bg$a */
    public interface a {
    }

    /* renamed from: a */
    public final boolean m3225a() {
        this.f3679c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e) {
            C4055al.m3024b(e);
        }
        C4055al.m3026d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f3677a = null;
        return true;
    }

    /* renamed from: b */
    public final boolean m3226b() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC4078bf runnableC4078bf = this.f3677a;
        if (runnableC4078bf != null) {
            runnableC4078bf.f3671b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        } else {
            this.f3677a = new RunnableC4078bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e) {
            C4055al.m3024b(e);
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized void m3227c() {
        this.f3680d = false;
        C4055al.m3025c("Record stack trace is disabled.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void m3228d() {
        this.f3681e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RunnableC4078bf runnableC4078bf;
        boolean z8;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f3679c) {
            try {
                runnableC4078bf = this.f3677a;
                z8 = false;
            } catch (Exception e) {
                C4055al.m3024b(e);
            } catch (OutOfMemoryError e4) {
                C4055al.m3024b(e4);
            }
            if (runnableC4078bf == null) {
                C4055al.m3025c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                return;
            }
            if (runnableC4078bf.f3672c) {
                runnableC4078bf.f3672c = false;
                runnableC4078bf.f3673d = SystemClock.uptimeMillis();
                runnableC4078bf.f3670a.post(runnableC4078bf);
            }
            m3224a(runnableC4078bf);
            if (this.f3678b && this.f3680d) {
                long jM3221b = runnableC4078bf.m3221b();
                if (jM3221b > 1510 && jM3221b < 199990) {
                    boolean z9 = true;
                    if (jM3221b <= 5010) {
                        this.f3682f = 1;
                        C4055al.m3025c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    } else {
                        int i = this.f3682f;
                        int i8 = i + 1;
                        this.f3682f = i8;
                        if ((i & i8) != 0) {
                            z9 = false;
                        }
                        if (z9) {
                            C4055al.m3025c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                        }
                    }
                    z8 = z9;
                }
            }
            if (z8) {
                runnableC4078bf.m3223d();
            }
            if (this.f3683g != null && this.f3680d) {
                runnableC4078bf.m3220a();
                runnableC4078bf.m3221b();
            }
            C4059ap.m3080b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
        }
    }

    /* renamed from: a */
    private synchronized void m3224a(RunnableC4078bf runnableC4078bf) {
        if (this.f3680d) {
            return;
        }
        if (this.f3681e && !runnableC4078bf.m3220a()) {
            C4055al.m3025c("Restart getting main stack trace.", new Object[0]);
            this.f3680d = true;
            this.f3681e = false;
        }
    }
}

package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.bg */
/* loaded from: classes4.dex */
public final class C6696bg extends Thread {

    /* renamed from: a */
    public RunnableC6695bf f6052a;

    /* renamed from: g */
    private a f6058g;

    /* renamed from: c */
    private boolean f6054c = false;

    /* renamed from: d */
    private boolean f6055d = true;

    /* renamed from: e */
    private boolean f6056e = false;

    /* renamed from: f */
    private int f6057f = 1;

    /* renamed from: b */
    public boolean f6053b = true;

    /* renamed from: com.tencent.bugly.proguard.bg$a */
    public interface a {
    }

    /* renamed from: a */
    public final boolean m5307a() {
        this.f6054c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e10) {
            C6674al.m5105b(e10);
        }
        C6674al.m5107d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f6052a = null;
        return true;
    }

    /* renamed from: b */
    public final boolean m5308b() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC6695bf runnableC6695bf = this.f6052a;
        if (runnableC6695bf != null) {
            runnableC6695bf.f6046b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        } else {
            this.f6052a = new RunnableC6695bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e10) {
            C6674al.m5105b(e10);
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized void m5309c() {
        this.f6055d = false;
        C6674al.m5106c("Record stack trace is disabled.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void m5310d() {
        this.f6056e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RunnableC6695bf runnableC6695bf;
        boolean z9;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f6054c) {
            try {
                runnableC6695bf = this.f6052a;
                z9 = false;
            } catch (Exception e10) {
                C6674al.m5105b(e10);
            } catch (OutOfMemoryError e11) {
                C6674al.m5105b(e11);
            }
            if (runnableC6695bf == null) {
                C6674al.m5106c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                return;
            }
            if (runnableC6695bf.f6047c) {
                runnableC6695bf.f6047c = false;
                runnableC6695bf.f6048d = SystemClock.uptimeMillis();
                runnableC6695bf.f6045a.post(runnableC6695bf);
            }
            m5306a(runnableC6695bf);
            if (this.f6053b && this.f6055d) {
                long jM5303b = runnableC6695bf.m5303b();
                if (jM5303b > 1510 && jM5303b < 199990) {
                    boolean z10 = true;
                    if (jM5303b <= 5010) {
                        this.f6057f = 1;
                        C6674al.m5106c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    } else {
                        int i9 = this.f6057f;
                        int i10 = i9 + 1;
                        this.f6057f = i10;
                        if ((i9 & i10) != 0) {
                            z10 = false;
                        }
                        if (z10) {
                            C6674al.m5106c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                        }
                    }
                    z9 = z10;
                }
            }
            if (z9) {
                runnableC6695bf.m5305d();
            }
            if (this.f6058g != null && this.f6055d) {
                runnableC6695bf.m5302a();
                runnableC6695bf.m5303b();
            }
            C6678ap.m5161b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
        }
    }

    /* renamed from: a */
    private synchronized void m5306a(RunnableC6695bf runnableC6695bf) {
        if (this.f6055d) {
            return;
        }
        if (this.f6056e && !runnableC6695bf.m5302a()) {
            C6674al.m5106c("Restart getting main stack trace.", new Object[0]);
            this.f6055d = true;
            this.f6056e = false;
        }
    }
}

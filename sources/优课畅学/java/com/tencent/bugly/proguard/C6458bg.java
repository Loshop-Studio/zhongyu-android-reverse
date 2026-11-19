package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.bg */
/* loaded from: classes4.dex */
public final class C6458bg extends Thread {

    /* renamed from: a */
    public RunnableC6457bf f4818a;

    /* renamed from: g */
    private a f4824g;

    /* renamed from: c */
    private boolean f4820c = false;

    /* renamed from: d */
    private boolean f4821d = true;

    /* renamed from: e */
    private boolean f4822e = false;

    /* renamed from: f */
    private int f4823f = 1;

    /* renamed from: b */
    public boolean f4819b = true;

    /* renamed from: com.tencent.bugly.proguard.bg$a */
    public interface a {
    }

    /* renamed from: a */
    public final boolean m4488a() {
        this.f4820c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e10) {
            C6436al.m4286b(e10);
        }
        C6436al.m4288d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f4818a = null;
        return true;
    }

    /* renamed from: b */
    public final boolean m4489b() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC6457bf runnableC6457bf = this.f4818a;
        if (runnableC6457bf != null) {
            runnableC6457bf.f4812b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        } else {
            this.f4818a = new RunnableC6457bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e10) {
            C6436al.m4286b(e10);
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized void m4490c() {
        this.f4821d = false;
        C6436al.m4287c("Record stack trace is disabled.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void m4491d() {
        this.f4822e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RunnableC6457bf runnableC6457bf;
        boolean z10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f4820c) {
            try {
                runnableC6457bf = this.f4818a;
                z10 = false;
            } catch (Exception e10) {
                C6436al.m4286b(e10);
            } catch (OutOfMemoryError e11) {
                C6436al.m4286b(e11);
            }
            if (runnableC6457bf == null) {
                C6436al.m4287c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                return;
            }
            if (runnableC6457bf.f4813c) {
                runnableC6457bf.f4813c = false;
                runnableC6457bf.f4814d = SystemClock.uptimeMillis();
                runnableC6457bf.f4811a.post(runnableC6457bf);
            }
            m4487a(runnableC6457bf);
            if (this.f4819b && this.f4821d) {
                long jM4484b = runnableC6457bf.m4484b();
                if (jM4484b > 1510 && jM4484b < 199990) {
                    boolean z11 = true;
                    if (jM4484b <= 5010) {
                        this.f4823f = 1;
                        C6436al.m4287c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    } else {
                        int i10 = this.f4823f;
                        int i11 = i10 + 1;
                        this.f4823f = i11;
                        if ((i10 & i11) != 0) {
                            z11 = false;
                        }
                        if (z11) {
                            C6436al.m4287c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                        }
                    }
                    z10 = z11;
                }
            }
            if (z10) {
                runnableC6457bf.m4486d();
            }
            if (this.f4824g != null && this.f4821d) {
                runnableC6457bf.m4483a();
                runnableC6457bf.m4484b();
            }
            C6440ap.m4342b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
        }
    }

    /* renamed from: a */
    private synchronized void m4487a(RunnableC6457bf runnableC6457bf) {
        if (this.f4821d) {
            return;
        }
        if (this.f4822e && !runnableC6457bf.m4483a()) {
            C6436al.m4287c("Restart getting main stack trace.", new Object[0]);
            this.f4821d = true;
            this.f4822e = false;
        }
    }
}

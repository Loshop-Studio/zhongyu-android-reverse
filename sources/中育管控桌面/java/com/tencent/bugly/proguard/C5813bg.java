package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.bg */
/* loaded from: classes3.dex */
public final class C5813bg extends Thread {

    /* renamed from: a */
    public RunnableC5812bf f4196a;

    /* renamed from: g */
    private a f4202g;

    /* renamed from: c */
    private boolean f4198c = false;

    /* renamed from: d */
    private boolean f4199d = true;

    /* renamed from: e */
    private boolean f4200e = false;

    /* renamed from: f */
    private int f4201f = 1;

    /* renamed from: b */
    public boolean f4197b = true;

    /* renamed from: com.tencent.bugly.proguard.bg$a */
    public interface a {
    }

    /* renamed from: a */
    public final boolean m4133a() {
        this.f4198c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e6) {
            C5791al.m3931b(e6);
        }
        C5791al.m3933d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f4196a = null;
        return true;
    }

    /* renamed from: b */
    public final boolean m4134b() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC5812bf runnableC5812bf = this.f4196a;
        if (runnableC5812bf != null) {
            runnableC5812bf.f4190b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        } else {
            this.f4196a = new RunnableC5812bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e6) {
            C5791al.m3931b(e6);
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized void m4135c() {
        this.f4199d = false;
        C5791al.m3932c("Record stack trace is disabled.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void m4136d() {
        this.f4200e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RunnableC5812bf runnableC5812bf;
        boolean z6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f4198c) {
            try {
                runnableC5812bf = this.f4196a;
                z6 = false;
            } catch (Exception e6) {
                C5791al.m3931b(e6);
            } catch (OutOfMemoryError e7) {
                C5791al.m3931b(e7);
            }
            if (runnableC5812bf == null) {
                C5791al.m3932c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                return;
            }
            if (runnableC5812bf.f4191c) {
                runnableC5812bf.f4191c = false;
                runnableC5812bf.f4192d = SystemClock.uptimeMillis();
                runnableC5812bf.f4189a.post(runnableC5812bf);
            }
            m4132a(runnableC5812bf);
            if (this.f4197b && this.f4199d) {
                long jM4129b = runnableC5812bf.m4129b();
                if (jM4129b > 1510 && jM4129b < 199990) {
                    boolean z7 = true;
                    if (jM4129b <= 5010) {
                        this.f4201f = 1;
                        C5791al.m3932c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    } else {
                        int i6 = this.f4201f;
                        int i7 = i6 + 1;
                        this.f4201f = i7;
                        if ((i6 & i7) != 0) {
                            z7 = false;
                        }
                        if (z7) {
                            C5791al.m3932c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                        }
                    }
                    z6 = z7;
                }
            }
            if (z6) {
                runnableC5812bf.m4131d();
            }
            if (this.f4202g != null && this.f4199d) {
                runnableC5812bf.m4128a();
                runnableC5812bf.m4129b();
            }
            C5795ap.m3987b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
        }
    }

    /* renamed from: a */
    private synchronized void m4132a(RunnableC5812bf runnableC5812bf) {
        if (this.f4199d) {
            return;
        }
        if (this.f4200e && !runnableC5812bf.m4128a()) {
            C5791al.m3932c("Restart getting main stack trace.", new Object[0]);
            this.f4199d = true;
            this.f4200e = false;
        }
    }
}

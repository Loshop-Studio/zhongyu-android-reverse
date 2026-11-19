package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.bg */
/* loaded from: classes5.dex */
public final class C7801bg extends Thread {

    /* renamed from: a */
    public RunnableC7800bf f13917a;

    /* renamed from: g */
    private a f13923g;

    /* renamed from: c */
    private boolean f13919c = false;

    /* renamed from: d */
    private boolean f13920d = true;

    /* renamed from: e */
    private boolean f13921e = false;

    /* renamed from: f */
    private int f13922f = 1;

    /* renamed from: b */
    public boolean f13918b = true;

    /* renamed from: com.tencent.bugly.proguard.bg$a */
    public interface a {
    }

    /* renamed from: a */
    public final boolean m10818a() {
        this.f13919c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e10) {
            C7779al.m10616b(e10);
        }
        C7779al.m10618d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f13917a = null;
        return true;
    }

    /* renamed from: b */
    public final boolean m10819b() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC7800bf runnableC7800bf = this.f13917a;
        if (runnableC7800bf != null) {
            runnableC7800bf.f13911b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        } else {
            this.f13917a = new RunnableC7800bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e10) {
            C7779al.m10616b(e10);
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized void m10820c() {
        this.f13920d = false;
        C7779al.m10617c("Record stack trace is disabled.", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void m10821d() {
        this.f13921e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RunnableC7800bf runnableC7800bf;
        boolean z10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f13919c) {
            try {
                runnableC7800bf = this.f13917a;
                z10 = false;
            } catch (Exception e10) {
                C7779al.m10616b(e10);
            } catch (OutOfMemoryError e11) {
                C7779al.m10616b(e11);
            }
            if (runnableC7800bf == null) {
                C7779al.m10617c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                return;
            }
            if (runnableC7800bf.f13912c) {
                runnableC7800bf.f13912c = false;
                runnableC7800bf.f13913d = SystemClock.uptimeMillis();
                runnableC7800bf.f13910a.post(runnableC7800bf);
            }
            m10817a(runnableC7800bf);
            if (this.f13918b && this.f13920d) {
                long jM10814b = runnableC7800bf.m10814b();
                if (jM10814b > 1510 && jM10814b < 199990) {
                    boolean z11 = true;
                    if (jM10814b <= 5010) {
                        this.f13922f = 1;
                        C7779al.m10617c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    } else {
                        int i10 = this.f13922f;
                        int i11 = i10 + 1;
                        this.f13922f = i11;
                        if ((i10 & i11) != 0) {
                            z11 = false;
                        }
                        if (z11) {
                            C7779al.m10617c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                        }
                    }
                    z10 = z11;
                }
            }
            if (z10) {
                runnableC7800bf.m10816d();
            }
            if (this.f13923g != null && this.f13920d) {
                runnableC7800bf.m10813a();
                runnableC7800bf.m10814b();
            }
            C7783ap.m10672b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
        }
    }

    /* renamed from: a */
    private synchronized void m10817a(RunnableC7800bf runnableC7800bf) {
        if (this.f13920d) {
            return;
        }
        if (this.f13921e && !runnableC7800bf.m10813a()) {
            C7779al.m10617c("Restart getting main stack trace.", new Object[0]);
            this.f13920d = true;
            this.f13921e = false;
        }
    }
}

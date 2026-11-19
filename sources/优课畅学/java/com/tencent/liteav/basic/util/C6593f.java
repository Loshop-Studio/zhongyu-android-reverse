package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.tencent.liteav.basic.util.f */
/* loaded from: classes4.dex */
public class C6593f {

    /* renamed from: a */
    private Handler f5528a;

    /* renamed from: b */
    private Looper f5529b;

    /* renamed from: c */
    private boolean f5530c;

    /* renamed from: d */
    private Thread f5531d;

    public C6593f(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f5530c = true;
        handlerThread.start();
        this.f5529b = handlerThread.getLooper();
        this.f5528a = new Handler(this.f5529b);
        this.f5531d = handlerThread;
    }

    /* renamed from: b */
    public void m5065b(Runnable runnable) {
        this.f5528a.post(runnable);
    }

    public void finalize() throws Throwable {
        if (this.f5530c) {
            this.f5528a.getLooper().quit();
        }
        super.finalize();
    }

    /* renamed from: a */
    public Handler m5062a() {
        return this.f5528a;
    }

    /* renamed from: a */
    public void m5063a(final Runnable runnable) {
        final boolean[] zArr = new boolean[1];
        if (Thread.currentThread().equals(this.f5531d)) {
            runnable.run();
            return;
        }
        synchronized (this.f5528a) {
            zArr[0] = false;
            this.f5528a.post(new Runnable() { // from class: com.tencent.liteav.basic.util.f.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                    zArr[0] = true;
                    synchronized (C6593f.this.f5528a) {
                        C6593f.this.f5528a.notifyAll();
                    }
                }
            });
            while (!zArr[0]) {
                try {
                    this.f5528a.wait();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m5064a(Runnable runnable, long j10) {
        this.f5528a.postDelayed(runnable, j10);
    }
}

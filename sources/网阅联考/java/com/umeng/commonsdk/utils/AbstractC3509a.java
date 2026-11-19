package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.umeng.commonsdk.utils.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3509a {

    /* renamed from: e */
    private static final int f2957e = 1;

    /* renamed from: a */
    private final long f2958a;

    /* renamed from: b */
    private final long f2959b;

    /* renamed from: c */
    private long f2960c;

    /* renamed from: f */
    private HandlerThread f2962f;

    /* renamed from: g */
    private Handler f2963g;

    /* renamed from: d */
    private boolean f2961d = false;

    /* renamed from: h */
    private Handler.Callback f2964h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (AbstractC3509a.this) {
                if (AbstractC3509a.this.f2961d) {
                    return true;
                }
                long jElapsedRealtime = AbstractC3509a.this.f2960c - SystemClock.elapsedRealtime();
                if (jElapsedRealtime <= 0) {
                    AbstractC3509a.this.m4008c();
                    if (AbstractC3509a.this.f2962f != null) {
                        AbstractC3509a.this.f2962f.quit();
                    }
                } else if (jElapsedRealtime < AbstractC3509a.this.f2959b) {
                    AbstractC3509a.this.f2963g.sendMessageDelayed(AbstractC3509a.this.f2963g.obtainMessage(1), jElapsedRealtime);
                } else {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    AbstractC3509a.this.m4006a(jElapsedRealtime);
                    long jElapsedRealtime3 = (jElapsedRealtime2 + AbstractC3509a.this.f2959b) - SystemClock.elapsedRealtime();
                    while (jElapsedRealtime3 < 0) {
                        jElapsedRealtime3 += AbstractC3509a.this.f2959b;
                    }
                    AbstractC3509a.this.f2963g.sendMessageDelayed(AbstractC3509a.this.f2963g.obtainMessage(1), jElapsedRealtime3);
                }
                return false;
            }
        }
    };

    public AbstractC3509a(long j4, long j5) {
        this.f2958a = j4;
        this.f2959b = j5;
        if (m4003d()) {
            this.f2963g = new Handler(this.f2964h);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
        this.f2962f = handlerThread;
        handlerThread.start();
        this.f2963g = new Handler(this.f2962f.getLooper(), this.f2964h);
    }

    /* renamed from: a */
    public abstract void m4006a(long j4);

    /* renamed from: c */
    public abstract void m4008c();

    /* renamed from: d */
    private boolean m4003d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    /* renamed from: a */
    public final synchronized void m4005a() {
        this.f2961d = true;
        this.f2963g.removeMessages(1);
    }

    /* renamed from: b */
    public final synchronized AbstractC3509a m4007b() {
        this.f2961d = false;
        if (this.f2958a <= 0) {
            m4008c();
            return this;
        }
        this.f2960c = SystemClock.elapsedRealtime() + this.f2958a;
        Handler handler = this.f2963g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }
}

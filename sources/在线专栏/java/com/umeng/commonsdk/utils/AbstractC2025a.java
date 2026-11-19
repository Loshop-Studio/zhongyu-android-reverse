package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.umeng.commonsdk.utils.a */
/* loaded from: classes.dex */
public abstract class AbstractC2025a {

    /* renamed from: e */
    private static final int f9549e = 1;

    /* renamed from: a */
    private final long f9550a;

    /* renamed from: b */
    private final long f9551b;

    /* renamed from: c */
    private long f9552c;

    /* renamed from: f */
    private HandlerThread f9554f;

    /* renamed from: g */
    private Handler f9555g;

    /* renamed from: d */
    private boolean f9553d = false;

    /* renamed from: h */
    private Handler.Callback f9556h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (AbstractC2025a.this) {
                if (AbstractC2025a.this.f9553d) {
                    return true;
                }
                long jElapsedRealtime = AbstractC2025a.this.f9552c - SystemClock.elapsedRealtime();
                if (jElapsedRealtime <= 0) {
                    AbstractC2025a.this.m7931c();
                    if (AbstractC2025a.this.f9554f != null) {
                        AbstractC2025a.this.f9554f.quit();
                    }
                } else if (jElapsedRealtime < AbstractC2025a.this.f9551b) {
                    AbstractC2025a.this.f9555g.sendMessageDelayed(AbstractC2025a.this.f9555g.obtainMessage(1), jElapsedRealtime);
                } else {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    AbstractC2025a.this.m7929a(jElapsedRealtime);
                    long jElapsedRealtime3 = (jElapsedRealtime2 + AbstractC2025a.this.f9551b) - SystemClock.elapsedRealtime();
                    while (jElapsedRealtime3 < 0) {
                        jElapsedRealtime3 += AbstractC2025a.this.f9551b;
                    }
                    AbstractC2025a.this.f9555g.sendMessageDelayed(AbstractC2025a.this.f9555g.obtainMessage(1), jElapsedRealtime3);
                }
                return false;
            }
        }
    };

    public AbstractC2025a(long j4, long j5) {
        this.f9550a = j4;
        this.f9551b = j5;
        if (m7926d()) {
            this.f9555g = new Handler(this.f9556h);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
        this.f9554f = handlerThread;
        handlerThread.start();
        this.f9555g = new Handler(this.f9554f.getLooper(), this.f9556h);
    }

    /* renamed from: a */
    public abstract void m7929a(long j4);

    /* renamed from: c */
    public abstract void m7931c();

    /* renamed from: d */
    private boolean m7926d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    /* renamed from: a */
    public final synchronized void m7928a() {
        this.f9553d = true;
        this.f9555g.removeMessages(1);
    }

    /* renamed from: b */
    public final synchronized AbstractC2025a m7930b() {
        this.f9553d = false;
        if (this.f9550a <= 0) {
            m7931c();
            return this;
        }
        this.f9552c = SystemClock.elapsedRealtime() + this.f9550a;
        Handler handler = this.f9555g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }
}

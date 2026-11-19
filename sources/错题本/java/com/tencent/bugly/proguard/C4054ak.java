package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p016b0.ThreadFactoryC3061b;

/* renamed from: com.tencent.bugly.proguard.ak */
/* loaded from: classes3.dex */
public final class C4054ak {

    /* renamed from: a */
    private static final AtomicInteger f3517a = new AtomicInteger(1);

    /* renamed from: b */
    private static C4054ak f3518b;

    /* renamed from: c */
    private ScheduledExecutorService f3519c;

    public C4054ak() {
        this.f3519c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactoryC3061b(1));
        this.f3519c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            C4055al.m3026d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C4054ak m3012a() {
        try {
            if (f3518b == null) {
                f3518b = new C4054ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3518b;
    }

    /* renamed from: b */
    public final synchronized void m3016b() {
        ScheduledExecutorService scheduledExecutorService = this.f3519c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C4055al.m3025c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f3519c.shutdownNow();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m3017c() {
        ScheduledExecutorService scheduledExecutorService = this.f3519c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean m3015a(Runnable runnable, long j7) {
        if (!m3017c()) {
            C4055al.m3026d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j7 <= 0) {
            j7 = 0;
        }
        C4055al.m3025c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j7), runnable.getClass().getName());
        try {
            this.f3519c.schedule(runnable, j7, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (C4129p.f3864c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m3014a(Runnable runnable) {
        if (!m3017c()) {
            C4055al.m3026d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C4055al.m3026d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C4055al.m3025c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f3519c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (C4129p.f3864c) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

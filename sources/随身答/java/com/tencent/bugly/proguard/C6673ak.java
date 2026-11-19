package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.proguard.ak */
/* loaded from: classes4.dex */
public final class C6673ak {

    /* renamed from: a */
    private static final AtomicInteger f5862a = new AtomicInteger(1);

    /* renamed from: b */
    private static C6673ak f5863b;

    /* renamed from: c */
    private ScheduledExecutorService f5864c;

    public C6673ak() {
        this.f5864c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() { // from class: com.tencent.bugly.proguard.ak.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + C6673ak.f5862a.getAndIncrement());
                return thread;
            }
        });
        this.f5864c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            C6674al.m5107d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C6673ak m5093a() {
        try {
            if (f5863b == null) {
                f5863b = new C6673ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5863b;
    }

    /* renamed from: b */
    public final synchronized void m5097b() {
        ScheduledExecutorService scheduledExecutorService = this.f5864c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C6674al.m5106c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f5864c.shutdownNow();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m5098c() {
        ScheduledExecutorService scheduledExecutorService = this.f5864c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean m5096a(Runnable runnable, long j9) {
        if (!m5098c()) {
            C6674al.m5107d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j9 <= 0) {
            j9 = 0;
        }
        C6674al.m5106c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j9), runnable.getClass().getName());
        try {
            this.f5864c.schedule(runnable, j9, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (C6725p.f6213c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m5095a(Runnable runnable) {
        if (!m5098c()) {
            C6674al.m5107d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C6674al.m5107d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C6674al.m5106c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f5864c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (C6725p.f6213c) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

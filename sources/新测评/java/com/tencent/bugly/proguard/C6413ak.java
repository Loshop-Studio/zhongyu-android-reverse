package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.proguard.ak */
/* loaded from: classes4.dex */
public final class C6413ak {

    /* renamed from: a */
    private static final AtomicInteger f5285a = new AtomicInteger(1);

    /* renamed from: b */
    private static C6413ak f5286b;

    /* renamed from: c */
    private ScheduledExecutorService f5287c;

    public C6413ak() {
        this.f5287c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() { // from class: com.tencent.bugly.proguard.ak.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + C6413ak.f5285a.getAndIncrement());
                return thread;
            }
        });
        this.f5287c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            C6414al.m4928d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C6413ak m4914a() {
        try {
            if (f5286b == null) {
                f5286b = new C6413ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5286b;
    }

    /* renamed from: b */
    public final synchronized void m4918b() {
        ScheduledExecutorService scheduledExecutorService = this.f5287c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C6414al.m4927c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f5287c.shutdownNow();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m4919c() {
        ScheduledExecutorService scheduledExecutorService = this.f5287c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean m4917a(Runnable runnable, long j10) {
        if (!m4919c()) {
            C6414al.m4928d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j10 <= 0) {
            j10 = 0;
        }
        C6414al.m4927c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j10), runnable.getClass().getName());
        try {
            this.f5287c.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (C6465p.f5636c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m4916a(Runnable runnable) {
        if (!m4919c()) {
            C6414al.m4928d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C6414al.m4928d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C6414al.m4927c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f5287c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (C6465p.f5636c) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

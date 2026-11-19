package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.proguard.ak */
/* loaded from: classes4.dex */
public final class C6435ak {

    /* renamed from: a */
    private static final AtomicInteger f4628a = new AtomicInteger(1);

    /* renamed from: b */
    private static C6435ak f4629b;

    /* renamed from: c */
    private ScheduledExecutorService f4630c;

    public C6435ak() {
        this.f4630c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() { // from class: com.tencent.bugly.proguard.ak.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + C6435ak.f4628a.getAndIncrement());
                return thread;
            }
        });
        this.f4630c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            C6436al.m4288d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C6435ak m4274a() {
        try {
            if (f4629b == null) {
                f4629b = new C6435ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4629b;
    }

    /* renamed from: b */
    public final synchronized void m4278b() {
        ScheduledExecutorService scheduledExecutorService = this.f4630c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C6436al.m4287c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f4630c.shutdownNow();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m4279c() {
        ScheduledExecutorService scheduledExecutorService = this.f4630c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean m4277a(Runnable runnable, long j10) {
        if (!m4279c()) {
            C6436al.m4288d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j10 <= 0) {
            j10 = 0;
        }
        C6436al.m4287c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j10), runnable.getClass().getName());
        try {
            this.f4630c.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (C6487p.f4979c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m4276a(Runnable runnable) {
        if (!m4279c()) {
            C6436al.m4288d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C6436al.m4288d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C6436al.m4287c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f4630c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (C6487p.f4979c) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

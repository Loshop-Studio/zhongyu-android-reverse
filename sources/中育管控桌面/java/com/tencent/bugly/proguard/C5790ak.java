package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.proguard.ak */
/* loaded from: classes3.dex */
public final class C5790ak {

    /* renamed from: a */
    private static final AtomicInteger f4006a = new AtomicInteger(1);

    /* renamed from: b */
    private static C5790ak f4007b;

    /* renamed from: c */
    private ScheduledExecutorService f4008c;

    public C5790ak() {
        this.f4008c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() { // from class: com.tencent.bugly.proguard.ak.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + C5790ak.f4006a.getAndIncrement());
                return thread;
            }
        });
        this.f4008c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            C5791al.m3933d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C5790ak m3919a() {
        try {
            if (f4007b == null) {
                f4007b = new C5790ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4007b;
    }

    /* renamed from: b */
    public final synchronized void m3923b() {
        ScheduledExecutorService scheduledExecutorService = this.f4008c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C5791al.m3932c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f4008c.shutdownNow();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m3924c() {
        ScheduledExecutorService scheduledExecutorService = this.f4008c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean m3922a(Runnable runnable, long j6) {
        if (!m3924c()) {
            C5791al.m3933d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j6 <= 0) {
            j6 = 0;
        }
        C5791al.m3932c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j6), runnable.getClass().getName());
        try {
            this.f4008c.schedule(runnable, j6, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (C5842p.f4357c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m3921a(Runnable runnable) {
        if (!m3924c()) {
            C5791al.m3933d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C5791al.m3933d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C5791al.m3932c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f4008c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (C5842p.f4357c) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

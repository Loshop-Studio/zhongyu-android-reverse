package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.proguard.ak */
/* loaded from: classes5.dex */
public final class C7778ak {

    /* renamed from: a */
    private static final AtomicInteger f13727a = new AtomicInteger(1);

    /* renamed from: b */
    private static C7778ak f13728b;

    /* renamed from: c */
    private ScheduledExecutorService f13729c;

    /* renamed from: com.tencent.bugly.proguard.ak$a */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("BuglyThread-" + C7778ak.f13727a.getAndIncrement());
            return thread;
        }
    }

    public C7778ak() {
        this.f13729c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new a());
        this.f13729c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            C7779al.m10618d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C7778ak m10604a() {
        try {
            if (f13728b == null) {
                f13728b = new C7778ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13728b;
    }

    /* renamed from: b */
    public final synchronized void m10608b() {
        ScheduledExecutorService scheduledExecutorService = this.f13729c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C7779al.m10617c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f13729c.shutdownNow();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m10609c() {
        ScheduledExecutorService scheduledExecutorService = this.f13729c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean m10607a(Runnable runnable, long j10) {
        if (!m10609c()) {
            C7779al.m10618d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j10 <= 0) {
            j10 = 0;
        }
        C7779al.m10617c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j10), runnable.getClass().getName());
        try {
            this.f13729c.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (C7830p.f14078c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m10606a(Runnable runnable) {
        if (!m10609c()) {
            C7779al.m10618d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C7779al.m10618d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C7779al.m10617c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f13729c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (C7830p.f14078c) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

package io.reactivex.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p159s5.C6558a;

/* renamed from: io.reactivex.internal.schedulers.e */
/* loaded from: classes.dex */
public final class RunnableC5719e implements Runnable {

    /* renamed from: a */
    public final long f9029a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f9030b;

    /* renamed from: c */
    public final C6558a f9031c;

    /* renamed from: d */
    public final ScheduledExecutorService f9032d;

    /* renamed from: e */
    public final ScheduledFuture f9033e;

    /* renamed from: f */
    public final ThreadFactory f9034f;

    public RunnableC5719e(long j7, TimeUnit timeUnit, ThreadFactory threadFactory) {
        RunnableC5719e runnableC5719e;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j7) : 0L;
        this.f9029a = nanos;
        this.f9030b = new ConcurrentLinkedQueue();
        this.f9031c = new C6558a(0);
        this.f9034f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C5722h.f9041c);
            runnableC5719e = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(runnableC5719e, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            runnableC5719e = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        runnableC5719e.f9032d = scheduledExecutorServiceNewScheduledThreadPool;
        runnableC5719e.f9033e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f9030b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            C5721g c5721g = (C5721g) it.next();
            if (c5721g.f9039c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(c5721g)) {
                this.f9031c.mo6202c(c5721g);
            }
        }
    }
}

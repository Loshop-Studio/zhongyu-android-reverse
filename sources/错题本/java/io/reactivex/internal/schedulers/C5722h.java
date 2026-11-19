package io.reactivex.internal.schedulers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145q5.AbstractC6438i;
import p145q5.AbstractC6439j;

/* renamed from: io.reactivex.internal.schedulers.h */
/* loaded from: classes.dex */
public final class C5722h extends AbstractC6439j {

    /* renamed from: b */
    public static final RxThreadFactory f9040b;

    /* renamed from: c */
    public static final RxThreadFactory f9041c;

    /* renamed from: f */
    public static final C5721g f9044f;

    /* renamed from: g */
    public static final boolean f9045g;

    /* renamed from: h */
    public static final RunnableC5719e f9046h;

    /* renamed from: a */
    public final AtomicReference f9047a;

    /* renamed from: e */
    public static final TimeUnit f9043e = TimeUnit.SECONDS;

    /* renamed from: d */
    public static final long f9042d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        C5721g c5721g = new C5721g(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f9044f = c5721g;
        c5721g.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f9040b = rxThreadFactory;
        f9041c = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        f9045g = Boolean.getBoolean("rx2.io-scheduled-release");
        RunnableC5719e runnableC5719e = new RunnableC5719e(0L, null, rxThreadFactory);
        f9046h = runnableC5719e;
        runnableC5719e.f9031c.dispose();
        ScheduledFuture scheduledFuture = runnableC5719e.f9033e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC5719e.f9032d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C5722h() {
        RunnableC5719e runnableC5719e = f9046h;
        AtomicReference atomicReference = new AtomicReference(runnableC5719e);
        this.f9047a = atomicReference;
        RunnableC5719e runnableC5719e2 = new RunnableC5719e(f9042d, f9043e, f9040b);
        while (!atomicReference.compareAndSet(runnableC5719e, runnableC5719e2)) {
            if (atomicReference.get() != runnableC5719e) {
                runnableC5719e2.f9031c.dispose();
                ScheduledFuture scheduledFuture = runnableC5719e2.f9033e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = runnableC5719e2.f9032d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: a */
    public final AbstractC6438i mo5086a() {
        return new RunnableC5720f((RunnableC5719e) this.f9047a.get());
    }
}
